package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "AuthAccountResultCreator")
public final class zaa extends AbstractSafeParcelable implements C40669r {
    public static final Parcelable.Creator<zaa> CREATOR = new C30982b();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f74230a;
    @SafeParcelable.C40814c(getter = "getConnectionResultCode", mo134489id = 2)

    /* renamed from: b */
    public int f74231b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getRawAuthResolutionIntent", mo134489id = 3)

    /* renamed from: c */
    public Intent f74232c;

    public zaa() {
        this(2, 0, (Intent) null);
    }

    public final Status getStatus() {
        if (this.f74231b == 0) {
            return Status.f103184g;
        }
        return Status.f103188y;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f74230a);
        C40820a.m166089F(parcel, 2, this.f74231b);
        C40820a.m166102S(parcel, 3, this.f74232c, i, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zaa(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) Intent intent) {
        this.f74230a = i;
        this.f74231b = i2;
        this.f74232c = intent;
    }
}
