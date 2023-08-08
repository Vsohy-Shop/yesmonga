package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16483g;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class OffsetModifier extends C15988w0 implements C15603u {

    /* renamed from: d */
    public final float f6129d;

    /* renamed from: e */
    public final float f6130e;

    /* renamed from: f */
    public final boolean f6131f;

    public /* synthetic */ OffsetModifier(float f, float f2, boolean z, C11300l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, z, lVar);
    }

    public boolean equals(@C12580l Object obj) {
        OffsetModifier offsetModifier;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetModifier) {
            offsetModifier = (OffsetModifier) obj;
        } else {
            offsetModifier = null;
        }
        if (offsetModifier == null) {
            return false;
        }
        if (!C16483g.m74440e0(this.f6129d, offsetModifier.f6129d) || !C16483g.m74440e0(this.f6130e, offsetModifier.f6130e) || this.f6131f != offsetModifier.f6131f) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((C16483g.m74442h0(this.f6129d) * 31) + C16483g.m74442h0(this.f6130e)) * 31) + Boolean.hashCode(this.f6131f);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(j);
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new OffsetModifier$measure$1(this, t0, h0Var), 4, (Object) null);
    }

    /* renamed from: r */
    public final boolean mo7810r() {
        return this.f6131f;
    }

    /* renamed from: s */
    public final float mo7811s() {
        return this.f6129d;
    }

    /* renamed from: t */
    public final float mo7812t() {
        return this.f6130e;
    }

    @C12579k
    public String toString() {
        return "OffsetModifier(x=" + C16483g.m74447o0(this.f6129d) + ", y=" + C16483g.m74447o0(this.f6130e) + ", rtlAware=" + this.f6131f + ')';
    }

    public OffsetModifier(float f, float f2, boolean z, C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        this.f6129d = f;
        this.f6130e = f2;
        this.f6131f = z;
    }
}
