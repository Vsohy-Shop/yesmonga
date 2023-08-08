package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlinx.coroutines.u2 */
public final class C12157u2 extends C11974i2 {
    @C12579k

    /* renamed from: e */
    public final C11045c<C11079d2> f29940e;

    public C12157u2(@C12579k C11045c<? super C11079d2> cVar) {
        this.f29940e = cVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo23670z((Throwable) obj);
        return C11079d2.f28267a;
    }

    /* renamed from: z */
    public void mo23670z(@C12580l Throwable th) {
        C11045c<C11079d2> cVar = this.f29940e;
        Result.C10852a aVar = Result.f28060a;
        cVar.resumeWith(Result.m38702b(C11079d2.f28267a));
    }
}
