package by.TMS_Dudak.HomeTaskOOP.Task1;

public class PhoneApp {
    public static void main(String[] args) {
        Phone phone1 = new Phone(291862922, "Iphone 13 pro max", 12);
        Phone phone2 = new Phone(336601024, "Galaxy Flip 3", 11);
        Phone phone3 = new Phone(296957795, "Iphone SE 2", 9);


        phone1.print();
        phone1.receiveCall(291273927);

        phone2.print();
        phone2.receiveCall(291892123);

        phone3.print();
        phone3.receiveCall(331292012);



    }

}
