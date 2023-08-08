package androidx.compose.foundation.layout;

import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.LayoutDirection;
import androidx.compose.runtime.C8547h2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8547h2
/* renamed from: androidx.compose.foundation.layout.o */
public final class C2393o implements C2354e1 {
    @C12579k

    /* renamed from: b */
    public final C2354e1 f6306b;
    @C12579k

    /* renamed from: c */
    public final C2354e1 f6307c;

    public C2393o(@C12579k C2354e1 e1Var, @C12579k C2354e1 e1Var2) {
        Intrinsics.checkNotNullParameter(e1Var, "included");
        Intrinsics.checkNotNullParameter(e1Var2, "excluded");
        this.f6306b = e1Var;
        this.f6307c = e1Var2;
    }

    /* renamed from: a */
    public int mo7984a(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return C11479u.m44447u(this.f6306b.mo7984a(dVar) - this.f6307c.mo7984a(dVar), 0);
    }

    /* renamed from: b */
    public int mo7985b(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return C11479u.m44447u(this.f6306b.mo7985b(dVar, layoutDirection) - this.f6307c.mo7985b(dVar, layoutDirection), 0);
    }

    /* renamed from: c */
    public int mo7986c(@C12579k C16479d dVar) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        return C11479u.m44447u(this.f6306b.mo7986c(dVar) - this.f6307c.mo7986c(dVar), 0);
    }

    /* renamed from: d */
    public int mo7987d(@C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection) {
        Intrinsics.checkNotNullParameter(dVar, "density");
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        return C11479u.m44447u(this.f6306b.mo7987d(dVar, layoutDirection) - this.f6307c.mo7987d(dVar, layoutDirection), 0);
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2393o)) {
            return false;
        }
        C2393o oVar = (C2393o) obj;
        if (!Intrinsics.areEqual((Object) oVar.f6306b, (Object) this.f6306b) || !Intrinsics.areEqual((Object) oVar.f6307c, (Object) this.f6307c)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f6306b.hashCode() * 31) + this.f6307c.hashCode();
    }

    @C12579k
    public String toString() {
        return '(' + this.f6306b + " - " + this.f6307c + ')';
    }
}
