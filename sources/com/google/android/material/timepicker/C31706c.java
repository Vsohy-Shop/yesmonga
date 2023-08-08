package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* renamed from: com.google.android.material.timepicker.c */
public class C31706c implements InputFilter {

    /* renamed from: a */
    public int f77186a;

    public C31706c(int i) {
        this.f77186a = i;
    }

    /* renamed from: a */
    public int mo91977a() {
        return this.f77186a;
    }

    /* renamed from: b */
    public void mo91978b(int i) {
        this.f77186a = i;
    }

    public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i3, i4, charSequence.subSequence(i, i2).toString());
            if (Integer.parseInt(sb.toString()) <= this.f77186a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }
}
