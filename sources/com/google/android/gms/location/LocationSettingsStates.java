package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.C40821b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "LocationSettingsStatesCreator")
@SafeParcelable.C40818g({1000})
public final class LocationSettingsStates extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationSettingsStates> CREATOR = new C30344h1();
    @SafeParcelable.C40814c(getter = "isGpsUsable", mo134489id = 1)

    /* renamed from: a */
    public final boolean f72735a;
    @SafeParcelable.C40814c(getter = "isNetworkLocationUsable", mo134489id = 2)

    /* renamed from: b */
    public final boolean f72736b;
    @SafeParcelable.C40814c(getter = "isBleUsable", mo134489id = 3)

    /* renamed from: c */
    public final boolean f72737c;
    @SafeParcelable.C40814c(getter = "isGpsPresent", mo134489id = 4)

    /* renamed from: d */
    public final boolean f72738d;
    @SafeParcelable.C40814c(getter = "isNetworkLocationPresent", mo134489id = 5)

    /* renamed from: e */
    public final boolean f72739e;
    @SafeParcelable.C40814c(getter = "isBlePresent", mo134489id = 6)

    /* renamed from: f */
    public final boolean f72740f;

    @SafeParcelable.C40813b
    public LocationSettingsStates(@SafeParcelable.C40816e(mo134492id = 1) boolean z, @SafeParcelable.C40816e(mo134492id = 2) boolean z2, @SafeParcelable.C40816e(mo134492id = 3) boolean z3, @SafeParcelable.C40816e(mo134492id = 4) boolean z4, @SafeParcelable.C40816e(mo134492id = 5) boolean z5, @SafeParcelable.C40816e(mo134492id = 6) boolean z6) {
        this.f72735a = z;
        this.f72736b = z2;
        this.f72737c = z3;
        this.f72738d = z4;
        this.f72739e = z5;
        this.f72740f = z6;
    }

    @RecentlyNullable
    /* renamed from: M */
    public static LocationSettingsStates m122086M(@RecentlyNonNull Intent intent) {
        return (LocationSettingsStates) C40821b.m166146b(intent, "com.google.android.gms.location.LOCATION_SETTINGS_STATES", CREATOR);
    }

    /* renamed from: Q */
    public boolean mo85608Q() {
        return this.f72740f;
    }

    /* renamed from: W */
    public boolean mo85609W() {
        return this.f72737c;
    }

    /* renamed from: X */
    public boolean mo85610X() {
        return this.f72738d;
    }

    /* renamed from: e0 */
    public boolean mo85611e0() {
        return this.f72735a;
    }

    /* renamed from: f0 */
    public boolean mo85612f0() {
        return this.f72738d || this.f72739e;
    }

    /* renamed from: n0 */
    public boolean mo85613n0() {
        return this.f72735a || this.f72736b;
    }

    /* renamed from: p0 */
    public boolean mo85614p0() {
        return this.f72739e;
    }

    /* renamed from: t0 */
    public boolean mo85615t0() {
        return this.f72736b;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166122g(parcel, 1, mo85611e0());
        C40820a.m166122g(parcel, 2, mo85615t0());
        C40820a.m166122g(parcel, 3, mo85609W());
        C40820a.m166122g(parcel, 4, mo85610X());
        C40820a.m166122g(parcel, 5, mo85614p0());
        C40820a.m166122g(parcel, 6, mo85608Q());
        C40820a.m166112b(parcel, a);
    }
}
