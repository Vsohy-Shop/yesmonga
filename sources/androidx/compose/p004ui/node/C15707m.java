package androidx.compose.p004ui.node;

import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.C11079d2;
import kotlin.collections.C10956m;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n194#1:341,2\n*E\n"})
/* renamed from: androidx.compose.ui.node.m */
public final class C15707m<T> implements List<T>, C11345a {
    @C12579k

    /* renamed from: a */
    public Object[] f39028a = new Object[16];
    @C12579k

    /* renamed from: b */
    public long[] f39029b = new long[16];

    /* renamed from: c */
    public int f39030c = -1;

    /* renamed from: d */
    public int f39031d;

    @C11363r0({"SMAP\nHitTestResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,340:1\n1855#2,2:341\n*S KotlinDebug\n*F\n+ 1 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult$SubList\n*L\n272#1:341,2\n*E\n"})
    /* renamed from: androidx.compose.ui.node.m$b */
    public final class C15709b implements List<T>, C11345a {

        /* renamed from: a */
        public final int f39036a;

        /* renamed from: b */
        public final int f39037b;

        public C15709b(int i, int i2) {
            this.f39036a = i;
            this.f39037b = i2;
        }

        public void add(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(int i, Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean contains(Object obj) {
            return indexOf(obj) != -1;
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
        public final int mo45135e() {
            return this.f39037b;
        }

        public T get(int i) {
            return C15707m.this.f39028a[i + this.f39036a];
        }

        /* renamed from: h */
        public final int mo45137h() {
            return this.f39036a;
        }

        /* renamed from: i */
        public int mo45138i() {
            return this.f39037b - this.f39036a;
        }

        public int indexOf(Object obj) {
            int i = this.f39036a;
            int i2 = this.f39037b;
            if (i > i2) {
                return -1;
            }
            while (!Intrinsics.areEqual(C15707m.this.f39028a[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i++;
            }
            return i - this.f39036a;
        }

        public boolean isEmpty() {
            return size() == 0;
        }

        @C12579k
        public Iterator<T> iterator() {
            C15707m<T> mVar = C15707m.this;
            int i = this.f39036a;
            return new C15708a(i, i, this.f39037b);
        }

        public int lastIndexOf(Object obj) {
            int i = this.f39037b;
            int i2 = this.f39036a;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.areEqual(C15707m.this.f39028a[i], obj)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.f39036a;
        }

        @C12579k
        public ListIterator<T> listIterator() {
            C15707m<T> mVar = C15707m.this;
            int i = this.f39036a;
            return new C15708a(i, i, this.f39037b);
        }

        public T remove(int i) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void replaceAll(UnaryOperator<T> unaryOperator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public T set(int i, T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final /* bridge */ int size() {
            return mo45138i();
        }

        public void sort(Comparator<? super T> comparator) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @C12579k
        public List<T> subList(int i, int i2) {
            C15707m<T> mVar = C15707m.this;
            int i3 = this.f39036a;
            return new C15709b(i + i3, i3 + i2);
        }

        public Object[] toArray() {
            return C11367t.m43656a(this);
        }

        public boolean add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection<? extends T> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @C12579k
        public ListIterator<T> listIterator(int i) {
            C15707m<T> mVar = C15707m.this;
            int i2 = this.f39036a;
            return new C15708a(i + i2, i2, this.f39037b);
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public <T> T[] toArray(T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "array");
            return C11367t.m43657b(this, tArr);
        }
    }

    /* renamed from: H */
    public final boolean mo45079H() {
        long w = mo45113w();
        if (C15690h.m70277f(w) >= 0.0f || !C15690h.m70279i(w)) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    public final void mo45080M(T t, boolean z, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "childHitTest");
        mo45081Q(t, -1.0f, z, aVar);
    }

    /* renamed from: Q */
    public final void mo45081Q(T t, float f, boolean z, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "childHitTest");
        int i = this.f39030c;
        this.f39030c = i + 1;
        mo45101r();
        Object[] objArr = this.f39028a;
        int i2 = this.f39030c;
        objArr[i2] = t;
        this.f39029b[i2] = C15712n.m70431a(f, z);
        mo45083X();
        aVar.invoke();
        this.f39030c = i;
    }

    /* renamed from: W */
    public final boolean mo45082W(float f, boolean z) {
        if (this.f39030c == CollectionsKt__CollectionsKt.m40443G(this)) {
            return true;
        }
        if (C15690h.m70273b(mo45113w(), C15712n.m70431a(f, z)) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: X */
    public final void mo45083X() {
        int i = this.f39030c + 1;
        int G = CollectionsKt__CollectionsKt.m40443G(this);
        if (i <= G) {
            while (true) {
                this.f39028a[i] = null;
                if (i == G) {
                    break;
                }
                i++;
            }
        }
        this.f39031d = this.f39030c + 1;
    }

    public void add(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        this.f39030c = -1;
        mo45083X();
    }

    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
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
    public final void mo45091e() {
        this.f39030c = size() - 1;
    }

    /* renamed from: e0 */
    public final void mo45092e0(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, C28534f.f69159i0);
        int h = this.f39030c;
        aVar.invoke();
        this.f39030c = h;
    }

    /* renamed from: f0 */
    public final void mo45093f0(T t, float f, boolean z, @C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "childHitTest");
        if (this.f39030c == CollectionsKt__CollectionsKt.m40443G(this)) {
            mo45081Q(t, f, z, aVar);
            if (this.f39030c + 1 == CollectionsKt__CollectionsKt.m40443G(this)) {
                mo45083X();
                return;
            }
            return;
        }
        long w = mo45113w();
        int i = this.f39030c;
        this.f39030c = CollectionsKt__CollectionsKt.m40443G(this);
        mo45081Q(t, f, z, aVar);
        if (this.f39030c + 1 < CollectionsKt__CollectionsKt.m40443G(this) && C15690h.m70273b(w, mo45113w()) > 0) {
            int i2 = this.f39030c + 1;
            int i3 = i + 1;
            Object[] objArr = this.f39028a;
            C10956m.m41183c1(objArr, objArr, i3, i2, size());
            long[] jArr = this.f39029b;
            C10956m.m41177b1(jArr, jArr, i3, i2, size());
            this.f39030c = ((size() + i) - this.f39030c) - 1;
        }
        mo45083X();
        this.f39030c = i;
    }

    public T get(int i) {
        return this.f39028a[i];
    }

    public int indexOf(Object obj) {
        int G = CollectionsKt__CollectionsKt.m40443G(this);
        if (G < 0) {
            return -1;
        }
        int i = 0;
        while (!Intrinsics.areEqual(this.f39028a[i], obj)) {
            if (i == G) {
                return -1;
            }
            i++;
        }
        return i;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @C12579k
    public Iterator<T> iterator() {
        return new C15708a(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public int lastIndexOf(Object obj) {
        for (int G = CollectionsKt__CollectionsKt.m40443G(this); -1 < G; G--) {
            if (Intrinsics.areEqual(this.f39028a[G], obj)) {
                return G;
            }
        }
        return -1;
    }

    @C12579k
    public ListIterator<T> listIterator() {
        return new C15708a(this, 0, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    /* renamed from: r */
    public final void mo45101r() {
        int i = this.f39030c;
        Object[] objArr = this.f39028a;
        if (i >= objArr.length) {
            int length = objArr.length + 16;
            Object[] copyOf = Arrays.copyOf(objArr, length);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.f39028a = copyOf;
            long[] copyOf2 = Arrays.copyOf(this.f39029b, length);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.f39029b = copyOf2;
        }
    }

    public T remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<T> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public T set(int i, T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo45114y();
    }

    public void sort(Comparator<? super T> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    public List<T> subList(int i, int i2) {
        return new C15709b(i, i2);
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    /* renamed from: w */
    public final long mo45113w() {
        long b = C15712n.m70431a(Float.POSITIVE_INFINITY, false);
        int i = this.f39030c + 1;
        int G = CollectionsKt__CollectionsKt.m40443G(this);
        if (i <= G) {
            while (true) {
                long c = C15690h.m70274c(this.f39029b[i]);
                if (C15690h.m70273b(c, b) < 0) {
                    b = c;
                }
                if (C15690h.m70277f(b) >= 0.0f || !C15690h.m70279i(b)) {
                    if (i == G) {
                        break;
                    }
                    i++;
                } else {
                    return b;
                }
            }
        }
        return b;
    }

    /* renamed from: y */
    public int mo45114y() {
        return this.f39031d;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    public ListIterator<T> listIterator(int i) {
        return new C15708a(this, i, 0, 0, 6, (DefaultConstructorMarker) null);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }

    /* renamed from: androidx.compose.ui.node.m$a */
    public final class C15708a implements ListIterator<T>, C11345a {

        /* renamed from: a */
        public int f39032a;

        /* renamed from: b */
        public final int f39033b;

        /* renamed from: c */
        public final int f39034c;

        public C15708a(int i, int i2, int i3) {
            this.f39032a = i;
            this.f39033b = i2;
            this.f39034c = i3;
        }

        public void add(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* renamed from: b */
        public final int mo45116b() {
            return this.f39032a;
        }

        /* renamed from: c */
        public final int mo45117c() {
            return this.f39034c;
        }

        /* renamed from: d */
        public final int mo45118d() {
            return this.f39033b;
        }

        /* renamed from: e */
        public final void mo45119e(int i) {
            this.f39032a = i;
        }

        public boolean hasNext() {
            return this.f39032a < this.f39034c;
        }

        public boolean hasPrevious() {
            return this.f39032a > this.f39033b;
        }

        public T next() {
            T[] i = C15707m.this.f39028a;
            int i2 = this.f39032a;
            this.f39032a = i2 + 1;
            return i[i2];
        }

        public int nextIndex() {
            return this.f39032a - this.f39033b;
        }

        public T previous() {
            T[] i = C15707m.this.f39028a;
            int i2 = this.f39032a - 1;
            this.f39032a = i2;
            return i[i2];
        }

        public int previousIndex() {
            return (this.f39032a - this.f39033b) - 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void set(T t) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C15708a(C15707m mVar, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? mVar.size() : i3);
        }
    }
}
