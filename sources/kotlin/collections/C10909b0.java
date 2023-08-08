package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: kotlin.collections.b0 */
public final class C10909b0 implements ListIterator, C11345a {
    @C12579k

    /* renamed from: a */
    public static final C10909b0 f28145a = new C10909b0();

    public /* bridge */ /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: b */
    public void mo22073b(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    /* renamed from: c */
    public Void next() {
        throw new NoSuchElementException();
    }

    @C12579k
    /* renamed from: d */
    public Void previous() {
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public void mo22076e(Void voidR) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean hasNext() {
        return false;
    }

    public boolean hasPrevious() {
        return false;
    }

    public int nextIndex() {
        return 0;
    }

    public int previousIndex() {
        return -1;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
