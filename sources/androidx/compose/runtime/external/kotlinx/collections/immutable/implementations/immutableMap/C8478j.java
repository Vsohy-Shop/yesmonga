package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C10934f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11353h;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.j */
public final class C8478j<K, V> extends C10934f<K> implements Set<K>, C11353h {
    @C12579k

    /* renamed from: a */
    public final C8474f<K, V> f22867a;

    public C8478j(@C12579k C8474f<K, V> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "builder");
        this.f22867a = fVar;
    }

    public boolean add(K k) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f22867a.clear();
    }

    public boolean contains(Object obj) {
        return this.f22867a.containsKey(obj);
    }

    /* renamed from: e */
    public int mo15840e() {
        return this.f22867a.size();
    }

    @C12579k
    public Iterator<K> iterator() {
        return new C8479k(this.f22867a);
    }

    public boolean remove(Object obj) {
        if (!this.f22867a.containsKey(obj)) {
            return false;
        }
        this.f22867a.remove(obj);
        return true;
    }
}
