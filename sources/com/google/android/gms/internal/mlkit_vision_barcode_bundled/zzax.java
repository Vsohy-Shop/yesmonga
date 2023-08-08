package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "SmsParcelCreator")
public final class zzax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzax> CREATOR = new C38913f0();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getMessage", mo134489id = 1)

    /* renamed from: a */
    public final String f99049a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPhoneNumber", mo134489id = 2)

    /* renamed from: b */
    public final String f99050b;

    @SafeParcelable.C40813b
    public zzax(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str2) {
        this.f99049a = str;
        this.f99050b = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f99049a, false);
        C40820a.m166108Y(parcel, 2, this.f99050b, false);
        C40820a.m166112b(parcel, a);
    }
}
