package com.urbanairship.iam.custom;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.iam.C9166d;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;

/* renamed from: com.urbanairship.iam.custom.a */
public class C9165a implements C9166d {

    /* renamed from: b */
    public static final String f24861b = "custom";

    /* renamed from: a */
    public final JsonValue f24862a;

    public C9165a(@C0359n0 JsonValue jsonValue) {
        this.f24862a = jsonValue;
    }

    @C0359n0
    /* renamed from: a */
    public static C9165a m34356a(@C0359n0 JsonValue jsonValue) throws JsonException {
        if (jsonValue.mo18778u()) {
            return new C9165a(jsonValue.mo18749A().mo18801A("custom"));
        }
        throw new JsonException("Invalid custom display content: " + jsonValue);
    }

    @C0359n0
    /* renamed from: b */
    public JsonValue mo18379b() {
        return this.f24862a;
    }

    public boolean equals(@C0363p0 Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f24862a.equals(((C9165a) obj).f24862a);
    }

    public int hashCode() {
        return this.f24862a.hashCode();
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18822f("custom", this.f24862a).mo18817a().mo17264q();
    }
}
