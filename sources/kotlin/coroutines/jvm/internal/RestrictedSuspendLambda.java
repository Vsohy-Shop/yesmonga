package kotlin.coroutines.jvm.internal;

import kotlin.C11076d0;
import kotlin.C11665v0;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11320a0;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B!\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0010J\b\u0010\u0006\u001a\u00020\u0005H\u0016R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo22516d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/jvm/internal/a0;", "", "Lkotlin/coroutines/jvm/internal/j;", "", "toString", "", "arity", "I", "getArity", "()I", "Lkotlin/coroutines/c;", "completion", "<init>", "(ILkotlin/coroutines/c;)V", "(I)V", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11665v0(version = "1.3")
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements C11320a0<Object>, C11074j {
    private final int arity;

    public RestrictedSuspendLambda(int i, @C12580l C11045c<Object> cVar) {
        super(cVar);
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    @C12579k
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String w = C11342l0.m43566w(this);
        Intrinsics.checkNotNullExpressionValue(w, "renderLambdaToString(this)");
        return w;
    }

    public RestrictedSuspendLambda(int i) {
        this(i, (C11045c<Object>) null);
    }
}
