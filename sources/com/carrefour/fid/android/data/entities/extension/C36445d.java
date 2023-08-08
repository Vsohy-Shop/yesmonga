package com.carrefour.fid.android.data.entities.extension;

import com.carrefour.fid.android.data.entities.APIMPricePerUnit;
import com.carrefour.fid.android.shared.extension.C28782t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.data.entities.extension.d */
public final class C36445d {
    @C12579k
    /* renamed from: a */
    public static final String m149514a(@C12579k APIMPricePerUnit aPIMPricePerUnit) {
        Intrinsics.checkNotNullParameter(aPIMPricePerUnit, "<this>");
        String b = C28782t.m119105b(Double.valueOf(((double) aPIMPricePerUnit.getPricePerUnit()) / ((double) 100)));
        String unitOfMeasure = aPIMPricePerUnit.getUnitOfMeasure();
        return b + "/" + unitOfMeasure;
    }
}
