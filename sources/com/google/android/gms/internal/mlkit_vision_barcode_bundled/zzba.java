package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "BarcodeParcelCreator")
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzba> CREATOR = new C39018q();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getCalendarEventParcel", mo134489id = 13)

    /* renamed from: X */
    public final zzaq f99056X;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getContactInfoParcel", mo134489id = 14)

    /* renamed from: Y */
    public final zzar f99057Y;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getDriverLicenseParcel", mo134489id = 15)

    /* renamed from: Z */
    public final zzas f99058Z;
    @SafeParcelable.C40814c(getter = "getFormat", mo134489id = 1)

    /* renamed from: a */
    public final int f99059a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getDisplayValue", mo134489id = 2)

    /* renamed from: b */
    public final String f99060b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getRawValue", mo134489id = 3)

    /* renamed from: c */
    public final String f99061c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getRawBytes", mo134489id = 4)

    /* renamed from: d */
    public final byte[] f99062d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getCornerPoints", mo134489id = 5)

    /* renamed from: e */
    public final Point[] f99063e;
    @SafeParcelable.C40814c(getter = "getValueType", mo134489id = 6)

    /* renamed from: f */
    public final int f99064f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getEmailParcel", mo134489id = 7)

    /* renamed from: g */
    public final zzat f99065g;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPhoneParcel", mo134489id = 8)

    /* renamed from: v */
    public final zzaw f99066v;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSmsParcel", mo134489id = 9)

    /* renamed from: w */
    public final zzax f99067w;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getWiFiParcel", mo134489id = 10)

    /* renamed from: x */
    public final zzaz f99068x;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getUrlBookmarkParcel", mo134489id = 11)

    /* renamed from: y */
    public final zzay f99069y;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getGeoPointParcel", mo134489id = 12)

    /* renamed from: z */
    public final zzau f99070z;

    @SafeParcelable.C40813b
    public zzba(@SafeParcelable.C40816e(mo134492id = 1) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) byte[] bArr, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) Point[] pointArr, @SafeParcelable.C40816e(mo134492id = 6) int i2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) zzat zzat, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) zzaw zzaw, @C0363p0 @SafeParcelable.C40816e(mo134492id = 9) zzax zzax, @C0363p0 @SafeParcelable.C40816e(mo134492id = 10) zzaz zzaz, @C0363p0 @SafeParcelable.C40816e(mo134492id = 11) zzay zzay, @C0363p0 @SafeParcelable.C40816e(mo134492id = 12) zzau zzau, @C0363p0 @SafeParcelable.C40816e(mo134492id = 13) zzaq zzaq, @C0363p0 @SafeParcelable.C40816e(mo134492id = 14) zzar zzar, @C0363p0 @SafeParcelable.C40816e(mo134492id = 15) zzas zzas) {
        this.f99059a = i;
        this.f99060b = str;
        this.f99061c = str2;
        this.f99062d = bArr;
        this.f99063e = pointArr;
        this.f99064f = i2;
        this.f99065g = zzat;
        this.f99066v = zzaw;
        this.f99067w = zzax;
        this.f99068x = zzaz;
        this.f99069y = zzay;
        this.f99070z = zzau;
        this.f99056X = zzaq;
        this.f99057Y = zzar;
        this.f99058Z = zzas;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f99059a);
        C40820a.m166108Y(parcel, 2, this.f99060b, false);
        C40820a.m166108Y(parcel, 3, this.f99061c, false);
        C40820a.m166131m(parcel, 4, this.f99062d, false);
        C40820a.m166115c0(parcel, 5, this.f99063e, i, false);
        C40820a.m166089F(parcel, 6, this.f99064f);
        C40820a.m166102S(parcel, 7, this.f99065g, i, false);
        C40820a.m166102S(parcel, 8, this.f99066v, i, false);
        C40820a.m166102S(parcel, 9, this.f99067w, i, false);
        C40820a.m166102S(parcel, 10, this.f99068x, i, false);
        C40820a.m166102S(parcel, 11, this.f99069y, i, false);
        C40820a.m166102S(parcel, 12, this.f99070z, i, false);
        C40820a.m166102S(parcel, 13, this.f99056X, i, false);
        C40820a.m166102S(parcel, 14, this.f99057Y, i, false);
        C40820a.m166102S(parcel, 15, this.f99058Z, i, false);
        C40820a.m166112b(parcel, a);
    }
}
