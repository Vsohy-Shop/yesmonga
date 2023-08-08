package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import androidx.annotation.C0359n0;
import com.google.android.material.C31076a;
import com.google.android.material.resources.C31499b;
import com.google.android.material.resources.C31500c;

/* renamed from: com.google.android.material.datepicker.b */
public final class C31297b {
    @C0359n0

    /* renamed from: a */
    public final C31296a f75383a;
    @C0359n0

    /* renamed from: b */
    public final C31296a f75384b;
    @C0359n0

    /* renamed from: c */
    public final C31296a f75385c;
    @C0359n0

    /* renamed from: d */
    public final C31296a f75386d;
    @C0359n0

    /* renamed from: e */
    public final C31296a f75387e;
    @C0359n0

    /* renamed from: f */
    public final C31296a f75388f;
    @C0359n0

    /* renamed from: g */
    public final C31296a f75389g;
    @C0359n0

    /* renamed from: h */
    public final Paint f75390h;

    public C31297b(@C0359n0 Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C31499b.m127361g(context, C31076a.C31079c.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), C31076a.C31091o.MaterialCalendar);
        this.f75383a = C31296a.m126131a(context, obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialCalendar_dayStyle, 0));
        this.f75389g = C31296a.m126131a(context, obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialCalendar_dayInvalidStyle, 0));
        this.f75384b = C31296a.m126131a(context, obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialCalendar_daySelectedStyle, 0));
        this.f75385c = C31296a.m126131a(context, obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialCalendar_dayTodayStyle, 0));
        ColorStateList a = C31500c.m127363a(context, obtainStyledAttributes, C31076a.C31091o.MaterialCalendar_rangeFillColor);
        this.f75386d = C31296a.m126131a(context, obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialCalendar_yearStyle, 0));
        this.f75387e = C31296a.m126131a(context, obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialCalendar_yearSelectedStyle, 0));
        this.f75388f = C31296a.m126131a(context, obtainStyledAttributes.getResourceId(C31076a.C31091o.MaterialCalendar_yearTodayStyle, 0));
        Paint paint = new Paint();
        this.f75390h = paint;
        paint.setColor(a.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
