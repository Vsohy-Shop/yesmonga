package androidx.datastore.preferences.protobuf;

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

/* renamed from: androidx.datastore.preferences.protobuf.i1 */
public final class C18753i1 {

    /* renamed from: a */
    public static final Charset f47860a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final Charset f47861b = Charset.forName("ISO-8859-1");

    /* renamed from: c */
    public static final int f47862c = 4096;

    /* renamed from: d */
    public static final byte[] f47863d;

    /* renamed from: e */
    public static final ByteBuffer f47864e;

    /* renamed from: f */
    public static final C18889w f47865f;

    /* renamed from: androidx.datastore.preferences.protobuf.i1$a */
    public interface C18754a extends C18770k<Boolean> {
        /* renamed from: C */
        boolean mo54822C(int i);

        /* renamed from: N */
        void mo54823N(boolean z);

        /* renamed from: c */
        C18754a mo54630c(int i);

        /* renamed from: u */
        boolean mo54824u(int i, boolean z);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i1$b */
    public interface C18755b extends C18770k<Double> {
        /* renamed from: B */
        double mo54825B(int i, double d);

        /* renamed from: c */
        C18755b mo54630c(int i);

        /* renamed from: c0 */
        void mo54826c0(double d);

        double getDouble(int i);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i1$c */
    public interface C18756c {
        int getNumber();
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i1$d */
    public interface C18757d<T extends C18756c> {
        /* renamed from: a */
        T mo53931a(int i);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i1$e */
    public interface C18758e {
        /* renamed from: a */
        boolean mo53933a(int i);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i1$f */
    public interface C18759f extends C18770k<Float> {
        /* renamed from: G */
        void mo54828G(float f);

        /* renamed from: c */
        C18759f mo54630c(int i);

        float getFloat(int i);

        /* renamed from: t */
        float mo54830t(int i, float f);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i1$g */
    public interface C18760g extends C18770k<Integer> {
        /* renamed from: V */
        void mo54629V(int i);

        /* renamed from: c */
        C18760g mo54630c(int i);

        int getInt(int i);

        /* renamed from: o */
        int mo54636o(int i, int i2);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i1$h */
    public static class C18761h<F, T> extends AbstractList<T> {

        /* renamed from: a */
        public final List<F> f47866a;

        /* renamed from: b */
        public final C18762a<F, T> f47867b;

        /* renamed from: androidx.datastore.preferences.protobuf.i1$h$a */
        public interface C18762a<F, T> {
            T convert(F f);
        }

        public C18761h(List<F> list, C18762a<F, T> aVar) {
            this.f47866a = list;
            this.f47867b = aVar;
        }

        public T get(int i) {
            return this.f47867b.convert(this.f47866a.get(i));
        }

        public int size() {
            return this.f47866a.size();
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i1$i */
    public interface C18763i extends C18770k<Long> {
        /* renamed from: F */
        long mo54834F(int i, long j);

        /* renamed from: Z */
        void mo54835Z(long j);

        /* renamed from: c */
        C18763i mo54630c(int i);

        long getLong(int i);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i1$j */
    public static class C18764j<K, V, RealValue> extends AbstractMap<K, V> {

        /* renamed from: a */
        public final Map<K, RealValue> f47868a;

        /* renamed from: b */
        public final C18766b<RealValue, V> f47869b;

        /* renamed from: androidx.datastore.preferences.protobuf.i1$j$a */
        public static class C18765a implements C18766b<Integer, T> {

            /* renamed from: a */
            public final /* synthetic */ C18757d f47870a;

            /* renamed from: b */
            public final /* synthetic */ C18756c f47871b;

            public C18765a(C18757d dVar, C18756c cVar) {
                this.f47870a = dVar;
                this.f47871b = cVar;
            }

            /* renamed from: c */
            public Integer mo54841b(T t) {
                return Integer.valueOf(t.getNumber());
            }

            /* renamed from: d */
            public T mo54840a(Integer num) {
                T a = this.f47870a.mo53931a(num.intValue());
                if (a == null) {
                    return this.f47871b;
                }
                return a;
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.i1$j$b */
        public interface C18766b<A, B> {
            /* renamed from: a */
            B mo54840a(A a);

            /* renamed from: b */
            A mo54841b(B b);
        }

        /* renamed from: androidx.datastore.preferences.protobuf.i1$j$c */
        public class C18767c implements Map.Entry<K, V> {

            /* renamed from: a */
            public final Map.Entry<K, RealValue> f47872a;

            public C18767c(Map.Entry<K, RealValue> entry) {
                this.f47872a = entry;
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
                return this.f47872a.getKey();
            }

            public V getValue() {
                return C18764j.this.f47869b.mo54840a(this.f47872a.getValue());
            }

            public int hashCode() {
                return this.f47872a.hashCode();
            }

            public V setValue(V v) {
                RealValue value = this.f47872a.setValue(C18764j.this.f47869b.mo54841b(v));
                if (value == null) {
                    return null;
                }
                return C18764j.this.f47869b.mo54840a(value);
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.i1$j$d */
        public class C18768d implements Iterator<Map.Entry<K, V>> {

            /* renamed from: a */
            public final Iterator<Map.Entry<K, RealValue>> f47874a;

            public C18768d(Iterator<Map.Entry<K, RealValue>> it) {
                this.f47874a = it;
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return new C18767c(this.f47874a.next());
            }

            public boolean hasNext() {
                return this.f47874a.hasNext();
            }

            public void remove() {
                this.f47874a.remove();
            }
        }

        /* renamed from: androidx.datastore.preferences.protobuf.i1$j$e */
        public class C18769e extends AbstractSet<Map.Entry<K, V>> {

            /* renamed from: a */
            public final Set<Map.Entry<K, RealValue>> f47876a;

            public C18769e(Set<Map.Entry<K, RealValue>> set) {
                this.f47876a = set;
            }

            public Iterator<Map.Entry<K, V>> iterator() {
                return new C18768d(this.f47876a.iterator());
            }

            public int size() {
                return this.f47876a.size();
            }
        }

        public C18764j(Map<K, RealValue> map, C18766b<RealValue, V> bVar) {
            this.f47868a = map;
            this.f47869b = bVar;
        }

        /* renamed from: b */
        public static <T extends C18756c> C18766b<Integer, T> m86382b(C18757d<T> dVar, T t) {
            return new C18765a(dVar, t);
        }

        public Set<Map.Entry<K, V>> entrySet() {
            return new C18769e(this.f47868a.entrySet());
        }

        public V get(Object obj) {
            RealValue realvalue = this.f47868a.get(obj);
            if (realvalue == null) {
                return null;
            }
            return this.f47869b.mo54840a(realvalue);
        }

        public V put(K k, V v) {
            RealValue put = this.f47868a.put(k, this.f47869b.mo54841b(v));
            if (put == null) {
                return null;
            }
            return this.f47869b.mo54840a(put);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.i1$k */
    public interface C18770k<E> extends List<E>, RandomAccess {
        /* renamed from: J */
        void mo54404J();

        /* renamed from: T */
        boolean mo54405T();

        /* renamed from: c */
        C18770k<E> mo54630c(int i);
    }

    static {
        byte[] bArr = new byte[0];
        f47863d = bArr;
        f47864e = ByteBuffer.wrap(bArr);
        f47865f = C18889w.m87628p(bArr);
    }

    /* renamed from: a */
    public static byte[] m86337a(String str) {
        return str.getBytes(f47861b);
    }

    /* renamed from: b */
    public static ByteBuffer m86338b(String str) {
        return ByteBuffer.wrap(m86337a(str));
    }

    /* renamed from: c */
    public static ByteString m86339c(String str) {
        return ByteString.m84387X(str.getBytes(f47861b));
    }

    /* renamed from: d */
    public static <T> T m86340d(T t) {
        t.getClass();
        return t;
    }

    /* renamed from: e */
    public static <T> T m86341e(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: f */
    public static ByteBuffer m86342f(ByteBuffer byteBuffer) {
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        ByteBuffer allocate = ByteBuffer.allocate(duplicate.capacity());
        allocate.put(duplicate);
        allocate.clear();
        return allocate;
    }

    /* renamed from: g */
    public static boolean m86343g(List<byte[]> list, List<byte[]> list2) {
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
    public static boolean m86344h(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (byteBuffer.capacity() != byteBuffer2.capacity()) {
            return false;
        }
        return byteBuffer.duplicate().clear().equals(byteBuffer2.duplicate().clear());
    }

    /* renamed from: i */
    public static boolean m86345i(List<ByteBuffer> list, List<ByteBuffer> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!m86344h(list.get(i), list2.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static <T extends C18920z1> T m86346j(Class<T> cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", new Class[0]);
            return (C18920z1) method.invoke(method, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException("Failed to get default instance for " + cls, e);
        }
    }

    /* renamed from: k */
    public static int m86347k(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: l */
    public static int m86348l(List<byte[]> list) {
        int i = 1;
        for (byte[] m : list) {
            i = (i * 31) + m86349m(m);
        }
        return i;
    }

    /* renamed from: m */
    public static int m86349m(byte[] bArr) {
        return m86350n(bArr, 0, bArr.length);
    }

    /* renamed from: n */
    public static int m86350n(byte[] bArr, int i, int i2) {
        int w = m86359w(i2, bArr, i, i2);
        if (w == 0) {
            return 1;
        }
        return w;
    }

    /* renamed from: o */
    public static int m86351o(ByteBuffer byteBuffer) {
        int i;
        if (byteBuffer.hasArray()) {
            int w = m86359w(byteBuffer.capacity(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.capacity());
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
            capacity = m86359w(capacity, bArr, 0, i);
        }
        if (capacity == 0) {
            return 1;
        }
        return capacity;
    }

    /* renamed from: p */
    public static int m86352p(List<ByteBuffer> list) {
        int i = 1;
        for (ByteBuffer o : list) {
            i = (i * 31) + m86351o(o);
        }
        return i;
    }

    /* renamed from: q */
    public static int m86353q(C18756c cVar) {
        return cVar.getNumber();
    }

    /* renamed from: r */
    public static int m86354r(List<? extends C18756c> list) {
        int i = 1;
        for (C18756c q : list) {
            i = (i * 31) + m86353q(q);
        }
        return i;
    }

    /* renamed from: s */
    public static int m86355s(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: t */
    public static boolean m86356t(ByteString byteString) {
        return byteString.mo53762s0();
    }

    /* renamed from: u */
    public static boolean m86357u(byte[] bArr) {
        return Utf8.m85209t(bArr);
    }

    /* renamed from: v */
    public static Object m86358v(Object obj, Object obj2) {
        return ((C18920z1) obj).toBuilder().mo54276t0((C18920z1) obj2).mo54011Q();
    }

    /* renamed from: w */
    public static int m86359w(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    /* renamed from: x */
    public static String m86360x(String str) {
        return new String(str.getBytes(f47861b), f47860a);
    }

    /* renamed from: y */
    public static byte[] m86361y(String str) {
        return str.getBytes(f47860a);
    }

    /* renamed from: z */
    public static String m86362z(byte[] bArr) {
        return new String(bArr, f47860a);
    }
}
