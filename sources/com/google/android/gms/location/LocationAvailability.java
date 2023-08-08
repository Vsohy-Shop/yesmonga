package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Arrays;

@SafeParcelable.C40812a(creator = "LocationAvailabilityCreator")
@SafeParcelable.C40818g({1000})
public final class LocationAvailability extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new C30404z0();
    @Deprecated
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", mo134489id = 1)

    /* renamed from: a */
    public int f72706a;
    @Deprecated
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationAvailability.STATUS_UNKNOWN", mo134489id = 2)

    /* renamed from: b */
    public int f72707b;
    @SafeParcelable.C40814c(defaultValueUnchecked = "0", mo134489id = 3)

    /* renamed from: c */
    public long f72708c;
    @SafeParcelable.C40814c(defaultValueUnchecked = "LocationAvailability.STATUS_UNSUCCESSFUL", mo134489id = 4)

    /* renamed from: d */
    public int f72709d;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: e */
    public zzbo[] f72710e;

    @SafeParcelable.C40813b
    public LocationAvailability(@SafeParcelable.C40816e(mo134492id = 4) int i, @SafeParcelable.C40816e(mo134492id = 1) int i2, @SafeParcelable.C40816e(mo134492id = 2) int i3, @SafeParcelable.C40816e(mo134492id = 3) long j, @SafeParcelable.C40816e(mo134492id = 5) zzbo[] zzboArr) {
        this.f72709d = i;
        this.f72706a = i2;
        this.f72707b = i3;
        this.f72708c = j;
        this.f72710e = zzboArr;
    }

    @RecentlyNonNull
    /* renamed from: M */
    public static LocationAvailability m122052M(@RecentlyNonNull Intent intent) {
        if (!m122053Q(intent)) {
            return null;
        }
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return (LocationAvailability) extras.getParcelable("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
            }
            return null;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* renamed from: Q */
    public static boolean m122053Q(@RecentlyNonNull Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.gms.location.EXTRA_LOCATION_AVAILABILITY");
    }

    /* renamed from: W */
    public boolean mo85566W() {
        return this.f72709d < 1000;
    }

    public boolean equals(@RecentlyNonNull Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            if (this.f72706a == locationAvailability.f72706a && this.f72707b == locationAvailability.f72707b && this.f72708c == locationAvailability.f72708c && this.f72709d == locationAvailability.f72709d && Arrays.equals(this.f72710e, locationAvailability.f72710e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f72709d), Integer.valueOf(this.f72706a), Integer.valueOf(this.f72707b), Long.valueOf(this.f72708c), this.f72710e);
    }

    @RecentlyNonNull
    public String toString() {
        boolean W = mo85566W();
        StringBuilder sb = new StringBuilder(48);
        sb.append("LocationAvailability[isLocationAvailable: ");
        sb.append(W);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f72706a);
        C40820a.m166089F(parcel, 2, this.f72707b);
        C40820a.m166094K(parcel, 3, this.f72708c);
        C40820a.m166089F(parcel, 4, this.f72709d);
        C40820a.m166115c0(parcel, 5, this.f72710e, i, false);
        C40820a.m166112b(parcel, a);
    }
}
