package com.carrefour.fid.android.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.constant.C28547h2;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u0011\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3SlotInfo;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "slotDateBegin", "slotDateEnd", "slotId", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getSlotDateBegin", "()Ljava/lang/String;", "getSlotDateEnd", "getSlotId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3SlotInfo implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrderV3SlotInfo> CREATOR = new C36414a();
    @C33608c("slot_date_begin")
    @C12579k
    private final String slotDateBegin;
    @C33608c("slot_date_end")
    @C12579k
    private final String slotDateEnd;
    @C33608c("slot_id")
    @C12579k
    private final String slotId;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3SlotInfo$a */
    public static final class C36414a implements Parcelable.Creator<OrderV3SlotInfo> {
        @C12579k
        /* renamed from: a */
        public final OrderV3SlotInfo createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderV3SlotInfo(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3SlotInfo[] newArray(int i) {
            return new OrderV3SlotInfo[i];
        }
    }

    public OrderV3SlotInfo(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "slotDateBegin");
        Intrinsics.checkNotNullParameter(str2, "slotDateEnd");
        Intrinsics.checkNotNullParameter(str3, C28547h2.f69319g);
        this.slotDateBegin = str;
        this.slotDateEnd = str2;
        this.slotId = str3;
    }

    public static /* synthetic */ OrderV3SlotInfo copy$default(OrderV3SlotInfo orderV3SlotInfo, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderV3SlotInfo.slotDateBegin;
        }
        if ((i & 2) != 0) {
            str2 = orderV3SlotInfo.slotDateEnd;
        }
        if ((i & 4) != 0) {
            str3 = orderV3SlotInfo.slotId;
        }
        return orderV3SlotInfo.copy(str, str2, str3);
    }

    @C12579k
    public final String component1() {
        return this.slotDateBegin;
    }

    @C12579k
    public final String component2() {
        return this.slotDateEnd;
    }

    @C12579k
    public final String component3() {
        return this.slotId;
    }

    @C12579k
    public final OrderV3SlotInfo copy(@C12579k String str, @C12579k String str2, @C12579k String str3) {
        Intrinsics.checkNotNullParameter(str, "slotDateBegin");
        Intrinsics.checkNotNullParameter(str2, "slotDateEnd");
        Intrinsics.checkNotNullParameter(str3, C28547h2.f69319g);
        return new OrderV3SlotInfo(str, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3SlotInfo)) {
            return false;
        }
        OrderV3SlotInfo orderV3SlotInfo = (OrderV3SlotInfo) obj;
        return Intrinsics.areEqual((Object) this.slotDateBegin, (Object) orderV3SlotInfo.slotDateBegin) && Intrinsics.areEqual((Object) this.slotDateEnd, (Object) orderV3SlotInfo.slotDateEnd) && Intrinsics.areEqual((Object) this.slotId, (Object) orderV3SlotInfo.slotId);
    }

    @C12579k
    public final String getSlotDateBegin() {
        return this.slotDateBegin;
    }

    @C12579k
    public final String getSlotDateEnd() {
        return this.slotDateEnd;
    }

    @C12579k
    public final String getSlotId() {
        return this.slotId;
    }

    public int hashCode() {
        return (((this.slotDateBegin.hashCode() * 31) + this.slotDateEnd.hashCode()) * 31) + this.slotId.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.slotDateBegin;
        String str2 = this.slotDateEnd;
        String str3 = this.slotId;
        return "OrderV3SlotInfo(slotDateBegin=" + str + ", slotDateEnd=" + str2 + ", slotId=" + str3 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.slotDateBegin);
        parcel.writeString(this.slotDateEnd);
        parcel.writeString(this.slotId);
    }
}
