package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "StringToIntConverterEntryCreator")
public final class zac extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zac> CREATOR = new C40935c();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f104127a;
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: b */
    public final String f104128b;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: c */
    public final int f104129c;

    @SafeParcelable.C40813b
    public zac(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) int i2) {
        this.f104127a = i;
        this.f104128b = str;
        this.f104129c = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f104127a);
        C40820a.m166108Y(parcel, 2, this.f104128b, false);
        C40820a.m166089F(parcel, 3, this.f104129c);
        C40820a.m166112b(parcel, a);
    }

    public zac(String str, int i) {
        this.f104127a = 1;
        this.f104128b = str;
        this.f104129c = i;
    }
}
