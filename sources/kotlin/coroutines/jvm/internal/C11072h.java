package kotlin.coroutines.jvm.internal;

import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.coroutines.jvm.internal.h */
public final class C11072h implements C11045c<C11079d2> {
    @C12580l

    /* renamed from: a */
    public Result<C11079d2> f28266a;

    /* renamed from: a */
    public final void mo22511a() {
        synchronized (this) {
            while (true) {
                Result<C11079d2> result = this.f28266a;
                if (result == null) {
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                    wait();
                } else {
                    C11661u0.m45747n(result.mo21858l());
                }
            }
        }
    }

    @C12580l
    /* renamed from: b */
    public final Result<C11079d2> mo22512b() {
        return this.f28266a;
    }

    /* renamed from: e */
    public final void mo22513e(@C12580l Result<C11079d2> result) {
        this.f28266a = result;
    }

    @C12579k
    public CoroutineContext getContext() {
        return EmptyCoroutineContext.f28243a;
    }

    public void resumeWith(@C12579k Object obj) {
        synchronized (this) {
            this.f28266a = Result.m38701a(obj);
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }
}
