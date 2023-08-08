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
import androidx.annotation.C0329d0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.bumptech.glide.C22076h;
import com.bumptech.glide.request.C22557e;
import com.bumptech.glide.util.C22633m;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bumptech.glide.request.target.f */
public abstract class C22569f<T extends View, Z> implements C22584p<Z> {

    /* renamed from: f */
    public static final String f57909f = "CustomViewTarget";
    @C0329d0

    /* renamed from: g */
    public static final int f57910g = C22076h.C22084h.glide_custom_view_target_tag;

    /* renamed from: a */
    public final C22571b f57911a;

    /* renamed from: b */
    public final T f57912b;
    @C0363p0

    /* renamed from: c */
    public View.OnAttachStateChangeListener f57913c;

    /* renamed from: d */
    public boolean f57914d;

    /* renamed from: e */
    public boolean f57915e;

    /* renamed from: com.bumptech.glide.request.target.f$a */
    public class C22570a implements View.OnAttachStateChangeListener {
        public C22570a() {
        }

        public void onViewAttachedToWindow(View view) {
            C22569f.this.mo66854s();
        }

        public void onViewDetachedFromWindow(View view) {
            C22569f.this.mo66853r();
        }
    }

    @C0344h1
    /* renamed from: com.bumptech.glide.request.target.f$b */
    public static final class C22571b {

        /* renamed from: e */
        public static final int f57917e = 0;
        @C0363p0
        @C0344h1

        /* renamed from: f */
        public static Integer f57918f;

        /* renamed from: a */
        public final View f57919a;

        /* renamed from: b */
        public final List<C22583o> f57920b = new ArrayList();

        /* renamed from: c */
        public boolean f57921c;
        @C0363p0

        /* renamed from: d */
        public C22572a f57922d;

        /* renamed from: com.bumptech.glide.request.target.f$b$a */
        public static final class C22572a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            public final WeakReference<C22571b> f57923a;

            public C22572a(@C0359n0 C22571b bVar) {
                this.f57923a = new WeakReference<>(bVar);
            }

            public boolean onPreDraw() {
                if (Log.isLoggable(C22569f.f57909f, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("OnGlobalLayoutListener called attachStateListener=");
                    sb.append(this);
                }
                C22571b bVar = this.f57923a.get();
                if (bVar == null) {
                    return true;
                }
                bVar.mo66861a();
                return true;
            }
        }

        public C22571b(@C0359n0 View view) {
            this.f57919a = view;
        }

        /* renamed from: c */
        public static int m102462c(@C0359n0 Context context) {
            if (f57918f == null) {
                Display defaultDisplay = ((WindowManager) C22633m.m102624d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f57918f = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f57918f.intValue();
        }

        /* renamed from: a */
        public void mo66861a() {
            if (!this.f57920b.isEmpty()) {
                int g = mo66866g();
                int f = mo66865f();
                if (mo66868i(g, f)) {
                    mo66869j(g, f);
                    mo66862b();
                }
            }
        }

        /* renamed from: b */
        public void mo66862b() {
            ViewTreeObserver viewTreeObserver = this.f57919a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f57922d);
            }
            this.f57922d = null;
            this.f57920b.clear();
        }

        /* renamed from: d */
        public void mo66863d(@C0359n0 C22583o oVar) {
            int g = mo66866g();
            int f = mo66865f();
            if (mo66868i(g, f)) {
                oVar.mo66710e(g, f);
                return;
            }
            if (!this.f57920b.contains(oVar)) {
                this.f57920b.add(oVar);
            }
            if (this.f57922d == null) {
                ViewTreeObserver viewTreeObserver = this.f57919a.getViewTreeObserver();
                C22572a aVar = new C22572a(this);
                this.f57922d = aVar;
                viewTreeObserver.addOnPreDrawListener(aVar);
            }
        }

        /* renamed from: e */
        public final int mo66864e(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            if (this.f57921c && this.f57919a.isLayoutRequested()) {
                return 0;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            if (this.f57919a.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            return m102462c(this.f57919a.getContext());
        }

        /* renamed from: f */
        public final int mo66865f() {
            int i;
            int paddingTop = this.f57919a.getPaddingTop() + this.f57919a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f57919a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.height;
            } else {
                i = 0;
            }
            return mo66864e(this.f57919a.getHeight(), i, paddingTop);
        }

        /* renamed from: g */
        public final int mo66866g() {
            int i;
            int paddingLeft = this.f57919a.getPaddingLeft() + this.f57919a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f57919a.getLayoutParams();
            if (layoutParams != null) {
                i = layoutParams.width;
            } else {
                i = 0;
            }
            return mo66864e(this.f57919a.getWidth(), i, paddingLeft);
        }

        /* renamed from: h */
        public final boolean mo66867h(int i) {
            return i > 0 || i == Integer.MIN_VALUE;
        }

        /* renamed from: i */
        public final boolean mo66868i(int i, int i2) {
            return mo66867h(i) && mo66867h(i2);
        }

        /* renamed from: j */
        public final void mo66869j(int i, int i2) {
            Iterator it = new ArrayList(this.f57920b).iterator();
            while (it.hasNext()) {
                ((C22583o) it.next()).mo66710e(i, i2);
            }
        }

        /* renamed from: k */
        public void mo66870k(@C0359n0 C22583o oVar) {
            this.f57920b.remove(oVar);
        }
    }

    public C22569f(@C0359n0 T t) {
        this.f57912b = (View) C22633m.m102624d(t);
        this.f57911a = new C22571b(t);
    }

    /* renamed from: a */
    public void mo65585a() {
    }

    /* renamed from: b */
    public void mo65586b() {
    }

    /* renamed from: c */
    public void mo65587c() {
    }

    /* renamed from: d */
    public final void mo65588d(@C0359n0 C22583o oVar) {
        this.f57911a.mo66870k(oVar);
    }

    @C0359n0
    /* renamed from: e */
    public final C22569f<T, Z> mo66847e() {
        if (this.f57913c != null) {
            return this;
        }
        this.f57913c = new C22570a();
        mo66850i();
        return this;
    }

    @C0363p0
    /* renamed from: f */
    public final Object mo66848f() {
        return this.f57912b.getTag(f57910g);
    }

    /* renamed from: g */
    public final void mo65589g(@C0363p0 Drawable drawable) {
        mo66850i();
        mo66852q(drawable);
    }

    @C0363p0
    public final C22557e getRequest() {
        Object f = mo66848f();
        if (f == null) {
            return null;
        }
        if (f instanceof C22557e) {
            return (C22557e) f;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @C0359n0
    /* renamed from: h */
    public final T mo66849h() {
        return this.f57912b;
    }

    /* renamed from: i */
    public final void mo66850i() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f57913c;
        if (onAttachStateChangeListener != null && !this.f57915e) {
            this.f57912b.addOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f57915e = true;
        }
    }

    /* renamed from: j */
    public final void mo66851j() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f57913c;
        if (onAttachStateChangeListener != null && this.f57915e) {
            this.f57912b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
            this.f57915e = false;
        }
    }

    /* renamed from: k */
    public final void mo65591k(@C0363p0 Drawable drawable) {
        this.f57911a.mo66862b();
        mo65753m(drawable);
        if (!this.f57914d) {
            mo66851j();
        }
    }

    /* renamed from: m */
    public abstract void mo65753m(@C0363p0 Drawable drawable);

    /* renamed from: n */
    public final void mo65593n(@C0363p0 C22557e eVar) {
        mo66855t(eVar);
    }

    /* renamed from: p */
    public final void mo65595p(@C0359n0 C22583o oVar) {
        this.f57911a.mo66863d(oVar);
    }

    /* renamed from: q */
    public void mo66852q(@C0363p0 Drawable drawable) {
    }

    /* renamed from: r */
    public final void mo66853r() {
        C22557e request = getRequest();
        if (request != null) {
            this.f57914d = true;
            request.clear();
            this.f57914d = false;
        }
    }

    /* renamed from: s */
    public final void mo66854s() {
        C22557e request = getRequest();
        if (request != null && request.mo66711f()) {
            request.mo66714i();
        }
    }

    /* renamed from: t */
    public final void mo66855t(@C0363p0 Object obj) {
        this.f57912b.setTag(f57910g, obj);
    }

    public String toString() {
        return "Target for: " + this.f57912b;
    }

    @Deprecated
    /* renamed from: u */
    public final C22569f<T, Z> mo66857u(@C0329d0 int i) {
        return this;
    }

    @C0359n0
    /* renamed from: v */
    public final C22569f<T, Z> mo66858v() {
        this.f57911a.f57921c = true;
        return this;
    }
}
