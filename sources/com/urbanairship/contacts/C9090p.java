package com.urbanairship.contacts;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;

/* renamed from: com.urbanairship.contacts.p */
public class C9090p implements C9333e {

    /* renamed from: d */
    public static final String f24543d = "contact_id";

    /* renamed from: e */
    public static final String f24544e = "is_anonymous";

    /* renamed from: f */
    public static final String f24545f = "named_user_id";
    @C0359n0

    /* renamed from: a */
    public final String f24546a;

    /* renamed from: b */
    public final boolean f24547b;
    @C0363p0

    /* renamed from: c */
    public final String f24548c;

    public C9090p(@C0359n0 String str, boolean z, @C0363p0 String str2) {
        this.f24546a = str;
        this.f24547b = z;
        this.f24548c = str2;
    }

    @C0359n0
    /* renamed from: a */
    public static C9090p m33914a(@C0359n0 JsonValue jsonValue) throws JsonException {
        String l = jsonValue.mo18749A().mo18801A("contact_id").mo18769l();
        if (l != null) {
            return new C9090p(l, jsonValue.mo18749A().mo18801A("is_anonymous").mo18757c(false), jsonValue.mo18749A().mo18801A("named_user_id").mo18769l());
        }
        throw new JsonException("Invalid contact identity " + jsonValue);
    }

    @C0359n0
    /* renamed from: b */
    public String mo18067b() {
        return this.f24546a;
    }

    @C0363p0
    /* renamed from: c */
    public String mo18068c() {
        return this.f24548c;
    }

    /* renamed from: d */
    public boolean mo18069d() {
        return this.f24547b;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g("contact_id", this.f24546a).mo18824h("is_anonymous", this.f24547b).mo18823g("named_user_id", this.f24548c).mo18817a().mo17264q();
    }
}
