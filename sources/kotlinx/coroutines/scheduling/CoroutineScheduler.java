package kotlinx.coroutines.scheduling;

import androidx.compose.p004ui.graphics.vector.C15369g;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.random.Random;
import kotlin.ranges.C11479u;
import kotlinx.coroutines.C11715b;
import kotlinx.coroutines.C11720c;
import kotlinx.coroutines.C12090r0;
import kotlinx.coroutines.internal.C11999j0;
import kotlinx.coroutines.internal.C12009o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 7 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1033:1\n285#1:1036\n283#1:1037\n283#1:1038\n285#1:1039\n280#1:1045\n281#1,5:1046\n291#1:1052\n283#1:1053\n284#1:1054\n283#1:1060\n284#1:1061\n280#1:1062\n288#1:1063\n283#1:1064\n283#1:1067\n284#1:1068\n285#1:1069\n93#2:1034\n93#2:1051\n1#3:1035\n28#4,4:1040\n28#4,4:1055\n20#5:1044\n20#5:1059\n90#6:1065\n610#7:1066\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n281#1:1036\n288#1:1037\n289#1:1038\n298#1:1039\n347#1:1045\n375#1:1046,5\n398#1:1052\n445#1:1053\n446#1:1054\n482#1:1060\n483#1:1061\n489#1:1062\n498#1:1063\n498#1:1064\n576#1:1067\n577#1:1068\n578#1:1069\n119#1:1034\n395#1:1051\n347#1:1040,4\n478#1:1055,4\n347#1:1044\n478#1:1059\n515#1:1065\n522#1:1066\n*E\n"})
public final class CoroutineScheduler implements Executor, Closeable {

    /* renamed from: E0 */
    public static final int f29757E0 = 21;

    /* renamed from: F0 */
    public static final long f29758F0 = 2097151;

    /* renamed from: G0 */
    public static final long f29759G0 = 4398044413952L;

    /* renamed from: H0 */
    public static final int f29760H0 = 42;

    /* renamed from: I0 */
    public static final long f29761I0 = 9223367638808264704L;

    /* renamed from: J0 */
    public static final int f29762J0 = 1;

    /* renamed from: K0 */
    public static final int f29763K0 = 2097150;

    /* renamed from: L0 */
    public static final long f29764L0 = 2097151;

    /* renamed from: M0 */
    public static final long f29765M0 = -2097152;

    /* renamed from: N0 */
    public static final long f29766N0 = 2097152;

    /* renamed from: X */
    public static final int f29767X = -1;

    /* renamed from: Y */
    public static final int f29768Y = 0;

    /* renamed from: Z */
    public static final int f29769Z = 1;
    @C12579k

    /* renamed from: v */
    public static final C12098a f29770v = new C12098a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: w */
    public static final AtomicLongFieldUpdater f29771w;
    @C12579k

    /* renamed from: x */
    public static final AtomicLongFieldUpdater f29772x;
    @C12579k

    /* renamed from: y */
    public static final AtomicIntegerFieldUpdater f29773y;
    @C12579k
    @C11287e

    /* renamed from: z */
    public static final C12009o0 f29774z = new C12009o0("NOT_IN_STACK");
    @C11394v
    private volatile int _isTerminated;
    @C11287e

    /* renamed from: a */
    public final int f29775a;
    @C11287e

    /* renamed from: b */
    public final int f29776b;
    @C11287e

    /* renamed from: c */
    public final long f29777c;
    @C11394v
    private volatile long controlState;
    @C12579k
    @C11287e

    /* renamed from: d */
    public final String f29778d;
    @C12579k
    @C11287e

    /* renamed from: e */
    public final C12105e f29779e;
    @C12579k
    @C11287e

    /* renamed from: f */
    public final C12105e f29780f;
    @C12579k
    @C11287e

    /* renamed from: g */
    public final C11999j0<C12100c> f29781g;
    @C11394v
    private volatile long parkedWorkersStack;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, mo22516d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "kotlinx-coroutines-core"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum WorkerState {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$a */
    public static final class C12098a {
        public /* synthetic */ C12098a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C12098a() {
        }
    }

    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$b */
    public /* synthetic */ class C12099b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState[] r0 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.PARKING     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.BLOCKING     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.CPU_ACQUIRED     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.DORMANT     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler.WorkerState.TERMINATED     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.scheduling.CoroutineScheduler.C12099b.<clinit>():void");
        }
    }

    static {
        Class<CoroutineScheduler> cls = CoroutineScheduler.class;
        f29771w = AtomicLongFieldUpdater.newUpdater(cls, "parkedWorkersStack");
        f29772x = AtomicLongFieldUpdater.newUpdater(cls, "controlState");
        f29773y = AtomicIntegerFieldUpdater.newUpdater(cls, "_isTerminated");
    }

    public CoroutineScheduler(int i, int i2, long j, @C12579k String str) {
        this.f29775a = i;
        this.f29776b = i2;
        this.f29777c = j;
        this.f29778d = str;
        boolean z = true;
        if (i >= 1) {
            if (i2 >= i) {
                if (i2 <= 2097150) {
                    if (j <= 0 ? false : z) {
                        this.f29779e = new C12105e();
                        this.f29780f = new C12105e();
                        this.f29781g = new C11999j0<>((i + 1) * 2);
                        this.controlState = ((long) i) << 42;
                        this._isTerminated = 0;
                        return;
                    }
                    throw new IllegalArgumentException(("Idle worker keep alive time " + j + " must be positive").toString());
                }
                throw new IllegalArgumentException(("Max pool size " + i2 + " should not exceed maximal supported number of threads 2097150").toString());
            }
            throw new IllegalArgumentException(("Max pool size " + i2 + " should be greater than or equals to core pool size " + i).toString());
        }
        throw new IllegalArgumentException(("Core pool size " + i + " should be at least 1").toString());
    }

    /* renamed from: I */
    public static /* synthetic */ boolean m48329I(CoroutineScheduler coroutineScheduler, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = f29772x.get(coroutineScheduler);
        }
        return coroutineScheduler.mo24597G(j);
    }

    /* renamed from: o */
    public static /* synthetic */ void m48331o(CoroutineScheduler coroutineScheduler, Runnable runnable, C12111k kVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            kVar = C12114n.f29829i;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        coroutineScheduler.mo24611n(runnable, kVar, z);
    }

    /* renamed from: B */
    public final void mo24592B(long j) {
        int i;
        C12110j jVar;
        if (f29773y.compareAndSet(this, 0, 1)) {
            C12100c k = mo24608k();
            synchronized (this.f29781g) {
                i = (int) (f29772x.get(this) & 2097151);
            }
            if (1 <= i) {
                int i2 = 1;
                while (true) {
                    C12100c b = this.f29781g.mo24365b(i2);
                    Intrinsics.checkNotNull(b);
                    C12100c cVar = b;
                    if (cVar != k) {
                        while (cVar.isAlive()) {
                            LockSupport.unpark(cVar);
                            cVar.join(j);
                        }
                        cVar.f29789a.mo24675g(this.f29780f);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2++;
                }
            }
            this.f29780f.mo24416b();
            this.f29779e.mo24416b();
            while (true) {
                if (k != null) {
                    jVar = k.mo24632h(true);
                    if (jVar != null) {
                        continue;
                        mo24623z(jVar);
                    }
                }
                jVar = (C12110j) this.f29779e.mo24422h();
                if (jVar == null && (jVar = (C12110j) this.f29780f.mo24422h()) == null) {
                    break;
                }
                mo24623z(jVar);
            }
            if (k != null) {
                k.mo24650z(WorkerState.TERMINATED);
            }
            f29771w.set(this, 0);
            f29772x.set(this, 0);
        }
    }

    /* renamed from: C */
    public final void mo24593C(long j, boolean z) {
        if (!z && !mo24598J() && !mo24597G(j)) {
            mo24598J();
        }
    }

    /* renamed from: D */
    public final void mo24594D() {
        if (!mo24598J() && !m48329I(this, 0, 1, (Object) null)) {
            mo24598J();
        }
    }

    /* renamed from: E */
    public final C12110j mo24595E(C12100c cVar, C12110j jVar, boolean z) {
        if (cVar == null || cVar.f29791c == WorkerState.TERMINATED) {
            return jVar;
        }
        if (jVar.f29818b.mo24658L() == 0 && cVar.f29791c == WorkerState.BLOCKING) {
            return jVar;
        }
        cVar.f29795g = true;
        return cVar.f29789a.mo24670a(jVar, z);
    }

    /* renamed from: F */
    public final boolean mo24596F() {
        long j;
        AtomicLongFieldUpdater a = f29772x;
        do {
            j = a.get(this);
            if (((int) ((f29761I0 & j) >> 42)) == 0) {
                return false;
            }
        } while (!f29772x.compareAndSet(this, j, j - 4398046511104L));
        return true;
    }

    /* renamed from: G */
    public final boolean mo24597G(long j) {
        if (C11479u.m44447u(((int) (2097151 & j)) - ((int) ((j & f29759G0) >> 21)), 0) < this.f29775a) {
            int f = mo24604f();
            if (f == 1 && this.f29775a > 1) {
                mo24604f();
            }
            if (f > 0) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public final boolean mo24598J() {
        C12100c v;
        do {
            v = mo24619v();
            if (v == null) {
                return false;
            }
        } while (!C12100c.m48362m().compareAndSet(v, -1, 0));
        LockSupport.unpark(v);
        return true;
    }

    /* renamed from: b */
    public final boolean mo24599b(C12110j jVar) {
        boolean z = true;
        if (jVar.f29818b.mo24658L() != 1) {
            z = false;
        }
        if (z) {
            return this.f29780f.mo24415a(jVar);
        }
        return this.f29779e.mo24415a(jVar);
    }

    /* renamed from: c */
    public final int mo24600c(long j) {
        return (int) ((j & f29761I0) >> 42);
    }

    public void close() {
        mo24592B(10000);
    }

    /* renamed from: d */
    public final int mo24602d(long j) {
        return (int) ((j & f29759G0) >> 21);
    }

    public void execute(@C12579k Runnable runnable) {
        m48331o(this, runnable, (C12111k) null, false, 6, (Object) null);
    }

    /* renamed from: f */
    public final int mo24604f() {
        boolean z;
        synchronized (this.f29781g) {
            if (isTerminated()) {
                return -1;
            }
            AtomicLongFieldUpdater atomicLongFieldUpdater = f29772x;
            long j = atomicLongFieldUpdater.get(this);
            int i = (int) (j & 2097151);
            boolean z2 = false;
            int u = C11479u.m44447u(i - ((int) ((j & f29759G0) >> 21)), 0);
            if (u >= this.f29775a) {
                return 0;
            }
            if (i >= this.f29776b) {
                return 0;
            }
            int i2 = ((int) (f29772x.get(this) & 2097151)) + 1;
            if (i2 <= 0 || this.f29781g.mo24365b(i2) != null) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                C12100c cVar = new C12100c(this, i2);
                this.f29781g.mo24366c(i2, cVar);
                if (i2 == ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    z2 = true;
                }
                if (z2) {
                    int i3 = u + 1;
                    cVar.start();
                    return i3;
                }
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    @C12579k
    /* renamed from: i */
    public final C12110j mo24605i(@C12579k Runnable runnable, @C12579k C12111k kVar) {
        long a = C12114n.f29826f.mo24661a();
        if (!(runnable instanceof C12110j)) {
            return new C12113m(runnable, a, kVar);
        }
        C12110j jVar = (C12110j) runnable;
        jVar.f29817a = a;
        jVar.f29818b = kVar;
        return jVar;
    }

    public final boolean isTerminated() {
        if (f29773y.get(this) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final int mo24607j(long j) {
        return (int) (j & 2097151);
    }

    /* renamed from: k */
    public final C12100c mo24608k() {
        C12100c cVar;
        Thread currentThread = Thread.currentThread();
        if (currentThread instanceof C12100c) {
            cVar = (C12100c) currentThread;
        } else {
            cVar = null;
        }
        if (cVar == null || !Intrinsics.areEqual((Object) CoroutineScheduler.this, (Object) this)) {
            return null;
        }
        return cVar;
    }

    /* renamed from: l */
    public final void mo24609l() {
        f29772x.addAndGet(this, f29765M0);
    }

    /* renamed from: m */
    public final int mo24610m() {
        return (int) (f29772x.getAndDecrement(this) & 2097151);
    }

    /* renamed from: n */
    public final void mo24611n(@C12579k Runnable runnable, @C12579k C12111k kVar, boolean z) {
        boolean z2;
        long j;
        C11715b b = C11720c.m46159b();
        if (b != null) {
            b.mo23728e();
        }
        C12110j i = mo24605i(runnable, kVar);
        boolean z3 = false;
        if (i.f29818b.mo24658L() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            j = f29772x.addAndGet(this, 2097152);
        } else {
            j = 0;
        }
        C12100c k = mo24608k();
        C12110j E = mo24595E(k, i, z);
        if (E == null || mo24599b(E)) {
            if (z && k != null) {
                z3 = true;
            }
            if (z2) {
                mo24593C(j, z3);
            } else if (!z3) {
                mo24594D();
            }
        } else {
            throw new RejectedExecutionException(this.f29778d + " was terminated");
        }
    }

    /* renamed from: p */
    public final int mo24612p() {
        return (int) ((f29772x.get(this) & f29761I0) >> 42);
    }

    /* renamed from: q */
    public final int mo24613q() {
        return (int) (f29772x.get(this) & 2097151);
    }

    /* renamed from: r */
    public final long mo24614r() {
        return f29772x.addAndGet(this, 2097152);
    }

    /* renamed from: s */
    public final int mo24615s() {
        return (int) (f29772x.incrementAndGet(this) & 2097151);
    }

    /* renamed from: t */
    public final void mo24616t(AtomicLongFieldUpdater atomicLongFieldUpdater, C11300l<? super Long, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    @C12579k
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int a = this.f29781g.mo24364a();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 1; i6 < a; i6++) {
            C12100c b = this.f29781g.mo24365b(i6);
            if (b != null) {
                int f = b.f29789a.mo24674f();
                int i7 = C12099b.$EnumSwitchMapping$0[b.f29791c.ordinal()];
                if (i7 == 1) {
                    i3++;
                } else if (i7 == 2) {
                    i2++;
                    StringBuilder sb = new StringBuilder();
                    sb.append(f);
                    sb.append('b');
                    arrayList.add(sb.toString());
                } else if (i7 == 3) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(f);
                    sb2.append(C15369g.f37985k);
                    arrayList.add(sb2.toString());
                } else if (i7 == 4) {
                    i4++;
                    if (f > 0) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(f);
                        sb3.append('d');
                        arrayList.add(sb3.toString());
                    }
                } else if (i7 == 5) {
                    i5++;
                }
            }
        }
        long j = f29772x.get(this);
        return this.f29778d + '@' + C12090r0.m48301b(this) + "[Pool Size {core = " + this.f29775a + ", max = " + this.f29776b + "}, Worker States {CPU = " + i + ", blocking = " + i2 + ", parked = " + i3 + ", dormant = " + i4 + ", terminated = " + i5 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f29779e.mo24417c() + ", global blocking queue size = " + this.f29780f.mo24417c() + ", Control State {created workers= " + ((int) (2097151 & j)) + ", blocking tasks = " + ((int) ((f29759G0 & j) >> 21)) + ", CPUs acquired = " + (this.f29775a - ((int) ((f29761I0 & j) >> 42))) + "}]";
    }

    /* renamed from: u */
    public final int mo24618u(C12100c cVar) {
        Object j = cVar.mo24634j();
        while (j != f29774z) {
            if (j == null) {
                return 0;
            }
            C12100c cVar2 = (C12100c) j;
            int i = cVar2.mo24633i();
            if (i != 0) {
                return i;
            }
            j = cVar2.mo24634j();
        }
        return -1;
    }

    /* renamed from: v */
    public final C12100c mo24619v() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29771w;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            C12100c b = this.f29781g.mo24365b((int) (2097151 & j));
            if (b == null) {
                return null;
            }
            long j2 = (2097152 + j) & f29765M0;
            int u = mo24618u(b);
            if (u >= 0) {
                if (f29771w.compareAndSet(this, j, ((long) u) | j2)) {
                    b.mo24647w(f29774z);
                    return b;
                }
            }
        }
    }

    /* renamed from: w */
    public final boolean mo24620w(@C12579k C12100c cVar) {
        long j;
        long j2;
        int i;
        if (cVar.mo24634j() != f29774z) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29771w;
        do {
            j = atomicLongFieldUpdater.get(this);
            j2 = (2097152 + j) & f29765M0;
            i = cVar.mo24633i();
            cVar.mo24647w(this.f29781g.mo24365b((int) (2097151 & j)));
        } while (!f29771w.compareAndSet(this, j, j2 | ((long) i)));
        return true;
    }

    /* renamed from: x */
    public final void mo24621x(@C12579k C12100c cVar, int i, int i2) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29771w;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            int i3 = (int) (2097151 & j);
            long j2 = (2097152 + j) & f29765M0;
            if (i3 == i) {
                if (i2 == 0) {
                    i3 = mo24618u(cVar);
                } else {
                    i3 = i2;
                }
            }
            if (i3 >= 0) {
                if (f29771w.compareAndSet(this, j, j2 | ((long) i3))) {
                    return;
                }
            }
        }
    }

    /* renamed from: y */
    public final long mo24622y() {
        return f29772x.addAndGet(this, 4398046511104L);
    }

    /* renamed from: z */
    public final void mo24623z(@C12579k C12110j jVar) {
        C11715b b;
        try {
            jVar.run();
            b = C11720c.m46159b();
            if (b == null) {
                return;
            }
        } catch (Throwable th) {
            C11715b b2 = C11720c.m46159b();
            if (b2 != null) {
                b2.mo23729f();
            }
            throw th;
        }
        b.mo23729f();
    }

    @C11363r0({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/Task\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1033:1\n298#2:1034\n285#2:1035\n299#2,4:1036\n304#2:1040\n294#2,2:1041\n294#2,2:1045\n280#2:1052\n289#2:1053\n283#2:1054\n280#2:1055\n1#3:1043\n90#4:1044\n28#5,4:1047\n20#6:1051\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n665#1:1034\n665#1:1035\n665#1:1036,4\n679#1:1040\n753#1:1041,2\n807#1:1045,2\n855#1:1052\n881#1:1053\n881#1:1054\n963#1:1055\n790#1:1044\n851#1:1047,4\n851#1:1051\n*E\n"})
    /* renamed from: kotlinx.coroutines.scheduling.CoroutineScheduler$c */
    public final class C12100c extends Thread {
        @C12579k

        /* renamed from: w */
        public static final AtomicIntegerFieldUpdater f29788w = AtomicIntegerFieldUpdater.newUpdater(C12100c.class, "workerCtl");
        @C12579k
        @C11287e

        /* renamed from: a */
        public final C12116p f29789a;
        @C12579k

        /* renamed from: b */
        public final Ref.ObjectRef<C12110j> f29790b;
        @C12579k
        @C11287e

        /* renamed from: c */
        public WorkerState f29791c;

        /* renamed from: d */
        public long f29792d;

        /* renamed from: e */
        public long f29793e;

        /* renamed from: f */
        public int f29794f;
        @C11287e

        /* renamed from: g */
        public boolean f29795g;
        private volatile int indexInArray;
        @C12580l
        private volatile Object nextParkedWorker;
        @C11394v
        private volatile int workerCtl;

        public C12100c() {
            setDaemon(true);
            this.f29789a = new C12116p();
            this.f29790b = new Ref.ObjectRef<>();
            this.f29791c = WorkerState.DORMANT;
            this.nextParkedWorker = CoroutineScheduler.f29774z;
            this.f29794f = Random.f28564a.mo22985l();
        }

        @C12579k
        /* renamed from: m */
        public static final AtomicIntegerFieldUpdater m48362m() {
            return f29788w;
        }

        /* renamed from: A */
        public final C12110j mo24624A(int i) {
            int i2 = (int) (CoroutineScheduler.f29772x.get(CoroutineScheduler.this) & 2097151);
            if (i2 < 2) {
                return null;
            }
            int q = mo24640q(i2);
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            long j = Long.MAX_VALUE;
            for (int i3 = 0; i3 < i2; i3++) {
                q++;
                if (q > i2) {
                    q = 1;
                }
                C12100c b = coroutineScheduler.f29781g.mo24365b(q);
                if (b == null || b == this) {
                    int i4 = i;
                } else {
                    long p = b.f29789a.mo24684p(i, this.f29790b);
                    if (p == -1) {
                        Ref.ObjectRef<C12110j> objectRef = this.f29790b;
                        C12110j jVar = (C12110j) objectRef.element;
                        objectRef.element = null;
                        return jVar;
                    } else if (p > 0) {
                        j = Math.min(j, p);
                    }
                }
            }
            if (j == Long.MAX_VALUE) {
                j = 0;
            }
            this.f29793e = j;
            return null;
        }

        /* renamed from: B */
        public final void mo24625B() {
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            synchronized (coroutineScheduler.f29781g) {
                if (!coroutineScheduler.isTerminated()) {
                    if (((int) (CoroutineScheduler.f29772x.get(coroutineScheduler) & 2097151)) > coroutineScheduler.f29775a) {
                        if (f29788w.compareAndSet(this, -1, 1)) {
                            int i = this.indexInArray;
                            mo24646v(0);
                            coroutineScheduler.mo24621x(this, i, 0);
                            int andDecrement = (int) (CoroutineScheduler.f29772x.getAndDecrement(coroutineScheduler) & 2097151);
                            if (andDecrement != i) {
                                C12100c b = coroutineScheduler.f29781g.mo24365b(andDecrement);
                                Intrinsics.checkNotNull(b);
                                C12100c cVar = b;
                                coroutineScheduler.f29781g.mo24366c(i, cVar);
                                cVar.mo24646v(i);
                                coroutineScheduler.mo24621x(cVar, andDecrement, i);
                            }
                            coroutineScheduler.f29781g.mo24366c(andDecrement, null);
                            C11079d2 d2Var = C11079d2.f28267a;
                            this.f29791c = WorkerState.TERMINATED;
                        }
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo24626b(int i) {
            if (i != 0) {
                CoroutineScheduler.f29772x.addAndGet(CoroutineScheduler.this, CoroutineScheduler.f29765M0);
                if (this.f29791c != WorkerState.TERMINATED) {
                    this.f29791c = WorkerState.DORMANT;
                }
            }
        }

        /* renamed from: c */
        public final void mo24627c(int i) {
            if (i != 0 && mo24650z(WorkerState.BLOCKING)) {
                CoroutineScheduler.this.mo24594D();
            }
        }

        /* renamed from: d */
        public final void mo24628d(C12110j jVar) {
            int L = jVar.f29818b.mo24658L();
            mo24637n(L);
            mo24627c(L);
            CoroutineScheduler.this.mo24623z(jVar);
            mo24626b(L);
        }

        /* renamed from: e */
        public final C12110j mo24629e(boolean z) {
            boolean z2;
            C12110j s;
            C12110j s2;
            if (z) {
                if (mo24640q(CoroutineScheduler.this.f29775a * 2) == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2 && (s2 = mo24643s()) != null) {
                    return s2;
                }
                C12110j h = this.f29789a.mo24676h();
                if (h != null) {
                    return h;
                }
                if (!z2 && (s = mo24643s()) != null) {
                    return s;
                }
            } else {
                C12110j s3 = mo24643s();
                if (s3 != null) {
                    return s3;
                }
            }
            return mo24624A(3);
        }

        /* renamed from: f */
        public final C12110j mo24630f() {
            C12110j i = this.f29789a.mo24677i();
            if (i != null) {
                return i;
            }
            C12110j jVar = (C12110j) CoroutineScheduler.this.f29780f.mo24422h();
            if (jVar == null) {
                return mo24624A(1);
            }
            return jVar;
        }

        /* renamed from: g */
        public final C12110j mo24631g() {
            C12110j k = this.f29789a.mo24679k();
            if (k != null) {
                return k;
            }
            C12110j jVar = (C12110j) CoroutineScheduler.this.f29780f.mo24422h();
            if (jVar == null) {
                return mo24624A(2);
            }
            return jVar;
        }

        @C12580l
        /* renamed from: h */
        public final C12110j mo24632h(boolean z) {
            if (mo24648x()) {
                return mo24629e(z);
            }
            return mo24630f();
        }

        /* renamed from: i */
        public final int mo24633i() {
            return this.indexInArray;
        }

        @C12580l
        /* renamed from: j */
        public final Object mo24634j() {
            return this.nextParkedWorker;
        }

        @C12579k
        /* renamed from: k */
        public final CoroutineScheduler mo24635k() {
            return CoroutineScheduler.this;
        }

        /* renamed from: l */
        public final int mo24636l() {
            return this.workerCtl;
        }

        /* renamed from: n */
        public final void mo24637n(int i) {
            this.f29792d = 0;
            if (this.f29791c == WorkerState.PARKING) {
                this.f29791c = WorkerState.BLOCKING;
            }
        }

        /* renamed from: o */
        public final boolean mo24638o() {
            return this.nextParkedWorker != CoroutineScheduler.f29774z;
        }

        /* renamed from: p */
        public final boolean mo24639p() {
            return this.f29791c == WorkerState.BLOCKING;
        }

        /* renamed from: q */
        public final int mo24640q(int i) {
            int i2 = this.f29794f;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.f29794f = i5;
            int i6 = i - 1;
            if ((i6 & i) == 0) {
                return i5 & i6;
            }
            return (i5 & Integer.MAX_VALUE) % i;
        }

        /* renamed from: r */
        public final void mo24641r() {
            if (this.f29792d == 0) {
                this.f29792d = System.nanoTime() + CoroutineScheduler.this.f29777c;
            }
            LockSupport.parkNanos(CoroutineScheduler.this.f29777c);
            if (System.nanoTime() - this.f29792d >= 0) {
                this.f29792d = 0;
                mo24625B();
            }
        }

        public void run() {
            mo24645u();
        }

        /* renamed from: s */
        public final C12110j mo24643s() {
            if (mo24640q(2) == 0) {
                C12110j jVar = (C12110j) CoroutineScheduler.this.f29779e.mo24422h();
                if (jVar != null) {
                    return jVar;
                }
                return (C12110j) CoroutineScheduler.this.f29780f.mo24422h();
            }
            C12110j jVar2 = (C12110j) CoroutineScheduler.this.f29780f.mo24422h();
            if (jVar2 != null) {
                return jVar2;
            }
            return (C12110j) CoroutineScheduler.this.f29779e.mo24422h();
        }

        /* renamed from: t */
        public final long mo24644t() {
            boolean z;
            C12110j jVar;
            if (this.f29791c == WorkerState.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                jVar = mo24631g();
            } else {
                jVar = mo24630f();
            }
            if (jVar == null) {
                long j = this.f29793e;
                if (j == 0) {
                    return -1;
                }
                return j;
            }
            CoroutineScheduler.this.mo24623z(jVar);
            if (!z) {
                CoroutineScheduler.f29772x.addAndGet(CoroutineScheduler.this, CoroutineScheduler.f29765M0);
            }
            return 0;
        }

        /* renamed from: u */
        public final void mo24645u() {
            loop0:
            while (true) {
                boolean z = false;
                while (!CoroutineScheduler.this.isTerminated() && this.f29791c != WorkerState.TERMINATED) {
                    C12110j h = mo24632h(this.f29795g);
                    if (h != null) {
                        this.f29793e = 0;
                        mo24628d(h);
                    } else {
                        this.f29795g = false;
                        if (this.f29793e == 0) {
                            mo24649y();
                        } else if (!z) {
                            z = true;
                        } else {
                            mo24650z(WorkerState.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f29793e);
                            this.f29793e = 0;
                        }
                    }
                }
            }
            mo24650z(WorkerState.TERMINATED);
        }

        /* renamed from: v */
        public final void mo24646v(int i) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append(CoroutineScheduler.this.f29778d);
            sb.append("-worker-");
            if (i == 0) {
                str = "TERMINATED";
            } else {
                str = String.valueOf(i);
            }
            sb.append(str);
            setName(sb.toString());
            this.indexInArray = i;
        }

        /* renamed from: w */
        public final void mo24647w(@C12580l Object obj) {
            this.nextParkedWorker = obj;
        }

        /* renamed from: x */
        public final boolean mo24648x() {
            boolean z;
            if (this.f29791c == WorkerState.CPU_ACQUIRED) {
                return true;
            }
            CoroutineScheduler coroutineScheduler = CoroutineScheduler.this;
            AtomicLongFieldUpdater a = CoroutineScheduler.f29772x;
            while (true) {
                long j = a.get(coroutineScheduler);
                if (((int) ((CoroutineScheduler.f29761I0 & j) >> 42)) != 0) {
                    if (CoroutineScheduler.f29772x.compareAndSet(coroutineScheduler, j, j - 4398046511104L)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.f29791c = WorkerState.CPU_ACQUIRED;
            return true;
        }

        /* renamed from: y */
        public final void mo24649y() {
            if (!mo24638o()) {
                CoroutineScheduler.this.mo24620w(this);
                return;
            }
            f29788w.set(this, -1);
            while (mo24638o() && f29788w.get(this) == -1 && !CoroutineScheduler.this.isTerminated() && this.f29791c != WorkerState.TERMINATED) {
                mo24650z(WorkerState.PARKING);
                Thread.interrupted();
                mo24641r();
            }
        }

        /* renamed from: z */
        public final boolean mo24650z(@C12579k WorkerState workerState) {
            boolean z;
            WorkerState workerState2 = this.f29791c;
            if (workerState2 == WorkerState.CPU_ACQUIRED) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                CoroutineScheduler.f29772x.addAndGet(CoroutineScheduler.this, 4398046511104L);
            }
            if (workerState2 != workerState) {
                this.f29791c = workerState;
            }
            return z;
        }

        public C12100c(CoroutineScheduler coroutineScheduler, int i) {
            this();
            mo24646v(i);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoroutineScheduler(int i, int i2, long j, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? C12114n.f29825e : j, (i3 & 8) != 0 ? C12114n.f29821a : str);
    }
}
