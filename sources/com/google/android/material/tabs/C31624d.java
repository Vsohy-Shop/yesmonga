package com.google.android.material.tabs;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.tabs.d */
public final class C31624d {
    @C0359n0

    /* renamed from: a */
    public final TabLayout f76823a;
    @C0359n0

    /* renamed from: b */
    public final ViewPager2 f76824b;

    /* renamed from: c */
    public final boolean f76825c;

    /* renamed from: d */
    public final boolean f76826d;

    /* renamed from: e */
    public final C31626b f76827e;
    @C0363p0

    /* renamed from: f */
    public RecyclerView.Adapter<?> f76828f;

    /* renamed from: g */
    public boolean f76829g;
    @C0363p0

    /* renamed from: h */
    public C31627c f76830h;
    @C0363p0

    /* renamed from: i */
    public TabLayout.C31610f f76831i;
    @C0363p0

    /* renamed from: j */
    public RecyclerView.C20065i f76832j;

    /* renamed from: com.google.android.material.tabs.d$a */
    public class C31625a extends RecyclerView.C20065i {
        public C31625a() {
        }

        /* renamed from: a */
        public void mo30655a() {
            C31624d.this.mo91449d();
        }

        /* renamed from: b */
        public void mo30656b(int i, int i2) {
            C31624d.this.mo91449d();
        }

        /* renamed from: c */
        public void mo30657c(int i, int i2, @C0363p0 Object obj) {
            C31624d.this.mo91449d();
        }

        /* renamed from: d */
        public void mo30658d(int i, int i2) {
            C31624d.this.mo91449d();
        }

        /* renamed from: e */
        public void mo30659e(int i, int i2, int i3) {
            C31624d.this.mo91449d();
        }

        /* renamed from: f */
        public void mo30660f(int i, int i2) {
            C31624d.this.mo91449d();
        }
    }

    /* renamed from: com.google.android.material.tabs.d$b */
    public interface C31626b {
        /* renamed from: a */
        void mo67433a(@C0359n0 TabLayout.C31615i iVar, int i);
    }

    /* renamed from: com.google.android.material.tabs.d$c */
    public static class C31627c extends ViewPager2.C20817j {
        @C0359n0

        /* renamed from: a */
        public final WeakReference<TabLayout> f76834a;

        /* renamed from: b */
        public int f76835b;

        /* renamed from: c */
        public int f76836c;

        public C31627c(TabLayout tabLayout) {
            this.f76834a = new WeakReference<>(tabLayout);
            mo91450d();
        }

        /* renamed from: a */
        public void mo30665a(int i) {
            this.f76835b = this.f76836c;
            this.f76836c = i;
        }

        /* renamed from: b */
        public void mo30666b(int i, float f, int i2) {
            boolean z;
            TabLayout tabLayout = this.f76834a.get();
            if (tabLayout != null) {
                int i3 = this.f76836c;
                boolean z2 = false;
                if (i3 != 2 || this.f76835b == 1) {
                    z = true;
                } else {
                    z = false;
                }
                if (!(i3 == 2 && this.f76835b == 0)) {
                    z2 = true;
                }
                tabLayout.setScrollPosition(i, f, z, z2);
            }
        }

        /* renamed from: c */
        public void mo30667c(int i) {
            boolean z;
            TabLayout tabLayout = this.f76834a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f76836c;
                if (i2 == 0 || (i2 == 2 && this.f76835b == 0)) {
                    z = true;
                } else {
                    z = false;
                }
                tabLayout.mo91287O(tabLayout.mo91367z(i), z);
            }
        }

        /* renamed from: d */
        public void mo91450d() {
            this.f76836c = 0;
            this.f76835b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.d$d */
    public static class C31628d implements TabLayout.C31610f {

        /* renamed from: a */
        public final ViewPager2 f76837a;

        /* renamed from: b */
        public final boolean f76838b;

        public C31628d(ViewPager2 viewPager2, boolean z) {
            this.f76837a = viewPager2;
            this.f76838b = z;
        }

        /* renamed from: a */
        public void mo67964a(@C0359n0 TabLayout.C31615i iVar) {
            this.f76837a.setCurrentItem(iVar.mo91427k(), this.f76838b);
        }

        /* renamed from: b */
        public void mo67965b(TabLayout.C31615i iVar) {
        }

        /* renamed from: c */
        public void mo67966c(TabLayout.C31615i iVar) {
        }
    }

    public C31624d(@C0359n0 TabLayout tabLayout, @C0359n0 ViewPager2 viewPager2, @C0359n0 C31626b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    /* renamed from: a */
    public void mo91446a() {
        if (!this.f76829g) {
            RecyclerView.Adapter<?> adapter = this.f76824b.getAdapter();
            this.f76828f = adapter;
            if (adapter != null) {
                this.f76829g = true;
                C31627c cVar = new C31627c(this.f76823a);
                this.f76830h = cVar;
                this.f76824b.mo62469n(cVar);
                C31628d dVar = new C31628d(this.f76824b, this.f76826d);
                this.f76831i = dVar;
                this.f76823a.mo91298d(dVar);
                if (this.f76825c) {
                    C31625a aVar = new C31625a();
                    this.f76832j = aVar;
                    this.f76828f.registerAdapterDataObserver(aVar);
                }
                mo91449d();
                this.f76823a.setScrollPosition(this.f76824b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* renamed from: b */
    public void mo91447b() {
        RecyclerView.Adapter<?> adapter;
        if (this.f76825c && (adapter = this.f76828f) != null) {
            adapter.unregisterAdapterDataObserver(this.f76832j);
            this.f76832j = null;
        }
        this.f76823a.mo91282J(this.f76831i);
        this.f76824b.mo62493w(this.f76830h);
        this.f76831i = null;
        this.f76830h = null;
        this.f76828f = null;
        this.f76829g = false;
    }

    /* renamed from: c */
    public boolean mo91448c() {
        return this.f76829g;
    }

    /* renamed from: d */
    public void mo91449d() {
        int min;
        this.f76823a.mo91280H();
        RecyclerView.Adapter<?> adapter = this.f76828f;
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.C31615i E = this.f76823a.mo91277E();
                this.f76827e.mo67433a(E, i);
                this.f76823a.mo91314h(E, false);
            }
            if (itemCount > 0 && (min = Math.min(this.f76824b.getCurrentItem(), this.f76823a.getTabCount() - 1)) != this.f76823a.getSelectedTabPosition()) {
                TabLayout tabLayout = this.f76823a;
                tabLayout.mo91286N(tabLayout.mo91367z(min));
            }
        }
    }

    public C31624d(@C0359n0 TabLayout tabLayout, @C0359n0 ViewPager2 viewPager2, boolean z, @C0359n0 C31626b bVar) {
        this(tabLayout, viewPager2, z, true, bVar);
    }

    public C31624d(@C0359n0 TabLayout tabLayout, @C0359n0 ViewPager2 viewPager2, boolean z, boolean z2, @C0359n0 C31626b bVar) {
        this.f76823a = tabLayout;
        this.f76824b = viewPager2;
        this.f76825c = z;
        this.f76826d = z2;
        this.f76827e = bVar;
    }
}
