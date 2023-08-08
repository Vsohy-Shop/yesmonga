package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.C11345a;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList.a */
public abstract class C8456a<E> implements ListIterator<E>, C11345a {

    /* renamed from: a */
    public int f22819a;

    /* renamed from: b */
    public int f22820b;

    public C8456a(int i, int i2) {
        this.f22819a = i;
        this.f22820b = i2;
    }

    public void add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public final void mo15729b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c */
    public final void mo15730c() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: d */
    public final int mo15731d() {
        return this.f22819a;
    }

    /* renamed from: e */
    public final int mo15732e() {
        return this.f22820b;
    }

    /* renamed from: f */
    public final void mo15733f(int i) {
        this.f22819a = i;
    }

    /* renamed from: h */
    public final void mo15734h(int i) {
        this.f22820b = i;
    }

    public boolean hasNext() {
        return this.f22819a < this.f22820b;
    }

    public boolean hasPrevious() {
        return this.f22819a > 0;
    }

    public E next() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int nextIndex() {
        return this.f22819a;
    }

    public int previousIndex() {
        return this.f22819a - 1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void set(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
