package kotlin.collections;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.C11079d2;
import kotlin.C11403m0;
import kotlin.C11665v0;
import kotlin.Pair;
import kotlin.internal.C11109e;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\n_Maps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,594:1\n96#1,5:595\n111#1,5:600\n152#1,3:605\n143#1:608\n215#1:609\n216#1:611\n144#1:612\n215#1:613\n216#1:615\n1#2:610\n1#2:614\n1940#3,14:616\n1963#3,14:630\n2310#3,14:644\n2333#3,14:658\n1864#3,3:672\n*S KotlinDebug\n*F\n+ 1 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n76#1:595,5\n89#1:600,5\n125#1:605,3\n135#1:608\n135#1:609\n135#1:611\n135#1:612\n143#1:613\n143#1:615\n135#1:610\n230#1:616,14\n241#1:630,14\n390#1:644,14\n401#1:658,14\n574#1:672,3\n*E\n"})
/* renamed from: kotlin.collections.u0 */
public class C10983u0 extends C10980t0 {
    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: A1 */
    public static final <K, V> Float m41504A1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.invoke(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: B1 */
    public static final <K, V, R> R m41505B1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            R invoke = lVar.invoke(it.next());
            while (it.hasNext()) {
                R invoke2 = lVar.invoke(it.next());
                if (comparator.compare(invoke, invoke2) > 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: C1 */
    public static final <K, V, R> R m41506C1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = lVar.invoke(it.next());
        while (it.hasNext()) {
            R invoke2 = lVar.invoke(it.next());
            if (comparator.compare(invoke, invoke2) > 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: D1 */
    public static final <K, V> Map.Entry<K, V> m41507D1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.m40645i4(map.entrySet(), comparator);
    }

    @C11110f
    @C11314h(name = "minWithOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: E1 */
    public static final <K, V> Map.Entry<K, V> m41508E1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.m40650j4(map.entrySet(), comparator);
    }

    /* renamed from: F1 */
    public static final <K, V> boolean m41509F1(@C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.isEmpty();
    }

    /* renamed from: G1 */
    public static final <K, V> boolean m41510G1(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            if (lVar.invoke(invoke).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: H1 */
    public static final <K, V, M extends Map<? extends K, ? extends V>> M m41511H1(@C12579k M m, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(m, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        for (Map.Entry invoke : m.entrySet()) {
            lVar.invoke(invoke);
        }
        return m;
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: I1 */
    public static final <K, V, M extends Map<? extends K, ? extends V>> M m41512I1(@C12579k M m, @C12579k C11304p<? super Integer, ? super Map.Entry<? extends K, ? extends V>, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(m, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int i = 0;
        for (Object next : m.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            pVar.invoke(Integer.valueOf(i), next);
            i = i2;
        }
        return m;
    }

    @C12579k
    /* renamed from: J1 */
    public static final <K, V> List<Pair<K, V>> m41513J1(@C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        if (map.size() == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        Map.Entry next = it.next();
        if (!it.hasNext()) {
            return C10976s.m41419k(new Pair(next.getKey(), next.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new Pair(next.getKey(), next.getValue()));
        do {
            Map.Entry next2 = it.next();
            arrayList.add(new Pair(next2.getKey(), next2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    /* renamed from: P0 */
    public static final <K, V> boolean m41514P0(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if (map.isEmpty()) {
            return true;
        }
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            if (!lVar.invoke(invoke).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: Q0 */
    public static final <K, V> boolean m41515Q0(@C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return !map.isEmpty();
    }

    /* renamed from: R0 */
    public static final <K, V> boolean m41516R0(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if (map.isEmpty()) {
            return false;
        }
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            if (lVar.invoke(invoke).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @C11110f
    /* renamed from: S0 */
    public static final <K, V> Iterable<Map.Entry<K, V>> m41517S0(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet();
    }

    @C12579k
    /* renamed from: T0 */
    public static final <K, V> C11559m<Map.Entry<K, V>> m41518T0(@C12579k Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return CollectionsKt___CollectionsKt.m40700v1(map.entrySet());
    }

    @C11110f
    /* renamed from: U0 */
    public static final <K, V> int m41519U0(Map<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    /* renamed from: V0 */
    public static final <K, V> int m41520V0(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int i = 0;
        if (map.isEmpty()) {
            return 0;
        }
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            if (lVar.invoke(invoke).booleanValue()) {
                i++;
            }
        }
        return i;
    }

    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: W0 */
    public static final <K, V, R> R m41521W0(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        R r;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        Iterator<Map.Entry<? extends K, ? extends V>> it = map.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                r = null;
                break;
            }
            r = lVar.invoke(it.next());
            if (r != null) {
                break;
            }
        }
        if (r != null) {
            return r;
        }
        throw new NoSuchElementException("No element of the map was transformed to a non-null value.");
    }

    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: X0 */
    public static final <K, V, R> R m41522X0(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            R invoke2 = lVar.invoke(invoke);
            if (invoke2 != null) {
                return invoke2;
            }
        }
        return null;
    }

    @C12579k
    /* renamed from: Y0 */
    public static final <K, V, R> List<R> m41523Y0(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            C10994x.m42360n0(arrayList, (Iterable) lVar.invoke(invoke));
        }
        return arrayList;
    }

    @C11314h(name = "flatMapSequence")
    @C11665v0(version = "1.4")
    @C11403m0
    @C12579k
    /* renamed from: Z0 */
    public static final <K, V, R> List<R> m41524Z0(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends C11559m<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            C10994x.m42361o0(arrayList, (C11559m) lVar.invoke(invoke));
        }
        return arrayList;
    }

    @C11314h(name = "flatMapSequenceTo")
    @C11665v0(version = "1.4")
    @C11403m0
    @C12579k
    /* renamed from: a1 */
    public static final <K, V, R, C extends Collection<? super R>> C m41525a1(@C12579k Map<? extends K, ? extends V> map, @C12579k C c, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends C11559m<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            C10994x.m42361o0(c, (C11559m) lVar.invoke(invoke));
        }
        return c;
    }

    @C12579k
    /* renamed from: b1 */
    public static final <K, V, R, C extends Collection<? super R>> C m41526b1(@C12579k Map<? extends K, ? extends V> map, @C12579k C c, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            C10994x.m42360n0(c, (Iterable) lVar.invoke(invoke));
        }
        return c;
    }

    @C11109e
    /* renamed from: c1 */
    public static final <K, V> void m41527c1(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            lVar.invoke(invoke);
        }
    }

    @C12579k
    /* renamed from: d1 */
    public static final <K, V, R> List<R> m41528d1(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            arrayList.add(lVar.invoke(invoke));
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: e1 */
    public static final <K, V, R> List<R> m41529e1(@C12579k Map<? extends K, ? extends V> map, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            Object invoke2 = lVar.invoke(invoke);
            if (invoke2 != null) {
                arrayList.add(invoke2);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: f1 */
    public static final <K, V, R, C extends Collection<? super R>> C m41530f1(@C12579k Map<? extends K, ? extends V> map, @C12579k C c, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            Object invoke2 = lVar.invoke(invoke);
            if (invoke2 != null) {
                c.add(invoke2);
            }
        }
        return c;
    }

    @C12579k
    /* renamed from: g1 */
    public static final <K, V, R, C extends Collection<? super R>> C m41531g1(@C12579k Map<? extends K, ? extends V> map, @C12579k C c, @C12579k C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Map.Entry<? extends K, ? extends V> invoke : map.entrySet()) {
            c.add(lVar.invoke(invoke));
        }
        return c;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.util.Map$Entry<K, V>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.Map$Entry<K, V>} */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> m41532h1(java.util.Map<? extends K, ? extends V> r5, kotlin.jvm.functions.C11300l<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x001c
            r5 = 0
            goto L_0x0047
        L_0x001c:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L_0x0028
        L_0x0026:
            r5 = r0
            goto L_0x0047
        L_0x0028:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L_0x002e:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 >= 0) goto L_0x0040
            r0 = r2
            r1 = r3
        L_0x0040:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L_0x002e
            goto L_0x0026
        L_0x0047:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10983u0.m41532h1(java.util.Map, kotlin.jvm.functions.l):java.util.Map$Entry");
    }

    @C11110f
    @C11314h(name = "maxByOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: i1 */
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m41533i1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) lVar.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) lVar.invoke(next2);
                    if (comparable.compareTo(comparable2) < 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            return (Map.Entry) next;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: j1 */
    public static final <K, V> double m41534j1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.invoke(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.invoke(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: k1 */
    public static final <K, V> float m41535k1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = lVar.invoke(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, lVar.invoke(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: l1 */
    public static final <K, V, R extends Comparable<? super R>> R m41536l1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            R r = (Comparable) lVar.invoke(it.next());
            while (it.hasNext()) {
                R r2 = (Comparable) lVar.invoke(it.next());
                if (r.compareTo(r2) < 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: m1 */
    public static final <K, V, R extends Comparable<? super R>> R m41537m1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R r = (Comparable) lVar.invoke(it.next());
        while (it.hasNext()) {
            R r2 = (Comparable) lVar.invoke(it.next());
            if (r.compareTo(r2) < 0) {
                r = r2;
            }
        }
        return r;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: n1 */
    public static final <K, V> Double m41538n1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: o1 */
    public static final <K, V> Float m41539o1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.invoke(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: p1 */
    public static final <K, V, R> R m41540p1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            R invoke = lVar.invoke(it.next());
            while (it.hasNext()) {
                R invoke2 = lVar.invoke(it.next());
                if (comparator.compare(invoke, invoke2) < 0) {
                    invoke = invoke2;
                }
            }
            return invoke;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: q1 */
    public static final <K, V, R> R m41541q1(Map<? extends K, ? extends V> map, Comparator<? super R> comparator, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R invoke = lVar.invoke(it.next());
        while (it.hasNext()) {
            R invoke2 = lVar.invoke(it.next());
            if (comparator.compare(invoke, invoke2) < 0) {
                invoke = invoke2;
            }
        }
        return invoke;
    }

    @C11110f
    @C11665v0(version = "1.4")
    /* renamed from: r1 */
    public static final <K, V> Map.Entry<K, V> m41542r1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.m40555Q3(map.entrySet(), comparator);
    }

    @C11110f
    @C11314h(name = "maxWithOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: s1 */
    public static final <K, V> Map.Entry<K, V> m41543s1(Map<? extends K, ? extends V> map, Comparator<? super Map.Entry<? extends K, ? extends V>> comparator) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (Map.Entry) CollectionsKt___CollectionsKt.m40560R3(map.entrySet(), comparator);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.util.Map$Entry<K, V>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: java.util.Map$Entry<K, V>} */
    /* JADX WARNING: Multi-variable type inference failed */
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: t1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <K, V, R extends java.lang.Comparable<? super R>> java.util.Map.Entry<K, V> m41544t1(java.util.Map<? extends K, ? extends V> r5, kotlin.jvm.functions.C11300l<? super java.util.Map.Entry<? extends K, ? extends V>, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "selector"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.Set r5 = r5.entrySet()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
            boolean r0 = r5.hasNext()
            if (r0 != 0) goto L_0x001c
            r5 = 0
            goto L_0x0047
        L_0x001c:
            java.lang.Object r0 = r5.next()
            boolean r1 = r5.hasNext()
            if (r1 != 0) goto L_0x0028
        L_0x0026:
            r5 = r0
            goto L_0x0047
        L_0x0028:
            java.lang.Object r1 = r6.invoke(r0)
            java.lang.Comparable r1 = (java.lang.Comparable) r1
        L_0x002e:
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r6.invoke(r2)
            java.lang.Comparable r3 = (java.lang.Comparable) r3
            int r4 = r1.compareTo(r3)
            if (r4 <= 0) goto L_0x0040
            r0 = r2
            r1 = r3
        L_0x0040:
            boolean r2 = r5.hasNext()
            if (r2 != 0) goto L_0x002e
            goto L_0x0026
        L_0x0047:
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.C10983u0.m41544t1(java.util.Map, kotlin.jvm.functions.l):java.util.Map$Entry");
    }

    @C11110f
    @C11314h(name = "minByOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: u1 */
    public static final <K, V, R extends Comparable<? super R>> Map.Entry<K, V> m41545u1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                Comparable comparable = (Comparable) lVar.invoke(next);
                do {
                    Object next2 = it.next();
                    Comparable comparable2 = (Comparable) lVar.invoke(next2);
                    if (comparable.compareTo(comparable2) > 0) {
                        next = next2;
                        comparable = comparable2;
                    }
                } while (it.hasNext());
            }
            return (Map.Entry) next;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: v1 */
    public static final <K, V> double m41546v1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.invoke(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.invoke(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: w1 */
    public static final <K, V> float m41547w1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, Float> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            float floatValue = lVar.invoke(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.invoke(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: x1 */
    public static final <K, V, R extends Comparable<? super R>> R m41548x1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            R r = (Comparable) lVar.invoke(it.next());
            while (it.hasNext()) {
                R r2 = (Comparable) lVar.invoke(it.next());
                if (r.compareTo(r2) > 0) {
                    r = r2;
                }
            }
            return r;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: y1 */
    public static final <K, V, R extends Comparable<? super R>> R m41549y1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        R r = (Comparable) lVar.invoke(it.next());
        while (it.hasNext()) {
            R r2 = (Comparable) lVar.invoke(it.next());
            if (r.compareTo(r2) > 0) {
                r = r2;
            }
        }
        return r;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: z1 */
    public static final <K, V> Double m41550z1(Map<? extends K, ? extends V> map, C11300l<? super Map.Entry<? extends K, ? extends V>, Double> lVar) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }
}
