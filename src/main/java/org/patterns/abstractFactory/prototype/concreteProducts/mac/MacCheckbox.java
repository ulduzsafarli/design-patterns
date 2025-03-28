package org.patterns.abstractFactory.prototype.concreteProducts.mac;

import org.patterns.abstractFactory.prototype.Prototype;
import org.patterns.abstractFactory.prototype.abstractProducts.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Max checkbox");
    }

    @Override
    public Prototype clone() {
        return new MacCheckbox();
    }
}
