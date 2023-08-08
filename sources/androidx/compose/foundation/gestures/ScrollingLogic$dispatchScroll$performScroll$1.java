package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/geometry/f;", "delta", "a", "(J)J"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ScrollingLogic$dispatchScroll$performScroll$1 extends Lambda implements C11300l<C15094f, C15094f> {
    final /* synthetic */ int $source;
    final /* synthetic */ C2201l $this_dispatchScroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$dispatchScroll$performScroll$1(ScrollingLogic scrollingLogic, int i, C2201l lVar) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$source = i;
        this.$this_dispatchScroll = lVar;
    }

    /* renamed from: a */
    public final long mo7480a(long j) {
        NestedScrollDispatcher value = this.this$0.mo7462d().getValue();
        long d = value.mo43941d(j, this.$source);
        long u = C15094f.m64885u(j, d);
        ScrollingLogic scrollingLogic = this.this$0;
        long n = scrollingLogic.mo7472n(scrollingLogic.mo7478t(this.$this_dispatchScroll.mo7360a(scrollingLogic.mo7477s(scrollingLogic.mo7472n(u)))));
        return C15094f.m64886v(C15094f.m64886v(d, n), value.mo43939b(n, C15094f.m64885u(u, n), this.$source));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C15094f.m64868d(mo7480a(((C15094f) obj).mo42242A()));
    }
}
