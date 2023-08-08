package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "BarcodeParcelCreator")
public final class zzms extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzms> CREATOR = new C38752qa();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getCalendarEventParcel", mo134489id = 13)

    /* renamed from: X */
    public final zzmi f98754X;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getContactInfoParcel", mo134489id = 14)

    /* renamed from: Y */
    public final zzmj f98755Y;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getDriverLicenseParcel", mo134489id = 15)

    /* renamed from: Z */
    public final zzmk f98756Z;
    @SafeParcelable.C40814c(getter = "getFormat", mo134489id = 1)

    /* renamed from: a */
    public final int f98757a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getDisplayValue", mo134489id = 2)

    /* renamed from: b */
    public final String f98758b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getRawValue", mo134489id = 3)

    /* renamed from: c */
    public final String f98759c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getRawBytes", mo134489id = 4)

    /* renamed from: d */
    public final byte[] f98760d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getCornerPoints", mo134489id = 5)

    /* renamed from: e */
    public final Point[] f98761e;
    @SafeParcelable.C40814c(getter = "getValueType", mo134489id = 6)

    /* renamed from: f */
    public final int f98762f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getEmailParcel", mo134489id = 7)

    /* renamed from: g */
    public final zzml f98763g;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPhoneParcel", mo134489id = 8)

    /* renamed from: v */
    public final zzmo f98764v;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSmsParcel", mo134489id = 9)

    /* renamed from: w */
    public final zzmp f98765w;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getWiFiParcel", mo134489id = 10)

    /* renamed from: x */
    public final zzmr f98766x;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getUrlBookmarkParcel", mo134489id = 11)

    /* renamed from: y */
    public final zzmq f98767y;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getGeoPointParcel", mo134489id = 12)

    /* renamed from: z */
    public final zzmm f98768z;

    @SafeParcelable.C40813b
    public zzms(@SafeParcelable.C40816e(mo134492id = 1) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) byte[] bArr, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) Point[] pointArr, @SafeParcelable.C40816e(mo134492id = 6) int i2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) zzml zzml, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) zzmo zzmo, @C0363p0 @SafeParcelable.C40816e(mo134492id = 9) zzmp zzmp, @C0363p0 @SafeParcelable.C40816e(mo134492id = 10) zzmr zzmr, @C0363p0 @SafeParcelable.C40816e(mo134492id = 11) zzmq zzmq, @C0363p0 @SafeParcelable.C40816e(mo134492id = 12) zzmm zzmm, @C0363p0 @SafeParcelable.C40816e(mo134492id = 13) zzmi zzmi, @C0363p0 @SafeParcelable.C40816e(mo134492id = 14) zzmj zzmj, @C0363p0 @SafeParcelable.C40816e(mo134492id = 15) zzmk zzmk) {
        this.f98757a = i;
        this.f98758b = str;
        this.f98759c = str2;
        this.f98760d = bArr;
        this.f98761e = pointArr;
        this.f98762f = i2;
        this.f98763g = zzml;
        this.f98764v = zzmo;
        this.f98765w = zzmp;
        this.f98766x = zzmr;
        this.f98767y = zzmq;
        this.f98768z = zzmm;
        this.f98754X = zzmi;
        this.f98755Y = zzmj;
        this.f98756Z = zzmk;
    }

    @C0363p0
    /* renamed from: A0 */
    public final zzmq mo122739A0() {
        return this.f98767y;
    }

    @C0363p0
    /* renamed from: C0 */
    public final zzmr mo122740C0() {
        return this.f98766x;
    }

    @C0363p0
    /* renamed from: K0 */
    public final String mo122741K0() {
        return this.f98758b;
    }

    /* renamed from: M */
    public final int mo122742M() {
        return this.f98757a;
    }

    @C0363p0
    /* renamed from: N0 */
    public final String mo122743N0() {
        return this.f98759c;
    }

    /* renamed from: Q */
    public final int mo122744Q() {
        return this.f98762f;
    }

    @C0363p0
    /* renamed from: W */
    public final zzmi mo122745W() {
        return this.f98754X;
    }

    @C0363p0
    /* renamed from: X */
    public final zzmj mo122746X() {
        return this.f98755Y;
    }

    @C0363p0
    /* renamed from: e0 */
    public final zzmk mo122747e0() {
        return this.f98756Z;
    }

    @C0363p0
    /* renamed from: f0 */
    public final zzml mo122748f0() {
        return this.f98763g;
    }

    @C0363p0
    /* renamed from: j1 */
    public final byte[] mo122749j1() {
        return this.f98760d;
    }

    @C0363p0
    /* renamed from: k1 */
    public final Point[] mo122750k1() {
        return this.f98761e;
    }

    @C0363p0
    /* renamed from: n0 */
    public final zzmm mo122751n0() {
        return this.f98768z;
    }

    @C0363p0
    /* renamed from: p0 */
    public final zzmo mo122752p0() {
        return this.f98764v;
    }

    @C0363p0
    /* renamed from: t0 */
    public final zzmp mo122753t0() {
        return this.f98765w;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f98757a);
        C40820a.m166108Y(parcel, 2, this.f98758b, false);
        C40820a.m166108Y(parcel, 3, this.f98759c, false);
        C40820a.m166131m(parcel, 4, this.f98760d, false);
        C40820a.m166115c0(parcel, 5, this.f98761e, i, false);
        C40820a.m166089F(parcel, 6, this.f98762f);
        C40820a.m166102S(parcel, 7, this.f98763g, i, false);
        C40820a.m166102S(parcel, 8, this.f98764v, i, false);
        C40820a.m166102S(parcel, 9, this.f98765w, i, false);
        C40820a.m166102S(parcel, 10, this.f98766x, i, false);
        C40820a.m166102S(parcel, 11, this.f98767y, i, false);
        C40820a.m166102S(parcel, 12, this.f98768z, i, false);
        C40820a.m166102S(parcel, 13, this.f98754X, i, false);
        C40820a.m166102S(parcel, 14, this.f98755Y, i, false);
        C40820a.m166102S(parcel, 15, this.f98756Z, i, false);
        C40820a.m166112b(parcel, a);
    }
}
