package androidx.constraintlayout.core;

/* renamed from: androidx.constraintlayout.core.g */
public final class C16647g {

    /* renamed from: a */
    public static final boolean f41482a = false;

    /* renamed from: androidx.constraintlayout.core.g$a */
    public interface C16648a<T> {
        /* renamed from: a */
        boolean mo48734a(T t);

        /* renamed from: b */
        T mo48735b();

        /* renamed from: c */
        void mo48736c(T[] tArr, int i);
    }

    /* renamed from: androidx.constraintlayout.core.g$b */
    public static class C16649b<T> implements C16648a<T> {

        /* renamed from: a */
        public final Object[] f41483a;

        /* renamed from: b */
        public int f41484b;

        public C16649b(int i) {
            if (i > 0) {
                this.f41483a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public boolean mo48734a(T t) {
            int i = this.f41484b;
            Object[] objArr = this.f41483a;
            if (i >= objArr.length) {
                return false;
            }
            objArr[i] = t;
            this.f41484b = i + 1;
            return true;
        }

        /* renamed from: b */
        public T mo48735b() {
            int i = this.f41484b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.f41483a;
            T t = tArr[i2];
            tArr[i2] = null;
            this.f41484b = i - 1;
            return t;
        }

        /* renamed from: c */
        public void mo48736c(T[] tArr, int i) {
            if (i > tArr.length) {
                i = tArr.length;
            }
            for (int i2 = 0; i2 < i; i2++) {
                T t = tArr[i2];
                int i3 = this.f41484b;
                Object[] objArr = this.f41483a;
                if (i3 < objArr.length) {
                    objArr[i3] = t;
                    this.f41484b = i3 + 1;
                }
            }
        }

        /* renamed from: d */
        public final boolean mo48737d(T t) {
            for (int i = 0; i < this.f41484b; i++) {
                if (this.f41483a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }
}
