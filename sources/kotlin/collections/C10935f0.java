package kotlin.collections;

import com.bumptech.glide.gifdecoder.C22075f;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nGroupingJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n+ 2 Grouping.kt\nkotlin/collections/GroupingKt__GroupingKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,52:1\n143#2:53\n80#2,4:54\n85#2:59\n1#3:58\n1855#4,2:60\n*S KotlinDebug\n*F\n+ 1 GroupingJVM.kt\nkotlin/collections/GroupingKt__GroupingJVMKt\n*L\n22#1:53\n22#1:54,4\n22#1:59\n48#1:60,2\n*E\n"})
/* renamed from: kotlin.collections.f0 */
public class C10935f0 {
    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: a */
    public static final <T, K> Map<K, Integer> m40920a(@C12579k C10929d0<T, ? extends K> d0Var) {
        boolean z;
        Intrinsics.checkNotNullParameter(d0Var, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> b = d0Var.mo21945b();
        while (b.hasNext()) {
            Object a = d0Var.mo21944a(b.next());
            Object obj = linkedHashMap.get(a);
            if (obj != null || linkedHashMap.containsKey(a)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                obj = new Ref.IntRef();
            }
            Ref.IntRef intRef = (Ref.IntRef) obj;
            intRef.element++;
            linkedHashMap.put(a, intRef);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Intrinsics.checkNotNull(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            C11370u0.m43697m(entry).setValue(Integer.valueOf(((Ref.IntRef) entry.getValue()).element));
        }
        return C11370u0.m43695k(linkedHashMap);
    }

    @C11110f
    @C11532s0
    /* renamed from: b */
    public static final <K, V, R> Map<K, R> m40921b(Map<K, V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C22075f.f56695A);
        for (Map.Entry entry : map.entrySet()) {
            Intrinsics.checkNotNull(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>");
            C11370u0.m43697m(entry).setValue(lVar.invoke(entry));
        }
        return C11370u0.m43695k(map);
    }
}
