package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ValidateAccountRequestCreator")
@Deprecated
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new C40797o1();
    @SafeParcelable.C40819h(mo134498id = 1)

    /* renamed from: a */
    public final int f103980a;

    @SafeParcelable.C40813b
    public zzaj(@SafeParcelable.C40816e(mo134492id = 1) int i) {
        this.f103980a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103980a);
        C40820a.m166112b(parcel, a);
    }
}
