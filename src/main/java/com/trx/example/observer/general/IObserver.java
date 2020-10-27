package com.trx.example.observer.general;

public interface IObserver<E> {

    void update(E event);
}
