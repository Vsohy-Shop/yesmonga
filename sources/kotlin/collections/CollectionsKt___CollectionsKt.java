package kotlin.collections;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.C11078d1;
import kotlin.C11079d2;
import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11403m0;
import kotlin.C11419p1;
import kotlin.C11429q;
import kotlin.C11531s;
import kotlin.C11587t0;
import kotlin.C11588t1;
import kotlin.C11665v0;
import kotlin.Pair;
import kotlin.comparisons.C11006g;
import kotlin.internal.C11109e;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.C11466l;
import kotlin.ranges.C11479u;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C11615m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,3683:1\n288#1,2:3684\n518#1,7:3686\n533#1,6:3693\n857#1,2:3700\n788#1:3702\n1864#1,2:3703\n789#1,2:3705\n1866#1:3707\n791#1:3708\n1864#1,3:3709\n809#1,2:3712\n847#1,2:3714\n1253#1,4:3720\n1222#1,4:3724\n1238#1,4:3728\n1285#1,4:3732\n1446#1,5:3736\n1461#1,5:3741\n1502#1,3:3746\n1505#1,3:3756\n1520#1,3:3759\n1523#1,3:3769\n1620#1,3:3786\n1590#1,4:3789\n1579#1:3793\n1864#1,2:3794\n1866#1:3797\n1580#1:3798\n1864#1,3:3799\n1611#1:3802\n1855#1:3803\n1856#1:3805\n1612#1:3806\n1855#1,2:3807\n1864#1,3:3809\n2847#1,3:3812\n2850#1,6:3816\n2872#1,3:3822\n2875#1,7:3826\n857#1,2:3833\n819#1:3835\n847#1,2:3836\n819#1:3838\n847#1,2:3839\n819#1:3841\n847#1,2:3842\n3405#1,8:3848\n3433#1,7:3856\n3464#1,10:3863\n1#2:3699\n1#2:3796\n1#2:3804\n1#2:3815\n1#2:3825\n37#3,2:3716\n37#3,2:3718\n361#4,7:3749\n361#4,7:3762\n361#4,7:3772\n361#4,7:3779\n32#5,2:3844\n32#5,2:3846\n*S KotlinDebug\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n167#1:3684,2\n177#1:3686,7\n187#1:3693,6\n766#1:3700,2\n777#1:3702\n777#1:3703,2\n777#1:3705,2\n777#1:3707\n777#1:3708\n788#1:3709,3\n800#1:3712,2\n819#1:3714,2\n1180#1:3720,4\n1195#1:3724,4\n1209#1:3728,4\n1272#1:3732,4\n1360#1:3736,5\n1373#1:3741,5\n1477#1:3746,3\n1477#1:3756,3\n1490#1:3759,3\n1490#1:3769,3\n1549#1:3786,3\n1559#1:3789,4\n1569#1:3793\n1569#1:3794,2\n1569#1:3797\n1569#1:3798\n1579#1:3799,3\n1603#1:3802\n1603#1:3803\n1603#1:3805\n1603#1:3806\n1611#1:3807,2\n2645#1:3809,3\n2949#1:3812,3\n2949#1:3816,6\n2967#1:3822,3\n2967#1:3826,7\n3143#1:3833,2\n3151#1:3835\n3151#1:3836,2\n3161#1:3838\n3161#1:3839,2\n3171#1:3841\n3171#1:3842,2\n3394#1:3848,8\n3422#1:3856,7\n3451#1:3863,10\n1569#1:3796\n1603#1:3804\n2949#1:3815\n2967#1:3825\n1032#1:3716,2\n1075#1:3718,2\n1477#1:3749,7\n1490#1:3762,7\n1504#1:3772,7\n1522#1:3779,7\n3339#1:3844,2\n3381#1:3846,2\n*E\n"})
public class CollectionsKt___CollectionsKt extends C10998z {

    @C11363r0({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,680:1\n3524#2:681\n*E\n"})
    /* renamed from: kotlin.collections.CollectionsKt___CollectionsKt$a */
    public static final class C10896a implements C11559m<T> {

        /* renamed from: a */
        public final /* synthetic */ Iterable f28113a;

        public C10896a(Iterable iterable) {
            this.f28113a = iterable;
        }

        @C12579k
        public Iterator<T> iterator() {
            return this.f28113a.iterator();
        }
    }

    @C11363r0({"SMAP\n_Collections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1\n*L\n1#1,3683:1\n*E\n"})
    /* renamed from: kotlin.collections.CollectionsKt___CollectionsKt$b */
    public static final class C10897b implements C10929d0<T, K> {

        /* renamed from: a */
        public final /* synthetic */ Iterable<T> f28114a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<T, K> f28115b;

        public C10897b(Iterable<? extends T> iterable, C11300l<? super T, ? extends K> lVar) {
            this.f28114a = iterable;
            this.f28115b = lVar;
        }

        /* renamed from: a */
        public K mo21944a(T t) {
            return this.f28115b.invoke(t);
        }

        @C12579k
        /* renamed from: b */
        public Iterator<T> mo21945b() {
            return this.f28114a.iterator();
        }
    }

    @C12579k
    /* renamed from: A1 */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M m40473A1(@C12579k Iterable<? extends T> iterable, @C12579k M m, @C12579k C11300l<? super T, ? extends K> lVar, @C12579k C11300l<? super T, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        for (Object next : iterable) {
            m.put(lVar.invoke(next), lVar2.invoke(next));
        }
        return m;
    }

    @C12580l
    /* renamed from: A2 */
    public static final <T> T m40474A2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (T next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: A3 */
    public static final <T, R extends Comparable<? super R>> T m40475A3(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) lVar.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) lVar.invoke(next2);
            if (comparable.compareTo(comparable2) < 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    @C12579k
    /* renamed from: A4 */
    public static final <T> List<T> m40476A4(@C12579k Collection<? extends T> collection, @C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + 10);
        arrayList.addAll(collection);
        C10994x.m42361o0(arrayList, mVar);
        return arrayList;
    }

    @C11110f
    @C11314h(name = "sumOfLong")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: A5 */
    public static final <T> long m40477A5(Iterable<? extends T> iterable, C11300l<? super T, Long> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        long j = 0;
        for (Object invoke : iterable) {
            j += lVar.invoke(invoke).longValue();
        }
        return j;
    }

    @C12579k
    /* renamed from: B1 */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M m40478B1(@C12579k Iterable<? extends T> iterable, @C12579k M m, @C12579k C11300l<? super T, ? extends Pair<? extends K, ? extends V>> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : iterable) {
            Pair pair = (Pair) lVar.invoke(invoke);
            m.put(pair.mo21849e(), pair.mo21851f());
        }
        return m;
    }

    @C12580l
    /* renamed from: B2 */
    public static final <T> T m40479B2(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @C11314h(name = "maxByOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: B3 */
    public static final <T, R extends Comparable<? super R>> T m40480B3(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            Comparable comparable = (Comparable) lVar.invoke(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.invoke(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException();
    }

    @C12579k
    /* renamed from: B4 */
    public static final <T> List<T> m40481B4(@C12579k Collection<? extends T> collection, @C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        ArrayList arrayList = new ArrayList(collection.size() + tArr.length);
        arrayList.addAll(collection);
        C10994x.m42362p0(arrayList, tArr);
        return arrayList;
    }

    @C11314h(name = "sumOfShort")
    /* renamed from: B5 */
    public static final int m40482B5(@C12579k Iterable<Short> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i = 0;
        for (Short shortValue : iterable) {
            i += shortValue.shortValue();
        }
        return i;
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: C1 */
    public static final <K, V> Map<K, V> m40483C1(@C12579k Iterable<? extends K> iterable, @C12579k C11300l<? super K, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10978t.m41495Y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(next, lVar.invoke(next));
        }
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: C2 */
    public static final <T, R> List<R> m40484C2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Object invoke : iterable) {
            C10994x.m42360n0(arrayList, (Iterable) lVar.invoke(invoke));
        }
        return arrayList;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: C3 */
    public static final <T> double m40485C3(Iterable<? extends T> iterable, C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    /* renamed from: C4 */
    public static final <T> List<T> m40486C4(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return m40703v4(iterable, t);
    }

    @C11110f
    @C11314h(name = "sumOfUInt")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    @C11403m0
    /* renamed from: C5 */
    public static final <T> int m40487C5(Iterable<? extends T> iterable, C11300l<? super T, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int M = C11419p1.m43971M(0);
        for (Object invoke : iterable) {
            M = C11419p1.m43971M(M + lVar.invoke(invoke).mo22930j2());
        }
        return M;
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: D1 */
    public static final <K, V, M extends Map<? super K, ? super V>> M m40488D1(@C12579k Iterable<? extends K> iterable, @C12579k M m, @C12579k C11300l<? super K, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        for (Object next : iterable) {
            m.put(next, lVar.invoke(next));
        }
        return m;
    }

    @C11110f
    @C11314h(name = "flatMapIndexedIterable")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: D2 */
    public static final <T, R> List<R> m40489D2(Iterable<? extends T> iterable, C11304p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C10994x.m42360n0(arrayList, (Iterable) pVar.invoke(Integer.valueOf(i), next));
            i = i2;
        }
        return arrayList;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: D3 */
    public static final <T> float m40490D3(Iterable<? extends T> iterable, C11300l<? super T, Float> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    /* renamed from: D4 */
    public static final <T> List<T> m40491D4(Collection<? extends T> collection, T t) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return m40723z4(collection, t);
    }

    @C11110f
    @C11314h(name = "sumOfULong")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    @C11403m0
    /* renamed from: D5 */
    public static final <T> long m40492D5(Iterable<? extends T> iterable, C11300l<? super T, C11588t1> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        long M = C11588t1.m44970M(0);
        for (Object invoke : iterable) {
            M = C11588t1.m44970M(M + lVar.invoke(invoke).mo23301j2());
        }
        return M;
    }

    @C11314h(name = "averageOfByte")
    /* renamed from: E1 */
    public static final double m40493E1(@C12579k Iterable<Byte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Byte byteValue : iterable) {
            d += (double) byteValue.byteValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @C11110f
    @C11314h(name = "flatMapIndexedIterableTo")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: E2 */
    public static final <T, R, C extends Collection<? super R>> C m40494E2(Iterable<? extends T> iterable, C c, C11304p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C10994x.m42360n0(c, (Iterable) pVar.invoke(Integer.valueOf(i), next));
            i = i2;
        }
        return c;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: E3 */
    public static final <T, R extends Comparable<? super R>> R m40495E3(Iterable<? extends T> iterable, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    @C11665v0(version = "1.3")
    /* renamed from: E4 */
    public static final <T> T m40496E4(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return m40501F4(collection, Random.f28564a);
    }

    @C12579k
    /* renamed from: E5 */
    public static final <T> List<T> m40497E5(@C12579k Iterable<? extends T> iterable, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return m40557Q5(iterable);
                }
                if (i == 1) {
                    return C10976s.m41419k(m40696u2(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return CollectionsKt__CollectionsKt.m40453Q(arrayList);
        }
    }

    @C11314h(name = "averageOfDouble")
    /* renamed from: F1 */
    public static final double m40498F1(@C12579k Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Double doubleValue : iterable) {
            d += doubleValue.doubleValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @C11110f
    @C11314h(name = "flatMapIndexedSequence")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: F2 */
    public static final <T, R> List<R> m40499F2(Iterable<? extends T> iterable, C11304p<? super Integer, ? super T, ? extends C11559m<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C10994x.m42361o0(arrayList, (C11559m) pVar.invoke(Integer.valueOf(i), next));
            i = i2;
        }
        return arrayList;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: F3 */
    public static final <T, R extends Comparable<? super R>> R m40500F3(Iterable<? extends T> iterable, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
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

    @C11665v0(version = "1.3")
    /* renamed from: F4 */
    public static final <T> T m40501F4(@C12579k Collection<? extends T> collection, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (!collection.isEmpty()) {
            return m40608b2(collection, random.mo22986m(collection.size()));
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @C12579k
    /* renamed from: F5 */
    public static final <T> List<T> m40502F5(@C12579k List<? extends T> list, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        } else {
            int size = list.size();
            if (i >= size) {
                return m40557Q5(list);
            }
            if (i == 1) {
                return C10976s.m41419k(m40653k3(list));
            }
            ArrayList arrayList = new ArrayList(i);
            if (list instanceof RandomAccess) {
                for (int i2 = size - i; i2 < size; i2++) {
                    arrayList.add(list.get(i2));
                }
            } else {
                Iterator listIterator = list.listIterator(size - i);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
            }
            return arrayList;
        }
    }

    @C11314h(name = "averageOfFloat")
    /* renamed from: G1 */
    public static final double m40503G1(@C12579k Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Float floatValue : iterable) {
            d += (double) floatValue.floatValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @C11110f
    @C11314h(name = "flatMapIndexedSequenceTo")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: G2 */
    public static final <T, R, C extends Collection<? super R>> C m40504G2(Iterable<? extends T> iterable, C c, C11304p<? super Integer, ? super T, ? extends C11559m<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C10994x.m42361o0(c, (C11559m) pVar.invoke(Integer.valueOf(i), next));
            i = i2;
        }
        return c;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: G3 */
    public static final <T> Double m40505G3(Iterable<? extends T> iterable, C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
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
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: G4 */
    public static final <T> T m40506G4(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return m40511H4(collection, Random.f28564a);
    }

    @C12579k
    /* renamed from: G5 */
    public static final <T> List<T> m40507G5(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if (list.isEmpty()) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (!lVar.invoke(listIterator.previous()).booleanValue()) {
                listIterator.next();
                int size = list.size() - listIterator.nextIndex();
                if (size == 0) {
                    return CollectionsKt__CollectionsKt.m40441E();
                }
                ArrayList arrayList = new ArrayList(size);
                while (listIterator.hasNext()) {
                    arrayList.add(listIterator.next());
                }
                return arrayList;
            }
        }
        return m40557Q5(list);
    }

    @C11314h(name = "averageOfInt")
    /* renamed from: H1 */
    public static final double m40508H1(@C12579k Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Integer intValue : iterable) {
            d += (double) intValue.intValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @C11314h(name = "flatMapSequence")
    @C11665v0(version = "1.4")
    @C11403m0
    @C12579k
    /* renamed from: H2 */
    public static final <T, R> List<R> m40509H2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends C11559m<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Object invoke : iterable) {
            C10994x.m42361o0(arrayList, (C11559m) lVar.invoke(invoke));
        }
        return arrayList;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: H3 */
    public static final <T> Float m40510H3(Iterable<? extends T> iterable, C11300l<? super T, Float> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.invoke(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C12580l
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: H4 */
    public static final <T> T m40511H4(@C12579k Collection<? extends T> collection, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        if (collection.isEmpty()) {
            return null;
        }
        return m40608b2(collection, random.mo22986m(collection.size()));
    }

    @C12579k
    /* renamed from: H5 */
    public static final <T> List<T> m40512H5(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!lVar.invoke(next).booleanValue()) {
                break;
            }
            arrayList.add(next);
        }
        return arrayList;
    }

    @C11314h(name = "averageOfLong")
    /* renamed from: I1 */
    public static final double m40513I1(@C12579k Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Long longValue : iterable) {
            d += (double) longValue.longValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @C11314h(name = "flatMapSequenceTo")
    @C11665v0(version = "1.4")
    @C11403m0
    @C12579k
    /* renamed from: I2 */
    public static final <T, R, C extends Collection<? super R>> C m40514I2(@C12579k Iterable<? extends T> iterable, @C12579k C c, @C12579k C11300l<? super T, ? extends C11559m<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : iterable) {
            C10994x.m42361o0(c, (C11559m) lVar.invoke(invoke));
        }
        return c;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: I3 */
    public static final <T, R> R m40515I3(Iterable<? extends T> iterable, Comparator<? super R> comparator, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
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

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super S, ? super T, ? extends S>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: I4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m40516I4(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super S, ? super T, ? extends S> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r2.next()
        L_0x0018:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0027
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.invoke(r0, r1)
            goto L_0x0018
        L_0x0027:
            return r0
        L_0x0028:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Empty collection can't be reduced."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40516I4(java.lang.Iterable, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C12579k
    /* renamed from: I5 */
    public static final boolean[] m40517I5(@C12579k Collection<Boolean> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        int i = 0;
        for (Boolean booleanValue : collection) {
            zArr[i] = booleanValue.booleanValue();
            i++;
        }
        return zArr;
    }

    @C11314h(name = "averageOfShort")
    /* renamed from: J1 */
    public static final double m40518J1(@C12579k Iterable<Short> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Short shortValue : iterable) {
            d += (double) shortValue.shortValue();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return d / ((double) i);
    }

    @C12579k
    /* renamed from: J2 */
    public static final <T, R, C extends Collection<? super R>> C m40519J2(@C12579k Iterable<? extends T> iterable, @C12579k C c, @C12579k C11300l<? super T, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : iterable) {
            C10994x.m42360n0(c, (Iterable) lVar.invoke(invoke));
        }
        return c;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: J3 */
    public static final <T, R> R m40520J3(Iterable<? extends T> iterable, Comparator<? super R> comparator, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
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

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super S, ? super T, ? extends S>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: J4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m40521J4(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0035
            java.lang.Object r0 = r4.next()
            r1 = 1
        L_0x0019:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0034
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x0026
            kotlin.collections.CollectionsKt__CollectionsKt.m40459W()
        L_0x0026:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r4.next()
            java.lang.Object r0 = r5.invoke(r1, r0, r3)
            r1 = r2
            goto L_0x0019
        L_0x0034:
            return r0
        L_0x0035:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            java.lang.String r5 = "Empty collection can't be reduced."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40521J4(java.lang.Iterable, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C12579k
    /* renamed from: J5 */
    public static final byte[] m40522J5(@C12579k Collection<Byte> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        byte[] bArr = new byte[collection.size()];
        int i = 0;
        for (Byte byteValue : collection) {
            bArr[i] = byteValue.byteValue();
            i++;
        }
        return bArr;
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: K1 */
    public static final <T> List<List<T>> m40523K1(@C12579k Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return m40597Y5(iterable, i, i, true);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super T, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: K2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R m40524K2(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r1, R r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super R, ? super T, ? extends R> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x001d
            java.lang.Object r0 = r1.next()
            java.lang.Object r2 = r3.invoke(r2, r0)
            goto L_0x000e
        L_0x001d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40524K2(java.lang.Iterable, java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: K3 */
    public static final <T extends Comparable<? super T>> T m40525K3(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super S, ? super T, ? extends S>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.C12580l
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: K4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m40526K4(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Iterator r4 = r4.iterator()
            boolean r0 = r4.hasNext()
            if (r0 != 0) goto L_0x0016
            r4 = 0
            return r4
        L_0x0016:
            java.lang.Object r0 = r4.next()
            r1 = 1
        L_0x001b:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0036
            int r2 = r1 + 1
            if (r1 >= 0) goto L_0x0028
            kotlin.collections.CollectionsKt__CollectionsKt.m40459W()
        L_0x0028:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r3 = r4.next()
            java.lang.Object r0 = r5.invoke(r1, r0, r3)
            r1 = r2
            goto L_0x001b
        L_0x0036:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40526K4(java.lang.Iterable, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C12579k
    /* renamed from: K5 */
    public static final char[] m40527K5(@C12579k Collection<Character> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        char[] cArr = new char[collection.size()];
        int i = 0;
        for (Character charValue : collection) {
            cArr[i] = charValue.charValue();
            i++;
        }
        return cArr;
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: L1 */
    public static final <T, R> List<R> m40528L1(@C12579k Iterable<? extends T> iterable, int i, @C12579k C11300l<? super List<? extends T>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        return m40602Z5(iterable, i, i, true, lVar);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: L2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R m40529L2(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r3, R r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L_0x000f:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x002a
            java.lang.Object r1 = r3.next()
            int r2 = r0 + 1
            if (r0 >= 0) goto L_0x0020
            kotlin.collections.CollectionsKt__CollectionsKt.m40459W()
        L_0x0020:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r4 = r5.invoke(r0, r4, r1)
            r0 = r2
            goto L_0x000f
        L_0x002a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40529L2(java.lang.Iterable, java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: L3 */
    public static final Double m40530L3(@C12579k Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super S, ? super T, ? extends S>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.C12580l
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    /* renamed from: L4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m40531L4(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super S, ? super T, ? extends S> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.util.Iterator r2 = r2.iterator()
            boolean r0 = r2.hasNext()
            if (r0 != 0) goto L_0x0016
            r2 = 0
            return r2
        L_0x0016:
            java.lang.Object r0 = r2.next()
        L_0x001a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0029
            java.lang.Object r1 = r2.next()
            java.lang.Object r0 = r3.invoke(r0, r1)
            goto L_0x001a
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40531L4(java.lang.Iterable, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C12579k
    /* renamed from: L5 */
    public static final <T, C extends Collection<? super T>> C m40532L5(@C12579k Iterable<? extends T> iterable, @C12579k C c) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    @C11110f
    /* renamed from: M1 */
    public static final <T> T m40533M1(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(0);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super T, ? super R, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: M2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R m40534M2(@org.jetbrains.annotations.C12579k java.util.List<? extends T> r1, R r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super T, ? super R, ? extends R> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0027
            int r0 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r0)
        L_0x0018:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0027
            java.lang.Object r0 = r1.previous()
            java.lang.Object r2 = r3.invoke(r0, r2)
            goto L_0x0018
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40534M2(java.util.List, java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: M3 */
    public static final Float m40535M3(@C12579k Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super T, ? super S, ? extends S>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: M4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m40536M4(@org.jetbrains.annotations.C12579k java.util.List<? extends T> r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super T, ? super S, ? extends S> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L_0x002c
            java.lang.Object r0 = r2.previous()
        L_0x001c:
            boolean r1 = r2.hasPrevious()
            if (r1 == 0) goto L_0x002b
            java.lang.Object r1 = r2.previous()
            java.lang.Object r0 = r3.invoke(r1, r0)
            goto L_0x001c
        L_0x002b:
            return r0
        L_0x002c:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r3 = "Empty list can't be reduced."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40536M4(java.util.List, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C12579k
    /* renamed from: M5 */
    public static final double[] m40537M5(@C12579k Collection<Double> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Double doubleValue : collection) {
            dArr[i] = doubleValue.doubleValue();
            i++;
        }
        return dArr;
    }

    @C11110f
    /* renamed from: N1 */
    public static final <T> T m40538N1(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(1);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super T, ? super R, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: N2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R m40539N2(@org.jetbrains.annotations.C12579k java.util.List<? extends T> r2, R r3, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super T, ? super R, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x002f
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
        L_0x0018:
            boolean r0 = r2.hasPrevious()
            if (r0 == 0) goto L_0x002f
            int r0 = r2.previousIndex()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r2.previous()
            java.lang.Object r3 = r4.invoke(r0, r1, r3)
            goto L_0x0018
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40539N2(java.util.List, java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C11314h(name = "maxOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: N3 */
    public static final double m40540N3(@C12579k Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super T, ? super S, ? extends S>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: N4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m40541N4(@org.jetbrains.annotations.C12579k java.util.List<? extends T> r3, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super T, ? super S, ? extends S> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.size()
            java.util.ListIterator r3 = r3.listIterator(r0)
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r0 = r3.previous()
        L_0x001c:
            boolean r1 = r3.hasPrevious()
            if (r1 == 0) goto L_0x0033
            int r1 = r3.previousIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r3.previous()
            java.lang.Object r0 = r4.invoke(r1, r2, r0)
            goto L_0x001c
        L_0x0033:
            return r0
        L_0x0034:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            java.lang.String r4 = "Empty list can't be reduced."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40541N4(java.util.List, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C12579k
    /* renamed from: N5 */
    public static final float[] m40542N5(@C12579k Collection<Float> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        float[] fArr = new float[collection.size()];
        int i = 0;
        for (Float floatValue : collection) {
            fArr[i] = floatValue.floatValue();
            i++;
        }
        return fArr;
    }

    @C11110f
    /* renamed from: O1 */
    public static final <T> T m40543O1(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(2);
    }

    @C11109e
    /* renamed from: O2 */
    public static final <T> void m40544O2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        for (Object invoke : iterable) {
            lVar.invoke(invoke);
        }
    }

    @C11314h(name = "maxOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: O3 */
    public static final float m40545O3(@C12579k Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super T, ? super S, ? extends S>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.C12580l
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: O4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m40546O4(@org.jetbrains.annotations.C12579k java.util.List<? extends T> r3, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super T, ? super S, ? extends S> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r3.size()
            java.util.ListIterator r3 = r3.listIterator(r0)
            boolean r0 = r3.hasPrevious()
            if (r0 != 0) goto L_0x001a
            r3 = 0
            return r3
        L_0x001a:
            java.lang.Object r0 = r3.previous()
        L_0x001e:
            boolean r1 = r3.hasPrevious()
            if (r1 == 0) goto L_0x0035
            int r1 = r3.previousIndex()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r2 = r3.previous()
            java.lang.Object r0 = r4.invoke(r1, r2, r0)
            goto L_0x001e
        L_0x0035:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40546O4(java.util.List, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C12579k
    /* renamed from: O5 */
    public static final <T> HashSet<T> m40547O5(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (HashSet) m40532L5(iterable, new HashSet(C10975r0.m41400j(C10978t.m41495Y(iterable, 12))));
    }

    @C11110f
    /* renamed from: P1 */
    public static final <T> T m40548P1(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(3);
    }

    /* renamed from: P2 */
    public static final <T> void m40549P2(@C12579k Iterable<? extends T> iterable, @C12579k C11304p<? super Integer, ? super T, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            pVar.invoke(Integer.valueOf(i), next);
            i = i2;
        }
    }

    @C11314h(name = "maxOrThrow")
    @C11665v0(version = "1.7")
    @C12579k
    /* renamed from: P3 */
    public static final <T extends Comparable<? super T>> T m40550P3(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T t = (Comparable) it.next();
            while (it.hasNext()) {
                T t2 = (Comparable) it.next();
                if (t.compareTo(t2) < 0) {
                    t = t2;
                }
            }
            return t;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super T, ? super S, ? extends S>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.C12580l
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    /* renamed from: P4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m40551P4(@org.jetbrains.annotations.C12579k java.util.List<? extends T> r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super T, ? super S, ? extends S> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            int r0 = r2.size()
            java.util.ListIterator r2 = r2.listIterator(r0)
            boolean r0 = r2.hasPrevious()
            if (r0 != 0) goto L_0x001a
            r2 = 0
            return r2
        L_0x001a:
            java.lang.Object r0 = r2.previous()
        L_0x001e:
            boolean r1 = r2.hasPrevious()
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r2.previous()
            java.lang.Object r0 = r3.invoke(r1, r0)
            goto L_0x001e
        L_0x002d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40551P4(java.util.List, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C12579k
    /* renamed from: P5 */
    public static final int[] m40552P5(@C12579k Collection<Integer> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer intValue : collection) {
            iArr[i] = intValue.intValue();
            i++;
        }
        return iArr;
    }

    @C11110f
    /* renamed from: Q1 */
    public static final <T> T m40553Q1(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(4);
    }

    @C11110f
    /* renamed from: Q2 */
    public static final <T> T m40554Q2(List<? extends T> list, int i, C11300l<? super Integer, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > CollectionsKt__CollectionsKt.m40443G(list)) {
            return lVar.invoke(Integer.valueOf(i));
        }
        return list.get(i);
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: Q3 */
    public static final <T> T m40555Q3(@C12579k Iterable<? extends T> iterable, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    @C12579k
    /* renamed from: Q4 */
    public static final <T> Iterable<T> m40556Q4(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        for (Object obj : iterable) {
            if (obj == null) {
                throw new IllegalArgumentException("null element found in " + iterable + '.');
            }
        }
        return iterable;
    }

    @C12579k
    /* renamed from: Q5 */
    public static final <T> List<T> m40557Q5(@C12579k Iterable<? extends T> iterable) {
        Object obj;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return CollectionsKt__CollectionsKt.m40453Q(m40567S5(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        if (size != 1) {
            return m40572T5(collection);
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C10976s.m41419k(obj);
    }

    /* renamed from: R1 */
    public static final <T> boolean m40558R1(@C12579k Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        if (m40589X2(iterable, t) >= 0) {
            return true;
        }
        return false;
    }

    @C12580l
    /* renamed from: R2 */
    public static final <T> T m40559R2(@C12579k List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i < 0 || i > CollectionsKt__CollectionsKt.m40443G(list)) {
            return null;
        }
        return list.get(i);
    }

    @C11314h(name = "maxWithOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: R3 */
    public static final <T> T m40560R3(@C12579k Iterable<? extends T> iterable, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) < 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    @C12579k
    /* renamed from: R4 */
    public static final <T> List<T> m40561R4(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        for (Object obj : list) {
            if (obj == null) {
                throw new IllegalArgumentException("null element found in " + list + '.');
            }
        }
        return list;
    }

    @C12579k
    /* renamed from: R5 */
    public static final long[] m40562R5(@C12579k Collection<Long> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        long[] jArr = new long[collection.size()];
        int i = 0;
        for (Long longValue : collection) {
            jArr[i] = longValue.longValue();
            i++;
        }
        return jArr;
    }

    /* renamed from: S1 */
    public static final <T> int m40563S1(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        return i;
    }

    @C12579k
    /* renamed from: S2 */
    public static final <T, K> Map<K, List<T>> m40564S2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : iterable) {
            Object invoke = lVar.invoke(next);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(next);
        }
        return linkedHashMap;
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: S3 */
    public static final <T, R extends Comparable<? super R>> T m40565S3(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        Comparable comparable = (Comparable) lVar.invoke(next);
        do {
            T next2 = it.next();
            Comparable comparable2 = (Comparable) lVar.invoke(next2);
            if (comparable.compareTo(comparable2) > 0) {
                next = next2;
                comparable = comparable2;
            }
        } while (it.hasNext());
        return next;
    }

    @C12579k
    /* renamed from: S4 */
    public static final <T> List<T> m40566S4(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return m40557Q5(iterable);
        }
        List<T> S5 = m40567S5(iterable);
        C10998z.m42399m1(S5);
        return S5;
    }

    @C12579k
    /* renamed from: S5 */
    public static final <T> List<T> m40567S5(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m40572T5((Collection) iterable);
        }
        return (List) m40532L5(iterable, new ArrayList());
    }

    /* renamed from: T1 */
    public static final <T> int m40568T1(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int i = 0;
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return 0;
        }
        for (Object invoke : iterable) {
            if (lVar.invoke(invoke).booleanValue() && (i = i + 1) < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        return i;
    }

    @C12579k
    /* renamed from: T2 */
    public static final <T, K, V> Map<K, List<V>> m40569T2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends K> lVar, @C12579k C11300l<? super T, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : iterable) {
            Object invoke = lVar.invoke(next);
            Object obj = linkedHashMap.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(next));
        }
        return linkedHashMap;
    }

    @C11314h(name = "minByOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: T3 */
    public static final <T, R extends Comparable<? super R>> T m40570T3(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            Comparable comparable = (Comparable) lVar.invoke(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.invoke(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super T, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.4")
    @org.jetbrains.annotations.C12579k
    /* renamed from: T4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> m40571T4(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r2, R r3, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super R, ? super T, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 9
            int r0 = kotlin.collections.C10978t.m41495Y(r2, r0)
            if (r0 != 0) goto L_0x0017
            java.util.List r2 = kotlin.collections.C10976s.m41419k(r3)
            return r2
        L_0x0017:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0025:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r2.next()
            java.lang.Object r3 = r4.invoke(r3, r0)
            r1.add(r3)
            goto L_0x0025
        L_0x0037:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40571T4(java.lang.Iterable, java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    @C12579k
    /* renamed from: T5 */
    public static final <T> List<T> m40572T5(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new ArrayList(collection);
    }

    @C11110f
    /* renamed from: U1 */
    public static final <T> int m40573U1(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return collection.size();
    }

    @C12579k
    /* renamed from: U2 */
    public static final <T, K, M extends Map<? super K, List<T>>> M m40574U2(@C12579k Iterable<? extends T> iterable, @C12579k M m, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        for (Object next : iterable) {
            Object invoke = lVar.invoke(next);
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(next);
        }
        return m;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: U3 */
    public static final <T> double m40575U3(Iterable<? extends T> iterable, C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.invoke(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.invoke(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.4")
    @org.jetbrains.annotations.C12579k
    /* renamed from: U4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> m40576U4(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r4, R r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 9
            int r0 = kotlin.collections.C10978t.m41495Y(r4, r0)
            if (r0 != 0) goto L_0x0017
            java.util.List r4 = kotlin.collections.C10976s.m41419k(r5)
            return r4
        L_0x0017:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r5)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L_0x0026:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r4.next()
            int r3 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r6.invoke(r0, r5, r2)
            r1.add(r5)
            r0 = r3
            goto L_0x0026
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40576U4(java.lang.Iterable, java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    @C12579k
    /* renamed from: U5 */
    public static final <T> Set<T> m40577U5(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) m40532L5(iterable, new LinkedHashSet());
    }

    @C12579k
    /* renamed from: V1 */
    public static final <T> List<T> m40578V1(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return m40557Q5(m40577U5(iterable));
    }

    @C12579k
    /* renamed from: V2 */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M m40579V2(@C12579k Iterable<? extends T> iterable, @C12579k M m, @C12579k C11300l<? super T, ? extends K> lVar, @C12579k C11300l<? super T, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        for (Object next : iterable) {
            Object invoke = lVar.invoke(next);
            Object obj = m.get(invoke);
            if (obj == null) {
                obj = new ArrayList();
                m.put(invoke, obj);
            }
            ((List) obj).add(lVar2.invoke(next));
        }
        return m;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: V3 */
    public static final <T> float m40580V3(Iterable<? extends T> iterable, C11300l<? super T, Float> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.invoke(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.invoke(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super S, ? super T, ? extends S>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    @org.jetbrains.annotations.C12579k
    /* renamed from: V4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> java.util.List<S> m40581V4(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super S, ? super T, ? extends S> r5) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.util.Iterator r0 = r4.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0019
            java.util.List r4 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            return r4
        L_0x0019:
            java.lang.Object r1 = r0.next()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r4 = kotlin.collections.C10978t.m41495Y(r4, r3)
            r2.<init>(r4)
            r2.add(r1)
        L_0x002b:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x003d
            java.lang.Object r4 = r0.next()
            java.lang.Object r1 = r5.invoke(r1, r4)
            r2.add(r1)
            goto L_0x002b
        L_0x003d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40581V4(java.lang.Iterable, kotlin.jvm.functions.p):java.util.List");
    }

    @C12579k
    /* renamed from: V5 */
    public static final <T> Set<T> m40582V5(@C12579k Iterable<? extends T> iterable) {
        Object obj;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return C10930d1.m40899r((Set) m40532L5(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return C10930d1.m40892k();
        }
        if (size != 1) {
            return (Set) m40532L5(iterable, new LinkedHashSet(C10975r0.m41400j(collection.size())));
        }
        if (iterable instanceof List) {
            obj = ((List) iterable).get(0);
        } else {
            obj = iterable.iterator().next();
        }
        return C10927c1.m40883f(obj);
    }

    @C12579k
    /* renamed from: W1 */
    public static final <T, K> List<T> m40583W1(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (hashSet.add(lVar.invoke(next))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: W2 */
    public static final <T, K> C10929d0<T, K> m40584W2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        return new C10897b(iterable, lVar);
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: W3 */
    public static final <T, R extends Comparable<? super R>> R m40585W3(Iterable<? extends T> iterable, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
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

    /* JADX WARNING: type inference failed for: r6v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super S, ? super T, ? extends S>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.4")
    @org.jetbrains.annotations.C12579k
    /* renamed from: W4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> java.util.List<S> m40586W4(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super S, ? super T, ? extends S> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.util.Iterator r0 = r5.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L_0x0019
            java.util.List r5 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            return r5
        L_0x0019:
            java.lang.Object r1 = r0.next()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r5 = kotlin.collections.C10978t.m41495Y(r5, r3)
            r2.<init>(r5)
            r2.add(r1)
            r5 = 1
        L_0x002c:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0045
            int r3 = r5 + 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r0.next()
            java.lang.Object r1 = r6.invoke(r5, r1, r4)
            r2.add(r1)
            r5 = r3
            goto L_0x002c
        L_0x0045:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40586W4(java.lang.Iterable, kotlin.jvm.functions.q):java.util.List");
    }

    @C12579k
    /* renamed from: W5 */
    public static final short[] m40587W5(@C12579k Collection<Short> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        short[] sArr = new short[collection.size()];
        int i = 0;
        for (Short shortValue : collection) {
            sArr[i] = shortValue.shortValue();
            i++;
        }
        return sArr;
    }

    @C12579k
    /* renamed from: X1 */
    public static final <T> List<T> m40588X1(@C12579k Iterable<? extends T> iterable, int i) {
        boolean z;
        ArrayList arrayList;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return m40557Q5(iterable);
        } else {
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    return CollectionsKt__CollectionsKt.m40441E();
                }
                if (size == 1) {
                    return C10976s.m41419k(m40644i3(iterable));
                }
                arrayList = new ArrayList(size);
                if (iterable instanceof List) {
                    if (iterable instanceof RandomAccess) {
                        int size2 = collection.size();
                        while (i < size2) {
                            arrayList.add(((List) iterable).get(i));
                            i++;
                        }
                    } else {
                        Iterator listIterator = ((List) iterable).listIterator(i);
                        while (listIterator.hasNext()) {
                            arrayList.add(listIterator.next());
                        }
                    }
                    return arrayList;
                }
            } else {
                arrayList = new ArrayList();
            }
            for (Object next : iterable) {
                if (i2 >= i) {
                    arrayList.add(next);
                } else {
                    i2++;
                }
            }
            return CollectionsKt__CollectionsKt.m40453Q(arrayList);
        }
    }

    /* renamed from: X2 */
    public static final <T> int m40589X2(@C12579k Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            if (Intrinsics.areEqual((Object) t, (Object) next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: X3 */
    public static final <T, R extends Comparable<? super R>> R m40590X3(Iterable<? extends T> iterable, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
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

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super T, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    @org.jetbrains.annotations.C12579k
    /* renamed from: X4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> m40591X4(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r2, R r3, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super R, ? super T, ? extends R> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 9
            int r0 = kotlin.collections.C10978t.m41495Y(r2, r0)
            if (r0 != 0) goto L_0x0017
            java.util.List r2 = kotlin.collections.C10976s.m41419k(r3)
            goto L_0x0038
        L_0x0017:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r3)
            java.util.Iterator r2 = r2.iterator()
        L_0x0025:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0037
            java.lang.Object r0 = r2.next()
            java.lang.Object r3 = r4.invoke(r3, r0)
            r1.add(r3)
            goto L_0x0025
        L_0x0037:
            r2 = r1
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40591X4(java.lang.Iterable, java.lang.Object, kotlin.jvm.functions.p):java.util.List");
    }

    @C12579k
    /* renamed from: X5 */
    public static final <T> Set<T> m40592X5(@C12579k Iterable<? extends T> iterable, @C12579k Iterable<? extends T> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(iterable2, "other");
        Set<T> U5 = m40577U5(iterable);
        C10994x.m42360n0(U5, iterable2);
        return U5;
    }

    @C12579k
    /* renamed from: Y1 */
    public static final <T> List<T> m40593Y1(@C12579k List<? extends T> list, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m40497E5(list, C11479u.m44447u(list.size() - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: Y2 */
    public static final <T> int m40594Y2(@C12579k List<? extends T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.indexOf(t);
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Y3 */
    public static final <T> Double m40595Y3(Iterable<? extends T> iterable, C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    @org.jetbrains.annotations.C12579k
    /* renamed from: Y4 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> java.util.List<R> m40596Y4(@org.jetbrains.annotations.C12579k java.lang.Iterable<? extends T> r4, R r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r6) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            r0 = 9
            int r0 = kotlin.collections.C10978t.m41495Y(r4, r0)
            if (r0 != 0) goto L_0x0017
            java.util.List r4 = kotlin.collections.C10976s.m41419k(r5)
            goto L_0x0040
        L_0x0017:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r0 = r0 + 1
            r1.<init>(r0)
            r1.add(r5)
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L_0x0026:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x003f
            java.lang.Object r2 = r4.next()
            int r3 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r5 = r6.invoke(r0, r5, r2)
            r1.add(r5)
            r0 = r3
            goto L_0x0026
        L_0x003f:
            r4 = r1
        L_0x0040:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt___CollectionsKt.m40596Y4(java.lang.Iterable, java.lang.Object, kotlin.jvm.functions.q):java.util.List");
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: Y5 */
    public static final <T> List<List<T>> m40597Y5(@C12579k Iterable<? extends T> iterable, int i, int i2, boolean z) {
        int i3;
        boolean z2;
        int B;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        SlidingWindowKt.m40748a(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator<List<T>> b = SlidingWindowKt.m40749b(iterable.iterator(), i, i2, z, false);
            while (b.hasNext()) {
                arrayList.add(b.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i4 = size / i2;
        if (size % i2 == 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ArrayList arrayList2 = new ArrayList(i4 + i3);
        int i5 = 0;
        while (true) {
            if (i5 < 0 || i5 >= size) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 || ((B = C11479u.m44313B(i, size - i5)) < i && !z)) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(B);
            for (int i6 = 0; i6 < B; i6++) {
                arrayList3.add(list.get(i6 + i5));
            }
            arrayList2.add(arrayList3);
            i5 += i2;
        }
        return arrayList2;
    }

    @C12579k
    /* renamed from: Z1 */
    public static final <T> List<T> m40598Z1(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if (!list.isEmpty()) {
            ListIterator<? extends T> listIterator = list.listIterator(list.size());
            while (listIterator.hasPrevious()) {
                if (!lVar.invoke(listIterator.previous()).booleanValue()) {
                    return m40497E5(list, listIterator.nextIndex() + 1);
                }
            }
        }
        return CollectionsKt__CollectionsKt.m40441E();
    }

    /* renamed from: Z2 */
    public static final <T> int m40599Z2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            if (lVar.invoke(next).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Z3 */
    public static final <T> Float m40600Z3(Iterable<? extends T> iterable, C11300l<? super T, Float> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.invoke(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11665v0(version = "1.3")
    /* renamed from: Z4 */
    public static final <T> void m40601Z4(@C12579k List<T> list, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        for (int G = CollectionsKt__CollectionsKt.m40443G(list); G > 0; G--) {
            int m = random.mo22986m(G + 1);
            list.set(m, list.set(G, list.get(m)));
        }
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: Z5 */
    public static final <T, R> List<R> m40602Z5(@C12579k Iterable<? extends T> iterable, int i, int i2, boolean z, @C12579k C11300l<? super List<? extends T>, ? extends R> lVar) {
        int i3;
        boolean z2;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        SlidingWindowKt.m40748a(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator<List<T>> b = SlidingWindowKt.m40749b(iterable.iterator(), i, i2, z, true);
            while (b.hasNext()) {
                arrayList.add(lVar.invoke(b.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i4 = size / i2;
        if (size % i2 == 0) {
            i3 = 0;
        } else {
            i3 = 1;
        }
        ArrayList arrayList2 = new ArrayList(i4 + i3);
        C10991v0 v0Var = new C10991v0(list);
        int i5 = 0;
        while (true) {
            if (i5 < 0 || i5 >= size) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                break;
            }
            int B = C11479u.m44313B(i, size - i5);
            if (!z && B < i) {
                break;
            }
            v0Var.mo22422h(i5, B + i5);
            arrayList2.add(lVar.invoke(v0Var));
            i5 += i2;
        }
        return arrayList2;
    }

    @C12579k
    /* renamed from: a2 */
    public static final <T> List<T> m40603a2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (Object next : iterable) {
            if (z) {
                arrayList.add(next);
            } else if (!lVar.invoke(next).booleanValue()) {
                arrayList.add(next);
                z = true;
            }
        }
        return arrayList;
    }

    /* renamed from: a3 */
    public static final <T> int m40604a3(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int i = 0;
        for (Object invoke : list) {
            if (lVar.invoke(invoke).booleanValue()) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: a4 */
    public static final <T, R> R m40605a4(Iterable<? extends T> iterable, Comparator<? super R> comparator, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
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

    /* renamed from: a5 */
    public static final <T> T m40606a5(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return m40616c5((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: a6 */
    public static /* synthetic */ List m40607a6(Iterable iterable, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m40597Y5(iterable, i, i2, z);
    }

    /* renamed from: b2 */
    public static final <T> T m40608b2(@C12579k Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        return m40618d2(iterable, i, new CollectionsKt___CollectionsKt$elementAt$1(i));
    }

    /* renamed from: b3 */
    public static final <T> int m40609b3(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int i = -1;
        int i2 = 0;
        for (Object next : iterable) {
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            if (lVar.invoke(next).booleanValue()) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: b4 */
    public static final <T, R> R m40610b4(Iterable<? extends T> iterable, Comparator<? super R> comparator, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
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

    /* renamed from: b5 */
    public static final <T> T m40611b5(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        T t = null;
        boolean z = false;
        for (T next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                if (!z) {
                    z = true;
                    t = next;
                } else {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: b6 */
    public static /* synthetic */ List m40612b6(Iterable iterable, int i, int i2, boolean z, C11300l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m40602Z5(iterable, i, i2, z, lVar);
    }

    @C11110f
    /* renamed from: c2 */
    public static final <T> T m40613c2(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.get(i);
    }

    /* renamed from: c3 */
    public static final <T> int m40614c3(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (lVar.invoke(listIterator.previous()).booleanValue()) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: c4 */
    public static final <T extends Comparable<? super T>> T m40615c4(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: c5 */
    public static final <T> T m40616c5(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    @C12579k
    /* renamed from: c6 */
    public static final <T> Iterable<C10942h0<T>> m40617c6(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new C10946i0(new CollectionsKt___CollectionsKt$withIndex$1(iterable));
    }

    /* renamed from: d2 */
    public static final <T> T m40618d2(@C12579k Iterable<? extends T> iterable, int i, @C12579k C11300l<? super Integer, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i < 0 || i > CollectionsKt__CollectionsKt.m40443G(list)) {
                return lVar.invoke(Integer.valueOf(i));
            }
            return list.get(i);
        } else if (i < 0) {
            return lVar.invoke(Integer.valueOf(i));
        } else {
            int i2 = 0;
            for (T next : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return next;
                }
                i2 = i3;
            }
            return lVar.invoke(Integer.valueOf(i));
        }
    }

    @C12579k
    /* renamed from: d3 */
    public static final <T> Set<T> m40619d3(@C12579k Iterable<? extends T> iterable, @C12579k Iterable<? extends T> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(iterable2, "other");
        Set<T> U5 = m40577U5(iterable);
        C10994x.m42354O0(U5, iterable2);
        return U5;
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: d4 */
    public static final Double m40620d4(@C12579k Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C12580l
    /* renamed from: d5 */
    public static final <T> T m40621d5(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @C12579k
    /* renamed from: d6 */
    public static final <T, R> List<Pair<T, R>> m40622d6(@C12579k Iterable<? extends T> iterable, @C12579k Iterable<? extends R> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(iterable2, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), C10978t.m41495Y(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C11078d1.m42659a(it.next(), it2.next()));
        }
        return arrayList;
    }

    @C11110f
    /* renamed from: e2 */
    public static final <T> T m40623e2(List<? extends T> list, int i, C11300l<? super Integer, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0 || i > CollectionsKt__CollectionsKt.m40443G(list)) {
            return lVar.invoke(Integer.valueOf(i));
        }
        return list.get(i);
    }

    @C12579k
    /* renamed from: e3 */
    public static final <T, A extends Appendable> A m40624e3(@C12579k Iterable<? extends T> iterable, @C12579k A a, @C12579k CharSequence charSequence, @C12579k CharSequence charSequence2, @C12579k CharSequence charSequence3, int i, @C12579k CharSequence charSequence4, @C12580l C11300l<? super T, ? extends CharSequence> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(a, "buffer");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C11615m.appendElement(a, next, lVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: e4 */
    public static final Float m40625e4(@C12579k Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C12580l
    /* renamed from: e5 */
    public static final <T> T m40626e5(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        boolean z = false;
        T t = null;
        for (T next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                if (z) {
                    return null;
                }
                z = true;
                t = next;
            }
        }
        if (!z) {
            return null;
        }
        return t;
    }

    @C12579k
    /* renamed from: e6 */
    public static final <T, R, V> List<V> m40627e6(@C12579k Iterable<? extends T> iterable, @C12579k Iterable<? extends R> iterable2, @C12579k C11304p<? super T, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(iterable2, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), C10978t.m41495Y(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(pVar.invoke(it.next(), it2.next()));
        }
        return arrayList;
    }

    @C12580l
    /* renamed from: f2 */
    public static final <T> T m40628f2(@C12579k Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return m40559R2((List) iterable, i);
        }
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T next : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return next;
            }
            i2 = i3;
        }
        return null;
    }

    /* renamed from: f3 */
    public static /* synthetic */ Appendable m40629f3(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l lVar, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        C11300l lVar2;
        if ((i2 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i2 & 4) != 0) {
            charSequence6 = charSequence8;
        } else {
            charSequence6 = charSequence2;
        }
        if ((i2 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i2 & 64) != 0) {
            lVar2 = null;
        } else {
            lVar2 = lVar;
        }
        return m40624e3(iterable, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, lVar2);
    }

    @C11314h(name = "minOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: f4 */
    public static final double m40630f4(@C12579k Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Double> it = iterable.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C12580l
    /* renamed from: f5 */
    public static final <T> T m40631f5(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @C12579k
    /* renamed from: f6 */
    public static final <T, R> List<Pair<T, R>> m40632f6(@C12579k Iterable<? extends T> iterable, @C12579k R[] rArr) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(rArr, "other");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), length));
        int i = 0;
        for (Object next : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(C11078d1.m42659a(next, rArr[i]));
            i++;
        }
        return arrayList;
    }

    @C11110f
    /* renamed from: g2 */
    public static final <T> T m40633g2(List<? extends T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return m40559R2(list, i);
    }

    @C12579k
    /* renamed from: g3 */
    public static final <T> String m40634g3(@C12579k Iterable<? extends T> iterable, @C12579k CharSequence charSequence, @C12579k CharSequence charSequence2, @C12579k CharSequence charSequence3, int i, @C12579k CharSequence charSequence4, @C12580l C11300l<? super T, ? extends CharSequence> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        String sb = ((StringBuilder) m40624e3(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @C11314h(name = "minOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: g4 */
    public static final float m40635g4(@C12579k Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<Float> it = iterable.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C12579k
    /* renamed from: g5 */
    public static final <T> List<T> m40636g5(@C12579k List<? extends T> list, @C12579k Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "indices");
        int Y = C10978t.m41495Y(iterable, 10);
        if (Y == 0) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList(Y);
        for (Integer intValue : iterable) {
            arrayList.add(list.get(intValue.intValue()));
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: g6 */
    public static final <T, R, V> List<V> m40637g6(@C12579k Iterable<? extends T> iterable, @C12579k R[] rArr, @C12579k C11304p<? super T, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(rArr, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int length = rArr.length;
        ArrayList arrayList = new ArrayList(Math.min(C10978t.m41495Y(iterable, 10), length));
        int i = 0;
        for (Object next : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(pVar.invoke(next, rArr[i]));
            i++;
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: h2 */
    public static final <T> List<T> m40638h2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: h3 */
    public static /* synthetic */ String m40639h3(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l lVar, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = charSequence6;
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            lVar = null;
        }
        return m40634g3(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    @C11314h(name = "minOrThrow")
    @C11665v0(version = "1.7")
    @C12579k
    /* renamed from: h4 */
    public static final <T extends Comparable<? super T>> T m40640h4(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T t = (Comparable) it.next();
            while (it.hasNext()) {
                T t2 = (Comparable) it.next();
                if (t.compareTo(t2) > 0) {
                    t = t2;
                }
            }
            return t;
        }
        throw new NoSuchElementException();
    }

    @C12579k
    /* renamed from: h5 */
    public static final <T> List<T> m40641h5(@C12579k List<? extends T> list, @C12579k C11466l lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "indices");
        if (lVar.isEmpty()) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        return m40557Q5(list.subList(lVar.getStart().intValue(), lVar.mo23013q().intValue() + 1));
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: h6 */
    public static final <T> List<Pair<T, T>> m40642h6(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList();
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            arrayList.add(C11078d1.m42659a(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: i2 */
    public static final <T> List<T> m40643i2(@C12579k Iterable<? extends T> iterable, @C12579k C11304p<? super Integer, ? super T, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            if (pVar.invoke(Integer.valueOf(i), next).booleanValue()) {
                arrayList.add(next);
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: i3 */
    public static final <T> T m40644i3(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return m40653k3((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: i4 */
    public static final <T> T m40645i4(@C12579k Iterable<? extends T> iterable, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* renamed from: i5 */
    public static final <T, R extends Comparable<? super R>> void m40646i5(@C12579k List<T> list, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (list.size() > 1) {
            C10992w.m42338m0(list, new C11006g.C11007a(lVar));
        }
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: i6 */
    public static final <T, R> List<R> m40647i6(@C12579k Iterable<? extends T> iterable, @C12579k C11304p<? super T, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return CollectionsKt__CollectionsKt.m40441E();
        }
        ArrayList arrayList = new ArrayList();
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            arrayList.add(pVar.invoke(next, next2));
            next = next2;
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: j2 */
    public static final <T, C extends Collection<? super T>> C m40648j2(@C12579k Iterable<? extends T> iterable, @C12579k C c, @C12579k C11304p<? super Integer, ? super T, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            if (pVar.invoke(Integer.valueOf(i), next).booleanValue()) {
                c.add(next);
            }
            i = i2;
        }
        return c;
    }

    /* renamed from: j3 */
    public static final <T> T m40649j3(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        T t = null;
        boolean z = false;
        for (T next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                z = true;
                t = next;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @C11314h(name = "minWithOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: j4 */
    public static final <T> T m40650j4(@C12579k Iterable<? extends T> iterable, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) > 0) {
                    next = next2;
                }
            }
            return next;
        }
        throw new NoSuchElementException();
    }

    /* renamed from: j5 */
    public static final <T, R extends Comparable<? super R>> void m40651j5(@C12579k List<T> list, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        if (list.size() > 1) {
            C10992w.m42338m0(list, new C11006g.C11009c(lVar));
        }
    }

    /* renamed from: k2 */
    public static final /* synthetic */ <R> List<R> m40652k2(Iterable<?> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (next instanceof Object) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: k3 */
    public static final <T> T m40653k3(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(CollectionsKt__CollectionsKt.m40443G(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    @C12579k
    /* renamed from: k4 */
    public static final <T> List<T> m40654k4(@C12579k Iterable<? extends T> iterable, @C12579k Iterable<? extends T> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(iterable2, "elements");
        Collection<? extends T> q0 = C10994x.m42363q0(iterable2);
        if (q0.isEmpty()) {
            return m40557Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!q0.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: k5 */
    public static final <T extends Comparable<? super T>> void m40655k5(@C12579k List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        C10992w.m42338m0(list, C11006g.m42436x());
    }

    /* renamed from: l2 */
    public static final /* synthetic */ <R, C extends Collection<? super R>> C m40656l2(Iterable<?> iterable, C c) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        for (Object next : iterable) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (next instanceof Object) {
                c.add(next);
            }
        }
        return c;
    }

    /* renamed from: l3 */
    public static final <T> T m40657l3(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (lVar.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    @C12579k
    /* renamed from: l4 */
    public static final <T> List<T> m40658l4(@C12579k Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        boolean z = false;
        for (Object next : iterable) {
            boolean z2 = true;
            if (!z && Intrinsics.areEqual((Object) next, (Object) t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: l5 */
    public static final <T extends Comparable<? super T>> List<T> m40659l5(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m40557Q5(iterable);
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C10956m.m41309v4((Comparable[]) array);
            return C10956m.m41290t(array);
        }
        List<T> S5 = m40567S5(iterable);
        C10992w.m42335j0(S5);
        return S5;
    }

    @C12579k
    /* renamed from: m2 */
    public static final <T> List<T> m40660m2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!lVar.invoke(next).booleanValue()) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: m3 */
    public static final <T> int m40661m3(@C12579k Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).lastIndexOf(t);
        }
        int i = -1;
        int i2 = 0;
        for (Object next : iterable) {
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            if (Intrinsics.areEqual((Object) t, (Object) next)) {
                i = i2;
            }
            i2++;
        }
        return i;
    }

    @C12579k
    /* renamed from: m4 */
    public static final <T> List<T> m40662m4(@C12579k Iterable<? extends T> iterable, @C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        List<? extends T> c3 = SequencesKt___SequencesKt.m44731c3(mVar);
        if (c3.isEmpty()) {
            return m40557Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!c3.contains(next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: m5 */
    public static final <T, R extends Comparable<? super R>> List<T> m40663m5(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return m40675p5(iterable, new C11006g.C11007a(lVar));
    }

    @C12579k
    /* renamed from: n2 */
    public static final <T> List<T> m40664n2(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (List) m40668o2(iterable, new ArrayList());
    }

    /* renamed from: n3 */
    public static final <T> int m40665n3(@C12579k List<? extends T> list, T t) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.lastIndexOf(t);
    }

    @C12579k
    /* renamed from: n4 */
    public static final <T> List<T> m40666n4(@C12579k Iterable<? extends T> iterable, @C12579k T[] tArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m40557Q5(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object next : iterable) {
            if (!ArraysKt___ArraysKt.m39388T8(tArr, next)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: n5 */
    public static final <T, R extends Comparable<? super R>> List<T> m40667n5(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return m40675p5(iterable, new C11006g.C11009c(lVar));
    }

    @C12579k
    /* renamed from: o2 */
    public static final <C extends Collection<? super T>, T> C m40668o2(@C12579k Iterable<? extends T> iterable, @C12579k C c) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    @C12580l
    /* renamed from: o3 */
    public static final <T> T m40669o3(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    @C11110f
    /* renamed from: o4 */
    public static final <T> List<T> m40670o4(Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return m40658l4(iterable, t);
    }

    @C12579k
    /* renamed from: o5 */
    public static final <T extends Comparable<? super T>> List<T> m40671o5(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return m40675p5(iterable, C11006g.m42436x());
    }

    @C12579k
    /* renamed from: p2 */
    public static final <T, C extends Collection<? super T>> C m40672p2(@C12579k Iterable<? extends T> iterable, @C12579k C c, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (Object next : iterable) {
            if (!lVar.invoke(next).booleanValue()) {
                c.add(next);
            }
        }
        return c;
    }

    @C12580l
    /* renamed from: p3 */
    public static final <T> T m40673p3(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        T t = null;
        for (T next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                t = next;
            }
        }
        return t;
    }

    /* renamed from: p4 */
    public static final <T> boolean m40674p4(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).isEmpty();
        }
        return !iterable.iterator().hasNext();
    }

    @C12579k
    /* renamed from: p5 */
    public static final <T> List<T> m40675p5(@C12579k Iterable<? extends T> iterable, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return m40557Q5(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            C10956m.m41067I4(array, comparator);
            return C10956m.m41290t(array);
        }
        List<T> S5 = m40567S5(iterable);
        C10992w.m42338m0(S5, comparator);
        return S5;
    }

    @C12579k
    /* renamed from: q2 */
    public static final <T, C extends Collection<? super T>> C m40676q2(@C12579k Iterable<? extends T> iterable, @C12579k C c, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (Object next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                c.add(next);
            }
        }
        return c;
    }

    @C12580l
    /* renamed from: q3 */
    public static final <T> T m40677q3(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: q4 */
    public static final <T> boolean m40678q4(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object invoke : iterable) {
            if (lVar.invoke(invoke).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C12579k
    /* renamed from: q5 */
    public static final <T> Set<T> m40679q5(@C12579k Iterable<? extends T> iterable, @C12579k Iterable<? extends T> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(iterable2, "other");
        Set<T> U5 = m40577U5(iterable);
        C10994x.m42344E0(U5, iterable2);
        return U5;
    }

    /* renamed from: r1 */
    public static final <T> boolean m40680r1(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object invoke : iterable) {
            if (!lVar.invoke(invoke).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C11110f
    /* renamed from: r2 */
    public static final <T> T m40681r2(Iterable<? extends T> iterable, C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (T next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    @C12580l
    /* renamed from: r3 */
    public static final <T> T m40682r3(@C12579k List<? extends T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (lVar.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: r4 */
    public static final <T, C extends Iterable<? extends T>> C m40683r4(@C12579k C c, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        for (Object invoke : c) {
            lVar.invoke(invoke);
        }
        return c;
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11398l(warningSince = "1.5")
    /* renamed from: r5 */
    public static final <T> int m40684r5(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Integer> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int i = 0;
        for (Object invoke : iterable) {
            i += lVar.invoke(invoke).intValue();
        }
        return i;
    }

    /* renamed from: s1 */
    public static final <T> boolean m40685s1(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return !((Collection) iterable).isEmpty();
        }
        return iterable.iterator().hasNext();
    }

    @C11110f
    /* renamed from: s2 */
    public static final <T> T m40686s2(Iterable<? extends T> iterable, C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        T t = null;
        for (T next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                t = next;
            }
        }
        return t;
    }

    @C12579k
    /* renamed from: s3 */
    public static final <T, R> List<R> m40687s3(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        for (Object invoke : iterable) {
            arrayList.add(lVar.invoke(invoke));
        }
        return arrayList;
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: s4 */
    public static final <T, C extends Iterable<? extends T>> C m40688s4(@C12579k C c, @C12579k C11304p<? super Integer, ? super T, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int i = 0;
        for (Object next : c) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            pVar.invoke(Integer.valueOf(i), next);
            i = i2;
        }
        return c;
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11398l(warningSince = "1.5")
    /* renamed from: s5 */
    public static final <T> double m40689s5(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        double d = 0.0d;
        for (Object invoke : iterable) {
            d += lVar.invoke(invoke).doubleValue();
        }
        return d;
    }

    /* renamed from: t1 */
    public static final <T> boolean m40690t1(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return false;
        }
        for (Object invoke : iterable) {
            if (lVar.invoke(invoke).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @C11110f
    /* renamed from: t2 */
    public static final <T> T m40691t2(List<? extends T> list, C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ListIterator<? extends T> listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            T previous = listIterator.previous();
            if (lVar.invoke(previous).booleanValue()) {
                return previous;
            }
        }
        return null;
    }

    @C12579k
    /* renamed from: t3 */
    public static final <T, R> List<R> m40692t3(@C12579k Iterable<? extends T> iterable, @C12579k C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList(C10978t.m41495Y(iterable, 10));
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            arrayList.add(pVar.invoke(Integer.valueOf(i), next));
            i = i2;
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: t4 */
    public static final <T> Pair<List<T>, List<T>> m40693t4(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @C11314h(name = "sumOfByte")
    /* renamed from: t5 */
    public static final int m40694t5(@C12579k Iterable<Byte> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i = 0;
        for (Byte byteValue : iterable) {
            i += byteValue.byteValue();
        }
        return i;
    }

    @C11110f
    /* renamed from: u1 */
    public static final <T> Iterable<T> m40695u1(Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return iterable;
    }

    /* renamed from: u2 */
    public static final <T> T m40696u2(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            return m40706w2((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    @C12579k
    /* renamed from: u3 */
    public static final <T, R> List<R> m40697u3(@C12579k Iterable<? extends T> iterable, @C12579k C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            Object invoke = pVar.invoke(Integer.valueOf(i), next);
            if (invoke != null) {
                arrayList.add(invoke);
            }
            i = i2;
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: u4 */
    public static final <T> List<T> m40698u4(@C12579k Iterable<? extends T> iterable, @C12579k Iterable<? extends T> iterable2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(iterable2, "elements");
        if (iterable instanceof Collection) {
            return m40718y4((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        C10994x.m42360n0(arrayList, iterable);
        C10994x.m42360n0(arrayList, iterable2);
        return arrayList;
    }

    @C11314h(name = "sumOfDouble")
    /* renamed from: u5 */
    public static final double m40699u5(@C12579k Iterable<Double> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        double d = 0.0d;
        for (Double doubleValue : iterable) {
            d += doubleValue.doubleValue();
        }
        return d;
    }

    @C12579k
    /* renamed from: v1 */
    public static final <T> C11559m<T> m40700v1(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return new C10896a(iterable);
    }

    /* renamed from: v2 */
    public static final <T> T m40701v2(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (T next : iterable) {
            if (lVar.invoke(next).booleanValue()) {
                return next;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @C12579k
    /* renamed from: v3 */
    public static final <T, R, C extends Collection<? super R>> C m40702v3(@C12579k Iterable<? extends T> iterable, @C12579k C c, @C12579k C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            Object invoke = pVar.invoke(Integer.valueOf(i), next);
            if (invoke != null) {
                c.add(invoke);
            }
            i = i2;
        }
        return c;
    }

    @C12579k
    /* renamed from: v4 */
    public static final <T> List<T> m40703v4(@C12579k Iterable<? extends T> iterable, T t) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return m40723z4((Collection) iterable, t);
        }
        ArrayList arrayList = new ArrayList();
        C10994x.m42360n0(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    @C11110f
    @C11314h(name = "sumOfDouble")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: v5 */
    public static final <T> double m40704v5(Iterable<? extends T> iterable, C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        double d = 0.0d;
        for (Object invoke : iterable) {
            d += lVar.invoke(invoke).doubleValue();
        }
        return d;
    }

    @C12579k
    /* renamed from: w1 */
    public static final <T, K, V> Map<K, V> m40705w1(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends Pair<? extends K, ? extends V>> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10978t.m41495Y(iterable, 10)), 16));
        for (Object invoke : iterable) {
            Pair pair = (Pair) lVar.invoke(invoke);
            linkedHashMap.put(pair.mo21849e(), pair.mo21851f());
        }
        return linkedHashMap;
    }

    /* renamed from: w2 */
    public static final <T> T m40706w2(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @C12579k
    /* renamed from: w3 */
    public static final <T, R, C extends Collection<? super R>> C m40707w3(@C12579k Iterable<? extends T> iterable, @C12579k C c, @C12579k C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            c.add(pVar.invoke(Integer.valueOf(i), next));
            i = i2;
        }
        return c;
    }

    @C12579k
    /* renamed from: w4 */
    public static final <T> List<T> m40708w4(@C12579k Iterable<? extends T> iterable, @C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        ArrayList arrayList = new ArrayList();
        C10994x.m42360n0(arrayList, iterable);
        C10994x.m42361o0(arrayList, mVar);
        return arrayList;
    }

    @C11314h(name = "sumOfFloat")
    /* renamed from: w5 */
    public static final float m40709w5(@C12579k Iterable<Float> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        float f = 0.0f;
        for (Float floatValue : iterable) {
            f += floatValue.floatValue();
        }
        return f;
    }

    @C12579k
    /* renamed from: x1 */
    public static final <T, K> Map<K, T> m40710x1(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10978t.m41495Y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(lVar.invoke(next), next);
        }
        return linkedHashMap;
    }

    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: x2 */
    public static final <T, R> R m40711x2(Iterable<? extends T> iterable, C11300l<? super T, ? extends R> lVar) {
        R r;
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        Iterator<? extends T> it = iterable.iterator();
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
        throw new NoSuchElementException("No element of the collection was transformed to a non-null value.");
    }

    @C12579k
    /* renamed from: x3 */
    public static final <T, R> List<R> m40712x3(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        ArrayList arrayList = new ArrayList();
        for (Object invoke : iterable) {
            Object invoke2 = lVar.invoke(invoke);
            if (invoke2 != null) {
                arrayList.add(invoke2);
            }
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: x4 */
    public static final <T> List<T> m40713x4(@C12579k Iterable<? extends T> iterable, @C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        if (iterable instanceof Collection) {
            return m40481B4((Collection) iterable, tArr);
        }
        ArrayList arrayList = new ArrayList();
        C10994x.m42360n0(arrayList, iterable);
        C10994x.m42362p0(arrayList, tArr);
        return arrayList;
    }

    @C11314h(name = "sumOfInt")
    /* renamed from: x5 */
    public static final int m40714x5(@C12579k Iterable<Integer> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int i = 0;
        for (Integer intValue : iterable) {
            i += intValue.intValue();
        }
        return i;
    }

    @C12579k
    /* renamed from: y1 */
    public static final <T, K, V> Map<K, V> m40715y1(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, ? extends K> lVar, @C12579k C11300l<? super T, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap(C11479u.m44447u(C10975r0.m41400j(C10978t.m41495Y(iterable, 10)), 16));
        for (Object next : iterable) {
            linkedHashMap.put(lVar.invoke(next), lVar2.invoke(next));
        }
        return linkedHashMap;
    }

    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: y2 */
    public static final <T, R> R m40716y2(Iterable<? extends T> iterable, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : iterable) {
            R invoke2 = lVar.invoke(invoke);
            if (invoke2 != null) {
                return invoke2;
            }
        }
        return null;
    }

    @C12579k
    /* renamed from: y3 */
    public static final <T, R, C extends Collection<? super R>> C m40717y3(@C12579k Iterable<? extends T> iterable, @C12579k C c, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : iterable) {
            Object invoke2 = lVar.invoke(invoke);
            if (invoke2 != null) {
                c.add(invoke2);
            }
        }
        return c;
    }

    @C12579k
    /* renamed from: y4 */
    public static final <T> List<T> m40718y4(@C12579k Collection<? extends T> collection, @C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C10994x.m42360n0(arrayList2, iterable);
        return arrayList2;
    }

    @C11110f
    @C11314h(name = "sumOfInt")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: y5 */
    public static final <T> int m40719y5(Iterable<? extends T> iterable, C11300l<? super T, Integer> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int i = 0;
        for (Object invoke : iterable) {
            i += lVar.invoke(invoke).intValue();
        }
        return i;
    }

    @C12579k
    /* renamed from: z1 */
    public static final <T, K, M extends Map<? super K, ? super T>> M m40720z1(@C12579k Iterable<? extends T> iterable, @C12579k M m, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        for (Object next : iterable) {
            m.put(lVar.invoke(next), next);
        }
        return m;
    }

    @C12580l
    /* renamed from: z2 */
    public static final <T> T m40721z2(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    @C12579k
    /* renamed from: z3 */
    public static final <T, R, C extends Collection<? super R>> C m40722z3(@C12579k Iterable<? extends T> iterable, @C12579k C c, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : iterable) {
            c.add(lVar.invoke(invoke));
        }
        return c;
    }

    @C12579k
    /* renamed from: z4 */
    public static final <T> List<T> m40723z4(@C12579k Collection<? extends T> collection, T t) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    @C11314h(name = "sumOfLong")
    /* renamed from: z5 */
    public static final long m40724z5(@C12579k Iterable<Long> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        long j = 0;
        for (Long longValue : iterable) {
            j += longValue.longValue();
        }
        return j;
    }
}
