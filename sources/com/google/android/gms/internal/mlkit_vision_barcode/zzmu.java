package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "BarcodeScannerOptionsParcelCreator")
public final class zzmu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzmu> CREATOR = new C38765ra();
    @SafeParcelable.C40814c(getter = "getSupportedFormats", mo134489id = 1)

    /* renamed from: a */
    public final int f98769a;

    @SafeParcelable.C40813b
    public zzmu(@SafeParcelable.C40816e(mo134492id = 1) int i) {
        this.f98769a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f98769a);
        C40820a.m166112b(parcel, a);
    }
}
