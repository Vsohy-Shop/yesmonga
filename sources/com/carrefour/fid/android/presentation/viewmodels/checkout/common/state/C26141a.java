package com.carrefour.fid.android.presentation.viewmodels.checkout.common.state;

import androidx.compose.runtime.internal.C8567o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.common.state.a */
public final class C26141a {

    /* renamed from: c */
    public static final int f63904c = 0;

    /* renamed from: a */
    public final boolean f63905a;

    /* renamed from: b */
    public final boolean f63906b;

    public C26141a() {
        this(false, false, 3, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C26141a m111733d(C26141a aVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = aVar.f63905a;
        }
        if ((i & 2) != 0) {
            z2 = aVar.f63906b;
        }
        return aVar.mo75934c(z, z2);
    }

    /* renamed from: a */
    public final boolean mo75932a() {
        return this.f63905a;
    }

    /* renamed from: b */
    public final boolean mo75933b() {
        return this.f63906b;
    }

    @C12579k
    /* renamed from: c */
    public final C26141a mo75934c(boolean z, boolean z2) {
        return new C26141a(z, z2);
    }

    /* renamed from: e */
    public final boolean mo75935e() {
        return this.f63906b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C26141a)) {
            return false;
        }
        C26141a aVar = (C26141a) obj;
        return this.f63905a == aVar.f63905a && this.f63906b == aVar.f63906b;
    }

    /* renamed from: f */
    public final boolean mo75937f() {
        return this.f63905a;
    }

    public int hashCode() {
        boolean z = this.f63905a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.f63906b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    @C12579k
    public String toString() {
        boolean z = this.f63905a;
        boolean z2 = this.f63906b;
        return "SecretCodeVerificationState(isInvalid=" + z + ", isChecking=" + z2 + ")";
    }

    public C26141a(boolean z, boolean z2) {
        this.f63905a = z;
        this.f63906b = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C26141a(boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }
}
