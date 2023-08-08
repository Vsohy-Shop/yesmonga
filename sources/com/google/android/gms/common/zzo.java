package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;

@SafeParcelable.C40812a(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new C40918o0();
    @SafeParcelable.C40814c(getter = "getCallingPackage", mo134489id = 1)

    /* renamed from: a */
    public final String f104277a;
    @SafeParcelable.C40814c(getter = "getAllowTestKeys", mo134489id = 2)

    /* renamed from: b */
    public final boolean f104278b;
    @SafeParcelable.C40814c(defaultValue = "false", getter = "getIgnoreTestKeysOverride", mo134489id = 3)

    /* renamed from: c */
    public final boolean f104279c;
    @SafeParcelable.C40814c(getter = "getCallingContextBinder", mo134489id = 4, type = "android.os.IBinder")

    /* renamed from: d */
    public final Context f104280d;
    @SafeParcelable.C40814c(getter = "getIsChimeraPackage", mo134489id = 5)

    /* renamed from: e */
    public final boolean f104281e;

    @SafeParcelable.C40813b
    public zzo(@SafeParcelable.C40816e(mo134492id = 1) String str, @SafeParcelable.C40816e(mo134492id = 2) boolean z, @SafeParcelable.C40816e(mo134492id = 3) boolean z2, @SafeParcelable.C40816e(mo134492id = 4) IBinder iBinder, @SafeParcelable.C40816e(mo134492id = 5) boolean z3) {
        this.f104277a = str;
        this.f104278b = z;
        this.f104279c = z2;
        this.f104280d = (Context) C41019f.m166810O0(C41016d.C41017a.m166799H0(iBinder));
        this.f104281e = z3;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [com.google.android.gms.dynamic.d, android.os.IBinder] */
    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f104277a, false);
        C40820a.m166122g(parcel, 2, this.f104278b);
        C40820a.m166122g(parcel, 3, this.f104279c);
        C40820a.m166085B(parcel, 4, C41019f.m166811T6(this.f104280d), false);
        C40820a.m166122g(parcel, 5, this.f104281e);
        C40820a.m166112b(parcel, a);
    }
}
