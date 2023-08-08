package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8419d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8438a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8454i;
import androidx.compose.runtime.internal.C8567o;
import androidx.compose.runtime.snapshots.C8637b;
import androidx.compose.runtime.snapshots.C8646f;
import androidx.compose.runtime.snapshots.C8650g;
import androidx.compose.runtime.tooling.C8679a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C11076d0;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.C10978t;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.C11069f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11702a0;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C11804f2;
import kotlinx.coroutines.C11965h;
import kotlinx.coroutines.C12072o;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12078p;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11940j;
import kotlinx.coroutines.flow.C11952u;
import kotlinx.coroutines.flow.C11953v;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 8 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,1408:1\n1112#1,5:1450\n1118#1:1460\n1112#1,5:1473\n1118#1:1483\n1112#1,5:1504\n1118#1:1525\n70#2:1409\n70#2:1430\n70#2:1432\n70#2:1433\n70#2:1434\n70#2:1435\n70#2:1445\n70#2:1448\n70#2:1449\n70#2:1461\n70#2:1462\n70#2:1512\n70#2:1526\n70#2:1549\n70#2:1550\n70#2:1551\n70#2:1552\n70#2:1553\n70#2:1554\n70#2:1555\n70#2:1556\n70#2:1557\n1229#3,2:1410\n33#4,6:1412\n33#4,6:1418\n33#4,6:1424\n93#4,2:1463\n33#4,4:1465\n95#4,2:1469\n38#4:1471\n97#4:1472\n120#4,3:1484\n33#4,4:1487\n123#4,2:1491\n125#4,2:1500\n38#4:1502\n127#4:1503\n82#4,3:1513\n33#4,4:1516\n85#4,2:1520\n38#4:1522\n87#4:1523\n82#4,3:1527\n33#4,4:1530\n85#4,2:1534\n38#4:1536\n87#4:1537\n33#4,6:1538\n1#5:1431\n314#6,9:1436\n323#6,2:1446\n122#7,5:1455\n122#7,5:1478\n122#7,3:1509\n126#7:1524\n122#7,5:1544\n361#8,7:1493\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer\n*L\n965#1:1450,5\n965#1:1460\n1039#1:1473,5\n1039#1:1483\n1059#1:1504,5\n1059#1:1525\n324#1:1409\n448#1:1430\n655#1:1432\n691#1:1433\n703#1:1434\n846#1:1435\n855#1:1445\n930#1:1448\n946#1:1449\n978#1:1461\n1009#1:1462\n1062#1:1512\n1075#1:1526\n1142#1:1549\n1186#1:1550\n1194#1:1551\n1203#1:1552\n1210#1:1553\n1217#1:1554\n1226#1:1555\n1234#1:1556\n1015#1:1557\n325#1:1410,2\n415#1:1412,6\n435#1:1418,6\n440#1:1424,6\n1010#1:1463,2\n1010#1:1465,4\n1010#1:1469,2\n1010#1:1471\n1010#1:1472\n1056#1:1484,3\n1056#1:1487,4\n1056#1:1491,2\n1056#1:1500,2\n1056#1:1502\n1056#1:1503\n1063#1:1513,3\n1063#1:1516,4\n1063#1:1520,2\n1063#1:1522\n1063#1:1523\n1079#1:1527,3\n1079#1:1530,4\n1079#1:1534,2\n1079#1:1536\n1079#1:1537\n1086#1:1538,6\n854#1:1436,9\n854#1:1446,2\n965#1:1455,5\n1039#1:1478,5\n1059#1:1509,3\n1059#1:1524\n1116#1:1544,5\n1056#1:1493,7\n*E\n"})
public final class Recomposer extends C8602q {
    @C12579k

    /* renamed from: w */
    public static final C8391a f22709w = new C8391a((DefaultConstructorMarker) null);

    /* renamed from: x */
    public static final int f22710x = 8;
    @C12579k

    /* renamed from: y */
    public static final C11940j<C8454i<C8394d>> f22711y = C11953v.m47628a(C8438a.m30467K());
    @C12579k

    /* renamed from: z */
    public static final AtomicReference<Boolean> f22712z = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: b */
    public long f22713b;
    @C12579k

    /* renamed from: c */
    public final BroadcastFrameClock f22714c;
    @C12579k

    /* renamed from: d */
    public final Object f22715d = new Object();
    @C12580l

    /* renamed from: e */
    public C11723c2 f22716e;
    @C12580l

    /* renamed from: f */
    public Throwable f22717f;
    @C12579k

    /* renamed from: g */
    public final List<C8696y> f22718g = new ArrayList();
    @C12579k

    /* renamed from: h */
    public Set<Object> f22719h = new LinkedHashSet();
    @C12579k

    /* renamed from: i */
    public final List<C8696y> f22720i = new ArrayList();
    @C12579k

    /* renamed from: j */
    public final List<C8696y> f22721j = new ArrayList();
    @C12579k

    /* renamed from: k */
    public final List<C8697y0> f22722k = new ArrayList();
    @C12579k

    /* renamed from: l */
    public final Map<C8691w0<Object>, List<C8697y0>> f22723l = new LinkedHashMap();
    @C12579k

    /* renamed from: m */
    public final Map<C8697y0, C8694x0> f22724m = new LinkedHashMap();
    @C12580l

    /* renamed from: n */
    public List<C8696y> f22725n;
    @C12580l

    /* renamed from: o */
    public C12072o<? super C11079d2> f22726o;

    /* renamed from: p */
    public int f22727p;

    /* renamed from: q */
    public boolean f22728q;
    @C12580l

    /* renamed from: r */
    public C8393c f22729r;
    @C12579k

    /* renamed from: s */
    public final C11940j<State> f22730s = C11953v.m47628a(State.Inactive);
    @C12579k

    /* renamed from: t */
    public final C11702a0 f22731t;
    @C12579k

    /* renamed from: u */
    public final CoroutineContext f22732u;
    @C12579k

    /* renamed from: v */
    public final C8394d f22733v;

    @C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, mo22516d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "runtime_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork
    }

    @C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n1360#2:1409\n1446#2,5:1410\n1855#2,2:1415\n1855#2,2:1429\n1855#2,2:1431\n1603#2,9:1433\n1855#2:1442\n1856#2:1444\n1612#2:1445\n1603#2,9:1446\n1855#2:1455\n1856#2:1457\n1612#2:1458\n33#3,6:1417\n33#3,6:1423\n1#4:1443\n1#4:1456\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$Companion\n*L\n1285#1:1409\n1285#1:1410,5\n1293#1:1415,2\n1302#1:1429,2\n1309#1:1431,2\n1323#1:1433,9\n1323#1:1442\n1323#1:1444\n1323#1:1445\n1328#1:1446,9\n1328#1:1455\n1328#1:1457\n1328#1:1458\n1299#1:1417,6\n1300#1:1423,6\n1323#1:1443\n1328#1:1456\n*E\n"})
    /* renamed from: androidx.compose.runtime.Recomposer$a */
    public static final class C8391a {
        public /* synthetic */ C8391a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: c */
        public final void mo15258c(androidx.compose.runtime.Recomposer.C8394d r4) {
            /*
                r3 = this;
            L_0x0000:
                kotlinx.coroutines.flow.j r0 = androidx.compose.runtime.Recomposer.f22711y
                java.lang.Object r0 = r0.getValue()
                androidx.compose.runtime.external.kotlinx.collections.immutable.i r0 = (androidx.compose.runtime.external.kotlinx.collections.immutable.C8454i) r0
                androidx.compose.runtime.external.kotlinx.collections.immutable.i r1 = r0.add(r4)
                if (r0 == r1) goto L_0x001a
                kotlinx.coroutines.flow.j r2 = androidx.compose.runtime.Recomposer.f22711y
                boolean r0 = r2.mo24216e(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C8391a.mo15258c(androidx.compose.runtime.Recomposer$d):void");
        }

        /* renamed from: d */
        public final void mo15259d() {
            ArrayList arrayList = new ArrayList();
            for (C8394d e : (Iterable) Recomposer.f22711y.getValue()) {
                C8393c e2 = e.mo15276e();
                if (e2 != null) {
                    arrayList.add(e2);
                }
            }
        }

        @C12579k
        /* renamed from: e */
        public final List<C8596o1> mo15260e() {
            ArrayList arrayList = new ArrayList();
            for (C8394d c : (Iterable) Recomposer.f22711y.getValue()) {
                C8596o1 c2 = c.mo15274c();
                if (c2 != null) {
                    arrayList.add(c2);
                }
            }
            return arrayList;
        }

        @C12579k
        /* renamed from: f */
        public final C11952u<Set<C8600p1>> mo15261f() {
            return Recomposer.f22711y;
        }

        /* renamed from: g */
        public final void mo15262g(int i) {
            Recomposer.f22712z.set(Boolean.TRUE);
            for (C8394d dVar : (Iterable) Recomposer.f22711y.getValue()) {
                C8596o1 c = dVar.mo15274c();
                boolean z = false;
                if (c != null && !c.mo15271b()) {
                    z = true;
                }
                if (!z) {
                    dVar.mo15276e();
                    dVar.mo15275d(i);
                    dVar.mo15277f();
                }
            }
        }

        /* renamed from: h */
        public final void mo15263h(@C12579k Object obj) {
            Intrinsics.checkNotNullParameter(obj, "token");
            Recomposer.f22712z.set(Boolean.TRUE);
            for (C8394d e : (Iterable) Recomposer.f22711y.getValue()) {
                e.mo15276e();
            }
            List list = (List) obj;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((C8392b) list.get(i)).mo15269c();
            }
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                ((C8392b) list.get(i2)).mo15268b();
            }
            for (C8394d f : (Iterable) Recomposer.f22711y.getValue()) {
                f.mo15277f();
            }
        }

        /*  JADX ERROR: StackOverflow in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: 
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
            	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
            */
        /* renamed from: i */
        public final void mo15264i(androidx.compose.runtime.Recomposer.C8394d r4) {
            /*
                r3 = this;
            L_0x0000:
                kotlinx.coroutines.flow.j r0 = androidx.compose.runtime.Recomposer.f22711y
                java.lang.Object r0 = r0.getValue()
                androidx.compose.runtime.external.kotlinx.collections.immutable.i r0 = (androidx.compose.runtime.external.kotlinx.collections.immutable.C8454i) r0
                androidx.compose.runtime.external.kotlinx.collections.immutable.i r1 = r0.remove(r4)
                if (r0 == r1) goto L_0x001a
                kotlinx.coroutines.flow.j r2 = androidx.compose.runtime.Recomposer.f22711y
                boolean r0 = r2.mo24216e(r0, r1)
                if (r0 == 0) goto L_0x0000
            L_0x001a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.C8391a.mo15264i(androidx.compose.runtime.Recomposer$d):void");
        }

        @C12579k
        /* renamed from: j */
        public final Object mo15265j() {
            Recomposer.f22712z.set(Boolean.TRUE);
            ArrayList arrayList = new ArrayList();
            for (C8394d g : (Iterable) Recomposer.f22711y.getValue()) {
                C10994x.m42360n0(arrayList, g.mo15278g());
            }
            return arrayList;
        }

        /* renamed from: k */
        public final void mo15266k(boolean z) {
            Recomposer.f22712z.set(Boolean.valueOf(z));
        }

        public C8391a() {
        }
    }

    /* renamed from: androidx.compose.runtime.Recomposer$b */
    public static final class C8392b {
        @C12579k

        /* renamed from: a */
        public final C8613s f22741a;
        @C12579k

        /* renamed from: b */
        public C11304p<? super C8592o, ? super Integer, C11079d2> f22742b;

        public C8392b(@C12579k C8613s sVar) {
            Intrinsics.checkNotNullParameter(sVar, "composition");
            this.f22741a = sVar;
            this.f22742b = sVar.mo16332D();
        }

        /* renamed from: a */
        public final void mo15267a() {
            if (this.f22741a.mo16345Q()) {
                this.f22741a.mo16286j(ComposableSingletons$RecomposerKt.f22565a.mo14885a());
            }
        }

        /* renamed from: b */
        public final void mo15268b() {
            if (this.f22741a.mo16345Q()) {
                this.f22741a.mo16286j(this.f22742b);
            }
        }

        /* renamed from: c */
        public final void mo15269c() {
            this.f22741a.mo16348T(this.f22742b);
        }
    }

    /* renamed from: androidx.compose.runtime.Recomposer$c */
    public static final class C8393c implements C8596o1 {

        /* renamed from: a */
        public final boolean f22743a;
        @C12579k

        /* renamed from: b */
        public final Exception f22744b;

        public C8393c(boolean z, @C12579k Exception exc) {
            Intrinsics.checkNotNullParameter(exc, "cause");
            this.f22743a = z;
            this.f22744b = exc;
        }

        @C12579k
        /* renamed from: a */
        public Exception mo15270a() {
            return this.f22744b;
        }

        /* renamed from: b */
        public boolean mo15271b() {
            return this.f22743a;
        }
    }

    @C11363r0({"SMAP\nRecomposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1408:1\n70#2:1409\n70#2:1410\n70#2:1429\n211#3,3:1411\n33#3,4:1414\n214#3:1418\n215#3:1420\n38#3:1421\n216#3:1422\n33#3,6:1423\n211#3,3:1430\n33#3,4:1433\n214#3:1437\n215#3:1439\n38#3:1440\n216#3:1441\n82#3,3:1442\n33#3,4:1445\n85#3:1449\n86#3:1451\n38#3:1452\n87#3:1453\n1#4:1419\n1#4:1438\n1#4:1450\n*S KotlinDebug\n*F\n+ 1 Recomposer.kt\nandroidx/compose/runtime/Recomposer$RecomposerInfoImpl\n*L\n350#1:1409\n355#1:1410\n363#1:1429\n359#1:1411,3\n359#1:1414,4\n359#1:1418\n359#1:1420\n359#1:1421\n359#1:1422\n360#1:1423,6\n367#1:1430,3\n367#1:1433,4\n367#1:1437\n367#1:1439\n367#1:1440\n367#1:1441\n368#1:1442,3\n368#1:1445,4\n368#1:1449\n368#1:1451\n368#1:1452\n368#1:1453\n359#1:1419\n367#1:1438\n*E\n"})
    /* renamed from: androidx.compose.runtime.Recomposer$d */
    public final class C8394d implements C8600p1 {
        public C8394d() {
        }

        /* renamed from: a */
        public long mo15272a() {
            return Recomposer.this.mo15248o0();
        }

        /* renamed from: b */
        public boolean mo15273b() {
            return Recomposer.this.mo15252s0();
        }

        @C12580l
        /* renamed from: c */
        public final C8596o1 mo15274c() {
            C8393c C;
            Object L = Recomposer.this.f22715d;
            Recomposer recomposer = Recomposer.this;
            synchronized (L) {
                C = recomposer.f22729r;
            }
            return C;
        }

        /* renamed from: d */
        public final void mo15275d(int i) {
            List T5;
            C8613s sVar;
            Object L = Recomposer.this.f22715d;
            Recomposer recomposer = Recomposer.this;
            synchronized (L) {
                T5 = CollectionsKt___CollectionsKt.m40572T5(recomposer.f22718g);
            }
            ArrayList arrayList = new ArrayList(T5.size());
            int size = T5.size();
            for (int i2 = 0; i2 < size; i2++) {
                C8696y yVar = (C8696y) T5.get(i2);
                if (yVar instanceof C8613s) {
                    sVar = (C8613s) yVar;
                } else {
                    sVar = null;
                }
                if (sVar != null) {
                    arrayList.add(sVar);
                }
            }
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((C8613s) arrayList.get(i3)).mo16343O(i);
            }
        }

        @C12580l
        /* renamed from: e */
        public final C8393c mo15276e() {
            return Recomposer.this.mo15233J0();
        }

        /* renamed from: f */
        public final void mo15277f() {
            Recomposer.this.mo15234K0();
        }

        @C12579k
        /* renamed from: g */
        public final List<C8392b> mo15278g() {
            List T5;
            C8613s sVar;
            Object L = Recomposer.this.f22715d;
            Recomposer recomposer = Recomposer.this;
            synchronized (L) {
                T5 = CollectionsKt___CollectionsKt.m40572T5(recomposer.f22718g);
            }
            ArrayList arrayList = new ArrayList(T5.size());
            int size = T5.size();
            for (int i = 0; i < size; i++) {
                C8696y yVar = (C8696y) T5.get(i);
                if (yVar instanceof C8613s) {
                    sVar = (C8613s) yVar;
                } else {
                    sVar = null;
                }
                if (sVar != null) {
                    arrayList.add(sVar);
                }
            }
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C8392b bVar = new C8392b((C8613s) arrayList.get(i2));
                bVar.mo15267a();
                arrayList2.add(bVar);
            }
            return arrayList2;
        }

        @C12579k
        public C11907e<State> getState() {
            return Recomposer.this.mo15249p0();
        }
    }

    public Recomposer(@C12579k CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "effectCoroutineContext");
        BroadcastFrameClock broadcastFrameClock = new BroadcastFrameClock(new Recomposer$broadcastFrameClock$1(this));
        this.f22714c = broadcastFrameClock;
        C11702a0 a = C11804f2.m46953a((C11723c2) coroutineContext.mo7444b(C11723c2.f29067w0));
        a.mo23589D(new Recomposer$effectJob$1$1(this));
        this.f22731t = a;
        this.f22732u = coroutineContext.mo7443Q(broadcastFrameClock).mo7443Q(a);
        this.f22733v = new C8394d();
    }

    /* renamed from: D0 */
    public static /* synthetic */ void m30020D0(Recomposer recomposer, Exception exc, C8696y yVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            yVar = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.mo15227C0(exc, yVar, z);
    }

    @C11395k(message = "Replaced by currentState as a StateFlow", replaceWith = @C11587t0(expression = "currentState", imports = {}))
    /* renamed from: w0 */
    public static /* synthetic */ void m30052w0() {
    }

    /* renamed from: z0 */
    public static final void m30056z0(List<C8697y0> list, Recomposer recomposer, C8696y yVar) {
        list.clear();
        synchronized (recomposer.f22715d) {
            Iterator<C8697y0> it = recomposer.f22722k.iterator();
            while (it.hasNext()) {
                C8697y0 next = it.next();
                if (Intrinsics.areEqual((Object) next.mo16877b(), (Object) yVar)) {
                    list.add(next);
                    it.remove();
                }
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: A0 */
    public final List<C8696y> mo15225A0(List<C8697y0> list, C8419d<Object> dVar) {
        ArrayList arrayList;
        HashMap hashMap = new HashMap(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C8697y0 y0Var = list.get(i);
            C8696y b = y0Var.mo16877b();
            Object obj = hashMap.get(b);
            if (obj == null) {
                obj = new ArrayList();
                hashMap.put(b, obj);
            }
            ((ArrayList) obj).add(y0Var);
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            C8696y yVar = (C8696y) entry.getKey();
            List list2 = (List) entry.getValue();
            ComposerKt.m29833q0(!yVar.mo16368s());
            C8637b m = C8646f.f23196e.mo16632m(mo15228E0(yVar), mo15238O0(yVar, dVar));
            try {
                C8646f p = m.mo16617p();
                try {
                    synchronized (this.f22715d) {
                        arrayList = new ArrayList(list2.size());
                        int size2 = list2.size();
                        for (int i2 = 0; i2 < size2; i2++) {
                            C8697y0 y0Var2 = (C8697y0) list2.get(i2);
                            arrayList.add(C11078d1.m42659a(y0Var2, RecomposerKt.m30144d(this.f22723l, y0Var2.mo16878c())));
                        }
                    }
                    yVar.mo16356d(arrayList);
                    C11079d2 d2Var = C11079d2.f28267a;
                    m.mo16619w(p);
                } catch (Throwable th) {
                    m.mo16619w(p);
                    throw th;
                }
            } finally {
                mo15239f0(m);
            }
        }
        return CollectionsKt___CollectionsKt.m40557Q5(hashMap.keySet());
    }

    /* renamed from: B0 */
    public final C8696y mo15226B0(C8696y yVar, C8419d<Object> dVar) {
        C8646f p;
        if (yVar.mo16368s() || yVar.mo16285h()) {
            return null;
        }
        C8637b m = C8646f.f23196e.mo16632m(mo15228E0(yVar), mo15238O0(yVar, dVar));
        try {
            p = m.mo16617p();
            boolean z = false;
            if (dVar != null) {
                if (dVar.mo15375H()) {
                    z = true;
                }
            }
            if (z) {
                yVar.mo16365p(new Recomposer$performRecompose$1$1(dVar, yVar));
            }
            boolean l = yVar.mo16361l();
            m.mo16619w(p);
            mo15239f0(m);
            if (l) {
                return yVar;
            }
            return null;
        } catch (Throwable th) {
            mo15239f0(m);
            throw th;
        }
    }

    /* renamed from: C0 */
    public final void mo15227C0(Exception exc, C8696y yVar, boolean z) {
        Boolean bool = f22712z.get();
        Intrinsics.checkNotNullExpressionValue(bool, "_hotReloadEnabled.get()");
        if (!bool.booleanValue() || (exc instanceof ComposeRuntimeError)) {
            throw exc;
        }
        synchronized (this.f22715d) {
            ActualAndroid_androidKt.m29483d("Error was captured in composition while live edit was enabled.", exc);
            this.f22721j.clear();
            this.f22720i.clear();
            this.f22719h = new LinkedHashSet();
            this.f22722k.clear();
            this.f22723l.clear();
            this.f22724m.clear();
            this.f22729r = new C8393c(z, exc);
            if (yVar != null) {
                List list = this.f22725n;
                if (list == null) {
                    list = new ArrayList();
                    this.f22725n = list;
                }
                if (!list.contains(yVar)) {
                    list.add(yVar);
                }
                this.f22718g.remove(yVar);
            }
            mo15246m0();
        }
    }

    /* renamed from: E0 */
    public final C11300l<Object, C11079d2> mo15228E0(C8696y yVar) {
        return new Recomposer$readObserverOf$1(yVar);
    }

    /* renamed from: F0 */
    public final Object mo15229F0(C11305q<? super C12074o0, ? super C8686v0, ? super C11045c<? super C11079d2>, ? extends Object> qVar, C11045c<? super C11079d2> cVar) {
        Object h = C11965h.m47673h(this.f22714c, new Recomposer$recompositionRunner$2(this, qVar, MonotonicFrameClockKt.m29914a(cVar.getContext()), (C11045c<? super Recomposer$recompositionRunner$2>) null), cVar);
        if (h == C11063b.m42612h()) {
            return h;
        }
        return C11079d2.f28267a;
    }

    /* renamed from: G0 */
    public final void mo15230G0() {
        Set<Object> set = this.f22719h;
        if (!set.isEmpty()) {
            List<C8696y> list = this.f22718g;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).mo16366q(set);
                if (this.f22730s.getValue().compareTo(State.ShuttingDown) <= 0) {
                    break;
                }
            }
            this.f22719h = new LinkedHashSet();
            if (mo15246m0() != null) {
                throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
            }
        }
    }

    /* renamed from: H0 */
    public final void mo15231H0(C11300l<? super C8696y, C11079d2> lVar) {
        Set K = this.f22719h;
        if (!K.isEmpty()) {
            List G = this.f22718g;
            int size = G.size();
            for (int i = 0; i < size; i++) {
                ((C8696y) G.get(i)).mo16366q(K);
            }
            this.f22719h = new LinkedHashSet();
        }
        List y = this.f22720i;
        int size2 = y.size();
        for (int i2 = 0; i2 < size2; i2++) {
            lVar.invoke(y.get(i2));
        }
        this.f22720i.clear();
        if (mo15246m0() != null) {
            throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
        }
    }

    /* renamed from: I0 */
    public final void mo15232I0(C11723c2 c2Var) {
        synchronized (this.f22715d) {
            Throwable th = this.f22717f;
            if (th != null) {
                throw th;
            } else if (this.f22730s.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down".toString());
            } else if (this.f22716e == null) {
                this.f22716e = c2Var;
                mo15246m0();
            } else {
                throw new IllegalStateException("Recomposer already running".toString());
            }
        }
    }

    /* renamed from: J0 */
    public final C8393c mo15233J0() {
        C8393c cVar;
        synchronized (this.f22715d) {
            cVar = this.f22729r;
            if (cVar != null) {
                this.f22729r = null;
                mo15246m0();
            }
        }
        return cVar;
    }

    /* renamed from: K0 */
    public final void mo15234K0() {
        synchronized (this.f22715d) {
            List<C8696y> list = this.f22725n;
            if (list != null) {
                while (!list.isEmpty()) {
                    C8696y yVar = (C8696y) C10994x.m42351L0(list);
                    if (yVar instanceof C8613s) {
                        yVar.mo16371x();
                        yVar.mo16286j(((C8613s) yVar).mo16332D());
                        if (this.f22729r != null) {
                            break;
                        }
                    }
                }
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0087 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00a4 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* renamed from: L0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo15235L0(androidx.compose.runtime.C8686v0 r8, androidx.compose.runtime.C8542g1 r9, kotlin.coroutines.C11045c<? super kotlin.C11079d2> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof androidx.compose.runtime.Recomposer$runFrameLoop$1
            if (r0 == 0) goto L_0x0013
            r0 = r10
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = (androidx.compose.runtime.Recomposer$runFrameLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            androidx.compose.runtime.Recomposer$runFrameLoop$1 r0 = new androidx.compose.runtime.Recomposer$runFrameLoop$1
            r0.<init>(r7, r10)
        L_0x0018:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x0065
            if (r2 == r4) goto L_0x004d
            if (r2 != r3) goto L_0x0045
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.g1 r2 = (androidx.compose.runtime.C8542g1) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.v0 r5 = (androidx.compose.runtime.C8686v0) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.C11661u0.m45747n(r10)
        L_0x003f:
            r10 = r9
            r9 = r2
            r2 = r8
            r8 = r5
            r5 = r6
            goto L_0x0073
        L_0x0045:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x004d:
            java.lang.Object r8 = r0.L$4
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r9 = r0.L$3
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r2 = r0.L$2
            androidx.compose.runtime.g1 r2 = (androidx.compose.runtime.C8542g1) r2
            java.lang.Object r5 = r0.L$1
            androidx.compose.runtime.v0 r5 = (androidx.compose.runtime.C8686v0) r5
            java.lang.Object r6 = r0.L$0
            androidx.compose.runtime.Recomposer r6 = (androidx.compose.runtime.Recomposer) r6
            kotlin.C11661u0.m45747n(r10)
            goto L_0x008d
        L_0x0065:
            kotlin.C11661u0.m45747n(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5 = r7
        L_0x0073:
            java.lang.Object r6 = r5.f22715d
            r0.L$0 = r5
            r0.L$1 = r8
            r0.L$2 = r9
            r0.L$3 = r10
            r0.L$4 = r2
            r0.label = r4
            java.lang.Object r6 = r9.mo16128c(r6, r0)
            if (r6 != r1) goto L_0x0088
            return r1
        L_0x0088:
            r6 = r5
            r5 = r8
            r8 = r2
            r2 = r9
            r9 = r10
        L_0x008d:
            androidx.compose.runtime.Recomposer$runFrameLoop$2 r10 = new androidx.compose.runtime.Recomposer$runFrameLoop$2
            r10.<init>(r6, r9, r8, r2)
            r0.L$0 = r6
            r0.L$1 = r5
            r0.L$2 = r2
            r0.L$3 = r9
            r0.L$4 = r8
            r0.label = r3
            java.lang.Object r10 = r5.mo14872B(r10, r0)
            if (r10 != r1) goto L_0x003f
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.mo15235L0(androidx.compose.runtime.v0, androidx.compose.runtime.g1, kotlin.coroutines.c):java.lang.Object");
    }

    @C12580l
    /* renamed from: M0 */
    public final Object mo15236M0(@C12579k C11045c<? super C11079d2> cVar) {
        Object F0 = mo15229F0(new Recomposer$runRecomposeAndApplyChanges$2(this, (C11045c<? super Recomposer$runRecomposeAndApplyChanges$2>) null), cVar);
        return F0 == C11063b.m42612h() ? F0 : C11079d2.f28267a;
    }

    @C8541g0
    @C12580l
    /* renamed from: N0 */
    public final Object mo15237N0(@C12579k CoroutineContext coroutineContext, @C12579k C11045c<? super C11079d2> cVar) {
        Object F0 = mo15229F0(new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(coroutineContext, this, (C11045c<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2>) null), cVar);
        return F0 == C11063b.m42612h() ? F0 : C11079d2.f28267a;
    }

    /* renamed from: O0 */
    public final C11300l<Object, C11079d2> mo15238O0(C8696y yVar, C8419d<Object> dVar) {
        return new Recomposer$writeObserverOf$1(yVar, dVar);
    }

    @C8544h(scheme = "[0[0]]")
    /* renamed from: a */
    public void mo15045a(@C12579k C8696y yVar, @C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        C8646f p;
        Intrinsics.checkNotNullParameter(yVar, "composition");
        Intrinsics.checkNotNullParameter(pVar, "content");
        boolean s = yVar.mo16368s();
        try {
            C8646f.C8647a aVar = C8646f.f23196e;
            C8637b m = aVar.mo16632m(mo15228E0(yVar), mo15238O0(yVar, (C8419d<Object>) null));
            try {
                p = m.mo16617p();
                yVar.mo16353a(pVar);
                C11079d2 d2Var = C11079d2.f28267a;
                m.mo16619w(p);
                mo15239f0(m);
                if (!s) {
                    aVar.mo16624d();
                }
                synchronized (this.f22715d) {
                    if (this.f22730s.getValue().compareTo(State.ShuttingDown) > 0 && !this.f22718g.contains(yVar)) {
                        this.f22718g.add(yVar);
                    }
                }
                try {
                    mo15257y0(yVar);
                    try {
                        yVar.mo16367r();
                        yVar.mo16354b();
                        if (!s) {
                            aVar.mo16624d();
                        }
                    } catch (Exception e) {
                        m30020D0(this, e, (C8696y) null, false, 6, (Object) null);
                    }
                } catch (Exception e2) {
                    mo15227C0(e2, yVar, true);
                }
            } catch (Throwable th) {
                mo15239f0(m);
                throw th;
            }
        } catch (Exception e3) {
            mo15227C0(e3, yVar, true);
        }
    }

    /* renamed from: b */
    public void mo15046b(@C12579k C8697y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "reference");
        synchronized (this.f22715d) {
            RecomposerKt.m30143c(this.f22723l, y0Var.mo16878c(), y0Var);
        }
    }

    /* renamed from: d */
    public boolean mo15048d() {
        return false;
    }

    /* renamed from: f */
    public int mo15050f() {
        return 1000;
    }

    /* renamed from: f0 */
    public final void mo15239f0(C8637b bVar) {
        try {
            if (bVar.mo16411J() instanceof C8650g.C8651a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.".toString());
            }
        } finally {
            bVar.mo16415d();
        }
    }

    @C12579k
    /* renamed from: g */
    public CoroutineContext mo15051g() {
        return this.f22732u;
    }

    @C12579k
    /* renamed from: g0 */
    public final C8600p1 mo15240g0() {
        return this.f22733v;
    }

    @C12579k
    /* renamed from: h */
    public CoroutineContext mo15052h() {
        return EmptyCoroutineContext.f28243a;
    }

    @C12580l
    /* renamed from: h0 */
    public final Object mo15241h0(@C12579k C11045c<? super C11079d2> cVar) {
        Object x = C11909g.m47503x(C11909g.m47413V1(mo15249p0(), new Recomposer$awaitIdle$2((C11045c<? super Recomposer$awaitIdle$2>) null)), cVar);
        return x == C11063b.m42612h() ? x : C11079d2.f28267a;
    }

    /* renamed from: i */
    public void mo15053i(@C12579k C8697y0 y0Var) {
        C12072o<C11079d2> m0;
        Intrinsics.checkNotNullParameter(y0Var, "reference");
        synchronized (this.f22715d) {
            this.f22722k.add(y0Var);
            m0 = mo15246m0();
        }
        if (m0 != null) {
            Result.C10852a aVar = Result.f28060a;
            m0.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
    }

    /* renamed from: i0 */
    public final Object mo15242i0(C11045c<? super C11079d2> cVar) {
        C11079d2 d2Var;
        if (mo15253t0()) {
            return C11079d2.f28267a;
        }
        C12078p pVar = new C12078p(IntrinsicsKt__IntrinsicsJvmKt.m42608d(cVar), 1);
        pVar.mo24537e0();
        synchronized (this.f22715d) {
            if (mo15253t0()) {
                Result.C10852a aVar = Result.f28060a;
                pVar.resumeWith(Result.m38702b(C11079d2.f28267a));
            } else {
                this.f22726o = pVar;
            }
            d2Var = C11079d2.f28267a;
        }
        Object y = pVar.mo24572y();
        if (y == C11063b.m42612h()) {
            C11069f.m42638c(cVar);
        }
        if (y == C11063b.m42612h()) {
            return y;
        }
        return d2Var;
    }

    /* renamed from: j */
    public void mo15054j(@C12579k C8696y yVar) {
        C12072o<C11079d2> oVar;
        Intrinsics.checkNotNullParameter(yVar, "composition");
        synchronized (this.f22715d) {
            if (!this.f22720i.contains(yVar)) {
                this.f22720i.add(yVar);
                oVar = mo15246m0();
            } else {
                oVar = null;
            }
        }
        if (oVar != null) {
            Result.C10852a aVar = Result.f28060a;
            oVar.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
    }

    /* renamed from: j0 */
    public final void mo15243j0() {
        synchronized (this.f22715d) {
            if (this.f22730s.getValue().compareTo(State.Idle) >= 0) {
                this.f22730s.setValue(State.ShuttingDown);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
        C11723c2.C11724a.m46184b(this.f22731t, (CancellationException) null, 1, (Object) null);
    }

    /* renamed from: k */
    public void mo15055k(@C12579k RecomposeScopeImpl recomposeScopeImpl) {
        C12072o<C11079d2> m0;
        Intrinsics.checkNotNullParameter(recomposeScopeImpl, "scope");
        synchronized (this.f22715d) {
            this.f22719h.add(recomposeScopeImpl);
            m0 = mo15246m0();
        }
        if (m0 != null) {
            Result.C10852a aVar = Result.f28060a;
            m0.resumeWith(Result.m38702b(C11079d2.f28267a));
        }
    }

    /* renamed from: k0 */
    public final void mo15244k0() {
        if (this.f22731t.mo23697k()) {
            synchronized (this.f22715d) {
                this.f22728q = true;
                C11079d2 d2Var = C11079d2.f28267a;
            }
        }
    }

    /* renamed from: l */
    public void mo15056l(@C12579k C8697y0 y0Var, @C12579k C8694x0 x0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "reference");
        Intrinsics.checkNotNullParameter(x0Var, "data");
        synchronized (this.f22715d) {
            this.f22724m.put(y0Var, x0Var);
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: l0 */
    public final <T> T mo15245l0(C8696y yVar, C8419d<Object> dVar, C11289a<? extends T> aVar) {
        C8646f p;
        C8637b m = C8646f.f23196e.mo16632m(mo15228E0(yVar), mo15238O0(yVar, dVar));
        try {
            p = m.mo16617p();
            T invoke = aVar.invoke();
            C11322b0.m43481d(1);
            m.mo16619w(p);
            C11322b0.m43480c(1);
            C11322b0.m43481d(1);
            mo15239f0(m);
            C11322b0.m43480c(1);
            return invoke;
        } catch (Throwable th) {
            C11322b0.m43481d(1);
            mo15239f0(m);
            C11322b0.m43480c(1);
            throw th;
        }
    }

    @C12580l
    /* renamed from: m */
    public C8694x0 mo15057m(@C12579k C8697y0 y0Var) {
        C8694x0 remove;
        Intrinsics.checkNotNullParameter(y0Var, "reference");
        synchronized (this.f22715d) {
            remove = this.f22724m.remove(y0Var);
        }
        return remove;
    }

    /* renamed from: m0 */
    public final C12072o<C11079d2> mo15246m0() {
        State state;
        if (this.f22730s.getValue().compareTo(State.ShuttingDown) <= 0) {
            this.f22718g.clear();
            this.f22719h = new LinkedHashSet();
            this.f22720i.clear();
            this.f22721j.clear();
            this.f22722k.clear();
            this.f22725n = null;
            C12072o<? super C11079d2> oVar = this.f22726o;
            if (oVar != null) {
                C12072o.C12073a.m48184a(oVar, (Throwable) null, 1, (Object) null);
            }
            this.f22726o = null;
            this.f22729r = null;
            return null;
        }
        if (this.f22729r != null) {
            state = State.Inactive;
        } else if (this.f22716e == null) {
            this.f22719h = new LinkedHashSet();
            this.f22720i.clear();
            if (this.f22714c.mo14874I()) {
                state = State.InactivePendingWork;
            } else {
                state = State.Inactive;
            }
        } else if ((!this.f22720i.isEmpty()) || (!this.f22719h.isEmpty()) || (!this.f22721j.isEmpty()) || (!this.f22722k.isEmpty()) || this.f22727p > 0 || this.f22714c.mo14874I()) {
            state = State.PendingWork;
        } else {
            state = State.Idle;
        }
        this.f22730s.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        C12072o<? super C11079d2> oVar2 = this.f22726o;
        this.f22726o = null;
        return oVar2;
    }

    /* renamed from: n */
    public void mo15058n(@C12579k Set<C8679a> set) {
        Intrinsics.checkNotNullParameter(set, "table");
    }

    /* renamed from: n0 */
    public final void mo15247n0() {
        int i;
        List list;
        synchronized (this.f22715d) {
            if (!this.f22723l.isEmpty()) {
                List a0 = C10978t.m41497a0(this.f22723l.values());
                this.f22723l.clear();
                list = new ArrayList(a0.size());
                int size = a0.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C8697y0 y0Var = (C8697y0) a0.get(i2);
                    list.add(C11078d1.m42659a(y0Var, this.f22724m.get(y0Var)));
                }
                this.f22724m.clear();
            } else {
                list = CollectionsKt__CollectionsKt.m40441E();
            }
        }
        int size2 = list.size();
        for (i = 0; i < size2; i++) {
            Pair pair = (Pair) list.get(i);
            C8697y0 y0Var2 = (C8697y0) pair.mo21846a();
            C8694x0 x0Var = (C8694x0) pair.mo21847b();
            if (x0Var != null) {
                y0Var2.mo16877b().mo16355c(x0Var);
            }
        }
    }

    /* renamed from: o0 */
    public final long mo15248o0() {
        return this.f22713b;
    }

    /* renamed from: p */
    public void mo15060p(@C12579k C8696y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "composition");
    }

    @C12579k
    /* renamed from: p0 */
    public final C11952u<State> mo15249p0() {
        return this.f22730s;
    }

    /* renamed from: q0 */
    public final boolean mo15250q0() {
        return (this.f22721j.isEmpty() ^ true) || this.f22714c.mo14874I();
    }

    /* renamed from: r0 */
    public final boolean mo15251r0() {
        return (this.f22720i.isEmpty() ^ true) || this.f22714c.mo14874I();
    }

    /* renamed from: s */
    public void mo15063s(@C12579k C8696y yVar) {
        Intrinsics.checkNotNullParameter(yVar, "composition");
        synchronized (this.f22715d) {
            this.f22718g.remove(yVar);
            this.f22720i.remove(yVar);
            this.f22721j.remove(yVar);
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: s0 */
    public final boolean mo15252s0() {
        boolean z;
        synchronized (this.f22715d) {
            z = true;
            if (!(!this.f22719h.isEmpty()) && !(!this.f22720i.isEmpty()) && this.f22727p <= 0 && !(!this.f22721j.isEmpty()) && !this.f22714c.mo14874I()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: t0 */
    public final boolean mo15253t0() {
        boolean z;
        synchronized (this.f22715d) {
            z = true;
            if (!(!this.f22719h.isEmpty()) && !(!this.f22720i.isEmpty()) && !this.f22714c.mo14874I()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: u0 */
    public final boolean mo15254u0() {
        boolean z;
        boolean z2;
        synchronized (this.f22715d) {
            z = !this.f22728q;
        }
        if (z) {
            return true;
        }
        Iterator<C11723c2> it = this.f22731t.mo23646r().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo23627d()) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        if (z2) {
            return true;
        }
        return false;
    }

    @C12579k
    /* renamed from: v0 */
    public final C11907e<State> mo15255v0() {
        return mo15249p0();
    }

    @C12580l
    /* renamed from: x0 */
    public final Object mo15256x0(@C12579k C11045c<? super C11079d2> cVar) {
        Object v0 = C11909g.m47498v0(mo15249p0(), new Recomposer$join$2((C11045c<? super Recomposer$join$2>) null), cVar);
        return v0 == C11063b.m42612h() ? v0 : C11079d2.f28267a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        r0 = new java.util.ArrayList();
        m30056z0(r0, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        if ((!r0.isEmpty()) == false) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
        mo15225A0(r0, (androidx.compose.runtime.collection.C8419d<java.lang.Object>) null);
        m30056z0(r0, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        return;
     */
    /* renamed from: y0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo15257y0(androidx.compose.runtime.C8696y r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f22715d
            monitor-enter(r0)
            java.util.List<androidx.compose.runtime.y0> r1 = r7.f22722k     // Catch:{ all -> 0x0042 }
            int r2 = r1.size()     // Catch:{ all -> 0x0042 }
            r3 = 0
            r4 = r3
        L_0x000b:
            r5 = 1
            if (r4 >= r2) goto L_0x0023
            java.lang.Object r6 = r1.get(r4)     // Catch:{ all -> 0x0042 }
            androidx.compose.runtime.y0 r6 = (androidx.compose.runtime.C8697y0) r6     // Catch:{ all -> 0x0042 }
            androidx.compose.runtime.y r6 = r6.mo16877b()     // Catch:{ all -> 0x0042 }
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r8)     // Catch:{ all -> 0x0042 }
            if (r6 == 0) goto L_0x0020
            r3 = r5
            goto L_0x0023
        L_0x0020:
            int r4 = r4 + 1
            goto L_0x000b
        L_0x0023:
            if (r3 != 0) goto L_0x0027
            monitor-exit(r0)
            return
        L_0x0027:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0042 }
            monitor-exit(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            m30056z0(r0, r7, r8)
        L_0x0032:
            boolean r1 = r0.isEmpty()
            r1 = r1 ^ r5
            if (r1 == 0) goto L_0x0041
            r1 = 0
            r7.mo15225A0(r0, r1)
            m30056z0(r0, r7, r8)
            goto L_0x0032
        L_0x0041:
            return
        L_0x0042:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer.mo15257y0(androidx.compose.runtime.y):void");
    }
}
