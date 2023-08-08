package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "AddressParcelCreator")
public final class zzmg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmg> CREATOR = new C38739pa();
    @SafeParcelable.C40814c(getter = "getType", mo134489id = 1)

    /* renamed from: a */
    public final int f98694a;
    @SafeParcelable.C40814c(getter = "getAddressLines", mo134489id = 2)

    /* renamed from: b */
    public final String[] f98695b;

    @SafeParcelable.C40813b
    public zzmg(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) String[] strArr) {
        this.f98694a = i;
        this.f98695b = strArr;
    }

    /* renamed from: M */
    public final int mo122667M() {
        return this.f98694a;
    }

    /* renamed from: Q */
    public final String[] mo122668Q() {
        return this.f98695b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f98694a);
        C40820a.m166109Z(parcel, 2, this.f98695b, false);
        C40820a.m166112b(parcel, a);
    }
}
