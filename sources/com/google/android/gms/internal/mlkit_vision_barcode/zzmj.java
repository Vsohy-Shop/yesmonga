package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ContactInfoParcelCreator")
public final class zzmj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmj> CREATOR = new C38801ua();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getName", mo134489id = 1)

    /* renamed from: a */
    public final zzmn f98711a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getOrganization", mo134489id = 2)

    /* renamed from: b */
    public final String f98712b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getTitle", mo134489id = 3)

    /* renamed from: c */
    public final String f98713c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPhones", mo134489id = 4)

    /* renamed from: d */
    public final zzmo[] f98714d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getEmails", mo134489id = 5)

    /* renamed from: e */
    public final zzml[] f98715e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getUrls", mo134489id = 6)

    /* renamed from: f */
    public final String[] f98716f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getAddresses", mo134489id = 7)

    /* renamed from: g */
    public final zzmg[] f98717g;

    @SafeParcelable.C40813b
    public zzmj(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) zzmn zzmn, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) zzmo[] zzmoArr, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) zzml[] zzmlArr, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) String[] strArr, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) zzmg[] zzmgArr) {
        this.f98711a = zzmn;
        this.f98712b = str;
        this.f98713c = str2;
        this.f98714d = zzmoArr;
        this.f98715e = zzmlArr;
        this.f98716f = strArr;
        this.f98717g = zzmgArr;
    }

    @C0363p0
    /* renamed from: M */
    public final zzmn mo122687M() {
        return this.f98711a;
    }

    @C0363p0
    /* renamed from: Q */
    public final String mo122688Q() {
        return this.f98712b;
    }

    @C0363p0
    /* renamed from: W */
    public final String mo122689W() {
        return this.f98713c;
    }

    @C0363p0
    /* renamed from: X */
    public final zzmg[] mo122690X() {
        return this.f98717g;
    }

    @C0363p0
    /* renamed from: e0 */
    public final zzml[] mo122691e0() {
        return this.f98715e;
    }

    @C0363p0
    /* renamed from: f0 */
    public final zzmo[] mo122692f0() {
        return this.f98714d;
    }

    @C0363p0
    /* renamed from: n0 */
    public final String[] mo122693n0() {
        return this.f98716f;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 1, this.f98711a, i, false);
        C40820a.m166108Y(parcel, 2, this.f98712b, false);
        C40820a.m166108Y(parcel, 3, this.f98713c, false);
        C40820a.m166115c0(parcel, 4, this.f98714d, i, false);
        C40820a.m166115c0(parcel, 5, this.f98715e, i, false);
        C40820a.m166109Z(parcel, 6, this.f98716f, false);
        C40820a.m166115c0(parcel, 7, this.f98717g, i, false);
        C40820a.m166112b(parcel, a);
    }
}
