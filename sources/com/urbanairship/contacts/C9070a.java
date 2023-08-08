package com.urbanairship.contacts;

import androidx.annotation.C0359n0;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.C9333e;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;

/* renamed from: com.urbanairship.contacts.a */
public class C9070a implements C9333e {

    /* renamed from: c */
    public static final String f24488c = "channel_id";

    /* renamed from: d */
    public static final String f24489d = "channel_type";

    /* renamed from: a */
    public String f24490a;

    /* renamed from: b */
    public ChannelType f24491b;

    public C9070a(@C0359n0 String str, @C0359n0 ChannelType channelType) {
        this.f24490a = str;
        this.f24491b = channelType;
    }

    @C0359n0
    /* renamed from: a */
    public static C9070a m33819a(@C0359n0 JsonValue jsonValue) throws JsonException {
        String F = jsonValue.mo18749A().mo18801A("channel_id").mo18753F();
        String F2 = jsonValue.mo18749A().mo18801A(f24489d).mo18753F();
        try {
            return new C9070a(F, ChannelType.valueOf(F2));
        } catch (IllegalArgumentException e) {
            throw new JsonException("Invalid channel type " + F2, e);
        }
    }

    /* renamed from: b */
    public String mo18003b() {
        return this.f24490a;
    }

    @C0359n0
    /* renamed from: c */
    public ChannelType mo18004c() {
        return this.f24491b;
    }

    @C0359n0
    /* renamed from: q */
    public JsonValue mo17264q() {
        return C9323b.m35017y().mo18823g(f24489d, this.f24491b.toString()).mo18823g("channel_id", this.f24490a).mo18817a().mo17264q();
    }
}
