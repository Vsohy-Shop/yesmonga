package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "PersonNameParcelCreator")
public final class zzav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzav> CREATOR = new C38893d0();
    @C0363p0
    @SafeParcelable.C40814c(getter = "getFormattedName", mo134489id = 1)

    /* renamed from: a */
    public final String f99040a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPronunciation", mo134489id = 2)

    /* renamed from: b */
    public final String f99041b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getPrefix", mo134489id = 3)

    /* renamed from: c */
    public final String f99042c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getFirst", mo134489id = 4)

    /* renamed from: d */
    public final String f99043d;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getMiddle", mo134489id = 5)

    /* renamed from: e */
    public final String f99044e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getLast", mo134489id = 6)

    /* renamed from: f */
    public final String f99045f;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getSuffix", mo134489id = 7)

    /* renamed from: g */
    public final String f99046g;

    @SafeParcelable.C40813b
    public zzav(@C0363p0 @SafeParcelable.C40816e(mo134492id = 1) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str4, @C0363p0 @SafeParcelable.C40816e(mo134492id = 5) String str5, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) String str6, @C0363p0 @SafeParcelable.C40816e(mo134492id = 7) String str7) {
        this.f99040a = str;
        this.f99041b = str2;
        this.f99042c = str3;
        this.f99043d = str4;
        this.f99044e = str5;
        this.f99045f = str6;
        this.f99046g = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f99040a, false);
        C40820a.m166108Y(parcel, 2, this.f99041b, false);
        C40820a.m166108Y(parcel, 3, this.f99042c, false);
        C40820a.m166108Y(parcel, 4, this.f99043d, false);
        C40820a.m166108Y(parcel, 5, this.f99044e, false);
        C40820a.m166108Y(parcel, 6, this.f99045f, false);
        C40820a.m166108Y(parcel, 7, this.f99046g, false);
        C40820a.m166112b(parcel, a);
    }
}
