package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C31290a();
    @C0359n0

    /* renamed from: a */
    public final Calendar f75353a;

    /* renamed from: b */
    public final int f75354b;

    /* renamed from: c */
    public final int f75355c;

    /* renamed from: d */
    public final int f75356d;

    /* renamed from: e */
    public final int f75357e;

    /* renamed from: f */
    public final long f75358f;
    @C0363p0

    /* renamed from: g */
    public String f75359g;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    public class C31290a implements Parcelable.Creator<Month> {
        @C0359n0
        /* renamed from: a */
        public Month createFromParcel(@C0359n0 Parcel parcel) {
            return Month.m126072g(parcel.readInt(), parcel.readInt());
        }

        @C0359n0
        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    public Month(@C0359n0 Calendar calendar) {
        calendar.set(5, 1);
        Calendar f = C31324p.m126259f(calendar);
        this.f75353a = f;
        this.f75354b = f.get(2);
        this.f75355c = f.get(1);
        this.f75356d = f.getMaximum(7);
        this.f75357e = f.getActualMaximum(5);
        this.f75358f = f.getTimeInMillis();
    }

    @C0359n0
    /* renamed from: g */
    public static Month m126072g(int i, int i2) {
        Calendar v = C31324p.m126275v();
        v.set(1, i);
        v.set(2, i2);
        return new Month(v);
    }

    @C0359n0
    /* renamed from: q */
    public static Month m126073q(long j) {
        Calendar v = C31324p.m126275v();
        v.setTimeInMillis(j);
        return new Month(v);
    }

    @C0359n0
    /* renamed from: r */
    public static Month m126074r() {
        return new Month(C31324p.m126273t());
    }

    @C0359n0
    /* renamed from: M */
    public String mo89339M() {
        if (this.f75359g == null) {
            this.f75359g = C31301d.m126152i(this.f75353a.getTimeInMillis());
        }
        return this.f75359g;
    }

    /* renamed from: Q */
    public long mo89340Q() {
        return this.f75353a.getTimeInMillis();
    }

    @C0359n0
    /* renamed from: W */
    public Month mo89341W(int i) {
        Calendar f = C31324p.m126259f(this.f75353a);
        f.add(2, i);
        return new Month(f);
    }

    /* renamed from: X */
    public int mo89342X(@C0359n0 Month month) {
        if (this.f75353a instanceof GregorianCalendar) {
            return ((month.f75355c - this.f75355c) * 12) + (month.f75354b - this.f75354b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    /* renamed from: b */
    public int compareTo(@C0359n0 Month month) {
        return this.f75353a.compareTo(month.f75353a);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f75354b == month.f75354b && this.f75355c == month.f75355c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f75354b), Integer.valueOf(this.f75355c)});
    }

    /* renamed from: w */
    public int mo89348w() {
        int firstDayOfWeek = this.f75353a.get(7) - this.f75353a.getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            return firstDayOfWeek + this.f75356d;
        }
        return firstDayOfWeek;
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeInt(this.f75355c);
        parcel.writeInt(this.f75354b);
    }

    /* renamed from: y */
    public long mo89350y(int i) {
        Calendar f = C31324p.m126259f(this.f75353a);
        f.set(5, i);
        return f.getTimeInMillis();
    }

    /* renamed from: z */
    public int mo89351z(long j) {
        Calendar f = C31324p.m126259f(this.f75353a);
        f.setTimeInMillis(j);
        return f.get(5);
    }
}
