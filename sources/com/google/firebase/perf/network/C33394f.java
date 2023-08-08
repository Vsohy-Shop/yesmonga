package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C33381i;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* renamed from: com.google.firebase.perf.network.f */
public class C33394f<T> implements ResponseHandler<T> {

    /* renamed from: a */
    public final ResponseHandler<? extends T> f81159a;

    /* renamed from: b */
    public final Timer f81160b;

    /* renamed from: c */
    public final C33381i f81161c;

    public C33394f(ResponseHandler<? extends T> responseHandler, Timer timer, C33381i iVar) {
        this.f81159a = responseHandler;
        this.f81160b = timer;
        this.f81161c = iVar;
    }

    public T handleResponse(HttpResponse httpResponse) throws IOException {
        this.f81161c.mo96554x(this.f81160b.mo96891c());
        this.f81161c.mo96545o(httpResponse.getStatusLine().getStatusCode());
        Long a = C33396h.m134672a(httpResponse);
        if (a != null) {
            this.f81161c.mo96552v(a.longValue());
        }
        String b = C33396h.m134673b(httpResponse);
        if (b != null) {
            this.f81161c.mo96551u(b);
        }
        this.f81161c.mo96534b();
        return this.f81159a.handleResponse(httpResponse);
    }
}
