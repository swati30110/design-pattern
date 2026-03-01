package abstractfactory;

public class Application {
    private GUIFactory factory;
    private Button button;
    private Checkbox checkbox;

    Application(GUIFactory factory) {
        this.factory = factory;
    }

    void createUI() {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }
    void paint(){
        button.paint();
        checkbox.paint();
    }
}
