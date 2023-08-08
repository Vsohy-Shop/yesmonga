package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C10994x;
import kotlin.coroutines.C11045c;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1408:1\n361#2,7:1409\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/RecomposerKt\n*L\n1400#1:1409,7\n*E\n"})
public final class RecomposerKt {

    /* renamed from: a */
    public static final int f22746a = 1000;
    @C12579k

    /* renamed from: b */
    public static final Object f22747b = new Object();
    @C12579k

    /* renamed from: c */
    public static final Object f22748c = new Object();

    /* renamed from: c */
    public static final <K, V> boolean m30143c(@C12579k Map<K, List<V>> map, K k, V v) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        List<V> list = map.get(k);
        if (list == null) {
            list = new ArrayList<>();
            map.put(k, list);
        }
        return list.add(v);
    }

    @C12580l
    /* renamed from: d */
    public static final <K, V> V m30144d(@C12579k Map<K, List<V>> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        List list = map.get(k);
        if (list == null) {
            return null;
        }
        V J0 = C10994x.m42349J0(list);
        if (!list.isEmpty()) {
            return J0;
        }
        map.remove(k);
        return J0;
    }

    @C12580l
    /* renamed from: e */
    public static final <R> Object m30145e(@C12579k C11305q<? super C12074o0, ? super Recomposer, ? super C11045c<? super R>, ? extends Object> qVar, @C12579k C11045c<? super R> cVar) {
        return C12079p0.m48266g(new RecomposerKt$withRunningRecomposer$2(qVar, (C11045c<? super RecomposerKt$withRunningRecomposer$2>) null), cVar);
    }
}
