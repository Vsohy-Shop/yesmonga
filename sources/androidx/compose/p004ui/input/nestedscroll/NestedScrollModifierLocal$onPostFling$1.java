package androidx.compose.p004ui.input.nestedscroll;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", mo22502f = "NestedScrollModifierLocal.kt", mo22503i = {0, 0, 0, 1}, mo22504l = {94, 96}, mo22505m = "onPostFling-RZ2iAVY", mo22506n = {"this", "consumed", "available", "selfConsumed"}, mo22507s = {"L$0", "J$0", "J$1", "J$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal$onPostFling$1 */
public final class NestedScrollModifierLocal$onPostFling$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollModifierLocal this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NestedScrollModifierLocal$onPostFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, C11045c<? super NestedScrollModifierLocal$onPostFling$1> cVar) {
        super(cVar);
        this.this$0 = nestedScrollModifierLocal;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7455a(0, 0, this);
    }
}
