package application;

import device.ComboDevice;
import device.ConcretPrinter;
import device.ConcretScanner;

public class Program {

    public static void main(String[] args) {

        ConcretPrinter p = new ConcretPrinter("5055");
        p.processDoc("My letter");
        p.print("My Letter");
        System.out.println("");

        ConcretScanner s = new ConcretScanner("6066");
        s.processDoc("My email");
        System.out.println(s.scan());
        System.out.println("");

        ComboDevice d = new ComboDevice("7077");
        d.processDoc("My dissertation");
        d.print("My dissertation");
        System.out.println(d.scan());

    }

}
