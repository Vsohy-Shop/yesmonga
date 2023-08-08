package androidx.core.util;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;

/* renamed from: androidx.core.util.q */
public final class C17997q {

    /* renamed from: androidx.core.util.q$a */
    public interface C17998a<T> {
        /* renamed from: a */
        boolean mo52468a(@C0359n0 T t);

        @C0363p0
        /* renamed from: b */
        T mo52469b();
    }

    /* renamed from: androidx.core.util.q$b */
    public static class C17999b<T> implements C17998a<T> {

        /* renamed from: a */
        public final Object[] f46512a;

        /* renamed from: b */
        public int f46513b;

        public C17999b(int i) {
            if (i > 0) {
                this.f46512a = new Object[i];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }

        /* renamed from: a */
        public boolean mo52468a(@C0359n0 T t) {
            if (!mo52470c(t)) {
                int i = this.f46513b;
                Object[] objArr = this.f46512a;
                if (i >= objArr.length) {
                    return false;
                }
                objArr[i] = t;
                this.f46513b = i + 1;
                return true;
            }
            throw new IllegalStateException("Already in the pool!");
        }

        /* renamed from: b */
        public T mo52469b() {
            int i = this.f46513b;
            if (i <= 0) {
                return null;
            }
            int i2 = i - 1;
            T[] tArr = this.f46512a;
            T t = tArr[i2];
            tArr[i2] = null;
            this.f46513b = i - 1;
            return t;
        }

        /* renamed from: c */
        public final boolean mo52470c(@C0359n0 T t) {
            for (int i = 0; i < this.f46513b; i++) {
                if (this.f46512a[i] == t) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: androidx.core.util.q$c */
    public static class C18000c<T> extends C17999b<T> {

        /* renamed from: c */
        public final Object f46514c = new Object();

        public C18000c(int i) {
            super(i);
        }

        /* renamed from: a */
        public boolean mo52468a(@C0359n0 T t) {
            boolean a;
            synchronized (this.f46514c) {
                a = super.mo52468a(t);
            }
            return a;
        }

        /* renamed from: b */
        public T mo52469b() {
            T b;
            synchronized (this.f46514c) {
                b = super.mo52469b();
            }
            return b;
        }
    }
}
