package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.foundation.layout.b0 */
public final class C2341b0 implements C2354e1 {
    @C12579k

    /* renamed from: b */
    public final C2354e1 f6241b;

    /* renamed from: c */
    public final int f6242c;

    public /* synthetic */ C2341b0(C2354e1 e1Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(e1Var, i);
    }

    /* renamed from: a */
    public int mo7984a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        if (C2401q1.m10553q(this.f6242c, C2401q1.f6318b.mo8150k())) {
            return this.f6241b.mo7984a(dVar);
        }
        return 0;
    }

    /* renamed from: b */
    public int mo7985b(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        int i;
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            i = C2401q1.f6318b.mo8142c();
        } else {
            i = C2401q1.f6318b.mo8143d();
        }
        if (C2401q1.m10553q(this.f6242c, i)) {
            return this.f6241b.mo7985b(dVar, layoutDirection);
        }
        return 0;
    }

    /* renamed from: c */
    public int mo7986c(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        if (C2401q1.m10553q(this.f6242c, C2401q1.f6318b.mo8144e())) {
            return this.f6241b.mo7986c(dVar);
        }
        return 0;
    }

    /* renamed from: d */
    public int mo7987d(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        int i;
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        if (layoutDirection == LayoutDirection.Ltr) {
            i = C2401q1.f6318b.mo8140a();
        } else {
            i = C2401q1.f6318b.mo8141b();
        }
        if (C2401q1.m10553q(this.f6242c, i)) {
            return this.f6241b.mo7987d(dVar, layoutDirection);
        }
        return 0;
    }

    @C12579k
    /* renamed from: e */
    public final C2354e1 mo8006e() {
        return this.f6241b;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2341b0)) {
            return false;
        }
        C2341b0 b0Var = (C2341b0) obj;
        if (!Intrinsics.areEqual((Object) this.f6241b, (Object) b0Var.f6241b) || !C2401q1.m10552p(this.f6242c, b0Var.f6242c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final int mo8008f() {
        return this.f6242c;
    }

    public int hashCode() {
        return (this.f6241b.hashCode() * 31) + C2401q1.m10554r(this.f6242c);
    }

    @C12579k
    public String toString() {
        return '(' + this.f6241b + " only " + C2401q1.m10556t(this.f6242c) + ')';
    }

    public C2341b0(C2354e1 e1Var, int i) {
        this.f6241b = e1Var;
        this.f6242c = i;
    }
}
