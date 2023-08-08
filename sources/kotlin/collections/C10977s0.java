package kotlin.collections;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.C11097g2;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.Pair;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nMaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,793:1\n392#1:803\n403#1:808\n500#1,6:813\n525#1,6:819\n1#2:794\n1238#3,4:795\n1238#3,4:799\n1238#3,4:804\n1238#3,4:809\n*S KotlinDebug\n*F\n+ 1 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n442#1:803\n457#1:808\n515#1:813,6\n540#1:819,6\n392#1:795,4\n403#1:799,4\n442#1:804,4\n457#1:809,4\n*E\n"})
/* renamed from: kotlin.collections.s0 */
public class C10977s0 extends C10975r0 {
    @C12579k
    /* renamed from: A */
    public static final <K, V> Map<K, V> m41423A(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (lVar.invoke(next).booleanValue()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    @C11110f
    /* renamed from: A0 */
    public static final <K, V> void m41424A0(Map<K, V> map, K k, V v) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        map.put(k, v);
    }

    @C12579k
    /* renamed from: B */
    public static final <K, V> Map<K, V> m41425B(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super K, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (lVar.invoke(next.getKey()).booleanValue()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: B0 */
    public static final <K, V> Map<K, V> m41426B0(@C12579k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Object obj;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return m41470k0(m41428C0(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return m41492z();
        }
        if (size != 1) {
            return m41428C0(iterable, new LinkedHashMap(C10975r0.m41400j(collection.size())));
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C10975r0.m41401k((Pair) obj);
    }

    @C12579k
    /* renamed from: C */
    public static final <K, V> Map<K, V> m41427C(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (!lVar.invoke(next).booleanValue()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: C0 */
    public static final <K, V, M extends Map<? super K, ? super V>> M m41428C0(@C12579k Iterable<? extends Pair<? extends K, ? extends V>> iterable, @C12579k M m) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        m41487w0(m, iterable);
        return m;
    }

    @C12579k
    /* renamed from: D */
    public static final <K, V, M extends Map<? super K, ? super V>> M m41429D(@C12579k Map<? extends K, ? extends V> map, @C12579k M m, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (Map.Entry next : map.entrySet()) {
            if (!lVar.invoke(next).booleanValue()) {
                m.put(next.getKey(), next.getValue());
            }
        }
        return m;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: D0 */
    public static final <K, V> Map<K, V> m41430D0(@C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m41492z();
        }
        if (size != 1) {
            return m41442J0(map);
        }
        return C10975r0.m41405o(map);
    }

    @C12579k
    /* renamed from: E */
    public static final <K, V, M extends Map<? super K, ? super V>> M m41431E(@C12579k Map<? extends K, ? extends V> map, @C12579k M m, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (Map.Entry next : map.entrySet()) {
            if (lVar.invoke(next).booleanValue()) {
                m.put(next.getKey(), next.getValue());
            }
        }
        return m;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: E0 */
    public static final <K, V, M extends Map<? super K, ? super V>> M m41432E0(@C12579k Map<? extends K, ? extends V> map, @C12579k M m) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        m.putAll(map);
        return m;
    }

    @C12579k
    /* renamed from: F */
    public static final <K, V> Map<K, V> m41433F(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super V, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            if (lVar.invoke(next.getValue()).booleanValue()) {
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: F0 */
    public static final <K, V> Map<K, V> m41434F0(@C12579k C11559m<? extends Pair<? extends K, ? extends V>> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m41470k0(m41436G0(mVar, new LinkedHashMap()));
    }

    @C11110f
    /* renamed from: G */
    public static final <K, V> V m41435G(Map<? extends K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.get(k);
    }

    @C12579k
    /* renamed from: G0 */
    public static final <K, V, M extends Map<? super K, ? super V>> M m41436G0(@C12579k C11559m<? extends Pair<? extends K, ? extends V>> mVar, @C12579k M m) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        m41489x0(m, mVar);
        return m;
    }

    @C11110f
    /* renamed from: H */
    public static final <K, V> V m41437H(Map<K, ? extends V> map, K k, C11289a<? extends V> aVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        V v = map.get(k);
        if (v == null) {
            return aVar.invoke();
        }
        return v;
    }

    @C12579k
    /* renamed from: H0 */
    public static final <K, V> Map<K, V> m41438H0(@C12579k Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        int length = pairArr.length;
        if (length == 0) {
            return m41492z();
        }
        if (length != 1) {
            return m41440I0(pairArr, new LinkedHashMap(C10975r0.m41400j(pairArr.length)));
        }
        return C10975r0.m41401k(pairArr[0]);
    }

    /* renamed from: I */
    public static final <K, V> V m41439I(@C12579k Map<K, ? extends V> map, K k, @C12579k C11289a<? extends V> aVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        V v = map.get(k);
        if (v != null || map.containsKey(k)) {
            return v;
        }
        return aVar.invoke();
    }

    @C12579k
    /* renamed from: I0 */
    public static final <K, V, M extends Map<? super K, ? super V>> M m41440I0(@C12579k Pair<? extends K, ? extends V>[] pairArr, @C12579k M m) {
        Intrinsics.checkNotNullParameter(pairArr, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        m41491y0(m, pairArr);
        return m;
    }

    /* renamed from: J */
    public static final <K, V> V m41441J(@C12579k Map<K, V> map, K k, @C12579k C11289a<? extends V> aVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "defaultValue");
        V v = map.get(k);
        if (v != null) {
            return v;
        }
        V invoke = aVar.invoke();
        map.put(k, invoke);
        return invoke;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: J0 */
    public static final <K, V> Map<K, V> m41442J0(@C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return new LinkedHashMap(map);
    }

    @C11665v0(version = "1.1")
    /* renamed from: K */
    public static final <K, V> V m41443K(@C12579k Map<K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return C10973q0.m41391a(map, k);
    }

    @C11110f
    /* renamed from: K0 */
    public static final <K, V> Pair<K, V> m41444K0(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return new Pair<>(entry.getKey(), entry.getValue());
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: L */
    public static final <K, V> HashMap<K, V> m41445L() {
        return new HashMap<>();
    }

    @C12579k
    /* renamed from: M */
    public static final <K, V> HashMap<K, V> m41446M(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        HashMap<K, V> hashMap = new HashMap<>(C10975r0.m41400j(pairArr.length));
        m41491y0(hashMap, pairArr);
        return hashMap;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, java.util.Map, M] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: N */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <M extends java.util.Map<?, ?> & R, R> R m41447N(M r1, kotlin.jvm.functions.C11289a<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r1 = r2.invoke()
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10977s0.m41447N(java.util.Map, kotlin.jvm.functions.a):java.lang.Object");
    }

    @C11110f
    /* renamed from: O */
    public static final <K, V> boolean m41448O(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return !map.isEmpty();
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: P */
    public static final <K, V> boolean m41449P(Map<? extends K, ? extends V> map) {
        return map == null || map.isEmpty();
    }

    @C11110f
    /* renamed from: Q */
    public static final <K, V> Iterator<Map.Entry<K, V>> m41450Q(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: R */
    public static final <K, V> LinkedHashMap<K, V> m41451R() {
        return new LinkedHashMap<>();
    }

    @C12579k
    /* renamed from: S */
    public static final <K, V> LinkedHashMap<K, V> m41452S(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        return (LinkedHashMap) m41440I0(pairArr, new LinkedHashMap(C10975r0.m41400j(pairArr.length)));
    }

    @C12579k
    /* renamed from: T */
    public static final <K, V, R> Map<R, V> m41453T(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(map.size()));
        for (Object next : map.entrySet()) {
            linkedHashMap.put(lVar.invoke(next), ((Map.Entry) next).getValue());
        }
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: U */
    public static final <K, V, R, M extends Map<? super R, ? super V>> M m41454U(@C12579k Map<? extends K, ? extends V> map, @C12579k M m, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object next : map.entrySet()) {
            m.put(lVar.invoke(next), ((Map.Entry) next).getValue());
        }
        return m;
    }

    @C11110f
    /* renamed from: V */
    public static final <K, V> Map<K, V> m41455V() {
        return m41492z();
    }

    @C12579k
    /* renamed from: W */
    public static final <K, V> Map<K, V> m41456W(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        if (pairArr.length > 0) {
            return m41440I0(pairArr, new LinkedHashMap(C10975r0.m41400j(pairArr.length)));
        }
        return m41492z();
    }

    @C12579k
    /* renamed from: X */
    public static final <K, V, R> Map<K, R> m41457X(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(map.size()));
        for (Object next : map.entrySet()) {
            linkedHashMap.put(((Map.Entry) next).getKey(), lVar.invoke(next));
        }
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: Y */
    public static final <K, V, R, M extends Map<? super K, ? super R>> M m41458Y(@C12579k Map<? extends K, ? extends V> map, @C12579k M m, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object next : map.entrySet()) {
            m.put(((Map.Entry) next).getKey(), lVar.invoke(next));
        }
        return m;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: Z */
    public static final <K, V> Map<K, V> m41459Z(@C12579k Map<? extends K, ? extends V> map, @C12579k Iterable<? extends K> iterable) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "keys");
        Map<? extends K, ? extends V> J0 = m41442J0(map);
        C10994x.m42344E0(J0.keySet(), iterable);
        return m41470k0(J0);
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: a0 */
    public static final <K, V> Map<K, V> m41460a0(@C12579k Map<? extends K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Map<? extends K, ? extends V> J0 = m41442J0(map);
        J0.remove(k);
        return m41470k0(J0);
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: b0 */
    public static final <K, V> Map<K, V> m41461b0(@C12579k Map<? extends K, ? extends V> map, @C12579k C11559m<? extends K> mVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "keys");
        Map<? extends K, ? extends V> J0 = m41442J0(map);
        C10994x.m42346G0(J0.keySet(), mVar);
        return m41470k0(J0);
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: c0 */
    public static final <K, V> Map<K, V> m41462c0(@C12579k Map<? extends K, ? extends V> map, @C12579k K[] kArr) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(kArr, "keys");
        Map<? extends K, ? extends V> J0 = m41442J0(map);
        C10994x.m42347H0(J0.keySet(), kArr);
        return m41470k0(J0);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: d0 */
    public static final <K, V> void m41463d0(Map<K, V> map, Iterable<? extends K> iterable) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "keys");
        C10994x.m42344E0(map.keySet(), iterable);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: e0 */
    public static final <K, V> void m41464e0(Map<K, V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        map.remove(k);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: f0 */
    public static final <K, V> void m41465f0(Map<K, V> map, C11559m<? extends K> mVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "keys");
        C10994x.m42346G0(map.keySet(), mVar);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: g0 */
    public static final <K, V> void m41466g0(Map<K, V> map, K[] kArr) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(kArr, "keys");
        C10994x.m42347H0(map.keySet(), kArr);
    }

    @C11110f
    @C11314h(name = "mutableIterator")
    /* renamed from: h0 */
    public static final <K, V> Iterator<Map.Entry<K, V>> m41467h0(Map<K, V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: i0 */
    public static final <K, V> Map<K, V> m41468i0() {
        return new LinkedHashMap();
    }

    @C12579k
    /* renamed from: j0 */
    public static final <K, V> Map<K, V> m41469j0(@C12579k Pair<? extends K, ? extends V>... pairArr) {
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C10975r0.m41400j(pairArr.length));
        m41491y0(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: k0 */
    public static final <K, V> Map<K, V> m41470k0(@C12579k Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return m41492z();
        }
        if (size != 1) {
            return map;
        }
        return C10975r0.m41405o(map);
    }

    @C11110f
    /* renamed from: l0 */
    public static final <K, V> Map<K, V> m41471l0(Map<K, ? extends V> map) {
        return map == null ? m41492z() : map;
    }

    @C12579k
    /* renamed from: m0 */
    public static final <K, V> Map<K, V> m41472m0(@C12579k Map<? extends K, ? extends V> map, @C12579k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "pairs");
        if (map.isEmpty()) {
            return m41426B0(iterable);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m41487w0(linkedHashMap, iterable);
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: n0 */
    public static final <K, V> Map<K, V> m41473n0(@C12579k Map<? extends K, ? extends V> map, @C12579k Map<? extends K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: o0 */
    public static final <K, V> Map<K, V> m41474o0(@C12579k Map<? extends K, ? extends V> map, @C12579k Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        if (map.isEmpty()) {
            return C10975r0.m41401k(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.mo21849e(), pair.mo21851f());
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: p0 */
    public static final <K, V> Map<K, V> m41475p0(@C12579k Map<? extends K, ? extends V> map, @C12579k C11559m<? extends Pair<? extends K, ? extends V>> mVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "pairs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m41489x0(linkedHashMap, mVar);
        return m41470k0(linkedHashMap);
    }

    @C12579k
    /* renamed from: q0 */
    public static final <K, V> Map<K, V> m41476q0(@C12579k Map<? extends K, ? extends V> map, @C12579k Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        if (map.isEmpty()) {
            return m41438H0(pairArr);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        m41491y0(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    @C11110f
    /* renamed from: r0 */
    public static final <K, V> void m41477r0(Map<? super K, ? super V> map, Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "pairs");
        m41487w0(map, iterable);
    }

    @C11110f
    @C11665v0(version = "1.6")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: s */
    public static final <K, V> Map<K, V> m41478s(int i, @C10863b C11300l<? super Map<K, V>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        Map h = C10975r0.m41398h(i);
        lVar.invoke(h);
        return C10975r0.m41394d(h);
    }

    @C11110f
    /* renamed from: s0 */
    public static final <K, V> void m41479s0(Map<? super K, ? super V> map, Map<K, ? extends V> map2) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(map2, "map");
        map.putAll(map2);
    }

    @C11110f
    @C11665v0(version = "1.6")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: t */
    public static final <K, V> Map<K, V> m41480t(@C10863b C11300l<? super Map<K, V>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        Map g = C10975r0.m41397g();
        lVar.invoke(g);
        return C10975r0.m41394d(g);
    }

    @C11110f
    /* renamed from: t0 */
    public static final <K, V> void m41481t0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pair, "pair");
        map.put(pair.mo21849e(), pair.mo21851f());
    }

    @C11110f
    /* renamed from: u */
    public static final <K, V> K m41482u(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @C11110f
    /* renamed from: u0 */
    public static final <K, V> void m41483u0(Map<? super K, ? super V> map, C11559m<? extends Pair<? extends K, ? extends V>> mVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "pairs");
        m41489x0(map, mVar);
    }

    @C11110f
    /* renamed from: v */
    public static final <K, V> V m41484v(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }

    @C11110f
    /* renamed from: v0 */
    public static final <K, V> void m41485v0(Map<? super K, ? super V> map, Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        m41491y0(map, pairArr);
    }

    @C11110f
    /* renamed from: w */
    public static final <K, V> boolean m41486w(Map<? extends K, ? extends V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.containsKey(k);
    }

    /* renamed from: w0 */
    public static final <K, V> void m41487w0(@C12579k Map<? super K, ? super V> map, @C12579k Iterable<? extends Pair<? extends K, ? extends V>> iterable) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "pairs");
        for (Pair pair : iterable) {
            map.put(pair.mo21846a(), pair.mo21847b());
        }
    }

    @C11110f
    /* renamed from: x */
    public static final <K> boolean m41488x(Map<? extends K, ?> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.containsKey(k);
    }

    /* renamed from: x0 */
    public static final <K, V> void m41489x0(@C12579k Map<? super K, ? super V> map, @C12579k C11559m<? extends Pair<? extends K, ? extends V>> mVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "pairs");
        for (Pair pair : mVar) {
            map.put(pair.mo21846a(), pair.mo21847b());
        }
    }

    @C11110f
    /* renamed from: y */
    public static final <K, V> boolean m41490y(Map<K, ? extends V> map, V v) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.containsValue(v);
    }

    /* renamed from: y0 */
    public static final <K, V> void m41491y0(@C12579k Map<? super K, ? super V> map, @C12579k Pair<? extends K, ? extends V>[] pairArr) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(pairArr, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            map.put(pair.mo21846a(), pair.mo21847b());
        }
    }

    @C12579k
    /* renamed from: z */
    public static final <K, V> Map<K, V> m41492z() {
        EmptyMap emptyMap = EmptyMap.f28117a;
        Intrinsics.checkNotNull(emptyMap, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.emptyMap, V of kotlin.collections.MapsKt__MapsKt.emptyMap>");
        return emptyMap;
    }

    @C11110f
    /* renamed from: z0 */
    public static final <K, V> V m41493z0(Map<? extends K, V> map, K k) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return C11370u0.m43695k(map).remove(k);
    }
}
