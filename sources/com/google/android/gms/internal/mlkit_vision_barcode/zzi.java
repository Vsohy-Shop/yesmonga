package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "DriverLicenseCreator")
@SafeParcelable.C40818g({1})
public final class zzi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzi> CREATOR = new C38701mb();
    @SafeParcelable.C40814c(mo134489id = 14)

    /* renamed from: X */
    public String f98429X;
    @SafeParcelable.C40814c(mo134489id = 15)

    /* renamed from: Y */
    public String f98430Y;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public String f98431a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String f98432b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public String f98433c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public String f98434d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public String f98435e;
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: f */
    public String f98436f;
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: g */
    public String f98437g;
    @SafeParcelable.C40814c(mo134489id = 9)

    /* renamed from: v */
    public String f98438v;
    @SafeParcelable.C40814c(mo134489id = 10)

    /* renamed from: w */
    public String f98439w;
    @SafeParcelable.C40814c(mo134489id = 11)

    /* renamed from: x */
    public String f98440x;
    @SafeParcelable.C40814c(mo134489id = 12)

    /* renamed from: y */
    public String f98441y;
    @SafeParcelable.C40814c(mo134489id = 13)

    /* renamed from: z */
    public String f98442z;

    public zzi() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, this.f98431a, false);
        C40820a.m166108Y(parcel, 3, this.f98432b, false);
        C40820a.m166108Y(parcel, 4, this.f98433c, false);
        C40820a.m166108Y(parcel, 5, this.f98434d, false);
        C40820a.m166108Y(parcel, 6, this.f98435e, false);
        C40820a.m166108Y(parcel, 7, this.f98436f, false);
        C40820a.m166108Y(parcel, 8, this.f98437g, false);
        C40820a.m166108Y(parcel, 9, this.f98438v, false);
        C40820a.m166108Y(parcel, 10, this.f98439w, false);
        C40820a.m166108Y(parcel, 11, this.f98440x, false);
        C40820a.m166108Y(parcel, 12, this.f98441y, false);
        C40820a.m166108Y(parcel, 13, this.f98442z, false);
        C40820a.m166108Y(parcel, 14, this.f98429X, false);
        C40820a.m166108Y(parcel, 15, this.f98430Y, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzi(@SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) String str2, @SafeParcelable.C40816e(mo134492id = 4) String str3, @SafeParcelable.C40816e(mo134492id = 5) String str4, @SafeParcelable.C40816e(mo134492id = 6) String str5, @SafeParcelable.C40816e(mo134492id = 7) String str6, @SafeParcelable.C40816e(mo134492id = 8) String str7, @SafeParcelable.C40816e(mo134492id = 9) String str8, @SafeParcelable.C40816e(mo134492id = 10) String str9, @SafeParcelable.C40816e(mo134492id = 11) String str10, @SafeParcelable.C40816e(mo134492id = 12) String str11, @SafeParcelable.C40816e(mo134492id = 13) String str12, @SafeParcelable.C40816e(mo134492id = 14) String str13, @SafeParcelable.C40816e(mo134492id = 15) String str14) {
        this.f98431a = str;
        this.f98432b = str2;
        this.f98433c = str3;
        this.f98434d = str4;
        this.f98435e = str5;
        this.f98436f = str6;
        this.f98437g = str7;
        this.f98438v = str8;
        this.f98439w = str9;
        this.f98440x = str10;
        this.f98441y = str11;
        this.f98442z = str12;
        this.f98429X = str13;
        this.f98430Y = str14;
    }
}
