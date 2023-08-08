package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/ResumeAwaitOnCompletion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1454:1\n1#2:1455\n*E\n"})
/* renamed from: kotlinx.coroutines.t2 */
public final class C12146t2<T> extends C11974i2 {
    @C12579k

    /* renamed from: e */
    public final C12078p<T> f29934e;

    public C12146t2(@C12579k C12078p<? super T> pVar) {
        this.f29934e = pVar;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo23670z((Throwable) obj);
        return C11079d2.f28267a;
    }

    /* renamed from: z */
    public void mo23670z(@C12580l Throwable th) {
        Object Z0 = mo24296A().mo23620Z0();
        if (Z0 instanceof C11721c0) {
            C12078p<T> pVar = this.f29934e;
            Result.C10852a aVar = Result.f28060a;
            pVar.resumeWith(Result.m38702b(C11661u0.m45734a(((C11721c0) Z0).f29065a)));
            return;
        }
        C12078p<T> pVar2 = this.f29934e;
        Result.C10852a aVar2 = Result.f28060a;
        pVar2.resumeWith(Result.m38702b(C12041j2.m48073h(Z0)));
    }
}
