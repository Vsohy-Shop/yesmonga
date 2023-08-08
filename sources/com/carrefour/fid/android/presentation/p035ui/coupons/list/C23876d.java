package com.carrefour.fid.android.presentation.p035ui.coupons.list;

import com.carrefour.fid.android.presentation.models.CouponModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCouponsListFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CouponsListFilter.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListFilterKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,10:1\n766#2:11\n857#2,2:12\n*S KotlinDebug\n*F\n+ 1 CouponsListFilter.kt\ncom/carrefour/fid/android/presentation/ui/coupons/list/CouponsListFilterKt\n*L\n8#1:11\n8#1:12,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.coupons.list.d */
public final class C23876d {
    @C12579k
    /* renamed from: a */
    public static final List<CouponModel> m105667a(@C12579k List<CouponModel> list, @C12579k List<String> list2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(list2, "filtersId");
        if (list.isEmpty() || list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (list2.contains(((CouponModel) next).mo121396L())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
