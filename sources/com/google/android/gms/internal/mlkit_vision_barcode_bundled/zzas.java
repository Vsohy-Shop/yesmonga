package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "DriverLicenseParcelCreator")
public final class zzas extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzas> CREATOR = new C39063v();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getBirthDate", mo134489id = 13)

    /* renamed from: X */
    public final String f99020X;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getIssuingCountry", mo134489id = 14)

    /* renamed from: Y */
    public final String f99021Y;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getDocumentType", mo134489id = 1)

    /* renamed from: a */
    public final String f99022a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getFirstName", mo134489id = 2)

    /* renamed from: b */
    public final String f99023b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getMiddleName", mo134489id = 3)

    /* renamed from: c */
    public final String f99024c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getLastName", mo134489id = 4)

    /* renamed from: d */
    public final String f99025d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getGender", mo134489id = 5)

    /* renamed from: e */
    public final String f99026e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getAddressStreet", mo134489id = 6)

    /* renamed from: f */
    public final String f99027f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getAddressCity", mo134489id = 7)

    /* renamed from: g */
    public final String f99028g;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getAddressState", mo134489id = 8)

    /* renamed from: v */
    public final String f99029v;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getAddressZip", mo134489id = 9)

    /* renamed from: w */
    public final String f99030w;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getLicenseNumber", mo134489id = 10)

    /* renamed from: x */
    public final String f99031x;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getIssueDate", mo134489id = 11)

    /* renamed from: y */
    public final String f99032y;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getExpiryDate", mo134489id = 12)

    /* renamed from: z */
    public final String f99033z;

    @SafeParcelable.C40813b
    public zzas(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str4, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) String str5, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) String str6, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) String str7, @C0363p0 @SafeParcelable.C40816e(mo134492id = 8) String str8, @C0363p0 @SafeParcelable.C40816e(mo134492id = 9) String str9, @C0363p0 @SafeParcelable.C40816e(mo134492id = 10) String str10, @C0363p0 @SafeParcelable.C40816e(mo134492id = 11) String str11, @C0363p0 @SafeParcelable.C40816e(mo134492id = 12) String str12, @C0363p0 @SafeParcelable.C40816e(mo134492id = 13) String str13, @C0363p0 @SafeParcelable.C40816e(mo134492id = 14) String str14) {
        this.f99022a = str;
        this.f99023b = str2;
        this.f99024c = str3;
        this.f99025d = str4;
        this.f99026e = str5;
        this.f99027f = str6;
        this.f99028g = str7;
        this.f99029v = str8;
        this.f99030w = str9;
        this.f99031x = str10;
        this.f99032y = str11;
        this.f99033z = str12;
        this.f99020X = str13;
        this.f99021Y = str14;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f99022a, false);
        C40820a.m166108Y(parcel, 2, this.f99023b, false);
        C40820a.m166108Y(parcel, 3, this.f99024c, false);
        C40820a.m166108Y(parcel, 4, this.f99025d, false);
        C40820a.m166108Y(parcel, 5, this.f99026e, false);
        C40820a.m166108Y(parcel, 6, this.f99027f, false);
        C40820a.m166108Y(parcel, 7, this.f99028g, false);
        C40820a.m166108Y(parcel, 8, this.f99029v, false);
        C40820a.m166108Y(parcel, 9, this.f99030w, false);
        C40820a.m166108Y(parcel, 10, this.f99031x, false);
        C40820a.m166108Y(parcel, 11, this.f99032y, false);
        C40820a.m166108Y(parcel, 12, this.f99033z, false);
        C40820a.m166108Y(parcel, 13, this.f99020X, false);
        C40820a.m166108Y(parcel, 14, this.f99021Y, false);
        C40820a.m166112b(parcel, a);
    }
}
