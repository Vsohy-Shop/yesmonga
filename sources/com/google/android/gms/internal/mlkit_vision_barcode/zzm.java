package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "PhoneCreator")
@SafeParcelable.C40818g({1})
public final class zzm extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzm> CREATOR = new C38753qb();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public int f98692a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String f98693b;

    public zzm() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f98692a);
        C40820a.m166108Y(parcel, 3, this.f98693b, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzm(@SafeParcelable.C40816e(mo134492id = 2) int i, @SafeParcelable.C40816e(mo134492id = 3) String str) {
        this.f98692a = i;
        this.f98693b = str;
    }
}
