package com.google.android.gms.internal.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C40669r;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "FusedLocationProviderResultCreator")
@SafeParcelable.C40818g({1000})
public final class zzaa extends AbstractSafeParcelable implements C40669r {
    public static final Parcelable.Creator<zzaa> CREATOR = new C41752b();

    /* renamed from: b */
    public static final zzaa f105935b = new zzaa(Status.f103184g);
    @SafeParcelable.C40814c(getter = "getStatus", mo134489id = 1)

    /* renamed from: a */
    public final Status f105936a;

    @SafeParcelable.C40813b
    public zzaa(@SafeParcelable.C40816e(mo134492id = 1) Status status) {
        this.f105936a = status;
    }

    public final Status getStatus() {
        return this.f105936a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 1, this.f105936a, i, false);
        C40820a.m166112b(parcel, a);
    }
}
