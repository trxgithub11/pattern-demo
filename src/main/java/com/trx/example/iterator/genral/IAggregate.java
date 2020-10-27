package com.trx.example.iterator.genral;

public interface IAggregate<E> {

    boolean add(E element);
    boolean remove(E element);

    Iterator<E>  iterator();
}
