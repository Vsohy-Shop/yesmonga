package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C18001r;
import androidx.recyclerview.widget.C20131g0;
import androidx.recyclerview.widget.C20180l0;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: androidx.recyclerview.widget.w */
public class C20219w {
    @C0359n0

    /* renamed from: a */
    public final C20180l0.C20185c f52198a;
    @C0359n0

    /* renamed from: b */
    public final C20131g0.C20138d f52199b;

    /* renamed from: c */
    public final RecyclerView.Adapter<RecyclerView.C20061e0> f52200c;

    /* renamed from: d */
    public final C20221b f52201d;

    /* renamed from: e */
    public int f52202e;

    /* renamed from: f */
    public RecyclerView.C20065i f52203f = new C20220a();

    /* renamed from: androidx.recyclerview.widget.w$a */
    public class C20220a extends RecyclerView.C20065i {
        public C20220a() {
        }

        /* renamed from: a */
        public void mo30655a() {
            C20219w wVar = C20219w.this;
            wVar.f52202e = wVar.f52200c.getItemCount();
            C20219w wVar2 = C20219w.this;
            wVar2.f52201d.mo60404f(wVar2);
        }

        /* renamed from: b */
        public void mo30656b(int i, int i2) {
            C20219w wVar = C20219w.this;
            wVar.f52201d.mo60399a(wVar, i, i2, (Object) null);
        }

        /* renamed from: c */
        public void mo30657c(int i, int i2, @C0363p0 Object obj) {
            C20219w wVar = C20219w.this;
            wVar.f52201d.mo60399a(wVar, i, i2, obj);
        }

        /* renamed from: d */
        public void mo30658d(int i, int i2) {
            C20219w wVar = C20219w.this;
            wVar.f52202e += i2;
            wVar.f52201d.mo60400b(wVar, i, i2);
            C20219w wVar2 = C20219w.this;
            if (wVar2.f52202e > 0 && wVar2.f52200c.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                C20219w wVar3 = C20219w.this;
                wVar3.f52201d.mo60402d(wVar3);
            }
        }

        /* renamed from: e */
        public void mo30659e(int i, int i2, int i3) {
            boolean z = true;
            if (i3 != 1) {
                z = false;
            }
            C18001r.m81765b(z, "moving more than 1 item is not supported in RecyclerView");
            C20219w wVar = C20219w.this;
            wVar.f52201d.mo60401c(wVar, i, i2);
        }

        /* renamed from: f */
        public void mo30660f(int i, int i2) {
            C20219w wVar = C20219w.this;
            wVar.f52202e -= i2;
            wVar.f52201d.mo60405g(wVar, i, i2);
            C20219w wVar2 = C20219w.this;
            if (wVar2.f52202e < 1 && wVar2.f52200c.getStateRestorationPolicy() == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY) {
                C20219w wVar3 = C20219w.this;
                wVar3.f52201d.mo60402d(wVar3);
            }
        }

        /* renamed from: g */
        public void mo59827g() {
            C20219w wVar = C20219w.this;
            wVar.f52201d.mo60402d(wVar);
        }
    }

    /* renamed from: androidx.recyclerview.widget.w$b */
    public interface C20221b {
        /* renamed from: a */
        void mo60399a(@C0359n0 C20219w wVar, int i, int i2, @C0363p0 Object obj);

        /* renamed from: b */
        void mo60400b(@C0359n0 C20219w wVar, int i, int i2);

        /* renamed from: c */
        void mo60401c(@C0359n0 C20219w wVar, int i, int i2);

        /* renamed from: d */
        void mo60402d(C20219w wVar);

        /* renamed from: e */
        void mo60403e(@C0359n0 C20219w wVar, int i, int i2);

        /* renamed from: f */
        void mo60404f(@C0359n0 C20219w wVar);

        /* renamed from: g */
        void mo60405g(@C0359n0 C20219w wVar, int i, int i2);
    }

    public C20219w(RecyclerView.Adapter<RecyclerView.C20061e0> adapter, C20221b bVar, C20180l0 l0Var, C20131g0.C20138d dVar) {
        this.f52200c = adapter;
        this.f52201d = bVar;
        this.f52198a = l0Var.mo60546b(this);
        this.f52199b = dVar;
        this.f52202e = adapter.getItemCount();
        adapter.registerAdapterDataObserver(this.f52203f);
    }

    /* renamed from: a */
    public void mo60683a() {
        this.f52200c.unregisterAdapterDataObserver(this.f52203f);
        this.f52198a.mo60551g();
    }

    /* renamed from: b */
    public int mo60684b() {
        return this.f52202e;
    }

    /* renamed from: c */
    public long mo60685c(int i) {
        return this.f52199b.mo60389a(this.f52200c.getItemId(i));
    }

    /* renamed from: d */
    public int mo60686d(int i) {
        return this.f52198a.mo60550b(this.f52200c.getItemViewType(i));
    }

    /* renamed from: e */
    public void mo60687e(RecyclerView.C20061e0 e0Var, int i) {
        this.f52200c.bindViewHolder(e0Var, i);
    }

    /* renamed from: f */
    public RecyclerView.C20061e0 mo60688f(ViewGroup viewGroup, int i) {
        return this.f52200c.onCreateViewHolder(viewGroup, this.f52198a.mo60549a(i));
    }
}
