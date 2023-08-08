package com.google.android.play.core.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.AssetManager;
import android.os.Build;
import android.support.annotation.Nullable;
import com.google.android.play.core.splitcompat.C32135c;
import com.google.android.play.core.splitcompat.C32137e;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.google.android.play.core.internal.y */
public final class C32104y {

    /* renamed from: a */
    public final C32137e f78317a;

    /* renamed from: b */
    public final Context f78318b;

    /* renamed from: c */
    public final C32101x f78319c;
    @Nullable

    /* renamed from: d */
    public PackageInfo f78320d;

    /* renamed from: e */
    public final C32028a0 f78321e;

    public C32104y(Context context, C32137e eVar, C32028a0 a0Var, byte[] bArr) {
        C32101x xVar = new C32101x(new C32135c(eVar));
        this.f78317a = eVar;
        this.f78321e = a0Var;
        this.f78318b = context;
        this.f78319c = xVar;
    }

    @Nullable
    /* renamed from: e */
    public static X509Certificate m129992e(Signature signature) {
        try {
            return (X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
        } catch (CertificateException unused) {
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0076, code lost:
        r2 = new java.lang.StringBuilder(java.lang.String.valueOf(r5).length() + 32);
        r2.append("Downloaded split ");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo92843a(java.io.File[] r12) {
        /*
            r11 = this;
            java.lang.String r0 = " is not signed."
            java.lang.String r1 = "Downloaded split "
            android.content.pm.PackageInfo r2 = r11.mo92846d()
            r3 = 0
            r4 = 0
            if (r2 == 0) goto L_0x002a
            android.content.pm.Signature[] r5 = r2.signatures
            if (r5 != 0) goto L_0x0011
            goto L_0x002a
        L_0x0011:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            android.content.pm.Signature[] r2 = r2.signatures
            int r5 = r2.length
            r6 = r4
        L_0x001a:
            if (r6 >= r5) goto L_0x002a
            r7 = r2[r6]
            java.security.cert.X509Certificate r7 = m129992e(r7)
            if (r7 == 0) goto L_0x0027
            r3.add(r7)
        L_0x0027:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x002a:
            if (r3 == 0) goto L_0x00a5
            boolean r2 = r3.isEmpty()
            if (r2 == 0) goto L_0x0034
            goto L_0x00a5
        L_0x0034:
            int r2 = r12.length
        L_0x0035:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x00a3
            r5 = r12[r2]
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x00a2 }
            java.security.cert.X509Certificate[][] r6 = com.google.android.play.core.internal.C32061j1.m129826g(r5)     // Catch:{ Exception -> 0x008f }
            if (r6 == 0) goto L_0x0076
            int r7 = r6.length     // Catch:{ Exception -> 0x00a2 }
            if (r7 == 0) goto L_0x0076
            r7 = r6[r4]     // Catch:{ Exception -> 0x00a2 }
            int r7 = r7.length     // Catch:{ Exception -> 0x00a2 }
            if (r7 != 0) goto L_0x004e
            goto L_0x0076
        L_0x004e:
            boolean r5 = r3.isEmpty()     // Catch:{ Exception -> 0x00a2 }
            if (r5 == 0) goto L_0x0055
            goto L_0x00a2
        L_0x0055:
            java.util.Iterator r5 = r3.iterator()     // Catch:{ Exception -> 0x00a2 }
        L_0x0059:
            boolean r7 = r5.hasNext()     // Catch:{ Exception -> 0x00a2 }
            if (r7 == 0) goto L_0x0035
            java.lang.Object r7 = r5.next()     // Catch:{ Exception -> 0x00a2 }
            java.security.cert.X509Certificate r7 = (java.security.cert.X509Certificate) r7     // Catch:{ Exception -> 0x00a2 }
            int r8 = r6.length     // Catch:{ Exception -> 0x00a2 }
            r9 = r4
        L_0x0067:
            if (r9 >= r8) goto L_0x00a2
            r10 = r6[r9]     // Catch:{ Exception -> 0x00a2 }
            r10 = r10[r4]     // Catch:{ Exception -> 0x00a2 }
            boolean r10 = r10.equals(r7)     // Catch:{ Exception -> 0x00a2 }
            if (r10 != 0) goto L_0x0059
            int r9 = r9 + 1
            goto L_0x0067
        L_0x0076:
            java.lang.String r12 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00a2 }
            int r12 = r12.length()     // Catch:{ Exception -> 0x00a2 }
            int r12 = r12 + 32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a2 }
            r2.<init>(r12)     // Catch:{ Exception -> 0x00a2 }
            r2.append(r1)     // Catch:{ Exception -> 0x00a2 }
        L_0x0088:
            r2.append(r5)     // Catch:{ Exception -> 0x00a2 }
            r2.append(r0)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00a2
        L_0x008f:
            java.lang.String r12 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x00a2 }
            int r12 = r12.length()     // Catch:{ Exception -> 0x00a2 }
            int r12 = r12 + 32
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a2 }
            r2.<init>(r12)     // Catch:{ Exception -> 0x00a2 }
            r2.append(r1)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x0088
        L_0x00a2:
            return r4
        L_0x00a3:
            r12 = 1
            return r12
        L_0x00a5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.internal.C32104y.mo92843a(java.io.File[]):boolean");
    }

    /* renamed from: b */
    public final boolean mo92844b(File[] fileArr) throws IOException, XmlPullParserException {
        PackageInfo d = mo92846d();
        long a = Build.VERSION.SDK_INT >= 28 ? d.getLongVersionCode() : (long) d.versionCode;
        AssetManager assetManager = (AssetManager) C32063k0.m129850c(AssetManager.class);
        int length = fileArr.length;
        do {
            length--;
            if (length < 0) {
                return true;
            }
            this.f78319c.mo92841a(assetManager, fileArr[length]);
        } while (a == this.f78319c.mo92842b());
        return false;
    }

    /* renamed from: c */
    public final boolean mo92845c(List<Intent> list) throws IOException {
        for (Intent stringExtra : list) {
            if (!this.f78317a.mo92888c(stringExtra.getStringExtra("split_id")).exists()) {
                return false;
            }
        }
        return true;
    }

    @Nullable
    /* renamed from: d */
    public final PackageInfo mo92846d() {
        if (this.f78320d == null) {
            try {
                this.f78320d = this.f78318b.getPackageManager().getPackageInfo(this.f78318b.getPackageName(), 64);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }
        return this.f78320d;
    }
}
