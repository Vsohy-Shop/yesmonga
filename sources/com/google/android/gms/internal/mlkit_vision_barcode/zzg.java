package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "CalendarEventCreator")
@SafeParcelable.C40818g({1})
public final class zzg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzg> CREATOR = new C38675kb();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public String f98415a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String f98416b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public String f98417c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public String f98418d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public String f98419e;
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: f */
    public zzf f98420f;
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: g */
    public zzf f98421g;

    public zzg() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, this.f98415a, false);
        C40820a.m166108Y(parcel, 3, this.f98416b, false);
        C40820a.m166108Y(parcel, 4, this.f98417c, false);
        C40820a.m166108Y(parcel, 5, this.f98418d, false);
        C40820a.m166108Y(parcel, 6, this.f98419e, false);
        C40820a.m166102S(parcel, 7, this.f98420f, i, false);
        C40820a.m166102S(parcel, 8, this.f98421g, i, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzg(@SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) String str2, @SafeParcelable.C40816e(mo134492id = 4) String str3, @SafeParcelable.C40816e(mo134492id = 5) String str4, @SafeParcelable.C40816e(mo134492id = 6) String str5, @SafeParcelable.C40816e(mo134492id = 7) zzf zzf, @SafeParcelable.C40816e(mo134492id = 8) zzf zzf2) {
        this.f98415a = str;
        this.f98416b = str2;
        this.f98417c = str3;
        this.f98418d = str4;
        this.f98419e = str5;
        this.f98420f = zzf;
        this.f98421g = zzf2;
    }
}
