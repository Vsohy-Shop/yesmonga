package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;

/* renamed from: androidx.viewpager2.widget.g */
public final class C20835g extends RecyclerView.C20085t {

    /* renamed from: n */
    public static final int f53874n = 0;

    /* renamed from: o */
    public static final int f53875o = 1;

    /* renamed from: p */
    public static final int f53876p = 2;

    /* renamed from: q */
    public static final int f53877q = 3;

    /* renamed from: r */
    public static final int f53878r = 4;

    /* renamed from: s */
    public static final int f53879s = -1;

    /* renamed from: a */
    public ViewPager2.C20817j f53880a;
    @C0359n0

    /* renamed from: b */
    public final ViewPager2 f53881b;
    @C0359n0

    /* renamed from: c */
    public final RecyclerView f53882c;
    @C0359n0

    /* renamed from: d */
    public final LinearLayoutManager f53883d;

    /* renamed from: e */
    public int f53884e;

    /* renamed from: f */
    public int f53885f;

    /* renamed from: g */
    public C20836a f53886g = new C20836a();

    /* renamed from: h */
    public int f53887h;

    /* renamed from: i */
    public int f53888i;

    /* renamed from: j */
    public boolean f53889j;

    /* renamed from: k */
    public boolean f53890k;

    /* renamed from: l */
    public boolean f53891l;

    /* renamed from: m */
    public boolean f53892m;

    /* renamed from: androidx.viewpager2.widget.g$a */
    public static final class C20836a {

        /* renamed from: a */
        public int f53893a;

        /* renamed from: b */
        public float f53894b;

        /* renamed from: c */
        public int f53895c;

        /* renamed from: a */
        public void mo62566a() {
            this.f53893a = -1;
            this.f53894b = 0.0f;
            this.f53895c = 0;
        }
    }

    public C20835g(@C0359n0 ViewPager2 viewPager2) {
        this.f53881b = viewPager2;
        RecyclerView recyclerView = viewPager2.f53834x;
        this.f53882c = recyclerView;
        this.f53883d = (LinearLayoutManager) recyclerView.getLayoutManager();
        mo62562q();
    }

    /* renamed from: a */
    public void mo30661a(@C0359n0 RecyclerView recyclerView, int i) {
        boolean z = true;
        if (!(this.f53884e == 1 && this.f53885f == 1) && i == 1) {
            mo62564s(false);
        } else if (!mo62557l() || i != 2) {
            if (mo62557l() && i == 0) {
                mo62565t();
                if (!this.f53890k) {
                    int i2 = this.f53886g.f53893a;
                    if (i2 != -1) {
                        mo62548c(i2, 0.0f, 0);
                    }
                } else {
                    C20836a aVar = this.f53886g;
                    if (aVar.f53895c == 0) {
                        int i3 = this.f53887h;
                        int i4 = aVar.f53893a;
                        if (i3 != i4) {
                            mo62549d(i4);
                        }
                    } else {
                        z = false;
                    }
                }
                if (z) {
                    mo62550e(0);
                    mo62562q();
                }
            }
            if (this.f53884e == 2 && i == 0 && this.f53891l) {
                mo62565t();
                C20836a aVar2 = this.f53886g;
                if (aVar2.f53895c == 0) {
                    int i5 = this.f53888i;
                    int i6 = aVar2.f53893a;
                    if (i5 != i6) {
                        if (i6 == -1) {
                            i6 = 0;
                        }
                        mo62549d(i6);
                    }
                    mo62550e(0);
                    mo62562q();
                }
            }
        } else if (this.f53890k) {
            mo62550e(2);
            this.f53889j = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        if (r5 == r3.f53881b.mo62466k()) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0039  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo30662b(@androidx.annotation.C0359n0 androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f53890k = r4
            r3.mo62565t()
            boolean r0 = r3.f53889j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L_0x003d
            r3.f53889j = r2
            if (r6 > 0) goto L_0x0022
            if (r6 != 0) goto L_0x0020
            if (r5 >= 0) goto L_0x0016
            r5 = r4
            goto L_0x0017
        L_0x0016:
            r5 = r2
        L_0x0017:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f53881b
            boolean r6 = r6.mo62466k()
            if (r5 != r6) goto L_0x0020
            goto L_0x0022
        L_0x0020:
            r5 = r2
            goto L_0x0023
        L_0x0022:
            r5 = r4
        L_0x0023:
            if (r5 == 0) goto L_0x002f
            androidx.viewpager2.widget.g$a r5 = r3.f53886g
            int r6 = r5.f53895c
            if (r6 == 0) goto L_0x002f
            int r5 = r5.f53893a
            int r5 = r5 + r4
            goto L_0x0033
        L_0x002f:
            androidx.viewpager2.widget.g$a r5 = r3.f53886g
            int r5 = r5.f53893a
        L_0x0033:
            r3.f53888i = r5
            int r6 = r3.f53887h
            if (r6 == r5) goto L_0x004b
            r3.mo62549d(r5)
            goto L_0x004b
        L_0x003d:
            int r5 = r3.f53884e
            if (r5 != 0) goto L_0x004b
            androidx.viewpager2.widget.g$a r5 = r3.f53886g
            int r5 = r5.f53893a
            if (r5 != r1) goto L_0x0048
            r5 = r2
        L_0x0048:
            r3.mo62549d(r5)
        L_0x004b:
            androidx.viewpager2.widget.g$a r5 = r3.f53886g
            int r6 = r5.f53893a
            if (r6 != r1) goto L_0x0052
            r6 = r2
        L_0x0052:
            float r0 = r5.f53894b
            int r5 = r5.f53895c
            r3.mo62548c(r6, r0, r5)
            androidx.viewpager2.widget.g$a r5 = r3.f53886g
            int r6 = r5.f53893a
            int r0 = r3.f53888i
            if (r6 == r0) goto L_0x0063
            if (r0 != r1) goto L_0x0071
        L_0x0063:
            int r5 = r5.f53895c
            if (r5 != 0) goto L_0x0071
            int r5 = r3.f53885f
            if (r5 == r4) goto L_0x0071
            r3.mo62550e(r2)
            r3.mo62562q()
        L_0x0071:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.C20835g.mo30662b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    /* renamed from: c */
    public final void mo62548c(int i, float f, int i2) {
        ViewPager2.C20817j jVar = this.f53880a;
        if (jVar != null) {
            jVar.mo30666b(i, f, i2);
        }
    }

    /* renamed from: d */
    public final void mo62549d(int i) {
        ViewPager2.C20817j jVar = this.f53880a;
        if (jVar != null) {
            jVar.mo30667c(i);
        }
    }

    /* renamed from: e */
    public final void mo62550e(int i) {
        if ((this.f53884e != 3 || this.f53885f != 0) && this.f53885f != i) {
            this.f53885f = i;
            ViewPager2.C20817j jVar = this.f53880a;
            if (jVar != null) {
                jVar.mo30665a(i);
            }
        }
    }

    /* renamed from: f */
    public final int mo62551f() {
        return this.f53883d.mo59434x2();
    }

    /* renamed from: g */
    public double mo62552g() {
        mo62565t();
        C20836a aVar = this.f53886g;
        return ((double) aVar.f53893a) + ((double) aVar.f53894b);
    }

    /* renamed from: h */
    public int mo62553h() {
        return this.f53885f;
    }

    /* renamed from: i */
    public boolean mo62554i() {
        return this.f53885f == 1;
    }

    /* renamed from: j */
    public boolean mo62555j() {
        return this.f53892m;
    }

    /* renamed from: k */
    public boolean mo62556k() {
        return this.f53885f == 0;
    }

    /* renamed from: l */
    public final boolean mo62557l() {
        int i = this.f53884e;
        return i == 1 || i == 4;
    }

    /* renamed from: m */
    public void mo62558m() {
        this.f53884e = 4;
        mo62564s(true);
    }

    /* renamed from: n */
    public void mo62559n() {
        this.f53891l = true;
    }

    /* renamed from: o */
    public void mo62560o() {
        if (!mo62554i() || this.f53892m) {
            this.f53892m = false;
            mo62565t();
            C20836a aVar = this.f53886g;
            if (aVar.f53895c == 0) {
                int i = aVar.f53893a;
                if (i != this.f53887h) {
                    mo62549d(i);
                }
                mo62550e(0);
                mo62562q();
                return;
            }
            mo62550e(2);
        }
    }

    /* renamed from: p */
    public void mo62561p(int i, boolean z) {
        int i2;
        if (z) {
            i2 = 2;
        } else {
            i2 = 3;
        }
        this.f53884e = i2;
        boolean z2 = false;
        this.f53892m = false;
        if (this.f53888i != i) {
            z2 = true;
        }
        this.f53888i = i;
        mo62550e(2);
        if (z2) {
            mo62549d(i);
        }
    }

    /* renamed from: q */
    public final void mo62562q() {
        this.f53884e = 0;
        this.f53885f = 0;
        this.f53886g.mo62566a();
        this.f53887h = -1;
        this.f53888i = -1;
        this.f53889j = false;
        this.f53890k = false;
        this.f53892m = false;
        this.f53891l = false;
    }

    /* renamed from: r */
    public void mo62563r(ViewPager2.C20817j jVar) {
        this.f53880a = jVar;
    }

    /* renamed from: s */
    public final void mo62564s(boolean z) {
        int i;
        this.f53892m = z;
        if (z) {
            i = 4;
        } else {
            i = 1;
        }
        this.f53884e = i;
        int i2 = this.f53888i;
        if (i2 != -1) {
            this.f53887h = i2;
            this.f53888i = -1;
        } else if (this.f53887h == -1) {
            this.f53887h = mo62551f();
        }
        mo62550e(1);
    }

    /* renamed from: t */
    public final void mo62565t() {
        boolean z;
        int i;
        float f;
        C20836a aVar = this.f53886g;
        int x2 = this.f53883d.mo59434x2();
        aVar.f53893a = x2;
        if (x2 == -1) {
            aVar.mo62566a();
            return;
        }
        View R = this.f53883d.mo59384R(x2);
        if (R == null) {
            aVar.mo62566a();
            return;
        }
        int r0 = this.f53883d.mo59968r0(R);
        int w0 = this.f53883d.mo59980w0(R);
        int z0 = this.f53883d.mo59984z0(R);
        int W = this.f53883d.mo59916W(R);
        ViewGroup.LayoutParams layoutParams = R.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            r0 += marginLayoutParams.leftMargin;
            w0 += marginLayoutParams.rightMargin;
            z0 += marginLayoutParams.topMargin;
            W += marginLayoutParams.bottomMargin;
        }
        int height = R.getHeight() + z0 + W;
        int width = R.getWidth() + r0 + w0;
        if (this.f53883d.mo59379M2() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i = (R.getLeft() - r0) - this.f53882c.getPaddingLeft();
            if (this.f53881b.mo62466k()) {
                i = -i;
            }
            height = width;
        } else {
            i = (R.getTop() - z0) - this.f53882c.getPaddingTop();
        }
        int i2 = -i;
        aVar.f53895c = i2;
        if (i2 >= 0) {
            if (height == 0) {
                f = 0.0f;
            } else {
                f = ((float) i2) / ((float) height);
            }
            aVar.f53894b = f;
        } else if (new C20828a(this.f53883d).mo62531d()) {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        } else {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f53895c)}));
        }
    }
}
