package com.trx.example.chain.genral;

public class ConcreteHandlerA extends  Handler{

    @Override
    public void request(String request) {
        System.out.println(request);

        if(nextHandler!=null){

            nextHandler.request("next");
        }
    }
}
