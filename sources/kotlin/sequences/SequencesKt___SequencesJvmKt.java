package kotlin.sequences;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
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

@C11363r0({"SMAP\n_SequencesJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,172:1\n1415#2,14:173\n1821#2,14:187\n*S KotlinDebug\n*F\n+ 1 _SequencesJvm.kt\nkotlin/sequences/SequencesKt___SequencesJvmKt\n*L\n89#1:173,14\n126#1:187,14\n*E\n"})
public class SequencesKt___SequencesJvmKt extends SequencesKt__SequencesKt {
    @C11395k(message = "Use maxWithOrNull instead.", replaceWith = @C11587t0(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: A */
    public static final /* synthetic */ Object m44609A(C11559m mVar, Comparator comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return SequencesKt___SequencesKt.m44651I1(mVar, comparator);
    }

    @C11395k(message = "Use minByOrNull instead.", replaceWith = @C11587t0(expression = "this.minByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: E */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m44613E(C11559m<? extends T> mVar, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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
    /* renamed from: F */
    public static final /* synthetic */ Object m44614F(C11559m mVar, Comparator comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return SequencesKt___SequencesKt.m44722a2(mVar, comparator);
    }

    @C11110f
    @C11314h(name = "sumOfBigDecimal")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: G */
    public static final <T> BigDecimal m44615G(C11559m<? extends T> mVar, C11300l<? super T, ? extends BigDecimal> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigDecimal valueOf = BigDecimal.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (Object invoke : mVar) {
            valueOf = valueOf.add((BigDecimal) lVar.invoke(invoke));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C11110f
    @C11314h(name = "sumOfBigInteger")
    @C11665v0(version = "1.4")
    @C11403m0
    /* renamed from: H */
    public static final <T> BigInteger m44616H(C11559m<? extends T> mVar, C11300l<? super T, ? extends BigInteger> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        BigInteger valueOf = BigInteger.valueOf(0);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this.toLong())");
        for (Object invoke : mVar) {
            valueOf = valueOf.add((BigInteger) lVar.invoke(invoke));
            Intrinsics.checkNotNullExpressionValue(valueOf, "this.add(other)");
        }
        return valueOf;
    }

    @C12579k
    /* renamed from: I */
    public static final <T extends Comparable<? super T>> SortedSet<T> m44617I(@C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        return (SortedSet) SequencesKt___SequencesKt.m44723a3(mVar, new TreeSet());
    }

    @C12579k
    /* renamed from: J */
    public static final <T> SortedSet<T> m44618J(@C12579k C11559m<? extends T> mVar, @C12579k Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return (SortedSet) SequencesKt___SequencesKt.m44723a3(mVar, new TreeSet(comparator));
    }

    @C12579k
    /* renamed from: u */
    public static final <R> C11559m<R> m44619u(@C12579k C11559m<?> mVar, @C12579k Class<R> cls) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(cls, "klass");
        C11559m<R> p0 = SequencesKt___SequencesKt.m44780p0(mVar, new SequencesKt___SequencesJvmKt$filterIsInstance$1(cls));
        Intrinsics.checkNotNull(p0, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance>");
        return p0;
    }

    @C12579k
    /* renamed from: v */
    public static final <C extends Collection<? super R>, R> C m44620v(@C12579k C11559m<?> mVar, @C12579k C c, @C12579k Class<R> cls) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(c, FirebaseAnalytics.C32532b.f78977z);
        Intrinsics.checkNotNullParameter(cls, "klass");
        for (Object next : mVar) {
            if (cls.isInstance(next)) {
                c.add(next);
            }
        }
        return c;
    }

    @C11395k(message = "Use maxByOrNull instead.", replaceWith = @C11587t0(expression = "this.maxByOrNull(selector)", imports = {}))
    @C11398l(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* renamed from: z */
    public static final /* synthetic */ <T, R extends Comparable<? super R>> T m44624z(C11559m<? extends T> mVar, C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(mVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        Iterator<? extends T> it = mVar.iterator();
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
}
