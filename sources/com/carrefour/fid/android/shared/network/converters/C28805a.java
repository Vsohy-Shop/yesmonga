package com.carrefour.fid.android.shared.network.converters;

import com.google.gson.C33708s;
import okhttp3.ResponseBody;
import retrofit2.C13015f;

/* renamed from: com.carrefour.fid.android.shared.network.converters.a */
public final /* synthetic */ class C28805a implements C13015f {

    /* renamed from: a */
    public final /* synthetic */ C28806b f70601a;

    /* renamed from: b */
    public final /* synthetic */ String f70602b;

    /* renamed from: c */
    public final /* synthetic */ C33708s f70603c;

    public /* synthetic */ C28805a(C28806b bVar, String str, C33708s sVar) {
        this.f70601a = bVar;
        this.f70602b = str;
        this.f70603c = sVar;
    }

    public final Object convert(Object obj) {
        return C28806b.m119227i(this.f70601a, this.f70602b, this.f70603c, (ResponseBody) obj);
    }
}
