package com.google.firebase.perf.metrics.validator;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.crashlytics.internal.persistence.C32920e;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.p049v1.PerfMetric;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: com.google.firebase.perf.metrics.validator.e */
public abstract class C33388e {
    @C0359n0
    /* renamed from: a */
    public static List<C33388e> m134600a(@C0359n0 PerfMetric perfMetric, @C0359n0 Context context) {
        ArrayList arrayList = new ArrayList();
        if (perfMetric.hasTraceMetric()) {
            arrayList.add(new C33387d(perfMetric.getTraceMetric()));
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            arrayList.add(new C33386c(perfMetric.getNetworkRequestMetric(), context));
        }
        if (perfMetric.hasApplicationInfo()) {
            arrayList.add(new C33384a(perfMetric.getApplicationInfo()));
        }
        if (perfMetric.hasGaugeMetric()) {
            arrayList.add(new C33385b(perfMetric.getGaugeMetric()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static boolean m134601b(@C0359n0 PerfMetric perfMetric, @C0359n0 Context context) {
        List<C33388e> a = m134600a(perfMetric, context);
        if (a.isEmpty()) {
            C33363a.m134449e().mo96429a("No validators found for PerfMetric.");
            return false;
        }
        for (C33388e c : a) {
            if (!c.mo96558c()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: d */
    public static void m134602d(@C0359n0 String str, @C0359n0 String str2) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Attribute key must not be null or empty");
        } else if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("Attribute value must not be null or empty");
        } else if (str.length() > 40) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute key length must not exceed %d characters", new Object[]{40}));
        } else if (str2.length() > 100) {
            throw new IllegalArgumentException(String.format(Locale.US, "Attribute value length must not exceed %d characters", new Object[]{100}));
        } else if (!str.matches("^(?!(firebase_|google_|ga_))[A-Za-z][A-Za-z_0-9]*")) {
            throw new IllegalArgumentException("Attribute key must start with letter, must only contain alphanumeric characters and underscore and must not start with \"firebase_\", \"google_\" and \"ga_");
        }
    }

    @C0363p0
    /* renamed from: e */
    public static String m134603e(@C0363p0 String str) {
        if (str == null) {
            return "Metric name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Metric name must not exceed %d characters", new Object[]{100});
        } else if (!str.startsWith(C32920e.f79928l)) {
            return null;
        } else {
            for (Constants.CounterNames counterNames : Constants.CounterNames.values()) {
                if (counterNames.toString().equals(str)) {
                    return null;
                }
            }
            return "Metric name must not start with '_'";
        }
    }

    @C0363p0
    /* renamed from: f */
    public static String m134604f(@C0363p0 String str) {
        if (str == null) {
            return "Trace name must not be null";
        }
        if (str.length() > 100) {
            return String.format(Locale.US, "Trace name must not exceed %d characters", new Object[]{100});
        } else if (!str.startsWith(C32920e.f79928l)) {
            return null;
        } else {
            for (Constants.TraceNames traceNames : Constants.TraceNames.values()) {
                if (traceNames.toString().equals(str)) {
                    return null;
                }
            }
            if (str.startsWith(Constants.f81295p)) {
                return null;
            }
            return "Trace name must not start with '_'";
        }
    }

    /* renamed from: c */
    public abstract boolean mo96558c();
}
