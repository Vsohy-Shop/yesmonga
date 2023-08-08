package kotlin.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.C11097g2;
import kotlin.C11429q;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.collections.d1 */
public class C10930d1 extends C10927c1 {
    @C11110f
    @C11665v0(version = "1.6")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: i */
    public static final <E> Set<E> m40890i(int i, @C10863b C11300l<? super Set<E>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        Set e = C10927c1.m40882e(i);
        lVar.invoke(e);
        return C10927c1.m40878a(e);
    }

    @C11110f
    @C11665v0(version = "1.6")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: j */
    public static final <E> Set<E> m40891j(@C10863b C11300l<? super Set<E>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        Set d = C10927c1.m40881d();
        lVar.invoke(d);
        return C10927c1.m40878a(d);
    }

    @C12579k
    /* renamed from: k */
    public static final <T> Set<T> m40892k() {
        return EmptySet.f28118a;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: l */
    public static final <T> HashSet<T> m40893l() {
        return new HashSet<>();
    }

    @C12579k
    /* renamed from: m */
    public static final <T> HashSet<T> m40894m(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        return (HashSet) ArraysKt___ArraysKt.m39287Py(tArr, new HashSet(C10975r0.m41400j(tArr.length)));
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: n */
    public static final <T> LinkedHashSet<T> m40895n() {
        return new LinkedHashSet<>();
    }

    @C12579k
    /* renamed from: o */
    public static final <T> LinkedHashSet<T> m40896o(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        return (LinkedHashSet) ArraysKt___ArraysKt.m39287Py(tArr, new LinkedHashSet(C10975r0.m41400j(tArr.length)));
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: p */
    public static final <T> Set<T> m40897p() {
        return new LinkedHashSet();
    }

    @C12579k
    /* renamed from: q */
    public static final <T> Set<T> m40898q(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        return (Set) ArraysKt___ArraysKt.m39287Py(tArr, new LinkedHashSet(C10975r0.m41400j(tArr.length)));
    }

    @C12579k
    /* renamed from: r */
    public static final <T> Set<T> m40899r(@C12579k Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        if (size == 0) {
            return m40892k();
        }
        if (size != 1) {
            return set;
        }
        return C10927c1.m40883f(set.iterator().next());
    }

    @C11110f
    /* renamed from: s */
    public static final <T> Set<T> m40900s(Set<? extends T> set) {
        return set == null ? m40892k() : set;
    }

    @C11110f
    /* renamed from: t */
    public static final <T> Set<T> m40901t() {
        return m40892k();
    }

    @C12579k
    /* renamed from: u */
    public static final <T> Set<T> m40902u(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        if (tArr.length > 0) {
            return ArraysKt___ArraysKt.m39192Mz(tArr);
        }
        return m40892k();
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: v */
    public static final <T> Set<T> m40903v(@C12580l T t) {
        return t != null ? C10927c1.m40883f(t) : m40892k();
    }

    @C11665v0(version = "1.4")
    @C12579k
    /* renamed from: w */
    public static final <T> Set<T> m40904w(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        return (Set) ArraysKt___ArraysKt.m40273vb(tArr, new LinkedHashSet());
    }
}
