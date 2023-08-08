package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.api.C40661k;
import com.google.android.gms.common.internal.C40808s;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C40820a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.moduleinstall.C40879d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

@C40473a
@SafeParcelable.C40812a(creator = "ApiFeatureRequestCreator")
public class ApiFeatureRequest extends AbstractSafeParcelable {
    @C0359n0
    public static final Parcelable.Creator<ApiFeatureRequest> CREATOR = new C40892e();

    /* renamed from: e */
    public static final Comparator f104045e = C40891d.f104056a;
    @SafeParcelable.C40814c(getter = "getApiFeatures", mo134489id = 1)

    /* renamed from: a */
    public final List f104046a;
    @SafeParcelable.C40814c(getter = "getIsUrgent", mo134489id = 2)

    /* renamed from: b */
    public final boolean f104047b;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getFeatureRequestSessionId", mo134489id = 3)

    /* renamed from: c */
    public final String f104048c;
    @C0363p0
    @SafeParcelable.C40814c(getter = "getCallingPackage", mo134489id = 4)

    /* renamed from: d */
    public final String f104049d;

    @SafeParcelable.C40813b
    public ApiFeatureRequest(@SafeParcelable.C40816e(mo134492id = 1) @C0359n0 List list, @SafeParcelable.C40816e(mo134492id = 2) boolean z, @C0363p0 @SafeParcelable.C40816e(mo134492id = 3) String str, @C0363p0 @SafeParcelable.C40816e(mo134492id = 4) String str2) {
        C40843u.m166202l(list);
        this.f104046a = list;
        this.f104047b = z;
        this.f104048c = str;
        this.f104049d = str2;
    }

    @C40473a
    @C0359n0
    /* renamed from: M */
    public static ApiFeatureRequest m166305M(@C0359n0 C40879d dVar) {
        return m166306W(dVar.mo134572a(), true);
    }

    /* renamed from: W */
    public static ApiFeatureRequest m166306W(List list, boolean z) {
        TreeSet treeSet = new TreeSet(f104045e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Collections.addAll(treeSet, ((C40661k) it.next()).mo134096a());
        }
        return new ApiFeatureRequest(new ArrayList(treeSet), z, (String) null, (String) null);
    }

    @C40473a
    @C0359n0
    /* renamed from: Q */
    public List<Feature> mo134586Q() {
        return this.f104046a;
    }

    public final boolean equals(@C0363p0 Object obj) {
        if (obj == null || !(obj instanceof ApiFeatureRequest)) {
            return false;
        }
        ApiFeatureRequest apiFeatureRequest = (ApiFeatureRequest) obj;
        if (this.f104047b != apiFeatureRequest.f104047b || !C40808s.m166010b(this.f104046a, apiFeatureRequest.f104046a) || !C40808s.m166010b(this.f104048c, apiFeatureRequest.f104048c) || !C40808s.m166010b(this.f104049d, apiFeatureRequest.f104049d)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C40808s.m166011c(Boolean.valueOf(this.f104047b), this.f104046a, this.f104048c, this.f104049d);
    }

    public final void writeToParcel(@C0359n0 Parcel parcel, int i) {
        int a = C40820a.m166110a(parcel);
        C40820a.m166117d0(parcel, 1, mo134586Q(), false);
        C40820a.m166122g(parcel, 2, this.f104047b);
        C40820a.m166108Y(parcel, 3, this.f104048c, false);
        C40820a.m166108Y(parcel, 4, this.f104049d, false);
        C40820a.m166112b(parcel, a);
    }
}
