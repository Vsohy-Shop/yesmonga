package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ConditionalUserPropertyParcelCreator")
public final class zzac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzac> CREATOR = new C30686d();
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public String f74147a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String f74148b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public zzli f74149c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public long f74150d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public boolean f74151e;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: f */
    public String f74152f;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: g */
    public final zzaw f74153g;
    @SafeParcelable.C40814c(mo134489id = 9)

    /* renamed from: v */
    public long f74154v;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 10)

    /* renamed from: w */
    public zzaw f74155w;
    @SafeParcelable.C40814c(mo134489id = 11)

    /* renamed from: x */
    public final long f74156x;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 12)

    /* renamed from: y */
    public final zzaw f74157y;

    public zzac(zzac zzac) {
        C40843u.m166202l(zzac);
        this.f74147a = zzac.f74147a;
        this.f74148b = zzac.f74148b;
        this.f74149c = zzac.f74149c;
        this.f74150d = zzac.f74150d;
        this.f74151e = zzac.f74151e;
        this.f74152f = zzac.f74152f;
        this.f74153g = zzac.f74153g;
        this.f74154v = zzac.f74154v;
        this.f74155w = zzac.f74155w;
        this.f74156x = zzac.f74156x;
        this.f74157y = zzac.f74157y;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, this.f74147a, false);
        C40820a.m166108Y(parcel, 3, this.f74148b, false);
        C40820a.m166102S(parcel, 4, this.f74149c, i, false);
        C40820a.m166094K(parcel, 5, this.f74150d);
        C40820a.m166122g(parcel, 6, this.f74151e);
        C40820a.m166108Y(parcel, 7, this.f74152f, false);
        C40820a.m166102S(parcel, 8, this.f74153g, i, false);
        C40820a.m166094K(parcel, 9, this.f74154v);
        C40820a.m166102S(parcel, 10, this.f74155w, i, false);
        C40820a.m166094K(parcel, 11, this.f74156x);
        C40820a.m166102S(parcel, 12, this.f74157y, i, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzac(@C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) String str2, @SafeParcelable.C40816e(mo134492id = 4) zzli zzli, @SafeParcelable.C40816e(mo134492id = 5) long j, @SafeParcelable.C40816e(mo134492id = 6) boolean z, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) String str3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) zzaw zzaw, @SafeParcelable.C40816e(mo134492id = 9) long j2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 10) zzaw zzaw2, @SafeParcelable.C40816e(mo134492id = 11) long j3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 12) zzaw zzaw3) {
        this.f74147a = str;
        this.f74148b = str2;
        this.f74149c = zzli;
        this.f74150d = j;
        this.f74151e = z;
        this.f74152f = str3;
        this.f74153g = zzaw;
        this.f74154v = j2;
        this.f74155w = zzaw2;
        this.f74156x = j3;
        this.f74157y = zzaw3;
    }
}
