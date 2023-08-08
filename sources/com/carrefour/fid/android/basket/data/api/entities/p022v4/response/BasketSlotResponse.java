package com.carrefour.fid.android.basket.data.api.entities.p022v4.response;

import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003JJ\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\u0002\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, mo22516d2 = {"Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketSlotResponse;", "", "isSlotBooked", "", "slotDateBegin", "", "slotDateEnd", "slotId", "slotSliceId", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSlotDateBegin", "()Ljava/lang/String;", "getSlotDateEnd", "getSlotId", "getSlotSliceId", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/carrefour/fid/android/basket/data/api/entities/v4/response/BasketSlotResponse;", "equals", "other", "hashCode", "", "toString", "basket_release"}, mo22517k = 1, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@Keep
/* renamed from: com.carrefour.fid.android.basket.data.api.entities.v4.response.BasketSlotResponse */
public final class BasketSlotResponse {
    @C33608c("is_slot_booked")
    @C12580l
    private final Boolean isSlotBooked;
    @C33608c("slot_date_begin")
    @C12580l
    private final String slotDateBegin;
    @C33608c("slot_date_end")
    @C12580l
    private final String slotDateEnd;
    @C33608c("slot_id")
    @C12580l
    private final String slotId;
    @C33608c("slot_slice_id")
    @C12580l
    private final String slotSliceId;

    public BasketSlotResponse() {
        this((Boolean) null, (String) null, (String) null, (String) null, (String) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ BasketSlotResponse copy$default(BasketSlotResponse basketSlotResponse, Boolean bool, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = basketSlotResponse.isSlotBooked;
        }
        if ((i & 2) != 0) {
            str = basketSlotResponse.slotDateBegin;
        }
        String str5 = str;
        if ((i & 4) != 0) {
            str2 = basketSlotResponse.slotDateEnd;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = basketSlotResponse.slotId;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = basketSlotResponse.slotSliceId;
        }
        return basketSlotResponse.copy(bool, str5, str6, str7, str4);
    }

    @C12580l
    public final Boolean component1() {
        return this.isSlotBooked;
    }

    @C12580l
    public final String component2() {
        return this.slotDateBegin;
    }

    @C12580l
    public final String component3() {
        return this.slotDateEnd;
    }

    @C12580l
    public final String component4() {
        return this.slotId;
    }

    @C12580l
    public final String component5() {
        return this.slotSliceId;
    }

    @C12579k
    public final BasketSlotResponse copy(@C12580l Boolean bool, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        return new BasketSlotResponse(bool, str, str2, str3, str4);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BasketSlotResponse)) {
            return false;
        }
        BasketSlotResponse basketSlotResponse = (BasketSlotResponse) obj;
        return Intrinsics.areEqual((Object) this.isSlotBooked, (Object) basketSlotResponse.isSlotBooked) && Intrinsics.areEqual((Object) this.slotDateBegin, (Object) basketSlotResponse.slotDateBegin) && Intrinsics.areEqual((Object) this.slotDateEnd, (Object) basketSlotResponse.slotDateEnd) && Intrinsics.areEqual((Object) this.slotId, (Object) basketSlotResponse.slotId) && Intrinsics.areEqual((Object) this.slotSliceId, (Object) basketSlotResponse.slotSliceId);
    }

    @C12580l
    public final String getSlotDateBegin() {
        return this.slotDateBegin;
    }

    @C12580l
    public final String getSlotDateEnd() {
        return this.slotDateEnd;
    }

    @C12580l
    public final String getSlotId() {
        return this.slotId;
    }

    @C12580l
    public final String getSlotSliceId() {
        return this.slotSliceId;
    }

    public int hashCode() {
        Boolean bool = this.isSlotBooked;
        int i = 0;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.slotDateBegin;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.slotDateEnd;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.slotId;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.slotSliceId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    @C12580l
    public final Boolean isSlotBooked() {
        return this.isSlotBooked;
    }

    @C12579k
    public String toString() {
        Boolean bool = this.isSlotBooked;
        String str = this.slotDateBegin;
        String str2 = this.slotDateEnd;
        String str3 = this.slotId;
        String str4 = this.slotSliceId;
        return "BasketSlotResponse(isSlotBooked=" + bool + ", slotDateBegin=" + str + ", slotDateEnd=" + str2 + ", slotId=" + str3 + ", slotSliceId=" + str4 + ")";
    }

    public BasketSlotResponse(@C12580l Boolean bool, @C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4) {
        this.isSlotBooked = bool;
        this.slotDateBegin = str;
        this.slotDateEnd = str2;
        this.slotId = str3;
        this.slotSliceId = str4;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BasketSlotResponse(java.lang.Boolean r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r4 = this;
            r11 = r10 & 1
            r0 = 0
            if (r11 == 0) goto L_0x0007
            r11 = r0
            goto L_0x0008
        L_0x0007:
            r11 = r5
        L_0x0008:
            r5 = r10 & 2
            if (r5 == 0) goto L_0x000e
            r1 = r0
            goto L_0x000f
        L_0x000e:
            r1 = r6
        L_0x000f:
            r5 = r10 & 4
            if (r5 == 0) goto L_0x0015
            r2 = r0
            goto L_0x0016
        L_0x0015:
            r2 = r7
        L_0x0016:
            r5 = r10 & 8
            if (r5 == 0) goto L_0x001c
            r3 = r0
            goto L_0x001d
        L_0x001c:
            r3 = r8
        L_0x001d:
            r5 = r10 & 16
            if (r5 == 0) goto L_0x0023
            r10 = r0
            goto L_0x0024
        L_0x0023:
            r10 = r9
        L_0x0024:
            r5 = r4
            r6 = r11
            r7 = r1
            r8 = r2
            r9 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.basket.data.api.entities.p022v4.response.BasketSlotResponse.<init>(java.lang.Boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
