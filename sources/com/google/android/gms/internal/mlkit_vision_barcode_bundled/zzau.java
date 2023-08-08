package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "GeoPointParcelCreator")
public final class zzau extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzau> CREATOR = new C39081x();
    @SafeParcelable.C40814c(getter = "getLat", mo134489id = 1)

    /* renamed from: a */
    public final double f99038a;
    @SafeParcelable.C40814c(getter = "getLng", mo134489id = 2)

    /* renamed from: b */
    public final double f99039b;

    @SafeParcelable.C40813b
    public zzau(@SafeParcelable.C40816e(mo134492id = 1) double d, @SafeParcelable.C40816e(mo134492id = 2) double d2) {
        this.f99038a = d;
        this.f99039b = d2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166136r(parcel, 1, this.f99038a);
        C40820a.m166136r(parcel, 2, this.f99039b);
        C40820a.m166112b(parcel, a);
    }
}
