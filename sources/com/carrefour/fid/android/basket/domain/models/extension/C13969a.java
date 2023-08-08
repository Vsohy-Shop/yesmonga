package com.carrefour.fid.android.basket.domain.models.extension;

import com.carrefour.fid.android.domain.models.basket.Basket;
import com.carrefour.fid.android.domain.models.basket.BasketServiceType;
import com.carrefour.fid.android.domain.models.basket.BasketType;
import com.carrefour.fid.android.domain.models.basket.C37969b;
import com.carrefour.fid.android.domain.models.service.models.StoreServiceType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nBasketUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BasketUtils.kt\ncom/carrefour/fid/android/basket/domain/models/extension/BasketUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,42:1\n766#2:43\n857#2,2:44\n*S KotlinDebug\n*F\n+ 1 BasketUtils.kt\ncom/carrefour/fid/android/basket/domain/models/extension/BasketUtilsKt\n*L\n18#1:43\n18#1:44,2\n*E\n"})
/* renamed from: com.carrefour.fid.android.basket.domain.models.extension.a */
public final class C13969a {
    @C12579k

    /* renamed from: a */
    public static final List<BasketType> f34097a = C10976s.m41419k(BasketType.BASKET_V4_HOME_DELIVERY_NAL);

    @C12579k
    /* renamed from: a */
    public static final List<Basket> m59182a(@C12579k List<Basket> list, @C12579k BasketType basketType, @C12580l StoreServiceType storeServiceType) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(basketType, "basketSet");
        List<BasketType> list2 = f34097a;
        if (!list2.contains(basketType)) {
            list2 = CollectionsKt___CollectionsKt.m40723z4(list2, basketType);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            Basket basket = (Basket) next;
            if (!CollectionsKt___CollectionsKt.m40558R1(list2, basket.mo116829N()) || !m59183b(basket, basketType, storeServiceType) || basket.mo116819D() <= 0) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public static final boolean m59183b(Basket basket, BasketType basketType, StoreServiceType storeServiceType) {
        if (basket.mo116829N() != basketType || C37969b.m156161a().get(basket.mo116829N()) == null || storeServiceType == null) {
            return true;
        }
        if (basket.mo116829N() == BasketType.BASKET_V4_DRIVE) {
            if (basket.mo116824I() == BasketServiceType.DRIVE && Intrinsics.areEqual((Object) storeServiceType, (Object) StoreServiceType.Drive.INSTANCE)) {
                return true;
            }
            if (basket.mo116824I() != BasketServiceType.DELIVERY || !Intrinsics.areEqual((Object) storeServiceType, (Object) StoreServiceType.Clcv.INSTANCE)) {
                return false;
            }
            return true;
        } else if (basket.mo116829N() == BasketType.BASKET_V4_EXPRESS_DELIVERY) {
            return Intrinsics.areEqual((Object) storeServiceType, (Object) StoreServiceType.H1h3.INSTANCE);
        } else {
            return false;
        }
    }
}
