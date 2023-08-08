package kotlinx.coroutines.internal;

import androidx.concurrent.futures.C16563a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.C11079d2;
import kotlin.jvm.C11287e;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nLockFreeTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n+ 2 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore$Companion\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,308:1\n299#2,3:309\n299#2,3:312\n299#2,3:315\n299#2,3:318\n299#2,3:321\n299#2,3:325\n299#2,3:328\n1#3:324\n*S KotlinDebug\n*F\n+ 1 LockFreeTaskQueue.kt\nkotlinx/coroutines/internal/LockFreeTaskQueueCore\n*L\n91#1:309,3\n92#1:312,3\n107#1:315,3\n167#1:318,3\n200#1:321,3\n231#1:325,3\n247#1:328,3\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.x */
public final class C12027x<E> {
    @C12579k

    /* renamed from: e */
    public static final C12028a f29637e = new C12028a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: f */
    public static final AtomicReferenceFieldUpdater f29638f;
    @C12579k

    /* renamed from: g */
    public static final AtomicLongFieldUpdater f29639g;

    /* renamed from: h */
    public static final int f29640h = 8;

    /* renamed from: i */
    public static final int f29641i = 30;

    /* renamed from: j */
    public static final int f29642j = 1073741823;

    /* renamed from: k */
    public static final int f29643k = 0;

    /* renamed from: l */
    public static final long f29644l = 1073741823;

    /* renamed from: m */
    public static final int f29645m = 30;

    /* renamed from: n */
    public static final long f29646n = 1152921503533105152L;

    /* renamed from: o */
    public static final int f29647o = 60;

    /* renamed from: p */
    public static final long f29648p = 1152921504606846976L;

    /* renamed from: q */
    public static final int f29649q = 61;

    /* renamed from: r */
    public static final long f29650r = 2305843009213693952L;

    /* renamed from: s */
    public static final int f29651s = 1024;
    @C12579k
    @C11287e

    /* renamed from: t */
    public static final C12009o0 f29652t = new C12009o0("REMOVE_FROZEN");

    /* renamed from: u */
    public static final int f29653u = 0;

    /* renamed from: v */
    public static final int f29654v = 1;

    /* renamed from: w */
    public static final int f29655w = 2;
    @C11394v
    @C12580l
    private volatile Object _next;
    @C11394v
    private volatile long _state;

    /* renamed from: a */
    public final int f29656a;

    /* renamed from: b */
    public final boolean f29657b;

    /* renamed from: c */
    public final int f29658c;
    @C12579k

    /* renamed from: d */
    public final AtomicReferenceArray f29659d;

    /* renamed from: kotlinx.coroutines.internal.x$a */
    public static final class C12028a {
        public /* synthetic */ C12028a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final int mo24440a(long j) {
            return (j & C12027x.f29650r) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo24441b(long j, int i) {
            return mo24444e(j, C12027x.f29644l) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo24442c(long j, int i) {
            return mo24444e(j, C12027x.f29646n) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final <T> T mo24443d(long j, @C12579k C11304p<? super Integer, ? super Integer, ? extends T> pVar) {
            return pVar.invoke(Integer.valueOf((int) ((C12027x.f29644l & j) >> 0)), Integer.valueOf((int) ((j & C12027x.f29646n) >> 30)));
        }

        /* renamed from: e */
        public final long mo24444e(long j, long j2) {
            return j & (~j2);
        }

        public C12028a() {
        }
    }

    /* renamed from: kotlinx.coroutines.internal.x$b */
    public static final class C12029b {
        @C11287e

        /* renamed from: a */
        public final int f29660a;

        public C12029b(int i) {
            this.f29660a = i;
        }
    }

    static {
        Class<C12027x> cls = C12027x.class;
        f29638f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f29639g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C12027x(int i, boolean z) {
        boolean z2;
        this.f29656a = i;
        this.f29657b = z;
        int i2 = i - 1;
        this.f29658c = i2;
        this.f29659d = new AtomicReferenceArray(i);
        boolean z3 = false;
        if (i2 <= 1073741823) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (!((i & i2) == 0 ? true : z3)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x006c A[LOOP:1: B:20:0x006c->B:23:0x0081, LOOP_START, PHI: r0 
      PHI: (r0v3 kotlinx.coroutines.internal.x) = (r0v2 kotlinx.coroutines.internal.x), (r0v5 kotlinx.coroutines.internal.x) binds: [B:19:0x0064, B:23:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo24423a(@org.jetbrains.annotations.C12579k E r14) {
        /*
            r13 = this;
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = f29639g
        L_0x0002:
            long r3 = r0.get(r13)
            r1 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r1 = r1 & r3
            r7 = 0
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0016
            kotlinx.coroutines.internal.x$a r14 = f29637e
            int r14 = r14.mo24440a(r3)
            return r14
        L_0x0016:
            r1 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r1 = r1 & r3
            r9 = 0
            long r1 = r1 >> r9
            int r1 = (int) r1
            r5 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r5 = r5 & r3
            r2 = 30
            long r5 = r5 >> r2
            int r10 = (int) r5
            int r11 = r13.f29658c
            int r2 = r10 + 2
            r2 = r2 & r11
            r5 = r1 & r11
            r6 = 1
            if (r2 != r5) goto L_0x0032
            return r6
        L_0x0032:
            boolean r2 = r13.f29657b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r2 != 0) goto L_0x0051
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r13.f29659d
            r12 = r10 & r11
            java.lang.Object r2 = r2.get(r12)
            if (r2 == 0) goto L_0x0051
            int r2 = r13.f29656a
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 < r3) goto L_0x0050
            int r10 = r10 - r1
            r1 = r10 & r5
            int r2 = r2 >> 1
            if (r1 <= r2) goto L_0x0002
        L_0x0050:
            return r6
        L_0x0051:
            int r1 = r10 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = f29639g
            kotlinx.coroutines.internal.x$a r5 = f29637e
            long r5 = r5.mo24442c(r3, r1)
            r1 = r2
            r2 = r13
            boolean r1 = r1.compareAndSet(r2, r3, r5)
            if (r1 == 0) goto L_0x0002
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f29659d
            r1 = r10 & r11
            r0.set(r1, r14)
            r0 = r13
        L_0x006c:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = f29639g
            long r1 = r1.get(r0)
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r1 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0083
            kotlinx.coroutines.internal.x r0 = r0.mo24435m()
            kotlinx.coroutines.internal.x r0 = r0.mo24427e(r10, r14)
            if (r0 != 0) goto L_0x006c
        L_0x0083:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C12027x.mo24423a(java.lang.Object):int");
    }

    /* renamed from: b */
    public final C12027x<E> mo24424b(long j) {
        C12027x<E> xVar = new C12027x<>(this.f29656a * 2, this.f29657b);
        int i = (int) ((f29644l & j) >> 0);
        int i2 = (int) ((f29646n & j) >> 30);
        while (true) {
            int i3 = this.f29658c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f29659d.get(i3 & i);
                if (obj == null) {
                    obj = new C12029b(i);
                }
                xVar.f29659d.set(xVar.f29658c & i, obj);
                i++;
            } else {
                f29639g.set(xVar, f29637e.mo24444e(j, f29648p));
                return xVar;
            }
        }
    }

    /* renamed from: c */
    public final C12027x<E> mo24425c(long j) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f29638f;
        while (true) {
            C12027x<E> xVar = (C12027x) atomicReferenceFieldUpdater.get(this);
            if (xVar != null) {
                return xVar;
            }
            C16563a.m75000a(f29638f, this, (Object) null, mo24424b(j));
        }
    }

    /* renamed from: d */
    public final boolean mo24426d() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29639g;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & f29650r) != 0) {
                return true;
            }
            if ((f29648p & j) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j | f29650r));
        return true;
    }

    /* renamed from: e */
    public final C12027x<E> mo24427e(int i, E e) {
        Object obj = this.f29659d.get(this.f29658c & i);
        if (!(obj instanceof C12029b) || ((C12029b) obj).f29660a != i) {
            return null;
        }
        this.f29659d.set(i & this.f29658c, e);
        return this;
    }

    /* renamed from: f */
    public final int mo24428f() {
        long j = f29639g.get(this);
        return (((int) ((j & f29646n) >> 30)) - ((int) ((f29644l & j) >> 0))) & f29642j;
    }

    /* renamed from: g */
    public final boolean mo24429g() {
        if ((f29639g.get(this) & f29650r) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean mo24430h() {
        long j = f29639g.get(this);
        return ((int) ((f29644l & j) >> 0)) == ((int) ((j & f29646n) >> 30));
    }

    /* renamed from: i */
    public final void mo24431i(AtomicLongFieldUpdater atomicLongFieldUpdater, C11300l<? super Long, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* renamed from: j */
    public final void mo24432j(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, C11300l<Object, C11079d2> lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    @C12579k
    /* renamed from: k */
    public final <R> List<R> mo24433k(@C12579k C11300l<? super E, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(this.f29656a);
        long j = f29639g.get(this);
        int i = (int) ((f29644l & j) >> 0);
        int i2 = (int) ((j & f29646n) >> 30);
        while (true) {
            int i3 = this.f29658c;
            if ((i & i3) == (i2 & i3)) {
                return arrayList;
            }
            Object obj = this.f29659d.get(i3 & i);
            if (obj != null && !(obj instanceof C12029b)) {
                arrayList.add(lVar.invoke(obj));
            }
            i++;
        }
    }

    /* renamed from: l */
    public final long mo24434l() {
        long j;
        long j2;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29639g;
        do {
            j = atomicLongFieldUpdater.get(this);
            if ((j & f29648p) != 0) {
                return j;
            }
            j2 = j | f29648p;
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, j2));
        return j2;
    }

    @C12579k
    /* renamed from: m */
    public final C12027x<E> mo24435m() {
        return mo24425c(mo24434l());
    }

    @C12580l
    /* renamed from: n */
    public final Object mo24436n() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29639g;
        while (true) {
            long j = atomicLongFieldUpdater.get(this);
            if ((f29648p & j) != 0) {
                return f29652t;
            }
            int i = (int) ((f29644l & j) >> 0);
            int i2 = this.f29658c;
            if ((((int) ((f29646n & j) >> 30)) & i2) == (i & i2)) {
                return null;
            }
            Object obj = this.f29659d.get(i2 & i);
            if (obj == null) {
                if (this.f29657b) {
                    return null;
                }
            } else if (obj instanceof C12029b) {
                return null;
            } else {
                int i3 = (i + 1) & f29642j;
                if (f29639g.compareAndSet(this, j, f29637e.mo24441b(j, i3))) {
                    this.f29659d.set(this.f29658c & i, (Object) null);
                    return obj;
                } else if (this.f29657b) {
                    C12027x xVar = this;
                    do {
                        xVar = xVar.mo24437o(i, i3);
                    } while (xVar != null);
                    return obj;
                }
            }
        }
    }

    /* renamed from: o */
    public final C12027x<E> mo24437o(int i, int i2) {
        long j;
        int i3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f29639g;
        do {
            j = atomicLongFieldUpdater.get(this);
            i3 = (int) ((f29644l & j) >> 0);
            if ((f29648p & j) != 0) {
                return mo24435m();
            }
        } while (!f29639g.compareAndSet(this, j, f29637e.mo24441b(j, i2)));
        this.f29659d.set(this.f29658c & i3, (Object) null);
        return null;
    }

    /* renamed from: p */
    public final void mo24438p(AtomicLongFieldUpdater atomicLongFieldUpdater, C11300l<? super Long, Long> lVar, Object obj) {
        long j;
        do {
            j = atomicLongFieldUpdater.get(obj);
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j, lVar.invoke(Long.valueOf(j)).longValue()));
    }

    /* renamed from: q */
    public final long mo24439q(AtomicLongFieldUpdater atomicLongFieldUpdater, C11300l<? super Long, Long> lVar, Object obj) {
        long j;
        Number invoke;
        do {
            j = atomicLongFieldUpdater.get(obj);
            invoke = lVar.invoke(Long.valueOf(j));
        } while (!atomicLongFieldUpdater.compareAndSet(obj, j, invoke.longValue()));
        return invoke.longValue();
    }
}
