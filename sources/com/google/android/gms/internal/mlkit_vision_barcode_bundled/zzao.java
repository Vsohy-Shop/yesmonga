package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "AddressParcelCreator")
public final class zzao extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzao> CREATOR = new C39000o();
    @SafeParcelable.C40814c(getter = "getType", mo134489id = 1)

    /* renamed from: a */
    public final int f98996a;
    @SafeParcelable.C40814c(getter = "getAddressLines", mo134489id = 2)

    /* renamed from: b */
    public final String[] f98997b;

    @SafeParcelable.C40813b
    public zzao(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) String[] strArr) {
        this.f98996a = i;
        this.f98997b = strArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f98996a);
        C40820a.m166109Z(parcel, 2, this.f98997b, false);
        C40820a.m166112b(parcel, a);
    }
}
