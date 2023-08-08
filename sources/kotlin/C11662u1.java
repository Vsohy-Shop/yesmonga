package kotlin;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.C11288f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

@C11531s
@C11665v0(version = "1.3")
@C11288f
@C11363r0({"SMAP\nULongArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 ULongArray.kt\nkotlin/ULongArray\n*L\n62#1:87,3\n*E\n"})
/* renamed from: kotlin.u1 */
public final class C11662u1 implements Collection<C11588t1>, C11345a {
    @C12579k

    /* renamed from: a */
    public final long[] f28974a;

    /* renamed from: kotlin.u1$a */
    public static final class C11663a implements Iterator<C11588t1>, C11345a {
        @C12579k

        /* renamed from: a */
        public final long[] f28975a;

        /* renamed from: b */
        public int f28976b;

        public C11663a(@C12579k long[] jArr) {
            Intrinsics.checkNotNullParameter(jArr, "array");
            this.f28975a = jArr;
        }

        /* renamed from: b */
        public long mo23530b() {
            int i = this.f28976b;
            long[] jArr = this.f28975a;
            if (i < jArr.length) {
                this.f28976b = i + 1;
                return C11588t1.m44970M(jArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f28976b));
        }

        public boolean hasNext() {
            return this.f28976b < this.f28975a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C11588t1.m44992g(mo23530b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @C11532s0
    public /* synthetic */ C11662u1(long[] jArr) {
        this.f28974a = jArr;
    }

    /* renamed from: H */
    public static boolean m45748H(long[] jArr, Object obj) {
        return (obj instanceof C11662u1) && Intrinsics.areEqual((Object) jArr, (Object) ((C11662u1) obj).mo23521m0());
    }

    /* renamed from: M */
    public static final boolean m45749M(long[] jArr, long[] jArr2) {
        return Intrinsics.areEqual((Object) jArr, (Object) jArr2);
    }

    /* renamed from: Q */
    public static final long m45750Q(long[] jArr, int i) {
        return C11588t1.m44970M(jArr[i]);
    }

    /* renamed from: X */
    public static int m45751X(long[] jArr) {
        return jArr.length;
    }

    @C11532s0
    /* renamed from: e0 */
    public static /* synthetic */ void m45752e0() {
    }

    /* renamed from: f0 */
    public static int m45753f0(long[] jArr) {
        return Arrays.hashCode(jArr);
    }

    /* renamed from: h */
    public static final /* synthetic */ C11662u1 m45754h(long[] jArr) {
        return new C11662u1(jArr);
    }

    /* renamed from: h0 */
    public static boolean m45755h0(long[] jArr) {
        return jArr.length == 0;
    }

    @C12579k
    /* renamed from: i */
    public static long[] m45756i(int i) {
        return m45760q(new long[i]);
    }

    @C12579k
    /* renamed from: i0 */
    public static Iterator<C11588t1> m45757i0(long[] jArr) {
        return new C11663a(jArr);
    }

    /* renamed from: j0 */
    public static final void m45758j0(long[] jArr, int i, long j) {
        jArr[i] = j;
    }

    /* renamed from: l0 */
    public static String m45759l0(long[] jArr) {
        return "ULongArray(storage=" + Arrays.toString(jArr) + ')';
    }

    @C12579k
    @C11532s0
    /* renamed from: q */
    public static long[] m45760q(@C12579k long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "storage");
        return jArr;
    }

    /* renamed from: w */
    public static boolean m45761w(long[] jArr, long j) {
        return ArraysKt___ArraysKt.m39356S8(jArr, j);
    }

    /* renamed from: y */
    public static boolean m45762y(long[] jArr, @C12579k Collection<C11588t1> collection) {
        boolean z;
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterable iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object next : iterable) {
            if (!(next instanceof C11588t1) || !ArraysKt___ArraysKt.m39356S8(jArr, ((C11588t1) next).mo23301j2())) {
                z = false;
                continue;
            } else {
                z = true;
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: W */
    public int size() {
        return m45751X(this.f28974a);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C11588t1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C11588t1)) {
            return false;
        }
        return mo23522r(((C11588t1) obj).mo23301j2());
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return m45762y(this.f28974a, collection);
    }

    /* renamed from: e */
    public boolean mo23516e(long j) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        return m45748H(this.f28974a, obj);
    }

    public int hashCode() {
        return m45753f0(this.f28974a);
    }

    public boolean isEmpty() {
        return m45755h0(this.f28974a);
    }

    @C12579k
    public Iterator<C11588t1> iterator() {
        return m45757i0(this.f28974a);
    }

    /* renamed from: m0 */
    public final /* synthetic */ long[] mo23521m0() {
        return this.f28974a;
    }

    /* renamed from: r */
    public boolean mo23522r(long j) {
        return m45761w(this.f28974a, j);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    public String toString() {
        return m45759l0(this.f28974a);
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }
}
