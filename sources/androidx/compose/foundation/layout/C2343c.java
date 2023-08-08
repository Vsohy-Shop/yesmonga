package androidx.compose.foundation.layout;

import androidx.compose.p004ui.layout.C15531a;
import androidx.compose.p004ui.layout.C15557e0;
import androidx.compose.p004ui.layout.C15564g0;
import androidx.compose.p004ui.layout.C15568h0;
import androidx.compose.p004ui.layout.C15603u;
import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16483g;
import androidx.compose.p004ui.unit.C16504t;
import androidx.compose.p004ui.unit.C16506u;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.foundation.layout.c */
public final class C2343c extends C15988w0 implements C15603u {
    @C12579k

    /* renamed from: d */
    public final C15531a f6244d;

    /* renamed from: e */
    public final long f6245e;

    /* renamed from: f */
    public final long f6246f;

    public /* synthetic */ C2343c(C15531a aVar, long j, long j2, C11300l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, j, j2, lVar);
    }

    public boolean equals(@C12580l Object obj) {
        C2343c cVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof C2343c) {
            cVar = (C2343c) obj;
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) this.f6244d, (Object) cVar.f6244d) || !C16504t.m74683j(this.f6245e, cVar.f6245e) || !C16504t.m74683j(this.f6246f, cVar.f6246f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((this.f6244d.hashCode() * 31) + C16504t.m74688o(this.f6245e)) * 31) + C16504t.m74688o(this.f6246f);
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        float f;
        float f2;
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        C15531a aVar = this.f6244d;
        if (!C16506u.m74718s(this.f6245e)) {
            f = h0Var.mo7430q(this.f6245e);
        } else {
            f = C16483g.f40871b.mo47828e();
        }
        float f3 = f;
        if (!C16506u.m74718s(this.f6246f)) {
            f2 = h0Var.mo7430q(this.f6246f);
        } else {
            f2 = C16483g.f40871b.mo47828e();
        }
        return AlignmentLineKt.m9710c(h0Var, aVar, f3, f2, e0Var, j);
    }

    /* renamed from: r */
    public final long mo8016r() {
        return this.f6246f;
    }

    @C12579k
    /* renamed from: s */
    public final C15531a mo8017s() {
        return this.f6244d;
    }

    /* renamed from: t */
    public final long mo8018t() {
        return this.f6245e;
    }

    @C12579k
    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.f6244d + ", before=" + C16504t.m74694u(this.f6245e) + ", after=" + C16504t.m74694u(this.f6246f) + ')';
    }

    public C2343c(C15531a aVar, long j, long j2, C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        this.f6244d = aVar;
        this.f6245e = j;
        this.f6246f = j2;
    }
}
