package com.carrefour.fid.android.shared.network;

import com.carrefour.fid.android.shared.network.GenericNetworkService;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: com.carrefour.fid.android.shared.network.e */
public final /* synthetic */ class C28809e implements HostnameVerifier {
    public final boolean verify(String str, SSLSession sSLSession) {
        return GenericNetworkService.Builder.m119194m(str, sSLSession);
    }
}
