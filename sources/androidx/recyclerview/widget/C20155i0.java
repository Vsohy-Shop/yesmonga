package androidx.recyclerview.widget;

import android.util.SparseArray;
import java.lang.reflect.Array;

/* renamed from: androidx.recyclerview.widget.i0 */
public class C20155i0<T> {

    /* renamed from: a */
    public final int f51882a;

    /* renamed from: b */
    public final SparseArray<C20156a<T>> f51883b = new SparseArray<>(10);

    /* renamed from: c */
    public C20156a<T> f51884c;

    /* renamed from: androidx.recyclerview.widget.i0$a */
    public static class C20156a<T> {

        /* renamed from: a */
        public final T[] f51885a;

        /* renamed from: b */
        public int f51886b;

        /* renamed from: c */
        public int f51887c;

        /* renamed from: d */
        public C20156a<T> f51888d;

        public C20156a(Class<T> cls, int i) {
            this.f51885a = (Object[]) Array.newInstance(cls, i);
        }

        /* renamed from: a */
        public boolean mo60459a(int i) {
            int i2 = this.f51886b;
            return i2 <= i && i < i2 + this.f51887c;
        }

        /* renamed from: b */
        public T mo60460b(int i) {
            return this.f51885a[i - this.f51886b];
        }
    }

    public C20155i0(int i) {
        this.f51882a = i;
    }

    /* renamed from: a */
    public C20156a<T> mo60453a(C20156a<T> aVar) {
        int indexOfKey = this.f51883b.indexOfKey(aVar.f51886b);
        if (indexOfKey < 0) {
            this.f51883b.put(aVar.f51886b, aVar);
            return null;
        }
        C20156a<T> valueAt = this.f51883b.valueAt(indexOfKey);
        this.f51883b.setValueAt(indexOfKey, aVar);
        if (this.f51884c == valueAt) {
            this.f51884c = aVar;
        }
        return valueAt;
    }

    /* renamed from: b */
    public void mo60454b() {
        this.f51883b.clear();
    }

    /* renamed from: c */
    public C20156a<T> mo60455c(int i) {
        if (i < 0 || i >= this.f51883b.size()) {
            return null;
        }
        return this.f51883b.valueAt(i);
    }

    /* renamed from: d */
    public T mo60456d(int i) {
        C20156a<T> aVar = this.f51884c;
        if (aVar == null || !aVar.mo60459a(i)) {
            int indexOfKey = this.f51883b.indexOfKey(i - (i % this.f51882a));
            if (indexOfKey < 0) {
                return null;
            }
            this.f51884c = this.f51883b.valueAt(indexOfKey);
        }
        return this.f51884c.mo60460b(i);
    }

    /* renamed from: e */
    public C20156a<T> mo60457e(int i) {
        C20156a<T> aVar = this.f51883b.get(i);
        if (this.f51884c == aVar) {
            this.f51884c = null;
        }
        this.f51883b.delete(i);
        return aVar;
    }

    /* renamed from: f */
    public int mo60458f() {
        return this.f51883b.size();
    }
}
