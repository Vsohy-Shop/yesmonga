package com.carrefour.fid.android.data.entities;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.C8567o;
import com.google.gson.annotations.C33608c;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@Keep
@C11076d0(mo22515d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J;\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0010HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0010HÖ\u0001R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\t\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010\f\u001a\u00020\u00068\u0006X\u0004¢\u0006\f\n\u0004\b\f\u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b$\u0010\u001e¨\u0006'"}, mo22516d2 = {"Lcom/carrefour/fid/android/data/entities/OrderV3ConsumerInfo;", "Landroid/os/Parcelable;", "", "component1", "component2", "component3", "", "component4", "component5", "contactNumber", "email", "firstName", "id", "lastName", "copy", "toString", "", "hashCode", "", "other", "", "equals", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "Ljava/lang/String;", "getContactNumber", "()Ljava/lang/String;", "getEmail", "getFirstName", "J", "getId", "()J", "getLastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class OrderV3ConsumerInfo implements Parcelable {
    public static final int $stable = 0;
    @C12579k
    public static final Parcelable.Creator<OrderV3ConsumerInfo> CREATOR = new C36406a();
    @C33608c("contact_number")
    @C12579k
    private final String contactNumber;
    @C33608c("email")
    @C12579k
    private final String email;
    @C33608c("first_name")
    @C12579k
    private final String firstName;
    @C33608c("id")

    /* renamed from: id */
    private final long f90059id;
    @C33608c("last_name")
    @C12579k
    private final String lastName;

    /* renamed from: com.carrefour.fid.android.data.entities.OrderV3ConsumerInfo$a */
    public static final class C36406a implements Parcelable.Creator<OrderV3ConsumerInfo> {
        @C12579k
        /* renamed from: a */
        public final OrderV3ConsumerInfo createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OrderV3ConsumerInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readString());
        }

        @C12579k
        /* renamed from: b */
        public final OrderV3ConsumerInfo[] newArray(int i) {
            return new OrderV3ConsumerInfo[i];
        }
    }

    public OrderV3ConsumerInfo(@C12579k String str, @C12579k String str2, @C12579k String str3, long j, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "contactNumber");
        Intrinsics.checkNotNullParameter(str2, "email");
        Intrinsics.checkNotNullParameter(str3, "firstName");
        Intrinsics.checkNotNullParameter(str4, "lastName");
        this.contactNumber = str;
        this.email = str2;
        this.firstName = str3;
        this.f90059id = j;
        this.lastName = str4;
    }

    public static /* synthetic */ OrderV3ConsumerInfo copy$default(OrderV3ConsumerInfo orderV3ConsumerInfo, String str, String str2, String str3, long j, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = orderV3ConsumerInfo.contactNumber;
        }
        if ((i & 2) != 0) {
            str2 = orderV3ConsumerInfo.email;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = orderV3ConsumerInfo.firstName;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            j = orderV3ConsumerInfo.f90059id;
        }
        long j2 = j;
        if ((i & 16) != 0) {
            str4 = orderV3ConsumerInfo.lastName;
        }
        return orderV3ConsumerInfo.copy(str, str5, str6, j2, str4);
    }

    @C12579k
    public final String component1() {
        return this.contactNumber;
    }

    @C12579k
    public final String component2() {
        return this.email;
    }

    @C12579k
    public final String component3() {
        return this.firstName;
    }

    public final long component4() {
        return this.f90059id;
    }

    @C12579k
    public final String component5() {
        return this.lastName;
    }

    @C12579k
    public final OrderV3ConsumerInfo copy(@C12579k String str, @C12579k String str2, @C12579k String str3, long j, @C12579k String str4) {
        Intrinsics.checkNotNullParameter(str, "contactNumber");
        Intrinsics.checkNotNullParameter(str2, "email");
        Intrinsics.checkNotNullParameter(str3, "firstName");
        Intrinsics.checkNotNullParameter(str4, "lastName");
        return new OrderV3ConsumerInfo(str, str2, str3, j, str4);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OrderV3ConsumerInfo)) {
            return false;
        }
        OrderV3ConsumerInfo orderV3ConsumerInfo = (OrderV3ConsumerInfo) obj;
        return Intrinsics.areEqual((Object) this.contactNumber, (Object) orderV3ConsumerInfo.contactNumber) && Intrinsics.areEqual((Object) this.email, (Object) orderV3ConsumerInfo.email) && Intrinsics.areEqual((Object) this.firstName, (Object) orderV3ConsumerInfo.firstName) && this.f90059id == orderV3ConsumerInfo.f90059id && Intrinsics.areEqual((Object) this.lastName, (Object) orderV3ConsumerInfo.lastName);
    }

    @C12579k
    public final String getContactNumber() {
        return this.contactNumber;
    }

    @C12579k
    public final String getEmail() {
        return this.email;
    }

    @C12579k
    public final String getFirstName() {
        return this.firstName;
    }

    public final long getId() {
        return this.f90059id;
    }

    @C12579k
    public final String getLastName() {
        return this.lastName;
    }

    public int hashCode() {
        return (((((((this.contactNumber.hashCode() * 31) + this.email.hashCode()) * 31) + this.firstName.hashCode()) * 31) + Long.hashCode(this.f90059id)) * 31) + this.lastName.hashCode();
    }

    @C12579k
    public String toString() {
        String str = this.contactNumber;
        String str2 = this.email;
        String str3 = this.firstName;
        long j = this.f90059id;
        String str4 = this.lastName;
        return "OrderV3ConsumerInfo(contactNumber=" + str + ", email=" + str2 + ", firstName=" + str3 + ", id=" + j + ", lastName=" + str4 + ")";
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.contactNumber);
        parcel.writeString(this.email);
        parcel.writeString(this.firstName);
        parcel.writeLong(this.f90059id);
        parcel.writeString(this.lastName);
    }
}
