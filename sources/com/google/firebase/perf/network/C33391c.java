package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C33381i;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.Permission;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.firebase.perf.network.c */
public final class C33391c extends HttpURLConnection {

    /* renamed from: a */
    public final C33393e f81149a;

    public C33391c(HttpURLConnection httpURLConnection, Timer timer, C33381i iVar) {
        super(httpURLConnection.getURL());
        this.f81149a = new C33393e(httpURLConnection, timer, iVar);
    }

    public void addRequestProperty(String str, String str2) {
        this.f81149a.mo96744a(str, str2);
    }

    public void connect() throws IOException {
        this.f81149a.mo96746b();
    }

    public void disconnect() {
        this.f81149a.mo96748c();
    }

    public boolean equals(Object obj) {
        return this.f81149a.equals(obj);
    }

    public boolean getAllowUserInteraction() {
        return this.f81149a.mo96749d();
    }

    public int getConnectTimeout() {
        return this.f81149a.mo96750e();
    }

    public Object getContent() throws IOException {
        return this.f81149a.mo96752f();
    }

    public String getContentEncoding() {
        return this.f81149a.mo96754h();
    }

    public int getContentLength() {
        return this.f81149a.mo96756i();
    }

    public long getContentLengthLong() {
        return this.f81149a.mo96757j();
    }

    public String getContentType() {
        return this.f81149a.mo96758k();
    }

    public long getDate() {
        return this.f81149a.mo96759l();
    }

    public boolean getDefaultUseCaches() {
        return this.f81149a.mo96760m();
    }

    public boolean getDoInput() {
        return this.f81149a.mo96761n();
    }

    public boolean getDoOutput() {
        return this.f81149a.mo96762o();
    }

    public InputStream getErrorStream() {
        return this.f81149a.mo96763p();
    }

    public long getExpiration() {
        return this.f81149a.mo96764q();
    }

    public String getHeaderField(int i) {
        return this.f81149a.mo96765r(i);
    }

    public long getHeaderFieldDate(String str, long j) {
        return this.f81149a.mo96767t(str, j);
    }

    public int getHeaderFieldInt(String str, int i) {
        return this.f81149a.mo96769u(str, i);
    }

    public String getHeaderFieldKey(int i) {
        return this.f81149a.mo96770v(i);
    }

    public long getHeaderFieldLong(String str, long j) {
        return this.f81149a.mo96771w(str, j);
    }

    public Map<String, List<String>> getHeaderFields() {
        return this.f81149a.mo96772x();
    }

    public long getIfModifiedSince() {
        return this.f81149a.mo96773y();
    }

    public InputStream getInputStream() throws IOException {
        return this.f81149a.mo96774z();
    }

    public boolean getInstanceFollowRedirects() {
        return this.f81149a.mo96718A();
    }

    public long getLastModified() {
        return this.f81149a.mo96719B();
    }

    public OutputStream getOutputStream() throws IOException {
        return this.f81149a.mo96720C();
    }

    public Permission getPermission() throws IOException {
        return this.f81149a.mo96721D();
    }

    public int getReadTimeout() {
        return this.f81149a.mo96722E();
    }

    public String getRequestMethod() {
        return this.f81149a.mo96723F();
    }

    public Map<String, List<String>> getRequestProperties() {
        return this.f81149a.mo96724G();
    }

    public String getRequestProperty(String str) {
        return this.f81149a.mo96725H(str);
    }

    public int getResponseCode() throws IOException {
        return this.f81149a.mo96726I();
    }

    public String getResponseMessage() throws IOException {
        return this.f81149a.mo96727J();
    }

    public URL getURL() {
        return this.f81149a.mo96728K();
    }

    public boolean getUseCaches() {
        return this.f81149a.mo96729L();
    }

    public int hashCode() {
        return this.f81149a.hashCode();
    }

    public void setAllowUserInteraction(boolean z) {
        this.f81149a.mo96730M(z);
    }

    public void setChunkedStreamingMode(int i) {
        this.f81149a.mo96731N(i);
    }

    public void setConnectTimeout(int i) {
        this.f81149a.mo96732O(i);
    }

    public void setDefaultUseCaches(boolean z) {
        this.f81149a.mo96733P(z);
    }

    public void setDoInput(boolean z) {
        this.f81149a.mo96734Q(z);
    }

    public void setDoOutput(boolean z) {
        this.f81149a.mo96735R(z);
    }

    public void setFixedLengthStreamingMode(int i) {
        this.f81149a.mo96736S(i);
    }

    public void setIfModifiedSince(long j) {
        this.f81149a.mo96738U(j);
    }

    public void setInstanceFollowRedirects(boolean z) {
        this.f81149a.mo96739V(z);
    }

    public void setReadTimeout(int i) {
        this.f81149a.mo96740W(i);
    }

    public void setRequestMethod(String str) throws ProtocolException {
        this.f81149a.mo96741X(str);
    }

    public void setRequestProperty(String str, String str2) {
        this.f81149a.mo96742Y(str, str2);
    }

    public void setUseCaches(boolean z) {
        this.f81149a.mo96743Z(z);
    }

    public String toString() {
        return this.f81149a.toString();
    }

    public boolean usingProxy() {
        return this.f81149a.mo96747b0();
    }

    public Object getContent(Class[] clsArr) throws IOException {
        return this.f81149a.mo96753g(clsArr);
    }

    public String getHeaderField(String str) {
        return this.f81149a.mo96766s(str);
    }

    public void setFixedLengthStreamingMode(long j) {
        this.f81149a.mo96737T(j);
    }
}
