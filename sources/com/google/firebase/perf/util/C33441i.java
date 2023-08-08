package com.google.firebase.perf.util;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.C0359n0;
import com.google.firebase.perf.logging.C33363a;
import java.net.URI;

/* renamed from: com.google.firebase.perf.util.i */
public class C33441i {

    /* renamed from: a */
    public static String[] f81342a;

    /* renamed from: a */
    public static boolean m134833a(@C0359n0 URI uri, @C0359n0 Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("firebase_performance_whitelisted_domains", "array", context.getPackageName());
        if (identifier == 0) {
            return true;
        }
        C33363a.m134449e().mo96429a("Detected domain allowlist, only allowlisted domains will be measured.");
        if (f81342a == null) {
            f81342a = resources.getStringArray(identifier);
        }
        String host = uri.getHost();
        if (host == null) {
            return true;
        }
        for (String contains : f81342a) {
            if (host.contains(contains)) {
                return true;
            }
        }
        return false;
    }
}
