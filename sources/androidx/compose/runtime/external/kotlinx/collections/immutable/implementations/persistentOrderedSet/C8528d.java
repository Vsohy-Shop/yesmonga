package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedSet.d */
public class C8528d<E> implements Iterator<E>, C11345a {
    @C12580l

    /* renamed from: a */
    public Object f22964a;
    @C12579k

    /* renamed from: b */
    public final Map<E, C8524a> f22965b;

    /* renamed from: c */
    public int f22966c;

    public C8528d(@C12580l Object obj, @C12579k Map<E, C8524a> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        this.f22964a = obj;
        this.f22965b = map;
    }

    /* renamed from: b */
    private final void m30946b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
    }

    /* renamed from: c */
    public final int mo16105c() {
        return this.f22966c;
    }

    @C12579k
    /* renamed from: d */
    public final Map<E, C8524a> mo16106d() {
        return this.f22965b;
    }

    /* renamed from: e */
    public final void mo16107e(int i) {
        this.f22966c = i;
    }

    public boolean hasNext() {
        return this.f22966c < this.f22965b.size();
    }

    public E next() {
        m30946b();
        E e = this.f22964a;
        this.f22966c++;
        C8524a aVar = this.f22965b.get(e);
        if (aVar != null) {
            this.f22964a = aVar.mo16090c();
            return e;
        }
        throw new ConcurrentModificationException("Hash code of an element (" + e + ") has changed after it was added to the persistent set.");
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
