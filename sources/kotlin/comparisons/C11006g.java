package kotlin.comparisons;

import java.util.Comparator;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.comparisons.g */
public class C11006g {

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$a */
    public static final class C11007a<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ C11300l<T, Comparable<?>> f28212a;

        public C11007a(C11300l<? super T, ? extends Comparable<?>> lVar) {
            this.f28212a = lVar;
        }

        public final int compare(T t, T t2) {
            C11300l<T, Comparable<?>> lVar = this.f28212a;
            return C11006g.m42424l(lVar.invoke(t), lVar.invoke(t2));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$3\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$b */
    public static final class C11008b<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator<? super K> f28213a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<T, K> f28214b;

        public C11008b(Comparator<? super K> comparator, C11300l<? super T, ? extends K> lVar) {
            this.f28213a = comparator;
            this.f28214b = lVar;
        }

        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.f28213a;
            C11300l<T, K> lVar = this.f28214b;
            return comparator.compare(lVar.invoke(t), lVar.invoke(t2));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$c */
    public static final class C11009c<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ C11300l<T, Comparable<?>> f28215a;

        public C11009c(C11300l<? super T, ? extends Comparable<?>> lVar) {
            this.f28215a = lVar;
        }

        public final int compare(T t, T t2) {
            C11300l<T, Comparable<?>> lVar = this.f28215a;
            return C11006g.m42424l(lVar.invoke(t2), lVar.invoke(t));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$2\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$d */
    public static final class C11010d<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator<? super K> f28216a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<T, K> f28217b;

        public C11010d(Comparator<? super K> comparator, C11300l<? super T, ? extends K> lVar) {
            this.f28216a = comparator;
            this.f28217b = lVar;
        }

        public final int compare(T t, T t2) {
            Comparator<? super K> comparator = this.f28216a;
            C11300l<T, K> lVar = this.f28217b;
            return comparator.compare(lVar.invoke(t2), lVar.invoke(t));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$1\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$e */
    public static final class C11011e<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f28218a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<T, Comparable<?>> f28219b;

        public C11011e(Comparator<T> comparator, C11300l<? super T, ? extends Comparable<?>> lVar) {
            this.f28218a = comparator;
            this.f28219b = lVar;
        }

        public final int compare(T t, T t2) {
            int compare = this.f28218a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            C11300l<T, Comparable<?>> lVar = this.f28219b;
            return C11006g.m42424l(lVar.invoke(t), lVar.invoke(t2));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenBy$2\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$f */
    public static final class C11012f<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f28220a;

        /* renamed from: b */
        public final /* synthetic */ Comparator<? super K> f28221b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<T, K> f28222c;

        public C11012f(Comparator<T> comparator, Comparator<? super K> comparator2, C11300l<? super T, ? extends K> lVar) {
            this.f28220a = comparator;
            this.f28221b = comparator2;
            this.f28222c = lVar;
        }

        public final int compare(T t, T t2) {
            int compare = this.f28220a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f28221b;
            C11300l<T, K> lVar = this.f28222c;
            return comparator.compare(lVar.invoke(t), lVar.invoke(t2));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$1\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$g */
    public static final class C11013g<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f28223a;

        /* renamed from: b */
        public final /* synthetic */ C11300l<T, Comparable<?>> f28224b;

        public C11013g(Comparator<T> comparator, C11300l<? super T, ? extends Comparable<?>> lVar) {
            this.f28223a = comparator;
            this.f28224b = lVar;
        }

        public final int compare(T t, T t2) {
            int compare = this.f28223a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            C11300l<T, Comparable<?>> lVar = this.f28224b;
            return C11006g.m42424l(lVar.invoke(t2), lVar.invoke(t));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenByDescending$2\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$h */
    public static final class C11014h<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f28225a;

        /* renamed from: b */
        public final /* synthetic */ Comparator<? super K> f28226b;

        /* renamed from: c */
        public final /* synthetic */ C11300l<T, K> f28227c;

        public C11014h(Comparator<T> comparator, Comparator<? super K> comparator2, C11300l<? super T, ? extends K> lVar) {
            this.f28225a = comparator;
            this.f28226b = comparator2;
            this.f28227c = lVar;
        }

        public final int compare(T t, T t2) {
            int compare = this.f28225a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            Comparator<? super K> comparator = this.f28226b;
            C11300l<T, K> lVar = this.f28227c;
            return comparator.compare(lVar.invoke(t2), lVar.invoke(t));
        }
    }

    @C11363r0({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$thenComparator$1\n*L\n1#1,328:1\n*E\n"})
    /* renamed from: kotlin.comparisons.g$i */
    public static final class C11015i<T> implements Comparator {

        /* renamed from: a */
        public final /* synthetic */ Comparator<T> f28228a;

        /* renamed from: b */
        public final /* synthetic */ C11304p<T, T, Integer> f28229b;

        public C11015i(Comparator<T> comparator, C11304p<? super T, ? super T, Integer> pVar) {
            this.f28228a = comparator;
            this.f28229b = pVar;
        }

        public final int compare(T t, T t2) {
            int compare = this.f28228a.compare(t, t2);
            if (compare != 0) {
                return compare;
            }
            return this.f28229b.invoke(t, t2).intValue();
        }
    }

    /* renamed from: A */
    public static final int m42405A(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(comparator, "$this_then");
        Intrinsics.checkNotNullParameter(comparator2, "$comparator");
        int compare = comparator.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        return comparator2.compare(obj, obj2);
    }

    @C11110f
    /* renamed from: B */
    public static final <T, K> Comparator<T> m42406B(Comparator<T> comparator, Comparator<? super K> comparator2, C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return new C11012f(comparator, comparator2, lVar);
    }

    @C11110f
    /* renamed from: C */
    public static final <T> Comparator<T> m42407C(Comparator<T> comparator, C11300l<? super T, ? extends Comparable<?>> lVar) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return new C11011e(comparator, lVar);
    }

    @C11110f
    /* renamed from: D */
    public static final <T, K> Comparator<T> m42408D(Comparator<T> comparator, Comparator<? super K> comparator2, C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return new C11014h(comparator, comparator2, lVar);
    }

    @C11110f
    /* renamed from: E */
    public static final <T> Comparator<T> m42409E(Comparator<T> comparator, C11300l<? super T, ? extends Comparable<?>> lVar) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return new C11013g(comparator, lVar);
    }

    @C11110f
    /* renamed from: F */
    public static final <T> Comparator<T> m42410F(Comparator<T> comparator, C11304p<? super T, ? super T, Integer> pVar) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "comparison");
        return new C11015i(comparator, pVar);
    }

    @C12579k
    /* renamed from: G */
    public static final <T> Comparator<T> m42411G(@C12579k Comparator<T> comparator, @C12579k Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new C11003d(comparator, comparator2);
    }

    /* renamed from: H */
    public static final int m42412H(Comparator comparator, Comparator comparator2, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(comparator, "$this_thenDescending");
        Intrinsics.checkNotNullParameter(comparator2, "$comparator");
        int compare = comparator.compare(obj, obj2);
        if (compare != 0) {
            return compare;
        }
        return comparator2.compare(obj2, obj);
    }

    @C11110f
    /* renamed from: f */
    public static final <T, K> Comparator<T> m42418f(Comparator<? super K> comparator, C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return new C11008b(comparator, lVar);
    }

    @C11110f
    /* renamed from: g */
    public static final <T> Comparator<T> m42419g(C11300l<? super T, ? extends Comparable<?>> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return new C11007a(lVar);
    }

    @C12579k
    /* renamed from: h */
    public static final <T> Comparator<T> m42420h(@C12579k C11300l<? super T, ? extends Comparable<?>>... lVarArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C11002c(lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: i */
    public static final int m42421i(C11300l[] lVarArr, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(lVarArr, "$selectors");
        return m42428p(obj, obj2, lVarArr);
    }

    @C11110f
    /* renamed from: j */
    public static final <T, K> Comparator<T> m42422j(Comparator<? super K> comparator, C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return new C11010d(comparator, lVar);
    }

    @C11110f
    /* renamed from: k */
    public static final <T> Comparator<T> m42423k(C11300l<? super T, ? extends Comparable<?>> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return new C11009c(lVar);
    }

    /* renamed from: l */
    public static final <T extends Comparable<?>> int m42424l(@C12580l T t, @C12580l T t2) {
        if (t == t2) {
            return 0;
        }
        if (t == null) {
            return -1;
        }
        if (t2 == null) {
            return 1;
        }
        return t.compareTo(t2);
    }

    @C11110f
    /* renamed from: m */
    public static final <T, K> int m42425m(T t, T t2, Comparator<? super K> comparator, C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return comparator.compare(lVar.invoke(t), lVar.invoke(t2));
    }

    @C11110f
    /* renamed from: n */
    public static final <T> int m42426n(T t, T t2, C11300l<? super T, ? extends Comparable<?>> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return m42424l((Comparable) lVar.invoke(t), (Comparable) lVar.invoke(t2));
    }

    /* renamed from: o */
    public static final <T> int m42427o(T t, T t2, @C12579k C11300l<? super T, ? extends Comparable<?>>... lVarArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(lVarArr, "selectors");
        if (lVarArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m42428p(t, t2, lVarArr);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* renamed from: p */
    public static final <T> int m42428p(T t, T t2, C11300l<? super T, ? extends Comparable<?>>[] lVarArr) {
        for (C11300l<? super T, ? extends Comparable<?>> lVar : lVarArr) {
            int l = m42424l((Comparable) lVar.invoke(t), (Comparable) lVar.invoke(t2));
            if (l != 0) {
                return l;
            }
        }
        return 0;
    }

    @C12579k
    /* renamed from: q */
    public static final <T extends Comparable<? super T>> Comparator<T> m42429q() {
        C11018j jVar = C11018j.f28230a;
        Intrinsics.checkNotNull(jVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.naturalOrder> }");
        return jVar;
    }

    @C11110f
    /* renamed from: r */
    public static final <T extends Comparable<? super T>> Comparator<T> m42430r() {
        return m42431s(m42429q());
    }

    @C12579k
    /* renamed from: s */
    public static final <T> Comparator<T> m42431s(@C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new C11004e(comparator);
    }

    /* renamed from: t */
    public static final int m42432t(Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return -1;
        }
        if (obj2 == null) {
            return 1;
        }
        return comparator.compare(obj, obj2);
    }

    @C11110f
    /* renamed from: u */
    public static final <T extends Comparable<? super T>> Comparator<T> m42433u() {
        return m42434v(m42429q());
    }

    @C12579k
    /* renamed from: v */
    public static final <T> Comparator<T> m42434v(@C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new C11005f(comparator);
    }

    /* renamed from: w */
    public static final int m42435w(Comparator comparator, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(comparator, "$comparator");
        if (obj == obj2) {
            return 0;
        }
        if (obj == null) {
            return 1;
        }
        if (obj2 == null) {
            return -1;
        }
        return comparator.compare(obj, obj2);
    }

    @C12579k
    /* renamed from: x */
    public static final <T extends Comparable<? super T>> Comparator<T> m42436x() {
        C11019k kVar = C11019k.f28231a;
        Intrinsics.checkNotNull(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
        return kVar;
    }

    @C12579k
    /* renamed from: y */
    public static final <T> Comparator<T> m42437y(@C12579k Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        if (comparator instanceof C11020l) {
            return ((C11020l) comparator).mo22464a();
        }
        Comparator<T> comparator2 = C11018j.f28230a;
        if (Intrinsics.areEqual((Object) comparator, (Object) comparator2)) {
            C11019k kVar = C11019k.f28231a;
            Intrinsics.checkNotNull(kVar, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
            return kVar;
        }
        if (Intrinsics.areEqual((Object) comparator, (Object) C11019k.f28231a)) {
            Intrinsics.checkNotNull(comparator2, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reversed> }");
        } else {
            comparator2 = new C11020l<>(comparator);
        }
        return comparator2;
    }

    @C12579k
    /* renamed from: z */
    public static final <T> Comparator<T> m42438z(@C12579k Comparator<T> comparator, @C12579k Comparator<? super T> comparator2) {
        Intrinsics.checkNotNullParameter(comparator, "<this>");
        Intrinsics.checkNotNullParameter(comparator2, "comparator");
        return new C11001b(comparator, comparator2);
    }
}
