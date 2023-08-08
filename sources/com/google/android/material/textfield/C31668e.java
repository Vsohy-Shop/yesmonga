package com.google.android.material.textfield;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0375v;
import com.google.android.material.internal.CheckableImageButton;

/* renamed from: com.google.android.material.textfield.e */
public abstract class C31668e {

    /* renamed from: a */
    public TextInputLayout f77012a;

    /* renamed from: b */
    public Context f77013b;

    /* renamed from: c */
    public CheckableImageButton f77014c;
    @C0375v

    /* renamed from: d */
    public final int f77015d;

    public C31668e(@C0359n0 TextInputLayout textInputLayout, @C0375v int i) {
        this.f77012a = textInputLayout;
        this.f77013b = textInputLayout.getContext();
        this.f77014c = textInputLayout.getEndIconView();
        this.f77015d = i;
    }

    /* renamed from: a */
    public abstract void mo91727a();

    /* renamed from: b */
    public boolean mo91762b(int i) {
        return true;
    }

    /* renamed from: c */
    public void mo91728c(boolean z) {
    }

    /* renamed from: d */
    public boolean mo91763d() {
        return false;
    }
}
