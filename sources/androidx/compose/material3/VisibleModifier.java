package androidx.compose.material3;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class VisibleModifier extends C15988w0 implements C15603u {

    /* renamed from: d */
    public final boolean f19976d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public VisibleModifier(boolean z, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f19976d = z;
    }

    public boolean equals(@C12580l Object obj) {
        VisibleModifier visibleModifier;
        if (obj instanceof VisibleModifier) {
            visibleModifier = (VisibleModifier) obj;
        } else {
            visibleModifier = null;
        }
        if (visibleModifier != null && this.f19976d == visibleModifier.f19976d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Boolean.hashCode(this.f19976d);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(j);
        if (!this.f19976d) {
            return C15568h0.m69206r2(h0Var, 0, 0, (Map) null, VisibleModifier$measure$1.f19977f, 4, (Object) null);
        }
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new VisibleModifier$measure$2(t0), 4, (Object) null);
    }

    /* renamed from: r */
    public final boolean mo12429r() {
        return this.f19976d;
    }
}
