package com.urbanairship.contacts;

import com.urbanairship.http.C9119d;
import java.util.Map;

/* renamed from: com.urbanairship.contacts.f */
public final /* synthetic */ class C9080f implements C9119d {

    /* renamed from: a */
    public final /* synthetic */ String f24532a;

    /* renamed from: b */
    public final /* synthetic */ ChannelType f24533b;

    public /* synthetic */ C9080f(String str, ChannelType channelType) {
        this.f24532a = str;
        this.f24533b = channelType;
    }

    /* renamed from: a */
    public final Object mo17322a(int i, Map map, String str) {
        return ContactApiClient.m33800k(this.f24532a, this.f24533b, i, map, str);
    }
}
