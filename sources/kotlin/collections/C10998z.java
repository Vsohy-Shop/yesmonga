package kotlin.collections;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11403m0;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\n_CollectionsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,168:1\n1963#2,14:169\n2333#2,14:183\n*S KotlinDebug\n*F\n+ 1 _CollectionsJvm.kt\nkotlin/collections/CollectionsKt___CollectionsJvmKt\n*L\n89#1:169,14\n126#1:183,14\n*E\n"})
/* renamed from: kotlin.collections.z */
public class C10998z extends C10996y {
    @C12579k
    /* renamed from: a1 */
    public static final <R> List<R> m42387a1(@C12579k Iterable<?> iterable, @C12579k Class<R> cls) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(cls, "klass");
        return (List) m42388b1(iterable, new ArrayList(), cls);
    }

    @C12579k
    /* renamed from: b1 */
    public static final <C extends Collection<? super R>, R> C m42388b1(@C12579k Iterable<?> iterable, @C12579k C c, @C12579k Class<R> cls) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(cls, "klass");
        for (Object next : iterable) {
            if (cls.isInstance(next)) {
                c.add(next);
            }
        }
        return c;
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: f1 */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m42392f1(Iterable<? extends T> iterable, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) lVar.invoke(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.invoke(next2);
                if (comparable.compareTo(comparable2) < 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return next;
    }

    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: g1 */
    public static final /* synthetic */ Object m42393g1(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt___CollectionsKt.m40555Q3(iterable, comparator);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: k1 */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m42397k1(Iterable<? extends T> iterable, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            Comparable comparable = (Comparable) lVar.invoke(next);
            do {
                T next2 = it.next();
                Comparable comparable2 = (Comparable) lVar.invoke(next2);
                if (comparable.compareTo(comparable2) > 0) {
                    next = next2;
                    comparable = comparable2;
                }
            } while (it.hasNext());
        }
        return next;
    }

    @C11395k(message = "Use minWithOrNull instead.", replaceWith = @C11587t0(expression = "this.minWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: l1 */
    public static final /* synthetic */ Object m42398l1(Iterable iterable, Comparator comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return CollectionsKt___CollectionsKt.m40645i4(iterable, comparator);
    }

    /* renamed from: m1 */
    public static final <T> void m42399m1(@C12579k List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Collections.reverse(list);
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: n1 */
    public static final <T> BigDecimal m42400n1(Iterable<? extends T> iterable, C11300l<? super T, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (Object invoke : iterable) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(invoke));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: o1 */
    public static final <T> BigInteger m42401o1(Iterable<? extends T> iterable, C11300l<? super T, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (Object invoke : iterable) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(invoke));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C12579k
    /* renamed from: p1 */
    public static final <T extends Comparable<? super T>> SortedSet<T> m42402p1(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        return (SortedSet) CollectionsKt___CollectionsKt.m40532L5(iterable, new TreeSet());
    }

    @C12579k
    /* renamed from: q1 */
    public static final <T> SortedSet<T> m42403q1(@C12579k Iterable<? extends T> iterable, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) CollectionsKt___CollectionsKt.m40532L5(iterable, new TreeSet(comparator));
    }
}
