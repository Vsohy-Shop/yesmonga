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
@C11363r0({"SMAP\nUShortArray.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1726#2,3:87\n*S KotlinDebug\n*F\n+ 1 UShortArray.kt\nkotlin/UShortArray\n*L\n62#1:87,3\n*E\n"})
/* renamed from: kotlin.a2 */
public final class C10857a2 implements Collection<C11679z1>, C11345a {
    @C12579k

    /* renamed from: a */
    public final short[] f28063a;

    /* renamed from: kotlin.a2$a */
    public static final class C10858a implements Iterator<C11679z1>, C11345a {
        @C12579k

        /* renamed from: a */
        public final short[] f28064a;

        /* renamed from: b */
        public int f28065b;

        public C10858a(@C12579k short[] sArr) {
            Intrinsics.checkNotNullParameter(sArr, "array");
            this.f28064a = sArr;
        }

        /* renamed from: b */
        public short mo21899b() {
            int i = this.f28065b;
            short[] sArr = this.f28064a;
            if (i < sArr.length) {
                this.f28065b = i + 1;
                return C11679z1.m45841M(sArr[i]);
            }
            throw new NoSuchElementException(String.valueOf(this.f28065b));
        }

        public boolean hasNext() {
            return this.f28065b < this.f28064a.length;
        }

        public /* bridge */ /* synthetic */ Object next() {
            return C11679z1.m45862g(mo21899b());
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @C11532s0
    public /* synthetic */ C10857a2(short[] sArr) {
        this.f28063a = sArr;
    }

    /* renamed from: H */
    public static boolean m38724H(short[] sArr, Object obj) {
        return (obj instanceof C10857a2) && Intrinsics.areEqual((Object) sArr, (Object) ((C10857a2) obj).mo21890m0());
    }

    /* renamed from: M */
    public static final boolean m38725M(short[] sArr, short[] sArr2) {
        return Intrinsics.areEqual((Object) sArr, (Object) sArr2);
    }

    /* renamed from: Q */
    public static final short m38726Q(short[] sArr, int i) {
        return C11679z1.m45841M(sArr[i]);
    }

    /* renamed from: X */
    public static int m38727X(short[] sArr) {
        return sArr.length;
    }

    @C11532s0
    /* renamed from: e0 */
    public static /* synthetic */ void m38728e0() {
    }

    /* renamed from: f0 */
    public static int m38729f0(short[] sArr) {
        return Arrays.hashCode(sArr);
    }

    /* renamed from: h */
    public static final /* synthetic */ C10857a2 m38730h(short[] sArr) {
        return new C10857a2(sArr);
    }

    /* renamed from: h0 */
    public static boolean m38731h0(short[] sArr) {
        return sArr.length == 0;
    }

    @C12579k
    /* renamed from: i */
    public static short[] m38732i(int i) {
        return m38736q(new short[i]);
    }

    @C12579k
    /* renamed from: i0 */
    public static Iterator<C11679z1> m38733i0(short[] sArr) {
        return new C10858a(sArr);
    }

    /* renamed from: j0 */
    public static final void m38734j0(short[] sArr, int i, short s) {
        sArr[i] = s;
    }

    /* renamed from: l0 */
    public static String m38735l0(short[] sArr) {
        return "UShortArray(storage=" + Arrays.toString(sArr) + ')';
    }

    @C12579k
    @C11532s0
    /* renamed from: q */
    public static short[] m38736q(@C12579k short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "storage");
        return sArr;
    }

    /* renamed from: w */
    public static boolean m38737w(short[] sArr, short s) {
        return ArraysKt___ArraysKt.m39420U8(sArr, s);
    }

    /* renamed from: y */
    public static boolean m38738y(short[] sArr, @C12579k Collection<C11679z1> collection) {
        boolean z;
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterable iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object next : iterable) {
            if (!(next instanceof C11679z1) || !ArraysKt___ArraysKt.m39420U8(sArr, ((C11679z1) next).mo23548e2())) {
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
        return m38727X(this.f28063a);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C11679z1> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C11679z1)) {
            return false;
        }
        return mo21891r(((C11679z1) obj).mo23548e2());
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return m38738y(this.f28063a, collection);
    }

    /* renamed from: e */
    public boolean mo21885e(short s) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(Object obj) {
        return m38724H(this.f28063a, obj);
    }

    public int hashCode() {
        return m38729f0(this.f28063a);
    }

    public boolean isEmpty() {
        return m38731h0(this.f28063a);
    }

    @C12579k
    public Iterator<C11679z1> iterator() {
        return m38733i0(this.f28063a);
    }

    /* renamed from: m0 */
    public final /* synthetic */ short[] mo21890m0() {
        return this.f28063a;
    }

    /* renamed from: r */
    public boolean mo21891r(short s) {
        return m38737w(this.f28063a, s);
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
        return m38735l0(this.f28063a);
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }
}
