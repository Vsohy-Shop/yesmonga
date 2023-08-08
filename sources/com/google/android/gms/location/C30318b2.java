package com.google.android.gms.location;

import com.google.android.gms.common.internal.C40843u;
import java.util.Comparator;

/* renamed from: com.google.android.gms.location.b2 */
public final class C30318b2 implements Comparator<ActivityTransition> {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        C40843u.m166202l(activityTransition);
        C40843u.m166202l(activityTransition2);
        int M = activityTransition.mo85525M();
        int M2 = activityTransition2.mo85525M();
        if (M == M2) {
            int Q = activityTransition.mo85526Q();
            int Q2 = activityTransition2.mo85526Q();
            if (Q == Q2) {
                return 0;
            }
            if (Q < Q2) {
                return -1;
            }
            return 1;
        } else if (M >= M2) {
            return 1;
        } else {
            return -1;
        }
    }
}
