package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: com.google.android.material.timepicker.i */
public class C31717i implements TextView.OnEditorActionListener, View.OnKeyListener {

    /* renamed from: a */
    public final ChipTextInputComboView f77206a;

    /* renamed from: b */
    public final ChipTextInputComboView f77207b;

    /* renamed from: c */
    public final TimeModel f77208c;

    /* renamed from: d */
    public boolean f77209d = false;

    public C31717i(ChipTextInputComboView chipTextInputComboView, ChipTextInputComboView chipTextInputComboView2, TimeModel timeModel) {
        this.f77206a = chipTextInputComboView;
        this.f77207b = chipTextInputComboView2;
        this.f77208c = timeModel;
    }

    /* renamed from: a */
    public void mo91999a() {
        TextInputLayout e = this.f77206a.mo91855e();
        TextInputLayout e2 = this.f77207b.mo91855e();
        EditText editText = e.getEditText();
        EditText editText2 = e2.getEditText();
        editText.setImeOptions(268435461);
        editText2.setImeOptions(268435462);
        editText.setOnEditorActionListener(this);
        editText.setOnKeyListener(this);
        editText2.setOnKeyListener(this);
    }

    /* renamed from: b */
    public final void mo92000b(int i) {
        boolean z;
        ChipTextInputComboView chipTextInputComboView = this.f77207b;
        boolean z2 = true;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        ChipTextInputComboView chipTextInputComboView2 = this.f77206a;
        if (i != 10) {
            z2 = false;
        }
        chipTextInputComboView2.setChecked(z2);
        this.f77208c.f77123f = i;
    }

    /* renamed from: c */
    public final boolean mo92001c(int i, KeyEvent keyEvent, EditText editText) {
        boolean z;
        Editable text = editText.getText();
        if (text == null) {
            return false;
        }
        if (i >= 7 && i <= 16 && keyEvent.getAction() == 1 && editText.getSelectionStart() == 2 && text.length() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        mo92000b(12);
        return true;
    }

    /* renamed from: d */
    public final boolean mo92002d(int i, KeyEvent keyEvent, EditText editText) {
        boolean z;
        if (i == 67 && keyEvent.getAction() == 0 && TextUtils.isEmpty(editText.getText())) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        mo92000b(10);
        return true;
    }

    public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        boolean z = i == 5;
        if (z) {
            mo92000b(12);
        }
        return z;
    }

    public boolean onKey(View view, int i, KeyEvent keyEvent) {
        boolean z;
        if (this.f77209d) {
            return false;
        }
        this.f77209d = true;
        EditText editText = (EditText) view;
        if (this.f77208c.f77123f == 12) {
            z = mo92002d(i, keyEvent, editText);
        } else {
            z = mo92001c(i, keyEvent, editText);
        }
        this.f77209d = false;
        return z;
    }
}
