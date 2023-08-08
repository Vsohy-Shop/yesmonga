package com.urbanairship.analytics;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0386z0;
import androidx.annotation.RestrictTo;
import com.carrefour.fid.android.airship.util.C13758b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.urbanairship.analytics.g */
public class C35549g implements C9333e {

    /* renamed from: b */
    public static final int f87717b = 255;

    /* renamed from: c */
    public static final int f87718c = 100;

    /* renamed from: d */
    public static final String f87719d = "com.urbanairship.aaid";

    /* renamed from: e */
    public static final String f87720e = "com.urbanairship.limited_ad_tracking_enabled";
    @C0359n0

    /* renamed from: a */
    public final Map<String, String> f87721a;

    /* renamed from: com.urbanairship.analytics.g$a */
    public static abstract class C35550a {

        /* renamed from: a */
        public boolean f87722a = false;

        /* renamed from: b */
        public final Map<String, String> f87723b = new HashMap();

        /* renamed from: c */
        public final List<String> f87724c = new ArrayList();

        @C0359n0
        /* renamed from: a */
        public C35550a mo106485a(@C0359n0 @C0386z0(max = 255, min = 1) String str, @C0359n0 @C0386z0(max = 255, min = 1) String str2) {
            this.f87724c.remove(str);
            this.f87723b.put(str, str2);
            return this;
        }

        /* renamed from: b */
        public void mo106486b() {
            mo106449d(this.f87722a, this.f87723b, this.f87724c);
        }

        @C0359n0
        /* renamed from: c */
        public C35550a mo106487c() {
            this.f87722a = true;
            return this;
        }

        /* renamed from: d */
        public abstract void mo106449d(boolean z, @C0359n0 Map<String, String> map, @C0359n0 List<String> list);

        @C0359n0
        /* renamed from: e */
        public C35550a mo106488e() {
            mo106489f(C35549g.f87719d);
            mo106489f(C35549g.f87720e);
            return this;
        }

        @C0359n0
        /* renamed from: f */
        public C35550a mo106489f(@C0359n0 @C0386z0(max = 255, min = 1) String str) {
            this.f87723b.remove(str);
            this.f87724c.add(str);
            return this;
        }

        @C0359n0
        /* renamed from: g */
        public C35550a mo106490g(@C0359n0 @C0386z0(max = 255, min = 1) String str, boolean z) {
            String str2;
            mo106485a(C35549g.f87719d, str);
            if (z) {
                str2 = C13758b.f33436b;
            } else {
                str2 = C13758b.f33438c;
            }
            mo106485a(C35549g.f87720e, str2);
            return this;
        }
    }

    public C35549g() {
        this.f87721a = new HashMap();
    }

    @C0359n0
    /* renamed from: a */
    public static C35549g m146673a(@C0359n0 JsonValue jsonValue) throws JsonException {
        HashMap hashMap = new HashMap();
        if (jsonValue.mo18778u()) {
            Iterator<Map.Entry<String, JsonValue>> it = jsonValue.mo18749A().iterator();
            while (it.hasNext()) {
                Map.Entry next = it.next();
                hashMap.put((String) next.getKey(), ((JsonValue) next.getValue()).mo18750B());
            }
            return new C35549g(hashMap);
        }
        throw new JsonException("Associated identifiers not found in JsonValue: " + jsonValue);
    }

    @C0363p0
    /* renamed from: b */
    public String mo106482b() {
        return this.f87721a.get(f87719d);
    }

    @C0359n0
    /* renamed from: c */
    public Map<String, String> mo106483c() {
        return Collections.unmodifiableMap(this.f87721a);
    }

    /* renamed from: d */
    public boolean mo106484d() {
        String str = this.f87721a.get(f87720e);
        if (str == null || !str.equalsIgnoreCase(C13758b.f33436b)) {
            return false;
        }
        return true;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: q */
    public JsonValue mo17264q() {
        return JsonValue.m34975U(this.f87721a);
    }

    public C35549g(Map<String, String> map) {
        this.f87721a = new HashMap(map);
    }
}
