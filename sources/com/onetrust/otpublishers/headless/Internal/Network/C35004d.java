package com.onetrust.otpublishers.headless.Internal.Network;

import com.onetrust.otpublishers.headless.Public.DataModel.OTSdkParams;
import okhttp3.C12451Response;
import okhttp3.Interceptor;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Network.d */
public final /* synthetic */ class C35004d implements Interceptor {

    /* renamed from: a */
    public final /* synthetic */ C35006f f85143a;

    /* renamed from: b */
    public final /* synthetic */ String f85144b;

    /* renamed from: c */
    public final /* synthetic */ String f85145c;

    /* renamed from: d */
    public final /* synthetic */ String f85146d;

    /* renamed from: e */
    public final /* synthetic */ String f85147e;

    /* renamed from: f */
    public final /* synthetic */ OTSdkParams f85148f;

    public /* synthetic */ C35004d(C35006f fVar, String str, String str2, String str3, String str4, OTSdkParams oTSdkParams) {
        this.f85143a = fVar;
        this.f85144b = str;
        this.f85145c = str2;
        this.f85146d = str3;
        this.f85147e = str4;
        this.f85148f = oTSdkParams;
    }

    public final C12451Response intercept(Interceptor.Chain chain) {
        return this.f85143a.m143500g(this.f85144b, this.f85145c, this.f85146d, this.f85147e, this.f85148f, chain);
    }
}
