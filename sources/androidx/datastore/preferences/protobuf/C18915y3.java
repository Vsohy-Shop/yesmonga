package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.y3 */
public class C18915y3 extends AbstractList<String> implements C18818n1, RandomAccess {

    /* renamed from: a */
    public final C18818n1 f48138a;

    /* renamed from: androidx.datastore.preferences.protobuf.y3$a */
    public class C18916a implements ListIterator<String> {

        /* renamed from: a */
        public ListIterator<String> f48139a;

        /* renamed from: b */
        public final /* synthetic */ int f48140b;

        public C18916a(int i) {
            this.f48140b = i;
            this.f48139a = C18915y3.this.f48138a.listIterator(i);
        }

        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f48139a.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f48139a.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f48139a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f48139a.hasPrevious();
        }

        public int nextIndex() {
            return this.f48139a.nextIndex();
        }

        public int previousIndex() {
            return this.f48139a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.y3$b */
    public class C18917b implements Iterator<String> {

        /* renamed from: a */
        public Iterator<String> f48142a;

        public C18917b() {
            this.f48142a = C18915y3.this.f48138a.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f48142a.next();
        }

        public boolean hasNext() {
            return this.f48142a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C18915y3(C18818n1 n1Var) {
        this.f48138a = n1Var;
    }

    /* renamed from: D1 */
    public void mo55018D1(C18818n1 n1Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: K */
    public byte[] mo55020K(int i) {
        return this.f48138a.mo55020K(i);
    }

    /* renamed from: L */
    public boolean mo55021L(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: N2 */
    public void mo55022N2(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: O */
    public List<?> mo55023O() {
        return this.f48138a.mo55023O();
    }

    /* renamed from: P */
    public List<byte[]> mo55024P() {
        return Collections.unmodifiableList(this.f48138a.mo55024P());
    }

    /* renamed from: R */
    public ByteString mo55025R(int i) {
        return this.f48138a.mo55025R(i);
    }

    /* renamed from: S */
    public List<ByteString> mo55026S() {
        return Collections.unmodifiableList(this.f48138a.mo55026S());
    }

    /* renamed from: a0 */
    public void mo55028a0(int i, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a1 */
    public void mo55029a1(int i, ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b0 */
    public boolean mo55030b0(Collection<? extends ByteString> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d0 */
    public C18818n1 mo55031d0() {
        return this;
    }

    /* renamed from: g0 */
    public Object mo55034g0(int i) {
        return this.f48138a.mo55034g0(i);
    }

    /* renamed from: h */
    public String get(int i) {
        return (String) this.f48138a.get(i);
    }

    public Iterator<String> iterator() {
        return new C18917b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C18916a(i);
    }

    /* renamed from: s */
    public void mo55039s(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f48138a.size();
    }
}
