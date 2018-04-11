package mobile_device;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MobileDevice tabletOne = new Tablet("Apple",
                "iPad8","iOSX", 400, 9.5,
                new String[]{"Angry Birds", "Snapchat", "Facebook"});

        MobileDevice tabletTwo = new Tablet("Android",
                "Android Tablet","iOSX", 400.00, 9.5,
                new String[]{"Youtube", "Twitter", "Instagram"});

        ArrayList<MobileDevice> tabletArray = new ArrayList<MobileDevice>();
        tabletArray.add(tabletOne);
        tabletArray.add(tabletTwo);

        for (MobileDevice tablet : tabletArray) {

            System.out.println( tablet.listMyApps() +  tablet.calculateDiscount(50) );
            System.out.println(tabletOne);
            System.out.println(tabletOne.toString());
        }

    }
}
