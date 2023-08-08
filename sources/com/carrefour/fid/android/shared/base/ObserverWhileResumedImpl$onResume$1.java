package com.carrefour.fid.android.shared.base;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.base.ObserverWhileResumedImpl$onResume$1", mo22502f = "Lifecycle.kt", mo22503i = {}, mo22504l = {122}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H@"}, mo22516d2 = {"T", "Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ObserverWhileResumedImpl$onResume$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    int label;
    final /* synthetic */ ObserverWhileResumedImpl<T> this$0;

    /* renamed from: com.carrefour.fid.android.shared.base.ObserverWhileResumedImpl$onResume$1$a */
    public static final class C28466a implements C11908f<T> {

        /* renamed from: a */
        public final /* synthetic */ ObserverWhileResumedImpl<T> f68578a;

        public C28466a(ObserverWhileResumedImpl<T> observerWhileResumedImpl) {
            this.f68578a = observerWhileResumedImpl;
        }

        @C12580l
        public final Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
            Object invoke = this.f68578a.f68576b.invoke(t, cVar);
            return invoke == C11063b.m42612h() ? invoke : C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ObserverWhileResumedImpl$onResume$1(ObserverWhileResumedImpl<T> observerWhileResumedImpl, C11045c<? super ObserverWhileResumedImpl$onResume$1> cVar) {
        super(2, cVar);
        this.this$0 = observerWhileResumedImpl;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new ObserverWhileResumedImpl$onResume$1(this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e b = this.this$0.f68575a;
            C28466a aVar = new C28466a(this.this$0);
            this.label = 1;
            if (b.collect(aVar, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ObserverWhileResumedImpl$onResume$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
