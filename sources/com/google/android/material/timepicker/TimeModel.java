package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0337f0;
import java.util.Arrays;

class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C31692a();

    /* renamed from: v */
    public static final String f77116v = "%02d";

    /* renamed from: w */
    public static final String f77117w = "%d";

    /* renamed from: a */
    public final C31706c f77118a;

    /* renamed from: b */
    public final C31706c f77119b;

    /* renamed from: c */
    public final int f77120c;

    /* renamed from: d */
    public int f77121d;

    /* renamed from: e */
    public int f77122e;

    /* renamed from: f */
    public int f77123f;

    /* renamed from: g */
    public int f77124g;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    public class C31692a implements Parcelable.Creator<TimeModel> {
        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* renamed from: b */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    /* renamed from: a */
    public static String m128496a(Resources resources, CharSequence charSequence) {
        return m128497b(resources, charSequence, f77116v);
    }

    /* renamed from: b */
    public static String m128497b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    /* renamed from: f */
    public static int m128498f(int i) {
        return i >= 12 ? 1 : 0;
    }

    /* renamed from: c */
    public int mo91896c() {
        if (this.f77120c == 1) {
            return this.f77121d % 24;
        }
        int i = this.f77121d;
        if (i % 12 == 0) {
            return 12;
        }
        if (this.f77124g == 1) {
            return i - 12;
        }
        return i;
    }

    /* renamed from: d */
    public C31706c mo91897d() {
        return this.f77119b;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public C31706c mo91899e() {
        return this.f77118a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f77121d == timeModel.f77121d && this.f77122e == timeModel.f77122e && this.f77120c == timeModel.f77120c && this.f77123f == timeModel.f77123f) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public void mo91901g(int i) {
        if (this.f77120c == 1) {
            this.f77121d = i;
            return;
        }
        int i2 = 12;
        int i3 = i % 12;
        if (this.f77124g != 1) {
            i2 = 0;
        }
        this.f77121d = i3 + i2;
    }

    /* renamed from: h */
    public void mo91902h(int i) {
        this.f77124g = m128498f(i);
        this.f77121d = i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f77120c), Integer.valueOf(this.f77121d), Integer.valueOf(this.f77122e), Integer.valueOf(this.f77123f)});
    }

    /* renamed from: i */
    public void mo91904i(@C0337f0(from = 0, mo995to = 59) int i) {
        this.f77122e = i % 60;
    }

    /* renamed from: j */
    public void mo91905j(int i) {
        if (i != this.f77124g) {
            this.f77124g = i;
            int i2 = this.f77121d;
            if (i2 < 12 && i == 1) {
                this.f77121d = i2 + 12;
            } else if (i2 >= 12 && i == 0) {
                this.f77121d = i2 - 12;
            }
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f77121d);
        parcel.writeInt(this.f77122e);
        parcel.writeInt(this.f77123f);
        parcel.writeInt(this.f77120c);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f77121d = i;
        this.f77122e = i2;
        this.f77123f = i3;
        this.f77120c = i4;
        this.f77124g = m128498f(i);
        this.f77118a = new C31706c(59);
        this.f77119b = new C31706c(i4 == 1 ? 24 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
