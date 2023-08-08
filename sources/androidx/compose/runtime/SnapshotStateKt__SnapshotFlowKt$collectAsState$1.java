package androidx.compose.runtime;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", mo22502f = "SnapshotFlow.kt", mo22503i = {}, mo22504l = {65, 66}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
public final class SnapshotStateKt__SnapshotFlowKt$collectAsState$1 extends SuspendLambda implements C11304p<C8546h1<R>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ CoroutineContext $context;
    final /* synthetic */ C11907e<T> $this_collectAsState;
    private /* synthetic */ Object L$0;
    int label;

    @C11067d(mo22501c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", mo22502f = "SnapshotFlow.kt", mo22503i = {}, mo22504l = {67}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2 */
    public static final class C83992 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2$a */
        public static final class C8400a implements C11908f<T> {

            /* renamed from: a */
            public final /* synthetic */ C8546h1<R> f22754a;

            public C8400a(C8546h1<R> h1Var) {
                this.f22754a = h1Var;
            }

            @C12580l
            public final Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
                this.f22754a.setValue(t);
                return C11079d2.f28267a;
            }
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C83992(eVar2, h1Var, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11907e<T> eVar = eVar2;
                C8400a aVar = new C8400a(h1Var);
                this.label = 1;
                if (eVar.collect(aVar, this) == h) {
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
            return ((C83992) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
        }
    }

    /* renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$a */
    public static final class C8401a implements C11908f<T> {

        /* renamed from: a */
        public final /* synthetic */ C8546h1<R> f22755a;

        public C8401a(C8546h1<R> h1Var) {
            this.f22755a = h1Var;
        }

        @C12580l
        public final Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
            this.f22755a.setValue(t);
            return C11079d2.f28267a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapshotStateKt__SnapshotFlowKt$collectAsState$1(CoroutineContext coroutineContext, C11907e<? extends T> eVar, C11045c<? super SnapshotStateKt__SnapshotFlowKt$collectAsState$1> cVar) {
        super(2, cVar);
        this.$context = coroutineContext;
        this.$this_collectAsState = eVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SnapshotStateKt__SnapshotFlowKt$collectAsState$1 snapshotStateKt__SnapshotFlowKt$collectAsState$1 = new SnapshotStateKt__SnapshotFlowKt$collectAsState$1(this.$context, this.$this_collectAsState, cVar);
        snapshotStateKt__SnapshotFlowKt$collectAsState$1.L$0 = obj;
        return snapshotStateKt__SnapshotFlowKt$collectAsState$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C8546h1<R> h1Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SnapshotStateKt__SnapshotFlowKt$collectAsState$1) create(h1Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            final C8546h1 h1Var = (C8546h1) this.L$0;
            if (Intrinsics.areEqual((Object) this.$context, (Object) EmptyCoroutineContext.f28243a)) {
                C11907e<T> eVar = this.$this_collectAsState;
                C8401a aVar = new C8401a(h1Var);
                this.label = 1;
                if (eVar.collect(aVar, this) == h) {
                    return h;
                }
            } else {
                CoroutineContext coroutineContext = this.$context;
                final C11907e<T> eVar2 = this.$this_collectAsState;
                C83992 r3 = new C83992((C11045c<? super C83992>) null);
                this.label = 2;
                if (C11965h.m47673h(coroutineContext, r3, this) == h) {
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
