package com.google.android.gms.common.moduleinstall;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.C40812a(creator = "ModuleInstallResponseCreator")
public class ModuleInstallResponse extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<ModuleInstallResponse> CREATOR = new C40885i();
    @SafeParcelable.C40814c(getter = "getSessionId", mo134489id = 1)

    /* renamed from: a */
    public final int f104014a;
    @SafeParcelable.C40814c(defaultValue = "false", getter = "getShouldUnregisterListener", mo134489id = 2)

    /* renamed from: b */
    public final boolean f104015b;

    @C40473a
    public ModuleInstallResponse(int i) {
        this(i, false);
    }

    /* renamed from: M */
    public boolean mo134554M() {
        return this.f104014a == 0;
    }

    /* renamed from: Q */
    public int mo134555Q() {
        return this.f104014a;
    }

    /* renamed from: W */
    public final boolean mo134556W() {
        return this.f104015b;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, mo134555Q());
        C40820a.m166122g(parcel, 2, this.f104015b);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public ModuleInstallResponse(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) boolean z) {
        this.f104014a = i;
        this.f104015b = z;
    }
}
