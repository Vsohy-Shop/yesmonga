package kotlinx.coroutines.selects;

import kotlin.C11532s0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11532s0
public final class SelectBuilderImpl<R> extends SelectImplementation<R> {
    @C12579k

    /* renamed from: g */
    public final C12078p<R> f29849g;

    public SelectBuilderImpl(@C12579k C11045c<? super R> cVar) {
        super(cVar.getContext());
        this.f29849g = new C12078p<>(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
    }

    @C12580l
    @C11532s0
    /* renamed from: N */
    public final Object mo24690N() {
        if (this.f29849g.mo24539j()) {
            return this.f29849g.mo24572y();
        }
        C11723c2 unused = C12038j.m48061f(C12079p0.m48260a(getContext()), (CoroutineContext) null, CoroutineStart.UNDISPATCHED, new SelectBuilderImpl$getResult$1(this, (C11045c<? super SelectBuilderImpl$getResult$1>) null), 1, (Object) null);
        return this.f29849g.mo24572y();
    }

    @C11532s0
    /* renamed from: O */
    public final void mo24691O(@C12579k Throwable th) {
        C12078p<R> pVar = this.f29849g;
        Result.C10852a aVar = Result.f28060a;
        pVar.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
    }
}
