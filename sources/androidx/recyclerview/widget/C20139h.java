package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C18001r;
import androidx.recyclerview.widget.C20131g0;
import androidx.recyclerview.widget.C20180l0;
import androidx.recyclerview.widget.C20219w;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.h */
public class C20139h implements C20219w.C20221b {

    /* renamed from: a */
    public final ConcatAdapter f51819a;

    /* renamed from: b */
    public final C20180l0 f51820b;

    /* renamed from: c */
    public List<WeakReference<RecyclerView>> f51821c = new ArrayList();

    /* renamed from: d */
    public final IdentityHashMap<RecyclerView.C20061e0, C20219w> f51822d = new IdentityHashMap<>();

    /* renamed from: e */
    public List<C20219w> f51823e = new ArrayList();

    /* renamed from: f */
    public C20140a f51824f = new C20140a();
    @C0359n0

    /* renamed from: g */
    public final ConcatAdapter.Config.StableIdMode f51825g;

    /* renamed from: h */
    public final C20131g0 f51826h;

    /* renamed from: androidx.recyclerview.widget.h$a */
    public static class C20140a {

        /* renamed from: a */
        public C20219w f51827a;

        /* renamed from: b */
        public int f51828b;

        /* renamed from: c */
        public boolean f51829c;
    }

    public C20139h(ConcatAdapter concatAdapter, ConcatAdapter.Config config) {
        this.f51819a = concatAdapter;
        if (config.f51301a) {
            this.f51820b = new C20180l0.C20181a();
        } else {
            this.f51820b = new C20180l0.C20183b();
        }
        ConcatAdapter.Config.StableIdMode stableIdMode = config.f51302b;
        this.f51825g = stableIdMode;
        if (stableIdMode == ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS) {
            this.f51826h = new C20131g0.C20134b();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.ISOLATED_STABLE_IDS) {
            this.f51826h = new C20131g0.C20132a();
        } else if (stableIdMode == ConcatAdapter.Config.StableIdMode.SHARED_STABLE_IDS) {
            this.f51826h = new C20131g0.C20136c();
        } else {
            throw new IllegalArgumentException("unknown stable id mode");
        }
    }

    /* renamed from: A */
    public void mo60390A(RecyclerView.C20061e0 e0Var, int i) {
        C20140a n = mo60412n(i);
        this.f51822d.put(e0Var, n.f51827a);
        n.f51827a.mo60687e(e0Var, n.f51828b);
        mo60397H(n);
    }

    /* renamed from: B */
    public RecyclerView.C20061e0 mo60391B(ViewGroup viewGroup, int i) {
        return this.f51820b.mo60545a(i).mo60688f(viewGroup, i);
    }

    /* renamed from: C */
    public void mo60392C(RecyclerView recyclerView) {
        int size = this.f51821c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = this.f51821c.get(size);
            if (weakReference.get() == null) {
                this.f51821c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f51821c.remove(size);
                break;
            }
            size--;
        }
        for (C20219w wVar : this.f51823e) {
            wVar.f52200c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    /* renamed from: D */
    public boolean mo60393D(RecyclerView.C20061e0 e0Var) {
        C20219w wVar = this.f51822d.get(e0Var);
        if (wVar != null) {
            boolean onFailedToRecycleView = wVar.f52200c.onFailedToRecycleView(e0Var);
            this.f51822d.remove(e0Var);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + this);
    }

    /* renamed from: E */
    public void mo60394E(RecyclerView.C20061e0 e0Var) {
        mo60420v(e0Var).f52200c.onViewAttachedToWindow(e0Var);
    }

    /* renamed from: F */
    public void mo60395F(RecyclerView.C20061e0 e0Var) {
        mo60420v(e0Var).f52200c.onViewDetachedFromWindow(e0Var);
    }

    /* renamed from: G */
    public void mo60396G(RecyclerView.C20061e0 e0Var) {
        C20219w wVar = this.f51822d.get(e0Var);
        if (wVar != null) {
            wVar.f52200c.onViewRecycled(e0Var);
            this.f51822d.remove(e0Var);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + this);
    }

    /* renamed from: H */
    public final void mo60397H(C20140a aVar) {
        aVar.f51829c = false;
        aVar.f51827a = null;
        aVar.f51828b = -1;
        this.f51824f = aVar;
    }

    /* renamed from: I */
    public boolean mo60398I(RecyclerView.Adapter<RecyclerView.C20061e0> adapter) {
        int x = mo60422x(adapter);
        if (x == -1) {
            return false;
        }
        C20219w wVar = this.f51823e.get(x);
        int m = mo60411m(wVar);
        this.f51823e.remove(x);
        this.f51819a.notifyItemRangeRemoved(m, wVar.mo60684b());
        for (WeakReference<RecyclerView> weakReference : this.f51821c) {
            RecyclerView recyclerView = (RecyclerView) weakReference.get();
            if (recyclerView != null) {
                adapter.onDetachedFromRecyclerView(recyclerView);
            }
        }
        wVar.mo60683a();
        mo60408j();
        return true;
    }

    /* renamed from: a */
    public void mo60399a(@C0359n0 C20219w wVar, int i, int i2, @C0363p0 Object obj) {
        this.f51819a.notifyItemRangeChanged(i + mo60411m(wVar), i2, obj);
    }

    /* renamed from: b */
    public void mo60400b(@C0359n0 C20219w wVar, int i, int i2) {
        this.f51819a.notifyItemRangeInserted(i + mo60411m(wVar), i2);
    }

    /* renamed from: c */
    public void mo60401c(@C0359n0 C20219w wVar, int i, int i2) {
        int m = mo60411m(wVar);
        this.f51819a.notifyItemMoved(i + m, i2 + m);
    }

    /* renamed from: d */
    public void mo60402d(C20219w wVar) {
        mo60408j();
    }

    /* renamed from: e */
    public void mo60403e(@C0359n0 C20219w wVar, int i, int i2) {
        this.f51819a.notifyItemRangeChanged(i + mo60411m(wVar), i2);
    }

    /* renamed from: f */
    public void mo60404f(@C0359n0 C20219w wVar) {
        this.f51819a.notifyDataSetChanged();
        mo60408j();
    }

    /* renamed from: g */
    public void mo60405g(@C0359n0 C20219w wVar, int i, int i2) {
        this.f51819a.notifyItemRangeRemoved(i + mo60411m(wVar), i2);
    }

    /* renamed from: h */
    public boolean mo60406h(int i, RecyclerView.Adapter<RecyclerView.C20061e0> adapter) {
        if (i < 0 || i > this.f51823e.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f51823e.size() + ". Given:" + i);
        }
        if (mo60421w()) {
            C18001r.m81765b(adapter.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else {
            adapter.hasStableIds();
        }
        if (mo60413o(adapter) != null) {
            return false;
        }
        C20219w wVar = new C20219w(adapter, this, this.f51820b, this.f51826h.mo60387a());
        this.f51823e.add(i, wVar);
        for (WeakReference<RecyclerView> weakReference : this.f51821c) {
            RecyclerView recyclerView = (RecyclerView) weakReference.get();
            if (recyclerView != null) {
                adapter.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (wVar.mo60684b() > 0) {
            this.f51819a.notifyItemRangeInserted(mo60411m(wVar), wVar.mo60684b());
        }
        mo60408j();
        return true;
    }

    /* renamed from: i */
    public boolean mo60407i(RecyclerView.Adapter<RecyclerView.C20061e0> adapter) {
        return mo60406h(this.f51823e.size(), adapter);
    }

    /* renamed from: j */
    public final void mo60408j() {
        RecyclerView.Adapter.StateRestorationPolicy l = mo60410l();
        if (l != this.f51819a.getStateRestorationPolicy()) {
            this.f51819a.mo59288n(l);
        }
    }

    /* renamed from: k */
    public boolean mo60409k() {
        for (C20219w wVar : this.f51823e) {
            if (!wVar.f52200c.canRestoreState()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: l */
    public final RecyclerView.Adapter.StateRestorationPolicy mo60410l() {
        for (C20219w next : this.f51823e) {
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy = next.f52200c.getStateRestorationPolicy();
            RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy2 = RecyclerView.Adapter.StateRestorationPolicy.PREVENT;
            if (stateRestorationPolicy == stateRestorationPolicy2) {
                return stateRestorationPolicy2;
            }
            if (stateRestorationPolicy == RecyclerView.Adapter.StateRestorationPolicy.PREVENT_WHEN_EMPTY && next.mo60684b() == 0) {
                return stateRestorationPolicy2;
            }
        }
        return RecyclerView.Adapter.StateRestorationPolicy.ALLOW;
    }

    /* renamed from: m */
    public final int mo60411m(C20219w wVar) {
        C20219w next;
        Iterator<C20219w> it = this.f51823e.iterator();
        int i = 0;
        while (it.hasNext() && (next = it.next()) != wVar) {
            i += next.mo60684b();
        }
        return i;
    }

    @C0359n0
    /* renamed from: n */
    public final C20140a mo60412n(int i) {
        C20140a aVar = this.f51824f;
        if (aVar.f51829c) {
            aVar = new C20140a();
        } else {
            aVar.f51829c = true;
        }
        Iterator<C20219w> it = this.f51823e.iterator();
        int i2 = i;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C20219w next = it.next();
            if (next.mo60684b() > i2) {
                aVar.f51827a = next;
                aVar.f51828b = i2;
                break;
            }
            i2 -= next.mo60684b();
        }
        if (aVar.f51827a != null) {
            return aVar;
        }
        throw new IllegalArgumentException("Cannot find wrapper for " + i);
    }

    @C0363p0
    /* renamed from: o */
    public final C20219w mo60413o(RecyclerView.Adapter<RecyclerView.C20061e0> adapter) {
        int x = mo60422x(adapter);
        if (x == -1) {
            return null;
        }
        return this.f51823e.get(x);
    }

    @C0363p0
    /* renamed from: p */
    public RecyclerView.Adapter<? extends RecyclerView.C20061e0> mo60414p(RecyclerView.C20061e0 e0Var) {
        C20219w wVar = this.f51822d.get(e0Var);
        if (wVar == null) {
            return null;
        }
        return wVar.f52200c;
    }

    /* renamed from: q */
    public List<RecyclerView.Adapter<? extends RecyclerView.C20061e0>> mo60415q() {
        if (this.f51823e.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f51823e.size());
        for (C20219w wVar : this.f51823e) {
            arrayList.add(wVar.f52200c);
        }
        return arrayList;
    }

    /* renamed from: r */
    public long mo60416r(int i) {
        C20140a n = mo60412n(i);
        long c = n.f51827a.mo60685c(n.f51828b);
        mo60397H(n);
        return c;
    }

    /* renamed from: s */
    public int mo60417s(int i) {
        C20140a n = mo60412n(i);
        int d = n.f51827a.mo60686d(n.f51828b);
        mo60397H(n);
        return d;
    }

    /* renamed from: t */
    public int mo60418t(RecyclerView.Adapter<? extends RecyclerView.C20061e0> adapter, RecyclerView.C20061e0 e0Var, int i) {
        C20219w wVar = this.f51822d.get(e0Var);
        if (wVar == null) {
            return -1;
        }
        int m = i - mo60411m(wVar);
        int itemCount = wVar.f52200c.getItemCount();
        if (m >= 0 && m < itemCount) {
            return wVar.f52200c.findRelativeAdapterPositionIn(adapter, e0Var, m);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + m + " which is out of bounds for the adapter with size " + itemCount + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + e0Var + "adapter:" + adapter);
    }

    /* renamed from: u */
    public int mo60419u() {
        int i = 0;
        for (C20219w b : this.f51823e) {
            i += b.mo60684b();
        }
        return i;
    }

    @C0359n0
    /* renamed from: v */
    public final C20219w mo60420v(RecyclerView.C20061e0 e0Var) {
        C20219w wVar = this.f51822d.get(e0Var);
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + this);
    }

    /* renamed from: w */
    public boolean mo60421w() {
        return this.f51825g != ConcatAdapter.Config.StableIdMode.NO_STABLE_IDS;
    }

    /* renamed from: x */
    public final int mo60422x(RecyclerView.Adapter<RecyclerView.C20061e0> adapter) {
        int size = this.f51823e.size();
        for (int i = 0; i < size; i++) {
            if (this.f51823e.get(i).f52200c == adapter) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: y */
    public final boolean mo60423y(RecyclerView recyclerView) {
        for (WeakReference<RecyclerView> weakReference : this.f51821c) {
            if (weakReference.get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: z */
    public void mo60424z(RecyclerView recyclerView) {
        if (!mo60423y(recyclerView)) {
            this.f51821c.add(new WeakReference(recyclerView));
            for (C20219w wVar : this.f51823e) {
                wVar.f52200c.onAttachedToRecyclerView(recyclerView);
            }
        }
    }
}
