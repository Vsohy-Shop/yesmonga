package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.APIMDataEntity;
import com.carrefour.fid.android.data.entities.APIMOrdersOfflineEntity;
import com.carrefour.fid.android.data.entities.APIMOrdersPagingEntity;
import com.carrefour.fid.android.data.entities.APIMStoreEntity;
import com.carrefour.fid.android.data.entities.Amount;
import com.carrefour.fid.android.data.entities.extension.C36449f;
import com.carrefour.fid.android.domain.models.OrdersOfflineDomain;
import com.carrefour.fid.android.domain.models.OrdersOfflineResultDomain;
import com.carrefour.fid.android.domain.models.OrdersPagingDomain;
import com.carrefour.fid.android.shared.base.C28486g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C10978t;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nAPIMOrdersOfflineEntityDataMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 APIMOrdersOfflineEntityDataMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMOrdersOfflineEntityDataMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,44:1\n1549#2:45\n1620#2,3:46\n*S KotlinDebug\n*F\n+ 1 APIMOrdersOfflineEntityDataMapper.kt\ncom/carrefour/fid/android/data/entities/mapper/APIMOrdersOfflineEntityDataMapper\n*L\n23#1:45\n23#1:46,3\n*E\n"})
/* renamed from: com.carrefour.fid.android.data.entities.mapper.s */
public final class C36523s extends C28486g<APIMOrdersOfflineEntity, OrdersOfflineResultDomain> {

    /* renamed from: b */
    public static final int f90217b = 0;

    @C12579k
    /* renamed from: d */
    public OrdersOfflineResultDomain mo72340a(@C12580l APIMOrdersOfflineEntity aPIMOrdersOfflineEntity) {
        String str;
        APIMOrdersPagingEntity meta;
        APIMOrdersPagingEntity meta2;
        List<OrdersOfflineDomain> e = mo111316e(aPIMOrdersOfflineEntity);
        String str2 = null;
        if (aPIMOrdersOfflineEntity == null || (meta2 = aPIMOrdersOfflineEntity.getMeta()) == null) {
            str = null;
        } else {
            str = meta2.getScrollHash();
        }
        if (!(aPIMOrdersOfflineEntity == null || (meta = aPIMOrdersOfflineEntity.getMeta()) == null)) {
            str2 = meta.getScrollPaging();
        }
        return new OrdersOfflineResultDomain(e, new OrdersPagingDomain(str, str2));
    }

    /* renamed from: e */
    public final List<OrdersOfflineDomain> mo111316e(APIMOrdersOfflineEntity aPIMOrdersOfflineEntity) {
        ArrayList arrayList;
        List<APIMDataEntity> data;
        String str;
        String str2;
        double d;
        int i;
        int i2;
        double d2;
        Iterator it;
        int i3;
        int i4;
        int i5;
        int i6;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        Long unscaledAmount;
        Long unscaledAmount2;
        Long unscaledAmount3;
        if (aPIMOrdersOfflineEntity == null || (data = aPIMOrdersOfflineEntity.getData()) == null) {
            arrayList = null;
        } else {
            Iterable iterable = data;
            ArrayList arrayList2 = new ArrayList(C10978t.m41495Y(iterable, 10));
            Iterator it2 = iterable.iterator();
            while (it2.hasNext()) {
                APIMDataEntity aPIMDataEntity = (APIMDataEntity) it2.next();
                String orderKey = aPIMDataEntity.getOrderKey();
                if (orderKey == null) {
                    str = "";
                } else {
                    str = orderKey;
                }
                String orderDate = aPIMDataEntity.getOrderDate();
                if (orderDate == null) {
                    str2 = "";
                } else {
                    str2 = orderDate;
                }
                Amount orderAmount = aPIMDataEntity.getOrderAmount();
                double d3 = 0.0d;
                if (orderAmount != null) {
                    d = C36449f.m149518a(orderAmount);
                } else {
                    d = 0.0d;
                }
                Amount orderAmount2 = aPIMDataEntity.getOrderAmount();
                if (orderAmount2 == null || (unscaledAmount3 = orderAmount2.getUnscaledAmount()) == null) {
                    i = 0;
                } else {
                    i = (int) unscaledAmount3.longValue();
                }
                Amount orderAmount3 = aPIMDataEntity.getOrderAmount();
                if (orderAmount3 != null) {
                    i2 = orderAmount3.getScale();
                } else {
                    i2 = 0;
                }
                Amount amountBeforeDiscount = aPIMDataEntity.getAmountBeforeDiscount();
                if (amountBeforeDiscount != null) {
                    d2 = C36449f.m149518a(amountBeforeDiscount);
                } else {
                    d2 = 0.0d;
                }
                Amount amountBeforeDiscount2 = aPIMDataEntity.getAmountBeforeDiscount();
                if (amountBeforeDiscount2 == null || (unscaledAmount2 = amountBeforeDiscount2.getUnscaledAmount()) == null) {
                    it = it2;
                    i3 = 0;
                } else {
                    it = it2;
                    i3 = (int) unscaledAmount2.longValue();
                }
                Amount amountBeforeDiscount3 = aPIMDataEntity.getAmountBeforeDiscount();
                if (amountBeforeDiscount3 != null) {
                    i4 = amountBeforeDiscount3.getScale();
                } else {
                    i4 = 0;
                }
                Amount amountImmediateDiscount = aPIMDataEntity.getAmountImmediateDiscount();
                if (amountImmediateDiscount != null) {
                    d3 = C36449f.m149518a(amountImmediateDiscount);
                }
                double d4 = d3;
                Amount amountImmediateDiscount2 = aPIMDataEntity.getAmountImmediateDiscount();
                if (amountImmediateDiscount2 == null || (unscaledAmount = amountImmediateDiscount2.getUnscaledAmount()) == null) {
                    i5 = 0;
                } else {
                    i5 = (int) unscaledAmount.longValue();
                }
                Amount amountImmediateDiscount3 = aPIMDataEntity.getAmountImmediateDiscount();
                if (amountImmediateDiscount3 != null) {
                    i6 = amountImmediateDiscount3.getScale();
                } else {
                    i6 = 0;
                }
                APIMStoreEntity store = aPIMDataEntity.getStore();
                if (store != null) {
                    str3 = store.getFacilityId();
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str4 = "";
                } else {
                    str4 = str3;
                }
                APIMStoreEntity store2 = aPIMDataEntity.getStore();
                if (store2 != null) {
                    str5 = store2.getFacilityName();
                } else {
                    str5 = null;
                }
                if (str5 == null) {
                    str6 = "";
                } else {
                    str6 = str5;
                }
                APIMStoreEntity store3 = aPIMDataEntity.getStore();
                if (store3 != null) {
                    str7 = store3.getGln();
                } else {
                    str7 = null;
                }
                if (str7 == null) {
                    str8 = "";
                } else {
                    str8 = str7;
                }
                arrayList2.add(new OrdersOfflineDomain(str, str2, i, i2, d, i3, i4, d2, i5, i6, d4, str4, str6, (String) null, str8, 8192, (DefaultConstructorMarker) null));
                it2 = it;
            }
            arrayList = arrayList2;
        }
        if (arrayList == null) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return arrayList;
    }
}
