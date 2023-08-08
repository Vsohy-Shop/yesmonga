package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class ConcatAdapter extends RecyclerView.Adapter<RecyclerView.C20061e0> {

    /* renamed from: b */
    public static final String f51298b = "ConcatAdapter";

    /* renamed from: a */
    public final C20139h f51299a;

    public static final class Config {
        @C0359n0

        /* renamed from: c */
        public static final Config f51300c = new Config(true, StableIdMode.NO_STABLE_IDS);

        /* renamed from: a */
        public final boolean f51301a;
        @C0359n0

        /* renamed from: b */
        public final StableIdMode f51302b;

        public enum StableIdMode {
            NO_STABLE_IDS,
            ISOLATED_STABLE_IDS,
            SHARED_STABLE_IDS
        }

        /* renamed from: androidx.recyclerview.widget.ConcatAdapter$Config$a */
        public static final class C20041a {

            /* renamed from: a */
            public boolean f51307a;

            /* renamed from: b */
            public StableIdMode f51308b;

            public C20041a() {
                Config config = Config.f51300c;
                this.f51307a = config.f51301a;
                this.f51308b = config.f51302b;
            }

            @C0359n0
            /* renamed from: a */
            public Config mo59298a() {
                return new Config(this.f51307a, this.f51308b);
            }

            @C0359n0
            /* renamed from: b */
            public C20041a mo59299b(boolean z) {
                this.f51307a = z;
                return this;
            }

            @C0359n0
            /* renamed from: c */
            public C20041a mo59300c(@C0359n0 StableIdMode stableIdMode) {
                this.f51308b = stableIdMode;
                return this;
            }
        }

        public Config(boolean z, @C0359n0 StableIdMode stableIdMode) {
            this.f51301a = z;
            this.f51302b = stableIdMode;
        }
    }

    @SafeVarargs
    public ConcatAdapter(@C0359n0 RecyclerView.Adapter<? extends RecyclerView.C20061e0>... adapterArr) {
        this(Config.f51300c, adapterArr);
    }

    public int findRelativeAdapterPositionIn(@C0359n0 RecyclerView.Adapter<? extends RecyclerView.C20061e0> adapter, @C0359n0 RecyclerView.C20061e0 e0Var, int i) {
        return this.f51299a.mo60418t(adapter, e0Var, i);
    }

    public int getItemCount() {
        return this.f51299a.mo60419u();
    }

    public long getItemId(int i) {
        return this.f51299a.mo60416r(i);
    }

    public int getItemViewType(int i) {
        return this.f51299a.mo60417s(i);
    }

    /* renamed from: k */
    public boolean mo59285k(int i, @C0359n0 RecyclerView.Adapter<? extends RecyclerView.C20061e0> adapter) {
        return this.f51299a.mo60406h(i, adapter);
    }

    /* renamed from: l */
    public boolean mo59286l(@C0359n0 RecyclerView.Adapter<? extends RecyclerView.C20061e0> adapter) {
        return this.f51299a.mo60407i(adapter);
    }

    @C0359n0
    /* renamed from: m */
    public List<? extends RecyclerView.Adapter<? extends RecyclerView.C20061e0>> mo59287m() {
        return Collections.unmodifiableList(this.f51299a.mo60415q());
    }

    /* renamed from: n */
    public void mo59288n(@C0359n0 RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        super.setStateRestorationPolicy(stateRestorationPolicy);
    }

    /* renamed from: o */
    public boolean mo59289o(@C0359n0 RecyclerView.Adapter<? extends RecyclerView.C20061e0> adapter) {
        return this.f51299a.mo60398I(adapter);
    }

    public void onAttachedToRecyclerView(@C0359n0 RecyclerView recyclerView) {
        this.f51299a.mo60424z(recyclerView);
    }

    public void onBindViewHolder(@C0359n0 RecyclerView.C20061e0 e0Var, int i) {
        this.f51299a.mo60390A(e0Var, i);
    }

    @C0359n0
    public RecyclerView.C20061e0 onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
        return this.f51299a.mo60391B(viewGroup, i);
    }

    public void onDetachedFromRecyclerView(@C0359n0 RecyclerView recyclerView) {
        this.f51299a.mo60392C(recyclerView);
    }

    public boolean onFailedToRecycleView(@C0359n0 RecyclerView.C20061e0 e0Var) {
        return this.f51299a.mo60393D(e0Var);
    }

    public void onViewAttachedToWindow(@C0359n0 RecyclerView.C20061e0 e0Var) {
        this.f51299a.mo60394E(e0Var);
    }

    public void onViewDetachedFromWindow(@C0359n0 RecyclerView.C20061e0 e0Var) {
        this.f51299a.mo60395F(e0Var);
    }

    public void onViewRecycled(@C0359n0 RecyclerView.C20061e0 e0Var) {
        this.f51299a.mo60396G(e0Var);
    }

    public void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    public void setStateRestorationPolicy(@C0359n0 RecyclerView.Adapter.StateRestorationPolicy stateRestorationPolicy) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    @SafeVarargs
    public ConcatAdapter(@C0359n0 Config config, @C0359n0 RecyclerView.Adapter<? extends RecyclerView.C20061e0>... adapterArr) {
        this(config, (List<? extends RecyclerView.Adapter<? extends RecyclerView.C20061e0>>) Arrays.asList(adapterArr));
    }

    public ConcatAdapter(@C0359n0 List<? extends RecyclerView.Adapter<? extends RecyclerView.C20061e0>> list) {
        this(Config.f51300c, list);
    }

    public ConcatAdapter(@C0359n0 Config config, @C0359n0 List<? extends RecyclerView.Adapter<? extends RecyclerView.C20061e0>> list) {
        this.f51299a = new C20139h(this, config);
        for (RecyclerView.Adapter l : list) {
            mo59286l(l);
        }
        super.setHasStableIds(this.f51299a.mo60421w());
    }
}
