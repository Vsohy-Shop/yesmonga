package com.google.android.play.core.internal;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* renamed from: com.google.android.play.core.internal.g */
final class C32050g extends C32053h {

    /* renamed from: a */
    private final byte[] f78258a;

    public C32050g(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.f78258a = bArr;
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.f78258a;
    }
}
