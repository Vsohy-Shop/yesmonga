package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.C40812a(creator = "AppMetadataCreator")
@SafeParcelable.C40818g({1, 17, 20})
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C30966za();
    @SafeParcelable.C40814c(mo134489id = 18)

    /* renamed from: E0 */
    public final boolean f74174E0;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 19)

    /* renamed from: F0 */
    public final String f74175F0;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 21)

    /* renamed from: G0 */
    public final Boolean f74176G0;
    @SafeParcelable.C40814c(mo134489id = 22)

    /* renamed from: H0 */
    public final long f74177H0;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 23)

    /* renamed from: I0 */
    public final List f74178I0;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 24)

    /* renamed from: J0 */
    public final String f74179J0;
    @SafeParcelable.C40814c(defaultValue = "", mo134489id = 25)

    /* renamed from: K0 */
    public final String f74180K0;
    @SafeParcelable.C40814c(defaultValue = "", mo134489id = 26)

    /* renamed from: L0 */
    public final String f74181L0;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 27)

    /* renamed from: M0 */
    public final String f74182M0;
    @SafeParcelable.C40814c(defaultValue = "false", mo134489id = 28)

    /* renamed from: N0 */
    public final boolean f74183N0;
    @SafeParcelable.C40814c(mo134489id = 29)

    /* renamed from: O0 */
    public final long f74184O0;
    @SafeParcelable.C40814c(mo134489id = 14)

    /* renamed from: X */
    public final long f74185X;
    @SafeParcelable.C40814c(mo134489id = 15)

    /* renamed from: Y */
    public final int f74186Y;
    @SafeParcelable.C40814c(defaultValue = "true", mo134489id = 16)

    /* renamed from: Z */
    public final boolean f74187Z;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final String f74188a;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final String f74189b;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final String f74190c;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public final String f74191d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public final long f74192e;
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: f */
    public final long f74193f;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: g */
    public final String f74194g;
    @SafeParcelable.C40814c(defaultValue = "true", mo134489id = 9)

    /* renamed from: v */
    public final boolean f74195v;
    @SafeParcelable.C40814c(mo134489id = 10)

    /* renamed from: w */
    public final boolean f74196w;
    @SafeParcelable.C40814c(defaultValueUnchecked = "Integer.MIN_VALUE", mo134489id = 11)

    /* renamed from: x */
    public final long f74197x;
    @C0363p0
    @SafeParcelable.C40814c(mo134489id = 12)

    /* renamed from: y */
    public final String f74198y;
    @Deprecated
    @SafeParcelable.C40814c(mo134489id = 13)

    /* renamed from: z */
    public final long f74199z;

    public zzq(@C0363p0 String str, @C0363p0 String str2, @C0363p0 String str3, long j, @C0363p0 String str4, long j2, long j3, @C0363p0 String str5, boolean z, boolean z2, @C0363p0 String str6, long j4, long j5, int i, boolean z3, boolean z4, @C0363p0 String str7, @C0363p0 Boolean bool, long j6, @C0363p0 List list, @C0363p0 String str8, String str9, String str10, @C0363p0 String str11, boolean z5, long j7) {
        C40843u.m166198h(str);
        this.f74188a = str;
        this.f74189b = true == TextUtils.isEmpty(str2) ? null : str2;
        this.f74190c = str3;
        this.f74197x = j;
        this.f74191d = str4;
        this.f74192e = j2;
        this.f74193f = j3;
        this.f74194g = str5;
        this.f74195v = z;
        this.f74196w = z2;
        this.f74198y = str6;
        this.f74199z = 0;
        this.f74185X = j5;
        this.f74186Y = i;
        this.f74187Z = z3;
        this.f74174E0 = z4;
        this.f74175F0 = str7;
        this.f74176G0 = bool;
        this.f74177H0 = j6;
        this.f74178I0 = list;
        this.f74179J0 = null;
        this.f74180K0 = str9;
        this.f74181L0 = str10;
        this.f74182M0 = str11;
        this.f74183N0 = z5;
        this.f74184O0 = j7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, this.f74188a, false);
        C40820a.m166108Y(parcel, 3, this.f74189b, false);
        C40820a.m166108Y(parcel, 4, this.f74190c, false);
        C40820a.m166108Y(parcel, 5, this.f74191d, false);
        C40820a.m166094K(parcel, 6, this.f74192e);
        C40820a.m166094K(parcel, 7, this.f74193f);
        C40820a.m166108Y(parcel, 8, this.f74194g, false);
        C40820a.m166122g(parcel, 9, this.f74195v);
        C40820a.m166122g(parcel, 10, this.f74196w);
        C40820a.m166094K(parcel, 11, this.f74197x);
        C40820a.m166108Y(parcel, 12, this.f74198y, false);
        C40820a.m166094K(parcel, 13, this.f74199z);
        C40820a.m166094K(parcel, 14, this.f74185X);
        C40820a.m166089F(parcel, 15, this.f74186Y);
        C40820a.m166122g(parcel, 16, this.f74187Z);
        C40820a.m166122g(parcel, 18, this.f74174E0);
        C40820a.m166108Y(parcel, 19, this.f74175F0, false);
        C40820a.m166128j(parcel, 21, this.f74176G0, false);
        C40820a.m166094K(parcel, 22, this.f74177H0);
        C40820a.m166111a0(parcel, 23, this.f74178I0, false);
        C40820a.m166108Y(parcel, 24, this.f74179J0, false);
        C40820a.m166108Y(parcel, 25, this.f74180K0, false);
        C40820a.m166108Y(parcel, 26, this.f74181L0, false);
        C40820a.m166108Y(parcel, 27, this.f74182M0, false);
        C40820a.m166122g(parcel, 28, this.f74183N0);
        C40820a.m166094K(parcel, 29, this.f74184O0);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzq(@C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) String str4, @SafeParcelable.C40816e(mo134492id = 6) long j, @SafeParcelable.C40816e(mo134492id = 7) long j2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) String str5, @SafeParcelable.C40816e(mo134492id = 9) boolean z, @SafeParcelable.C40816e(mo134492id = 10) boolean z2, @SafeParcelable.C40816e(mo134492id = 11) long j3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 12) String str6, @SafeParcelable.C40816e(mo134492id = 13) long j4, @SafeParcelable.C40816e(mo134492id = 14) long j5, @SafeParcelable.C40816e(mo134492id = 15) int i, @SafeParcelable.C40816e(mo134492id = 16) boolean z3, @SafeParcelable.C40816e(mo134492id = 18) boolean z4, @C0363p0 @SafeParcelable.C40816e(mo134492id = 19) String str7, @C0363p0 @SafeParcelable.C40816e(mo134492id = 21) Boolean bool, @SafeParcelable.C40816e(mo134492id = 22) long j6, @C0363p0 @SafeParcelable.C40816e(mo134492id = 23) List list, @C0363p0 @SafeParcelable.C40816e(mo134492id = 24) String str8, @SafeParcelable.C40816e(mo134492id = 25) String str9, @SafeParcelable.C40816e(mo134492id = 26) String str10, @SafeParcelable.C40816e(mo134492id = 27) String str11, @SafeParcelable.C40816e(mo134492id = 28) boolean z5, @SafeParcelable.C40816e(mo134492id = 29) long j7) {
        this.f74188a = str;
        this.f74189b = str2;
        this.f74190c = str3;
        this.f74197x = j3;
        this.f74191d = str4;
        this.f74192e = j;
        this.f74193f = j2;
        this.f74194g = str5;
        this.f74195v = z;
        this.f74196w = z2;
        this.f74198y = str6;
        this.f74199z = j4;
        this.f74185X = j5;
        this.f74186Y = i;
        this.f74187Z = z3;
        this.f74174E0 = z4;
        this.f74175F0 = str7;
        this.f74176G0 = bool;
        this.f74177H0 = j6;
        this.f74178I0 = list;
        this.f74179J0 = str8;
        this.f74180K0 = str9;
        this.f74181L0 = str10;
        this.f74182M0 = str11;
        this.f74183N0 = z5;
        this.f74184O0 = j7;
    }
}
