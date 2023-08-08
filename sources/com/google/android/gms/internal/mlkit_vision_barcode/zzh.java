package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ContactInfoCreator")
@SafeParcelable.C40818g({1})
public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzh> CREATOR = new C38688lb();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public zzl f98422a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String f98423b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public String f98424c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public zzm[] f98425d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public zzj[] f98426e;
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: f */
    public String[] f98427f;
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: g */
    public zze[] f98428g;

    public zzh() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 2, this.f98422a, i, false);
        C40820a.m166108Y(parcel, 3, this.f98423b, false);
        C40820a.m166108Y(parcel, 4, this.f98424c, false);
        C40820a.m166115c0(parcel, 5, this.f98425d, i, false);
        C40820a.m166115c0(parcel, 6, this.f98426e, i, false);
        C40820a.m166109Z(parcel, 7, this.f98427f, false);
        C40820a.m166115c0(parcel, 8, this.f98428g, i, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzh(@SafeParcelable.C40816e(mo134492id = 2) zzl zzl, @SafeParcelable.C40816e(mo134492id = 3) String str, @SafeParcelable.C40816e(mo134492id = 4) String str2, @SafeParcelable.C40816e(mo134492id = 5) zzm[] zzmArr, @SafeParcelable.C40816e(mo134492id = 6) zzj[] zzjArr, @SafeParcelable.C40816e(mo134492id = 7) String[] strArr, @SafeParcelable.C40816e(mo134492id = 8) zze[] zzeArr) {
        this.f98422a = zzl;
        this.f98423b = str;
        this.f98424c = str2;
        this.f98425d = zzmArr;
        this.f98426e = zzjArr;
        this.f98427f = strArr;
        this.f98428g = zzeArr;
    }
}
