package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "EventParcelCreator")
@SafeParcelable.C40818g({1})
public final class zzaw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaw> CREATOR = new C30895u();
    @SafeParcelable.C40814c(mo134489id = 2)

    /* renamed from: a */
    public final String f74163a;
    @SafeParcelable.C40814c(mo134489id = 3)

    /* renamed from: b */
    public final zzau f74164b;
    @SafeParcelable.C40814c(mo134489id = 4)

    /* renamed from: c */
    public final String f74165c;
    @SafeParcelable.C40814c(mo134489id = 5)

    /* renamed from: d */
    public final long f74166d;

    public zzaw(zzaw zzaw, long j) {
        C40843u.m166202l(zzaw);
        this.f74163a = zzaw.f74163a;
        this.f74164b = zzaw.f74164b;
        this.f74165c = zzaw.f74165c;
        this.f74166d = j;
    }

    public final String toString() {
        String str = this.f74165c;
        String str2 = this.f74163a;
        String valueOf = String.valueOf(this.f74164b);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C30895u.m124178a(this, parcel, i);
    }

    @SafeParcelable.C40813b
    public zzaw(@SafeParcelable.C40816e(mo134492id = 2) String str, @SafeParcelable.C40816e(mo134492id = 3) zzau zzau, @SafeParcelable.C40816e(mo134492id = 4) String str2, @SafeParcelable.C40816e(mo134492id = 5) long j) {
        this.f74163a = str;
        this.f74164b = zzau;
        this.f74165c = str2;
        this.f74166d = j;
    }
}
