package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.metrics.C33381i;
import com.google.firebase.perf.transport.C33424k;
import com.google.firebase.perf.util.Timer;
import java.io.IOException;
import okhttp3.C12451Response;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.ResponseBody;

public class FirebasePerfOkHttpClient {
    /* renamed from: a */
    public static void m134614a(C12451Response response, C33381i iVar, long j, long j2) throws IOException {
        Request request = response.request();
        if (request != null) {
            iVar.mo96556z(request.url().url().toString());
            iVar.mo96544n(request.method());
            if (request.body() != null) {
                long contentLength = request.body().contentLength();
                if (contentLength != -1) {
                    iVar.mo96549s(contentLength);
                }
            }
            ResponseBody body = response.body();
            if (body != null) {
                long contentLength2 = body.contentLength();
                if (contentLength2 != -1) {
                    iVar.mo96552v(contentLength2);
                }
                MediaType contentType = body.contentType();
                if (contentType != null) {
                    iVar.mo96551u(contentType.toString());
                }
            }
            iVar.mo96545o(response.code());
            iVar.mo96550t(j);
            iVar.mo96554x(j2);
            iVar.mo96534b();
        }
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        Timer timer = new Timer();
        Callback callback2 = callback;
        call.enqueue(new C33395g(callback2, C33424k.m134761l(), timer, timer.mo96894e()));
    }

    @Keep
    public static C12451Response execute(Call call) throws IOException {
        C33381i c = C33381i.m134544c(C33424k.m134761l());
        Timer timer = new Timer();
        long e = timer.mo96894e();
        try {
            C12451Response execute = call.execute();
            m134614a(execute, c, e, timer.mo96891c());
            return execute;
        } catch (IOException e2) {
            Request request = call.request();
            if (request != null) {
                HttpUrl url = request.url();
                if (url != null) {
                    c.mo96556z(url.url().toString());
                }
                if (request.method() != null) {
                    c.mo96544n(request.method());
                }
            }
            c.mo96550t(e);
            c.mo96554x(timer.mo96891c());
            C33396h.m134675d(c);
            throw e2;
        }
    }
}
