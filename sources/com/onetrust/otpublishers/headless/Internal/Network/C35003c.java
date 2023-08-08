package com.onetrust.otpublishers.headless.Internal.Network;

import com.onetrust.otpublishers.headless.Public.OTCallback;
import com.onetrust.otpublishers.headless.Public.Response.OTResponse;

/* renamed from: com.onetrust.otpublishers.headless.Internal.Network.c */
public final /* synthetic */ class C35003c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ OTCallback f85141a;

    /* renamed from: b */
    public final /* synthetic */ OTResponse f85142b;

    public /* synthetic */ C35003c(OTCallback oTCallback, OTResponse oTResponse) {
        this.f85141a = oTCallback;
        this.f85142b = oTResponse;
    }

    public final void run() {
        this.f85141a.onSuccess(this.f85142b);
    }
}
