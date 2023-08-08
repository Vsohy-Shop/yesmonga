package com.contentsquare.android.sdk;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;

/* renamed from: com.contentsquare.android.sdk.oa */
public final class C14589oa<E, P> implements List<E>, C11345a {

    /* renamed from: a */
    public final List<E> f36078a;

    public C14589oa(List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "delegate");
        this.f36078a = list;
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.f36078a.contains(obj);
    }

    public boolean containsAll(Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return this.f36078a.containsAll(collection);
    }

    /* renamed from: e */
    public int mo36064e() {
        return this.f36078a.size();
    }

    public boolean equals(Object obj) {
        return Intrinsics.areEqual((Object) this.f36078a, obj);
    }

    public E get(int i) {
        return this.f36078a.get(i);
    }

    public int hashCode() {
        return this.f36078a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f36078a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f36078a.isEmpty();
    }

    public Iterator<E> iterator() {
        return new C14631q2(this.f36078a.iterator());
    }

    public int lastIndexOf(Object obj) {
        return this.f36078a.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return new C14882y3(this.f36078a.listIterator());
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<E> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo36064e();
    }

    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public List<E> subList(int i, int i2) {
        return this.f36078a.subList(i, i2);
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    public String toString() {
        return this.f36078a.toString();
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public ListIterator<E> listIterator(int i) {
        return new C14882y3(this.f36078a.listIterator(i));
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }
}
