package kotlin.collections;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\n_Sets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,139:1\n857#2,2:140\n847#2,2:142\n1#3:144\n*S KotlinDebug\n*F\n+ 1 _Sets.kt\nkotlin/collections/SetsKt___SetsKt\n*L\n28#1:140,2\n52#1:142,2\n*E\n"})
/* renamed from: kotlin.collections.e1 */
public class C10933e1 extends C10930d1 {
    @C12579k
    /* renamed from: A */
    public static final <T> Set<T> m40909A(@C12579k Set<? extends T> set, @C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C10994x.m42347H0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @C11110f
    /* renamed from: B */
    public static final <T> Set<T> m40910B(Set<? extends T> set, T t) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return m40917y(set, t);
    }

    @C12579k
    /* renamed from: C */
    public static final <T> Set<T> m40911C(@C12579k Set<? extends T> set, @C12579k Iterable<? extends T> iterable) {
        int i;
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        Integer Z = C10978t.m41496Z(iterable);
        if (Z != null) {
            i = set.size() + Z.intValue();
        } else {
            i = set.size() * 2;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(C10975r0.m41400j(i));
        linkedHashSet.addAll(set);
        C10994x.m42360n0(linkedHashSet, iterable);
        return linkedHashSet;
    }

    @C12579k
    /* renamed from: D */
    public static final <T> Set<T> m40912D(@C12579k Set<? extends T> set, T t) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C10975r0.m41400j(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    @C12579k
    /* renamed from: E */
    public static final <T> Set<T> m40913E(@C12579k Set<? extends T> set, @C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C10975r0.m41400j(set.size() * 2));
        linkedHashSet.addAll(set);
        C10994x.m42361o0(linkedHashSet, mVar);
        return linkedHashSet;
    }

    @C12579k
    /* renamed from: F */
    public static final <T> Set<T> m40914F(@C12579k Set<? extends T> set, @C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(tArr, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C10975r0.m41400j(set.size() + tArr.length));
        linkedHashSet.addAll(set);
        C10994x.m42362p0(linkedHashSet, tArr);
        return linkedHashSet;
    }

    @C11110f
    /* renamed from: G */
    public static final <T> Set<T> m40915G(Set<? extends T> set, T t) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        return m40912D(set, t);
    }

    @C12579k
    /* renamed from: x */
    public static final <T> Set<T> m40916x(@C12579k Set<? extends T> set, @C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(iterable, "elements");
        Collection<? extends T> q0 = C10994x.m42363q0(iterable);
        if (q0.isEmpty()) {
            return CollectionsKt___CollectionsKt.m40582V5(set);
        }
        if (q0 instanceof Set) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (Object next : set) {
                if (!q0.contains(next)) {
                    linkedHashSet.add(next);
                }
            }
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(set);
        linkedHashSet2.removeAll(q0);
        return linkedHashSet2;
    }

    @C12579k
    /* renamed from: y */
    public static final <T> Set<T> m40917y(@C12579k Set<? extends T> set, T t) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C10975r0.m41400j(set.size()));
        boolean z = false;
        for (Object next : set) {
            boolean z2 = true;
            if (!z && Intrinsics.areEqual(next, (Object) t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(next);
            }
        }
        return linkedHashSet;
    }

    @C12579k
    /* renamed from: z */
    public static final <T> Set<T> m40918z(@C12579k Set<? extends T> set, @C12579k C11559m<? extends T> mVar) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        Intrinsics.checkNotNullParameter(mVar, "elements");
        LinkedHashSet linkedHashSet = new LinkedHashSet(set);
        C10994x.m42346G0(linkedHashSet, mVar);
        return linkedHashSet;
    }
}
