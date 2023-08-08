package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.h */
public final class C8513h<K, V> implements Iterator<K>, C11348d {
    @C12579k

    /* renamed from: a */
    public final C8514i<K, V> f22935a;

    public C8513h(@C12579k C8509d<K, V> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "map");
        this.f22935a = new C8514i<>(dVar.mo16032e(), dVar);
    }

    public boolean hasNext() {
        return this.f22935a.hasNext();
    }

    public K next() {
        this.f22935a.next();
        return this.f22935a.mo16056h();
    }

    public void remove() {
        this.f22935a.remove();
    }
}
