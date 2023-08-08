package com.carrefour.fid.android.presentation.p035ui.orders.online.extension;

import com.carrefour.fid.android.core.type.OrderCategoryType;
import com.carrefour.fid.android.domain.extension.C37509j;
import com.carrefour.fid.android.domain.models.C38120r;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25234b;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25235c;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25237e;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.comparisons.C11006g;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nOrdersOnlineDetailsProductModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOnlineDetailsProductModel.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/extension/OrdersOnlineDetailsProductModelKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,39:1\n1855#2,2:40\n*S KotlinDebug\n*F\n+ 1 OrdersOnlineDetailsProductModel.kt\ncom/carrefour/fid/android/presentation/ui/orders/online/extension/OrdersOnlineDetailsProductModelKt\n*L\n20#1:40,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.extension.OrdersOnlineDetailsProductModelKt */
public final class OrdersOnlineDetailsProductModelKt {
    @C12579k
    /* renamed from: a */
    public static final List<C25237e> m108879a(@C12579k List<? extends C25234b> list, @C12579k C38120r rVar) {
        String str;
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(rVar, "order");
        List i = C10976s.m41417i();
        C25235c cVar = null;
        for (C25234b bVar : CollectionsKt___CollectionsKt.m40675p5(list, C11006g.m42420h(OrdersOnlineDetailsProductModelKt$withDepartment$1$1.f62069f, OrdersOnlineDetailsProductModelKt$withDepartment$1$2.f62070f, OrdersOnlineDetailsProductModelKt$withDepartment$1$3.f62071f, OrdersOnlineDetailsProductModelKt$withDepartment$1$4.f62072f))) {
            String category = bVar.getCategory();
            if (cVar != null) {
                str = cVar.mo73544i();
            } else {
                str = null;
            }
            if (!C11622t.equals(category, str, true)) {
                if (!Intrinsics.areEqual((Object) category, (Object) OrderCategoryType.MISSING_PRODUCTS.toString()) || !C37509j.m153970l(rVar)) {
                    z = false;
                } else {
                    z = true;
                }
                cVar = new C25235c(category, 1, z, C37509j.m153964f(rVar));
                i.add(cVar);
            } else if (cVar != null) {
                cVar.mo73547l(cVar.mo73542h() + 1);
            }
            i.add(bVar);
        }
        return C10976s.m41409a(i);
    }
}
