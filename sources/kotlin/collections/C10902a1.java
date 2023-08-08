package kotlin.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.RandomAccess;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,207:1\n205#1:209\n205#1:210\n205#1:211\n1#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:209\n176#1:210\n189#1:211\n*E\n"})
/* renamed from: kotlin.collections.a1 */
public final class C10902a1<T> extends C10904b<T> implements RandomAccess {
    @C12579k

    /* renamed from: b */
    public final Object[] f28131b;

    /* renamed from: c */
    public final int f28132c;

    /* renamed from: d */
    public int f28133d;

    /* renamed from: e */
    public int f28134e;

    @C11363r0({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,207:1\n205#2:208\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:208\n*E\n"})
    /* renamed from: kotlin.collections.a1$a */
    public static final class C10903a extends C10899a<T> {

        /* renamed from: c */
        public int f28135c;

        /* renamed from: d */
        public int f28136d;

        /* renamed from: e */
        public final /* synthetic */ C10902a1<T> f28137e;

        public C10903a(C10902a1<T> a1Var) {
            this.f28137e = a1Var;
            this.f28135c = a1Var.size();
            this.f28136d = a1Var.f28133d;
        }

        /* renamed from: b */
        public void mo22036b() {
            if (this.f28135c == 0) {
                mo22037c();
                return;
            }
            mo22038d(this.f28137e.f28131b[this.f28136d]);
            this.f28136d = (this.f28136d + 1) % this.f28137e.f28132c;
            this.f28135c--;
        }
    }

    public C10902a1(@C12579k Object[] objArr, int i) {
        Intrinsics.checkNotNullParameter(objArr, "buffer");
        this.f28131b = objArr;
        boolean z = true;
        if (i >= 0) {
            if (i > objArr.length ? false : z) {
                this.f28132c = objArr.length;
                this.f28134e = i;
                return;
            }
            throw new IllegalArgumentException(("ring buffer filled size: " + i + " cannot be larger than the buffer size: " + objArr.length).toString());
        }
        throw new IllegalArgumentException(("ring buffer filled size should not be negative but it is " + i).toString());
    }

    /* renamed from: H */
    public final boolean mo22047H() {
        return size() == this.f28132c;
    }

    /* renamed from: M */
    public final void mo22048M(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i > size()) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(("n shouldn't be greater than the buffer size: n = " + i + ", size = " + size()).toString());
            } else if (i > 0) {
                int i2 = this.f28133d;
                int i3 = (i2 + i) % this.f28132c;
                if (i2 > i3) {
                    C10956m.m41251n2(this.f28131b, null, i2, this.f28132c);
                    C10956m.m41251n2(this.f28131b, null, 0, i3);
                } else {
                    C10956m.m41251n2(this.f28131b, null, i2, i3);
                }
                this.f28133d = i3;
                this.f28134e = size() - i;
            }
        } else {
            throw new IllegalArgumentException(("n shouldn't be negative but it is " + i).toString());
        }
    }

    /* renamed from: e */
    public int mo15650e() {
        return this.f28134e;
    }

    public T get(int i) {
        C10904b.f28138a.mo22056b(i, size());
        return this.f28131b[(this.f28133d + i) % this.f28132c];
    }

    @C12579k
    public Iterator<T> iterator() {
        return new C10903a(this);
    }

    /* renamed from: r */
    public final void mo22049r(T t) {
        if (!mo22047H()) {
            this.f28131b[(this.f28133d + size()) % this.f28132c] = t;
            this.f28134e = size() + 1;
            return;
        }
        throw new IllegalStateException("ring buffer is full");
    }

    @C12579k
    public <T> T[] toArray(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        if (tArr.length < size()) {
            tArr = Arrays.copyOf(tArr, size());
            Intrinsics.checkNotNullExpressionValue(tArr, "copyOf(this, newSize)");
        }
        int size = size();
        int i = this.f28133d;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size && i < this.f28132c) {
            tArr[i3] = this.f28131b[i];
            i3++;
            i++;
        }
        while (i3 < size) {
            tArr[i3] = this.f28131b[i2];
            i3++;
            i2++;
        }
        if (tArr.length > size()) {
            tArr[size()] = null;
        }
        return tArr;
    }

    @C12579k
    /* renamed from: w */
    public final C10902a1<T> mo22050w(int i) {
        Object[] objArr;
        int i2 = this.f28132c;
        int B = C11479u.m44313B(i2 + (i2 >> 1) + 1, i);
        if (this.f28133d == 0) {
            objArr = Arrays.copyOf(this.f28131b, B);
            Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
        } else {
            objArr = toArray(new Object[B]);
        }
        return new C10902a1<>(objArr, size());
    }

    /* renamed from: y */
    public final int mo22051y(int i, int i2) {
        return (i + i2) % this.f28132c;
    }

    public C10902a1(int i) {
        this(new Object[i], 0);
    }

    @C12579k
    public Object[] toArray() {
        return toArray(new Object[size()]);
    }
}
