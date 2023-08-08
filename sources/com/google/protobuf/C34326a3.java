package com.google.protobuf;

import java.util.AbstractList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.a3 */
public class C34326a3 extends AbstractList<String> implements C34324a1, RandomAccess {

    /* renamed from: a */
    public final C34324a1 f83200a;

    /* renamed from: com.google.protobuf.a3$a */
    public class C34327a implements ListIterator<String> {

        /* renamed from: a */
        public ListIterator<String> f83201a;

        /* renamed from: b */
        public final /* synthetic */ int f83202b;

        public C34327a(int i) {
            this.f83202b = i;
            this.f83201a = C34326a3.this.f83200a.listIterator(i);
        }

        /* renamed from: b */
        public void add(String str) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: c */
        public String next() {
            return this.f83201a.next();
        }

        /* renamed from: d */
        public String previous() {
            return this.f83201a.previous();
        }

        /* renamed from: e */
        public void set(String str) {
            throw new UnsupportedOperationException();
        }

        public boolean hasNext() {
            return this.f83201a.hasNext();
        }

        public boolean hasPrevious() {
            return this.f83201a.hasPrevious();
        }

        public int nextIndex() {
            return this.f83201a.nextIndex();
        }

        public int previousIndex() {
            return this.f83201a.previousIndex();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.a3$b */
    public class C34328b implements Iterator<String> {

        /* renamed from: a */
        public Iterator<String> f83204a;

        public C34328b() {
            this.f83204a = C34326a3.this.f83200a.iterator();
        }

        /* renamed from: b */
        public String next() {
            return this.f83204a.next();
        }

        public boolean hasNext() {
            return this.f83204a.hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    public C34326a3(C34324a1 a1Var) {
        this.f83200a = a1Var;
    }

    /* renamed from: D0 */
    public void mo100861D0(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: K */
    public byte[] mo100862K(int i) {
        return this.f83200a.mo100862K(i);
    }

    /* renamed from: L */
    public boolean mo100863L(Collection<byte[]> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: O */
    public List<?> mo100864O() {
        return this.f83200a.mo100864O();
    }

    /* renamed from: P */
    public List<byte[]> mo100865P() {
        return Collections.unmodifiableList(this.f83200a.mo100865P());
    }

    /* renamed from: R */
    public ByteString mo100866R(int i) {
        return this.f83200a.mo100866R(i);
    }

    /* renamed from: S */
    public List<ByteString> mo100884S() {
        return Collections.unmodifiableList(this.f83200a.mo100884S());
    }

    /* renamed from: U3 */
    public void mo100867U3(int i, ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: a0 */
    public void mo100868a0(int i, byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: b0 */
    public boolean mo100869b0(Collection<? extends ByteString> collection) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d0 */
    public C34324a1 mo100870d0() {
        return this;
    }

    /* renamed from: g0 */
    public Object mo100871g0(int i) {
        return this.f83200a.mo100871g0(i);
    }

    /* renamed from: g1 */
    public void mo100872g1(C34324a1 a1Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public String get(int i) {
        return (String) this.f83200a.get(i);
    }

    public Iterator<String> iterator() {
        return new C34328b();
    }

    public ListIterator<String> listIterator(int i) {
        return new C34327a(i);
    }

    /* renamed from: s */
    public void mo100873s(byte[] bArr) {
        throw new UnsupportedOperationException();
    }

    public int size() {
        return this.f83200a.size();
    }
}
