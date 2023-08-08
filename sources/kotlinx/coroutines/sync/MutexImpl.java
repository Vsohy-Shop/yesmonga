package kotlinx.coroutines.sync;

import androidx.concurrent.futures.C16563a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11962g1;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12077o3;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.C12089r;
import kotlinx.coroutines.C12090r0;
import kotlinx.coroutines.C12095s1;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.C12003l0;
import kotlinx.coroutines.internal.C12009o0;
import kotlinx.coroutines.selects.C12128g;
import kotlinx.coroutines.selects.C12129h;
import kotlinx.coroutines.selects.C12131j;
import kotlinx.coroutines.selects.C12132k;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n332#2,12:311\n1#3:323\n*S KotlinDebug\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl\n*L\n175#1:311,12\n*E\n"})
public class MutexImpl extends SemaphoreImpl implements C12139a {
    @C12579k

    /* renamed from: i */
    public static final AtomicReferenceFieldUpdater f29897i = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner");
    @C12579k

    /* renamed from: h */
    public final C11305q<C12131j<?>, Object, Object, C11300l<Throwable, C11079d2>> f29898h;
    @C11394v
    @C12580l
    private volatile Object owner;

    @C11363r0({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$CancellableContinuationWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    public final class CancellableContinuationWithOwner implements C12072o<C11079d2>, C12077o3 {
        @C12579k
        @C11287e

        /* renamed from: a */
        public final C12078p<C11079d2> f29899a;
        @C12580l
        @C11287e

        /* renamed from: b */
        public final Object f29900b;

        public CancellableContinuationWithOwner(@C12579k C12078p<? super C11079d2> pVar, @C12580l Object obj) {
            this.f29899a = pVar;
            this.f29900b = obj;
        }

        /* renamed from: C */
        public void mo24529C(@C12579k C11300l<? super Throwable, C11079d2> lVar) {
            this.f29899a.mo24529C(lVar);
        }

        @C12177y1
        @C12580l
        /* renamed from: K */
        public Object mo24530K(@C12579k Throwable th) {
            return this.f29899a.mo24530K(th);
        }

        @C12095s1
        /* renamed from: N */
        public void mo24531N(@C12579k CoroutineDispatcher coroutineDispatcher, @C12579k Throwable th) {
            this.f29899a.mo24531N(coroutineDispatcher, th);
        }

        /* renamed from: a */
        public void mo24532O(@C12579k C11079d2 d2Var, @C12580l C11300l<? super Throwable, C11079d2> lVar) {
            MutexImpl.f29897i.set(MutexImpl.this, this.f29900b);
            this.f29899a.mo24532O(d2Var, new MutexImpl$CancellableContinuationWithOwner$resume$2(MutexImpl.this, this));
        }

        /* renamed from: b */
        public void mo23862b(@C12579k C12003l0<?> l0Var, int i) {
            this.f29899a.mo23862b(l0Var, i);
        }

        /* renamed from: c */
        public boolean mo24535c(@C12580l Throwable th) {
            return this.f29899a.mo24535c(th);
        }

        /* renamed from: d */
        public boolean mo24536d() {
            return this.f29899a.mo24536d();
        }

        @C12095s1
        /* renamed from: e */
        public void mo24534b0(@C12579k CoroutineDispatcher coroutineDispatcher, @C12579k C11079d2 d2Var) {
            this.f29899a.mo24534b0(coroutineDispatcher, d2Var);
        }

        @C12177y1
        /* renamed from: e0 */
        public void mo24537e0() {
            this.f29899a.mo24537e0();
        }

        @C12177y1
        @C12580l
        /* renamed from: f */
        public Object mo24541p(@C12579k C11079d2 d2Var, @C12580l Object obj) {
            return this.f29899a.mo24541p(d2Var, obj);
        }

        @C12580l
        /* renamed from: g */
        public Object mo24533a0(@C12579k C11079d2 d2Var, @C12580l Object obj, @C12580l C11300l<? super Throwable, C11079d2> lVar) {
            Object a0 = this.f29899a.mo24533a0(d2Var, obj, new MutexImpl$CancellableContinuationWithOwner$tryResume$token$1(MutexImpl.this, this));
            if (a0 != null) {
                MutexImpl.f29897i.set(MutexImpl.this, this.f29900b);
            }
            return a0;
        }

        @C12579k
        public CoroutineContext getContext() {
            return this.f29899a.getContext();
        }

        public boolean isCancelled() {
            return this.f29899a.isCancelled();
        }

        /* renamed from: j */
        public boolean mo24539j() {
            return this.f29899a.mo24539j();
        }

        @C12177y1
        /* renamed from: o0 */
        public void mo24540o0(@C12579k Object obj) {
            this.f29899a.mo24540o0(obj);
        }

        public void resumeWith(@C12579k Object obj) {
            this.f29899a.resumeWith(obj);
        }
    }

    @C11363r0({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexImpl$SelectInstanceWithOwner\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,310:1\n1#2:311\n*E\n"})
    /* renamed from: kotlinx.coroutines.sync.MutexImpl$a */
    public final class C12137a<Q> implements C12132k<Q> {
        @C12579k
        @C11287e

        /* renamed from: a */
        public final C12132k<Q> f29902a;
        @C12580l
        @C11287e

        /* renamed from: b */
        public final Object f29903b;

        public C12137a(@C12579k C12132k<Q> kVar, @C12580l Object obj) {
            this.f29902a = kVar;
            this.f29903b = obj;
        }

        /* renamed from: b */
        public void mo23862b(@C12579k C12003l0<?> l0Var, int i) {
            this.f29902a.mo23862b(l0Var, i);
        }

        /* renamed from: e */
        public void mo24707e(@C12580l Object obj) {
            MutexImpl.f29897i.set(MutexImpl.this, this.f29903b);
            this.f29902a.mo24707e(obj);
        }

        /* renamed from: f */
        public void mo24708f(@C12579k C11962g1 g1Var) {
            this.f29902a.mo24708f(g1Var);
        }

        @C12579k
        public CoroutineContext getContext() {
            return this.f29902a.getContext();
        }

        /* renamed from: h */
        public boolean mo24711h(@C12579k Object obj, @C12580l Object obj2) {
            boolean h = this.f29902a.mo24711h(obj, obj2);
            MutexImpl mutexImpl = MutexImpl.this;
            if (h) {
                MutexImpl.f29897i.set(mutexImpl, this.f29903b);
            }
            return h;
        }
    }

    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        C12009o0 o0Var;
        if (z) {
            o0Var = null;
        } else {
            o0Var = MutexKt.f29907a;
        }
        this.owner = o0Var;
        this.f29898h = new MutexImpl$onSelectCancellationUnlockConstructor$1(this);
    }

    /* renamed from: x */
    public static /* synthetic */ void m48568x() {
    }

    /* renamed from: z */
    public static /* synthetic */ Object m48569z(MutexImpl mutexImpl, Object obj, C11045c<? super C11079d2> cVar) {
        if (mutexImpl.mo24737c(obj)) {
            return C11079d2.f28267a;
        }
        Object A = mutexImpl.mo24733A(obj, cVar);
        if (A == C11063b.m42612h()) {
            return A;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: A */
    public final Object mo24733A(Object obj, C11045c<? super C11079d2> cVar) {
        C12078p<? super C11079d2> b = C12089r.m48295b(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar));
        try {
            mo24759m(new CancellableContinuationWithOwner(b, obj));
            Object y = b.mo24572y();
            if (y == C11063b.m42612h()) {
                C11069f.m42638c(cVar);
            }
            if (y == C11063b.m42612h()) {
                return y;
            }
            return C11079d2.f28267a;
        } catch (Throwable th) {
            b.mo24552M();
            throw th;
        }
    }

    @C12580l
    /* renamed from: B */
    public Object mo24734B(@C12580l Object obj, @C12580l Object obj2) {
        if (!Intrinsics.areEqual(obj2, (Object) MutexKt.f29908b)) {
            return this;
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* renamed from: C */
    public void mo24735C(@C12579k C12131j<?> jVar, @C12580l Object obj) {
        if (obj == null || !mo24741h(obj)) {
            Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectInstanceInternal<*>");
            mo24765s(new C12137a((C12132k) jVar, obj), obj);
            return;
        }
        jVar.mo24707e(MutexKt.f29908b);
    }

    /* renamed from: D */
    public final int mo24736D(Object obj) {
        while (!mo24756b()) {
            if (obj == null) {
                return 1;
            }
            int y = mo24744y(obj);
            if (y == 1) {
                return 2;
            }
            if (y == 2) {
                return 1;
            }
        }
        f29897i.set(this, obj);
        return 0;
    }

    /* renamed from: c */
    public boolean mo24737c(@C12580l Object obj) {
        int D = mo24736D(obj);
        if (D == 0) {
            return true;
        }
        if (D == 1) {
            return false;
        }
        if (D != 2) {
            throw new IllegalStateException("unexpected".toString());
        }
        throw new IllegalStateException(("This mutex is already locked by the specified owner: " + obj).toString());
    }

    /* renamed from: d */
    public boolean mo24738d() {
        return mo24755a() == 0;
    }

    @C12580l
    /* renamed from: f */
    public Object mo24739f(@C12580l Object obj, @C12579k C11045c<? super C11079d2> cVar) {
        return m48569z(this, obj, cVar);
    }

    /* renamed from: g */
    public void mo24740g(@C12580l Object obj) {
        boolean z;
        while (mo24738d()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29897i;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 != MutexKt.f29907a) {
                if (obj2 == obj || obj == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                } else if (C16563a.m75000a(atomicReferenceFieldUpdater, this, obj2, MutexKt.f29907a)) {
                    release();
                    return;
                }
            }
        }
        throw new IllegalStateException("This mutex is not locked".toString());
    }

    /* renamed from: h */
    public boolean mo24741h(@C12579k Object obj) {
        return mo24744y(obj) == 1;
    }

    @C12579k
    /* renamed from: i */
    public C12128g<Object, C12139a> mo24742i() {
        MutexImpl$onLock$1 mutexImpl$onLock$1 = MutexImpl$onLock$1.f29905a;
        Intrinsics.checkNotNull(mutexImpl$onLock$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        MutexImpl$onLock$2 mutexImpl$onLock$2 = MutexImpl$onLock$2.f29906a;
        Intrinsics.checkNotNull(mutexImpl$onLock$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C12129h(this, (C11305q) C11370u0.m43701q(mutexImpl$onLock$1, 3), (C11305q) C11370u0.m43701q(mutexImpl$onLock$2, 3), this.f29898h);
    }

    @C12579k
    public String toString() {
        return "Mutex@" + C12090r0.m48301b(this) + "[isLocked=" + mo24738d() + ",owner=" + f29897i.get(this) + C12361b.f30261l;
    }

    /* renamed from: y */
    public final int mo24744y(Object obj) {
        while (mo24738d()) {
            Object obj2 = f29897i.get(this);
            if (obj2 != MutexKt.f29907a) {
                if (obj2 == obj) {
                    return 1;
                }
                return 2;
            }
        }
        return 0;
    }
}
