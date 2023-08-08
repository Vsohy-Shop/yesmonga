package kotlinx.coroutines;

import androidx.concurrent.futures.C16563a;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C12164w0;
import kotlinx.coroutines.internal.C12027x;
import kotlinx.coroutines.internal.C12030x0;
import kotlinx.coroutines.internal.C12032y0;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n60#2:544\n61#2,7:550\n28#3,4:545\n20#4:549\n56#5:557\n1#6:558\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n269#1:544\n269#1:550,7\n269#1:545,4\n269#1:549\n280#1:557\n*E\n"})
/* renamed from: kotlinx.coroutines.l1 */
public abstract class C12053l1 extends C12063m1 implements C12164w0 {
    @C12579k

    /* renamed from: f */
    public static final AtomicReferenceFieldUpdater f29695f;
    @C12579k

    /* renamed from: g */
    public static final AtomicReferenceFieldUpdater f29696g;
    @C12579k

    /* renamed from: v */
    public static final AtomicIntegerFieldUpdater f29697v;
    @C11394v
    @C12580l
    private volatile Object _delayed;
    @C11394v
    private volatile int _isCompleted = 0;
    @C11394v
    @C12580l
    private volatile Object _queue;

    @C11363r0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
    /* renamed from: kotlinx.coroutines.l1$a */
    public final class C12054a extends C12056c {
        @C12579k

        /* renamed from: c */
        public final C12072o<C11079d2> f29698c;

        public C12054a(long j, @C12579k C12072o<? super C11079d2> oVar) {
            super(j);
            this.f29698c = oVar;
        }

        public void run() {
            this.f29698c.mo24534b0(C12053l1.this, C11079d2.f28267a);
        }

        @C12579k
        public String toString() {
            return super.toString() + this.f29698c;
        }
    }

    /* renamed from: kotlinx.coroutines.l1$b */
    public static final class C12055b extends C12056c {
        @C12579k

        /* renamed from: c */
        public final Runnable f29700c;

        public C12055b(long j, @C12579k Runnable runnable) {
            super(j);
            this.f29700c = runnable;
        }

        public void run() {
            this.f29700c.run();
        }

        @C12579k
        public String toString() {
            return super.toString() + this.f29700c;
        }
    }

    @C11363r0({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,543:1\n28#2,4:544\n28#2,4:550\n28#2,4:562\n20#3:548\n20#3:554\n20#3:566\n72#4:549\n73#4,7:555\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n437#1:544,4\n439#1:550,4\n479#1:562,4\n437#1:548\n439#1:554\n479#1:566\n439#1:549\n439#1:555,7\n*E\n"})
    /* renamed from: kotlinx.coroutines.l1$c */
    public static abstract class C12056c implements Runnable, Comparable<C12056c>, C11962g1, C12032y0 {
        @C12580l
        private volatile Object _heap;
        @C11287e

        /* renamed from: a */
        public long f29701a;

        /* renamed from: b */
        public int f29702b = -1;

        public C12056c(long j) {
            this.f29701a = j;
        }

        /* renamed from: b */
        public void mo24463b(@C12580l C12030x0<?> x0Var) {
            boolean z;
            if (this._heap != C12075o1.f29712a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this._heap = x0Var;
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }

        /* renamed from: g */
        public final void mo23720g() {
            C12057d dVar;
            synchronized (this) {
                Object obj = this._heap;
                if (obj != C12075o1.f29712a) {
                    if (obj instanceof C12057d) {
                        dVar = (C12057d) obj;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null) {
                        dVar.mo24455k(this);
                    }
                    this._heap = C12075o1.f29712a;
                    C11079d2 d2Var = C11079d2.f28267a;
                }
            }
        }

        public int getIndex() {
            return this.f29702b;
        }

        @C12580l
        /* renamed from: r */
        public C12030x0<?> mo24465r() {
            Object obj = this._heap;
            if (obj instanceof C12030x0) {
                return (C12030x0) obj;
            }
            return null;
        }

        public void setIndex(int i) {
            this.f29702b = i;
        }

        @C12579k
        public String toString() {
            return "Delayed[nanos=" + this.f29701a + C12361b.f30261l;
        }

        /* renamed from: w */
        public int compareTo(@C12579k C12056c cVar) {
            int i = ((this.f29701a - cVar.f29701a) > 0 ? 1 : ((this.f29701a - cVar.f29701a) == 0 ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        /* renamed from: y */
        public final int mo24507y(long j, @C12579k C12057d dVar, @C12579k C12053l1 l1Var) {
            synchronized (this) {
                if (this._heap == C12075o1.f29712a) {
                    return 2;
                }
                synchronized (dVar) {
                    C12056c cVar = (C12056c) dVar.mo24450f();
                    if (l1Var.m48108j()) {
                        return 1;
                    }
                    if (cVar == null) {
                        dVar.f29703c = j;
                    } else {
                        long j2 = cVar.f29701a;
                        if (j2 - j < 0) {
                            j = j2;
                        }
                        if (j - dVar.f29703c > 0) {
                            dVar.f29703c = j;
                        }
                    }
                    long j3 = this.f29701a;
                    long j4 = dVar.f29703c;
                    if (j3 - j4 < 0) {
                        this.f29701a = j4;
                    }
                    dVar.mo24445a(this);
                    return 0;
                }
            }
        }

        /* renamed from: z */
        public final boolean mo24508z(long j) {
            return j - this.f29701a >= 0;
        }
    }

    /* renamed from: kotlinx.coroutines.l1$d */
    public static final class C12057d extends C12030x0<C12056c> {
        @C11287e

        /* renamed from: c */
        public long f29703c;

        public C12057d(long j) {
            this.f29703c = j;
        }
    }

    static {
        Class<C12053l1> cls = C12053l1.class;
        Class<Object> cls2 = Object.class;
        f29695f = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_queue");
        f29696g = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_delayed");
        f29697v = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleted");
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public final boolean m48108j() {
        if (f29697v.get(this) != 0) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: C */
    public C11962g1 mo23705C(long j, @C12579k Runnable runnable, @C12579k CoroutineContext coroutineContext) {
        return C12164w0.C12165a.m48734b(this, j, runnable, coroutineContext);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x005b  */
    /* renamed from: D0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo24478D0() {
        /*
            r9 = this;
            boolean r0 = r9.mo24479E0()
            r1 = 0
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29696g
            java.lang.Object r0 = r0.get(r9)
            kotlinx.coroutines.l1$d r0 = (kotlinx.coroutines.C12053l1.C12057d) r0
            if (r0 == 0) goto L_0x0051
            boolean r3 = r0.mo24452h()
            if (r3 != 0) goto L_0x0051
            kotlinx.coroutines.b r3 = kotlinx.coroutines.C11720c.m46159b()
            if (r3 == 0) goto L_0x0024
            long r3 = r3.mo23725b()
            goto L_0x0028
        L_0x0024:
            long r3 = java.lang.System.nanoTime()
        L_0x0028:
            monitor-enter(r0)
            kotlinx.coroutines.internal.y0 r5 = r0.mo24450f()     // Catch:{ all -> 0x004e }
            r6 = 0
            if (r5 != 0) goto L_0x0032
            monitor-exit(r0)
            goto L_0x0049
        L_0x0032:
            kotlinx.coroutines.l1$c r5 = (kotlinx.coroutines.C12053l1.C12056c) r5     // Catch:{ all -> 0x004e }
            boolean r7 = r5.mo24508z(r3)     // Catch:{ all -> 0x004e }
            r8 = 0
            if (r7 == 0) goto L_0x0040
            boolean r5 = r9.mo24493Z0(r5)     // Catch:{ all -> 0x004e }
            goto L_0x0041
        L_0x0040:
            r5 = r8
        L_0x0041:
            if (r5 == 0) goto L_0x0048
            kotlinx.coroutines.internal.y0 r5 = r0.mo24456l(r8)     // Catch:{ all -> 0x004e }
            r6 = r5
        L_0x0048:
            monitor-exit(r0)
        L_0x0049:
            kotlinx.coroutines.l1$c r6 = (kotlinx.coroutines.C12053l1.C12056c) r6
            if (r6 != 0) goto L_0x0028
            goto L_0x0051
        L_0x004e:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x0051:
            java.lang.Runnable r0 = r9.mo24491R0()
            if (r0 == 0) goto L_0x005b
            r0.run()
            return r1
        L_0x005b:
            long r0 = r9.mo24485e0()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12053l1.mo24478D0():long");
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @C12580l
    /* renamed from: N */
    public Object mo23721N(long j, @C12579k C11045c<? super C11079d2> cVar) {
        return C12164w0.C12165a.m48733a(this, j, cVar);
    }

    /* renamed from: O */
    public final void mo23563O(@C12579k CoroutineContext coroutineContext, @C12579k Runnable runnable) {
        mo24492U0(runnable);
    }

    /* renamed from: O0 */
    public final void mo24490O0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29695f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                if (C16563a.m75000a(f29695f, this, (Object) null, C12075o1.f29719h)) {
                    return;
                }
            } else if (obj instanceof C12027x) {
                ((C12027x) obj).mo24426d();
                return;
            } else if (obj != C12075o1.f29719h) {
                C12027x xVar = new C12027x(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                xVar.mo24423a((Runnable) obj);
                if (C16563a.m75000a(f29695f, this, obj, xVar)) {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: R0 */
    public final Runnable mo24491R0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29695f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof C12027x) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C12027x xVar = (C12027x) obj;
                Object n = xVar.mo24436n();
                if (n != C12027x.f29652t) {
                    return (Runnable) n;
                }
                C16563a.m75000a(f29695f, this, obj, xVar.mo24435m());
            } else if (obj == C12075o1.f29719h) {
                return null;
            } else {
                if (C16563a.m75000a(f29695f, this, obj, (Object) null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    /* renamed from: U0 */
    public void mo24492U0(@C12579k Runnable runnable) {
        if (mo24493Z0(runnable)) {
            mo24518L0();
        } else {
            C12094s0.f29753w.mo24492U0(runnable);
        }
    }

    /* renamed from: Z0 */
    public final boolean mo24493Z0(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29695f;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (m48108j()) {
                return false;
            }
            if (obj == null) {
                if (C16563a.m75000a(f29695f, this, (Object) null, runnable)) {
                    return true;
                }
            } else if (obj instanceof C12027x) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                C12027x xVar = (C12027x) obj;
                int a = xVar.mo24423a(runnable);
                if (a == 0) {
                    return true;
                }
                if (a == 1) {
                    C16563a.m75000a(f29695f, this, obj, xVar.mo24435m());
                } else if (a == 2) {
                    return false;
                }
            } else if (obj == C12075o1.f29719h) {
                return false;
            } else {
                C12027x xVar2 = new C12027x(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                xVar2.mo24423a((Runnable) obj);
                xVar2.mo24423a(runnable);
                if (C16563a.m75000a(f29695f, this, obj, xVar2)) {
                    return true;
                }
            }
        }
    }

    /* renamed from: a1 */
    public final void mo24494a1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* renamed from: c1 */
    public final void mo24495c1() {
        long j;
        C12056c cVar;
        C11715b b = C11720c.m46159b();
        if (b != null) {
            j = b.mo23725b();
        } else {
            j = System.nanoTime();
        }
        while (true) {
            C12057d dVar = (C12057d) f29696g.get(this);
            if (dVar != null && (cVar = (C12056c) dVar.mo24458n()) != null) {
                mo24517K0(j, cVar);
            } else {
                return;
            }
        }
    }

    /* renamed from: e0 */
    public long mo24485e0() {
        C12056c cVar;
        long j;
        if (super.mo24485e0() == 0) {
            return 0;
        }
        Object obj = f29695f.get(this);
        if (obj != null) {
            if (obj instanceof C12027x) {
                if (!((C12027x) obj).mo24430h()) {
                    return 0;
                }
            } else if (obj == C12075o1.f29719h) {
                return Long.MAX_VALUE;
            } else {
                return 0;
            }
        }
        C12057d dVar = (C12057d) f29696g.get(this);
        if (dVar == null || (cVar = (C12056c) dVar.mo24453i()) == null) {
            return Long.MAX_VALUE;
        }
        long j2 = cVar.f29701a;
        C11715b b = C11720c.m46159b();
        if (b != null) {
            j = b.mo23725b();
        } else {
            j = System.nanoTime();
        }
        return C11479u.m44450v(j2 - j, 0);
    }

    /* renamed from: g1 */
    public final void mo24496g1() {
        f29695f.set(this, (Object) null);
        f29696g.set(this, (Object) null);
    }

    /* renamed from: j1 */
    public final void mo24497j1(long j, @C12579k C12056c cVar) {
        int k1 = mo24498k1(j, cVar);
        if (k1 != 0) {
            if (k1 == 1) {
                mo24517K0(j, cVar);
            } else if (k1 != 2) {
                throw new IllegalStateException("unexpected result".toString());
            }
        } else if (mo24501w1(cVar)) {
            mo24518L0();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: kotlinx.coroutines.l1$d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo24498k1(long r4, kotlinx.coroutines.C12053l1.C12056c r6) {
        /*
            r3 = this;
            boolean r0 = r3.m48108j()
            if (r0 == 0) goto L_0x0008
            r4 = 1
            return r4
        L_0x0008:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = f29696g
            java.lang.Object r1 = r0.get(r3)
            kotlinx.coroutines.l1$d r1 = (kotlinx.coroutines.C12053l1.C12057d) r1
            if (r1 != 0) goto L_0x0025
            kotlinx.coroutines.l1$d r1 = new kotlinx.coroutines.l1$d
            r1.<init>(r4)
            r2 = 0
            androidx.concurrent.futures.C16563a.m75000a(r0, r3, r2, r1)
            java.lang.Object r0 = r0.get(r3)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)
            r1 = r0
            kotlinx.coroutines.l1$d r1 = (kotlinx.coroutines.C12053l1.C12057d) r1
        L_0x0025:
            int r4 = r6.mo24507y(r4, r1, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C12053l1.mo24498k1(long, kotlinx.coroutines.l1$c):int");
    }

    @C12579k
    /* renamed from: n1 */
    public final C11962g1 mo24499n1(long j, @C12579k Runnable runnable) {
        long j2;
        long d = C12075o1.m48189d(j);
        if (d >= 4611686018427387903L) {
            return C12081p2.f29727a;
        }
        C11715b b = C11720c.m46159b();
        if (b != null) {
            j2 = b.mo23725b();
        } else {
            j2 = System.nanoTime();
        }
        C12055b bVar = new C12055b(d + j2, runnable);
        mo24497j1(j2, bVar);
        return bVar;
    }

    /* renamed from: p */
    public void mo23711p(long j, @C12579k C12072o<? super C11079d2> oVar) {
        long j2;
        long d = C12075o1.m48189d(j);
        if (d < 4611686018427387903L) {
            C11715b b = C11720c.m46159b();
            if (b != null) {
                j2 = b.mo23725b();
            } else {
                j2 = System.nanoTime();
            }
            C12054a aVar = new C12054a(d + j2, oVar);
            mo24497j1(j2, aVar);
            C12089r.m48294a(oVar, aVar);
        }
    }

    /* renamed from: q1 */
    public final void mo24500q1(boolean z) {
        f29697v.set(this, z ? 1 : 0);
    }

    public void shutdown() {
        C11800e3.f29268a.mo24077c();
        mo24500q1(true);
        mo24490O0();
        do {
        } while (mo24478D0() <= 0);
        mo24495c1();
    }

    /* renamed from: w1 */
    public final boolean mo24501w1(C12056c cVar) {
        C12057d dVar = (C12057d) f29696g.get(this);
        return (dVar != null ? (C12056c) dVar.mo24453i() : null) == cVar;
    }

    /* renamed from: x0 */
    public boolean mo24488x0() {
        if (!mo24477C0()) {
            return false;
        }
        C12057d dVar = (C12057d) f29696g.get(this);
        if (dVar != null && !dVar.mo24452h()) {
            return false;
        }
        Object obj = f29695f.get(this);
        if (obj != null) {
            if (obj instanceof C12027x) {
                return ((C12027x) obj).mo24430h();
            }
            if (obj != C12075o1.f29719h) {
                return false;
            }
        }
        return true;
    }
}
