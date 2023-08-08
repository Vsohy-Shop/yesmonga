package com.carrefour.fid.android.data.entities.extension;

import com.carrefour.fid.android.data.entities.APIMPaidVATEntity;
import com.carrefour.fid.android.data.entities.Amount;
import com.carrefour.fid.android.domain.models.OrdersOfflineDetailsVATDomain;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.carrefour.fid.android.data.entities.extension.c */
public final class C36444c {
    @C12580l
    /* renamed from: a */
    public static final OrdersOfflineDetailsVATDomain m149513a(@C12579k APIMPaidVATEntity aPIMPaidVATEntity) {
        Intrinsics.checkNotNullParameter(aPIMPaidVATEntity, "<this>");
        Double d = null;
        if (aPIMPaidVATEntity.getPercentage() == null) {
            return null;
        }
        String percentage = aPIMPaidVATEntity.getPercentage();
        double a = C36449f.m149518a(aPIMPaidVATEntity.getAmount());
        Amount amountWithTax = aPIMPaidVATEntity.getAmountWithTax();
        if (amountWithTax != null) {
            d = Double.valueOf(C36449f.m149518a(amountWithTax));
        }
        return new OrdersOfflineDetailsVATDomain(percentage, a, d);
    }
}
