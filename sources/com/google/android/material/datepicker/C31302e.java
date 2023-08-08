package com.google.android.material.datepicker;

import android.os.Build;
import android.widget.BaseAdapter;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.Calendar;

/* renamed from: com.google.android.material.datepicker.e */
public class C31302e extends BaseAdapter {

    /* renamed from: d */
    public static final int f75402d = 4;

    /* renamed from: e */
    public static final int f75403e = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);
    @C0359n0

    /* renamed from: a */
    public final Calendar f75404a;

    /* renamed from: b */
    public final int f75405b;

    /* renamed from: c */
    public final int f75406c;

    public C31302e() {
        Calendar v = C31324p.m126275v();
        this.f75404a = v;
        this.f75405b = v.getMaximum(7);
        this.f75406c = v.getFirstDayOfWeek();
    }

    @C0363p0
    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f75405b) {
            return null;
        }
        return Integer.valueOf(mo89390b(i));
    }

    /* renamed from: b */
    public final int mo89390b(int i) {
        int i2 = i + this.f75406c;
        int i3 = this.f75405b;
        if (i2 > i3) {
            return i2 - i3;
        }
        return i2;
    }

    public int getCount() {
        return this.f75405b;
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @androidx.annotation.C0363p0
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, @androidx.annotation.C0363p0 android.view.View r7, @androidx.annotation.C0359n0 android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.C31076a.C31087k.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.f75404a
            int r6 = r5.mo89390b(r6)
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.f75404a
            int r3 = f75403e
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = com.google.android.material.C31076a.C31089m.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.f75404a
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C31302e.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
