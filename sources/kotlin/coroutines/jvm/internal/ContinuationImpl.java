package kotlin.coroutines.jvm.internal;

import kotlin.C11076d0;
import kotlin.C11665v0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11047d;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.3")
@C11076d0(mo22515d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b!\u0018\u00002\u00020\u0001B#\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000f\u0010\u0010B\u001b\b\u0016\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u0011J\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0014R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0014\u0010\r\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, mo22516d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/c;", "", "intercepted", "Lkotlin/d2;", "releaseIntercepted", "Lkotlin/coroutines/CoroutineContext;", "_context", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/c;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "completion", "<init>", "(Lkotlin/coroutines/c;Lkotlin/coroutines/CoroutineContext;)V", "(Lkotlin/coroutines/c;)V", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContinuationImpl.kt\nkotlin/coroutines/jvm/internal/ContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n1#2:169\n*E\n"})
public abstract class ContinuationImpl extends BaseContinuationImpl {
    @C12580l
    private final CoroutineContext _context;
    @C12580l
    private transient C11045c<Object> intercepted;

    public ContinuationImpl(@C12580l C11045c<Object> cVar, @C12580l CoroutineContext coroutineContext) {
        super(cVar);
        this._context = coroutineContext;
    }

    @C12579k
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        Intrinsics.checkNotNull(coroutineContext);
        return coroutineContext;
    }

    @C12579k
    public final C11045c<Object> intercepted() {
        C11045c<Object> cVar = this.intercepted;
        if (cVar == null) {
            C11047d dVar = (C11047d) getContext().mo7444b(C11047d.f28247u0);
            if (dVar == null || (cVar = dVar.mo22491o(this)) == null) {
                cVar = this;
            }
            this.intercepted = cVar;
        }
        return cVar;
    }

    public void releaseIntercepted() {
        C11045c<Object> cVar = this.intercepted;
        if (!(cVar == null || cVar == this)) {
            CoroutineContext.C11040a b = getContext().mo7444b(C11047d.f28247u0);
            Intrinsics.checkNotNull(b);
            ((C11047d) b).mo22490m(cVar);
        }
        this.intercepted = C11065b.f28258a;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContinuationImpl(@C12580l C11045c<Object> cVar) {
        this(cVar, cVar != null ? cVar.getContext() : null);
    }
}
