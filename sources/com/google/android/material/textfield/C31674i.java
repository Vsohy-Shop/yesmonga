package com.google.android.material.textfield;

import android.text.TextWatcher;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.C0359n0;
import androidx.annotation.C0375v;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31421o;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.textfield.i */
public class C31674i extends C31668e {

    /* renamed from: e */
    public final TextWatcher f77051e = new C31675a();

    /* renamed from: f */
    public final TextInputLayout.C31638h f77052f = new C31676b();

    /* renamed from: g */
    public final TextInputLayout.C31639i f77053g = new C31677c();

    /* renamed from: com.google.android.material.textfield.i$a */
    public class C31675a extends C31421o {
        public C31675a() {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            C31674i iVar = C31674i.this;
            iVar.f77014c.setChecked(!iVar.mo91823g());
        }
    }

    /* renamed from: com.google.android.material.textfield.i$b */
    public class C31676b implements TextInputLayout.C31638h {
        public C31676b() {
        }

        /* renamed from: a */
        public void mo91725a(@C0359n0 TextInputLayout textInputLayout) {
            EditText editText = textInputLayout.getEditText();
            C31674i iVar = C31674i.this;
            iVar.f77014c.setChecked(!iVar.mo91823g());
            editText.removeTextChangedListener(C31674i.this.f77051e);
            editText.addTextChangedListener(C31674i.this.f77051e);
        }
    }

    /* renamed from: com.google.android.material.textfield.i$c */
    public class C31677c implements TextInputLayout.C31639i {

        /* renamed from: com.google.android.material.textfield.i$c$a */
        public class C31678a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ EditText f77057a;

            public C31678a(EditText editText) {
                this.f77057a = editText;
            }

            public void run() {
                this.f77057a.removeTextChangedListener(C31674i.this.f77051e);
            }
        }

        public C31677c() {
        }

        /* renamed from: a */
        public void mo91726a(@C0359n0 TextInputLayout textInputLayout, int i) {
            EditText editText = textInputLayout.getEditText();
            if (editText != null && i == 1) {
                editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                editText.post(new C31678a(editText));
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.i$d */
    public class C31679d implements View.OnClickListener {
        public C31679d() {
        }

        public void onClick(View view) {
            EditText editText = C31674i.this.f77012a.getEditText();
            if (editText != null) {
                int selectionEnd = editText.getSelectionEnd();
                if (C31674i.this.mo91823g()) {
                    editText.setTransformationMethod((TransformationMethod) null);
                } else {
                    editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    editText.setSelection(selectionEnd);
                }
                C31674i.this.f77012a.mo91584i0();
            }
        }
    }

    public C31674i(@C0359n0 TextInputLayout textInputLayout, @C0375v int i) {
        super(textInputLayout, i);
    }

    /* renamed from: h */
    public static boolean m128411h(EditText editText) {
        if (editText == null || (editText.getInputType() != 16 && editText.getInputType() != 128 && editText.getInputType() != 144 && editText.getInputType() != 224)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void mo91727a() {
        TextInputLayout textInputLayout = this.f77012a;
        int i = this.f77015d;
        if (i == 0) {
            i = C31076a.C31083g.design_password_eye;
        }
        textInputLayout.setEndIconDrawable(i);
        TextInputLayout textInputLayout2 = this.f77012a;
        textInputLayout2.setEndIconContentDescription(textInputLayout2.getResources().getText(C31076a.C31089m.password_toggle_content_description));
        this.f77012a.setEndIconVisible(true);
        this.f77012a.setEndIconCheckable(true);
        this.f77012a.setEndIconOnClickListener(new C31679d());
        this.f77012a.mo91528g(this.f77052f);
        this.f77012a.mo91582h(this.f77053g);
        EditText editText = this.f77012a.getEditText();
        if (m128411h(editText)) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    /* renamed from: g */
    public final boolean mo91823g() {
        EditText editText = this.f77012a.getEditText();
        if (editText == null || !(editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            return false;
        }
        return true;
    }
}
