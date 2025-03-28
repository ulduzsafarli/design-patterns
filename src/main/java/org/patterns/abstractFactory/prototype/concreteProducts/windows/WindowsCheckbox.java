package org.patterns.abstractFactory.prototype.concreteProducts.windows;

import org.patterns.abstractFactory.prototype.Prototype;
import org.patterns.abstractFactory.prototype.abstractProducts.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering a Windows checkbox");
    }

    @Override
    public Prototype clone() {
        return new WindowsCheckbox();
    }
}
