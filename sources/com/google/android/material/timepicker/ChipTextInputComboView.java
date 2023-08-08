package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.C31421o;
import com.google.android.material.internal.C31432x;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;

class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* renamed from: a */
    public final Chip f77070a;

    /* renamed from: b */
    public final TextInputLayout f77071b;

    /* renamed from: c */
    public final EditText f77072c;

    /* renamed from: d */
    public TextWatcher f77073d;

    /* renamed from: e */
    public TextView f77074e;

    /* renamed from: com.google.android.material.timepicker.ChipTextInputComboView$b */
    public class C31685b extends C31421o {

        /* renamed from: b */
        public static final String f77075b = "00";

        public C31685b() {
        }

        public void afterTextChanged(Editable editable) {
            if (TextUtils.isEmpty(editable)) {
                ChipTextInputComboView.this.f77070a.setText(ChipTextInputComboView.this.mo91854d("00"));
            } else {
                ChipTextInputComboView.this.f77070a.setText(ChipTextInputComboView.this.mo91854d(editable));
            }
        }
    }

    public ChipTextInputComboView(@C0359n0 Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    public void mo91853c(InputFilter inputFilter) {
        InputFilter[] filters = this.f77072c.getFilters();
        InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
        inputFilterArr[filters.length] = inputFilter;
        this.f77072c.setFilters(inputFilterArr);
    }

    /* renamed from: d */
    public final String mo91854d(CharSequence charSequence) {
        return TimeModel.m128496a(getResources(), charSequence);
    }

    /* renamed from: e */
    public TextInputLayout mo91855e() {
        return this.f77071b;
    }

    /* renamed from: f */
    public void mo91856f(C18019a aVar) {
        C18196h2.m82474B1(this.f77070a, aVar);
    }

    /* renamed from: g */
    public void mo91857g(boolean z) {
        this.f77072c.setCursorVisible(z);
    }

    /* renamed from: h */
    public void mo91858h(CharSequence charSequence) {
        this.f77074e.setText(charSequence);
    }

    /* renamed from: i */
    public void mo91859i(CharSequence charSequence) {
        this.f77070a.setText(mo91854d(charSequence));
        if (!TextUtils.isEmpty(this.f77072c.getText())) {
            this.f77072c.removeTextChangedListener(this.f77073d);
            this.f77072c.setText((CharSequence) null);
            this.f77072c.addTextChangedListener(this.f77073d);
        }
    }

    public boolean isChecked() {
        return this.f77070a.isChecked();
    }

    /* renamed from: j */
    public final void mo91861j() {
        this.f77072c.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        mo91861j();
    }

    public void setChecked(boolean z) {
        int i;
        this.f77070a.setChecked(z);
        EditText editText = this.f77072c;
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        editText.setVisibility(i);
        Chip chip = this.f77070a;
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (isChecked()) {
            C31432x.m127021p(this.f77072c);
            if (!TextUtils.isEmpty(this.f77072c.getText())) {
                EditText editText2 = this.f77072c;
                editText2.setSelection(editText2.getText().length());
            }
        }
    }

    public void setOnClickListener(@C0363p0 View.OnClickListener onClickListener) {
        this.f77070a.setOnClickListener(onClickListener);
    }

    public void setTag(int i, Object obj) {
        this.f77070a.setTag(i, obj);
    }

    public void toggle() {
        this.f77070a.toggle();
    }

    public ChipTextInputComboView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(C31076a.C31087k.material_time_chip, this, false);
        this.f77070a = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(C31076a.C31087k.material_time_input, this, false);
        this.f77071b = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f77072c = editText;
        editText.setVisibility(4);
        C31685b bVar = new C31685b();
        this.f77073d = bVar;
        editText.addTextChangedListener(bVar);
        mo91861j();
        addView(chip);
        addView(textInputLayout);
        this.f77074e = (TextView) findViewById(C31076a.C31084h.material_label);
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
