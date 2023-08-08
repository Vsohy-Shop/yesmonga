package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8418c;
import androidx.compose.runtime.collection.C8419d;
import androidx.compose.runtime.collection.C8421e;
import androidx.constraintlayout.widget.C16934c;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.C11079d2;
import kotlin.KotlinNothingValueException;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11322b0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n+ 2 ActualJvm.jvm.kt\nandroidx/compose/runtime/ActualJvm_jvmKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n+ 6 IdentityScopeMap.kt\nandroidx/compose/runtime/collection/IdentityScopeMap\n+ 7 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 8 Composition.kt\nandroidx/compose/runtime/CompositionKt\n+ 9 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 10 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,1257:1\n884#1,2:1271\n1025#1,3:1273\n874#1,6:1277\n1028#1,7:1283\n886#1,4:1290\n884#1,2:1467\n1025#1,3:1469\n874#1,6:1472\n1028#1,7:1478\n886#1,4:1485\n884#1,2:1498\n1025#1,10:1500\n886#1,4:1510\n884#1,2:1586\n1025#1,10:1588\n886#1,4:1598\n884#1,2:1603\n1025#1,10:1605\n886#1,4:1615\n884#1,2:1620\n1025#1,10:1622\n886#1,4:1632\n1025#1,10:1636\n70#2:1258\n70#2:1260\n70#2:1276\n70#2:1294\n70#2:1303\n70#2:1304\n70#2:1456\n70#2:1466\n70#2:1585\n70#2:1602\n70#2:1619\n70#2:1646\n70#2:1649\n70#2:1650\n1#3:1259\n1#3:1661\n93#4,2:1261\n33#4,4:1263\n95#4,2:1267\n38#4:1269\n97#4:1270\n110#4,2:1489\n33#4,6:1491\n112#4:1497\n33#4,6:1529\n33#4,6:1664\n162#5,8:1295\n162#5,8:1514\n162#5,4:1525\n167#5,3:1535\n89#6,3:1305\n93#6:1313\n220#6:1314\n236#6,5:1315\n221#6:1320\n222#6:1337\n241#6,17:1338\n223#6:1355\n220#6:1356\n236#6,5:1357\n221#6:1362\n222#6:1379\n241#6,17:1380\n223#6:1397\n220#6:1398\n236#6,5:1399\n221#6:1404\n222#6:1421\n241#6,17:1422\n223#6:1439\n89#6,3:1447\n93#6:1455\n89#6,3:1457\n93#6:1465\n220#6:1542\n236#6,5:1543\n221#6:1548\n222#6:1565\n241#6,17:1566\n223#6:1583\n89#6,3:1670\n93#6:1678\n105#7,5:1308\n146#7,16:1321\n146#7,16:1363\n146#7,16:1405\n105#7,5:1450\n105#7,5:1460\n146#7,16:1549\n105#7,5:1673\n1251#8,7:1440\n46#9,3:1522\n50#9:1538\n46#9,3:1539\n50#9:1584\n13579#10,2:1647\n11653#10,9:1651\n13579#10:1660\n13580#10:1662\n11662#10:1663\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl\n*L\n583#1:1271,2\n583#1:1273,3\n586#1:1277,6\n583#1:1283,7\n583#1:1290,4\n770#1:1467,2\n770#1:1469,3\n771#1:1472,6\n770#1:1478,7\n770#1:1485,4\n784#1:1498,2\n784#1:1500,10\n784#1:1510,4\n841#1:1586,2\n841#1:1588,10\n841#1:1598,4\n850#1:1603,2\n850#1:1605,10\n850#1:1615,4\n860#1:1620,2\n860#1:1622,10\n860#1:1632,4\n885#1:1636,10\n514#1:1258\n523#1:1260\n584#1:1276\n594#1:1294\n635#1:1303\n656#1:1304\n758#1:1456\n768#1:1466\n840#1:1585\n849#1:1602\n859#1:1619\n899#1:1646\n905#1:1649\n950#1:1650\n1012#1:1661\n530#1:1261,2\n530#1:1263,4\n530#1:1267,2\n530#1:1269\n530#1:1270\n783#1:1489,2\n783#1:1491,6\n783#1:1497\n809#1:1529,6\n1013#1:1664,6\n620#1:1295,8\n792#1:1514,8\n807#1:1525,4\n807#1:1535,3\n701#1:1305,3\n701#1:1313\n708#1:1314\n708#1:1315,5\n708#1:1320\n708#1:1337\n708#1:1338,17\n708#1:1355\n715#1:1356\n715#1:1357,5\n715#1:1362\n715#1:1379\n715#1:1380,17\n715#1:1397\n722#1:1398\n722#1:1399,5\n722#1:1404\n722#1:1421\n722#1:1422,17\n722#1:1439\n750#1:1447,3\n750#1:1455\n763#1:1457,3\n763#1:1465\n827#1:1542\n827#1:1543,5\n827#1:1548\n827#1:1565\n827#1:1566,17\n827#1:1583\n678#1:1670,3\n678#1:1678\n701#1:1308,5\n708#1:1321,16\n715#1:1363,16\n722#1:1405,16\n750#1:1450,5\n763#1:1460,5\n827#1:1549,16\n678#1:1673,5\n723#1:1440,7\n803#1:1522,3\n803#1:1538\n825#1:1539,3\n825#1:1584\n900#1:1647,2\n1012#1:1651,9\n1012#1:1660\n1012#1:1662\n1012#1:1663\n*E\n"})
/* renamed from: androidx.compose.runtime.s */
public final class C8613s implements C8696y {

    /* renamed from: E0 */
    public int f23053E0;
    @C12579k

    /* renamed from: F0 */
    public final ComposerImpl f23054F0;
    @C12580l

    /* renamed from: G0 */
    public final CoroutineContext f23055G0;

    /* renamed from: H0 */
    public final boolean f23056H0;

    /* renamed from: I0 */
    public boolean f23057I0;
    @C12579k

    /* renamed from: J0 */
    public C11304p<? super C8592o, ? super Integer, C11079d2> f23058J0;
    @C12579k

    /* renamed from: X */
    public C8418c<RecomposeScopeImpl, C8419d<Object>> f23059X;

    /* renamed from: Y */
    public boolean f23060Y;
    @C12580l

    /* renamed from: Z */
    public C8613s f23061Z;
    @C12579k

    /* renamed from: a */
    public final C8602q f23062a;
    @C12579k

    /* renamed from: b */
    public final C8428d<?> f23063b;
    @C12579k

    /* renamed from: c */
    public final AtomicReference<Object> f23064c;
    @C12579k

    /* renamed from: d */
    public final Object f23065d;
    @C12579k

    /* renamed from: e */
    public final HashSet<C8616s1> f23066e;
    @C12579k

    /* renamed from: f */
    public final C8692w1 f23067f;
    @C12579k

    /* renamed from: g */
    public final C8421e<RecomposeScopeImpl> f23068g;
    @C12579k

    /* renamed from: v */
    public final HashSet<RecomposeScopeImpl> f23069v;
    @C12579k

    /* renamed from: w */
    public final C8421e<C8404a0<?>> f23070w;
    @C12579k

    /* renamed from: x */
    public final List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> f23071x;
    @C12579k

    /* renamed from: y */
    public final List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> f23072y;
    @C12579k

    /* renamed from: z */
    public final C8421e<RecomposeScopeImpl> f23073z;

    @C11363r0({"SMAP\nComposition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n+ 2 Trace.kt\nandroidx/compose/runtime/TraceKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n*L\n1#1,1257:1\n46#2,5:1258\n46#2,3:1263\n50#2:1272\n46#2,3:1273\n50#2:1282\n46#2,5:1283\n46#2,5:1288\n46#2,5:1293\n33#3,6:1266\n33#3,6:1276\n*S KotlinDebug\n*F\n+ 1 Composition.kt\nandroidx/compose/runtime/CompositionImpl$RememberEventDispatcher\n*L\n1090#1:1258,5\n1102#1:1263,3\n1102#1:1272\n1113#1:1273,3\n1113#1:1282\n1124#1:1283,5\n1138#1:1288,5\n1151#1:1293,5\n1103#1:1266,6\n1114#1:1276,6\n*E\n"})
    /* renamed from: androidx.compose.runtime.s$a */
    public static final class C8614a implements C8608r1 {
        @C12579k

        /* renamed from: a */
        public final Set<C8616s1> f23074a;
        @C12579k

        /* renamed from: b */
        public final List<C8616s1> f23075b = new ArrayList();
        @C12579k

        /* renamed from: c */
        public final List<C8616s1> f23076c = new ArrayList();
        @C12579k

        /* renamed from: d */
        public final List<C11289a<C11079d2>> f23077d = new ArrayList();
        @C12580l

        /* renamed from: e */
        public List<C8584m> f23078e;
        @C12580l

        /* renamed from: f */
        public List<C8584m> f23079f;

        public C8614a(@C12579k Set<C8616s1> set) {
            Intrinsics.checkNotNullParameter(set, "abandoning");
            this.f23074a = set;
        }

        /* renamed from: a */
        public void mo16305a(@C12579k C11289a<C11079d2> aVar) {
            Intrinsics.checkNotNullParameter(aVar, "effect");
            this.f23077d.add(aVar);
        }

        /* renamed from: b */
        public void mo16306b(@C12579k C8616s1 s1Var) {
            Intrinsics.checkNotNullParameter(s1Var, "instance");
            int lastIndexOf = this.f23075b.lastIndexOf(s1Var);
            if (lastIndexOf >= 0) {
                this.f23075b.remove(lastIndexOf);
                this.f23074a.remove(s1Var);
                return;
            }
            this.f23076c.add(s1Var);
        }

        /* renamed from: c */
        public void mo16307c(@C12579k C8584m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "instance");
            List list = this.f23079f;
            if (list == null) {
                list = new ArrayList();
                this.f23079f = list;
            }
            list.add(mVar);
        }

        /* renamed from: d */
        public void mo16308d(@C12579k C8584m mVar) {
            Intrinsics.checkNotNullParameter(mVar, "instance");
            List list = this.f23078e;
            if (list == null) {
                list = new ArrayList();
                this.f23078e = list;
            }
            list.add(mVar);
        }

        /* renamed from: e */
        public void mo16309e(@C12579k C8616s1 s1Var) {
            Intrinsics.checkNotNullParameter(s1Var, "instance");
            int lastIndexOf = this.f23076c.lastIndexOf(s1Var);
            if (lastIndexOf >= 0) {
                this.f23076c.remove(lastIndexOf);
                this.f23074a.remove(s1Var);
                return;
            }
            this.f23075b.add(s1Var);
        }

        /* renamed from: f */
        public final void mo16374f() {
            if (!this.f23074a.isEmpty()) {
                Object a = C8601p2.f23036a.mo16288a("Compose:abandons");
                try {
                    Iterator<C8616s1> it = this.f23074a.iterator();
                    while (it.hasNext()) {
                        it.remove();
                        it.next().mo8799e();
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                } finally {
                    C8601p2.f23036a.mo16289b(a);
                }
            }
        }

        /* JADX INFO: finally extract failed */
        /* renamed from: g */
        public final void mo16375g() {
            boolean z;
            List<C8584m> list = this.f23078e;
            Collection collection = list;
            boolean z2 = false;
            if (collection == null || collection.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                Object a = C8601p2.f23036a.mo16288a("Compose:deactivations");
                try {
                    for (int size = list.size() - 1; -1 < size; size--) {
                        list.get(size).mo16259l();
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                    C8601p2.f23036a.mo16289b(a);
                    list.clear();
                } catch (Throwable th) {
                    C8601p2.f23036a.mo16289b(a);
                    throw th;
                }
            }
            List<C8584m> list2 = this.f23079f;
            Collection collection2 = list2;
            if (collection2 == null || collection2.isEmpty()) {
                z2 = true;
            }
            if (!z2) {
                Object a2 = C8601p2.f23036a.mo16288a("Compose:releases");
                try {
                    for (int size2 = list2.size() - 1; -1 < size2; size2--) {
                        list2.get(size2).mo16258g();
                    }
                    C11079d2 d2Var2 = C11079d2.f28267a;
                    C8601p2.f23036a.mo16289b(a2);
                    list2.clear();
                } catch (Throwable th2) {
                    C8601p2.f23036a.mo16289b(a2);
                    throw th2;
                }
            }
        }

        /* renamed from: h */
        public final void mo16376h() {
            if (!this.f23076c.isEmpty()) {
                Object a = C8601p2.f23036a.mo16288a("Compose:onForgotten");
                try {
                    for (int size = this.f23076c.size() - 1; -1 < size; size--) {
                        C8616s1 s1Var = this.f23076c.get(size);
                        if (!this.f23074a.contains(s1Var)) {
                            s1Var.mo8800g();
                        }
                    }
                    C11079d2 d2Var = C11079d2.f28267a;
                } finally {
                    C8601p2.f23036a.mo16289b(a);
                }
            }
            if (!this.f23075b.isEmpty()) {
                Object a2 = C8601p2.f23036a.mo16288a("Compose:onRemembered");
                try {
                    List<C8616s1> list = this.f23075b;
                    int size2 = list.size();
                    for (int i = 0; i < size2; i++) {
                        C8616s1 s1Var2 = list.get(i);
                        this.f23074a.remove(s1Var2);
                        s1Var2.mo8797d();
                    }
                    C11079d2 d2Var2 = C11079d2.f28267a;
                } finally {
                    C8601p2.f23036a.mo16289b(a2);
                }
            }
        }

        /* renamed from: i */
        public final void mo16377i() {
            if (!this.f23077d.isEmpty()) {
                Object a = C8601p2.f23036a.mo16288a("Compose:sideeffects");
                try {
                    List<C11289a<C11079d2>> list = this.f23077d;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke();
                    }
                    this.f23077d.clear();
                    C11079d2 d2Var = C11079d2.f28267a;
                } finally {
                    C8601p2.f23036a.mo16289b(a);
                }
            }
        }
    }

    public C8613s(@C12579k C8602q qVar, @C12579k C8428d<?> dVar, @C12580l CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(qVar, C16934c.f44493V1);
        Intrinsics.checkNotNullParameter(dVar, "applier");
        this.f23062a = qVar;
        this.f23063b = dVar;
        this.f23064c = new AtomicReference<>((Object) null);
        this.f23065d = new Object();
        HashSet<C8616s1> hashSet = new HashSet<>();
        this.f23066e = hashSet;
        C8692w1 w1Var = new C8692w1();
        this.f23067f = w1Var;
        this.f23068g = new C8421e<>();
        this.f23069v = new HashSet<>();
        this.f23070w = new C8421e<>();
        ArrayList arrayList = new ArrayList();
        this.f23071x = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f23072y = arrayList2;
        this.f23073z = new C8421e<>();
        this.f23059X = new C8418c<>(0, 1, (DefaultConstructorMarker) null);
        ComposerImpl composerImpl = new ComposerImpl(dVar, qVar, w1Var, hashSet, arrayList, arrayList2, this);
        qVar.mo15059o(composerImpl);
        this.f23054F0 = composerImpl;
        this.f23055G0 = coroutineContext;
        this.f23056H0 = qVar instanceof Recomposer;
        this.f23058J0 = ComposableSingletons$CompositionKt.f22560a.mo14881a();
    }

    /* renamed from: v */
    public static final void m31268v(C8613s sVar, boolean z, Ref.ObjectRef<HashSet<RecomposeScopeImpl>> objectRef, Object obj) {
        C8421e<RecomposeScopeImpl> eVar = sVar.f23068g;
        int a = eVar.mo15408f(obj);
        if (a >= 0) {
            C8419d b = eVar.mo15420v(a);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) b.get(i);
                if (!sVar.f23073z.mo15416r(obj, recomposeScopeImpl) && recomposeScopeImpl.mo15217t(obj) != InvalidationResult.IGNORED) {
                    if (!recomposeScopeImpl.mo15218u() || z) {
                        T t = (HashSet) objectRef.element;
                        if (t == null) {
                            t = new HashSet();
                            objectRef.element = t;
                        }
                        t.add(recomposeScopeImpl);
                    } else {
                        sVar.f23069v.add(recomposeScopeImpl);
                    }
                }
            }
        }
    }

    /* renamed from: A */
    public final void mo16329A() {
        Object andSet = this.f23064c.getAndSet(C8676t.f23239a);
        if (andSet == null) {
            return;
        }
        if (Intrinsics.areEqual(andSet, C8676t.f23239a)) {
            ComposerKt.m29774A("pending composition has not been applied");
            throw new KotlinNothingValueException();
        } else if (andSet instanceof Set) {
            mo16359i((Set) andSet, true);
        } else if (andSet instanceof Object[]) {
            for (Set i : (Set[]) andSet) {
                mo16359i(i, true);
            }
        } else {
            ComposerKt.m29774A("corrupt pendingModifications drain: " + this.f23064c);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: B */
    public final void mo16330B() {
        Object andSet = this.f23064c.getAndSet((Object) null);
        if (Intrinsics.areEqual(andSet, C8676t.f23239a)) {
            return;
        }
        if (andSet instanceof Set) {
            mo16359i((Set) andSet, false);
        } else if (andSet instanceof Object[]) {
            for (Set i : (Set[]) andSet) {
                mo16359i(i, false);
            }
        } else if (andSet == null) {
            ComposerKt.m29774A("calling recordModificationsOf and applyChanges concurrently is not supported");
            throw new KotlinNothingValueException();
        } else {
            ComposerKt.m29774A("corrupt pendingModifications drain: " + this.f23064c);
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: C */
    public final boolean mo16331C() {
        return this.f23054F0.mo14974e1();
    }

    @C12579k
    /* renamed from: D */
    public final C11304p<C8592o, Integer, C11079d2> mo16332D() {
        return this.f23058J0;
    }

    @C12579k
    /* renamed from: E */
    public final List<RecomposeScopeImpl> mo16333E() {
        return CollectionsKt___CollectionsKt.m40557Q5(this.f23069v);
    }

    @C12579k
    /* renamed from: F */
    public final List<Object> mo16334F() {
        return ArraysKt___ArraysKt.m40241ub(this.f23070w.mo15415p());
    }

    @C12579k
    /* renamed from: G */
    public final List<Object> mo16335G() {
        return ArraysKt___ArraysKt.m40241ub(this.f23068g.mo15415p());
    }

    /* renamed from: H */
    public final boolean mo16336H() {
        return this.f23060Y;
    }

    @C12579k
    /* renamed from: I */
    public final CoroutineContext mo16337I() {
        CoroutineContext coroutineContext = this.f23055G0;
        return coroutineContext == null ? this.f23062a.mo15052h() : coroutineContext;
    }

    @C12579k
    /* renamed from: J */
    public final C8692w1 mo16338J() {
        return this.f23067f;
    }

    /* renamed from: K */
    public final <T> T mo16339K(C11289a<? extends T> aVar) {
        try {
            T invoke = aVar.invoke();
            C11322b0.m43481d(1);
            C11322b0.m43480c(1);
            return invoke;
        } catch (Exception e) {
            mo16358f();
            throw e;
        } catch (Throwable th) {
            C11322b0.m43481d(1);
            if (!this.f23066e.isEmpty()) {
                new C8614a(this.f23066e).mo16374f();
            }
            C11322b0.m43480c(1);
            throw th;
        }
    }

    /* renamed from: L */
    public final <T> T mo16340L(C11300l<? super C8418c<RecomposeScopeImpl, C8419d<Object>>, ? extends T> lVar) {
        C8418c<RecomposeScopeImpl, C8419d<Object>> V = mo16350V();
        try {
            return lVar.invoke(V);
        } catch (Exception e) {
            this.f23059X = V;
            throw e;
        }
    }

    @C12579k
    /* renamed from: M */
    public final InvalidationResult mo16341M(@C12579k RecomposeScopeImpl recomposeScopeImpl, @C12580l Object obj) {
        Intrinsics.checkNotNullParameter(recomposeScopeImpl, "scope");
        if (recomposeScopeImpl.mo15210m()) {
            recomposeScopeImpl.mo15196C(true);
        }
        C8412c j = recomposeScopeImpl.mo15207j();
        if (j == null || !this.f23067f.mo16838H0(j) || !j.mo15339b()) {
            return InvalidationResult.IGNORED;
        }
        if (!j.mo15339b()) {
            return InvalidationResult.IGNORED;
        }
        if (!recomposeScopeImpl.mo15208k()) {
            return InvalidationResult.IGNORED;
        }
        return mo16342N(recomposeScopeImpl, j, obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0036, code lost:
        if (r1 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003c, code lost:
        return r1.mo16342N(r6, r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003d, code lost:
        r5.f23062a.mo15054j(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0046, code lost:
        if (mo16368s() == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return androidx.compose.runtime.InvalidationResult.f22678b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return androidx.compose.runtime.InvalidationResult.f22679c;
     */
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.compose.runtime.InvalidationResult mo16342N(androidx.compose.runtime.RecomposeScopeImpl r6, androidx.compose.runtime.C8412c r7, java.lang.Object r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f23065d
            monitor-enter(r0)
            androidx.compose.runtime.s r1 = r5.f23061Z     // Catch:{ all -> 0x004e }
            r2 = 0
            if (r1 == 0) goto L_0x0013
            androidx.compose.runtime.w1 r3 = r5.f23067f     // Catch:{ all -> 0x004e }
            int r4 = r5.f23053E0     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo16864v0(r4, r7)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = r2
        L_0x0014:
            if (r1 != 0) goto L_0x0035
            boolean r3 = r5.mo16368s()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0028
            androidx.compose.runtime.ComposerImpl r3 = r5.f23054F0     // Catch:{ all -> 0x004e }
            boolean r3 = r3.mo15019r2(r6, r8)     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0028
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.IMMINENT     // Catch:{ all -> 0x004e }
            monitor-exit(r0)
            return r6
        L_0x0028:
            if (r8 != 0) goto L_0x0030
            androidx.compose.runtime.collection.c<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.d<java.lang.Object>> r3 = r5.f23059X     // Catch:{ all -> 0x004e }
            r3.mo15371o(r6, r2)     // Catch:{ all -> 0x004e }
            goto L_0x0035
        L_0x0030:
            androidx.compose.runtime.collection.c<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.d<java.lang.Object>> r2 = r5.f23059X     // Catch:{ all -> 0x004e }
            androidx.compose.runtime.C8676t.m31871g(r2, r6, r8)     // Catch:{ all -> 0x004e }
        L_0x0035:
            monitor-exit(r0)
            if (r1 == 0) goto L_0x003d
            androidx.compose.runtime.InvalidationResult r6 = r1.mo16342N(r6, r7, r8)
            return r6
        L_0x003d:
            androidx.compose.runtime.q r6 = r5.f23062a
            r6.mo15054j(r5)
            boolean r6 = r5.mo16368s()
            if (r6 == 0) goto L_0x004b
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.DEFERRED
            goto L_0x004d
        L_0x004b:
            androidx.compose.runtime.InvalidationResult r6 = androidx.compose.runtime.InvalidationResult.SCHEDULED
        L_0x004d:
            return r6
        L_0x004e:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C8613s.mo16342N(androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.c, java.lang.Object):androidx.compose.runtime.InvalidationResult");
    }

    /* renamed from: O */
    public final void mo16343O(int i) {
        List<RecomposeScopeImpl> A0;
        boolean z;
        boolean z2;
        synchronized (this.f23065d) {
            A0 = this.f23067f.mo16833A0(i);
        }
        boolean z3 = true;
        if (A0 != null) {
            int size = A0.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    z = false;
                    break;
                }
                if (A0.get(i2).mo15217t((Object) null) == InvalidationResult.IGNORED) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (!z) {
                z3 = false;
            }
        }
        if (z3 && this.f23054F0.mo14970d1()) {
            this.f23062a.mo15054j(this);
        }
    }

    /* renamed from: P */
    public final void mo16344P(Object obj) {
        C8421e<RecomposeScopeImpl> eVar = this.f23068g;
        int a = eVar.mo15408f(obj);
        if (a >= 0) {
            C8419d b = eVar.mo15420v(a);
            int size = b.size();
            for (int i = 0; i < size; i++) {
                RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) b.get(i);
                if (recomposeScopeImpl.mo15217t(obj) == InvalidationResult.IMMINENT) {
                    this.f23073z.mo15405c(obj, recomposeScopeImpl);
                }
            }
        }
    }

    /* renamed from: Q */
    public final boolean mo16345Q() {
        return this.f23056H0;
    }

    /* renamed from: R */
    public final void mo16346R(@C12579k C8404a0<?> a0Var) {
        Intrinsics.checkNotNullParameter(a0Var, "state");
        if (!this.f23068g.mo15407e(a0Var)) {
            this.f23070w.mo15417s(a0Var);
        }
    }

    /* renamed from: S */
    public final void mo16347S(@C12579k Object obj, @C12579k RecomposeScopeImpl recomposeScopeImpl) {
        Intrinsics.checkNotNullParameter(obj, "instance");
        Intrinsics.checkNotNullParameter(recomposeScopeImpl, "scope");
        this.f23068g.mo15416r(obj, recomposeScopeImpl);
    }

    /* renamed from: T */
    public final void mo16348T(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "<set-?>");
        this.f23058J0 = pVar;
    }

    /* renamed from: U */
    public final void mo16349U(boolean z) {
        this.f23060Y = z;
    }

    /* renamed from: V */
    public final C8418c<RecomposeScopeImpl, C8419d<Object>> mo16350V() {
        C8418c<RecomposeScopeImpl, C8419d<Object>> cVar = this.f23059X;
        this.f23059X = new C8418c<>(0, 1, (DefaultConstructorMarker) null);
        return cVar;
    }

    /* renamed from: W */
    public final <T> T mo16351W(C11289a<? extends T> aVar) {
        try {
            T invoke = aVar.invoke();
            C11322b0.m43481d(1);
            C11322b0.m43480c(1);
            return invoke;
        } catch (Throwable th) {
            C11322b0.m43481d(1);
            if (!this.f23066e.isEmpty()) {
                new C8614a(this.f23066e).mo16374f();
            }
            C11322b0.m43480c(1);
            throw th;
        }
    }

    /* renamed from: X */
    public final void mo16352X(C8692w1 w1Var) {
        RecomposeScopeImpl recomposeScopeImpl;
        Object[] s0 = w1Var.mo16861s0();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : s0) {
            if (obj instanceof RecomposeScopeImpl) {
                recomposeScopeImpl = (RecomposeScopeImpl) obj;
            } else {
                recomposeScopeImpl = null;
            }
            if (recomposeScopeImpl != null) {
                arrayList.add(recomposeScopeImpl);
            }
        }
        int size = arrayList.size();
        while (i < size) {
            RecomposeScopeImpl recomposeScopeImpl2 = (RecomposeScopeImpl) arrayList.get(i);
            C8412c j = recomposeScopeImpl2.mo15207j();
            if (j == null || w1Var.mo16844N0(j.mo15341d(w1Var)).contains(recomposeScopeImpl2)) {
                i++;
            } else {
                throw new IllegalStateException(("Misaligned anchor " + j + " in scope " + recomposeScopeImpl2 + " encountered, scope found at " + ArraysKt___ArraysKt.m39905jg(w1Var.mo16861s0(), recomposeScopeImpl2)).toString());
            }
        }
    }

    /* renamed from: a */
    public void mo16353a(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "content");
        try {
            synchronized (this.f23065d) {
                mo16329A();
                C8418c<RecomposeScopeImpl, C8419d<Object>> V = mo16350V();
                try {
                    this.f23054F0.mo14925O0(V, pVar);
                    C11079d2 d2Var = C11079d2.f28267a;
                } catch (Exception e) {
                    this.f23059X = V;
                    throw e;
                }
            }
        } catch (Throwable th) {
            try {
                if (!this.f23066e.isEmpty()) {
                    new C8614a(this.f23066e).mo16374f();
                }
                throw th;
            } catch (Exception e2) {
                mo16358f();
                throw e2;
            }
        }
    }

    /* renamed from: b */
    public void mo16354b() {
        synchronized (this.f23065d) {
            try {
                if (!this.f23072y.isEmpty()) {
                    mo16372y(this.f23072y);
                }
                C11079d2 d2Var = C11079d2.f28267a;
            } catch (Exception e) {
                mo16358f();
                throw e;
            } catch (Throwable th) {
                if (!this.f23066e.isEmpty()) {
                    new C8614a(this.f23066e).mo16374f();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: c */
    public void mo16355c(@C12579k C8694x0 x0Var) {
        Intrinsics.checkNotNullParameter(x0Var, "state");
        C8614a aVar = new C8614a(this.f23066e);
        C8701z1 G0 = x0Var.mo16870a().mo16837G0();
        try {
            ComposerKt.m29827n0(G0, aVar);
            C11079d2 d2Var = C11079d2.f28267a;
            G0.mo16908I();
            aVar.mo16376h();
            aVar.mo16375g();
        } catch (Throwable th) {
            G0.mo16908I();
            throw th;
        }
    }

    /* renamed from: d */
    public void mo16356d(@C12579k List<Pair<C8697y0, C8697y0>> list) {
        Intrinsics.checkNotNullParameter(list, "references");
        int size = list.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Intrinsics.areEqual((Object) ((C8697y0) list.get(i).mo21849e()).mo16877b(), (Object) this)) {
                break;
            } else {
                i++;
            }
        }
        ComposerKt.m29833q0(z);
        try {
            this.f23054F0.mo15014q(list);
            C11079d2 d2Var = C11079d2.f28267a;
        } catch (Exception e) {
            mo16358f();
            throw e;
        } catch (Throwable th) {
            if (!this.f23066e.isEmpty()) {
                new C8614a(this.f23066e).mo16374f();
            }
            throw th;
        }
    }

    /* renamed from: e */
    public <R> R mo16357e(@C12580l C8696y yVar, int i, @C12579k C11289a<? extends R> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        if (yVar == null || Intrinsics.areEqual((Object) yVar, (Object) this) || i < 0) {
            return aVar.invoke();
        }
        this.f23061Z = (C8613s) yVar;
        this.f23053E0 = i;
        try {
            return aVar.invoke();
        } finally {
            this.f23061Z = null;
            this.f23053E0 = 0;
        }
    }

    /* renamed from: f */
    public final void mo16358f() {
        this.f23064c.set((Object) null);
        this.f23071x.clear();
        this.f23072y.clear();
        this.f23066e.clear();
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    public void mo16284g() {
        boolean z;
        synchronized (this.f23065d) {
            if (!this.f23057I0) {
                this.f23057I0 = true;
                this.f23058J0 = ComposableSingletons$CompositionKt.f22560a.mo14882b();
                List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> h1 = this.f23054F0.mo14983h1();
                if (h1 != null) {
                    mo16372y(h1);
                }
                if (this.f23067f.mo16860r0() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z || (true ^ this.f23066e.isEmpty())) {
                    C8614a aVar = new C8614a(this.f23066e);
                    if (z) {
                        C8701z1 G0 = this.f23067f.mo16837G0();
                        try {
                            ComposerKt.m29827n0(G0, aVar);
                            C11079d2 d2Var = C11079d2.f28267a;
                            G0.mo16908I();
                            this.f23063b.clear();
                            aVar.mo16376h();
                            aVar.mo16375g();
                        } catch (Throwable th) {
                            G0.mo16908I();
                            throw th;
                        }
                    }
                    aVar.mo16374f();
                }
                this.f23054F0.mo14939T0();
            }
            C11079d2 d2Var2 = C11079d2.f28267a;
        }
        this.f23062a.mo15063s(this);
    }

    /* renamed from: h */
    public boolean mo16285h() {
        return this.f23057I0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x00a8 A[SYNTHETIC] */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16359i(java.util.Set<? extends java.lang.Object> r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            kotlin.jvm.internal.Ref$ObjectRef r2 = new kotlin.jvm.internal.Ref$ObjectRef
            r2.<init>()
            java.util.Iterator r3 = r17.iterator()
        L_0x000d:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0044
            java.lang.Object r4 = r3.next()
            boolean r7 = r4 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r7 == 0) goto L_0x0022
            androidx.compose.runtime.RecomposeScopeImpl r4 = (androidx.compose.runtime.RecomposeScopeImpl) r4
            r4.mo15217t(r5)
            goto L_0x000d
        L_0x0022:
            m31268v(r0, r1, r2, r4)
            androidx.compose.runtime.collection.e<androidx.compose.runtime.a0<?>> r5 = r0.f23070w
            int r4 = r5.mo15408f(r4)
            if (r4 < 0) goto L_0x000d
            androidx.compose.runtime.collection.d r4 = r5.mo15420v(r4)
            int r5 = r4.size()
            r6 = 0
        L_0x0036:
            if (r6 >= r5) goto L_0x000d
            java.lang.Object r7 = r4.get(r6)
            androidx.compose.runtime.a0 r7 = (androidx.compose.runtime.C8404a0) r7
            m31268v(r0, r1, r2, r7)
            int r6 = r6 + 1
            goto L_0x0036
        L_0x0044:
            java.lang.String r3 = "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet"
            if (r1 == 0) goto L_0x0105
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.f23069v
            boolean r1 = r1.isEmpty()
            r4 = 1
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x0105
            androidx.compose.runtime.collection.e<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.f23068g
            int r7 = r1.mo15413l()
            r8 = 0
            r9 = 0
        L_0x005a:
            if (r8 >= r7) goto L_0x00e1
            int[] r10 = r1.mo15414n()
            r10 = r10[r8]
            androidx.compose.runtime.collection.d[] r11 = r1.mo15412j()
            r11 = r11[r10]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r11)
            int r12 = r11.size()
            r13 = 0
            r14 = 0
        L_0x0071:
            if (r13 >= r12) goto L_0x00ac
            java.lang.Object[] r15 = r11.mo15398w()
            r15 = r15[r13]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15, r3)
            r6 = r15
            androidx.compose.runtime.RecomposeScopeImpl r6 = (androidx.compose.runtime.RecomposeScopeImpl) r6
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r5 = r0.f23069v
            boolean r5 = r5.contains(r6)
            if (r5 != 0) goto L_0x009b
            T r5 = r2.element
            java.util.HashSet r5 = (java.util.HashSet) r5
            if (r5 == 0) goto L_0x0095
            boolean r5 = r5.contains(r6)
            if (r5 != r4) goto L_0x0095
            r5 = r4
            goto L_0x0096
        L_0x0095:
            r5 = 0
        L_0x0096:
            if (r5 == 0) goto L_0x0099
            goto L_0x009b
        L_0x0099:
            r5 = 0
            goto L_0x009c
        L_0x009b:
            r5 = r4
        L_0x009c:
            if (r5 != 0) goto L_0x00a8
            if (r14 == r13) goto L_0x00a6
            java.lang.Object[] r5 = r11.mo15398w()
            r5[r14] = r15
        L_0x00a6:
            int r14 = r14 + 1
        L_0x00a8:
            int r13 = r13 + 1
            r5 = 0
            goto L_0x0071
        L_0x00ac:
            int r5 = r11.size()
            r6 = r14
        L_0x00b1:
            if (r6 >= r5) goto L_0x00bd
            java.lang.Object[] r12 = r11.mo15398w()
            r13 = 0
            r12[r6] = r13
            int r6 = r6 + 1
            goto L_0x00b1
        L_0x00bd:
            r11.mo15377Q(r14)
            int r5 = r11.size()
            if (r5 <= 0) goto L_0x00dc
            if (r9 == r8) goto L_0x00da
            int[] r5 = r1.mo15414n()
            r5 = r5[r9]
            int[] r6 = r1.mo15414n()
            r6[r9] = r10
            int[] r6 = r1.mo15414n()
            r6[r8] = r5
        L_0x00da:
            int r9 = r9 + 1
        L_0x00dc:
            int r8 = r8 + 1
            r5 = 0
            goto L_0x005a
        L_0x00e1:
            int r2 = r1.mo15413l()
            r3 = r9
        L_0x00e6:
            if (r3 >= r2) goto L_0x00f8
            java.lang.Object[] r4 = r1.mo15415p()
            int[] r5 = r1.mo15414n()
            r5 = r5[r3]
            r6 = 0
            r4[r5] = r6
            int r3 = r3 + 1
            goto L_0x00e6
        L_0x00f8:
            r1.mo15422x(r9)
            r16.mo16373z()
            java.util.HashSet<androidx.compose.runtime.RecomposeScopeImpl> r1 = r0.f23069v
            r1.clear()
            goto L_0x019b
        L_0x0105:
            T r1 = r2.element
            java.util.HashSet r1 = (java.util.HashSet) r1
            if (r1 == 0) goto L_0x019b
            androidx.compose.runtime.collection.e<androidx.compose.runtime.RecomposeScopeImpl> r2 = r0.f23068g
            int r4 = r2.mo15413l()
            r5 = 0
            r6 = 0
        L_0x0113:
            if (r5 >= r4) goto L_0x017e
            int[] r7 = r2.mo15414n()
            r7 = r7[r5]
            androidx.compose.runtime.collection.d[] r8 = r2.mo15412j()
            r8 = r8[r7]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            int r9 = r8.size()
            r10 = 0
            r11 = 0
        L_0x012a:
            if (r10 >= r9) goto L_0x014b
            java.lang.Object[] r12 = r8.mo15398w()
            r12 = r12[r10]
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12, r3)
            r13 = r12
            androidx.compose.runtime.RecomposeScopeImpl r13 = (androidx.compose.runtime.RecomposeScopeImpl) r13
            boolean r13 = r1.contains(r13)
            if (r13 != 0) goto L_0x0148
            if (r11 == r10) goto L_0x0146
            java.lang.Object[] r13 = r8.mo15398w()
            r13[r11] = r12
        L_0x0146:
            int r11 = r11 + 1
        L_0x0148:
            int r10 = r10 + 1
            goto L_0x012a
        L_0x014b:
            int r9 = r8.size()
            r10 = r11
        L_0x0150:
            if (r10 >= r9) goto L_0x015c
            java.lang.Object[] r12 = r8.mo15398w()
            r13 = 0
            r12[r10] = r13
            int r10 = r10 + 1
            goto L_0x0150
        L_0x015c:
            r8.mo15377Q(r11)
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x017b
            if (r6 == r5) goto L_0x0179
            int[] r8 = r2.mo15414n()
            r8 = r8[r6]
            int[] r9 = r2.mo15414n()
            r9[r6] = r7
            int[] r7 = r2.mo15414n()
            r7[r5] = r8
        L_0x0179:
            int r6 = r6 + 1
        L_0x017b:
            int r5 = r5 + 1
            goto L_0x0113
        L_0x017e:
            int r1 = r2.mo15413l()
            r3 = r6
        L_0x0183:
            if (r3 >= r1) goto L_0x0195
            java.lang.Object[] r4 = r2.mo15415p()
            int[] r5 = r2.mo15414n()
            r5 = r5[r3]
            r7 = 0
            r4[r5] = r7
            int r3 = r3 + 1
            goto L_0x0183
        L_0x0195:
            r2.mo15422x(r6)
            r16.mo16373z()
        L_0x019b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C8613s.mo16359i(java.util.Set, boolean):void");
    }

    /* renamed from: j */
    public void mo16286j(@C12579k C11304p<? super C8592o, ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "content");
        if (!this.f23057I0) {
            this.f23058J0 = pVar;
            this.f23062a.mo15045a(this, pVar);
            return;
        }
        throw new IllegalStateException("The composition is disposed".toString());
    }

    /* renamed from: k */
    public boolean mo16360k() {
        boolean j1;
        synchronized (this.f23065d) {
            j1 = this.f23054F0.mo14991j1();
        }
        return j1;
    }

    /* renamed from: l */
    public boolean mo16361l() {
        C8418c<RecomposeScopeImpl, C8419d<Object>> V;
        boolean G1;
        synchronized (this.f23065d) {
            mo16329A();
            try {
                V = mo16350V();
                G1 = this.f23054F0.mo14904G1(V);
                if (!G1) {
                    mo16330B();
                }
            } catch (Exception e) {
                this.f23059X = V;
                throw e;
            } catch (Throwable th) {
                try {
                    if (!this.f23066e.isEmpty()) {
                        new C8614a(this.f23066e).mo16374f();
                    }
                    throw th;
                } catch (Exception e2) {
                    mo16358f();
                    throw e2;
                }
            }
        }
        return G1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x000f  */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo16362m(@org.jetbrains.annotations.C12579k java.util.Set<? extends java.lang.Object> r3) {
        /*
            r2 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L_0x0009:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r0 = r3.next()
            androidx.compose.runtime.collection.e<androidx.compose.runtime.RecomposeScopeImpl> r1 = r2.f23068g
            boolean r1 = r1.mo15407e(r0)
            if (r1 != 0) goto L_0x0023
            androidx.compose.runtime.collection.e<androidx.compose.runtime.a0<?>> r1 = r2.f23070w
            boolean r0 = r1.mo15407e(r0)
            if (r0 == 0) goto L_0x0009
        L_0x0023:
            r3 = 1
            return r3
        L_0x0025:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C8613s.mo16362m(java.util.Set):boolean");
    }

    /* renamed from: n */
    public void mo16363n() {
        synchronized (this.f23065d) {
            if (!mo16368s()) {
                this.f23054F0.mo14900E2();
                this.f23067f.mo16845O0();
                mo16352X(this.f23067f);
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: o */
    public void mo16364o(@C12579k Object obj) {
        RecomposeScopeImpl g1;
        Intrinsics.checkNotNullParameter(obj, "value");
        if (!mo16331C() && (g1 = this.f23054F0.mo14982g1()) != null) {
            g1.mo15200G(true);
            this.f23068g.mo15405c(obj, g1);
            if (obj instanceof C8404a0) {
                this.f23070w.mo15417s(obj);
                for (Object obj2 : ((C8404a0) obj).mo15117f()) {
                    if (obj2 == null) {
                        break;
                    }
                    this.f23070w.mo15405c(obj2, obj);
                }
            }
            g1.mo15220w(obj);
        }
    }

    /* renamed from: p */
    public void mo16365p(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        this.f23054F0.mo15041z1(aVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: java.util.Set<? extends java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r2v5, types: [java.util.Set[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo16366q(@org.jetbrains.annotations.C12579k java.util.Set<? extends java.lang.Object> r6) {
        /*
            r5 = this;
            java.lang.String r0 = "values"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
        L_0x0005:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r5.f23064c
            java.lang.Object r0 = r0.get()
            r1 = 1
            if (r0 != 0) goto L_0x0010
            r2 = r1
            goto L_0x0018
        L_0x0010:
            java.lang.Object r2 = androidx.compose.runtime.C8676t.f23239a
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r2)
        L_0x0018:
            if (r2 == 0) goto L_0x001c
            r2 = r6
            goto L_0x003c
        L_0x001c:
            boolean r2 = r0 instanceof java.util.Set
            if (r2 == 0) goto L_0x002c
            r2 = 2
            java.util.Set[] r2 = new java.util.Set[r2]
            r3 = 0
            r4 = r0
            java.util.Set r4 = (java.util.Set) r4
            r2[r3] = r4
            r2[r1] = r6
            goto L_0x003c
        L_0x002c:
            boolean r1 = r0 instanceof java.lang.Object[]
            if (r1 == 0) goto L_0x0054
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0, r1)
            r1 = r0
            java.util.Set[] r1 = (java.util.Set[]) r1
            java.lang.Object[] r2 = kotlin.collections.C10956m.m41156X3(r1, r6)
        L_0x003c:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r5.f23064c
            boolean r1 = androidx.camera.view.C1814q.m7242a(r1, r0, r2)
            if (r1 == 0) goto L_0x0005
            if (r0 != 0) goto L_0x0053
            java.lang.Object r6 = r5.f23065d
            monitor-enter(r6)
            r5.mo16330B()     // Catch:{ all -> 0x0050 }
            kotlin.d2 r0 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0050 }
            monitor-exit(r6)
            goto L_0x0053
        L_0x0050:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L_0x0053:
            return
        L_0x0054:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "corrupt pendingModifications: "
            r0.append(r1)
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r5.f23064c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.C8613s.mo16366q(java.util.Set):void");
    }

    /* renamed from: r */
    public void mo16367r() {
        synchronized (this.f23065d) {
            try {
                mo16372y(this.f23071x);
                mo16330B();
                C11079d2 d2Var = C11079d2.f28267a;
            } catch (Exception e) {
                mo16358f();
                throw e;
            } catch (Throwable th) {
                if (!this.f23066e.isEmpty()) {
                    new C8614a(this.f23066e).mo16374f();
                }
                throw th;
            }
        }
    }

    /* renamed from: s */
    public boolean mo16368s() {
        return this.f23054F0.mo15024t1();
    }

    /* renamed from: t */
    public void mo16369t(@C12579k Object obj) {
        Intrinsics.checkNotNullParameter(obj, "value");
        synchronized (this.f23065d) {
            mo16344P(obj);
            C8421e<C8404a0<?>> eVar = this.f23070w;
            int a = eVar.mo15408f(obj);
            if (a >= 0) {
                C8419d b = eVar.mo15420v(a);
                int size = b.size();
                for (int i = 0; i < size; i++) {
                    mo16344P((C8404a0) b.get(i));
                }
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: u */
    public boolean mo16287u() {
        boolean z;
        synchronized (this.f23065d) {
            if (this.f23059X.mo15364h() > 0) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: w */
    public void mo16370w() {
        synchronized (this.f23065d) {
            try {
                this.f23054F0.mo14916L0();
                if (!this.f23066e.isEmpty()) {
                    new C8614a(this.f23066e).mo16374f();
                }
                C11079d2 d2Var = C11079d2.f28267a;
            } catch (Exception e) {
                mo16358f();
                throw e;
            } catch (Throwable th) {
                if (!this.f23066e.isEmpty()) {
                    new C8614a(this.f23066e).mo16374f();
                }
                throw th;
            }
        }
    }

    /* renamed from: x */
    public void mo16371x() {
        RecomposeScopeImpl recomposeScopeImpl;
        synchronized (this.f23065d) {
            for (Object obj : this.f23067f.mo16861s0()) {
                if (obj instanceof RecomposeScopeImpl) {
                    recomposeScopeImpl = (RecomposeScopeImpl) obj;
                } else {
                    recomposeScopeImpl = null;
                }
                if (recomposeScopeImpl != null) {
                    recomposeScopeImpl.invalidate();
                }
            }
            C11079d2 d2Var = C11079d2.f28267a;
        }
    }

    /* renamed from: y */
    public final void mo16372y(List<C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2>> list) {
        C8701z1 G0;
        Object a;
        C8614a aVar = new C8614a(this.f23066e);
        try {
            if (!list.isEmpty()) {
                Object a2 = C8601p2.f23036a.mo16288a("Compose:applyChanges");
                try {
                    this.f23063b.mo15560j();
                    G0 = this.f23067f.mo16837G0();
                    C8428d<?> dVar = this.f23063b;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        list.get(i).invoke(dVar, G0, aVar);
                    }
                    list.clear();
                    C11079d2 d2Var = C11079d2.f28267a;
                    G0.mo16908I();
                    this.f23063b.mo15558f();
                    C8601p2 p2Var = C8601p2.f23036a;
                    p2Var.mo16289b(a2);
                    aVar.mo16376h();
                    aVar.mo16375g();
                    aVar.mo16377i();
                    if (this.f23060Y) {
                        a = p2Var.mo16288a("Compose:unobserve");
                        this.f23060Y = false;
                        C8421e<RecomposeScopeImpl> eVar = this.f23068g;
                        int l = eVar.mo15413l();
                        int i2 = 0;
                        for (int i3 = 0; i3 < l; i3++) {
                            int i4 = eVar.mo15414n()[i3];
                            C8419d dVar2 = eVar.mo15412j()[i4];
                            Intrinsics.checkNotNull(dVar2);
                            int size2 = dVar2.size();
                            int i5 = 0;
                            for (int i6 = 0; i6 < size2; i6++) {
                                Object obj = dVar2.mo15398w()[i6];
                                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                                if (!(!((RecomposeScopeImpl) obj).mo15216s())) {
                                    if (i5 != i6) {
                                        dVar2.mo15398w()[i5] = obj;
                                    }
                                    i5++;
                                }
                            }
                            int size3 = dVar2.size();
                            for (int i7 = i5; i7 < size3; i7++) {
                                dVar2.mo15398w()[i7] = null;
                            }
                            dVar2.mo15377Q(i5);
                            if (dVar2.size() > 0) {
                                if (i2 != i3) {
                                    int i8 = eVar.mo15414n()[i2];
                                    eVar.mo15414n()[i2] = i4;
                                    eVar.mo15414n()[i3] = i8;
                                }
                                i2++;
                            }
                        }
                        int l2 = eVar.mo15413l();
                        for (int i9 = i2; i9 < l2; i9++) {
                            eVar.mo15415p()[eVar.mo15414n()[i9]] = null;
                        }
                        eVar.mo15422x(i2);
                        mo16373z();
                        C11079d2 d2Var2 = C11079d2.f28267a;
                        C8601p2.f23036a.mo16289b(a);
                    }
                    if (this.f23072y.isEmpty()) {
                        aVar.mo16374f();
                    }
                } catch (Throwable th) {
                    C8601p2.f23036a.mo16289b(a2);
                    throw th;
                }
            } else if (this.f23072y.isEmpty()) {
                aVar.mo16374f();
            }
        } catch (Throwable th2) {
            if (this.f23072y.isEmpty()) {
                aVar.mo16374f();
            }
            throw th2;
        }
    }

    /* renamed from: z */
    public final void mo16373z() {
        C8421e<C8404a0<?>> eVar = this.f23070w;
        int l = eVar.mo15413l();
        int i = 0;
        for (int i2 = 0; i2 < l; i2++) {
            int i3 = eVar.mo15414n()[i2];
            C8419d dVar = eVar.mo15412j()[i3];
            Intrinsics.checkNotNull(dVar);
            int size = dVar.size();
            int i4 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                Object obj = dVar.mo15398w()[i5];
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
                if (!(!this.f23068g.mo15407e((C8404a0) obj))) {
                    if (i4 != i5) {
                        dVar.mo15398w()[i4] = obj;
                    }
                    i4++;
                }
            }
            int size2 = dVar.size();
            for (int i6 = i4; i6 < size2; i6++) {
                dVar.mo15398w()[i6] = null;
            }
            dVar.mo15377Q(i4);
            if (dVar.size() > 0) {
                if (i != i2) {
                    int i7 = eVar.mo15414n()[i];
                    eVar.mo15414n()[i] = i3;
                    eVar.mo15414n()[i2] = i7;
                }
                i++;
            }
        }
        int l2 = eVar.mo15413l();
        for (int i8 = i; i8 < l2; i8++) {
            eVar.mo15415p()[eVar.mo15414n()[i8]] = null;
        }
        eVar.mo15422x(i);
        Iterator<RecomposeScopeImpl> it = this.f23069v.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator()");
        while (it.hasNext()) {
            if (!it.next().mo15218u()) {
                it.remove();
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8613s(C8602q qVar, C8428d dVar, CoroutineContext coroutineContext, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qVar, dVar, (i & 4) != 0 ? null : coroutineContext);
    }
}
