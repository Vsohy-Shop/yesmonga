package androidx.compose.foundation.text.selection;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.pointer.C15491o;
import androidx.compose.p004ui.input.pointer.C15507w;
import androidx.compose.p004ui.platform.C15863c4;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.text.selection.b */
public final class C2822b {
    @C12579k

    /* renamed from: a */
    public final C15863c4 f7436a;

    /* renamed from: b */
    public int f7437b;
    @C12580l

    /* renamed from: c */
    public C15507w f7438c;

    public C2822b(@C12579k C15863c4 c4Var) {
        Intrinsics.checkNotNullParameter(c4Var, "viewConfiguration");
        this.f7436a = c4Var;
    }

    /* renamed from: a */
    public final int mo9841a() {
        return this.f7437b;
    }

    @C12580l
    /* renamed from: b */
    public final C15507w mo9842b() {
        return this.f7438c;
    }

    /* renamed from: c */
    public final boolean mo9843c(@C12579k C15507w wVar, @C12579k C15507w wVar2) {
        Intrinsics.checkNotNullParameter(wVar, "prevClick");
        Intrinsics.checkNotNullParameter(wVar2, "newClick");
        if (((double) C15094f.m64877m(C15094f.m64885u(wVar2.mo44177q(), wVar.mo44177q()))) < 100.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void mo9844d(int i) {
        this.f7437b = i;
    }

    /* renamed from: e */
    public final void mo9845e(@C12580l C15507w wVar) {
        this.f7438c = wVar;
    }

    /* renamed from: f */
    public final boolean mo9846f(@C12579k C15507w wVar, @C12579k C15507w wVar2) {
        Intrinsics.checkNotNullParameter(wVar, "prevClick");
        Intrinsics.checkNotNullParameter(wVar2, "newClick");
        if (wVar2.mo44186z() - wVar.mo44186z() < this.f7436a.mo44718a()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final void mo9847g(@C12579k C15491o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "event");
        C15507w wVar = this.f7438c;
        C15507w wVar2 = oVar.mo44110e().get(0);
        if (wVar == null || !mo9846f(wVar, wVar2) || !mo9843c(wVar, wVar2)) {
            this.f7437b = 1;
        } else {
            this.f7437b++;
        }
        this.f7438c = wVar2;
    }
}
