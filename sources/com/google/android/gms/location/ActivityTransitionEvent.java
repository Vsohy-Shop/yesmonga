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

@SafeParcelable.C40812a(creator = "ActivityTransitionEventCreator")
@SafeParcelable.C40818g({1000})
public class ActivityTransitionEvent extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ActivityTransitionEvent> CREATOR = new C30314a2();
    @SafeParcelable.C40814c(getter = "getActivityType", mo134489id = 1)

    /* renamed from: a */
    public final int f72675a;
    @SafeParcelable.C40814c(getter = "getTransitionType", mo134489id = 2)

    /* renamed from: b */
    public final int f72676b;
    @SafeParcelable.C40814c(getter = "getElapsedRealTimeNanos", mo134489id = 3)

    /* renamed from: c */
    public final long f72677c;

    @SafeParcelable.C40813b
    public ActivityTransitionEvent(@SafeParcelable.C40816e(mo134492id = 1) int i, @SafeParcelable.C40816e(mo134492id = 2) int i2, @SafeParcelable.C40816e(mo134492id = 3) long j) {
        ActivityTransition.m122029W(i2);
        this.f72675a = i;
        this.f72676b = i2;
        this.f72677c = j;
    }

    /* renamed from: M */
    public int mo85534M() {
        return this.f72675a;
    }

    /* renamed from: Q */
    public long mo85535Q() {
        return this.f72677c;
    }

    /* renamed from: W */
    public int mo85536W() {
        return this.f72676b;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivityTransitionEvent)) {
            return false;
        }
        ActivityTransitionEvent activityTransitionEvent = (ActivityTransitionEvent) obj;
        if (this.f72675a == activityTransitionEvent.f72675a && this.f72676b == activityTransitionEvent.f72676b && this.f72677c == activityTransitionEvent.f72677c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return C40808s.m166011c(Integer.valueOf(this.f72675a), Integer.valueOf(this.f72676b), Long.valueOf(this.f72677c));
    }

    @RecentlyNonNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f72675a;
        StringBuilder sb2 = new StringBuilder(24);
        sb2.append("ActivityType ");
        sb2.append(i);
        sb.append(sb2.toString());
        sb.append(" ");
        int i2 = this.f72676b;
        StringBuilder sb3 = new StringBuilder(26);
        sb3.append("TransitionType ");
        sb3.append(i2);
        sb.append(sb3.toString());
        sb.append(" ");
        long j = this.f72677c;
        StringBuilder sb4 = new StringBuilder(41);
        sb4.append("ElapsedRealTimeNanos ");
        sb4.append(j);
        sb.append(sb4.toString());
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C40843u.m166202l(parcel);
        int a = C40820a.m166110a(parcel);
        C40820a.m166089F(parcel, 1, mo85534M());
        C40820a.m166089F(parcel, 2, mo85536W());
        C40820a.m166094K(parcel, 3, mo85535Q());
        C40820a.m166112b(parcel, a);
    }
}
