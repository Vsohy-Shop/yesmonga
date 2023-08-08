package androidx.compose.p004ui.text.font;

import androidx.compose.runtime.C8585m0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11367t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8585m0
@C11363r0({"SMAP\nFontFamily.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontFamily.kt\nandroidx/compose/ui/text/font/FontListFontFamily\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n1#2:271\n*E\n"})
/* renamed from: androidx.compose.ui.text.font.a0 */
public final class C16176a0 extends C16236s implements List<C16238t>, C11345a {

    /* renamed from: z */
    public static final int f40236z = 0;

    /* renamed from: x */
    public final /* synthetic */ List<C16238t> f40237x;
    @C12579k

    /* renamed from: y */
    public final List<C16238t> f40238y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16176a0(@C12579k List<? extends C16238t> list) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(list, "fonts");
        this.f40237x = list;
        Collection collection = list;
        if (!collection.isEmpty()) {
            this.f40238y = new ArrayList(collection);
            return;
        }
        throw new IllegalStateException("At least one font should be passed to FontFamily".toString());
    }

    /* renamed from: H */
    public void mo46818H(int i, C16238t tVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: M */
    public boolean mo46819M(C16238t tVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: Q */
    public boolean mo46820Q(@C12579k C16238t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "element");
        return this.f40237x.contains(tVar);
    }

    @C12579k
    /* renamed from: W */
    public C16238t get(int i) {
        return this.f40237x.get(i);
    }

    @C12579k
    /* renamed from: X */
    public final List<C16238t> mo46822X() {
        return this.f40238y;
    }

    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends C16238t> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C16238t)) {
            return false;
        }
        return mo46820Q((C16238t) obj);
    }

    public boolean containsAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        return this.f40237x.containsAll(collection);
    }

    /* renamed from: e0 */
    public int mo46830e0() {
        return this.f40237x.size();
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C16176a0) && Intrinsics.areEqual((Object) this.f40238y, (Object) ((C16176a0) obj).f40238y)) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public int mo46832f0(@C12579k C16238t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "element");
        return this.f40237x.indexOf(tVar);
    }

    /* renamed from: h0 */
    public int mo46834h0(@C12579k C16238t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "element");
        return this.f40237x.lastIndexOf(tVar);
    }

    public int hashCode() {
        return this.f40238y.hashCode();
    }

    /* renamed from: i0 */
    public C16238t mo46836i0(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof C16238t)) {
            return -1;
        }
        return mo46832f0((C16238t) obj);
    }

    public boolean isEmpty() {
        return this.f40237x.isEmpty();
    }

    @C12579k
    public Iterator<C16238t> iterator() {
        return this.f40237x.iterator();
    }

    /* renamed from: j0 */
    public C16238t mo46840j0(int i, C16238t tVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof C16238t)) {
            return -1;
        }
        return mo46834h0((C16238t) obj);
    }

    @C12579k
    public ListIterator<C16238t> listIterator() {
        return this.f40237x.listIterator();
    }

    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public void replaceAll(UnaryOperator<C16238t> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo46830e0();
    }

    public void sort(Comparator<? super C16238t> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    public List<C16238t> subList(int i, int i2) {
        return this.f40237x.subList(i, i2);
    }

    public Object[] toArray() {
        return C11367t.m43656a(this);
    }

    @C12579k
    public String toString() {
        return "FontListFontFamily(fonts=" + this.f40238y + ')';
    }

    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(Collection<? extends C16238t> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    public ListIterator<C16238t> listIterator(int i) {
        return this.f40237x.listIterator(i);
    }

    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public <T> T[] toArray(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "array");
        return C11367t.m43657b(this, tArr);
    }
}
