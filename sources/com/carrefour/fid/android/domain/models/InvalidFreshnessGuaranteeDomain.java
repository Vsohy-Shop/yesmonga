package com.carrefour.fid.android.domain.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C11076d0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.C12187d;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0004\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003HÖ\u0001¨\u0006\f"}, mo22516d2 = {"Lcom/carrefour/fid/android/domain/models/InvalidFreshnessGuaranteeDomain;", "Lcom/carrefour/fid/android/domain/models/FreshnessGuaranteeDomain;", "Landroid/os/Parcelable;", "", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/d2;", "writeToParcel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
@C12187d
public final class InvalidFreshnessGuaranteeDomain extends FreshnessGuaranteeDomain implements Parcelable {
    @C12579k
    public static final Parcelable.Creator<InvalidFreshnessGuaranteeDomain> CREATOR = new C37912a();
    @C12579k

    /* renamed from: b */
    public static final InvalidFreshnessGuaranteeDomain f95166b = new InvalidFreshnessGuaranteeDomain();

    /* renamed from: c */
    public static final int f95167c = 0;

    /* renamed from: com.carrefour.fid.android.domain.models.InvalidFreshnessGuaranteeDomain$a */
    public static final class C37912a implements Parcelable.Creator<InvalidFreshnessGuaranteeDomain> {
        @C12579k
        /* renamed from: a */
        public final InvalidFreshnessGuaranteeDomain createFromParcel(@C12579k Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return InvalidFreshnessGuaranteeDomain.f95166b;
        }

        @C12579k
        /* renamed from: b */
        public final InvalidFreshnessGuaranteeDomain[] newArray(int i) {
            return new InvalidFreshnessGuaranteeDomain[i];
        }
    }

    public InvalidFreshnessGuaranteeDomain() {
        super((DefaultConstructorMarker) null);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(@C12579k Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(1);
    }
}
