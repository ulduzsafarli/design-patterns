package org.patterns.abstractFactory.prototype;

import org.patterns.abstractFactory.prototype.abstractProducts.Button;
import org.patterns.abstractFactory.prototype.abstractProducts.Checkbox;
import org.patterns.abstractFactory.prototype.enums.OSType;
import org.patterns.abstractFactory.prototype.factory.GUIFactory;

public class GuiFactoryPrototypeExample {
    public static void main(String[] args) {
        // Determine OS type (in a real app, this would come from system properties, config, etc.)
        OSType osType = getCurrentOS();

        // Create factory configured for the current OS
        GUIFactory factory = new ContextAwarePrototypeFactory(osType);

        // Use the factory to create UI components
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();

        button.render();
        checkbox.render();
    }

    // Simulate OS detection
    private static OSType getCurrentOS() {
        String osName = System.getProperty("os.name").toLowerCase();
        return osName.contains("win") ? OSType.WINDOWS : OSType.MAC;
    }
}
