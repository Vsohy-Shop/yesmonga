package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.datastore.core.SingleProcessDataStore$actor$3", mo22502f = "SingleProcessDataStore.kt", mo22503i = {}, mo22504l = {239, 242}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"T", "Landroidx/datastore/core/SingleProcessDataStore$b;", "msg", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SingleProcessDataStore$actor$3 extends SuspendLambda implements C11304p<SingleProcessDataStore.C18560b<T>, C11045c<? super C11079d2>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$actor$3(SingleProcessDataStore<T> singleProcessDataStore, C11045c<? super SingleProcessDataStore$actor$3> cVar) {
        super(2, cVar);
        this.this$0 = singleProcessDataStore;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SingleProcessDataStore$actor$3 singleProcessDataStore$actor$3 = new SingleProcessDataStore$actor$3(this.this$0, cVar);
        singleProcessDataStore$actor$3.L$0 = obj;
        return singleProcessDataStore$actor$3;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k SingleProcessDataStore.C18560b<T> bVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SingleProcessDataStore$actor$3) create(bVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            SingleProcessDataStore.C18560b bVar = (SingleProcessDataStore.C18560b) this.L$0;
            if (bVar instanceof SingleProcessDataStore.C18560b.C18561a) {
                this.label = 1;
                if (this.this$0.mo53547s((SingleProcessDataStore.C18560b.C18561a) bVar, this) == h) {
                    return h;
                }
            } else if (bVar instanceof SingleProcessDataStore.C18560b.C18562b) {
                this.label = 2;
                if (this.this$0.mo53548t((SingleProcessDataStore.C18560b.C18562b) bVar, this) == h) {
                    return h;
                }
            }
        } else if (i == 1 || i == 2) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
