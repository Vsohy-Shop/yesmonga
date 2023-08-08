package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0327c1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0722h1;
import androidx.core.view.C18196h2;
import androidx.core.view.C18306m0;
import androidx.core.view.C18353r0;
import androidx.core.view.accessibility.C18065l0;
import androidx.core.widget.C18496q;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31432x;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.resources.C31500c;

@SuppressLint({"ViewConstructor"})
/* renamed from: com.google.android.material.textfield.j */
public class C31680j extends LinearLayout {

    /* renamed from: a */
    public final TextInputLayout f77060a;

    /* renamed from: b */
    public final TextView f77061b;
    @C0363p0

    /* renamed from: c */
    public CharSequence f77062c;

    /* renamed from: d */
    public final CheckableImageButton f77063d;

    /* renamed from: e */
    public ColorStateList f77064e;

    /* renamed from: f */
    public PorterDuff.Mode f77065f;

    /* renamed from: g */
    public View.OnLongClickListener f77066g;

    /* renamed from: v */
    public boolean f77067v;

    public C31680j(TextInputLayout textInputLayout, C0722h1 h1Var) {
        super(textInputLayout.getContext());
        this.f77060a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, C18306m0.f46960b));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(C31076a.C31087k.design_text_input_start_icon, this, false);
        this.f77063d = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f77061b = appCompatTextView;
        mo91832g(h1Var);
        mo91831f(h1Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    @C0363p0
    /* renamed from: a */
    public CharSequence mo91826a() {
        return this.f77062c;
    }

    @C0363p0
    /* renamed from: b */
    public ColorStateList mo91827b() {
        return this.f77061b.getTextColors();
    }

    @C0359n0
    /* renamed from: c */
    public TextView mo91828c() {
        return this.f77061b;
    }

    @C0363p0
    /* renamed from: d */
    public CharSequence mo91829d() {
        return this.f77063d.getContentDescription();
    }

    @C0363p0
    /* renamed from: e */
    public Drawable mo91830e() {
        return this.f77063d.getDrawable();
    }

    /* renamed from: f */
    public final void mo91831f(C0722h1 h1Var) {
        this.f77061b.setVisibility(8);
        this.f77061b.setId(C31076a.C31084h.textinput_prefix_text);
        this.f77061b.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        C18196h2.m82482D1(this.f77061b, 1);
        mo91838m(h1Var.mo3479u(C31076a.C31091o.TextInputLayout_prefixTextAppearance, 0));
        int i = C31076a.C31091o.TextInputLayout_prefixTextColor;
        if (h1Var.mo3455C(i)) {
            mo91839n(h1Var.mo3462d(i));
        }
        mo91837l(h1Var.mo3482x(C31076a.C31091o.TextInputLayout_prefixText));
    }

    /* renamed from: g */
    public final void mo91832g(C0722h1 h1Var) {
        if (C31500c.m127371i(getContext())) {
            C18353r0.m83086g((ViewGroup.MarginLayoutParams) this.f77063d.getLayoutParams(), 0);
        }
        mo91844r((View.OnClickListener) null);
        mo91845s((View.OnLongClickListener) null);
        int i = C31076a.C31091o.TextInputLayout_startIconTint;
        if (h1Var.mo3455C(i)) {
            this.f77064e = C31500c.m127364b(getContext(), h1Var, i);
        }
        int i2 = C31076a.C31091o.TextInputLayout_startIconTintMode;
        if (h1Var.mo3455C(i2)) {
            this.f77065f = C31432x.m127017l(h1Var.mo3473o(i2, -1), (PorterDuff.Mode) null);
        }
        int i3 = C31076a.C31091o.TextInputLayout_startIconDrawable;
        if (h1Var.mo3455C(i3)) {
            mo91843q(h1Var.mo3466h(i3));
            int i4 = C31076a.C31091o.TextInputLayout_startIconContentDescription;
            if (h1Var.mo3455C(i4)) {
                mo91842p(h1Var.mo3482x(i4));
            }
            mo91840o(h1Var.mo3459a(C31076a.C31091o.TextInputLayout_startIconCheckable, true));
        }
    }

    /* renamed from: h */
    public boolean mo91833h() {
        return this.f77063d.mo89900a();
    }

    /* renamed from: i */
    public boolean mo91834i() {
        return this.f77063d.getVisibility() == 0;
    }

    /* renamed from: j */
    public void mo91835j(boolean z) {
        this.f77067v = z;
        mo91851y();
    }

    /* renamed from: k */
    public void mo91836k() {
        C31669f.m128356c(this.f77060a, this.f77063d, this.f77064e);
    }

    /* renamed from: l */
    public void mo91837l(@C0363p0 CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f77062c = charSequence2;
        this.f77061b.setText(charSequence);
        mo91851y();
    }

    /* renamed from: m */
    public void mo91838m(@C0327c1 int i) {
        C18496q.m83723E(this.f77061b, i);
    }

    /* renamed from: n */
    public void mo91839n(@C0359n0 ColorStateList colorStateList) {
        this.f77061b.setTextColor(colorStateList);
    }

    /* renamed from: o */
    public void mo91840o(boolean z) {
        this.f77063d.setCheckable(z);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        mo91850x();
    }

    /* renamed from: p */
    public void mo91842p(@C0363p0 CharSequence charSequence) {
        if (mo91829d() != charSequence) {
            this.f77063d.setContentDescription(charSequence);
        }
    }

    /* renamed from: q */
    public void mo91843q(@C0363p0 Drawable drawable) {
        this.f77063d.setImageDrawable(drawable);
        if (drawable != null) {
            C31669f.m128354a(this.f77060a, this.f77063d, this.f77064e, this.f77065f);
            mo91848v(true);
            mo91836k();
            return;
        }
        mo91848v(false);
        mo91844r((View.OnClickListener) null);
        mo91845s((View.OnLongClickListener) null);
        mo91842p((CharSequence) null);
    }

    /* renamed from: r */
    public void mo91844r(@C0363p0 View.OnClickListener onClickListener) {
        C31669f.m128358e(this.f77063d, onClickListener, this.f77066g);
    }

    /* renamed from: s */
    public void mo91845s(@C0363p0 View.OnLongClickListener onLongClickListener) {
        this.f77066g = onLongClickListener;
        C31669f.m128359f(this.f77063d, onLongClickListener);
    }

    /* renamed from: t */
    public void mo91846t(@C0363p0 ColorStateList colorStateList) {
        if (this.f77064e != colorStateList) {
            this.f77064e = colorStateList;
            C31669f.m128354a(this.f77060a, this.f77063d, colorStateList, this.f77065f);
        }
    }

    /* renamed from: u */
    public void mo91847u(@C0363p0 PorterDuff.Mode mode) {
        if (this.f77065f != mode) {
            this.f77065f = mode;
            C31669f.m128354a(this.f77060a, this.f77063d, this.f77064e, mode);
        }
    }

    /* renamed from: v */
    public void mo91848v(boolean z) {
        int i;
        if (mo91834i() != z) {
            CheckableImageButton checkableImageButton = this.f77063d;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            mo91850x();
            mo91851y();
        }
    }

    /* renamed from: w */
    public void mo91849w(@C0359n0 C18065l0 l0Var) {
        if (this.f77061b.getVisibility() == 0) {
            l0Var.mo52650r1(this.f77061b);
            l0Var.mo52578U1(this.f77061b);
            return;
        }
        l0Var.mo52578U1(this.f77063d);
    }

    /* renamed from: x */
    public void mo91850x() {
        int i;
        EditText editText = this.f77060a.f76915e;
        if (editText != null) {
            if (mo91834i()) {
                i = 0;
            } else {
                i = C18196h2.m82597k0(editText);
            }
            C18196h2.m82571d2(this.f77061b, i, editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(C31076a.C31082f.material_input_text_to_prefix_suffix_padding), editText.getCompoundPaddingBottom());
        }
    }

    /* renamed from: y */
    public final void mo91851y() {
        int i;
        boolean z;
        int i2 = 8;
        if (this.f77062c == null || this.f77067v) {
            i = 8;
        } else {
            i = 0;
        }
        if (this.f77063d.getVisibility() == 0 || i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = 0;
        }
        setVisibility(i2);
        this.f77061b.setVisibility(i);
        this.f77060a.mo91482F0();
    }
}
