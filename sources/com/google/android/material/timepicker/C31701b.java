package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.C0324b1;
import androidx.annotation.C0327c1;
import androidx.annotation.C0337f0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0375v;
import androidx.annotation.RestrictTo;
import androidx.core.view.C18196h2;
import androidx.fragment.app.C19215c;
import com.google.android.material.C31076a;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.C31499b;
import com.google.android.material.shape.C31525j;
import com.google.android.material.timepicker.TimePickerView;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.google.android.material.timepicker.b */
public final class C31701b extends C19215c implements TimePickerView.C31697e {

    /* renamed from: L0 */
    public static final int f77141L0 = 0;

    /* renamed from: M0 */
    public static final int f77142M0 = 1;

    /* renamed from: N0 */
    public static final String f77143N0 = "TIME_PICKER_TIME_MODEL";

    /* renamed from: O0 */
    public static final String f77144O0 = "TIME_PICKER_INPUT_MODE";

    /* renamed from: P0 */
    public static final String f77145P0 = "TIME_PICKER_TITLE_RES";

    /* renamed from: Q0 */
    public static final String f77146Q0 = "TIME_PICKER_TITLE_TEXT";

    /* renamed from: R0 */
    public static final String f77147R0 = "TIME_PICKER_POSITIVE_BUTTON_TEXT_RES";

    /* renamed from: S0 */
    public static final String f77148S0 = "TIME_PICKER_POSITIVE_BUTTON_TEXT";

    /* renamed from: T0 */
    public static final String f77149T0 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES";

    /* renamed from: U0 */
    public static final String f77150U0 = "TIME_PICKER_NEGATIVE_BUTTON_TEXT";

    /* renamed from: V0 */
    public static final String f77151V0 = "TIME_PICKER_OVERRIDE_THEME_RES_ID";
    @C0324b1

    /* renamed from: E0 */
    public int f77152E0 = 0;

    /* renamed from: F0 */
    public CharSequence f77153F0;

    /* renamed from: G0 */
    public MaterialButton f77154G0;

    /* renamed from: H0 */
    public Button f77155H0;

    /* renamed from: I0 */
    public int f77156I0 = 0;

    /* renamed from: J0 */
    public TimeModel f77157J0;

    /* renamed from: K0 */
    public int f77158K0 = 0;

    /* renamed from: X */
    public CharSequence f77159X;
    @C0324b1

    /* renamed from: Y */
    public int f77160Y = 0;

    /* renamed from: Z */
    public CharSequence f77161Z;

    /* renamed from: a */
    public final Set<View.OnClickListener> f77162a = new LinkedHashSet();

    /* renamed from: b */
    public final Set<View.OnClickListener> f77163b = new LinkedHashSet();

    /* renamed from: c */
    public final Set<DialogInterface.OnCancelListener> f77164c = new LinkedHashSet();

    /* renamed from: d */
    public final Set<DialogInterface.OnDismissListener> f77165d = new LinkedHashSet();

    /* renamed from: e */
    public TimePickerView f77166e;

    /* renamed from: f */
    public ViewStub f77167f;
    @C0363p0

    /* renamed from: g */
    public C31710f f77168g;
    @C0363p0

    /* renamed from: v */
    public C31718j f77169v;
    @C0363p0

    /* renamed from: w */
    public C31716h f77170w;
    @C0375v

    /* renamed from: x */
    public int f77171x;
    @C0375v

    /* renamed from: y */
    public int f77172y;
    @C0324b1

    /* renamed from: z */
    public int f77173z = 0;

    /* renamed from: com.google.android.material.timepicker.b$a */
    public class C31702a implements View.OnClickListener {
        public C31702a() {
        }

        public void onClick(View view) {
            for (View.OnClickListener onClick : C31701b.this.f77162a) {
                onClick.onClick(view);
            }
            C31701b.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.b$b */
    public class C31703b implements View.OnClickListener {
        public C31703b() {
        }

        public void onClick(View view) {
            for (View.OnClickListener onClick : C31701b.this.f77163b) {
                onClick.onClick(view);
            }
            C31701b.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.timepicker.b$c */
    public class C31704c implements View.OnClickListener {
        public C31704c() {
        }

        public void onClick(View view) {
            int i;
            C31701b bVar = C31701b.this;
            if (bVar.f77156I0 == 0) {
                i = 1;
            } else {
                i = 0;
            }
            int unused = bVar.f77156I0 = i;
            C31701b bVar2 = C31701b.this;
            bVar2.mo91961q1(bVar2.f77154G0);
        }
    }

    /* renamed from: com.google.android.material.timepicker.b$d */
    public static final class C31705d {

        /* renamed from: a */
        public TimeModel f77177a = new TimeModel();

        /* renamed from: b */
        public int f77178b;
        @C0324b1

        /* renamed from: c */
        public int f77179c = 0;

        /* renamed from: d */
        public CharSequence f77180d;
        @C0324b1

        /* renamed from: e */
        public int f77181e = 0;

        /* renamed from: f */
        public CharSequence f77182f;
        @C0324b1

        /* renamed from: g */
        public int f77183g = 0;

        /* renamed from: h */
        public CharSequence f77184h;

        /* renamed from: i */
        public int f77185i = 0;

        @C0359n0
        /* renamed from: j */
        public C31701b mo91965j() {
            return C31701b.m128541g1(this);
        }

        @C0359n0
        /* renamed from: k */
        public C31705d mo91966k(@C0337f0(from = 0, mo995to = 23) int i) {
            this.f77177a.mo91902h(i);
            return this;
        }

        @C0359n0
        /* renamed from: l */
        public C31705d mo91967l(int i) {
            this.f77178b = i;
            return this;
        }

        @C0359n0
        /* renamed from: m */
        public C31705d mo91968m(@C0337f0(from = 0, mo995to = 59) int i) {
            this.f77177a.mo91904i(i);
            return this;
        }

        @C0359n0
        /* renamed from: n */
        public C31705d mo91969n(@C0324b1 int i) {
            this.f77183g = i;
            return this;
        }

        @C0359n0
        /* renamed from: o */
        public C31705d mo91970o(@C0363p0 CharSequence charSequence) {
            this.f77184h = charSequence;
            return this;
        }

        @C0359n0
        /* renamed from: p */
        public C31705d mo91971p(@C0324b1 int i) {
            this.f77181e = i;
            return this;
        }

        @C0359n0
        /* renamed from: q */
        public C31705d mo91972q(@C0363p0 CharSequence charSequence) {
            this.f77182f = charSequence;
            return this;
        }

        @C0359n0
        /* renamed from: r */
        public C31705d mo91973r(@C0327c1 int i) {
            this.f77185i = i;
            return this;
        }

        @C0359n0
        /* renamed from: s */
        public C31705d mo91974s(int i) {
            TimeModel timeModel = this.f77177a;
            int i2 = timeModel.f77121d;
            int i3 = timeModel.f77122e;
            TimeModel timeModel2 = new TimeModel(i);
            this.f77177a = timeModel2;
            timeModel2.mo91904i(i3);
            this.f77177a.mo91902h(i2);
            return this;
        }

        @C0359n0
        /* renamed from: t */
        public C31705d mo91975t(@C0324b1 int i) {
            this.f77179c = i;
            return this;
        }

        @C0359n0
        /* renamed from: u */
        public C31705d mo91976u(@C0363p0 CharSequence charSequence) {
            this.f77180d = charSequence;
            return this;
        }
    }

    @C0359n0
    /* renamed from: g1 */
    public static C31701b m128541g1(@C0359n0 C31705d dVar) {
        C31701b bVar = new C31701b();
        Bundle bundle = new Bundle();
        bundle.putParcelable(f77143N0, dVar.f77177a);
        bundle.putInt(f77144O0, dVar.f77178b);
        bundle.putInt(f77145P0, dVar.f77179c);
        if (dVar.f77180d != null) {
            bundle.putCharSequence(f77146Q0, dVar.f77180d);
        }
        bundle.putInt(f77147R0, dVar.f77181e);
        if (dVar.f77182f != null) {
            bundle.putCharSequence(f77148S0, dVar.f77182f);
        }
        bundle.putInt(f77149T0, dVar.f77183g);
        if (dVar.f77184h != null) {
            bundle.putCharSequence(f77150U0, dVar.f77184h);
        }
        bundle.putInt(f77151V0, dVar.f77185i);
        bVar.setArguments(bundle);
        return bVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: F */
    public void mo91934F() {
        this.f77156I0 = 1;
        mo91961q1(this.f77154G0);
        this.f77169v.mo92008i();
    }

    /* renamed from: R0 */
    public boolean mo91937R0(@C0359n0 DialogInterface.OnCancelListener onCancelListener) {
        return this.f77164c.add(onCancelListener);
    }

    /* renamed from: S0 */
    public boolean mo91938S0(@C0359n0 DialogInterface.OnDismissListener onDismissListener) {
        return this.f77165d.add(onDismissListener);
    }

    /* renamed from: T0 */
    public boolean mo91939T0(@C0359n0 View.OnClickListener onClickListener) {
        return this.f77163b.add(onClickListener);
    }

    /* renamed from: U0 */
    public boolean mo91940U0(@C0359n0 View.OnClickListener onClickListener) {
        return this.f77162a.add(onClickListener);
    }

    /* renamed from: V0 */
    public void mo91941V0() {
        this.f77164c.clear();
    }

    /* renamed from: W0 */
    public void mo91942W0() {
        this.f77165d.clear();
    }

    /* renamed from: X0 */
    public void mo91943X0() {
        this.f77163b.clear();
    }

    /* renamed from: Y0 */
    public void mo91944Y0() {
        this.f77162a.clear();
    }

    /* renamed from: Z0 */
    public final Pair<Integer, Integer> mo91945Z0(int i) {
        if (i == 0) {
            return new Pair<>(Integer.valueOf(this.f77171x), Integer.valueOf(C31076a.C31089m.material_timepicker_text_input_mode_description));
        }
        if (i == 1) {
            return new Pair<>(Integer.valueOf(this.f77172y), Integer.valueOf(C31076a.C31089m.material_timepicker_clock_mode_description));
        }
        throw new IllegalArgumentException("no icon for mode: " + i);
    }

    @C0337f0(from = 0, mo995to = 23)
    /* renamed from: a1 */
    public int mo91946a1() {
        return this.f77157J0.f77121d % 24;
    }

    /* renamed from: b1 */
    public int mo91947b1() {
        return this.f77156I0;
    }

    @C0337f0(from = 0, mo995to = 59)
    /* renamed from: c1 */
    public int mo91948c1() {
        return this.f77157J0.f77122e;
    }

    /* renamed from: d1 */
    public final int mo91949d1() {
        int i = this.f77158K0;
        if (i != 0) {
            return i;
        }
        TypedValue a = C31499b.m127355a(requireContext(), C31076a.C31079c.materialTimePickerTheme);
        if (a == null) {
            return 0;
        }
        return a.data;
    }

    @C0363p0
    /* renamed from: e1 */
    public C31710f mo91950e1() {
        return this.f77168g;
    }

    /* renamed from: f1 */
    public final C31716h mo91951f1(int i, @C0359n0 TimePickerView timePickerView, @C0359n0 ViewStub viewStub) {
        if (i == 0) {
            C31710f fVar = this.f77168g;
            if (fVar == null) {
                fVar = new C31710f(timePickerView, this.f77157J0);
            }
            this.f77168g = fVar;
            return fVar;
        }
        if (this.f77169v == null) {
            this.f77169v = new C31718j((LinearLayout) viewStub.inflate(), this.f77157J0);
        }
        this.f77169v.mo92006g();
        return this.f77169v;
    }

    /* renamed from: h1 */
    public boolean mo91952h1(@C0359n0 DialogInterface.OnCancelListener onCancelListener) {
        return this.f77164c.remove(onCancelListener);
    }

    /* renamed from: i1 */
    public boolean mo91953i1(@C0359n0 DialogInterface.OnDismissListener onDismissListener) {
        return this.f77165d.remove(onDismissListener);
    }

    /* renamed from: j1 */
    public boolean mo91954j1(@C0359n0 View.OnClickListener onClickListener) {
        return this.f77163b.remove(onClickListener);
    }

    /* renamed from: k1 */
    public boolean mo91955k1(@C0359n0 View.OnClickListener onClickListener) {
        return this.f77162a.remove(onClickListener);
    }

    /* renamed from: l1 */
    public final void mo91956l1(@C0363p0 Bundle bundle) {
        if (bundle != null) {
            TimeModel timeModel = (TimeModel) bundle.getParcelable(f77143N0);
            this.f77157J0 = timeModel;
            if (timeModel == null) {
                this.f77157J0 = new TimeModel();
            }
            this.f77156I0 = bundle.getInt(f77144O0, 0);
            this.f77173z = bundle.getInt(f77145P0, 0);
            this.f77159X = bundle.getCharSequence(f77146Q0);
            this.f77160Y = bundle.getInt(f77147R0, 0);
            this.f77161Z = bundle.getCharSequence(f77148S0);
            this.f77152E0 = bundle.getInt(f77149T0, 0);
            this.f77153F0 = bundle.getCharSequence(f77150U0);
            this.f77158K0 = bundle.getInt(f77151V0, 0);
        }
    }

    @C0344h1
    /* renamed from: m1 */
    public void mo91957m1(@C0363p0 C31716h hVar) {
        this.f77170w = hVar;
    }

    /* renamed from: n1 */
    public void mo91958n1(@C0337f0(from = 0, mo995to = 23) int i) {
        this.f77157J0.mo91901g(i);
        C31716h hVar = this.f77170w;
        if (hVar != null) {
            hVar.invalidate();
        }
    }

    /* renamed from: o1 */
    public void mo91959o1(@C0337f0(from = 0, mo995to = 59) int i) {
        this.f77157J0.mo91904i(i);
        C31716h hVar = this.f77170w;
        if (hVar != null) {
            hVar.invalidate();
        }
    }

    public final void onCancel(@C0359n0 DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancel : this.f77164c) {
            onCancel.onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    public void onCreate(@C0363p0 Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        mo91956l1(bundle);
    }

    @C0359n0
    public final Dialog onCreateDialog(@C0363p0 Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), mo91949d1());
        Context context = dialog.getContext();
        int g = C31499b.m127361g(context, C31076a.C31079c.colorSurface, C31701b.class.getCanonicalName());
        int i = C31076a.C31079c.materialTimePickerStyle;
        int i2 = C31076a.C31090n.Widget_MaterialComponents_TimePicker;
        C31525j jVar = new C31525j(context, (AttributeSet) null, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C31076a.C31091o.MaterialTimePicker, i, i2);
        this.f77172y = obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialTimePicker_clockIcon, 0);
        this.f77171x = obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialTimePicker_keyboardIcon, 0);
        obtainStyledAttributes.recycle();
        jVar.mo90750Z(context);
        jVar.mo90777o0(ColorStateList.valueOf(g));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(jVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        jVar.mo90775n0(C18196h2.m82529R(window.getDecorView()));
        return dialog;
    }

    @C0359n0
    public final View onCreateView(@C0359n0 LayoutInflater layoutInflater, @C0363p0 ViewGroup viewGroup, @C0363p0 Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(C31076a.C31087k.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(C31076a.C31084h.material_timepicker_view);
        this.f77166e = timePickerView;
        timePickerView.mo91914D(this);
        this.f77167f = (ViewStub) viewGroup2.findViewById(C31076a.C31084h.material_textinput_timepicker);
        this.f77154G0 = (MaterialButton) viewGroup2.findViewById(C31076a.C31084h.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(C31076a.C31084h.header_title);
        int i = this.f77173z;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.f77159X)) {
            textView.setText(this.f77159X);
        }
        mo91961q1(this.f77154G0);
        Button button = (Button) viewGroup2.findViewById(C31076a.C31084h.material_timepicker_ok_button);
        button.setOnClickListener(new C31702a());
        int i2 = this.f77160Y;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.f77161Z)) {
            button.setText(this.f77161Z);
        }
        Button button2 = (Button) viewGroup2.findViewById(C31076a.C31084h.material_timepicker_cancel_button);
        this.f77155H0 = button2;
        button2.setOnClickListener(new C31703b());
        int i3 = this.f77152E0;
        if (i3 != 0) {
            this.f77155H0.setText(i3);
        } else if (!TextUtils.isEmpty(this.f77153F0)) {
            this.f77155H0.setText(this.f77153F0);
        }
        mo91960p1();
        this.f77154G0.setOnClickListener(new C31704c());
        return viewGroup2;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f77170w = null;
        this.f77168g = null;
        this.f77169v = null;
        TimePickerView timePickerView = this.f77166e;
        if (timePickerView != null) {
            timePickerView.mo91914D((TimePickerView.C31697e) null);
            this.f77166e = null;
        }
    }

    public final void onDismiss(@C0359n0 DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismiss : this.f77165d) {
            onDismiss.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onSaveInstanceState(@C0359n0 Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable(f77143N0, this.f77157J0);
        bundle.putInt(f77144O0, this.f77156I0);
        bundle.putInt(f77145P0, this.f77173z);
        bundle.putCharSequence(f77146Q0, this.f77159X);
        bundle.putInt(f77147R0, this.f77160Y);
        bundle.putCharSequence(f77148S0, this.f77161Z);
        bundle.putInt(f77149T0, this.f77152E0);
        bundle.putCharSequence(f77150U0, this.f77153F0);
        bundle.putInt(f77151V0, this.f77158K0);
    }

    /* renamed from: p1 */
    public final void mo91960p1() {
        int i;
        Button button = this.f77155H0;
        if (button != null) {
            if (isCancelable()) {
                i = 0;
            } else {
                i = 8;
            }
            button.setVisibility(i);
        }
    }

    /* renamed from: q1 */
    public final void mo91961q1(MaterialButton materialButton) {
        if (materialButton != null && this.f77166e != null && this.f77167f != null) {
            C31716h hVar = this.f77170w;
            if (hVar != null) {
                hVar.mo91990c();
            }
            C31716h f1 = mo91951f1(this.f77156I0, this.f77166e, this.f77167f);
            this.f77170w = f1;
            f1.mo91988a();
            this.f77170w.invalidate();
            Pair<Integer, Integer> Z0 = mo91945Z0(this.f77156I0);
            materialButton.setIconResource(((Integer) Z0.first).intValue());
            materialButton.setContentDescription(getResources().getString(((Integer) Z0.second).intValue()));
            materialButton.sendAccessibilityEvent(4);
        }
    }

    public void setCancelable(boolean z) {
        super.setCancelable(z);
        mo91960p1();
    }
}
