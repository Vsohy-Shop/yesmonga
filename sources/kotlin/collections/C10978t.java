package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.C11078d1;
import kotlin.C11532s0;
import kotlin.Pair;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: kotlin.collections.t */
public class C10978t extends CollectionsKt__CollectionsKt {

    @C11363r0({"SMAP\nIterables.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Iterables.kt\nkotlin/collections/CollectionsKt__IterablesKt$Iterable$1\n*L\n1#1,70:1\n*E\n"})
    /* renamed from: kotlin.collections.t$a */
    public static final class C10979a implements Iterable<T>, C11345a {

        /* renamed from: a */
        public final /* synthetic */ C11289a<Iterator<T>> f28192a;

        public C10979a(C11289a<? extends Iterator<? extends T>> aVar) {
            this.f28192a = aVar;
        }

        @C12579k
        public Iterator<T> iterator() {
            return this.f28192a.invoke();
        }
    }

    @C11110f
    /* renamed from: X */
    public static final <T> Iterable<T> m41494X(C11289a<? extends Iterator<? extends T>> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "iterator");
        return new C10979a(aVar);
    }

    @C11532s0
    /* renamed from: Y */
    public static final <T> int m41495Y(@C12579k Iterable<? extends T> iterable, int i) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return i;
    }

    @C12580l
    @C11532s0
    /* renamed from: Z */
    public static final <T> Integer m41496Z(@C12579k Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        if (iterable instanceof Collection) {
            return Integer.valueOf(((Collection) iterable).size());
        }
        return null;
    }

    @C12579k
    /* renamed from: a0 */
    public static final <T> List<T> m41497a0(@C12579k Iterable<? extends Iterable<? extends T>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Iterable n0 : iterable) {
            C10994x.m42360n0(arrayList, n0);
        }
        return arrayList;
    }

    @C12579k
    /* renamed from: b0 */
    public static final <T, R> Pair<List<T>, List<R>> m41498b0(@C12579k Iterable<? extends Pair<? extends T, ? extends R>> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        int Y = m41495Y(iterable, 10);
        ArrayList arrayList = new ArrayList(Y);
        ArrayList arrayList2 = new ArrayList(Y);
        for (Pair pair : iterable) {
            arrayList.add(pair.mo21849e());
            arrayList2.add(pair.mo21851f());
        }
        return C11078d1.m42659a(arrayList, arrayList2);
    }
}
