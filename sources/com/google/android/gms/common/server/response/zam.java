package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.response.FastJsonResponse;

@C40858y
@SafeParcelable.C40812a(creator = "FieldMapPairCreator")
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C40947k();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f104171a;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public final String f104172b;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: c */
    public final FastJsonResponse.Field f104173c;

    @SafeParcelable.C40813b
    public zam(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) FastJsonResponse.Field field) {
        this.f104171a = i;
        this.f104172b = str;
        this.f104173c = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f104171a);
        C40820a.m166108Y(parcel, 2, this.f104172b, false);
        C40820a.m166102S(parcel, 3, this.f104173c, i, false);
        C40820a.m166112b(parcel, a);
    }

    public zam(String str, FastJsonResponse.Field field) {
        this.f104171a = 1;
        this.f104172b = str;
        this.f104173c = field;
    }
}
