package kotlinx.coroutines;

import kotlin.coroutines.C11045c;
import kotlin.coroutines.C11047d;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nBuilders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Builders.kt\nkotlinx/coroutines/BuildersKt__BuildersKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n1#2:103\n*E\n"})
/* renamed from: kotlinx.coroutines.i */
public final /* synthetic */ class C11970i {
    /* renamed from: a */
    public static final <T> T m47707a(@C12579k CoroutineContext coroutineContext, @C12579k C11304p<? super C12074o0, ? super C11045c<? super T>, ? extends Object> pVar) throws InterruptedException {
        CoroutineContext coroutineContext2;
        C12047k1 k1Var;
        C12047k1 k1Var2;
        Thread currentThread = Thread.currentThread();
        C11047d dVar = (C11047d) coroutineContext.mo7444b(C11047d.f28247u0);
        if (dVar == null) {
            k1Var = C11800e3.f29268a.mo24076b();
            coroutineContext2 = CoroutineContextKt.m45901e(C12156u1.f29939a, coroutineContext.mo7443Q(k1Var));
        } else {
            C12047k1 k1Var3 = null;
            if (dVar instanceof C12047k1) {
                k1Var2 = (C12047k1) dVar;
            } else {
                k1Var2 = null;
            }
            if (k1Var2 != null) {
                if (k1Var2.mo24480F0()) {
                    k1Var3 = k1Var2;
                }
                if (k1Var3 != null) {
                    k1Var = k1Var3;
                    coroutineContext2 = CoroutineContextKt.m45901e(C12156u1.f29939a, coroutineContext);
                }
            }
            k1Var = C11800e3.f29268a.mo24075a();
            coroutineContext2 = CoroutineContextKt.m45901e(C12156u1.f29939a, coroutineContext);
        }
        C11801f fVar = new C11801f(coroutineContext2, currentThread, k1Var);
        fVar.mo23695R1(CoroutineStart.DEFAULT, fVar, pVar);
        return fVar.mo24079S1();
    }

    /* renamed from: b */
    public static /* synthetic */ Object m47708b(CoroutineContext coroutineContext, C11304p pVar, int i, Object obj) throws InterruptedException {
        if ((i & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.f28243a;
        }
        return C11965h.m47671f(coroutineContext, pVar);
    }
}
