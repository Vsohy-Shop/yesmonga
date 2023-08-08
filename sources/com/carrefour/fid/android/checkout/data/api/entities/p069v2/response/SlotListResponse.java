package com.carrefour.fid.android.checkout.data.api.entities.p069v2.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.google.gson.annotations.C33608c;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b#\u0010$J\u0011\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b \u0010\u0007R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\n¨\u0006%"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotListResponse;", "Landroid/os/Parcelable;", "", "Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotDetailResponse;", "component1", "", "component2", "()Ljava/lang/Integer;", "", "component3", "()Ljava/lang/Boolean;", "slotList", "count", "productThresholdExceeded", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;)Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotListResponse;", "", "toString", "hashCode", "", "other", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/util/List;", "getSlotList", "()Ljava/util/List;", "Ljava/lang/Integer;", "getCount", "Ljava/lang/Boolean;", "getProductThresholdExceeded", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Boolean;)V", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@Keep
@C12187d
/* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.response.SlotListResponse */
public final class SlotListResponse implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<SlotListResponse> CREATOR = new C39835a();
    @C33608c("count")
    @C12580l
    private final Integer count;
    @C33608c("product_threshold_exceeded")
    @C12580l
    private final Boolean productThresholdExceeded;
    @C33608c("data")
    @C12580l
    private final List<SlotDetailResponse> slotList;

    /* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.response.SlotListResponse$a */
    public static final class C39835a implements Parcelable.Creator<SlotListResponse> {
        @C12579k
        /* renamed from: a */
        public final SlotListResponse createFromParcel(@C12579k Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = false;
            Boolean bool = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(SlotDetailResponse.CREATOR.createFromParcel(parcel));
                }
            }
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                if (parcel.readInt() != 0) {
                    z = true;
                }
                bool = Boolean.valueOf(z);
            }
            return new SlotListResponse(arrayList, valueOf, bool);
        }

        @C12579k
        /* renamed from: b */
        public final SlotListResponse[] newArray(int i) {
            return new SlotListResponse[i];
        }
    }

    public SlotListResponse() {
        this((List) null, (Integer) null, (Boolean) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SlotListResponse copy$default(SlotListResponse slotListResponse, List<SlotDetailResponse> list, Integer num, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            list = slotListResponse.slotList;
        }
        if ((i & 2) != 0) {
            num = slotListResponse.count;
        }
        if ((i & 4) != 0) {
            bool = slotListResponse.productThresholdExceeded;
        }
        return slotListResponse.copy(list, num, bool);
    }

    @C12580l
    public final List<SlotDetailResponse> component1() {
        return this.slotList;
    }

    @C12580l
    public final Integer component2() {
        return this.count;
    }

    @C12580l
    public final Boolean component3() {
        return this.productThresholdExceeded;
    }

    @C12579k
    public final SlotListResponse copy(@C12580l List<SlotDetailResponse> list, @C12580l Integer num, @C12580l Boolean bool) {
        return new SlotListResponse(list, num, bool);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotListResponse)) {
            return false;
        }
        SlotListResponse slotListResponse = (SlotListResponse) obj;
        return Intrinsics.areEqual((Object) this.slotList, (Object) slotListResponse.slotList) && Intrinsics.areEqual((Object) this.count, (Object) slotListResponse.count) && Intrinsics.areEqual((Object) this.productThresholdExceeded, (Object) slotListResponse.productThresholdExceeded);
    }

    @C12580l
    public final Integer getCount() {
        return this.count;
    }

    @C12580l
    public final Boolean getProductThresholdExceeded() {
        return this.productThresholdExceeded;
    }

    @C12580l
    public final List<SlotDetailResponse> getSlotList() {
        return this.slotList;
    }

    public int hashCode() {
        List<SlotDetailResponse> list = this.slotList;
        int i = 0;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.count;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.productThresholdExceeded;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        List<SlotDetailResponse> list = this.slotList;
        Integer num = this.count;
        Boolean bool = this.productThresholdExceeded;
        return "SlotListResponse(slotList=" + list + ", count=" + num + ", productThresholdExceeded=" + bool + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<SlotDetailResponse> list = this.slotList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (SlotDetailResponse writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Boolean bool = this.productThresholdExceeded;
        if (bool == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public SlotListResponse(@C12580l List<SlotDetailResponse> list, @C12580l Integer num, @C12580l Boolean bool) {
        this.slotList = list;
        this.count = num;
        this.productThresholdExceeded = bool;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotListResponse(List list, Integer num, Boolean bool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : bool);
    }
}
