package com.urbanairship.contacts;

import androidx.annotation.C0359n0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;

/* renamed from: com.urbanairship.contacts.v */
public class C9103v implements C9333e {

    /* renamed from: b */
    public static final String f24608b = "sender_id";
    @C0359n0

    /* renamed from: a */
    public final String f24609a;

    public C9103v(@C0359n0 String str) {
        this.f24609a = str;
    }

    @C0359n0
    /* renamed from: a */
    public static C9103v m33992a(@C0359n0 JsonValue jsonValue) throws JsonException {
        return new C9103v(jsonValue.mo18749A().mo18801A(f24608b).mo18753F());
    }

    @C0359n0
    /* renamed from: c */
    public static C9103v m33993c(@C0359n0 String str) {
        return new C9103v(str);
    }

    @C0359n0
    /* renamed from: b */
    public String mo18108b() {
        return this.f24609a;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g(f24608b, this.f24609a).mo18817a().mo17264q();
    }
}
