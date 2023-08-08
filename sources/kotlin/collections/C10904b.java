package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.C11665v0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11345a;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11665v0(version = "1.1")
@C11363r0({"SMAP\nAbstractList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,157:1\n350#2,7:158\n378#2,7:165\n*S KotlinDebug\n*F\n+ 1 AbstractList.kt\nkotlin/collections/AbstractList\n*L\n27#1:158,7\n29#1:165,7\n*E\n"})
/* renamed from: kotlin.collections.b */
public abstract class C10904b<E> extends AbstractCollection<E> implements List<E>, C11345a {
    @C12579k

    /* renamed from: a */
    public static final C10905a f28138a = new C10905a((DefaultConstructorMarker) null);

    /* renamed from: kotlin.collections.b$a */
    public static final class C10905a {
        public /* synthetic */ C10905a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo22055a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("startIndex: " + i + ", endIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("startIndex: " + i + " > endIndex: " + i2);
            }
        }

        /* renamed from: b */
        public final void mo22056b(int i, int i2) {
            if (i < 0 || i >= i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: c */
        public final void mo22057c(int i, int i2) {
            if (i < 0 || i > i2) {
                throw new IndexOutOfBoundsException("index: " + i + ", size: " + i2);
            }
        }

        /* renamed from: d */
        public final void mo22058d(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
            } else if (i > i2) {
                throw new IllegalArgumentException("fromIndex: " + i + " > toIndex: " + i2);
            }
        }

        /* renamed from: e */
        public final boolean mo22059e(@C12579k Collection<?> collection, @C12579k Collection<?> collection2) {
            Intrinsics.checkNotNullParameter(collection, "c");
            Intrinsics.checkNotNullParameter(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            for (Object areEqual : collection) {
                if (!Intrinsics.areEqual((Object) areEqual, (Object) it.next())) {
                    return false;
                }
            }
            return true;
        }

        /* renamed from: f */
        public final int mo22060f(@C12579k Collection<?> collection) {
            int i;
            Intrinsics.checkNotNullParameter(collection, "c");
            int i2 = 1;
            for (Object next : collection) {
                int i3 = i2 * 31;
                if (next != null) {
                    i = next.hashCode();
                } else {
                    i = 0;
                }
                i2 = i3 + i;
            }
            return i2;
        }

        public C10905a() {
        }
    }

    /* renamed from: kotlin.collections.b$b */
    public class C10906b implements Iterator<E>, C11345a {

        /* renamed from: a */
        public int f28139a;

        public C10906b() {
        }

        /* renamed from: b */
        public final int mo22061b() {
            return this.f28139a;
        }

        /* renamed from: c */
        public final void mo22062c(int i) {
            this.f28139a = i;
        }

        public boolean hasNext() {
            return this.f28139a < C10904b.this.size();
        }

        public E next() {
            if (hasNext()) {
                C10904b<E> bVar = C10904b.this;
                int i = this.f28139a;
                this.f28139a = i + 1;
                return bVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$c */
    public class C10907c extends C10904b<E>.b implements ListIterator<E>, C11345a {
        public C10907c(int i) {
            super();
            C10904b.f28138a.mo22057c(i, C10904b.this.size());
            mo22062c(i);
        }

        public void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean hasPrevious() {
            return mo22061b() > 0;
        }

        public int nextIndex() {
            return mo22061b();
        }

        public E previous() {
            if (hasPrevious()) {
                C10904b<E> bVar = C10904b.this;
                mo22062c(mo22061b() - 1);
                return bVar.get(mo22061b());
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return mo22061b() - 1;
        }

        public void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: kotlin.collections.b$d */
    public static final class C10908d<E> extends C10904b<E> implements RandomAccess {
        @C12579k

        /* renamed from: b */
        public final C10904b<E> f28142b;

        /* renamed from: c */
        public final int f28143c;

        /* renamed from: d */
        public int f28144d;

        public C10908d(@C12579k C10904b<? extends E> bVar, int i, int i2) {
            Intrinsics.checkNotNullParameter(bVar, "list");
            this.f28142b = bVar;
            this.f28143c = i;
            C10904b.f28138a.mo22058d(i, i2, bVar.size());
            this.f28144d = i2 - i;
        }

        /* renamed from: e */
        public int mo15650e() {
            return this.f28144d;
        }

        public E get(int i) {
            C10904b.f28138a.mo22056b(i, this.f28144d);
            return this.f28142b.get(this.f28143c + i);
        }
    }

    public void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* renamed from: e */
    public abstract int mo15650e();

    public boolean equals(@C12580l Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        return f28138a.mo22059e(this, (Collection) obj);
    }

    public abstract E get(int i);

    public int hashCode() {
        return f28138a.mo22060f(this);
    }

    public int indexOf(E e) {
        int i = 0;
        for (Object areEqual : this) {
            if (Intrinsics.areEqual(areEqual, (Object) e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    @C12579k
    public Iterator<E> iterator() {
        return new C10906b();
    }

    public int lastIndexOf(E e) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (Intrinsics.areEqual(listIterator.previous(), (Object) e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @C12579k
    public ListIterator<E> listIterator() {
        return new C10907c(0);
    }

    public E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @C12579k
    public List<E> subList(int i, int i2) {
        return new C10908d(this, i, i2);
    }

    @C12579k
    public ListIterator<E> listIterator(int i) {
        return new C10907c(i);
    }
}
