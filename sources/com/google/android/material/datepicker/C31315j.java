package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import androidx.annotation.C0363p0;
import java.util.Collection;

/* renamed from: com.google.android.material.datepicker.j */
public class C31315j extends BaseAdapter {

    /* renamed from: f */
    public static final int f75474f = C31324p.m126275v().getMaximum(4);

    /* renamed from: a */
    public final Month f75475a;

    /* renamed from: b */
    public final DateSelector<?> f75476b;

    /* renamed from: c */
    public Collection<Long> f75477c;

    /* renamed from: d */
    public C31297b f75478d;

    /* renamed from: e */
    public final CalendarConstraints f75479e;

    public C31315j(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.f75475a = month;
        this.f75476b = dateSelector;
        this.f75479e = calendarConstraints;
        this.f75477c = dateSelector.mo89286C3();
    }

    /* renamed from: a */
    public int mo89435a(int i) {
        return mo89436b() + (i - 1);
    }

    /* renamed from: b */
    public int mo89436b() {
        return this.f75475a.mo89348w();
    }

    @C0363p0
    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f75475a.mo89348w() || i > mo89448i()) {
            return null;
        }
        return Long.valueOf(this.f75475a.mo89350y(mo89449j(i)));
    }

    /* JADX WARNING: type inference failed for: r7v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0083 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0084  */
    @androidx.annotation.C0359n0
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.widget.TextView getView(int r6, @androidx.annotation.C0363p0 android.view.View r7, @androidx.annotation.C0359n0 android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.mo89439e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x001e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.C31076a.C31087k.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x001e:
            int r7 = r5.mo89436b()
            int r7 = r6 - r7
            if (r7 < 0) goto L_0x0075
            com.google.android.material.datepicker.Month r8 = r5.f75475a
            int r2 = r8.f75357e
            if (r7 < r2) goto L_0x002d
            goto L_0x0075
        L_0x002d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.Month r8 = r5.f75475a
            long r7 = r8.mo89350y(r7)
            com.google.android.material.datepicker.Month r3 = r5.f75475a
            int r3 = r3.f75355c
            com.google.android.material.datepicker.Month r4 = com.google.android.material.datepicker.Month.m126074r()
            int r4 = r4.f75355c
            if (r3 != r4) goto L_0x0067
            java.lang.String r7 = com.google.android.material.datepicker.C31301d.m126150g(r7)
            r0.setContentDescription(r7)
            goto L_0x006e
        L_0x0067:
            java.lang.String r7 = com.google.android.material.datepicker.C31301d.m126155l(r7)
            r0.setContentDescription(r7)
        L_0x006e:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x007d
        L_0x0075:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L_0x007d:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L_0x0084
            return r0
        L_0x0084:
            long r6 = r6.longValue()
            r5.mo89450k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C31315j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    /* renamed from: e */
    public final void mo89439e(Context context) {
        if (this.f75478d == null) {
            this.f75478d = new C31297b(context);
        }
    }

    /* renamed from: f */
    public boolean mo89440f(int i) {
        return i % this.f75475a.f75356d == 0;
    }

    /* renamed from: g */
    public boolean mo89441g(int i) {
        return (i + 1) % this.f75475a.f75356d == 0;
    }

    public int getCount() {
        return this.f75475a.f75357e + mo89436b();
    }

    public long getItemId(int i) {
        return (long) (i / this.f75475a.f75356d);
    }

    /* renamed from: h */
    public final boolean mo89446h(long j) {
        for (Long longValue : this.f75476b.mo89286C3()) {
            if (C31324p.m126254a(j) == C31324p.m126254a(longValue.longValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean hasStableIds() {
        return true;
    }

    /* renamed from: i */
    public int mo89448i() {
        return (this.f75475a.mo89348w() + this.f75475a.f75357e) - 1;
    }

    /* renamed from: j */
    public int mo89449j(int i) {
        return (i - this.f75475a.mo89348w()) + 1;
    }

    /* renamed from: k */
    public final void mo89450k(@C0363p0 TextView textView, long j) {
        C31296a aVar;
        if (textView != null) {
            if (this.f75479e.mo89254f().mo89264F1(j)) {
                textView.setEnabled(true);
                if (mo89446h(j)) {
                    aVar = this.f75478d.f75384b;
                } else if (C31324p.m126273t().getTimeInMillis() == j) {
                    aVar = this.f75478d.f75385c;
                } else {
                    aVar = this.f75478d.f75383a;
                }
            } else {
                textView.setEnabled(false);
                aVar = this.f75478d.f75389g;
            }
            aVar.mo89383f(textView);
        }
    }

    /* renamed from: l */
    public final void mo89451l(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.m126073q(j).equals(this.f75475a)) {
            mo89450k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().mo89435a(this.f75475a.mo89351z(j)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    /* renamed from: m */
    public void mo89452m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long longValue : this.f75477c) {
            mo89451l(materialCalendarGridView, longValue.longValue());
        }
        DateSelector<?> dateSelector = this.f75476b;
        if (dateSelector != null) {
            for (Long longValue2 : dateSelector.mo89286C3()) {
                mo89451l(materialCalendarGridView, longValue2.longValue());
            }
            this.f75477c = this.f75476b.mo89286C3();
        }
    }

    /* renamed from: n */
    public boolean mo89453n(int i) {
        return i >= mo89436b() && i <= mo89448i();
    }
}
