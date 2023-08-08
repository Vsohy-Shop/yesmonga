package androidx.collection;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.collection.c */
public final class C1869c<E> implements Collection<E>, Set<E> {
    @C0363p0

    /* renamed from: X */
    public static Object[] f5097X = null;

    /* renamed from: Y */
    public static int f5098Y = 0;

    /* renamed from: e */
    public static final boolean f5099e = false;

    /* renamed from: f */
    public static final String f5100f = "ArraySet";

    /* renamed from: g */
    public static final int[] f5101g = new int[0];

    /* renamed from: v */
    public static final Object[] f5102v = new Object[0];

    /* renamed from: w */
    public static final int f5103w = 4;

    /* renamed from: x */
    public static final int f5104x = 10;
    @C0363p0

    /* renamed from: y */
    public static Object[] f5105y;

    /* renamed from: z */
    public static int f5106z;

    /* renamed from: a */
    public int[] f5107a;

    /* renamed from: b */
    public Object[] f5108b;

    /* renamed from: c */
    public int f5109c;

    /* renamed from: d */
    public C1880k<E, E> f5110d;

    /* renamed from: androidx.collection.c$a */
    public class C1870a extends C1880k<E, E> {
        public C1870a() {
        }

        /* renamed from: a */
        public void mo6147a() {
            C1869c.this.clear();
        }

        /* renamed from: b */
        public Object mo6148b(int i, int i2) {
            return C1869c.this.f5108b[i];
        }

        /* renamed from: c */
        public Map<E, E> mo6149c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* renamed from: d */
        public int mo6150d() {
            return C1869c.this.f5109c;
        }

        /* renamed from: e */
        public int mo6151e(Object obj) {
            return C1869c.this.indexOf(obj);
        }

        /* renamed from: f */
        public int mo6152f(Object obj) {
            return C1869c.this.indexOf(obj);
        }

        /* renamed from: g */
        public void mo6153g(E e, E e2) {
            C1869c.this.add(e);
        }

        /* renamed from: h */
        public void mo6154h(int i) {
            C1869c.this.mo6156A(i);
        }

        /* renamed from: i */
        public E mo6155i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C1869c() {
        this(0);
    }

    /* renamed from: k */
    public static void m7446k(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1869c.class) {
                if (f5098Y < 10) {
                    objArr[0] = f5097X;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f5097X = objArr;
                    f5098Y++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C1869c.class) {
                if (f5106z < 10) {
                    objArr[0] = f5105y;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f5105y = objArr;
                    f5106z++;
                }
            }
        }
    }

    /* renamed from: A */
    public E mo6156A(int i) {
        E[] eArr = this.f5108b;
        E e = eArr[i];
        int i2 = this.f5109c;
        if (i2 <= 1) {
            m7446k(this.f5107a, eArr, i2);
            this.f5107a = f5101g;
            this.f5108b = f5102v;
            this.f5109c = 0;
        } else {
            int[] iArr = this.f5107a;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f5109c = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f5108b;
                    System.arraycopy(objArr, i5, objArr, i, this.f5109c - i);
                }
                this.f5108b[this.f5109c] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                mo6165h(i3);
                this.f5109c--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f5107a, 0, i);
                    System.arraycopy(eArr, 0, this.f5108b, 0, i);
                }
                int i6 = this.f5109c;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f5107a, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f5108b, i, this.f5109c - i);
                }
            }
        }
        return e;
    }

    @C0363p0
    /* renamed from: H */
    public E mo6157H(int i) {
        return this.f5108b[i];
    }

    public boolean add(@C0363p0 E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = mo6180w();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = mo6172r(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f5109c;
        int[] iArr = this.f5107a;
        if (i4 >= iArr.length) {
            int i5 = 8;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 < 4) {
                i5 = 4;
            }
            Object[] objArr = this.f5108b;
            mo6165h(i5);
            int[] iArr2 = this.f5107a;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f5108b, 0, objArr.length);
            }
            m7446k(iArr, objArr, this.f5109c);
        }
        int i6 = this.f5109c;
        if (i3 < i6) {
            int[] iArr3 = this.f5107a;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f5108b;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f5109c - i3);
        }
        this.f5107a[i3] = i;
        this.f5108b[i3] = e;
        this.f5109c++;
        return true;
    }

    public boolean addAll(@C0359n0 Collection<? extends E> collection) {
        mo6167i(this.f5109c + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i = this.f5109c;
        if (i != 0) {
            m7446k(this.f5107a, this.f5108b, i);
            this.f5107a = f5101g;
            this.f5108b = f5102v;
            this.f5109c = 0;
        }
    }

    public boolean contains(@C0363p0 Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(@C0359n0 Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public void mo6163e(@C0359n0 C1869c<? extends E> cVar) {
        int i = cVar.f5109c;
        mo6167i(this.f5109c + i);
        if (this.f5109c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                add(cVar.mo6157H(i2));
            }
        } else if (i > 0) {
            System.arraycopy(cVar.f5107a, 0, this.f5107a, 0, i);
            System.arraycopy(cVar.f5108b, 0, this.f5108b, 0, i);
            this.f5109c = i;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f5109c) {
                try {
                    if (!set.contains(mo6157H(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final void mo6165h(int i) {
        if (i == 8) {
            synchronized (C1869c.class) {
                Object[] objArr = f5097X;
                if (objArr != null) {
                    this.f5108b = objArr;
                    f5097X = (Object[]) objArr[0];
                    this.f5107a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f5098Y--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1869c.class) {
                Object[] objArr2 = f5105y;
                if (objArr2 != null) {
                    this.f5108b = objArr2;
                    f5105y = (Object[]) objArr2[0];
                    this.f5107a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5106z--;
                    return;
                }
            }
        }
        this.f5107a = new int[i];
        this.f5108b = new Object[i];
    }

    public int hashCode() {
        int[] iArr = this.f5107a;
        int i = this.f5109c;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    /* renamed from: i */
    public void mo6167i(int i) {
        int[] iArr = this.f5107a;
        if (iArr.length < i) {
            Object[] objArr = this.f5108b;
            mo6165h(i);
            int i2 = this.f5109c;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f5107a, 0, i2);
                System.arraycopy(objArr, 0, this.f5108b, 0, this.f5109c);
            }
            m7446k(iArr, objArr, this.f5109c);
        }
    }

    public int indexOf(@C0363p0 Object obj) {
        return obj == null ? mo6180w() : mo6172r(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f5109c <= 0;
    }

    public Iterator<E> iterator() {
        return mo6171q().mo6260m().iterator();
    }

    /* renamed from: q */
    public final C1880k<E, E> mo6171q() {
        if (this.f5110d == null) {
            this.f5110d = new C1870a();
        }
        return this.f5110d;
    }

    /* renamed from: r */
    public final int mo6172r(Object obj, int i) {
        int i2 = this.f5109c;
        if (i2 == 0) {
            return -1;
        }
        int a = C1874g.m7493a(this.f5107a, i2, i);
        if (a < 0 || obj.equals(this.f5108b[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f5107a[i3] == i) {
            if (obj.equals(this.f5108b[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f5107a[i4] == i) {
            if (obj.equals(this.f5108b[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean remove(@C0363p0 Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo6156A(indexOf);
        return true;
    }

    public boolean removeAll(@C0359n0 Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(@C0359n0 Collection<?> collection) {
        boolean z = false;
        for (int i = this.f5109c - 1; i >= 0; i--) {
            if (!collection.contains(this.f5108b[i])) {
                mo6156A(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f5109c;
    }

    @C0359n0
    public Object[] toArray() {
        int i = this.f5109c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f5108b, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return C28819e.f70617a;
        }
        StringBuilder sb = new StringBuilder(this.f5109c * 14);
        sb.append(C12361b.f30258i);
        for (int i = 0; i < this.f5109c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object H = mo6157H(i);
            if (H != this) {
                sb.append(H);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(C12361b.f30259j);
        return sb.toString();
    }

    /* renamed from: w */
    public final int mo6180w() {
        int i = this.f5109c;
        if (i == 0) {
            return -1;
        }
        int a = C1874g.m7493a(this.f5107a, i, 0);
        if (a < 0 || this.f5108b[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f5107a[i2] == 0) {
            if (this.f5108b[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f5107a[i3] == 0) {
            if (this.f5108b[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    /* renamed from: y */
    public boolean mo6181y(@C0359n0 C1869c<? extends E> cVar) {
        int i = cVar.f5109c;
        int i2 = this.f5109c;
        for (int i3 = 0; i3 < i; i3++) {
            remove(cVar.mo6157H(i3));
        }
        if (i2 != this.f5109c) {
            return true;
        }
        return false;
    }

    public C1869c(int i) {
        if (i == 0) {
            this.f5107a = f5101g;
            this.f5108b = f5102v;
        } else {
            mo6165h(i);
        }
        this.f5109c = 0;
    }

    @C0359n0
    public <T> T[] toArray(@C0359n0 T[] tArr) {
        if (tArr.length < this.f5109c) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f5109c);
        }
        System.arraycopy(this.f5108b, 0, tArr, 0, this.f5109c);
        int length = tArr.length;
        int i = this.f5109c;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }

    public C1869c(@C0363p0 C1869c<E> cVar) {
        this();
        if (cVar != null) {
            mo6163e(cVar);
        }
    }

    public C1869c(@C0363p0 Collection<E> collection) {
        this();
        if (collection != null) {
            addAll(collection);
        }
    }
}
