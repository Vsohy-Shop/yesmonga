package androidx.compose.runtime.collection;

import androidx.compose.runtime.C8407b;
import com.carrefour.fid.android.shared.constant.C28534f;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.collections.C10956m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nIdentityArraySet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,244:1\n1726#2,3:245\n*S KotlinDebug\n*F\n+ 1 IdentityArraySet.kt\nandroidx/compose/runtime/collection/IdentityArraySet\n*L\n232#1:245,3\n*E\n"})
/* renamed from: androidx.compose.runtime.collection.d */
public final class C8419d<T> implements Set<T>, C11345a {

    /* renamed from: a */
    public int f22773a;
    @C12579k

    /* renamed from: b */
    public Object[] f22774b = new Object[16];

    /* renamed from: androidx.compose.runtime.collection.d$a */
    public static final class C8420a implements Iterator<T>, C11345a {

        /* renamed from: a */
        public int f22775a;

        /* renamed from: b */
        public final /* synthetic */ C8419d<T> f22776b;

        public C8420a(C8419d<T> dVar) {
            this.f22776b = dVar;
        }

        /* renamed from: b */
        public final int mo15399b() {
            return this.f22775a;
        }

        /* renamed from: c */
        public final void mo15400c(int i) {
            this.f22775a = i;
        }

        public boolean hasNext() {
            return this.f22775a < this.f22776b.size();
        }

        @C12579k
        public T next() {
            T[] w = this.f22776b.mo15398w();
            int i = this.f22775a;
            this.f22775a = i + 1;
            T t = w[i];
            Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            return t;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @C11532s0
    /* renamed from: y */
    public static /* synthetic */ void m30292y() {
    }

    /* renamed from: H */
    public final boolean mo15375H() {
        return size() > 0;
    }

    /* renamed from: M */
    public final void mo15376M(@C12579k C11300l<? super T, Boolean> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "predicate");
        int size = size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = mo15398w()[i2];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
            if (!lVar.invoke(obj).booleanValue()) {
                if (i != i2) {
                    mo15398w()[i] = obj;
                }
                i++;
            }
        }
        int size2 = size();
        for (int i3 = i; i3 < size2; i3++) {
            mo15398w()[i3] = null;
        }
        mo15377Q(i);
    }

    /* renamed from: Q */
    public void mo15377Q(int i) {
        this.f22773a = i;
    }

    /* renamed from: W */
    public final void mo15378W(@C12579k Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.f22774b = objArr;
    }

    public final boolean add(@C12579k T t) {
        int i;
        Intrinsics.checkNotNullParameter(t, "value");
        if (size() > 0) {
            i = mo15387i(t);
            if (i >= 0) {
                return false;
            }
        } else {
            i = -1;
        }
        int i2 = -(i + 1);
        int size = size();
        Object[] objArr = this.f22774b;
        if (size == objArr.length) {
            Object[] objArr2 = new Object[(objArr.length * 2)];
            C10956m.m41183c1(objArr, objArr2, i2 + 1, i2, size());
            C10956m.m41237l1(this.f22774b, objArr2, 0, 0, i2, 6, (Object) null);
            this.f22774b = objArr2;
        } else {
            C10956m.m41183c1(objArr, objArr, i2 + 1, i2, size());
        }
        this.f22774b[i2] = t;
        mo15377Q(size() + 1);
        return true;
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        C10956m.m41313w2(this.f22774b, (Object) null, 0, 0, 6, (Object) null);
        mo15377Q(0);
    }

    public boolean contains(@C12580l Object obj) {
        return obj != null && mo15387i(obj) >= 0;
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterable<Object> iterable = collection;
        if (((Collection) iterable).isEmpty()) {
            return true;
        }
        for (Object contains : iterable) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public final void mo15384e(int i) {
        boolean z = false;
        if (i >= 0 && i < size()) {
            z = true;
        }
        if (!z) {
            throw new IndexOutOfBoundsException("Index " + i + ", size " + size());
        }
    }

    @C12579k
    public final T get(int i) {
        mo15384e(i);
        T t = this.f22774b[i];
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
        return t;
    }

    /* renamed from: h */
    public final void mo15386h(@C12579k C11300l<? super T, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        int size = size();
        for (int i = 0; i < size; i++) {
            lVar.invoke(get(i));
        }
    }

    /* renamed from: i */
    public final int mo15387i(Object obj) {
        int size = size() - 1;
        int b = C8407b.m30216b(obj);
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            Object obj2 = get(i2);
            int b2 = C8407b.m30216b(obj2);
            if (b2 < b) {
                i = i2 + 1;
            } else if (b2 > b) {
                size = i2 - 1;
            } else if (obj2 == obj) {
                return i2;
            } else {
                return mo15390q(i2, obj, b);
            }
        }
        return -(i + 1);
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @C12579k
    public Iterator<T> iterator() {
        return new C8420a(this);
    }

    /* renamed from: q */
    public final int mo15390q(int i, Object obj, int i2) {
        for (int i3 = i - 1; -1 < i3; i3--) {
            Object obj2 = this.f22774b[i3];
            if (obj2 == obj) {
                return i3;
            }
            if (C8407b.m30216b(obj2) != i2) {
                break;
            }
        }
        int i4 = i + 1;
        int size = size();
        while (true) {
            if (i4 >= size) {
                i4 = size();
                break;
            }
            Object obj3 = this.f22774b[i4];
            if (obj3 == obj) {
                return i4;
            }
            if (C8407b.m30216b(obj3) != i2) {
                break;
            }
            i4++;
        }
        return -(i4 + 1);
    }

    /* renamed from: r */
    public int mo15391r() {
        return this.f22773a;
    }

    public final boolean remove(@C12580l T t) {
        int i;
        if (t == null || (i = mo15387i(t)) < 0) {
            return false;
        }
        if (i < size() - 1) {
            Object[] objArr = this.f22774b;
            C10956m.m41183c1(objArr, objArr, i, i + 1, size());
        }
        mo15377Q(size() - 1);
        this.f22774b[size()] = null;
        return true;
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo15391r();
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    @C12579k
    /* renamed from: w */
    public final Object[] mo15398w() {
        return this.f22774b;
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }
}
