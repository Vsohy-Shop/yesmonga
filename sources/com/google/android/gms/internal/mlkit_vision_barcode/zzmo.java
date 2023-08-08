package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "PhoneParcelCreator")
public final class zzmo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmo> CREATOR = new C38584db();
    @SafeParcelable.C40814c(getter = "getType", mo134489id = 1)

    /* renamed from: a */
    public final int f98745a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getNumber", mo134489id = 2)

    /* renamed from: b */
    public final String f98746b;

    @SafeParcelable.C40813b
    public zzmo(@SafeParcelable.C40816e(mo134492id = 1) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str) {
        this.f98745a = i;
        this.f98746b = str;
    }

    /* renamed from: M */
    public final int mo122726M() {
        return this.f98745a;
    }

    @C0363p0
    /* renamed from: Q */
    public final String mo122727Q() {
        return this.f98746b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f98745a);
        C40820a.m166108Y(parcel, 2, this.f98746b, false);
        C40820a.m166112b(parcel, a);
    }
}
