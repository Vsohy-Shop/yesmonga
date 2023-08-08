package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C40473a
@SafeParcelable.C40812a(creator = "ConnectionTelemetryConfigurationCreator")
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @C40473a
    @C0359n0
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C40860y1();
    @SafeParcelable.C40814c(getter = "getRootTelemetryConfiguration", mo134489id = 1)

    /* renamed from: a */
    public final RootTelemetryConfiguration f103741a;
    @SafeParcelable.C40814c(getter = "getMethodInvocationTelemetryEnabled", mo134489id = 2)

    /* renamed from: b */
    public final boolean f103742b;
    @SafeParcelable.C40814c(getter = "getMethodTimingTelemetryEnabled", mo134489id = 3)

    /* renamed from: c */
    public final boolean f103743c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getMethodInvocationMethodKeyAllowlist", mo134489id = 4)

    /* renamed from: d */
    public final int[] f103744d;
    @SafeParcelable.C40814c(getter = "getMaxMethodInvocationsLogged", mo134489id = 5)

    /* renamed from: e */
    public final int f103745e;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getMethodInvocationMethodKeyDisallowlist", mo134489id = 6)

    /* renamed from: f */
    public final int[] f103746f;

    @SafeParcelable.C40813b
    public ConnectionTelemetryConfiguration(@SafeParcelable.C40816e(mo134492id = 1) @C0359n0 RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.C40816e(mo134492id = 2) boolean z, @SafeParcelable.C40816e(mo134492id = 3) boolean z2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) int[] iArr, @SafeParcelable.C40816e(mo134492id = 5) int i, @C0363p0 @SafeParcelable.C40816e(mo134492id = 6) int[] iArr2) {
        this.f103741a = rootTelemetryConfiguration;
        this.f103742b = z;
        this.f103743c = z2;
        this.f103744d = iArr;
        this.f103745e = i;
        this.f103746f = iArr2;
    }

    @C40473a
    /* renamed from: M */
    public int mo134272M() {
        return this.f103745e;
    }

    @C0363p0
    @C40473a
    /* renamed from: Q */
    public int[] mo134273Q() {
        return this.f103744d;
    }

    @C0363p0
    @C40473a
    /* renamed from: W */
    public int[] mo134274W() {
        return this.f103746f;
    }

    @C40473a
    /* renamed from: X */
    public boolean mo134275X() {
        return this.f103742b;
    }

    @C40473a
    /* renamed from: e0 */
    public boolean mo134276e0() {
        return this.f103743c;
    }

    @C0359n0
    /* renamed from: f0 */
    public final RootTelemetryConfiguration mo134277f0() {
        return this.f103741a;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166102S(parcel, 1, this.f103741a, i, false);
        C40820a.m166122g(parcel, 2, mo134275X());
        C40820a.m166122g(parcel, 3, mo134276e0());
        C40820a.m166090G(parcel, 4, mo134273Q(), false);
        C40820a.m166089F(parcel, 5, mo134272M());
        C40820a.m166090G(parcel, 6, mo134274W(), false);
        C40820a.m166112b(parcel, a);
    }
}
