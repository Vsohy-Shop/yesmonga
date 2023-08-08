package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "PersonNameCreator")
@SafeParcelable.C40818g({1})
public final class zzl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzl> CREATOR = new C38740pb();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public String f98668a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public String f98669b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public String f98670c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public String f98671d;
    @SafeParcelable.C40814c(mo134489id = 6)

    /* renamed from: e */
    public String f98672e;
    @SafeParcelable.C40814c(mo134489id = 7)

    /* renamed from: f */
    public String f98673f;
    @SafeParcelable.C40814c(mo134489id = 8)

    /* renamed from: g */
    public String f98674g;

    public zzl() {
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 2, this.f98668a, false);
        C40820a.m166108Y(parcel, 3, this.f98669b, false);
        C40820a.m166108Y(parcel, 4, this.f98670c, false);
        C40820a.m166108Y(parcel, 5, this.f98671d, false);
        C40820a.m166108Y(parcel, 6, this.f98672e, false);
        C40820a.m166108Y(parcel, 7, this.f98673f, false);
        C40820a.m166108Y(parcel, 8, this.f98674g, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzl(@SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) String str2, @SafeParcelable.C40816e(mo134492id = 4) String str3, @SafeParcelable.C40816e(mo134492id = 5) String str4, @SafeParcelable.C40816e(mo134492id = 6) String str5, @SafeParcelable.C40816e(mo134492id = 7) String str6, @SafeParcelable.C40816e(mo134492id = 8) String str7) {
        this.f98668a = str;
        this.f98669b = str2;
        this.f98670c = str3;
        this.f98671d = str4;
        this.f98672e = str5;
        this.f98673f = str6;
        this.f98674g = str7;
    }
}
