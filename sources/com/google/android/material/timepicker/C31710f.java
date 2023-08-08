package com.google.android.material.timepicker;

import android.content.Context;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import androidx.core.content.C17318d;
import androidx.core.view.accessibility.C18065l0;
import com.carrefour.fid.android.checkout.data.api.datasources.PaymentDataSource;
import com.carrefour.fid.android.core.constants.C36178i;
import com.carrefour.fid.android.shared.constant.C28561l1;
import com.google.android.material.C31076a;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimePickerView;

/* renamed from: com.google.android.material.timepicker.f */
public class C31710f implements ClockHandView.C31691d, TimePickerView.C31699g, TimePickerView.C31698f, ClockHandView.C31690c, C31716h {

    /* renamed from: f */
    public static final String[] f77194f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", C28561l1.f69523p, "11"};

    /* renamed from: g */
    public static final String[] f77195g = {"00", "2", "4", "6", "8", C28561l1.f69523p, "12", "14", C36178i.f89319n, "18", "20", PaymentDataSource.f101593c};

    /* renamed from: v */
    public static final String[] f77196v = {"00", "5", C28561l1.f69523p, "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: w */
    public static final int f77197w = 30;

    /* renamed from: x */
    public static final int f77198x = 6;

    /* renamed from: a */
    public final TimePickerView f77199a;

    /* renamed from: b */
    public final TimeModel f77200b;

    /* renamed from: c */
    public float f77201c;

    /* renamed from: d */
    public float f77202d;

    /* renamed from: e */
    public boolean f77203e = false;

    /* renamed from: com.google.android.material.timepicker.f$a */
    public class C31711a extends C31700a {
        public C31711a(Context context, int i) {
            super(context, i);
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52607d1(view.getResources().getString(C31076a.C31089m.material_hour_suffix, new Object[]{String.valueOf(C31710f.this.f77200b.mo91896c())}));
        }
    }

    /* renamed from: com.google.android.material.timepicker.f$b */
    public class C31712b extends C31700a {
        public C31712b(Context context, int i) {
            super(context, i);
        }

        /* renamed from: g */
        public void mo19938g(View view, C18065l0 l0Var) {
            super.mo19938g(view, l0Var);
            l0Var.mo52607d1(view.getResources().getString(C31076a.C31089m.material_minute_suffix, new Object[]{String.valueOf(C31710f.this.f77200b.f77122e)}));
        }
    }

    public C31710f(TimePickerView timePickerView, TimeModel timeModel) {
        this.f77199a = timePickerView;
        this.f77200b = timeModel;
        mo91989b();
    }

    /* renamed from: a */
    public void mo91988a() {
        this.f77199a.setVisibility(0);
    }

    /* renamed from: b */
    public void mo91989b() {
        if (this.f77200b.f77120c == 0) {
            this.f77199a.mo91919I();
        }
        this.f77199a.mo91928x(this);
        this.f77199a.mo91916F(this);
        this.f77199a.mo91915E(this);
        this.f77199a.mo91913C(this);
        mo91997n();
        invalidate();
    }

    /* renamed from: c */
    public void mo91990c() {
        this.f77199a.setVisibility(8);
    }

    /* renamed from: d */
    public void mo91895d(float f, boolean z) {
        boolean z2;
        this.f77203e = true;
        TimeModel timeModel = this.f77200b;
        int i = timeModel.f77122e;
        int i2 = timeModel.f77121d;
        if (timeModel.f77123f == 10) {
            this.f77199a.mo91930z(this.f77202d, false);
            AccessibilityManager accessibilityManager = (AccessibilityManager) C17318d.m79732o(this.f77199a.getContext(), AccessibilityManager.class);
            if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2) {
                mo91995l(12, true);
            }
        } else {
            int round = Math.round(f);
            if (!z) {
                this.f77200b.mo91904i(((round + 15) / 30) * 5);
                this.f77201c = (float) (this.f77200b.f77122e * 6);
            }
            this.f77199a.mo91930z(this.f77201c, z);
        }
        this.f77203e = false;
        mo91996m();
        mo91994k(i2, i);
    }

    /* renamed from: e */
    public void mo91935e(int i) {
        this.f77200b.mo91905j(i);
    }

    /* renamed from: f */
    public void mo91936f(int i) {
        mo91995l(i, true);
    }

    /* renamed from: g */
    public void mo91871g(float f, boolean z) {
        if (!this.f77203e) {
            TimeModel timeModel = this.f77200b;
            int i = timeModel.f77121d;
            int i2 = timeModel.f77122e;
            int round = Math.round(f);
            TimeModel timeModel2 = this.f77200b;
            if (timeModel2.f77123f == 12) {
                timeModel2.mo91904i((round + 3) / 6);
                this.f77201c = (float) Math.floor((double) (this.f77200b.f77122e * 6));
            } else {
                this.f77200b.mo91901g((round + (mo91991i() / 2)) / mo91991i());
                this.f77202d = (float) (this.f77200b.mo91896c() * mo91991i());
            }
            if (!z) {
                mo91996m();
                mo91994k(i, i2);
            }
        }
    }

    /* renamed from: i */
    public final int mo91991i() {
        return this.f77200b.f77120c == 1 ? 15 : 30;
    }

    public void invalidate() {
        this.f77202d = (float) (this.f77200b.mo91896c() * mo91991i());
        TimeModel timeModel = this.f77200b;
        this.f77201c = (float) (timeModel.f77122e * 6);
        mo91995l(timeModel.f77123f, false);
        mo91996m();
    }

    /* renamed from: j */
    public final String[] mo91993j() {
        return this.f77200b.f77120c == 1 ? f77195g : f77194f;
    }

    /* renamed from: k */
    public final void mo91994k(int i, int i2) {
        TimeModel timeModel = this.f77200b;
        if (timeModel.f77122e != i2 || timeModel.f77121d != i) {
            this.f77199a.performHapticFeedback(4);
        }
    }

    /* renamed from: l */
    public void mo91995l(int i, boolean z) {
        boolean z2;
        String[] strArr;
        int i2;
        float f;
        if (i == 12) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.f77199a.mo91929y(z2);
        this.f77200b.f77123f = i;
        TimePickerView timePickerView = this.f77199a;
        if (z2) {
            strArr = f77196v;
        } else {
            strArr = mo91993j();
        }
        if (z2) {
            i2 = C31076a.C31089m.material_minute_suffix;
        } else {
            i2 = C31076a.C31089m.material_hour_suffix;
        }
        timePickerView.mo91924c(strArr, i2);
        TimePickerView timePickerView2 = this.f77199a;
        if (z2) {
            f = this.f77201c;
        } else {
            f = this.f77202d;
        }
        timePickerView2.mo91930z(f, z);
        this.f77199a.mo91922a(i);
        this.f77199a.mo91912B(new C31711a(this.f77199a.getContext(), C31076a.C31089m.material_hour_selection));
        this.f77199a.mo91911A(new C31712b(this.f77199a.getContext(), C31076a.C31089m.material_minute_selection));
    }

    /* renamed from: m */
    public final void mo91996m() {
        TimePickerView timePickerView = this.f77199a;
        TimeModel timeModel = this.f77200b;
        timePickerView.mo91923b(timeModel.f77124g, timeModel.mo91896c(), this.f77200b.f77122e);
    }

    /* renamed from: n */
    public final void mo91997n() {
        mo91998o(f77194f, TimeModel.f77117w);
        mo91998o(f77195g, TimeModel.f77117w);
        mo91998o(f77196v, TimeModel.f77116v);
    }

    /* renamed from: o */
    public final void mo91998o(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.m128497b(this.f77199a.getResources(), strArr[i], str);
        }
    }
}
