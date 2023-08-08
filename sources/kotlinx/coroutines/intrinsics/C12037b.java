package kotlinx.coroutines.intrinsics;

import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C11721c0;
import kotlinx.coroutines.C12041j2;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.C12001k0;
import kotlinx.coroutines.internal.ThreadContextKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nUndispatched.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n+ 2 ProbesSupport.kt\nkotlinx/coroutines/internal/ProbesSupportKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,127:1\n55#1:128\n56#1,11:130\n55#1:141\n56#1,2:143\n58#1,9:150\n55#1:159\n56#1,2:161\n58#1,9:168\n97#1,4:178\n114#1,6:182\n120#1,5:190\n97#1,4:195\n114#1,6:199\n120#1,5:207\n11#2:129\n11#2:142\n11#2:160\n11#2:177\n95#3,5:145\n95#3,5:163\n61#4,2:188\n61#4,2:205\n61#4,2:212\n61#4,2:214\n*S KotlinDebug\n*F\n+ 1 Undispatched.kt\nkotlinx/coroutines/intrinsics/UndispatchedKt\n*L\n18#1:128\n18#1:130,11\n29#1:141\n29#1:143,2\n29#1:150,9\n42#1:159\n42#1:161,2\n42#1:168,9\n77#1:178,4\n77#1:182,6\n77#1:190,5\n88#1:195,4\n88#1:199,6\n88#1:207,5\n18#1:129\n29#1:142\n42#1:160\n55#1:177\n30#1:145,5\n43#1:163,5\n77#1:188,2\n88#1:205,2\n119#1:212,2\n120#1:214,2\n*E\n"})
/* renamed from: kotlinx.coroutines.intrinsics.b */
public final class C12037b {
    /* renamed from: a */
    public static final <T> void m48049a(@C12579k C11300l<? super C11045c<? super T>, ? extends Object> lVar, @C12579k C11045c<? super T> cVar) {
        CoroutineContext context;
        Object c;
        C11045c<? super T> a = C11069f.m42636a(cVar);
        try {
            context = cVar.getContext();
            c = ThreadContextKt.m47768c(context, (Object) null);
            Object invoke = ((C11300l) C11370u0.m43701q(lVar, 1)).invoke(a);
            ThreadContextKt.m47766a(context, c);
            if (invoke != C11063b.m42612h()) {
                Result.C10852a aVar = Result.f28060a;
                a.resumeWith(Result.m38702b(invoke));
            }
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            a.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
        }
    }

    /* renamed from: b */
    public static final <R, T> void m48050b(@C12579k C11304p<? super R, ? super C11045c<? super T>, ? extends Object> pVar, R r, @C12579k C11045c<? super T> cVar) {
        CoroutineContext context;
        Object c;
        C11045c<? super T> a = C11069f.m42636a(cVar);
        try {
            context = cVar.getContext();
            c = ThreadContextKt.m47768c(context, (Object) null);
            Object invoke = ((C11304p) C11370u0.m43701q(pVar, 2)).invoke(r, a);
            ThreadContextKt.m47766a(context, c);
            if (invoke != C11063b.m42612h()) {
                Result.C10852a aVar = Result.f28060a;
                a.resumeWith(Result.m38702b(invoke));
            }
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            a.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
        }
    }

    /* renamed from: c */
    public static final <T> void m48051c(@C12579k C11300l<? super C11045c<? super T>, ? extends Object> lVar, @C12579k C11045c<? super T> cVar) {
        C11045c<? super T> a = C11069f.m42636a(cVar);
        try {
            Object invoke = ((C11300l) C11370u0.m43701q(lVar, 1)).invoke(a);
            if (invoke != C11063b.m42612h()) {
                Result.C10852a aVar = Result.f28060a;
                a.resumeWith(Result.m38702b(invoke));
            }
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            a.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
        }
    }

    /* renamed from: d */
    public static final <T> void m48052d(C11045c<? super T> cVar, C11300l<? super C11045c<? super T>, ? extends Object> lVar) {
        C11045c<? super T> a = C11069f.m42636a(cVar);
        try {
            Object invoke = lVar.invoke(a);
            if (invoke != C11063b.m42612h()) {
                Result.C10852a aVar = Result.f28060a;
                a.resumeWith(Result.m38702b(invoke));
            }
        } catch (Throwable th) {
            Result.C10852a aVar2 = Result.f28060a;
            a.resumeWith(Result.m38702b(C11661u0.m45734a(th)));
        }
    }

    @C12580l
    /* renamed from: e */
    public static final <T, R> Object m48053e(@C12579k C12001k0<? super T> k0Var, R r, @C12579k C11304p<? super R, ? super C11045c<? super T>, ? extends Object> pVar) {
        Object obj;
        try {
            obj = ((C11304p) C11370u0.m43701q(pVar, 2)).invoke(r, k0Var);
        } catch (Throwable th) {
            obj = new C11721c0(th, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj == C11063b.m42612h()) {
            return C11063b.m42612h();
        }
        Object m1 = k0Var.mo23640m1(obj);
        if (m1 == C12041j2.f29672b) {
            return C11063b.m42612h();
        }
        if (!(m1 instanceof C11721c0)) {
            return C12041j2.m48073h(m1);
        }
        throw ((C11721c0) m1).f29065a;
    }

    @C12580l
    /* renamed from: f */
    public static final <T, R> Object m48054f(@C12579k C12001k0<? super T> k0Var, R r, @C12579k C11304p<? super R, ? super C11045c<? super T>, ? extends Object> pVar) {
        Object obj;
        boolean z = false;
        try {
            obj = ((C11304p) C11370u0.m43701q(pVar, 2)).invoke(r, k0Var);
        } catch (Throwable th) {
            obj = new C11721c0(th, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj == C11063b.m42612h()) {
            return C11063b.m42612h();
        }
        Object m1 = k0Var.mo23640m1(obj);
        if (m1 == C12041j2.f29672b) {
            return C11063b.m42612h();
        }
        if (m1 instanceof C11721c0) {
            Throwable th2 = ((C11721c0) m1).f29065a;
            if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).f29035a != k0Var) {
                z = true;
            }
            if (z) {
                throw th2;
            } else if (obj instanceof C11721c0) {
                throw ((C11721c0) obj).f29065a;
            }
        } else {
            obj = C12041j2.m48073h(m1);
        }
        return obj;
    }

    /* renamed from: g */
    public static final <T> Object m48055g(C12001k0<? super T> k0Var, C11300l<? super Throwable, Boolean> lVar, C11289a<? extends Object> aVar) {
        Object obj;
        try {
            obj = aVar.invoke();
        } catch (Throwable th) {
            obj = new C11721c0(th, false, 2, (DefaultConstructorMarker) null);
        }
        if (obj == C11063b.m42612h()) {
            return C11063b.m42612h();
        }
        Object m1 = k0Var.mo23640m1(obj);
        if (m1 == C12041j2.f29672b) {
            return C11063b.m42612h();
        }
        if (!(m1 instanceof C11721c0)) {
            return C12041j2.m48073h(m1);
        }
        C11721c0 c0Var = (C11721c0) m1;
        if (lVar.invoke(c0Var.f29065a).booleanValue()) {
            throw c0Var.f29065a;
        } else if (!(obj instanceof C11721c0)) {
            return obj;
        } else {
            throw ((C11721c0) obj).f29065a;
        }
    }
}
