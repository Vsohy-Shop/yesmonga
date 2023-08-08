package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "GeoPointParcelCreator")
public final class zzmm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmm> CREATOR = new C38837xa();
    @SafeParcelable.C40814c(getter = "getLat", mo134489id = 1)

    /* renamed from: a */
    public final double f98736a;
    @SafeParcelable.C40814c(getter = "getLng", mo134489id = 2)

    /* renamed from: b */
    public final double f98737b;

    @SafeParcelable.C40813b
    public zzmm(@SafeParcelable.C40816e(mo134492id = 1) double d, @SafeParcelable.C40816e(mo134492id = 2) double d2) {
        this.f98736a = d;
        this.f98737b = d2;
    }

    /* renamed from: M */
    public final double mo122715M() {
        return this.f98736a;
    }

    /* renamed from: Q */
    public final double mo122716Q() {
        return this.f98737b;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166136r(parcel, 1, this.f98736a);
        C40820a.m166136r(parcel, 2, this.f98737b);
        C40820a.m166112b(parcel, a);
    }
}
