import service.impl.Dasun;
import service.impl.Kamali;
import service.impl.Ramal;
import service.impl.Sithum;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class Main {
    /* Observer Design Pattern */

    /*
    * Define an One-to-Many dependency between objects where a state change in one object results
    * in all its dependents being notified and update automatically.
    * */
    public static void main(String[] args) {

        //Initialize the Subject
        Kamali kamali = new Kamali();

        //Initialize two Observers
        Dasun dasun = new Dasun();
        Ramal ramal = new Ramal();
        Sithum sithum = new Sithum();

        //Register observers to the Subject
        kamali.register(dasun);
        kamali.register(ramal);
        kamali.register(sithum);

        //Now see what will happen after the subject states changed
        kamali.notifyAllObservers("Kamali Uploaded a New Photo");
        kamali.notifyAllObservers("Kamali is dead");
    }
}
