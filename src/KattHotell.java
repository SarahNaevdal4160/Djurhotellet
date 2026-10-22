import java.util.ArrayList;
import java.util.List;

public class KattHotell {
    private List<Katt> katter = new ArrayList<>();

    public boolean checkaIn(Katt katt) {
        if (finnsChipnummer(katt.getChipnummer())) {
            System.out.println("Varning: En katt med chipnummer " + katt.getChipnummer() + " är redan incheckad.");
            return false;
        }

        katter.add(katt);
        return true;
    }

    public boolean finnsChipnummer(int chipnummer) {
    for (Katt katt : katter) {
        if (katt.getChipnummer() == chipnummer) {
            return true;
        }
    }
    return false;
    }

    public int antalIncheckadeKatter() {
        return katter.size();
    }public int antalKatter() {
        return katter.size();
    }
}