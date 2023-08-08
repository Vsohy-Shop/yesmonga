package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11348d;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.i */
public final class C8477i<K, V> implements Iterator<Map.Entry<K, V>>, C11348d {
    @C12579k

    /* renamed from: a */
    public final C8475g<K, V, Map.Entry<K, V>> f22866a;

    public C8477i(@C12579k C8474f<K, V> fVar) {
        Intrinsics.checkNotNullParameter(fVar, "builder");
        C8492v[] vVarArr = new C8492v[8];
        for (int i = 0; i < 8; i++) {
            vVarArr[i] = new C8496z(this);
        }
        this.f22866a = new C8475g<>(fVar, vVarArr);
    }

    @C12579k
    /* renamed from: b */
    public Map.Entry<K, V> next() {
        return this.f22866a.next();
    }

    /* renamed from: c */
    public final void mo15844c(K k, V v) {
        this.f22866a.mo15837p(k, v);
    }

    public boolean hasNext() {
        return this.f22866a.hasNext();
    }

    public void remove() {
        this.f22866a.remove();
    }
}
