package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "WordBoxParcelCreator")
@SafeParcelable.C40818g({1})
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new C30224ta();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final zzn[] f72654a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final zzf f72655b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final zzf f72656c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public final String f72657d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public final float f72658e;
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: f */
    public final String f72659f;
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: g */
    public final boolean f72660g;

    @SafeParcelable.C40813b
    public zzr(@SafeParcelable.C40816e(mo134492id = 2) zzn[] zznArr, @SafeParcelable.C40816e(mo134492id = 3) zzf zzf, @SafeParcelable.C40816e(mo134492id = 4) zzf zzf2, @SafeParcelable.C40816e(mo134492id = 5) String str, @SafeParcelable.C40816e(mo134492id = 6) float f, @SafeParcelable.C40816e(mo134492id = 7) String str2, @SafeParcelable.C40816e(mo134492id = 8) boolean z) {
        this.f72654a = zznArr;
        this.f72655b = zzf;
        this.f72656c = zzf2;
        this.f72657d = str;
        this.f72658e = f;
        this.f72659f = str2;
        this.f72660g = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166115c0(parcel, 2, this.f72654a, i, false);
        C40820a.m166102S(parcel, 3, this.f72655b, i, false);
        C40820a.m166102S(parcel, 4, this.f72656c, i, false);
        C40820a.m166108Y(parcel, 5, this.f72657d, false);
        C40820a.m166141w(parcel, 6, this.f72658e);
        C40820a.m166108Y(parcel, 7, this.f72659f, false);
        C40820a.m166122g(parcel, 8, this.f72660g);
        C40820a.m166112b(parcel, a);
    }
}
