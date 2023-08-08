package com.urbanairship.contacts;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.urbanairship.contacts.s */
public class C9100s implements C9333e {

    /* renamed from: c */
    public static final String f24592c = "platform_name";

    /* renamed from: d */
    public static final String f24593d = "identifiers";
    @C0359n0

    /* renamed from: a */
    public final String f24594a;
    @C0363p0

    /* renamed from: b */
    public final Map<String, String> f24595b;

    public C9100s(@C0359n0 String str, @C0363p0 Map<String, String> map) {
        this.f24594a = str;
        this.f24595b = map;
    }

    /* renamed from: a */
    public static C9100s m33968a(@C0359n0 JsonValue jsonValue) throws JsonException {
        HashMap hashMap;
        String F = jsonValue.mo18749A().mo18801A(f24592c).mo18753F();
        C9323b j = jsonValue.mo18749A().mo18801A("identifiers").mo18767j();
        if (j != null) {
            hashMap = new HashMap();
            for (Map.Entry next : j.mo18809i()) {
                hashMap.put((String) next.getKey(), ((JsonValue) next.getValue()).mo18753F());
            }
        } else {
            hashMap = null;
        }
        return new C9100s(F, hashMap);
    }

    /* renamed from: d */
    public static C9100s m33969d(@C0359n0 String str) {
        return new C9100s(str, (Map<String, String>) null);
    }

    /* renamed from: e */
    public static C9100s m33970e(@C0359n0 String str, @C0363p0 Map<String, String> map) {
        return new C9100s(str, map);
    }

    @C0363p0
    /* renamed from: b */
    public Map<String, String> mo18092b() {
        return this.f24595b;
    }

    @C0359n0
    /* renamed from: c */
    public String mo18093c() {
        return this.f24594a;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g(f24592c, this.f24594a).mo18826j("identifiers", this.f24595b).mo18817a().mo17264q();
    }
}
