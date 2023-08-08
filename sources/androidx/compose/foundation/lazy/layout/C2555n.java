package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.C2855v;
import androidx.compose.runtime.internal.C8567o;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C2855v
@C8567o(parameters = 0)
/* renamed from: androidx.compose.foundation.lazy.layout.n */
public final class C2555n implements List<C2556a>, C11345a {

    /* renamed from: b */
    public static final int f6738b = 8;
    @C12579k

    /* renamed from: a */
    public final List<C2556a> f6739a;

    @C2855v
    /* renamed from: androidx.compose.foundation.lazy.layout.n$a */
    public interface C2556a {
        int getIndex();

        @C12580l
        Object getKey();
    }

    public C2555n(List<C2556a> list) {
        this.f6739a = list;
    }

    /* renamed from: H */
    public final void mo8757H(@C12579k C2556a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "item");
        this.f6739a.add(aVar);
    }

    /* renamed from: M */
    public final void mo8758M(@C12579k C2556a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "item");
        this.f6739a.remove(aVar);
    }

    /* renamed from: Q */
    public C2556a mo8759Q(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: W */
    public C2556a mo8760W(int i, C2556a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends C2556a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C2556a)) {
            return false;
        }
        return mo8771i((C2556a) obj);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return this.f6739a.containsAll(collection);
    }

    /* renamed from: e */
    public void mo8768e(int i, C2556a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: h */
    public boolean mo8770h(C2556a aVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: i */
    public boolean mo8771i(@C12579k C2556a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "element");
        return this.f6739a.contains(aVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C2556a)) {
            return -1;
        }
        return mo8791w((C2556a) obj);
    }

    public boolean isEmpty() {
        return this.f6739a.isEmpty();
    }

    @C12579k
    public Iterator<C2556a> iterator() {
        return this.f6739a.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C2556a)) {
            return -1;
        }
        return mo8792y((C2556a) obj);
    }

    @C12579k
    public ListIterator<C2556a> listIterator() {
        return this.f6739a.listIterator();
    }

    @C12579k
    /* renamed from: q */
    public C2556a get(int i) {
        return this.f6739a.get(i);
    }

    /* renamed from: r */
    public int mo8779r() {
        return this.f6739a.size();
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<C2556a> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo8779r();
    }

    public void sort(Comparator<? super C2556a> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    public List<C2556a> subList(int i, int i2) {
        return this.f6739a.subList(i, i2);
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    /* renamed from: w */
    public int mo8791w(@C12579k C2556a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "element");
        return this.f6739a.indexOf(aVar);
    }

    /* renamed from: y */
    public int mo8792y(@C12579k C2556a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "element");
        return this.f6739a.lastIndexOf(aVar);
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C2556a> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    public ListIterator<C2556a> listIterator(int i) {
        return this.f6739a.listIterator(i);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }

    public C2555n() {
        this(new SnapshotStateList());
    }
}
