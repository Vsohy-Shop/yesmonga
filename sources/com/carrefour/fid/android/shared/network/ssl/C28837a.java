package com.carrefour.fid.android.shared.network.ssl;

import android.annotation.SuppressLint;
import androidx.compose.runtime.internal.C8567o;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import javax.security.cert.CertificateException;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@SuppressLint({"TrustAllX509TrustManager"})
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.shared.network.ssl.a */
public final class C28837a implements X509TrustManager {

    /* renamed from: a */
    public static final int f70634a = 0;

    public void checkClientTrusted(@C12580l X509Certificate[] x509CertificateArr, @C12580l String str) throws CertificateException {
    }

    public void checkServerTrusted(@C12580l X509Certificate[] x509CertificateArr, @C12580l String str) throws CertificateException {
    }

    @C12579k
    public X509Certificate[] getAcceptedIssuers() {
        return new X509Certificate[0];
    }
}
