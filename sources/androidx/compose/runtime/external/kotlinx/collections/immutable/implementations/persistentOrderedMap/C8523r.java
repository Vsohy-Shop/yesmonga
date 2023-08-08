package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.r */
public final class C8523r<K, V> implements Iterator<V>, C11345a {
    @C12579k

    /* renamed from: a */
    public final C8521p<K, V> f22952a;

    public C8523r(@C12579k C8507c<K, V> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "map");
        this.f22952a = new C8521p<>(cVar.mo16021o(), cVar.mo16022p());
    }

    public boolean hasNext() {
        return this.f22952a.hasNext();
    }

    public V next() {
        return this.f22952a.next().mo16015e();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
