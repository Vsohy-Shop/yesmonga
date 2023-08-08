package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "AddressCreator")
@SafeParcelable.C40818g({1})
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new C38756r1();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public int f98405a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String[] f98406b;

    public zze() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f98405a);
        C40820a.m166109Z(parcel, 3, this.f98406b, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zze(@SafeParcelable.C40816e(mo134492id = 2) int i, @SafeParcelable.C40816e(mo134492id = 3) String[] strArr) {
        this.f98405a = i;
        this.f98406b = strArr;
    }
}
