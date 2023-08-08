package com.carrefour.fid.android.checkout.data.api.datasources.extension;

import com.carrefour.fid.android.checkout.data.api.entities.p069v2.response.SlotDetailResponse;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotId;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.checkout.data.api.datasources.extension.b */
public final class C39832b {
    @C12579k
    /* renamed from: a */
    public static final Slot m162398a(@C12579k SlotDetailResponse slotDetailResponse) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        boolean z;
        Intrinsics.checkNotNullParameter(slotDetailResponse, "<this>");
        String id = slotDetailResponse.getId();
        if (id == null) {
            id = "";
        }
        String b = SlotId.m158308b(id);
        String maximalCapacity = slotDetailResponse.getMaximalCapacity();
        if (maximalCapacity == null) {
            str = "";
        } else {
            str = maximalCapacity;
        }
        String capacityUsed = slotDetailResponse.getCapacityUsed();
        if (capacityUsed == null) {
            str2 = "";
        } else {
            str2 = capacityUsed;
        }
        String dateBegin = slotDetailResponse.getDateBegin();
        if (dateBegin == null) {
            str3 = "";
        } else {
            str3 = dateBegin;
        }
        String dateEnd = slotDetailResponse.getDateEnd();
        if (dateEnd == null) {
            str4 = "";
        } else {
            str4 = dateEnd;
        }
        Boolean isAvailable = slotDetailResponse.isAvailable();
        String status = slotDetailResponse.getStatus();
        if (status == null) {
            str5 = "";
        } else {
            str5 = status;
        }
        String slice = slotDetailResponse.getSlice();
        if (slice == null) {
            str6 = "";
        } else {
            str6 = slice;
        }
        Double totalPrice = slotDetailResponse.getTotalPrice();
        String tokenPrice = slotDetailResponse.getTokenPrice();
        Integer greenSlot = slotDetailResponse.getGreenSlot();
        if (greenSlot != null && greenSlot.intValue() == 1) {
            z = true;
        } else {
            z = false;
        }
        return new Slot(b, str, str2, str3, str4, isAvailable, str5, str6, totalPrice, tokenPrice, z, (DefaultConstructorMarker) null);
    }
}
