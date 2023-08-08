package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "BarcodeDetectorOptionsCreator")
@SafeParcelable.C40818g({1})
public final class zzad extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzad> CREATOR = new C38585e();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public int f98375a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public boolean f98376b;

    public zzad() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f98375a);
        C40820a.m166122g(parcel, 3, this.f98376b);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzad(@SafeParcelable.C40816e(mo134492id = 2) int i, @SafeParcelable.C40816e(mo134492id = 3) boolean z) {
        this.f98375a = i;
        this.f98376b = z;
    }
}
