package androidx.compose.foundation.lazy;

import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.layout.C15611w0;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16478c;
import androidx.compose.runtime.C8578k2;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.C11409d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class ParentSizeModifier extends C15988w0 implements C15603u {

    /* renamed from: d */
    public final float f6453d;
    @C12580l

    /* renamed from: e */
    public final C8578k2<Integer> f6454e;
    @C12580l

    /* renamed from: f */
    public final C8578k2<Integer> f6455f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ParentSizeModifier(float f, C11300l lVar, C8578k2 k2Var, C8578k2 k2Var2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, lVar, (i & 4) != 0 ? null : k2Var, (i & 8) != 0 ? null : k2Var2);
    }

    public boolean equals(@C12580l Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ParentSizeModifier)) {
            return false;
        }
        ParentSizeModifier parentSizeModifier = (ParentSizeModifier) obj;
        if (Intrinsics.areEqual((Object) this.f6454e, (Object) parentSizeModifier.f6454e) && Intrinsics.areEqual((Object) this.f6455f, (Object) parentSizeModifier.f6455f)) {
            if (this.f6453d == parentSizeModifier.f6453d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i;
        C8578k2<Integer> k2Var = this.f6454e;
        int i2 = 0;
        if (k2Var != null) {
            i = k2Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        C8578k2<Integer> k2Var2 = this.f6455f;
        if (k2Var2 != null) {
            i2 = k2Var2.hashCode();
        }
        return ((i3 + i2) * 31) + Float.hashCode(this.f6453d);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        int i;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C8578k2<Integer> k2Var = this.f6454e;
        if (k2Var == null || k2Var.getValue().intValue() == Integer.MAX_VALUE) {
            i = Integer.MAX_VALUE;
        } else {
            i = C11409d.m43851L0(this.f6454e.getValue().floatValue() * this.f6453d);
        }
        C8578k2<Integer> k2Var2 = this.f6455f;
        if (k2Var2 == null || k2Var2.getValue().intValue() == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = C11409d.m43851L0(this.f6455f.getValue().floatValue() * this.f6453d);
        }
        if (i != Integer.MAX_VALUE) {
            i3 = i;
        } else {
            i3 = C16476b.m74364r(j);
        }
        if (i2 != Integer.MAX_VALUE) {
            i4 = i2;
        } else {
            i4 = C16476b.m74363q(j);
        }
        if (i == Integer.MAX_VALUE) {
            i = C16476b.m74362p(j);
        }
        if (i2 == Integer.MAX_VALUE) {
            i2 = C16476b.m74361o(j);
        }
        C15611w0 t0 = e0Var.mo44324t0(C16478c.m74376a(i3, i, i4, i2));
        return C15568h0.m69206r2(h0Var, t0.mo44471K0(), t0.mo44468G0(), (Map) null, new ParentSizeModifier$measure$1(t0), 4, (Object) null);
    }

    /* renamed from: r */
    public final float mo8358r() {
        return this.f6453d;
    }

    @C12580l
    /* renamed from: s */
    public final C8578k2<Integer> mo8359s() {
        return this.f6455f;
    }

    @C12580l
    /* renamed from: t */
    public final C8578k2<Integer> mo8360t() {
        return this.f6454e;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ParentSizeModifier(float f, @C12579k C11300l<? super C15983v0, C11079d2> lVar, @C12580l C8578k2<Integer> k2Var, @C12580l C8578k2<Integer> k2Var2) {
        super(lVar);
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f6453d = f;
        this.f6454e = k2Var;
        this.f6455f = k2Var2;
    }
}
