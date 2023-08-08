package com.carrefour.fid.android.shared.extension;

import androidx.compose.runtime.internal.C8567o;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.extension.g0 */
public final class C28756g0 {

    /* renamed from: f */
    public static final int f70412f = 8;
    @C12579k

    /* renamed from: a */
    public final AppBarLayout f70413a;

    /* renamed from: b */
    public final int f70414b;

    /* renamed from: c */
    public final float f70415c;

    /* renamed from: d */
    public final boolean f70416d;

    /* renamed from: e */
    public final float f70417e;

    public C28756g0(@C12579k AppBarLayout appBarLayout, int i, float f, boolean z, float f2) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        this.f70413a = appBarLayout;
        this.f70414b = i;
        this.f70415c = f;
        this.f70416d = z;
        this.f70417e = f2;
    }

    /* renamed from: g */
    public static /* synthetic */ C28756g0 m119049g(C28756g0 g0Var, AppBarLayout appBarLayout, int i, float f, boolean z, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            appBarLayout = g0Var.f70413a;
        }
        if ((i2 & 2) != 0) {
            i = g0Var.f70414b;
        }
        int i3 = i;
        if ((i2 & 4) != 0) {
            f = g0Var.f70415c;
        }
        float f3 = f;
        if ((i2 & 8) != 0) {
            z = g0Var.f70416d;
        }
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            f2 = g0Var.f70417e;
        }
        return g0Var.mo83747f(appBarLayout, i3, f3, z2, f2);
    }

    @C12579k
    /* renamed from: a */
    public final AppBarLayout mo83741a() {
        return this.f70413a;
    }

    /* renamed from: b */
    public final int mo83742b() {
        return this.f70414b;
    }

    /* renamed from: c */
    public final float mo83743c() {
        return this.f70415c;
    }

    /* renamed from: d */
    public final boolean mo83744d() {
        return this.f70416d;
    }

    /* renamed from: e */
    public final float mo83745e() {
        return this.f70417e;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C28756g0)) {
            return false;
        }
        C28756g0 g0Var = (C28756g0) obj;
        return Intrinsics.areEqual((Object) this.f70413a, (Object) g0Var.f70413a) && this.f70414b == g0Var.f70414b && Float.compare(this.f70415c, g0Var.f70415c) == 0 && this.f70416d == g0Var.f70416d && Float.compare(this.f70417e, g0Var.f70417e) == 0;
    }

    @C12579k
    /* renamed from: f */
    public final C28756g0 mo83747f(@C12579k AppBarLayout appBarLayout, int i, float f, boolean z, float f2) {
        Intrinsics.checkNotNullParameter(appBarLayout, "appBarLayout");
        return new C28756g0(appBarLayout, i, f, z, f2);
    }

    @C12579k
    /* renamed from: h */
    public final AppBarLayout mo83748h() {
        return this.f70413a;
    }

    public int hashCode() {
        int hashCode = ((((this.f70413a.hashCode() * 31) + Integer.hashCode(this.f70414b)) * 31) + Float.hashCode(this.f70415c)) * 31;
        boolean z = this.f70416d;
        if (z) {
            z = true;
        }
        return ((hashCode + (z ? 1 : 0)) * 31) + Float.hashCode(this.f70417e);
    }

    /* renamed from: i */
    public final float mo83750i() {
        return this.f70415c;
    }

    /* renamed from: j */
    public final float mo83751j() {
        return this.f70417e;
    }

    /* renamed from: k */
    public final int mo83752k() {
        return this.f70414b;
    }

    /* renamed from: l */
    public final boolean mo83753l() {
        return this.f70416d;
    }

    @C12579k
    public String toString() {
        AppBarLayout appBarLayout = this.f70413a;
        int i = this.f70414b;
        float f = this.f70415c;
        boolean z = this.f70416d;
        float f2 = this.f70417e;
        return "OffsetChangedEvent(appBarLayout=" + appBarLayout + ", verticalOffset=" + i + ", offsetAlpha=" + f + ", isCollapsed=" + z + ", offsetTextSize=" + f2 + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C28756g0(AppBarLayout appBarLayout, int i, float f, boolean z, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(appBarLayout, i, f, (i2 & 8) != 0 ? false : z, f2);
    }
}
