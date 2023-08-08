package androidx.compose.p004ui.layout;

import androidx.compose.p004ui.platform.C15983v0;
import androidx.compose.p004ui.platform.C15988w0;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: androidx.compose.ui.layout.t0 */
public final class C15602t0 extends C15988w0 implements C15599s0 {
    @C12579k

    /* renamed from: d */
    public final C11300l<C16500q, C11079d2> f38741d;

    /* renamed from: e */
    public long f38742e = C16502r.m74668a(Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15602t0(@C12579k C11300l<? super C16500q, C11079d2> lVar, @C12579k C11300l<? super C15983v0, C11079d2> lVar2) {
        super(lVar2);
        Intrinsics.checkNotNullParameter(lVar, "onSizeChanged");
        Intrinsics.checkNotNullParameter(lVar2, "inspectorInfo");
        this.f38741d = lVar;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15602t0)) {
            return false;
        }
        return Intrinsics.areEqual((Object) this.f38741d, (Object) ((C15602t0) obj).f38741d);
    }

    public int hashCode() {
        return this.f38741d.hashCode();
    }

    /* renamed from: k */
    public void mo7337k(long j) {
        if (!C16500q.m74657h(this.f38742e, j)) {
            this.f38741d.invoke(C16500q.m74651b(j));
            this.f38742e = j;
        }
    }

    @C12579k
    /* renamed from: r */
    public final C11300l<C16500q, C11079d2> mo44463r() {
        return this.f38741d;
    }
}
