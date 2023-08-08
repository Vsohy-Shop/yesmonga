package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zat;

@SafeParcelable.C40812a(creator = "SignInRequestCreator")
public final class zai extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zai> CREATOR = new C30988h();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f74235a;
    @SafeParcelable.C40814c(getter = "getResolveAccountRequest", mo134489id = 2)

    /* renamed from: b */
    public final zat f74236b;

    @SafeParcelable.C40813b
    public zai(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) zat zat) {
        this.f74235a = i;
        this.f74236b = zat;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f74235a);
        C40820a.m166102S(parcel, 2, this.f74236b, i, false);
        C40820a.m166112b(parcel, a);
    }
}
