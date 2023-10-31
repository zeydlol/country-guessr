package lol.zeyd;

import lol.zeyd.flags.Flag;
import lol.zeyd.flags.FlagManager;
import lombok.Getter;
import lombok.Setter;

public enum Guessr {
    getInstance();
    @Getter private String name = "Country Guessr", version = "v0.0 alpha";
    @Getter FlagManager flagManager;
    public void onStartUp() {
        flagManager = new FlagManager();
        System.out.println("Starting... " + getName() + " version: " + getVersion());
        System.out.println("In development.");
        System.out.println("Displaying all countries");
        for (Flag flag : flagManager.getAllFlags()) {
            System.out.println(flag.getName() + " : " + flag.getDir() + " : " + flag.getContinent().name());
        }
        System.exit(1);
    }
}
