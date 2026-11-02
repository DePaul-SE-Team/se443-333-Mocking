package ch6.practice1_invoice;

public class Invoice {

    private dao d;
    Invoice(dao d){
        this.d = d;
    }

    public int getNumberOfInvoiceLessThan(int amount){

        // business logic here <- only care about testing this business logic.
        return d.getLowerThan(amount);
    }
}
