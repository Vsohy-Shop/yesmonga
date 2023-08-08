package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.k */
public final class C8516k<K, V> implements Iterator<V>, C11348d {
    @C12579k

    /* renamed from: a */
    public final C8514i<K, V> f22943a;

    public C8516k(@C12579k C8509d<K, V> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "map");
        this.f22943a = new C8514i<>(dVar.mo16032e(), dVar);
    }

    public boolean hasNext() {
        return this.f22943a.hasNext();
    }

    public V next() {
        return this.f22943a.next().mo16015e();
    }

    public void remove() {
        this.f22943a.remove();
    }
}
