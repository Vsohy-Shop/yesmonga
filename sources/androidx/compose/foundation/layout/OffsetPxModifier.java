package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16494m;
import androidx.constraintlayout.core.motion.utils.C16717v;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class OffsetPxModifier extends C15988w0 implements C15603u {
    @C12579k

    /* renamed from: d */
    public final C11300l<C16479d, C16494m> f6132d;

    /* renamed from: e */
    public final boolean f6133e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OffsetPxModifier(@C12579k C11300l<? super C16479d, C16494m> lVar, boolean z, @C12579k C11300l<? super C15983v0, C11079d2> lVar2) {
        super(lVar2);
        Intrinsics.checkNotNullParameter(lVar, C16717v.C16720c.f42211R);
        Intrinsics.checkNotNullParameter(lVar2, "inspectorInfo");
        this.f6132d = lVar;
        this.f6133e = z;
    }

    public boolean equals(@C12580l Object obj) {
        OffsetPxModifier offsetPxModifier;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxModifier) {
            offsetPxModifier = (OffsetPxModifier) obj;
        } else {
            offsetPxModifier = null;
        }
        if (offsetPxModifier == null) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.f6132d, (Object) offsetPxModifier.f6132d) || this.f6133e != offsetPxModifier.f6133e) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f6132d.hashCode() * 31) + Boolean.hashCode(this.f6133e);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(j);
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new OffsetPxModifier$measure$1(this, h0Var, t0), 4, (Object) null);
    }

    @C12579k
    /* renamed from: r */
    public final C11300l<C16479d, C16494m> mo7817r() {
        return this.f6132d;
    }

    /* renamed from: s */
    public final boolean mo7818s() {
        return this.f6133e;
    }

    @C12579k
    public String toString() {
        return "OffsetPxModifier(offset=" + this.f6132d + ", rtlAware=" + this.f6133e + ')';
    }
}
