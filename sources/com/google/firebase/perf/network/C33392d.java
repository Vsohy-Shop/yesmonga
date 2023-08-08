package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C33381i;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.security.Principal;
import java.security.cert.Certificate;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.firebase.perf.network.d */
public final class C33392d extends HttpsURLConnection {

    /* renamed from: a */
    public final C33393e f81150a;

    /* renamed from: b */
    public final HttpsURLConnection f81151b;

    public C33392d(HttpsURLConnection httpsURLConnection, Timer timer, C33381i iVar) {
        super(httpsURLConnection.getURL());
        this.f81151b = httpsURLConnection;
        this.f81150a = new C33393e(httpsURLConnection, timer, iVar);
    }

    public void addRequestProperty(String str, String str2) {
        this.f81150a.mo96744a(str, str2);
    }

    public void connect() throws IOException {
        this.f81150a.mo96746b();
    }

    public void disconnect() {
        this.f81150a.mo96748c();
    }

    public boolean equals(Object obj) {
        return this.f81150a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f81150a.mo96749d();
    }

    public String getCipherSuite() {
        return this.f81151b.getCipherSuite();
    }

    public int getConnectTimeout() {
        return this.f81150a.mo96750e();
    }

    public Object getContent() throws IOException {
        return this.f81150a.mo96752f();
    }

    public String getContentEncoding() {
        return this.f81150a.mo96754h();
    }

    public int getContentLength() {
        return this.f81150a.mo96756i();
    }

    public long getContentLengthLong() {
        return this.f81150a.mo96757j();
    }

    public String getContentType() {
        return this.f81150a.mo96758k();
    }

    public long getDate() {
        return this.f81150a.mo96759l();
    }

    public boolean getDefaultUseCaches() {
        return this.f81150a.mo96760m();
    }

    public boolean getDoInput() {
        return this.f81150a.mo96761n();
    }

    public boolean getDoOutput() {
        return this.f81150a.mo96762o();
    }

    public InputStream getErrorStream() {
        return this.f81150a.mo96763p();
    }

    public long getExpiration() {
        return this.f81150a.mo96764q();
    }

    public String getHeaderField(int i) {
        return this.f81150a.mo96765r(i);
    }

    public long getHeaderFieldDate(String str, long j) {
        return this.f81150a.mo96767t(str, j);
    }

    public int getHeaderFieldInt(String str, int i) {
        return this.f81150a.mo96769u(str, i);
    }

    public String getHeaderFieldKey(int i) {
        return this.f81150a.mo96770v(i);
    }

    public long getHeaderFieldLong(String str, long j) {
        return this.f81150a.mo96771w(str, j);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.f81150a.mo96772x();
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f81151b.getHostnameVerifier();
    }

    public long getIfModifiedSince() {
        return this.f81150a.mo96773y();
    }

    public InputStream getInputStream() throws IOException {
        return this.f81150a.mo96774z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f81150a.mo96718A();
    }

    public long getLastModified() {
        return this.f81150a.mo96719B();
    }

    public Certificate[] getLocalCertificates() {
        return this.f81151b.getLocalCertificates();
    }

    public Principal getLocalPrincipal() {
        return this.f81151b.getLocalPrincipal();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.f81150a.mo96720C();
    }

    public Principal getPeerPrincipal() throws SSLPeerUnverifiedException {
        return this.f81151b.getPeerPrincipal();
    }

    public Permission getPermission() throws IOException {
        return this.f81150a.mo96721D();
    }

    public int getReadTimeout() {
        return this.f81150a.mo96722E();
    }

    public String getRequestMethod() {
        return this.f81150a.mo96723F();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.f81150a.mo96724G();
    }

    public String getRequestProperty(String str) {
        return this.f81150a.mo96725H(str);
    }

    public int getResponseCode() throws IOException {
        return this.f81150a.mo96726I();
    }

    public String getResponseMessage() throws IOException {
        return this.f81150a.mo96727J();
    }

    public SSLSocketFactory getSSLSocketFactory() {
        return this.f81151b.getSSLSocketFactory();
    }

    public Certificate[] getServerCertificates() throws SSLPeerUnverifiedException {
        return this.f81151b.getServerCertificates();
    }

    public URL getURL() {
        return this.f81150a.mo96728K();
    }

    public boolean getUseCaches() {
        return this.f81150a.mo96729L();
    }

    public int hashCode() {
        return this.f81150a.hashCode();
    }

    public void setAllowUserInteraction(boolean z) {
        this.f81150a.mo96730M(z);
    }

    public void setChunkedStreamingMode(int i) {
        this.f81150a.mo96731N(i);
    }

    public void setConnectTimeout(int i) {
        this.f81150a.mo96732O(i);
    }

    public void setDefaultUseCaches(boolean z) {
        this.f81150a.mo96733P(z);
    }

    public void setDoInput(boolean z) {
        this.f81150a.mo96734Q(z);
    }

    public void setDoOutput(boolean z) {
        this.f81150a.mo96735R(z);
    }

    public void setFixedLengthStreamingMode(int i) {
        this.f81150a.mo96736S(i);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f81151b.setHostnameVerifier(hostnameVerifier);
    }

    public void setIfModifiedSince(long j) {
        this.f81150a.mo96738U(j);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.f81150a.mo96739V(z);
    }

    public void setReadTimeout(int i) {
        this.f81150a.mo96740W(i);
    }

    public void setRequestMethod(String str) throws ProtocolException {
        this.f81150a.mo96741X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f81150a.mo96742Y(str, str2);
    }

    public void setSSLSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f81151b.setSSLSocketFactory(sSLSocketFactory);
    }

    public void setUseCaches(boolean z) {
        this.f81150a.mo96743Z(z);
    }

    public String toString() {
        return this.f81150a.toString();
    }

    public boolean usingProxy() {
        return this.f81150a.mo96747b0();
    }

    public Object getContent(Class[] clsArr) throws IOException {
        return this.f81150a.mo96753g(clsArr);
    }

    public String getHeaderField(String str) {
        return this.f81150a.mo96766s(str);
    }

    public void setFixedLengthStreamingMode(long j) {
        this.f81150a.mo96737T(j);
    }
}
