package com.google.mlkit.common.internal.model;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0363p0;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40777k;
import com.google.android.gms.internal.mlkit_common.C42358f;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

@C0348i1
@C40473a
/* renamed from: com.google.mlkit.common.internal.model.c */
public class C33904c {

    /* renamed from: a */
    public static final C40777k f82288a = new C40777k("ModelUtils", "");

    @C40473a
    /* renamed from: com.google.mlkit.common.internal.model.c$a */
    public static abstract class C33905a {
        @RecentlyNonNull
        @C40473a
        /* renamed from: a */
        public abstract String mo98630a();

        @RecentlyNonNull
        @C40473a
        /* renamed from: b */
        public abstract String mo98631b();

        @RecentlyNonNull
        @C40473a
        /* renamed from: c */
        public abstract String mo98632c();
    }

    @C40473a
    /* renamed from: com.google.mlkit.common.internal.model.c$b */
    public static abstract class C33906b {
        /* renamed from: d */
        public static C33906b m136513d(long j, @C0363p0 String str, boolean z) {
            return new C33903b(j, C42358f.m171477b(str), z);
        }

        @RecentlyNonNull
        @C40473a
        /* renamed from: a */
        public abstract String mo98636a();

        @C40473a
        /* renamed from: b */
        public abstract long mo98637b();

        @C40473a
        /* renamed from: c */
        public abstract boolean mo98638c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f3 A[SYNTHETIC, Splitter:B:80:0x00f3] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0102 A[SYNTHETIC, Splitter:B:88:0x0102] */
    @com.google.android.gms.common.annotation.C40473a
    @androidx.annotation.RecentlyNullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.mlkit.common.internal.model.C33904c.C33906b m136504a(@androidx.annotation.RecentlyNonNull android.content.Context r11, @androidx.annotation.RecentlyNonNull com.google.mlkit.common.model.C33918c r12) {
        /*
            java.lang.String r0 = r12.mo98665b()
            java.lang.String r1 = r12.mo98664a()
            android.net.Uri r2 = r12.mo98666c()
            java.lang.String r3 = "Failed to open model file"
            java.lang.String r4 = "ModelUtils"
            r5 = 0
            if (r0 == 0) goto L_0x0045
            boolean r6 = r12.mo98667d()
            if (r6 == 0) goto L_0x0022
            r6 = 1
            java.lang.String r0 = m136508e(r11, r0, r6)
            if (r0 == 0) goto L_0x0021
            goto L_0x0022
        L_0x0021:
            return r5
        L_0x0022:
            android.content.res.AssetManager r6 = r11.getAssets()     // Catch:{ IOException -> 0x003e }
            android.content.res.AssetFileDescriptor r6 = r6.openFd(r0)     // Catch:{ IOException -> 0x003e }
            long r7 = r6.getLength()     // Catch:{ all -> 0x0032 }
            r6.close()     // Catch:{ IOException -> 0x003e }
            goto L_0x006f
        L_0x0032:
            r11 = move-exception
            if (r6 == 0) goto L_0x003d
            r6.close()     // Catch:{ all -> 0x0039 }
            goto L_0x003d
        L_0x0039:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch:{ IOException -> 0x003e }
        L_0x003d:
            throw r11     // Catch:{ IOException -> 0x003e }
        L_0x003e:
            r11 = move-exception
            com.google.android.gms.common.internal.k r12 = f82288a
            r12.mo134433f(r4, r3, r11)
            return r5
        L_0x0045:
            if (r1 == 0) goto L_0x0060
            boolean r6 = r12.mo98667d()
            if (r6 == 0) goto L_0x0056
            r6 = 0
            java.lang.String r1 = m136508e(r11, r1, r6)
            if (r1 == 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            return r5
        L_0x0056:
            java.io.File r6 = new java.io.File
            r6.<init>(r1)
            long r7 = r6.length()
            goto L_0x006f
        L_0x0060:
            if (r2 == 0) goto L_0x0120
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r6 = com.google.android.gms.internal.mlkit_common.C42570y5.m171729a(r11, r2, r6)     // Catch:{ IOException -> 0x0119 }
            long r7 = r6.getLength()     // Catch:{ all -> 0x010d }
            r6.close()     // Catch:{ IOException -> 0x0119 }
        L_0x006f:
            com.google.mlkit.common.sdkinternal.j r6 = com.google.mlkit.common.sdkinternal.C33947j.m136584c()
            java.lang.Class<com.google.mlkit.common.sdkinternal.o> r9 = com.google.mlkit.common.sdkinternal.C33970o.class
            java.lang.Object r6 = r6.mo98717a(r9)
            com.google.mlkit.common.sdkinternal.o r6 = (com.google.mlkit.common.sdkinternal.C33970o) r6
            if (r0 == 0) goto L_0x007f
            r9 = r0
            goto L_0x008d
        L_0x007f:
            if (r1 == 0) goto L_0x0083
            r9 = r1
            goto L_0x008d
        L_0x0083:
            java.lang.Object r9 = com.google.android.gms.common.internal.C40843u.m166202l(r2)
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r9 = r9.toString()
        L_0x008d:
            java.lang.String r10 = r6.mo98823q(r9, r7)
            if (r10 == 0) goto L_0x009c
            boolean r11 = r12.mo98667d()
            com.google.mlkit.common.internal.model.c$b r11 = com.google.mlkit.common.internal.model.C33904c.C33906b.m136513d(r7, r10, r11)
            return r11
        L_0x009c:
            java.lang.String r10 = "Failed to close model file"
            if (r0 == 0) goto L_0x00ad
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            java.io.InputStream r11 = r11.open(r0)     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            goto L_0x00c4
        L_0x00a9:
            r11 = move-exception
            goto L_0x00e8
        L_0x00ab:
            r11 = move-exception
            goto L_0x00ea
        L_0x00ad:
            if (r1 == 0) goto L_0x00ba
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            java.io.File r0 = new java.io.File     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            r11.<init>(r0)     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            goto L_0x00c4
        L_0x00ba:
            java.lang.Object r0 = com.google.android.gms.common.internal.C40843u.m166202l(r2)     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            android.net.Uri r0 = (android.net.Uri) r0     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
            java.io.InputStream r11 = com.google.android.gms.internal.mlkit_common.C42570y5.m171730b(r11, r0)     // Catch:{ IOException -> 0x00ab, all -> 0x00a9 }
        L_0x00c4:
            if (r11 == 0) goto L_0x00cd
            java.lang.String r0 = m136509f(r11)     // Catch:{ IOException -> 0x00cb }
            goto L_0x00ce
        L_0x00cb:
            r12 = move-exception
            goto L_0x00ec
        L_0x00cd:
            r0 = r5
        L_0x00ce:
            if (r0 == 0) goto L_0x00d3
            r6.mo98824r(r9, r7, r0)     // Catch:{ IOException -> 0x00cb }
        L_0x00d3:
            boolean r12 = r12.mo98667d()     // Catch:{ IOException -> 0x00cb }
            com.google.mlkit.common.internal.model.c$b r12 = com.google.mlkit.common.internal.model.C33904c.C33906b.m136513d(r7, r0, r12)     // Catch:{ IOException -> 0x00cb }
            if (r11 == 0) goto L_0x00e7
            r11.close()     // Catch:{ IOException -> 0x00e1 }
            goto L_0x00e7
        L_0x00e1:
            r11 = move-exception
            com.google.android.gms.common.internal.k r0 = f82288a
            r0.mo134433f(r4, r10, r11)
        L_0x00e7:
            return r12
        L_0x00e8:
            r12 = r11
            goto L_0x0100
        L_0x00ea:
            r12 = r11
            r11 = r5
        L_0x00ec:
            com.google.android.gms.common.internal.k r0 = f82288a     // Catch:{ all -> 0x00fe }
            r0.mo134433f(r4, r3, r12)     // Catch:{ all -> 0x00fe }
            if (r11 == 0) goto L_0x00fd
            r11.close()     // Catch:{ IOException -> 0x00f7 }
            goto L_0x00fd
        L_0x00f7:
            r11 = move-exception
            com.google.android.gms.common.internal.k r12 = f82288a
            r12.mo134433f(r4, r10, r11)
        L_0x00fd:
            return r5
        L_0x00fe:
            r12 = move-exception
            r5 = r11
        L_0x0100:
            if (r5 == 0) goto L_0x010c
            r5.close()     // Catch:{ IOException -> 0x0106 }
            goto L_0x010c
        L_0x0106:
            r11 = move-exception
            com.google.android.gms.common.internal.k r0 = f82288a
            r0.mo134433f(r4, r10, r11)
        L_0x010c:
            throw r12
        L_0x010d:
            r11 = move-exception
            if (r6 == 0) goto L_0x0118
            r6.close()     // Catch:{ all -> 0x0114 }
            goto L_0x0118
        L_0x0114:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch:{ IOException -> 0x0119 }
        L_0x0118:
            throw r11     // Catch:{ IOException -> 0x0119 }
        L_0x0119:
            r11 = move-exception
            com.google.android.gms.common.internal.k r12 = f82288a
            r12.mo134433f(r4, r3, r11)
            return r5
        L_0x0120:
            com.google.android.gms.common.internal.k r11 = f82288a
            java.lang.String r12 = "Local model doesn't have any valid path."
            r11.mo134432e(r4, r12)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.model.C33904c.m136504a(android.content.Context, com.google.mlkit.common.model.c):com.google.mlkit.common.internal.model.c$b");
    }

    @C40473a
    @RecentlyNullable
    /* renamed from: b */
    public static String m136505b(@RecentlyNonNull File file) {
        FileInputStream fileInputStream;
        try {
            fileInputStream = new FileInputStream(file);
            String f = m136509f(fileInputStream);
            fileInputStream.close();
            return f;
        } catch (IOException e) {
            C40777k kVar = f82288a;
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 44);
            sb.append("Failed to create FileInputStream for model: ");
            sb.append(valueOf);
            kVar.mo134432e("ModelUtils", sb.toString());
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (new java.io.File(r5).exists() == false) goto L_0x0039;
     */
    @com.google.android.gms.common.annotation.C40473a
    @androidx.annotation.RecentlyNullable
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.mlkit.common.internal.model.C33904c.C33905a m136506c(@androidx.annotation.RecentlyNonNull java.lang.String r5, boolean r6, @androidx.annotation.RecentlyNonNull android.content.Context r7) {
        /*
            com.google.android.gms.common.internal.k r0 = f82288a
            java.lang.String r1 = java.lang.String.valueOf(r5)
            int r2 = r1.length()
            java.lang.String r3 = "Manifest file path: "
            if (r2 == 0) goto L_0x0013
            java.lang.String r1 = r3.concat(r1)
            goto L_0x0018
        L_0x0013:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r3)
        L_0x0018:
            java.lang.String r2 = "ModelUtils"
            r0.mo134430c(r2, r1)
            r1 = 0
            if (r6 == 0) goto L_0x002e
            android.content.res.AssetManager r3 = r7.getAssets()     // Catch:{ IOException -> 0x0039 }
            java.io.InputStream r3 = r3.open(r5)     // Catch:{ IOException -> 0x0039 }
            if (r3 == 0) goto L_0x0041
            r3.close()     // Catch:{ IOException -> 0x0039 }
            goto L_0x0041
        L_0x002e:
            java.io.File r3 = new java.io.File
            r3.<init>(r5)
            boolean r3 = r3.exists()
            if (r3 != 0) goto L_0x0041
        L_0x0039:
            com.google.android.gms.common.internal.k r5 = f82288a
            java.lang.String r6 = "Manifest file does not exist."
            r5.mo134432e(r2, r6)
            return r1
        L_0x0041:
            boolean r3 = r5.isEmpty()     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            r4 = 0
            if (r3 == 0) goto L_0x004b
            byte[] r5 = new byte[r4]     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            goto L_0x006e
        L_0x004b:
            if (r6 == 0) goto L_0x0056
            android.content.res.AssetManager r6 = r7.getAssets()     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            java.io.InputStream r5 = r6.open(r5)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            goto L_0x0061
        L_0x0056:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            java.io.File r7 = new java.io.File     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            r7.<init>(r5)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            r6.<init>(r7)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            r5 = r6
        L_0x0061:
            int r6 = r5.available()     // Catch:{ all -> 0x00a8 }
            byte[] r7 = new byte[r6]     // Catch:{ all -> 0x00a8 }
            r5.read(r7, r4, r6)     // Catch:{ all -> 0x00a8 }
            r5.close()     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            r5 = r7
        L_0x006e:
            java.lang.String r6 = new java.lang.String     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            java.lang.String r7 = "UTF-8"
            r6.<init>(r5, r7)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            java.lang.String r5 = "Json string from the manifest file: "
            int r7 = r6.length()     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            if (r7 == 0) goto L_0x0082
            java.lang.String r5 = r5.concat(r6)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            goto L_0x0088
        L_0x0082:
            java.lang.String r7 = new java.lang.String     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            r7.<init>(r5)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            r5 = r7
        L_0x0088:
            r0.mo134430c(r2, r5)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            r5.<init>(r6)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            java.lang.String r6 = "modelType"
            java.lang.String r6 = r5.getString(r6)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            java.lang.String r7 = "modelFile"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            java.lang.String r0 = "labelsFile"
            java.lang.String r5 = r5.getString(r0)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            com.google.mlkit.common.internal.model.a r0 = new com.google.mlkit.common.internal.model.a     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            r0.<init>(r6, r7, r5)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
            return r0
        L_0x00a8:
            r6 = move-exception
            if (r5 == 0) goto L_0x00b3
            r5.close()     // Catch:{ all -> 0x00af }
            goto L_0x00b3
        L_0x00af:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
        L_0x00b3:
            throw r6     // Catch:{ JSONException -> 0x00b6, IOException -> 0x00b4 }
        L_0x00b4:
            r5 = move-exception
            goto L_0x00b7
        L_0x00b6:
            r5 = move-exception
        L_0x00b7:
            com.google.android.gms.common.internal.k r6 = f82288a
            java.lang.String r7 = "Error parsing the manifest file."
            r6.mo134433f(r2, r7, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.model.C33904c.m136506c(java.lang.String, boolean, android.content.Context):com.google.mlkit.common.internal.model.c$a");
    }

    /* renamed from: d */
    public static boolean m136507d(@RecentlyNonNull File file, @RecentlyNonNull String str) {
        String str2;
        String b = m136505b(file);
        C40777k kVar = f82288a;
        String valueOf = String.valueOf(b);
        if (valueOf.length() != 0) {
            str2 = "Calculated hash value is: ".concat(valueOf);
        } else {
            str2 = new String("Calculated hash value is: ");
        }
        kVar.mo134430c("ModelUtils", str2);
        return str.equals(b);
    }

    @C0363p0
    /* renamed from: e */
    public static String m136508e(Context context, String str, boolean z) {
        C33905a c = m136506c(str, z, context);
        if (c != null) {
            return new File(new File(str).getParent(), c.mo98631b()).toString();
        }
        f82288a.mo134432e("ModelUtils", "Failed to parse manifest file.");
        return null;
    }

    @C0363p0
    /* renamed from: f */
    public static String m136509f(InputStream inputStream) {
        int i;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                instance.update(bArr, 0, read);
            }
            byte[] digest = instance.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            f82288a.mo134432e("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        } catch (IOException unused2) {
            f82288a.mo134432e("ModelUtils", "Failed to read model file");
            return null;
        }
    }
}
