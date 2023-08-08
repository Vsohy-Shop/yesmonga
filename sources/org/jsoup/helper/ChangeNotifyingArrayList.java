package org.jsoup.helper;

import java.util.ArrayList;
import java.util.Collection;

public abstract class ChangeNotifyingArrayList<E> extends ArrayList<E> {
    public ChangeNotifyingArrayList(int i) {
        super(i);
    }

    public boolean add(E e) {
        mo29596e();
        return super.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo29596e();
        return super.addAll(collection);
    }

    public void clear() {
        mo29596e();
        super.clear();
    }

    /* renamed from: e */
    public abstract void mo29596e();

    public E remove(int i) {
        mo29596e();
        return super.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        mo29596e();
        return super.removeAll(collection);
    }

    public void removeRange(int i, int i2) {
        mo29596e();
        super.removeRange(i, i2);
    }

    public boolean retainAll(Collection<?> collection) {
        mo29596e();
        return super.retainAll(collection);
    }

    public E set(int i, E e) {
        mo29596e();
        return super.set(i, e);
    }

    public void add(int i, E e) {
        mo29596e();
        super.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        mo29596e();
        return super.addAll(i, collection);
    }

    public boolean remove(Object obj) {
        mo29596e();
        return super.remove(obj);
    }
}
