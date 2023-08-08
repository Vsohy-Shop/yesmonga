package kotlinx.coroutines.sync;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12077o3;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.C12089r;
import kotlinx.coroutines.selects.C12131j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,397:1\n205#1,10:411\n205#1,10:421\n1#2:398\n332#3,12:399\n72#4,3:431\n46#4,8:434\n72#4,3:445\n46#4,8:448\n375#5:442\n375#5:443\n367#5:444\n378#5:456\n367#5:457\n375#5:458\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreImpl\n*L\n197#1:411,10\n221#1:421,10\n187#1:399,12\n289#1:431,3\n289#1:434,8\n322#1:445,3\n322#1:448,8\n293#1:442\n299#1:443\n313#1:444\n328#1:456\n334#1:457\n337#1:458\n*E\n"})
public class SemaphoreImpl implements C12141b {
    @C12579k

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f29915c;
    @C12579k

    /* renamed from: d */
    public static final AtomicLongFieldUpdater f29916d;
    @C12579k

    /* renamed from: e */
    public static final AtomicReferenceFieldUpdater f29917e;
    @C12579k

    /* renamed from: f */
    public static final AtomicLongFieldUpdater f29918f;
    @C12579k

    /* renamed from: g */
    public static final AtomicIntegerFieldUpdater f29919g;
    @C11394v
    private volatile int _availablePermits;

    /* renamed from: a */
    public final int f29920a;
    @C12579k

    /* renamed from: b */
    public final C11300l<Throwable, C11079d2> f29921b;
    @C11394v
    private volatile long deqIdx;
    @C11394v
    private volatile long enqIdx;
    @C11394v
    @C12580l
    private volatile Object head;
    @C11394v
    @C12580l
    private volatile Object tail;

    static {
        Class<SemaphoreImpl> cls = SemaphoreImpl.class;
        Class<Object> cls2 = Object.class;
        f29915c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "head");
        f29916d = AtomicLongFieldUpdater.newUpdater(cls, "deqIdx");
        f29917e = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "tail");
        f29918f = AtomicLongFieldUpdater.newUpdater(cls, "enqIdx");
        f29919g = AtomicIntegerFieldUpdater.newUpdater(cls, "_availablePermits");
    }

    public SemaphoreImpl(int i, int i2) {
        boolean z;
        this.f29920a = i;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if ((i2 < 0 || i2 > i) ? false : z2) {
                C12142c cVar = new C12142c(0, (C12142c) null, 2);
                this.head = cVar;
                this.tail = cVar;
                this._availablePermits = i - i2;
                this.f29921b = new SemaphoreImpl$onCancellationRelease$1(this);
                return;
            }
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i).toString());
        }
        throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i).toString());
    }

    /* renamed from: n */
    public static /* synthetic */ Object m48614n(SemaphoreImpl semaphoreImpl, C11045c<? super C11079d2> cVar) {
        if (semaphoreImpl.mo24763r() > 0) {
            return C11079d2.f28267a;
        }
        Object o = semaphoreImpl.mo24760o(cVar);
        if (o == C11063b.m42612h()) {
            return o;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: a */
    public int mo24755a() {
        return Math.max(f29919g.get(this), 0);
    }

    /* renamed from: b */
    public boolean mo24756b() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f29919g;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i > this.f29920a) {
                mo24762q();
            } else if (i <= 0) {
                return false;
            } else {
                if (atomicIntegerFieldUpdater.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    @C12580l
    /* renamed from: e */
    public Object mo24757e(@C12579k C11045c<? super C11079d2> cVar) {
        return m48614n(this, cVar);
    }

    /* renamed from: l */
    public final <W> void mo24758l(W w, C11300l<? super W, Boolean> lVar, C11300l<? super W, C11079d2> lVar2) {
        while (mo24763r() <= 0) {
            if (lVar.invoke(w).booleanValue()) {
                return;
            }
        }
        lVar2.invoke(w);
    }

    /* renamed from: m */
    public final void mo24759m(@C12579k C12072o<? super C11079d2> oVar) {
        while (mo24763r() <= 0) {
            Intrinsics.checkNotNull(oVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (mo24761p((C12077o3) oVar)) {
                return;
            }
        }
        oVar.mo24532O(C11079d2.f28267a, this.f29921b);
    }

    /* renamed from: o */
    public final Object mo24760o(C11045c<? super C11079d2> cVar) {
        C12078p<? super C11079d2> b = C12089r.m48295b(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar));
        try {
            if (!mo24761p(b)) {
                mo24759m(b);
            }
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

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0051, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0037, code lost:
        r10 = true;
     */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24761p(kotlinx.coroutines.C12077o3 r17) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = f29917e
            java.lang.Object r3 = r2.get(r0)
            kotlinx.coroutines.sync.c r3 = (kotlinx.coroutines.sync.C12142c) r3
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f29918f
            long r4 = r4.getAndIncrement(r0)
            kotlinx.coroutines.sync.SemaphoreImpl$addAcquireToQueue$createNewSegment$1 r6 = kotlinx.coroutines.sync.SemaphoreImpl$addAcquireToQueue$createNewSegment$1.f29922a
            int r7 = kotlinx.coroutines.sync.SemaphoreKt.f29929f
            long r7 = (long) r7
            long r7 = r4 / r7
        L_0x001b:
            java.lang.Object r9 = kotlinx.coroutines.internal.C11988e.m47811g(r3, r7, r6)
            boolean r10 = kotlinx.coroutines.internal.C12005m0.m47894h(r9)
            if (r10 != 0) goto L_0x005e
            kotlinx.coroutines.internal.l0 r10 = kotlinx.coroutines.internal.C12005m0.m47892f(r9)
        L_0x0029:
            java.lang.Object r13 = r2.get(r0)
            kotlinx.coroutines.internal.l0 r13 = (kotlinx.coroutines.internal.C12003l0) r13
            long r14 = r13.f29607c
            long r11 = r10.f29607c
            int r11 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x0039
        L_0x0037:
            r10 = 1
            goto L_0x0051
        L_0x0039:
            boolean r11 = r10.mo24382s()
            if (r11 != 0) goto L_0x0041
            r10 = 0
            goto L_0x0051
        L_0x0041:
            boolean r11 = androidx.concurrent.futures.C16563a.m75000a(r2, r0, r13, r10)
            if (r11 == 0) goto L_0x0054
            boolean r10 = r13.mo24380o()
            if (r10 == 0) goto L_0x0037
            r13.mo24359l()
            goto L_0x0037
        L_0x0051:
            if (r10 == 0) goto L_0x001b
            goto L_0x005e
        L_0x0054:
            boolean r11 = r10.mo24380o()
            if (r11 == 0) goto L_0x0029
            r10.mo24359l()
            goto L_0x0029
        L_0x005e:
            kotlinx.coroutines.internal.l0 r2 = kotlinx.coroutines.internal.C12005m0.m47892f(r9)
            kotlinx.coroutines.sync.c r2 = (kotlinx.coroutines.sync.C12142c) r2
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.f29929f
            long r6 = (long) r3
            long r4 = r4 % r6
            int r3 = (int) r4
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r2.mo24774v()
            r5 = 0
            boolean r4 = kotlinx.coroutines.channels.C11753k.m46648a(r4, r3, r5, r1)
            if (r4 == 0) goto L_0x007b
            r1.mo23862b(r2, r3)
            r1 = 1
            return r1
        L_0x007b:
            kotlinx.coroutines.internal.o0 r4 = kotlinx.coroutines.sync.SemaphoreKt.f29925b
            kotlinx.coroutines.internal.o0 r5 = kotlinx.coroutines.sync.SemaphoreKt.f29926c
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r2.mo24774v()
            boolean r2 = kotlinx.coroutines.channels.C11753k.m46648a(r2, r3, r4, r5)
            if (r2 == 0) goto L_0x00c9
            boolean r2 = r1 instanceof kotlinx.coroutines.C12072o
            if (r2 == 0) goto L_0x00a1
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1, r2)
            kotlinx.coroutines.o r1 = (kotlinx.coroutines.C12072o) r1
            kotlin.d2 r2 = kotlin.C11079d2.f28267a
            kotlin.jvm.functions.l<java.lang.Throwable, kotlin.d2> r3 = r0.f29921b
            r1.mo24532O(r2, r3)
        L_0x009f:
            r1 = 1
            goto L_0x00ad
        L_0x00a1:
            boolean r2 = r1 instanceof kotlinx.coroutines.selects.C12131j
            if (r2 == 0) goto L_0x00ae
            kotlinx.coroutines.selects.j r1 = (kotlinx.coroutines.selects.C12131j) r1
            kotlin.d2 r2 = kotlin.C11079d2.f28267a
            r1.mo24707e(r2)
            goto L_0x009f
        L_0x00ad:
            return r1
        L_0x00ae:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "unexpected: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L_0x00c9:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreImpl.mo24761p(kotlinx.coroutines.o3):boolean");
    }

    /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: q */
    public final void mo24762q() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f29919g
            int r1 = r0.get(r3)
            int r2 = r3.f29920a
            if (r1 <= r2) goto L_0x0010
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
        L_0x0010:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreImpl.mo24762q():void");
    }

    /* renamed from: r */
    public final int mo24763r() {
        int andDecrement;
        do {
            andDecrement = f29919g.getAndDecrement(this);
        } while (andDecrement > this.f29920a);
        return andDecrement;
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void release() {
        /*
            r3 = this;
        L_0x0000:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f29919g
            int r0 = r0.getAndIncrement(r3)
            int r1 = r3.f29920a
            if (r0 >= r1) goto L_0x0014
            if (r0 < 0) goto L_0x000d
            return
        L_0x000d:
            boolean r0 = r3.mo24767u()
            if (r0 == 0) goto L_0x0000
            return
        L_0x0014:
            r3.mo24762q()
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "The number of released permits cannot be greater than "
            r1.append(r2)
            int r2 = r3.f29920a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreImpl.release():void");
    }

    /* renamed from: s */
    public final void mo24765s(@C12579k C12131j<?> jVar, @C12580l Object obj) {
        while (mo24763r() <= 0) {
            Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (mo24761p((C12077o3) jVar)) {
                return;
            }
        }
        jVar.mo24707e(C11079d2.f28267a);
    }

    /* renamed from: t */
    public final boolean mo24766t(Object obj) {
        if (obj instanceof C12072o) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            C12072o oVar = (C12072o) obj;
            Object a0 = oVar.mo24533a0(C11079d2.f28267a, (Object) null, this.f29921b);
            if (a0 == null) {
                return false;
            }
            oVar.mo24540o0(a0);
            return true;
        } else if (obj instanceof C12131j) {
            return ((C12131j) obj).mo24711h(this, C11079d2.f28267a);
        } else {
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x004e, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0034, code lost:
        r9 = true;
     */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo24767u() {
        /*
            r15 = this;
            r0 = r15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f29915c
            java.lang.Object r2 = r1.get(r15)
            kotlinx.coroutines.sync.c r2 = (kotlinx.coroutines.sync.C12142c) r2
            java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = f29916d
            long r3 = r3.getAndIncrement(r15)
            int r5 = kotlinx.coroutines.sync.SemaphoreKt.f29929f
            long r5 = (long) r5
            long r5 = r3 / r5
            kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 r7 = kotlinx.coroutines.sync.SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.f29923a
        L_0x0018:
            java.lang.Object r8 = kotlinx.coroutines.internal.C11988e.m47811g(r2, r5, r7)
            boolean r9 = kotlinx.coroutines.internal.C12005m0.m47894h(r8)
            if (r9 != 0) goto L_0x005b
            kotlinx.coroutines.internal.l0 r9 = kotlinx.coroutines.internal.C12005m0.m47892f(r8)
        L_0x0026:
            java.lang.Object r12 = r1.get(r15)
            kotlinx.coroutines.internal.l0 r12 = (kotlinx.coroutines.internal.C12003l0) r12
            long r13 = r12.f29607c
            long r10 = r9.f29607c
            int r10 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0036
        L_0x0034:
            r9 = 1
            goto L_0x004e
        L_0x0036:
            boolean r10 = r9.mo24382s()
            if (r10 != 0) goto L_0x003e
            r9 = 0
            goto L_0x004e
        L_0x003e:
            boolean r10 = androidx.concurrent.futures.C16563a.m75000a(r1, r15, r12, r9)
            if (r10 == 0) goto L_0x0051
            boolean r9 = r12.mo24380o()
            if (r9 == 0) goto L_0x0034
            r12.mo24359l()
            goto L_0x0034
        L_0x004e:
            if (r9 == 0) goto L_0x0018
            goto L_0x005b
        L_0x0051:
            boolean r10 = r9.mo24380o()
            if (r10 == 0) goto L_0x0026
            r9.mo24359l()
            goto L_0x0026
        L_0x005b:
            kotlinx.coroutines.internal.l0 r1 = kotlinx.coroutines.internal.C12005m0.m47892f(r8)
            kotlinx.coroutines.sync.c r1 = (kotlinx.coroutines.sync.C12142c) r1
            r1.mo24349b()
            long r7 = r1.f29607c
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L_0x006c
            r2 = 0
            return r2
        L_0x006c:
            int r2 = kotlinx.coroutines.sync.SemaphoreKt.f29929f
            long r5 = (long) r2
            long r3 = r3 % r5
            int r2 = (int) r3
            kotlinx.coroutines.internal.o0 r3 = kotlinx.coroutines.sync.SemaphoreKt.f29925b
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.mo24774v()
            java.lang.Object r3 = r4.getAndSet(r2, r3)
            if (r3 != 0) goto L_0x00af
            int r3 = kotlinx.coroutines.sync.SemaphoreKt.f29924a
            r10 = 0
        L_0x0086:
            if (r10 >= r3) goto L_0x009c
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r1.mo24774v()
            java.lang.Object r4 = r4.get(r2)
            kotlinx.coroutines.internal.o0 r5 = kotlinx.coroutines.sync.SemaphoreKt.f29926c
            if (r4 != r5) goto L_0x0098
            r4 = 1
            return r4
        L_0x0098:
            r4 = 1
            int r10 = r10 + 1
            goto L_0x0086
        L_0x009c:
            r4 = 1
            kotlinx.coroutines.internal.o0 r3 = kotlinx.coroutines.sync.SemaphoreKt.f29925b
            kotlinx.coroutines.internal.o0 r5 = kotlinx.coroutines.sync.SemaphoreKt.f29927d
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.mo24774v()
            boolean r1 = kotlinx.coroutines.channels.C11753k.m46648a(r1, r2, r3, r5)
            r1 = r1 ^ r4
            return r1
        L_0x00af:
            kotlinx.coroutines.internal.o0 r1 = kotlinx.coroutines.sync.SemaphoreKt.f29928e
            if (r3 != r1) goto L_0x00b7
            r1 = 0
            return r1
        L_0x00b7:
            boolean r1 = r15.mo24766t(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.sync.SemaphoreImpl.mo24767u():boolean");
    }
}
