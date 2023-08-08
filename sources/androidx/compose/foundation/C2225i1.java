package androidx.compose.foundation;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nTempListUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,108:1\n33#2,6:109\n33#2,6:115\n69#2,4:121\n74#2:126\n1#3:125\n*S KotlinDebug\n*F\n+ 1 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n*L\n38#1:109,6\n61#1:115,6\n82#1:121,4\n82#1:126\n*E\n"})
/* renamed from: androidx.compose.foundation.i1 */
public final class C2225i1 {
    @C12579k
    /* renamed from: a */
    public static final <T> List<T> m9667a(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj = list.get(i);
            if (lVar.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super T, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R m9668b(@org.jetbrains.annotations.C12579k java.util.List<? extends T> r3, R r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super R, ? super T, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r3.size()
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x001c
            java.lang.Object r2 = r3.get(r1)
            java.lang.Object r4 = r5.invoke(r4, r2)
            int r1 = r1 + 1
            goto L_0x000f
        L_0x001c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.C2225i1.m9668b(java.util.List, java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C12579k
    /* renamed from: c */
    public static final <T, R> List<R> m9669c(@C12579k List<? extends T> list, @C12579k C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object invoke = pVar.invoke(Integer.valueOf(i), list.get(i));
            if (invoke != null) {
                arrayList.add(invoke);
            }
        }
        return arrayList;
    }

    @C12580l
    /* renamed from: d */
    public static final <T, R extends Comparable<? super R>> R m9670d(@C12579k List<? extends T> list, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (list.isEmpty()) {
            return null;
        }
        R r = (Comparable) lVar.invoke(list.get(0));
        int G = CollectionsKt__CollectionsKt.m40443G(list);
        int i = 1;
        if (1 <= G) {
            while (true) {
                R r2 = (Comparable) lVar.invoke(list.get(i));
                if (r2.compareTo(r) > 0) {
                    r = r2;
                }
                if (i == G) {
                    break;
                }
                i++;
            }
        }
        return r;
    }
}
