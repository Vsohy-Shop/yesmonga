package kotlin.collections;

import java.util.Map;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11510n;

@C11314h(name = "MapAccessorsKt")
/* renamed from: kotlin.collections.m0 */
public final class C10965m0 {
    @C11110f
    /* renamed from: a */
    public static final <V, V1 extends V> V1 m41374a(Map<? super String, ? extends V> map, Object obj, C11510n<?> nVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(nVar, "property");
        return C10973q0.m41391a(map, nVar.getName());
    }

    @C11110f
    @C11314h(name = "getVar")
    /* renamed from: b */
    public static final <V, V1 extends V> V1 m41375b(Map<? super String, ? extends V> map, Object obj, C11510n<?> nVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(nVar, "property");
        return C10973q0.m41391a(map, nVar.getName());
    }

    @C11110f
    /* renamed from: c */
    public static final <V> void m41376c(Map<? super String, ? super V> map, Object obj, C11510n<?> nVar, V v) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(nVar, "property");
        map.put(nVar.getName(), v);
    }
}
