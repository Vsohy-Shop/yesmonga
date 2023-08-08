package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.C8567o;
import androidx.compose.runtime.snapshots.C8650g;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.C10956m;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2191:1\n955#1,2:2192\n961#1,3:2196\n964#1,6:2201\n955#1,2:2227\n961#1,3:2231\n964#1,6:2236\n955#1,9:2252\n964#1,6:2263\n1686#2:2194\n1686#2:2199\n1686#2:2207\n1686#2:2221\n1686#2:2229\n1686#2:2234\n1686#2:2247\n1686#2:2250\n1686#2:2261\n1686#2:2269\n1686#2:2271\n70#3:2195\n70#3:2200\n70#3:2208\n70#3:2222\n70#3:2230\n70#3:2235\n70#3:2248\n70#3:2251\n70#3:2262\n70#3:2270\n70#3:2272\n33#4,6:2209\n33#4,6:2215\n33#4,4:2243\n38#4:2249\n1855#5,2:2223\n1855#5,2:2225\n184#6:2242\n1#7:2273\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n661#1:2192,2\n661#1:2196,3\n661#1:2201,6\n786#1:2227,2\n786#1:2231,3\n786#1:2236,6\n972#1:2252,9\n972#1:2263,6\n662#1:2194\n661#1:2199\n710#1:2207\n761#1:2221\n787#1:2229\n786#1:2234\n939#1:2247\n963#1:2250\n972#1:2261\n975#1:2269\n1000#1:2271\n662#1:2195\n661#1:2200\n710#1:2208\n761#1:2222\n787#1:2230\n786#1:2235\n939#1:2248\n963#1:2251\n972#1:2262\n975#1:2270\n1000#1:2272\n747#1:2209,6\n753#1:2215,6\n936#1:2243,4\n936#1:2249\n764#1:2223,2\n765#1:2225,2\n833#1:2242\n*E\n"})
/* renamed from: androidx.compose.runtime.snapshots.b */
public class C8637b extends C8646f {

    /* renamed from: n */
    public static final int f23164n = 8;
    @C12580l

    /* renamed from: g */
    public final C11300l<Object, C11079d2> f23165g;
    @C12580l

    /* renamed from: h */
    public final C11300l<Object, C11079d2> f23166h;
    @C12580l

    /* renamed from: i */
    public Set<C8635a0> f23167i;
    @C12579k

    /* renamed from: j */
    public SnapshotIdSet f23168j = SnapshotIdSet.f23119e.mo16447a();
    @C12579k

    /* renamed from: k */
    public int[] f23169k = new int[0];

    /* renamed from: l */
    public int f23170l = 1;

    /* renamed from: m */
    public boolean f23171m;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8637b(int i, @C12579k SnapshotIdSet snapshotIdSet, @C12580l C11300l<Object, C11079d2> lVar, @C12580l C11300l<Object, C11079d2> lVar2) {
        super(i, snapshotIdSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(snapshotIdSet, "invalid");
        this.f23165g = lVar;
        this.f23166h = lVar2;
    }

    /* renamed from: Y */
    public static /* synthetic */ C8637b m31606Y(C8637b bVar, C11300l lVar, C11300l lVar2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                lVar = null;
            }
            if ((i & 2) != 0) {
                lVar2 = null;
            }
            return bVar.mo16412X(lVar, lVar2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: takeNestedMutableSnapshot");
    }

    @C12579k
    /* renamed from: A */
    public C8646f mo16410A(@C12580l C11300l<Object, C11079d2> lVar) {
        NestedReadonlySnapshot nestedReadonlySnapshot;
        mo16612F();
        mo16545a0();
        int g = mo16599g();
        mo16535O(mo16599g());
        synchronized (SnapshotKt.m31447E()) {
            int h = SnapshotKt.f23130f;
            SnapshotKt.f23130f = h + 1;
            SnapshotKt.f23129e = SnapshotKt.f23129e.mo16442e0(h);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(h, SnapshotKt.m31502w(mo16600h(), g + 1, h), lVar, this);
        }
        if (!mo16531K() && !mo16615f()) {
            int g2 = mo16599g();
            synchronized (SnapshotKt.m31447E()) {
                int h2 = SnapshotKt.f23130f;
                SnapshotKt.f23130f = h2 + 1;
                mo16601y(h2);
                SnapshotKt.f23129e = SnapshotKt.f23129e.mo16442e0(mo16599g());
                C11079d2 d2Var = C11079d2.f28267a;
            }
            mo16602z(SnapshotKt.m31502w(mo16600h(), g2 + 1, mo16599g()));
        }
        return nestedReadonlySnapshot;
    }

    /* renamed from: G */
    public final void mo16528G() {
        Set<C8635a0> i = mo16428i();
        if (i != null) {
            mo16544Z();
            mo16541U((Set<C8635a0>) null);
            int g = mo16599g();
            for (C8635a0 i2 : i) {
                for (C8638b0 i3 = i2.mo15119i(); i3 != null; i3 = i3.mo16548c()) {
                    if (i3.mo16549d() == g || CollectionsKt___CollectionsKt.m40558R1(this.f23168j, Integer.valueOf(i3.mo16549d()))) {
                        i3.mo16551f(0);
                    }
                }
            }
        }
        mo16613b();
    }

    /* renamed from: H */
    public final <T> T mo16529H(@C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        mo16535O(mo16599g());
        T invoke = aVar.invoke();
        if (!mo16531K() && !mo16615f()) {
            int g = mo16599g();
            synchronized (SnapshotKt.m31447E()) {
                try {
                    int h = SnapshotKt.f23130f;
                    SnapshotKt.f23130f = h + 1;
                    mo16601y(h);
                    SnapshotKt.f23129e = SnapshotKt.f23129e.mo16442e0(mo16599g());
                    C11079d2 d2Var = C11079d2.f28267a;
                    C11322b0.m43481d(1);
                } catch (Throwable th) {
                    C11322b0.m43481d(1);
                    C11322b0.m43480c(1);
                    throw th;
                }
            }
            C11322b0.m43480c(1);
            mo16602z(SnapshotKt.m31502w(mo16600h(), g + 1, mo16599g()));
        }
        return invoke;
    }

    /* renamed from: I */
    public final void mo16530I() {
        mo16535O(mo16599g());
        C11079d2 d2Var = C11079d2.f28267a;
        if (!mo16531K() && !mo16615f()) {
            int g = mo16599g();
            synchronized (SnapshotKt.m31447E()) {
                int h = SnapshotKt.f23130f;
                SnapshotKt.f23130f = h + 1;
                mo16601y(h);
                SnapshotKt.f23129e = SnapshotKt.f23129e.mo16442e0(mo16599g());
            }
            mo16602z(SnapshotKt.m31502w(mo16600h(), g + 1, mo16599g()));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00d5, code lost:
        r2 = (java.util.List) r1.mo21846a();
        r1 = (java.util.Set) r1.mo21847b();
        r9.f23171m = true;
        r3 = r1;
        r5 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e7, code lost:
        if (r3 == null) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ed, code lost:
        if (r3.isEmpty() == false) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f0, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00f2, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f3, code lost:
        if (r3 != false) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00f5, code lost:
        r3 = r2.size();
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00fa, code lost:
        if (r6 >= r3) goto L_0x0108;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fc, code lost:
        ((kotlin.jvm.functions.C11304p) r2.get(r6)).invoke(r1, r9);
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0108, code lost:
        r3 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010b, code lost:
        if (r3 == null) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0111, code lost:
        if (r3.isEmpty() == false) goto L_0x0114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0114, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0115, code lost:
        if (r4 != false) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0117, code lost:
        r3 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011b, code lost:
        if (r5 >= r3) goto L_0x0129;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x011d, code lost:
        ((kotlin.jvm.functions.C11304p) r2.get(r5)).invoke(r0, r9);
        r5 = r5 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0129, code lost:
        r2 = androidx.compose.runtime.snapshots.SnapshotKt.m31447E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        mo16547v();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0131, code lost:
        if (r1 == null) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0133, code lost:
        r1 = r1.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013d, code lost:
        if (r1.hasNext() == false) goto L_0x0149;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x013f, code lost:
        boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.m31461S((androidx.compose.runtime.snapshots.C8635a0) r1.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0149, code lost:
        if (r0 == null) goto L_0x0163;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x014b, code lost:
        r0 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0155, code lost:
        if (r0.hasNext() == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0157, code lost:
        boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.m31461S((androidx.compose.runtime.snapshots.C8635a0) r0.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0161, code lost:
        r0 = kotlin.C11079d2.f28267a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0163, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0166, code lost:
        return androidx.compose.runtime.snapshots.C8650g.C8652b.f23207b;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: J */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public androidx.compose.runtime.snapshots.C8650g mo16411J() {
        /*
            r9 = this;
            java.util.Set r0 = r9.mo16428i()
            r1 = 0
            if (r0 == 0) goto L_0x0031
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.f23134j
            java.lang.Object r2 = r2.get()
            java.lang.String r3 = "currentGlobalSnapshot.get()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            androidx.compose.runtime.snapshots.b r2 = (androidx.compose.runtime.snapshots.C8637b) r2
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = androidx.compose.runtime.snapshots.SnapshotKt.f23129e
            java.util.concurrent.atomic.AtomicReference r4 = androidx.compose.runtime.snapshots.SnapshotKt.f23134j
            java.lang.Object r4 = r4.get()
            androidx.compose.runtime.snapshots.GlobalSnapshot r4 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r4
            int r4 = r4.mo16599g()
            androidx.compose.runtime.snapshots.SnapshotIdSet r3 = r3.mo16437H(r4)
            java.util.Map r2 = androidx.compose.runtime.snapshots.SnapshotKt.m31458P(r2, r9, r3)
            goto L_0x0032
        L_0x0031:
            r2 = r1
        L_0x0032:
            java.lang.Object r3 = androidx.compose.runtime.snapshots.SnapshotKt.m31447E()
            monitor-enter(r3)
            androidx.compose.runtime.snapshots.SnapshotKt.m31482g0(r9)     // Catch:{ all -> 0x016a }
            r4 = 1
            if (r0 == 0) goto L_0x0094
            int r5 = r0.size()     // Catch:{ all -> 0x016a }
            if (r5 != 0) goto L_0x0044
            goto L_0x0094
        L_0x0044:
            java.util.concurrent.atomic.AtomicReference r5 = androidx.compose.runtime.snapshots.SnapshotKt.f23134j     // Catch:{ all -> 0x016a }
            java.lang.Object r5 = r5.get()     // Catch:{ all -> 0x016a }
            androidx.compose.runtime.snapshots.GlobalSnapshot r5 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r5     // Catch:{ all -> 0x016a }
            int r6 = androidx.compose.runtime.snapshots.SnapshotKt.f23130f     // Catch:{ all -> 0x016a }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = androidx.compose.runtime.snapshots.SnapshotKt.f23129e     // Catch:{ all -> 0x016a }
            int r8 = r5.mo16599g()     // Catch:{ all -> 0x016a }
            androidx.compose.runtime.snapshots.SnapshotIdSet r7 = r7.mo16437H(r8)     // Catch:{ all -> 0x016a }
            androidx.compose.runtime.snapshots.g r2 = r9.mo16534N(r6, r2, r7)     // Catch:{ all -> 0x016a }
            androidx.compose.runtime.snapshots.g$b r6 = androidx.compose.runtime.snapshots.C8650g.C8652b.f23207b     // Catch:{ all -> 0x016a }
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r6)     // Catch:{ all -> 0x016a }
            if (r6 != 0) goto L_0x006c
            monitor-exit(r3)
            return r2
        L_0x006c:
            r9.mo16546c()     // Catch:{ all -> 0x016a }
            java.lang.String r2 = "previousGlobalSnapshot"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r2)     // Catch:{ all -> 0x016a }
            kotlin.jvm.functions.l r2 = androidx.compose.runtime.snapshots.SnapshotKt.f23125a     // Catch:{ all -> 0x016a }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.m31470a0(r5, r2)     // Catch:{ all -> 0x016a }
            java.util.Set r2 = r5.mo16428i()     // Catch:{ all -> 0x016a }
            r9.mo16541U(r1)     // Catch:{ all -> 0x016a }
            r5.mo16541U(r1)     // Catch:{ all -> 0x016a }
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f23132h     // Catch:{ all -> 0x016a }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x016a }
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40572T5(r1)     // Catch:{ all -> 0x016a }
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r1, r2)     // Catch:{ all -> 0x016a }
            goto L_0x00d4
        L_0x0094:
            r9.mo16546c()     // Catch:{ all -> 0x016a }
            java.util.concurrent.atomic.AtomicReference r2 = androidx.compose.runtime.snapshots.SnapshotKt.f23134j     // Catch:{ all -> 0x016a }
            java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x016a }
            androidx.compose.runtime.snapshots.GlobalSnapshot r2 = (androidx.compose.runtime.snapshots.GlobalSnapshot) r2     // Catch:{ all -> 0x016a }
            java.lang.String r5 = "previousGlobalSnapshot"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r5)     // Catch:{ all -> 0x016a }
            kotlin.jvm.functions.l r5 = androidx.compose.runtime.snapshots.SnapshotKt.f23125a     // Catch:{ all -> 0x016a }
            java.lang.Object unused = androidx.compose.runtime.snapshots.SnapshotKt.m31470a0(r2, r5)     // Catch:{ all -> 0x016a }
            java.util.Set r2 = r2.mo16428i()     // Catch:{ all -> 0x016a }
            if (r2 == 0) goto L_0x00cc
            r5 = r2
            java.util.Collection r5 = (java.util.Collection) r5     // Catch:{ all -> 0x016a }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x016a }
            r5 = r5 ^ r4
            if (r5 == 0) goto L_0x00cc
            java.util.List r1 = androidx.compose.runtime.snapshots.SnapshotKt.f23132h     // Catch:{ all -> 0x016a }
            java.util.Collection r1 = (java.util.Collection) r1     // Catch:{ all -> 0x016a }
            java.util.List r1 = kotlin.collections.CollectionsKt___CollectionsKt.m40572T5(r1)     // Catch:{ all -> 0x016a }
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r1, r2)     // Catch:{ all -> 0x016a }
            goto L_0x00d4
        L_0x00cc:
            java.util.List r2 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()     // Catch:{ all -> 0x016a }
            kotlin.Pair r1 = kotlin.C11078d1.m42659a(r2, r1)     // Catch:{ all -> 0x016a }
        L_0x00d4:
            monitor-exit(r3)
            java.lang.Object r2 = r1.mo21846a()
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r1 = r1.mo21847b()
            java.util.Set r1 = (java.util.Set) r1
            r9.f23171m = r4
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            r5 = 0
            if (r3 == 0) goto L_0x00f2
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00f0
            goto L_0x00f2
        L_0x00f0:
            r3 = r5
            goto L_0x00f3
        L_0x00f2:
            r3 = r4
        L_0x00f3:
            if (r3 != 0) goto L_0x0108
            int r3 = r2.size()
            r6 = r5
        L_0x00fa:
            if (r6 >= r3) goto L_0x0108
            java.lang.Object r7 = r2.get(r6)
            kotlin.jvm.functions.p r7 = (kotlin.jvm.functions.C11304p) r7
            r7.invoke(r1, r9)
            int r6 = r6 + 1
            goto L_0x00fa
        L_0x0108:
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            if (r3 == 0) goto L_0x0115
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0114
            goto L_0x0115
        L_0x0114:
            r4 = r5
        L_0x0115:
            if (r4 != 0) goto L_0x0129
            int r3 = r2.size()
        L_0x011b:
            if (r5 >= r3) goto L_0x0129
            java.lang.Object r4 = r2.get(r5)
            kotlin.jvm.functions.p r4 = (kotlin.jvm.functions.C11304p) r4
            r4.invoke(r0, r9)
            int r5 = r5 + 1
            goto L_0x011b
        L_0x0129:
            java.lang.Object r2 = androidx.compose.runtime.snapshots.SnapshotKt.m31447E()
            monitor-enter(r2)
            r9.mo16547v()     // Catch:{ all -> 0x0167 }
            if (r1 == 0) goto L_0x0149
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x0167 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0167 }
        L_0x0139:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0167 }
            if (r3 == 0) goto L_0x0149
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0167 }
            androidx.compose.runtime.snapshots.a0 r3 = (androidx.compose.runtime.snapshots.C8635a0) r3     // Catch:{ all -> 0x0167 }
            boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.m31461S(r3)     // Catch:{ all -> 0x0167 }
            goto L_0x0139
        L_0x0149:
            if (r0 == 0) goto L_0x0163
            java.lang.Iterable r0 = (java.lang.Iterable) r0     // Catch:{ all -> 0x0167 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0167 }
        L_0x0151:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0167 }
            if (r1 == 0) goto L_0x0161
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0167 }
            androidx.compose.runtime.snapshots.a0 r1 = (androidx.compose.runtime.snapshots.C8635a0) r1     // Catch:{ all -> 0x0167 }
            boolean unused = androidx.compose.runtime.snapshots.SnapshotKt.m31461S(r1)     // Catch:{ all -> 0x0167 }
            goto L_0x0151
        L_0x0161:
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0167 }
        L_0x0163:
            monitor-exit(r2)
            androidx.compose.runtime.snapshots.g$b r0 = androidx.compose.runtime.snapshots.C8650g.C8652b.f23207b
            return r0
        L_0x0167:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x016a:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.C8637b.mo16411J():androidx.compose.runtime.snapshots.g");
    }

    /* renamed from: K */
    public final boolean mo16531K() {
        return this.f23171m;
    }

    @C12579k
    /* renamed from: L */
    public final SnapshotIdSet mo16532L() {
        return this.f23168j;
    }

    @C12579k
    /* renamed from: M */
    public final int[] mo16533M() {
        return this.f23169k;
    }

    @C12579k
    /* renamed from: N */
    public final C8650g mo16534N(int i, @C12580l Map<C8638b0, ? extends C8638b0> map, @C12579k SnapshotIdSet snapshotIdSet) {
        C8638b0 p;
        C8638b0 b0Var;
        Pair pair;
        Intrinsics.checkNotNullParameter(snapshotIdSet, "invalidSnapshots");
        SnapshotIdSet X = mo16600h().mo16442e0(mo16599g()).mo16441X(this.f23168j);
        Set<C8635a0> i2 = mo16428i();
        Intrinsics.checkNotNull(i2);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        for (C8635a0 next : i2) {
            C8638b0 i3 = next.mo15119i();
            C8638b0 p2 = SnapshotKt.m31463U(i3, i, snapshotIdSet);
            if (!(p2 == null || (p = SnapshotKt.m31463U(i3, mo16599g(), X)) == null || Intrinsics.areEqual((Object) p2, (Object) p))) {
                C8638b0 p3 = SnapshotKt.m31463U(i3, mo16599g(), mo16600h());
                if (p3 != null) {
                    if (map == null || (b0Var = (C8638b0) map.get(p2)) == null) {
                        b0Var = next.mo15300q(p, p2, p3);
                    }
                    if (b0Var == null) {
                        return new C8650g.C8651a(this);
                    }
                    if (!Intrinsics.areEqual((Object) b0Var, (Object) p3)) {
                        if (Intrinsics.areEqual((Object) b0Var, (Object) p2)) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(C11078d1.m42659a(next, p2.mo15125b()));
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(next);
                        } else {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            if (!Intrinsics.areEqual((Object) b0Var, (Object) p)) {
                                pair = C11078d1.m42659a(next, b0Var);
                            } else {
                                pair = C11078d1.m42659a(next, p.mo15125b());
                            }
                            arrayList.add(pair);
                        }
                    }
                } else {
                    Void unused = SnapshotKt.m31462T();
                    throw new KotlinNothingValueException();
                }
            }
        }
        if (arrayList != null) {
            mo16530I();
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                Pair pair2 = (Pair) arrayList.get(i4);
                C8635a0 a0Var = (C8635a0) pair2.mo21846a();
                C8638b0 b0Var2 = (C8638b0) pair2.mo21847b();
                b0Var2.mo16551f(mo16599g());
                synchronized (SnapshotKt.m31447E()) {
                    b0Var2.mo16550e(a0Var.mo15119i());
                    a0Var.mo15116e(b0Var2);
                    C11079d2 d2Var = C11079d2.f28267a;
                }
            }
        }
        if (arrayList2 != null) {
            i2.removeAll(arrayList2);
        }
        return C8650g.C8652b.f23207b;
    }

    /* renamed from: O */
    public final void mo16535O(int i) {
        synchronized (SnapshotKt.m31447E()) {
            this.f23168j = this.f23168j.mo16442e0(i);
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: P */
    public final void mo16536P(@C12579k SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "snapshots");
        synchronized (SnapshotKt.m31447E()) {
            this.f23168j = this.f23168j.mo16441X(snapshotIdSet);
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: Q */
    public final void mo16537Q(int i) {
        if (i >= 0) {
            this.f23169k = C10956m.m41120R3(this.f23169k, i);
        }
    }

    /* renamed from: R */
    public final void mo16538R(@C12579k int[] iArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(iArr, "handles");
        boolean z2 = true;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            int[] iArr2 = this.f23169k;
            if (iArr2.length != 0) {
                z2 = false;
            }
            if (z2) {
                this.f23169k = iArr;
            } else {
                this.f23169k = C10956m.m41132T3(iArr2, iArr);
            }
        }
    }

    /* renamed from: S */
    public final void mo16539S() {
        for (int X : this.f23169k) {
            SnapshotKt.m31466X(X);
        }
    }

    /* renamed from: T */
    public final void mo16540T(boolean z) {
        this.f23171m = z;
    }

    /* renamed from: U */
    public void mo16541U(@C12580l Set<C8635a0> set) {
        this.f23167i = set;
    }

    /* renamed from: V */
    public final void mo16542V(@C12579k SnapshotIdSet snapshotIdSet) {
        Intrinsics.checkNotNullParameter(snapshotIdSet, "<set-?>");
        this.f23168j = snapshotIdSet;
    }

    /* renamed from: W */
    public final void mo16543W(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.f23169k = iArr;
    }

    @C12579k
    /* renamed from: X */
    public C8637b mo16412X(@C12580l C11300l<Object, C11079d2> lVar, @C12580l C11300l<Object, C11079d2> lVar2) {
        C8639c cVar;
        mo16612F();
        mo16545a0();
        mo16535O(mo16599g());
        synchronized (SnapshotKt.m31447E()) {
            int h = SnapshotKt.f23130f;
            SnapshotKt.f23130f = h + 1;
            SnapshotKt.f23129e = SnapshotKt.f23129e.mo16442e0(h);
            SnapshotIdSet h2 = mo16600h();
            mo16602z(h2.mo16442e0(h));
            cVar = new C8639c(h, SnapshotKt.m31502w(h2, mo16599g() + 1, h), SnapshotKt.m31452J(lVar, mo16429j(), false, 4, (Object) null), SnapshotKt.m31453K(lVar2, mo16432m()), this);
        }
        if (!mo16531K() && !mo16615f()) {
            int g = mo16599g();
            synchronized (SnapshotKt.m31447E()) {
                int h3 = SnapshotKt.f23130f;
                SnapshotKt.f23130f = h3 + 1;
                mo16601y(h3);
                SnapshotKt.f23129e = SnapshotKt.f23129e.mo16442e0(mo16599g());
                C11079d2 d2Var = C11079d2.f28267a;
            }
            mo16602z(SnapshotKt.m31502w(mo16600h(), g + 1, mo16599g()));
        }
        return cVar;
    }

    /* renamed from: Z */
    public final void mo16544Z() {
        if (!(!this.f23171m)) {
            throw new IllegalStateException("Unsupported operation on a snapshot that has been applied".toString());
        }
    }

    /* renamed from: a0 */
    public final void mo16545a0() {
        boolean z;
        boolean z2 = true;
        if (this.f23171m) {
            if (this.f23201d >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                z2 = false;
            }
        }
        if (!z2) {
            throw new IllegalStateException("Unsupported operation on a disposed or applied snapshot".toString());
        }
    }

    /* renamed from: c */
    public void mo16546c() {
        SnapshotKt.f23129e = SnapshotKt.f23129e.mo16437H(mo16599g()).mo16446y(this.f23168j);
    }

    /* renamed from: d */
    public void mo16415d() {
        if (!mo16615f()) {
            super.mo16415d();
            mo16417r(this);
        }
    }

    @C12580l
    /* renamed from: i */
    public Set<C8635a0> mo16428i() {
        return this.f23167i;
    }

    @C12580l
    /* renamed from: j */
    public C11300l<Object, C11079d2> mo16429j() {
        return this.f23165g;
    }

    /* renamed from: k */
    public boolean mo16430k() {
        return false;
    }

    @C12579k
    /* renamed from: l */
    public C8646f mo16431l() {
        return this;
    }

    @C12580l
    /* renamed from: m */
    public C11300l<Object, C11079d2> mo16432m() {
        return this.f23166h;
    }

    /* renamed from: n */
    public boolean mo16433n() {
        Set<C8635a0> i = mo16428i();
        return i != null && (i.isEmpty() ^ true);
    }

    /* renamed from: q */
    public void mo16416q(@C12579k C8646f fVar) {
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        this.f23170l++;
    }

    /* renamed from: r */
    public void mo16417r(@C12579k C8646f fVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(fVar, "snapshot");
        int i = this.f23170l;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = i - 1;
            this.f23170l = i2;
            if (i2 == 0 && !this.f23171m) {
                mo16528G();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: s */
    public void mo16418s() {
        if (!this.f23171m && !mo16615f()) {
            mo16530I();
        }
    }

    /* renamed from: t */
    public void mo16434t(@C12579k C8635a0 a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "state");
        Set i = mo16428i();
        if (i == null) {
            i = new HashSet();
            mo16541U(i);
        }
        i.add(a0Var);
    }

    /* renamed from: v */
    public void mo16547v() {
        mo16539S();
        super.mo16547v();
    }
}
