package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.C22114d;
import com.bumptech.glide.load.model.C22309g;
import com.bumptech.glide.util.C22618c;
import com.bumptech.glide.util.C22628i;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

/* renamed from: com.bumptech.glide.load.data.j */
public class C22124j implements C22114d<InputStream> {

    /* renamed from: g */
    public static final String f56812g = "HttpUrlFetcher";

    /* renamed from: v */
    public static final int f56813v = 5;
    @C0344h1

    /* renamed from: w */
    public static final String f56814w = "Location";
    @C0344h1

    /* renamed from: x */
    public static final C22126b f56815x = new C22125a();
    @C0344h1

    /* renamed from: y */
    public static final int f56816y = -1;

    /* renamed from: a */
    public final C22309g f56817a;

    /* renamed from: b */
    public final int f56818b;

    /* renamed from: c */
    public final C22126b f56819c;

    /* renamed from: d */
    public HttpURLConnection f56820d;

    /* renamed from: e */
    public InputStream f56821e;

    /* renamed from: f */
    public volatile boolean f56822f;

    /* renamed from: com.bumptech.glide.load.data.j$a */
    public static class C22125a implements C22126b {
        /* renamed from: a */
        public HttpURLConnection mo65820a(URL url) throws IOException {
            return (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(url.openConnection()));
        }
    }

    /* renamed from: com.bumptech.glide.load.data.j$b */
    public interface C22126b {
        /* renamed from: a */
        HttpURLConnection mo65820a(URL url) throws IOException;
    }

    public C22124j(C22309g gVar, int i) {
        this(gVar, i, f56815x);
    }

    /* renamed from: f */
    public static int m100773f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException unused) {
            return -1;
        }
    }

    /* renamed from: h */
    public static boolean m100774h(int i) {
        return i / 100 == 2;
    }

    /* renamed from: i */
    public static boolean m100775i(int i) {
        return i / 100 == 3;
    }

    @C0359n0
    /* renamed from: a */
    public Class<InputStream> mo65784a() {
        return InputStream.class;
    }

    /* renamed from: b */
    public void mo65789b() {
        InputStream inputStream = this.f56821e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f56820d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f56820d = null;
    }

    /* renamed from: c */
    public final HttpURLConnection mo65817c(URL url, Map<String, String> map) throws HttpException {
        try {
            HttpURLConnection a = this.f56819c.mo65820a(url);
            for (Map.Entry next : map.entrySet()) {
                a.addRequestProperty((String) next.getKey(), (String) next.getValue());
            }
            a.setConnectTimeout(this.f56818b);
            a.setReadTimeout(this.f56818b);
            a.setUseCaches(false);
            a.setDoInput(true);
            a.setInstanceFollowRedirects(false);
            return a;
        } catch (IOException e) {
            throw new HttpException("URL.openConnection threw", 0, e);
        }
    }

    public void cancel() {
        this.f56822f = true;
    }

    @C0359n0
    /* renamed from: d */
    public DataSource mo65792d() {
        return DataSource.REMOTE;
    }

    /* renamed from: e */
    public void mo65793e(@C0359n0 Priority priority, @C0359n0 C22114d.C22115a<? super InputStream> aVar) {
        StringBuilder sb;
        long b = C22628i.m102603b();
        try {
            aVar.mo65804f(mo65819j(this.f56817a.mo66275i(), 0, (URL) null, this.f56817a.mo66271e()));
            if (Log.isLoggable(f56812g, 2)) {
                sb = new StringBuilder();
                sb.append("Finished http url fetcher fetch in ");
                sb.append(C22628i.m102602a(b));
            }
        } catch (IOException e) {
            boolean isLoggable = Log.isLoggable(f56812g, 3);
            aVar.mo65803c(e);
            if (Log.isLoggable(f56812g, 2)) {
                sb = new StringBuilder();
            }
        } catch (Throwable th) {
            if (Log.isLoggable(f56812g, 2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Finished http url fetcher fetch in ");
                sb2.append(C22628i.m102602a(b));
            }
            throw th;
        }
    }

    /* renamed from: g */
    public final InputStream mo65818g(HttpURLConnection httpURLConnection) throws HttpException {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f56821e = C22618c.m102585b(httpURLConnection.getInputStream(), (long) httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable(f56812g, 3)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Got non empty content encoding: ");
                    sb.append(httpURLConnection.getContentEncoding());
                }
                this.f56821e = httpURLConnection.getInputStream();
            }
            return this.f56821e;
        } catch (IOException e) {
            throw new HttpException("Failed to obtain InputStream", m100773f(httpURLConnection), e);
        }
    }

    /* renamed from: j */
    public final InputStream mo65819j(URL url, int i, URL url2, Map<String, String> map) throws HttpException {
        if (i < 5) {
            if (url2 != null) {
                try {
                    if (url.toURI().equals(url2.toURI())) {
                        throw new HttpException("In re-direct loop", -1);
                    }
                } catch (URISyntaxException unused) {
                }
            }
            HttpURLConnection c = mo65817c(url, map);
            this.f56820d = c;
            try {
                c.connect();
                this.f56821e = this.f56820d.getInputStream();
                if (this.f56822f) {
                    return null;
                }
                int f = m100773f(this.f56820d);
                if (m100774h(f)) {
                    return mo65818g(this.f56820d);
                }
                if (m100775i(f)) {
                    String headerField = this.f56820d.getHeaderField("Location");
                    if (!TextUtils.isEmpty(headerField)) {
                        try {
                            URL url3 = new URL(url, headerField);
                            mo65789b();
                            return mo65819j(url3, i + 1, url, map);
                        } catch (MalformedURLException e) {
                            throw new HttpException("Bad redirect url: " + headerField, f, e);
                        }
                    } else {
                        throw new HttpException("Received empty or null redirect url", f);
                    }
                } else if (f == -1) {
                    throw new HttpException(f);
                } else {
                    try {
                        throw new HttpException(this.f56820d.getResponseMessage(), f);
                    } catch (IOException e2) {
                        throw new HttpException("Failed to get a response message", f, e2);
                    }
                }
            } catch (IOException e3) {
                throw new HttpException("Failed to connect or obtain data", m100773f(this.f56820d), e3);
            }
        } else {
            throw new HttpException("Too many (> 5) redirects!", -1);
        }
    }

    @C0344h1
    public C22124j(C22309g gVar, int i, C22126b bVar) {
        this.f56817a = gVar;
        this.f56818b = i;
        this.f56819c = bVar;
    }
}
