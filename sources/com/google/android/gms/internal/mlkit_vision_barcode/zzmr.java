package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "WiFiParcelCreator")
public final class zzmr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmr> CREATOR = new C38623gb();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSsid", mo134489id = 1)

    /* renamed from: a */
    public final String f98751a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPassword", mo134489id = 2)

    /* renamed from: b */
    public final String f98752b;
    @SafeParcelable.C40814c(getter = "getEncryptionType", mo134489id = 3)

    /* renamed from: c */
    public final int f98753c;

    @SafeParcelable.C40813b
    public zzmr(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str2, @SafeParcelable.C40816e(mo134492id = 3) int i) {
        this.f98751a = str;
        this.f98752b = str2;
        this.f98753c = i;
    }

    /* renamed from: M */
    public final int mo122735M() {
        return this.f98753c;
    }

    @C0363p0
    /* renamed from: Q */
    public final String mo122736Q() {
        return this.f98752b;
    }

    @C0363p0
    /* renamed from: W */
    public final String mo122737W() {
        return this.f98751a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f98751a, false);
        C40820a.m166108Y(parcel, 2, this.f98752b, false);
        C40820a.m166089F(parcel, 3, this.f98753c);
        C40820a.m166112b(parcel, a);
    }
}
