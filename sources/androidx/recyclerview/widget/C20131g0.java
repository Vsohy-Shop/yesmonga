package androidx.recyclerview.widget;

import androidx.annotation.C0359n0;
import androidx.collection.C1875h;

/* renamed from: androidx.recyclerview.widget.g0 */
public interface C20131g0 {

    /* renamed from: androidx.recyclerview.widget.g0$a */
    public static class C20132a implements C20131g0 {

        /* renamed from: a */
        public long f51812a = 0;

        /* renamed from: androidx.recyclerview.widget.g0$a$a */
        public class C20133a implements C20138d {

            /* renamed from: a */
            public final C1875h<Long> f51813a = new C1875h<>();

            public C20133a() {
            }

            /* renamed from: a */
            public long mo60389a(long j) {
                Long k = this.f51813a.mo6223k(j);
                if (k == null) {
                    k = Long.valueOf(C20132a.this.mo60388b());
                    this.f51813a.mo6229t(j, k);
                }
                return k.longValue();
            }
        }

        @C0359n0
        /* renamed from: a */
        public C20138d mo60387a() {
            return new C20133a();
        }

        /* renamed from: b */
        public long mo60388b() {
            long j = this.f51812a;
            this.f51812a = 1 + j;
            return j;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g0$b */
    public static class C20134b implements C20131g0 {

        /* renamed from: a */
        public final C20138d f51815a = new C20135a();

        /* renamed from: androidx.recyclerview.widget.g0$b$a */
        public class C20135a implements C20138d {
            public C20135a() {
            }

            /* renamed from: a */
            public long mo60389a(long j) {
                return -1;
            }
        }

        @C0359n0
        /* renamed from: a */
        public C20138d mo60387a() {
            return this.f51815a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g0$c */
    public static class C20136c implements C20131g0 {

        /* renamed from: a */
        public final C20138d f51817a = new C20137a();

        /* renamed from: androidx.recyclerview.widget.g0$c$a */
        public class C20137a implements C20138d {
            public C20137a() {
            }

            /* renamed from: a */
            public long mo60389a(long j) {
                return j;
            }
        }

        @C0359n0
        /* renamed from: a */
        public C20138d mo60387a() {
            return this.f51817a;
        }
    }

    /* renamed from: androidx.recyclerview.widget.g0$d */
    public interface C20138d {
        /* renamed from: a */
        long mo60389a(long j);
    }

    @C0359n0
    /* renamed from: a */
    C20138d mo60387a();
}
