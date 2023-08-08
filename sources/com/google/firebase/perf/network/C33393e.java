package com.google.firebase.perf.network;

import com.google.firebase.perf.logging.C33363a;
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

/* renamed from: com.google.firebase.perf.network.e */
public class C33393e {

    /* renamed from: f */
    public static final C33363a f81152f = C33363a.m134449e();

    /* renamed from: g */
    public static final String f81153g = "User-Agent";

    /* renamed from: a */
    public final HttpURLConnection f81154a;

    /* renamed from: b */
    public final C33381i f81155b;

    /* renamed from: c */
    public long f81156c = -1;

    /* renamed from: d */
    public long f81157d = -1;

    /* renamed from: e */
    public final Timer f81158e;

    public C33393e(HttpURLConnection httpURLConnection, Timer timer, C33381i iVar) {
        this.f81154a = httpURLConnection;
        this.f81155b = iVar;
        this.f81158e = timer;
        iVar.mo96556z(httpURLConnection.getURL().toString());
    }

    /* renamed from: A */
    public boolean mo96718A() {
        return this.f81154a.getInstanceFollowRedirects();
    }

    /* renamed from: B */
    public long mo96719B() {
        mo96745a0();
        return this.f81154a.getLastModified();
    }

    /* renamed from: C */
    public OutputStream mo96720C() throws IOException {
        try {
            OutputStream outputStream = this.f81154a.getOutputStream();
            if (outputStream != null) {
                return new C33390b(outputStream, this.f81155b, this.f81158e);
            }
            return outputStream;
        } catch (IOException e) {
            this.f81155b.mo96554x(this.f81158e.mo96891c());
            C33396h.m134675d(this.f81155b);
            throw e;
        }
    }

    /* renamed from: D */
    public Permission mo96721D() throws IOException {
        try {
            return this.f81154a.getPermission();
        } catch (IOException e) {
            this.f81155b.mo96554x(this.f81158e.mo96891c());
            C33396h.m134675d(this.f81155b);
            throw e;
        }
    }

    /* renamed from: E */
    public int mo96722E() {
        return this.f81154a.getReadTimeout();
    }

    /* renamed from: F */
    public String mo96723F() {
        return this.f81154a.getRequestMethod();
    }

    /* renamed from: G */
    public Map<String, List<String>> mo96724G() {
        return this.f81154a.getRequestProperties();
    }

    /* renamed from: H */
    public String mo96725H(String str) {
        return this.f81154a.getRequestProperty(str);
    }

    /* renamed from: I */
    public int mo96726I() throws IOException {
        mo96745a0();
        if (this.f81157d == -1) {
            long c = this.f81158e.mo96891c();
            this.f81157d = c;
            this.f81155b.mo96555y(c);
        }
        try {
            int responseCode = this.f81154a.getResponseCode();
            this.f81155b.mo96545o(responseCode);
            return responseCode;
        } catch (IOException e) {
            this.f81155b.mo96554x(this.f81158e.mo96891c());
            C33396h.m134675d(this.f81155b);
            throw e;
        }
    }

    /* renamed from: J */
    public String mo96727J() throws IOException {
        mo96745a0();
        if (this.f81157d == -1) {
            long c = this.f81158e.mo96891c();
            this.f81157d = c;
            this.f81155b.mo96555y(c);
        }
        try {
            String responseMessage = this.f81154a.getResponseMessage();
            this.f81155b.mo96545o(this.f81154a.getResponseCode());
            return responseMessage;
        } catch (IOException e) {
            this.f81155b.mo96554x(this.f81158e.mo96891c());
            C33396h.m134675d(this.f81155b);
            throw e;
        }
    }

    /* renamed from: K */
    public URL mo96728K() {
        return this.f81154a.getURL();
    }

    /* renamed from: L */
    public boolean mo96729L() {
        return this.f81154a.getUseCaches();
    }

    /* renamed from: M */
    public void mo96730M(boolean z) {
        this.f81154a.setAllowUserInteraction(z);
    }

    /* renamed from: N */
    public void mo96731N(int i) {
        this.f81154a.setChunkedStreamingMode(i);
    }

    /* renamed from: O */
    public void mo96732O(int i) {
        this.f81154a.setConnectTimeout(i);
    }

    /* renamed from: P */
    public void mo96733P(boolean z) {
        this.f81154a.setDefaultUseCaches(z);
    }

    /* renamed from: Q */
    public void mo96734Q(boolean z) {
        this.f81154a.setDoInput(z);
    }

    /* renamed from: R */
    public void mo96735R(boolean z) {
        this.f81154a.setDoOutput(z);
    }

    /* renamed from: S */
    public void mo96736S(int i) {
        this.f81154a.setFixedLengthStreamingMode(i);
    }

    /* renamed from: T */
    public void mo96737T(long j) {
        this.f81154a.setFixedLengthStreamingMode(j);
    }

    /* renamed from: U */
    public void mo96738U(long j) {
        this.f81154a.setIfModifiedSince(j);
    }

    /* renamed from: V */
    public void mo96739V(boolean z) {
        this.f81154a.setInstanceFollowRedirects(z);
    }

    /* renamed from: W */
    public void mo96740W(int i) {
        this.f81154a.setReadTimeout(i);
    }

    /* renamed from: X */
    public void mo96741X(String str) throws ProtocolException {
        this.f81154a.setRequestMethod(str);
    }

    /* renamed from: Y */
    public void mo96742Y(String str, String str2) {
        if ("User-Agent".equalsIgnoreCase(str)) {
            this.f81155b.mo96533A(str2);
        }
        this.f81154a.setRequestProperty(str, str2);
    }

    /* renamed from: Z */
    public void mo96743Z(boolean z) {
        this.f81154a.setUseCaches(z);
    }

    /* renamed from: a */
    public void mo96744a(String str, String str2) {
        this.f81154a.addRequestProperty(str, str2);
    }

    /* renamed from: a0 */
    public final void mo96745a0() {
        if (this.f81156c == -1) {
            this.f81158e.mo96895g();
            long e = this.f81158e.mo96894e();
            this.f81156c = e;
            this.f81155b.mo96550t(e);
        }
        String F = mo96723F();
        if (F != null) {
            this.f81155b.mo96544n(F);
        } else if (mo96762o()) {
            this.f81155b.mo96544n("POST");
        } else {
            this.f81155b.mo96544n("GET");
        }
    }

    /* renamed from: b */
    public void mo96746b() throws IOException {
        if (this.f81156c == -1) {
            this.f81158e.mo96895g();
            long e = this.f81158e.mo96894e();
            this.f81156c = e;
            this.f81155b.mo96550t(e);
        }
        try {
            this.f81154a.connect();
        } catch (IOException e2) {
            this.f81155b.mo96554x(this.f81158e.mo96891c());
            C33396h.m134675d(this.f81155b);
            throw e2;
        }
    }

    /* renamed from: b0 */
    public boolean mo96747b0() {
        return this.f81154a.usingProxy();
    }

    /* renamed from: c */
    public void mo96748c() {
        this.f81155b.mo96554x(this.f81158e.mo96891c());
        this.f81155b.mo96534b();
        this.f81154a.disconnect();
    }

    /* renamed from: d */
    public boolean mo96749d() {
        return this.f81154a.getAllowUserInteraction();
    }

    /* renamed from: e */
    public int mo96750e() {
        return this.f81154a.getConnectTimeout();
    }

    public boolean equals(Object obj) {
        return this.f81154a.equals(obj);
    }

    /* renamed from: f */
    public Object mo96752f() throws IOException {
        mo96745a0();
        this.f81155b.mo96545o(this.f81154a.getResponseCode());
        try {
            Object content = this.f81154a.getContent();
            if (content instanceof InputStream) {
                this.f81155b.mo96551u(this.f81154a.getContentType());
                return new C33389a((InputStream) content, this.f81155b, this.f81158e);
            }
            this.f81155b.mo96551u(this.f81154a.getContentType());
            this.f81155b.mo96552v((long) this.f81154a.getContentLength());
            this.f81155b.mo96554x(this.f81158e.mo96891c());
            this.f81155b.mo96534b();
            return content;
        } catch (IOException e) {
            this.f81155b.mo96554x(this.f81158e.mo96891c());
            C33396h.m134675d(this.f81155b);
            throw e;
        }
    }

    /* renamed from: g */
    public Object mo96753g(Class[] clsArr) throws IOException {
        mo96745a0();
        this.f81155b.mo96545o(this.f81154a.getResponseCode());
        try {
            Object content = this.f81154a.getContent(clsArr);
            if (content instanceof InputStream) {
                this.f81155b.mo96551u(this.f81154a.getContentType());
                return new C33389a((InputStream) content, this.f81155b, this.f81158e);
            }
            this.f81155b.mo96551u(this.f81154a.getContentType());
            this.f81155b.mo96552v((long) this.f81154a.getContentLength());
            this.f81155b.mo96554x(this.f81158e.mo96891c());
            this.f81155b.mo96534b();
            return content;
        } catch (IOException e) {
            this.f81155b.mo96554x(this.f81158e.mo96891c());
            C33396h.m134675d(this.f81155b);
            throw e;
        }
    }

    /* renamed from: h */
    public String mo96754h() {
        mo96745a0();
        return this.f81154a.getContentEncoding();
    }

    public int hashCode() {
        return this.f81154a.hashCode();
    }

    /* renamed from: i */
    public int mo96756i() {
        mo96745a0();
        return this.f81154a.getContentLength();
    }

    /* renamed from: j */
    public long mo96757j() {
        mo96745a0();
        return this.f81154a.getContentLengthLong();
    }

    /* renamed from: k */
    public String mo96758k() {
        mo96745a0();
        return this.f81154a.getContentType();
    }

    /* renamed from: l */
    public long mo96759l() {
        mo96745a0();
        return this.f81154a.getDate();
    }

    /* renamed from: m */
    public boolean mo96760m() {
        return this.f81154a.getDefaultUseCaches();
    }

    /* renamed from: n */
    public boolean mo96761n() {
        return this.f81154a.getDoInput();
    }

    /* renamed from: o */
    public boolean mo96762o() {
        return this.f81154a.getDoOutput();
    }

    /* renamed from: p */
    public InputStream mo96763p() {
        mo96745a0();
        try {
            this.f81155b.mo96545o(this.f81154a.getResponseCode());
        } catch (IOException unused) {
            f81152f.mo96429a("IOException thrown trying to obtain the response code");
        }
        InputStream errorStream = this.f81154a.getErrorStream();
        if (errorStream != null) {
            return new C33389a(errorStream, this.f81155b, this.f81158e);
        }
        return errorStream;
    }

    /* renamed from: q */
    public long mo96764q() {
        mo96745a0();
        return this.f81154a.getExpiration();
    }

    /* renamed from: r */
    public String mo96765r(int i) {
        mo96745a0();
        return this.f81154a.getHeaderField(i);
    }

    /* renamed from: s */
    public String mo96766s(String str) {
        mo96745a0();
        return this.f81154a.getHeaderField(str);
    }

    /* renamed from: t */
    public long mo96767t(String str, long j) {
        mo96745a0();
        return this.f81154a.getHeaderFieldDate(str, j);
    }

    public String toString() {
        return this.f81154a.toString();
    }

    /* renamed from: u */
    public int mo96769u(String str, int i) {
        mo96745a0();
        return this.f81154a.getHeaderFieldInt(str, i);
    }

    /* renamed from: v */
    public String mo96770v(int i) {
        mo96745a0();
        return this.f81154a.getHeaderFieldKey(i);
    }

    /* renamed from: w */
    public long mo96771w(String str, long j) {
        mo96745a0();
        return this.f81154a.getHeaderFieldLong(str, j);
    }

    /* renamed from: x */
    public Map<String, List<String>> mo96772x() {
        mo96745a0();
        return this.f81154a.getHeaderFields();
    }

    /* renamed from: y */
    public long mo96773y() {
        return this.f81154a.getIfModifiedSince();
    }

    /* renamed from: z */
    public InputStream mo96774z() throws IOException {
        mo96745a0();
        this.f81155b.mo96545o(this.f81154a.getResponseCode());
        this.f81155b.mo96551u(this.f81154a.getContentType());
        try {
            InputStream inputStream = this.f81154a.getInputStream();
            if (inputStream != null) {
                return new C33389a(inputStream, this.f81155b, this.f81158e);
            }
            return inputStream;
        } catch (IOException e) {
            this.f81155b.mo96554x(this.f81158e.mo96891c());
            C33396h.m134675d(this.f81155b);
            throw e;
        }
    }
}
