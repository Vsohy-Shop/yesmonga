package com.carrefour.fid.android.checkout.data.api.datasources.extension;

import com.carrefour.fid.android.checkout.data.api.entities.p069v2.response.SlotExpressResponse;
import com.carrefour.fid.android.domain.models.slot.SlotExpress;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.checkout.data.api.datasources.extension.a */
public final class C39831a {
    @C12579k
    /* renamed from: a */
    public static final SlotExpress m162397a(@C12579k SlotExpressResponse slotExpressResponse) {
        Intrinsics.checkNotNullParameter(slotExpressResponse, "<this>");
        return new SlotExpress(slotExpressResponse.getId(), slotExpressResponse.getDateBegin(), slotExpressResponse.getDateEnd());
    }
}
