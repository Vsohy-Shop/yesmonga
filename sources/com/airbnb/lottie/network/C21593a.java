package com.airbnb.lottie.network;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.airbnb.lottie.utils.C21682f;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

/* renamed from: com.airbnb.lottie.network.a */
public class C21593a implements C21595c {
    @C0359n0

    /* renamed from: a */
    public final HttpURLConnection f55868a;

    public C21593a(@C0359n0 HttpURLConnection httpURLConnection) {
        this.f55868a = httpURLConnection;
    }

    /* renamed from: a */
    public final String mo64519a(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getErrorStream()));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                    sb.append(10);
                } else {
                    try {
                        break;
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                throw e;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Exception unused2) {
                }
                throw th;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    public void close() {
        this.f55868a.disconnect();
    }

    @C0363p0
    /* renamed from: f3 */
    public String mo64521f3() {
        try {
            if (isSuccessful()) {
                return null;
            }
            return "Unable to fetch " + this.f55868a.getURL() + ". Failed with " + this.f55868a.getResponseCode() + "\n" + mo64519a(this.f55868a);
        } catch (IOException e) {
            C21682f.m99761f("get error failed ", e);
            return e.getMessage();
        }
    }

    @C0363p0
    /* renamed from: h */
    public String mo64522h() {
        return this.f55868a.getContentType();
    }

    public boolean isSuccessful() {
        try {
            return this.f55868a.getResponseCode() / 100 == 2;
        } catch (IOException unused) {
            return false;
        }
    }

    @C0359n0
    /* renamed from: u1 */
    public InputStream mo64524u1() throws IOException {
        return this.f55868a.getInputStream();
    }
}
