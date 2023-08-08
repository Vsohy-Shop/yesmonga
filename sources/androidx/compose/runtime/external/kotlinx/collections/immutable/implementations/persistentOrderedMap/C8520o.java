package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.o */
public final class C8520o<K, V> implements Iterator<K>, C11345a {
    @C12579k

    /* renamed from: a */
    public final C8521p<K, V> f22947a;

    public C8520o(@C12579k C8507c<K, V> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "map");
        this.f22947a = new C8521p<>(cVar.mo16021o(), cVar.mo16022p());
    }

    public boolean hasNext() {
        return this.f22947a.hasNext();
    }

    public K next() {
        K c = this.f22947a.mo16078c();
        this.f22947a.next();
        return c;
    }

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
