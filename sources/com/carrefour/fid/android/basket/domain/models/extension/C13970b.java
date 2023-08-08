package com.carrefour.fid.android.basket.domain.models.extension;

import com.carrefour.fid.android.domain.models.service.models.FacilityServiceId;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.basket.domain.models.extension.b */
public final class C13970b {
    @C12579k
    /* renamed from: a */
    public static final String m59184a(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "$this$updateForBasketAPI");
        return FacilityServiceId.m157958b(new Regex("-(294|308|309|310)-").mo23336m(str, "-150-"));
    }
}
