package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11532s0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.descriptors.C12217f;
import org.jetbrains.annotations.C12579k;

@C11532s0
/* renamed from: kotlinx.serialization.internal.m0 */
public final class C12291m0<K, V> extends C12319v0<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {
    @C12579k

    /* renamed from: c */
    public final C12217f f30087c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12291m0(@C12579k C12248g<K> gVar, @C12579k C12248g<V> gVar2) {
        super(gVar, gVar2, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(gVar, "kSerializer");
        Intrinsics.checkNotNullParameter(gVar2, "vSerializer");
        this.f30087c = new C12288l0(gVar.getDescriptor(), gVar2.getDescriptor());
    }

    @C12579k
    public C12217f getDescriptor() {
        return this.f30087c;
    }

    @C12579k
    /* renamed from: r */
    public LinkedHashMap<K, V> mo25003a() {
        return new LinkedHashMap<>();
    }

    /* renamed from: s */
    public int mo25004b(@C12579k LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* renamed from: t */
    public void mo25005c(@C12579k LinkedHashMap<K, V> linkedHashMap, int i) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
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
    public void mo25014o(@C12579k LinkedHashMap<K, V> linkedHashMap, int i, K k, V v) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        linkedHashMap.put(k, v);
    }

    @C12579k
    /* renamed from: x */
    public LinkedHashMap<K, V> mo25012k(@C12579k Map<K, ? extends V> map) {
        LinkedHashMap<K, V> linkedHashMap;
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof LinkedHashMap) {
            linkedHashMap = (LinkedHashMap) map;
        } else {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return new LinkedHashMap<>(map);
        }
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: y */
    public Map<K, V> mo25013l(@C12579k LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}
