package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.p */
public class C8521p<K, V> implements Iterator<C8505a<V>>, C11345a {
    @C12580l

    /* renamed from: a */
    public Object f22948a;
    @C12579k

    /* renamed from: b */
    public final Map<K, C8505a<V>> f22949b;

    /* renamed from: c */
    public int f22950c;

    public C8521p(@C12580l Object obj, @C12579k Map<K, C8505a<V>> map) {
        Intrinsics.checkNotNullParameter(map, "hashMap");
        this.f22948a = obj;
        this.f22949b = map;
    }

    /* renamed from: b */
    public final int mo16077b() {
        return this.f22950c;
    }

    @C12580l
    /* renamed from: c */
    public final Object mo16078c() {
        return this.f22948a;
    }

    @C12579k
    /* renamed from: d */
    public C8505a<V> next() {
        if (hasNext()) {
            C8505a<V> aVar = this.f22949b.get(this.f22948a);
            if (aVar != null) {
                C8505a<V> aVar2 = aVar;
                this.f22950c++;
                this.f22948a = aVar2.mo16013c();
                return aVar2;
            }
            throw new ConcurrentModificationException("Hash code of a key (" + this.f22948a + ") has changed after it was added to the persistent map.");
        }
        throw new NoSuchElementException();
    }

    /* renamed from: e */
    public final void mo16080e(int i) {
        this.f22950c = i;
    }

    /* renamed from: f */
    public final void mo16081f(@C12580l Object obj) {
        this.f22948a = obj;
    }

    public boolean hasNext() {
        return this.f22950c < this.f22949b.size();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
