public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int sayi1 = 10;
        int sayi2 = 20;
        sayi1 = sayi2;
        sayi2 = 100;

        System.out.println(sayi2);


        // ikinci ornek
        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{10,20,30};
        sayilar1 = sayilar2;
        sayilar2[0]= 1000;
        System.out.println(sayilar1[0]);


        CreditManager creditManager = new CreditManager();
        creditManager.Calculate();
        creditManager.Save();

        Customer customer = new Customer(); // instance creation
        customer.Id = 10;
        customer.FirstName ="ubeyde";
        customer.LastName ="Ezici";
        //customer.NationalIdentity ="124235436534";
        customer.City = "Ankara";

        CustomerManager customerManager = new CustomerManager(customer);
        customerManager.Save();
        customerManager.Delete();



    }


}