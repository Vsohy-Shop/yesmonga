package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.input.nestedscroll.C15448b;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, mo22516d2 = {"Landroidx/compose/ui/geometry/f;", "delta", "a", "(J)J"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1 extends Lambda implements C11300l<C15094f, C15094f> {
    final /* synthetic */ C2201l $$this$scroll;
    final /* synthetic */ ScrollingLogic this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollingLogic$doFlingAnimation$2$outerScopeScroll$1(ScrollingLogic scrollingLogic, C2201l lVar) {
        super(1);
        this.this$0 = scrollingLogic;
        this.$$this$scroll = lVar;
    }

    /* renamed from: a */
    public final long mo7482a(long j) {
        ScrollingLogic scrollingLogic = this.this$0;
        return scrollingLogic.mo7472n(scrollingLogic.mo7459a(this.$$this$scroll, scrollingLogic.mo7472n(j), C15448b.f38435b.mo43965b()));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return C15094f.m64868d(mo7482a(((C15094f) obj).mo42242A()));
    }
}
