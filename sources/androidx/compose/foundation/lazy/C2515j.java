package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLazyListHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,94:1\n1#2:95\n69#3,6:96\n*S KotlinDebug\n*F\n+ 1 LazyListHeaders.kt\nandroidx/compose/foundation/lazy/LazyListHeadersKt\n*L\n57#1:96,6\n*E\n"})
/* renamed from: androidx.compose.foundation.lazy.j */
public final class C2515j {
    @C12580l
    /* renamed from: a */
    public static final C2574r m11299a(@C12579k List<C2574r> list, @C12579k C2621v vVar, @C12579k List<Integer> list2, int i, int i2, int i3) {
        int i4;
        int i5;
        List<C2574r> list3 = list;
        C2621v vVar2 = vVar;
        List<Integer> list4 = list2;
        int i6 = i;
        Intrinsics.checkNotNullParameter(list, "composedVisibleItems");
        Intrinsics.checkNotNullParameter(vVar2, "itemProvider");
        Intrinsics.checkNotNullParameter(list4, "headerIndexes");
        int index = ((C2574r) CollectionsKt___CollectionsKt.m40706w2(list)).getIndex();
        int size = list2.size();
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        while (i9 < size && list4.get(i9).intValue() <= index) {
            i7 = list4.get(i9).intValue();
            i9++;
            if (i9 < 0 || i9 > CollectionsKt__CollectionsKt.m40443G(list2)) {
                i5 = -1;
            } else {
                i5 = list4.get(i9);
            }
            i8 = i5.intValue();
        }
        int size2 = list.size();
        int i10 = Integer.MIN_VALUE;
        int i11 = Integer.MIN_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < size2; i13++) {
            C2574r rVar = list.get(i13);
            if (rVar.getIndex() == i7) {
                i10 = rVar.getOffset();
                i12 = i13;
            } else if (rVar.getIndex() == i8) {
                i11 = rVar.getOffset();
            }
        }
        if (i7 == -1) {
            return null;
        }
        C2620u a = vVar2.mo9033a(C2452b.m10906c(i7));
        if (i10 != Integer.MIN_VALUE) {
            i4 = Math.max(-i6, i10);
        } else {
            i4 = -i6;
        }
        if (i11 != Integer.MIN_VALUE) {
            i4 = Math.min(i4, i11 - a.mo9030d());
        }
        C2574r f = a.mo9032f(i4, i2, i3);
        if (i12 != -1) {
            list.set(i12, f);
        } else {
            list.add(0, f);
        }
        return f;
    }
}
