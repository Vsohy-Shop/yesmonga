package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "PhoneParcelCreator")
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C38903e0();
    @SafeParcelable.C40814c(getter = "getType", mo134489id = 1)

    /* renamed from: a */
    public final int f99047a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getNumber", mo134489id = 2)

    /* renamed from: b */
    public final String f99048b;

    @SafeParcelable.C40813b
    public zzaw(@SafeParcelable.C40816e(mo134492id = 1) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str) {
        this.f99047a = i;
        this.f99048b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f99047a);
        C40820a.m166108Y(parcel, 2, this.f99048b, false);
        C40820a.m166112b(parcel, a);
    }
}
