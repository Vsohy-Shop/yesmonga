package androidx.compose.p004ui.text;

import androidx.compose.p004ui.text.style.C16449r;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.runtime.C8585m0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
/* renamed from: androidx.compose.ui.text.e */
public final class C16162e {
    @C12579k

    /* renamed from: a */
    public final C16258g0 f40193a;

    public C16162e(@C12579k C16258g0 g0Var) {
        Intrinsics.checkNotNullParameter(g0Var, "textLayoutInput");
        this.f40193a = g0Var;
    }

    @C12579k
    /* renamed from: a */
    public final C16258g0 mo46744a() {
        return this.f40193a;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16162e)) {
            return false;
        }
        C16258g0 g0Var = this.f40193a;
        C16162e eVar = (C16162e) obj;
        if (Intrinsics.areEqual((Object) g0Var.mo47040n(), (Object) eVar.f40193a.mo47040n()) && g0Var.mo47039m().mo47489R(eVar.f40193a.mo47039m()) && Intrinsics.areEqual((Object) g0Var.mo47036i(), (Object) eVar.f40193a.mo47036i()) && g0Var.mo47033g() == eVar.f40193a.mo47033g() && g0Var.mo47038l() == eVar.f40193a.mo47038l() && C16449r.m74263g(g0Var.mo47034h(), eVar.f40193a.mo47034h()) && Intrinsics.areEqual((Object) g0Var.mo47029d(), (Object) eVar.f40193a.mo47029d()) && g0Var.mo47032f() == eVar.f40193a.mo47032f() && g0Var.mo47030e() == eVar.f40193a.mo47030e() && C16476b.m74362p(g0Var.mo47028c()) == C16476b.m74362p(eVar.f40193a.mo47028c()) && C16476b.m74361o(g0Var.mo47028c()) == C16476b.m74361o(eVar.f40193a.mo47028c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        C16258g0 g0Var = this.f40193a;
        return (((((((((((((((((((g0Var.mo47040n().hashCode() * 31) + g0Var.mo47039m().mo47490S()) * 31) + g0Var.mo47036i().hashCode()) * 31) + g0Var.mo47033g()) * 31) + Boolean.hashCode(g0Var.mo47038l())) * 31) + C16449r.m74264h(g0Var.mo47034h())) * 31) + g0Var.mo47029d().hashCode()) * 31) + g0Var.mo47032f().hashCode()) * 31) + g0Var.mo47030e().hashCode()) * 31) + Integer.hashCode(C16476b.m74362p(g0Var.mo47028c()))) * 31) + Integer.hashCode(C16476b.m74361o(g0Var.mo47028c()));
    }
}
