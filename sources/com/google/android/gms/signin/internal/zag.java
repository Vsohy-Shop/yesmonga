package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

@SafeParcelable.C40812a(creator = "RecordConsentByConsentResultResponseCreator")
public final class zag extends AbstractSafeParcelable implements C40669r {
    public static final Parcelable.Creator<zag> CREATOR = new C30987g();
    @SafeParcelable.C40814c(getter = "getGrantedScopes", mo134489id = 1)

    /* renamed from: a */
    public final List f74233a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getToken", mo134489id = 2)

    /* renamed from: b */
    public final String f74234b;

    @SafeParcelable.C40813b
    public zag(@SafeParcelable.C40816e(mo134492id = 1) List list, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str) {
        this.f74233a = list;
        this.f74234b = str;
    }

    public final Status getStatus() {
        if (this.f74234b != null) {
            return Status.f103184g;
        }
        return Status.f103188y;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166111a0(parcel, 1, this.f74233a, false);
        C40820a.m166108Y(parcel, 2, this.f74234b, false);
        C40820a.m166112b(parcel, a);
    }
}
