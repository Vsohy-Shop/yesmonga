package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zav;

@SafeParcelable.C40812a(creator = "SignInResponseCreator")
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C30989i();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f74237a;
    @SafeParcelable.C40814c(getter = "getConnectionResult", mo134489id = 2)

    /* renamed from: b */
    public final ConnectionResult f74238b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getResolveAccountResponse", mo134489id = 3)

    /* renamed from: c */
    public final zav f74239c;

    @SafeParcelable.C40813b
    public zak(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) ConnectionResult connectionResult, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) zav zav) {
        this.f74237a = i;
        this.f74238b = connectionResult;
        this.f74239c = zav;
    }

    /* renamed from: M */
    public final ConnectionResult mo87677M() {
        return this.f74238b;
    }

    @C0363p0
    /* renamed from: Q */
    public final zav mo87678Q() {
        return this.f74239c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f74237a);
        C40820a.m166102S(parcel, 2, this.f74238b, i, false);
        C40820a.m166102S(parcel, 3, this.f74239c, i, false);
        C40820a.m166112b(parcel, a);
    }
}
