import java.util.ArrayList;
import java.util.List;

public class KattHotell {
    private List<Katt> katter = new ArrayList<>();

    public boolean checkaIn(Katt katt) {
        katter.add(katt);
        return true;
    }
}