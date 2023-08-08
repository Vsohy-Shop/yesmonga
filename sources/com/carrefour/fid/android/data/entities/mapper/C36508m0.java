package com.carrefour.fid.android.data.entities.mapper;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.data.entities.Amount;
import com.carrefour.fid.android.data.entities.OHMAllowanceCharge;
import com.carrefour.fid.android.data.entities.extension.C36449f;
import com.carrefour.fid.android.domain.models.C38079p;
import com.carrefour.fid.android.shared.base.C28486g;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.data.entities.mapper.m0 */
public final class C36508m0 extends C28486g<OHMAllowanceCharge, C38079p> {

    /* renamed from: b */
    public static final int f90201b = 0;

    @C12579k
    /* renamed from: d */
    public C38079p mo72340a(@C12579k OHMAllowanceCharge oHMAllowanceCharge) {
        double d;
        String str;
        String str2;
        String str3;
        String str4;
        Intrinsics.checkNotNullParameter(oHMAllowanceCharge, "entity");
        Amount allowanceChargeAmount = oHMAllowanceCharge.getAllowanceChargeAmount();
        if (allowanceChargeAmount != null) {
            d = C36449f.m149518a(allowanceChargeAmount);
        } else {
            d = 0.0d;
        }
        double d2 = d;
        String allowanceChargeType = oHMAllowanceCharge.getAllowanceChargeType();
        if (allowanceChargeType == null) {
            str = "";
        } else {
            str = allowanceChargeType;
        }
        String allowanceOrChargeType = oHMAllowanceCharge.getAllowanceOrChargeType();
        if (allowanceOrChargeType == null) {
            str2 = "";
        } else {
            str2 = allowanceOrChargeType;
        }
        String allowanceChargeDescription = oHMAllowanceCharge.getAllowanceChargeDescription();
        if (allowanceChargeDescription == null) {
            str3 = "";
        } else {
            str3 = allowanceChargeDescription;
        }
        String promotionType = oHMAllowanceCharge.getPromotionType();
        if (promotionType == null) {
            str4 = "";
        } else {
            str4 = promotionType;
        }
        String bracketIdentifier = oHMAllowanceCharge.getBracketIdentifier();
        if (bracketIdentifier == null) {
            bracketIdentifier = "";
        }
        return new C38079p(d2, str, str2, str3, str4, bracketIdentifier);
    }
}
