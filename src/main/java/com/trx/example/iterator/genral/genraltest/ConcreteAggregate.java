package com.trx.example.iterator.genral.genraltest;



import com.trx.example.iterator.genral.genraltest.IAggergate;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate<E> implements IAggergate<E> {

    List<E> list = new ArrayList<E>();
    public boolean add(E element) {
        return this.list.add(element);
    }

    public boolean remove(E element) {
        return this.list.remove(element);
    }

    public Iterator<E> iterator() {
        return new ConcreteIterator<E>(this.list);
    }
}
