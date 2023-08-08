package androidx.lifecycle;

import androidx.annotation.C0346i;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.arch.core.internal.C0836b;
import java.util.Iterator;
import java.util.Map;

/* renamed from: androidx.lifecycle.e0 */
public class C19406e0<T> extends C19423g0<T> {

    /* renamed from: m */
    public C0836b<LiveData<?>, C19407a<?>> f49791m = new C0836b<>();

    /* renamed from: androidx.lifecycle.e0$a */
    public static class C19407a<V> implements C19426h0<V> {

        /* renamed from: a */
        public final LiveData<V> f49792a;

        /* renamed from: b */
        public final C19426h0<? super V> f49793b;

        /* renamed from: c */
        public int f49794c = -1;

        public C19407a(LiveData<V> liveData, C19426h0<? super V> h0Var) {
            this.f49792a = liveData;
            this.f49793b = h0Var;
        }

        /* renamed from: a */
        public void mo4590a(@C0363p0 V v) {
            if (this.f49794c != this.f49792a.mo57487g()) {
                this.f49794c = this.f49792a.mo57487g();
                this.f49793b.mo4590a(v);
            }
        }

        /* renamed from: b */
        public void mo57572b() {
            this.f49792a.mo57492l(this);
        }

        /* renamed from: c */
        public void mo57573c() {
            this.f49792a.mo57494p(this);
        }
    }

    public C19406e0() {
    }

    @C0346i
    /* renamed from: m */
    public void mo57444m() {
        Iterator<Map.Entry<LiveData<?>, C19407a<?>>> it = this.f49791m.iterator();
        while (it.hasNext()) {
            ((C19407a) it.next().getValue()).mo57572b();
        }
    }

    @C0346i
    /* renamed from: n */
    public void mo57445n() {
        Iterator<Map.Entry<LiveData<?>, C19407a<?>>> it = this.f49791m.iterator();
        while (it.hasNext()) {
            ((C19407a) it.next().getValue()).mo57573c();
        }
    }

    @C0353k0
    /* renamed from: s */
    public <S> void mo4611s(@C0359n0 LiveData<S> liveData, @C0359n0 C19426h0<? super S> h0Var) {
        if (liveData != null) {
            C19407a aVar = new C19407a(liveData, h0Var);
            C19407a r = this.f49791m.mo3803r(liveData, aVar);
            if (r != null && r.f49793b != h0Var) {
                throw new IllegalArgumentException("This source was already added with the different observer");
            } else if (r == null && mo57488h()) {
                aVar.mo57572b();
            }
        } else {
            throw new NullPointerException("source cannot be null");
        }
    }

    @C0353k0
    /* renamed from: t */
    public <S> void mo57571t(@C0359n0 LiveData<S> liveData) {
        C19407a w = this.f49791m.mo3804w(liveData);
        if (w != null) {
            w.mo57573c();
        }
    }

    public C19406e0(T t) {
        super(t);
    }
}
