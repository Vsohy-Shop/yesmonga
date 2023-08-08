package kotlin;

import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.j */
public final class C11277j<T, R> extends C11102i<T, R> implements C11045c<R> {
    @C12579k

    /* renamed from: a */
    public C11305q<? super C11102i<?, ?>, Object, ? super C11045c<Object>, ? extends Object> f28412a;
    @C12580l

    /* renamed from: b */
    public Object f28413b;
    @C12580l

    /* renamed from: c */
    public C11045c<Object> f28414c = this;
    @C12579k

    /* renamed from: d */
    public Object f28415d = C11098h.f28271a;

    @C11363r0({"SMAP\nContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Continuation.kt\nkotlin/coroutines/ContinuationKt$Continuation$1\n+ 2 DeepRecursive.kt\nkotlin/DeepRecursiveScopeImpl\n*L\n1#1,161:1\n184#2,6:162\n*E\n"})
    /* renamed from: kotlin.j$a */
    public static final class C11278a implements C11045c<Object> {

        /* renamed from: a */
        public final /* synthetic */ CoroutineContext f28416a;

        /* renamed from: b */
        public final /* synthetic */ C11277j f28417b;

        /* renamed from: c */
        public final /* synthetic */ C11305q f28418c;

        /* renamed from: d */
        public final /* synthetic */ C11045c f28419d;

        public C11278a(CoroutineContext coroutineContext, C11277j jVar, C11305q qVar, C11045c cVar) {
            this.f28416a = coroutineContext;
            this.f28417b = jVar;
            this.f28418c = qVar;
            this.f28419d = cVar;
        }

        @C12579k
        public CoroutineContext getContext() {
            return this.f28416a;
        }

        public void resumeWith(@C12579k Object obj) {
            this.f28417b.f28412a = this.f28418c;
            this.f28417b.f28414c = this.f28419d;
            this.f28417b.f28415d = obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11277j(@C12579k C11305q<? super C11102i<T, R>, ? super T, ? super C11045c<? super R>, ? extends Object> qVar, T t) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(qVar, C28534f.f69159i0);
        this.f28412a = qVar;
        this.f28413b = t;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
    }

    @C12580l
    /* renamed from: a */
    public Object mo22532a(T t, @C12579k C11045c<? super R> cVar) {
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f28414c = cVar;
        this.f28413b = t;
        Object h = C11063b.m42612h();
        if (h == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return h;
    }

    @C12580l
    /* renamed from: b */
    public <U, S> Object mo22533b(@C12579k C11094g<U, S> gVar, U u, @C12579k C11045c<? super S> cVar) {
        C11305q<C11102i<U, S>, U, C11045c<? super S>, Object> a = gVar.mo22530a();
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        C11305q<? super C11102i<?, ?>, Object, ? super C11045c<Object>, ? extends Object> qVar = this.f28412a;
        if (a != qVar) {
            this.f28412a = a;
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f28414c = mo22690i(qVar, cVar);
        } else {
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f28414c = cVar;
        }
        this.f28413b = u;
        Object h = C11063b.m42612h();
        if (h == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return h;
    }

    @C12579k
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.f28243a;
    }

    /* renamed from: i */
    public final C11045c<Object> mo22690i(C11305q<? super C11102i<?, ?>, Object, ? super C11045c<Object>, ? extends Object> qVar, C11045c<Object> cVar) {
        return new C11278a(EmptyCoroutineContext.f28243a, this, qVar, cVar);
    }

    /* renamed from: k */
    public final R mo22691k() {
        while (true) {
            R r = this.f28415d;
            C11045c<Object> cVar = this.f28414c;
            if (cVar == null) {
                C11661u0.m45747n(r);
                return r;
            } else if (Result.m38704d(C11098h.f28271a, r)) {
                try {
                    C11305q<? super C11102i<?, ?>, Object, ? super C11045c<Object>, ? extends Object> qVar = this.f28412a;
                    Object obj = this.f28413b;
                    Intrinsics.checkNotNull(qVar, "null cannot be cast to non-null type kotlin.Function3<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, P of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn>, kotlin.Any?>");
                    Object invoke = ((C11305q) C11370u0.m43701q(qVar, 3)).invoke(this, obj, cVar);
                    if (invoke != C11063b.m42612h()) {
                        Result.C10852a aVar = Result.f28060a;
                        cVar.resumeWith(Result.m38702b(invoke));
                    }
                } catch (Throwable th) {
                    Result.C10852a aVar2 = Result.f28060a;
                    cVar.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
                }
            } else {
                this.f28415d = C11098h.f28271a;
                cVar.resumeWith(r);
            }
        }
    }

    public void resumeWith(@C12579k Object obj) {
        this.f28414c = null;
        this.f28415d = obj;
    }
}
