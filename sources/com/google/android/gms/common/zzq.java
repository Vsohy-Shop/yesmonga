package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

@SafeParcelable.C40812a(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C40920p0();
    @SafeParcelable.C40814c(getter = "getResult", mo134489id = 1)

    /* renamed from: a */
    public final boolean f104282a;
    @Nullable
    @SafeParcelable.C40814c(getter = "getErrorMessage", mo134489id = 2)

    /* renamed from: b */
    public final String f104283b;
    @SafeParcelable.C40814c(getter = "getStatusValue", mo134489id = 3)

    /* renamed from: c */
    public final int f104284c;
    @SafeParcelable.C40814c(getter = "getFirstPartyStatusValue", mo134489id = 4)

    /* renamed from: d */
    public final int f104285d;

    @SafeParcelable.C40813b
    public zzq(@SafeParcelable.C40816e(mo134492id = 1) boolean z, @SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) int i, @SafeParcelable.C40816e(mo134492id = 4) int i2) {
        this.f104282a = z;
        this.f104283b = str;
        this.f104284c = C41002v0.m166699a(i) - 1;
        this.f104285d = C40689d0.m165559a(i2) - 1;
    }

    @Nullable
    /* renamed from: M */
    public final String mo134789M() {
        return this.f104283b;
    }

    /* renamed from: Q */
    public final boolean mo134790Q() {
        return this.f104282a;
    }

    /* renamed from: W */
    public final int mo134791W() {
        return C40689d0.m165559a(this.f104285d);
    }

    /* renamed from: X */
    public final int mo134792X() {
        return C41002v0.m166699a(this.f104284c);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166122g(parcel, 1, this.f104282a);
        C40820a.m166108Y(parcel, 2, this.f104283b, false);
        C40820a.m166089F(parcel, 3, this.f104284c);
        C40820a.m166089F(parcel, 4, this.f104285d);
        C40820a.m166112b(parcel, a);
    }
}
