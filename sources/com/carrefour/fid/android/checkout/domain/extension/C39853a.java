package com.carrefour.fid.android.checkout.domain.extension;

import com.carrefour.fid.android.SlotItem;
import com.carrefour.fid.android.domain.models.slot.Slot;
import com.carrefour.fid.android.domain.models.slot.SlotId;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.carrefour.fid.android.checkout.domain.extension.a */
public final class C39853a {
    @C12579k
    /* renamed from: a */
    public static final Slot m162472a(@C12579k SlotItem slotItem) {
        Intrinsics.checkNotNullParameter(slotItem, "<this>");
        String id = slotItem.getId();
        Intrinsics.checkNotNullExpressionValue(id, "this.id");
        String b = SlotId.m158308b(id);
        String str = new String();
        String str2 = new String();
        String startDate = slotItem.getStartDate();
        Intrinsics.checkNotNullExpressionValue(startDate, "this.startDate");
        String endDate = slotItem.getEndDate();
        Intrinsics.checkNotNullExpressionValue(endDate, "this.endDate");
        Boolean valueOf = Boolean.valueOf(slotItem.getIsAvailable());
        String status = slotItem.getStatus();
        Intrinsics.checkNotNullExpressionValue(status, "this.status");
        String slice = slotItem.getSlice();
        Intrinsics.checkNotNullExpressionValue(slice, "this.slice");
        return new Slot(b, str, str2, startDate, endDate, valueOf, status, slice, Double.valueOf(slotItem.getYieldFeePrice()), slotItem.getYieldFeeToken(), slotItem.getIsGreenSlot(), (DefaultConstructorMarker) null);
    }

    @C12579k
    /* renamed from: b */
    public static final SlotItem m162473b(@C12579k Slot slot) {
        double d;
        Intrinsics.checkNotNullParameter(slot, "<this>");
        SlotItem.C13129b j0 = SlotItem.newBuilder().mo30884d0(slot.mo119508t()).mo30890l0(slot.mo119504p()).mo30882b0(slot.mo119505q()).mo30892o0(slot.mo119510u()).mo30886h0(Intrinsics.areEqual((Object) slot.mo119514x(), (Object) Boolean.TRUE)).mo30888j0(slot.mo119507s());
        Double w = slot.mo119512w();
        if (w != null) {
            d = w.doubleValue();
        } else {
            d = 0.0d;
        }
        SlotItem.C13129b r0 = j0.mo30894r0(d);
        String v = slot.mo119511v();
        if (v == null) {
            v = "";
        }
        GeneratedMessageLite B = r0.mo30895s0(v).mo30887i0(slot.mo119515y()).mo100473g();
        Intrinsics.checkNotNullExpressionValue(B, "builder.build()");
        return (SlotItem) B;
    }
}
