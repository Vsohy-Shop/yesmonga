package kotlinx.coroutines;

import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.internal.C12000k;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 4 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,222:1\n200#1,17:240\n1#2:223\n255#3:224\n256#3,2:235\n258#3:239\n107#4,10:225\n118#4,2:237\n61#5,2:257\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n*L\n190#1:240,17\n178#1:224\n178#1:235,2\n178#1:239\n178#1:225,10\n178#1:237,2\n220#1:257,2\n*E\n"})
/* renamed from: kotlinx.coroutines.b1 */
public final class C11717b1 {

    /* renamed from: a */
    public static final int f29057a = 0;

    /* renamed from: b */
    public static final int f29058b = 1;

    /* renamed from: c */
    public static final int f29059c = 2;

    /* renamed from: d */
    public static final int f29060d = 4;

    /* renamed from: e */
    public static final int f29061e = -1;

    /* renamed from: a */
    public static final <T> void m46144a(@C12579k C11704a1<? super T> a1Var, int i) {
        boolean z;
        C11045c<? super T> f = a1Var.mo23699f();
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z || !(f instanceof C12000k) || m46146c(i) != m46146c(a1Var.f29037c)) {
            m46148e(a1Var, f, z);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((C12000k) f).f29599d;
        CoroutineContext context = f.getContext();
        if (coroutineDispatcher.mo23565U(context)) {
            coroutineDispatcher.mo23563O(context, a1Var);
        } else {
            m46149f(a1Var);
        }
    }

    @C11532s0
    /* renamed from: b */
    public static /* synthetic */ void m46145b() {
    }

    /* renamed from: c */
    public static final boolean m46146c(int i) {
        return i == 1 || i == 2;
    }

    /* renamed from: d */
    public static final boolean m46147d(int i) {
        return i == 2;
    }

    /* renamed from: e */
    public static final <T> void m46148e(@C12579k C11704a1<? super T> a1Var, @C12579k C11045c<? super T> cVar, boolean z) {
        Object obj;
        C12065m3<?> m3Var;
        Object k = a1Var.mo23703k();
        Throwable g = a1Var.mo23700g(k);
        if (g != null) {
            Result.C10852a aVar = Result.f28060a;
            obj = C11661u0.m45734a(g);
        } else {
            Result.C10852a aVar2 = Result.f28060a;
            obj = a1Var.mo23701h(k);
        }
        Object b = Result.m38702b(obj);
        if (z) {
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            C12000k kVar = (C12000k) cVar;
            C11045c<T> cVar2 = kVar.f29600e;
            Object obj2 = kVar.f29602g;
            CoroutineContext context = cVar2.getContext();
            Object c = ThreadContextKt.m47768c(context, obj2);
            if (c != ThreadContextKt.f29563a) {
                m3Var = CoroutineContextKt.m45903g(cVar2, context, c);
            } else {
                m3Var = null;
            }
            try {
                kVar.f29600e.resumeWith(b);
                C11079d2 d2Var = C11079d2.f28267a;
            } finally {
                if (m3Var == null || m3Var.mo24520S1()) {
                    ThreadContextKt.m47766a(context, c);
                }
            }
        } else {
            cVar.resumeWith(b);
        }
    }

    /* renamed from: f */
    public static final void m46149f(C11704a1<?> a1Var) {
        C12047k1 b = C11800e3.f29268a.mo24076b();
        if (b.mo24476A0()) {
            b.mo24484d0(a1Var);
            return;
        }
        b.mo24486n0(true);
        try {
            m46148e(a1Var, a1Var.mo23699f(), true);
            do {
            } while (b.mo24479E0());
        } catch (Throwable th) {
            b.mo24481a0(true);
            throw th;
        }
        b.mo24481a0(true);
    }

    /* renamed from: g */
    public static final void m46150g(@C12579k C11045c<?> cVar, @C12579k Throwable th) {
        Result.C10852a aVar = Result.f28060a;
        cVar.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
    }

    /* renamed from: h */
    public static final void m46151h(@C12579k C11704a1<?> a1Var, @C12579k C12047k1 k1Var, @C12579k C11289a<C11079d2> aVar) {
        k1Var.mo24486n0(true);
        try {
            aVar.invoke();
            do {
            } while (k1Var.mo24479E0());
            C11322b0.m43481d(1);
        } catch (Throwable th) {
            C11322b0.m43481d(1);
            k1Var.mo24481a0(true);
            C11322b0.m43480c(1);
            throw th;
        }
        k1Var.mo24481a0(true);
        C11322b0.m43480c(1);
    }
}
