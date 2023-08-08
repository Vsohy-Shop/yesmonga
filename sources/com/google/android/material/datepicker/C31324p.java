package com.google.android.material.datepicker;

import android.annotation.TargetApi;
import android.content.res.Resources;
import android.icu.text.DateFormat;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.compose.material3.DatePickerDefaults;
import com.google.android.material.C31076a;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import p073j$.util.DesugarTimeZone;

/* renamed from: com.google.android.material.datepicker.p */
public class C31324p {

    /* renamed from: a */
    public static final String f75494a = "UTC";

    /* renamed from: b */
    public static AtomicReference<C31323o> f75495b = new AtomicReference<>();

    /* renamed from: A */
    public static void m126253A(@C0363p0 C31323o oVar) {
        f75495b.set(oVar);
    }

    /* renamed from: a */
    public static long m126254a(long j) {
        Calendar v = m126275v();
        v.setTimeInMillis(j);
        return m126259f(v).getTimeInMillis();
    }

    /* renamed from: b */
    public static int m126255b(@C0359n0 String str, @C0359n0 String str2, int i, int i2) {
        while (i2 >= 0 && i2 < str.length() && str2.indexOf(str.charAt(i2)) == -1) {
            if (str.charAt(i2) == '\'') {
                do {
                    i2 += i;
                    if (i2 < 0) {
                        break;
                    } else if (i2 >= str.length()) {
                        break;
                    }
                } while (str.charAt(i2) == '\'');
            }
            i2 += i;
        }
        return i2;
    }

    @TargetApi(24)
    /* renamed from: c */
    public static DateFormat m126256c(Locale locale) {
        return m126258e("MMMd", locale);
    }

    @TargetApi(24)
    /* renamed from: d */
    public static DateFormat m126257d(Locale locale) {
        return m126258e("MMMEd", locale);
    }

    @TargetApi(24)
    /* renamed from: e */
    public static DateFormat m126258e(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(m126274u());
        return instanceForSkeleton;
    }

    /* renamed from: f */
    public static Calendar m126259f(Calendar calendar) {
        Calendar w = m126276w(calendar);
        Calendar v = m126275v();
        v.set(w.get(1), w.get(2), w.get(5));
        return v;
    }

    /* renamed from: g */
    public static java.text.DateFormat m126260g(int i, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i, locale);
        dateInstance.setTimeZone(m126272s());
        return dateInstance;
    }

    /* renamed from: h */
    public static java.text.DateFormat m126261h() {
        return m126262i(Locale.getDefault());
    }

    /* renamed from: i */
    public static java.text.DateFormat m126262i(Locale locale) {
        return m126260g(0, locale);
    }

    /* renamed from: j */
    public static java.text.DateFormat m126263j() {
        return m126264k(Locale.getDefault());
    }

    /* renamed from: k */
    public static java.text.DateFormat m126264k(Locale locale) {
        return m126260g(2, locale);
    }

    /* renamed from: l */
    public static java.text.DateFormat m126265l() {
        return m126266m(Locale.getDefault());
    }

    /* renamed from: m */
    public static java.text.DateFormat m126266m(Locale locale) {
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) m126264k(locale);
        simpleDateFormat.applyPattern(m126279z(simpleDateFormat.toPattern()));
        return simpleDateFormat;
    }

    /* renamed from: n */
    public static SimpleDateFormat m126267n(String str) {
        return m126268o(str, Locale.getDefault());
    }

    /* renamed from: o */
    public static SimpleDateFormat m126268o(String str, Locale locale) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str, locale);
        simpleDateFormat.setTimeZone(m126272s());
        return simpleDateFormat;
    }

    /* renamed from: p */
    public static SimpleDateFormat m126269p() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(((SimpleDateFormat) java.text.DateFormat.getDateInstance(3, Locale.getDefault())).toPattern().replaceAll("\\s+", ""), Locale.getDefault());
        simpleDateFormat.setTimeZone(m126272s());
        simpleDateFormat.setLenient(false);
        return simpleDateFormat;
    }

    /* renamed from: q */
    public static String m126270q(Resources resources, SimpleDateFormat simpleDateFormat) {
        String pattern = simpleDateFormat.toPattern();
        String string = resources.getString(C31076a.C31089m.mtrl_picker_text_input_year_abbr);
        String string2 = resources.getString(C31076a.C31089m.mtrl_picker_text_input_month_abbr);
        String string3 = resources.getString(C31076a.C31089m.mtrl_picker_text_input_day_abbr);
        if (pattern.replaceAll("[^y]", "").length() == 1) {
            pattern = pattern.replace("y", "yyyy");
        }
        return pattern.replace("d", string3).replace("M", string2).replace("y", string);
    }

    /* renamed from: r */
    public static C31323o m126271r() {
        C31323o oVar = f75495b.get();
        if (oVar == null) {
            return C31323o.m126250e();
        }
        return oVar;
    }

    /* renamed from: s */
    public static TimeZone m126272s() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    /* renamed from: t */
    public static Calendar m126273t() {
        Calendar c = m126271r().mo89462c();
        c.set(11, 0);
        c.set(12, 0);
        c.set(13, 0);
        c.set(14, 0);
        c.setTimeZone(m126272s());
        return c;
    }

    @TargetApi(24)
    /* renamed from: u */
    public static android.icu.util.TimeZone m126274u() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    /* renamed from: v */
    public static Calendar m126275v() {
        return m126276w((Calendar) null);
    }

    /* renamed from: w */
    public static Calendar m126276w(@C0363p0 Calendar calendar) {
        Calendar instance = Calendar.getInstance(m126272s());
        if (calendar == null) {
            instance.clear();
        } else {
            instance.setTimeInMillis(calendar.getTimeInMillis());
        }
        return instance;
    }

    @TargetApi(24)
    /* renamed from: x */
    public static DateFormat m126277x(Locale locale) {
        return m126258e(DatePickerDefaults.f19308e, locale);
    }

    @TargetApi(24)
    /* renamed from: y */
    public static DateFormat m126278y(Locale locale) {
        return m126258e("yMMMEd", locale);
    }

    @C0359n0
    /* renamed from: z */
    public static String m126279z(@C0359n0 String str) {
        int b = m126255b(str, "yY", 1, 0);
        if (b >= str.length()) {
            return str;
        }
        String str2 = "EMd";
        int b2 = m126255b(str, str2, 1, b);
        if (b2 < str.length()) {
            str2 = str2 + ",";
        }
        return str.replace(str.substring(m126255b(str, str2, -1, b) + 1, b2), " ").trim();
    }
}
