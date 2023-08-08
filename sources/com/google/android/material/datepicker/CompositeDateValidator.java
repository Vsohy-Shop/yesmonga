package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.core.util.C18001r;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C31274c();

    /* renamed from: c */
    public static final int f75302c = 1;

    /* renamed from: d */
    public static final int f75303d = 2;

    /* renamed from: e */
    public static final C31275d f75304e = new C31272a();

    /* renamed from: f */
    public static final C31275d f75305f = new C31273b();
    @C0359n0

    /* renamed from: a */
    public final C31275d f75306a;
    @C0359n0

    /* renamed from: b */
    public final List<CalendarConstraints.DateValidator> f75307b;

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    public class C31272a implements C31275d {
        /* renamed from: a */
        public boolean mo89278a(@C0359n0 List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && next.mo89264F1(j)) {
                    return true;
                }
            }
            return false;
        }

        public int getId() {
            return 1;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    public class C31273b implements C31275d {
        /* renamed from: a */
        public boolean mo89278a(@C0359n0 List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && !next.mo89264F1(j)) {
                    return false;
                }
            }
            return true;
        }

        public int getId() {
            return 2;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    public class C31274c implements Parcelable.Creator<CompositeDateValidator> {
        @C0359n0
        /* renamed from: a */
        public CompositeDateValidator createFromParcel(@C0359n0 Parcel parcel) {
            C31275d dVar;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                dVar = CompositeDateValidator.f75305f;
            } else if (readInt == 1) {
                dVar = CompositeDateValidator.f75304e;
            } else {
                dVar = CompositeDateValidator.f75305f;
            }
            return new CompositeDateValidator((List) C18001r.m81775l(readArrayList), dVar, (C31272a) null);
        }

        @C0359n0
        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    public interface C31275d {
        /* renamed from: a */
        boolean mo89278a(@C0359n0 List<CalendarConstraints.DateValidator> list, long j);

        int getId();
    }

    public /* synthetic */ CompositeDateValidator(List list, C31275d dVar, C31272a aVar) {
        this(list, dVar);
    }

    @C0359n0
    /* renamed from: c */
    public static CalendarConstraints.DateValidator m126008c(@C0359n0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f75305f);
    }

    @C0359n0
    /* renamed from: d */
    public static CalendarConstraints.DateValidator m126009d(@C0359n0 List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f75304e);
    }

    /* renamed from: F1 */
    public boolean mo89264F1(long j) {
        return this.f75306a.mo89278a(this.f75307b, j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (!this.f75307b.equals(compositeDateValidator.f75307b) || this.f75306a.getId() != compositeDateValidator.f75306a.getId()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f75307b.hashCode();
    }

    public void writeToParcel(@C0359n0 Parcel parcel, int i) {
        parcel.writeList(this.f75307b);
        parcel.writeInt(this.f75306a.getId());
    }

    public CompositeDateValidator(@C0359n0 List<CalendarConstraints.DateValidator> list, C31275d dVar) {
        this.f75307b = list;
        this.f75306a = dVar;
    }
}
