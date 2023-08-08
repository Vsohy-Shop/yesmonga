package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8444c;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.b */
public final class C8440b<E> implements C8444c<E>, List<E>, C11345a {
    @C12579k

    /* renamed from: a */
    public final List<E> f22802a;

    public C8440b(@C12579k List<? extends E> list) {
        Intrinsics.checkNotNullParameter(list, "impl");
        this.f22802a = list;
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
        return this.f22802a.contains(obj);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return this.f22802a.containsAll(collection);
    }

    /* renamed from: e */
    public int mo15597e() {
        return this.f22802a.size();
    }

    public boolean equals(@C12580l Object obj) {
        return this.f22802a.equals(obj);
    }

    public E get(int i) {
        return this.f22802a.get(i);
    }

    public int hashCode() {
        return this.f22802a.hashCode();
    }

    public int indexOf(Object obj) {
        return this.f22802a.indexOf(obj);
    }

    public boolean isEmpty() {
        return this.f22802a.isEmpty();
    }

    @C12579k
    public Iterator<E> iterator() {
        return this.f22802a.iterator();
    }

    public int lastIndexOf(Object obj) {
        return this.f22802a.lastIndexOf(obj);
    }

    @C12579k
    public ListIterator<E> listIterator() {
        return this.f22802a.listIterator();
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
        return mo15597e();
    }

    public void sort(Comparator<? super E> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    @C12579k
    public String toString() {
        return this.f22802a.toString();
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    public ListIterator<E> listIterator(int i) {
        return this.f22802a.listIterator(i);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    public C8444c<E> subList(int i, int i2) {
        return new C8440b(this.f22802a.subList(i, i2));
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }
}
