package com.carrefour.fid.android.checkout.data.api.entities.p069v2.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import java.util.Date;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001f\u0010 J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0003J-\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u0012\u001a\u00020\fHÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\fHÖ\u0001R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001e\u0010\u001d¨\u0006!"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/data/api/entities/v2/response/SlotExpressResponse;", "Landroid/os/Parcelable;", "", "component1", "Ljava/util/Date;", "component2", "component3", "id", "dateBegin", "dateEnd", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Ljava/util/Date;", "getDateBegin", "()Ljava/util/Date;", "getDateEnd", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
/* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.response.SlotExpressResponse */
public final class SlotExpressResponse implements Parcelable {
    public static final int $stable = 8;
    @C12579k
    public static final Parcelable.Creator<SlotExpressResponse> CREATOR = new C39834a();
    @C33608c("date_begin")
    @C12580l
    private final Date dateBegin;
    @C33608c("date_end")
    @C12580l
    private final Date dateEnd;
    @C33608c("id")
    @C12580l

    /* renamed from: id */
    private final String f101602id;

    /* renamed from: com.carrefour.fid.android.checkout.data.api.entities.v2.response.SlotExpressResponse$a */
    public static final class C39834a implements Parcelable.Creator<SlotExpressResponse> {
        @C12579k
        /* renamed from: a */
        public final SlotExpressResponse createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SlotExpressResponse(parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        @C12579k
        /* renamed from: b */
        public final SlotExpressResponse[] newArray(int i) {
            return new SlotExpressResponse[i];
        }
    }

    public SlotExpressResponse() {
        this((String) null, (Date) null, (Date) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SlotExpressResponse copy$default(SlotExpressResponse slotExpressResponse, String str, Date date, Date date2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = slotExpressResponse.f101602id;
        }
        if ((i & 2) != 0) {
            date = slotExpressResponse.dateBegin;
        }
        if ((i & 4) != 0) {
            date2 = slotExpressResponse.dateEnd;
        }
        return slotExpressResponse.copy(str, date, date2);
    }

    @C12580l
    public final String component1() {
        return this.f101602id;
    }

    @C12580l
    public final Date component2() {
        return this.dateBegin;
    }

    @C12580l
    public final Date component3() {
        return this.dateEnd;
    }

    @C12579k
    public final SlotExpressResponse copy(@C12580l String str, @C12580l Date date, @C12580l Date date2) {
        return new SlotExpressResponse(str, date, date2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SlotExpressResponse)) {
            return false;
        }
        SlotExpressResponse slotExpressResponse = (SlotExpressResponse) obj;
        return Intrinsics.areEqual((Object) this.f101602id, (Object) slotExpressResponse.f101602id) && Intrinsics.areEqual((Object) this.dateBegin, (Object) slotExpressResponse.dateBegin) && Intrinsics.areEqual((Object) this.dateEnd, (Object) slotExpressResponse.dateEnd);
    }

    @C12580l
    public final Date getDateBegin() {
        return this.dateBegin;
    }

    @C12580l
    public final Date getDateEnd() {
        return this.dateEnd;
    }

    @C12580l
    public final String getId() {
        return this.f101602id;
    }

    public int hashCode() {
        String str = this.f101602id;
        int i = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Date date = this.dateBegin;
        int hashCode2 = (hashCode + (date == null ? 0 : date.hashCode())) * 31;
        Date date2 = this.dateEnd;
        if (date2 != null) {
            i = date2.hashCode();
        }
        return hashCode2 + i;
    }

    @C12579k
    public String toString() {
        String str = this.f101602id;
        Date date = this.dateBegin;
        Date date2 = this.dateEnd;
        return "SlotExpressResponse(id=" + str + ", dateBegin=" + date + ", dateEnd=" + date2 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f101602id);
        parcel.writeSerializable(this.dateBegin);
        parcel.writeSerializable(this.dateEnd);
    }

    public SlotExpressResponse(@C12580l String str, @C12580l Date date, @C12580l Date date2) {
        this.f101602id = str;
        this.dateBegin = date;
        this.dateEnd = date2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SlotExpressResponse(String str, Date date, Date date2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : date, (i & 4) != 0 ? null : date2);
    }
}
