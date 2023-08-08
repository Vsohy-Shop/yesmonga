package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "PersonNameParcelCreator")
public final class zzmn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmn> CREATOR = new C38571cb();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getFormattedName", mo134489id = 1)

    /* renamed from: a */
    public final String f98738a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPronunciation", mo134489id = 2)

    /* renamed from: b */
    public final String f98739b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPrefix", mo134489id = 3)

    /* renamed from: c */
    public final String f98740c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getFirst", mo134489id = 4)

    /* renamed from: d */
    public final String f98741d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getMiddle", mo134489id = 5)

    /* renamed from: e */
    public final String f98742e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getLast", mo134489id = 6)

    /* renamed from: f */
    public final String f98743f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSuffix", mo134489id = 7)

    /* renamed from: g */
    public final String f98744g;

    @SafeParcelable.C40813b
    public zzmn(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str4, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) String str5, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) String str6, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) String str7) {
        this.f98738a = str;
        this.f98739b = str2;
        this.f98740c = str3;
        this.f98741d = str4;
        this.f98742e = str5;
        this.f98743f = str6;
        this.f98744g = str7;
    }

    @C0363p0
    /* renamed from: M */
    public final String mo122718M() {
        return this.f98741d;
    }

    @C0363p0
    /* renamed from: Q */
    public final String mo122719Q() {
        return this.f98738a;
    }

    @C0363p0
    /* renamed from: W */
    public final String mo122720W() {
        return this.f98743f;
    }

    @C0363p0
    /* renamed from: X */
    public final String mo122721X() {
        return this.f98742e;
    }

    @C0363p0
    /* renamed from: e0 */
    public final String mo122722e0() {
        return this.f98740c;
    }

    @C0363p0
    /* renamed from: f0 */
    public final String mo122723f0() {
        return this.f98739b;
    }

    @C0363p0
    /* renamed from: n0 */
    public final String mo122724n0() {
        return this.f98744g;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f98738a, false);
        C40820a.m166108Y(parcel, 2, this.f98739b, false);
        C40820a.m166108Y(parcel, 3, this.f98740c, false);
        C40820a.m166108Y(parcel, 4, this.f98741d, false);
        C40820a.m166108Y(parcel, 5, this.f98742e, false);
        C40820a.m166108Y(parcel, 6, this.f98743f, false);
        C40820a.m166108Y(parcel, 7, this.f98744g, false);
        C40820a.m166112b(parcel, a);
    }
}
