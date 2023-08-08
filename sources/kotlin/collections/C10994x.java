package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.C11097g2;
import kotlin.C11395k;
import kotlin.C11429q;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.DeprecationLevel;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11370u0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11466l;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.collections.x */
public class C10994x extends C10992w {
    @C11110f
    /* renamed from: A0 */
    public static final <T> void m42340A0(Collection<? super T> collection, T[] tArr) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        m42362p0(collection, tArr);
    }

    @C11395k(level = DeprecationLevel.ERROR, message = "Use removeAt(index) instead.", replaceWith = @C11587t0(expression = "removeAt(index)", imports = {}))
    @C11110f
    /* renamed from: B0 */
    public static final <T> T m42341B0(List<T> list, int i) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return list.remove(i);
    }

    @C11110f
    /* renamed from: C0 */
    public static final <T> boolean m42342C0(Collection<? extends T> collection, T t) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        return C11370u0.m43685a(collection).remove(t);
    }

    /* renamed from: D0 */
    public static final <T> boolean m42343D0(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        return m42364r0(iterable, lVar, true);
    }

    /* renamed from: E0 */
    public static final <T> boolean m42344E0(@C12579k Collection<? super T> collection, @C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        return collection.removeAll(m42363q0(iterable));
    }

    @C11110f
    /* renamed from: F0 */
    public static final <T> boolean m42345F0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(collection2, "elements");
        return C11370u0.m43685a(collection).removeAll(collection2);
    }

    /* renamed from: G0 */
    public static final <T> boolean m42346G0(@C12579k Collection<? super T> collection, @C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        Collection c3 = SequencesKt___SequencesKt.m44731c3(mVar);
        if (!(!c3.isEmpty()) || !collection.removeAll(c3)) {
            return false;
        }
        return true;
    }

    /* renamed from: H0 */
    public static final <T> boolean m42347H0(@C12579k Collection<? super T> collection, @C12579k T[] tArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!(!z) || !collection.removeAll(C10956m.m41290t(tArr))) {
            return false;
        }
        return true;
    }

    /* renamed from: I0 */
    public static final <T> boolean m42348I0(@C12579k List<T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        return m42365s0(list, lVar, true);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.4")
    /* renamed from: J0 */
    public static final <T> T m42349J0(@C12579k List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    @C12580l
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: K0 */
    public static final <T> T m42350K0(@C12579k List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    @C11097g2(markerClass = {C11429q.class})
    @C11665v0(version = "1.4")
    /* renamed from: L0 */
    public static final <T> T m42351L0(@C12579k List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (!list.isEmpty()) {
            return list.remove(CollectionsKt__CollectionsKt.m40443G(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    @C12580l
    @C11665v0(version = "1.4")
    @C11097g2(markerClass = {C11429q.class})
    /* renamed from: M0 */
    public static final <T> T m42352M0(@C12579k List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(CollectionsKt__CollectionsKt.m40443G(list));
    }

    /* renamed from: N0 */
    public static final <T> boolean m42353N0(@C12579k Iterable<? extends T> iterable, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        return m42364r0(iterable, lVar, false);
    }

    /* renamed from: O0 */
    public static final <T> boolean m42354O0(@C12579k Collection<? super T> collection, @C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        return collection.retainAll(m42363q0(iterable));
    }

    @C11110f
    /* renamed from: P0 */
    public static final <T> boolean m42355P0(Collection<? extends T> collection, Collection<? extends T> collection2) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(collection2, "elements");
        return C11370u0.m43685a(collection).retainAll(collection2);
    }

    /* renamed from: Q0 */
    public static final <T> boolean m42356Q0(@C12579k Collection<? super T> collection, @C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        Collection c3 = SequencesKt___SequencesKt.m44731c3(mVar);
        if (!c3.isEmpty()) {
            return collection.retainAll(c3);
        }
        return m42359T0(collection);
    }

    /* renamed from: R0 */
    public static final <T> boolean m42357R0(@C12579k Collection<? super T> collection, @C12579k T[] tArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return collection.retainAll(C10956m.m41290t(tArr));
        }
        return m42359T0(collection);
    }

    /* renamed from: S0 */
    public static final <T> boolean m42358S0(@C12579k List<T> list, @C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        return m42365s0(list, lVar, false);
    }

    /* renamed from: T0 */
    public static final boolean m42359T0(Collection<?> collection) {
        boolean z = !collection.isEmpty();
        collection.clear();
        return z;
    }

    /* renamed from: n0 */
    public static final <T> boolean m42360n0(@C12579k Collection<? super T> collection, @C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        if (iterable instanceof Collection) {
            return collection.addAll((Collection) iterable);
        }
        boolean z = false;
        for (Object add : iterable) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: o0 */
    public static final <T> boolean m42361o0(@C12579k Collection<? super T> collection, @C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        boolean z = false;
        for (Object add : mVar) {
            if (collection.add(add)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: p0 */
    public static final <T> boolean m42362p0(@C12579k Collection<? super T> collection, @C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        return collection.addAll(C10956m.m41290t(tArr));
    }

    @C12579k
    /* renamed from: q0 */
    public static final <T> Collection<T> m42363q0(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        boolean z = iterable instanceof Collection;
        List<? extends T> list = iterable;
        if (!z) {
            list = CollectionsKt___CollectionsKt.m40557Q5(iterable);
        }
        return list;
    }

    /* renamed from: r0 */
    public static final <T> boolean m42364r0(Iterable<? extends T> iterable, C11300l<? super T, Boolean> lVar, boolean z) {
        Iterator<? extends T> it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (lVar.invoke(it.next()).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: s0 */
    public static final <T> boolean m42365s0(List<T> list, C11300l<? super T, Boolean> lVar, boolean z) {
        if (!(list instanceof RandomAccess)) {
            Intrinsics.checkNotNull(list, "null cannot be cast to non-null type kotlin.collections.MutableIterable<T of kotlin.collections.CollectionsKt__MutableCollectionsKt.filterInPlace>");
            return m42364r0(C11370u0.m43687c(list), lVar, z);
        }
        C10953k0 H = new C11466l(0, CollectionsKt__CollectionsKt.m40443G(list)).iterator();
        int i = 0;
        while (H.hasNext()) {
            int c = H.mo6374c();
            T t = list.get(c);
            if (lVar.invoke(t).booleanValue() != z) {
                if (i != c) {
                    list.set(i, t);
                }
                i++;
            }
        }
        if (i >= list.size()) {
            return false;
        }
        int G = CollectionsKt__CollectionsKt.m40443G(list);
        if (i > G) {
            return true;
        }
        while (true) {
            list.remove(G);
            if (G == i) {
                return true;
            }
            G--;
        }
    }

    @C11110f
    /* renamed from: t0 */
    public static final <T> void m42366t0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        m42344E0(collection, iterable);
    }

    @C11110f
    /* renamed from: u0 */
    public static final <T> void m42367u0(Collection<? super T> collection, T t) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        collection.remove(t);
    }

    @C11110f
    /* renamed from: v0 */
    public static final <T> void m42368v0(Collection<? super T> collection, C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        m42346G0(collection, mVar);
    }

    @C11110f
    /* renamed from: w0 */
    public static final <T> void m42369w0(Collection<? super T> collection, T[] tArr) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        m42347H0(collection, tArr);
    }

    @C11110f
    /* renamed from: x0 */
    public static final <T> void m42370x0(Collection<? super T> collection, Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        m42360n0(collection, iterable);
    }

    @C11110f
    /* renamed from: y0 */
    public static final <T> void m42371y0(Collection<? super T> collection, T t) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        collection.add(t);
    }

    @C11110f
    /* renamed from: z0 */
    public static final <T> void m42372z0(Collection<? super T> collection, C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(collection, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        m42361o0(collection, mVar);
    }
}
