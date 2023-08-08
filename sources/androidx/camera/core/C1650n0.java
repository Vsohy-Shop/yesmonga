package androidx.camera.core;

import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.util.C18001r;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: androidx.camera.core.n0 */
public final class C1650n0 {

    /* renamed from: e */
    public static final int f4608e = 1;

    /* renamed from: f */
    public static final int f4609f = 2;

    /* renamed from: g */
    public static final int f4610g = 4;

    /* renamed from: h */
    public static final int f4611h = 7;

    /* renamed from: i */
    public static final long f4612i = 5000;

    /* renamed from: a */
    public final List<C1645m2> f4613a;

    /* renamed from: b */
    public final List<C1645m2> f4614b;

    /* renamed from: c */
    public final List<C1645m2> f4615c;

    /* renamed from: d */
    public final long f4616d;

    /* renamed from: androidx.camera.core.n0$a */
    public static class C1651a {

        /* renamed from: a */
        public final List<C1645m2> f4617a;

        /* renamed from: b */
        public final List<C1645m2> f4618b;

        /* renamed from: c */
        public final List<C1645m2> f4619c;

        /* renamed from: d */
        public long f4620d;

        public C1651a(@C0359n0 C1645m2 m2Var) {
            this(m2Var, 7);
        }

        @C0359n0
        /* renamed from: a */
        public C1651a mo5644a(@C0359n0 C1645m2 m2Var) {
            return mo5645b(m2Var, 7);
        }

        @C0359n0
        /* renamed from: b */
        public C1651a mo5645b(@C0359n0 C1645m2 m2Var, int i) {
            boolean z;
            boolean z2 = false;
            if (m2Var != null) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81765b(z, "Point cannot be null.");
            if (i >= 1 && i <= 7) {
                z2 = true;
            }
            C18001r.m81765b(z2, "Invalid metering mode " + i);
            if ((i & 1) != 0) {
                this.f4617a.add(m2Var);
            }
            if ((i & 2) != 0) {
                this.f4618b.add(m2Var);
            }
            if ((i & 4) != 0) {
                this.f4619c.add(m2Var);
            }
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C1650n0 mo5646c() {
            return new C1650n0(this);
        }

        @C0359n0
        /* renamed from: d */
        public C1651a mo5647d() {
            this.f4620d = 0;
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C1651a mo5648e(@C0337f0(from = 1) long j, @C0359n0 TimeUnit timeUnit) {
            boolean z;
            if (j >= 1) {
                z = true;
            } else {
                z = false;
            }
            C18001r.m81765b(z, "autoCancelDuration must be at least 1");
            this.f4620d = timeUnit.toMillis(j);
            return this;
        }

        public C1651a(@C0359n0 C1645m2 m2Var, int i) {
            this.f4617a = new ArrayList();
            this.f4618b = new ArrayList();
            this.f4619c = new ArrayList();
            this.f4620d = 5000;
            mo5645b(m2Var, i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.n0$b */
    public @interface C1652b {
    }

    public C1650n0(C1651a aVar) {
        this.f4613a = Collections.unmodifiableList(aVar.f4617a);
        this.f4614b = Collections.unmodifiableList(aVar.f4618b);
        this.f4615c = Collections.unmodifiableList(aVar.f4619c);
        this.f4616d = aVar.f4620d;
    }

    /* renamed from: a */
    public long mo5639a() {
        return this.f4616d;
    }

    @C0359n0
    /* renamed from: b */
    public List<C1645m2> mo5640b() {
        return this.f4614b;
    }

    @C0359n0
    /* renamed from: c */
    public List<C1645m2> mo5641c() {
        return this.f4613a;
    }

    @C0359n0
    /* renamed from: d */
    public List<C1645m2> mo5642d() {
        return this.f4615c;
    }

    /* renamed from: e */
    public boolean mo5643e() {
        return this.f4616d > 0;
    }
}
