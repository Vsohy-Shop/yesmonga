package androidx.compose.runtime.snapshots;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.collections.C10953k0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.markers.C11349e;
import kotlin.jvm.internal.markers.C11350f;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nSnapshotStateList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,457:1\n1726#2,3:458\n1855#2,2:461\n*S KotlinDebug\n*F\n+ 1 SnapshotStateList.kt\nandroidx/compose/runtime/snapshots/SubList\n*L\n311#1:458,3\n320#1:461,2\n*E\n"})
/* renamed from: androidx.compose.runtime.snapshots.c0 */
public final class C8640c0<T> implements List<T>, C11349e {
    @C12579k

    /* renamed from: a */
    public final SnapshotStateList<T> f23177a;

    /* renamed from: b */
    public final int f23178b;

    /* renamed from: c */
    public int f23179c;

    /* renamed from: d */
    public int f23180d;

    /* renamed from: androidx.compose.runtime.snapshots.c0$a */
    public static final class C8641a implements ListIterator<T>, C11350f {

        /* renamed from: a */
        public final /* synthetic */ Ref.IntRef f23181a;

        /* renamed from: b */
        public final /* synthetic */ C8640c0<T> f23182b;

        public C8641a(Ref.IntRef intRef, C8640c0<T> c0Var) {
            this.f23181a = intRef;
            this.f23182b = c0Var;
        }

        @C12579k
        /* renamed from: b */
        public Void add(T t) {
            Void unused = C8666s.m31819d();
            throw new KotlinNothingValueException();
        }

        @C12579k
        /* renamed from: c */
        public Void remove() {
            Void unused = C8666s.m31819d();
            throw new KotlinNothingValueException();
        }

        @C12579k
        /* renamed from: d */
        public Void set(T t) {
            Void unused = C8666s.m31819d();
            throw new KotlinNothingValueException();
        }

        public boolean hasNext() {
            return this.f23181a.element < this.f23182b.size() - 1;
        }

        public boolean hasPrevious() {
            return this.f23181a.element >= 0;
        }

        public T next() {
            int i = this.f23181a.element + 1;
            C8666s.m31820e(i, this.f23182b.size());
            this.f23181a.element = i;
            return this.f23182b.get(i);
        }

        public int nextIndex() {
            return this.f23181a.element + 1;
        }

        public T previous() {
            int i = this.f23181a.element;
            C8666s.m31820e(i, this.f23182b.size());
            this.f23181a.element = i - 1;
            return this.f23182b.get(i);
        }

        public int previousIndex() {
            return this.f23181a.element;
        }
    }

    public C8640c0(@C12579k SnapshotStateList<T> snapshotStateList, int i, int i2) {
        Intrinsics.checkNotNullParameter(snapshotStateList, "parentList");
        this.f23177a = snapshotStateList;
        this.f23178b = i;
        this.f23179c = snapshotStateList.mo16454H();
        this.f23180d = i2 - i;
    }

    public boolean add(T t) {
        mo16571q();
        this.f23177a.add(this.f23178b + size(), t);
        this.f23180d = size() + 1;
        this.f23179c = this.f23177a.mo16454H();
        return true;
    }

    public boolean addAll(int i, @C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        mo16571q();
        boolean addAll = this.f23177a.addAll(i + this.f23178b, collection);
        if (addAll) {
            this.f23180d = size() + collection.size();
            this.f23179c = this.f23177a.mo16454H();
        }
        return addAll;
    }

    public void clear() {
        if (size() > 0) {
            mo16571q();
            SnapshotStateList<T> snapshotStateList = this.f23177a;
            int i = this.f23178b;
            snapshotStateList.mo16468h0(i, size() + i);
            this.f23180d = 0;
            this.f23179c = this.f23177a.mo16454H();
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
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

    @C12579k
    /* renamed from: e */
    public final SnapshotStateList<T> mo16561e() {
        return this.f23177a;
    }

    public T get(int i) {
        mo16571q();
        C8666s.m31820e(i, size());
        return this.f23177a.get(this.f23178b + i);
    }

    /* renamed from: h */
    public int mo16563h() {
        return this.f23180d;
    }

    /* renamed from: i */
    public T mo16564i(int i) {
        mo16571q();
        T remove = this.f23177a.remove(this.f23178b + i);
        this.f23180d = size() - 1;
        this.f23179c = this.f23177a.mo16454H();
        return remove;
    }

    public int indexOf(Object obj) {
        mo16571q();
        int i = this.f23178b;
        Iterator it = C11479u.m44378W1(i, size() + i).iterator();
        while (it.hasNext()) {
            int c = ((C10953k0) it).mo6374c();
            if (Intrinsics.areEqual(obj, (Object) this.f23177a.get(c))) {
                return c - this.f23178b;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    @C12579k
    public Iterator<T> iterator() {
        return listIterator();
    }

    public int lastIndexOf(Object obj) {
        mo16571q();
        int size = this.f23178b + size();
        while (true) {
            size--;
            if (size < this.f23178b) {
                return -1;
            }
            if (Intrinsics.areEqual(obj, (Object) this.f23177a.get(size))) {
                return size - this.f23178b;
            }
        }
    }

    @C12579k
    public ListIterator<T> listIterator() {
        return listIterator(0);
    }

    /* renamed from: q */
    public final void mo16571q() {
        if (this.f23177a.mo16454H() != this.f23179c) {
            throw new ConcurrentModificationException();
        }
    }

    public final /* bridge */ T remove(int i) {
        return mo16564i(i);
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        Iterator<? extends Object> it = collection.iterator();
        while (true) {
            boolean z = false;
            while (true) {
                if (!it.hasNext()) {
                    return z;
                }
                if (remove((Object) it.next()) || z) {
                    z = true;
                }
            }
        }
    }

    public boolean retainAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        mo16571q();
        SnapshotStateList<T> snapshotStateList = this.f23177a;
        int i = this.f23178b;
        int i0 = snapshotStateList.mo16469i0(collection, i, size() + i);
        if (i0 > 0) {
            this.f23179c = this.f23177a.mo16454H();
            this.f23180d = size() - i0;
        }
        if (i0 > 0) {
            return true;
        }
        return false;
    }

    public T set(int i, T t) {
        C8666s.m31820e(i, size());
        mo16571q();
        T t2 = this.f23177a.set(i + this.f23178b, t);
        this.f23179c = this.f23177a.mo16454H();
        return t2;
    }

    public final /* bridge */ int size() {
        return mo16563h();
    }

    @C12579k
    public List<T> subList(int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i < 0 || i > i2) {
            z = false;
        } else {
            z = true;
        }
        if (!z || i2 > size()) {
            z2 = false;
        }
        if (z2) {
            mo16571q();
            SnapshotStateList<T> snapshotStateList = this.f23177a;
            int i3 = this.f23178b;
            return new C8640c0(snapshotStateList, i + i3, i2 + i3);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    @C12579k
    public ListIterator<T> listIterator(int i) {
        mo16571q();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = i - 1;
        return new C8641a(intRef, this);
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }

    public void add(int i, T t) {
        mo16571q();
        this.f23177a.add(this.f23178b + i, t);
        this.f23180d = size() + 1;
        this.f23179c = this.f23177a.mo16454H();
    }

    public boolean addAll(@C12579k Collection<? extends T> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return addAll(size(), collection);
    }
}
