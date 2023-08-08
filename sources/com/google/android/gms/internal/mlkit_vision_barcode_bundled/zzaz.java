package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "WiFiParcelCreator")
public final class zzaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaz> CREATOR = new C38933h0();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSsid", mo134489id = 1)

    /* renamed from: a */
    public final String f99053a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPassword", mo134489id = 2)

    /* renamed from: b */
    public final String f99054b;
    @SafeParcelable.C40814c(getter = "getEncryptionType", mo134489id = 3)

    /* renamed from: c */
    public final int f99055c;

    @SafeParcelable.C40813b
    public zzaz(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str2, @SafeParcelable.C40816e(mo134492id = 3) int i) {
        this.f99053a = str;
        this.f99054b = str2;
        this.f99055c = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f99053a, false);
        C40820a.m166108Y(parcel, 2, this.f99054b, false);
        C40820a.m166089F(parcel, 3, this.f99055c);
        C40820a.m166112b(parcel, a);
    }
}
