package com.google.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: com.google.protobuf.v0 */
public final class C34471v0 {

    /* renamed from: a */
    public static final Charset f83529a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f83530b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final int f83531c = 4096;

    /* renamed from: d */
    public static final byte[] f83532d;

    /* renamed from: e */
    public static final ByteBuffer f83533e;

    /* renamed from: f */
    public static final C34448s f83534f;

    /* renamed from: com.google.protobuf.v0$a */
    public interface C34472a extends C34488k<Boolean> {
        /* renamed from: C */
        boolean mo101363C(int i);

        /* renamed from: N */
        void mo101365N(boolean z);

        /* renamed from: c */
        C34472a mo100962c(int i);

        /* renamed from: u */
        boolean mo101375u(int i, boolean z);
    }

    /* renamed from: com.google.protobuf.v0$b */
    public interface C34473b extends C34488k<Double> {
        /* renamed from: B */
        double mo101620B(int i, double d);

        /* renamed from: c */
        C34473b mo100962c(int i);

        /* renamed from: c0 */
        void mo101622c0(double d);

        double getDouble(int i);
    }

    /* renamed from: com.google.protobuf.v0$c */
    public interface C34474c {
        int getNumber();
    }

    /* renamed from: com.google.protobuf.v0$d */
    public interface C34475d<T extends C34474c> {
        /* renamed from: a */
        T mo93187a(int i);
    }

    /* renamed from: com.google.protobuf.v0$e */
    public interface C34476e {
        /* renamed from: a */
        boolean mo93189a(int i);
    }

    /* renamed from: com.google.protobuf.v0$f */
    public interface C34477f extends C34488k<Float> {
        /* renamed from: G */
        void mo101474G(float f);

        /* renamed from: c */
        C34477f mo100962c(int i);

        float getFloat(int i);

        /* renamed from: t */
        float mo101486t(int i, float f);
    }

    /* renamed from: com.google.protobuf.v0$g */
    public interface C34478g extends C34488k<Integer> {
        /* renamed from: V */
        void mo101605V(int i);

        /* renamed from: c */
        C34478g mo100962c(int i);

        int getInt(int i);

        /* renamed from: o */
        int mo101613o(int i, int i2);
    }

    /* renamed from: com.google.protobuf.v0$h */
    public static class C34479h<F, T> extends AbstractList<T> {

        /* renamed from: a */
        public final List<F> f83535a;

        /* renamed from: b */
        public final C34480a<F, T> f83536b;

        /* renamed from: com.google.protobuf.v0$h$a */
        public interface C34480a<F, T> {
            T convert(F f);
        }

        public C34479h(List<F> list, C34480a<F, T> aVar) {
            this.f83535a = list;
            this.f83536b = aVar;
        }

        public T get(int i) {
            return this.f83536b.convert(this.f83535a.get(i));
        }

        public int size() {
            return this.f83535a.size();
        }
    }

    /* renamed from: com.google.protobuf.v0$i */
    public interface C34481i extends C34488k<Long> {
        /* renamed from: F */
        long mo101022F(int i, long j);

        /* renamed from: Z */
        void mo101024Z(long j);

        /* renamed from: c */
        C34481i mo100962c(int i);

        long getLong(int i);
    }

    /* renamed from: com.google.protobuf.v0$j */
    public static class C34482j<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: a */
        public final Map<K, RealValue> f83537a;

        /* renamed from: b */
        public final C34484b<RealValue, V> f83538b;

        /* renamed from: com.google.protobuf.v0$j$a */
        public static class C34483a implements C34484b<Integer, T> {

            /* renamed from: a */
            public final /* synthetic */ C34475d f83539a;

            /* renamed from: b */
            public final /* synthetic */ C34474c f83540b;

            public C34483a(C34475d dVar, C34474c cVar) {
                this.f83539a = dVar;
                this.f83540b = cVar;
            }

            /* renamed from: c */
            public Integer mo101641b(T t) {
                return Integer.valueOf(t.getNumber());
            }

            /* renamed from: d */
            public T mo101640a(Integer num) {
                T a = this.f83539a.mo93187a(num.intValue());
                if (a == null) {
                    return this.f83540b;
                }
                return a;
            }
        }

        /* renamed from: com.google.protobuf.v0$j$b */
        public interface C34484b<A, B> {
            /* renamed from: a */
            B mo101640a(A a);

            /* renamed from: b */
            A mo101641b(B b);
        }

        /* renamed from: com.google.protobuf.v0$j$c */
        public class C34485c implements Map.Entry<K, V> {

            /* renamed from: a */
            public final Map.Entry<K, RealValue> f83541a;

            public C34485c(Map.Entry<K, RealValue> entry) {
                this.f83541a = entry;
            }

            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                if (!getKey().equals(((Map.Entry) obj).getKey()) || !getValue().equals(getValue())) {
                    return false;
                }
                return true;
            }

            public K getKey() {
                return this.f83541a.getKey();
            }

            public V getValue() {
                return C34482j.this.f83538b.mo101640a(this.f83541a.getValue());
            }

            public int hashCode() {
                return this.f83541a.hashCode();
            }

            public V setValue(V v) {
                RealValue value = this.f83541a.setValue(C34482j.this.f83538b.mo101641b(v));
                if (value == null) {
                    return null;
                }
                return C34482j.this.f83538b.mo101640a(value);
            }
        }

        /* renamed from: com.google.protobuf.v0$j$d */
        public class C34486d implements Iterator<Map.Entry<K, V>> {

            /* renamed from: a */
            public final Iterator<Map.Entry<K, RealValue>> f83543a;

            public C34486d(Iterator<Map.Entry<K, RealValue>> it) {
                this.f83543a = it;
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return new C34485c(this.f83543a.next());
            }

            public boolean hasNext() {
                return this.f83543a.hasNext();
            }

            public void remove() {
                this.f83543a.remove();
            }
        }

        /* renamed from: com.google.protobuf.v0$j$e */
        public class C34487e extends AbstractSet<Map.Entry<K, V>> {

            /* renamed from: a */
            public final Set<Map.Entry<K, RealValue>> f83545a;

            public C34487e(Set<Map.Entry<K, RealValue>> set) {
                this.f83545a = set;
            }

            public Iterator<Map.Entry<K, V>> iterator() {
                return new C34486d(this.f83545a.iterator());
            }

            public int size() {
                return this.f83545a.size();
            }
        }

        public C34482j(Map<K, RealValue> map, C34484b<RealValue, V> bVar) {
            this.f83537a = map;
            this.f83538b = bVar;
        }

        /* renamed from: b */
        public static <T extends C34474c> C34484b<Integer, T> m140615b(C34475d<T> dVar, T t) {
            return new C34483a(dVar, t);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return new C34487e(this.f83537a.entrySet());
        }

        public V get(Object obj) {
            RealValue realvalue = this.f83537a.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.f83538b.mo101640a(realvalue);
        }

        public V put(K k, V v) {
            RealValue put = this.f83537a.put(k, this.f83538b.mo101641b(v));
            if (put == null) {
                return null;
            }
            return this.f83538b.mo101640a(put);
        }
    }

    /* renamed from: com.google.protobuf.v0$k */
    public interface C34488k<E> extends List<E>, RandomAccess {
        /* renamed from: J */
        void mo100970J();

        /* renamed from: T */
        boolean mo100971T();

        /* renamed from: c */
        C34488k<E> mo100962c(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f83532d = bArr;
        f83533e = ByteBuffer.wrap(bArr);
        f83534f = C34448s.m140154p(bArr);
    }

    /* renamed from: a */
    public static byte[] m140570a(String str) {
        return str.getBytes(f83530b);
    }

    /* renamed from: b */
    public static ByteBuffer m140571b(String str) {
        return ByteBuffer.wrap(m140570a(str));
    }

    /* renamed from: c */
    public static ByteString m140572c(String str) {
        return ByteString.m137256X(str.getBytes(f83530b));
    }

    /* renamed from: d */
    public static <T> T m140573d(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: e */
    public static <T> T m140574e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: f */
    public static ByteBuffer m140575f(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    /* renamed from: g */
    public static boolean m140576g(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m140577h(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return byteBuffer.duplicate().clear().equals(byteBuffer2.duplicate().clear());
    }

    /* renamed from: i */
    public static boolean m140578i(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!m140577h(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static <T extends C34412l1> T m140579j(Class<T> cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", new Class[0]);
            return (C34412l1) method.invoke(method, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get default instance for " + cls, e);
        }
    }

    /* renamed from: k */
    public static int m140580k(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: l */
    public static int m140581l(List<byte[]> list) {
        int i = 1;
        for (byte[] m : list) {
            i = (i * 31) + m140582m(m);
        }
        return i;
    }

    /* renamed from: m */
    public static int m140582m(byte[] bArr) {
        return m140583n(bArr, 0, bArr.length);
    }

    /* renamed from: n */
    public static int m140583n(byte[] bArr, int i, int i2) {
        int w = m140592w(i2, bArr, i, i2);
        if (w == 0) {
            return 1;
        }
        return w;
    }

    /* renamed from: o */
    public static int m140584o(ByteBuffer byteBuffer) {
        int i;
        if (byteBuffer.hasArray()) {
            int w = m140592w(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
            if (w == 0) {
                return 1;
            }
            return w;
        }
        int i2 = 4096;
        if (byteBuffer.capacity() <= 4096) {
            i2 = byteBuffer.capacity();
        }
        byte[] bArr = new byte[i2];
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        int capacity = byteBuffer.capacity();
        while (duplicate.remaining() > 0) {
            if (duplicate.remaining() <= i2) {
                i = duplicate.remaining();
            } else {
                i = i2;
            }
            duplicate.get(bArr, 0, i);
            capacity = m140592w(capacity, bArr, 0, i);
        }
        if (capacity == 0) {
            return 1;
        }
        return capacity;
    }

    /* renamed from: p */
    public static int m140585p(List<ByteBuffer> list) {
        int i = 1;
        for (ByteBuffer o : list) {
            i = (i * 31) + m140584o(o);
        }
        return i;
    }

    /* renamed from: q */
    public static int m140586q(C34474c cVar) {
        return cVar.getNumber();
    }

    /* renamed from: r */
    public static int m140587r(List<? extends C34474c> list) {
        int i = 1;
        for (C34474c q : list) {
            i = (i * 31) + m140586q(q);
        }
        return i;
    }

    /* renamed from: s */
    public static int m140588s(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: t */
    public static boolean m140589t(ByteString byteString) {
        return byteString.mo99250s0();
    }

    /* renamed from: u */
    public static boolean m140590u(byte[] bArr) {
        return Utf8.m138642t(bArr);
    }

    /* renamed from: v */
    public static Object m140591v(Object obj, Object obj2) {
        return ((C34412l1) obj).toBuilder().mo100838A1((C34412l1) obj2).mo100467Q();
    }

    /* renamed from: w */
    public static int m140592w(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: x */
    public static String m140593x(String str) {
        return new String(str.getBytes(f83530b), f83529a);
    }

    /* renamed from: y */
    public static byte[] m140594y(String str) {
        return str.getBytes(f83529a);
    }

    /* renamed from: z */
    public static String m140595z(byte[] bArr) {
        return new String(bArr, f83529a);
    }
}
