package kotlin.collections;

import com.usabilla.sdk.ubform.sdk.field.model.common.BaseOptionModel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.C10863b;
import kotlin.C11079d2;
import kotlin.C11097g2;
import kotlin.C11429q;
import kotlin.C11532s0;
import kotlin.C11665v0;
import kotlin.comparisons.C11006g;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,471:1\n394#1:473\n1#2:472\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/CollectionsKt__CollectionsKt\n*L\n388#1:473\n*E\n"})
public class CollectionsKt__CollectionsKt extends C10976s {
    /* renamed from: A */
    public static /* synthetic */ int m40437A(List list, Comparable comparable, int i, int i2, C11300l lVar, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m40465t(list, i, i2, new CollectionsKt__CollectionsKt$binarySearchBy$1(lVar, comparable));
    }

    @C11110f
    @C11665v0(version = "1.6")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: B */
    public static final <E> List<E> m40438B(int i, @C10863b C11300l<? super List<E>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        List j = C10976s.m41418j(i);
        lVar.invoke(j);
        return C10976s.m41409a(j);
    }

    @C11110f
    @C11665v0(version = "1.6")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: C */
    public static final <E> List<E> m40439C(@C10863b C11300l<? super List<E>, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "builderAction");
        List i = C10976s.m41417i();
        lVar.invoke(i);
        return C10976s.m41409a(i);
    }

    @C11110f
    /* renamed from: D */
    public static final <T> boolean m40440D(Collection<? extends T> collection, Collection<? extends T> collection2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(collection2, "elements");
        return collection.containsAll(collection2);
    }

    @C12579k
    /* renamed from: E */
    public static final <T> List<T> m40441E() {
        return EmptyList.f28116a;
    }

    @C12579k
    /* renamed from: F */
    public static final C11466l m40442F(@C12579k Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return new C11466l(0, collection.size() - 1);
    }

    /* renamed from: G */
    public static final <T> int m40443G(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.size() - 1;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [R, C, java.util.Collection] */
    /* JADX WARNING: Unknown variable types count: 1 */
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.3")
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <C extends java.util.Collection<?> & R, R> R m40444H(C r1, kotlin.jvm.functions.C11289a<? extends R> r2) {
        /*
            java.lang.String r0 = "defaultValue"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r1 = r2.invoke()
        L_0x000f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.CollectionsKt__CollectionsKt.m40444H(java.util.Collection, kotlin.jvm.functions.a):java.lang.Object");
    }

    @C11110f
    /* renamed from: I */
    public static final <T> boolean m40445I(Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return !collection.isEmpty();
    }

    @C11110f
    @C11665v0(version = "1.3")
    /* renamed from: J */
    public static final <T> boolean m40446J(Collection<? extends T> collection) {
        return collection == null || collection.isEmpty();
    }

    @C11110f
    /* renamed from: K */
    public static final <T> List<T> m40447K() {
        return m40441E();
    }

    @C12579k
    /* renamed from: L */
    public static final <T> List<T> m40448L(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        if (tArr.length > 0) {
            return C10956m.m41290t(tArr);
        }
        return m40441E();
    }

    @C12579k
    /* renamed from: M */
    public static final <T> List<T> m40449M(@C12580l T t) {
        return t != null ? C10976s.m41419k(t) : m40441E();
    }

    @C12579k
    /* renamed from: N */
    public static final <T> List<T> m40450N(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        return ArraysKt___ArraysKt.m40241ub(tArr);
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: O */
    public static final <T> List<T> m40451O() {
        return new ArrayList();
    }

    @C12579k
    /* renamed from: P */
    public static final <T> List<T> m40452P(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C10941h(tArr, true));
    }

    @C12579k
    /* renamed from: Q */
    public static final <T> List<T> m40453Q(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return m40441E();
        }
        if (size != 1) {
            return list;
        }
        return C10976s.m41419k(list.get(0));
    }

    @C11110f
    /* renamed from: R */
    public static final <T> Collection<T> m40454R(Collection<? extends T> collection) {
        return collection == null ? m40441E() : collection;
    }

    @C11110f
    /* renamed from: S */
    public static final <T> List<T> m40455S(List<? extends T> list) {
        return list == null ? m40441E() : list;
    }

    /* renamed from: T */
    public static final void m40456T(int i, int i2, int i3) {
        if (i2 > i3) {
            throw new IllegalArgumentException("fromIndex (" + i2 + ") is greater than toIndex (" + i3 + ").");
        } else if (i2 < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + i2 + ") is less than zero.");
        } else if (i3 > i) {
            throw new IndexOutOfBoundsException("toIndex (" + i3 + ") is greater than size (" + i + ").");
        }
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: U */
    public static final <T> List<T> m40457U(@C12579k Iterable<? extends T> iterable, @C12579k Random random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, BaseOptionModel.f27465E0);
        List<T> S5 = CollectionsKt___CollectionsKt.m40567S5(iterable);
        CollectionsKt___CollectionsKt.m40601Z4(S5, random);
        return S5;
    }

    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: V */
    public static final void m40458V() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    @C11665v0(version = "1.3")
    @C11532s0
    /* renamed from: W */
    public static final void m40459W() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: o */
    public static final <T> List<T> m40460o(int i, C11300l<? super Integer, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(lVar.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: p */
    public static final <T> List<T> m40461p(int i, C11300l<? super Integer, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "init");
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(lVar.invoke(Integer.valueOf(i2)));
        }
        return arrayList;
    }

    @C11110f
    @C11665v0(version = "1.1")
    /* renamed from: q */
    public static final <T> ArrayList<T> m40462q() {
        return new ArrayList<>();
    }

    @C12579k
    /* renamed from: r */
    public static final <T> ArrayList<T> m40463r(@C12579k T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "elements");
        if (tArr.length == 0) {
            return new ArrayList<>();
        }
        return new ArrayList<>(new C10941h(tArr, true));
    }

    @C12579k
    /* renamed from: s */
    public static final <T> Collection<T> m40464s(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new C10941h(tArr, false);
    }

    /* renamed from: t */
    public static final <T> int m40465t(@C12579k List<? extends T> list, int i, int i2, @C12579k C11300l<? super T, Integer> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "comparison");
        m40456T(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int intValue = lVar.invoke(list.get(i4)).intValue();
            if (intValue < 0) {
                i = i4 + 1;
            } else if (intValue <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: u */
    public static final <T extends Comparable<? super T>> int m40466u(@C12579k List<? extends T> list, @C12580l T t, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        m40456T(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int l = C11006g.m42424l((Comparable) list.get(i4), t);
            if (l < 0) {
                i = i4 + 1;
            } else if (l <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: v */
    public static final <T> int m40467v(@C12579k List<? extends T> list, T t, @C12579k Comparator<? super T> comparator, int i, int i2) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        m40456T(list.size(), i, i2);
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int compare = comparator.compare(list.get(i4), t);
            if (compare < 0) {
                i = i4 + 1;
            } else if (compare <= 0) {
                return i4;
            } else {
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: w */
    public static /* synthetic */ int m40468w(List list, int i, int i2, C11300l lVar, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = list.size();
        }
        return m40465t(list, i, i2, lVar);
    }

    /* renamed from: x */
    public static /* synthetic */ int m40469x(List list, Comparable comparable, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = list.size();
        }
        return m40466u(list, comparable, i, i2);
    }

    /* renamed from: y */
    public static /* synthetic */ int m40470y(List list, Object obj, Comparator comparator, int i, int i2, int i3, Object obj2) {
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = list.size();
        }
        return m40467v(list, obj, comparator, i, i2);
    }

    /* renamed from: z */
    public static final <T, K extends Comparable<? super K>> int m40471z(@C12579k List<? extends T> list, @C12580l K k, int i, int i2, @C12579k C11300l<? super T, ? extends K> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "selector");
        return m40465t(list, i, i2, new CollectionsKt__CollectionsKt$binarySearchBy$1(lVar, k));
    }
}
