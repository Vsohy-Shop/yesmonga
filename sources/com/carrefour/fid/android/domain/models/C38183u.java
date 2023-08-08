package com.carrefour.fid.android.domain.models;

import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.models.u */
public final class C38183u {

    /* renamed from: b */
    public static final int f96736b = 0;

    /* renamed from: a */
    public final boolean f96737a;

    public C38183u(boolean z) {
        this.f96737a = z;
    }

    /* renamed from: c */
    public static /* synthetic */ C38183u m158356c(C38183u uVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = uVar.f96737a;
        }
        return uVar.mo119568b(z);
    }

    /* renamed from: a */
    public final boolean mo119567a() {
        return this.f96737a;
    }

    @C12579k
    /* renamed from: b */
    public final C38183u mo119568b(boolean z) {
        return new C38183u(z);
    }

    /* renamed from: d */
    public final boolean mo119569d() {
        return this.f96737a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38183u) && this.f96737a == ((C38183u) obj).f96737a;
    }

    public int hashCode() {
        boolean z = this.f96737a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f96737a;
        return "PrivacyDomain(shouldShowConsentPopPup=" + z + ")";
    }
}
