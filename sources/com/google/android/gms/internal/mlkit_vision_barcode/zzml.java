package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "EmailParcelCreator")
public final class zzml extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzml> CREATOR = new C38825wa();
    @SafeParcelable.C40814c(getter = "getType", mo134489id = 1)

    /* renamed from: a */
    public final int f98732a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getAddress", mo134489id = 2)

    /* renamed from: b */
    public final String f98733b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSubject", mo134489id = 3)

    /* renamed from: c */
    public final String f98734c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getBody", mo134489id = 4)

    /* renamed from: d */
    public final String f98735d;

    @SafeParcelable.C40813b
    public zzml(@SafeParcelable.C40816e(mo134492id = 1) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str3) {
        this.f98732a = i;
        this.f98733b = str;
        this.f98734c = str2;
        this.f98735d = str3;
    }

    /* renamed from: M */
    public final int mo122710M() {
        return this.f98732a;
    }

    @C0363p0
    /* renamed from: Q */
    public final String mo122711Q() {
        return this.f98733b;
    }

    @C0363p0
    /* renamed from: W */
    public final String mo122712W() {
        return this.f98735d;
    }

    @C0363p0
    /* renamed from: X */
    public final String mo122713X() {
        return this.f98734c;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f98732a);
        C40820a.m166108Y(parcel, 2, this.f98733b, false);
        C40820a.m166108Y(parcel, 3, this.f98734c, false);
        C40820a.m166108Y(parcel, 4, this.f98735d, false);
        C40820a.m166112b(parcel, a);
    }
}
