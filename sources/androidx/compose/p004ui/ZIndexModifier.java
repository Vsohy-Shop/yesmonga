package androidx.compose.p004ui;

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

/* renamed from: androidx.compose.ui.ZIndexModifier */
public final class ZIndexModifier extends C15988w0 implements C15603u {

    /* renamed from: d */
    public final float f23342d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZIndexModifier(float f, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f23342d = f;
    }

    public boolean equals(@C12580l Object obj) {
        ZIndexModifier zIndexModifier;
        if (obj instanceof ZIndexModifier) {
            zIndexModifier = (ZIndexModifier) obj;
        } else {
            zIndexModifier = null;
        }
        if (zIndexModifier != null && this.f23342d == zIndexModifier.f23342d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Float.hashCode(this.f23342d);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(j);
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new ZIndexModifier$measure$1(t0, this), 4, (Object) null);
    }

    @C12579k
    public String toString() {
        return "ZIndexModifier(zIndex=" + this.f23342d + ')';
    }
}
