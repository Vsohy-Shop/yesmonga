package androidx.compose.p004ui.input.pointer;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1", mo22502f = "SuspendingPointerInputFilter.kt", mo22503i = {}, mo22504l = {244}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt$pointerInput$2$2$1 */
public final class SuspendingPointerInputFilterKt$pointerInput$2$2$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C11304p<C15472e0, C11045c<? super C11079d2>, Object> $block;
    final /* synthetic */ SuspendingPointerInputFilter $filter;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SuspendingPointerInputFilterKt$pointerInput$2$2$1(SuspendingPointerInputFilter suspendingPointerInputFilter, C11304p<? super C15472e0, ? super C11045c<? super C11079d2>, ? extends Object> pVar, C11045c<? super SuspendingPointerInputFilterKt$pointerInput$2$2$1> cVar) {
        super(2, cVar);
        this.$filter = suspendingPointerInputFilter;
        this.$block = pVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SuspendingPointerInputFilterKt$pointerInput$2$2$1 suspendingPointerInputFilterKt$pointerInput$2$2$1 = new SuspendingPointerInputFilterKt$pointerInput$2$2$1(this.$filter, this.$block, cVar);
        suspendingPointerInputFilterKt$pointerInput$2$2$1.L$0 = obj;
        return suspendingPointerInputFilterKt$pointerInput$2$2$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            this.$filter.mo43993O3((C12074o0) this.L$0);
            C11304p<C15472e0, C11045c<? super C11079d2>, Object> pVar = this.$block;
            SuspendingPointerInputFilter suspendingPointerInputFilter = this.$filter;
            this.label = 1;
            if (pVar.invoke(suspendingPointerInputFilter, this) == h) {
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
        return ((SuspendingPointerInputFilterKt$pointerInput$2$2$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
