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
@C11363r0({"SMAP\nUIntArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UIntArray.kt\nkotlin/UIntArray\n*L\n62#1:87,3\n*E\n"})
/* renamed from: kotlin.q1 */
public final class C11431q1 implements Collection<C11419p1>, C11345a {
    @C12579k

    /* renamed from: a */
    public final int[] f28559a;

    /* renamed from: kotlin.q1$a */
    public static final class C11432a implements Iterator<C11419p1>, C11345a {
        @C12579k

        /* renamed from: a */
        public final int[] f28560a;

        /* renamed from: b */
        public int f28561b;

        public C11432a(@C12579k int[] iArr) {
            Intrinsics.checkNotNullParameter(iArr, "array");
            this.f28560a = iArr;
        }

        /* renamed from: b */
        public int mo22961b() {
            int i = this.f28561b;
            int[] iArr = this.f28560a;
            if (i < iArr.length) {
                this.f28561b = i + 1;
                return C11419p1.m43971M(iArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f28561b));
        }

        public boolean hasNext() {
            return this.f28561b < this.f28560a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C11419p1.m43993g(mo22961b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @C11532s0
    public /* synthetic */ C11431q1(int[] iArr) {
        this.f28559a = iArr;
    }

    /* renamed from: H */
    public static boolean m44042H(int[] iArr, Object obj) {
        return (obj instanceof C11431q1) && Intrinsics.areEqual((Object) iArr, (Object) ((C11431q1) obj).mo22952m0());
    }

    /* renamed from: M */
    public static final boolean m44043M(int[] iArr, int[] iArr2) {
        return Intrinsics.areEqual((Object) iArr, (Object) iArr2);
    }

    /* renamed from: Q */
    public static final int m44044Q(int[] iArr, int i) {
        return C11419p1.m43971M(iArr[i]);
    }

    /* renamed from: X */
    public static int m44045X(int[] iArr) {
        return iArr.length;
    }

    @C11532s0
    /* renamed from: e0 */
    public static /* synthetic */ void m44046e0() {
    }

    /* renamed from: f0 */
    public static int m44047f0(int[] iArr) {
        return Arrays.hashCode(iArr);
    }

    /* renamed from: h */
    public static final /* synthetic */ C11431q1 m44048h(int[] iArr) {
        return new C11431q1(iArr);
    }

    /* renamed from: h0 */
    public static boolean m44049h0(int[] iArr) {
        return iArr.length == 0;
    }

    @C12579k
    /* renamed from: i */
    public static int[] m44050i(int i) {
        return m44054q(new int[i]);
    }

    @C12579k
    /* renamed from: i0 */
    public static Iterator<C11419p1> m44051i0(int[] iArr) {
        return new C11432a(iArr);
    }

    /* renamed from: j0 */
    public static final void m44052j0(int[] iArr, int i, int i2) {
        iArr[i] = i2;
    }

    /* renamed from: l0 */
    public static String m44053l0(int[] iArr) {
        return "UIntArray(storage=" + Arrays.toString(iArr) + ')';
    }

    @C12579k
    @C11532s0
    /* renamed from: q */
    public static int[] m44054q(@C12579k int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "storage");
        return iArr;
    }

    /* renamed from: w */
    public static boolean m44055w(int[] iArr, int i) {
        return ArraysKt___ArraysKt.m39324R8(iArr, i);
    }

    /* renamed from: y */
    public static boolean m44056y(int[] iArr, @C12579k Collection<C11419p1> collection) {
        boolean z;
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterable iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object next : iterable) {
            if (!(next instanceof C11419p1) || !ArraysKt___ArraysKt.m39324R8(iArr, ((C11419p1) next).mo22930j2())) {
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
        return m44045X(this.f28559a);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C11419p1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C11419p1)) {
            return false;
        }
        return mo22953r(((C11419p1) obj).mo22930j2());
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return m44056y(this.f28559a, collection);
    }

    /* renamed from: e */
    public boolean mo22947e(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        return m44042H(this.f28559a, obj);
    }

    public int hashCode() {
        return m44047f0(this.f28559a);
    }

    public boolean isEmpty() {
        return m44049h0(this.f28559a);
    }

    @C12579k
    public Iterator<C11419p1> iterator() {
        return m44051i0(this.f28559a);
    }

    /* renamed from: m0 */
    public final /* synthetic */ int[] mo22952m0() {
        return this.f28559a;
    }

    /* renamed from: r */
    public boolean mo22953r(int i) {
        return m44055w(this.f28559a, i);
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
        return m44053l0(this.f28559a);
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }
}
