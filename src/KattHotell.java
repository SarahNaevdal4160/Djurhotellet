import java.util.ArrayList;
import java.util.List;

public class KattHotell {
    private List<Katt> katter = new ArrayList<>();

    public List<Katt> hittaNamn(String namn) {
        List<Katt> hittadeKatter = new ArrayList<>();
        
        for (Katt katt : katter) {
            if (katt.getNamn().equalsIgnoreCase(namn)) {
                hittadeKatter.add(katt);
            }
        }
        return hittadeKatter;
    }

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

    public void ropaUppKatter() {
    if (katter.isEmpty()) {
        System.out.println("Hotellet är tomt. Inga katter är incheckade.");
        return;
    }

    for (Katt katt : katter) {
        System.out.println("Namn: " + katt.getNamn()
                + ", Ras: " + katt.getRas()
                + ", Chipnummer: " + katt.getChipnummer());
    }
}
}