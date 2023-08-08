package androidx.compose.foundation;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Landroidx/compose/ui/unit/q;", "size", "Lkotlin/d2;", "a", "(J)V"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class AndroidEdgeEffectOverscrollEffect$onNewSize$1 extends Lambda implements C11300l<C16500q, C11079d2> {
    final /* synthetic */ AndroidEdgeEffectOverscrollEffect this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidEdgeEffectOverscrollEffect$onNewSize$1(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect) {
        super(1);
        this.this$0 = androidEdgeEffectOverscrollEffect;
    }

    /* renamed from: a */
    public final void mo7120a(long j) {
        boolean z = !C15104m.m65014k(C16502r.m74673f(j), this.this$0.f5716o);
        this.this$0.f5716o = C16502r.m74673f(j);
        if (z) {
            this.this$0.f5704c.setSize(C16500q.m74662m(j), C16500q.m74659j(j));
            this.this$0.f5705d.setSize(C16500q.m74662m(j), C16500q.m74659j(j));
            this.this$0.f5706e.setSize(C16500q.m74659j(j), C16500q.m74662m(j));
            this.this$0.f5707f.setSize(C16500q.m74659j(j), C16500q.m74662m(j));
            this.this$0.f5709h.setSize(C16500q.m74662m(j), C16500q.m74659j(j));
            this.this$0.f5710i.setSize(C16500q.m74662m(j), C16500q.m74659j(j));
            this.this$0.f5711j.setSize(C16500q.m74659j(j), C16500q.m74662m(j));
            this.this$0.f5712k.setSize(C16500q.m74659j(j), C16500q.m74662m(j));
        }
        if (z) {
            this.this$0.mo7098B();
            this.this$0.mo7110t();
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo7120a(((C16500q) obj).mo47895q());
        return C11079d2.f28267a;
    }
}
