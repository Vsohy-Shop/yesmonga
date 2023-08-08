package kotlin.collections;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C11532s0;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nMapWithDefault.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,104:1\n330#2,6:105\n*S KotlinDebug\n*F\n+ 1 MapWithDefault.kt\nkotlin/collections/MapsKt__MapWithDefaultKt\n*L\n24#1:105,6\n*E\n"})
/* renamed from: kotlin.collections.q0 */
public class C10973q0 {
    @C11314h(name = "getOrImplicitDefaultNullable")
    @C11532s0
    /* renamed from: a */
    public static final <K, V> V m41391a(@C12579k Map<K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map instanceof C10967n0) {
            return ((C10967n0) map).mo22366Y(k);
        }
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        throw new NoSuchElementException("Key " + k + " is missing in the map.");
    }

    @C12579k
    /* renamed from: b */
    public static final <K, V> Map<K, V> m41392b(@C12579k Map<K, ? extends V> map, @C12579k C11300l<? super K, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (map instanceof C10967n0) {
            return m41392b(((C10967n0) map).mo22365A(), lVar);
        }
        return new C10969o0(map, lVar);
    }

    @C11314h(name = "withDefaultMutable")
    @C12579k
    /* renamed from: c */
    public static final <K, V> Map<K, V> m41393c(@C12579k Map<K, V> map, @C12579k C11300l<? super K, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (map instanceof C10993w0) {
            return m41393c(((C10993w0) map).mo22365A(), lVar);
        }
        return new C10995x0(map, lVar);
    }
}
