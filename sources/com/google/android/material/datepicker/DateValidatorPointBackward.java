package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new C31276a();

    /* renamed from: a */
    public final long f75308a;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointBackward$a */
    public class C31276a implements Parcelable.Creator<DateValidatorPointBackward> {
        @C0359n0
        /* renamed from: a */
        public DateValidatorPointBackward createFromParcel(@C0359n0 Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), (C31276a) null);
        }

        @C0359n0
        /* renamed from: b */
        public DateValidatorPointBackward[] newArray(int i) {
            return new DateValidatorPointBackward[i];
        }
    }

    public /* synthetic */ DateValidatorPointBackward(long j, C31276a aVar) {
        this(j);
    }

    @C0359n0
    /* renamed from: a */
    public static DateValidatorPointBackward m126026a(long j) {
        return new DateValidatorPointBackward(j);
    }

    @C0359n0
    /* renamed from: b */
    public static DateValidatorPointBackward m126027b() {
        return m126026a(C31324p.m126273t().getTimeInMillis());
    }

    /* renamed from: F1 */
    public boolean mo89264F1(long j) {
        return j <= this.f75308a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DateValidatorPointBackward)) {
            return false;
        }
        if (this.f75308a == ((DateValidatorPointBackward) obj).f75308a) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f75308a)});
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeLong(this.f75308a);
    }

    public DateValidatorPointBackward(long j) {
        this.f75308a = j;
    }
}
