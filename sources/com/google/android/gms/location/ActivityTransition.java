package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlinx.serialization.json.internal.C12361b;

@SafeParcelable.C40812a(creator = "ActivityTransitionCreator")
@SafeParcelable.C40818g({1000})
public class ActivityTransition extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ActivityTransition> CREATOR = new C30405z1();

    /* renamed from: c */
    public static final int f72669c = 0;

    /* renamed from: d */
    public static final int f72670d = 1;
    @SafeParcelable.C40814c(getter = "getActivityType", mo134489id = 1)

    /* renamed from: a */
    public final int f72671a;
    @SafeParcelable.C40814c(getter = "getTransitionType", mo134489id = 2)

    /* renamed from: b */
    public final int f72672b;

    /* renamed from: com.google.android.gms.location.ActivityTransition$a */
    public static class C30306a {

        /* renamed from: a */
        public int f72673a = -1;

        /* renamed from: b */
        public int f72674b = -1;

        @RecentlyNonNull
        /* renamed from: a */
        public ActivityTransition mo85531a() {
            boolean z;
            boolean z2 = true;
            if (this.f72673a != -1) {
                z = true;
            } else {
                z = false;
            }
            C40843u.m166209s(z, "Activity type not set.");
            if (this.f72674b == -1) {
                z2 = false;
            }
            C40843u.m166209s(z2, "Activity transition type not set.");
            return new ActivityTransition(this.f72673a, this.f72674b);
        }

        @RecentlyNonNull
        /* renamed from: b */
        public C30306a mo85532b(int i) {
            ActivityTransition.m122029W(i);
            this.f72674b = i;
            return this;
        }

        @RecentlyNonNull
        /* renamed from: c */
        public C30306a mo85533c(int i) {
            this.f72673a = i;
            return this;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.google.android.gms.location.ActivityTransition$b */
    public @interface C30307b {
    }

    @SafeParcelable.C40813b
    public ActivityTransition(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2) {
        this.f72671a = i;
        this.f72672b = i2;
    }

    /* renamed from: W */
    public static void m122029W(int i) {
        boolean z = false;
        if (i >= 0 && i <= 1) {
            z = true;
        }
        StringBuilder sb = new StringBuilder(41);
        sb.append("Transition type ");
        sb.append(i);
        sb.append(" is not valid.");
        C40843u.m166192b(z, sb.toString());
    }

    /* renamed from: M */
    public int mo85525M() {
        return this.f72671a;
    }

    /* renamed from: Q */
    public int mo85526Q() {
        return this.f72672b;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransition)) {
            return false;
        }
        ActivityTransition activityTransition = (ActivityTransition) obj;
        if (this.f72671a == activityTransition.f72671a && this.f72672b == activityTransition.f72672b) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f72671a), Integer.valueOf(this.f72672b));
    }

    @RecentlyNonNull
    public String toString() {
        int i = this.f72671a;
        int i2 = this.f72672b;
        StringBuilder sb = new StringBuilder(75);
        sb.append("ActivityTransition [mActivityType=");
        sb.append(i);
        sb.append(", mTransitionType=");
        sb.append(i2);
        sb.append(C12361b.f30261l);
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C40843u.m166202l(parcel);
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, mo85525M());
        C40820a.m166089F(parcel, 2, mo85526Q());
        C40820a.m166112b(parcel, a);
    }
}
