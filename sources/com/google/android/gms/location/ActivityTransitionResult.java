package com.google.android.gms.location;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.C40858y;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.C40821b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.C40812a(creator = "ActivityTransitionResultCreator")
@SafeParcelable.C40818g({1000})
public class ActivityTransitionResult extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new C30326d2();
    @SafeParcelable.C40814c(getter = "getTransitionEvents", mo134489id = 1)

    /* renamed from: a */
    public final List<ActivityTransitionEvent> f72683a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getExtras", mo134489id = 2)

    /* renamed from: b */
    public Bundle f72684b;

    public ActivityTransitionResult(@RecentlyNonNull @SafeParcelable.C40816e(mo134492id = 1) List<ActivityTransitionEvent> list) {
        this.f72684b = null;
        C40843u.m166203m(list, "transitionEvents list can't be null.");
        if (!list.isEmpty()) {
            for (int i = 1; i < list.size(); i++) {
                C40843u.m166191a(list.get(i).mo85535Q() >= list.get(i + -1).mo85535Q());
            }
        }
        this.f72683a = Collections.unmodifiableList(list);
    }

    @RecentlyNullable
    /* renamed from: M */
    public static ActivityTransitionResult m122040M(@RecentlyNonNull Intent intent) {
        if (!m122041W(intent)) {
            return null;
        }
        return (ActivityTransitionResult) C40821b.m166146b(intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT", CREATOR);
    }

    /* renamed from: W */
    public static boolean m122041W(@C0363p0 Intent intent) {
        if (intent == null) {
            return false;
        }
        return intent.hasExtra("com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_RESULT");
    }

    @RecentlyNonNull
    /* renamed from: Q */
    public List<ActivityTransitionEvent> mo85547Q() {
        return this.f72683a;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f72683a.equals(((ActivityTransitionResult) obj).f72683a);
    }

    public int hashCode() {
        return this.f72683a.hashCode();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C40843u.m166202l(parcel);
        int a = C40820a.m166110a(parcel);
        C40820a.m166117d0(parcel, 1, mo85547Q(), false);
        C40820a.m166129k(parcel, 2, this.f72684b, false);
        C40820a.m166112b(parcel, a);
    }

    @C40858y
    @SafeParcelable.C40813b
    public ActivityTransitionResult(@RecentlyNonNull @SafeParcelable.C40816e(mo134492id = 1) List<ActivityTransitionEvent> list, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) Bundle bundle) {
        this(list);
        this.f72684b = bundle;
    }
}
