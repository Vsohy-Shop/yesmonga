package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0327c1;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0364q;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C18196h2;
import androidx.core.widget.C18496q;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.animation.C31094b;
import com.google.android.material.resources.C31500c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.material.textfield.g */
public final class C31670g {

    /* renamed from: A */
    public static final int f77016A = 0;

    /* renamed from: B */
    public static final int f77017B = 1;

    /* renamed from: C */
    public static final int f77018C = 2;

    /* renamed from: v */
    public static final int f77019v = 217;

    /* renamed from: w */
    public static final int f77020w = 167;

    /* renamed from: x */
    public static final int f77021x = 0;

    /* renamed from: y */
    public static final int f77022y = 1;

    /* renamed from: z */
    public static final int f77023z = 2;

    /* renamed from: a */
    public final Context f77024a;
    @C0359n0

    /* renamed from: b */
    public final TextInputLayout f77025b;

    /* renamed from: c */
    public LinearLayout f77026c;

    /* renamed from: d */
    public int f77027d;

    /* renamed from: e */
    public FrameLayout f77028e;
    @C0363p0

    /* renamed from: f */
    public Animator f77029f;

    /* renamed from: g */
    public final float f77030g;

    /* renamed from: h */
    public int f77031h;

    /* renamed from: i */
    public int f77032i;
    @C0363p0

    /* renamed from: j */
    public CharSequence f77033j;

    /* renamed from: k */
    public boolean f77034k;
    @C0363p0

    /* renamed from: l */
    public TextView f77035l;
    @C0363p0

    /* renamed from: m */
    public CharSequence f77036m;

    /* renamed from: n */
    public int f77037n;
    @C0363p0

    /* renamed from: o */
    public ColorStateList f77038o;

    /* renamed from: p */
    public CharSequence f77039p;

    /* renamed from: q */
    public boolean f77040q;
    @C0363p0

    /* renamed from: r */
    public TextView f77041r;

    /* renamed from: s */
    public int f77042s;
    @C0363p0

    /* renamed from: t */
    public ColorStateList f77043t;

    /* renamed from: u */
    public Typeface f77044u;

    /* renamed from: com.google.android.material.textfield.g$a */
    public class C31671a extends AnimatorListenerAdapter {

        /* renamed from: a */
        public final /* synthetic */ int f77045a;

        /* renamed from: b */
        public final /* synthetic */ TextView f77046b;

        /* renamed from: c */
        public final /* synthetic */ int f77047c;

        /* renamed from: d */
        public final /* synthetic */ TextView f77048d;

        public C31671a(int i, TextView textView, int i2, TextView textView2) {
            this.f77045a = i;
            this.f77046b = textView;
            this.f77047c = i2;
            this.f77048d = textView2;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C31670g.this.f77031h = this.f77045a;
            Animator unused2 = C31670g.this.f77029f = null;
            TextView textView = this.f77046b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f77047c == 1 && C31670g.this.f77035l != null) {
                    C31670g.this.f77035l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f77048d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f77048d.setAlpha(1.0f);
            }
        }

        public void onAnimationStart(Animator animator) {
            TextView textView = this.f77048d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.g$b */
    public class C31672b extends View.AccessibilityDelegate {
        public C31672b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = C31670g.this.f77025b.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    public C31670g(@C0359n0 TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f77024a = context;
        this.f77025b = textInputLayout;
        this.f77030g = (float) context.getResources().getDimensionPixelSize(C31076a.C31082f.design_textinput_caption_translate_y);
    }

    /* renamed from: A */
    public void mo91776A() {
        mo91801h();
        int i = this.f77031h;
        if (i == 2) {
            this.f77032i = 0;
        }
        mo91797V(i, this.f77032i, mo91794S(this.f77041r, ""));
    }

    /* renamed from: B */
    public final boolean mo91777B(int i) {
        if (i != 1 || this.f77035l == null || TextUtils.isEmpty(this.f77033j)) {
            return false;
        }
        return true;
    }

    /* renamed from: C */
    public final boolean mo91778C(int i) {
        if (i != 2 || this.f77041r == null || TextUtils.isEmpty(this.f77039p)) {
            return false;
        }
        return true;
    }

    /* renamed from: D */
    public boolean mo91779D(int i) {
        return i == 0 || i == 1;
    }

    /* renamed from: E */
    public boolean mo91780E() {
        return this.f77034k;
    }

    /* renamed from: F */
    public boolean mo91781F() {
        return this.f77040q;
    }

    /* renamed from: G */
    public void mo91782G(TextView textView, int i) {
        FrameLayout frameLayout;
        if (this.f77026c != null) {
            if (!mo91779D(i) || (frameLayout = this.f77028e) == null) {
                this.f77026c.removeView(textView);
            } else {
                frameLayout.removeView(textView);
            }
            int i2 = this.f77027d - 1;
            this.f77027d = i2;
            mo91793R(this.f77026c, i2);
        }
    }

    /* renamed from: H */
    public final void mo91783H(int i, int i2) {
        TextView n;
        TextView n2;
        if (i != i2) {
            if (!(i2 == 0 || (n2 = mo91807n(i2)) == null)) {
                n2.setVisibility(0);
                n2.setAlpha(1.0f);
            }
            if (!(i == 0 || (n = mo91807n(i)) == null)) {
                n.setVisibility(4);
                if (i == 1) {
                    n.setText((CharSequence) null);
                }
            }
            this.f77031h = i2;
        }
    }

    /* renamed from: I */
    public void mo91784I(@C0363p0 CharSequence charSequence) {
        this.f77036m = charSequence;
        TextView textView = this.f77035l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    /* renamed from: J */
    public void mo91785J(boolean z) {
        if (this.f77034k != z) {
            mo91801h();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f77024a);
                this.f77035l = appCompatTextView;
                appCompatTextView.setId(C31076a.C31084h.textinput_error);
                this.f77035l.setTextAlignment(5);
                Typeface typeface = this.f77044u;
                if (typeface != null) {
                    this.f77035l.setTypeface(typeface);
                }
                mo91786K(this.f77037n);
                mo91787L(this.f77038o);
                mo91784I(this.f77036m);
                this.f77035l.setVisibility(4);
                C18196h2.m82482D1(this.f77035l, 1);
                mo91798e(this.f77035l, 0);
            } else {
                mo91819z();
                mo91782G(this.f77035l, 0);
                this.f77035l = null;
                this.f77025b.mo91484G0();
                this.f77025b.mo91510T0();
            }
            this.f77034k = z;
        }
    }

    /* renamed from: K */
    public void mo91786K(@C0327c1 int i) {
        this.f77037n = i;
        TextView textView = this.f77035l;
        if (textView != null) {
            this.f77025b.mo91607s0(textView, i);
        }
    }

    /* renamed from: L */
    public void mo91787L(@C0363p0 ColorStateList colorStateList) {
        this.f77038o = colorStateList;
        TextView textView = this.f77035l;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: M */
    public void mo91788M(@C0327c1 int i) {
        this.f77042s = i;
        TextView textView = this.f77041r;
        if (textView != null) {
            C18496q.m83723E(textView, i);
        }
    }

    /* renamed from: N */
    public void mo91789N(boolean z) {
        if (this.f77040q != z) {
            mo91801h();
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(this.f77024a);
                this.f77041r = appCompatTextView;
                appCompatTextView.setId(C31076a.C31084h.textinput_helper_text);
                this.f77041r.setTextAlignment(5);
                Typeface typeface = this.f77044u;
                if (typeface != null) {
                    this.f77041r.setTypeface(typeface);
                }
                this.f77041r.setVisibility(4);
                C18196h2.m82482D1(this.f77041r, 1);
                mo91788M(this.f77042s);
                mo91790O(this.f77043t);
                mo91798e(this.f77041r, 1);
                this.f77041r.setAccessibilityDelegate(new C31672b());
            } else {
                mo91776A();
                mo91782G(this.f77041r, 1);
                this.f77041r = null;
                this.f77025b.mo91484G0();
                this.f77025b.mo91510T0();
            }
            this.f77040q = z;
        }
    }

    /* renamed from: O */
    public void mo91790O(@C0363p0 ColorStateList colorStateList) {
        this.f77043t = colorStateList;
        TextView textView = this.f77041r;
        if (textView != null && colorStateList != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* renamed from: P */
    public final void mo91791P(@C0363p0 TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    /* renamed from: Q */
    public void mo91792Q(Typeface typeface) {
        if (typeface != this.f77044u) {
            this.f77044u = typeface;
            mo91791P(this.f77035l, typeface);
            mo91791P(this.f77041r, typeface);
        }
    }

    /* renamed from: R */
    public final void mo91793R(@C0359n0 ViewGroup viewGroup, int i) {
        if (i == 0) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: S */
    public final boolean mo91794S(@C0363p0 TextView textView, @C0359n0 CharSequence charSequence) {
        if (!C18196h2.m82539U0(this.f77025b) || !this.f77025b.isEnabled() || (this.f77032i == this.f77031h && textView != null && TextUtils.equals(textView.getText(), charSequence))) {
            return false;
        }
        return true;
    }

    /* renamed from: T */
    public void mo91795T(CharSequence charSequence) {
        mo91801h();
        this.f77033j = charSequence;
        this.f77035l.setText(charSequence);
        int i = this.f77031h;
        if (i != 1) {
            this.f77032i = 1;
        }
        mo91797V(i, this.f77032i, mo91794S(this.f77035l, charSequence));
    }

    /* renamed from: U */
    public void mo91796U(CharSequence charSequence) {
        mo91801h();
        this.f77039p = charSequence;
        this.f77041r.setText(charSequence);
        int i = this.f77031h;
        if (i != 2) {
            this.f77032i = 2;
        }
        mo91797V(i, this.f77032i, mo91794S(this.f77041r, charSequence));
    }

    /* renamed from: V */
    public final void mo91797V(int i, int i2, boolean z) {
        boolean z2 = z;
        if (i != i2) {
            if (z2) {
                AnimatorSet animatorSet = new AnimatorSet();
                this.f77029f = animatorSet;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = arrayList;
                int i3 = i;
                int i4 = i2;
                mo91802i(arrayList2, this.f77040q, this.f77041r, 2, i3, i4);
                mo91802i(arrayList2, this.f77034k, this.f77035l, 1, i3, i4);
                C31094b.m124650a(animatorSet, arrayList);
                animatorSet.addListener(new C31671a(i2, mo91807n(i), i, mo91807n(i2)));
                animatorSet.start();
            } else {
                mo91783H(i, i2);
            }
            this.f77025b.mo91484G0();
            this.f77025b.mo91494L0(z2);
            this.f77025b.mo91510T0();
        }
    }

    /* renamed from: e */
    public void mo91798e(TextView textView, int i) {
        if (this.f77026c == null && this.f77028e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f77024a);
            this.f77026c = linearLayout;
            linearLayout.setOrientation(0);
            this.f77025b.addView(this.f77026c, -1, -2);
            this.f77028e = new FrameLayout(this.f77024a);
            this.f77026c.addView(this.f77028e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f77025b.getEditText() != null) {
                mo91799f();
            }
        }
        if (mo91779D(i)) {
            this.f77028e.setVisibility(0);
            this.f77028e.addView(textView);
        } else {
            this.f77026c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f77026c.setVisibility(0);
        this.f77027d++;
    }

    /* renamed from: f */
    public void mo91799f() {
        if (mo91800g()) {
            EditText editText = this.f77025b.getEditText();
            boolean i = C31500c.m127371i(this.f77024a);
            LinearLayout linearLayout = this.f77026c;
            int i2 = C31076a.C31082f.material_helper_text_font_1_3_padding_horizontal;
            C18196h2.m82571d2(linearLayout, mo91816w(i, i2, C18196h2.m82597k0(editText)), mo91816w(i, C31076a.C31082f.material_helper_text_font_1_3_padding_top, this.f77024a.getResources().getDimensionPixelSize(C31076a.C31082f.material_helper_text_default_padding_top)), mo91816w(i, i2, C18196h2.m82593j0(editText)), 0);
        }
    }

    /* renamed from: g */
    public final boolean mo91800g() {
        return (this.f77026c == null || this.f77025b.getEditText() == null) ? false : true;
    }

    /* renamed from: h */
    public void mo91801h() {
        Animator animator = this.f77029f;
        if (animator != null) {
            animator.cancel();
        }
    }

    /* renamed from: i */
    public final void mo91802i(@C0359n0 List<Animator> list, boolean z, @C0363p0 TextView textView, int i, int i2, int i3) {
        boolean z2;
        if (textView != null && z) {
            if (i == i3 || i == i2) {
                if (i3 == i) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                list.add(mo91803j(textView, z2));
                if (i3 == i) {
                    list.add(mo91804k(textView));
                }
            }
        }
    }

    /* renamed from: j */
    public final ObjectAnimator mo91803j(TextView textView, boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.ALPHA, new float[]{f});
        ofFloat.setDuration(167);
        ofFloat.setInterpolator(C31093a.f74425a);
        return ofFloat;
    }

    /* renamed from: k */
    public final ObjectAnimator mo91804k(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, View.TRANSLATION_Y, new float[]{-this.f77030g, 0.0f});
        ofFloat.setDuration(217);
        ofFloat.setInterpolator(C31093a.f74428d);
        return ofFloat;
    }

    /* renamed from: l */
    public boolean mo91805l() {
        return mo91777B(this.f77031h);
    }

    /* renamed from: m */
    public boolean mo91806m() {
        return mo91777B(this.f77032i);
    }

    @C0363p0
    /* renamed from: n */
    public final TextView mo91807n(int i) {
        if (i == 1) {
            return this.f77035l;
        }
        if (i != 2) {
            return null;
        }
        return this.f77041r;
    }

    @C0363p0
    /* renamed from: o */
    public CharSequence mo91808o() {
        return this.f77036m;
    }

    @C0363p0
    /* renamed from: p */
    public CharSequence mo91809p() {
        return this.f77033j;
    }

    @C0354l
    /* renamed from: q */
    public int mo91810q() {
        TextView textView = this.f77035l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @C0363p0
    /* renamed from: r */
    public ColorStateList mo91811r() {
        TextView textView = this.f77035l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    /* renamed from: s */
    public CharSequence mo91812s() {
        return this.f77039p;
    }

    @C0363p0
    /* renamed from: t */
    public View mo91813t() {
        return this.f77041r;
    }

    @C0363p0
    /* renamed from: u */
    public ColorStateList mo91814u() {
        TextView textView = this.f77041r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @C0354l
    /* renamed from: v */
    public int mo91815v() {
        TextView textView = this.f77041r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    /* renamed from: w */
    public final int mo91816w(boolean z, @C0364q int i, int i2) {
        return z ? this.f77024a.getResources().getDimensionPixelSize(i) : i2;
    }

    /* renamed from: x */
    public boolean mo91817x() {
        return mo91778C(this.f77031h);
    }

    /* renamed from: y */
    public boolean mo91818y() {
        return mo91778C(this.f77032i);
    }

    /* renamed from: z */
    public void mo91819z() {
        this.f77033j = null;
        mo91801h();
        if (this.f77031h == 1) {
            if (!this.f77040q || TextUtils.isEmpty(this.f77039p)) {
                this.f77032i = 0;
            } else {
                this.f77032i = 2;
            }
        }
        mo91797V(this.f77031h, this.f77032i, mo91794S(this.f77035l, ""));
    }
}
