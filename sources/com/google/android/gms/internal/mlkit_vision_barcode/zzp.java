package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "WiFiCreator")
@SafeParcelable.C40818g({1})
public final class zzp extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzp> CREATOR = new C38572d();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public String f98779a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String f98780b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public int f98781c;

    public zzp() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, this.f98779a, false);
        C40820a.m166108Y(parcel, 3, this.f98780b, false);
        C40820a.m166089F(parcel, 4, this.f98781c);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzp(@SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) String str2, @SafeParcelable.C40816e(mo134492id = 4) int i) {
        this.f98779a = str;
        this.f98780b = str2;
        this.f98781c = i;
    }
}
