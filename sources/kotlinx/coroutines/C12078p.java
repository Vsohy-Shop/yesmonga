package kotlinx.coroutines;

import androidx.concurrent.futures.C16563a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11066c;
import kotlin.jvm.C11314h;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.internal.C12000k;
import kotlinx.coroutines.internal.C12003l0;
import kotlinx.coroutines.internal.C12009o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,662:1\n230#1,2:666\n232#1,8:669\n230#1,10:677\n230#1,10:688\n1#2:663\n24#3:664\n24#3:665\n22#3:687\n21#3:698\n22#3,3:699\n21#3:702\n22#3,3:703\n22#3:711\n21#3,4:712\n22#4:668\n13#4:710\n61#5,2:706\n61#5,2:708\n61#5,2:716\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n246#1:666,2\n246#1:669,8\n249#1:677,10\n254#1:688,10\n72#1:664\n158#1:665\n252#1:687\n277#1:698\n278#1:699,3\n287#1:702\n288#1:703,3\n389#1:711\n392#1:712,4\n246#1:668\n350#1:710\n329#1:706,2\n339#1:708,2\n613#1:716,2\n*E\n"})
@C11532s0
/* renamed from: kotlinx.coroutines.p */
public class C12078p<T> extends C11704a1<T> implements C12072o<T>, C11066c, C12077o3 {
    @C12579k

    /* renamed from: f */
    public static final AtomicIntegerFieldUpdater f29722f;
    @C12579k

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f29723g;
    @C12579k

    /* renamed from: v */
    public static final AtomicReferenceFieldUpdater f29724v;
    @C11394v
    private volatile int _decisionAndIndex = 536870911;
    @C11394v
    @C12580l
    private volatile Object _parentHandle;
    @C11394v
    @C12580l
    private volatile Object _state = C11766d.f29183a;
    @C12579k

    /* renamed from: d */
    public final C11045c<T> f29725d;
    @C12579k

    /* renamed from: e */
    public final CoroutineContext f29726e;

    static {
        Class<C12078p> cls = C12078p.class;
        f29722f = AtomicIntegerFieldUpdater.newUpdater(cls, "_decisionAndIndex");
        Class<Object> cls2 = Object.class;
        f29723g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f29724v = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public C12078p(@C12579k C11045c<? super T> cVar, int i) {
        super(i);
        this.f29725d = cVar;
        this.f29726e = cVar.getContext();
    }

    /* renamed from: R */
    public static /* synthetic */ void m48209R(C12078p pVar, Object obj, int i, C11300l lVar, int i2, Object obj2) {
        if (obj2 == null) {
            if ((i2 & 4) != 0) {
                lVar = null;
            }
            pVar.mo24554Q(obj, i, lVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
    }

    /* renamed from: A */
    public final String mo24543A() {
        Object z = mo24573z();
        if (z instanceof C12087q2) {
            return "Active";
        }
        if (z instanceof C12093s) {
            return "Cancelled";
        }
        return "Completed";
    }

    /* renamed from: B */
    public final C11962g1 mo24544B() {
        C11723c2 c2Var = (C11723c2) getContext().mo7444b(C11723c2.f29067w0);
        if (c2Var == null) {
            return null;
        }
        C11962g1 g = C11723c2.C11724a.m46189g(c2Var, true, false, new C12143t(this), 2, (Object) null);
        C16563a.m75000a(f29724v, this, (Object) null, g);
        return g;
    }

    /* renamed from: C */
    public void mo24529C(@C12579k C11300l<? super Throwable, C11079d2> lVar) {
        mo24545D(mo24549H(lVar));
    }

    /* renamed from: D */
    public final void mo24545D(Object obj) {
        boolean z;
        Object obj2 = obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29723g;
        while (true) {
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof C11766d)) {
                if (obj3 instanceof C12060m) {
                    z = true;
                } else {
                    z = obj3 instanceof C12003l0;
                }
                if (z) {
                    mo24550I(obj2, obj3);
                } else {
                    boolean z2 = obj3 instanceof C11721c0;
                    if (z2) {
                        C11721c0 c0Var = (C11721c0) obj3;
                        if (!c0Var.mo23745b()) {
                            mo24550I(obj2, obj3);
                        }
                        if (obj3 instanceof C12093s) {
                            Throwable th = null;
                            if (!z2) {
                                c0Var = null;
                            }
                            if (c0Var != null) {
                                th = c0Var.f29065a;
                            }
                            if (obj2 instanceof C12060m) {
                                mo24562n((C12060m) obj2, th);
                                return;
                            }
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            mo24565r((C12003l0) obj2, th);
                            return;
                        }
                        return;
                    } else if (obj3 instanceof C11716b0) {
                        C11716b0 b0Var = (C11716b0) obj3;
                        if (b0Var.f29053b != null) {
                            mo24550I(obj2, obj3);
                        }
                        if (!(obj2 instanceof C12003l0)) {
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                            C12060m mVar = (C12060m) obj2;
                            if (b0Var.mo23740h()) {
                                mo24562n(mVar, b0Var.f29056e);
                                return;
                            }
                            if (C16563a.m75000a(f29723g, this, obj3, C11716b0.m46135g(b0Var, (Object) null, mVar, (C11300l) null, (Object) null, (Throwable) null, 29, (Object) null))) {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else if (!(obj2 instanceof C12003l0)) {
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                        if (C16563a.m75000a(f29723g, this, obj3, new C11716b0(obj3, (C12060m) obj2, (C11300l) null, (Object) null, (Throwable) null, 28, (DefaultConstructorMarker) null))) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
            } else if (C16563a.m75000a(f29723g, this, obj3, obj2)) {
                return;
            }
        }
    }

    /* renamed from: E */
    public final boolean mo24546E() {
        if (C11717b1.m46147d(this.f29037c)) {
            C11045c<T> cVar = this.f29725d;
            Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((C12000k) cVar).mo24371r()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: F */
    public final void mo24547F(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, C11300l<? super Integer, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    /* renamed from: G */
    public final void mo24548G(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* renamed from: H */
    public final C12060m mo24549H(C11300l<? super Throwable, C11079d2> lVar) {
        return lVar instanceof C12060m ? (C12060m) lVar : new C12181z1(lVar);
    }

    /* renamed from: I */
    public final void mo24550I(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    @C12579k
    /* renamed from: J */
    public String mo23668J() {
        return "CancellableContinuation";
    }

    @C12580l
    /* renamed from: K */
    public Object mo24530K(@C12579k Throwable th) {
        return mo24557U(new C11721c0(th, false, 2, (DefaultConstructorMarker) null), (Object) null, (C11300l<? super Throwable, C11079d2>) null);
    }

    /* renamed from: L */
    public final void mo24551L(@C12579k Throwable th) {
        if (!mo24566s(th)) {
            mo24535c(th);
            mo24569u();
        }
    }

    /* renamed from: M */
    public final void mo24552M() {
        C12000k kVar;
        Throwable y;
        C11045c<T> cVar = this.f29725d;
        if (cVar instanceof C12000k) {
            kVar = (C12000k) cVar;
        } else {
            kVar = null;
        }
        if (kVar != null && (y = kVar.mo24379y(this)) != null) {
            mo24567t();
            mo24535c(y);
        }
    }

    /* renamed from: N */
    public void mo24531N(@C12579k CoroutineDispatcher coroutineDispatcher, @C12579k Throwable th) {
        C12000k kVar;
        int i;
        C11045c<T> cVar = this.f29725d;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (cVar instanceof C12000k) {
            kVar = (C12000k) cVar;
        } else {
            kVar = null;
        }
        C11721c0 c0Var = new C11721c0(th, false, 2, (DefaultConstructorMarker) null);
        if (kVar != null) {
            coroutineDispatcher2 = kVar.f29599d;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i = 4;
        } else {
            i = this.f29037c;
        }
        m48209R(this, c0Var, i, (C11300l) null, 4, (Object) null);
    }

    /* renamed from: O */
    public void mo24532O(T t, @C12580l C11300l<? super Throwable, C11079d2> lVar) {
        mo24554Q(t, this.f29037c, lVar);
    }

    @C11314h(name = "resetStateReusable")
    /* renamed from: P */
    public final boolean mo24553P() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29723g;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (!(obj instanceof C11716b0) || ((C11716b0) obj).f29055d == null) {
            f29722f.set(this, 536870911);
            atomicReferenceFieldUpdater.set(this, C11766d.f29183a);
            return true;
        }
        mo24567t();
        return false;
    }

    /* renamed from: Q */
    public final void mo24554Q(Object obj, int i, C11300l<? super Throwable, C11079d2> lVar) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29723g;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C12087q2) {
            } else {
                if (obj2 instanceof C12093s) {
                    C12093s sVar = (C12093s) obj2;
                    if (sVar.mo24581c()) {
                        if (lVar != null) {
                            mo24564q(lVar, sVar.f29065a);
                            return;
                        }
                        return;
                    }
                }
                mo24560l(obj);
                throw new KotlinNothingValueException();
            }
        } while (!C16563a.m75000a(f29723g, this, obj2, mo24555S((C12087q2) obj2, obj, i, lVar, (Object) null)));
        mo24569u();
        mo24570v(i);
    }

    /* renamed from: S */
    public final Object mo24555S(C12087q2 q2Var, Object obj, int i, C11300l<? super Throwable, C11079d2> lVar, Object obj2) {
        C12060m mVar;
        if (obj instanceof C11721c0) {
            return obj;
        }
        if (!C11717b1.m46146c(i) && obj2 == null) {
            return obj;
        }
        if (lVar == null && !(q2Var instanceof C12060m) && obj2 == null) {
            return obj;
        }
        if (q2Var instanceof C12060m) {
            mVar = (C12060m) q2Var;
        } else {
            mVar = null;
        }
        return new C11716b0(obj, mVar, lVar, obj2, (Throwable) null, 16, (DefaultConstructorMarker) null);
    }

    /* renamed from: T */
    public final boolean mo24556T() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29722f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!f29722f.compareAndSet(this, i, 1073741824 + (536870911 & i)));
        return true;
    }

    /* renamed from: U */
    public final C12009o0 mo24557U(Object obj, Object obj2, C11300l<? super Throwable, C11079d2> lVar) {
        Object obj3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29723g;
        do {
            obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj3 instanceof C12087q2) {
            } else if (!(obj3 instanceof C11716b0) || obj2 == null || ((C11716b0) obj3).f29055d != obj2) {
                return null;
            } else {
                return C12084q.f29736g;
            }
        } while (!C16563a.m75000a(f29723g, this, obj3, mo24555S((C12087q2) obj3, obj, this.f29037c, lVar, obj2)));
        mo24569u();
        return C12084q.f29736g;
    }

    /* renamed from: V */
    public final boolean mo24558V() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29722f;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!f29722f.compareAndSet(this, i, 536870912 + (536870911 & i)));
        return true;
    }

    /* renamed from: W */
    public final void mo24559W(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, C11300l<? super Integer, Integer> lVar, Object obj) {
        int i;
        do {
            i = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i, lVar.invoke(Integer.valueOf(i)).intValue()));
    }

    @C12580l
    /* renamed from: a0 */
    public Object mo24533a0(T t, @C12580l Object obj, @C12580l C11300l<? super Throwable, C11079d2> lVar) {
        return mo24557U(t, obj, lVar);
    }

    /* renamed from: b */
    public void mo23862b(@C12579k C12003l0<?> l0Var, int i) {
        int i2;
        boolean z;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29722f;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) == 536870911) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        mo24545D(l0Var);
    }

    /* renamed from: b0 */
    public void mo24534b0(@C12579k CoroutineDispatcher coroutineDispatcher, T t) {
        C12000k kVar;
        int i;
        C11045c<T> cVar = this.f29725d;
        CoroutineDispatcher coroutineDispatcher2 = null;
        if (cVar instanceof C12000k) {
            kVar = (C12000k) cVar;
        } else {
            kVar = null;
        }
        if (kVar != null) {
            coroutineDispatcher2 = kVar.f29599d;
        }
        if (coroutineDispatcher2 == coroutineDispatcher) {
            i = 4;
        } else {
            i = this.f29037c;
        }
        m48209R(this, t, i, (C11300l) null, 4, (Object) null);
    }

    /* renamed from: c */
    public boolean mo24535c(@C12580l Throwable th) {
        Object obj;
        boolean z;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29723g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            z = false;
            if (!(obj instanceof C12087q2)) {
                return false;
            }
            if ((obj instanceof C12060m) || (obj instanceof C12003l0)) {
                z = true;
            }
        } while (!C16563a.m75000a(f29723g, this, obj, new C12093s(this, th, z)));
        C12087q2 q2Var = (C12087q2) obj;
        if (q2Var instanceof C12060m) {
            mo24562n((C12060m) obj, th);
        } else if (q2Var instanceof C12003l0) {
            mo24565r((C12003l0) obj, th);
        }
        mo24569u();
        mo24570v(this.f29037c);
        return true;
    }

    /* renamed from: d */
    public boolean mo24536d() {
        return mo24573z() instanceof C12087q2;
    }

    /* renamed from: e */
    public void mo23698e(@C12580l Object obj, @C12579k Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29723g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof C12087q2) {
                throw new IllegalStateException("Not completed".toString());
            } else if (!(obj2 instanceof C11721c0)) {
                if (obj2 instanceof C11716b0) {
                    C11716b0 b0Var = (C11716b0) obj2;
                    if (!b0Var.mo23740h()) {
                        Throwable th2 = th;
                        if (C16563a.m75000a(f29723g, this, obj2, C11716b0.m46135g(b0Var, (Object) null, (C12060m) null, (C11300l) null, (Object) null, th, 15, (Object) null))) {
                            b0Var.mo23742i(this, th2);
                            return;
                        }
                    } else {
                        throw new IllegalStateException("Must be called at most once".toString());
                    }
                } else {
                    Throwable th3 = th;
                    if (C16563a.m75000a(f29723g, this, obj2, new C11716b0(obj2, (C12060m) null, (C11300l) null, (Object) null, th, 14, (DefaultConstructorMarker) null))) {
                        return;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: e0 */
    public void mo24537e0() {
        C11962g1 B = mo24544B();
        if (B != null && mo24539j()) {
            B.mo23720g();
            f29724v.set(this, C12081p2.f29727a);
        }
    }

    @C12579k
    /* renamed from: f */
    public final C11045c<T> mo23699f() {
        return this.f29725d;
    }

    @C12580l
    /* renamed from: g */
    public Throwable mo23700g(@C12580l Object obj) {
        Throwable g = super.mo23700g(obj);
        if (g != null) {
            return g;
        }
        return null;
    }

    @C12580l
    public C11066c getCallerFrame() {
        C11045c<T> cVar = this.f29725d;
        if (cVar instanceof C11066c) {
            return (C11066c) cVar;
        }
        return null;
    }

    @C12579k
    public CoroutineContext getContext() {
        return this.f29726e;
    }

    @C12580l
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    /* renamed from: h */
    public <T> T mo23701h(@C12580l Object obj) {
        return obj instanceof C11716b0 ? ((C11716b0) obj).f29052a : obj;
    }

    public boolean isCancelled() {
        return mo24573z() instanceof C12093s;
    }

    /* renamed from: j */
    public boolean mo24539j() {
        return !(mo24573z() instanceof C12087q2);
    }

    @C12580l
    /* renamed from: k */
    public Object mo23703k() {
        return mo24573z();
    }

    /* renamed from: l */
    public final Void mo24560l(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    /* renamed from: m */
    public final void mo24561m(C11300l<? super Throwable, C11079d2> lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            C12051l0.m48104b(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: n */
    public final void mo24562n(@C12579k C12060m mVar, @C12580l Throwable th) {
        try {
            mVar.mo24071j(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            C12051l0.m48104b(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* renamed from: o */
    public final void mo24563o(C11289a<C11079d2> aVar) {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            CoroutineContext context = getContext();
            C12051l0.m48104b(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th));
        }
    }

    /* renamed from: o0 */
    public void mo24540o0(@C12579k Object obj) {
        mo24570v(this.f29037c);
    }

    @C12580l
    /* renamed from: p */
    public Object mo24541p(T t, @C12580l Object obj) {
        return mo24557U(t, obj, (C11300l<? super Throwable, C11079d2>) null);
    }

    /* renamed from: q */
    public final void mo24564q(@C12579k C11300l<? super Throwable, C11079d2> lVar, @C12579k Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            CoroutineContext context = getContext();
            C12051l0.m48104b(context, new CompletionHandlerException("Exception in resume onCancellation handler for " + this, th2));
        }
    }

    /* renamed from: r */
    public final void mo24565r(C12003l0<?> l0Var, Throwable th) {
        boolean z;
        int i = f29722f.get(this) & 536870911;
        if (i != 536870911) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            try {
                l0Var.mo23933q(i, th, getContext());
            } catch (Throwable th2) {
                CoroutineContext context = getContext();
                C12051l0.m48104b(context, new CompletionHandlerException("Exception in invokeOnCancellation handler for " + this, th2));
            }
        } else {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
    }

    public void resumeWith(@C12579k Object obj) {
        m48209R(this, C11966h0.m47676c(obj, this), this.f29037c, (C11300l) null, 4, (Object) null);
    }

    /* renamed from: s */
    public final boolean mo24566s(Throwable th) {
        if (!mo24546E()) {
            return false;
        }
        C11045c<T> cVar = this.f29725d;
        Intrinsics.checkNotNull(cVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((C12000k) cVar).mo24373t(th);
    }

    /* renamed from: t */
    public final void mo24567t() {
        C11962g1 x = mo24571x();
        if (x != null) {
            x.mo23720g();
            f29724v.set(this, C12081p2.f29727a);
        }
    }

    @C12579k
    public String toString() {
        return mo23668J() + '(' + C12090r0.m48302c(this.f29725d) + "){" + mo24543A() + "}@" + C12090r0.m48301b(this);
    }

    /* renamed from: u */
    public final void mo24569u() {
        if (!mo24546E()) {
            mo24567t();
        }
    }

    /* renamed from: v */
    public final void mo24570v(int i) {
        if (!mo24556T()) {
            C11717b1.m46144a(this, i);
        }
    }

    @C12579k
    /* renamed from: w */
    public Throwable mo23669w(@C12579k C11723c2 c2Var) {
        return c2Var.mo23653u();
    }

    /* renamed from: x */
    public final C11962g1 mo24571x() {
        return (C11962g1) f29724v.get(this);
    }

    @C12580l
    @C11532s0
    /* renamed from: y */
    public final Object mo24572y() {
        C11723c2 c2Var;
        boolean E = mo24546E();
        if (mo24558V()) {
            if (mo24571x() == null) {
                mo24544B();
            }
            if (E) {
                mo24552M();
            }
            return C11063b.m42612h();
        }
        if (E) {
            mo24552M();
        }
        Object z = mo24573z();
        if (z instanceof C11721c0) {
            throw ((C11721c0) z).f29065a;
        } else if (!C11717b1.m46146c(this.f29037c) || (c2Var = (C11723c2) getContext().mo7444b(C11723c2.f29067w0)) == null || c2Var.mo23627d()) {
            return mo23701h(z);
        } else {
            CancellationException u = c2Var.mo23653u();
            mo23698e(z, u);
            throw u;
        }
    }

    @C12580l
    /* renamed from: z */
    public final Object mo24573z() {
        return f29723g.get(this);
    }
}
