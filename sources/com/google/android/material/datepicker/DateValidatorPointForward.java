package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C31277a();

    /* renamed from: a */
    public final long f75309a;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    public class C31277a implements Parcelable.Creator<DateValidatorPointForward> {
        @C0359n0
        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(@C0359n0 Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), (C31277a) null);
        }

        @C0359n0
        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    public /* synthetic */ DateValidatorPointForward(long j, C31277a aVar) {
        this(j);
    }

    @C0359n0
    /* renamed from: a */
    public static DateValidatorPointForward m126031a(long j) {
        return new DateValidatorPointForward(j);
    }

    @C0359n0
    /* renamed from: b */
    public static DateValidatorPointForward m126032b() {
        return m126031a(C31324p.m126273t().getTimeInMillis());
    }

    /* renamed from: F1 */
    public boolean mo89264F1(long j) {
        return j >= this.f75309a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointForward)) {
            return false;
        }
        if (this.f75309a == ((DateValidatorPointForward) obj).f75309a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f75309a)});
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeLong(this.f75309a);
    }

    public DateValidatorPointForward(long j) {
        this.f75309a = j;
    }
}
