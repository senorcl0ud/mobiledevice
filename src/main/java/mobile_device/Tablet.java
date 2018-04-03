package mobile_device;


import java.util.Arrays;

public class Tablet extends MobileDevice {
    private double screenSize;
    private String[] topThreeApps;

    public Tablet(){

    }

    public Tablet(String manufacturer, String deviceName, String os,
                  double cost, double screenSize, String[] topThreeApps) {
        super(manufacturer, deviceName, os, cost);
        this.screenSize = screenSize;
        this.topThreeApps = topThreeApps;
    }

    @Override
    public String listMyApps(){
     return super.listMyApps() + "\n" + "This devices top three apps are: " + Arrays.toString(topThreeApps);
    }



    public String[] getTopThreeApps() {
        return topThreeApps;
    }

    public void setTopThreeApps(String[] topThreeApps) {
        this.topThreeApps = topThreeApps;
    }
}
