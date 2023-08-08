package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0354l;
import androidx.appcompat.content.res.C0507a;
import androidx.core.content.C17318d;
import androidx.core.view.accessibility.C18065l0;
import com.google.android.material.C31076a;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.C31421o;
import com.google.android.material.timepicker.TimePickerView;
import java.lang.reflect.Field;
import java.util.Locale;

/* renamed from: com.google.android.material.timepicker.j */
public class C31718j implements TimePickerView.C31699g, C31716h {

    /* renamed from: a */
    public final LinearLayout f77210a;

    /* renamed from: b */
    public final TimeModel f77211b;

    /* renamed from: c */
    public final TextWatcher f77212c = new C31719a();

    /* renamed from: d */
    public final TextWatcher f77213d = new C31720b();

    /* renamed from: e */
    public final ChipTextInputComboView f77214e;

    /* renamed from: f */
    public final ChipTextInputComboView f77215f;

    /* renamed from: g */
    public final C31717i f77216g;

    /* renamed from: v */
    public final EditText f77217v;

    /* renamed from: w */
    public final EditText f77218w;

    /* renamed from: x */
    public MaterialButtonToggleGroup f77219x;

    /* renamed from: com.google.android.material.timepicker.j$a */
    public class C31719a extends C31421o {
        public C31719a() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    C31718j.this.f77211b.mo91904i(0);
                    return;
                }
                C31718j.this.f77211b.mo91904i(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.j$b */
    public class C31720b extends C31421o {
        public C31720b() {
        }

        public void afterTextChanged(Editable editable) {
            try {
                if (TextUtils.isEmpty(editable)) {
                    C31718j.this.f77211b.mo91901g(0);
                    return;
                }
                C31718j.this.f77211b.mo91901g(Integer.parseInt(editable.toString()));
            } catch (NumberFormatException unused) {
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.j$c */
    public class C31721c implements View.OnClickListener {
        public C31721c() {
        }

        public void onClick(View view) {
            C31718j.this.mo91936f(((Integer) view.getTag(C31076a.C31084h.selection_type)).intValue());
        }
    }

    /* renamed from: com.google.android.material.timepicker.j$d */
    public class C31722d extends C31700a {

        /* renamed from: e */
        public final /* synthetic */ TimeModel f77223e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31722d(Context context, int i, TimeModel timeModel) {
            super(context, i);
            this.f77223e = timeModel;
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52607d1(view.getResources().getString(C31076a.C31089m.material_hour_suffix, new Object[]{String.valueOf(this.f77223e.mo91896c())}));
        }
    }

    /* renamed from: com.google.android.material.timepicker.j$e */
    public class C31723e extends C31700a {

        /* renamed from: e */
        public final /* synthetic */ TimeModel f77225e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C31723e(Context context, int i, TimeModel timeModel) {
            super(context, i);
            this.f77225e = timeModel;
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52607d1(view.getResources().getString(C31076a.C31089m.material_minute_suffix, new Object[]{String.valueOf(this.f77225e.f77122e)}));
        }
    }

    /* renamed from: com.google.android.material.timepicker.j$f */
    public class C31724f implements MaterialButtonToggleGroup.C31195d {
        public C31724f() {
        }

        /* renamed from: a */
        public void mo88600a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2;
            if (i == C31076a.C31084h.material_clock_period_pm_button) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            C31718j.this.f77211b.mo91905j(i2);
        }
    }

    public C31718j(LinearLayout linearLayout, TimeModel timeModel) {
        this.f77210a = linearLayout;
        this.f77211b = timeModel;
        Resources resources = linearLayout.getResources();
        ChipTextInputComboView chipTextInputComboView = (ChipTextInputComboView) linearLayout.findViewById(C31076a.C31084h.material_minute_text_input);
        this.f77214e = chipTextInputComboView;
        ChipTextInputComboView chipTextInputComboView2 = (ChipTextInputComboView) linearLayout.findViewById(C31076a.C31084h.material_hour_text_input);
        this.f77215f = chipTextInputComboView2;
        int i = C31076a.C31084h.material_label;
        ((TextView) chipTextInputComboView.findViewById(i)).setText(resources.getString(C31076a.C31089m.material_timepicker_minute));
        ((TextView) chipTextInputComboView2.findViewById(i)).setText(resources.getString(C31076a.C31089m.material_timepicker_hour));
        int i2 = C31076a.C31084h.selection_type;
        chipTextInputComboView.setTag(i2, 12);
        chipTextInputComboView2.setTag(i2, 10);
        if (timeModel.f77120c == 0) {
            mo92010l();
        }
        C31721c cVar = new C31721c();
        chipTextInputComboView2.setOnClickListener(cVar);
        chipTextInputComboView.setOnClickListener(cVar);
        chipTextInputComboView2.mo91853c(timeModel.mo91897d());
        chipTextInputComboView.mo91853c(timeModel.mo91899e());
        this.f77217v = chipTextInputComboView2.mo91855e().getEditText();
        this.f77218w = chipTextInputComboView.mo91855e().getEditText();
        this.f77216g = new C31717i(chipTextInputComboView2, chipTextInputComboView, timeModel);
        chipTextInputComboView2.mo91856f(new C31722d(linearLayout.getContext(), C31076a.C31089m.material_hour_selection, timeModel));
        chipTextInputComboView.mo91856f(new C31723e(linearLayout.getContext(), C31076a.C31089m.material_minute_selection, timeModel));
        mo91989b();
    }

    /* renamed from: j */
    public static void m128626j(EditText editText, @C0354l int i) {
        Class<TextView> cls = TextView.class;
        try {
            Context context = editText.getContext();
            Field declaredField = cls.getDeclaredField("mCursorDrawableRes");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(editText);
            Field declaredField2 = cls.getDeclaredField("mEditor");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(editText);
            Field declaredField3 = obj.getClass().getDeclaredField("mCursorDrawable");
            declaredField3.setAccessible(true);
            Drawable b = C0507a.m2346b(context, i2);
            b.setColorFilter(i, PorterDuff.Mode.SRC_IN);
            declaredField3.set(obj, new Drawable[]{b, b});
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public void mo91988a() {
        this.f77210a.setVisibility(0);
    }

    /* renamed from: b */
    public void mo91989b() {
        mo92005e();
        mo92009k(this.f77211b);
        this.f77216g.mo91999a();
    }

    /* renamed from: c */
    public void mo91990c() {
        View focusedChild = this.f77210a.getFocusedChild();
        if (focusedChild == null) {
            this.f77210a.setVisibility(8);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) C17318d.m79732o(this.f77210a.getContext(), InputMethodManager.class);
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(focusedChild.getWindowToken(), 0);
        }
        this.f77210a.setVisibility(8);
    }

    /* renamed from: e */
    public final void mo92005e() {
        this.f77217v.addTextChangedListener(this.f77213d);
        this.f77218w.addTextChangedListener(this.f77212c);
    }

    /* renamed from: f */
    public void mo91936f(int i) {
        boolean z;
        this.f77211b.f77123f = i;
        ChipTextInputComboView chipTextInputComboView = this.f77214e;
        boolean z2 = true;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        ChipTextInputComboView chipTextInputComboView2 = this.f77215f;
        if (i != 10) {
            z2 = false;
        }
        chipTextInputComboView2.setChecked(z2);
        mo92011m();
    }

    /* renamed from: g */
    public void mo92006g() {
        this.f77214e.setChecked(false);
        this.f77215f.setChecked(false);
    }

    /* renamed from: h */
    public final void mo92007h() {
        this.f77217v.removeTextChangedListener(this.f77213d);
        this.f77218w.removeTextChangedListener(this.f77212c);
    }

    /* renamed from: i */
    public void mo92008i() {
        boolean z;
        ChipTextInputComboView chipTextInputComboView = this.f77214e;
        boolean z2 = true;
        if (this.f77211b.f77123f == 12) {
            z = true;
        } else {
            z = false;
        }
        chipTextInputComboView.setChecked(z);
        ChipTextInputComboView chipTextInputComboView2 = this.f77215f;
        if (this.f77211b.f77123f != 10) {
            z2 = false;
        }
        chipTextInputComboView2.setChecked(z2);
    }

    public void invalidate() {
        mo92009k(this.f77211b);
    }

    /* renamed from: k */
    public final void mo92009k(TimeModel timeModel) {
        mo92007h();
        Locale locale = this.f77210a.getResources().getConfiguration().locale;
        String format = String.format(locale, TimeModel.f77116v, new Object[]{Integer.valueOf(timeModel.f77122e)});
        String format2 = String.format(locale, TimeModel.f77116v, new Object[]{Integer.valueOf(timeModel.mo91896c())});
        this.f77214e.mo91859i(format);
        this.f77215f.mo91859i(format2);
        mo92005e();
        mo92011m();
    }

    /* renamed from: l */
    public final void mo92010l() {
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) this.f77210a.findViewById(C31076a.C31084h.material_clock_period_toggle);
        this.f77219x = materialButtonToggleGroup;
        materialButtonToggleGroup.mo88565b(new C31724f());
        this.f77219x.setVisibility(0);
        mo92011m();
    }

    /* renamed from: m */
    public final void mo92011m() {
        int i;
        MaterialButtonToggleGroup materialButtonToggleGroup = this.f77219x;
        if (materialButtonToggleGroup != null) {
            if (this.f77211b.f77124g == 0) {
                i = C31076a.C31084h.material_clock_period_am_button;
            } else {
                i = C31076a.C31084h.material_clock_period_pm_button;
            }
            materialButtonToggleGroup.mo88569e(i);
        }
    }
}
