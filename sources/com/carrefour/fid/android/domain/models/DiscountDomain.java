package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002HÖ\u0001R\u0019\u0010\r\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/DiscountDomain;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "discountType", "", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "forcedDiscountPrice", "<init>", "(Ljava/lang/String;Ljava/lang/Double;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class DiscountDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<DiscountDomain> CREATOR = new C37910a();

    /* renamed from: c */
    public static final int f95136c = 0;
    @C12580l

    /* renamed from: a */
    public final String f95137a;
    @C12580l

    /* renamed from: b */
    public final Double f95138b;

    /* renamed from: com.carrefour.fid.android.domain.models.DiscountDomain$a */
    public static final class C37910a implements Parcelable.Creator<DiscountDomain> {
        @C12579k
        /* renamed from: a */
        public final DiscountDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DiscountDomain(parcel.readString(), parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble()));
        }

        @C12579k
        /* renamed from: b */
        public final DiscountDomain[] newArray(int i) {
            return new DiscountDomain[i];
        }
    }

    public DiscountDomain(@C12580l String str, @C12580l Double d) {
        this.f95137a = str;
        this.f95138b = d;
    }

    @C12580l
    /* renamed from: a */
    public final String mo115789a() {
        return this.f95137a;
    }

    @C12580l
    /* renamed from: b */
    public final Double mo115790b() {
        return this.f95138b;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.f95137a);
        Double d = this.f95138b;
        if (d == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeDouble(d.doubleValue());
    }
}
