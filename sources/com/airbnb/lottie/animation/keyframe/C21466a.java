package com.airbnb.lottie.animation.keyframe;

import android.view.animation.Interpolator;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0379x;
import com.airbnb.lottie.C21492e;
import com.airbnb.lottie.value.C21693a;
import com.airbnb.lottie.value.C21702j;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.airbnb.lottie.animation.keyframe.a */
public abstract class C21466a<K, A> {

    /* renamed from: a */
    public final List<C21468b> f55381a = new ArrayList(1);

    /* renamed from: b */
    public boolean f55382b = false;

    /* renamed from: c */
    public final C21470d<K> f55383c;

    /* renamed from: d */
    public float f55384d = 0.0f;
    @C0363p0

    /* renamed from: e */
    public C21702j<A> f55385e;
    @C0363p0

    /* renamed from: f */
    public A f55386f = null;

    /* renamed from: g */
    public float f55387g = -1.0f;

    /* renamed from: h */
    public float f55388h = -1.0f;

    /* renamed from: com.airbnb.lottie.animation.keyframe.a$b */
    public interface C21468b {
        /* renamed from: a */
        void mo64019a();
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.a$c */
    public static final class C21469c<T> implements C21470d<T> {
        public C21469c() {
        }

        /* renamed from: a */
        public boolean mo64071a(float f) {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: b */
        public C21693a<T> mo64072b() {
            throw new IllegalStateException("not implemented");
        }

        /* renamed from: c */
        public boolean mo64073c(float f) {
            return false;
        }

        /* renamed from: d */
        public float mo64074d() {
            return 0.0f;
        }

        /* renamed from: e */
        public float mo64075e() {
            return 1.0f;
        }

        public boolean isEmpty() {
            return true;
        }
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.a$d */
    public interface C21470d<T> {
        /* renamed from: a */
        boolean mo64071a(float f);

        /* renamed from: b */
        C21693a<T> mo64072b();

        /* renamed from: c */
        boolean mo64073c(float f);

        @C0379x(from = 0.0d, mo1016to = 1.0d)
        /* renamed from: d */
        float mo64074d();

        @C0379x(from = 0.0d, mo1016to = 1.0d)
        /* renamed from: e */
        float mo64075e();

        boolean isEmpty();
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.a$e */
    public static final class C21471e<T> implements C21470d<T> {

        /* renamed from: a */
        public final List<? extends C21693a<T>> f55389a;
        @C0359n0

        /* renamed from: b */
        public C21693a<T> f55390b;

        /* renamed from: c */
        public C21693a<T> f55391c = null;

        /* renamed from: d */
        public float f55392d = -1.0f;

        public C21471e(List<? extends C21693a<T>> list) {
            this.f55389a = list;
            this.f55390b = mo64077f(0.0f);
        }

        /* renamed from: a */
        public boolean mo64071a(float f) {
            C21693a<T> aVar = this.f55391c;
            C21693a<T> aVar2 = this.f55390b;
            if (aVar == aVar2 && this.f55392d == f) {
                return true;
            }
            this.f55391c = aVar2;
            this.f55392d = f;
            return false;
        }

        @C0359n0
        /* renamed from: b */
        public C21693a<T> mo64072b() {
            return this.f55390b;
        }

        /* renamed from: c */
        public boolean mo64073c(float f) {
            if (this.f55390b.mo64721a(f)) {
                return !this.f55390b.mo64728h();
            }
            this.f55390b = mo64077f(f);
            return true;
        }

        /* renamed from: d */
        public float mo64074d() {
            return ((C21693a) this.f55389a.get(0)).mo64725e();
        }

        /* renamed from: e */
        public float mo64075e() {
            List<? extends C21693a<T>> list = this.f55389a;
            return ((C21693a) list.get(list.size() - 1)).mo64722b();
        }

        /* renamed from: f */
        public final C21693a<T> mo64077f(float f) {
            List<? extends C21693a<T>> list = this.f55389a;
            C21693a<T> aVar = (C21693a) list.get(list.size() - 1);
            if (f >= aVar.mo64725e()) {
                return aVar;
            }
            for (int size = this.f55389a.size() - 2; size >= 1; size--) {
                C21693a<T> aVar2 = (C21693a) this.f55389a.get(size);
                if (this.f55390b != aVar2 && aVar2.mo64721a(f)) {
                    return aVar2;
                }
            }
            return (C21693a) this.f55389a.get(0);
        }

        public boolean isEmpty() {
            return false;
        }
    }

    /* renamed from: com.airbnb.lottie.animation.keyframe.a$f */
    public static final class C21472f<T> implements C21470d<T> {
        @C0359n0

        /* renamed from: a */
        public final C21693a<T> f55393a;

        /* renamed from: b */
        public float f55394b = -1.0f;

        public C21472f(List<? extends C21693a<T>> list) {
            this.f55393a = (C21693a) list.get(0);
        }

        /* renamed from: a */
        public boolean mo64071a(float f) {
            if (this.f55394b == f) {
                return true;
            }
            this.f55394b = f;
            return false;
        }

        /* renamed from: b */
        public C21693a<T> mo64072b() {
            return this.f55393a;
        }

        /* renamed from: c */
        public boolean mo64073c(float f) {
            return !this.f55393a.mo64728h();
        }

        /* renamed from: d */
        public float mo64074d() {
            return this.f55393a.mo64725e();
        }

        /* renamed from: e */
        public float mo64075e() {
            return this.f55393a.mo64722b();
        }

        public boolean isEmpty() {
            return false;
        }
    }

    public C21466a(List<? extends C21693a<K>> list) {
        this.f55383c = m98924o(list);
    }

    /* renamed from: o */
    public static <T> C21470d<T> m98924o(List<? extends C21693a<T>> list) {
        if (list.isEmpty()) {
            return new C21469c();
        }
        if (list.size() == 1) {
            return new C21472f(list);
        }
        return new C21471e(list);
    }

    /* renamed from: a */
    public void mo64057a(C21468b bVar) {
        this.f55381a.add(bVar);
    }

    /* renamed from: b */
    public C21693a<K> mo64058b() {
        C21492e.m99017a("BaseKeyframeAnimation#getCurrentKeyframe");
        C21693a<K> b = this.f55383c.mo64072b();
        C21492e.m99018b("BaseKeyframeAnimation#getCurrentKeyframe");
        return b;
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: c */
    public float mo64059c() {
        if (this.f55388h == -1.0f) {
            this.f55388h = this.f55383c.mo64075e();
        }
        return this.f55388h;
    }

    /* renamed from: d */
    public float mo64060d() {
        C21693a b = mo64058b();
        if (b.mo64728h()) {
            return 0.0f;
        }
        return b.f56097d.getInterpolation(mo64061e());
    }

    /* renamed from: e */
    public float mo64061e() {
        if (this.f55382b) {
            return 0.0f;
        }
        C21693a b = mo64058b();
        if (b.mo64728h()) {
            return 0.0f;
        }
        return (this.f55384d - b.mo64725e()) / (b.mo64722b() - b.mo64725e());
    }

    /* renamed from: f */
    public float mo64062f() {
        return this.f55384d;
    }

    @C0379x(from = 0.0d, mo1016to = 1.0d)
    /* renamed from: g */
    public final float mo64063g() {
        if (this.f55387g == -1.0f) {
            this.f55387g = this.f55383c.mo64074d();
        }
        return this.f55387g;
    }

    /* renamed from: h */
    public A mo64064h() {
        A a;
        float e = mo64061e();
        if (this.f55385e == null && this.f55383c.mo64071a(e)) {
            return this.f55386f;
        }
        C21693a b = mo64058b();
        Interpolator interpolator = b.f56098e;
        if (interpolator == null || b.f56099f == null) {
            a = mo64065i(b, mo64060d());
        } else {
            a = mo64066j(b, e, interpolator.getInterpolation(e), b.f56099f.getInterpolation(e));
        }
        this.f55386f = a;
        return a;
    }

    /* renamed from: i */
    public abstract A mo64065i(C21693a<K> aVar, float f);

    /* renamed from: j */
    public A mo64066j(C21693a<K> aVar, float f, float f2, float f3) {
        throw new UnsupportedOperationException("This animation does not support split dimensions!");
    }

    /* renamed from: k */
    public void mo64067k() {
        for (int i = 0; i < this.f55381a.size(); i++) {
            this.f55381a.get(i).mo64019a();
        }
    }

    /* renamed from: l */
    public void mo64068l() {
        this.f55382b = true;
    }

    /* renamed from: m */
    public void mo64069m(@C0379x(from = 0.0d, mo1016to = 1.0d) float f) {
        if (!this.f55383c.isEmpty()) {
            if (f < mo64063g()) {
                f = mo64063g();
            } else if (f > mo64059c()) {
                f = mo64059c();
            }
            if (f != this.f55384d) {
                this.f55384d = f;
                if (this.f55383c.mo64073c(f)) {
                    mo64067k();
                }
            }
        }
    }

    /* renamed from: n */
    public void mo64070n(@C0363p0 C21702j<A> jVar) {
        C21702j<A> jVar2 = this.f55385e;
        if (jVar2 != null) {
            jVar2.mo64749c((C21466a<?, ?>) null);
        }
        this.f55385e = jVar;
        if (jVar != null) {
            jVar.mo64749c(this);
        }
    }
}
