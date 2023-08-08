package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C16563a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.C11661u0;
import kotlin.Result;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11704a1;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11767d0;
import kotlinx.coroutines.C11800e3;
import kotlinx.coroutines.C11966h0;
import kotlinx.coroutines.C12047k1;
import kotlinx.coroutines.C12065m3;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.C12090r0;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,317:1\n243#1,8:381\n255#1:389\n256#1,2:400\n258#1:404\n1#2:318\n1#2:324\n1#2:365\n297#3,5:319\n302#3,12:325\n314#3:359\n297#3,5:360\n302#3,12:366\n314#3:419\n200#4,3:337\n203#4,14:345\n200#4,3:378\n203#4,14:405\n95#5,5:340\n107#5,10:390\n118#5,2:402\n107#5,13:420\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n224#1:381,8\n225#1:389\n225#1:400,2\n225#1:404\n202#1:324\n223#1:365\n202#1:319,5\n202#1:325,12\n202#1:359\n223#1:360,5\n223#1:366,12\n223#1:419\n202#1:337,3\n202#1:345,14\n223#1:378,3\n223#1:405,14\n203#1:340,5\n225#1:390,10\n225#1:402,2\n255#1:420,13\n*E\n"})
@C11532s0
/* renamed from: kotlinx.coroutines.internal.k */
public final class C12000k<T> extends C11704a1<T> implements C11066c, C11045c<T> {
    @C12579k

    /* renamed from: v */
    public static final AtomicReferenceFieldUpdater f29598v = AtomicReferenceFieldUpdater.newUpdater(C12000k.class, Object.class, "_reusableCancellableContinuation");
    @C11394v
    @C12580l
    private volatile Object _reusableCancellableContinuation;
    @C12579k
    @C11287e

    /* renamed from: d */
    public final CoroutineDispatcher f29599d;
    @C12579k
    @C11287e

    /* renamed from: e */
    public final C11045c<T> f29600e;
    @C12580l
    @C11287e

    /* renamed from: f */
    public Object f29601f = C12002l.f29604a;
    @C12579k
    @C11287e

    /* renamed from: g */
    public final Object f29602g = ThreadContextKt.m47767b(getContext());

    public C12000k(@C12579k CoroutineDispatcher coroutineDispatcher, @C12579k C11045c<? super T> cVar) {
        super(-1);
        this.f29599d = coroutineDispatcher;
        this.f29600e = cVar;
    }

    /* renamed from: q */
    public static /* synthetic */ void m47848q() {
    }

    /* renamed from: e */
    public void mo23698e(@C12580l Object obj, @C12579k Throwable th) {
        if (obj instanceof C11767d0) {
            ((C11767d0) obj).f29185b.invoke(th);
        }
    }

    @C12579k
    /* renamed from: f */
    public C11045c<T> mo23699f() {
        return this;
    }

    @C12580l
    public C11066c getCallerFrame() {
        C11045c<T> cVar = this.f29600e;
        if (cVar instanceof C11066c) {
            return (C11066c) cVar;
        }
        return null;
    }

    @C12579k
    public CoroutineContext getContext() {
        return this.f29600e.getContext();
    }

    @C12580l
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @C12580l
    /* renamed from: k */
    public Object mo23703k() {
        Object obj = this.f29601f;
        this.f29601f = C12002l.f29604a;
        return obj;
    }

    /* renamed from: l */
    public final void mo24367l() {
        do {
        } while (f29598v.get(this) == C12002l.f29605b);
    }

    @C12580l
    /* renamed from: m */
    public final C12078p<T> mo24368m() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29598v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f29598v.set(this, C12002l.f29605b);
                return null;
            } else if (obj instanceof C12078p) {
                if (C16563a.m75000a(f29598v, this, obj, C12002l.f29605b)) {
                    return (C12078p) obj;
                }
            } else if (obj != C12002l.f29605b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    /* renamed from: n */
    public final void mo24369n(@C12579k CoroutineContext coroutineContext, T t) {
        this.f29601f = t;
        this.f29037c = 1;
        this.f29599d.mo23564T(coroutineContext, this);
    }

    /* renamed from: o */
    public final C12078p<?> mo24370o() {
        Object obj = f29598v.get(this);
        if (obj instanceof C12078p) {
            return (C12078p) obj;
        }
        return null;
    }

    /* renamed from: r */
    public final boolean mo24371r() {
        if (f29598v.get(this) != null) {
            return true;
        }
        return false;
    }

    public void resumeWith(@C12579k Object obj) {
        CoroutineContext context;
        Object c;
        CoroutineContext context2 = this.f29600e.getContext();
        Object d = C11966h0.m47677d(obj, (C11300l) null, 1, (Object) null);
        if (this.f29599d.mo23565U(context2)) {
            this.f29601f = d;
            this.f29037c = 0;
            this.f29599d.mo23563O(context2, this);
            return;
        }
        C12047k1 b = C11800e3.f29268a.mo24076b();
        if (b.mo24476A0()) {
            this.f29601f = d;
            this.f29037c = 0;
            b.mo24484d0(this);
            return;
        }
        b.mo24486n0(true);
        try {
            context = getContext();
            c = ThreadContextKt.m47768c(context, this.f29602g);
            this.f29600e.resumeWith(obj);
            C11079d2 d2Var = C11079d2.f28267a;
            ThreadContextKt.m47766a(context, c);
            do {
            } while (b.mo24479E0());
        } catch (Throwable th) {
            try {
                mo23702i(th, (Throwable) null);
            } catch (Throwable th2) {
                b.mo24481a0(true);
                throw th2;
            }
        }
        b.mo24481a0(true);
    }

    /* renamed from: s */
    public final void mo24372s(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* renamed from: t */
    public final boolean mo24373t(@C12579k Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29598v;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            C12009o0 o0Var = C12002l.f29605b;
            if (Intrinsics.areEqual(obj, (Object) o0Var)) {
                if (C16563a.m75000a(f29598v, this, o0Var, th)) {
                    return true;
                }
            } else if (obj instanceof Throwable) {
                return true;
            } else {
                if (C16563a.m75000a(f29598v, this, obj, (Object) null)) {
                    return false;
                }
            }
        }
    }

    @C12579k
    public String toString() {
        return "DispatchedContinuation[" + this.f29599d + ", " + C12090r0.m48302c(this.f29600e) + C12361b.f30261l;
    }

    /* renamed from: u */
    public final void mo24375u() {
        mo24367l();
        C12078p<?> o = mo24370o();
        if (o != null) {
            o.mo24567t();
        }
    }

    /* renamed from: v */
    public final void mo24376v(@C12579k Object obj, @C12580l C11300l<? super Throwable, C11079d2> lVar) {
        boolean z;
        CoroutineContext context;
        Object c;
        C12065m3<?> m3Var;
        Object b = C11966h0.m47675b(obj, lVar);
        if (this.f29599d.mo23565U(getContext())) {
            this.f29601f = b;
            this.f29037c = 1;
            this.f29599d.mo23563O(getContext(), this);
            return;
        }
        C12047k1 b2 = C11800e3.f29268a.mo24076b();
        if (b2.mo24476A0()) {
            this.f29601f = b;
            this.f29037c = 1;
            b2.mo24484d0(this);
            return;
        }
        b2.mo24486n0(true);
        try {
            C11723c2 c2Var = (C11723c2) getContext().mo7444b(C11723c2.f29067w0);
            if (c2Var == null || c2Var.mo23627d()) {
                z = false;
            } else {
                CancellationException u = c2Var.mo23653u();
                mo23698e(b, u);
                Result.C10852a aVar = Result.f28060a;
                resumeWith(Result.m38702b(C11661u0.m45734a(u)));
                z = true;
            }
            if (!z) {
                C11045c<T> cVar = this.f29600e;
                Object obj2 = this.f29602g;
                context = cVar.getContext();
                c = ThreadContextKt.m47768c(context, obj2);
                if (c != ThreadContextKt.f29563a) {
                    m3Var = CoroutineContextKt.m45903g(cVar, context, c);
                } else {
                    m3Var = null;
                }
                this.f29600e.resumeWith(obj);
                C11079d2 d2Var = C11079d2.f28267a;
                C11322b0.m43481d(1);
                if (m3Var == null || m3Var.mo24520S1()) {
                    ThreadContextKt.m47766a(context, c);
                }
                C11322b0.m43480c(1);
            }
            do {
            } while (b2.mo24479E0());
            C11322b0.m43481d(1);
        } catch (Throwable th) {
            try {
                mo23702i(th, (Throwable) null);
                C11322b0.m43481d(1);
            } catch (Throwable th2) {
                C11322b0.m43481d(1);
                b2.mo24481a0(true);
                C11322b0.m43480c(1);
                throw th2;
            }
        }
        b2.mo24481a0(true);
        C11322b0.m43480c(1);
    }

    /* renamed from: w */
    public final boolean mo24377w(@C12580l Object obj) {
        C11723c2 c2Var = (C11723c2) getContext().mo7444b(C11723c2.f29067w0);
        if (c2Var == null || c2Var.mo23627d()) {
            return false;
        }
        CancellationException u = c2Var.mo23653u();
        mo23698e(obj, u);
        Result.C10852a aVar = Result.f28060a;
        resumeWith(Result.m38702b(C11661u0.m45734a(u)));
        return true;
    }

    /* renamed from: x */
    public final void mo24378x(@C12579k Object obj) {
        C12065m3<?> m3Var;
        C11045c<T> cVar = this.f29600e;
        Object obj2 = this.f29602g;
        CoroutineContext context = cVar.getContext();
        Object c = ThreadContextKt.m47768c(context, obj2);
        if (c != ThreadContextKt.f29563a) {
            m3Var = CoroutineContextKt.m45903g(cVar, context, c);
        } else {
            m3Var = null;
        }
        try {
            this.f29600e.resumeWith(obj);
            C11079d2 d2Var = C11079d2.f28267a;
        } finally {
            C11322b0.m43481d(1);
            if (m3Var == null || m3Var.mo24520S1()) {
                ThreadContextKt.m47766a(context, c);
            }
            C11322b0.m43480c(1);
        }
    }

    @C12580l
    /* renamed from: y */
    public final Throwable mo24379y(@C12579k C12072o<?> oVar) {
        C12009o0 o0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29598v;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            o0Var = C12002l.f29605b;
            if (obj != o0Var) {
                if (!(obj instanceof Throwable)) {
                    throw new IllegalStateException(("Inconsistent state " + obj).toString());
                } else if (C16563a.m75000a(f29598v, this, obj, (Object) null)) {
                    return (Throwable) obj;
                } else {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            }
        } while (!C16563a.m75000a(f29598v, this, o0Var, oVar));
        return null;
    }
}
