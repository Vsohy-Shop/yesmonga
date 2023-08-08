package com.google.android.gms.internal.gtm;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* renamed from: com.google.android.gms.internal.gtm.kf */
public final class C41382kf implements C41430mf {

    /* renamed from: a */
    public HttpURLConnection f104764a;

    /* renamed from: b */
    public InputStream f104765b = null;

    /* renamed from: a */
    public final InputStream mo135580a(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        this.f104764a = httpURLConnection;
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 200) {
            InputStream inputStream = httpURLConnection.getInputStream();
            this.f104765b = inputStream;
            return inputStream;
        }
        StringBuilder sb = new StringBuilder(25);
        sb.append("Bad response: ");
        sb.append(responseCode);
        String sb2 = sb.toString();
        if (responseCode == 404) {
            throw new FileNotFoundException(sb2);
        } else if (responseCode == 503) {
            throw new zzqe(sb2);
        } else {
            throw new IOException(sb2);
        }
    }

    public final void zzb() {
        String str;
        HttpURLConnection httpURLConnection = this.f104764a;
        try {
            InputStream inputStream = this.f104765b;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "HttpUrlConnectionNetworkClient: Error when closing http input stream: ".concat(valueOf);
            } else {
                str = new String("HttpUrlConnectionNetworkClient: Error when closing http input stream: ");
            }
            C41493p6.m168150b(str, e);
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }
}
