package lol.zeyd.flags;

import lol.zeyd.flags.impl.asia.Japan;
import lol.zeyd.flags.impl.australia.Australia;
import lol.zeyd.flags.impl.europe.Poland;
import lol.zeyd.flags.impl.namerica.UnitedStates;
import lol.zeyd.flags.impl.samerica.Mexico;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

public class FlagManager {
    private @Getter @Setter ArrayList<Flag> europeanCountries = new ArrayList<>();
    private @Getter @Setter ArrayList<Flag> asianCountries = new ArrayList<>();
    private @Getter @Setter ArrayList<Flag> nAmericanCountries = new ArrayList<>();
    private @Getter @Setter ArrayList<Flag> sAmericanCountries = new ArrayList<>();
    private @Getter @Setter ArrayList<Flag> australianCountries = new ArrayList<>();

    public FlagManager() {
        // europe
        this.europeanCountries.add(new Poland());

        // asia
        this.asianCountries.add(new Japan());

        // north america
        this.nAmericanCountries.add(new UnitedStates());

        // south america
        this.sAmericanCountries.add(new Mexico());

        // australia and oceania
        this.australianCountries.add(new Australia());
    }

    public ArrayList<Flag> getAllFlags() {
        ArrayList<Flag> flags = new ArrayList<>();
        flags.addAll(europeanCountries);
        flags.addAll(asianCountries);
        flags.addAll(nAmericanCountries);
        flags.addAll(sAmericanCountries);
        flags.addAll(australianCountries);
        return flags;
    }
}
