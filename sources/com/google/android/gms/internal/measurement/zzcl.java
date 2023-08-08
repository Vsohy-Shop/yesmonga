package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "InitializationParamsCreator")
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C42084n1();
    @SafeParcelable.C40814c(mo134489id = 1)

    /* renamed from: a */
    public final long f106680a;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public final long f106681b;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: c */
    public final boolean f106682c;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: d */
    public final String f106683d;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: e */
    public final String f106684e;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: f */
    public final String f106685f;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: g */
    public final Bundle f106686g;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: v */
    public final String f106687v;

    @SafeParcelable.C40813b
    public zzcl(@SafeParcelable.C40816e(mo134492id = 1) long j, @SafeParcelable.C40816e(mo134492id = 2) long j2, @SafeParcelable.C40816e(mo134492id = 3) boolean z, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) String str3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) Bundle bundle, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) String str4) {
        this.f106680a = j;
        this.f106681b = j2;
        this.f106682c = z;
        this.f106683d = str;
        this.f106684e = str2;
        this.f106685f = str3;
        this.f106686g = bundle;
        this.f106687v = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166094K(parcel, 1, this.f106680a);
        C40820a.m166094K(parcel, 2, this.f106681b);
        C40820a.m166122g(parcel, 3, this.f106682c);
        C40820a.m166108Y(parcel, 4, this.f106683d, false);
        C40820a.m166108Y(parcel, 5, this.f106684e, false);
        C40820a.m166108Y(parcel, 6, this.f106685f, false);
        C40820a.m166129k(parcel, 7, this.f106686g, false);
        C40820a.m166108Y(parcel, 8, this.f106687v, false);
        C40820a.m166112b(parcel, a);
    }
}
