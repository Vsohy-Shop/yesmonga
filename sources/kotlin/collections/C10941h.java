package kotlin.collections;

import androidx.lifecycle.C19456p0;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.C11333h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nCollections.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,471:1\n1726#2,3:472\n*S KotlinDebug\n*F\n+ 1 Collections.kt\nkotlin/collections/ArrayAsCollection\n*L\n61#1:472,3\n*E\n"})
/* renamed from: kotlin.collections.h */
public final class C10941h<T> implements Collection<T>, C11345a {
    @C12579k

    /* renamed from: a */
    public final T[] f28167a;

    /* renamed from: b */
    public final boolean f28168b;

    public C10941h(@C12579k T[] tArr, boolean z) {
        Intrinsics.checkNotNullParameter(tArr, C19456p0.f49833g);
        this.f28167a = tArr;
        this.f28168b = z;
    }

    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(Object obj) {
        return ArraysKt___ArraysKt.m39388T8(this.f28167a, obj);
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
    public int mo22265e() {
        return this.f28167a.length;
    }

    @C12579k
    /* renamed from: h */
    public final T[] mo22266h() {
        return this.f28167a;
    }

    /* renamed from: i */
    public final boolean mo22267i() {
        return this.f28168b;
    }

    public boolean isEmpty() {
        return this.f28167a.length == 0;
    }

    @C12579k
    public Iterator<T> iterator() {
        return C11333h.m43500a(this.f28167a);
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

    public final /* bridge */ int size() {
        return mo22265e();
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }

    @C12579k
    public final Object[] toArray() {
        return C10976s.m41416h(this.f28167a, this.f28168b);
    }
}
