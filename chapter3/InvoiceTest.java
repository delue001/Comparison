package chapter3;

import chapter3.Invoice;

public class InvoiceTest {
    public static void main(String[] args){
        Invoice invoice1 = new Invoice("20","drugs", 5,100);
        Invoice invoice2 = new Invoice("35", "bible", 10, 200);

        System.out.printf("%nNumber: %s%nDescription: %s%nQuantity: %d%nPrice: $%.2f%nInvoiceAmount: $%.2f%n",
                invoice1.getNumber(), invoice1.getDescription(), invoice1.getQuantity(),
                invoice1.getPrice(), invoice1.getInvoiceAmount());

        System.out.printf("%nNumber: %s%nDescription: %s%nQuantity: %d%nPrice: $%.2f%nInvoiceAmount: $%.2f%n",
                invoice2.getNumber(), invoice2.getDescription(), invoice2.getQuantity(),
                invoice2.getPrice(), invoice2.getInvoiceAmount());
    }
}
