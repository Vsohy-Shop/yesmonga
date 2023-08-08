package kotlinx.serialization.json;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import kotlinx.serialization.C12248g;
import kotlinx.serialization.C12439o;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C12439o(with = C12349d.class)
/* renamed from: kotlinx.serialization.json.b */
public final class C12344b extends C12403k implements List<C12403k>, C11345a {
    @C12579k
    public static final C12345a Companion = new C12345a((DefaultConstructorMarker) null);
    @C12579k

    /* renamed from: a */
    public final List<C12403k> f30179a;

    /* renamed from: kotlinx.serialization.json.b$a */
    public static final class C12345a {
        public /* synthetic */ C12345a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C12579k
        public final C12248g<C12344b> serializer() {
            return C12349d.f30182a;
        }

        public C12345a() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12344b(@C12579k List<? extends C12403k> list) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "content");
        this.f30179a = list;
    }

    /* renamed from: H */
    public C12403k mo25287H(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: M */
    public C12403k set(int i, C12403k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends C12403k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C12403k)) {
            return false;
        }
        return mo25301i((C12403k) obj);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return this.f30179a.containsAll(collection);
    }

    /* renamed from: e */
    public void add(int i, C12403k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean equals(@C12580l Object obj) {
        return Intrinsics.areEqual((Object) this.f30179a, obj);
    }

    /* renamed from: h */
    public boolean add(C12403k kVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int hashCode() {
        return this.f30179a.hashCode();
    }

    /* renamed from: i */
    public boolean mo25301i(@C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "element");
        return this.f30179a.contains(kVar);
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C12403k)) {
            return -1;
        }
        return mo25322w((C12403k) obj);
    }

    public boolean isEmpty() {
        return this.f30179a.isEmpty();
    }

    @C12579k
    public Iterator<C12403k> iterator() {
        return this.f30179a.iterator();
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C12403k)) {
            return -1;
        }
        return mo25323y((C12403k) obj);
    }

    @C12579k
    public ListIterator<C12403k> listIterator() {
        return this.f30179a.listIterator();
    }

    @C12579k
    /* renamed from: q */
    public C12403k get(int i) {
        return this.f30179a.get(i);
    }

    /* renamed from: r */
    public int mo25309r() {
        return this.f30179a.size();
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<C12403k> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo25309r();
    }

    public void sort(Comparator<? super C12403k> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    public List<C12403k> subList(int i, int i2) {
        return this.f30179a.subList(i, i2);
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    @C12579k
    public String toString() {
        return CollectionsKt___CollectionsKt.m40639h3(this.f30179a, ",", "[", "]", 0, (CharSequence) null, (C11300l) null, 56, (Object) null);
    }

    /* renamed from: w */
    public int mo25322w(@C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "element");
        return this.f30179a.indexOf(kVar);
    }

    /* renamed from: y */
    public int mo25323y(@C12579k C12403k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "element");
        return this.f30179a.lastIndexOf(kVar);
    }

    public boolean addAll(Collection<? extends C12403k> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    public ListIterator<C12403k> listIterator(int i) {
        return this.f30179a.listIterator(i);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }
}
