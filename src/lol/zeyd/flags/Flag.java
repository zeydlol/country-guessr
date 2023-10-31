package lol.zeyd.flags;

import lombok.Getter;
import lombok.Setter;

public class Flag {
    private @Getter @Setter String name, dir;
    private @Getter @Setter Continent continent;
    public Flag(String name, String dir, Continent continent) {
        this.name = name;
        this.dir = dir;
        this.continent = continent;
    }
}
