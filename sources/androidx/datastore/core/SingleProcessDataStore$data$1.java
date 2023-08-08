package androidx.datastore.core;

import androidx.datastore.core.SingleProcessDataStore;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11064a;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.datastore.core.SingleProcessDataStore$data$1", mo22502f = "SingleProcessDataStore.kt", mo22503i = {}, mo22504l = {117}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/flow/f;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class SingleProcessDataStore$data$1 extends SuspendLambda implements C11304p<C11908f<? super T>, C11045c<? super C11079d2>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SingleProcessDataStore<T> this$0;

    @C11067d(mo22501c = "androidx.datastore.core.SingleProcessDataStore$data$1$1", mo22502f = "SingleProcessDataStore.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H@"}, mo22516d2 = {"T", "Landroidx/datastore/core/j;", "it", "", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
    /* renamed from: androidx.datastore.core.SingleProcessDataStore$data$1$1 */
    public static final class C185661 extends SuspendLambda implements C11304p<C18578j<T>, C11045c<? super Boolean>, Object> {
        /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C185661 r0 = new C185661(jVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        /* renamed from: g */
        public final Object invoke(@C12579k C18578j<T> jVar, @C12580l C11045c<? super Boolean> cVar) {
            return ((C185661) create(jVar, cVar)).invokeSuspend(C11079d2.f28267a);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            C11063b.m42612h();
            if (this.label == 0) {
                C11661u0.m45747n(obj);
                C18578j<T> jVar = (C18578j) this.L$0;
                C18578j<T> jVar2 = jVar;
                boolean z = false;
                if (!(jVar2 instanceof C18568b) && !(jVar2 instanceof C18572f) && jVar == jVar2) {
                    z = true;
                }
                return C11064a.m42615a(z);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleProcessDataStore$data$1(SingleProcessDataStore<T> singleProcessDataStore, C11045c<? super SingleProcessDataStore$data$1> cVar) {
        super(2, cVar);
        this.this$0 = singleProcessDataStore;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SingleProcessDataStore$data$1 singleProcessDataStore$data$1 = new SingleProcessDataStore$data$1(this.this$0, cVar);
        singleProcessDataStore$data$1.L$0 = obj;
        return singleProcessDataStore$data$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11908f<? super T> fVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SingleProcessDataStore$data$1) create(fVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11908f fVar = (C11908f) this.L$0;
            final C18578j jVar = (C18578j) this.this$0.f47404h.getValue();
            if (!(jVar instanceof C18568b)) {
                this.this$0.f47406j.mo53539e(new SingleProcessDataStore.C18560b.C18561a(jVar));
            }
            SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1 singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1 = new SingleProcessDataStore$data$1$invokeSuspend$$inlined$map$1(C11909g.m47465k0(this.this$0.f47404h, new C185661((C11045c<? super C185661>) null)));
            this.label = 1;
            if (C11909g.m47471m0(fVar, singleProcessDataStore$data$1$invokeSuspend$$inlined$map$1, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
