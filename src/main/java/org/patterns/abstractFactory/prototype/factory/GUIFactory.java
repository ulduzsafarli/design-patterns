package org.patterns.abstractFactory.prototype.factory;

import org.patterns.abstractFactory.prototype.abstractProducts.Button;
import org.patterns.abstractFactory.prototype.abstractProducts.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
