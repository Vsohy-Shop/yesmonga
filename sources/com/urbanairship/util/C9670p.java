package com.urbanairship.util;

import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.urbanairship.util.p */
public abstract class C9670p {

    /* renamed from: a */
    public static final int f26488a = 2000;

    /* renamed from: b */
    public static final int f26489b = 1024;

    /* renamed from: com.urbanairship.util.p$a */
    public static class C9671a {

        /* renamed from: a */
        public final int f26490a;

        /* renamed from: b */
        public final boolean f26491b;

        public C9671a(boolean z, int i) {
            this.f26491b = z;
            this.f26490a = i;
        }
    }

    /* renamed from: a */
    public static boolean m36231a(@C0359n0 File file) {
        if (!file.exists()) {
            return false;
        }
        if (!file.isDirectory()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File a : listFiles) {
                if (!m36231a(a)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    @C0348i1
    @C0359n0
    /* renamed from: b */
    public static C9671a m36232b(@C0359n0 URL url, @C0359n0 File file) throws IOException {
        FileOutputStream fileOutputStream;
        InputStream inputStream;
        int i;
        C36059m.m148419o("Downloading file from: %s to: %s", url, file.getAbsolutePath());
        URLConnection uRLConnection = null;
        try {
            URLConnection b = C9663m.m36193b(UAirship.m146200l(), url);
            try {
                b.setConnectTimeout(2000);
                b.setUseCaches(true);
                if (b instanceof HttpURLConnection) {
                    i = ((HttpURLConnection) b).getResponseCode();
                    if (!C9664m0.m36197d(i)) {
                        C9671a aVar = new C9671a(false, i);
                        m36233c(b, null, null);
                        return aVar;
                    }
                } else {
                    i = 0;
                }
                inputStream = b.getInputStream();
                if (inputStream != null) {
                    try {
                        fileOutputStream = new FileOutputStream(file);
                    } catch (IOException | IllegalStateException e) {
                        e = e;
                        fileOutputStream = null;
                        uRLConnection = b;
                        try {
                            file.delete();
                            C36059m.m148411g(e, "Failed to download file from: %s", url);
                            C9671a aVar2 = new C9671a(false, -1);
                            m36233c(uRLConnection, inputStream, fileOutputStream);
                            return aVar2;
                        } catch (Throwable th) {
                            th = th;
                            m36233c(uRLConnection, inputStream, fileOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                        uRLConnection = b;
                        m36233c(uRLConnection, inputStream, fileOutputStream);
                        throw th;
                    }
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read != -1) {
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                fileOutputStream.close();
                                inputStream.close();
                                C9671a aVar3 = new C9671a(true, i);
                                m36233c(b, inputStream, fileOutputStream);
                                return aVar3;
                            }
                        }
                    } catch (IOException | IllegalStateException e2) {
                        e = e2;
                        uRLConnection = b;
                        file.delete();
                        C36059m.m148411g(e, "Failed to download file from: %s", url);
                        C9671a aVar22 = new C9671a(false, -1);
                        m36233c(uRLConnection, inputStream, fileOutputStream);
                        return aVar22;
                    } catch (Throwable th3) {
                        th = th3;
                        uRLConnection = b;
                        m36233c(uRLConnection, inputStream, fileOutputStream);
                        throw th;
                    }
                } else {
                    C9671a aVar4 = new C9671a(false, i);
                    m36233c(b, inputStream, null);
                    return aVar4;
                }
            } catch (IOException | IllegalStateException e3) {
                e = e3;
                inputStream = null;
                fileOutputStream = null;
                uRLConnection = b;
                file.delete();
                C36059m.m148411g(e, "Failed to download file from: %s", url);
                C9671a aVar222 = new C9671a(false, -1);
                m36233c(uRLConnection, inputStream, fileOutputStream);
                return aVar222;
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
                fileOutputStream = null;
                uRLConnection = b;
                m36233c(uRLConnection, inputStream, fileOutputStream);
                throw th;
            }
        } catch (IOException | IllegalStateException e4) {
            e = e4;
            inputStream = null;
            fileOutputStream = null;
            file.delete();
            C36059m.m148411g(e, "Failed to download file from: %s", url);
            C9671a aVar2222 = new C9671a(false, -1);
            m36233c(uRLConnection, inputStream, fileOutputStream);
            return aVar2222;
        } catch (Throwable th5) {
            th = th5;
            inputStream = null;
            fileOutputStream = null;
            m36233c(uRLConnection, inputStream, fileOutputStream);
            throw th;
        }
    }

    /* renamed from: c */
    public static void m36233c(@C0363p0 URLConnection uRLConnection, @C0359n0 Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e) {
                    C36059m.m148410f(e);
                }
            }
        }
        if (uRLConnection instanceof HttpURLConnection) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            if (httpURLConnection.getErrorStream() != null) {
                try {
                    httpURLConnection.getErrorStream().close();
                } catch (Exception e2) {
                    C36059m.m148410f(e2);
                }
            }
            httpURLConnection.disconnect();
        }
    }
}
