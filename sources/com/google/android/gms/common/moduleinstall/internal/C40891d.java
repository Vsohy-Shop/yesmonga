package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import java.util.Comparator;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.d */
public final /* synthetic */ class C40891d implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C40891d f104056a = new C40891d();

    public final int compare(Object obj, Object obj2) {
        Feature feature = (Feature) obj;
        Feature feature2 = (Feature) obj2;
        Parcelable.Creator<ApiFeatureRequest> creator = ApiFeatureRequest.CREATOR;
        if (!feature.mo133601M().equals(feature2.mo133601M())) {
            return feature.mo133601M().compareTo(feature2.mo133601M());
        }
        return (feature.mo133602Q() > feature2.mo133602Q() ? 1 : (feature.mo133602Q() == feature2.mo133602Q() ? 0 : -1));
    }
}
