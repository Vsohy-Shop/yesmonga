package com.usabilla.sdk.ubform.net;

import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n"}, mo22516d2 = {"Ljavax/net/ssl/SSLSocketFactory;", "kotlin.jvm.PlatformType", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class TLSSocketFactory$internalSSLSocketFactory$2 extends Lambda implements C11289a<SSLSocketFactory> {

    /* renamed from: f */
    public static final TLSSocketFactory$internalSSLSocketFactory$2 f26929f = new TLSSocketFactory$internalSSLSocketFactory$2();

    public TLSSocketFactory$internalSSLSocketFactory$2() {
        super(0);
    }

    /* renamed from: a */
    public final SSLSocketFactory invoke() {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
        return instance.getSocketFactory();
    }
}
