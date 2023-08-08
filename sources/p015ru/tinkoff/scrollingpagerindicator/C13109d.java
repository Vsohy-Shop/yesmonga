package p015ru.tinkoff.scrollingpagerindicator;

import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: ru.tinkoff.scrollingpagerindicator.d */
public class C13109d extends C13100a<ViewPager2> {

    /* renamed from: a */
    public RecyclerView.C20065i f32220a;

    /* renamed from: b */
    public RecyclerView.Adapter f32221b;

    /* renamed from: c */
    public ViewPager2.C20817j f32222c;

    /* renamed from: d */
    public ViewPager2 f32223d;

    /* renamed from: ru.tinkoff.scrollingpagerindicator.d$a */
    public class C13110a extends RecyclerView.C20065i {

        /* renamed from: a */
        public final /* synthetic */ ScrollingPagerIndicator f32224a;

        public C13110a(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f32224a = scrollingPagerIndicator;
        }

        /* renamed from: a */
        public void mo30655a() {
            this.f32224a.mo30626n();
        }
    }

    /* renamed from: ru.tinkoff.scrollingpagerindicator.d$b */
    public class C13111b extends ViewPager2.C20817j {

        /* renamed from: a */
        public boolean f32226a = true;

        /* renamed from: b */
        public final /* synthetic */ ScrollingPagerIndicator f32227b;

        public C13111b(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f32227b = scrollingPagerIndicator;
        }

        /* renamed from: a */
        public void mo30665a(int i) {
            this.f32226a = i == 0;
        }

        /* renamed from: b */
        public void mo30666b(int i, float f, int i2) {
            C13109d.this.mo30643c(this.f32227b, i, f);
        }

        /* renamed from: c */
        public void mo30667c(int i) {
            if (this.f32226a) {
                C13109d.this.mo30664f(this.f32227b);
            }
        }
    }

    /* renamed from: a */
    public void mo30641a() {
        this.f32221b.unregisterAdapterDataObserver(this.f32220a);
        this.f32223d.mo62493w(this.f32222c);
    }

    /* renamed from: e */
    public void mo30642b(@C0359n0 ScrollingPagerIndicator scrollingPagerIndicator, @C0359n0 ViewPager2 viewPager2) {
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        this.f32221b = adapter;
        if (adapter != null) {
            this.f32223d = viewPager2;
            mo30664f(scrollingPagerIndicator);
            C13110a aVar = new C13110a(scrollingPagerIndicator);
            this.f32220a = aVar;
            this.f32221b.registerAdapterDataObserver(aVar);
            C13111b bVar = new C13111b(scrollingPagerIndicator);
            this.f32222c = bVar;
            viewPager2.mo62469n(bVar);
            return;
        }
        throw new IllegalStateException("Set adapter before call attachToPager() method");
    }

    /* renamed from: f */
    public final void mo30664f(ScrollingPagerIndicator scrollingPagerIndicator) {
        scrollingPagerIndicator.setDotCount(this.f32221b.getItemCount());
        scrollingPagerIndicator.setCurrentPosition(this.f32223d.getCurrentItem());
    }
}
