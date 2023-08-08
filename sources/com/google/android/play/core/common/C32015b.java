package com.google.android.play.core.common;

import android.os.Bundle;
import com.google.android.play.core.internal.C32062k;
import com.google.firebase.crashlytics.internal.persistence.C32921f;
import com.urbanairship.analytics.C35518b;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.play.core.common.b */
public class C32015b {

    /* renamed from: a */
    public static final Set<String> f78208a = new HashSet(Arrays.asList(new String[]{"app_update", "review"}));

    /* renamed from: b */
    public static final Set<String> f78209b = new HashSet(Arrays.asList(new String[]{C32921f.f79939j, C35518b.f87599C}));

    /* renamed from: c */
    public static final Map<String, Map<String, Integer>> f78210c = new HashMap();

    /* renamed from: d */
    public static final C32062k f78211d = new C32062k("PlayCoreVersion");

    /* renamed from: a */
    public static synchronized Map<String, Integer> m129738a(String str) {
        Map<String, Integer> map;
        synchronized (C32015b.class) {
            Map<String, Map<String, Integer>> map2 = f78210c;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11000);
                map2.put(str, hashMap);
            }
            map = map2.get(str);
        }
        return map;
    }

    /* renamed from: b */
    public static synchronized void m129739b(String str, String str2, int i) {
        synchronized (C32015b.class) {
            if (!f78208a.contains(str)) {
                f78211d.mo92779e("Illegal module name: %s", str);
            } else if (!f78209b.contains(str2)) {
                f78211d.mo92779e("Illegal platform name: %s", str2);
            } else {
                m129738a(str).put(str2, Integer.valueOf(i));
            }
        }
    }

    /* renamed from: c */
    public static Bundle m129740c(String str) {
        Bundle bundle = new Bundle();
        Map<String, Integer> a = m129738a(str);
        bundle.putInt("playcore_version_code", a.get("java").intValue());
        if (a.containsKey(C32921f.f79939j)) {
            bundle.putInt("playcore_native_version", a.get(C32921f.f79939j).intValue());
        }
        if (a.containsKey(C35518b.f87599C)) {
            bundle.putInt("playcore_unity_version", a.get(C35518b.f87599C).intValue());
        }
        return bundle;
    }
}
