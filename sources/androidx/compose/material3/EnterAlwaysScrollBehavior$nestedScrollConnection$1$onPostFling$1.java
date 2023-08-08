package androidx.compose.material3;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material3.EnterAlwaysScrollBehavior$nestedScrollConnection$1", mo22502f = "AppBar.kt", mo22503i = {0, 0}, mo22504l = {1499, 1500}, mo22505m = "onPostFling-RZ2iAVY", mo22506n = {"this", "available"}, mo22507s = {"L$0", "J$0"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EnterAlwaysScrollBehavior$nestedScrollConnection$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1(EnterAlwaysScrollBehavior$nestedScrollConnection$1 enterAlwaysScrollBehavior$nestedScrollConnection$1, C11045c<? super EnterAlwaysScrollBehavior$nestedScrollConnection$1$onPostFling$1> cVar) {
        super(cVar);
        this.this$0 = enterAlwaysScrollBehavior$nestedScrollConnection$1;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo7455a(0, 0, this);
    }
}
