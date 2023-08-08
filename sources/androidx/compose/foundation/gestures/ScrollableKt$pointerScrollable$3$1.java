package androidx.compose.foundation.gestures;

import androidx.compose.p004ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.p004ui.unit.C16509w;
import androidx.compose.runtime.C8578k2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1", mo22502f = "Scrollable.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class ScrollableKt$pointerScrollable$3$1 extends SuspendLambda implements C11305q<C12074o0, C16509w, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C8700z0<NestedScrollDispatcher> $nestedScrollDispatcher;
    final /* synthetic */ C8578k2<ScrollingLogic> $scrollLogic;
    /* synthetic */ long J$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1", mo22502f = "Scrollable.kt", mo22503i = {}, mo22504l = {278}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$3$1$1 */
    public static final class C21561 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C21561(k2Var, j, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                long j = j;
                this.label = 1;
                if (k2Var.getValue().mo7468j(j, this) == h) {
                    return h;
                }
            } else if (i == 1) {
                C11661u0.m45747n(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C11079d2.f28267a;
        }

        @C12580l
        public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
            return ((C21561) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ScrollableKt$pointerScrollable$3$1(C8700z0<NestedScrollDispatcher> z0Var, C8578k2<ScrollingLogic> k2Var, C11045c<? super ScrollableKt$pointerScrollable$3$1> cVar) {
        super(3, cVar);
        this.$nestedScrollDispatcher = z0Var;
        this.$scrollLogic = k2Var;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo7452g(@C12579k C12074o0 o0Var, long j, @C12580l C11045c<? super C11079d2> cVar) {
        ScrollableKt$pointerScrollable$3$1 scrollableKt$pointerScrollable$3$1 = new ScrollableKt$pointerScrollable$3$1(this.$nestedScrollDispatcher, this.$scrollLogic, cVar);
        scrollableKt$pointerScrollable$3$1.J$0 = j;
        return scrollableKt$pointerScrollable$3$1.invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return mo7452g((C12074o0) obj, ((C16509w) obj2).mo47914v(), (C11045c) obj3);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            final long j = this.J$0;
            C12074o0 f = this.$nestedScrollDispatcher.getValue().mo43943f();
            final C8578k2<ScrollingLogic> k2Var = this.$scrollLogic;
            C11723c2 unused = C12038j.m48061f(f, (CoroutineContext) null, (CoroutineStart) null, new C21561((C11045c<? super C21561>) null), 3, (Object) null);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
