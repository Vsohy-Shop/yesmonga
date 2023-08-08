package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C40785m;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ResolveAccountResponseCreator")
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C40735b1();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f103971a;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public final IBinder f103972b;
    @SafeParcelable.C40814c(getter = "getConnectionResult", mo134489id = 3)

    /* renamed from: c */
    public final ConnectionResult f103973c;
    @SafeParcelable.C40814c(getter = "getSaveDefaultAccount", mo134489id = 4)

    /* renamed from: d */
    public final boolean f103974d;
    @SafeParcelable.C40814c(getter = "isFromCrossClientAuth", mo134489id = 5)

    /* renamed from: e */
    public final boolean f103975e;

    @SafeParcelable.C40813b
    public zav(@SafeParcelable.C40816e(mo134492id = 1) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) IBinder iBinder, @SafeParcelable.C40816e(mo134492id = 3) ConnectionResult connectionResult, @SafeParcelable.C40816e(mo134492id = 4) boolean z, @SafeParcelable.C40816e(mo134492id = 5) boolean z2) {
        this.f103971a = i;
        this.f103972b = iBinder;
        this.f103973c = connectionResult;
        this.f103974d = z;
        this.f103975e = z2;
    }

    /* renamed from: M */
    public final ConnectionResult mo134521M() {
        return this.f103973c;
    }

    @C0363p0
    /* renamed from: Q */
    public final C40785m mo134522Q() {
        IBinder iBinder = this.f103972b;
        if (iBinder == null) {
            return null;
        }
        return C40785m.C40786a.m165965H0(iBinder);
    }

    /* renamed from: W */
    public final boolean mo134523W() {
        return this.f103974d;
    }

    /* renamed from: X */
    public final boolean mo134524X() {
        return this.f103975e;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zav = (zav) obj;
        if (!this.f103973c.equals(zav.f103973c) || !C40808s.m166010b(mo134522Q(), zav.mo134522Q())) {
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103971a);
        C40820a.m166085B(parcel, 2, this.f103972b, false);
        C40820a.m166102S(parcel, 3, this.f103973c, i, false);
        C40820a.m166122g(parcel, 4, this.f103974d);
        C40820a.m166122g(parcel, 5, this.f103975e);
        C40820a.m166112b(parcel, a);
    }
}
