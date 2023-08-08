package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ContactInfoParcelCreator")
public final class zzar extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzar> CREATOR = new C39054u();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getName", mo134489id = 1)

    /* renamed from: a */
    public final zzav f99013a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getOrganization", mo134489id = 2)

    /* renamed from: b */
    public final String f99014b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getTitle", mo134489id = 3)

    /* renamed from: c */
    public final String f99015c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPhones", mo134489id = 4)

    /* renamed from: d */
    public final zzaw[] f99016d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getEmails", mo134489id = 5)

    /* renamed from: e */
    public final zzat[] f99017e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getUrls", mo134489id = 6)

    /* renamed from: f */
    public final String[] f99018f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getAddresses", mo134489id = 7)

    /* renamed from: g */
    public final zzao[] f99019g;

    @SafeParcelable.C40813b
    public zzar(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) zzav zzav, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) zzaw[] zzawArr, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) zzat[] zzatArr, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) String[] strArr, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) zzao[] zzaoArr) {
        this.f99013a = zzav;
        this.f99014b = str;
        this.f99015c = str2;
        this.f99016d = zzawArr;
        this.f99017e = zzatArr;
        this.f99018f = strArr;
        this.f99019g = zzaoArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 1, this.f99013a, i, false);
        C40820a.m166108Y(parcel, 2, this.f99014b, false);
        C40820a.m166108Y(parcel, 3, this.f99015c, false);
        C40820a.m166115c0(parcel, 4, this.f99016d, i, false);
        C40820a.m166115c0(parcel, 5, this.f99017e, i, false);
        C40820a.m166109Z(parcel, 6, this.f99018f, false);
        C40820a.m166115c0(parcel, 7, this.f99019g, i, false);
        C40820a.m166112b(parcel, a);
    }
}
