package org.patterns.abstractFactory.prototype;

import org.patterns.abstractFactory.prototype.abstractProducts.Button;
import org.patterns.abstractFactory.prototype.abstractProducts.Checkbox;
import org.patterns.abstractFactory.prototype.enums.OSType;
import org.patterns.abstractFactory.prototype.factory.GUIFactory;
import org.patterns.abstractFactory.prototype.concreteProducts.mac.MacButton;
import org.patterns.abstractFactory.prototype.concreteProducts.mac.MacCheckbox;
import org.patterns.abstractFactory.prototype.concreteProducts.windows.WindowsButton;
import org.patterns.abstractFactory.prototype.concreteProducts.windows.WindowsCheckbox;

import java.util.HashMap;
import java.util.Map;

public class ContextAwarePrototypeFactory implements GUIFactory {

    private final OSType currentOS;
    private final Map<String, Prototype> prototypes = new HashMap<>();

    public ContextAwarePrototypeFactory(OSType osType) {
        this.currentOS = osType;
        initializePrototypes();
    }

    private void initializePrototypes() {
        // Initialize all possible prototypes
        prototypes.put("WindowsButton", new WindowsButton());
        prototypes.put("MacButton", new MacButton());
        prototypes.put("WindowsCheckbox", new WindowsCheckbox());
        prototypes.put("MacCheckbox", new MacCheckbox());
    }

    @Override
    public Button createButton() {
        String key = currentOS == OSType.WINDOWS ? "WindowsButton" : "MacButton";
        return (Button) prototypes.get(key).clone();
    }

    @Override
    public Checkbox createCheckbox() {
        String key = currentOS == OSType.WINDOWS ? "WindowsCheckbox" : "MacCheckbox";
        return (Checkbox) prototypes.get(key).clone();
    }
}
