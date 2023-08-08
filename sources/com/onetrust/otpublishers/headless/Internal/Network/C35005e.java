package com.onetrust.otpublishers.headless.Internal.Network;

import android.os.Handler;
import com.onetrust.otpublishers.headless.Internal.Network.C35006f;
import com.onetrust.otpublishers.headless.Public.OTCallback;
import com.onetrust.otpublishers.headless.Public.OTPublishersHeadlessSDK;
import retrofit2.C13091w;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Network.e */
public final /* synthetic */ class C35005e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C35006f.C35007a f85149a;

    /* renamed from: b */
    public final /* synthetic */ C13091w f85150b;

    /* renamed from: c */
    public final /* synthetic */ String f85151c;

    /* renamed from: d */
    public final /* synthetic */ OTCallback f85152d;

    /* renamed from: e */
    public final /* synthetic */ Handler f85153e;

    /* renamed from: f */
    public final /* synthetic */ OTPublishersHeadlessSDK f85154f;

    public /* synthetic */ C35005e(C35006f.C35007a aVar, C13091w wVar, String str, OTCallback oTCallback, Handler handler, OTPublishersHeadlessSDK oTPublishersHeadlessSDK) {
        this.f85149a = aVar;
        this.f85150b = wVar;
        this.f85151c = str;
        this.f85152d = oTCallback;
        this.f85153e = handler;
        this.f85154f = oTPublishersHeadlessSDK;
    }

    public final void run() {
        this.f85149a.m143522d(this.f85150b, this.f85151c, this.f85152d, this.f85153e, this.f85154f);
    }
}
