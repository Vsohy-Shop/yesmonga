package androidx.compose.material;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.material.SnackbarHostState", mo22502f = "SnackbarHost.kt", mo22503i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, mo22504l = {379, 382}, mo22505m = "showSnackbar", mo22506n = {"this", "message", "actionLabel", "duration", "$this$withLock_u24default$iv", "this", "message", "actionLabel", "duration", "$this$withLock_u24default$iv", "$completion$iv"}, mo22507s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnackbarHostState$showSnackbar$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SnackbarHostState this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$showSnackbar$1(SnackbarHostState snackbarHostState, C11045c<? super SnackbarHostState$showSnackbar$1> cVar) {
        super(cVar);
        this.this$0 = snackbarHostState;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo10436d((String) null, (String) null, (SnackbarDuration) null, this);
    }
}
