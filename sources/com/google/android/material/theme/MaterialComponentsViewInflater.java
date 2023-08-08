package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.appcompat.app.C0494s;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;

public class MaterialComponentsViewInflater extends C0494s {
    @C0359n0
    /* renamed from: c */
    public AppCompatAutoCompleteTextView mo1534c(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @C0359n0
    /* renamed from: d */
    public AppCompatButton mo1535d(@C0359n0 Context context, @C0359n0 AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @C0359n0
    /* renamed from: e */
    public AppCompatCheckBox mo1536e(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @C0359n0
    /* renamed from: k */
    public AppCompatRadioButton mo1542k(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @C0359n0
    /* renamed from: o */
    public AppCompatTextView mo1546o(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
