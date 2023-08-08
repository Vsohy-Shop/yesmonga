package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ConnectionInfoCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C40857x1();
    @SafeParcelable.C40814c(mo134489id = 1)

    /* renamed from: a */
    public Bundle f103981a;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public Feature[] f103982b;
    @SafeParcelable.C40814c(defaultValue = "0", mo134489id = 3)

    /* renamed from: c */
    public int f103983c;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: d */
    public ConnectionTelemetryConfiguration f103984d;

    @SafeParcelable.C40813b
    public zzj(@SafeParcelable.C40816e(mo134492id = 1) Bundle bundle, @SafeParcelable.C40816e(mo134492id = 2) Feature[] featureArr, @SafeParcelable.C40816e(mo134492id = 3) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f103981a = bundle;
        this.f103982b = featureArr;
        this.f103983c = i;
        this.f103984d = connectionTelemetryConfiguration;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166129k(parcel, 1, this.f103981a, false);
        C40820a.m166115c0(parcel, 2, this.f103982b, i, false);
        C40820a.m166089F(parcel, 3, this.f103983c);
        C40820a.m166102S(parcel, 4, this.f103984d, i, false);
        C40820a.m166112b(parcel, a);
    }

    public zzj() {
    }
}
