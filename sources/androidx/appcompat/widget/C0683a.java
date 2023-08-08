package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.C0387a;
import androidx.core.view.C18196h2;
import androidx.core.view.C18402w3;
import androidx.core.view.C18416x3;

/* renamed from: androidx.appcompat.widget.a */
public abstract class C0683a extends ViewGroup {

    /* renamed from: w */
    public static final int f2250w = 200;

    /* renamed from: a */
    public final C0685b f2251a;

    /* renamed from: b */
    public final Context f2252b;

    /* renamed from: c */
    public ActionMenuView f2253c;

    /* renamed from: d */
    public ActionMenuPresenter f2254d;

    /* renamed from: e */
    public int f2255e;

    /* renamed from: f */
    public C18402w3 f2256f;

    /* renamed from: g */
    public boolean f2257g;

    /* renamed from: v */
    public boolean f2258v;

    /* renamed from: androidx.appcompat.widget.a$a */
    public class C0684a implements Runnable {
        public C0684a() {
        }

        public void run() {
            C0683a.this.mo2344o();
        }
    }

    /* renamed from: androidx.appcompat.widget.a$b */
    public class C0685b implements C18416x3 {

        /* renamed from: a */
        public boolean f2260a = false;

        /* renamed from: b */
        public int f2261b;

        public C0685b() {
        }

        /* renamed from: a */
        public void mo3258a(View view) {
            this.f2260a = true;
        }

        /* renamed from: b */
        public void mo1198b(View view) {
            if (!this.f2260a) {
                C0683a aVar = C0683a.this;
                aVar.f2256f = null;
                C0683a.super.setVisibility(this.f2261b);
            }
        }

        /* renamed from: c */
        public void mo1199c(View view) {
            C0683a.super.setVisibility(0);
            this.f2260a = false;
        }

        /* renamed from: d */
        public C0685b mo3259d(C18402w3 w3Var, int i) {
            C0683a.this.f2256f = w3Var;
            this.f2261b = i;
            return this;
        }
    }

    public C0683a(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: k */
    public static int m3328k(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    /* renamed from: c */
    public void mo2329c(int i) {
        mo2343n(i, 200).mo53080y();
    }

    /* renamed from: d */
    public boolean mo2330d() {
        return mo2341i() && getVisibility() == 0;
    }

    /* renamed from: e */
    public void mo2331e() {
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo2436B();
        }
    }

    /* renamed from: f */
    public boolean mo2332f() {
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo2439E();
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo2333g() {
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo2441G();
        }
        return false;
    }

    public int getAnimatedVisibility() {
        if (this.f2256f != null) {
            return this.f2251a.f2261b;
        }
        return getVisibility();
    }

    public int getContentHeight() {
        return this.f2255e;
    }

    /* renamed from: h */
    public boolean mo2340h() {
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo2442H();
        }
        return false;
    }

    /* renamed from: i */
    public boolean mo2341i() {
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        return actionMenuPresenter != null && actionMenuPresenter.mo2443I();
    }

    /* renamed from: j */
    public int mo3254j(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    /* renamed from: l */
    public int mo3255l(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        if (z) {
            return -measuredWidth;
        }
        return measuredWidth;
    }

    /* renamed from: m */
    public void mo2342m() {
        post(new C0684a());
    }

    /* renamed from: n */
    public C18402w3 mo2343n(int i, long j) {
        C18402w3 w3Var = this.f2256f;
        if (w3Var != null) {
            w3Var.mo53060d();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            C18402w3 b = C18196h2.m82580g(this).mo53058b(1.0f);
            b.mo53074s(j);
            b.mo53076u(this.f2251a.mo3259d(b, i));
            return b;
        }
        C18402w3 b2 = C18196h2.m82580g(this).mo53058b(0.0f);
        b2.mo53074s(j);
        b2.mo53076u(this.f2251a.mo3259d(b2, i));
        return b2;
    }

    /* renamed from: o */
    public boolean mo2344o() {
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.mo2451Q();
        }
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes((AttributeSet) null, C0387a.C0400m.ActionBar, C0387a.C0389b.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(C0387a.C0400m.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        ActionMenuPresenter actionMenuPresenter = this.f2254d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.mo2444J(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f2258v = false;
        }
        if (!this.f2258v) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f2258v = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f2258v = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f2257g = false;
        }
        if (!this.f2257g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f2257g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f2257g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f2255e = i;
        requestLayout();
    }

    public void setVisibility(int i) {
        if (i != getVisibility()) {
            C18402w3 w3Var = this.f2256f;
            if (w3Var != null) {
                w3Var.mo53060d();
            }
            super.setVisibility(i);
        }
    }

    public C0683a(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0683a(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2251a = new C0685b();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(C0387a.C0389b.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f2252b = context;
        } else {
            this.f2252b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
