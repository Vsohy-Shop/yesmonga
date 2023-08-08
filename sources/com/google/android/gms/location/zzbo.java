package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C40858y
@SafeParcelable.C40812a(creator = "NetworkLocationStatusCreator")
public final class zzbo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbo> CREATOR = new C30348i1();
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", mo134489id = 1)

    /* renamed from: a */
    public final int f72876a;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", mo134489id = 2)

    /* renamed from: b */
    public final int f72877b;
    @SafeParcelable.C40814c(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", mo134489id = 3)

    /* renamed from: c */
    public final long f72878c;
    @SafeParcelable.C40814c(defaultValueUnchecked = "NetworkLocationStatus.STATUS_INVALID_TIMESTAMP", mo134489id = 4)

    /* renamed from: d */
    public final long f72879d;

    @SafeParcelable.C40813b
    public zzbo(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) long j, @SafeParcelable.C40816e(mo134492id = 4) long j2) {
        this.f72876a = i;
        this.f72877b = i2;
        this.f72878c = j;
        this.f72879d = j2;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj instanceof zzbo) {
            zzbo zzbo = (zzbo) obj;
            if (this.f72876a == zzbo.f72876a && this.f72877b == zzbo.f72877b && this.f72878c == zzbo.f72878c && this.f72879d == zzbo.f72879d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f72877b), Integer.valueOf(this.f72876a), Long.valueOf(this.f72879d), Long.valueOf(this.f72878c));
    }

    public final String toString() {
        return "NetworkLocationStatus:" + " Wifi status: " + this.f72876a + " Cell status: " + this.f72877b + " elapsed time NS: " + this.f72879d + " system time ms: " + this.f72878c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f72876a);
        C40820a.m166089F(parcel, 2, this.f72877b);
        C40820a.m166094K(parcel, 3, this.f72878c);
        C40820a.m166094K(parcel, 4, this.f72879d);
        C40820a.m166112b(parcel, a);
    }
}
