package com.google.firebase.crashlytics.internal.model;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.firebase.crashlytics.internal.model.b0 */
public final class C32833b0<E> implements List<E>, RandomAccess {

    /* renamed from: a */
    public final List<E> f79706a;

    public C32833b0(List<E> list) {
        this.f79706a = Collections.unmodifiableList(list);
    }

    @C0359n0
    /* renamed from: e */
    public static <E> C32833b0<E> m132702e(@C0359n0 List<E> list) {
        return new C32833b0<>(list);
    }

    @C0359n0
    /* renamed from: h */
    public static <E> C32833b0<E> m132703h(E... eArr) {
        return new C32833b0<>(Arrays.asList(eArr));
    }

    public boolean add(@C0359n0 E e) {
        return this.f79706a.add(e);
    }

    public boolean addAll(@C0359n0 Collection<? extends E> collection) {
        return this.f79706a.addAll(collection);
    }

    public void clear() {
        this.f79706a.clear();
    }

    public boolean contains(@C0363p0 Object obj) {
        return this.f79706a.contains(obj);
    }

    public boolean containsAll(@C0359n0 Collection<?> collection) {
        return this.f79706a.containsAll(collection);
    }

    public boolean equals(@C0363p0 Object obj) {
        return this.f79706a.equals(obj);
    }

    @C0359n0
    public E get(int i) {
        return this.f79706a.get(i);
    }

    public int hashCode() {
        return this.f79706a.hashCode();
    }

    public int indexOf(@C0363p0 Object obj) {
        return this.f79706a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f79706a.isEmpty();
    }

    @C0359n0
    public Iterator<E> iterator() {
        return this.f79706a.iterator();
    }

    public int lastIndexOf(@C0363p0 Object obj) {
        return this.f79706a.lastIndexOf(obj);
    }

    @C0359n0
    public ListIterator<E> listIterator() {
        return this.f79706a.listIterator();
    }

    public boolean remove(@C0363p0 Object obj) {
        return this.f79706a.remove(obj);
    }

    public boolean removeAll(@C0359n0 Collection<?> collection) {
        return this.f79706a.removeAll(collection);
    }

    public boolean retainAll(@C0359n0 Collection<?> collection) {
        return this.f79706a.retainAll(collection);
    }

    @C0359n0
    public E set(int i, @C0359n0 E e) {
        return this.f79706a.set(i, e);
    }

    public int size() {
        return this.f79706a.size();
    }

    @C0359n0
    public List<E> subList(int i, int i2) {
        return this.f79706a.subList(i, i2);
    }

    @C0363p0
    public Object[] toArray() {
        return this.f79706a.toArray();
    }

    public void add(int i, @C0359n0 E e) {
        this.f79706a.add(i, e);
    }

    public boolean addAll(int i, @C0359n0 Collection<? extends E> collection) {
        return this.f79706a.addAll(i, collection);
    }

    @C0359n0
    public ListIterator<E> listIterator(int i) {
        return this.f79706a.listIterator(i);
    }

    public E remove(int i) {
        return this.f79706a.remove(i);
    }

    public <T> T[] toArray(@C0363p0 T[] tArr) {
        return this.f79706a.toArray(tArr);
    }
}
