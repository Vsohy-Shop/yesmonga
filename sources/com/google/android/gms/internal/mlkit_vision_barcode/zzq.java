package com.google.android.gms.internal.mlkit_vision_barcode;

import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "BarcodeCreator")
@SafeParcelable.C40818g({1})
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C38649ib();
    @SafeParcelable.C40814c(mo134489id = 17)

    /* renamed from: E0 */
    public boolean f98782E0;
    @SafeParcelable.C40814c(mo134489id = 18)

    /* renamed from: F0 */
    public double f98783F0;
    @SafeParcelable.C40814c(mo134489id = 14)

    /* renamed from: X */
    public zzh f98784X;
    @SafeParcelable.C40814c(mo134489id = 15)

    /* renamed from: Y */
    public zzi f98785Y;
    @SafeParcelable.C40814c(mo134489id = 16)

    /* renamed from: Z */
    public byte[] f98786Z;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public int f98787a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String f98788b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public String f98789c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public int f98790d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public Point[] f98791e;
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: f */
    public zzj f98792f;
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: g */
    public zzm f98793g;
    @SafeParcelable.C40814c(mo134489id = 9)

    /* renamed from: v */
    public zzn f98794v;
    @SafeParcelable.C40814c(mo134489id = 10)

    /* renamed from: w */
    public zzp f98795w;
    @SafeParcelable.C40814c(mo134489id = 11)

    /* renamed from: x */
    public zzo f98796x;
    @SafeParcelable.C40814c(mo134489id = 12)

    /* renamed from: y */
    public zzk f98797y;
    @SafeParcelable.C40814c(mo134489id = 13)

    /* renamed from: z */
    public zzg f98798z;

    public zzq() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f98787a);
        C40820a.m166108Y(parcel, 3, this.f98788b, false);
        C40820a.m166108Y(parcel, 4, this.f98789c, false);
        C40820a.m166089F(parcel, 5, this.f98790d);
        C40820a.m166115c0(parcel, 6, this.f98791e, i, false);
        C40820a.m166102S(parcel, 7, this.f98792f, i, false);
        C40820a.m166102S(parcel, 8, this.f98793g, i, false);
        C40820a.m166102S(parcel, 9, this.f98794v, i, false);
        C40820a.m166102S(parcel, 10, this.f98795w, i, false);
        C40820a.m166102S(parcel, 11, this.f98796x, i, false);
        C40820a.m166102S(parcel, 12, this.f98797y, i, false);
        C40820a.m166102S(parcel, 13, this.f98798z, i, false);
        C40820a.m166102S(parcel, 14, this.f98784X, i, false);
        C40820a.m166102S(parcel, 15, this.f98785Y, i, false);
        C40820a.m166131m(parcel, 16, this.f98786Z, false);
        C40820a.m166122g(parcel, 17, this.f98782E0);
        C40820a.m166136r(parcel, 18, this.f98783F0);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzq(@SafeParcelable.C40816e(mo134492id = 2) int i, @SafeParcelable.C40816e(mo134492id = 3) String str, @SafeParcelable.C40816e(mo134492id = 4) String str2, @SafeParcelable.C40816e(mo134492id = 5) int i2, @SafeParcelable.C40816e(mo134492id = 6) Point[] pointArr, @SafeParcelable.C40816e(mo134492id = 7) zzj zzj, @SafeParcelable.C40816e(mo134492id = 8) zzm zzm, @SafeParcelable.C40816e(mo134492id = 9) zzn zzn, @SafeParcelable.C40816e(mo134492id = 10) zzp zzp, @SafeParcelable.C40816e(mo134492id = 11) zzo zzo, @SafeParcelable.C40816e(mo134492id = 12) zzk zzk, @SafeParcelable.C40816e(mo134492id = 13) zzg zzg, @SafeParcelable.C40816e(mo134492id = 14) zzh zzh, @SafeParcelable.C40816e(mo134492id = 15) zzi zzi, @SafeParcelable.C40816e(mo134492id = 16) byte[] bArr, @SafeParcelable.C40816e(mo134492id = 17) boolean z, @SafeParcelable.C40816e(mo134492id = 18) double d) {
        this.f98787a = i;
        this.f98788b = str;
        this.f98786Z = bArr;
        this.f98789c = str2;
        this.f98790d = i2;
        this.f98791e = pointArr;
        this.f98782E0 = z;
        this.f98783F0 = d;
        this.f98792f = zzj;
        this.f98793g = zzm;
        this.f98794v = zzn;
        this.f98795w = zzp;
        this.f98796x = zzo;
        this.f98797y = zzk;
        this.f98798z = zzg;
        this.f98784X = zzh;
        this.f98785Y = zzi;
    }
}
