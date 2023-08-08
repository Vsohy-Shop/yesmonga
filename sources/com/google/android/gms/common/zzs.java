package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C40789m2;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.dynamic.C41016d;
import com.google.android.gms.dynamic.C41019f;
import javax.annotation.Nullable;

@SafeParcelable.C40812a(creator = "GoogleCertificatesQueryCreator")
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C40927q0();
    @SafeParcelable.C40814c(getter = "getCallingPackage", mo134489id = 1)

    /* renamed from: a */
    public final String f104286a;
    @Nullable
    @SafeParcelable.C40814c(getter = "getCallingCertificateBinder", mo134489id = 2, type = "android.os.IBinder")

    /* renamed from: b */
    public final C40865j0 f104287b;
    @SafeParcelable.C40814c(getter = "getAllowTestKeys", mo134489id = 3)

    /* renamed from: c */
    public final boolean f104288c;
    @SafeParcelable.C40814c(defaultValue = "false", getter = "getIgnoreTestKeysOverride", mo134489id = 4)

    /* renamed from: d */
    public final boolean f104289d;

    public zzs(String str, @Nullable C40865j0 j0Var, boolean z, boolean z2) {
        this.f104286a = str;
        this.f104287b = j0Var;
        this.f104288c = z;
        this.f104289d = z2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166108Y(parcel, 1, this.f104286a, false);
        C40865j0 j0Var = this.f104287b;
        if (j0Var == null) {
            j0Var = null;
        }
        C40820a.m166085B(parcel, 2, j0Var, false);
        C40820a.m166122g(parcel, 3, this.f104288c);
        C40820a.m166122g(parcel, 4, this.f104289d);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public zzs(@SafeParcelable.C40816e(mo134492id = 1) String str, @SafeParcelable.C40816e(mo134492id = 2) @Nullable IBinder iBinder, @SafeParcelable.C40816e(mo134492id = 3) boolean z, @SafeParcelable.C40816e(mo134492id = 4) boolean z2) {
        byte[] bArr;
        this.f104286a = str;
        C40867k0 k0Var = null;
        if (iBinder != null) {
            try {
                C41016d e = C40789m2.m165968H0(iBinder).mo134450e();
                if (e == null) {
                    bArr = null;
                } else {
                    bArr = (byte[]) C41019f.m166810O0(e);
                }
                if (bArr != null) {
                    k0Var = new C40867k0(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.f104287b = k0Var;
        this.f104288c = z;
        this.f104289d = z2;
    }
}
