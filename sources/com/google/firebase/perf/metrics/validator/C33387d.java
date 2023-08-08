package com.google.firebase.perf.metrics.validator;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.firebase.perf.logging.C33363a;
import com.google.firebase.perf.p049v1.TraceMetric;
import com.google.firebase.perf.util.Constants;
import java.util.Map;

/* renamed from: com.google.firebase.perf.metrics.validator.d */
public final class C33387d extends C33388e {

    /* renamed from: b */
    public static final C33363a f81137b = C33363a.m134449e();

    /* renamed from: a */
    public final TraceMetric f81138a;

    public C33387d(@C0359n0 TraceMetric traceMetric) {
        this.f81138a = traceMetric;
    }

    /* renamed from: c */
    public boolean mo96558c() {
        if (!mo96580o(this.f81138a, 0)) {
            C33363a aVar = f81137b;
            aVar.mo96439l("Invalid Trace:" + this.f81138a.getName());
            return false;
        } else if (!mo96575j(this.f81138a) || mo96573h(this.f81138a)) {
            return true;
        } else {
            C33363a aVar2 = f81137b;
            aVar2.mo96439l("Invalid Counters for Trace:" + this.f81138a.getName());
            return false;
        }
    }

    /* renamed from: g */
    public final boolean mo96572g(Map<String, String> map) {
        for (Map.Entry next : map.entrySet()) {
            try {
                C33388e.m134602d((String) next.getKey(), (String) next.getValue());
            } catch (IllegalArgumentException e) {
                f81137b.mo96439l(e.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    public final boolean mo96573h(@C0359n0 TraceMetric traceMetric) {
        return mo96574i(traceMetric, 0);
    }

    /* renamed from: i */
    public final boolean mo96574i(@C0363p0 TraceMetric traceMetric, int i) {
        if (traceMetric == null) {
            return false;
        }
        if (i > 1) {
            f81137b.mo96439l("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry next : traceMetric.getCountersMap().entrySet()) {
            if (!mo96577l((String) next.getKey())) {
                C33363a aVar = f81137b;
                aVar.mo96439l("invalid CounterId:" + ((String) next.getKey()));
                return false;
            } else if (!mo96578m((Long) next.getValue())) {
                C33363a aVar2 = f81137b;
                aVar2.mo96439l("invalid CounterValue:" + next.getValue());
                return false;
            }
        }
        for (TraceMetric i2 : traceMetric.getSubtracesList()) {
            if (!mo96574i(i2, i + 1)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final boolean mo96575j(@C0359n0 TraceMetric traceMetric) {
        boolean z;
        boolean z2;
        if (traceMetric.getCountersCount() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        for (TraceMetric countersCount : traceMetric.getSubtracesList()) {
            if (countersCount.getCountersCount() > 0) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    public final boolean mo96576k(@C0359n0 TraceMetric traceMetric) {
        return traceMetric.getName().startsWith(Constants.f81295p);
    }

    /* renamed from: l */
    public final boolean mo96577l(@C0363p0 String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f81137b.mo96439l("counterId is empty");
            return false;
        } else if (trim.length() <= 100) {
            return true;
        } else {
            f81137b.mo96439l("counterId exceeded max length 100");
            return false;
        }
    }

    /* renamed from: m */
    public final boolean mo96578m(@C0363p0 Long l) {
        return l != null;
    }

    /* renamed from: n */
    public final boolean mo96579n(@C0359n0 TraceMetric traceMetric) {
        Long l = traceMetric.getCountersMap().get(Constants.CounterNames.FRAMES_TOTAL.toString());
        if (l == null || l.compareTo(0L) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    public final boolean mo96580o(@C0363p0 TraceMetric traceMetric, int i) {
        if (traceMetric == null) {
            f81137b.mo96439l("TraceMetric is null");
            return false;
        } else if (i > 1) {
            f81137b.mo96439l("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!mo96582q(traceMetric.getName())) {
            C33363a aVar = f81137b;
            aVar.mo96439l("invalid TraceId:" + traceMetric.getName());
            return false;
        } else if (!mo96581p(traceMetric)) {
            C33363a aVar2 = f81137b;
            aVar2.mo96439l("invalid TraceDuration:" + traceMetric.getDurationUs());
            return false;
        } else if (!traceMetric.hasClientStartTimeUs()) {
            f81137b.mo96439l("clientStartTimeUs is null.");
            return false;
        } else if (!mo96576k(traceMetric) || mo96579n(traceMetric)) {
            for (TraceMetric o : traceMetric.getSubtracesList()) {
                if (!mo96580o(o, i + 1)) {
                    return false;
                }
            }
            if (!mo96572g(traceMetric.getCustomAttributesMap())) {
                return false;
            }
            return true;
        } else {
            C33363a aVar3 = f81137b;
            aVar3.mo96439l("non-positive totalFrames in screen trace " + traceMetric.getName());
            return false;
        }
    }

    /* renamed from: p */
    public final boolean mo96581p(@C0363p0 TraceMetric traceMetric) {
        return traceMetric != null && traceMetric.getDurationUs() > 0;
    }

    /* renamed from: q */
    public final boolean mo96582q(@C0363p0 String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty() || trim.length() > 100) {
            return false;
        }
        return true;
    }
}
