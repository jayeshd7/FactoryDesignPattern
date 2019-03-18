import com.os.OS;
import com.os.IOS;
import com.os.FactoryOS;

public class FactoryPattern {

public static void main(String args[]){



    FactoryOS factoryOS = new FactoryOS();

    OS obj =factoryOS.getInstance("oldFashion");
    obj.spec();


}


}
