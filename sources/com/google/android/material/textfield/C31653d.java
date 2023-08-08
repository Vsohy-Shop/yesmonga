package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.core.view.C18196h2;
import androidx.core.view.accessibility.C18040c;
import androidx.core.view.accessibility.C18065l0;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.color.C31266s;
import com.google.android.material.internal.C31421o;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.C31525j;
import com.google.android.material.shape.C31534o;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.textfield.d */
public class C31653d extends C31668e {

    /* renamed from: t */
    public static final boolean f76977t = true;

    /* renamed from: u */
    public static final int f76978u = 50;

    /* renamed from: v */
    public static final int f76979v = 67;

    /* renamed from: e */
    public final TextWatcher f76980e = new C31654a();

    /* renamed from: f */
    public final View.OnFocusChangeListener f76981f = new C31659e();

    /* renamed from: g */
    public final TextInputLayout.C31635e f76982g = new C31660f(this.f77012a);

    /* renamed from: h */
    public final TextInputLayout.C31638h f76983h = new C31661g();
    @SuppressLint({"ClickableViewAccessibility"})

    /* renamed from: i */
    public final TextInputLayout.C31639i f76984i = new C31662h();

    /* renamed from: j */
    public final View.OnAttachStateChangeListener f76985j = new C31664i();

    /* renamed from: k */
    public final C18040c.C18045e f76986k = new C31665j();

    /* renamed from: l */
    public boolean f76987l = false;

    /* renamed from: m */
    public boolean f76988m = false;

    /* renamed from: n */
    public long f76989n = Long.MAX_VALUE;

    /* renamed from: o */
    public StateListDrawable f76990o;

    /* renamed from: p */
    public C31525j f76991p;
    @C0363p0

    /* renamed from: q */
    public AccessibilityManager f76992q;

    /* renamed from: r */
    public ValueAnimator f76993r;

    /* renamed from: s */
    public ValueAnimator f76994s;

    /* renamed from: com.google.android.material.textfield.d$a */
    public class C31654a extends C31421o {

        /* renamed from: com.google.android.material.textfield.d$a$a */
        public class C31655a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ AutoCompleteTextView f76996a;

            public C31655a(AutoCompleteTextView autoCompleteTextView) {
                this.f76996a = autoCompleteTextView;
            }

            public void run() {
                boolean isPopupShowing = this.f76996a.isPopupShowing();
                C31653d.this.mo91756J(isPopupShowing);
                boolean unused = C31653d.this.f76987l = isPopupShowing;
            }
        }

        public C31654a() {
        }

        public void afterTextChanged(Editable editable) {
            AutoCompleteTextView e = C31653d.m128306C(C31653d.this.f77012a.getEditText());
            if (C31653d.this.f76992q.isTouchExplorationEnabled() && C31653d.m128307H(e) && !C31653d.this.f77014c.hasFocus()) {
                e.dismissDropDown();
            }
            e.post(new C31655a(e));
        }
    }

    /* renamed from: com.google.android.material.textfield.d$b */
    public class C31656b implements AutoCompleteTextView.OnDismissListener {
        public C31656b() {
        }

        public void onDismiss() {
            C31653d.this.mo91760N();
            C31653d.this.mo91756J(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$c */
    public class C31657c extends AnimatorListenerAdapter {
        public C31657c() {
        }

        public void onAnimationEnd(Animator animator) {
            C31653d dVar = C31653d.this;
            dVar.f77014c.setChecked(dVar.f76988m);
            C31653d.this.f76994s.start();
        }
    }

    /* renamed from: com.google.android.material.textfield.d$d */
    public class C31658d implements ValueAnimator.AnimatorUpdateListener {
        public C31658d() {
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            C31653d.this.f77014c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$e */
    public class C31659e implements View.OnFocusChangeListener {
        public C31659e() {
        }

        public void onFocusChange(View view, boolean z) {
            C31653d.this.f77012a.setEndIconActivated(z);
            if (!z) {
                C31653d.this.mo91756J(false);
                boolean unused = C31653d.this.f76987l = false;
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$f */
    public class C31660f extends TextInputLayout.C31635e {
        public C31660f(TextInputLayout textInputLayout) {
            super(textInputLayout);
        }

        /* renamed from: g */
        public void mo19938g(View view, @C0359n0 C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            if (!C31653d.m128307H(C31653d.this.f77012a.getEditText())) {
                l0Var.mo52592Z0(Spinner.class.getName());
            }
            if (l0Var.mo52524B0()) {
                l0Var.mo52641o1((CharSequence) null);
            }
        }

        /* renamed from: h */
        public void mo52493h(View view, @C0359n0 AccessibilityEvent accessibilityEvent) {
            super.mo52493h(view, accessibilityEvent);
            AutoCompleteTextView e = C31653d.m128306C(C31653d.this.f77012a.getEditText());
            if (accessibilityEvent.getEventType() == 1 && C31653d.this.f76992q.isEnabled() && !C31653d.m128307H(C31653d.this.f77012a.getEditText())) {
                C31653d.this.mo91759M(e);
                C31653d.this.mo91760N();
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$g */
    public class C31661g implements TextInputLayout.C31638h {
        public C31661g() {
        }

        /* renamed from: a */
        public void mo91725a(@C0359n0 TextInputLayout textInputLayout) {
            AutoCompleteTextView e = C31653d.m128306C(textInputLayout.getEditText());
            C31653d.this.mo91757K(e);
            C31653d.this.mo91764y(e);
            C31653d.this.mo91758L(e);
            e.setThreshold(0);
            e.removeTextChangedListener(C31653d.this.f76980e);
            e.addTextChangedListener(C31653d.this.f76980e);
            textInputLayout.setEndIconCheckable(true);
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!C31653d.m128307H(e) && C31653d.this.f76992q.isTouchExplorationEnabled()) {
                C18196h2.m82531R1(C31653d.this.f77014c, 2);
            }
            textInputLayout.setTextInputAccessibilityDelegate(C31653d.this.f76982g);
            textInputLayout.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.d$h */
    public class C31662h implements TextInputLayout.C31639i {

        /* renamed from: com.google.android.material.textfield.d$h$a */
        public class C31663a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ AutoCompleteTextView f77005a;

            public C31663a(AutoCompleteTextView autoCompleteTextView) {
                this.f77005a = autoCompleteTextView;
            }

            public void run() {
                this.f77005a.removeTextChangedListener(C31653d.this.f76980e);
            }
        }

        public C31662h() {
        }

        /* renamed from: a */
        public void mo91726a(@C0359n0 TextInputLayout textInputLayout, int i) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText();
            if (autoCompleteTextView != null && i == 3) {
                autoCompleteTextView.post(new C31663a(autoCompleteTextView));
                if (autoCompleteTextView.getOnFocusChangeListener() == C31653d.this.f76981f) {
                    autoCompleteTextView.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                autoCompleteTextView.setOnTouchListener((View.OnTouchListener) null);
                if (C31653d.f76977t) {
                    autoCompleteTextView.setOnDismissListener((AutoCompleteTextView.OnDismissListener) null);
                }
            }
            if (i == 3) {
                textInputLayout.removeOnAttachStateChangeListener(C31653d.this.f76985j);
                C31653d.this.mo91755I();
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$i */
    public class C31664i implements View.OnAttachStateChangeListener {
        public C31664i() {
        }

        public void onViewAttachedToWindow(View view) {
            C31653d.this.mo91750B();
        }

        public void onViewDetachedFromWindow(View view) {
            C31653d.this.mo91755I();
        }
    }

    /* renamed from: com.google.android.material.textfield.d$j */
    public class C31665j implements C18040c.C18045e {
        public C31665j() {
        }

        public void onTouchExplorationStateChanged(boolean z) {
            AutoCompleteTextView autoCompleteTextView;
            int i;
            TextInputLayout textInputLayout = C31653d.this.f77012a;
            if (textInputLayout != null && (autoCompleteTextView = (AutoCompleteTextView) textInputLayout.getEditText()) != null && !C31653d.m128307H(autoCompleteTextView)) {
                CheckableImageButton checkableImageButton = C31653d.this.f77014c;
                if (z) {
                    i = 2;
                } else {
                    i = 1;
                }
                C18196h2.m82531R1(checkableImageButton, i);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.d$k */
    public class C31666k implements View.OnClickListener {
        public C31666k() {
        }

        public void onClick(View view) {
            C31653d.this.mo91759M((AutoCompleteTextView) C31653d.this.f77012a.getEditText());
        }
    }

    /* renamed from: com.google.android.material.textfield.d$l */
    public class C31667l implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ AutoCompleteTextView f77010a;

        public C31667l(AutoCompleteTextView autoCompleteTextView) {
            this.f77010a = autoCompleteTextView;
        }

        public boolean onTouch(@C0359n0 View view, @C0359n0 MotionEvent motionEvent) {
            if (motionEvent.getAction() == 1) {
                if (C31653d.this.mo91754G()) {
                    boolean unused = C31653d.this.f76987l = false;
                }
                C31653d.this.mo91759M(this.f77010a);
                C31653d.this.mo91760N();
            }
            return false;
        }
    }

    public C31653d(@C0359n0 TextInputLayout textInputLayout, @C0375v int i) {
        super(textInputLayout, i);
    }

    @C0359n0
    /* renamed from: C */
    public static AutoCompleteTextView m128306C(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    /* renamed from: H */
    public static boolean m128307H(@C0359n0 EditText editText) {
        return editText.getKeyListener() != null;
    }

    /* renamed from: A */
    public final void mo91749A(@C0359n0 AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @C0359n0 C31525j jVar) {
        LayerDrawable layerDrawable;
        int d = C31266s.m125953d(autoCompleteTextView, C31076a.C31079c.colorSurface);
        C31525j jVar2 = new C31525j(jVar.getShapeAppearanceModel());
        int m = C31266s.m125962m(i, d, 0.1f);
        jVar2.mo90777o0(new ColorStateList(iArr, new int[]{m, 0}));
        if (f76977t) {
            jVar2.setTint(d);
            ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m, d});
            C31525j jVar3 = new C31525j(jVar.getShapeAppearanceModel());
            jVar3.setTint(-1);
            layerDrawable = new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar2, jVar3), jVar});
        } else {
            layerDrawable = new LayerDrawable(new Drawable[]{jVar2, jVar});
        }
        C18196h2.m82502I1(autoCompleteTextView, layerDrawable);
    }

    /* renamed from: B */
    public final void mo91750B() {
        TextInputLayout textInputLayout;
        if (this.f76992q != null && (textInputLayout = this.f77012a) != null && C18196h2.m82521O0(textInputLayout)) {
            C18040c.m81906b(this.f76992q, this.f76986k);
        }
    }

    /* renamed from: D */
    public final ValueAnimator mo91751D(int i, float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C31093a.f74425a);
        ofFloat.setDuration((long) i);
        ofFloat.addUpdateListener(new C31658d());
        return ofFloat;
    }

    /* renamed from: E */
    public final C31525j mo91752E(float f, float f2, float f3, int i) {
        C31534o m = C31534o.m127561a().mo90836K(f).mo90841P(f).mo90853x(f2).mo90828C(f2).mo90843m();
        C31525j n = C31525j.m127461n(this.f77013b, f3);
        n.setShapeAppearanceModel(m);
        n.mo90782q0(0, i, 0, i);
        return n;
    }

    /* renamed from: F */
    public final void mo91753F() {
        this.f76994s = mo91751D(67, 0.0f, 1.0f);
        ValueAnimator D = mo91751D(50, 1.0f, 0.0f);
        this.f76993r = D;
        D.addListener(new C31657c());
    }

    /* renamed from: G */
    public final boolean mo91754G() {
        long currentTimeMillis = System.currentTimeMillis() - this.f76989n;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }

    /* renamed from: I */
    public final void mo91755I() {
        AccessibilityManager accessibilityManager = this.f76992q;
        if (accessibilityManager != null) {
            C18040c.m81911g(accessibilityManager, this.f76986k);
        }
    }

    /* renamed from: J */
    public final void mo91756J(boolean z) {
        if (this.f76988m != z) {
            this.f76988m = z;
            this.f76994s.cancel();
            this.f76993r.start();
        }
    }

    /* renamed from: K */
    public final void mo91757K(@C0359n0 AutoCompleteTextView autoCompleteTextView) {
        if (f76977t) {
            int boxBackgroundMode = this.f77012a.getBoxBackgroundMode();
            if (boxBackgroundMode == 2) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f76991p);
            } else if (boxBackgroundMode == 1) {
                autoCompleteTextView.setDropDownBackgroundDrawable(this.f76990o);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: L */
    public final void mo91758L(@C0359n0 AutoCompleteTextView autoCompleteTextView) {
        autoCompleteTextView.setOnTouchListener(new C31667l(autoCompleteTextView));
        autoCompleteTextView.setOnFocusChangeListener(this.f76981f);
        if (f76977t) {
            autoCompleteTextView.setOnDismissListener(new C31656b());
        }
    }

    /* renamed from: M */
    public final void mo91759M(@C0363p0 AutoCompleteTextView autoCompleteTextView) {
        if (autoCompleteTextView != null) {
            if (mo91754G()) {
                this.f76987l = false;
            }
            if (!this.f76987l) {
                if (f76977t) {
                    mo91756J(!this.f76988m);
                } else {
                    this.f76988m = !this.f76988m;
                    this.f77014c.toggle();
                }
                if (this.f76988m) {
                    autoCompleteTextView.requestFocus();
                    autoCompleteTextView.showDropDown();
                    return;
                }
                autoCompleteTextView.dismissDropDown();
                return;
            }
            this.f76987l = false;
        }
    }

    /* renamed from: N */
    public final void mo91760N() {
        this.f76987l = true;
        this.f76989n = System.currentTimeMillis();
    }

    /* renamed from: O */
    public void mo91761O(@C0359n0 AutoCompleteTextView autoCompleteTextView) {
        if (!m128307H(autoCompleteTextView) && this.f77012a.getBoxBackgroundMode() == 2 && (autoCompleteTextView.getBackground() instanceof LayerDrawable)) {
            mo91764y(autoCompleteTextView);
        }
    }

    /* renamed from: a */
    public void mo91727a() {
        float dimensionPixelOffset = (float) this.f77013b.getResources().getDimensionPixelOffset(C31076a.C31082f.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = (float) this.f77013b.getResources().getDimensionPixelOffset(C31076a.C31082f.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f77013b.getResources().getDimensionPixelOffset(C31076a.C31082f.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C31525j E = mo91752E(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        C31525j E2 = mo91752E(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.f76991p = E;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.f76990o = stateListDrawable;
        stateListDrawable.addState(new int[]{16842922}, E);
        this.f76990o.addState(new int[0], E2);
        int i = this.f77015d;
        if (i == 0) {
            if (f76977t) {
                i = C31076a.C31083g.mtrl_dropdown_arrow;
            } else {
                i = C31076a.C31083g.mtrl_ic_arrow_drop_down;
            }
        }
        this.f77012a.setEndIconDrawable(i);
        TextInputLayout textInputLayout = this.f77012a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(C31076a.C31089m.exposed_dropdown_menu_content_description));
        this.f77012a.setEndIconOnClickListener(new C31666k());
        this.f77012a.mo91528g(this.f76983h);
        this.f77012a.mo91582h(this.f76984i);
        mo91753F();
        this.f76992q = (AccessibilityManager) this.f77013b.getSystemService("accessibility");
        this.f77012a.addOnAttachStateChangeListener(this.f76985j);
        mo91750B();
    }

    /* renamed from: b */
    public boolean mo91762b(int i) {
        return i != 0;
    }

    /* renamed from: d */
    public boolean mo91763d() {
        return true;
    }

    /* renamed from: y */
    public final void mo91764y(@C0359n0 AutoCompleteTextView autoCompleteTextView) {
        if (!m128307H(autoCompleteTextView)) {
            int boxBackgroundMode = this.f77012a.getBoxBackgroundMode();
            C31525j boxBackground = this.f77012a.getBoxBackground();
            int d = C31266s.m125953d(autoCompleteTextView, C31076a.C31079c.colorControlHighlight);
            int[][] iArr = {new int[]{16842919}, new int[0]};
            if (boxBackgroundMode == 2) {
                mo91749A(autoCompleteTextView, d, iArr, boxBackground);
            } else if (boxBackgroundMode == 1) {
                mo91765z(autoCompleteTextView, d, iArr, boxBackground);
            }
        }
    }

    /* renamed from: z */
    public final void mo91765z(@C0359n0 AutoCompleteTextView autoCompleteTextView, int i, int[][] iArr, @C0359n0 C31525j jVar) {
        int boxBackgroundColor = this.f77012a.getBoxBackgroundColor();
        int[] iArr2 = {C31266s.m125962m(i, boxBackgroundColor, 0.1f), boxBackgroundColor};
        if (f76977t) {
            C18196h2.m82502I1(autoCompleteTextView, new RippleDrawable(new ColorStateList(iArr, iArr2), jVar, jVar));
            return;
        }
        C31525j jVar2 = new C31525j(jVar.getShapeAppearanceModel());
        jVar2.mo90777o0(new ColorStateList(iArr, iArr2));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{jVar, jVar2});
        int k0 = C18196h2.m82597k0(autoCompleteTextView);
        int paddingTop = autoCompleteTextView.getPaddingTop();
        int j0 = C18196h2.m82593j0(autoCompleteTextView);
        int paddingBottom = autoCompleteTextView.getPaddingBottom();
        C18196h2.m82502I1(autoCompleteTextView, layerDrawable);
        C18196h2.m82571d2(autoCompleteTextView, k0, paddingTop, j0, paddingBottom);
    }
}
