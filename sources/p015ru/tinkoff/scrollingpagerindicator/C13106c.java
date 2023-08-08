package p015ru.tinkoff.scrollingpagerindicator;

import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import p015ru.tinkoff.scrollingpagerindicator.ScrollingPagerIndicator;

/* renamed from: ru.tinkoff.scrollingpagerindicator.c */
public class C13106c implements ScrollingPagerIndicator.C13099c<RecyclerView> {

    /* renamed from: a */
    public ScrollingPagerIndicator f32206a;

    /* renamed from: b */
    public RecyclerView f32207b;

    /* renamed from: c */
    public LinearLayoutManager f32208c;

    /* renamed from: d */
    public RecyclerView.Adapter<?> f32209d;

    /* renamed from: e */
    public RecyclerView.C20085t f32210e;

    /* renamed from: f */
    public RecyclerView.C20065i f32211f;

    /* renamed from: g */
    public final boolean f32212g;

    /* renamed from: h */
    public final int f32213h;

    /* renamed from: i */
    public int f32214i;

    /* renamed from: j */
    public int f32215j;

    /* renamed from: ru.tinkoff.scrollingpagerindicator.c$a */
    public class C13107a extends RecyclerView.C20065i {

        /* renamed from: a */
        public final /* synthetic */ ScrollingPagerIndicator f32216a;

        public C13107a(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f32216a = scrollingPagerIndicator;
        }

        /* renamed from: a */
        public void mo30655a() {
            this.f32216a.setDotCount(C13106c.this.f32209d.getItemCount());
            C13106c.this.mo30654q();
        }

        /* renamed from: b */
        public void mo30656b(int i, int i2) {
            mo30655a();
        }

        /* renamed from: c */
        public void mo30657c(int i, int i2, Object obj) {
            mo30655a();
        }

        /* renamed from: d */
        public void mo30658d(int i, int i2) {
            mo30655a();
        }

        /* renamed from: e */
        public void mo30659e(int i, int i2, int i3) {
            mo30655a();
        }

        /* renamed from: f */
        public void mo30660f(int i, int i2) {
            mo30655a();
        }
    }

    /* renamed from: ru.tinkoff.scrollingpagerindicator.c$b */
    public class C13108b extends RecyclerView.C20085t {

        /* renamed from: a */
        public final /* synthetic */ ScrollingPagerIndicator f32218a;

        public C13108b(ScrollingPagerIndicator scrollingPagerIndicator) {
            this.f32218a = scrollingPagerIndicator;
        }

        /* renamed from: a */
        public void mo30661a(@C0359n0 RecyclerView recyclerView, int i) {
            int f;
            if (i == 0 && C13106c.this.mo30653p() && (f = C13106c.this.mo30645h()) != -1) {
                this.f32218a.setDotCount(C13106c.this.f32209d.getItemCount());
                if (f < C13106c.this.f32209d.getItemCount()) {
                    this.f32218a.setCurrentPosition(f);
                }
            }
        }

        /* renamed from: b */
        public void mo30662b(@C0359n0 RecyclerView recyclerView, int i, int i2) {
            C13106c.this.mo30654q();
        }
    }

    public C13106c() {
        this.f32213h = 0;
        this.f32212g = true;
    }

    /* renamed from: a */
    public void mo30641a() {
        this.f32209d.unregisterAdapterDataObserver(this.f32211f);
        this.f32207b.mo59656w1(this.f32210e);
        this.f32214i = 0;
    }

    /* renamed from: g */
    public void mo30642b(@C0359n0 ScrollingPagerIndicator scrollingPagerIndicator, @C0359n0 RecyclerView recyclerView) {
        if (!(recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
            throw new IllegalStateException("Only LinearLayoutManager is supported");
        } else if (recyclerView.getAdapter() != null) {
            this.f32208c = (LinearLayoutManager) recyclerView.getLayoutManager();
            this.f32207b = recyclerView;
            this.f32209d = recyclerView.getAdapter();
            this.f32206a = scrollingPagerIndicator;
            C13107a aVar = new C13107a(scrollingPagerIndicator);
            this.f32211f = aVar;
            this.f32209d.registerAdapterDataObserver(aVar);
            scrollingPagerIndicator.setDotCount(this.f32209d.getItemCount());
            mo30654q();
            C13108b bVar = new C13108b(scrollingPagerIndicator);
            this.f32210e = bVar;
            this.f32207b.mo59613r(bVar);
        } else {
            throw new IllegalStateException("RecyclerView has not Adapter attached");
        }
    }

    /* renamed from: h */
    public final int mo30645h() {
        RecyclerView.C20061e0 c0;
        for (int i = 0; i < this.f32207b.getChildCount(); i++) {
            View childAt = this.f32207b.getChildAt(i);
            float x = childAt.getX();
            int measuredWidth = childAt.getMeasuredWidth();
            float m = mo30650m();
            float n = mo30651n();
            if (this.f32208c.mo59379M2() == 1) {
                x = childAt.getY();
                measuredWidth = childAt.getMeasuredHeight();
                m = mo30652o();
                n = mo30649l();
            }
            if (x >= m && x + ((float) measuredWidth) <= n && (c0 = this.f32207b.mo59537c0(childAt)) != null && c0.getAdapterPosition() != -1) {
                return c0.getAdapterPosition();
            }
        }
        return -1;
    }

    @C0363p0
    /* renamed from: i */
    public final View mo30646i() {
        int i;
        int Y = this.f32208c.mo59922Y();
        View view = null;
        if (Y == 0) {
            return null;
        }
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < Y; i3++) {
            View X = this.f32208c.mo59919X(i3);
            if (this.f32208c.mo59379M2() == 0) {
                i = (int) X.getX();
                if (X.getMeasuredWidth() + i < i2) {
                    if (((float) (X.getMeasuredWidth() + i)) < mo30650m()) {
                    }
                }
            } else {
                i = (int) X.getY();
                if (X.getMeasuredHeight() + i < i2) {
                    if (((float) (X.getMeasuredHeight() + i)) < mo30649l()) {
                    }
                }
            }
            view = X;
            i2 = i;
        }
        return view;
    }

    /* renamed from: j */
    public final float mo30647j() {
        int i;
        if (this.f32215j == 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f32207b.getChildCount()) {
                    break;
                }
                View childAt = this.f32207b.getChildAt(i2);
                if (childAt.getMeasuredHeight() != 0) {
                    i = childAt.getMeasuredHeight();
                    this.f32215j = i;
                    break;
                }
                i2++;
            }
        }
        i = this.f32215j;
        return (float) i;
    }

    /* renamed from: k */
    public final float mo30648k() {
        int i;
        if (this.f32214i == 0) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f32207b.getChildCount()) {
                    break;
                }
                View childAt = this.f32207b.getChildAt(i2);
                if (childAt.getMeasuredWidth() != 0) {
                    i = childAt.getMeasuredWidth();
                    this.f32214i = i;
                    break;
                }
                i2++;
            }
        }
        i = this.f32214i;
        return (float) i;
    }

    /* renamed from: l */
    public final float mo30649l() {
        float f;
        float j;
        if (this.f32212g) {
            f = (((float) this.f32207b.getMeasuredHeight()) - mo30647j()) / 2.0f;
            j = mo30647j();
        } else {
            f = (float) this.f32213h;
            j = mo30647j();
        }
        return f + j;
    }

    /* renamed from: m */
    public final float mo30650m() {
        if (this.f32212g) {
            return (((float) this.f32207b.getMeasuredWidth()) - mo30648k()) / 2.0f;
        }
        return (float) this.f32213h;
    }

    /* renamed from: n */
    public final float mo30651n() {
        float f;
        float k;
        if (this.f32212g) {
            f = (((float) this.f32207b.getMeasuredWidth()) - mo30648k()) / 2.0f;
            k = mo30648k();
        } else {
            f = (float) this.f32213h;
            k = mo30648k();
        }
        return f + k;
    }

    /* renamed from: o */
    public final float mo30652o() {
        if (this.f32212g) {
            return (((float) this.f32207b.getMeasuredHeight()) - mo30647j()) / 2.0f;
        }
        return (float) this.f32213h;
    }

    /* renamed from: p */
    public final boolean mo30653p() {
        return mo30645h() != -1;
    }

    /* renamed from: q */
    public final void mo30654q() {
        int p0;
        float f;
        int i;
        View i2 = mo30646i();
        if (i2 != null && (p0 = this.f32207b.mo59608p0(i2)) != -1) {
            int itemCount = this.f32209d.getItemCount();
            if (p0 >= itemCount && itemCount != 0) {
                p0 %= itemCount;
            }
            if (this.f32208c.mo59379M2() == 0) {
                f = mo30650m() - i2.getX();
                i = i2.getMeasuredWidth();
            } else {
                f = mo30649l() - i2.getY();
                i = i2.getMeasuredHeight();
            }
            float f2 = f / ((float) i);
            if (f2 >= 0.0f && f2 <= 1.0f && p0 < itemCount) {
                this.f32206a.mo30625m(p0, f2);
            }
        }
    }

    public C13106c(int i) {
        this.f32213h = i;
        this.f32212g = false;
    }
}
