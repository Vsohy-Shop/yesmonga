package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "GeoPointCreator")
@SafeParcelable.C40818g({1})
public final class zzk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzk> CREATOR = new C38727ob();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public double f98666a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public double f98667b;

    public zzk() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166136r(parcel, 2, this.f98666a);
        C40820a.m166136r(parcel, 3, this.f98667b);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzk(@SafeParcelable.C40816e(mo134492id = 2) double d, @SafeParcelable.C40816e(mo134492id = 3) double d2) {
        this.f98666a = d;
        this.f98667b = d2;
    }
}
