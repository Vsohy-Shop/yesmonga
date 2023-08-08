package com.airbnb.lottie.network;

import androidx.annotation.C0359n0;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.airbnb.lottie.network.b */
public class C21594b implements C21597e {
    @C0359n0
    /* renamed from: a */
    public C21595c mo64525a(@C0359n0 String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new C21593a(httpURLConnection);
    }
}
