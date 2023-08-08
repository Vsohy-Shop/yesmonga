package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C10925c;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11346b;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.l */
public final class C8480l<K, V> extends C10925c<V> implements Collection<V>, C11346b {
    @C12579k

    /* renamed from: a */
    public final C8474f<K, V> f22868a;

    public C8480l(@C12579k C8474f<K, V> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "builder");
        this.f22868a = fVar;
    }

    public boolean add(V v) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        this.f22868a.clear();
    }

    public boolean contains(Object obj) {
        return this.f22868a.containsValue(obj);
    }

    /* renamed from: e */
    public int mo15855e() {
        return this.f22868a.size();
    }

    @C12579k
    public Iterator<V> iterator() {
        return new C8481m(this.f22868a);
    }
}
