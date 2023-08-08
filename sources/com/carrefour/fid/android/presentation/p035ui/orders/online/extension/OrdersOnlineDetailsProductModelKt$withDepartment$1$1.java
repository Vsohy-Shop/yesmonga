package com.carrefour.fid.android.presentation.p035ui.orders.online.extension;

import com.carrefour.fid.android.core.type.OrderCategoryType;
import com.carrefour.fid.android.presentation.p035ui.orders.online.model.C25234b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/orders/online/model/b;", "it", "", "a", "(Lcom/carrefour/fid/android/presentation/ui/orders/online/model/b;)Ljava/lang/Comparable;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.online.extension.OrdersOnlineDetailsProductModelKt$withDepartment$1$1 */
public final class OrdersOnlineDetailsProductModelKt$withDepartment$1$1 extends Lambda implements C11300l<C25234b, Comparable<?>> {

    /* renamed from: f */
    public static final OrdersOnlineDetailsProductModelKt$withDepartment$1$1 f62069f = new OrdersOnlineDetailsProductModelKt$withDepartment$1$1();

    public OrdersOnlineDetailsProductModelKt$withDepartment$1$1() {
        super(1);
    }

    @C12580l
    /* renamed from: a */
    public final Comparable<?> invoke(@C12579k C25234b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "it");
        return Boolean.valueOf(!Intrinsics.areEqual((Object) bVar.getCategory(), (Object) OrderCategoryType.MISSING_PRODUCTS.toString()));
    }
}
