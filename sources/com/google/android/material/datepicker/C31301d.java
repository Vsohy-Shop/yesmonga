package com.google.android.material.datepicker;

import android.content.Context;
import android.text.format.DateUtils;
import androidx.annotation.C0363p0;
import androidx.core.util.C17994n;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: com.google.android.material.datepicker.d */
public class C31301d {
    /* renamed from: a */
    public static C17994n<String, String> m126144a(@C0363p0 Long l, @C0363p0 Long l2) {
        return m126145b(l, l2, (SimpleDateFormat) null);
    }

    /* renamed from: b */
    public static C17994n<String, String> m126145b(@C0363p0 Long l, @C0363p0 Long l2, @C0363p0 SimpleDateFormat simpleDateFormat) {
        if (l == null && l2 == null) {
            return C17994n.m81748a(null, null);
        }
        if (l == null) {
            return C17994n.m81748a(null, m126147d(l2.longValue(), simpleDateFormat));
        }
        if (l2 == null) {
            return C17994n.m81748a(m126147d(l.longValue(), simpleDateFormat), null);
        }
        Calendar t = C31324p.m126273t();
        Calendar v = C31324p.m126275v();
        v.setTimeInMillis(l.longValue());
        Calendar v2 = C31324p.m126275v();
        v2.setTimeInMillis(l2.longValue());
        if (simpleDateFormat != null) {
            return C17994n.m81748a(simpleDateFormat.format(new Date(l.longValue())), simpleDateFormat.format(new Date(l2.longValue())));
        } else if (v.get(1) != v2.get(1)) {
            return C17994n.m81748a(m126154k(l.longValue(), Locale.getDefault()), m126154k(l2.longValue(), Locale.getDefault()));
        } else {
            if (v.get(1) == t.get(1)) {
                return C17994n.m81748a(m126149f(l.longValue(), Locale.getDefault()), m126149f(l2.longValue(), Locale.getDefault()));
            }
            return C17994n.m81748a(m126149f(l.longValue(), Locale.getDefault()), m126154k(l2.longValue(), Locale.getDefault()));
        }
    }

    /* renamed from: c */
    public static String m126146c(long j) {
        return m126147d(j, (SimpleDateFormat) null);
    }

    /* renamed from: d */
    public static String m126147d(long j, @C0363p0 SimpleDateFormat simpleDateFormat) {
        Calendar t = C31324p.m126273t();
        Calendar v = C31324p.m126275v();
        v.setTimeInMillis(j);
        if (simpleDateFormat != null) {
            return simpleDateFormat.format(new Date(j));
        }
        if (t.get(1) == v.get(1)) {
            return m126148e(j);
        }
        return m126153j(j);
    }

    /* renamed from: e */
    public static String m126148e(long j) {
        return m126149f(j, Locale.getDefault());
    }

    /* renamed from: f */
    public static String m126149f(long j, Locale locale) {
        return C31324p.m126256c(locale).format(new Date(j));
    }

    /* renamed from: g */
    public static String m126150g(long j) {
        return m126151h(j, Locale.getDefault());
    }

    /* renamed from: h */
    public static String m126151h(long j, Locale locale) {
        return C31324p.m126257d(locale).format(new Date(j));
    }

    /* renamed from: i */
    public static String m126152i(long j) {
        return DateUtils.formatDateTime((Context) null, j, 8228);
    }

    /* renamed from: j */
    public static String m126153j(long j) {
        return m126154k(j, Locale.getDefault());
    }

    /* renamed from: k */
    public static String m126154k(long j, Locale locale) {
        return C31324p.m126277x(locale).format(new Date(j));
    }

    /* renamed from: l */
    public static String m126155l(long j) {
        return m126156m(j, Locale.getDefault());
    }

    /* renamed from: m */
    public static String m126156m(long j, Locale locale) {
        return C31324p.m126278y(locale).format(new Date(j));
    }
}
