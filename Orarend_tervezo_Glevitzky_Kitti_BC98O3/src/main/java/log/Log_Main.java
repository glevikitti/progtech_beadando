package log;

import controller.Oc;
import org.tinylog.Logger;

public class Log_Main {
    public static void main(String[] args) {

        Oc oc = new Oc();
        Logger.error(new RuntimeException(), "Valami nem mukodik ugy, ahogyan annak kellene");
        Logger.info("A végeredmény {}",oc.vegeredmeny);


    }
}
