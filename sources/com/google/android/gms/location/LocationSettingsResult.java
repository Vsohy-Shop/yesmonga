package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "LocationSettingsResultCreator")
@SafeParcelable.C40818g({1000})
public final class LocationSettingsResult extends AbstractSafeParcelable implements C40669r {
    @RecentlyNonNull
    public static final Parcelable.Creator<LocationSettingsResult> CREATOR = new C30340g1();
    @SafeParcelable.C40814c(getter = "getStatus", mo134489id = 1)

    /* renamed from: a */
    public final Status f72733a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getLocationSettingsStates", mo134489id = 2)

    /* renamed from: b */
    public final LocationSettingsStates f72734b;

    @SafeParcelable.C40813b
    public LocationSettingsResult(@RecentlyNonNull @SafeParcelable.C40816e(mo134492id = 1) Status status, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) LocationSettingsStates locationSettingsStates) {
        this.f72733a = status;
        this.f72734b = locationSettingsStates;
    }

    @RecentlyNullable
    /* renamed from: M */
    public LocationSettingsStates mo85605M() {
        return this.f72734b;
    }

    @RecentlyNonNull
    public Status getStatus() {
        return this.f72733a;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 1, getStatus(), i, false);
        C40820a.m166102S(parcel, 2, mo85605M(), i, false);
        C40820a.m166112b(parcel, a);
    }
}
