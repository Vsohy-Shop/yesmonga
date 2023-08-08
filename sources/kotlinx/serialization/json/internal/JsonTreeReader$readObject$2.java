package kotlinx.serialization.json.internal;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11102i;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.C12403k;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "kotlinx.serialization.json.internal.JsonTreeReader", mo22502f = "JsonTreeReader.kt", mo22503i = {0, 0, 0, 0}, mo22504l = {23}, mo22505m = "readObject", mo22506n = {"$this$readObject", "this_$iv", "result$iv", "key$iv"}, mo22507s = {"L$0", "L$1", "L$2", "L$3"})
@C11076d0(mo22517k = 3, mo22518mv = {1, 6, 0}, mo22520xi = 48)
public final class JsonTreeReader$readObject$2 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ JsonTreeReader this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readObject$2(JsonTreeReader jsonTreeReader, C11045c<? super JsonTreeReader$readObject$2> cVar) {
        super(cVar);
        this.this$0 = jsonTreeReader;
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo25408h((C11102i<C11079d2, C12403k>) null, this);
    }
}
