package kotlinx.coroutines.flow.internal;

import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.C11287e;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.C11804f2;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0015¢\u0006\u0004\b-\u0010.J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\n\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\r\u001a\u00020\fH\u0016J\u001b\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u0004\u0018\u00010\b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00112\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u000e\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0002R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\u00158\u0000X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0000X\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b$\u0010 R\u001e\u0010%\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0014\u0010,\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, mo22516d2 = {"Lkotlinx/coroutines/flow/internal/SafeCollector;", "T", "Lkotlinx/coroutines/flow/f;", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/c;", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/Result;", "", "result", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/d2;", "releaseIntercepted", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlin/coroutines/c;", "uCont", "h", "(Lkotlin/coroutines/c;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "currentContext", "previousContext", "g", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/internal/f;", "exception", "i", "collector", "Lkotlinx/coroutines/flow/f;", "collectContext", "Lkotlin/coroutines/CoroutineContext;", "", "collectContextSize", "I", "lastEmissionContext", "completion", "Lkotlin/coroutines/c;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "<init>", "(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/CoroutineContext;)V", "kotlinx-coroutines-core"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSafeCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.kt\nkotlinx/coroutines/flow/internal/SafeCollector\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,156:1\n1#2:157\n*E\n"})
public final class SafeCollector<T> extends ContinuationImpl implements C11908f<T>, C11066c {
    @C12579k
    @C11287e
    public final CoroutineContext collectContext;
    @C11287e
    public final int collectContextSize;
    @C12579k
    @C11287e
    public final C11908f<T> collector;
    @C12580l
    private C11045c<? super C11079d2> completion;
    @C12580l
    private CoroutineContext lastEmissionContext;

    public SafeCollector(@C12579k C11908f<? super T> fVar, @C12579k CoroutineContext coroutineContext) {
        super(C11934j.f29513a, EmptyCoroutineContext.f28243a);
        this.collector = fVar;
        this.collectContext = coroutineContext;
        this.collectContextSize = ((Number) coroutineContext.mo7446l(0, SafeCollector$collectContextSize$1.f29499f)).intValue();
    }

    @C12580l
    public Object emit(T t, @C12579k C11045c<? super C11079d2> cVar) {
        try {
            Object h = mo24252h(cVar, t);
            if (h == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
            if (h == C11063b.m42612h()) {
                return h;
            }
            return C11079d2.f28267a;
        } catch (Throwable th) {
            this.lastEmissionContext = new C11929f(th, cVar.getContext());
            throw th;
        }
    }

    /* renamed from: g */
    public final void mo24251g(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, T t) {
        if (coroutineContext2 instanceof C11929f) {
            mo24253i((C11929f) coroutineContext2, t);
        }
        SafeCollector_commonKt.m47565a(this, coroutineContext);
    }

    @C12580l
    public C11066c getCallerFrame() {
        C11045c<? super C11079d2> cVar = this.completion;
        if (cVar instanceof C11066c) {
            return (C11066c) cVar;
        }
        return null;
    }

    @C12579k
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.lastEmissionContext;
        return coroutineContext == null ? EmptyCoroutineContext.f28243a : coroutineContext;
    }

    @C12580l
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public final Object mo24252h(C11045c<? super C11079d2> cVar, T t) {
        CoroutineContext context = cVar.getContext();
        C11804f2.m46978z(context);
        CoroutineContext coroutineContext = this.lastEmissionContext;
        if (coroutineContext != context) {
            mo24251g(context, coroutineContext, t);
            this.lastEmissionContext = context;
        }
        this.completion = cVar;
        C11305q a = SafeCollectorKt.f29500a;
        C11908f<T> fVar = this.collector;
        Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object invoke = a.invoke(fVar, t, this);
        if (!Intrinsics.areEqual(invoke, C11063b.m42612h())) {
            this.completion = null;
        }
        return invoke;
    }

    /* renamed from: i */
    public final void mo24253i(C11929f fVar, Object obj) {
        throw new IllegalStateException(StringsKt__IndentKt.trimIndent("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + fVar.f29511a + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @C12579k
    public Object invokeSuspend(@C12579k Object obj) {
        Throwable e = Result.m38705e(obj);
        if (e != null) {
            this.lastEmissionContext = new C11929f(e, getContext());
        }
        C11045c<? super C11079d2> cVar = this.completion;
        if (cVar != null) {
            cVar.resumeWith(obj);
        }
        return C11063b.m42612h();
    }

    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
