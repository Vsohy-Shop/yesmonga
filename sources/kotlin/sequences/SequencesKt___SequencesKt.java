package kotlin.sequences;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
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
import kotlin.collections.C10929d0;
import kotlin.collections.C10930d1;
import kotlin.collections.C10942h0;
import kotlin.collections.C10956m;
import kotlin.collections.C10992w;
import kotlin.collections.C10994x;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.SlidingWindowKt;
import kotlin.comparisons.C11006g;
import kotlin.coroutines.C11045c;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlin.text.C11615m;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,3094:1\n179#1,2:3095\n316#1,7:3097\n1306#1,3:3105\n739#1,4:3108\n704#1,4:3112\n722#1,4:3116\n775#1,4:3120\n999#1,3:3124\n1002#1,3:3134\n1019#1,3:3137\n1022#1,3:3147\n1306#1,3:3164\n1295#1,2:3167\n1#2:3104\n361#3,7:3127\n361#3,7:3140\n361#3,7:3150\n361#3,7:3157\n*S KotlinDebug\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n87#1:3095,2\n99#1:3097,7\n458#1:3105,3\n658#1:3108,4\n674#1:3112,4\n689#1:3116,4\n760#1:3120,4\n970#1:3124,3\n970#1:3134,3\n985#1:3137,3\n985#1:3147,3\n1088#1:3164,3\n1126#1:3167,2\n970#1:3127,7\n985#1:3140,7\n1001#1:3150,7\n1021#1:3157,7\n*E\n"})
public class SequencesKt___SequencesKt extends SequencesKt___SequencesJvmKt {

    @C11363r0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,70:1\n2903#2:71\n*E\n"})
    /* renamed from: kotlin.sequences.SequencesKt___SequencesKt$a */
    public static final class C11536a implements Iterable<T>, C11345a {

        /* renamed from: a */
        public final /* synthetic */ C11559m f28669a;

        public C11536a(C11559m mVar) {
            this.f28669a = mVar;
        }

        @C12579k
        public Iterator<T> iterator() {
            return this.f28669a.iterator();
        }
    }

    @C11363r0({"SMAP\n_Sequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt$groupingBy$1\n*L\n1#1,3094:1\n*E\n"})
    /* renamed from: kotlin.sequences.SequencesKt___SequencesKt$b */
    public static final class C11537b implements C10929d0<T, K> {

        /* renamed from: a */
        public final /* synthetic */ C11559m<T> f28670a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<T, K> f28671b;

        public C11537b(C11559m<? extends T> mVar, C11300l<? super T, ? extends K> lVar) {
            this.f28670a = mVar;
            this.f28671b = lVar;
        }

        /* renamed from: a */
        public K mo21944a(T t) {
            return this.f28671b.invoke(t);
        }

        @C12579k
        /* renamed from: b */
        public Iterator<T> mo21945b() {
            return this.f28670a.iterator();
        }
    }

    /* renamed from: kotlin.sequences.SequencesKt___SequencesKt$c */
    public static final class C11538c implements C11559m<T> {

        /* renamed from: a */
        public final /* synthetic */ C11559m<T> f28672a;

        public C11538c(C11559m<? extends T> mVar) {
            this.f28672a = mVar;
        }

        @C12579k
        public Iterator<T> iterator() {
            List<T> d3 = SequencesKt___SequencesKt.m44735d3(this.f28672a);
            C10992w.m42335j0(d3);
            return d3.iterator();
        }
    }

    /* renamed from: kotlin.sequences.SequencesKt___SequencesKt$d */
    public static final class C11539d implements C11559m<T> {

        /* renamed from: a */
        public final /* synthetic */ C11559m<T> f28673a;

        /* renamed from: b */
        public final /* synthetic */ Comparator<? super T> f28674b;

        public C11539d(C11559m<? extends T> mVar, Comparator<? super T> comparator) {
            this.f28673a = mVar;
            this.f28674b = comparator;
        }

        @C12579k
        public Iterator<T> iterator() {
            List<T> d3 = SequencesKt___SequencesKt.m44735d3(this.f28673a);
            C10992w.m42338m0(d3, this.f28674b);
            return d3.iterator();
        }
    }

    @C11110f
    /* renamed from: A0 */
    public static final <T> T m44626A0(C11559m<? extends T> mVar, C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        T t = null;
        for (T next : mVar) {
            if (lVar.invoke(next).booleanValue()) {
                t = next;
            }
        }
        return t;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: A1 */
    public static final <T, R> R m44627A1(C11559m<? extends T> mVar, Comparator<? super R> comparator, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    /* renamed from: A2 */
    public static final <T, R> C11559m<R> m44628A2(@C12579k C11559m<? extends T> mVar, R r, @C12579k C11304p<? super R, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        return m44803w2(mVar, r, pVar);
    }

    /* renamed from: B0 */
    public static final <T> T m44629B0(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: B1 */
    public static final <T, R> R m44630B1(C11559m<? extends T> mVar, Comparator<? super R> comparator, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    /* renamed from: B2 */
    public static final <T, R> C11559m<R> m44631B2(@C12579k C11559m<? extends T> mVar, R r, @C12579k C11305q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        return m44806x2(mVar, r, qVar);
    }

    /* renamed from: C0 */
    public static final <T> T m44632C0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (T next : mVar) {
            if (lVar.invoke(next).booleanValue()) {
                return next;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: C1 */
    public static final <T extends Comparable<? super T>> T m44633C1(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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

    /* renamed from: C2 */
    public static final <T> T m44634C2(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Sequence has more than one element.");
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: D0 */
    public static final <T, R> R m44635D0(C11559m<? extends T> mVar, C11300l<? super T, ? extends R> lVar) {
        R r;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        Iterator<? extends T> it = mVar.iterator();
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
        throw new NoSuchElementException("No element of the sequence was transformed to a non-null value.");
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: D1 */
    public static final Double m44636D1(@C12579k C11559m<Double> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    /* renamed from: D2 */
    public static final <T> T m44637D2(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        T t = null;
        boolean z = false;
        for (T next : mVar) {
            if (lVar.invoke(next).booleanValue()) {
                if (!z) {
                    z = true;
                    t = next;
                } else {
                    throw new IllegalArgumentException("Sequence contains more than one matching element.");
                }
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @C11110f
    @C11665v0(version = "1.5")
    /* renamed from: E0 */
    public static final <T, R> R m44638E0(C11559m<? extends T> mVar, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : mVar) {
            R invoke2 = lVar.invoke(invoke);
            if (invoke2 != null) {
                return invoke2;
            }
        }
        return null;
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: E1 */
    public static final Float m44639E1(@C12579k C11559m<Float> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C12580l
    /* renamed from: E2 */
    public static final <T> T m44640E2(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    @C12580l
    /* renamed from: F0 */
    public static final <T> T m44641F0(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    @C11314h(name = "maxOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: F1 */
    public static final double m44642F1(@C12579k C11559m<Double> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C12580l
    /* renamed from: F2 */
    public static final <T> T m44643F2(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        boolean z = false;
        T t = null;
        for (T next : mVar) {
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

    @C12580l
    /* renamed from: G0 */
    public static final <T> T m44644G0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (T next : mVar) {
            if (lVar.invoke(next).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    @C11314h(name = "maxOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: G1 */
    public static final float m44645G1(@C12579k C11559m<Float> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = it.next().floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, it.next().floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C12579k
    /* renamed from: G2 */
    public static final <T extends Comparable<? super T>> C11559m<T> m44646G2(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new C11538c(mVar);
    }

    @C12579k
    /* renamed from: H0 */
    public static final <T, R> C11559m<R> m44647H0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends C11559m<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        return new C11551i(mVar, lVar, SequencesKt___SequencesKt$flatMap$2.f28680a);
    }

    @C11314h(name = "maxOrThrow")
    @C11665v0(version = "1.7")
    @C12579k
    /* renamed from: H1 */
    public static final <T extends Comparable<? super T>> T m44648H1(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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

    @C12579k
    /* renamed from: H2 */
    public static final <T, R extends Comparable<? super R>> C11559m<T> m44649H2(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return m44659K2(mVar, new C11006g.C11007a(lVar));
    }

    @C11314h(name = "flatMapIndexedIterable")
    @C11665v0(version = "1.4")
    @C11403m0
    @C12579k
    /* renamed from: I0 */
    public static final <T, R> C11559m<R> m44650I0(@C12579k C11559m<? extends T> mVar, @C12579k C11304p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        return SequencesKt__SequencesKt.m44591h(mVar, pVar, SequencesKt___SequencesKt$flatMapIndexed$1.f28681a);
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: I1 */
    public static final <T> T m44651I1(@C12579k C11559m<? extends T> mVar, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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
    /* renamed from: I2 */
    public static final <T, R extends Comparable<? super R>> C11559m<T> m44652I2(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return m44659K2(mVar, new C11006g.C11009c(lVar));
    }

    @C11110f
    @C11314h(name = "flatMapIndexedIterableTo")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: J0 */
    public static final <T, R, C extends Collection<? super R>> C m44653J0(C11559m<? extends T> mVar, C c, C11304p<? super Integer, ? super T, ? extends Iterable<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int i = 0;
        for (Object next : mVar) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C10994x.m42360n0(c, (Iterable) pVar.invoke(Integer.valueOf(i), next));
            i = i2;
        }
        return c;
    }

    @C11314h(name = "maxWithOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: J1 */
    public static final <T> T m44654J1(@C12579k C11559m<? extends T> mVar, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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
    /* renamed from: J2 */
    public static final <T extends Comparable<? super T>> C11559m<T> m44655J2(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m44659K2(mVar, C11006g.m42436x());
    }

    /* renamed from: K */
    public static final <T> boolean m44656K(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (Object invoke : mVar) {
            if (!lVar.invoke(invoke).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    @C11314h(name = "flatMapIndexedSequence")
    @C11665v0(version = "1.4")
    @C11403m0
    @C12579k
    /* renamed from: K0 */
    public static final <T, R> C11559m<R> m44657K0(@C12579k C11559m<? extends T> mVar, @C12579k C11304p<? super Integer, ? super T, ? extends C11559m<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        return SequencesKt__SequencesKt.m44591h(mVar, pVar, SequencesKt___SequencesKt$flatMapIndexed$2.f28682a);
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: K1 */
    public static final <T, R extends Comparable<? super R>> T m44658K1(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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
    /* renamed from: K2 */
    public static final <T> C11559m<T> m44659K2(@C12579k C11559m<? extends T> mVar, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new C11539d(mVar, comparator);
    }

    /* renamed from: L */
    public static final <T> boolean m44660L(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return mVar.iterator().hasNext();
    }

    @C11110f
    @C11314h(name = "flatMapIndexedSequenceTo")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: L0 */
    public static final <T, R, C extends Collection<? super R>> C m44661L0(C11559m<? extends T> mVar, C c, C11304p<? super Integer, ? super T, ? extends C11559m<? extends R>> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int i = 0;
        for (Object next : mVar) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            C10994x.m42361o0(c, (C11559m) pVar.invoke(Integer.valueOf(i), next));
            i = i2;
        }
        return c;
    }

    @C11314h(name = "minByOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: L1 */
    public static final <T, R extends Comparable<? super R>> T m44662L1(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11398l(warningSince = "1.5")
    /* renamed from: L2 */
    public static final <T> int m44663L2(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Integer> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int i = 0;
        for (Object invoke : mVar) {
            i += lVar.invoke(invoke).intValue();
        }
        return i;
    }

    /* renamed from: M */
    public static final <T> boolean m44664M(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (Object invoke : mVar) {
            if (lVar.invoke(invoke).booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @C11314h(name = "flatMapIterable")
    @C11665v0(version = "1.4")
    @C11403m0
    @C12579k
    /* renamed from: M0 */
    public static final <T, R> C11559m<R> m44665M0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        return new C11551i(mVar, lVar, SequencesKt___SequencesKt$flatMap$1.f28679a);
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: M1 */
    public static final <T> double m44666M1(C11559m<? extends T> mVar, C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.invoke(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, lVar.invoke(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11395k(message = "Use sumOf instead.", replaceWith = @C11587t0(expression = "this.sumOf(selector)", imports = {}))
    @C11398l(warningSince = "1.5")
    /* renamed from: M2 */
    public static final <T> double m44667M2(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        double d = 0.0d;
        for (Object invoke : mVar) {
            d += lVar.invoke(invoke).doubleValue();
        }
        return d;
    }

    @C12579k
    /* renamed from: N */
    public static final <T> Iterable<T> m44668N(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new C11536a(mVar);
    }

    @C11314h(name = "flatMapIterableTo")
    @C11665v0(version = "1.4")
    @C11403m0
    @C12579k
    /* renamed from: N0 */
    public static final <T, R, C extends Collection<? super R>> C m44669N0(@C12579k C11559m<? extends T> mVar, @C12579k C c, @C12579k C11300l<? super T, ? extends Iterable<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : mVar) {
            C10994x.m42360n0(c, (Iterable) lVar.invoke(invoke));
        }
        return c;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: N1 */
    public static final <T> float m44670N1(C11559m<? extends T> mVar, C11300l<? super T, Float> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.invoke(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.min(floatValue, lVar.invoke(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C11314h(name = "sumOfByte")
    /* renamed from: N2 */
    public static final int m44671N2(@C12579k C11559m<Byte> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        int i = 0;
        for (Byte byteValue : mVar) {
            i += byteValue.byteValue();
        }
        return i;
    }

    @C11110f
    /* renamed from: O */
    public static final <T> C11559m<T> m44672O(C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return mVar;
    }

    @C12579k
    /* renamed from: O0 */
    public static final <T, R, C extends Collection<? super R>> C m44673O0(@C12579k C11559m<? extends T> mVar, @C12579k C c, @C12579k C11300l<? super T, ? extends C11559m<? extends R>> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : mVar) {
            C10994x.m42361o0(c, (C11559m) lVar.invoke(invoke));
        }
        return c;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: O1 */
    public static final <T, R extends Comparable<? super R>> R m44674O1(C11559m<? extends T> mVar, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @C11314h(name = "sumOfDouble")
    /* renamed from: O2 */
    public static final double m44675O2(@C12579k C11559m<Double> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        double d = 0.0d;
        for (Double doubleValue : mVar) {
            d += doubleValue.doubleValue();
        }
        return d;
    }

    @C12579k
    /* renamed from: P */
    public static final <T, K, V> Map<K, V> m44676P(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends Pair<? extends K, ? extends V>> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object invoke : mVar) {
            Pair pair = (Pair) lVar.invoke(invoke);
            linkedHashMap.put(pair.mo21849e(), pair.mo21851f());
        }
        return linkedHashMap;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super T, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: P0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R m44677P0(@org.jetbrains.annotations.C12579k kotlin.sequences.C11559m<? extends T> r1, R r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super R, ? super T, ? extends R> r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.m44677P0(kotlin.sequences.m, java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: P1 */
    public static final <T, R extends Comparable<? super R>> R m44678P1(C11559m<? extends T> mVar, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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
    @C11314h(name = "sumOfDouble")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: P2 */
    public static final <T> double m44679P2(C11559m<? extends T> mVar, C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        double d = 0.0d;
        for (Object invoke : mVar) {
            d += lVar.invoke(invoke).doubleValue();
        }
        return d;
    }

    @C12579k
    /* renamed from: Q */
    public static final <T, K> Map<K, T> m44680Q(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : mVar) {
            linkedHashMap.put(lVar.invoke(next), next);
        }
        return linkedHashMap;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Q0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T, R> R m44681Q0(@org.jetbrains.annotations.C12579k kotlin.sequences.C11559m<? extends T> r3, R r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.m44681Q0(kotlin.sequences.m, java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: Q1 */
    public static final <T> Double m44682Q1(C11559m<? extends T> mVar, C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, lVar.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11314h(name = "sumOfFloat")
    /* renamed from: Q2 */
    public static final float m44683Q2(@C12579k C11559m<Float> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        float f = 0.0f;
        for (Float floatValue : mVar) {
            f += floatValue.floatValue();
        }
        return f;
    }

    @C12579k
    /* renamed from: R */
    public static final <T, K, V> Map<K, V> m44684R(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends K> lVar, @C12579k C11300l<? super T, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : mVar) {
            linkedHashMap.put(lVar.invoke(next), lVar2.invoke(next));
        }
        return linkedHashMap;
    }

    /* renamed from: R0 */
    public static final <T> void m44685R0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        for (Object invoke : mVar) {
            lVar.invoke(invoke);
        }
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: R1 */
    public static final <T> Float m44686R1(C11559m<? extends T> mVar, C11300l<? super T, Float> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, lVar.invoke(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11314h(name = "sumOfInt")
    /* renamed from: R2 */
    public static final int m44687R2(@C12579k C11559m<Integer> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        int i = 0;
        for (Integer intValue : mVar) {
            i += intValue.intValue();
        }
        return i;
    }

    @C12579k
    /* renamed from: S */
    public static final <T, K, M extends Map<? super K, ? super T>> M m44688S(@C12579k C11559m<? extends T> mVar, @C12579k M m, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        for (Object next : mVar) {
            m.put(lVar.invoke(next), next);
        }
        return m;
    }

    /* renamed from: S0 */
    public static final <T> void m44689S0(@C12579k C11559m<? extends T> mVar, @C12579k C11304p<? super Integer, ? super T, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        int i = 0;
        for (Object next : mVar) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            pVar.invoke(Integer.valueOf(i), next);
            i = i2;
        }
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: S1 */
    public static final <T, R> R m44690S1(C11559m<? extends T> mVar, Comparator<? super R> comparator, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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
    @C11314h(name = "sumOfInt")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: S2 */
    public static final <T> int m44691S2(C11559m<? extends T> mVar, C11300l<? super T, Integer> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int i = 0;
        for (Object invoke : mVar) {
            i += lVar.invoke(invoke).intValue();
        }
        return i;
    }

    @C12579k
    /* renamed from: T */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M m44692T(@C12579k C11559m<? extends T> mVar, @C12579k M m, @C12579k C11300l<? super T, ? extends K> lVar, @C12579k C11300l<? super T, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        for (Object next : mVar) {
            m.put(lVar.invoke(next), lVar2.invoke(next));
        }
        return m;
    }

    @C12579k
    /* renamed from: T0 */
    public static final <T, K> Map<K, List<T>> m44693T0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : mVar) {
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

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: T1 */
    public static final <T, R> R m44694T1(C11559m<? extends T> mVar, Comparator<? super R> comparator, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @C11314h(name = "sumOfLong")
    /* renamed from: T2 */
    public static final long m44695T2(@C12579k C11559m<Long> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        long j = 0;
        for (Long longValue : mVar) {
            j += longValue.longValue();
        }
        return j;
    }

    @C12579k
    /* renamed from: U */
    public static final <T, K, V, M extends Map<? super K, ? super V>> M m44696U(@C12579k C11559m<? extends T> mVar, @C12579k M m, @C12579k C11300l<? super T, ? extends Pair<? extends K, ? extends V>> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : mVar) {
            Pair pair = (Pair) lVar.invoke(invoke);
            m.put(pair.mo21849e(), pair.mo21851f());
        }
        return m;
    }

    @C12579k
    /* renamed from: U0 */
    public static final <T, K, V> Map<K, List<V>> m44697U0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends K> lVar, @C12579k C11300l<? super T, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : mVar) {
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

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: U1 */
    public static final <T extends Comparable<? super T>> T m44698U1(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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

    @C11110f
    @C11314h(name = "sumOfLong")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: U2 */
    public static final <T> long m44699U2(C11559m<? extends T> mVar, C11300l<? super T, Long> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        long j = 0;
        for (Object invoke : mVar) {
            j += lVar.invoke(invoke).longValue();
        }
        return j;
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: V */
    public static final <K, V> Map<K, V> m44700V(@C12579k C11559m<? extends K> mVar, @C12579k C11300l<? super K, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object next : mVar) {
            linkedHashMap.put(next, lVar.invoke(next));
        }
        return linkedHashMap;
    }

    @C12579k
    /* renamed from: V0 */
    public static final <T, K, M extends Map<? super K, List<T>>> M m44701V0(@C12579k C11559m<? extends T> mVar, @C12579k M m, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        for (Object next : mVar) {
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

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: V1 */
    public static final Double m44702V1(@C12579k C11559m<Double> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = it.next().doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.min(doubleValue, it.next().doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11314h(name = "sumOfShort")
    /* renamed from: V2 */
    public static final int m44703V2(@C12579k C11559m<Short> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        int i = 0;
        for (Short shortValue : mVar) {
            i += shortValue.shortValue();
        }
        return i;
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: W */
    public static final <K, V, M extends Map<? super K, ? super V>> M m44704W(@C12579k C11559m<? extends K> mVar, @C12579k M m, @C12579k C11300l<? super K, ? extends V> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "valueSelector");
        for (Object next : mVar) {
            m.put(next, lVar.invoke(next));
        }
        return m;
    }

    @C12579k
    /* renamed from: W0 */
    public static final <T, K, V, M extends Map<? super K, List<V>>> M m44705W0(@C12579k C11559m<? extends T> mVar, @C12579k M m, @C12579k C11300l<? super T, ? extends K> lVar, @C12579k C11300l<? super T, ? extends V> lVar2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(m, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        Intrinsics.checkNotNullParameter(lVar2, "valueTransform");
        for (Object next : mVar) {
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

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: W1 */
    public static final Float m44706W1(@C12579k C11559m<Float> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = it.next().floatValue();
        while (it.hasNext()) {
            floatValue = Math.min(floatValue, it.next().floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11110f
    @C11314h(name = "sumOfUInt")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    @C11403m0
    /* renamed from: W2 */
    public static final <T> int m44707W2(C11559m<? extends T> mVar, C11300l<? super T, C11419p1> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int M = C11419p1.m43971M(0);
        for (Object invoke : mVar) {
            M = C11419p1.m43971M(M + lVar.invoke(invoke).mo22930j2());
        }
        return M;
    }

    @C11314h(name = "averageOfByte")
    /* renamed from: X */
    public static final double m44708X(@C12579k C11559m<Byte> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Byte byteValue : mVar) {
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

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: X0 */
    public static final <T, K> C10929d0<T, K> m44709X0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "keySelector");
        return new C11537b(mVar, lVar);
    }

    @C11314h(name = "minOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: X1 */
    public static final double m44710X1(@C12579k C11559m<Double> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Double> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = it.next().doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.min(doubleValue, it.next().doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    @C11110f
    @C11314h(name = "sumOfULong")
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11531s.class})
    @C11403m0
    /* renamed from: X2 */
    public static final <T> long m44711X2(C11559m<? extends T> mVar, C11300l<? super T, C11588t1> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        long M = C11588t1.m44970M(0);
        for (Object invoke : mVar) {
            M = C11588t1.m44970M(M + lVar.invoke(invoke).mo23301j2());
        }
        return M;
    }

    @C11314h(name = "averageOfDouble")
    /* renamed from: Y */
    public static final double m44712Y(@C12579k C11559m<Double> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Double doubleValue : mVar) {
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

    /* renamed from: Y0 */
    public static final <T> int m44713Y0(@C12579k C11559m<? extends T> mVar, T t) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        int i = 0;
        for (Object next : mVar) {
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

    @C11314h(name = "minOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: Y1 */
    public static final float m44714Y1(@C12579k C11559m<Float> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<Float> it = mVar.iterator();
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
    /* renamed from: Y2 */
    public static final <T> C11559m<T> m44715Y2(@C12579k C11559m<? extends T> mVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return SequencesKt__SequencesKt.m44590g();
        } else {
            if (mVar instanceof C11545e) {
                return ((C11545e) mVar).mo23195b(i);
            }
            return new C11568t(mVar, i);
        }
    }

    @C11314h(name = "averageOfFloat")
    /* renamed from: Z */
    public static final double m44716Z(@C12579k C11559m<Float> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Float floatValue : mVar) {
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

    /* renamed from: Z0 */
    public static final <T> int m44717Z0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int i = 0;
        for (Object next : mVar) {
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

    @C11314h(name = "minOrThrow")
    @C11665v0(version = "1.7")
    @C12579k
    /* renamed from: Z1 */
    public static final <T extends Comparable<? super T>> T m44718Z1(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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
    /* renamed from: Z2 */
    public static final <T> C11559m<T> m44719Z2(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        return new C11570u(mVar, lVar);
    }

    @C11314h(name = "averageOfInt")
    /* renamed from: a0 */
    public static final double m44720a0(@C12579k C11559m<Integer> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Integer intValue : mVar) {
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

    /* renamed from: a1 */
    public static final <T> int m44721a1(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int i = -1;
        int i2 = 0;
        for (Object next : mVar) {
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

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: a2 */
    public static final <T> T m44722a2(@C12579k C11559m<? extends T> mVar, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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

    @C12579k
    /* renamed from: a3 */
    public static final <T, C extends Collection<? super T>> C m44723a3(@C12579k C11559m<? extends T> mVar, @C12579k C c) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        for (Object add : mVar) {
            c.add(add);
        }
        return c;
    }

    @C11314h(name = "averageOfLong")
    /* renamed from: b0 */
    public static final double m44724b0(@C12579k C11559m<Long> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Long longValue : mVar) {
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

    @C12579k
    /* renamed from: b1 */
    public static final <T, A extends Appendable> A m44725b1(@C12579k C11559m<? extends T> mVar, @C12579k A a, @C12579k CharSequence charSequence, @C12579k CharSequence charSequence2, @C12579k CharSequence charSequence3, int i, @C12579k CharSequence charSequence4, @C12580l C11300l<? super T, ? extends CharSequence> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(a, "buffer");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : mVar) {
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

    @C11314h(name = "minWithOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: b2 */
    public static final <T> T m44726b2(@C12579k C11559m<? extends T> mVar, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Iterator<? extends T> it = mVar.iterator();
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

    @C12579k
    /* renamed from: b3 */
    public static final <T> HashSet<T> m44727b3(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return (HashSet) m44723a3(mVar, new HashSet());
    }

    @C11314h(name = "averageOfShort")
    /* renamed from: c0 */
    public static final double m44728c0(@C12579k C11559m<Short> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        double d = 0.0d;
        int i = 0;
        for (Short shortValue : mVar) {
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

    /* renamed from: c1 */
    public static /* synthetic */ Appendable m44729c1(C11559m mVar, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l lVar, int i2, Object obj) {
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
        return m44725b1(mVar, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, lVar2);
    }

    @C12579k
    /* renamed from: c2 */
    public static final <T> C11559m<T> m44730c2(@C12579k C11559m<? extends T> mVar, @C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        return new SequencesKt___SequencesKt$minus$3(iterable, mVar);
    }

    @C12579k
    /* renamed from: c3 */
    public static final <T> List<T> m44731c3(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return CollectionsKt__CollectionsKt.m40453Q(m44735d3(mVar));
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: d0 */
    public static final <T> C11559m<List<T>> m44732d0(@C12579k C11559m<? extends T> mVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m44747g3(mVar, i, i, true);
    }

    @C12579k
    /* renamed from: d1 */
    public static final <T> String m44733d1(@C12579k C11559m<? extends T> mVar, @C12579k CharSequence charSequence, @C12579k CharSequence charSequence2, @C12579k CharSequence charSequence3, int i, @C12579k CharSequence charSequence4, @C12580l C11300l<? super T, ? extends CharSequence> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        String sb = ((StringBuilder) m44725b1(mVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, lVar)).toString();
        Intrinsics.checkNotNullExpressionValue(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    @C12579k
    /* renamed from: d2 */
    public static final <T> C11559m<T> m44734d2(@C12579k C11559m<? extends T> mVar, T t) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new SequencesKt___SequencesKt$minus$1(mVar, t);
    }

    @C12579k
    /* renamed from: d3 */
    public static final <T> List<T> m44735d3(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return (List) m44723a3(mVar, new ArrayList());
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: e0 */
    public static final <T, R> C11559m<R> m44736e0(@C12579k C11559m<? extends T> mVar, int i, @C12579k C11300l<? super List<? extends T>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        return m44751h3(mVar, i, i, true, lVar);
    }

    /* renamed from: e1 */
    public static /* synthetic */ String m44737e1(C11559m mVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C11300l lVar, int i2, Object obj) {
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
        return m44733d1(mVar, charSequence, charSequence5, charSequence6, i3, charSequence7, lVar);
    }

    @C12579k
    /* renamed from: e2 */
    public static final <T> C11559m<T> m44738e2(@C12579k C11559m<? extends T> mVar, @C12579k C11559m<? extends T> mVar2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar2, "elements");
        return new SequencesKt___SequencesKt$minus$4(mVar2, mVar);
    }

    @C12579k
    /* renamed from: e3 */
    public static final <T> Set<T> m44739e3(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object add : mVar) {
            linkedHashSet.add(add);
        }
        return linkedHashSet;
    }

    /* renamed from: f0 */
    public static final <T> boolean m44740f0(@C12579k C11559m<? extends T> mVar, T t) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (m44713Y0(mVar, t) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f1 */
    public static final <T> T m44741f1(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    @C12579k
    /* renamed from: f2 */
    public static final <T> C11559m<T> m44742f2(@C12579k C11559m<? extends T> mVar, @C12579k T[] tArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return mVar;
        }
        return new SequencesKt___SequencesKt$minus$2(mVar, tArr);
    }

    @C12579k
    /* renamed from: f3 */
    public static final <T> Set<T> m44743f3(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return C10930d1.m40899r((Set) m44723a3(mVar, new LinkedHashSet()));
    }

    /* renamed from: g0 */
    public static final <T> int m44744g0(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
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

    /* renamed from: g1 */
    public static final <T> T m44745g1(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        T t = null;
        boolean z = false;
        for (T next : mVar) {
            if (lVar.invoke(next).booleanValue()) {
                z = true;
                t = next;
            }
        }
        if (z) {
            return t;
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    @C11110f
    /* renamed from: g2 */
    public static final <T> C11559m<T> m44746g2(C11559m<? extends T> mVar, T t) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m44734d2(mVar, t);
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: g3 */
    public static final <T> C11559m<List<T>> m44747g3(@C12579k C11559m<? extends T> mVar, int i, int i2, boolean z) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return SlidingWindowKt.m40750c(mVar, i, i2, z, false);
    }

    /* renamed from: h0 */
    public static final <T> int m44748h0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int i = 0;
        for (Object invoke : mVar) {
            if (lVar.invoke(invoke).booleanValue() && (i = i + 1) < 0) {
                CollectionsKt__CollectionsKt.m40458V();
            }
        }
        return i;
    }

    /* renamed from: h1 */
    public static final <T> int m44749h1(@C12579k C11559m<? extends T> mVar, T t) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        int i = -1;
        int i2 = 0;
        for (Object next : mVar) {
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

    /* renamed from: h2 */
    public static final <T> boolean m44750h2(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return !mVar.iterator().hasNext();
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: h3 */
    public static final <T, R> C11559m<R> m44751h3(@C12579k C11559m<? extends T> mVar, int i, int i2, boolean z, @C12579k C11300l<? super List<? extends T>, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        return m44761k1(SlidingWindowKt.m40750c(mVar, i, i2, z, true), lVar);
    }

    @C12579k
    /* renamed from: i0 */
    public static final <T> C11559m<T> m44752i0(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m44756j0(mVar, SequencesKt___SequencesKt$distinct$1.f28675f);
    }

    @C12580l
    /* renamed from: i1 */
    public static final <T> T m44753i1(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: i2 */
    public static final <T> boolean m44754i2(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (Object invoke : mVar) {
            if (lVar.invoke(invoke).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: i3 */
    public static /* synthetic */ C11559m m44755i3(C11559m mVar, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m44747g3(mVar, i, i2, z);
    }

    @C12579k
    /* renamed from: j0 */
    public static final <T, K> C11559m<T> m44756j0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return new C11542c(mVar, lVar);
    }

    @C12580l
    /* renamed from: j1 */
    public static final <T> T m44757j1(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        T t = null;
        for (T next : mVar) {
            if (lVar.invoke(next).booleanValue()) {
                t = next;
            }
        }
        return t;
    }

    @C11665v0(version = "1.1")
    @C12579k
    /* renamed from: j2 */
    public static final <T> C11559m<T> m44758j2(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "action");
        return m44761k1(mVar, new SequencesKt___SequencesKt$onEach$1(lVar));
    }

    /* renamed from: j3 */
    public static /* synthetic */ C11559m m44759j3(C11559m mVar, int i, int i2, boolean z, C11300l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 1;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return m44751h3(mVar, i, i2, z, lVar);
    }

    @C12579k
    /* renamed from: k0 */
    public static final <T> C11559m<T> m44760k0(@C12579k C11559m<? extends T> mVar, int i) {
        boolean z;
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        } else if (i == 0) {
            return mVar;
        } else {
            if (mVar instanceof C11545e) {
                return ((C11545e) mVar).mo23194a(i);
            }
            return new C11543d(mVar, i);
        }
    }

    @C12579k
    /* renamed from: k1 */
    public static final <T, R> C11559m<R> m44761k1(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        return new C11574w(mVar, lVar);
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: k2 */
    public static final <T> C11559m<T> m44762k2(@C12579k C11559m<? extends T> mVar, @C12579k C11304p<? super Integer, ? super T, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        return m44765l1(mVar, new SequencesKt___SequencesKt$onEachIndexed$1(pVar));
    }

    @C12579k
    /* renamed from: k3 */
    public static final <T> C11559m<C10942h0<T>> m44763k3(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return new C11555k(mVar);
    }

    @C12579k
    /* renamed from: l0 */
    public static final <T> C11559m<T> m44764l0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        return new C11546f(mVar, lVar);
    }

    @C12579k
    /* renamed from: l1 */
    public static final <T, R> C11559m<R> m44765l1(@C12579k C11559m<? extends T> mVar, @C12579k C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        return new C11572v(mVar, pVar);
    }

    @C12579k
    /* renamed from: l2 */
    public static final <T> Pair<List<T>, List<T>> m44766l2(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object next : mVar) {
            if (lVar.invoke(next).booleanValue()) {
                arrayList.add(next);
            } else {
                arrayList2.add(next);
            }
        }
        return new Pair<>(arrayList, arrayList2);
    }

    @C12579k
    /* renamed from: l3 */
    public static final <T, R> C11559m<Pair<T, R>> m44767l3(@C12579k C11559m<? extends T> mVar, @C12579k C11559m<? extends R> mVar2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar2, "other");
        return new C11557l(mVar, mVar2, SequencesKt___SequencesKt$zip$1.f28691f);
    }

    /* renamed from: m0 */
    public static final <T> T m44768m0(@C12579k C11559m<? extends T> mVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m44772n0(mVar, i, new SequencesKt___SequencesKt$elementAt$1(i));
    }

    @C12579k
    /* renamed from: m1 */
    public static final <T, R> C11559m<R> m44769m1(@C12579k C11559m<? extends T> mVar, @C12579k C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        return m44798v0(new C11572v(mVar, pVar));
    }

    @C12579k
    /* renamed from: m2 */
    public static final <T> C11559m<T> m44770m2(@C12579k C11559m<? extends T> mVar, @C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        return SequencesKt__SequencesKt.m44592i(SequencesKt__SequencesKt.m44600q(mVar, CollectionsKt___CollectionsKt.m40700v1(iterable)));
    }

    @C12579k
    /* renamed from: m3 */
    public static final <T, R, V> C11559m<V> m44771m3(@C12579k C11559m<? extends T> mVar, @C12579k C11559m<? extends R> mVar2, @C12579k C11304p<? super T, ? super R, ? extends V> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar2, "other");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        return new C11557l(mVar, mVar2, pVar);
    }

    /* renamed from: n0 */
    public static final <T> T m44772n0(@C12579k C11559m<? extends T> mVar, int i, @C12579k C11300l<? super Integer, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "defaultValue");
        if (i < 0) {
            return lVar.invoke(Integer.valueOf(i));
        }
        int i2 = 0;
        for (T next : mVar) {
            int i3 = i2 + 1;
            if (i == i2) {
                return next;
            }
            i2 = i3;
        }
        return lVar.invoke(Integer.valueOf(i));
    }

    @C12579k
    /* renamed from: n1 */
    public static final <T, R, C extends Collection<? super R>> C m44773n1(@C12579k C11559m<? extends T> mVar, @C12579k C c, @C12579k C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int i = 0;
        for (Object next : mVar) {
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
    /* renamed from: n2 */
    public static final <T> C11559m<T> m44774n2(@C12579k C11559m<? extends T> mVar, T t) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return SequencesKt__SequencesKt.m44592i(SequencesKt__SequencesKt.m44600q(mVar, SequencesKt__SequencesKt.m44600q(t)));
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: n3 */
    public static final <T> C11559m<Pair<T, T>> m44775n3(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m44779o3(mVar, SequencesKt___SequencesKt$zipWithNext$1.f28692f);
    }

    @C12580l
    /* renamed from: o0 */
    public static final <T> T m44776o0(@C12579k C11559m<? extends T> mVar, int i) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        if (i < 0) {
            return null;
        }
        int i2 = 0;
        for (T next : mVar) {
            int i3 = i2 + 1;
            if (i == i2) {
                return next;
            }
            i2 = i3;
        }
        return null;
    }

    @C12579k
    /* renamed from: o1 */
    public static final <T, R, C extends Collection<? super R>> C m44777o1(@C12579k C11559m<? extends T> mVar, @C12579k C c, @C12579k C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int i = 0;
        for (Object next : mVar) {
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
    /* renamed from: o2 */
    public static final <T> C11559m<T> m44778o2(@C12579k C11559m<? extends T> mVar, @C12579k C11559m<? extends T> mVar2) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(mVar2, "elements");
        return SequencesKt__SequencesKt.m44592i(SequencesKt__SequencesKt.m44600q(mVar, mVar2));
    }

    @C11665v0(version = "1.2")
    @C12579k
    /* renamed from: o3 */
    public static final <T, R> C11559m<R> m44779o3(@C12579k C11559m<? extends T> mVar, @C12579k C11304p<? super T, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "transform");
        return C11563q.m44902b(new SequencesKt___SequencesKt$zipWithNext$2(mVar, pVar, (C11045c<? super SequencesKt___SequencesKt$zipWithNext$2>) null));
    }

    @C12579k
    /* renamed from: p0 */
    public static final <T> C11559m<T> m44780p0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        return new C11549h(mVar, true, lVar);
    }

    @C12579k
    /* renamed from: p1 */
    public static final <T, R> C11559m<R> m44781p1(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transform");
        return m44798v0(new C11574w(mVar, lVar));
    }

    @C12579k
    /* renamed from: p2 */
    public static final <T> C11559m<T> m44782p2(@C12579k C11559m<? extends T> mVar, @C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        return m44770m2(mVar, C10956m.m41290t(tArr));
    }

    @C12579k
    /* renamed from: q0 */
    public static final <T> C11559m<T> m44783q0(@C12579k C11559m<? extends T> mVar, @C12579k C11304p<? super Integer, ? super T, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        return new C11574w(new C11549h(new C11555k(mVar), true, new SequencesKt___SequencesKt$filterIndexed$1(pVar)), SequencesKt___SequencesKt$filterIndexed$2.f28676f);
    }

    @C12579k
    /* renamed from: q1 */
    public static final <T, R, C extends Collection<? super R>> C m44784q1(@C12579k C11559m<? extends T> mVar, @C12579k C c, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : mVar) {
            Object invoke2 = lVar.invoke(invoke);
            if (invoke2 != null) {
                c.add(invoke2);
            }
        }
        return c;
    }

    @C11110f
    /* renamed from: q2 */
    public static final <T> C11559m<T> m44785q2(C11559m<? extends T> mVar, T t) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m44774n2(mVar, t);
    }

    @C12579k
    /* renamed from: r0 */
    public static final <T, C extends Collection<? super T>> C m44786r0(@C12579k C11559m<? extends T> mVar, @C12579k C c, @C12579k C11304p<? super Integer, ? super T, Boolean> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(pVar, "predicate");
        int i = 0;
        for (Object next : mVar) {
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

    @C12579k
    /* renamed from: r1 */
    public static final <T, R, C extends Collection<? super R>> C m44787r1(@C12579k C11559m<? extends T> mVar, @C12579k C c, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "transform");
        for (Object invoke : mVar) {
            c.add(lVar.invoke(invoke));
        }
        return c;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super S, ? super T, ? extends S>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: r2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m44788r2(@org.jetbrains.annotations.C12579k kotlin.sequences.C11559m<? extends T> r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super S, ? super T, ? extends S> r3) {
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
            java.lang.String r3 = "Empty sequence can't be reduced."
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.m44788r2(kotlin.sequences.m, kotlin.jvm.functions.p):java.lang.Object");
    }

    /* renamed from: s0 */
    public static final /* synthetic */ <R> C11559m<R> m44789s0(C11559m<?> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.needClassReification();
        C11559m<R> p0 = m44780p0(mVar, SequencesKt___SequencesKt$filterIsInstance$1.f28677f);
        Intrinsics.checkNotNull(p0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        return p0;
    }

    @C12580l
    @C11665v0(version = "1.4")
    /* renamed from: s1 */
    public static final <T, R extends Comparable<? super R>> T m44790s1(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super S, ? super T, ? extends S>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: s2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m44791s2(@org.jetbrains.annotations.C12579k kotlin.sequences.C11559m<? extends T> r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
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
            java.lang.String r5 = "Empty sequence can't be reduced."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.m44791s2(kotlin.sequences.m, kotlin.jvm.functions.q):java.lang.Object");
    }

    /* renamed from: t0 */
    public static final /* synthetic */ <R, C extends Collection<? super R>> C m44792t0(C11559m<?> mVar, C c) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        for (Object next : mVar) {
            Intrinsics.reifiedOperationMarker(3, "R");
            if (next instanceof Object) {
                c.add(next);
            }
        }
        return c;
    }

    @C11314h(name = "maxByOrThrow")
    @C11665v0(version = "1.7")
    /* renamed from: t1 */
    public static final <T, R extends Comparable<? super R>> T m44793t1(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super S, ? super T, ? extends S>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.C12580l
    @kotlin.C11665v0(version = "1.4")
    /* renamed from: t2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m44794t2(@org.jetbrains.annotations.C12579k kotlin.sequences.C11559m<? extends T> r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super S, ? super T, ? extends S> r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.m44794t2(kotlin.sequences.m, kotlin.jvm.functions.q):java.lang.Object");
    }

    @C12579k
    /* renamed from: u0 */
    public static final <T> C11559m<T> m44795u0(@C12579k C11559m<? extends T> mVar, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        return new C11549h(mVar, false, lVar);
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: u1 */
    public static final <T> double m44796u1(C11559m<? extends T> mVar, C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            double doubleValue = lVar.invoke(it.next()).doubleValue();
            while (it.hasNext()) {
                doubleValue = Math.max(doubleValue, lVar.invoke(it.next()).doubleValue());
            }
            return doubleValue;
        }
        throw new NoSuchElementException();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super S, ? super T, ? extends S>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @org.jetbrains.annotations.C12580l
    @kotlin.C11665v0(version = "1.4")
    @kotlin.C11097g2(markerClass = {kotlin.C11429q.class})
    /* renamed from: u2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <S, T extends S> S m44797u2(@org.jetbrains.annotations.C12579k kotlin.sequences.C11559m<? extends T> r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super S, ? super T, ? extends S> r3) {
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.sequences.SequencesKt___SequencesKt.m44797u2(kotlin.sequences.m, kotlin.jvm.functions.p):java.lang.Object");
    }

    @C12579k
    /* renamed from: v0 */
    public static final <T> C11559m<T> m44798v0(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        C11559m<T> u0 = m44795u0(mVar, SequencesKt___SequencesKt$filterNotNull$1.f28678f);
        Intrinsics.checkNotNull(u0, "null cannot be cast to non-null type kotlin.sequences.Sequence<T of kotlin.sequences.SequencesKt___SequencesKt.filterNotNull>");
        return u0;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: v1 */
    public static final <T> float m44799v1(C11559m<? extends T> mVar, C11300l<? super T, Float> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (it.hasNext()) {
            float floatValue = lVar.invoke(it.next()).floatValue();
            while (it.hasNext()) {
                floatValue = Math.max(floatValue, lVar.invoke(it.next()).floatValue());
            }
            return floatValue;
        }
        throw new NoSuchElementException();
    }

    @C12579k
    /* renamed from: v2 */
    public static final <T> C11559m<T> m44800v2(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return m44761k1(mVar, new SequencesKt___SequencesKt$requireNoNulls$1(mVar));
    }

    @C12579k
    /* renamed from: w0 */
    public static final <C extends Collection<? super T>, T> C m44801w0(@C12579k C11559m<? extends T> mVar, @C12579k C c) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        for (Object next : mVar) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: w1 */
    public static final <T, R extends Comparable<? super R>> R m44802w1(C11559m<? extends T> mVar, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: w2 */
    public static final <T, R> C11559m<R> m44803w2(@C12579k C11559m<? extends T> mVar, R r, @C12579k C11304p<? super R, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        return C11563q.m44902b(new SequencesKt___SequencesKt$runningFold$1(r, mVar, pVar, (C11045c<? super SequencesKt___SequencesKt$runningFold$1>) null));
    }

    @C12579k
    /* renamed from: x0 */
    public static final <T, C extends Collection<? super T>> C m44804x0(@C12579k C11559m<? extends T> mVar, @C12579k C c, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (Object next : mVar) {
            if (!lVar.invoke(next).booleanValue()) {
                c.add(next);
            }
        }
        return c;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: x1 */
    public static final <T, R extends Comparable<? super R>> R m44805x1(C11559m<? extends T> mVar, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: x2 */
    public static final <T, R> C11559m<R> m44806x2(@C12579k C11559m<? extends T> mVar, R r, @C12579k C11305q<? super Integer, ? super R, ? super T, ? extends R> qVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        return C11563q.m44902b(new SequencesKt___SequencesKt$runningFoldIndexed$1(r, mVar, qVar, (C11045c<? super SequencesKt___SequencesKt$runningFoldIndexed$1>) null));
    }

    @C12579k
    /* renamed from: y0 */
    public static final <T, C extends Collection<? super T>> C m44807y0(@C12579k C11559m<? extends T> mVar, @C12579k C c, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (Object next : mVar) {
            if (lVar.invoke(next).booleanValue()) {
                c.add(next);
            }
        }
        return c;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: y1 */
    public static final <T> Double m44808y1(C11559m<? extends T> mVar, C11300l<? super T, Double> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        double doubleValue = lVar.invoke(it.next()).doubleValue();
        while (it.hasNext()) {
            doubleValue = Math.max(doubleValue, lVar.invoke(it.next()).doubleValue());
        }
        return Double.valueOf(doubleValue);
    }

    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    @C12579k
    /* renamed from: y2 */
    public static final <S, T extends S> C11559m<S> m44809y2(@C12579k C11559m<? extends T> mVar, @C12579k C11304p<? super S, ? super T, ? extends S> pVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "operation");
        return C11563q.m44902b(new SequencesKt___SequencesKt$runningReduce$1(mVar, pVar, (C11045c<? super SequencesKt___SequencesKt$runningReduce$1>) null));
    }

    @C11110f
    /* renamed from: z0 */
    public static final <T> T m44810z0(C11559m<? extends T> mVar, C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        for (T next : mVar) {
            if (lVar.invoke(next).booleanValue()) {
                return next;
            }
        }
        return null;
    }

    @C11110f
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: z1 */
    public static final <T> Float m44811z1(C11559m<? extends T> mVar, C11300l<? super T, Float> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float floatValue = lVar.invoke(it.next()).floatValue();
        while (it.hasNext()) {
            floatValue = Math.max(floatValue, lVar.invoke(it.next()).floatValue());
        }
        return Float.valueOf(floatValue);
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: z2 */
    public static final <S, T extends S> C11559m<S> m44812z2(@C12579k C11559m<? extends T> mVar, @C12579k C11305q<? super Integer, ? super S, ? super T, ? extends S> qVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(qVar, "operation");
        return C11563q.m44902b(new SequencesKt___SequencesKt$runningReduceIndexed$1(mVar, qVar, (C11045c<? super SequencesKt___SequencesKt$runningReduceIndexed$1>) null));
    }
}
