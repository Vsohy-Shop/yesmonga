package com.google.android.gms.location;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.C40821b;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;
import kotlinx.serialization.json.internal.C12361b;

@SafeParcelable.C40812a(creator = "ActivityTransitionRequestCreator")
@SafeParcelable.C40818g({1000})
public class ActivityTransitionRequest extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new C30322c2();
    @RecentlyNonNull

    /* renamed from: e */
    public static final Comparator<ActivityTransition> f72678e = new C30318b2();
    @SafeParcelable.C40814c(getter = "getActivityTransitions", mo134489id = 1)

    /* renamed from: a */
    public final List<ActivityTransition> f72679a;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getTag", mo134489id = 2)

    /* renamed from: b */
    public final String f72680b;
    @SafeParcelable.C40814c(getter = "getClients", mo134489id = 3)

    /* renamed from: c */
    public final List<ClientIdentity> f72681c;
    @C0363p0
    @SafeParcelable.C40814c(defaultValueUnchecked = "null", getter = "getContextAttributionTag", mo134489id = 4)

    /* renamed from: d */
    public String f72682d;

    public ActivityTransitionRequest(@RecentlyNonNull List<ActivityTransition> list) {
        this(list, (String) null, (List<ClientIdentity>) null, (String) null);
    }

    /* renamed from: M */
    public void mo85541M(@RecentlyNonNull Intent intent) {
        C40843u.m166202l(intent);
        C40821b.m166158n(this, intent, "com.google.android.location.internal.EXTRA_ACTIVITY_TRANSITION_REQUEST");
    }

    @RecentlyNonNull
    /* renamed from: Q */
    public final ActivityTransitionRequest mo85542Q(@C0363p0 String str) {
        this.f72682d = str;
        return this;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
            if (!C40808s.m166010b(this.f72679a, activityTransitionRequest.f72679a) || !C40808s.m166010b(this.f72680b, activityTransitionRequest.f72680b) || !C40808s.m166010b(this.f72682d, activityTransitionRequest.f72682d) || !C40808s.m166010b(this.f72681c, activityTransitionRequest.f72681c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i;
        int i2;
        int hashCode = this.f72679a.hashCode() * 31;
        String str = this.f72680b;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i4 = (hashCode + i) * 31;
        List<ClientIdentity> list = this.f72681c;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (i4 + i2) * 31;
        String str2 = this.f72682d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i5 + i3;
    }

    @RecentlyNonNull
    public String toString() {
        String valueOf = String.valueOf(this.f72679a);
        String str = this.f72680b;
        String valueOf2 = String.valueOf(this.f72681c);
        String str2 = this.f72682d;
        int length = valueOf.length();
        int length2 = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 79 + length2 + valueOf2.length() + String.valueOf(str2).length());
        sb.append("ActivityTransitionRequest [mTransitions=");
        sb.append(valueOf);
        sb.append(", mTag='");
        sb.append(str);
        sb.append("', mClients=");
        sb.append(valueOf2);
        sb.append(", mAttributionTag=");
        sb.append(str2);
        sb.append(C12361b.f30261l);
        return sb.toString();
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        C40843u.m166202l(parcel);
        int a = C40820a.m166110a(parcel);
        C40820a.m166117d0(parcel, 1, this.f72679a, false);
        C40820a.m166108Y(parcel, 2, this.f72680b, false);
        C40820a.m166117d0(parcel, 3, this.f72681c, false);
        C40820a.m166108Y(parcel, 4, this.f72682d, false);
        C40820a.m166112b(parcel, a);
    }

    @SafeParcelable.C40813b
    public ActivityTransitionRequest(@RecentlyNonNull @SafeParcelable.C40816e(mo134492id = 1) List<ActivityTransition> list, @C0363p0 @SafeParcelable.C40816e(mo134492id = 2) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) List<ClientIdentity> list2, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str2) {
        List<ClientIdentity> list3;
        C40843u.m166203m(list, "transitions can't be null");
        C40843u.m166192b(list.size() > 0, "transitions can't be empty.");
        C40843u.m166202l(list);
        TreeSet treeSet = new TreeSet(f72678e);
        for (ActivityTransition next : list) {
            C40843u.m166192b(treeSet.add(next), String.format("Found duplicated transition: %s.", new Object[]{next}));
        }
        this.f72679a = Collections.unmodifiableList(list);
        this.f72680b = str;
        if (list2 == null) {
            list3 = Collections.emptyList();
        } else {
            list3 = Collections.unmodifiableList(list2);
        }
        this.f72681c = list3;
        this.f72682d = str2;
    }
}
