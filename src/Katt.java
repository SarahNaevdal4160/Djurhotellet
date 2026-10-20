public class Katt {
    private final String namn;
    private final String ras;
    private final int chipnummer;

    public Katt(String namn, String ras, int chipnummer) {
        this.namn = namn;
        this.ras = ras;
        this.chipnummer = chipnummer;
    }

    public String getNamn() {
        return namn;
    }

    public String getRas() {
        return ras;
    }

    public int getChipnummer() {
        return chipnummer;
    }
}