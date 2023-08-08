package okio;

import androidx.camera.view.C1814q;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.C11384m;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: okio.m0 */
public final class C12504m0 {

    /* renamed from: a */
    public static final int f30475a = 65536;

    /* renamed from: b */
    public static final C12498l0 f30476b = new C12498l0(new byte[0], 0, 0, false, false);

    /* renamed from: c */
    public static final int f30477c;

    /* renamed from: d */
    public static final AtomicReference<C12498l0>[] f30478d;
    @C12579k

    /* renamed from: e */
    public static final C12504m0 f30479e = new C12504m0();

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f30477c = highestOneBit;
        AtomicReference<C12498l0>[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference<>();
        }
        f30478d = atomicReferenceArr;
    }

    @C11384m
    /* renamed from: d */
    public static final void m50967d(@C12579k C12498l0 l0Var) {
        boolean z;
        AtomicReference<C12498l0> a;
        C12498l0 l0Var2;
        int i;
        Intrinsics.checkNotNullParameter(l0Var, "segment");
        if (l0Var.f30462f == null && l0Var.f30463g == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (!l0Var.f30460d && (l0Var2 = a.get()) != f30476b) {
            if (l0Var2 != null) {
                i = l0Var2.f30459c;
            } else {
                i = 0;
            }
            if (i < f30475a) {
                l0Var.f30462f = l0Var2;
                l0Var.f30458b = 0;
                l0Var.f30459c = i + 8192;
                if (!C1814q.m7242a((a = f30479e.mo27407a()), l0Var2, l0Var)) {
                    l0Var.f30462f = null;
                }
            }
        }
    }

    @C12579k
    @C11384m
    /* renamed from: e */
    public static final C12498l0 m50968e() {
        AtomicReference<C12498l0> a = f30479e.mo27407a();
        C12498l0 l0Var = f30476b;
        C12498l0 andSet = a.getAndSet(l0Var);
        if (andSet == l0Var) {
            return new C12498l0();
        }
        if (andSet == null) {
            a.set((Object) null);
            return new C12498l0();
        }
        a.set(andSet.f30462f);
        andSet.f30462f = null;
        andSet.f30459c = 0;
        return andSet;
    }

    /* renamed from: a */
    public final AtomicReference<C12498l0> mo27407a() {
        Thread currentThread = Thread.currentThread();
        Intrinsics.checkNotNullExpressionValue(currentThread, "Thread.currentThread()");
        return f30478d[(int) (currentThread.getId() & (((long) f30477c) - 1))];
    }

    /* renamed from: b */
    public final int mo27408b() {
        C12498l0 l0Var = mo27407a().get();
        if (l0Var != null) {
            return l0Var.f30459c;
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo27409c() {
        return f30475a;
    }
}
