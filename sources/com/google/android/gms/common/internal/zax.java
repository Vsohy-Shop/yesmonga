package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "SignInButtonConfigCreator")
public final class zax extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zax> CREATOR = new C40740c1();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f103976a;
    @SafeParcelable.C40814c(getter = "getButtonSize", mo134489id = 2)

    /* renamed from: b */
    public final int f103977b;
    @SafeParcelable.C40814c(getter = "getColorScheme", mo134489id = 3)

    /* renamed from: c */
    public final int f103978c;
    @C0363p0
    @Deprecated
    @SafeParcelable.C40814c(getter = "getScopes", mo134489id = 4)

    /* renamed from: d */
    public final Scope[] f103979d;

    @SafeParcelable.C40813b
    public zax(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) int i3, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) Scope[] scopeArr) {
        this.f103976a = i;
        this.f103977b = i2;
        this.f103978c = i3;
        this.f103979d = scopeArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103976a);
        C40820a.m166089F(parcel, 2, this.f103977b);
        C40820a.m166089F(parcel, 3, this.f103978c);
        C40820a.m166115c0(parcel, 4, this.f103979d, i, false);
        C40820a.m166112b(parcel, a);
    }
}
