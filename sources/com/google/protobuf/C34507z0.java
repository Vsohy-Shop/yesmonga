package com.google.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.protobuf.z0 */
public class C34507z0 extends C34337c<String> implements C34324a1, RandomAccess {

    /* renamed from: d */
    public static final C34507z0 f83576d;

    /* renamed from: e */
    public static final C34324a1 f83577e;

    /* renamed from: c */
    public final List<Object> f83578c;

    /* renamed from: com.google.protobuf.z0$a */
    public static class C34508a extends AbstractList<byte[]> implements RandomAccess {

        /* renamed from: a */
        public final C34507z0 f83579a;

        public C34508a(C34507z0 z0Var) {
            this.f83579a = z0Var;
        }

        /* renamed from: e */
        public void add(int i, byte[] bArr) {
            this.f83579a.mo101724H(i, bArr);
            this.modCount++;
        }

        /* renamed from: h */
        public byte[] get(int i) {
            return this.f83579a.mo100862K(i);
        }

        /* renamed from: i */
        public byte[] remove(int i) {
            String f0 = this.f83579a.remove(i);
            this.modCount++;
            return C34507z0.m140723M(f0);
        }

        /* renamed from: k */
        public byte[] set(int i, byte[] bArr) {
            Object h = this.f83579a.mo101731j0(i, bArr);
            this.modCount++;
            return C34507z0.m140723M(h);
        }

        public int size() {
            return this.f83579a.size();
        }
    }

    /* renamed from: com.google.protobuf.z0$b */
    public static class C34509b extends AbstractList<ByteString> implements RandomAccess {

        /* renamed from: a */
        public final C34507z0 f83580a;

        public C34509b(C34507z0 z0Var) {
            this.f83580a = z0Var;
        }

        /* renamed from: e */
        public void add(int i, ByteString byteString) {
            this.f83580a.mo101733y(i, byteString);
            this.modCount++;
        }

        /* renamed from: h */
        public ByteString get(int i) {
            return this.f83580a.mo100866R(i);
        }

        /* renamed from: i */
        public ByteString remove(int i) {
            String f0 = this.f83580a.remove(i);
            this.modCount++;
            return C34507z0.m140724Q(f0);
        }

        /* renamed from: k */
        public ByteString set(int i, ByteString byteString) {
            Object q = this.f83580a.mo101730i0(i, byteString);
            this.modCount++;
            return C34507z0.m140724Q(q);
        }

        public int size() {
            return this.f83580a.size();
        }
    }

    static {
        C34507z0 z0Var = new C34507z0();
        f83576d = z0Var;
        z0Var.mo100970J();
        f83577e = z0Var;
    }

    public C34507z0() {
        this(10);
    }

    /* renamed from: M */
    public static byte[] m140723M(Object obj) {
        if (obj instanceof byte[]) {
            return (byte[]) obj;
        }
        if (obj instanceof String) {
            return C34471v0.m140594y((String) obj);
        }
        return ((ByteString) obj).mo99224M0();
    }

    /* renamed from: Q */
    public static ByteString m140724Q(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        if (obj instanceof String) {
            return ByteString.m137260e0((String) obj);
        }
        return ByteString.m137256X((byte[]) obj);
    }

    /* renamed from: W */
    public static String m140725W(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            return ((ByteString) obj).mo99228S0();
        }
        return C34471v0.m140595z((byte[]) obj);
    }

    /* renamed from: X */
    public static C34507z0 m140726X() {
        return f83576d;
    }

    /* renamed from: A */
    public void add(int i, String str) {
        mo100975e();
        this.f83578c.add(i, str);
        this.modCount++;
    }

    /* renamed from: D0 */
    public void mo100861D0(ByteString byteString) {
        mo100975e();
        this.f83578c.add(byteString);
        this.modCount++;
    }

    /* renamed from: H */
    public final void mo101724H(int i, byte[] bArr) {
        mo100975e();
        this.f83578c.add(i, bArr);
        this.modCount++;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.util.List<java.lang.Object>} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: byte[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public byte[] mo100862K(int r3) {
        /*
            r2 = this;
            java.util.List<java.lang.Object> r0 = r2.f83578c
            java.lang.Object r0 = r0.get(r3)
            byte[] r1 = m140723M(r0)
            if (r1 == r0) goto L_0x0011
            java.util.List<java.lang.Object> r0 = r2.f83578c
            r0.set(r3, r1)
        L_0x0011:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.C34507z0.mo100862K(int):byte[]");
    }

    /* renamed from: L */
    public boolean mo100863L(Collection<byte[]> collection) {
        mo100975e();
        boolean addAll = this.f83578c.addAll(collection);
        this.modCount++;
        return addAll;
    }

    /* renamed from: O */
    public List<?> mo100864O() {
        return Collections.unmodifiableList(this.f83578c);
    }

    /* renamed from: P */
    public List<byte[]> mo100865P() {
        return new C34508a(this);
    }

    /* renamed from: R */
    public ByteString mo100866R(int i) {
        Object obj = this.f83578c.get(i);
        ByteString Q = m140724Q(obj);
        if (Q != obj) {
            this.f83578c.set(i, Q);
        }
        return Q;
    }

    /* renamed from: S */
    public List<ByteString> mo100884S() {
        return new C34509b(this);
    }

    /* renamed from: T */
    public /* bridge */ /* synthetic */ boolean mo100971T() {
        return super.mo100971T();
    }

    /* renamed from: U3 */
    public void mo100867U3(int i, ByteString byteString) {
        mo101730i0(i, byteString);
    }

    /* renamed from: Y */
    public String get(int i) {
        Object obj = this.f83578c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String S0 = byteString.mo99228S0();
            if (byteString.mo99250s0()) {
                this.f83578c.set(i, S0);
            }
            return S0;
        }
        byte[] bArr = (byte[]) obj;
        String z = C34471v0.m140595z(bArr);
        if (C34471v0.m140590u(bArr)) {
            this.f83578c.set(i, z);
        }
        return z;
    }

    /* renamed from: a0 */
    public void mo100868a0(int i, byte[] bArr) {
        mo101731j0(i, bArr);
    }

    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    /* renamed from: b0 */
    public boolean mo100869b0(Collection<? extends ByteString> collection) {
        mo100975e();
        boolean addAll = this.f83578c.addAll(collection);
        this.modCount++;
        return addAll;
    }

    public void clear() {
        mo100975e();
        this.f83578c.clear();
        this.modCount++;
    }

    /* renamed from: d0 */
    public C34324a1 mo100870d0() {
        if (mo100971T()) {
            return new C34326a3(this);
        }
        return this;
    }

    /* renamed from: e0 */
    public C34507z0 mo100962c(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f83578c);
            return new C34507z0((ArrayList<Object>) arrayList);
        }
        throw new IllegalArgumentException();
    }

    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: f0 */
    public String remove(int i) {
        mo100975e();
        Object remove = this.f83578c.remove(i);
        this.modCount++;
        return m140725W(remove);
    }

    /* renamed from: g0 */
    public Object mo100871g0(int i) {
        return this.f83578c.get(i);
    }

    /* renamed from: g1 */
    public void mo100872g1(C34324a1 a1Var) {
        mo100975e();
        for (Object next : a1Var.mo100864O()) {
            if (next instanceof byte[]) {
                byte[] bArr = (byte[]) next;
                this.f83578c.add(Arrays.copyOf(bArr, bArr.length));
            } else {
                this.f83578c.add(next);
            }
        }
    }

    /* renamed from: h0 */
    public String set(int i, String str) {
        mo100975e();
        return m140725W(this.f83578c.set(i, str));
    }

    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i0 */
    public final Object mo101730i0(int i, ByteString byteString) {
        mo100975e();
        return this.f83578c.set(i, byteString);
    }

    /* renamed from: j0 */
    public final Object mo101731j0(int i, byte[] bArr) {
        mo100975e();
        return this.f83578c.set(i, bArr);
    }

    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    /* renamed from: s */
    public void mo100873s(byte[] bArr) {
        mo100975e();
        this.f83578c.add(bArr);
        this.modCount++;
    }

    public int size() {
        return this.f83578c.size();
    }

    /* renamed from: y */
    public final void mo101733y(int i, ByteString byteString) {
        mo100975e();
        this.f83578c.add(i, byteString);
        this.modCount++;
    }

    public C34507z0(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    public boolean addAll(int i, Collection<? extends String> collection) {
        mo100975e();
        if (collection instanceof C34324a1) {
            collection = ((C34324a1) collection).mo100864O();
        }
        boolean addAll = this.f83578c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C34507z0(C34324a1 a1Var) {
        this.f83578c = new ArrayList(a1Var.size());
        addAll(a1Var);
    }

    public C34507z0(List<String> list) {
        this((ArrayList<Object>) new ArrayList(list));
    }

    public C34507z0(ArrayList<Object> arrayList) {
        this.f83578c = arrayList;
    }
}
