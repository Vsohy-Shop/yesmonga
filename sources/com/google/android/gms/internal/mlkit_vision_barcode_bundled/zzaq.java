package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "CalendarEventParcelCreator")
public final class zzaq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaq> CREATOR = new C39045t();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSummary", mo134489id = 1)

    /* renamed from: a */
    public final String f99006a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getDescription", mo134489id = 2)

    /* renamed from: b */
    public final String f99007b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getLocation", mo134489id = 3)

    /* renamed from: c */
    public final String f99008c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getOrganizer", mo134489id = 4)

    /* renamed from: d */
    public final String f99009d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getStatus", mo134489id = 5)

    /* renamed from: e */
    public final String f99010e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getStart", mo134489id = 6)

    /* renamed from: f */
    public final zzap f99011f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getEnd", mo134489id = 7)

    /* renamed from: g */
    public final zzap f99012g;

    @SafeParcelable.C40813b
    public zzaq(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str4, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) String str5, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) zzap zzap, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) zzap zzap2) {
        this.f99006a = str;
        this.f99007b = str2;
        this.f99008c = str3;
        this.f99009d = str4;
        this.f99010e = str5;
        this.f99011f = zzap;
        this.f99012g = zzap2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f99006a, false);
        C40820a.m166108Y(parcel, 2, this.f99007b, false);
        C40820a.m166108Y(parcel, 3, this.f99008c, false);
        C40820a.m166108Y(parcel, 4, this.f99009d, false);
        C40820a.m166108Y(parcel, 5, this.f99010e, false);
        C40820a.m166102S(parcel, 6, this.f99011f, i, false);
        C40820a.m166102S(parcel, 7, this.f99012g, i, false);
        C40820a.m166112b(parcel, a);
    }
}
