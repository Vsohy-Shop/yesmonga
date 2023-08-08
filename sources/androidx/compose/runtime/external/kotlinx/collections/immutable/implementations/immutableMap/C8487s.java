package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.C8443b;
import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.s */
public final class C8487s<K, V> extends AbstractCollection<V> implements C8443b<V> {
    @C12579k

    /* renamed from: a */
    public final C8471d<K, V> f22872a;

    public C8487s(@C12579k C8471d<K, V> dVar) {
        Intrinsics.checkNotNullParameter(dVar, "map");
        this.f22872a = dVar;
    }

    public boolean contains(Object obj) {
        return this.f22872a.containsValue(obj);
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f22872a.size();
    }

    @C12579k
    public Iterator<V> iterator() {
        return new C8488t(this.f22872a.mo15797p());
    }
}
