package com.google.android.material.datepicker;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.material.C31076a;
import com.google.android.material.internal.C31421o;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

/* renamed from: com.google.android.material.datepicker.c */
public abstract class C31298c extends C31421o {

    /* renamed from: g */
    public static final int f75391g = 1000;
    @C0359n0

    /* renamed from: a */
    public final TextInputLayout f75392a;

    /* renamed from: b */
    public final DateFormat f75393b;

    /* renamed from: c */
    public final CalendarConstraints f75394c;

    /* renamed from: d */
    public final String f75395d;

    /* renamed from: e */
    public final Runnable f75396e;

    /* renamed from: f */
    public Runnable f75397f;

    /* renamed from: com.google.android.material.datepicker.c$a */
    public class C31299a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f75398a;

        public C31299a(String str) {
            this.f75398a = str;
        }

        public void run() {
            TextInputLayout a = C31298c.this.f75392a;
            DateFormat b = C31298c.this.f75393b;
            Context context = a.getContext();
            String string = context.getString(C31076a.C31089m.mtrl_picker_invalid_format);
            String format = String.format(context.getString(C31076a.C31089m.mtrl_picker_invalid_format_use), new Object[]{this.f75398a});
            String format2 = String.format(context.getString(C31076a.C31089m.mtrl_picker_invalid_format_example), new Object[]{b.format(new Date(C31324p.m126273t().getTimeInMillis()))});
            a.setError(string + "\n" + format + "\n" + format2);
            C31298c.this.mo89364e();
        }
    }

    /* renamed from: com.google.android.material.datepicker.c$b */
    public class C31300b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ long f75400a;

        public C31300b(long j) {
            this.f75400a = j;
        }

        public void run() {
            C31298c.this.f75392a.setError(String.format(C31298c.this.f75395d, new Object[]{C31301d.m126146c(this.f75400a)}));
            C31298c.this.mo89364e();
        }
    }

    public C31298c(String str, DateFormat dateFormat, @C0359n0 TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f75393b = dateFormat;
        this.f75392a = textInputLayout;
        this.f75394c = calendarConstraints;
        this.f75395d = textInputLayout.getContext().getString(C31076a.C31089m.mtrl_picker_out_of_range);
        this.f75396e = new C31299a(str);
    }

    /* renamed from: d */
    public final Runnable mo89384d(long j) {
        return new C31300b(j);
    }

    /* renamed from: e */
    public void mo89364e() {
    }

    /* renamed from: f */
    public abstract void mo89365f(@C0363p0 Long l);

    /* renamed from: g */
    public void mo89385g(View view, Runnable runnable) {
        view.postDelayed(runnable, 1000);
    }

    public void onTextChanged(@C0359n0 CharSequence charSequence, int i, int i2, int i3) {
        this.f75392a.removeCallbacks(this.f75396e);
        this.f75392a.removeCallbacks(this.f75397f);
        this.f75392a.setError((CharSequence) null);
        mo89365f((Long) null);
        if (!TextUtils.isEmpty(charSequence)) {
            try {
                Date parse = this.f75393b.parse(charSequence.toString());
                this.f75392a.setError((CharSequence) null);
                long time = parse.getTime();
                if (!this.f75394c.mo89254f().mo89264F1(time) || !this.f75394c.mo89261l(time)) {
                    Runnable d = mo89384d(time);
                    this.f75397f = d;
                    mo89385g(this.f75392a, d);
                    return;
                }
                mo89365f(Long.valueOf(parse.getTime()));
            } catch (ParseException unused) {
                mo89385g(this.f75392a, this.f75396e);
            }
        }
    }
}
