package kotlinx.coroutines.selects;

import kotlin.C11076d0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.coroutines.selects.SelectImplementation", mo22502f = "Select.kt", mo22503i = {}, mo22504l = {706}, mo22505m = "processResultAndInvokeBlockRecoveringException", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
/* renamed from: kotlinx.coroutines.selects.SelectImplementation$processResultAndInvokeBlockRecoveringException$1 */
public final class C12120xf491fb2a extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SelectImplementation<R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12120xf491fb2a(SelectImplementation<R> selectImplementation, C11045c<? super C12120xf491fb2a> cVar) {
        super(cVar);
        this.this$0 = selectImplementation;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo24697E((SelectImplementation<R>.a) null, (Object) null, this);
    }
}
