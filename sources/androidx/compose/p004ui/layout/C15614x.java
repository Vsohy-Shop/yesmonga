package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16500q;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11306r;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.x */
public final class C15614x extends C15988w0 implements C15578k {
    @C12579k

    /* renamed from: d */
    public final C11306r<C15568h0, C15557e0, C16476b, C16500q, C15564g0> f38755d;

    /* renamed from: e */
    public long f38756e = C16500q.f40900b.mo47897a();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15614x(@C12579k C11306r<? super C15568h0, ? super C15557e0, ? super C16476b, ? super C16500q, ? extends C15564g0> rVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar) {
        super(lVar);
        Intrinsics.checkNotNullParameter(rVar, "measureBlock");
        Intrinsics.checkNotNullParameter(lVar, "inspectorInfo");
        this.f38755d = rVar;
    }

    /* renamed from: K */
    public void mo44422K(long j) {
        this.f38756e = j;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15614x)) {
            return false;
        }
        C15614x xVar = (C15614x) obj;
        if (!Intrinsics.areEqual((Object) this.f38755d, (Object) xVar.f38755d) || !C16500q.m74657h(mo44423j(), xVar.mo44423j())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.f38755d.hashCode() * 31) + C16500q.m74663n(mo44423j());
    }

    @C12579k
    /* renamed from: i */
    public C15564g0 mo6430i(@C12579k C15568h0 h0Var, @C12579k C15557e0 e0Var, long j) {
        Intrinsics.checkNotNullParameter(h0Var, "$this$measure");
        Intrinsics.checkNotNullParameter(e0Var, "measurable");
        return this.f38755d.invoke(h0Var, e0Var, C16476b.m74348b(j), C16500q.m74651b(mo44423j()));
    }

    /* renamed from: j */
    public long mo44423j() {
        return this.f38756e;
    }

    @C12579k
    /* renamed from: r */
    public final C11306r<C15568h0, C15557e0, C16476b, C16500q, C15564g0> mo44492r() {
        return this.f38755d;
    }
}
