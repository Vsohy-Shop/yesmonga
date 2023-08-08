package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.C8543g2;
import androidx.compose.runtime.snapshots.C8646f;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import com.carrefour.fid.android.shared.constant.C28515a1;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n1686#1:2192\n1686#1:2195\n1686#1:2197\n1686#1:2199\n1686#1:2207\n1686#1:2211\n1686#1:2214\n1686#1:2216\n1686#1:2218\n1686#1:2220\n1686#1:2222\n1686#1:2224\n70#2:2193\n70#2:2194\n70#2:2196\n70#2:2198\n70#2:2200\n70#2:2208\n70#2:2212\n70#2:2215\n70#2:2217\n70#2:2219\n70#2:2221\n70#2:2223\n70#2:2225\n33#3,6:2201\n1855#4,2:2209\n1#5:2213\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n596#1:2192\n1739#1:2195\n1757#1:2197\n1766#1:2199\n1772#1:2207\n1841#1:2211\n1985#1:2214\n1994#1:2216\n2062#1:2218\n2074#1:2220\n2102#1:2222\n2167#1:2224\n596#1:2193\n1686#1:2194\n1739#1:2196\n1757#1:2198\n1766#1:2200\n1772#1:2208\n1841#1:2212\n1985#1:2215\n1994#1:2217\n2062#1:2219\n2074#1:2221\n2102#1:2223\n2167#1:2225\n1767#1:2201,6\n1773#1:2209,2\n*E\n"})
public final class SnapshotKt {
    @C12579k

    /* renamed from: a */
    public static final C11300l<SnapshotIdSet, C11079d2> f23125a = SnapshotKt$emptyLambda$1.f23137f;

    /* renamed from: b */
    public static final int f23126b = 0;
    @C12579k

    /* renamed from: c */
    public static final C8543g2<C8646f> f23127c = new C8543g2<>();
    @C12579k

    /* renamed from: d */
    public static final Object f23128d = new Object();
    @C12579k

    /* renamed from: e */
    public static SnapshotIdSet f23129e;

    /* renamed from: f */
    public static int f23130f;
    @C12579k

    /* renamed from: g */
    public static final C8658k f23131g = new C8658k();
    @C12579k

    /* renamed from: h */
    public static final List<C11304p<Set<? extends Object>, C8646f, C11079d2>> f23132h = new ArrayList();
    @C12579k

    /* renamed from: i */
    public static final List<C11300l<Object, C11079d2>> f23133i = new ArrayList();
    @C12579k

    /* renamed from: j */
    public static final AtomicReference<GlobalSnapshot> f23134j;
    @C12579k

    /* renamed from: k */
    public static final C8646f f23135k;

    static {
        SnapshotIdSet.C8630a aVar = SnapshotIdSet.f23119e;
        f23129e = aVar.mo16447a();
        f23130f = 1;
        int i = f23130f;
        f23130f = i + 1;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(i, aVar.mo16447a());
        f23129e = f23129e.mo16442e0(globalSnapshot.mo16599g());
        AtomicReference<GlobalSnapshot> atomicReference = new AtomicReference<>(globalSnapshot);
        f23134j = atomicReference;
        GlobalSnapshot globalSnapshot2 = atomicReference.get();
        Intrinsics.checkNotNullExpressionValue(globalSnapshot2, "currentGlobalSnapshot.get()");
        f23135k = globalSnapshot2;
    }

    /* renamed from: A */
    public static /* synthetic */ C8646f m31443A(C8646f fVar, C11300l lVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        return m31505z(fVar, lVar, z);
    }

    @C12579k
    @C11532s0
    /* renamed from: B */
    public static final <T extends C8638b0> T m31444B(@C12579k T t) {
        T U;
        Intrinsics.checkNotNullParameter(t, C28515a1.f68703k);
        C8646f.C8647a aVar = C8646f.f23196e;
        C8646f b = aVar.mo16622b();
        T U2 = m31463U(t, b.mo16599g(), b.mo16600h());
        if (U2 != null) {
            return U2;
        }
        synchronized (m31447E()) {
            C8646f b2 = aVar.mo16622b();
            U = m31463U(t, b2.mo16599g(), b2.mo16600h());
        }
        if (U != null) {
            return U;
        }
        m31462T();
        throw new KotlinNothingValueException();
    }

    @C12579k
    @C11532s0
    /* renamed from: C */
    public static final <T extends C8638b0> T m31445C(@C12579k T t, @C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(t, C28515a1.f68703k);
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        T U = m31463U(t, fVar.mo16599g(), fVar.mo16600h());
        if (U != null) {
            return U;
        }
        m31462T();
        throw new KotlinNothingValueException();
    }

    @C12579k
    /* renamed from: D */
    public static final C8646f m31446D() {
        C8646f a = f23127c.mo16131a();
        if (a != null) {
            return a;
        }
        GlobalSnapshot globalSnapshot = f23134j.get();
        Intrinsics.checkNotNullExpressionValue(globalSnapshot, "currentGlobalSnapshot.get()");
        return globalSnapshot;
    }

    @C12579k
    /* renamed from: E */
    public static final Object m31447E() {
        return f23128d;
    }

    @C11532s0
    /* renamed from: F */
    public static /* synthetic */ void m31448F() {
    }

    @C12579k
    /* renamed from: G */
    public static final C8646f m31449G() {
        return f23135k;
    }

    @C11532s0
    /* renamed from: H */
    public static /* synthetic */ void m31450H() {
    }

    /* renamed from: I */
    public static final C11300l<Object, C11079d2> m31451I(C11300l<Object, C11079d2> lVar, C11300l<Object, C11079d2> lVar2, boolean z) {
        if (!z) {
            lVar2 = null;
        }
        if (lVar != null && lVar2 != null && !Intrinsics.areEqual((Object) lVar, (Object) lVar2)) {
            return new SnapshotKt$mergedReadObserver$1(lVar, lVar2);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    /* renamed from: J */
    public static /* synthetic */ C11300l m31452J(C11300l lVar, C11300l lVar2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        return m31451I(lVar, lVar2, z);
    }

    /* renamed from: K */
    public static final C11300l<Object, C11079d2> m31453K(C11300l<Object, C11079d2> lVar, C11300l<Object, C11079d2> lVar2) {
        if (lVar != null && lVar2 != null && !Intrinsics.areEqual((Object) lVar, (Object) lVar2)) {
            return new SnapshotKt$mergedWriteObserver$1(lVar, lVar2);
        }
        if (lVar == null) {
            return lVar2;
        }
        return lVar;
    }

    @C12579k
    /* renamed from: L */
    public static final <T extends C8638b0> T m31454L(@C12579k T t, @C12579k C8635a0 a0Var) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(a0Var, "state");
        T d0 = m31476d0(a0Var);
        if (d0 != null) {
            d0.mo16551f(Integer.MAX_VALUE);
            return d0;
        }
        T b = t.mo15125b();
        b.mo16551f(Integer.MAX_VALUE);
        b.mo16550e(a0Var.mo15119i());
        Intrinsics.checkNotNull(b, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked$lambda$13");
        a0Var.mo15116e(b);
        Intrinsics.checkNotNull(b, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return b;
    }

    @C12579k
    /* renamed from: M */
    public static final <T extends C8638b0> T m31455M(@C12579k T t, @C12579k C8635a0 a0Var, @C12579k C8646f fVar) {
        T N;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(a0Var, "state");
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        synchronized (m31447E()) {
            N = m31456N(t, a0Var, fVar);
        }
        return N;
    }

    /* renamed from: N */
    public static final <T extends C8638b0> T m31456N(T t, C8635a0 a0Var, C8646f fVar) {
        T L = m31454L(t, a0Var);
        L.mo15124a(t);
        L.mo16551f(fVar.mo16599g());
        return L;
    }

    @C11532s0
    /* renamed from: O */
    public static final void m31457O(@C12579k C8646f fVar, @C12579k C8635a0 a0Var) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        Intrinsics.checkNotNullParameter(a0Var, "state");
        C11300l<Object, C11079d2> m = fVar.mo16432m();
        if (m != null) {
            m.invoke(a0Var);
        }
    }

    /* renamed from: P */
    public static final Map<C8638b0, C8638b0> m31458P(C8637b bVar, C8637b bVar2, SnapshotIdSet snapshotIdSet) {
        C8638b0 U;
        Set<C8635a0> i = bVar2.mo16428i();
        int g = bVar.mo16599g();
        if (i == null) {
            return null;
        }
        SnapshotIdSet X = bVar2.mo16600h().mo16442e0(bVar2.mo16599g()).mo16441X(bVar2.mo16532L());
        HashMap hashMap = null;
        for (C8635a0 next : i) {
            C8638b0 i2 = next.mo15119i();
            C8638b0 U2 = m31463U(i2, g, snapshotIdSet);
            if (!(U2 == null || (U = m31463U(i2, g, X)) == null || Intrinsics.areEqual((Object) U2, (Object) U))) {
                C8638b0 U3 = m31463U(i2, bVar2.mo16599g(), bVar2.mo16600h());
                if (U3 != null) {
                    C8638b0 q = next.mo15300q(U, U2, U3);
                    if (q == null) {
                        return null;
                    }
                    if (hashMap == null) {
                        hashMap = new HashMap();
                    }
                    hashMap.put(U2, q);
                    hashMap = hashMap;
                } else {
                    m31462T();
                    throw new KotlinNothingValueException();
                }
            }
        }
        return hashMap;
    }

    /* renamed from: Q */
    public static final <T extends C8638b0, R> R m31459Q(@C12579k T t, @C12579k C8635a0 a0Var, @C12579k T t2, @C12579k C11300l<? super T, ? extends R> lVar) {
        C8646f b;
        R invoke;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(a0Var, "state");
        Intrinsics.checkNotNullParameter(t2, "candidate");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        m31449G();
        synchronized (m31447E()) {
            try {
                b = C8646f.f23196e.mo16622b();
                invoke = lVar.invoke(m31460R(t, a0Var, b, t2));
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        m31457O(b, a0Var);
        return invoke;
    }

    @C12579k
    /* renamed from: R */
    public static final <T extends C8638b0> T m31460R(@C12579k T t, @C12579k C8635a0 a0Var, @C12579k C8646f fVar, @C12579k T t2) {
        T L;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(a0Var, "state");
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        Intrinsics.checkNotNullParameter(t2, "candidate");
        if (fVar.mo16430k()) {
            fVar.mo16434t(a0Var);
        }
        int g = fVar.mo16599g();
        if (t2.mo16549d() == g) {
            return t2;
        }
        synchronized (m31447E()) {
            L = m31454L(t, a0Var);
        }
        L.mo16551f(g);
        fVar.mo16434t(a0Var);
        return L;
    }

    /* renamed from: S */
    public static final boolean m31461S(C8635a0 a0Var) {
        C8638b0 b0Var;
        int f = f23131g.mo16646f(f23130f) - 1;
        C8638b0 b0Var2 = null;
        int i = 0;
        for (C8638b0 i2 = a0Var.mo15119i(); i2 != null; i2 = i2.mo16548c()) {
            int d = i2.mo16549d();
            if (d != 0) {
                if (d > f) {
                    i++;
                } else if (b0Var2 == null) {
                    b0Var2 = i2;
                } else {
                    if (i2.mo16549d() < b0Var2.mo16549d()) {
                        b0Var = b0Var2;
                        b0Var2 = i2;
                    } else {
                        b0Var = i2;
                    }
                    b0Var2.mo16551f(0);
                    b0Var2.mo15124a(b0Var);
                    b0Var2 = b0Var;
                }
            }
        }
        if (i < 1) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public static final Void m31462T() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied".toString());
    }

    /* renamed from: U */
    public static final <T extends C8638b0> T m31463U(T t, int i, SnapshotIdSet snapshotIdSet) {
        T t2 = null;
        while (t != null) {
            if (m31480f0(t, i, snapshotIdSet) && (t2 == null || t2.mo16549d() < t.mo16549d())) {
                t2 = t;
            }
            t = t.mo16548c();
        }
        if (t2 != null) {
            return t2;
        }
        return null;
    }

    @C12579k
    /* renamed from: V */
    public static final <T extends C8638b0> T m31464V(@C12579k T t, @C12579k C8635a0 a0Var) {
        T U;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(a0Var, "state");
        C8646f.C8647a aVar = C8646f.f23196e;
        C8646f b = aVar.mo16622b();
        C11300l<Object, C11079d2> j = b.mo16429j();
        if (j != null) {
            j.invoke(a0Var);
        }
        T U2 = m31463U(t, b.mo16599g(), b.mo16600h());
        if (U2 != null) {
            return U2;
        }
        synchronized (m31447E()) {
            C8646f b2 = aVar.mo16622b();
            C8638b0 i = a0Var.mo15119i();
            Intrinsics.checkNotNull(i, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$7");
            U = m31463U(i, b2.mo16599g(), b2.mo16600h());
            if (U == null) {
                m31462T();
                throw new KotlinNothingValueException();
            }
        }
        return U;
    }

    @C12579k
    /* renamed from: W */
    public static final <T extends C8638b0> T m31465W(@C12579k T t, @C12579k C8635a0 a0Var, @C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(a0Var, "state");
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        C11300l<Object, C11079d2> j = fVar.mo16429j();
        if (j != null) {
            j.invoke(a0Var);
        }
        T U = m31463U(t, fVar.mo16599g(), fVar.mo16600h());
        if (U != null) {
            return U;
        }
        m31462T();
        throw new KotlinNothingValueException();
    }

    /* renamed from: X */
    public static final void m31466X(int i) {
        f23131g.mo16647h(i);
    }

    /* renamed from: Y */
    public static final Void m31467Y() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot".toString());
    }

    @C11532s0
    /* renamed from: Z */
    public static final <T> T m31468Z(@C12579k C11289a<? extends T> aVar) {
        T invoke;
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        synchronized (m31447E()) {
            try {
                invoke = aVar.invoke();
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        return invoke;
    }

    /* renamed from: a0 */
    public static final <T> T m31470a0(C8646f fVar, C11300l<? super SnapshotIdSet, ? extends T> lVar) {
        T invoke = lVar.invoke(f23129e.mo16437H(fVar.mo16599g()));
        synchronized (m31447E()) {
            int i = f23130f;
            f23130f = i + 1;
            f23129e = f23129e.mo16437H(fVar.mo16599g());
            f23134j.set(new GlobalSnapshot(i, f23129e));
            fVar.mo16415d();
            f23129e = f23129e.mo16442e0(i);
            C11079d2 d2Var = C11079d2.f28267a;
        }
        return invoke;
    }

    /* renamed from: b0 */
    public static final <T extends C8646f> T m31472b0(C11300l<? super SnapshotIdSet, ? extends T> lVar) {
        return (C8646f) m31503x(new SnapshotKt$takeNewSnapshot$1(lVar));
    }

    /* renamed from: c0 */
    public static final int m31474c0(int i, @C12579k SnapshotIdSet snapshotIdSet) {
        int a;
        Intrinsics.checkNotNullParameter(snapshotIdSet, "invalid");
        int W = snapshotIdSet.mo16440W(i);
        synchronized (m31447E()) {
            a = f23131g.mo16641a(W);
        }
        return a;
    }

    /* renamed from: d0 */
    public static final C8638b0 m31476d0(C8635a0 a0Var) {
        int f = f23131g.mo16646f(f23130f) - 1;
        SnapshotIdSet a = SnapshotIdSet.f23119e.mo16447a();
        C8638b0 b0Var = null;
        for (C8638b0 i = a0Var.mo15119i(); i != null; i = i.mo16548c()) {
            if (i.mo16549d() == 0) {
                return i;
            }
            if (m31480f0(i, f, a)) {
                if (b0Var == null) {
                    b0Var = i;
                } else if (i.mo16549d() < b0Var.mo16549d()) {
                    return i;
                } else {
                    return b0Var;
                }
            }
        }
        return null;
    }

    /* renamed from: e0 */
    public static final boolean m31478e0(int i, int i2, SnapshotIdSet snapshotIdSet) {
        return i2 != 0 && i2 <= i && !snapshotIdSet.mo16439Q(i2);
    }

    /* renamed from: f0 */
    public static final boolean m31480f0(C8638b0 b0Var, int i, SnapshotIdSet snapshotIdSet) {
        return m31478e0(i, b0Var.mo16549d(), snapshotIdSet);
    }

    /* renamed from: g0 */
    public static final void m31482g0(C8646f fVar) {
        if (!f23129e.mo16439Q(fVar.mo16599g())) {
            throw new IllegalStateException("Snapshot is not open".toString());
        }
    }

    /* renamed from: h0 */
    public static final <T extends C8638b0, R> R m31484h0(@C12579k T t, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        return lVar.invoke(m31444B(t));
    }

    /* renamed from: i0 */
    public static final <T extends C8638b0, R> R m31486i0(@C12579k T t, @C12579k C8635a0 a0Var, @C12579k C8646f fVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        R invoke;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(a0Var, "state");
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        synchronized (m31447E()) {
            try {
                invoke = lVar.invoke(m31490k0(t, a0Var, fVar));
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        m31457O(fVar, a0Var);
        return invoke;
    }

    /* renamed from: j0 */
    public static final <T extends C8638b0, R> R m31488j0(@C12579k T t, @C12579k C8635a0 a0Var, @C12579k C11300l<? super T, ? extends R> lVar) {
        C8646f b;
        R invoke;
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(a0Var, "state");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        m31449G();
        synchronized (m31447E()) {
            try {
                b = C8646f.f23196e.mo16622b();
                invoke = lVar.invoke(m31490k0(t, a0Var, b));
                C11322b0.m43481d(1);
            } catch (Throwable th) {
                C11322b0.m43481d(1);
                C11322b0.m43480c(1);
                throw th;
            }
        }
        C11322b0.m43480c(1);
        m31457O(b, a0Var);
        return invoke;
    }

    @C12579k
    @C11532s0
    /* renamed from: k0 */
    public static final <T extends C8638b0> T m31490k0(@C12579k T t, @C12579k C8635a0 a0Var, @C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(t, "<this>");
        Intrinsics.checkNotNullParameter(a0Var, "state");
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        if (fVar.mo16430k()) {
            fVar.mo16434t(a0Var);
        }
        T U = m31463U(t, fVar.mo16599g(), fVar.mo16600h());
        if (U == null) {
            m31462T();
            throw new KotlinNothingValueException();
        } else if (U.mo16549d() == fVar.mo16599g()) {
            return U;
        } else {
            T M = m31455M(U, a0Var, fVar);
            fVar.mo16434t(a0Var);
            return M;
        }
    }

    @C12579k
    /* renamed from: w */
    public static final SnapshotIdSet m31502w(@C12579k SnapshotIdSet snapshotIdSet, int i, int i2) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<this>");
        while (i < i2) {
            snapshotIdSet = snapshotIdSet.mo16442e0(i);
            i++;
        }
        return snapshotIdSet;
    }

    /* renamed from: x */
    public static final <T> T m31503x(C11300l<? super SnapshotIdSet, ? extends T> lVar) {
        GlobalSnapshot globalSnapshot;
        T a0;
        List T5;
        C8646f fVar = f23135k;
        Intrinsics.checkNotNull(fVar, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.GlobalSnapshot");
        GlobalSnapshot globalSnapshot2 = (GlobalSnapshot) fVar;
        synchronized (m31447E()) {
            globalSnapshot = f23134j.get();
            Intrinsics.checkNotNullExpressionValue(globalSnapshot, "currentGlobalSnapshot.get()");
            a0 = m31470a0(globalSnapshot, lVar);
        }
        Set<C8635a0> i = globalSnapshot.mo16428i();
        if (i != null) {
            synchronized (m31447E()) {
                T5 = CollectionsKt___CollectionsKt.m40572T5(f23132h);
            }
            int size = T5.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C11304p) T5.get(i2)).invoke(i, globalSnapshot);
            }
        }
        synchronized (m31447E()) {
            if (i != null) {
                for (C8635a0 S : i) {
                    m31461S(S);
                }
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
        return a0;
    }

    /* renamed from: y */
    public static final void m31504y() {
        m31503x(SnapshotKt$advanceGlobalSnapshot$3.f23136f);
    }

    /* renamed from: z */
    public static final C8646f m31505z(C8646f fVar, C11300l<Object, C11079d2> lVar, boolean z) {
        C8637b bVar;
        boolean z2 = fVar instanceof C8637b;
        if (!z2 && fVar != null) {
            return new C8645e0(fVar, lVar, false, z);
        }
        if (z2) {
            bVar = (C8637b) fVar;
        } else {
            bVar = null;
        }
        return new C8643d0(bVar, lVar, (C11300l<Object, C11079d2>) null, false, z);
    }
}
