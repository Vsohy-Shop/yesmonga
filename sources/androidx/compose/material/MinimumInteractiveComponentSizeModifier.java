package androidx.compose.material;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.unit.C16491k;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class MinimumInteractiveComponentSizeModifier implements C15603u {

    /* renamed from: a */
    public final long f7706a;

    public /* synthetic */ MinimumInteractiveComponentSizeModifier(long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(j);
    }

    /* renamed from: a */
    public final long mo10251a() {
        return this.f7706a;
    }

    public boolean equals(@C12580l Object obj) {
        MinimumInteractiveComponentSizeModifier minimumInteractiveComponentSizeModifier;
        if (obj instanceof MinimumInteractiveComponentSizeModifier) {
            minimumInteractiveComponentSizeModifier = (MinimumInteractiveComponentSizeModifier) obj;
        } else {
            minimumInteractiveComponentSizeModifier = null;
        }
        if (minimumInteractiveComponentSizeModifier == null) {
            return false;
        }
        return C16491k.m74554l(this.f7706a, minimumInteractiveComponentSizeModifier.f7706a);
    }

    public int hashCode() {
        return C16491k.m74560r(this.f7706a);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15611w0 t0 = e0Var.mo44324t0(j);
        int max = Math.max(t0.mo44471K0(), h0Var.mo7429n2(C16491k.m74558p(this.f7706a)));
        int max2 = Math.max(t0.mo44468G0(), h0Var.mo7429n2(C16491k.m74555m(this.f7706a)));
        return C15568h0.m69206r2(h0Var, max, max2, (Map) null, new MinimumInteractiveComponentSizeModifier$measure$1(max, t0, max2), 4, (Object) null);
    }

    public MinimumInteractiveComponentSizeModifier(long j) {
        this.f7706a = j;
    }
}
