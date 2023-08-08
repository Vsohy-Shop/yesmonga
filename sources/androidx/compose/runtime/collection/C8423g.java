package androidx.compose.runtime.collection;

import androidx.compose.runtime.internal.C8567o;
import androidx.vectordrawable.graphics.drawable.C20729i;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.KotlinNothingValueException;
import kotlin.collections.C10956m;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11349e;
import kotlin.jvm.internal.markers.C11350f;
import kotlin.ranges.C11466l;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
@C11363r0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1194:1\n48#1:1198\n48#1:1199\n523#1:1200\n53#1:1203\n523#1:1204\n48#1:1205\n523#1:1206\n523#1:1207\n523#1:1208\n48#1:1209\n523#1:1210\n48#1:1211\n523#1:1212\n523#1:1213\n523#1:1214\n48#1:1215\n523#1:1216\n48#1:1219\n48#1:1220\n48#1:1221\n523#1:1222\n1864#2,3:1195\n1855#2,2:1201\n1855#2,2:1217\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1198\n259#1:1199\n260#1:1200\n292#1:1203\n293#1:1204\n307#1:1205\n308#1:1206\n334#1:1207\n359#1:1208\n595#1:1209\n595#1:1210\n637#1:1211\n637#1:1212\n665#1:1213\n675#1:1214\n768#1:1215\n769#1:1216\n794#1:1219\n821#1:1220\n833#1:1221\n834#1:1222\n185#1:1195,3\n281#1:1201,2\n782#1:1217,2\n*E\n"})
/* renamed from: androidx.compose.runtime.collection.g */
public final class C8423g<T> implements RandomAccess {

    /* renamed from: d */
    public static final int f22782d = 8;
    @C12579k

    /* renamed from: a */
    public T[] f22783a;
    @C12580l

    /* renamed from: b */
    public List<T> f22784b;

    /* renamed from: c */
    public int f22785c;

    @C11363r0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1194:1\n523#2:1195\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n941#1:1195\n*E\n"})
    /* renamed from: androidx.compose.runtime.collection.g$a */
    public static final class C8424a<T> implements List<T>, C11349e {
        @C12579k

        /* renamed from: a */
        public final C8423g<T> f22786a;

        public C8424a(@C12579k C8423g<T> gVar) {
            Intrinsics.checkNotNullParameter(gVar, C20729i.f53485E0);
            this.f22786a = gVar;
        }

        public boolean add(T t) {
            return this.f22786a.mo15463e(t);
        }

        public boolean addAll(int i, @C12579k Collection<? extends T> collection) {
            Intrinsics.checkNotNullParameter(collection, "elements");
            return this.f22786a.mo15466g(i, collection);
        }

        public void clear() {
            this.f22786a.mo15490w();
        }

        public boolean contains(Object obj) {
            return this.f22786a.mo15492x(obj);
        }

        public boolean containsAll(@C12579k Collection<? extends Object> collection) {
            Intrinsics.checkNotNullParameter(collection, "elements");
            return this.f22786a.mo15432A(collection);
        }

        /* renamed from: e */
        public int mo15503e() {
            return this.f22786a.mo15469h0();
        }

        public T get(int i) {
            C8427h.m30413f(this, i);
            return this.f22786a.mo15462d0()[i];
        }

        /* renamed from: h */
        public T mo15505h(int i) {
            C8427h.m30413f(this, i);
            return this.f22786a.mo15437D0(i);
        }

        public int indexOf(Object obj) {
            return this.f22786a.mo15471i0(obj);
        }

        public boolean isEmpty() {
            return this.f22786a.mo15476l0();
        }

        @C12579k
        public Iterator<T> iterator() {
            return new C8426c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            return this.f22786a.mo15480p0(obj);
        }

        @C12579k
        public ListIterator<T> listIterator() {
            return new C8426c(this, 0);
        }

        public final /* bridge */ T remove(int i) {
            return mo15505h(i);
        }

        public boolean removeAll(@C12579k Collection<? extends Object> collection) {
            Intrinsics.checkNotNullParameter(collection, "elements");
            return this.f22786a.mo15434B0(collection);
        }

        public boolean retainAll(@C12579k Collection<? extends Object> collection) {
            Intrinsics.checkNotNullParameter(collection, "elements");
            return this.f22786a.mo15440F0(collection);
        }

        public T set(int i, T t) {
            C8427h.m30413f(this, i);
            return this.f22786a.mo15443H0(i, t);
        }

        public final /* bridge */ int size() {
            return mo15503e();
        }

        @C12579k
        public List<T> subList(int i, int i2) {
            C8427h.m30414g(this, i, i2);
            return new C8425b(this, i, i2);
        }

        public Object[] toArray() {
            return C11367t.m43656a(this);
        }

        public void add(int i, T t) {
            this.f22786a.mo15459a(i, t);
        }

        public boolean addAll(@C12579k Collection<? extends T> collection) {
            Intrinsics.checkNotNullParameter(collection, "elements");
            return this.f22786a.mo15472j(collection);
        }

        @C12579k
        public ListIterator<T> listIterator(int i) {
            return new C8426c(this, i);
        }

        public boolean remove(Object obj) {
            return this.f22786a.mo15495z0(obj);
        }

        public <T> T[] toArray(T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "array");
            return C11367t.m43657b(this, tArr);
        }
    }

    @C11363r0({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1194:1\n1855#2,2:1195\n1855#2,2:1197\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n1013#1:1195,2\n1095#1:1197,2\n*E\n"})
    /* renamed from: androidx.compose.runtime.collection.g$b */
    public static final class C8425b<T> implements List<T>, C11349e {
        @C12579k

        /* renamed from: a */
        public final List<T> f22787a;

        /* renamed from: b */
        public final int f22788b;

        /* renamed from: c */
        public int f22789c;

        public C8425b(@C12579k List<T> list, int i, int i2) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f22787a = list;
            this.f22788b = i;
            this.f22789c = i2;
        }

        public boolean add(T t) {
            List<T> list = this.f22787a;
            int i = this.f22789c;
            this.f22789c = i + 1;
            list.add(i, t);
            return true;
        }

        public boolean addAll(int i, @C12579k Collection<? extends T> collection) {
            Intrinsics.checkNotNullParameter(collection, "elements");
            this.f22787a.addAll(i + this.f22788b, collection);
            this.f22789c += collection.size();
            return collection.size() > 0;
        }

        public void clear() {
            int i = this.f22789c - 1;
            int i2 = this.f22788b;
            if (i2 <= i) {
                while (true) {
                    this.f22787a.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.f22789c = this.f22788b;
        }

        public boolean contains(Object obj) {
            int i = this.f22789c;
            for (int i2 = this.f22788b; i2 < i; i2++) {
                if (Intrinsics.areEqual((Object) this.f22787a.get(i2), obj)) {
                    return true;
                }
            }
            return false;
        }

        public boolean containsAll(@C12579k Collection<? extends Object> collection) {
            Intrinsics.checkNotNullParameter(collection, "elements");
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: e */
        public int mo15528e() {
            return this.f22789c - this.f22788b;
        }

        public T get(int i) {
            C8427h.m30413f(this, i);
            return this.f22787a.get(i + this.f22788b);
        }

        /* renamed from: h */
        public T mo15530h(int i) {
            C8427h.m30413f(this, i);
            this.f22789c--;
            return this.f22787a.remove(i + this.f22788b);
        }

        public int indexOf(Object obj) {
            int i = this.f22789c;
            for (int i2 = this.f22788b; i2 < i; i2++) {
                if (Intrinsics.areEqual((Object) this.f22787a.get(i2), obj)) {
                    return i2 - this.f22788b;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.f22789c == this.f22788b;
        }

        @C12579k
        public Iterator<T> iterator() {
            return new C8426c(this, 0);
        }

        public int lastIndexOf(Object obj) {
            int i = this.f22789c - 1;
            int i2 = this.f22788b;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.areEqual((Object) this.f22787a.get(i), obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f22788b;
        }

        @C12579k
        public ListIterator<T> listIterator() {
            return new C8426c(this, 0);
        }

        public final /* bridge */ T remove(int i) {
            return mo15530h(i);
        }

        public boolean removeAll(@C12579k Collection<? extends Object> collection) {
            Intrinsics.checkNotNullParameter(collection, "elements");
            int i = this.f22789c;
            for (Object remove : collection) {
                remove(remove);
            }
            if (i != this.f22789c) {
                return true;
            }
            return false;
        }

        public boolean retainAll(@C12579k Collection<? extends Object> collection) {
            Intrinsics.checkNotNullParameter(collection, "elements");
            int i = this.f22789c;
            int i2 = i - 1;
            int i3 = this.f22788b;
            if (i3 <= i2) {
                while (true) {
                    if (!collection.contains(this.f22787a.get(i2))) {
                        this.f22787a.remove(i2);
                        this.f22789c--;
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2--;
                }
            }
            if (i != this.f22789c) {
                return true;
            }
            return false;
        }

        public T set(int i, T t) {
            C8427h.m30413f(this, i);
            return this.f22787a.set(i + this.f22788b, t);
        }

        public final /* bridge */ int size() {
            return mo15528e();
        }

        @C12579k
        public List<T> subList(int i, int i2) {
            C8427h.m30414g(this, i, i2);
            return new C8425b(this, i, i2);
        }

        public Object[] toArray() {
            return C11367t.m43656a(this);
        }

        public void add(int i, T t) {
            this.f22787a.add(i + this.f22788b, t);
            this.f22789c++;
        }

        @C12579k
        public ListIterator<T> listIterator(int i) {
            return new C8426c(this, i);
        }

        public boolean remove(Object obj) {
            int i = this.f22789c;
            for (int i2 = this.f22788b; i2 < i; i2++) {
                if (Intrinsics.areEqual((Object) this.f22787a.get(i2), obj)) {
                    this.f22787a.remove(i2);
                    this.f22789c--;
                    return true;
                }
            }
            return false;
        }

        public <T> T[] toArray(T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "array");
            return C11367t.m43657b(this, tArr);
        }

        public boolean addAll(@C12579k Collection<? extends T> collection) {
            Intrinsics.checkNotNullParameter(collection, "elements");
            this.f22787a.addAll(this.f22789c, collection);
            this.f22789c += collection.size();
            return collection.size() > 0;
        }
    }

    /* renamed from: androidx.compose.runtime.collection.g$c */
    public static final class C8426c<T> implements ListIterator<T>, C11350f {
        @C12579k

        /* renamed from: a */
        public final List<T> f22790a;

        /* renamed from: b */
        public int f22791b;

        public C8426c(@C12579k List<T> list, int i) {
            Intrinsics.checkNotNullParameter(list, "list");
            this.f22790a = list;
            this.f22791b = i;
        }

        public void add(T t) {
            this.f22790a.add(this.f22791b, t);
            this.f22791b++;
        }

        public boolean hasNext() {
            return this.f22791b < this.f22790a.size();
        }

        public boolean hasPrevious() {
            return this.f22791b > 0;
        }

        public T next() {
            List<T> list = this.f22790a;
            int i = this.f22791b;
            this.f22791b = i + 1;
            return list.get(i);
        }

        public int nextIndex() {
            return this.f22791b;
        }

        public T previous() {
            int i = this.f22791b - 1;
            this.f22791b = i;
            return this.f22790a.get(i);
        }

        public int previousIndex() {
            return this.f22791b - 1;
        }

        public void remove() {
            int i = this.f22791b - 1;
            this.f22791b = i;
            this.f22790a.remove(i);
        }

        public void set(T t) {
            this.f22790a.set(this.f22791b, t);
        }
    }

    @C11532s0
    public C8423g(@C12579k T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "content");
        this.f22783a = tArr;
        this.f22785c = i;
    }

    @C11532s0
    /* renamed from: e0 */
    public static /* synthetic */ void m30339e0() {
    }

    /* renamed from: A */
    public final boolean mo15432A(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        for (Object x : collection) {
            if (!mo15492x(x)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: A0 */
    public final boolean mo15433A0(@C12579k C8423g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "elements");
        int i = this.f22785c;
        int h0 = gVar.mo15469h0() - 1;
        if (h0 >= 0) {
            int i2 = 0;
            while (true) {
                mo15495z0(gVar.mo15462d0()[i2]);
                if (i2 == h0) {
                    break;
                }
                i2++;
            }
        }
        if (i != this.f22785c) {
            return true;
        }
        return false;
    }

    /* renamed from: B0 */
    public final boolean mo15434B0(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        if (collection.isEmpty()) {
            return false;
        }
        int i = this.f22785c;
        for (Object z0 : collection) {
            mo15495z0(z0);
        }
        if (i != this.f22785c) {
            return true;
        }
        return false;
    }

    /* renamed from: C0 */
    public final boolean mo15435C0(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "elements");
        int i = this.f22785c;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            mo15495z0(list.get(i2));
        }
        if (i != this.f22785c) {
            return true;
        }
        return false;
    }

    /* renamed from: D */
    public final boolean mo15436D(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "elements");
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!mo15492x(list.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D0 */
    public final T mo15437D0(int i) {
        T[] tArr = this.f22783a;
        T t = tArr[i];
        if (i != mo15469h0() - 1) {
            C10956m.m41183c1(tArr, tArr, i, i + 1, this.f22785c);
        }
        int i2 = this.f22785c - 1;
        this.f22785c = i2;
        tArr[i2] = null;
        return t;
    }

    /* renamed from: E */
    public final boolean mo15438E(@C12579k C8423g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "other");
        if (gVar.f22785c != this.f22785c) {
            return false;
        }
        int h0 = mo15469h0() - 1;
        if (h0 >= 0) {
            int i = 0;
            while (Intrinsics.areEqual(gVar.mo15462d0()[i], mo15462d0()[i])) {
                if (i != h0) {
                    i++;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: E0 */
    public final void mo15439E0(int i, int i2) {
        if (i2 > i) {
            int i3 = this.f22785c;
            if (i2 < i3) {
                T[] tArr = this.f22783a;
                C10956m.m41183c1(tArr, tArr, i, i2, i3);
            }
            int i4 = this.f22785c - (i2 - i);
            int h0 = mo15469h0() - 1;
            if (i4 <= h0) {
                int i5 = i4;
                while (true) {
                    this.f22783a[i5] = null;
                    if (i5 == h0) {
                        break;
                    }
                    i5++;
                }
            }
            this.f22785c = i4;
        }
    }

    /* renamed from: F0 */
    public final boolean mo15440F0(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        int i = this.f22785c;
        for (int h0 = mo15469h0() - 1; -1 < h0; h0--) {
            if (!collection.contains(mo15462d0()[h0])) {
                mo15437D0(h0);
            }
        }
        if (i != this.f22785c) {
            return true;
        }
        return false;
    }

    /* renamed from: G0 */
    public final boolean mo15441G0(@C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int h0 = mo15469h0();
        if (h0 <= 0) {
            return false;
        }
        int i = h0 - 1;
        Object[] d0 = mo15462d0();
        while (!lVar.invoke(d0[i]).booleanValue()) {
            i--;
            if (i < 0) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    public final void mo15442H(int i) {
        T[] tArr = this.f22783a;
        if (tArr.length < i) {
            T[] copyOf = Arrays.copyOf(tArr, Math.max(i, tArr.length * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f22783a = copyOf;
        }
    }

    /* renamed from: H0 */
    public final T mo15443H0(int i, T t) {
        T[] tArr = this.f22783a;
        T t2 = tArr[i];
        tArr[i] = t;
        return t2;
    }

    /* renamed from: I0 */
    public final void mo15444I0(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<set-?>");
        this.f22783a = tArr;
    }

    /* renamed from: J0 */
    public final void mo15445J0(@C12579k Comparator<T> comparator) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        C10956m.m41073J4(this.f22783a, comparator, 0, this.f22785c);
    }

    /* renamed from: K */
    public final T mo15446K() {
        if (!mo15476l0()) {
            return mo15462d0()[0];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    /* renamed from: K0 */
    public final int mo15447K0(@C12579k C11300l<? super T, Integer> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "selector");
        int h0 = mo15469h0();
        int i = 0;
        if (h0 > 0) {
            Object[] d0 = mo15462d0();
            int i2 = 0;
            do {
                i += lVar.invoke(d0[i2]).intValue();
                i2++;
            } while (i2 < h0);
        }
        return i;
    }

    /* renamed from: L */
    public final T mo15448L(@C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int h0 = mo15469h0();
        if (h0 > 0) {
            T[] d0 = mo15462d0();
            int i = 0;
            do {
                T t = d0[i];
                if (lVar.invoke(t).booleanValue()) {
                    return t;
                }
                i++;
            } while (i < h0);
        }
        mo15449L0();
        throw new KotlinNothingValueException();
    }

    @C12579k
    @C11532s0
    /* renamed from: L0 */
    public final Void mo15449L0() {
        throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
    }

    @C12580l
    /* renamed from: M */
    public final T mo15450M() {
        if (mo15476l0()) {
            return null;
        }
        return mo15462d0()[0];
    }

    @C12580l
    /* renamed from: O */
    public final T mo15451O(@C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int h0 = mo15469h0();
        if (h0 <= 0) {
            return null;
        }
        T[] d0 = mo15462d0();
        int i = 0;
        do {
            T t = d0[i];
            if (lVar.invoke(t).booleanValue()) {
                return t;
            }
            i++;
        } while (i < h0);
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super R, ? super T, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R mo15452P(R r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super R, ? super T, ? extends R> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r4.mo15469h0()
            if (r0 <= 0) goto L_0x001a
            java.lang.Object[] r1 = r4.mo15462d0()
            r2 = 0
        L_0x0010:
            r3 = r1[r2]
            java.lang.Object r5 = r6.invoke(r5, r3)
            int r2 = r2 + 1
            if (r2 < r0) goto L_0x0010
        L_0x001a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.C8423g.mo15452P(java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super R, ? super T, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: Q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R mo15453Q(R r6, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super R, ? super T, ? extends R> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            int r0 = r5.mo15469h0()
            if (r0 <= 0) goto L_0x001e
            java.lang.Object[] r1 = r5.mo15462d0()
            r2 = 0
        L_0x0010:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = r1[r2]
            java.lang.Object r6 = r7.invoke(r3, r6, r4)
            int r2 = r2 + 1
            if (r2 < r0) goto L_0x0010
        L_0x001e:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.C8423g.mo15453Q(java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, kotlin.jvm.functions.p<? super T, ? super R, ? extends R>, kotlin.jvm.functions.p] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R mo15454R(R r4, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super T, ? super R, ? extends R> r5) {
        /*
            r3 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r3.mo15469h0()
            if (r0 <= 0) goto L_0x001b
            int r0 = r0 + -1
            java.lang.Object[] r1 = r3.mo15462d0()
        L_0x0011:
            r2 = r1[r0]
            java.lang.Object r4 = r5.invoke(r2, r4)
            int r0 = r0 + -1
            if (r0 >= 0) goto L_0x0011
        L_0x001b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.C8423g.mo15454R(java.lang.Object, kotlin.jvm.functions.p):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [kotlin.jvm.functions.q, java.lang.Object, kotlin.jvm.functions.q<? super java.lang.Integer, ? super T, ? super R, ? extends R>] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: S */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <R> R mo15455S(R r5, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11305q<? super java.lang.Integer, ? super T, ? super R, ? extends R> r6) {
        /*
            r4 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r4.mo15469h0()
            if (r0 <= 0) goto L_0x001f
            int r0 = r0 + -1
            java.lang.Object[] r1 = r4.mo15462d0()
        L_0x0011:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r3 = r1[r0]
            java.lang.Object r5 = r6.invoke(r2, r3, r5)
            int r0 = r0 + -1
            if (r0 >= 0) goto L_0x0011
        L_0x001f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.collection.C8423g.mo15455S(java.lang.Object, kotlin.jvm.functions.q):java.lang.Object");
    }

    /* renamed from: W */
    public final void mo15456W(@C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int h0 = mo15469h0();
        if (h0 > 0) {
            Object[] d0 = mo15462d0();
            int i = 0;
            do {
                lVar.invoke(d0[i]);
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: X */
    public final void mo15457X(@C12579k C11304p<? super Integer, ? super T, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        int h0 = mo15469h0();
        if (h0 > 0) {
            Object[] d0 = mo15462d0();
            int i = 0;
            do {
                pVar.invoke(Integer.valueOf(i), d0[i]);
                i++;
            } while (i < h0);
        }
    }

    /* renamed from: Y */
    public final void mo15458Y(@C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int h0 = mo15469h0();
        if (h0 > 0) {
            int i = h0 - 1;
            Object[] d0 = mo15462d0();
            do {
                lVar.invoke(d0[i]);
                i--;
            } while (i >= 0);
        }
    }

    /* renamed from: a */
    public final void mo15459a(int i, T t) {
        mo15442H(this.f22785c + 1);
        T[] tArr = this.f22783a;
        int i2 = this.f22785c;
        if (i != i2) {
            C10956m.m41183c1(tArr, tArr, i + 1, i, i2);
        }
        tArr[i] = t;
        this.f22785c++;
    }

    /* renamed from: a0 */
    public final void mo15460a0(@C12579k C11304p<? super Integer, ? super T, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(pVar, C28534f.f69159i0);
        if (mo15469h0() > 0) {
            int h0 = mo15469h0() - 1;
            Object[] d0 = mo15462d0();
            do {
                pVar.invoke(Integer.valueOf(h0), d0[h0]);
                h0--;
            } while (h0 >= 0);
        }
    }

    /* renamed from: b0 */
    public final T mo15461b0(int i) {
        return mo15462d0()[i];
    }

    @C12579k
    /* renamed from: d0 */
    public final T[] mo15462d0() {
        return this.f22783a;
    }

    /* renamed from: e */
    public final boolean mo15463e(T t) {
        mo15442H(this.f22785c + 1);
        T[] tArr = this.f22783a;
        int i = this.f22785c;
        tArr[i] = t;
        this.f22785c = i + 1;
        return true;
    }

    /* renamed from: f */
    public final boolean mo15464f(int i, @C12579k C8423g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "elements");
        if (gVar.mo15476l0()) {
            return false;
        }
        mo15442H(this.f22785c + gVar.f22785c);
        T[] tArr = this.f22783a;
        int i2 = this.f22785c;
        if (i != i2) {
            C10956m.m41183c1(tArr, tArr, gVar.f22785c + i, i, i2);
        }
        C10956m.m41183c1(gVar.f22783a, tArr, i, 0, gVar.f22785c);
        this.f22785c += gVar.f22785c;
        return true;
    }

    @C12579k
    /* renamed from: f0 */
    public final C11466l mo15465f0() {
        return new C11466l(0, mo15469h0() - 1);
    }

    /* renamed from: g */
    public final boolean mo15466g(int i, @C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        int i2 = 0;
        if (collection.isEmpty()) {
            return false;
        }
        mo15442H(this.f22785c + collection.size());
        T[] tArr = this.f22783a;
        if (i != this.f22785c) {
            C10956m.m41183c1(tArr, tArr, collection.size() + i, i, this.f22785c);
        }
        for (T next : collection) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.m40459W();
            }
            tArr[i2 + i] = next;
            i2 = i3;
        }
        this.f22785c += collection.size();
        return true;
    }

    /* renamed from: g0 */
    public final int mo15467g0() {
        return mo15469h0() - 1;
    }

    /* renamed from: h */
    public final boolean mo15468h(int i, @C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "elements");
        if (list.isEmpty()) {
            return false;
        }
        mo15442H(this.f22785c + list.size());
        T[] tArr = this.f22783a;
        if (i != this.f22785c) {
            C10956m.m41183c1(tArr, tArr, list.size() + i, i, this.f22785c);
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            tArr[i + i2] = list.get(i2);
        }
        this.f22785c += list.size();
        return true;
    }

    /* renamed from: h0 */
    public final int mo15469h0() {
        return this.f22785c;
    }

    /* renamed from: i */
    public final boolean mo15470i(@C12579k C8423g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "elements");
        return mo15464f(mo15469h0(), gVar);
    }

    /* renamed from: i0 */
    public final int mo15471i0(T t) {
        int i = this.f22785c;
        if (i <= 0) {
            return -1;
        }
        T[] tArr = this.f22783a;
        int i2 = 0;
        while (!Intrinsics.areEqual((Object) t, (Object) tArr[i2])) {
            i2++;
            if (i2 >= i) {
                return -1;
            }
        }
        return i2;
    }

    /* renamed from: j */
    public final boolean mo15472j(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return mo15466g(this.f22785c, collection);
    }

    /* renamed from: j0 */
    public final int mo15473j0(@C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int h0 = mo15469h0();
        if (h0 <= 0) {
            return -1;
        }
        Object[] d0 = mo15462d0();
        int i = 0;
        while (!lVar.invoke(d0[i]).booleanValue()) {
            i++;
            if (i >= h0) {
                return -1;
            }
        }
        return i;
    }

    /* renamed from: k */
    public final boolean mo15474k(@C12579k List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "elements");
        return mo15468h(mo15469h0(), list);
    }

    /* renamed from: k0 */
    public final int mo15475k0(@C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int h0 = mo15469h0();
        if (h0 <= 0) {
            return -1;
        }
        int i = h0 - 1;
        Object[] d0 = mo15462d0();
        while (!lVar.invoke(d0[i]).booleanValue()) {
            i--;
            if (i < 0) {
                return -1;
            }
        }
        return i;
    }

    /* renamed from: l0 */
    public final boolean mo15476l0() {
        return this.f22785c == 0;
    }

    /* renamed from: m0 */
    public final boolean mo15477m0() {
        return this.f22785c != 0;
    }

    /* renamed from: n0 */
    public final T mo15478n0() {
        if (!mo15476l0()) {
            return mo15462d0()[mo15469h0() - 1];
        }
        throw new NoSuchElementException("MutableVector is empty.");
    }

    /* renamed from: o0 */
    public final T mo15479o0(@C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int h0 = mo15469h0();
        if (h0 > 0) {
            int i = h0 - 1;
            T[] d0 = mo15462d0();
            do {
                T t = d0[i];
                if (lVar.invoke(t).booleanValue()) {
                    return t;
                }
                i--;
            } while (i >= 0);
        }
        mo15449L0();
        throw new KotlinNothingValueException();
    }

    /* renamed from: p0 */
    public final int mo15480p0(T t) {
        int i = this.f22785c;
        if (i <= 0) {
            return -1;
        }
        int i2 = i - 1;
        T[] tArr = this.f22783a;
        while (!Intrinsics.areEqual((Object) t, (Object) tArr[i2])) {
            i2--;
            if (i2 < 0) {
                return -1;
            }
        }
        return i2;
    }

    /* renamed from: q */
    public final boolean mo15481q(@C12579k T[] tArr) {
        boolean z;
        Intrinsics.checkNotNullParameter(tArr, "elements");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return false;
        }
        mo15442H(this.f22785c + tArr.length);
        C10956m.m41237l1(tArr, this.f22783a, this.f22785c, 0, 0, 12, (Object) null);
        this.f22785c += tArr.length;
        return true;
    }

    @C12580l
    /* renamed from: q0 */
    public final T mo15482q0() {
        if (mo15476l0()) {
            return null;
        }
        return mo15462d0()[mo15469h0() - 1];
    }

    /* renamed from: r */
    public final boolean mo15483r(@C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int h0 = mo15469h0();
        if (h0 > 0) {
            Object[] d0 = mo15462d0();
            int i = 0;
            while (!lVar.invoke(d0[i]).booleanValue()) {
                i++;
                if (i >= h0) {
                }
            }
            return true;
        }
        return false;
    }

    @C12580l
    /* renamed from: r0 */
    public final T mo15484r0(@C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int h0 = mo15469h0();
        if (h0 <= 0) {
            return null;
        }
        int i = h0 - 1;
        T[] d0 = mo15462d0();
        do {
            T t = d0[i];
            if (lVar.invoke(t).booleanValue()) {
                return t;
            }
            i--;
        } while (i >= 0);
        return null;
    }

    @C12579k
    /* renamed from: s */
    public final List<T> mo15485s() {
        List<T> list = this.f22784b;
        if (list != null) {
            return list;
        }
        C8424a aVar = new C8424a(this);
        this.f22784b = aVar;
        return aVar;
    }

    /* renamed from: s0 */
    public final /* synthetic */ <R> R[] mo15486s0(C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int h0 = mo15469h0();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = new Object[h0];
        for (int i = 0; i < h0; i++) {
            rArr[i] = lVar.invoke(mo15462d0()[i]);
        }
        return rArr;
    }

    /* renamed from: t0 */
    public final /* synthetic */ <R> R[] mo15487t0(C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int h0 = mo15469h0();
        Intrinsics.reifiedOperationMarker(0, "R");
        R[] rArr = new Object[h0];
        for (int i = 0; i < h0; i++) {
            rArr[i] = pVar.invoke(Integer.valueOf(i), mo15462d0()[i]);
        }
        return rArr;
    }

    /* renamed from: u0 */
    public final /* synthetic */ <R> C8423g<R> mo15488u0(C11304p<? super Integer, ? super T, ? extends R> pVar) {
        Intrinsics.checkNotNullParameter(pVar, "transform");
        int h0 = mo15469h0();
        int i = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[h0];
        if (h0 > 0) {
            Object[] d0 = mo15462d0();
            int i2 = 0;
            do {
                Object invoke = pVar.invoke(Integer.valueOf(i), d0[i]);
                if (invoke != null) {
                    objArr[i2] = invoke;
                    i2++;
                }
                i++;
            } while (i < h0);
            i = i2;
        }
        return new C8423g<>(objArr, i);
    }

    /* renamed from: v0 */
    public final /* synthetic */ <R> C8423g<R> mo15489v0(C11300l<? super T, ? extends R> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "transform");
        int h0 = mo15469h0();
        int i = 0;
        Intrinsics.reifiedOperationMarker(0, "R?");
        Object[] objArr = new Object[h0];
        if (h0 > 0) {
            Object[] d0 = mo15462d0();
            int i2 = 0;
            do {
                Object invoke = lVar.invoke(d0[i]);
                if (invoke != null) {
                    objArr[i2] = invoke;
                    i2++;
                }
                i++;
            } while (i < h0);
            i = i2;
        }
        return new C8423g<>(objArr, i);
    }

    /* renamed from: w */
    public final void mo15490w() {
        T[] tArr = this.f22783a;
        int h0 = mo15469h0();
        while (true) {
            h0--;
            if (-1 < h0) {
                tArr[h0] = null;
            } else {
                this.f22785c = 0;
                return;
            }
        }
    }

    /* renamed from: w0 */
    public final void mo15491w0(T t) {
        mo15495z0(t);
    }

    /* renamed from: x */
    public final boolean mo15492x(T t) {
        int h0 = mo15469h0() - 1;
        if (h0 >= 0) {
            int i = 0;
            while (!Intrinsics.areEqual(mo15462d0()[i], (Object) t)) {
                if (i != h0) {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: y */
    public final boolean mo15493y(@C12579k C8423g<T> gVar) {
        Intrinsics.checkNotNullParameter(gVar, "elements");
        C11466l lVar = new C11466l(0, gVar.mo15469h0() - 1);
        int r = lVar.mo23049r();
        int w = lVar.mo23051w();
        if (r <= w) {
            while (mo15492x(gVar.mo15462d0()[r])) {
                if (r != w) {
                    r++;
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: y0 */
    public final void mo15494y0(T t) {
        mo15463e(t);
    }

    /* renamed from: z0 */
    public final boolean mo15495z0(T t) {
        int i0 = mo15471i0(t);
        if (i0 < 0) {
            return false;
        }
        mo15437D0(i0);
        return true;
    }
}
