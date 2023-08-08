package com.google.android.gms.location;

import com.google.android.gms.common.internal.C40843u;
import java.util.Comparator;

/* renamed from: com.google.android.gms.location.e2 */
public final class C30330e2 implements Comparator<DetectedActivity> {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        DetectedActivity detectedActivity = (DetectedActivity) obj;
        DetectedActivity detectedActivity2 = (DetectedActivity) obj2;
        C40843u.m166202l(detectedActivity);
        C40843u.m166202l(detectedActivity2);
        int compareTo = Integer.valueOf(detectedActivity2.mo85551M()).compareTo(Integer.valueOf(detectedActivity.mo85551M()));
        if (compareTo == 0) {
            return Integer.valueOf(detectedActivity.mo85552Q()).compareTo(Integer.valueOf(detectedActivity2.mo85552Q()));
        }
        return compareTo;
    }
}
