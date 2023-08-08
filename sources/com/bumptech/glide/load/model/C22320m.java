package com.bumptech.glide.load.model;

import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.util.C22629j;
import com.bumptech.glide.util.C22635o;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.model.m */
public class C22320m<A, B> {

    /* renamed from: b */
    public static final int f57333b = 250;

    /* renamed from: a */
    public final C22629j<C22322b<A>, B> f57334a;

    /* renamed from: com.bumptech.glide.load.model.m$a */
    public class C22321a extends C22629j<C22322b<A>, B> {
        public C22321a(long j) {
            super(j);
        }

        /* renamed from: r */
        public void mo66041n(@C0359n0 C22322b<A> bVar, @C0363p0 B b) {
            bVar.mo66303c();
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.load.model.m$b */
    public static final class C22322b<A> {

        /* renamed from: d */
        public static final Queue<C22322b<?>> f57336d = C22635o.m102631f(0);

        /* renamed from: a */
        public int f57337a;

        /* renamed from: b */
        public int f57338b;

        /* renamed from: c */
        public A f57339c;

        /* renamed from: a */
        public static <A> C22322b<A> m101468a(A a, int i, int i2) {
            C22322b<A> poll;
            Queue<C22322b<?>> queue = f57336d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new C22322b<>();
            }
            poll.mo66302b(a, i, i2);
            return poll;
        }

        /* renamed from: b */
        public final void mo66302b(A a, int i, int i2) {
            this.f57339c = a;
            this.f57338b = i;
            this.f57337a = i2;
        }

        /* renamed from: c */
        public void mo66303c() {
            Queue<C22322b<?>> queue = f57336d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C22322b)) {
                return false;
            }
            C22322b bVar = (C22322b) obj;
            if (this.f57338b == bVar.f57338b && this.f57337a == bVar.f57337a && this.f57339c.equals(bVar.f57339c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f57337a * 31) + this.f57338b) * 31) + this.f57339c.hashCode();
        }
    }

    public C22320m() {
        this(250);
    }

    /* renamed from: a */
    public void mo66298a() {
        this.f57334a.mo66988b();
    }

    @C0363p0
    /* renamed from: b */
    public B mo66299b(A a, int i, int i2) {
        C22322b a2 = C22322b.m101468a(a, i, i2);
        B k = this.f57334a.mo66994k(a2);
        a2.mo66303c();
        return k;
    }

    /* renamed from: c */
    public void mo66300c(A a, int i, int i2, B b) {
        this.f57334a.mo66996o(C22322b.m101468a(a, i, i2), b);
    }

    public C22320m(long j) {
        this.f57334a = new C22321a(j);
    }
}
