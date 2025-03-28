package org.patterns.abstractFactory.prototype.concreteProducts.mac;

import org.patterns.abstractFactory.prototype.Prototype;
import org.patterns.abstractFactory.prototype.abstractProducts.Button;

public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering a Mac button");
    }

    @Override
    public Prototype clone() {
        return new MacButton();
    }
}
