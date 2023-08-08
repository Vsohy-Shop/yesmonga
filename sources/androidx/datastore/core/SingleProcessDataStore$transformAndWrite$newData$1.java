package androidx.datastore.core;

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

@C11067d(mo22501c = "androidx.datastore.core.SingleProcessDataStore$transformAndWrite$newData$1", mo22502f = "SingleProcessDataStore.kt", mo22503i = {}, mo22504l = {402}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SingleProcessDataStore$transformAndWrite$newData$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super T>, Object> {
    final /* synthetic */ T $curData;
    final /* synthetic */ C11304p<T, C11045c<? super T>, Object> $transform;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$transformAndWrite$newData$1(C11304p<? super T, ? super C11045c<? super T>, ? extends Object> pVar, T t, C11045c<? super SingleProcessDataStore$transformAndWrite$newData$1> cVar) {
        super(2, cVar);
        this.$transform = pVar;
        this.$curData = t;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SingleProcessDataStore$transformAndWrite$newData$1(this.$transform, this.$curData, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11304p<T, C11045c<? super T>, Object> pVar = this.$transform;
            T t = this.$curData;
            this.label = 1;
            obj = pVar.invoke(t, this);
            if (obj == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super T> cVar) {
        return ((SingleProcessDataStore$transformAndWrite$newData$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
