package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: androidx.datastore.preferences.protobuf.m1 */
public class C18806m1 extends C18695c<String> implements C18818n1, RandomAccess {

    /* renamed from: d */
    public static final C18806m1 f47928d;

    /* renamed from: e */
    public static final C18818n1 f47929e;

    /* renamed from: c */
    public final List<Object> f47930c;

    /* renamed from: androidx.datastore.preferences.protobuf.m1$a */
    public static class C18807a extends AbstractList<byte[]> implements RandomAccess {

        /* renamed from: a */
        public final C18806m1 f47931a;

        public C18807a(C18806m1 m1Var) {
            this.f47931a = m1Var;
        }

        /* renamed from: e */
        public void add(int i, byte[] bArr) {
            this.f47931a.mo55019H(i, bArr);
            this.modCount++;
        }

        /* renamed from: h */
        public byte[] get(int i) {
            return this.f47931a.mo55020K(i);
        }

        /* renamed from: i */
        public byte[] remove(int i) {
            String f0 = this.f47931a.remove(i);
            this.modCount++;
            return C18806m1.m86647M(f0);
        }

        /* renamed from: k */
        public byte[] set(int i, byte[] bArr) {
            Object h = this.f47931a.mo55038j0(i, bArr);
            this.modCount++;
            return C18806m1.m86647M(h);
        }

        public int size() {
            return this.f47931a.size();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.m1$b */
    public static class C18808b extends AbstractList<ByteString> implements RandomAccess {

        /* renamed from: a */
        public final C18806m1 f47932a;

        public C18808b(C18806m1 m1Var) {
            this.f47932a = m1Var;
        }

        /* renamed from: e */
        public void add(int i, ByteString byteString) {
            this.f47932a.mo55041y(i, byteString);
            this.modCount++;
        }

        /* renamed from: h */
        public ByteString get(int i) {
            return this.f47932a.mo55025R(i);
        }

        /* renamed from: i */
        public ByteString remove(int i) {
            String f0 = this.f47932a.remove(i);
            this.modCount++;
            return C18806m1.m86648Q(f0);
        }

        /* renamed from: k */
        public ByteString set(int i, ByteString byteString) {
            Object q = this.f47932a.mo55037i0(i, byteString);
            this.modCount++;
            return C18806m1.m86648Q(q);
        }

        public int size() {
            return this.f47932a.size();
        }
    }

    static {
        C18806m1 m1Var = new C18806m1();
        f47928d = m1Var;
        m1Var.mo54404J();
        f47929e = m1Var;
    }

    public C18806m1() {
        this(10);
    }

    /* renamed from: M */
    public static byte[] m86647M(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return C18753i1.m86361y((String) obj);
        }
        return ((ByteString) obj).mo53737M0();
    }

    /* renamed from: Q */
    public static ByteString m86648Q(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        if (obj instanceof String) {
            return ByteString.m84390e0((String) obj);
        }
        return ByteString.m84387X((byte[]) obj);
    }

    /* renamed from: W */
    public static String m86649W(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).mo53741S0();
        }
        return C18753i1.m86362z((byte[]) obj);
    }

    /* renamed from: X */
    public static C18806m1 m86650X() {
        return f47928d;
    }

    /* renamed from: A */
    public void add(int i, String str) {
        mo54411e();
        this.f47930c.add(i, str);
        this.modCount++;
    }

    /* renamed from: D1 */
    public void mo55018D1(C18818n1 n1Var) {
        mo54411e();
        for (Object next : n1Var.mo55023O()) {
            if (next instanceof byte[]) {
                byte[] bArr = (byte[]) next;
                this.f47930c.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f47930c.add(next);
            }
        }
    }

    /* renamed from: H */
    public final void mo55019H(int i, byte[] bArr) {
        mo54411e();
        this.f47930c.add(i, bArr);
        this.modCount++;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.util.List<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo55020K(int r3) {
        /*
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.f47930c
            java.lang.Object r0 = r0.get(r3)
            byte[] r1 = m86647M(r0)
            if (r1 == r0) goto L_0x0011
            java.util.List<java.lang.Object> r0 = r2.f47930c
            r0.set(r3, r1)
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.C18806m1.mo55020K(int):byte[]");
    }

    /* renamed from: L */
    public boolean mo55021L(Collection<byte[]> collection) {
        mo54411e();
        boolean addAll = this.f47930c.addAll(collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: N2 */
    public void mo55022N2(ByteString byteString) {
        mo54411e();
        this.f47930c.add(byteString);
        this.modCount++;
    }

    /* renamed from: O */
    public List<?> mo55023O() {
        return Collections.unmodifiableList(this.f47930c);
    }

    /* renamed from: P */
    public List<byte[]> mo55024P() {
        return new C18807a(this);
    }

    /* renamed from: R */
    public ByteString mo55025R(int i) {
        Object obj = this.f47930c.get(i);
        ByteString Q = m86648Q(obj);
        if (Q != obj) {
            this.f47930c.set(i, Q);
        }
        return Q;
    }

    /* renamed from: S */
    public List<ByteString> mo55026S() {
        return new C18808b(this);
    }

    /* renamed from: T */
    public /* bridge */ /* synthetic */ boolean mo54405T() {
        return super.mo54405T();
    }

    /* renamed from: Y */
    public String get(int i) {
        Object obj = this.f47930c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String S0 = byteString.mo53741S0();
            if (byteString.mo53762s0()) {
                this.f47930c.set(i, S0);
            }
            return S0;
        }
        byte[] bArr = (byte[]) obj;
        String z = C18753i1.m86362z(bArr);
        if (C18753i1.m86357u(bArr)) {
            this.f47930c.set(i, z);
        }
        return z;
    }

    /* renamed from: a0 */
    public void mo55028a0(int i, byte[] bArr) {
        mo55038j0(i, bArr);
    }

    /* renamed from: a1 */
    public void mo55029a1(int i, ByteString byteString) {
        mo55037i0(i, byteString);
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b0 */
    public boolean mo55030b0(Collection<? extends ByteString> collection) {
        mo54411e();
        boolean addAll = this.f47930c.addAll(collection);
        this.modCount++;
        return addAll;
    }

    public void clear() {
        mo54411e();
        this.f47930c.clear();
        this.modCount++;
    }

    /* renamed from: d0 */
    public C18818n1 mo55031d0() {
        if (mo54405T()) {
            return new C18915y3(this);
        }
        return this;
    }

    /* renamed from: e0 */
    public C18806m1 mo54630c(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f47930c);
            return new C18806m1((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public String remove(int i) {
        mo54411e();
        Object remove = this.f47930c.remove(i);
        this.modCount++;
        return m86649W(remove);
    }

    /* renamed from: g0 */
    public Object mo55034g0(int i) {
        return this.f47930c.get(i);
    }

    /* renamed from: h0 */
    public String set(int i, String str) {
        mo54411e();
        return m86649W(this.f47930c.set(i, str));
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i0 */
    public final Object mo55037i0(int i, ByteString byteString) {
        mo54411e();
        return this.f47930c.set(i, byteString);
    }

    /* renamed from: j0 */
    public final Object mo55038j0(int i, byte[] bArr) {
        mo54411e();
        return this.f47930c.set(i, bArr);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* renamed from: s */
    public void mo55039s(byte[] bArr) {
        mo54411e();
        this.f47930c.add(bArr);
        this.modCount++;
    }

    public int size() {
        return this.f47930c.size();
    }

    /* renamed from: y */
    public final void mo55041y(int i, ByteString byteString) {
        mo54411e();
        this.f47930c.add(i, byteString);
        this.modCount++;
    }

    public C18806m1(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo54411e();
        if (collection instanceof C18818n1) {
            collection = ((C18818n1) collection).mo55023O();
        }
        boolean addAll = this.f47930c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C18806m1(C18818n1 n1Var) {
        this.f47930c = new ArrayList(n1Var.size());
        addAll(n1Var);
    }

    public C18806m1(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    public C18806m1(ArrayList<Object> arrayList) {
        this.f47930c = arrayList;
    }
}
