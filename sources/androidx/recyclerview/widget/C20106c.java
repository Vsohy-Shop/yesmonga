package androidx.recyclerview.widget;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.recyclerview.widget.C20157j;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
public final class C20106c<T> {
    @C0363p0

    /* renamed from: a */
    public final Executor f51710a;
    @C0359n0

    /* renamed from: b */
    public final Executor f51711b;
    @C0359n0

    /* renamed from: c */
    public final C20157j.C20163f<T> f51712c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    public static final class C20107a<T> {

        /* renamed from: d */
        public static final Object f51713d = new Object();

        /* renamed from: e */
        public static Executor f51714e;
        @C0363p0

        /* renamed from: a */
        public Executor f51715a;

        /* renamed from: b */
        public Executor f51716b;

        /* renamed from: c */
        public final C20157j.C20163f<T> f51717c;

        public C20107a(@C0359n0 C20157j.C20163f<T> fVar) {
            this.f51717c = fVar;
        }

        @C0359n0
        /* renamed from: a */
        public C20106c<T> mo60237a() {
            if (this.f51716b == null) {
                synchronized (f51713d) {
                    if (f51714e == null) {
                        f51714e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f51716b = f51714e;
            }
            return new C20106c<>(this.f51715a, this.f51716b, this.f51717c);
        }

        @C0359n0
        /* renamed from: b */
        public C20107a<T> mo60238b(Executor executor) {
            this.f51716b = executor;
            return this;
        }

        @C0359n0
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* renamed from: c */
        public C20107a<T> mo60239c(Executor executor) {
            this.f51715a = executor;
            return this;
        }
    }

    public C20106c(@C0363p0 Executor executor, @C0359n0 Executor executor2, @C0359n0 C20157j.C20163f<T> fVar) {
        this.f51710a = executor;
        this.f51711b = executor2;
        this.f51712c = fVar;
    }

    @C0359n0
    /* renamed from: a */
    public Executor mo60234a() {
        return this.f51711b;
    }

    @C0359n0
    /* renamed from: b */
    public C20157j.C20163f<T> mo60235b() {
        return this.f51712c;
    }

    @C0363p0
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public Executor mo60236c() {
        return this.f51710a;
    }
}
