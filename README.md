# Test Doubles and Mocking

Practice exercises for testing a class in isolation by replacing its dependencies
with test doubles, using [Mockito](https://site.mockito.org/).

Each practice has a class with **business logic** and one or more **dependencies**
(a database, an external API, the system clock, a live market feed). Your job is
to test the business logic without using the real dependency.

## Learning goals

By the end of these exercises you should be able to:

- Create a test double with `mock(...)`.
- **Stub** a dependency so it returns hard-coded values (`when(...).thenReturn(...)`).
- **Verify** that the class under test called a dependency correctly (`verify(...)`).
- Decide when a test needs a stub, when it needs a mock, and when it needs both.
- Explain why some code (like `LocalDate.now()`) is hard to test, and how
  wrapping it in a class makes it testable.

## Exercises

Work through them in order. Each one adds a new idea.

| # | Package | Class under test | Dependency to replace | New idea |
|---|---|---|---|---|
| 1 | `practice1_invoice` | `Invoice` | `dao` (database) | Your first stub: `mock` + `when/thenReturn` |
| 2 | `practice2_todo` | `TodoBusinessImpl` | `TodoService` (database) | Stubbing a list, then verifying calls to a `void` method |
| 3 | `practice3_bank` | `Bank` | `TransactionRepository` | Stubbing *and* verifying in one test; testing an exception |
| 4 | `practice4_email` | `EmailService` | `Delivery` (external email API) | Pure interaction testing: the method returns nothing |
| 5 | `practice5_discount` | `ChristmasDiscount` | `Time` (the system clock) | Controlling "today" to make time-based code testable |
| 6 | `practice6_stock` | `StockBroker` | `MarketWatcher` (live quotes), `Portfolio` | Mocking more than one collaborator; choosing what to mock |

### What to test

1. **Invoice.** `getNumberOfInvoiceLessThan` should return whatever the DAO
   reports. Stub the DAO so no database is needed.
2. **Todo.**
   - `retrieveTodosRelatedToSpring` should keep only todos that contain "Spring".
   - `deleteTodosNotRelatedToSpring` should delete every *other* todo, and never
     delete a Spring one.
3. **Bank.** `transferMoney` should:
   - throw an exception when the balance is less than the amount.
   - save the transaction when there is enough money.

   Think about the boundary: what should happen when the balance *equals* the amount?
4. **Email.** `sendEmail` should pass the given format (`HTML` or `NonHTML`) on
   to `Delivery`. There is no return value to assert on, so how do you check it?
5. **Christmas discount.** `applyDiscount` takes 15% off on December 25 and
   nothing on any other day. Test both cases, and pick dates near the boundary.
6. **Stock broker.** `perform` gets a live quote from the market. It then compares
   the quote with the portfolio's average price:
   - Gain **above 10%**: sell 10 shares.
   - Gain **below 10%**: buy 1 share.
   - Gain **exactly 10%**: do nothing.

   *No test file is provided. Create `src/test/java/ch6/practice6_stock/StockBrokerTest.java` yourself.*

## Mockito cheat sheet

```java
import static org.mockito.Mockito.*;

Foo foo = mock(Foo.class);                       // create a test double

when(foo.bar("x")).thenReturn(42);               // stub: return a value
when(foo.bar(anyString())).thenReturn(42);       // stub: match any argument
doThrow(new RuntimeException()).when(foo).baz(); // stub a void method to throw

verify(foo).baz();                               // was called once
verify(foo, times(2)).baz();                     // was called exactly twice
verify(foo, never()).baz();                      // was never called
```

Use `assertThat(...)` from AssertJ for checking return values, and JUnit's
`assertThrows(...)` for expected exceptions.

## Running the tests

Requires Java 11+ and Maven 3.

```bash
mvn test                                      # run everything
mvn test -Dtest=BankTest                      # run one test class
```

> **Using Java 17 or newer?** The Mockito version in this project (3.11) does not
> fully support newer JDKs, and every test fails with
> `Could not initialize plugin: interface org.mockito.plugins.MockMaker`.
> Run with:
>
> ```bash
> mvn test -DargLine="-Dnet.bytebuddy.experimental=true"
> ```

Libraries: JUnit 5.6, Mockito 3.11, AssertJ 3.15.
