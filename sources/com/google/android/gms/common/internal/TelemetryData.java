package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;

@C40473a
@SafeParcelable.C40812a(creator = "TelemetryDataCreator")
public class TelemetryData extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C40758f0();
    @SafeParcelable.C40814c(getter = "getTelemetryConfigVersion", mo134489id = 1)

    /* renamed from: a */
    public final int f103779a;
    @Nullable
    @SafeParcelable.C40814c(getter = "getMethodInvocations", mo134489id = 2)

    /* renamed from: b */
    public List f103780b;

    @SafeParcelable.C40813b
    public TelemetryData(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) @Nullable List list) {
        this.f103779a = i;
        this.f103780b = list;
    }

    @C0363p0
    /* renamed from: M */
    public final List mo134292M() {
        return this.f103780b;
    }

    /* renamed from: Q */
    public final void mo134293Q(@C0359n0 MethodInvocation methodInvocation) {
        if (this.f103780b == null) {
            this.f103780b = new ArrayList();
        }
        this.f103780b.add(methodInvocation);
    }

    /* renamed from: i */
    public final int mo134294i() {
        return this.f103779a;
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, this.f103779a);
        C40820a.m166117d0(parcel, 2, this.f103780b, false);
        C40820a.m166112b(parcel, a);
    }
}
