package androidx.compose.runtime.external.kotlinx.collections.immutable.adapters;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8443b;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.adapters.a */
public class C8439a<E> implements C8443b<E>, Collection<E>, C11345a {
    @C12579k

    /* renamed from: a */
    public final Collection<E> f22801a;

    public C8439a(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "impl");
        this.f22801a = collection;
    }

    public boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return this.f22801a.contains(obj);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return this.f22801a.containsAll(collection);
    }

    /* renamed from: e */
    public int mo15577e() {
        return this.f22801a.size();
    }

    public boolean equals(@C12580l Object obj) {
        return this.f22801a.equals(obj);
    }

    public int hashCode() {
        return this.f22801a.hashCode();
    }

    public boolean isEmpty() {
        return this.f22801a.isEmpty();
    }

    @C12579k
    public Iterator<E> iterator() {
        return this.f22801a.iterator();
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeIf(Predicate<? super E> predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo15577e();
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    @C12579k
    public String toString() {
        return this.f22801a.toString();
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }
}
