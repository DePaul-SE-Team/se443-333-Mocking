# Test Doubles and Mocks

Examples of stubs, mocks and other test doubles with [Mockito](https://site.mockito.org/).

| Package | What it shows |
|---|---|
| `stub` | Stubbing a database dependency (`InvoiceFilter`) |
| `mock` | Verifying calls with `verify` (`SAPInvoiceSender`) |
| `arguments` | Capturing and checking arguments, parameterized tests |
| `exception` | Making a mock throw an exception |
| `christmas` | Stubbing a `Clock` to control time |
| `bookstore` | Mocking a book repository and a purchase process |

## Exercise

Perform mocking on all of the classes above: for each package, write tests that use Mockito to mock the dependencies.

## Running

Requires Java 11+ and Maven 3.

```bash
mvn test
```

Uses JUnit 5.6, Mockito 3.11, AssertJ 3.15 and HSQLDB 2.6.
