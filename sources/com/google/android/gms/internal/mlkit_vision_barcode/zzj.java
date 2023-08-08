package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "EmailCreator")
@SafeParcelable.C40818g({1})
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C38714nb();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public int f98454a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String f98455b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public String f98456c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public String f98457d;

    public zzj() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 2, this.f98454a);
        C40820a.m166108Y(parcel, 3, this.f98455b, false);
        C40820a.m166108Y(parcel, 4, this.f98456c, false);
        C40820a.m166108Y(parcel, 5, this.f98457d, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzj(@SafeParcelable.C40816e(mo134492id = 2) int i, @SafeParcelable.C40816e(mo134492id = 3) String str, @SafeParcelable.C40816e(mo134492id = 4) String str2, @SafeParcelable.C40816e(mo134492id = 5) String str3) {
        this.f98454a = i;
        this.f98455b = str;
        this.f98456c = str2;
        this.f98457d = str3;
    }
}
