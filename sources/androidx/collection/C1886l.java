package androidx.collection;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.shared.network.interceptors.C28819e;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlinx.serialization.json.internal.C12361b;

/* renamed from: androidx.collection.l */
public class C1886l<K, V> {

    /* renamed from: d */
    public static final boolean f5155d = false;

    /* renamed from: e */
    public static final String f5156e = "ArrayMap";

    /* renamed from: f */
    public static final boolean f5157f = true;

    /* renamed from: g */
    public static final int f5158g = 4;

    /* renamed from: v */
    public static final int f5159v = 10;
    @C0363p0

    /* renamed from: w */
    public static Object[] f5160w;

    /* renamed from: x */
    public static int f5161x;
    @C0363p0

    /* renamed from: y */
    public static Object[] f5162y;

    /* renamed from: z */
    public static int f5163z;

    /* renamed from: a */
    public int[] f5164a;

    /* renamed from: b */
    public Object[] f5165b;

    /* renamed from: c */
    public int f5166c;

    public C1886l() {
        this.f5164a = C1874g.f5120a;
        this.f5165b = C1874g.f5122c;
        this.f5166c = 0;
    }

    /* renamed from: a */
    private void m7577a(int i) {
        if (i == 8) {
            synchronized (C1886l.class) {
                Object[] objArr = f5162y;
                if (objArr != null) {
                    this.f5165b = objArr;
                    f5162y = (Object[]) objArr[0];
                    this.f5164a = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f5163z--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C1886l.class) {
                Object[] objArr2 = f5160w;
                if (objArr2 != null) {
                    this.f5165b = objArr2;
                    f5160w = (Object[]) objArr2[0];
                    this.f5164a = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f5161x--;
                    return;
                }
            }
        }
        this.f5164a = new int[i];
        this.f5165b = new Object[(i << 1)];
    }

    /* renamed from: b */
    public static int m7578b(int[] iArr, int i, int i2) {
        try {
            return C1874g.m7493a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    public static void m7579d(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C1886l.class) {
                if (f5163z < 10) {
                    objArr[0] = f5162y;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f5162y = objArr;
                    f5163z++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C1886l.class) {
                if (f5161x < 10) {
                    objArr[0] = f5160w;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f5160w = objArr;
                    f5161x++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo6321c(int i) {
        int i2 = this.f5166c;
        int[] iArr = this.f5164a;
        if (iArr.length < i) {
            Object[] objArr = this.f5165b;
            m7577a(i);
            if (this.f5166c > 0) {
                System.arraycopy(iArr, 0, this.f5164a, 0, i2);
                System.arraycopy(objArr, 0, this.f5165b, 0, i2 << 1);
            }
            m7579d(iArr, objArr, i2);
        }
        if (this.f5166c != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f5166c;
        if (i > 0) {
            int[] iArr = this.f5164a;
            Object[] objArr = this.f5165b;
            this.f5164a = C1874g.f5120a;
            this.f5165b = C1874g.f5122c;
            this.f5166c = 0;
            m7579d(iArr, objArr, i);
        }
        if (this.f5166c > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(@C0363p0 Object obj) {
        return mo6327f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo6332i(obj) >= 0;
    }

    /* renamed from: e */
    public int mo6325e(Object obj, int i) {
        int i2 = this.f5166c;
        if (i2 == 0) {
            return -1;
        }
        int b = m7578b(this.f5164a, i2, i);
        if (b < 0 || obj.equals(this.f5165b[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f5164a[i3] == i) {
            if (obj.equals(this.f5165b[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f5164a[i4] == i) {
            if (obj.equals(this.f5165b[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1886l) {
            C1886l lVar = (C1886l) obj;
            if (size() != lVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f5166c) {
                try {
                    Object j = mo6334j(i);
                    Object o = mo6338o(i);
                    Object obj2 = lVar.get(j);
                    if (o == null) {
                        if (obj2 != null || !lVar.containsKey(j)) {
                            return false;
                        }
                    } else if (!o.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i2 = 0;
            while (i2 < this.f5166c) {
                try {
                    Object j2 = mo6334j(i2);
                    Object o2 = mo6338o(i2);
                    Object obj3 = map.get(j2);
                    if (o2 == null) {
                        if (obj3 != null || !map.containsKey(j2)) {
                            return false;
                        }
                    } else if (!o2.equals(obj3)) {
                        return false;
                    }
                    i2++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo6327f(@C0363p0 Object obj) {
        return obj == null ? mo6330h() : mo6325e(obj, obj.hashCode());
    }

    @C0363p0
    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo6327f(obj);
        if (f >= 0) {
            return this.f5165b[(f << 1) + 1];
        }
        return v;
    }

    /* renamed from: h */
    public int mo6330h() {
        int i = this.f5166c;
        if (i == 0) {
            return -1;
        }
        int b = m7578b(this.f5164a, i, 0);
        if (b < 0 || this.f5165b[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f5164a[i2] == 0) {
            if (this.f5165b[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b - 1;
        while (i3 >= 0 && this.f5164a[i3] == 0) {
            if (this.f5165b[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public int hashCode() {
        int i;
        int[] iArr = this.f5164a;
        Object[] objArr = this.f5165b;
        int i2 = this.f5166c;
        int i3 = 1;
        int i4 = 0;
        int i5 = 0;
        while (i4 < i2) {
            Object obj = objArr[i3];
            int i6 = iArr[i4];
            if (obj == null) {
                i = 0;
            } else {
                i = obj.hashCode();
            }
            i5 += i ^ i6;
            i4++;
            i3 += 2;
        }
        return i5;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo6332i(Object obj) {
        int i = this.f5166c * 2;
        Object[] objArr = this.f5165b;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.f5166c <= 0;
    }

    /* renamed from: j */
    public K mo6334j(int i) {
        return this.f5165b[i << 1];
    }

    /* renamed from: l */
    public void mo6335l(@C0359n0 C1886l<? extends K, ? extends V> lVar) {
        int i = lVar.f5166c;
        mo6321c(this.f5166c + i);
        if (this.f5166c != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(lVar.mo6334j(i2), lVar.mo6338o(i2));
            }
        } else if (i > 0) {
            System.arraycopy(lVar.f5164a, 0, this.f5164a, 0, i);
            System.arraycopy(lVar.f5165b, 0, this.f5165b, 0, i << 1);
            this.f5166c = i;
        }
    }

    /* renamed from: m */
    public V mo6336m(int i) {
        V[] vArr = this.f5165b;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f5166c;
        int i4 = 0;
        if (i3 <= 1) {
            m7579d(this.f5164a, vArr, i3);
            this.f5164a = C1874g.f5120a;
            this.f5165b = C1874g.f5122c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f5164a;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f5165b;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f5165b;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m7577a(i6);
                if (i3 == this.f5166c) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f5164a, 0, i);
                        System.arraycopy(vArr, 0, this.f5165b, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f5164a, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f5165b, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f5166c) {
            this.f5166c = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: n */
    public V mo6337n(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f5165b;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: o */
    public V mo6338o(int i) {
        return this.f5165b[(i << 1) + 1];
    }

    @C0363p0
    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f5166c;
        if (k == null) {
            i2 = mo6330h();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo6325e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f5165b;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f5164a;
        if (i3 >= iArr.length) {
            int i6 = 8;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 < 4) {
                i6 = 4;
            }
            Object[] objArr = this.f5165b;
            m7577a(i6);
            if (i3 == this.f5166c) {
                int[] iArr2 = this.f5164a;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f5165b, 0, objArr.length);
                }
                m7579d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f5164a;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f5165b;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f5166c - i5) << 1);
        }
        int i8 = this.f5166c;
        if (i3 == i8) {
            int[] iArr4 = this.f5164a;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f5165b;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f5166c = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    @C0363p0
    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        if (v2 == null) {
            return put(k, v);
        }
        return v2;
    }

    @C0363p0
    public V remove(Object obj) {
        int f = mo6327f(obj);
        if (f >= 0) {
            return mo6336m(f);
        }
        return null;
    }

    @C0363p0
    public V replace(K k, V v) {
        int f = mo6327f(k);
        if (f >= 0) {
            return mo6337n(f, v);
        }
        return null;
    }

    public int size() {
        return this.f5166c;
    }

    public String toString() {
        if (isEmpty()) {
            return C28819e.f70617a;
        }
        StringBuilder sb = new StringBuilder(this.f5166c * 28);
        sb.append(C12361b.f30258i);
        for (int i = 0; i < this.f5166c; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object j = mo6334j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object o = mo6338o(i);
            if (o != this) {
                sb.append(o);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append(C12361b.f30259j);
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo6327f(obj);
        if (f < 0) {
            return false;
        }
        Object o = mo6338o(f);
        if (obj2 != o && (obj2 == null || !obj2.equals(o))) {
            return false;
        }
        mo6336m(f);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo6327f(k);
        if (f < 0) {
            return false;
        }
        V o = mo6338o(f);
        if (o != v && (v == null || !v.equals(o))) {
            return false;
        }
        mo6337n(f, v2);
        return true;
    }

    public C1886l(int i) {
        if (i == 0) {
            this.f5164a = C1874g.f5120a;
            this.f5165b = C1874g.f5122c;
        } else {
            m7577a(i);
        }
        this.f5166c = 0;
    }

    public C1886l(C1886l<K, V> lVar) {
        this();
        if (lVar != null) {
            mo6335l(lVar);
        }
    }
}
