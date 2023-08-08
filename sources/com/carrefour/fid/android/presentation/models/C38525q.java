package com.carrefour.fid.android.presentation.models;

import androidx.compose.runtime.internal.C8567o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.models.q */
public final class C38525q {

    /* renamed from: b */
    public static final int f97657b = 0;

    /* renamed from: a */
    public final boolean f97658a;

    public C38525q(boolean z) {
        this.f97658a = z;
    }

    /* renamed from: c */
    public static /* synthetic */ C38525q m159805c(C38525q qVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = qVar.f97658a;
        }
        return qVar.mo122142b(z);
    }

    /* renamed from: a */
    public final boolean mo122141a() {
        return this.f97658a;
    }

    @C12579k
    /* renamed from: b */
    public final C38525q mo122142b(boolean z) {
        return new C38525q(z);
    }

    /* renamed from: d */
    public final boolean mo122143d() {
        return this.f97658a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38525q) && this.f97658a == ((C38525q) obj).f97658a;
    }

    public int hashCode() {
        boolean z = this.f97658a;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    @C12579k
    public String toString() {
        boolean z = this.f97658a;
        return "PrivacyModel(showPopIn=" + z + ")";
    }
}
