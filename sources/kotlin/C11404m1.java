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
@C11363r0({"SMAP\nUByteArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UByteArray.kt\nkotlin/UByteArray\n*L\n62#1:87,3\n*E\n"})
/* renamed from: kotlin.m1 */
public final class C11404m1 implements Collection<C11400l1>, C11345a {
    @C12579k

    /* renamed from: a */
    public final byte[] f28536a;

    /* renamed from: kotlin.m1$a */
    public static final class C11405a implements Iterator<C11400l1>, C11345a {
        @C12579k

        /* renamed from: a */
        public final byte[] f28537a;

        /* renamed from: b */
        public int f28538b;

        public C11405a(@C12579k byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "array");
            this.f28537a = bArr;
        }

        /* renamed from: b */
        public byte mo22922b() {
            int i = this.f28538b;
            byte[] bArr = this.f28537a;
            if (i < bArr.length) {
                this.f28538b = i + 1;
                return C11400l1.m43761M(bArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f28538b));
        }

        public boolean hasNext() {
            return this.f28538b < this.f28537a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C11400l1.m43782g(mo22922b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @C11532s0
    public /* synthetic */ C11404m1(byte[] bArr) {
        this.f28536a = bArr;
    }

    /* renamed from: H */
    public static boolean m43806H(byte[] bArr, Object obj) {
        return (obj instanceof C11404m1) && Intrinsics.areEqual((Object) bArr, (Object) ((C11404m1) obj).mo22913m0());
    }

    /* renamed from: M */
    public static final boolean m43807M(byte[] bArr, byte[] bArr2) {
        return Intrinsics.areEqual((Object) bArr, (Object) bArr2);
    }

    /* renamed from: Q */
    public static final byte m43808Q(byte[] bArr, int i) {
        return C11400l1.m43761M(bArr[i]);
    }

    /* renamed from: X */
    public static int m43809X(byte[] bArr) {
        return bArr.length;
    }

    @C11532s0
    /* renamed from: e0 */
    public static /* synthetic */ void m43810e0() {
    }

    /* renamed from: f0 */
    public static int m43811f0(byte[] bArr) {
        return Arrays.hashCode(bArr);
    }

    /* renamed from: h */
    public static final /* synthetic */ C11404m1 m43812h(byte[] bArr) {
        return new C11404m1(bArr);
    }

    /* renamed from: h0 */
    public static boolean m43813h0(byte[] bArr) {
        return bArr.length == 0;
    }

    @C12579k
    /* renamed from: i */
    public static byte[] m43814i(int i) {
        return m43818q(new byte[i]);
    }

    @C12579k
    /* renamed from: i0 */
    public static Iterator<C11400l1> m43815i0(byte[] bArr) {
        return new C11405a(bArr);
    }

    /* renamed from: j0 */
    public static final void m43816j0(byte[] bArr, int i, byte b) {
        bArr[i] = b;
    }

    /* renamed from: l0 */
    public static String m43817l0(byte[] bArr) {
        return "UByteArray(storage=" + Arrays.toString(bArr) + ')';
    }

    @C12579k
    @C11532s0
    /* renamed from: q */
    public static byte[] m43818q(@C12579k byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "storage");
        return bArr;
    }

    /* renamed from: w */
    public static boolean m43819w(byte[] bArr, byte b) {
        return ArraysKt___ArraysKt.m39196N8(bArr, b);
    }

    /* renamed from: y */
    public static boolean m43820y(byte[] bArr, @C12579k Collection<C11400l1> collection) {
        boolean z;
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterable iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object next : iterable) {
            if (!(next instanceof C11400l1) || !ArraysKt___ArraysKt.m39196N8(bArr, ((C11400l1) next).mo22897e2())) {
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
        return m43809X(this.f28536a);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C11400l1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C11400l1)) {
            return false;
        }
        return mo22914r(((C11400l1) obj).mo22897e2());
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return m43820y(this.f28536a, collection);
    }

    /* renamed from: e */
    public boolean mo22908e(byte b) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        return m43806H(this.f28536a, obj);
    }

    public int hashCode() {
        return m43811f0(this.f28536a);
    }

    public boolean isEmpty() {
        return m43813h0(this.f28536a);
    }

    @C12579k
    public Iterator<C11400l1> iterator() {
        return m43815i0(this.f28536a);
    }

    /* renamed from: m0 */
    public final /* synthetic */ byte[] mo22913m0() {
        return this.f28536a;
    }

    /* renamed from: r */
    public boolean mo22914r(byte b) {
        return m43819w(this.f28536a, b);
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
        return m43817l0(this.f28536a);
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }
}
