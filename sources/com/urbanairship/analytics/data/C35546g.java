package com.urbanairship.analytics.data;

import androidx.annotation.C0359n0;
import com.urbanairship.util.C9667n0;
import java.util.List;
import java.util.Map;

/* renamed from: com.urbanairship.analytics.data.g */
public class C35546g {

    /* renamed from: b */
    public static final int f87706b = 5242880;

    /* renamed from: c */
    public static final int f87707c = 10240;

    /* renamed from: d */
    public static final int f87708d = 512000;

    /* renamed from: e */
    public static final int f87709e = 10240;

    /* renamed from: f */
    public static final int f87710f = 60000;

    /* renamed from: g */
    public static final int f87711g = 604800000;
    @C0359n0

    /* renamed from: a */
    public final Map<String, List<String>> f87712a;

    public C35546g(@C0359n0 Map<String, List<String>> map) {
        this.f87712a = map;
    }

    /* renamed from: a */
    public int mo106478a() {
        List list = this.f87712a.get("X-UA-Max-Batch");
        if (list == null || list.size() <= 0) {
            return 10240;
        }
        return C9667n0.m36216a(Integer.parseInt((String) list.get(0)) * 1024, 10240, f87708d);
    }

    /* renamed from: b */
    public int mo106479b() {
        List list = this.f87712a.get("X-UA-Max-Total");
        if (list == null || list.size() <= 0) {
            return 10240;
        }
        return C9667n0.m36216a(Integer.parseInt((String) list.get(0)) * 1024, 10240, 5242880);
    }

    /* renamed from: c */
    public int mo106480c() {
        List list = this.f87712a.get("X-UA-Min-Batch-Interval");
        if (list == null || list.size() <= 0) {
            return 60000;
        }
        return C9667n0.m36216a(Integer.parseInt((String) list.get(0)), 60000, 604800000);
    }
}
