package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "EmailParcelCreator")
public final class zzat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzat> CREATOR = new C39072w();
    @SafeParcelable.C40814c(getter = "getType", mo134489id = 1)

    /* renamed from: a */
    public final int f99034a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getAddress", mo134489id = 2)

    /* renamed from: b */
    public final String f99035b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSubject", mo134489id = 3)

    /* renamed from: c */
    public final String f99036c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getBody", mo134489id = 4)

    /* renamed from: d */
    public final String f99037d;

    @SafeParcelable.C40813b
    public zzat(@SafeParcelable.C40816e(mo134492id = 1) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str3) {
        this.f99034a = i;
        this.f99035b = str;
        this.f99036c = str2;
        this.f99037d = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f99034a);
        C40820a.m166108Y(parcel, 2, this.f99035b, false);
        C40820a.m166108Y(parcel, 3, this.f99036c, false);
        C40820a.m166108Y(parcel, 4, this.f99037d, false);
        C40820a.m166112b(parcel, a);
    }
}
