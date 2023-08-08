package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.C8469b;
import com.onetrust.otpublishers.headless.Public.Keys.OTUXParamsKeys;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11351g;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.persistentOrderedMap.b */
public final class C8506b<K, V> extends C8469b<K, V> implements Map.Entry<K, V>, C11351g.C11352a {
    @C12579k

    /* renamed from: c */
    public final Map<K, C8505a<V>> f22921c;
    @C12579k

    /* renamed from: d */
    public C8505a<V> f22922d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8506b(@C12579k Map<K, C8505a<V>> map, K k, @C12579k C8505a<V> aVar) {
        super(k, aVar.mo16015e());
        Intrinsics.checkNotNullParameter(map, "mutableMap");
        Intrinsics.checkNotNullParameter(aVar, OTUXParamsKeys.OT_UX_LINKS);
        this.f22921c = map;
        this.f22922d = aVar;
    }

    public V getValue() {
        return this.f22922d.mo16015e();
    }

    public V setValue(V v) {
        V e = this.f22922d.mo16015e();
        this.f22922d = this.f22922d.mo16018h(v);
        this.f22921c.put(getKey(), this.f22922d);
        return e;
    }
}
