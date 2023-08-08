package com.carrefour.fid.android.presentation.p035ui.orders.offline.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsPaymentDomain;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsProductDomain;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsVATDomain;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.extension.C24770a;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24795a;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24796b;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24797c;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24798d;
import com.carrefour.fid.android.presentation.p035ui.orders.offline.model.C24801g;
import com.carrefour.fid.android.shared.extension.C28782t;
import com.carrefour.fid.android.shared.extension.StringKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nOrdersOfflineDetailsModelDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrdersOfflineDetailsModelDataMapper.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/mapper/OrdersOfflineDetailsModelDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,75:1\n766#2:76\n857#2,2:77\n766#2:79\n857#2,2:80\n1549#2:82\n1620#2,3:83\n*S KotlinDebug\n*F\n+ 1 OrdersOfflineDetailsModelDataMapper.kt\ncom/carrefour/fid/android/presentation/ui/orders/offline/mapper/OrdersOfflineDetailsModelDataMapper\n*L\n35#1:76\n35#1:77,2\n42#1:79\n42#1:80,2\n65#1:82\n65#1:83,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.orders.offline.mapper.a */
public final class C24782a {

    /* renamed from: c */
    public static final int f61472c = 0;
    @C12579k

    /* renamed from: a */
    public final C24787e f61473a;
    @C12579k

    /* renamed from: b */
    public final C24784c f61474b;

    @Inject
    public C24782a(@C12579k C24787e eVar, @C12579k C24784c cVar) {
        Intrinsics.checkNotNullParameter(eVar, "ordersOfflineDetailsProductModelDataMapper");
        Intrinsics.checkNotNullParameter(cVar, "ordersOfflineDetailsPaymentModelDataMapper");
        this.f61473a = eVar;
        this.f61474b = cVar;
    }

    @C12579k
    /* renamed from: a */
    public final List<C24798d> mo72338a(@C12579k OrdersOfflineDetailsDomain ordersOfflineDetailsDomain) {
        boolean z;
        Intrinsics.checkNotNullParameter(ordersOfflineDetailsDomain, "entity");
        ArrayList arrayList = new ArrayList();
        String facilityName = ordersOfflineDetailsDomain.getFacilityName();
        String facilityAddress = ordersOfflineDetailsDomain.getFacilityAddress();
        if (facilityAddress == null) {
            facilityAddress = "";
        }
        arrayList.add(new C24797c(0, facilityName, facilityAddress, C28782t.m119105b(Double.valueOf(ordersOfflineDetailsDomain.getOrderAmount())), StringKt.m118939s(ordersOfflineDetailsDomain.getOrderDate()), ordersOfflineDetailsDomain.getDownloadUrl()));
        C24787e eVar = this.f61473a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = ordersOfflineDetailsDomain.getOrderProductList().iterator();
        while (true) {
            boolean z2 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            OrdersOfflineDetailsProductDomain ordersOfflineDetailsProductDomain = (OrdersOfflineDetailsProductDomain) next;
            if (C11622t.equals(StringsKt__StringsKt.trim(ordersOfflineDetailsProductDomain.getProductName()).toString(), C36178i.f89324s, true) || C11622t.equals(StringsKt__StringsKt.trim(ordersOfflineDetailsProductDomain.getProductName()).toString(), C36178i.f89325t, true)) {
                if (ordersOfflineDetailsProductDomain.getProductAmount() == 0.0d) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    z2 = false;
                }
            }
            if (z2) {
                arrayList2.add(next);
            }
        }
        List b = eVar.mo83406b(arrayList2);
        Intrinsics.checkNotNull(b, "null cannot be cast to non-null type kotlin.collections.List<com.carrefour.fid.android.presentation.ui.orders.offline.model.OrdersOfflineDetailsProductModel>");
        arrayList.addAll(b);
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : ordersOfflineDetailsDomain.getOrderPaymentsList()) {
            if (!Intrinsics.areEqual((Object) ((OrdersOfflineDetailsPaymentDomain) next2).getPaymentCode(), (Object) C36178i.f89319n)) {
                arrayList3.add(next2);
            }
        }
        List T5 = CollectionsKt___CollectionsKt.m40572T5(arrayList3);
        arrayList.add(new C24795a(2, C28782t.m119105b(Double.valueOf(ordersOfflineDetailsDomain.getAmountBeforeDiscount())), ordersOfflineDetailsDomain.getAmountImmediateDiscount(), C28782t.m119105b(Double.valueOf(ordersOfflineDetailsDomain.getOrderAmount())), !T5.isEmpty()));
        List b2 = this.f61474b.mo83406b(T5);
        Intrinsics.checkNotNull(b2, "null cannot be cast to non-null type kotlin.collections.List<com.carrefour.fid.android.presentation.ui.orders.offline.model.OrdersOfflineDetailsPaymentModel>");
        arrayList.addAll(b2);
        arrayList.add(new C24796b(4, ordersOfflineDetailsDomain.getLoyaltyCardNumber(), ordersOfflineDetailsDomain.getAmountRewardedOnLoyalty()));
        if (!ordersOfflineDetailsDomain.getOrderVATList().isEmpty()) {
            Iterable<OrdersOfflineDetailsVATDomain> orderVATList = ordersOfflineDetailsDomain.getOrderVATList();
            ArrayList arrayList4 = new ArrayList(C10978t.m41495Y(orderVATList, 10));
            for (OrdersOfflineDetailsVATDomain a : orderVATList) {
                arrayList4.add(C24770a.m107962a(a));
            }
            arrayList.add(new C24801g(arrayList4, ordersOfflineDetailsDomain.getTotalVATAmount(), ordersOfflineDetailsDomain.getOrderAmount()));
        }
        return arrayList;
    }
}
