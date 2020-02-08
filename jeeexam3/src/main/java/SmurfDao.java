import java.util.ArrayList;
import java.util.List;

public class SmurfDao {

    List<Smurf> getList(){
        List<Smurf>smurfList=new ArrayList<>();
        smurfList.add(new Smurf("Smerf1", "atr1", "opis1"));
        smurfList.add(new Smurf("Smerf1", "atr1", "opis1"));
        smurfList.add(new Smurf("Smerf1", "atr1", "opis1"));
        smurfList.add(new Smurf("Smerf1", "atr1", "opis1"));
        smurfList.add(new Smurf("Smerf1", "atr1", "opis1"));
        return smurfList;
    }

}
