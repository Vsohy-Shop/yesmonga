package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.collection.C1869c;
import androidx.collection.C1875h;
import androidx.core.util.C18001r;
import androidx.core.view.C18196h2;
import androidx.fragment.app.C19232h;
import androidx.fragment.app.C19234h0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C19470t;
import androidx.lifecycle.C19499w;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.gifdecoder.C22075f;

public abstract class FragmentStateAdapter extends RecyclerView.Adapter<C20805a> implements C20806b {

    /* renamed from: w */
    public static final String f53778w = "f#";

    /* renamed from: x */
    public static final String f53779x = "s#";

    /* renamed from: y */
    public static final long f53780y = 10000;

    /* renamed from: a */
    public final Lifecycle f53781a;

    /* renamed from: b */
    public final FragmentManager f53782b;

    /* renamed from: c */
    public final C1875h<Fragment> f53783c;

    /* renamed from: d */
    public final C1875h<Fragment.SavedState> f53784d;

    /* renamed from: e */
    public final C1875h<Integer> f53785e;

    /* renamed from: f */
    public FragmentMaxLifecycleEnforcer f53786f;

    /* renamed from: g */
    public boolean f53787g;

    /* renamed from: v */
    public boolean f53788v;

    public class FragmentMaxLifecycleEnforcer {

        /* renamed from: a */
        public ViewPager2.C20817j f53794a;

        /* renamed from: b */
        public RecyclerView.C20065i f53795b;

        /* renamed from: c */
        public C19470t f53796c;

        /* renamed from: d */
        public ViewPager2 f53797d;

        /* renamed from: e */
        public long f53798e = -1;

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a */
        public class C20799a extends ViewPager2.C20817j {
            public C20799a() {
            }

            /* renamed from: a */
            public void mo30665a(int i) {
                FragmentMaxLifecycleEnforcer.this.mo62441d(false);
            }

            /* renamed from: c */
            public void mo30667c(int i) {
                FragmentMaxLifecycleEnforcer.this.mo62441d(false);
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b */
        public class C20800b extends C20804d {
            public C20800b() {
                super((C20801a) null);
            }

            /* renamed from: a */
            public void mo30655a() {
                FragmentMaxLifecycleEnforcer.this.mo62441d(true);
            }
        }

        public FragmentMaxLifecycleEnforcer() {
        }

        @C0359n0
        /* renamed from: a */
        public final ViewPager2 mo62438a(@C0359n0 RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* renamed from: b */
        public void mo62439b(@C0359n0 RecyclerView recyclerView) {
            this.f53797d = mo62438a(recyclerView);
            C20799a aVar = new C20799a();
            this.f53794a = aVar;
            this.f53797d.mo62469n(aVar);
            C20800b bVar = new C20800b();
            this.f53795b = bVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(bVar);
            C207983 r2 = new C19470t() {
                /* renamed from: i */
                public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                    FragmentMaxLifecycleEnforcer.this.mo62441d(false);
                }
            };
            this.f53796c = r2;
            FragmentStateAdapter.this.f53781a.mo57464a(r2);
        }

        /* renamed from: c */
        public void mo62440c(@C0359n0 RecyclerView recyclerView) {
            mo62438a(recyclerView).mo62493w(this.f53794a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f53795b);
            FragmentStateAdapter.this.f53781a.mo57467d(this.f53796c);
            this.f53797d = null;
        }

        /* renamed from: d */
        public void mo62441d(boolean z) {
            int currentItem;
            Fragment k;
            boolean z2;
            if (!FragmentStateAdapter.this.mo62422D() && this.f53797d.getScrollState() == 0 && !FragmentStateAdapter.this.f53783c.mo6227o() && FragmentStateAdapter.this.getItemCount() != 0 && (currentItem = this.f53797d.getCurrentItem()) < FragmentStateAdapter.this.getItemCount()) {
                long itemId = FragmentStateAdapter.this.getItemId(currentItem);
                if ((itemId != this.f53798e || z) && (k = FragmentStateAdapter.this.f53783c.mo6223k(itemId)) != null && k.isAdded()) {
                    this.f53798e = itemId;
                    C19234h0 u = FragmentStateAdapter.this.f53782b.mo56909u();
                    Fragment fragment = null;
                    for (int i = 0; i < FragmentStateAdapter.this.f53783c.mo6213F(); i++) {
                        long s = FragmentStateAdapter.this.f53783c.mo6228s(i);
                        Fragment G = FragmentStateAdapter.this.f53783c.mo6214G(i);
                        if (G.isAdded()) {
                            if (s != this.f53798e) {
                                u.mo57039O(G, Lifecycle.State.STARTED);
                            } else {
                                fragment = G;
                            }
                            if (s == this.f53798e) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            G.setMenuVisibility(z2);
                        }
                    }
                    if (fragment != null) {
                        u.mo57039O(fragment, Lifecycle.State.RESUMED);
                    }
                    if (!u.mo57037A()) {
                        u.mo57054s();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    public class C20801a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        public final /* synthetic */ FrameLayout f53803a;

        /* renamed from: b */
        public final /* synthetic */ C20805a f53804b;

        public C20801a(FrameLayout frameLayout, C20805a aVar) {
            this.f53803a = frameLayout;
            this.f53804b = aVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f53803a.getParent() != null) {
                this.f53803a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.mo62437z(this.f53804b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    public class C20802b extends FragmentManager.C19180m {

        /* renamed from: a */
        public final /* synthetic */ Fragment f53806a;

        /* renamed from: b */
        public final /* synthetic */ FrameLayout f53807b;

        public C20802b(Fragment fragment, FrameLayout frameLayout) {
            this.f53806a = fragment;
            this.f53807b = frameLayout;
        }

        /* renamed from: q */
        public void mo56956q(@C0359n0 FragmentManager fragmentManager, @C0359n0 Fragment fragment, @C0359n0 View view, @C0363p0 Bundle bundle) {
            if (fragment == this.f53806a) {
                fragmentManager.mo56875f2(this);
                FragmentStateAdapter.this.mo62425k(view, this.f53807b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    public class C20803c implements Runnable {
        public C20803c() {
        }

        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f53787g = false;
            fragmentStateAdapter.mo62429p();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    public static abstract class C20804d extends RecyclerView.C20065i {
        public C20804d() {
        }

        /* renamed from: a */
        public abstract void mo30655a();

        /* renamed from: b */
        public final void mo30656b(int i, int i2) {
            mo30655a();
        }

        /* renamed from: c */
        public final void mo30657c(int i, int i2, @C0363p0 Object obj) {
            mo30655a();
        }

        /* renamed from: d */
        public final void mo30658d(int i, int i2) {
            mo30655a();
        }

        /* renamed from: e */
        public final void mo30659e(int i, int i2, int i3) {
            mo30655a();
        }

        /* renamed from: f */
        public final void mo30660f(int i, int i2) {
            mo30655a();
        }

        public /* synthetic */ C20804d(C20801a aVar) {
            this();
        }
    }

    public FragmentStateAdapter(@C0359n0 C19232h hVar) {
        this(hVar.mo57175g0(), hVar.getLifecycle());
    }

    @C0359n0
    /* renamed from: n */
    public static String m96561n(@C0359n0 String str, long j) {
        return str + j;
    }

    /* renamed from: r */
    public static boolean m96562r(@C0359n0 String str, @C0359n0 String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* renamed from: y */
    public static long m96563y(@C0359n0 String str, @C0359n0 String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* renamed from: A */
    public final void mo62419A(long j) {
        ViewParent parent;
        Fragment k = this.f53783c.mo6223k(j);
        if (k != null) {
            if (!(k.getView() == null || (parent = k.getView().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!mo62426l(j)) {
                this.f53784d.mo6233x(j);
            }
            if (!k.isAdded()) {
                this.f53783c.mo6233x(j);
            } else if (mo62422D()) {
                this.f53788v = true;
            } else {
                if (k.isAdded() && mo62426l(j)) {
                    this.f53784d.mo6229t(j, this.f53782b.mo56839T1(k));
                }
                this.f53782b.mo56909u().mo57038B(k).mo57054s();
                this.f53783c.mo6233x(j);
            }
        }
    }

    /* renamed from: B */
    public final void mo62420B() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final C20803c cVar = new C20803c();
        this.f53781a.mo57464a(new C19470t() {
            /* renamed from: i */
            public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                if (event == Lifecycle.C19372Event.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    wVar.getLifecycle().mo57467d(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000);
    }

    /* renamed from: C */
    public final void mo62421C(Fragment fragment, @C0359n0 FrameLayout frameLayout) {
        this.f53782b.mo56787B1(new C20802b(fragment, frameLayout), false);
    }

    /* renamed from: D */
    public boolean mo62422D() {
        return this.f53782b.mo56871d1();
    }

    @C0359n0
    /* renamed from: c */
    public final Parcelable mo62423c() {
        Bundle bundle = new Bundle(this.f53783c.mo6213F() + this.f53784d.mo6213F());
        for (int i = 0; i < this.f53783c.mo6213F(); i++) {
            long s = this.f53783c.mo6228s(i);
            Fragment k = this.f53783c.mo6223k(s);
            if (k != null && k.isAdded()) {
                this.f53782b.mo56784A1(bundle, m96561n(f53778w, s), k);
            }
        }
        for (int i2 = 0; i2 < this.f53784d.mo6213F(); i2++) {
            long s2 = this.f53784d.mo6228s(i2);
            if (mo62426l(s2)) {
                bundle.putParcelable(m96561n(f53779x, s2), this.f53784d.mo6223k(s2));
            }
        }
        return bundle;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    /* renamed from: i */
    public final void mo62424i(@C0359n0 Parcelable parcelable) {
        if (!this.f53784d.mo6227o() || !this.f53783c.mo6227o()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String next : bundle.keySet()) {
            if (m96562r(next, f53778w)) {
                this.f53783c.mo6229t(m96563y(next, f53778w), this.f53782b.mo56795E0(bundle, next));
            } else if (m96562r(next, f53779x)) {
                long y = m96563y(next, f53779x);
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(next);
                if (mo62426l(y)) {
                    this.f53784d.mo6229t(y, savedState);
                }
            } else {
                throw new IllegalArgumentException("Unexpected key in savedState: " + next);
            }
        }
        if (!this.f53783c.mo6227o()) {
            this.f53788v = true;
            this.f53787g = true;
            mo62429p();
            mo62420B();
        }
    }

    /* renamed from: k */
    public void mo62425k(@C0359n0 View view, @C0359n0 FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    /* renamed from: l */
    public boolean mo62426l(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    @C0359n0
    /* renamed from: m */
    public abstract Fragment mo62427m(int i);

    /* renamed from: o */
    public final void mo62428o(int i) {
        long itemId = getItemId(i);
        if (!this.f53783c.mo6219f(itemId)) {
            Fragment m = mo62427m(i);
            m.setInitialSavedState(this.f53784d.mo6223k(itemId));
            this.f53783c.mo6229t(itemId, m);
        }
    }

    @C0346i
    public void onAttachedToRecyclerView(@C0359n0 RecyclerView recyclerView) {
        boolean z;
        if (this.f53786f == null) {
            z = true;
        } else {
            z = false;
        }
        C18001r.m81764a(z);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f53786f = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.mo62439b(recyclerView);
    }

    @C0346i
    public void onDetachedFromRecyclerView(@C0359n0 RecyclerView recyclerView) {
        this.f53786f.mo62440c(recyclerView);
        this.f53786f = null;
    }

    /* renamed from: p */
    public void mo62429p() {
        if (this.f53788v && !mo62422D()) {
            C1869c<Long> cVar = new C1869c<>();
            for (int i = 0; i < this.f53783c.mo6213F(); i++) {
                long s = this.f53783c.mo6228s(i);
                if (!mo62426l(s)) {
                    cVar.add(Long.valueOf(s));
                    this.f53785e.mo6233x(s);
                }
            }
            if (!this.f53787g) {
                this.f53788v = false;
                for (int i2 = 0; i2 < this.f53783c.mo6213F(); i2++) {
                    long s2 = this.f53783c.mo6228s(i2);
                    if (!mo62430q(s2)) {
                        cVar.add(Long.valueOf(s2));
                    }
                }
            }
            for (Long longValue : cVar) {
                mo62419A(longValue.longValue());
            }
        }
    }

    /* renamed from: q */
    public final boolean mo62430q(long j) {
        View view;
        if (this.f53785e.mo6219f(j)) {
            return true;
        }
        Fragment k = this.f53783c.mo6223k(j);
        if (k == null || (view = k.getView()) == null) {
            return false;
        }
        if (view.getParent() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: s */
    public final Long mo62431s(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f53785e.mo6213F(); i2++) {
            if (this.f53785e.mo6214G(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f53785e.mo6228s(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* renamed from: t */
    public final void onBindViewHolder(@C0359n0 C20805a aVar, int i) {
        long itemId = aVar.getItemId();
        int id = aVar.mo62444d().getId();
        Long s = mo62431s(id);
        if (!(s == null || s.longValue() == itemId)) {
            mo62419A(s.longValue());
            this.f53785e.mo6233x(s.longValue());
        }
        this.f53785e.mo6229t(itemId, Integer.valueOf(id));
        mo62428o(i);
        FrameLayout d = aVar.mo62444d();
        if (C18196h2.m82521O0(d)) {
            if (d.getParent() == null) {
                d.addOnLayoutChangeListener(new C20801a(d, aVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        mo62429p();
    }

    @C0359n0
    /* renamed from: u */
    public final C20805a onCreateViewHolder(@C0359n0 ViewGroup viewGroup, int i) {
        return C20805a.m96600c(viewGroup);
    }

    /* renamed from: v */
    public final boolean onFailedToRecycleView(@C0359n0 C20805a aVar) {
        return true;
    }

    /* renamed from: w */
    public final void onViewAttachedToWindow(@C0359n0 C20805a aVar) {
        mo62437z(aVar);
        mo62429p();
    }

    /* renamed from: x */
    public final void onViewRecycled(@C0359n0 C20805a aVar) {
        Long s = mo62431s(aVar.mo62444d().getId());
        if (s != null) {
            mo62419A(s.longValue());
            this.f53785e.mo6233x(s.longValue());
        }
    }

    /* renamed from: z */
    public void mo62437z(@C0359n0 final C20805a aVar) {
        Fragment k = this.f53783c.mo6223k(aVar.getItemId());
        if (k != null) {
            FrameLayout d = aVar.mo62444d();
            View view = k.getView();
            if (!k.isAdded() && view != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (k.isAdded() && view == null) {
                mo62421C(k, d);
            } else if (!k.isAdded() || view.getParent() == null) {
                if (k.isAdded()) {
                    mo62425k(view, d);
                } else if (!mo62422D()) {
                    mo62421C(k, d);
                    C19234h0 u = this.f53782b.mo56909u();
                    u.mo57221k(k, C22075f.f56695A + aVar.getItemId()).mo57039O(k, Lifecycle.State.STARTED).mo57054s();
                    this.f53786f.mo62441d(false);
                } else if (!this.f53782b.mo56844V0()) {
                    this.f53781a.mo57464a(new C19470t() {
                        /* renamed from: i */
                        public void mo750i(@C0359n0 C19499w wVar, @C0359n0 Lifecycle.C19372Event event) {
                            if (!FragmentStateAdapter.this.mo62422D()) {
                                wVar.getLifecycle().mo57467d(this);
                                if (C18196h2.m82521O0(aVar.mo62444d())) {
                                    FragmentStateAdapter.this.mo62437z(aVar);
                                }
                            }
                        }
                    });
                }
            } else if (view.getParent() != d) {
                mo62425k(view, d);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public FragmentStateAdapter(@C0359n0 Fragment fragment) {
        this(fragment.getChildFragmentManager(), fragment.getLifecycle());
    }

    public FragmentStateAdapter(@C0359n0 FragmentManager fragmentManager, @C0359n0 Lifecycle lifecycle) {
        this.f53783c = new C1875h<>();
        this.f53784d = new C1875h<>();
        this.f53785e = new C1875h<>();
        this.f53787g = false;
        this.f53788v = false;
        this.f53782b = fragmentManager;
        this.f53781a = lifecycle;
        super.setHasStableIds(true);
    }
}
