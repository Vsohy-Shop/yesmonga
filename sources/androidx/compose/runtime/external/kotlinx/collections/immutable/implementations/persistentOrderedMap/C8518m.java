package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8469b;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.m */
public final class C8518m<K, V> implements Iterator<Map.Entry<? extends K, ? extends V>>, C11345a {
    @C12579k

    /* renamed from: a */
    public final C8521p<K, V> f22945a;

    public C8518m(@C12579k C8507c<K, V> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "map");
        this.f22945a = new C8521p<>(cVar.mo16021o(), cVar.mo16022p());
    }

    @C12579k
    /* renamed from: b */
    public Map.Entry<K, V> next() {
        return new C8469b(this.f22945a.mo16078c(), this.f22945a.next().mo16015e());
    }

    public boolean hasNext() {
        return this.f22945a.hasNext();
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
