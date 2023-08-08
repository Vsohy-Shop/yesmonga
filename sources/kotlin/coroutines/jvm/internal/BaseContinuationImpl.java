package kotlin.coroutines.jvm.internal;

import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.C11665v0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0019\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ$\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005H$ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\u0007H\u0014J\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J$\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00012\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016R!\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, mo22516d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/c;", "", "Lkotlin/coroutines/jvm/internal/c;", "Ljava/io/Serializable;", "Lkotlin/Result;", "result", "Lkotlin/d2;", "resumeWith", "(Ljava/lang/Object;)V", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "completion", "create", "value", "", "toString", "Ljava/lang/StackTraceElement;", "getStackTraceElement", "Lkotlin/coroutines/c;", "getCompletion", "()Lkotlin/coroutines/c;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/c;", "callerFrame", "<init>", "(Lkotlin/coroutines/c;)V", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11665v0(version = "1.3")
public abstract class BaseContinuationImpl implements C11045c<Object>, C11066c, Serializable {
    @C12580l
    private final C11045c<Object> completion;

    public BaseContinuationImpl(@C12580l C11045c<Object> cVar) {
        this.completion = cVar;
    }

    @C12579k
    public C11045c<C11079d2> create(@C12579k C11045c<?> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @C12580l
    public C11066c getCallerFrame() {
        C11045c<Object> cVar = this.completion;
        if (cVar instanceof C11066c) {
            return (C11066c) cVar;
        }
        return null;
    }

    @C12580l
    public final C11045c<Object> getCompletion() {
        return this.completion;
    }

    @C12580l
    public StackTraceElement getStackTraceElement() {
        return C11068e.m42635e(this);
    }

    @C12580l
    public abstract Object invokeSuspend(@C12579k Object obj);

    public void releaseIntercepted() {
    }

    public final void resumeWith(@C12579k Object obj) {
        C11045c cVar = this;
        while (true) {
            C11069f.m42637b(cVar);
            BaseContinuationImpl baseContinuationImpl = (BaseContinuationImpl) cVar;
            C11045c cVar2 = baseContinuationImpl.completion;
            Intrinsics.checkNotNull(cVar2);
            try {
                Object invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                if (invokeSuspend != C11063b.m42612h()) {
                    Result.C10852a aVar = Result.f28060a;
                    obj = Result.m38702b(invokeSuspend);
                    baseContinuationImpl.releaseIntercepted();
                    if (cVar2 instanceof BaseContinuationImpl) {
                        cVar = cVar2;
                    } else {
                        cVar2.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                Result.C10852a aVar2 = Result.f28060a;
                obj = Result.m38702b(C11661u0.m45734a(th));
            }
        }
    }

    @C12579k
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @C12579k
    public C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        Intrinsics.checkNotNullParameter(cVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
