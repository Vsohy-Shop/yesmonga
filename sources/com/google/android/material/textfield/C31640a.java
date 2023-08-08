package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.C0359n0;
import androidx.annotation.C0375v;
import com.google.android.material.C31076a;
import com.google.android.material.animation.C31093a;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.textfield.a */
public class C31640a extends C31668e {

    /* renamed from: k */
    public static final int f76955k = 100;

    /* renamed from: l */
    public static final int f76956l = 150;

    /* renamed from: m */
    public static final float f76957m = 0.8f;

    /* renamed from: e */
    public final TextWatcher f76958e = new C31641a();

    /* renamed from: f */
    public final View.OnFocusChangeListener f76959f = new C31642b();

    /* renamed from: g */
    public final TextInputLayout.C31638h f76960g = new C31643c();

    /* renamed from: h */
    public final TextInputLayout.C31639i f76961h = new C31644d();

    /* renamed from: i */
    public AnimatorSet f76962i;

    /* renamed from: j */
    public ValueAnimator f76963j;

    /* renamed from: com.google.android.material.textfield.a$a */
    public class C31641a implements TextWatcher {
        public C31641a() {
        }

        public void afterTextChanged(@C0359n0 Editable editable) {
            if (C31640a.this.f77012a.getSuffixText() == null) {
                C31640a aVar = C31640a.this;
                aVar.mo91729i(aVar.mo91733m());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.a$b */
    public class C31642b implements View.OnFocusChangeListener {
        public C31642b() {
        }

        public void onFocusChange(View view, boolean z) {
            C31640a aVar = C31640a.this;
            aVar.mo91729i(aVar.mo91733m());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$c */
    public class C31643c implements TextInputLayout.C31638h {
        public C31643c() {
        }

        /* renamed from: a */
        public void mo91725a(@C0359n0 TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            textInputLayout.setEndIconVisible(C31640a.this.mo91733m());
            editText.setOnFocusChangeListener(C31640a.this.f76959f);
            C31640a aVar = C31640a.this;
            aVar.f77014c.setOnFocusChangeListener(aVar.f76959f);
            editText.removeTextChangedListener(C31640a.this.f76958e);
            editText.addTextChangedListener(C31640a.this.f76958e);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$d */
    public class C31644d implements TextInputLayout.C31639i {

        /* renamed from: com.google.android.material.textfield.a$d$a */
        public class C31645a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ EditText f76968a;

            public C31645a(EditText editText) {
                this.f76968a = editText;
            }

            public void run() {
                this.f76968a.removeTextChangedListener(C31640a.this.f76958e);
                C31640a.this.mo91729i(true);
            }
        }

        public C31644d() {
        }

        /* renamed from: a */
        public void mo91726a(@C0359n0 TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 2) {
                editText.post(new C31645a(editText));
                if (editText.getOnFocusChangeListener() == C31640a.this.f76959f) {
                    editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
                if (C31640a.this.f77014c.getOnFocusChangeListener() == C31640a.this.f76959f) {
                    C31640a.this.f77014c.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.a$e */
    public class C31646e implements View.OnClickListener {
        public C31646e() {
        }

        public void onClick(View view) {
            Editable text = C31640a.this.f77012a.getEditText().getText();
            if (text != null) {
                text.clear();
            }
            C31640a.this.f77012a.mo91584i0();
        }
    }

    /* renamed from: com.google.android.material.textfield.a$f */
    public class C31647f extends AnimatorListenerAdapter {
        public C31647f() {
        }

        public void onAnimationStart(Animator animator) {
            C31640a.this.f77012a.setEndIconVisible(true);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$g */
    public class C31648g extends AnimatorListenerAdapter {
        public C31648g() {
        }

        public void onAnimationEnd(Animator animator) {
            C31640a.this.f77012a.setEndIconVisible(false);
        }
    }

    /* renamed from: com.google.android.material.textfield.a$h */
    public class C31649h implements ValueAnimator.AnimatorUpdateListener {
        public C31649h() {
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            C31640a.this.f77014c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.a$i */
    public class C31650i implements ValueAnimator.AnimatorUpdateListener {
        public C31650i() {
        }

        public void onAnimationUpdate(@C0359n0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C31640a.this.f77014c.setScaleX(floatValue);
            C31640a.this.f77014c.setScaleY(floatValue);
        }
    }

    public C31640a(@C0359n0 TextInputLayout textInputLayout, @C0375v int i) {
        super(textInputLayout, i);
    }

    /* renamed from: a */
    public void mo91727a() {
        TextInputLayout textInputLayout = this.f77012a;
        int i = this.f77015d;
        if (i == 0) {
            i = C31076a.C31083g.mtrl_ic_cancel;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f77012a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C31076a.C31089m.clear_text_end_icon_content_description));
        this.f77012a.setEndIconCheckable(false);
        this.f77012a.setEndIconOnClickListener(new C31646e());
        this.f77012a.mo91528g(this.f76960g);
        this.f77012a.mo91582h(this.f76961h);
        mo91732l();
    }

    /* renamed from: c */
    public void mo91728c(boolean z) {
        if (this.f77012a.getSuffixText() != null) {
            mo91729i(z);
        }
    }

    /* renamed from: i */
    public final void mo91729i(boolean z) {
        boolean z2;
        if (this.f77012a.mo91501P() == z) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !this.f76962i.isRunning()) {
            this.f76963j.cancel();
            this.f76962i.start();
            if (z2) {
                this.f76962i.end();
            }
        } else if (!z) {
            this.f76962i.cancel();
            this.f76963j.start();
            if (z2) {
                this.f76963j.end();
            }
        }
    }

    /* renamed from: j */
    public final ValueAnimator mo91730j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(C31093a.f74425a);
        ofFloat.setDuration(100);
        ofFloat.addUpdateListener(new C31649h());
        return ofFloat;
    }

    /* renamed from: k */
    public final ValueAnimator mo91731k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.8f, 1.0f});
        ofFloat.setInterpolator(C31093a.f74428d);
        ofFloat.setDuration(150);
        ofFloat.addUpdateListener(new C31650i());
        return ofFloat;
    }

    /* renamed from: l */
    public final void mo91732l() {
        ValueAnimator k = mo91731k();
        ValueAnimator j = mo91730j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f76962i = animatorSet;
        animatorSet.playTogether(new Animator[]{k, j});
        this.f76962i.addListener(new C31647f());
        ValueAnimator j2 = mo91730j(1.0f, 0.0f);
        this.f76963j = j2;
        j2.addListener(new C31648g());
    }

    /* renamed from: m */
    public final boolean mo91733m() {
        EditText editText = this.f77012a.getEditText();
        if (editText == null || ((!editText.hasFocus() && !this.f77014c.hasFocus()) || editText.getText().length() <= 0)) {
            return false;
        }
        return true;
    }
}
