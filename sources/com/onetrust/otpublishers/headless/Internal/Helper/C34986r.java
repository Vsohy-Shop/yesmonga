package com.onetrust.otpublishers.headless.Internal.Helper;

import android.content.Context;
import org.json.JSONObject;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Helper.r */
public final /* synthetic */ class C34986r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C34987s f85109a;

    /* renamed from: b */
    public final /* synthetic */ Context f85110b;

    /* renamed from: c */
    public final /* synthetic */ JSONObject f85111c;

    public /* synthetic */ C34986r(C34987s sVar, Context context, JSONObject jSONObject) {
        this.f85109a = sVar;
        this.f85110b = context;
        this.f85111c = jSONObject;
    }

    public final void run() {
        this.f85109a.m143348d(this.f85110b, this.f85111c);
    }
}
