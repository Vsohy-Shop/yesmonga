package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C40858y
@SafeParcelable.C40812a(creator = "LocationSettingsConfigurationCreator")
@SafeParcelable.C40818g({3, 4, 1000})
@Deprecated
public final class zzbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbj> CREATOR = new C30329e1();
    @SafeParcelable.C40814c(defaultValue = "", getter = "getJustificationText", mo134489id = 1)

    /* renamed from: a */
    public final String f72873a;
    @SafeParcelable.C40814c(defaultValue = "", getter = "getExperimentId", mo134489id = 2)

    /* renamed from: b */
    public final String f72874b;
    @SafeParcelable.C40814c(defaultValue = "", getter = "getTitleText", mo134489id = 5)

    /* renamed from: c */
    public final String f72875c;

    @SafeParcelable.C40813b
    public zzbj(@SafeParcelable.C40816e(mo134492id = 5) String str, @SafeParcelable.C40816e(mo134492id = 1) String str2, @SafeParcelable.C40816e(mo134492id = 2) String str3) {
        this.f72875c = str;
        this.f72873a = str2;
        this.f72874b = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f72873a, false);
        C40820a.m166108Y(parcel, 2, this.f72874b, false);
        C40820a.m166108Y(parcel, 5, this.f72875c, false);
        C40820a.m166112b(parcel, a);
    }
}
