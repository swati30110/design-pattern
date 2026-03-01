package abstractfactory;

import abstractfactory.enums.OSType;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Supplier;

public class ApplicationConfigurator {
    static Map<OSType, Supplier<GUIFactory>> configMap = Map.of(OSType.Windows, WinFactory::new, OSType.MAC, MacFactory::new);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String config = input.next();
        OSType osType;
        try{
            osType = OSType.valueOf(config.trim().toUpperCase());
        }catch (Exception e){
            System.out.println("Invalid OS type. Use MAC or WINDOWS");
            return;
        }
        GUIFactory factory = configMap.get(osType).get();
        Application app = new Application(factory);
        app.createUI();
        app.paint();
    }
}
