package androidx.compose.runtime;

import androidx.compose.runtime.collection.C8419d;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8438a;
import androidx.compose.runtime.external.kotlinx.collections.immutable.C8452h;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.analytics.location.C35560b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11532s0;
import kotlin.C11587t0;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 SlotTable.kt\nandroidx/compose/runtime/SlotTable\n*L\n1#1,4528:1\n309#1:4529\n4513#1,5:4546\n1#2:4530\n361#3,7:4531\n146#4,8:4538\n*S KotlinDebug\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n325#1:4529\n4519#1:4546,5\n4253#1:4531,7\n4367#1:4538,8\n*E\n"})
public final class ComposerKt {
    @C12580l

    /* renamed from: a */
    public static C8693x f22631a = null;
    @C12579k

    /* renamed from: b */
    public static final C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2> f22632b = ComposerKt$removeCurrentGroupInstance$1.f22655f;
    @C12579k

    /* renamed from: c */
    public static final C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2> f22633c = ComposerKt$skipToGroupEndInstance$1.f22657f;
    @C12579k

    /* renamed from: d */
    public static final C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2> f22634d = ComposerKt$endGroupInstance$1.f22654f;
    @C12579k

    /* renamed from: e */
    public static final C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2> f22635e = ComposerKt$startRootGroup$1.f22658f;
    @C12579k

    /* renamed from: f */
    public static final C11305q<C8428d<?>, C8701z1, C8608r1, C11079d2> f22636f = ComposerKt$resetSlotsInstance$1.f22656f;

    /* renamed from: g */
    public static final int f22637g = 100;

    /* renamed from: h */
    public static final int f22638h = 125;

    /* renamed from: i */
    public static final int f22639i = -127;

    /* renamed from: j */
    public static final int f22640j = 200;
    @C12579k

    /* renamed from: k */
    public static final Object f22641k = new C8436e1(C35560b.f87807Z0);

    /* renamed from: l */
    public static final int f22642l = 201;
    @C12579k

    /* renamed from: m */
    public static final Object f22643m = new C8436e1(C35560b.f87807Z0);

    /* renamed from: n */
    public static final int f22644n = 202;
    @C12579k

    /* renamed from: o */
    public static final Object f22645o = new C8436e1("compositionLocalMap");

    /* renamed from: p */
    public static final int f22646p = 203;
    @C12579k

    /* renamed from: q */
    public static final Object f22647q = new C8436e1("providerValues");

    /* renamed from: r */
    public static final int f22648r = 204;
    @C12579k

    /* renamed from: s */
    public static final Object f22649s = new C8436e1("providers");

    /* renamed from: t */
    public static final int f22650t = 206;
    @C12579k

    /* renamed from: u */
    public static final Object f22651u = new C8436e1("reference");

    /* renamed from: v */
    public static final int f22652v = 207;

    /* renamed from: w */
    public static final int f22653w = -2;

    @C12579k
    /* renamed from: A */
    public static final Void m29774A(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "message");
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    @C8540g
    /* renamed from: B */
    public static final C8452h<C8682u<Object>, C8578k2<Object>> m29775B(C8572j1<?>[] j1VarArr, C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar, C8592o oVar, int i) {
        oVar.mo14918M(721128344);
        if (m29813g0()) {
            m29845w0(721128344, i, -1, "androidx.compose.runtime.compositionLocalMapOf (Composer.kt:319)");
        }
        C8452h.C8453a builder = C8438a.m30459C().builder();
        for (C8572j1<?> j1Var : j1VarArr) {
            oVar.mo14918M(680853375);
            if (j1Var.mo16231a() || !m29776C(hVar, j1Var.mo16232b())) {
                C8682u<?> b = j1Var.mo16232b();
                Intrinsics.checkNotNull(b, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                builder.put(b, j1Var.mo16232b().mo16121e(j1Var.mo16233c(), oVar, 8));
            }
            oVar.mo15002m0();
        }
        C8452h<C8682u<Object>, C8578k2<Object>> g = builder.mo15671g();
        if (m29813g0()) {
            m29843v0();
        }
        oVar.mo15002m0();
        return g;
    }

    /* renamed from: C */
    public static final <T> boolean m29776C(@C12579k C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar, @C12579k C8682u<T> uVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(uVar, "key");
        return hVar.containsKey(uVar);
    }

    /* renamed from: D */
    public static final int m29777D(C8689v1 v1Var, int i, int i2) {
        int i3 = 0;
        while (i > 0 && i != i2) {
            i = v1Var.mo16797V(i);
            i3++;
        }
        return i3;
    }

    /* renamed from: E */
    public static final List<C8603q0> m29778E(List<C8603q0> list, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        for (int F = m29779F(list, i); F < list.size(); F++) {
            C8603q0 q0Var = list.get(F);
            if (q0Var.mo16291b() >= i2) {
                break;
            }
            arrayList.add(q0Var);
        }
        return arrayList;
    }

    /* renamed from: F */
    public static final int m29779F(List<C8603q0> list, int i) {
        int G = m29780G(list, i);
        return G < 0 ? -(G + 1) : G;
    }

    /* renamed from: G */
    public static final int m29780G(List<C8603q0> list, int i) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int compare = Intrinsics.compare(list.get(i3).mo16291b(), i);
            if (compare < 0) {
                i2 = i3 + 1;
            } else if (compare <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* renamed from: H */
    public static final C8603q0 m29781H(List<C8603q0> list, int i, int i2) {
        int F = m29779F(list, i);
        if (F >= list.size()) {
            return null;
        }
        C8603q0 q0Var = list.get(F);
        if (q0Var.mo16291b() < i2) {
            return q0Var;
        }
        return null;
    }

    @C12579k
    /* renamed from: I */
    public static final Object m29782I() {
        return f22645o;
    }

    @C11532s0
    /* renamed from: J */
    public static /* synthetic */ void m29783J() {
    }

    @C11532s0
    /* renamed from: K */
    public static /* synthetic */ void m29784K() {
    }

    /* renamed from: L */
    public static /* synthetic */ void m29785L() {
    }

    @C12579k
    /* renamed from: M */
    public static final Object m29786M() {
        return f22641k;
    }

    @C11532s0
    /* renamed from: N */
    public static /* synthetic */ void m29787N() {
    }

    @C11532s0
    /* renamed from: O */
    public static /* synthetic */ void m29788O() {
    }

    /* renamed from: P */
    public static final Object m29789P(C8615s0 s0Var) {
        return s0Var.mo16382e() != null ? new C8607r0(Integer.valueOf(s0Var.mo16379b()), s0Var.mo16382e()) : Integer.valueOf(s0Var.mo16379b());
    }

    /* renamed from: Q */
    public static final Object m29790Q(Object obj, Object obj2, Object obj3) {
        C8607r0 r0Var;
        if (obj instanceof C8607r0) {
            r0Var = (C8607r0) obj;
        } else {
            r0Var = null;
        }
        if (r0Var == null) {
            return null;
        }
        if ((!Intrinsics.areEqual(r0Var.mo16299e(), obj2) || !Intrinsics.areEqual(r0Var.mo16301f(), obj3)) && (obj = m29790Q(r0Var.mo16299e(), obj2, obj3)) == null) {
            obj = m29790Q(r0Var.mo16301f(), obj2, obj3);
        }
        return obj;
    }

    @C12579k
    /* renamed from: R */
    public static final Object m29791R() {
        return f22643m;
    }

    @C11532s0
    /* renamed from: S */
    public static /* synthetic */ void m29792S() {
    }

    @C11532s0
    /* renamed from: T */
    public static /* synthetic */ void m29793T() {
    }

    @C12579k
    /* renamed from: U */
    public static final Object m29794U() {
        return f22649s;
    }

    @C11532s0
    /* renamed from: V */
    public static /* synthetic */ void m29795V() {
    }

    @C11532s0
    /* renamed from: W */
    public static /* synthetic */ void m29796W() {
    }

    @C12579k
    /* renamed from: X */
    public static final Object m29797X() {
        return f22647q;
    }

    @C11532s0
    /* renamed from: Y */
    public static /* synthetic */ void m29798Y() {
    }

    @C11532s0
    /* renamed from: Z */
    public static /* synthetic */ void m29799Z() {
    }

    @C12579k
    /* renamed from: a0 */
    public static final Object m29801a0() {
        return f22651u;
    }

    @C11532s0
    /* renamed from: b0 */
    public static /* synthetic */ void m29803b0() {
    }

    @C11532s0
    /* renamed from: c0 */
    public static /* synthetic */ void m29805c0() {
    }

    @C11532s0
    /* renamed from: d0 */
    public static /* synthetic */ void m29807d0() {
    }

    /* renamed from: e0 */
    public static final <T> T m29809e0(@C12579k C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar, @C12579k C8682u<T> uVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(uVar, "key");
        C8578k2 k2Var = (C8578k2) hVar.get(uVar);
        if (k2Var != null) {
            return k2Var.getValue();
        }
        return null;
    }

    /* renamed from: f0 */
    public static final void m29811f0(List<C8603q0> list, int i, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int G = m29780G(list, i);
        C8419d dVar = null;
        if (G < 0) {
            int i2 = -(G + 1);
            if (obj != null) {
                dVar = new C8419d();
                dVar.add(obj);
            }
            list.add(i2, new C8603q0(recomposeScopeImpl, i, dVar));
        } else if (obj == null) {
            list.get(G).mo16294e((C8419d<Object>) null);
        } else {
            C8419d<Object> a = list.get(G).mo16290a();
            if (a != null) {
                a.add(obj);
            }
        }
    }

    @C8579l
    /* renamed from: g0 */
    public static final boolean m29813g0() {
        C8693x xVar = f22631a;
        return xVar != null && xVar.mo16867a();
    }

    /* renamed from: h0 */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> m29815h0() {
        return new HashMap<>();
    }

    @C12579k
    /* renamed from: i0 */
    public static final C8452h<C8682u<Object>, C8578k2<Object>> m29817i0(@C12579k C8452h<C8682u<Object>, ? extends C8578k2<? extends Object>> hVar, @C12579k C11300l<? super Map<C8682u<Object>, C8578k2<Object>>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(hVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "mutator");
        C8452h.C8453a<C8682u<Object>, ? extends C8578k2<? extends Object>> builder = hVar.builder();
        lVar.invoke(builder);
        return builder.mo15671g();
    }

    /* renamed from: j0 */
    public static final int m29819j0(C8689v1 v1Var, int i, int i2, int i3) {
        if (i == i2) {
            return i;
        }
        if (i == i3 || i2 == i3) {
            return i3;
        }
        if (v1Var.mo16797V(i) == i2) {
            return i2;
        }
        if (v1Var.mo16797V(i2) == i) {
            return i;
        }
        if (v1Var.mo16797V(i) == v1Var.mo16797V(i2)) {
            return v1Var.mo16797V(i);
        }
        int D = m29777D(v1Var, i, i3);
        int D2 = m29777D(v1Var, i2, i3);
        int i4 = D - D2;
        for (int i5 = 0; i5 < i4; i5++) {
            i = v1Var.mo16797V(i);
        }
        int i6 = D2 - D;
        for (int i7 = 0; i7 < i6; i7++) {
            i2 = v1Var.mo16797V(i2);
        }
        while (i != i2) {
            i = v1Var.mo16797V(i);
            i2 = v1Var.mo16797V(i2);
        }
        return i;
    }

    /* renamed from: k0 */
    public static final <K, V> V m29821k0(HashMap<K, LinkedHashSet<V>> hashMap, K k) {
        V z2;
        LinkedHashSet linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null || (z2 = CollectionsKt___CollectionsKt.m40721z2(linkedHashSet)) == null) {
            return null;
        }
        m29825m0(hashMap, k, z2);
        return z2;
    }

    /* renamed from: l0 */
    public static final <K, V> boolean m29823l0(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet<V> linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            hashMap.put(k, linkedHashSet);
        }
        return linkedHashSet.add(v);
    }

    /* renamed from: m0 */
    public static final <K, V> C11079d2 m29825m0(HashMap<K, LinkedHashSet<V>> hashMap, K k, V v) {
        LinkedHashSet linkedHashSet = hashMap.get(k);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v);
        if (linkedHashSet.isEmpty()) {
            hashMap.remove(k);
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0030, code lost:
        r1 = (androidx.compose.runtime.RecomposeScopeImpl) r1;
     */
    /* renamed from: n0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m29827n0(@org.jetbrains.annotations.C12579k androidx.compose.runtime.C8701z1 r4, @org.jetbrains.annotations.C12579k androidx.compose.runtime.C8608r1 r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "rememberManager"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Iterator r0 = r4.mo16961j0()
        L_0x000e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0040
            java.lang.Object r1 = r0.next()
            boolean r2 = r1 instanceof androidx.compose.runtime.C8584m
            if (r2 == 0) goto L_0x0022
            r2 = r1
            androidx.compose.runtime.m r2 = (androidx.compose.runtime.C8584m) r2
            r5.mo16307c(r2)
        L_0x0022:
            boolean r2 = r1 instanceof androidx.compose.runtime.C8616s1
            if (r2 == 0) goto L_0x002c
            r2 = r1
            androidx.compose.runtime.s1 r2 = (androidx.compose.runtime.C8616s1) r2
            r5.mo16306b(r2)
        L_0x002c:
            boolean r2 = r1 instanceof androidx.compose.runtime.RecomposeScopeImpl
            if (r2 == 0) goto L_0x000e
            androidx.compose.runtime.RecomposeScopeImpl r1 = (androidx.compose.runtime.RecomposeScopeImpl) r1
            androidx.compose.runtime.s r2 = r1.mo15209l()
            if (r2 == 0) goto L_0x000e
            r3 = 1
            r2.mo16349U(r3)
            r1.mo15221x()
            goto L_0x000e
        L_0x0040:
            r4.mo16925Q0()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerKt.m29827n0(androidx.compose.runtime.z1, androidx.compose.runtime.r1):void");
    }

    /* renamed from: o0 */
    public static final C8603q0 m29829o0(List<C8603q0> list, int i) {
        int G = m29780G(list, i);
        if (G >= 0) {
            return list.remove(G);
        }
        return null;
    }

    /* renamed from: p0 */
    public static final void m29831p0(List<C8603q0> list, int i, int i2) {
        int F = m29779F(list, i);
        while (F < list.size() && list.get(F).mo16291b() < i2) {
            list.remove(F);
        }
    }

    /* renamed from: q0 */
    public static final void m29833q0(boolean z) {
        if (!z) {
            m29774A("Check failed".toString());
            throw new KotlinNothingValueException();
        }
    }

    /* renamed from: r0 */
    public static final void m29835r0(boolean z, @C12579k C11289a<? extends Object> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "lazyMessage");
        if (!z) {
            m29774A(aVar.invoke().toString());
            throw new KotlinNothingValueException();
        }
    }

    @C8579l
    /* renamed from: s0 */
    public static final void m29837s0(@C12579k C8592o oVar, @C12579k String str) {
        Intrinsics.checkNotNullParameter(oVar, "composer");
        Intrinsics.checkNotNullParameter(str, "sourceInformation");
        oVar.mo14953Y(str);
    }

    @C8579l
    /* renamed from: t0 */
    public static final void m29839t0(@C12579k C8592o oVar) {
        Intrinsics.checkNotNullParameter(oVar, "composer");
        oVar.mo14994k0();
    }

    @C8579l
    /* renamed from: u0 */
    public static final void m29841u0(@C12579k C8592o oVar, int i, @C12579k String str) {
        Intrinsics.checkNotNullParameter(oVar, "composer");
        Intrinsics.checkNotNullParameter(str, "sourceInformation");
        oVar.mo14965c0(i, str);
    }

    /* renamed from: v */
    public static final boolean m29842v(int i) {
        return i != 0;
    }

    @C8579l
    /* renamed from: v0 */
    public static final void m29843v0() {
        C8693x xVar = f22631a;
        if (xVar != null) {
            xVar.mo16869c();
        }
    }

    /* renamed from: w */
    public static final int m29844w(boolean z) {
        return z ? 1 : 0;
    }

    @C8579l
    /* renamed from: w0 */
    public static final void m29845w0(int i, int i2, int i3, @C12579k String str) {
        Intrinsics.checkNotNullParameter(str, C28531e0.f69094x);
        C8693x xVar = f22631a;
        if (xVar != null) {
            xVar.mo16868b(i, i2, i3, str);
        }
    }

    @C8579l
    /* renamed from: x */
    public static final <T> T m29846x(@C12579k C8592o oVar, boolean z, @C12579k C11289a<? extends T> aVar) {
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        T N = oVar.mo14921N();
        if (!z && N != C8592o.f23032a.mo16277a()) {
            return N;
        }
        T invoke = aVar.invoke();
        oVar.mo14893C(invoke);
        return invoke;
    }

    @C11395k(level = DeprecationLevel.f28051c, message = "Use the overload with $dirty metadata instead", replaceWith = @C11587t0(expression = "traceEventStart(key, dirty1, dirty2, info)", imports = {}))
    @C8579l
    /* renamed from: x0 */
    public static final /* synthetic */ void m29847x0(int i, String str) {
        Intrinsics.checkNotNullParameter(str, C28531e0.f69094x);
        m29845w0(i, -1, -1, str);
    }

    /* renamed from: y */
    public static final List<Object> m29848y(C8692w1 w1Var, C8412c cVar) {
        ArrayList arrayList = new ArrayList();
        C8689v1 F0 = w1Var.mo16836F0();
        try {
            m29849z(F0, arrayList, w1Var.mo16848X(cVar));
            C11079d2 d2Var = C11079d2.f28267a;
            return arrayList;
        } finally {
            F0.mo16808e();
        }
    }

    /* renamed from: z */
    public static final void m29849z(C8689v1 v1Var, List<Object> list, int i) {
        if (v1Var.mo16791P(i)) {
            list.add(v1Var.mo16793R(i));
            return;
        }
        int i2 = i + 1;
        int K = i + v1Var.mo16786K(i);
        while (i2 < K) {
            m29849z(v1Var, list, i2);
            i2 += v1Var.mo16786K(i2);
        }
    }
}
