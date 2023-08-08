package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.C0324b1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.C18019a;
import androidx.core.view.C18196h2;
import com.google.android.material.C31076a;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Locale;

class TimePickerView extends ConstraintLayout implements C31713g {

    /* renamed from: x */
    public static final String f77125x = "android.view.View";

    /* renamed from: a */
    public final Chip f77126a;

    /* renamed from: b */
    public final Chip f77127b;

    /* renamed from: c */
    public final ClockHandView f77128c;

    /* renamed from: d */
    public final ClockFaceView f77129d;

    /* renamed from: e */
    public final MaterialButtonToggleGroup f77130e;

    /* renamed from: f */
    public final View.OnClickListener f77131f;

    /* renamed from: g */
    public C31698f f77132g;

    /* renamed from: v */
    public C31699g f77133v;

    /* renamed from: w */
    public C31697e f77134w;

    /* renamed from: com.google.android.material.timepicker.TimePickerView$a */
    public class C31693a implements View.OnClickListener {
        public C31693a() {
        }

        public void onClick(View view) {
            if (TimePickerView.this.f77133v != null) {
                TimePickerView.this.f77133v.mo91936f(((Integer) view.getTag(C31076a.C31084h.selection_type)).intValue());
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$b */
    public class C31694b implements MaterialButtonToggleGroup.C31195d {
        public C31694b() {
        }

        /* renamed from: a */
        public void mo88600a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z) {
            int i2;
            if (i == C31076a.C31084h.material_clock_period_pm_button) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (TimePickerView.this.f77132g != null && z) {
                TimePickerView.this.f77132g.mo91935e(i2);
            }
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$c */
    public class C31695c extends GestureDetector.SimpleOnGestureListener {
        public C31695c() {
        }

        public boolean onDoubleTap(MotionEvent motionEvent) {
            C31697e w = TimePickerView.this.f77134w;
            if (w == null) {
                return false;
            }
            w.mo91934F();
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$d */
    public class C31696d implements View.OnTouchListener {

        /* renamed from: a */
        public final /* synthetic */ GestureDetector f77138a;

        public C31696d(GestureDetector gestureDetector) {
            this.f77138a = gestureDetector;
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f77138a.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$e */
    public interface C31697e {
        /* renamed from: F */
        void mo91934F();
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$f */
    public interface C31698f {
        /* renamed from: e */
        void mo91935e(int i);
    }

    /* renamed from: com.google.android.material.timepicker.TimePickerView$g */
    public interface C31699g {
        /* renamed from: f */
        void mo91936f(int i);
    }

    public TimePickerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    public void mo91911A(C18019a aVar) {
        C18196h2.m82474B1(this.f77126a, aVar);
    }

    /* renamed from: B */
    public void mo91912B(C18019a aVar) {
        C18196h2.m82474B1(this.f77127b, aVar);
    }

    /* renamed from: C */
    public void mo91913C(ClockHandView.C31690c cVar) {
        this.f77128c.mo91889o(cVar);
    }

    /* renamed from: D */
    public void mo91914D(@C0363p0 C31697e eVar) {
        this.f77134w = eVar;
    }

    /* renamed from: E */
    public void mo91915E(C31698f fVar) {
        this.f77132g = fVar;
    }

    /* renamed from: F */
    public void mo91916F(C31699g gVar) {
        this.f77133v = gVar;
    }

    /* renamed from: G */
    public final void mo91917G() {
        Chip chip = this.f77126a;
        int i = C31076a.C31084h.selection_type;
        chip.setTag(i, 12);
        this.f77127b.setTag(i, 10);
        this.f77126a.setOnClickListener(this.f77131f);
        this.f77127b.setOnClickListener(this.f77131f);
        this.f77126a.setAccessibilityClassName("android.view.View");
        this.f77127b.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: H */
    public final void mo91918H() {
        C31696d dVar = new C31696d(new GestureDetector(getContext(), new C31695c()));
        this.f77126a.setOnTouchListener(dVar);
        this.f77127b.setOnTouchListener(dVar);
    }

    /* renamed from: I */
    public void mo91919I() {
        this.f77130e.setVisibility(0);
    }

    /* renamed from: J */
    public final void mo91920J(Chip chip, boolean z) {
        int i;
        chip.setChecked(z);
        if (z) {
            i = 2;
        } else {
            i = 0;
        }
        C18196h2.m82482D1(chip, i);
    }

    /* renamed from: K */
    public final void mo91921K() {
        boolean z;
        if (this.f77130e.getVisibility() == 0) {
            C16934c cVar = new C16934c();
            cVar.mo50824H(this);
            int i = 1;
            if (C18196h2.m82553Z(this) == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 2;
            }
            cVar.mo50819F(C31076a.C31084h.material_clock_display, i);
            cVar.mo50900r(this);
        }
    }

    /* renamed from: a */
    public void mo91922a(int i) {
        boolean z;
        Chip chip = this.f77126a;
        boolean z2 = true;
        if (i == 12) {
            z = true;
        } else {
            z = false;
        }
        mo91920J(chip, z);
        Chip chip2 = this.f77127b;
        if (i != 10) {
            z2 = false;
        }
        mo91920J(chip2, z2);
    }

    @SuppressLint({"DefaultLocale"})
    /* renamed from: b */
    public void mo91923b(int i, int i2, int i3) {
        int i4;
        if (i == 1) {
            i4 = C31076a.C31084h.material_clock_period_pm_button;
        } else {
            i4 = C31076a.C31084h.material_clock_period_am_button;
        }
        this.f77130e.mo88569e(i4);
        Locale locale = getResources().getConfiguration().locale;
        String format = String.format(locale, TimeModel.f77116v, new Object[]{Integer.valueOf(i3)});
        String format2 = String.format(locale, TimeModel.f77116v, new Object[]{Integer.valueOf(i2)});
        if (!TextUtils.equals(this.f77126a.getText(), format)) {
            this.f77126a.setText(format);
        }
        if (!TextUtils.equals(this.f77127b.getText(), format2)) {
            this.f77127b.setText(format2);
        }
    }

    /* renamed from: c */
    public void mo91924c(String[] strArr, @C0324b1 int i) {
        this.f77129d.mo91870c(strArr, i);
    }

    /* renamed from: h */
    public void mo91925h(float f) {
        this.f77128c.mo91886l(f);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        mo91921K();
    }

    public void onVisibilityChanged(@C0359n0 View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            mo91921K();
        }
    }

    /* renamed from: x */
    public void mo91928x(ClockHandView.C31691d dVar) {
        this.f77128c.mo91876b(dVar);
    }

    /* renamed from: y */
    public void mo91929y(boolean z) {
        this.f77128c.mo91884j(z);
    }

    /* renamed from: z */
    public void mo91930z(float f, boolean z) {
        this.f77128c.mo91887m(f, z);
    }

    public TimePickerView(Context context, @C0363p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f77131f = new C31693a();
        LayoutInflater.from(context).inflate(C31076a.C31087k.material_timepicker, this);
        this.f77129d = (ClockFaceView) findViewById(C31076a.C31084h.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C31076a.C31084h.material_clock_period_toggle);
        this.f77130e = materialButtonToggleGroup;
        materialButtonToggleGroup.mo88565b(new C31694b());
        this.f77126a = (Chip) findViewById(C31076a.C31084h.material_minute_tv);
        this.f77127b = (Chip) findViewById(C31076a.C31084h.material_hour_tv);
        this.f77128c = (ClockHandView) findViewById(C31076a.C31084h.material_clock_hand);
        mo91918H();
        mo91917G();
    }
}
