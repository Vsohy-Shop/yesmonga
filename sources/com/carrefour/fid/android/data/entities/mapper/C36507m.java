package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.APIMDataEntity;
import com.carrefour.fid.android.data.entities.APIMOfflineOfferEntity;
import com.carrefour.fid.android.data.entities.APIMOrdersOfflineDetailsEntity;
import com.carrefour.fid.android.data.entities.APIMPaidVATEntity;
import com.carrefour.fid.android.data.entities.APIMPaymentEntity;
import com.carrefour.fid.android.data.entities.APIMStoreEntity;
import com.carrefour.fid.android.data.entities.Amount;
import com.carrefour.fid.android.data.entities.extension.C36444c;
import com.carrefour.fid.android.data.entities.extension.C36449f;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsDomain;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsVATDomain;
import com.carrefour.fid.android.shared.base.C28486g;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAPIMOrdersOfflineDetailsEntityDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APIMOrdersOfflineDetailsEntityDataMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMOrdersOfflineDetailsEntityDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,47:1\n1603#2,9:48\n1855#2:57\n1856#2:59\n1612#2:60\n1#3:58\n*S KotlinDebug\n*F\n+ 1 APIMOrdersOfflineDetailsEntityDataMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMOrdersOfflineDetailsEntityDataMapper\n*L\n41#1:48,9\n41#1:57\n41#1:59\n41#1:60\n41#1:58\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.m */
public final class C36507m extends C28486g<APIMOrdersOfflineDetailsEntity, OrdersOfflineDetailsDomain> {

    /* renamed from: d */
    public static final int f90198d = 0;
    @C12579k

    /* renamed from: b */
    public final C36518q f90199b;
    @C12579k

    /* renamed from: c */
    public final C36512o f90200c;

    @Inject
    public C36507m(@C12579k C36518q qVar, @C12579k C36512o oVar) {
        Intrinsics.checkNotNullParameter(qVar, "productListMapper");
        Intrinsics.checkNotNullParameter(oVar, "paymentListMapper");
        this.f90199b = qVar;
        this.f90200c = oVar;
    }

    @C12580l
    /* renamed from: d */
    public OrdersOfflineDetailsDomain mo72340a(@C12580l APIMOrdersOfflineDetailsEntity aPIMOrdersOfflineDetailsEntity) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        double d;
        int i;
        int i2;
        double d2;
        int i3;
        int i4;
        double d3;
        int i5;
        String str7;
        String str8;
        List<APIMOfflineOfferEntity> list;
        List<APIMPaymentEntity> list2;
        ArrayList arrayList;
        double d4;
        Amount totalVATAmount;
        List<APIMPaidVATEntity> paidVAT;
        Amount amountImmediateDiscount;
        Amount amountImmediateDiscount2;
        Long unscaledAmount;
        Amount amountImmediateDiscount3;
        Amount amountBeforeDiscount;
        Amount amountBeforeDiscount2;
        Long unscaledAmount2;
        Amount amountBeforeDiscount3;
        Amount orderAmount;
        Amount orderAmount2;
        Long unscaledAmount3;
        Amount orderAmount3;
        APIMStoreEntity store;
        APIMStoreEntity store2;
        Amount amount = null;
        if (aPIMOrdersOfflineDetailsEntity == null) {
            return null;
        }
        APIMDataEntity offlineOrderHeaderEntity = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity != null) {
            str = offlineOrderHeaderEntity.getLoyaltyCardNumber();
        } else {
            str = null;
        }
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        APIMDataEntity offlineOrderHeaderEntity2 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity2 == null || (store2 = offlineOrderHeaderEntity2.getStore()) == null) {
            str3 = null;
        } else {
            str3 = store2.getFacilityId();
        }
        if (str3 == null) {
            str4 = "";
        } else {
            str4 = str3;
        }
        APIMDataEntity offlineOrderHeaderEntity3 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity3 == null || (store = offlineOrderHeaderEntity3.getStore()) == null) {
            str5 = null;
        } else {
            str5 = store.getFacilityName();
        }
        if (str5 == null) {
            str6 = "";
        } else {
            str6 = str5;
        }
        APIMDataEntity offlineOrderHeaderEntity4 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity4 == null || (orderAmount3 = offlineOrderHeaderEntity4.getOrderAmount()) == null) {
            d = 0.0d;
        } else {
            d = C36449f.m149518a(orderAmount3);
        }
        APIMDataEntity offlineOrderHeaderEntity5 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        int i6 = 0;
        if (offlineOrderHeaderEntity5 == null || (orderAmount2 = offlineOrderHeaderEntity5.getOrderAmount()) == null || (unscaledAmount3 = orderAmount2.getUnscaledAmount()) == null) {
            i = 0;
        } else {
            i = (int) unscaledAmount3.longValue();
        }
        APIMDataEntity offlineOrderHeaderEntity6 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity6 == null || (orderAmount = offlineOrderHeaderEntity6.getOrderAmount()) == null) {
            i2 = 0;
        } else {
            i2 = orderAmount.getScale();
        }
        APIMDataEntity offlineOrderHeaderEntity7 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity7 == null || (amountBeforeDiscount3 = offlineOrderHeaderEntity7.getAmountBeforeDiscount()) == null) {
            d2 = 0.0d;
        } else {
            d2 = C36449f.m149518a(amountBeforeDiscount3);
        }
        APIMDataEntity offlineOrderHeaderEntity8 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity8 == null || (amountBeforeDiscount2 = offlineOrderHeaderEntity8.getAmountBeforeDiscount()) == null || (unscaledAmount2 = amountBeforeDiscount2.getUnscaledAmount()) == null) {
            i3 = 0;
        } else {
            i3 = (int) unscaledAmount2.longValue();
        }
        APIMDataEntity offlineOrderHeaderEntity9 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity9 == null || (amountBeforeDiscount = offlineOrderHeaderEntity9.getAmountBeforeDiscount()) == null) {
            i4 = 0;
        } else {
            i4 = amountBeforeDiscount.getScale();
        }
        APIMDataEntity offlineOrderHeaderEntity10 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity10 == null || (amountImmediateDiscount3 = offlineOrderHeaderEntity10.getAmountImmediateDiscount()) == null) {
            d3 = 0.0d;
        } else {
            d3 = C36449f.m149518a(amountImmediateDiscount3);
        }
        APIMDataEntity offlineOrderHeaderEntity11 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity11 == null || (amountImmediateDiscount2 = offlineOrderHeaderEntity11.getAmountImmediateDiscount()) == null || (unscaledAmount = amountImmediateDiscount2.getUnscaledAmount()) == null) {
            i5 = 0;
        } else {
            i5 = (int) unscaledAmount.longValue();
        }
        APIMDataEntity offlineOrderHeaderEntity12 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (!(offlineOrderHeaderEntity12 == null || (amountImmediateDiscount = offlineOrderHeaderEntity12.getAmountImmediateDiscount()) == null)) {
            i6 = amountImmediateDiscount.getScale();
        }
        int i7 = i6;
        APIMDataEntity offlineOrderHeaderEntity13 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity13 != null) {
            str7 = offlineOrderHeaderEntity13.getOrderDate();
        } else {
            str7 = null;
        }
        if (str7 == null) {
            str8 = "";
        } else {
            str8 = str7;
        }
        C36518q qVar = this.f90199b;
        APIMDataEntity offlineOrderHeaderEntity14 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity14 != null) {
            list = offlineOrderHeaderEntity14.getOfflineOfferEntityList();
        } else {
            list = null;
        }
        List<R> b = qVar.mo83406b(list);
        if (b == null) {
            b = CollectionsKt__CollectionsKt.m40441E();
        }
        List<R> list3 = b;
        C36512o oVar = this.f90200c;
        APIMDataEntity offlineOrderHeaderEntity15 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity15 != null) {
            list2 = offlineOrderHeaderEntity15.getPayments();
        } else {
            list2 = null;
        }
        List<R> b2 = oVar.mo83406b(list2);
        if (b2 == null) {
            b2 = CollectionsKt__CollectionsKt.m40441E();
        }
        List<R> list4 = b2;
        APIMDataEntity offlineOrderHeaderEntity16 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity16 == null || (paidVAT = offlineOrderHeaderEntity16.getPaidVAT()) == null) {
            arrayList = CollectionsKt__CollectionsKt.m40441E();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (APIMPaidVATEntity a : paidVAT) {
                OrdersOfflineDetailsVATDomain a2 = C36444c.m149513a(a);
                if (a2 != null) {
                    arrayList2.add(a2);
                }
            }
            arrayList = arrayList2;
        }
        APIMDataEntity offlineOrderHeaderEntity17 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity17 == null || (totalVATAmount = offlineOrderHeaderEntity17.getTotalVATAmount()) == null) {
            d4 = 0.0d;
        } else {
            d4 = C36449f.m149518a(totalVATAmount);
        }
        APIMDataEntity offlineOrderHeaderEntity18 = aPIMOrdersOfflineDetailsEntity.getOfflineOrderHeaderEntity();
        if (offlineOrderHeaderEntity18 != null) {
            amount = offlineOrderHeaderEntity18.getAmountRewardedOnLoyalty();
        }
        return new OrdersOfflineDetailsDomain(str2, str8, i, i2, d, i3, i4, d2, i5, i7, d3, C36449f.m149518a(amount), str4, str6, (String) null, list3, list4, arrayList, d4, (String) null, 540672, (DefaultConstructorMarker) null);
    }
}
