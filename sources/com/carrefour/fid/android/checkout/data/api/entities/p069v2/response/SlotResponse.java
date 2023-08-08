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

@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003J\t\u0010\u000e\u001a\u00020\bHÖ\u0001J\u0019\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\bHÖ\u0001R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotResponse;", "Landroid/os/Parcelable;", "Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotDetailResponse;", "component1", "slotDetail", "copy", "", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotDetailResponse;", "getSlotDetail", "()Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotDetailResponse;", "<init>", "(Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotDetailResponse;)V", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
/* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.response.SlotResponse */
public final class SlotResponse implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<SlotResponse> CREATOR = new C39836a();
    @C33608c("slot")
    @C12580l
    private final SlotDetailResponse slotDetail;

    /* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.response.SlotResponse$a */
    public static final class C39836a implements Parcelable.Creator<SlotResponse> {
        @C12579k
        /* renamed from: a */
        public final SlotResponse createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotResponse(parcel.readInt() == 0 ? null : SlotDetailResponse.CREATOR.createFromParcel(parcel));
        }

        @C12579k
        /* renamed from: b */
        public final SlotResponse[] newArray(int i) {
            return new SlotResponse[i];
        }
    }

    public SlotResponse() {
        this((SlotDetailResponse) null, 1, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SlotResponse copy$default(SlotResponse slotResponse, SlotDetailResponse slotDetailResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            slotDetailResponse = slotResponse.slotDetail;
        }
        return slotResponse.copy(slotDetailResponse);
    }

    @C12580l
    public final SlotDetailResponse component1() {
        return this.slotDetail;
    }

    @C12579k
    public final SlotResponse copy(@C12580l SlotDetailResponse slotDetailResponse) {
        return new SlotResponse(slotDetailResponse);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SlotResponse) && Intrinsics.areEqual((Object) this.slotDetail, (Object) ((SlotResponse) obj).slotDetail);
    }

    @C12580l
    public final SlotDetailResponse getSlotDetail() {
        return this.slotDetail;
    }

    public int hashCode() {
        SlotDetailResponse slotDetailResponse = this.slotDetail;
        if (slotDetailResponse == null) {
            return 0;
        }
        return slotDetailResponse.hashCode();
    }

    @C12579k
    public String toString() {
        SlotDetailResponse slotDetailResponse = this.slotDetail;
        return "SlotResponse(slotDetail=" + slotDetailResponse + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        SlotDetailResponse slotDetailResponse = this.slotDetail;
        if (slotDetailResponse == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        slotDetailResponse.writeToParcel(parcel, i);
    }

    public SlotResponse(@C12580l SlotDetailResponse slotDetailResponse) {
        this.slotDetail = slotDetailResponse;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotResponse(SlotDetailResponse slotDetailResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : slotDetailResponse);
    }
}
