package com.carrefour.fid.android.domain.models.delivery;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.domain.models.delivery.c */
public final class C38018c {
    /* renamed from: a */
    public static final boolean m156719a(@C12579k C38017b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        if (bVar.mo117633a() == DeliveryCode.PRE || bVar.mo117633a() == DeliveryCode.PRC) {
            return true;
        }
        return false;
    }
}
