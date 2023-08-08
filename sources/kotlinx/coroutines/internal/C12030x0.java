package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.collections.C10956m;
import kotlin.jvm.C11394v;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12177y1;
import kotlinx.coroutines.internal.C12032y0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12177y1
@C11363r0({"SMAP\nThreadSafeHeap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,168:1\n28#2,4:169\n28#2,4:174\n28#2,4:179\n28#2,4:184\n28#2,4:189\n28#2,4:194\n28#2,4:199\n28#2,4:204\n20#3:173\n20#3:178\n20#3:183\n20#3:188\n20#3:193\n20#3:198\n20#3:203\n20#3:208\n1#4:209\n*S KotlinDebug\n*F\n+ 1 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n35#1:169,4\n42#1:174,4\n50#1:179,4\n52#1:184,4\n60#1:189,4\n69#1:194,4\n72#1:199,4\n81#1:204,4\n35#1:173\n42#1:178\n50#1:183\n52#1:188\n60#1:193\n69#1:198\n72#1:203\n81#1:208\n*E\n"})
/* renamed from: kotlinx.coroutines.internal.x0 */
public class C12030x0<T extends C12032y0 & Comparable<? super T>> {
    @C12579k

    /* renamed from: b */
    public static final AtomicIntegerFieldUpdater f29661b = AtomicIntegerFieldUpdater.newUpdater(C12030x0.class, "_size");
    @C11394v
    private volatile int _size;
    @C12580l

    /* renamed from: a */
    public T[] f29662a;

    @C11532s0
    /* renamed from: a */
    public final void mo24445a(@C12579k T t) {
        t.mo24463b(this);
        C12032y0[] j = mo24454j();
        int g = mo24451g();
        mo24459o(g + 1);
        j[g] = t;
        t.setIndex(g);
        mo24461q(g);
    }

    /* renamed from: b */
    public final void mo24446b(@C12579k T t) {
        synchronized (this) {
            mo24445a(t);
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: c */
    public final boolean mo24447c(@C12579k T t, @C12579k C11300l<? super T, Boolean> lVar) {
        boolean z;
        synchronized (this) {
            try {
                if (lVar.invoke(mo24450f()).booleanValue()) {
                    mo24445a(t);
                    z = true;
                } else {
                    z = false;
                }
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        return z;
    }

    /* renamed from: d */
    public final void mo24448d() {
        synchronized (this) {
            T[] tArr = this.f29662a;
            if (tArr != null) {
                C10956m.m41313w2(tArr, (Object) null, 0, 0, 6, (Object) null);
            }
            f29661b.set(this, 0);
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    @C12580l
    /* renamed from: e */
    public final T mo24449e(@C12579k C11300l<? super T, Boolean> lVar) {
        T t;
        synchronized (this) {
            int g = mo24451g();
            int i = 0;
            while (true) {
                t = null;
                if (i >= g) {
                    break;
                }
                T[] tArr = this.f29662a;
                if (tArr != null) {
                    t = tArr[i];
                }
                Intrinsics.checkNotNull(t);
                if (lVar.invoke(t).booleanValue()) {
                    break;
                }
                i++;
            }
        }
        return t;
    }

    @C12580l
    @C11532s0
    /* renamed from: f */
    public final T mo24450f() {
        T[] tArr = this.f29662a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: g */
    public final int mo24451g() {
        return f29661b.get(this);
    }

    /* renamed from: h */
    public final boolean mo24452h() {
        return mo24451g() == 0;
    }

    @C12580l
    /* renamed from: i */
    public final T mo24453i() {
        T f;
        synchronized (this) {
            f = mo24450f();
        }
        return f;
    }

    /* renamed from: j */
    public final T[] mo24454j() {
        T[] tArr = this.f29662a;
        if (tArr == null) {
            T[] tArr2 = new C12032y0[4];
            this.f29662a = tArr2;
            return tArr2;
        } else if (mo24451g() < tArr.length) {
            return tArr;
        } else {
            T[] copyOf = Arrays.copyOf(tArr, mo24451g() * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            T[] tArr3 = (C12032y0[]) copyOf;
            this.f29662a = tArr3;
            return tArr3;
        }
    }

    /* renamed from: k */
    public final boolean mo24455k(@C12579k T t) {
        boolean z;
        synchronized (this) {
            if (t.mo24465r() == null) {
                z = false;
            } else {
                mo24456l(t.getIndex());
                z = true;
            }
        }
        return z;
    }

    @C12579k
    @C11532s0
    /* renamed from: l */
    public final T mo24456l(int i) {
        T[] tArr = this.f29662a;
        Intrinsics.checkNotNull(tArr);
        mo24459o(mo24451g() - 1);
        if (i < mo24451g()) {
            mo24462r(i, mo24451g());
            int i2 = (i - 1) / 2;
            if (i > 0) {
                T t = tArr[i];
                Intrinsics.checkNotNull(t);
                T t2 = tArr[i2];
                Intrinsics.checkNotNull(t2);
                if (((Comparable) t).compareTo(t2) < 0) {
                    mo24462r(i, i2);
                    mo24461q(i2);
                }
            }
            mo24460p(i);
        }
        T t3 = tArr[mo24451g()];
        Intrinsics.checkNotNull(t3);
        t3.mo24463b((C12030x0<?>) null);
        t3.setIndex(-1);
        tArr[mo24451g()] = null;
        return t3;
    }

    @C12580l
    /* renamed from: m */
    public final T mo24457m(@C12579k C11300l<? super T, Boolean> lVar) {
        synchronized (this) {
            try {
                C12032y0 f = mo24450f();
                T t = null;
                if (f == null) {
                    C11322b0.m43481d(2);
                    C11322b0.m43480c(2);
                    return null;
                }
                if (lVar.invoke(f).booleanValue()) {
                    t = mo24456l(0);
                }
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                return t;
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
    }

    @C12580l
    /* renamed from: n */
    public final T mo24458n() {
        T t;
        synchronized (this) {
            if (mo24451g() > 0) {
                t = mo24456l(0);
            } else {
                t = null;
            }
        }
        return t;
    }

    /* renamed from: o */
    public final void mo24459o(int i) {
        f29661b.set(this, i);
    }

    /* renamed from: p */
    public final void mo24460p(int i) {
        while (true) {
            int i2 = (i * 2) + 1;
            if (i2 < mo24451g()) {
                T[] tArr = this.f29662a;
                Intrinsics.checkNotNull(tArr);
                int i3 = i2 + 1;
                if (i3 < mo24451g()) {
                    T t = tArr[i3];
                    Intrinsics.checkNotNull(t);
                    T t2 = tArr[i2];
                    Intrinsics.checkNotNull(t2);
                    if (((Comparable) t).compareTo(t2) < 0) {
                        i2 = i3;
                    }
                }
                T t3 = tArr[i];
                Intrinsics.checkNotNull(t3);
                T t4 = tArr[i2];
                Intrinsics.checkNotNull(t4);
                if (((Comparable) t3).compareTo(t4) > 0) {
                    mo24462r(i, i2);
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: q */
    public final void mo24461q(int i) {
        while (i > 0) {
            T[] tArr = this.f29662a;
            Intrinsics.checkNotNull(tArr);
            int i2 = (i - 1) / 2;
            T t = tArr[i2];
            Intrinsics.checkNotNull(t);
            T t2 = tArr[i];
            Intrinsics.checkNotNull(t2);
            if (((Comparable) t).compareTo(t2) > 0) {
                mo24462r(i, i2);
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: r */
    public final void mo24462r(int i, int i2) {
        T[] tArr = this.f29662a;
        Intrinsics.checkNotNull(tArr);
        T t = tArr[i2];
        Intrinsics.checkNotNull(t);
        T t2 = tArr[i];
        Intrinsics.checkNotNull(t2);
        tArr[i] = t;
        tArr[i2] = t2;
        t.setIndex(i);
        t2.setIndex(i2);
    }
}
