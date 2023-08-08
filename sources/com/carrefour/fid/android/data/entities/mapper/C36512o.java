package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.APIMPaymentEntity;
import com.carrefour.fid.android.data.entities.Amount;
import com.carrefour.fid.android.data.entities.extension.C36449f;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsPaymentDomain;
import com.carrefour.fid.android.shared.base.C28486g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.o */
public final class C36512o extends C28486g<APIMPaymentEntity, OrdersOfflineDetailsPaymentDomain> {

    /* renamed from: b */
    public static final int f90205b = 0;

    @C12579k
    /* renamed from: d */
    public OrdersOfflineDetailsPaymentDomain mo72340a(@C12579k APIMPaymentEntity aPIMPaymentEntity) {
        String str;
        String str2;
        int i;
        double d;
        Intrinsics.checkNotNullParameter(aPIMPaymentEntity, "entity");
        String choice = aPIMPaymentEntity.getChoice();
        if (choice == null) {
            str = "";
        } else {
            str = choice;
        }
        String label = aPIMPaymentEntity.getLabel();
        if (label == null) {
            str2 = "";
        } else {
            str2 = label;
        }
        Amount amount = aPIMPaymentEntity.getAmount();
        if (amount != null) {
            i = amount.getScale();
        } else {
            i = 0;
        }
        int i2 = i;
        Amount amount2 = aPIMPaymentEntity.getAmount();
        if (amount2 != null) {
            d = C36449f.m149518a(amount2);
        } else {
            d = 0.0d;
        }
        return new OrdersOfflineDetailsPaymentDomain(str, str2, i2, d);
    }
}
