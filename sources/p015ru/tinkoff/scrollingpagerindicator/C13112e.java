package p015ru.tinkoff.scrollingpagerindicator;

import android.database.DataSetObserver;
import androidx.annotation.C0359n0;
import androidx.viewpager.widget.C20784a;
import androidx.viewpager.widget.ViewPager;

/* renamed from: ru.tinkoff.scrollingpagerindicator.e */
public class C13112e extends C13100a<ViewPager> {

    /* renamed from: a */
    public DataSetObserver f32229a;

    /* renamed from: b */
    public ViewPager.C20779j f32230b;

    /* renamed from: c */
    public ViewPager f32231c;

    /* renamed from: d */
    public C20784a f32232d;

    /* renamed from: ru.tinkoff.scrollingpagerindicator.e$a */
    public class C13113a extends DataSetObserver {

        /* renamed from: a */
        public final /* synthetic */ ScrollingPagerIndicator f32233a;

        public C13113a(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f32233a = scrollingPagerIndicator;
        }

        public void onChanged() {
            this.f32233a.mo30626n();
        }

        public void onInvalidated() {
            onChanged();
        }
    }

    /* renamed from: ru.tinkoff.scrollingpagerindicator.e$b */
    public class C13114b implements ViewPager.C20779j {

        /* renamed from: a */
        public boolean f32235a = true;

        /* renamed from: b */
        public final /* synthetic */ ScrollingPagerIndicator f32236b;

        public C13114b(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f32236b = scrollingPagerIndicator;
        }

        /* renamed from: d */
        public void mo30672d(int i, float f, int i2) {
            C13112e.this.mo30643c(this.f32236b, i, f);
        }

        /* renamed from: e */
        public void mo30673e(int i) {
            this.f32235a = i == 0;
        }

        /* renamed from: f */
        public void mo30674f(int i) {
            if (this.f32235a) {
                C13112e.this.mo30669f(this.f32236b);
            }
        }
    }

    /* renamed from: a */
    public void mo30641a() {
        this.f32232d.mo62418u(this.f32229a);
        this.f32231c.mo62314O(this.f32230b);
    }

    /* renamed from: e */
    public void mo30642b(@C0359n0 ScrollingPagerIndicator scrollingPagerIndicator, @C0359n0 ViewPager viewPager) {
        C20784a adapter = viewPager.getAdapter();
        this.f32232d = adapter;
        if (adapter != null) {
            this.f32231c = viewPager;
            mo30669f(scrollingPagerIndicator);
            C13113a aVar = new C13113a(scrollingPagerIndicator);
            this.f32229a = aVar;
            this.f32232d.mo62414m(aVar);
            C13114b bVar = new C13114b(scrollingPagerIndicator);
            this.f32230b = bVar;
            viewPager.mo62329c(bVar);
            return;
        }
        throw new IllegalStateException("Set adapter before call attachToPager() method");
    }

    /* renamed from: f */
    public final void mo30669f(ScrollingPagerIndicator scrollingPagerIndicator) {
        scrollingPagerIndicator.setDotCount(this.f32232d.mo21373e());
        scrollingPagerIndicator.setCurrentPosition(this.f32231c.getCurrentItem());
    }
}
