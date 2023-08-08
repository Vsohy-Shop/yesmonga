package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@C40473a
@SafeParcelable.C40812a(creator = "RootTelemetryConfigurationCreator")
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @C40473a
    @C0359n0
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C40793n1();
    @SafeParcelable.C40814c(getter = "getVersion", mo134489id = 1)

    /* renamed from: a */
    public final int f103774a;
    @SafeParcelable.C40814c(getter = "getMethodInvocationTelemetryEnabled", mo134489id = 2)

    /* renamed from: b */
    public final boolean f103775b;
    @SafeParcelable.C40814c(getter = "getMethodTimingTelemetryEnabled", mo134489id = 3)

    /* renamed from: c */
    public final boolean f103776c;
    @SafeParcelable.C40814c(getter = "getBatchPeriodMillis", mo134489id = 4)

    /* renamed from: d */
    public final int f103777d;
    @SafeParcelable.C40814c(getter = "getMaxMethodInvocationsInBatch", mo134489id = 5)

    /* renamed from: e */
    public final int f103778e;

    @SafeParcelable.C40813b
    public RootTelemetryConfiguration(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) boolean z, @SafeParcelable.C40816e(mo134492id = 3) boolean z2, @SafeParcelable.C40816e(mo134492id = 4) int i2, @SafeParcelable.C40816e(mo134492id = 5) int i3) {
        this.f103774a = i;
        this.f103775b = z;
        this.f103776c = z2;
        this.f103777d = i2;
        this.f103778e = i3;
    }

    @C40473a
    /* renamed from: M */
    public int mo134286M() {
        return this.f103777d;
    }

    @C40473a
    /* renamed from: Q */
    public int mo134287Q() {
        return this.f103778e;
    }

    @C40473a
    /* renamed from: W */
    public boolean mo134288W() {
        return this.f103775b;
    }

    @C40473a
    /* renamed from: X */
    public boolean mo134289X() {
        return this.f103776c;
    }

    @C40473a
    public int getVersion() {
        return this.f103774a;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, getVersion());
        C40820a.m166122g(parcel, 2, mo134288W());
        C40820a.m166122g(parcel, 3, mo134289X());
        C40820a.m166089F(parcel, 4, mo134286M());
        C40820a.m166089F(parcel, 5, mo134287Q());
        C40820a.m166112b(parcel, a);
    }
}
