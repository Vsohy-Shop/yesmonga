package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "SmsCreator")
@SafeParcelable.C40818g({1})
public final class zzn extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzn> CREATOR = new C38546b();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public String f98770a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String f98771b;

    public zzn() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, this.f98770a, false);
        C40820a.m166108Y(parcel, 3, this.f98771b, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzn(@SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) String str2) {
        this.f98770a = str;
        this.f98771b = str2;
    }
}
