package kotlinx.coroutines;

import androidx.concurrent.futures.C16563a;
import androidx.exifinterface.media.C19135a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11414o;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import kotlin.sequences.C11563q;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.internal.C11993g0;
import kotlinx.coroutines.internal.C12023v;
import kotlinx.coroutines.internal.LockFreeLinkedListNode;
import kotlinx.coroutines.selects.C12124c;
import kotlinx.coroutines.selects.C12125d;
import kotlinx.coroutines.selects.C12126e;
import kotlinx.coroutines.selects.C12127f;
import kotlinx.coroutines.selects.C12131j;
import kotlinx.serialization.json.internal.C12361b;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11395k(level = DeprecationLevel.ERROR, message = "This is internal API and may be removed in the future releases")
@C11363r0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 4 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Concurrent.kt\nkotlinx/coroutines/internal/ConcurrentKt\n+ 7 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 8 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n+ 9 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListHead\n+ 10 CompletionHandler.common.kt\nkotlinx/coroutines/CompletionHandler_commonKt\n+ 11 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 12 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 13 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,1454:1\n706#1,2:1461\n367#1,2:1471\n369#1,4:1476\n373#1,4:1482\n377#1,2:1489\n367#1,2:1491\n369#1,4:1496\n373#1,4:1502\n377#1,2:1509\n178#1,2:1518\n707#1:1520\n178#1,2:1521\n178#1,2:1540\n178#1,2:1555\n706#1,2:1557\n706#1,2:1559\n178#1,2:1561\n706#1,2:1563\n178#1,2:1565\n178#1,2:1572\n178#1,2:1574\n1#2:1455\n1#2:1480\n1#2:1500\n28#3,4:1456\n28#3,4:1523\n28#3,4:1567\n28#3,4:1576\n20#4:1460\n20#4:1527\n20#4:1571\n20#4:1580\n288#5,2:1463\n288#5,2:1465\n19#6:1467\n162#7:1468\n162#7:1469\n153#7,4:1583\n75#8:1470\n75#8:1481\n75#8:1501\n75#8:1514\n341#9,3:1473\n344#9,3:1486\n341#9,3:1493\n344#9,3:1506\n341#9,3:1511\n344#9,3:1515\n47#10:1528\n22#11:1529\n22#11:1530\n13#11:1551\n13#11:1554\n13#11:1581\n13#11:1582\n13#11:1587\n13#11:1588\n134#12:1531\n73#12,3:1532\n135#12,5:1535\n314#13,9:1542\n323#13,2:1552\n*S KotlinDebug\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n250#1:1461,2\n332#1:1471,2\n332#1:1476,4\n332#1:1482,4\n332#1:1489,2\n364#1:1491,2\n364#1:1496,4\n364#1:1502,4\n364#1:1509,2\n381#1:1518,2\n426#1:1520\n461#1:1521,2\n553#1:1540,2\n594#1:1555,2\n621#1:1557,2\n630#1:1559,2\n694#1:1561,2\n723#1:1563,2\n736#1:1565,2\n809#1:1572,2\n831#1:1574,2\n332#1:1480\n364#1:1500\n213#1:1456,4\n478#1:1523,4\n739#1:1567,4\n884#1:1576,4\n213#1:1460\n478#1:1527\n739#1:1571\n884#1:1580\n261#1:1463,2\n265#1:1465,2\n273#1:1467\n279#1:1468\n281#1:1469\n1218#1:1583,4\n284#1:1470\n332#1:1481\n364#1:1501\n372#1:1514\n332#1:1473,3\n332#1:1486,3\n364#1:1493,3\n364#1:1506,3\n368#1:1511,3\n368#1:1515,3\n483#1:1528\n495#1:1529\n505#1:1530\n561#1:1551\n577#1:1554\n924#1:1581\n974#1:1582\n1237#1:1587\n1259#1:1588\n526#1:1531\n526#1:1532,3\n526#1:1535,5\n559#1:1542,9\n559#1:1552,2\n*E\n"})
public class JobSupport implements C11723c2, C12162w, C12096s2 {
    @C12579k

    /* renamed from: a */
    public static final AtomicReferenceFieldUpdater f29015a;
    @C12579k

    /* renamed from: b */
    public static final AtomicReferenceFieldUpdater f29016b;
    @C11394v
    @C12580l
    private volatile Object _parentHandle;
    @C11394v
    @C12580l
    private volatile Object _state;

    @C11363r0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$AwaitContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1454:1\n1#2:1455\n*E\n"})
    /* renamed from: kotlinx.coroutines.JobSupport$a */
    public static final class C11695a<T> extends C12078p<T> {
        @C12579k

        /* renamed from: w */
        public final JobSupport f29017w;

        public C11695a(@C12579k C11045c<? super T> cVar, @C12579k JobSupport jobSupport) {
            super(cVar, 1);
            this.f29017w = jobSupport;
        }

        @C12579k
        /* renamed from: J */
        public String mo23668J() {
            return "AwaitContinuation";
        }

        @C12579k
        /* renamed from: w */
        public Throwable mo23669w(@C12579k C11723c2 c2Var) {
            Throwable f;
            Object Z0 = this.f29017w.mo23620Z0();
            if ((Z0 instanceof C11697c) && (f = ((C11697c) Z0).mo23676f()) != null) {
                return f;
            }
            if (Z0 instanceof C11721c0) {
                return ((C11721c0) Z0).f29065a;
            }
            return c2Var.mo23653u();
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$b */
    public static final class C11696b extends C11974i2 {
        @C12579k

        /* renamed from: e */
        public final JobSupport f29018e;
        @C12579k

        /* renamed from: f */
        public final C11697c f29019f;
        @C12579k

        /* renamed from: g */
        public final C12158v f29020g;
        @C12580l

        /* renamed from: v */
        public final Object f29021v;

        public C11696b(@C12579k JobSupport jobSupport, @C12579k C11697c cVar, @C12579k C12158v vVar, @C12580l Object obj) {
            this.f29018e = jobSupport;
            this.f29019f = cVar;
            this.f29020g = vVar;
            this.f29021v = obj;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo23670z((Throwable) obj);
            return C11079d2.f28267a;
        }

        /* renamed from: z */
        public void mo23670z(@C12580l Throwable th) {
            this.f29018e.mo23597H0(this.f29019f, this.f29020g, this.f29021v);
        }
    }

    @C11363r0({"SMAP\nJobSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JobSupport.kt\nkotlinx/coroutines/JobSupport$Finishing\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1454:1\n1#2:1455\n*E\n"})
    /* renamed from: kotlinx.coroutines.JobSupport$c */
    public static final class C11697c implements C12166w1 {
        @C12579k

        /* renamed from: b */
        public static final AtomicIntegerFieldUpdater f29022b;
        @C12579k

        /* renamed from: c */
        public static final AtomicReferenceFieldUpdater f29023c;
        @C12579k

        /* renamed from: d */
        public static final AtomicReferenceFieldUpdater f29024d;
        @C11394v
        @C12580l
        private volatile Object _exceptionsHolder;
        @C11394v
        private volatile int _isCompleting;
        @C11394v
        @C12580l
        private volatile Object _rootCause;
        @C12579k

        /* renamed from: a */
        public final C12070n2 f29025a;

        static {
            Class<C11697c> cls = C11697c.class;
            f29022b = AtomicIntegerFieldUpdater.newUpdater(cls, "_isCompleting");
            Class<Object> cls2 = Object.class;
            f29023c = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_rootCause");
            f29024d = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_exceptionsHolder");
        }

        public C11697c(@C12579k C12070n2 n2Var, boolean z, @C12580l Throwable th) {
            this.f29025a = n2Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        @C12579k
        /* renamed from: a */
        public C12070n2 mo23671a() {
            return this.f29025a;
        }

        /* renamed from: b */
        public final void mo23672b(@C12579k Throwable th) {
            Throwable f = mo23676f();
            if (f == null) {
                mo23683m(th);
            } else if (th != f) {
                Object e = mo23675e();
                if (e == null) {
                    mo23682l(th);
                } else if (e instanceof Throwable) {
                    if (th != e) {
                        ArrayList<Throwable> c = mo23673c();
                        c.add(e);
                        c.add(th);
                        mo23682l(c);
                    }
                } else if (e instanceof ArrayList) {
                    ((ArrayList) e).add(th);
                } else {
                    throw new IllegalStateException(("State is " + e).toString());
                }
            }
        }

        /* renamed from: c */
        public final ArrayList<Throwable> mo23673c() {
            return new ArrayList<>(4);
        }

        /* renamed from: d */
        public boolean mo23674d() {
            return mo23676f() == null;
        }

        /* renamed from: e */
        public final Object mo23675e() {
            return f29024d.get(this);
        }

        @C12580l
        /* renamed from: f */
        public final Throwable mo23676f() {
            return (Throwable) f29023c.get(this);
        }

        /* renamed from: g */
        public final boolean mo23677g() {
            return mo23676f() != null;
        }

        /* renamed from: h */
        public final boolean mo23678h() {
            if (f29022b.get(this) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: i */
        public final boolean mo23679i() {
            return mo23675e() == C12041j2.f29678h;
        }

        @C12579k
        /* renamed from: j */
        public final List<Throwable> mo23680j(@C12580l Throwable th) {
            ArrayList<Throwable> arrayList;
            Object e = mo23675e();
            if (e == null) {
                arrayList = mo23673c();
            } else if (e instanceof Throwable) {
                ArrayList<Throwable> c = mo23673c();
                c.add(e);
                arrayList = c;
            } else if (e instanceof ArrayList) {
                arrayList = (ArrayList) e;
            } else {
                throw new IllegalStateException(("State is " + e).toString());
            }
            Throwable f = mo23676f();
            if (f != null) {
                arrayList.add(0, f);
            }
            if (th != null && !Intrinsics.areEqual((Object) th, (Object) f)) {
                arrayList.add(th);
            }
            mo23682l(C12041j2.f29678h);
            return arrayList;
        }

        /* renamed from: k */
        public final void mo23681k(boolean z) {
            f29022b.set(this, z ? 1 : 0);
        }

        /* renamed from: l */
        public final void mo23682l(Object obj) {
            f29024d.set(this, obj);
        }

        /* renamed from: m */
        public final void mo23683m(@C12580l Throwable th) {
            f29023c.set(this, th);
        }

        @C12579k
        public String toString() {
            return "Finishing[cancelling=" + mo23677g() + ", completing=" + mo23678h() + ", rootCause=" + mo23676f() + ", exceptions=" + mo23675e() + ", list=" + mo23671a() + C12361b.f30261l;
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$d */
    public final class C11698d extends C11974i2 {
        @C12579k

        /* renamed from: e */
        public final C12131j<?> f29026e;

        public C11698d(@C12579k C12131j<?> jVar) {
            this.f29026e = jVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo23670z((Throwable) obj);
            return C11079d2.f28267a;
        }

        /* renamed from: z */
        public void mo23670z(@C12580l Throwable th) {
            Object Z0 = JobSupport.this.mo23620Z0();
            if (!(Z0 instanceof C11721c0)) {
                Z0 = C12041j2.m48073h(Z0);
            }
            this.f29026e.mo24711h(JobSupport.this, Z0);
        }
    }

    /* renamed from: kotlinx.coroutines.JobSupport$e */
    public final class C11699e extends C11974i2 {
        @C12579k

        /* renamed from: e */
        public final C12131j<?> f29028e;

        public C11699e(@C12579k C12131j<?> jVar) {
            this.f29028e = jVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo23670z((Throwable) obj);
            return C11079d2.f28267a;
        }

        /* renamed from: z */
        public void mo23670z(@C12580l Throwable th) {
            this.f29028e.mo24711h(JobSupport.this, C11079d2.f28267a);
        }
    }

    @C11363r0({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,367:1\n526#2:368\n*E\n"})
    /* renamed from: kotlinx.coroutines.JobSupport$f */
    public static final class C11700f extends LockFreeLinkedListNode.C11976a {

        /* renamed from: d */
        public final /* synthetic */ JobSupport f29030d;

        /* renamed from: e */
        public final /* synthetic */ Object f29031e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C11700f(LockFreeLinkedListNode lockFreeLinkedListNode, JobSupport jobSupport, Object obj) {
            super(lockFreeLinkedListNode);
            this.f29030d = jobSupport;
            this.f29031e = obj;
        }

        @C12580l
        /* renamed from: g */
        public Object mo23685e(@C12579k LockFreeLinkedListNode lockFreeLinkedListNode) {
            boolean z;
            if (this.f29030d.mo23620Z0() == this.f29031e) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return null;
            }
            return C12023v.m47976a();
        }
    }

    static {
        Class<JobSupport> cls = JobSupport.class;
        Class<Object> cls2 = Object.class;
        f29015a = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_state");
        f29016b = AtomicReferenceFieldUpdater.newUpdater(cls, cls2, "_parentHandle");
    }

    public JobSupport(boolean z) {
        C12040j1 j1Var;
        if (z) {
            j1Var = C12041j2.f29680j;
        } else {
            j1Var = C12041j2.f29679i;
        }
        this._state = j1Var;
    }

    /* renamed from: G1 */
    public static /* synthetic */ CancellationException m45937G1(JobSupport jobSupport, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return jobSupport.mo23595F1(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: K0 */
    public static /* synthetic */ JobCancellationException m45938K0(JobSupport jobSupport, String str, Throwable th, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                th = null;
            }
            if (str == null) {
                str = jobSupport.mo23592E0();
            }
            return new JobCancellationException(str, th, jobSupport);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: defaultCancellationException");
    }

    /* renamed from: U0 */
    public static /* synthetic */ void m45939U0() {
    }

    /* renamed from: W0 */
    public static /* synthetic */ void m45940W0() {
    }

    /* renamed from: i1 */
    private final void m45941i1(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    /* renamed from: s1 */
    private final /* synthetic */ <T extends C11974i2> void m45948s1(C12070n2 n2Var, Throwable th) {
        Object m = n2Var.mo24314m();
        Intrinsics.checkNotNull(m, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) m; !Intrinsics.areEqual((Object) lockFreeLinkedListNode, (Object) n2Var); lockFreeLinkedListNode = lockFreeLinkedListNode.mo24315n()) {
            Intrinsics.reifiedOperationMarker(3, C19135a.f48928d5);
            if (lockFreeLinkedListNode instanceof LockFreeLinkedListNode) {
                C11974i2 i2Var = (C11974i2) lockFreeLinkedListNode;
                try {
                    i2Var.mo23670z(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C11414o.m43942a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + i2Var + " for " + this, th2);
                        C11079d2 d2Var = C11079d2.f28267a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo23623b1(completionHandlerException);
        }
    }

    /* renamed from: A0 */
    public final boolean mo23583A0(@C12580l Object obj) {
        Object a = C12041j2.f29671a;
        if (mo23617V0() && (a = mo23587C0(obj)) == C12041j2.f29672b) {
            return true;
        }
        if (a == C12041j2.f29671a) {
            a = mo23638k1(obj);
        }
        if (a == C12041j2.f29671a || a == C12041j2.f29672b) {
            return true;
        }
        if (a == C12041j2.f29674d) {
            return false;
        }
        mo23658w0(a);
        return true;
    }

    /* renamed from: A1 */
    public final void mo23584A1(C12131j<?> jVar, Object obj) {
        if (!mo23632g1()) {
            jVar.mo24707e(C11079d2.f28267a);
        } else {
            jVar.mo24708f(mo23589D(new C11699e(jVar)));
        }
    }

    /* renamed from: B0 */
    public void mo23585B0(@C12579k Throwable th) {
        mo23583A0(th);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: B1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23586B1(@org.jetbrains.annotations.C12579k kotlinx.coroutines.C11974i2 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo23620Z0()
            boolean r1 = r0 instanceof kotlinx.coroutines.C11974i2
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f29015a
            kotlinx.coroutines.j1 r2 = kotlinx.coroutines.C12041j2.f29680j
            boolean r0 = androidx.concurrent.futures.C16563a.m75000a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof kotlinx.coroutines.C12166w1
            if (r1 == 0) goto L_0x0027
            kotlinx.coroutines.w1 r0 = (kotlinx.coroutines.C12166w1) r0
            kotlinx.coroutines.n2 r0 = r0.mo23671a()
            if (r0 == 0) goto L_0x0027
            r4.mo24320u()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.mo23586B1(kotlinx.coroutines.i2):void");
    }

    /* renamed from: C0 */
    public final Object mo23587C0(Object obj) {
        Object K1;
        do {
            Object Z0 = mo23620Z0();
            if (!(Z0 instanceof C12166w1) || ((Z0 instanceof C11697c) && ((C11697c) Z0).mo23678h())) {
                return C12041j2.f29671a;
            }
            K1 = mo23604K1(Z0, new C11721c0(mo23599I0(obj), false, 2, (DefaultConstructorMarker) null));
        } while (K1 == C12041j2.f29673c);
        return K1;
    }

    /* renamed from: C1 */
    public final void mo23588C1(@C12580l C12152u uVar) {
        f29016b.set(this, uVar);
    }

    @C12579k
    /* renamed from: D */
    public final C11962g1 mo23589D(@C12579k C11300l<? super Throwable, C11079d2> lVar) {
        return mo23650t(false, true, lVar);
    }

    /* renamed from: D0 */
    public final boolean mo23590D0(Throwable th) {
        if (mo23631f1()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C12152u Y0 = mo23619Y0();
        if (Y0 == null || Y0 == C12081p2.f29727a) {
            return z;
        }
        if (Y0.mo24575q(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: D1 */
    public final int mo23591D1(Object obj) {
        if (obj instanceof C12040j1) {
            if (((C12040j1) obj).mo23674d()) {
                return 0;
            }
            if (!C16563a.m75000a(f29015a, this, obj, C12041j2.f29680j)) {
                return -1;
            }
            mo23662x1();
            return 1;
        } else if (!(obj instanceof C12160v1)) {
            return 0;
        } else {
            if (!C16563a.m75000a(f29015a, this, obj, ((C12160v1) obj).mo23671a())) {
                return -1;
            }
            mo23662x1();
            return 1;
        }
    }

    @C12579k
    /* renamed from: E0 */
    public String mo23592E0() {
        return "Job was cancelled";
    }

    /* renamed from: E1 */
    public final String mo23593E1(Object obj) {
        if (obj instanceof C11697c) {
            C11697c cVar = (C11697c) obj;
            if (cVar.mo23677g()) {
                return "Cancelling";
            }
            if (cVar.mo23678h()) {
                return "Completing";
            }
            return "Active";
        } else if (obj instanceof C12166w1) {
            if (((C12166w1) obj).mo23674d()) {
                return "Active";
            }
            return "New";
        } else if (obj instanceof C11721c0) {
            return "Cancelled";
        } else {
            return "Completed";
        }
    }

    /* renamed from: F0 */
    public boolean mo23594F0(@C12579k Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo23583A0(th) || !mo23615S0()) {
            return false;
        }
        return true;
    }

    @C12579k
    /* renamed from: F1 */
    public final CancellationException mo23595F1(@C12579k Throwable th, @C12580l String str) {
        CancellationException cancellationException;
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        } else {
            cancellationException = null;
        }
        if (cancellationException == null) {
            if (str == null) {
                str = mo23592E0();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }

    /* renamed from: G0 */
    public final void mo23596G0(C12166w1 w1Var, Object obj) {
        C11721c0 c0Var;
        C12152u Y0 = mo23619Y0();
        if (Y0 != null) {
            Y0.mo23720g();
            mo23588C1(C12081p2.f29727a);
        }
        Throwable th = null;
        if (obj instanceof C11721c0) {
            c0Var = (C11721c0) obj;
        } else {
            c0Var = null;
        }
        if (c0Var != null) {
            th = c0Var.f29065a;
        }
        if (w1Var instanceof C11974i2) {
            try {
                ((C11974i2) w1Var).mo23670z(th);
            } catch (Throwable th2) {
                mo23623b1(new CompletionHandlerException("Exception in completion handler " + w1Var + " for " + this, th2));
            }
        } else {
            C12070n2 a = w1Var.mo23671a();
            if (a != null) {
                mo23647r1(a, th);
            }
        }
    }

    /* renamed from: H0 */
    public final void mo23597H0(C11697c cVar, C12158v vVar, Object obj) {
        C12158v p1 = mo23643p1(vVar);
        if (p1 == null || !mo23608M1(cVar, p1, obj)) {
            mo23658w0(mo23605L0(cVar, obj));
        }
    }

    @C12177y1
    @C12579k
    /* renamed from: H1 */
    public final String mo23598H1() {
        return mo23642o1() + C12361b.f30258i + mo23593E1(mo23620Z0()) + C12361b.f30259j;
    }

    /* renamed from: I0 */
    public final Throwable mo23599I0(Object obj) {
        boolean z;
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof Throwable;
        }
        if (z) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(mo23592E0(), (Throwable) null, this);
            }
            return th;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((C12096s2) obj).mo23601J();
    }

    /* renamed from: I1 */
    public final boolean mo23600I1(C12166w1 w1Var, Object obj) {
        if (!C16563a.m75000a(f29015a, this, w1Var, C12041j2.m48072g(obj))) {
            return false;
        }
        mo23657v1((Throwable) null);
        mo23659w1(obj);
        mo23596G0(w1Var, obj);
        return true;
    }

    @C12579k
    /* renamed from: J */
    public CancellationException mo23601J() {
        Throwable th;
        Object Z0 = mo23620Z0();
        CancellationException cancellationException = null;
        if (Z0 instanceof C11697c) {
            th = ((C11697c) Z0).mo23676f();
        } else if (Z0 instanceof C11721c0) {
            th = ((C11721c0) Z0).f29065a;
        } else if (!(Z0 instanceof C12166w1)) {
            th = null;
        } else {
            throw new IllegalStateException(("Cannot be cancelling child in this state: " + Z0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        if (cancellationException != null) {
            return cancellationException;
        }
        return new JobCancellationException("Parent job is " + mo23593E1(Z0), th, this);
    }

    @C12579k
    /* renamed from: J0 */
    public final JobCancellationException mo23602J0(@C12580l String str, @C12580l Throwable th) {
        if (str == null) {
            str = mo23592E0();
        }
        return new JobCancellationException(str, th, this);
    }

    /* renamed from: J1 */
    public final boolean mo23603J1(C12166w1 w1Var, Throwable th) {
        C12070n2 X0 = mo23618X0(w1Var);
        if (X0 == null) {
            return false;
        }
        if (!C16563a.m75000a(f29015a, this, w1Var, new C11697c(X0, false, th))) {
            return false;
        }
        mo23645q1(X0, th);
        return true;
    }

    /* renamed from: K1 */
    public final Object mo23604K1(Object obj, Object obj2) {
        if (!(obj instanceof C12166w1)) {
            return C12041j2.f29671a;
        }
        if ((!(obj instanceof C12040j1) && !(obj instanceof C11974i2)) || (obj instanceof C12158v) || (obj2 instanceof C11721c0)) {
            return mo23606L1((C12166w1) obj, obj2);
        }
        if (mo23600I1((C12166w1) obj, obj2)) {
            return obj2;
        }
        return C12041j2.f29673c;
    }

    /* renamed from: L0 */
    public final Object mo23605L0(C11697c cVar, Object obj) {
        C11721c0 c0Var;
        Throwable th;
        boolean g;
        Throwable R0;
        if (obj instanceof C11721c0) {
            c0Var = (C11721c0) obj;
        } else {
            c0Var = null;
        }
        if (c0Var != null) {
            th = c0Var.f29065a;
        } else {
            th = null;
        }
        synchronized (cVar) {
            g = cVar.mo23677g();
            List<Throwable> j = cVar.mo23680j(th);
            R0 = mo23613R0(cVar, j);
            if (R0 != null) {
                mo23656v0(R0, j);
            }
        }
        boolean z = false;
        if (!(R0 == null || R0 == th)) {
            obj = new C11721c0(R0, false, 2, (DefaultConstructorMarker) null);
        }
        if (R0 != null) {
            if (mo23590D0(R0) || mo23622a1(R0)) {
                z = true;
            }
            if (z) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((C11721c0) obj).mo23745b();
            }
        }
        if (!g) {
            mo23657v1(R0);
        }
        mo23659w1(obj);
        C16563a.m75000a(f29015a, this, cVar, C12041j2.m48072g(obj));
        mo23596G0(cVar, obj);
        return obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006e, code lost:
        if (r2 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0070, code lost:
        mo23645q1(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0073, code lost:
        r9 = mo23607M0(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0077, code lost:
        if (r9 == null) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x007d, code lost:
        if (mo23608M1(r1, r9, r10) == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0081, code lost:
        return kotlinx.coroutines.C12041j2.f29672b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0086, code lost:
        return mo23605L0(r1, r10);
     */
    /* renamed from: L1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo23606L1(kotlinx.coroutines.C12166w1 r9, java.lang.Object r10) {
        /*
            r8 = this;
            kotlinx.coroutines.n2 r0 = r8.mo23618X0(r9)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.C12041j2.f29673c
            return r9
        L_0x000b:
            boolean r1 = r9 instanceof kotlinx.coroutines.JobSupport.C11697c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r9
            kotlinx.coroutines.JobSupport$c r1 = (kotlinx.coroutines.JobSupport.C11697c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            r3 = 0
            if (r1 != 0) goto L_0x001d
            kotlinx.coroutines.JobSupport$c r1 = new kotlinx.coroutines.JobSupport$c
            r1.<init>(r0, r3, r2)
        L_0x001d:
            kotlin.jvm.internal.Ref$ObjectRef r4 = new kotlin.jvm.internal.Ref$ObjectRef
            r4.<init>()
            monitor-enter(r1)
            boolean r5 = r1.mo23678h()     // Catch:{ all -> 0x0087 }
            if (r5 == 0) goto L_0x002f
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.C12041j2.f29671a     // Catch:{ all -> 0x0087 }
            monitor-exit(r1)
            return r9
        L_0x002f:
            r5 = 1
            r1.mo23681k(r5)     // Catch:{ all -> 0x0087 }
            if (r1 == r9) goto L_0x0043
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = f29015a     // Catch:{ all -> 0x0087 }
            boolean r6 = androidx.concurrent.futures.C16563a.m75000a(r6, r8, r9, r1)     // Catch:{ all -> 0x0087 }
            if (r6 != 0) goto L_0x0043
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.C12041j2.f29673c     // Catch:{ all -> 0x0087 }
            monitor-exit(r1)
            return r9
        L_0x0043:
            boolean r6 = r1.mo23677g()     // Catch:{ all -> 0x0087 }
            boolean r7 = r10 instanceof kotlinx.coroutines.C11721c0     // Catch:{ all -> 0x0087 }
            if (r7 == 0) goto L_0x004f
            r7 = r10
            kotlinx.coroutines.c0 r7 = (kotlinx.coroutines.C11721c0) r7     // Catch:{ all -> 0x0087 }
            goto L_0x0050
        L_0x004f:
            r7 = r2
        L_0x0050:
            if (r7 == 0) goto L_0x0057
            java.lang.Throwable r7 = r7.f29065a     // Catch:{ all -> 0x0087 }
            r1.mo23672b(r7)     // Catch:{ all -> 0x0087 }
        L_0x0057:
            java.lang.Throwable r7 = r1.mo23676f()     // Catch:{ all -> 0x0087 }
            if (r6 != 0) goto L_0x005e
            r3 = r5
        L_0x005e:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ all -> 0x0087 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0087 }
            if (r3 == 0) goto L_0x0069
            r2 = r7
        L_0x0069:
            r4.element = r2     // Catch:{ all -> 0x0087 }
            kotlin.d2 r3 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0087 }
            monitor-exit(r1)
            if (r2 == 0) goto L_0x0073
            r8.mo23645q1(r0, r2)
        L_0x0073:
            kotlinx.coroutines.v r9 = r8.mo23607M0(r9)
            if (r9 == 0) goto L_0x0082
            boolean r9 = r8.mo23608M1(r1, r9, r10)
            if (r9 == 0) goto L_0x0082
            kotlinx.coroutines.internal.o0 r9 = kotlinx.coroutines.C12041j2.f29672b
            return r9
        L_0x0082:
            java.lang.Object r9 = r8.mo23605L0(r1, r10)
            return r9
        L_0x0087:
            r9 = move-exception
            monitor-exit(r1)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.mo23606L1(kotlinx.coroutines.w1, java.lang.Object):java.lang.Object");
    }

    /* renamed from: M0 */
    public final C12158v mo23607M0(C12166w1 w1Var) {
        C12158v vVar = w1Var instanceof C12158v ? (C12158v) w1Var : null;
        if (vVar != null) {
            return vVar;
        }
        C12070n2 a = w1Var.mo23671a();
        if (a != null) {
            return mo23643p1(a);
        }
        return null;
    }

    /* renamed from: M1 */
    public final boolean mo23608M1(C11697c cVar, C12158v vVar, Object obj) {
        while (C11723c2.C11724a.m46189g(vVar.f29941e, false, false, new C11696b(this, cVar, vVar, obj), 1, (Object) null) == C12081p2.f29727a) {
            vVar = mo23643p1(vVar);
            if (vVar == null) {
                return false;
            }
        }
        return true;
    }

    @C12580l
    /* renamed from: N0 */
    public final Object mo23609N0() {
        Object Z0 = mo23620Z0();
        if (!(!(Z0 instanceof C12166w1))) {
            throw new IllegalStateException("This job has not completed yet".toString());
        } else if (!(Z0 instanceof C11721c0)) {
            return C12041j2.m48073h(Z0);
        } else {
            throw ((C11721c0) Z0).f29065a;
        }
    }

    @C12580l
    /* renamed from: O0 */
    public final Throwable mo23610O0() {
        Object Z0 = mo23620Z0();
        if (Z0 instanceof C11697c) {
            Throwable f = ((C11697c) Z0).mo23676f();
            if (f != null) {
                return f;
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (Z0 instanceof C12166w1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (Z0 instanceof C11721c0) {
            return ((C11721c0) Z0).f29065a;
        } else {
            return null;
        }
    }

    /* renamed from: P0 */
    public final boolean mo23611P0() {
        Object Z0 = mo23620Z0();
        return (Z0 instanceof C11721c0) && ((C11721c0) Z0).mo23744a();
    }

    @C12579k
    /* renamed from: Q */
    public CoroutineContext mo7443Q(@C12579k CoroutineContext coroutineContext) {
        return C11723c2.C11724a.m46191i(this, coroutineContext);
    }

    /* renamed from: Q0 */
    public final Throwable mo23612Q0(Object obj) {
        C11721c0 c0Var = obj instanceof C11721c0 ? (C11721c0) obj : null;
        if (c0Var != null) {
            return c0Var.f29065a;
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.Throwable} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Throwable} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: R0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Throwable mo23613R0(kotlinx.coroutines.JobSupport.C11697c r6, java.util.List<? extends java.lang.Throwable> r7) {
        /*
            r5 = this;
            boolean r0 = r7.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0018
            boolean r6 = r6.mo23677g()
            if (r6 == 0) goto L_0x0017
            kotlinx.coroutines.JobCancellationException r6 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r7 = r5.mo23592E0()
            r6.<init>(r7, r1, r5)
            return r6
        L_0x0017:
            return r1
        L_0x0018:
            r6 = r7
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.Iterator r0 = r6.iterator()
        L_0x001f:
            boolean r2 = r0.hasNext()
            r3 = 1
            if (r2 == 0) goto L_0x0033
            java.lang.Object r2 = r0.next()
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r4 = r4 instanceof java.util.concurrent.CancellationException
            r4 = r4 ^ r3
            if (r4 == 0) goto L_0x001f
            goto L_0x0034
        L_0x0033:
            r2 = r1
        L_0x0034:
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            if (r2 == 0) goto L_0x0039
            return r2
        L_0x0039:
            r0 = 0
            java.lang.Object r7 = r7.get(r0)
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            boolean r2 = r7 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r2 == 0) goto L_0x0066
            java.util.Iterator r6 = r6.iterator()
        L_0x0048:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L_0x0061
            java.lang.Object r2 = r6.next()
            r4 = r2
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            if (r4 == r7) goto L_0x005d
            boolean r4 = r4 instanceof kotlinx.coroutines.TimeoutCancellationException
            if (r4 == 0) goto L_0x005d
            r4 = r3
            goto L_0x005e
        L_0x005d:
            r4 = r0
        L_0x005e:
            if (r4 == 0) goto L_0x0048
            r1 = r2
        L_0x0061:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x0066
            return r1
        L_0x0066:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.mo23613R0(kotlinx.coroutines.JobSupport$c, java.util.List):java.lang.Throwable");
    }

    @C12580l
    /* renamed from: S */
    public final Object mo23614S(@C12579k C11045c<? super C11079d2> cVar) {
        if (!mo23632g1()) {
            C11804f2.m46978z(cVar.getContext());
            return C11079d2.f28267a;
        }
        Object h1 = mo23634h1(cVar);
        if (h1 == C11063b.m42612h()) {
            return h1;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: S0 */
    public boolean mo23615S0() {
        return true;
    }

    @C12579k
    /* renamed from: T0 */
    public final C12126e<?> mo23616T0() {
        JobSupport$onAwaitInternal$1 jobSupport$onAwaitInternal$1 = JobSupport$onAwaitInternal$1.f29032a;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        JobSupport$onAwaitInternal$2 jobSupport$onAwaitInternal$2 = JobSupport$onAwaitInternal$2.f29033a;
        Intrinsics.checkNotNull(jobSupport$onAwaitInternal$2, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'param')] kotlin.Any?, @[ParameterName(name = 'clauseResult')] kotlin.Any?, kotlin.Any?>{ kotlinx.coroutines.selects.SelectKt.ProcessResultFunction }");
        return new C12127f(this, (C11305q) C11370u0.m43701q(jobSupport$onAwaitInternal$1, 3), (C11305q) C11370u0.m43701q(jobSupport$onAwaitInternal$2, 3), (C11305q) null, 8, (DefaultConstructorMarker) null);
    }

    /* renamed from: V0 */
    public boolean mo23617V0() {
        return false;
    }

    /* renamed from: X0 */
    public final C12070n2 mo23618X0(C12166w1 w1Var) {
        C12070n2 a = w1Var.mo23671a();
        if (a != null) {
            return a;
        }
        if (w1Var instanceof C12040j1) {
            return new C12070n2();
        }
        if (w1Var instanceof C11974i2) {
            mo23667z1((C11974i2) w1Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + w1Var).toString());
    }

    @C12580l
    /* renamed from: Y0 */
    public final C12152u mo23619Y0() {
        return (C12152u) f29016b.get(this);
    }

    @C12580l
    /* renamed from: Z0 */
    public final Object mo23620Z0() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29015a;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof C11993g0)) {
                return obj;
            }
            ((C11993g0) obj).mo24335b(this);
        }
    }

    /* renamed from: a */
    public void mo23621a(@C12580l CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo23592E0(), (Throwable) null, this);
        }
        mo23585B0(cancellationException);
    }

    /* renamed from: a1 */
    public boolean mo23622a1(@C12579k Throwable th) {
        return false;
    }

    @C12580l
    /* renamed from: b */
    public <E extends CoroutineContext.C11040a> E mo7444b(@C12579k CoroutineContext.C11042b<E> bVar) {
        return C11723c2.C11724a.m46187e(this, bVar);
    }

    /* renamed from: b1 */
    public void mo23623b1(@C12579k Throwable th) {
        throw th;
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Added since 1.2.0 for binary compatibility with versions <= 1.1.x")
    /* renamed from: c */
    public /* synthetic */ boolean mo23624c(Throwable th) {
        Throwable th2;
        if (th == null || (th2 = m45937G1(this, th, (String) null, 1, (Object) null)) == null) {
            th2 = new JobCancellationException(mo23592E0(), (Throwable) null, this);
        }
        mo23585B0(th2);
        return true;
    }

    /* renamed from: c1 */
    public final void mo23625c1(@C12580l C11723c2 c2Var) {
        if (c2Var == null) {
            mo23588C1(C12081p2.f29727a);
            return;
        }
        c2Var.start();
        C12152u q0 = c2Var.mo23644q0(this);
        mo23588C1(q0);
        if (mo23636j()) {
            q0.mo23720g();
            mo23588C1(C12081p2.f29727a);
        }
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
        mo23621a((CancellationException) null);
    }

    /* renamed from: d */
    public boolean mo23627d() {
        Object Z0 = mo23620Z0();
        if (!(Z0 instanceof C12166w1) || !((C12166w1) Z0).mo23674d()) {
            return false;
        }
        return true;
    }

    /* renamed from: d1 */
    public final boolean mo23628d1(C12166w1 w1Var) {
        return (w1Var instanceof C11697c) && ((C11697c) w1Var).mo23677g();
    }

    /* renamed from: e1 */
    public final boolean mo23629e1() {
        return mo23620Z0() instanceof C11721c0;
    }

    @C12579k
    /* renamed from: f */
    public CoroutineContext mo7445f(@C12579k CoroutineContext.C11042b<?> bVar) {
        return C11723c2.C11724a.m46190h(this, bVar);
    }

    @C12579k
    /* renamed from: f0 */
    public final C12124c mo23630f0() {
        JobSupport$onJoin$1 jobSupport$onJoin$1 = JobSupport$onJoin$1.f29034a;
        Intrinsics.checkNotNull(jobSupport$onJoin$1, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = 'clauseObject')] kotlin.Any, @[ParameterName(name = 'select')] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = 'param')] kotlin.Any?, kotlin.Unit>{ kotlinx.coroutines.selects.SelectKt.RegistrationFunction }");
        return new C12125d(this, (C11305q) C11370u0.m43701q(jobSupport$onJoin$1, 3), (C11305q) null, 4, (DefaultConstructorMarker) null);
    }

    /* renamed from: f1 */
    public boolean mo23631f1() {
        return false;
    }

    /* renamed from: g1 */
    public final boolean mo23632g1() {
        Object Z0;
        do {
            Z0 = mo23620Z0();
            if (!(Z0 instanceof C12166w1)) {
                return false;
            }
        } while (mo23591D1(Z0) < 0);
        return true;
    }

    @C12579k
    public final CoroutineContext.C11042b<?> getKey() {
        return C11723c2.f29067w0;
    }

    @C12580l
    public C11723c2 getParent() {
        C12152u Y0 = mo23619Y0();
        if (Y0 != null) {
            return Y0.getParent();
        }
        return null;
    }

    /* renamed from: h1 */
    public final Object mo23634h1(C11045c<? super C11079d2> cVar) {
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        C12089r.m48294a(pVar, mo23589D(new C12157u2(pVar)));
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return C11079d2.f28267a;
    }

    public final boolean isCancelled() {
        Object Z0 = mo23620Z0();
        if ((Z0 instanceof C11721c0) || ((Z0 instanceof C11697c) && ((C11697c) Z0).mo23677g())) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean mo23636j() {
        return !(mo23620Z0() instanceof C12166w1);
    }

    /* renamed from: j1 */
    public final Void mo23637j1(C11300l<Object, C11079d2> lVar) {
        while (true) {
            lVar.invoke(mo23620Z0());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 == null) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0040, code lost:
        mo23645q1(((kotlinx.coroutines.JobSupport.C11697c) r2).mo23671a(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004d, code lost:
        return kotlinx.coroutines.C12041j2.m48066a();
     */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo23638k1(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo23620Z0()
            boolean r3 = r2 instanceof kotlinx.coroutines.JobSupport.C11697c
            if (r3 == 0) goto L_0x0051
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.JobSupport$c r3 = (kotlinx.coroutines.JobSupport.C11697c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo23679i()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.C12041j2.f29674d     // Catch:{ all -> 0x004e }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            kotlinx.coroutines.JobSupport$c r3 = (kotlinx.coroutines.JobSupport.C11697c) r3     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo23677g()     // Catch:{ all -> 0x004e }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.mo23599I0(r7)     // Catch:{ all -> 0x004e }
        L_0x002b:
            r7 = r2
            kotlinx.coroutines.JobSupport$c r7 = (kotlinx.coroutines.JobSupport.C11697c) r7     // Catch:{ all -> 0x004e }
            r7.mo23672b(r1)     // Catch:{ all -> 0x004e }
        L_0x0031:
            r7 = r2
            kotlinx.coroutines.JobSupport$c r7 = (kotlinx.coroutines.JobSupport.C11697c) r7     // Catch:{ all -> 0x004e }
            java.lang.Throwable r7 = r7.mo23676f()     // Catch:{ all -> 0x004e }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 == 0) goto L_0x0049
            kotlinx.coroutines.JobSupport$c r2 = (kotlinx.coroutines.JobSupport.C11697c) r2
            kotlinx.coroutines.n2 r7 = r2.mo23671a()
            r6.mo23645q1(r7, r0)
        L_0x0049:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.C12041j2.f29671a
            return r7
        L_0x004e:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0051:
            boolean r3 = r2 instanceof kotlinx.coroutines.C12166w1
            if (r3 == 0) goto L_0x00a2
            if (r1 != 0) goto L_0x005b
            java.lang.Throwable r1 = r6.mo23599I0(r7)
        L_0x005b:
            r3 = r2
            kotlinx.coroutines.w1 r3 = (kotlinx.coroutines.C12166w1) r3
            boolean r4 = r3.mo23674d()
            if (r4 == 0) goto L_0x006f
            boolean r2 = r6.mo23603J1(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.C12041j2.f29671a
            return r7
        L_0x006f:
            kotlinx.coroutines.c0 r3 = new kotlinx.coroutines.c0
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.mo23604K1(r2, r3)
            kotlinx.coroutines.internal.o0 r4 = kotlinx.coroutines.C12041j2.f29671a
            if (r3 == r4) goto L_0x0087
            kotlinx.coroutines.internal.o0 r2 = kotlinx.coroutines.C12041j2.f29673c
            if (r3 == r2) goto L_0x0002
            return r3
        L_0x0087:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot happen in "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x00a2:
            kotlinx.coroutines.internal.o0 r7 = kotlinx.coroutines.C12041j2.f29674d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.mo23638k1(java.lang.Object):java.lang.Object");
    }

    /* renamed from: l */
    public <R> R mo7446l(R r, @C12579k C11304p<? super R, ? super CoroutineContext.C11040a, ? extends R> pVar) {
        return C11723c2.C11724a.m46186d(this, r, pVar);
    }

    /* renamed from: l1 */
    public final boolean mo23639l1(@C12580l Object obj) {
        Object K1;
        do {
            K1 = mo23604K1(mo23620Z0(), obj);
            if (K1 == C12041j2.f29671a) {
                return false;
            }
            if (K1 == C12041j2.f29672b) {
                return true;
            }
        } while (K1 == C12041j2.f29673c);
        mo23658w0(K1);
        return true;
    }

    @C12580l
    /* renamed from: m1 */
    public final Object mo23640m1(@C12580l Object obj) {
        Object K1;
        do {
            K1 = mo23604K1(mo23620Z0(), obj);
            if (K1 == C12041j2.f29671a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, mo23612Q0(obj));
            }
        } while (K1 == C12041j2.f29673c);
        return K1;
    }

    /* renamed from: n1 */
    public final C11974i2 mo23641n1(C11300l<? super Throwable, C11079d2> lVar, boolean z) {
        C11974i2 i2Var = null;
        if (z) {
            if (lVar instanceof C11769d2) {
                i2Var = (C11769d2) lVar;
            }
            if (i2Var == null) {
                i2Var = new C11705a2(lVar);
            }
        } else {
            if (lVar instanceof C11974i2) {
                i2Var = (C11974i2) lVar;
            }
            if (i2Var == null) {
                i2Var = new C11718b2(lVar);
            }
        }
        i2Var.mo24297B(this);
        return i2Var;
    }

    @C12579k
    /* renamed from: o1 */
    public String mo23642o1() {
        return C12090r0.m48300a(this);
    }

    /* renamed from: p1 */
    public final C12158v mo23643p1(LockFreeLinkedListNode lockFreeLinkedListNode) {
        while (lockFreeLinkedListNode.mo24317p()) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.mo24316o();
        }
        while (true) {
            lockFreeLinkedListNode = lockFreeLinkedListNode.mo24315n();
            if (!lockFreeLinkedListNode.mo24317p()) {
                if (lockFreeLinkedListNode instanceof C12158v) {
                    return (C12158v) lockFreeLinkedListNode;
                }
                if (lockFreeLinkedListNode instanceof C12070n2) {
                    return null;
                }
            }
        }
    }

    @C12579k
    /* renamed from: q0 */
    public final C12152u mo23644q0(@C12579k C12162w wVar) {
        C11962g1 g = C11723c2.C11724a.m46189g(this, true, false, new C12158v(wVar), 2, (Object) null);
        Intrinsics.checkNotNull(g, "null cannot be cast to non-null type kotlinx.coroutines.ChildHandle");
        return (C12152u) g;
    }

    /* renamed from: q1 */
    public final void mo23645q1(C12070n2 n2Var, Throwable th) {
        mo23657v1(th);
        Object m = n2Var.mo24314m();
        Intrinsics.checkNotNull(m, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) m; !Intrinsics.areEqual((Object) lockFreeLinkedListNode, (Object) n2Var); lockFreeLinkedListNode = lockFreeLinkedListNode.mo24315n()) {
            if (lockFreeLinkedListNode instanceof C11769d2) {
                C11974i2 i2Var = (C11974i2) lockFreeLinkedListNode;
                try {
                    i2Var.mo23670z(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C11414o.m43942a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + i2Var + " for " + this, th2);
                        C11079d2 d2Var = C11079d2.f28267a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo23623b1(completionHandlerException);
        }
        mo23590D0(th);
    }

    @C12579k
    /* renamed from: r */
    public final C11559m<C11723c2> mo23646r() {
        return C11563q.m44902b(new JobSupport$children$1(this, (C11045c<? super JobSupport$children$1>) null));
    }

    /* renamed from: r1 */
    public final void mo23647r1(C12070n2 n2Var, Throwable th) {
        Object m = n2Var.mo24314m();
        Intrinsics.checkNotNull(m, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        CompletionHandlerException completionHandlerException = null;
        for (LockFreeLinkedListNode lockFreeLinkedListNode = (LockFreeLinkedListNode) m; !Intrinsics.areEqual((Object) lockFreeLinkedListNode, (Object) n2Var); lockFreeLinkedListNode = lockFreeLinkedListNode.mo24315n()) {
            if (lockFreeLinkedListNode instanceof C11974i2) {
                C11974i2 i2Var = (C11974i2) lockFreeLinkedListNode;
                try {
                    i2Var.mo23670z(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        C11414o.m43942a(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + i2Var + " for " + this, th2);
                        C11079d2 d2Var = C11079d2.f28267a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            mo23623b1(completionHandlerException);
        }
    }

    @C12580l
    /* renamed from: s */
    public final Throwable mo23648s() {
        Object Z0 = mo23620Z0();
        if (!(Z0 instanceof C12166w1)) {
            return mo23612Q0(Z0);
        }
        throw new IllegalStateException("This job has not completed yet".toString());
    }

    public final boolean start() {
        int D1;
        do {
            D1 = mo23591D1(mo23620Z0());
            if (D1 == 0) {
                return false;
            }
        } while (D1 != 1);
        return true;
    }

    @C12579k
    /* renamed from: t */
    public final C11962g1 mo23650t(boolean z, boolean z2, @C12579k C11300l<? super Throwable, C11079d2> lVar) {
        C11721c0 c0Var;
        C11974i2 n1 = mo23641n1(lVar, z);
        while (true) {
            Object Z0 = mo23620Z0();
            if (Z0 instanceof C12040j1) {
                C12040j1 j1Var = (C12040j1) Z0;
                if (!j1Var.mo23674d()) {
                    mo23664y1(j1Var);
                } else if (C16563a.m75000a(f29015a, this, Z0, n1)) {
                    return n1;
                }
            } else {
                Throwable th = null;
                if (Z0 instanceof C12166w1) {
                    C12070n2 a = ((C12166w1) Z0).mo23671a();
                    if (a == null) {
                        Intrinsics.checkNotNull(Z0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        mo23667z1((C11974i2) Z0);
                    } else {
                        C11962g1 g1Var = C12081p2.f29727a;
                        if (z && (Z0 instanceof C11697c)) {
                            synchronized (Z0) {
                                th = ((C11697c) Z0).mo23676f();
                                if (th == null || ((lVar instanceof C12158v) && !((C11697c) Z0).mo23678h())) {
                                    if (mo23654u0(Z0, a, n1)) {
                                        if (th == null) {
                                            return n1;
                                        }
                                        g1Var = n1;
                                    }
                                }
                                C11079d2 d2Var = C11079d2.f28267a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                lVar.invoke(th);
                            }
                            return g1Var;
                        } else if (mo23654u0(Z0, a, n1)) {
                            return n1;
                        }
                    }
                } else {
                    if (z2) {
                        if (Z0 instanceof C11721c0) {
                            c0Var = (C11721c0) Z0;
                        } else {
                            c0Var = null;
                        }
                        if (c0Var != null) {
                            th = c0Var.f29065a;
                        }
                        lVar.invoke(th);
                    }
                    return C12081p2.f29727a;
                }
            }
        }
    }

    /* renamed from: t1 */
    public final Object mo23651t1(Object obj, Object obj2) {
        if (!(obj2 instanceof C11721c0)) {
            return obj2;
        }
        throw ((C11721c0) obj2).f29065a;
    }

    @C12579k
    public String toString() {
        return mo23598H1() + '@' + C12090r0.m48301b(this);
    }

    @C12579k
    /* renamed from: u */
    public final CancellationException mo23653u() {
        Object Z0 = mo23620Z0();
        if (Z0 instanceof C11697c) {
            Throwable f = ((C11697c) Z0).mo23676f();
            if (f != null) {
                CancellationException F1 = mo23595F1(f, C12090r0.m48300a(this) + " is cancelling");
                if (F1 != null) {
                    return F1;
                }
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (Z0 instanceof C12166w1) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        } else if (Z0 instanceof C11721c0) {
            return m45937G1(this, ((C11721c0) Z0).f29065a, (String) null, 1, (Object) null);
        } else {
            return new JobCancellationException(C12090r0.m48300a(this) + " has completed normally", (Throwable) null, this);
        }
    }

    /* renamed from: u0 */
    public final boolean mo23654u0(Object obj, C12070n2 n2Var, C11974i2 i2Var) {
        int x;
        C11700f fVar = new C11700f(i2Var, this, obj);
        do {
            x = n2Var.mo24316o().mo24323x(i2Var, n2Var, fVar);
            if (x == 1) {
                return true;
            }
        } while (x != 2);
        return false;
    }

    /* renamed from: u1 */
    public final void mo23655u1(C12131j<?> jVar, Object obj) {
        Object Z0;
        do {
            Z0 = mo23620Z0();
            if (!(Z0 instanceof C12166w1)) {
                if (!(Z0 instanceof C11721c0)) {
                    Z0 = C12041j2.m48073h(Z0);
                }
                jVar.mo24707e(Z0);
                return;
            }
        } while (mo23591D1(Z0) < 0);
        jVar.mo24708f(mo23589D(new C11698d(jVar)));
    }

    /* renamed from: v0 */
    public final void mo23656v0(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th2 : list) {
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C11414o.m43942a(th, th2);
                }
            }
        }
    }

    /* renamed from: v1 */
    public void mo23657v1(@C12580l Throwable th) {
    }

    /* renamed from: w0 */
    public void mo23658w0(@C12580l Object obj) {
    }

    /* renamed from: w1 */
    public void mo23659w1(@C12580l Object obj) {
    }

    /* renamed from: x */
    public final void mo23660x(@C12579k C12096s2 s2Var) {
        mo23583A0(s2Var);
    }

    @C12580l
    /* renamed from: x0 */
    public final Object mo23661x0(@C12579k C11045c<Object> cVar) {
        Object Z0;
        do {
            Z0 = mo23620Z0();
            if (!(Z0 instanceof C12166w1)) {
                if (!(Z0 instanceof C11721c0)) {
                    return C12041j2.m48073h(Z0);
                }
                throw ((C11721c0) Z0).f29065a;
            }
        } while (mo23591D1(Z0) < 0);
        return mo23663y0(cVar);
    }

    /* renamed from: x1 */
    public void mo23662x1() {
    }

    /* renamed from: y0 */
    public final Object mo23663y0(C11045c<Object> cVar) {
        C11695a aVar = new C11695a(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), this);
        aVar.mo24537e0();
        C12089r.m48294a(aVar, mo23589D(new C12146t2(aVar)));
        Object y = aVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        return y;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.v1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: y1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23664y1(kotlinx.coroutines.C12040j1 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.n2 r0 = new kotlinx.coroutines.n2
            r0.<init>()
            boolean r1 = r3.mo23674d()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.v1 r1 = new kotlinx.coroutines.v1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f29015a
            androidx.concurrent.futures.C16563a.m75000a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.JobSupport.mo23664y1(kotlinx.coroutines.j1):void");
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @C12579k
    /* renamed from: z */
    public C11723c2 mo23665z(@C12579k C11723c2 c2Var) {
        return C11723c2.C11724a.m46192j(this, c2Var);
    }

    /* renamed from: z0 */
    public final boolean mo23666z0(@C12580l Throwable th) {
        return mo23583A0(th);
    }

    /* renamed from: z1 */
    public final void mo23667z1(C11974i2 i2Var) {
        i2Var.mo24310i(new C12070n2());
        C16563a.m75000a(f29015a, this, i2Var, i2Var.mo24315n());
    }
}
