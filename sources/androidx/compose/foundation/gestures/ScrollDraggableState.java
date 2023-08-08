package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.p004ui.input.nestedscroll.C15448b;
import androidx.compose.runtime.C8578k2;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollDraggableState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,579:1\n1#2:580\n*E\n"})
public final class ScrollDraggableState implements C2193f, C2192e {
    @C12579k

    /* renamed from: a */
    public final C8578k2<ScrollingLogic> f5893a;
    @C12579k

    /* renamed from: b */
    public C2201l f5894b = ScrollableKt.f5895a;

    public ScrollDraggableState(@C12579k C8578k2<ScrollingLogic> k2Var) {
        Intrinsics.checkNotNullParameter(k2Var, "scrollLogic");
        this.f5893a = k2Var;
    }

    /* renamed from: a */
    public void mo7352a(float f) {
        ScrollingLogic value = this.f5893a.getValue();
        value.mo7459a(this.f5894b, value.mo7478t(f), C15448b.f38435b.mo43964a());
    }

    /* renamed from: b */
    public void mo7349b(float f) {
        ScrollingLogic value = this.f5893a.getValue();
        value.mo7469k(value.mo7478t(f));
    }

    @C12580l
    /* renamed from: d */
    public Object mo7350d(@C12579k MutatePriority mutatePriority, @C12579k C11304p<? super C2192e, ? super C11045c<? super C11079d2>, ? extends Object> pVar, @C12579k C11045c<? super C11079d2> cVar) {
        Object g = this.f5893a.getValue().mo7466h().mo7253g(mutatePriority, new ScrollDraggableState$drag$2(this, pVar, (C11045c<? super ScrollDraggableState$drag$2>) null), cVar);
        return g == C11063b.m42612h() ? g : C11079d2.f28267a;
    }

    @C12579k
    /* renamed from: e */
    public final C2201l mo7435e() {
        return this.f5894b;
    }

    @C12579k
    /* renamed from: f */
    public final C8578k2<ScrollingLogic> mo7436f() {
        return this.f5893a;
    }

    /* renamed from: g */
    public final void mo7437g(@C12579k C2201l lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f5894b = lVar;
    }
}
