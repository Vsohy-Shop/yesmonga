package kotlin.collections.builders;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.C11076d0;
import kotlin.collections.C10904b;
import kotlin.collections.C10928d;
import kotlin.collections.C10944i;
import kotlin.collections.C10956m;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.C11349e;
import kotlin.jvm.internal.markers.C11350f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0002\b\u0012\n\u0002\u0010)\n\u0000\n\u0002\u0010+\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u00052\u00060\u0006j\u0002`\u0007:\u0001[BO\b\u0002\u0012\f\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000=\u0012\u0006\u0010H\u001a\u00020\n\u0012\u0006\u0010J\u001a\u00020\n\u0012\u0006\u0010K\u001a\u00020\u0013\u0012\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000\u0012\u000e\u0010O\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0004\bV\u0010WB\t\b\u0016¢\u0006\u0004\bV\u0010XB\u0011\b\u0016\u0012\u0006\u0010Y\u001a\u00020\n¢\u0006\u0004\bV\u0010ZJ\b\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0014\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u001f\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J&\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u000f\u001a\u00020\nH\u0002J\u0017\u0010\u001d\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0002J.\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\"\u001a\u00020\u0013H\u0002J\f\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011J\b\u0010%\u001a\u00020\u0013H\u0016J\u0018\u0010'\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010\u001eJ \u0010(\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b,\u0010+J\u000f\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000-H\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/H\u0016J\u0016\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000/2\u0006\u0010&\u001a\u00020\nH\u0016J\u0017\u00101\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00101\u001a\u00020\f2\u0006\u0010&\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b1\u0010\u0019J\u0016\u00103\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u001e\u00103\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\n2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\b\u00104\u001a\u00020\fH\u0016J\u0017\u00105\u001a\u00028\u00002\u0006\u0010&\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u0010\u001eJ\u0017\u00106\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00028\u0000H\u0016¢\u0006\u0004\b6\u00102J\u0016\u00107\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u0016\u00108\u001a\u00020\u00132\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\u001e\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u00109\u001a\u00020\n2\u0006\u0010:\u001a\u00020\nH\u0016J)\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010=\"\u0004\b\u0001\u0010<2\f\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00010=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010?\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0=H\u0016¢\u0006\u0004\b?\u0010AJ\u0013\u0010B\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010C\u001a\u00020\nH\u0016J\b\u0010E\u001a\u00020DH\u0016R\u001c\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010H\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bH\u0010IR\u0016\u0010J\u001a\u00020\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010IR\u0016\u0010K\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001c\u0010M\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001c\u0010O\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010R\u001a\u00020\u00138BX\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010U\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006\\"}, mo22516d2 = {"Lkotlin/collections/builders/ListBuilder;", "E", "", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "Lkotlin/collections/d;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "minCapacity", "Lkotlin/d2;", "W", "M", "n", "X", "", "other", "", "Q", "i", "e0", "element", "y", "(ILjava/lang/Object;)V", "", "elements", "w", "l0", "(I)Ljava/lang/Object;", "rangeOffset", "rangeLength", "m0", "retain", "n0", "H", "isEmpty", "index", "get", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "lastIndexOf", "", "iterator", "", "listIterator", "add", "(Ljava/lang/Object;)Z", "addAll", "clear", "h", "remove", "removeAll", "retainAll", "fromIndex", "toIndex", "subList", "T", "", "destination", "toArray", "([Ljava/lang/Object;)[Ljava/lang/Object;", "()[Ljava/lang/Object;", "equals", "hashCode", "", "toString", "array", "[Ljava/lang/Object;", "offset", "I", "length", "isReadOnly", "Z", "backing", "Lkotlin/collections/builders/ListBuilder;", "root", "f0", "()Z", "isEffectivelyReadOnly", "e", "()I", "size", "<init>", "([Ljava/lang/Object;IIZLkotlin/collections/builders/ListBuilder;Lkotlin/collections/builders/ListBuilder;)V", "()V", "initialCapacity", "(I)V", "a", "kotlin-stdlib"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ListBuilder<E> extends C10928d<E> implements List<E>, RandomAccess, Serializable, C11349e {
    /* access modifiers changed from: private */
    @C12579k
    public E[] array;
    @C12580l
    private final ListBuilder<E> backing;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    public int length;
    /* access modifiers changed from: private */
    public int offset;
    @C12580l
    private final ListBuilder<E> root;

    @C11363r0({"SMAP\nListBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListBuilder.kt\nkotlin/collections/builders/ListBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,429:1\n1#2:430\n*E\n"})
    /* renamed from: kotlin.collections.builders.ListBuilder$a */
    public static final class C10911a<E> implements ListIterator<E>, C11350f {
        @C12579k

        /* renamed from: a */
        public final ListBuilder<E> f28146a;

        /* renamed from: b */
        public int f28147b;

        /* renamed from: c */
        public int f28148c = -1;

        public C10911a(@C12579k ListBuilder<E> listBuilder, int i) {
            Intrinsics.checkNotNullParameter(listBuilder, "list");
            this.f28146a = listBuilder;
            this.f28147b = i;
        }

        public void add(E e) {
            ListBuilder<E> listBuilder = this.f28146a;
            int i = this.f28147b;
            this.f28147b = i + 1;
            listBuilder.add(i, e);
            this.f28148c = -1;
        }

        public boolean hasNext() {
            return this.f28147b < this.f28146a.length;
        }

        public boolean hasPrevious() {
            return this.f28147b > 0;
        }

        public E next() {
            if (this.f28147b < this.f28146a.length) {
                int i = this.f28147b;
                this.f28147b = i + 1;
                this.f28148c = i;
                return this.f28146a.array[this.f28146a.offset + this.f28148c];
            }
            throw new NoSuchElementException();
        }

        public int nextIndex() {
            return this.f28147b;
        }

        public E previous() {
            int i = this.f28147b;
            if (i > 0) {
                int i2 = i - 1;
                this.f28147b = i2;
                this.f28148c = i2;
                return this.f28146a.array[this.f28146a.offset + this.f28148c];
            }
            throw new NoSuchElementException();
        }

        public int previousIndex() {
            return this.f28147b - 1;
        }

        public void remove() {
            boolean z;
            int i = this.f28148c;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f28146a.remove(i);
                this.f28147b = this.f28148c;
                this.f28148c = -1;
                return;
            }
            throw new IllegalStateException("Call next() or previous() before removing element from the iterator.".toString());
        }

        public void set(E e) {
            boolean z;
            int i = this.f28148c;
            if (i != -1) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f28146a.set(i, e);
                return;
            }
            throw new IllegalStateException("Call next() or previous() before replacing element from the iterator.".toString());
        }
    }

    public ListBuilder(E[] eArr, int i, int i2, boolean z, ListBuilder<E> listBuilder, ListBuilder<E> listBuilder2) {
        this.array = eArr;
        this.offset = i;
        this.length = i2;
        this.isReadOnly = z;
        this.backing = listBuilder;
        this.root = listBuilder2;
    }

    private final Object writeReplace() {
        if (mo22096f0()) {
            return new SerializedCollection(this, 0);
        }
        throw new NotSerializableException("The list cannot be serialized while it is being built.");
    }

    @C12579k
    /* renamed from: H */
    public final List<E> mo22085H() {
        if (this.backing == null) {
            mo22086M();
            this.isReadOnly = true;
            return this;
        }
        throw new IllegalStateException();
    }

    /* renamed from: M */
    public final void mo22086M() {
        if (mo22096f0()) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: Q */
    public final boolean mo22087Q(List<?> list) {
        return C10921b.m40864h(this.array, this.offset, this.length, list);
    }

    /* renamed from: W */
    public final void mo22088W(int i) {
        if (this.backing != null) {
            throw new IllegalStateException();
        } else if (i >= 0) {
            E[] eArr = this.array;
            if (i > eArr.length) {
                this.array = C10921b.m40861e(this.array, C10944i.f28171d.mo22321a(eArr.length, i));
            }
        } else {
            throw new OutOfMemoryError();
        }
    }

    /* renamed from: X */
    public final void mo22089X(int i) {
        mo22088W(this.length + i);
    }

    public boolean add(E e) {
        mo22086M();
        mo22116y(this.offset + this.length, e);
        return true;
    }

    public boolean addAll(@C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        mo22086M();
        int size = collection.size();
        mo22115w(this.offset + this.length, collection, size);
        return size > 0;
    }

    public void clear() {
        mo22086M();
        mo22106m0(this.offset, this.length);
    }

    /* renamed from: e */
    public int mo15699e() {
        return this.length;
    }

    /* renamed from: e0 */
    public final void mo22094e0(int i, int i2) {
        mo22089X(i2);
        E[] eArr = this.array;
        C10956m.m41183c1(eArr, eArr, i + i2, i, this.offset + this.length);
        this.length += i2;
    }

    public boolean equals(@C12580l Object obj) {
        return obj == this || ((obj instanceof List) && mo22087Q((List) obj));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r1.root;
     */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo22096f0() {
        /*
            r1 = this;
            boolean r0 = r1.isReadOnly
            if (r0 != 0) goto L_0x000f
            kotlin.collections.builders.ListBuilder<E> r0 = r1.root
            if (r0 == 0) goto L_0x000d
            boolean r0 = r0.isReadOnly
            if (r0 == 0) goto L_0x000d
            goto L_0x000f
        L_0x000d:
            r0 = 0
            goto L_0x0010
        L_0x000f:
            r0 = 1
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.builders.ListBuilder.mo22096f0():boolean");
    }

    public E get(int i) {
        C10904b.f28138a.mo22056b(i, this.length);
        return this.array[this.offset + i];
    }

    /* renamed from: h */
    public E mo15703h(int i) {
        mo22086M();
        C10904b.f28138a.mo22056b(i, this.length);
        return mo22102l0(this.offset + i);
    }

    public int hashCode() {
        return C10921b.m40865i(this.array, this.offset, this.length);
    }

    public int indexOf(Object obj) {
        for (int i = 0; i < this.length; i++) {
            if (Intrinsics.areEqual((Object) this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    @C12579k
    public Iterator<E> iterator() {
        return new C10911a(this, 0);
    }

    /* renamed from: l0 */
    public final E mo22102l0(int i) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            this.length--;
            return listBuilder.mo22102l0(i);
        }
        E[] eArr = this.array;
        E e = eArr[i];
        C10956m.m41183c1(eArr, eArr, i, i + 1, this.offset + this.length);
        C10921b.m40862f(this.array, (this.offset + this.length) - 1);
        this.length--;
        return e;
    }

    public int lastIndexOf(Object obj) {
        for (int i = this.length - 1; i >= 0; i--) {
            if (Intrinsics.areEqual((Object) this.array[this.offset + i], obj)) {
                return i;
            }
        }
        return -1;
    }

    @C12579k
    public ListIterator<E> listIterator() {
        return new C10911a(this, 0);
    }

    /* renamed from: m0 */
    public final void mo22106m0(int i, int i2) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo22106m0(i, i2);
        } else {
            E[] eArr = this.array;
            C10956m.m41183c1(eArr, eArr, i, i + i2, this.length);
            E[] eArr2 = this.array;
            int i3 = this.length;
            C10921b.m40863g(eArr2, i3 - i2, i3);
        }
        this.length -= i2;
    }

    /* renamed from: n0 */
    public final int mo22107n0(int i, int i2, Collection<? extends E> collection, boolean z) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            int n0 = listBuilder.mo22107n0(i, i2, collection, z);
            this.length -= n0;
            return n0;
        }
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            int i5 = i + i3;
            if (collection.contains(this.array[i5]) == z) {
                E[] eArr = this.array;
                i3++;
                eArr[i4 + i] = eArr[i5];
                i4++;
            } else {
                i3++;
            }
        }
        int i6 = i2 - i4;
        E[] eArr2 = this.array;
        C10956m.m41183c1(eArr2, eArr2, i + i4, i2 + i, this.length);
        E[] eArr3 = this.array;
        int i7 = this.length;
        C10921b.m40863g(eArr3, i7 - i6, i7);
        this.length -= i6;
        return i6;
    }

    public boolean remove(Object obj) {
        mo22086M();
        int indexOf = indexOf(obj);
        if (indexOf >= 0) {
            remove(indexOf);
        }
        if (indexOf >= 0) {
            return true;
        }
        return false;
    }

    public boolean removeAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        mo22086M();
        if (mo22107n0(this.offset, this.length, collection, false) > 0) {
            return true;
        }
        return false;
    }

    public boolean retainAll(@C12579k Collection<? extends Object> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        mo22086M();
        if (mo22107n0(this.offset, this.length, collection, true) > 0) {
            return true;
        }
        return false;
    }

    public E set(int i, E e) {
        mo22086M();
        C10904b.f28138a.mo22056b(i, this.length);
        E[] eArr = this.array;
        int i2 = this.offset;
        E e2 = eArr[i2 + i];
        eArr[i2 + i] = e;
        return e2;
    }

    @C12579k
    public List<E> subList(int i, int i2) {
        ListBuilder<E> listBuilder;
        C10904b.f28138a.mo22058d(i, i2, this.length);
        E[] eArr = this.array;
        int i3 = this.offset + i;
        int i4 = i2 - i;
        boolean z = this.isReadOnly;
        ListBuilder<E> listBuilder2 = this.root;
        if (listBuilder2 == null) {
            listBuilder = this;
        } else {
            listBuilder = listBuilder2;
        }
        return new ListBuilder(eArr, i3, i4, z, this, listBuilder);
    }

    @C12579k
    public <T> T[] toArray(@C12579k T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, FirebaseAnalytics.C32532b.f78977z);
        int length2 = tArr.length;
        int i = this.length;
        if (length2 < i) {
            E[] eArr = this.array;
            int i2 = this.offset;
            T[] copyOfRange = Arrays.copyOfRange(eArr, i2, i + i2, tArr.getClass());
            Intrinsics.checkNotNullExpressionValue(copyOfRange, "copyOfRange(array, offse…h, destination.javaClass)");
            return copyOfRange;
        }
        E[] eArr2 = this.array;
        int i3 = this.offset;
        C10956m.m41183c1(eArr2, tArr, 0, i3, i + i3);
        int length3 = tArr.length;
        int i4 = this.length;
        if (length3 > i4) {
            tArr[i4] = null;
        }
        return tArr;
    }

    @C12579k
    public String toString() {
        return C10921b.m40866j(this.array, this.offset, this.length);
    }

    /* renamed from: w */
    public final void mo22115w(int i, Collection<? extends E> collection, int i2) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo22115w(i, collection, i2);
            this.array = this.backing.array;
            this.length += i2;
            return;
        }
        mo22094e0(i, i2);
        Iterator<? extends E> it = collection.iterator();
        for (int i3 = 0; i3 < i2; i3++) {
            this.array[i + i3] = it.next();
        }
    }

    /* renamed from: y */
    public final void mo22116y(int i, E e) {
        ListBuilder<E> listBuilder = this.backing;
        if (listBuilder != null) {
            listBuilder.mo22116y(i, e);
            this.array = this.backing.array;
            this.length++;
            return;
        }
        mo22094e0(i, 1);
        this.array[i] = e;
    }

    @C12579k
    public ListIterator<E> listIterator(int i) {
        C10904b.f28138a.mo22057c(i, this.length);
        return new C10911a(this, i);
    }

    public void add(int i, E e) {
        mo22086M();
        C10904b.f28138a.mo22057c(i, this.length);
        mo22116y(this.offset + i, e);
    }

    public boolean addAll(int i, @C12579k Collection<? extends E> collection) {
        Intrinsics.checkNotNullParameter(collection, "elements");
        mo22086M();
        C10904b.f28138a.mo22057c(i, this.length);
        int size = collection.size();
        mo22115w(this.offset + i, collection, size);
        return size > 0;
    }

    @C12579k
    public Object[] toArray() {
        E[] eArr = this.array;
        int i = this.offset;
        return C10956m.m41088M1(eArr, i, this.length + i);
    }

    public ListBuilder() {
        this(10);
    }

    public ListBuilder(int i) {
        this(C10921b.m40860d(i), 0, 0, false, (ListBuilder) null, (ListBuilder) null);
    }
}
