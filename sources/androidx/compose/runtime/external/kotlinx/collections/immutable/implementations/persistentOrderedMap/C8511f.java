package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.f */
public final class C8511f<K, V> implements Iterator<Map.Entry<K, V>>, C11348d {
    @C12579k

    /* renamed from: a */
    public final C8514i<K, V> f22933a;

    public C8511f(@C12579k C8509d<K, V> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "map");
        this.f22933a = new C8514i<>(dVar.mo16032e(), dVar);
    }

    @C12579k
    /* renamed from: b */
    public Map.Entry<K, V> next() {
        return new C8506b(this.f22933a.mo16054e().mo16033f(), this.f22933a.mo16056h(), this.f22933a.next());
    }

    public boolean hasNext() {
        return this.f22933a.hasNext();
    }

    public void remove() {
        this.f22933a.remove();
    }
}
