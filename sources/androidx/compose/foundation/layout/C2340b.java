package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16483g;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.layout.b */
public final class C2340b extends C15988w0 implements C15603u {
    @C12579k

    /* renamed from: d */
    public final C15531a f6238d;

    /* renamed from: e */
    public final float f6239e;

    /* renamed from: f */
    public final float f6240f;

    public /* synthetic */ C2340b(C15531a aVar, float f, float f2, C11300l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, f, f2, lVar);
    }

    public boolean equals(@C12580l Object obj) {
        C2340b bVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2340b) {
            bVar = (C2340b) obj;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.f6238d, (Object) bVar.f6238d) || !C16483g.m74440e0(this.f6239e, bVar.f6239e) || !C16483g.m74440e0(this.f6240f, bVar.f6240f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f6238d.hashCode() * 31) + C16483g.m74442h0(this.f6239e)) * 31) + C16483g.m74442h0(this.f6240f);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        return AlignmentLineKt.m9710c(h0Var, this.f6238d, this.f6239e, this.f6240f, e0Var, j);
    }

    /* renamed from: r */
    public final float mo8002r() {
        return this.f6240f;
    }

    @C12579k
    /* renamed from: s */
    public final C15531a mo8003s() {
        return this.f6238d;
    }

    /* renamed from: t */
    public final float mo8004t() {
        return this.f6239e;
    }

    @C12579k
    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.f6238d + ", before=" + C16483g.m74447o0(this.f6239e) + ", after=" + C16483g.m74447o0(this.f6240f) + ')';
    }

    public C2340b(C15531a aVar, float f, float f2, C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        this.f6238d = aVar;
        this.f6239e = f;
        this.f6240f = f2;
        if (!((f >= 0.0f || C16483g.m74440e0(f, C16483g.f40871b.mo47828e())) && (f2 >= 0.0f || C16483g.m74440e0(f2, C16483g.f40871b.mo47828e())))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number".toString());
        }
    }
}
