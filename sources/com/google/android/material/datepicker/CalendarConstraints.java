package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.util.C17992m;
import java.util.Arrays;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C31270a();
    @C0359n0

    /* renamed from: a */
    public final Month f75289a;
    @C0359n0

    /* renamed from: b */
    public final Month f75290b;
    @C0359n0

    /* renamed from: c */
    public final DateValidator f75291c;
    @C0363p0

    /* renamed from: d */
    public Month f75292d;

    /* renamed from: e */
    public final int f75293e;

    /* renamed from: f */
    public final int f75294f;

    public interface DateValidator extends Parcelable {
        /* renamed from: F1 */
        boolean mo89264F1(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    public class C31270a implements Parcelable.Creator<CalendarConstraints> {
        @C0359n0
        /* renamed from: a */
        public CalendarConstraints createFromParcel(@C0359n0 Parcel parcel) {
            Class<Month> cls = Month.class;
            return new CalendarConstraints((Month) parcel.readParcelable(cls.getClassLoader()), (Month) parcel.readParcelable(cls.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(cls.getClassLoader()), (C31270a) null);
        }

        @C0359n0
        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, C31270a aVar) {
        this(month, month2, dateValidator, month3);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Month mo89252e(Month month) {
        if (month.compareTo(this.f75289a) < 0) {
            return this.f75289a;
        }
        if (month.compareTo(this.f75290b) > 0) {
            return this.f75290b;
        }
        return month;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.f75289a.equals(calendarConstraints.f75289a) || !this.f75290b.equals(calendarConstraints.f75290b) || !C17992m.m81740a(this.f75292d, calendarConstraints.f75292d) || !this.f75291c.equals(calendarConstraints.f75291c)) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public DateValidator mo89254f() {
        return this.f75291c;
    }

    @C0359n0
    /* renamed from: g */
    public Month mo89255g() {
        return this.f75290b;
    }

    /* renamed from: h */
    public int mo89256h() {
        return this.f75294f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f75289a, this.f75290b, this.f75292d, this.f75291c});
    }

    @C0363p0
    /* renamed from: i */
    public Month mo89258i() {
        return this.f75292d;
    }

    @C0359n0
    /* renamed from: j */
    public Month mo89259j() {
        return this.f75289a;
    }

    /* renamed from: k */
    public int mo89260k() {
        return this.f75293e;
    }

    /* renamed from: l */
    public boolean mo89261l(long j) {
        if (this.f75289a.mo89350y(1) <= j) {
            Month month = this.f75290b;
            if (j <= month.mo89350y(month.f75357e)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: m */
    public void mo89262m(@C0363p0 Month month) {
        this.f75292d = month;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f75289a, 0);
        parcel.writeParcelable(this.f75290b, 0);
        parcel.writeParcelable(this.f75292d, 0);
        parcel.writeParcelable(this.f75291c, 0);
    }

    public CalendarConstraints(@C0359n0 Month month, @C0359n0 Month month2, @C0359n0 DateValidator dateValidator, @C0363p0 Month month3) {
        this.f75289a = month;
        this.f75290b = month2;
        this.f75292d = month3;
        this.f75291c = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 == null || month3.compareTo(month2) <= 0) {
            this.f75294f = month.mo89342X(month2) + 1;
            this.f75293e = (month2.f75355c - month.f75355c) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$b */
    public static final class C31271b {

        /* renamed from: e */
        public static final long f75295e = C31324p.m126254a(Month.m126072g(1900, 0).f75358f);

        /* renamed from: f */
        public static final long f75296f = C31324p.m126254a(Month.m126072g(2100, 11).f75358f);

        /* renamed from: g */
        public static final String f75297g = "DEEP_COPY_VALIDATOR_KEY";

        /* renamed from: a */
        public long f75298a = f75295e;

        /* renamed from: b */
        public long f75299b = f75296f;

        /* renamed from: c */
        public Long f75300c;

        /* renamed from: d */
        public DateValidator f75301d = DateValidatorPointForward.m126031a(Long.MIN_VALUE);

        public C31271b() {
        }

        @C0359n0
        /* renamed from: a */
        public CalendarConstraints mo89269a() {
            Month month;
            Bundle bundle = new Bundle();
            bundle.putParcelable(f75297g, this.f75301d);
            Month q = Month.m126073q(this.f75298a);
            Month q2 = Month.m126073q(this.f75299b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable(f75297g);
            Long l = this.f75300c;
            if (l == null) {
                month = null;
            } else {
                month = Month.m126073q(l.longValue());
            }
            return new CalendarConstraints(q, q2, dateValidator, month, (C31270a) null);
        }

        @C0359n0
        /* renamed from: b */
        public C31271b mo89270b(long j) {
            this.f75299b = j;
            return this;
        }

        @C0359n0
        /* renamed from: c */
        public C31271b mo89271c(long j) {
            this.f75300c = Long.valueOf(j);
            return this;
        }

        @C0359n0
        /* renamed from: d */
        public C31271b mo89272d(long j) {
            this.f75298a = j;
            return this;
        }

        @C0359n0
        /* renamed from: e */
        public C31271b mo89273e(@C0359n0 DateValidator dateValidator) {
            this.f75301d = dateValidator;
            return this;
        }

        public C31271b(@C0359n0 CalendarConstraints calendarConstraints) {
            this.f75298a = calendarConstraints.f75289a.f75358f;
            this.f75299b = calendarConstraints.f75290b.f75358f;
            this.f75300c = Long.valueOf(calendarConstraints.f75292d.f75358f);
            this.f75301d = calendarConstraints.f75291c;
        }
    }
}
