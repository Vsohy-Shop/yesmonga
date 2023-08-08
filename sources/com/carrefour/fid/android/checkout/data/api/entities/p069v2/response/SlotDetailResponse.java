package com.carrefour.fid.android.checkout.data.api.entities.p069v2.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b;\u0010<J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\t\u0010!\u001a\u00020\u0002HÖ\u0001J\t\u0010\"\u001a\u00020\u0011HÖ\u0001J\u0013\u0010%\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010&\u001a\u00020\u0011HÖ\u0001J\u0019\u0010+\u001a\u00020*2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020\u0011HÖ\u0001R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b-\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b/\u0010.R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0016\u0010,\u001a\u0004\b0\u0010.R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0017\u0010,\u001a\u0004\b1\u0010.R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b2\u0010.R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\f\n\u0004\b\u0019\u00103\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001a\u0010,\u001a\u0004\b4\u0010.R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001b\u0010,\u001a\u0004\b5\u0010.R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\r8\u0006X\u0004¢\u0006\f\n\u0004\b\u001c\u00106\u001a\u0004\b7\u0010\u000fR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u001d\u0010,\u001a\u0004\b8\u0010.R\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00118\u0006X\u0004¢\u0006\f\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010\u0013¨\u0006="}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotDetailResponse;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "component4", "component5", "", "component6", "()Ljava/lang/Boolean;", "component7", "component8", "", "component9", "()Ljava/lang/Double;", "component10", "", "component11", "()Ljava/lang/Integer;", "id", "maximalCapacity", "capacityUsed", "dateBegin", "dateEnd", "isAvailable", "status", "slice", "totalPrice", "tokenPrice", "greenSlot", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;)Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotDetailResponse;", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getMaximalCapacity", "getCapacityUsed", "getDateBegin", "getDateEnd", "Ljava/lang/Boolean;", "getStatus", "getSlice", "Ljava/lang/Double;", "getTotalPrice", "getTokenPrice", "Ljava/lang/Integer;", "getGreenSlot", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;)V", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
/* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.response.SlotDetailResponse */
public final class SlotDetailResponse implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<SlotDetailResponse> CREATOR = new C39833a();
    @C33608c("capacity_used")
    @C12580l
    private final String capacityUsed;
    @C33608c("date_begin")
    @C12580l
    private final String dateBegin;
    @C33608c("date_end")
    @C12580l
    private final String dateEnd;
    @C33608c("green_slot")
    @C12580l
    private final Integer greenSlot;
    @C33608c("id")
    @C12580l

    /* renamed from: id */
    private final String f101601id;
    @C33608c("is_available")
    @C12580l
    private final Boolean isAvailable;
    @C33608c("maximal_capacity")
    @C12580l
    private final String maximalCapacity;
    @C33608c("slice")
    @C12580l
    private final String slice;
    @C33608c("status")
    @C12580l
    private final String status;
    @C33608c("token_price")
    @C12580l
    private final String tokenPrice;
    @C33608c("total_price")
    @C12580l
    private final Double totalPrice;

    /* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.response.SlotDetailResponse$a */
    public static final class C39833a implements Parcelable.Creator<SlotDetailResponse> {
        @C12579k
        /* renamed from: a */
        public final SlotDetailResponse createFromParcel(@C12579k Parcel parcel) {
            Boolean bool;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            if (parcel.readInt() == 0) {
                bool = null;
            } else {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SlotDetailResponse(readString, readString2, readString3, readString4, readString5, bool, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()), parcel.readString(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @C12579k
        /* renamed from: b */
        public final SlotDetailResponse[] newArray(int i) {
            return new SlotDetailResponse[i];
        }
    }

    public SlotDetailResponse() {
        this((String) null, (String) null, (String) null, (String) null, (String) null, (Boolean) null, (String) null, (String) null, (Double) null, (String) null, (Integer) null, 2047, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SlotDetailResponse copy$default(SlotDetailResponse slotDetailResponse, String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7, Double d, String str8, Integer num, int i, Object obj) {
        SlotDetailResponse slotDetailResponse2 = slotDetailResponse;
        int i2 = i;
        return slotDetailResponse.copy((i2 & 1) != 0 ? slotDetailResponse2.f101601id : str, (i2 & 2) != 0 ? slotDetailResponse2.maximalCapacity : str2, (i2 & 4) != 0 ? slotDetailResponse2.capacityUsed : str3, (i2 & 8) != 0 ? slotDetailResponse2.dateBegin : str4, (i2 & 16) != 0 ? slotDetailResponse2.dateEnd : str5, (i2 & 32) != 0 ? slotDetailResponse2.isAvailable : bool, (i2 & 64) != 0 ? slotDetailResponse2.status : str6, (i2 & 128) != 0 ? slotDetailResponse2.slice : str7, (i2 & 256) != 0 ? slotDetailResponse2.totalPrice : d, (i2 & 512) != 0 ? slotDetailResponse2.tokenPrice : str8, (i2 & 1024) != 0 ? slotDetailResponse2.greenSlot : num);
    }

    @C12580l
    public final String component1() {
        return this.f101601id;
    }

    @C12580l
    public final String component10() {
        return this.tokenPrice;
    }

    @C12580l
    public final Integer component11() {
        return this.greenSlot;
    }

    @C12580l
    public final String component2() {
        return this.maximalCapacity;
    }

    @C12580l
    public final String component3() {
        return this.capacityUsed;
    }

    @C12580l
    public final String component4() {
        return this.dateBegin;
    }

    @C12580l
    public final String component5() {
        return this.dateEnd;
    }

    @C12580l
    public final Boolean component6() {
        return this.isAvailable;
    }

    @C12580l
    public final String component7() {
        return this.status;
    }

    @C12580l
    public final String component8() {
        return this.slice;
    }

    @C12580l
    public final Double component9() {
        return this.totalPrice;
    }

    @C12579k
    public final SlotDetailResponse copy(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l Boolean bool, @C12580l String str6, @C12580l String str7, @C12580l Double d, @C12580l String str8, @C12580l Integer num) {
        return new SlotDetailResponse(str, str2, str3, str4, str5, bool, str6, str7, d, str8, num);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotDetailResponse)) {
            return false;
        }
        SlotDetailResponse slotDetailResponse = (SlotDetailResponse) obj;
        return Intrinsics.areEqual((Object) this.f101601id, (Object) slotDetailResponse.f101601id) && Intrinsics.areEqual((Object) this.maximalCapacity, (Object) slotDetailResponse.maximalCapacity) && Intrinsics.areEqual((Object) this.capacityUsed, (Object) slotDetailResponse.capacityUsed) && Intrinsics.areEqual((Object) this.dateBegin, (Object) slotDetailResponse.dateBegin) && Intrinsics.areEqual((Object) this.dateEnd, (Object) slotDetailResponse.dateEnd) && Intrinsics.areEqual((Object) this.isAvailable, (Object) slotDetailResponse.isAvailable) && Intrinsics.areEqual((Object) this.status, (Object) slotDetailResponse.status) && Intrinsics.areEqual((Object) this.slice, (Object) slotDetailResponse.slice) && Intrinsics.areEqual((Object) this.totalPrice, (Object) slotDetailResponse.totalPrice) && Intrinsics.areEqual((Object) this.tokenPrice, (Object) slotDetailResponse.tokenPrice) && Intrinsics.areEqual((Object) this.greenSlot, (Object) slotDetailResponse.greenSlot);
    }

    @C12580l
    public final String getCapacityUsed() {
        return this.capacityUsed;
    }

    @C12580l
    public final String getDateBegin() {
        return this.dateBegin;
    }

    @C12580l
    public final String getDateEnd() {
        return this.dateEnd;
    }

    @C12580l
    public final Integer getGreenSlot() {
        return this.greenSlot;
    }

    @C12580l
    public final String getId() {
        return this.f101601id;
    }

    @C12580l
    public final String getMaximalCapacity() {
        return this.maximalCapacity;
    }

    @C12580l
    public final String getSlice() {
        return this.slice;
    }

    @C12580l
    public final String getStatus() {
        return this.status;
    }

    @C12580l
    public final String getTokenPrice() {
        return this.tokenPrice;
    }

    @C12580l
    public final Double getTotalPrice() {
        return this.totalPrice;
    }

    public int hashCode() {
        String str = this.f101601id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.maximalCapacity;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.capacityUsed;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.dateBegin;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dateEnd;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.isAvailable;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str6 = this.status;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.slice;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Double d = this.totalPrice;
        int hashCode9 = (hashCode8 + (d == null ? 0 : d.hashCode())) * 31;
        String str8 = this.tokenPrice;
        int hashCode10 = (hashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Integer num = this.greenSlot;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode10 + i;
    }

    @C12580l
    public final Boolean isAvailable() {
        return this.isAvailable;
    }

    @C12579k
    public String toString() {
        String str = this.f101601id;
        String str2 = this.maximalCapacity;
        String str3 = this.capacityUsed;
        String str4 = this.dateBegin;
        String str5 = this.dateEnd;
        Boolean bool = this.isAvailable;
        String str6 = this.status;
        String str7 = this.slice;
        Double d = this.totalPrice;
        String str8 = this.tokenPrice;
        Integer num = this.greenSlot;
        return "SlotDetailResponse(id=" + str + ", maximalCapacity=" + str2 + ", capacityUsed=" + str3 + ", dateBegin=" + str4 + ", dateEnd=" + str5 + ", isAvailable=" + bool + ", status=" + str6 + ", slice=" + str7 + ", totalPrice=" + d + ", tokenPrice=" + str8 + ", greenSlot=" + num + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f101601id);
        parcel.writeString(this.maximalCapacity);
        parcel.writeString(this.capacityUsed);
        parcel.writeString(this.dateBegin);
        parcel.writeString(this.dateEnd);
        Boolean bool = this.isAvailable;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        }
        parcel.writeString(this.status);
        parcel.writeString(this.slice);
        Double d = this.totalPrice;
        if (d == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        }
        parcel.writeString(this.tokenPrice);
        Integer num = this.greenSlot;
        if (num == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(num.intValue());
    }

    public SlotDetailResponse(@C12580l String str, @C12580l String str2, @C12580l String str3, @C12580l String str4, @C12580l String str5, @C12580l Boolean bool, @C12580l String str6, @C12580l String str7, @C12580l Double d, @C12580l String str8, @C12580l Integer num) {
        this.f101601id = str;
        this.maximalCapacity = str2;
        this.capacityUsed = str3;
        this.dateBegin = str4;
        this.dateEnd = str5;
        this.isAvailable = bool;
        this.status = str6;
        this.slice = str7;
        this.totalPrice = d;
        this.tokenPrice = str8;
        this.greenSlot = num;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ SlotDetailResponse(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.Boolean r18, java.lang.String r19, java.lang.String r20, java.lang.Double r21, java.lang.String r22, java.lang.Integer r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r13
        L_0x000a:
            r3 = r0 & 2
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0011
        L_0x0010:
            r3 = r14
        L_0x0011:
            r4 = r0 & 4
            if (r4 == 0) goto L_0x0017
            r4 = r2
            goto L_0x0018
        L_0x0017:
            r4 = r15
        L_0x0018:
            r5 = r0 & 8
            if (r5 == 0) goto L_0x001e
            r5 = r2
            goto L_0x0020
        L_0x001e:
            r5 = r16
        L_0x0020:
            r6 = r0 & 16
            if (r6 == 0) goto L_0x0026
            r6 = r2
            goto L_0x0028
        L_0x0026:
            r6 = r17
        L_0x0028:
            r7 = r0 & 32
            if (r7 == 0) goto L_0x002e
            r7 = r2
            goto L_0x0030
        L_0x002e:
            r7 = r18
        L_0x0030:
            r8 = r0 & 64
            if (r8 == 0) goto L_0x0036
            r8 = r2
            goto L_0x0038
        L_0x0036:
            r8 = r19
        L_0x0038:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L_0x003e
            r9 = r2
            goto L_0x0040
        L_0x003e:
            r9 = r20
        L_0x0040:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L_0x0046
            r10 = r2
            goto L_0x0048
        L_0x0046:
            r10 = r21
        L_0x0048:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x004e
            r11 = r2
            goto L_0x0050
        L_0x004e:
            r11 = r22
        L_0x0050:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0055
            goto L_0x0057
        L_0x0055:
            r2 = r23
        L_0x0057:
            r13 = r12
            r14 = r1
            r15 = r3
            r16 = r4
            r17 = r5
            r18 = r6
            r19 = r7
            r20 = r8
            r21 = r9
            r22 = r10
            r23 = r11
            r24 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.data.api.entities.p069v2.response.SlotDetailResponse.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.Boolean, java.lang.String, java.lang.String, java.lang.Double, java.lang.String, java.lang.Integer, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
