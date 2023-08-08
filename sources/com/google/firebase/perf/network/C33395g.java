package com.google.firebase.perf.network;

import com.google.firebase.perf.metrics.C33381i;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.C12451Response;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;

/* renamed from: com.google.firebase.perf.network.g */
public class C33395g implements Callback {

    /* renamed from: a */
    public final Callback f81162a;

    /* renamed from: b */
    public final C33381i f81163b;

    /* renamed from: c */
    public final Timer f81164c;

    /* renamed from: d */
    public final long f81165d;

    public C33395g(Callback callback, C33424k kVar, Timer timer, long j) {
        this.f81162a = callback;
        this.f81163b = C33381i.m134544c(kVar);
        this.f81165d = j;
        this.f81164c = timer;
    }

    public void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        if (request != null) {
            HttpUrl url = request.url();
            if (url != null) {
                this.f81163b.mo96556z(url.url().toString());
            }
            if (request.method() != null) {
                this.f81163b.mo96544n(request.method());
            }
        }
        this.f81163b.mo96550t(this.f81165d);
        this.f81163b.mo96554x(this.f81164c.mo96891c());
        C33396h.m134675d(this.f81163b);
        this.f81162a.onFailure(call, iOException);
    }

    public void onResponse(Call call, C12451Response response) throws IOException {
        C12451Response response2 = response;
        FirebasePerfOkHttpClient.m134614a(response2, this.f81163b, this.f81165d, this.f81164c.mo96891c());
        this.f81162a.onResponse(call, response);
    }
}
