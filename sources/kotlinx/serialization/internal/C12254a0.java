package kotlinx.serialization.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.a0 */
public final class C12254a0<K, V> extends C12319v0<K, V, Map<K, ? extends V>, HashMap<K, V>> {
    @C12579k

    /* renamed from: c */
    public final C12217f f30053c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12254a0(@C12579k C12248g<K> gVar, @C12579k C12248g<V> gVar2) {
        super(gVar, gVar2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(gVar, "kSerializer");
        Intrinsics.checkNotNullParameter(gVar2, "vSerializer");
        this.f30053c = new C12331z(gVar.getDescriptor(), gVar2.getDescriptor());
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30053c;
    }

    @C12579k
    /* renamed from: r */
    public HashMap<K, V> mo25003a() {
        return new HashMap<>();
    }

    /* renamed from: s */
    public int mo25004b(@C12579k HashMap<K, V> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        return hashMap.size() * 2;
    }

    /* renamed from: t */
    public void mo25005c(@C12579k HashMap<K, V> hashMap, int i) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
    }

    @C12579k
    /* renamed from: u */
    public Iterator<Map.Entry<K, V>> mo25006d(@C12579k Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    /* renamed from: v */
    public int mo25007e(@C12579k Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    /* renamed from: w */
    public void mo25014o(@C12579k HashMap<K, V> hashMap, int i, K k, V v) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        hashMap.put(k, v);
    }

    @C12579k
    /* renamed from: x */
    public HashMap<K, V> mo25012k(@C12579k Map<K, ? extends V> map) {
        HashMap<K, V> hashMap;
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof HashMap) {
            hashMap = (HashMap) map;
        } else {
            hashMap = null;
        }
        if (hashMap == null) {
            return new HashMap<>(map);
        }
        return hashMap;
    }

    @C12579k
    /* renamed from: y */
    public Map<K, V> mo25013l(@C12579k HashMap<K, V> hashMap) {
        Intrinsics.checkNotNullParameter(hashMap, "<this>");
        return hashMap;
    }
}
