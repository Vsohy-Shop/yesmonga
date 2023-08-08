package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import com.google.android.gms.auth.api.signin.C40417a;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "GoogleSignInOptionsExtensionCreator")
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C40425c();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f103038a;
    @SafeParcelable.C40814c(getter = "getType", mo134489id = 2)

    /* renamed from: b */
    public int f103039b;
    @SafeParcelable.C40814c(getter = "getBundle", mo134489id = 3)

    /* renamed from: c */
    public Bundle f103040c;

    @SafeParcelable.C40813b
    public GoogleSignInOptionsExtensionParcelable(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) Bundle bundle) {
        this.f103038a = i;
        this.f103039b = i2;
        this.f103040c = bundle;
    }

    @C40473a
    /* renamed from: M */
    public int mo133505M() {
        return this.f103039b;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103038a);
        C40820a.m166089F(parcel, 2, mo133505M());
        C40820a.m166129k(parcel, 3, this.f103040c, false);
        C40820a.m166112b(parcel, a);
    }

    public GoogleSignInOptionsExtensionParcelable(@C0359n0 C40417a aVar) {
        this(1, aVar.mo133497b(), aVar.mo133496a());
    }
}
