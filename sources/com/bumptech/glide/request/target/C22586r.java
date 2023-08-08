package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.C0344h1;
import androidx.annotation.C0346i;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.C22076h;
import com.bumptech.glide.request.C22557e;
import com.bumptech.glide.util.C22633m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Deprecated
/* renamed from: com.bumptech.glide.request.target.r */
public abstract class C22586r<T extends View, Z> extends C22565b<Z> {

    /* renamed from: g */
    public static final String f57946g = "ViewTarget";

    /* renamed from: v */
    public static boolean f57947v;

    /* renamed from: w */
    public static int f57948w = C22076h.C22084h.glide_custom_view_target_tag;

    /* renamed from: b */
    public final T f57949b;

    /* renamed from: c */
    public final C22588b f57950c;
    @C0363p0

    /* renamed from: d */
    public View.OnAttachStateChangeListener f57951d;

    /* renamed from: e */
    public boolean f57952e;

    /* renamed from: f */
    public boolean f57953f;

    /* renamed from: com.bumptech.glide.request.target.r$a */
    public class C22587a implements View.OnAttachStateChangeListener {
        public C22587a() {
        }

        public void onViewAttachedToWindow(View view) {
            C22586r.this.mo66920r();
        }

        public void onViewDetachedFromWindow(View view) {
            C22586r.this.mo66919q();
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.request.target.r$b */
    public static final class C22588b {

        /* renamed from: e */
        public static final int f57955e = 0;
        @C0363p0
        @C0344h1

        /* renamed from: f */
        public static Integer f57956f;

        /* renamed from: a */
        public final View f57957a;

        /* renamed from: b */
        public final List<C22583o> f57958b = new ArrayList();

        /* renamed from: c */
        public boolean f57959c;
        @C0363p0

        /* renamed from: d */
        public C22589a f57960d;

        /* renamed from: com.bumptech.glide.request.target.r$b$a */
        public static final class C22589a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference<C22588b> f57961a;

            public C22589a(@C0359n0 C22588b bVar) {
                this.f57961a = new WeakReference<>(bVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable(C22586r.f57946g, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                C22588b bVar = this.f57961a.get();
                if (bVar == null) {
                    return true;
                }
                bVar.mo66926a();
                return true;
            }
        }

        public C22588b(@C0359n0 View view) {
            this.f57957a = view;
        }

        /* renamed from: c */
        public static int m102525c(@C0359n0 Context context) {
            if (f57956f == null) {
                Display defaultDisplay = ((WindowManager) C22633m.m102624d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f57956f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f57956f.intValue();
        }

        /* renamed from: a */
        public void mo66926a() {
            if (!this.f57958b.isEmpty()) {
                int g = mo66931g();
                int f = mo66930f();
                if (mo66933i(g, f)) {
                    mo66934j(g, f);
                    mo66927b();
                }
            }
        }

        /* renamed from: b */
        public void mo66927b() {
            ViewTreeObserver viewTreeObserver = this.f57957a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f57960d);
            }
            this.f57960d = null;
            this.f57958b.clear();
        }

        /* renamed from: d */
        public void mo66928d(@C0359n0 C22583o oVar) {
            int g = mo66931g();
            int f = mo66930f();
            if (mo66933i(g, f)) {
                oVar.mo66710e(g, f);
                return;
            }
            if (!this.f57958b.contains(oVar)) {
                this.f57958b.add(oVar);
            }
            if (this.f57960d == null) {
                ViewTreeObserver viewTreeObserver = this.f57957a.getViewTreeObserver();
                C22589a aVar = new C22589a(this);
                this.f57960d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* renamed from: e */
        public final int mo66929e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f57959c && this.f57957a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f57957a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            return m102525c(this.f57957a.getContext());
        }

        /* renamed from: f */
        public final int mo66930f() {
            int i;
            int paddingTop = this.f57957a.getPaddingTop() + this.f57957a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f57957a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return mo66929e(this.f57957a.getHeight(), i, paddingTop);
        }

        /* renamed from: g */
        public final int mo66931g() {
            int i;
            int paddingLeft = this.f57957a.getPaddingLeft() + this.f57957a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f57957a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return mo66929e(this.f57957a.getWidth(), i, paddingLeft);
        }

        /* renamed from: h */
        public final boolean mo66932h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean mo66933i(int i, int i2) {
            return mo66932h(i) && mo66932h(i2);
        }

        /* renamed from: j */
        public final void mo66934j(int i, int i2) {
            Iterator it = new ArrayList(this.f57958b).iterator();
            while (it.hasNext()) {
                ((C22583o) it.next()).mo66710e(i, i2);
            }
        }

        /* renamed from: k */
        public void mo66935k(@C0359n0 C22583o oVar) {
            this.f57958b.remove(oVar);
        }
    }

    public C22586r(@C0359n0 T t) {
        this.f57949b = (View) C22633m.m102624d(t);
        this.f57950c = new C22588b(t);
    }

    @Deprecated
    /* renamed from: t */
    public static void m102511t(int i) {
        if (!f57947v) {
            f57948w = i;
            return;
        }
        throw new IllegalArgumentException("You cannot set the tag id more than once or change the tag id after the first request has been made");
    }

    @C0346i
    /* renamed from: d */
    public void mo65588d(@C0359n0 C22583o oVar) {
        this.f57950c.mo66935k(oVar);
    }

    @C0346i
    /* renamed from: g */
    public void mo65589g(@C0363p0 Drawable drawable) {
        super.mo65589g(drawable);
        mo66917j();
    }

    @C0363p0
    public C22557e getRequest() {
        Object i = mo66916i();
        if (i == null) {
            return null;
        }
        if (i instanceof C22557e) {
            return (C22557e) i;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @C0359n0
    public T getView() {
        return this.f57949b;
    }

    @C0359n0
    /* renamed from: h */
    public final C22586r<T, Z> mo66915h() {
        if (this.f57951d != null) {
            return this;
        }
        this.f57951d = new C22587a();
        mo66917j();
        return this;
    }

    @C0363p0
    /* renamed from: i */
    public final Object mo66916i() {
        return this.f57949b.getTag(f57948w);
    }

    /* renamed from: j */
    public final void mo66917j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f57951d;
        if (onAttachStateChangeListener != null && !this.f57953f) {
            this.f57949b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f57953f = true;
        }
    }

    @C0346i
    /* renamed from: k */
    public void mo65591k(@C0363p0 Drawable drawable) {
        super.mo65591k(drawable);
        this.f57950c.mo66927b();
        if (!this.f57952e) {
            mo66918m();
        }
    }

    /* renamed from: m */
    public final void mo66918m() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f57951d;
        if (onAttachStateChangeListener != null && this.f57953f) {
            this.f57949b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f57953f = false;
        }
    }

    /* renamed from: n */
    public void mo65593n(@C0363p0 C22557e eVar) {
        mo66921s(eVar);
    }

    @C0346i
    /* renamed from: p */
    public void mo65595p(@C0359n0 C22583o oVar) {
        this.f57950c.mo66928d(oVar);
    }

    /* renamed from: q */
    public void mo66919q() {
        C22557e request = getRequest();
        if (request != null) {
            this.f57952e = true;
            request.clear();
            this.f57952e = false;
        }
    }

    /* renamed from: r */
    public void mo66920r() {
        C22557e request = getRequest();
        if (request != null && request.mo66711f()) {
            request.mo66714i();
        }
    }

    /* renamed from: s */
    public final void mo66921s(@C0363p0 Object obj) {
        f57947v = true;
        this.f57949b.setTag(f57948w, obj);
    }

    public String toString() {
        return "Target for: " + this.f57949b;
    }

    @C0359n0
    /* renamed from: u */
    public final C22586r<T, Z> mo66923u() {
        this.f57950c.f57959c = true;
        return this;
    }

    @Deprecated
    public C22586r(@C0359n0 T t, boolean z) {
        this(t);
        if (z) {
            mo66923u();
        }
    }
}
