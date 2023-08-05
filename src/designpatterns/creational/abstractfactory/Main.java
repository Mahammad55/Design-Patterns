package designpatterns.creational.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractFactory appleFactory = new AppleFactory();
        AbstractFactory samsungFactory = new SamsungFactory();

        Laptop appleLaptop = appleFactory.createLaptop("Macbook pro",3000);
        Phone applePhone = appleFactory.createPhone("Iphone 14",1000);

        System.out.println("Apple laptop -> model - " + appleLaptop.getModel() + "; price - " + appleLaptop.getPrice());
        System.out.println("Apple phone -> model - " + applePhone.getModel() + "; price - " + applePhone.getPrice());

        System.out.println("-------------------------");

        Laptop samsungLaptop = samsungFactory.createLaptop("Samsung pro",2500);
        Phone samsungPhone = samsungFactory.createPhone("Samsung galaxy A32",567);

        System.out.println("Samsung laptop -> model - " + samsungLaptop.getModel() + "; price - " + samsungLaptop.getPrice());
        System.out.println("Samsung phone -> model - " + samsungPhone.getModel() + "; price - " + samsungPhone.getPrice());

        System.out.println("-------------------------");
        System.out.println("-------------------------");

        Laptop newAppleLaptop=appleFactory.createLaptop("Macbook2",10000);
        Phone newApplePhone=appleFactory.createPhone("Iphone 15 pro",5000);

        System.out.println("Apple laptop -> model - " + newAppleLaptop.getModel() + "; price - " + newAppleLaptop.getPrice());
        System.out.println("Apple phone -> model - " + newApplePhone.getModel() + "; price - " + newApplePhone.getPrice());

        System.out.println("-------------------------");

        Laptop newSamsungLaptop=samsungFactory.createLaptop("Samsung book",9000);
        Phone newSamsungPhone=samsungFactory.createPhone("Samsung galaxy A52",700);

        System.out.println("Samsung laptop -> model - " + newSamsungLaptop.getModel() + "; price - " + newSamsungLaptop.getPrice());
        System.out.println("Samsung phone -> model - " + newSamsungPhone.getModel() + "; price - " + newSamsungPhone.getPrice());
    }
}
