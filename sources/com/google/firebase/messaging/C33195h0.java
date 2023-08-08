package com.google.firebase.messaging;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: com.google.firebase.messaging.h0 */
public class C33195h0 implements Closeable {

    /* renamed from: d */
    public static final int f80705d = 1048576;

    /* renamed from: a */
    public final URL f80706a;
    @C0363p0

    /* renamed from: b */
    public volatile Future<?> f80707b;
    @C0363p0

    /* renamed from: c */
    public C31047k<Bitmap> f80708c;

    public C33195h0(URL url) {
        this.f80706a = url;
    }

    @C0363p0
    /* renamed from: d */
    public static C33195h0 m133888d(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C33195h0(new URL(str));
        } catch (MalformedURLException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("Not downloading image, bad URL: ");
            sb.append(str);
            return null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public /* synthetic */ void m133889g(C31049l lVar) {
        try {
            lVar.mo87743c(mo96089b());
        } catch (Exception e) {
            lVar.mo87742b(e);
        }
    }

    /* renamed from: b */
    public Bitmap mo96089b() throws IOException {
        if (Log.isLoggable("FirebaseMessaging", 4)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Starting download of: ");
            sb.append(this.f80706a);
        }
        byte[] c = mo96090c();
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(c, 0, c.length);
        if (decodeByteArray != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Successfully downloaded image: ");
                sb2.append(this.f80706a);
            }
            return decodeByteArray;
        }
        throw new IOException("Failed to decode image: " + this.f80706a);
    }

    /* renamed from: c */
    public final byte[] mo96090c() throws IOException {
        URLConnection openConnection = this.f80706a.openConnection();
        if (openConnection.getContentLength() <= 1048576) {
            InputStream inputStream = openConnection.getInputStream();
            try {
                byte[] e = C33169c.m133803e(C33169c.m133801c(inputStream, 1048577));
                if (inputStream != null) {
                    inputStream.close();
                }
                if (Log.isLoggable("FirebaseMessaging", 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Downloaded ");
                    sb.append(e.length);
                    sb.append(" bytes from ");
                    sb.append(this.f80706a);
                }
                if (e.length <= 1048576) {
                    return e;
                }
                throw new IOException("Image exceeds max size of 1048576");
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw new IOException("Content-Length exceeds max size of 1048576");
        }
        throw th;
    }

    public void close() {
        this.f80707b.cancel(true);
    }

    /* renamed from: f */
    public C31047k<Bitmap> mo96092f() {
        return (C31047k) C40843u.m166202l(this.f80708c);
    }

    /* renamed from: i */
    public void mo96093i(ExecutorService executorService) {
        C31049l lVar = new C31049l();
        this.f80707b = executorService.submit(new C33192g0(this, lVar));
        this.f80708c = lVar.mo87741a();
    }
}
