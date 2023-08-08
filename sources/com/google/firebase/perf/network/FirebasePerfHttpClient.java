package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.C33381i;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.protocol.HttpContext;

public class FirebasePerfHttpClient {
    /* renamed from: a */
    public static <T> T m134606a(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, Timer timer, C33424k kVar) throws IOException {
        C33381i c = C33381i.m134544c(kVar);
        try {
            c.mo96556z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo96544n(httpRequest.getRequestLine().getMethod());
            Long a = C33396h.m134672a(httpRequest);
            if (a != null) {
                c.mo96549s(a.longValue());
            }
            timer.mo96895g();
            c.mo96550t(timer.mo96894e());
            return httpClient.execute(httpHost, httpRequest, new C33394f(responseHandler, timer, c));
        } catch (IOException e) {
            c.mo96554x(timer.mo96891c());
            C33396h.m134675d(c);
            throw e;
        }
    }

    /* renamed from: b */
    public static <T> T m134607b(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext, Timer timer, C33424k kVar) throws IOException {
        C33381i c = C33381i.m134544c(kVar);
        try {
            c.mo96556z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo96544n(httpRequest.getRequestLine().getMethod());
            Long a = C33396h.m134672a(httpRequest);
            if (a != null) {
                c.mo96549s(a.longValue());
            }
            timer.mo96895g();
            c.mo96550t(timer.mo96894e());
            return httpClient.execute(httpHost, httpRequest, new C33394f(responseHandler, timer, c), httpContext);
        } catch (IOException e) {
            c.mo96554x(timer.mo96891c());
            C33396h.m134675d(c);
            throw e;
        }
    }

    /* renamed from: c */
    public static <T> T m134608c(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, Timer timer, C33424k kVar) throws IOException {
        C33381i c = C33381i.m134544c(kVar);
        try {
            c.mo96556z(httpUriRequest.getURI().toString()).mo96544n(httpUriRequest.getMethod());
            Long a = C33396h.m134672a(httpUriRequest);
            if (a != null) {
                c.mo96549s(a.longValue());
            }
            timer.mo96895g();
            c.mo96550t(timer.mo96894e());
            return httpClient.execute(httpUriRequest, new C33394f(responseHandler, timer, c));
        } catch (IOException e) {
            c.mo96554x(timer.mo96891c());
            C33396h.m134675d(c);
            throw e;
        }
    }

    /* renamed from: d */
    public static <T> T m134609d(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext, Timer timer, C33424k kVar) throws IOException {
        C33381i c = C33381i.m134544c(kVar);
        try {
            c.mo96556z(httpUriRequest.getURI().toString()).mo96544n(httpUriRequest.getMethod());
            Long a = C33396h.m134672a(httpUriRequest);
            if (a != null) {
                c.mo96549s(a.longValue());
            }
            timer.mo96895g();
            c.mo96550t(timer.mo96894e());
            return httpClient.execute(httpUriRequest, new C33394f(responseHandler, timer, c), httpContext);
        } catch (IOException e) {
            c.mo96554x(timer.mo96891c());
            C33396h.m134675d(c);
            throw e;
        }
    }

    /* renamed from: e */
    public static HttpResponse m134610e(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, Timer timer, C33424k kVar) throws IOException {
        C33381i c = C33381i.m134544c(kVar);
        try {
            c.mo96556z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo96544n(httpRequest.getRequestLine().getMethod());
            Long a = C33396h.m134672a(httpRequest);
            if (a != null) {
                c.mo96549s(a.longValue());
            }
            timer.mo96895g();
            c.mo96550t(timer.mo96894e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest);
            c.mo96554x(timer.mo96891c());
            c.mo96545o(execute.getStatusLine().getStatusCode());
            Long a2 = C33396h.m134672a(execute);
            if (a2 != null) {
                c.mo96552v(a2.longValue());
            }
            String b = C33396h.m134673b(execute);
            if (b != null) {
                c.mo96551u(b);
            }
            c.mo96534b();
            return execute;
        } catch (IOException e) {
            c.mo96554x(timer.mo96891c());
            C33396h.m134675d(c);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest) throws IOException {
        return m134612g(httpClient, httpUriRequest, new Timer(), C33424k.m134761l());
    }

    /* renamed from: f */
    public static HttpResponse m134611f(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext, Timer timer, C33424k kVar) throws IOException {
        C33381i c = C33381i.m134544c(kVar);
        try {
            c.mo96556z(httpHost.toURI() + httpRequest.getRequestLine().getUri()).mo96544n(httpRequest.getRequestLine().getMethod());
            Long a = C33396h.m134672a(httpRequest);
            if (a != null) {
                c.mo96549s(a.longValue());
            }
            timer.mo96895g();
            c.mo96550t(timer.mo96894e());
            HttpResponse execute = httpClient.execute(httpHost, httpRequest, httpContext);
            c.mo96554x(timer.mo96891c());
            c.mo96545o(execute.getStatusLine().getStatusCode());
            Long a2 = C33396h.m134672a(execute);
            if (a2 != null) {
                c.mo96552v(a2.longValue());
            }
            String b = C33396h.m134673b(execute);
            if (b != null) {
                c.mo96551u(b);
            }
            c.mo96534b();
            return execute;
        } catch (IOException e) {
            c.mo96554x(timer.mo96891c());
            C33396h.m134675d(c);
            throw e;
        }
    }

    /* renamed from: g */
    public static HttpResponse m134612g(HttpClient httpClient, HttpUriRequest httpUriRequest, Timer timer, C33424k kVar) throws IOException {
        C33381i c = C33381i.m134544c(kVar);
        try {
            c.mo96556z(httpUriRequest.getURI().toString()).mo96544n(httpUriRequest.getMethod());
            Long a = C33396h.m134672a(httpUriRequest);
            if (a != null) {
                c.mo96549s(a.longValue());
            }
            timer.mo96895g();
            c.mo96550t(timer.mo96894e());
            HttpResponse execute = httpClient.execute(httpUriRequest);
            c.mo96554x(timer.mo96891c());
            c.mo96545o(execute.getStatusLine().getStatusCode());
            Long a2 = C33396h.m134672a(execute);
            if (a2 != null) {
                c.mo96552v(a2.longValue());
            }
            String b = C33396h.m134673b(execute);
            if (b != null) {
                c.mo96551u(b);
            }
            c.mo96534b();
            return execute;
        } catch (IOException e) {
            c.mo96554x(timer.mo96891c());
            C33396h.m134675d(c);
            throw e;
        }
    }

    /* renamed from: h */
    public static HttpResponse m134613h(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext, Timer timer, C33424k kVar) throws IOException {
        C33381i c = C33381i.m134544c(kVar);
        try {
            c.mo96556z(httpUriRequest.getURI().toString()).mo96544n(httpUriRequest.getMethod());
            Long a = C33396h.m134672a(httpUriRequest);
            if (a != null) {
                c.mo96549s(a.longValue());
            }
            timer.mo96895g();
            c.mo96550t(timer.mo96894e());
            HttpResponse execute = httpClient.execute(httpUriRequest, httpContext);
            c.mo96554x(timer.mo96891c());
            c.mo96545o(execute.getStatusLine().getStatusCode());
            Long a2 = C33396h.m134672a(execute);
            if (a2 != null) {
                c.mo96552v(a2.longValue());
            }
            String b = C33396h.m134673b(execute);
            if (b != null) {
                c.mo96551u(b);
            }
            c.mo96534b();
            return execute;
        } catch (IOException e) {
            c.mo96554x(timer.mo96891c());
            C33396h.m134675d(c);
            throw e;
        }
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return m134613h(httpClient, httpUriRequest, httpContext, new Timer(), C33424k.m134761l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler) throws IOException {
        return m134608c(httpClient, httpUriRequest, responseHandler, new Timer(), C33424k.m134761l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpUriRequest httpUriRequest, ResponseHandler<T> responseHandler, HttpContext httpContext) throws IOException {
        return m134609d(httpClient, httpUriRequest, responseHandler, httpContext, new Timer(), C33424k.m134761l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return m134610e(httpClient, httpHost, httpRequest, new Timer(), C33424k.m134761l());
    }

    @Keep
    public static HttpResponse execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return m134611f(httpClient, httpHost, httpRequest, httpContext, new Timer(), C33424k.m134761l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return m134606a(httpClient, httpHost, httpRequest, responseHandler, new Timer(), C33424k.m134761l());
    }

    @Keep
    public static <T> T execute(HttpClient httpClient, HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return m134607b(httpClient, httpHost, httpRequest, responseHandler, httpContext, new Timer(), C33424k.m134761l());
    }
}
