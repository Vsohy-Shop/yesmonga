package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "LineBoxParcelCreator")
@SafeParcelable.C40818g({1})
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C30164oa();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final zzr[] f72621a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final zzf f72622b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final zzf f72623c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public final zzf f72624d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public final String f72625e;
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: f */
    public final float f72626f;
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: g */
    public final String f72627g;
    @SafeParcelable.C40814c(mo134489id = 9)

    /* renamed from: v */
    public final int f72628v;
    @SafeParcelable.C40814c(mo134489id = 10)

    /* renamed from: w */
    public final boolean f72629w;
    @SafeParcelable.C40814c(mo134489id = 11)

    /* renamed from: x */
    public final int f72630x;
    @SafeParcelable.C40814c(mo134489id = 12)

    /* renamed from: y */
    public final int f72631y;

    @SafeParcelable.C40813b
    public zzl(@SafeParcelable.C40816e(mo134492id = 2) zzr[] zzrArr, @SafeParcelable.C40816e(mo134492id = 3) zzf zzf, @SafeParcelable.C40816e(mo134492id = 4) zzf zzf2, @SafeParcelable.C40816e(mo134492id = 5) zzf zzf3, @SafeParcelable.C40816e(mo134492id = 6) String str, @SafeParcelable.C40816e(mo134492id = 7) float f, @SafeParcelable.C40816e(mo134492id = 8) String str2, @SafeParcelable.C40816e(mo134492id = 9) int i, @SafeParcelable.C40816e(mo134492id = 10) boolean z, @SafeParcelable.C40816e(mo134492id = 11) int i2, @SafeParcelable.C40816e(mo134492id = 12) int i3) {
        this.f72621a = zzrArr;
        this.f72622b = zzf;
        this.f72623c = zzf2;
        this.f72624d = zzf3;
        this.f72625e = str;
        this.f72626f = f;
        this.f72627g = str2;
        this.f72628v = i;
        this.f72629w = z;
        this.f72630x = i2;
        this.f72631y = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166115c0(parcel, 2, this.f72621a, i, false);
        C40820a.m166102S(parcel, 3, this.f72622b, i, false);
        C40820a.m166102S(parcel, 4, this.f72623c, i, false);
        C40820a.m166102S(parcel, 5, this.f72624d, i, false);
        C40820a.m166108Y(parcel, 6, this.f72625e, false);
        C40820a.m166141w(parcel, 7, this.f72626f);
        C40820a.m166108Y(parcel, 8, this.f72627g, false);
        C40820a.m166089F(parcel, 9, this.f72628v);
        C40820a.m166122g(parcel, 10, this.f72629w);
        C40820a.m166089F(parcel, 11, this.f72630x);
        C40820a.m166089F(parcel, 12, this.f72631y);
        C40820a.m166112b(parcel, a);
    }
}
