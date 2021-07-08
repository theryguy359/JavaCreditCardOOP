public class CreditCardTester {
    public static void main(String[] args){
        CreditCard c1 = new CreditCard();
        c1.creditCard();
        System.out.println(c1.toString());
        CreditCard c2 = new CreditCard();
        c2.creditCard("Ryan Catterson");
        System.out.println(c2.toString());
        CreditCard c3 = new CreditCard();
        c3.creditCard("Darth Vader", 201300, 4076, 15, "12/18/19");
        System.out.println(c3.toString());        
    }
}
