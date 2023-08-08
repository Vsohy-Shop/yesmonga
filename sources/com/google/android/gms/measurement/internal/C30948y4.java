package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.core.motion.utils.C16717v;
import com.google.android.gms.common.C40924q;

/* renamed from: com.google.android.gms.measurement.internal.y4 */
public final class C30948y4 {
    /* renamed from: a */
    public static String m124319a(Context context) {
        try {
            return context.getResources().getResourcePackageName(C40924q.C40926b.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    @C0363p0
    /* renamed from: b */
    public static final String m124320b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, C16717v.C16719b.f42182e, str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
