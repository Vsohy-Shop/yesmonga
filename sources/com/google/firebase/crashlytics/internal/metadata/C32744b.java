package com.google.firebase.crashlytics.internal.metadata;

import androidx.annotation.C0359n0;
import com.google.firebase.crashlytics.internal.C32741f;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.firebase.crashlytics.internal.metadata.b */
public class C32744b {

    /* renamed from: a */
    public final Map<String, String> f79493a = new HashMap();

    /* renamed from: b */
    public final int f79494b;

    /* renamed from: c */
    public final int f79495c;

    public C32744b(int i, int i2) {
        this.f79494b = i;
        this.f79495c = i2;
    }

    /* renamed from: c */
    public static String m132274c(String str, int i) {
        if (str == null) {
            return str;
        }
        String trim = str.trim();
        if (trim.length() > i) {
            return trim.substring(0, i);
        }
        return trim;
    }

    @C0359n0
    /* renamed from: a */
    public synchronized Map<String, String> mo95069a() {
        return Collections.unmodifiableMap(new HashMap(this.f79493a));
    }

    /* renamed from: b */
    public final String mo95070b(String str) {
        if (str != null) {
            return m132274c(str, this.f79495c);
        }
        throw new IllegalArgumentException("Custom attribute key must not be null.");
    }

    /* renamed from: d */
    public synchronized boolean mo95071d(String str, String str2) {
        String b = mo95070b(str);
        if (this.f79493a.size() >= this.f79494b) {
            if (!this.f79493a.containsKey(b)) {
                C32741f f = C32741f.m132248f();
                f.mo95062m("Ignored entry \"" + str + "\" when adding custom keys. Maximum allowable: " + this.f79494b);
                return false;
            }
        }
        String c = m132274c(str2, this.f79495c);
        if (CommonUtils.m131915E(this.f79493a.get(b), c)) {
            return false;
        }
        Map<String, String> map = this.f79493a;
        if (str2 == null) {
            c = "";
        }
        map.put(b, c);
        return true;
    }

    /* renamed from: e */
    public synchronized void mo95072e(Map<String, String> map) {
        String str;
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            String b = mo95070b((String) next.getKey());
            if (this.f79493a.size() >= this.f79494b) {
                if (!this.f79493a.containsKey(b)) {
                    i++;
                }
            }
            String str2 = (String) next.getValue();
            Map<String, String> map2 = this.f79493a;
            if (str2 == null) {
                str = "";
            } else {
                str = m132274c(str2, this.f79495c);
            }
            map2.put(b, str);
        }
        if (i > 0) {
            C32741f f = C32741f.m132248f();
            f.mo95062m("Ignored " + i + " entries when adding custom keys. Maximum allowable: " + this.f79494b);
        }
    }
}
