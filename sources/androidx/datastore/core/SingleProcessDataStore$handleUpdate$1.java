package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.datastore.core.SingleProcessDataStore", mo22502f = "SingleProcessDataStore.kt", mo22503i = {1, 1}, mo22504l = {276, 281, 284}, mo22505m = "handleUpdate", mo22506n = {"update", "$this$handleUpdate_u24lambda_u2d0"}, mo22507s = {"L$0", "L$1"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 5, 1}, mo22520xi = 48)
public final class SingleProcessDataStore$handleUpdate$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$handleUpdate$1(SingleProcessDataStore<T> singleProcessDataStore, C11045c<? super SingleProcessDataStore$handleUpdate$1> cVar) {
        super(cVar);
        this.this$0 = singleProcessDataStore;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo53548t((SingleProcessDataStore.C18560b.C18562b) null, this);
    }
}
