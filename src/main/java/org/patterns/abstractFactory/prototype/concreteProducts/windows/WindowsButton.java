package org.patterns.abstractFactory.prototype.concreteProducts.windows;

import org.patterns.abstractFactory.prototype.Prototype;
import org.patterns.abstractFactory.prototype.abstractProducts.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Windows button");
    }

    @Override
    public Prototype clone() {
        return new WindowsButton();
    }
}
