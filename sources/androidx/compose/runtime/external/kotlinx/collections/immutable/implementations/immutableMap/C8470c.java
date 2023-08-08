package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11351g;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.c */
public final class C8470c<K, V> extends C8469b<K, V> implements Map.Entry<K, V>, C11351g.C11352a {
    @C12579k

    /* renamed from: c */
    public final C8477i<K, V> f22846c;

    /* renamed from: d */
    public V f22847d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8470c(@C12579k C8477i<K, V> iVar, K k, V v) {
        super(k, v);
        Intrinsics.checkNotNullParameter(iVar, "parentIterator");
        this.f22846c = iVar;
        this.f22847d = v;
    }

    /* renamed from: a */
    public void mo15787a(V v) {
        this.f22847d = v;
    }

    public V getValue() {
        return this.f22847d;
    }

    public V setValue(V v) {
        V value = getValue();
        mo15787a(v);
        this.f22846c.mo15844c(getKey(), v);
        return value;
    }
}
