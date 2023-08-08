package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.C33381i;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.C33442j;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class FirebasePerfUrlConnection {
    /* renamed from: a */
    public static Object m134615a(C33442j jVar, C33424k kVar, Timer timer) throws IOException {
        timer.mo96895g();
        long e = timer.mo96894e();
        C33381i c = C33381i.m134544c(kVar);
        try {
            URLConnection a = jVar.mo96915a();
            if (a instanceof HttpsURLConnection) {
                return new C33392d((HttpsURLConnection) a, timer, c).getContent();
            }
            if (a instanceof HttpURLConnection) {
                return new C33391c((HttpURLConnection) a, timer, c).getContent();
            }
            return a.getContent();
        } catch (IOException e2) {
            c.mo96550t(e);
            c.mo96554x(timer.mo96891c());
            c.mo96556z(jVar.toString());
            C33396h.m134675d(c);
            throw e2;
        }
    }

    /* renamed from: b */
    public static Object m134616b(C33442j jVar, Class[] clsArr, C33424k kVar, Timer timer) throws IOException {
        timer.mo96895g();
        long e = timer.mo96894e();
        C33381i c = C33381i.m134544c(kVar);
        try {
            URLConnection a = jVar.mo96915a();
            if (a instanceof HttpsURLConnection) {
                return new C33392d((HttpsURLConnection) a, timer, c).getContent(clsArr);
            }
            if (a instanceof HttpURLConnection) {
                return new C33391c((HttpURLConnection) a, timer, c).getContent(clsArr);
            }
            return a.getContent(clsArr);
        } catch (IOException e2) {
            c.mo96550t(e);
            c.mo96554x(timer.mo96891c());
            c.mo96556z(jVar.toString());
            C33396h.m134675d(c);
            throw e2;
        }
    }

    /* renamed from: c */
    public static InputStream m134617c(C33442j jVar, C33424k kVar, Timer timer) throws IOException {
        timer.mo96895g();
        long e = timer.mo96894e();
        C33381i c = C33381i.m134544c(kVar);
        try {
            URLConnection a = jVar.mo96915a();
            if (a instanceof HttpsURLConnection) {
                return new C33392d((HttpsURLConnection) a, timer, c).getInputStream();
            }
            if (a instanceof HttpURLConnection) {
                return new C33391c((HttpURLConnection) a, timer, c).getInputStream();
            }
            return a.getInputStream();
        } catch (IOException e2) {
            c.mo96550t(e);
            c.mo96554x(timer.mo96891c());
            c.mo96556z(jVar.toString());
            C33396h.m134675d(c);
            throw e2;
        }
    }

    @Keep
    public static Object getContent(URL url) throws IOException {
        return m134615a(new C33442j(url), C33424k.m134761l(), new Timer());
    }

    @Keep
    public static Object instrument(Object obj) throws IOException {
        if (obj instanceof HttpsURLConnection) {
            return new C33392d((HttpsURLConnection) obj, new Timer(), C33381i.m134544c(C33424k.m134761l()));
        }
        if (obj instanceof HttpURLConnection) {
            return new C33391c((HttpURLConnection) obj, new Timer(), C33381i.m134544c(C33424k.m134761l()));
        }
        return obj;
    }

    @Keep
    public static InputStream openStream(URL url) throws IOException {
        return m134617c(new C33442j(url), C33424k.m134761l(), new Timer());
    }

    @Keep
    public static Object getContent(URL url, Class[] clsArr) throws IOException {
        return m134616b(new C33442j(url), clsArr, C33424k.m134761l(), new Timer());
    }
}
