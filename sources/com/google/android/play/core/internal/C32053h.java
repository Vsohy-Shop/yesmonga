package com.google.android.play.core.internal;

import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Set;

/* renamed from: com.google.android.play.core.internal.h */
class C32053h extends X509Certificate {

    /* renamed from: a */
    private final X509Certificate f78259a;

    public C32053h(X509Certificate x509Certificate) {
        this.f78259a = x509Certificate;
    }

    public final void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        this.f78259a.checkValidity();
    }

    public final int getBasicConstraints() {
        return this.f78259a.getBasicConstraints();
    }

    public final Set<String> getCriticalExtensionOIDs() {
        return this.f78259a.getCriticalExtensionOIDs();
    }

    public byte[] getEncoded() throws CertificateEncodingException {
        return this.f78259a.getEncoded();
    }

    public final byte[] getExtensionValue(String str) {
        return this.f78259a.getExtensionValue(str);
    }

    public final Principal getIssuerDN() {
        return this.f78259a.getIssuerDN();
    }

    public final boolean[] getIssuerUniqueID() {
        return this.f78259a.getIssuerUniqueID();
    }

    public final boolean[] getKeyUsage() {
        return this.f78259a.getKeyUsage();
    }

    public final Set<String> getNonCriticalExtensionOIDs() {
        return this.f78259a.getNonCriticalExtensionOIDs();
    }

    public final Date getNotAfter() {
        return this.f78259a.getNotAfter();
    }

    public final Date getNotBefore() {
        return this.f78259a.getNotBefore();
    }

    public final PublicKey getPublicKey() {
        return this.f78259a.getPublicKey();
    }

    public final BigInteger getSerialNumber() {
        return this.f78259a.getSerialNumber();
    }

    public final String getSigAlgName() {
        return this.f78259a.getSigAlgName();
    }

    public final String getSigAlgOID() {
        return this.f78259a.getSigAlgOID();
    }

    public final byte[] getSigAlgParams() {
        return this.f78259a.getSigAlgParams();
    }

    public final byte[] getSignature() {
        return this.f78259a.getSignature();
    }

    public final Principal getSubjectDN() {
        return this.f78259a.getSubjectDN();
    }

    public final boolean[] getSubjectUniqueID() {
        return this.f78259a.getSubjectUniqueID();
    }

    public final byte[] getTBSCertificate() throws CertificateEncodingException {
        return this.f78259a.getTBSCertificate();
    }

    public final int getVersion() {
        return this.f78259a.getVersion();
    }

    public final boolean hasUnsupportedCriticalExtension() {
        return this.f78259a.hasUnsupportedCriticalExtension();
    }

    public final String toString() {
        return this.f78259a.toString();
    }

    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f78259a.verify(publicKey);
    }

    public final void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        this.f78259a.checkValidity(date);
    }

    public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        this.f78259a.verify(publicKey, str);
    }
}
