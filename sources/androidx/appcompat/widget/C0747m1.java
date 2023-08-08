package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.annotation.RestrictTo;
import androidx.appcompat.C0387a;
import androidx.appcompat.content.res.C0507a;
import androidx.appcompat.view.menu.C0555a;
import androidx.appcompat.view.menu.C0568g;
import androidx.appcompat.view.menu.C0585n;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C18196h2;
import androidx.core.view.C18402w3;
import androidx.core.view.C18426y3;
import androidx.legacy.app.C19322a;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.appcompat.widget.m1 */
public class C0747m1 implements C0707d0 {

    /* renamed from: s */
    public static final String f2439s = "ToolbarWidgetWrapper";

    /* renamed from: t */
    public static final int f2440t = 3;

    /* renamed from: u */
    public static final long f2441u = 200;

    /* renamed from: a */
    public Toolbar f2442a;

    /* renamed from: b */
    public int f2443b;

    /* renamed from: c */
    public View f2444c;

    /* renamed from: d */
    public Spinner f2445d;

    /* renamed from: e */
    public View f2446e;

    /* renamed from: f */
    public Drawable f2447f;

    /* renamed from: g */
    public Drawable f2448g;

    /* renamed from: h */
    public Drawable f2449h;

    /* renamed from: i */
    public boolean f2450i;

    /* renamed from: j */
    public CharSequence f2451j;

    /* renamed from: k */
    public CharSequence f2452k;

    /* renamed from: l */
    public CharSequence f2453l;

    /* renamed from: m */
    public Window.Callback f2454m;

    /* renamed from: n */
    public boolean f2455n;

    /* renamed from: o */
    public ActionMenuPresenter f2456o;

    /* renamed from: p */
    public int f2457p;

    /* renamed from: q */
    public int f2458q;

    /* renamed from: r */
    public Drawable f2459r;

    /* renamed from: androidx.appcompat.widget.m1$a */
    public class C0748a implements View.OnClickListener {

        /* renamed from: a */
        public final C0555a f2460a;

        public C0748a() {
            this.f2460a = new C0555a(C0747m1.this.f2442a.getContext(), 0, C19322a.f49638p, 0, 0, C0747m1.this.f2451j);
        }

        public void onClick(View view) {
            C0747m1 m1Var = C0747m1.this;
            Window.Callback callback = m1Var.f2454m;
            if (callback != null && m1Var.f2455n) {
                callback.onMenuItemSelected(0, this.f2460a);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.m1$b */
    public class C0749b extends C18426y3 {

        /* renamed from: a */
        public boolean f2462a = false;

        /* renamed from: b */
        public final /* synthetic */ int f2463b;

        public C0749b(int i) {
            this.f2463b = i;
        }

        /* renamed from: a */
        public void mo3258a(View view) {
            this.f2462a = true;
        }

        /* renamed from: b */
        public void mo1198b(View view) {
            if (!this.f2462a) {
                C0747m1.this.f2442a.setVisibility(this.f2463b);
            }
        }

        /* renamed from: c */
        public void mo1199c(View view) {
            C0747m1.this.f2442a.setVisibility(0);
        }
    }

    public C0747m1(Toolbar toolbar, boolean z) {
        this(toolbar, z, C0387a.C0398k.abc_action_bar_up_description, C0387a.C0393f.abc_ic_ab_back_material);
    }

    /* renamed from: A */
    public void mo3345A() {
        this.f2442a.mo3132f();
    }

    /* renamed from: B */
    public View mo3346B() {
        return this.f2446e;
    }

    /* renamed from: C */
    public void mo3347C(ScrollingTabContainerView scrollingTabContainerView) {
        Toolbar toolbar;
        View view = this.f2444c;
        if (view != null && view.getParent() == (toolbar = this.f2442a)) {
            toolbar.removeView(this.f2444c);
        }
        this.f2444c = scrollingTabContainerView;
        if (scrollingTabContainerView != null && this.f2457p == 2) {
            this.f2442a.addView(scrollingTabContainerView, 0);
            Toolbar.C0680g gVar = (Toolbar.C0680g) this.f2444c.getLayoutParams();
            gVar.width = -2;
            gVar.height = -2;
            gVar.f1107a = 8388691;
            scrollingTabContainerView.setAllowCollapse(true);
        }
    }

    /* renamed from: D */
    public void mo3348D(Drawable drawable) {
        this.f2448g = drawable;
        mo3542W();
    }

    /* renamed from: E */
    public void mo3349E(Drawable drawable) {
        if (this.f2459r != drawable) {
            this.f2459r = drawable;
            mo3541V();
        }
    }

    /* renamed from: F */
    public void mo3350F(SparseArray<Parcelable> sparseArray) {
        this.f2442a.saveHierarchyState(sparseArray);
    }

    /* renamed from: G */
    public boolean mo3351G() {
        return this.f2444c != null;
    }

    /* renamed from: H */
    public void mo3352H(int i) {
        C18402w3 q = mo3383q(i, 200);
        if (q != null) {
            q.mo53080y();
        }
    }

    /* renamed from: I */
    public void mo3353I(int i) {
        mo3361Q(i != 0 ? C0507a.m2346b(getContext(), i) : null);
    }

    /* renamed from: J */
    public void mo3354J(C0585n.C0586a aVar, C0568g.C0569a aVar2) {
        this.f2442a.setMenuCallbacks(aVar, aVar2);
    }

    /* renamed from: K */
    public void mo3355K(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        mo3538S();
        this.f2445d.setAdapter(spinnerAdapter);
        this.f2445d.setOnItemSelectedListener(onItemSelectedListener);
    }

    /* renamed from: L */
    public void mo3356L(SparseArray<Parcelable> sparseArray) {
        this.f2442a.restoreHierarchyState(sparseArray);
    }

    /* renamed from: M */
    public CharSequence mo3357M() {
        return this.f2442a.getSubtitle();
    }

    /* renamed from: N */
    public int mo3358N() {
        return this.f2443b;
    }

    /* renamed from: O */
    public void mo3359O(View view) {
        View view2 = this.f2446e;
        if (!(view2 == null || (this.f2443b & 16) == 0)) {
            this.f2442a.removeView(view2);
        }
        this.f2446e = view;
        if (view != null && (this.f2443b & 16) != 0) {
            this.f2442a.addView(view);
        }
    }

    /* renamed from: P */
    public void mo3360P() {
    }

    /* renamed from: Q */
    public void mo3361Q(Drawable drawable) {
        this.f2449h = drawable;
        mo3541V();
    }

    /* renamed from: R */
    public final int mo3537R() {
        if (this.f2442a.getNavigationIcon() == null) {
            return 11;
        }
        this.f2459r = this.f2442a.getNavigationIcon();
        return 15;
    }

    /* renamed from: S */
    public final void mo3538S() {
        if (this.f2445d == null) {
            this.f2445d = new AppCompatSpinner(getContext(), (AttributeSet) null, C0387a.C0389b.actionDropDownStyle);
            this.f2445d.setLayoutParams(new Toolbar.C0680g(-2, -2, 8388627));
        }
    }

    /* renamed from: T */
    public final void mo3539T(CharSequence charSequence) {
        this.f2451j = charSequence;
        if ((this.f2443b & 8) != 0) {
            this.f2442a.setTitle(charSequence);
            if (this.f2450i) {
                C18196h2.m82486E1(this.f2442a.getRootView(), charSequence);
            }
        }
    }

    /* renamed from: U */
    public final void mo3540U() {
        if ((this.f2443b & 4) == 0) {
            return;
        }
        if (TextUtils.isEmpty(this.f2453l)) {
            this.f2442a.setNavigationContentDescription(this.f2458q);
        } else {
            this.f2442a.setNavigationContentDescription(this.f2453l);
        }
    }

    /* renamed from: V */
    public final void mo3541V() {
        if ((this.f2443b & 4) != 0) {
            Toolbar toolbar = this.f2442a;
            Drawable drawable = this.f2449h;
            if (drawable == null) {
                drawable = this.f2459r;
            }
            toolbar.setNavigationIcon(drawable);
            return;
        }
        this.f2442a.setNavigationIcon((Drawable) null);
    }

    /* renamed from: W */
    public final void mo3542W() {
        Drawable drawable;
        int i = this.f2443b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f2448g;
            if (drawable == null) {
                drawable = this.f2447f;
            }
        } else {
            drawable = this.f2447f;
        }
        this.f2442a.setLogo(drawable);
    }

    /* renamed from: a */
    public Menu mo3362a() {
        return this.f2442a.getMenu();
    }

    /* renamed from: b */
    public void mo3363b(Drawable drawable) {
        C18196h2.m82502I1(this.f2442a, drawable);
    }

    /* renamed from: c */
    public boolean mo3364c() {
        return this.f2447f != null;
    }

    public void collapseActionView() {
        this.f2442a.mo3131e();
    }

    /* renamed from: d */
    public boolean mo3366d() {
        return this.f2442a.mo3130d();
    }

    /* renamed from: e */
    public boolean mo3367e() {
        return this.f2442a.mo3231z();
    }

    /* renamed from: f */
    public boolean mo3368f() {
        return this.f2442a.mo3124R();
    }

    /* renamed from: g */
    public boolean mo3369g() {
        return this.f2442a.mo3114E();
    }

    public Context getContext() {
        return this.f2442a.getContext();
    }

    public int getHeight() {
        return this.f2442a.getHeight();
    }

    public CharSequence getTitle() {
        return this.f2442a.getTitle();
    }

    public int getVisibility() {
        return this.f2442a.getVisibility();
    }

    /* renamed from: h */
    public boolean mo3374h() {
        return this.f2448g != null;
    }

    /* renamed from: i */
    public boolean mo3375i() {
        return this.f2442a.mo3113D();
    }

    /* renamed from: j */
    public boolean mo3376j() {
        return this.f2442a.mo3230y();
    }

    /* renamed from: k */
    public boolean mo3377k() {
        return this.f2442a.mo3115F();
    }

    /* renamed from: l */
    public void mo3378l(int i) {
        View view;
        int i2 = this.f2443b ^ i;
        this.f2443b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    mo3540U();
                }
                mo3541V();
            }
            if ((i2 & 3) != 0) {
                mo3542W();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    this.f2442a.setTitle(this.f2451j);
                    this.f2442a.setSubtitle(this.f2452k);
                } else {
                    this.f2442a.setTitle((CharSequence) null);
                    this.f2442a.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) != 0 && (view = this.f2446e) != null) {
                if ((i & 16) != 0) {
                    this.f2442a.addView(view);
                } else {
                    this.f2442a.removeView(view);
                }
            }
        }
    }

    /* renamed from: m */
    public void mo3379m(CharSequence charSequence) {
        this.f2453l = charSequence;
        mo3540U();
    }

    /* renamed from: n */
    public void mo3380n(CharSequence charSequence) {
        this.f2452k = charSequence;
        if ((this.f2443b & 8) != 0) {
            this.f2442a.setSubtitle(charSequence);
        }
    }

    /* renamed from: o */
    public void mo3381o(int i) {
        Spinner spinner = this.f2445d;
        if (spinner != null) {
            spinner.setSelection(i);
            return;
        }
        throw new IllegalStateException("Can't set dropdown selected position without an adapter");
    }

    /* renamed from: p */
    public int mo3382p() {
        return this.f2457p;
    }

    /* renamed from: q */
    public C18402w3 mo3383q(int i, long j) {
        float f;
        C18402w3 g = C18196h2.m82580g(this.f2442a);
        if (i == 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        return g.mo53058b(f).mo53074s(j).mo53076u(new C0749b(i));
    }

    /* renamed from: r */
    public void mo3384r(int i) {
        Toolbar toolbar;
        View view;
        Toolbar toolbar2;
        int i2 = this.f2457p;
        if (i != i2) {
            if (i2 == 1) {
                Spinner spinner = this.f2445d;
                if (spinner != null && spinner.getParent() == (toolbar = this.f2442a)) {
                    toolbar.removeView(this.f2445d);
                }
            } else if (i2 == 2 && (view = this.f2444c) != null && view.getParent() == (toolbar2 = this.f2442a)) {
                toolbar2.removeView(this.f2444c);
            }
            this.f2457p = i;
            if (i == 0) {
                return;
            }
            if (i == 1) {
                mo3538S();
                this.f2442a.addView(this.f2445d, 0);
            } else if (i == 2) {
                View view2 = this.f2444c;
                if (view2 != null) {
                    this.f2442a.addView(view2, 0);
                    Toolbar.C0680g gVar = (Toolbar.C0680g) this.f2444c.getLayoutParams();
                    gVar.width = -2;
                    gVar.height = -2;
                    gVar.f1107a = 8388691;
                }
            } else {
                throw new IllegalArgumentException("Invalid navigation mode " + i);
            }
        }
    }

    /* renamed from: s */
    public ViewGroup mo3385s() {
        return this.f2442a;
    }

    public void setIcon(int i) {
        setIcon(i != 0 ? C0507a.m2346b(getContext(), i) : null);
    }

    public void setLogo(int i) {
        mo3348D(i != 0 ? C0507a.m2346b(getContext(), i) : null);
    }

    public void setMenu(Menu menu, C0585n.C0586a aVar) {
        if (this.f2456o == null) {
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(this.f2442a.getContext());
            this.f2456o = actionMenuPresenter;
            actionMenuPresenter.mo1952s(C0387a.C0394g.action_menu_presenter);
        }
        this.f2456o.mo1939e(aVar);
        this.f2442a.setMenu((C0568g) menu, this.f2456o);
    }

    public void setMenuPrepared() {
        this.f2455n = true;
    }

    public void setTitle(CharSequence charSequence) {
        this.f2450i = true;
        mo3539T(charSequence);
    }

    public void setVisibility(int i) {
        this.f2442a.setVisibility(i);
    }

    public void setWindowCallback(Window.Callback callback) {
        this.f2454m = callback;
    }

    public void setWindowTitle(CharSequence charSequence) {
        if (!this.f2450i) {
            mo3539T(charSequence);
        }
    }

    /* renamed from: t */
    public void mo3395t(boolean z) {
    }

    /* renamed from: u */
    public int mo3396u() {
        Spinner spinner = this.f2445d;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    /* renamed from: v */
    public void mo3397v(int i) {
        mo3379m(i == 0 ? null : getContext().getString(i));
    }

    /* renamed from: w */
    public void mo3398w() {
    }

    /* renamed from: x */
    public int mo3399x() {
        Spinner spinner = this.f2445d;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    /* renamed from: y */
    public void mo3400y(boolean z) {
        this.f2442a.setCollapsible(z);
    }

    /* renamed from: z */
    public void mo3401z(int i) {
        if (i != this.f2458q) {
            this.f2458q = i;
            if (TextUtils.isEmpty(this.f2442a.getNavigationContentDescription())) {
                mo3397v(this.f2458q);
            }
        }
    }

    public C0747m1(Toolbar toolbar, boolean z, int i, int i2) {
        Drawable drawable;
        this.f2457p = 0;
        this.f2458q = 0;
        this.f2442a = toolbar;
        this.f2451j = toolbar.getTitle();
        this.f2452k = toolbar.getSubtitle();
        this.f2450i = this.f2451j != null;
        this.f2449h = toolbar.getNavigationIcon();
        C0722h1 G = C0722h1.m3539G(toolbar.getContext(), (AttributeSet) null, C0387a.C0400m.ActionBar, C0387a.C0389b.actionBarStyle, 0);
        this.f2459r = G.mo3466h(C0387a.C0400m.ActionBar_homeAsUpIndicator);
        if (z) {
            CharSequence x = G.mo3482x(C0387a.C0400m.ActionBar_title);
            if (!TextUtils.isEmpty(x)) {
                setTitle(x);
            }
            CharSequence x2 = G.mo3482x(C0387a.C0400m.ActionBar_subtitle);
            if (!TextUtils.isEmpty(x2)) {
                mo3380n(x2);
            }
            Drawable h = G.mo3466h(C0387a.C0400m.ActionBar_logo);
            if (h != null) {
                mo3348D(h);
            }
            Drawable h2 = G.mo3466h(C0387a.C0400m.ActionBar_icon);
            if (h2 != null) {
                setIcon(h2);
            }
            if (this.f2449h == null && (drawable = this.f2459r) != null) {
                mo3361Q(drawable);
            }
            mo3378l(G.mo3473o(C0387a.C0400m.ActionBar_displayOptions, 0));
            int u = G.mo3479u(C0387a.C0400m.ActionBar_customNavigationLayout, 0);
            if (u != 0) {
                mo3359O(LayoutInflater.from(this.f2442a.getContext()).inflate(u, this.f2442a, false));
                mo3378l(this.f2443b | 16);
            }
            int q = G.mo3475q(C0387a.C0400m.ActionBar_height, 0);
            if (q > 0) {
                ViewGroup.LayoutParams layoutParams = this.f2442a.getLayoutParams();
                layoutParams.height = q;
                this.f2442a.setLayoutParams(layoutParams);
            }
            int f = G.mo3464f(C0387a.C0400m.ActionBar_contentInsetStart, -1);
            int f2 = G.mo3464f(C0387a.C0400m.ActionBar_contentInsetEnd, -1);
            if (f >= 0 || f2 >= 0) {
                this.f2442a.setContentInsetsRelative(Math.max(f, 0), Math.max(f2, 0));
            }
            int u2 = G.mo3479u(C0387a.C0400m.ActionBar_titleTextStyle, 0);
            if (u2 != 0) {
                Toolbar toolbar2 = this.f2442a;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), u2);
            }
            int u3 = G.mo3479u(C0387a.C0400m.ActionBar_subtitleTextStyle, 0);
            if (u3 != 0) {
                Toolbar toolbar3 = this.f2442a;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), u3);
            }
            int u4 = G.mo3479u(C0387a.C0400m.ActionBar_popupTheme, 0);
            if (u4 != 0) {
                this.f2442a.setPopupTheme(u4);
            }
        } else {
            this.f2443b = mo3537R();
        }
        G.mo3458I();
        mo3401z(i);
        this.f2453l = this.f2442a.getNavigationContentDescription();
        this.f2442a.setNavigationOnClickListener(new C0748a());
    }

    public void setIcon(Drawable drawable) {
        this.f2447f = drawable;
        mo3542W();
    }
}
