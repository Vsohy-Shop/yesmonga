package androidx.compose.p004ui.input.nestedscroll;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", mo22502f = "NestedScrollModifier.kt", mo22503i = {}, mo22504l = {217}, mo22505m = "dispatchPostFling-RZ2iAVY", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1 */
public final class NestedScrollDispatcher$dispatchPostFling$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollDispatcher this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollDispatcher$dispatchPostFling$1(NestedScrollDispatcher nestedScrollDispatcher, C11045c<? super NestedScrollDispatcher$dispatchPostFling$1> cVar) {
        super(cVar);
        this.this$0 = nestedScrollDispatcher;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo43938a(0, 0, this);
    }
}
