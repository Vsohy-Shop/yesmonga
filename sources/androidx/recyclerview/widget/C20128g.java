package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.recyclerview.widget.g */
public class C20128g {

    /* renamed from: d */
    public static final boolean f51803d = false;

    /* renamed from: e */
    public static final String f51804e = "ChildrenHelper";

    /* renamed from: a */
    public final C20130b f51805a;

    /* renamed from: b */
    public final C20129a f51806b = new C20129a();

    /* renamed from: c */
    public final List<View> f51807c = new ArrayList();

    /* renamed from: androidx.recyclerview.widget.g$a */
    public static class C20129a {

        /* renamed from: c */
        public static final int f51808c = 64;

        /* renamed from: d */
        public static final long f51809d = Long.MIN_VALUE;

        /* renamed from: a */
        public long f51810a = 0;

        /* renamed from: b */
        public C20129a f51811b;

        /* renamed from: a */
        public void mo60378a(int i) {
            if (i >= 64) {
                C20129a aVar = this.f51811b;
                if (aVar != null) {
                    aVar.mo60378a(i - 64);
                    return;
                }
                return;
            }
            this.f51810a &= ~(1 << i);
        }

        /* renamed from: b */
        public int mo60379b(int i) {
            C20129a aVar = this.f51811b;
            if (aVar == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f51810a);
                }
                return Long.bitCount(this.f51810a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f51810a & ((1 << i) - 1));
            } else {
                return aVar.mo60379b(i - 64) + Long.bitCount(this.f51810a);
            }
        }

        /* renamed from: c */
        public final void mo60380c() {
            if (this.f51811b == null) {
                this.f51811b = new C20129a();
            }
        }

        /* renamed from: d */
        public boolean mo60381d(int i) {
            if (i >= 64) {
                mo60380c();
                return this.f51811b.mo60381d(i - 64);
            } else if ((this.f51810a & (1 << i)) != 0) {
                return true;
            } else {
                return false;
            }
        }

        /* renamed from: e */
        public void mo60382e(int i, boolean z) {
            boolean z2;
            if (i >= 64) {
                mo60380c();
                this.f51811b.mo60382e(i - 64, z);
                return;
            }
            long j = this.f51810a;
            if ((Long.MIN_VALUE & j) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            long j2 = (1 << i) - 1;
            this.f51810a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                mo60385h(i);
            } else {
                mo60378a(i);
            }
            if (z2 || this.f51811b != null) {
                mo60380c();
                this.f51811b.mo60382e(0, z2);
            }
        }

        /* renamed from: f */
        public boolean mo60383f(int i) {
            boolean z;
            if (i >= 64) {
                mo60380c();
                return this.f51811b.mo60383f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f51810a;
            if ((j2 & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            long j3 = j2 & (~j);
            this.f51810a = j3;
            long j4 = j - 1;
            this.f51810a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C20129a aVar = this.f51811b;
            if (aVar != null) {
                if (aVar.mo60381d(0)) {
                    mo60385h(63);
                }
                this.f51811b.mo60383f(0);
            }
            return z;
        }

        /* renamed from: g */
        public void mo60384g() {
            this.f51810a = 0;
            C20129a aVar = this.f51811b;
            if (aVar != null) {
                aVar.mo60384g();
            }
        }

        /* renamed from: h */
        public void mo60385h(int i) {
            if (i >= 64) {
                mo60380c();
                this.f51811b.mo60385h(i - 64);
                return;
            }
            this.f51810a |= 1 << i;
        }

        public String toString() {
            if (this.f51811b == null) {
                return Long.toBinaryString(this.f51810a);
            }
            return this.f51811b.toString() + "xx" + Long.toBinaryString(this.f51810a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.g$b */
    public interface C20130b {
        /* renamed from: a */
        View mo59755a(int i);

        void addView(View view, int i);

        /* renamed from: b */
        void mo59757b(View view);

        /* renamed from: c */
        int mo59758c();

        /* renamed from: d */
        RecyclerView.C20061e0 mo59759d(View view);

        /* renamed from: e */
        void mo59760e(int i);

        /* renamed from: f */
        int mo59761f(View view);

        /* renamed from: g */
        void mo59762g(View view);

        /* renamed from: h */
        void mo59763h(View view, int i, ViewGroup.LayoutParams layoutParams);

        void removeAllViews();

        void removeViewAt(int i);
    }

    public C20128g(C20130b bVar) {
        this.f51805a = bVar;
    }

    /* renamed from: a */
    public void mo60357a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f51805a.mo59758c();
        } else {
            i2 = mo60364h(i);
        }
        this.f51806b.mo60382e(i2, z);
        if (z) {
            mo60368l(view);
        }
        this.f51805a.addView(view, i2);
    }

    /* renamed from: b */
    public void mo60358b(View view, boolean z) {
        mo60357a(view, -1, z);
    }

    /* renamed from: c */
    public void mo60359c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f51805a.mo59758c();
        } else {
            i2 = mo60364h(i);
        }
        this.f51806b.mo60382e(i2, z);
        if (z) {
            mo60368l(view);
        }
        this.f51805a.mo59763h(view, i2, layoutParams);
    }

    /* renamed from: d */
    public void mo60360d(int i) {
        int h = mo60364h(i);
        this.f51806b.mo60383f(h);
        this.f51805a.mo59760e(h);
    }

    /* renamed from: e */
    public View mo60361e(int i) {
        int size = this.f51807c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f51807c.get(i2);
            RecyclerView.C20061e0 d = this.f51805a.mo59759d(view);
            if (d.getLayoutPosition() == i && !d.isInvalid() && !d.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* renamed from: f */
    public View mo60362f(int i) {
        return this.f51805a.mo59755a(mo60364h(i));
    }

    /* renamed from: g */
    public int mo60363g() {
        return this.f51805a.mo59758c() - this.f51807c.size();
    }

    /* renamed from: h */
    public final int mo60364h(int i) {
        if (i < 0) {
            return -1;
        }
        int c = this.f51805a.mo59758c();
        int i2 = i;
        while (i2 < c) {
            int b = i - (i2 - this.f51806b.mo60379b(i2));
            if (b == 0) {
                while (this.f51806b.mo60381d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += b;
        }
        return -1;
    }

    /* renamed from: i */
    public View mo60365i(int i) {
        return this.f51805a.mo59755a(i);
    }

    /* renamed from: j */
    public int mo60366j() {
        return this.f51805a.mo59758c();
    }

    /* renamed from: k */
    public void mo60367k(View view) {
        int f = this.f51805a.mo59761f(view);
        if (f >= 0) {
            this.f51806b.mo60385h(f);
            mo60368l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* renamed from: l */
    public final void mo60368l(View view) {
        this.f51807c.add(view);
        this.f51805a.mo59757b(view);
    }

    /* renamed from: m */
    public int mo60369m(View view) {
        int f = this.f51805a.mo59761f(view);
        if (f != -1 && !this.f51806b.mo60381d(f)) {
            return f - this.f51806b.mo60379b(f);
        }
        return -1;
    }

    /* renamed from: n */
    public boolean mo60370n(View view) {
        return this.f51807c.contains(view);
    }

    /* renamed from: o */
    public void mo60371o() {
        this.f51806b.mo60384g();
        for (int size = this.f51807c.size() - 1; size >= 0; size--) {
            this.f51805a.mo59762g(this.f51807c.get(size));
            this.f51807c.remove(size);
        }
        this.f51805a.removeAllViews();
    }

    /* renamed from: p */
    public void mo60372p(View view) {
        int f = this.f51805a.mo59761f(view);
        if (f >= 0) {
            if (this.f51806b.mo60383f(f)) {
                mo60376t(view);
            }
            this.f51805a.removeViewAt(f);
        }
    }

    /* renamed from: q */
    public void mo60373q(int i) {
        int h = mo60364h(i);
        View a = this.f51805a.mo59755a(h);
        if (a != null) {
            if (this.f51806b.mo60383f(h)) {
                mo60376t(a);
            }
            this.f51805a.removeViewAt(h);
        }
    }

    /* renamed from: r */
    public boolean mo60374r(View view) {
        int f = this.f51805a.mo59761f(view);
        if (f == -1) {
            mo60376t(view);
            return true;
        } else if (!this.f51806b.mo60381d(f)) {
            return false;
        } else {
            this.f51806b.mo60383f(f);
            mo60376t(view);
            this.f51805a.removeViewAt(f);
            return true;
        }
    }

    /* renamed from: s */
    public void mo60375s(View view) {
        int f = this.f51805a.mo59761f(view);
        if (f < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f51806b.mo60381d(f)) {
            this.f51806b.mo60378a(f);
            mo60376t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    /* renamed from: t */
    public final boolean mo60376t(View view) {
        if (!this.f51807c.remove(view)) {
            return false;
        }
        this.f51805a.mo59762g(view);
        return true;
    }

    public String toString() {
        return this.f51806b.toString() + ", hidden list:" + this.f51807c.size();
    }
}
