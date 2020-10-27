package com.trx.example.bridge.general;

public abstract  class Abstraction {

    protected IImplementor iImplementor;

    public Abstraction(IImplementor iImplementor) {
        this.iImplementor = iImplementor;
    }

    public void operation(){this.iImplementor.operationImpl();}
}
