package com.google.firebase.installations.local;

import android.content.SharedPreferences;
import android.util.Base64;
import androidx.annotation.C0323b0;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.shared.util.keystore.C28939a;
import com.google.android.gms.stats.C30990a;
import com.google.firebase.C33033f;
import com.google.firebase.installations.C33124s;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.joda.time.DateTimeFieldType;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.installations.local.b */
public class C33093b {

    /* renamed from: c */
    public static final String f80275c = "com.google.android.gms.appid";

    /* renamed from: d */
    public static final String f80276d = "|S||P|";

    /* renamed from: e */
    public static final String f80277e = "|S|id";

    /* renamed from: f */
    public static final String f80278f = "|T|";

    /* renamed from: g */
    public static final String f80279g = "|";

    /* renamed from: h */
    public static final String f80280h = "token";

    /* renamed from: i */
    public static final String f80281i = "{";

    /* renamed from: j */
    public static final String[] f80282j = {"*", "FCM", C30990a.f74243b1, ""};
    @C0323b0("iidPrefs")

    /* renamed from: a */
    public final SharedPreferences f80283a;

    /* renamed from: b */
    public final String f80284b;

    public C33093b(@C0359n0 C33033f fVar) {
        this.f80283a = fVar.mo95721n().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f80284b = m133494b(fVar);
    }

    /* renamed from: b */
    public static String m133494b(C33033f fVar) {
        String m = fVar.mo95723s().mo96251m();
        if (m != null) {
            return m;
        }
        String j = fVar.mo95723s().mo96248j();
        if (!j.startsWith("1:") && !j.startsWith("2:")) {
            return j;
        }
        String[] split = j.split(C33124s.f80355c);
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    @C0363p0
    /* renamed from: c */
    public static String m133495c(@C0359n0 PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & DateTimeFieldType.f30626Z) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final String mo95847a(@C0359n0 String str, @C0359n0 String str2) {
        return "|T|" + str + f80279g + str2;
    }

    /* renamed from: d */
    public final String mo95848d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    @C0363p0
    /* renamed from: e */
    public final PublicKey mo95849e(String str) {
        try {
            return KeyFactory.getInstance(C28939a.f70953f).generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid key stored ");
            sb.append(e);
            return null;
        }
    }

    @C0363p0
    /* renamed from: f */
    public String mo95850f() {
        synchronized (this.f80283a) {
            String g = mo95851g();
            if (g != null) {
                return g;
            }
            String h = mo95852h();
            return h;
        }
    }

    @C0363p0
    /* renamed from: g */
    public final String mo95851g() {
        String string;
        synchronized (this.f80283a) {
            string = this.f80283a.getString(f80277e, (String) null);
        }
        return string;
    }

    @C0363p0
    /* renamed from: h */
    public final String mo95852h() {
        synchronized (this.f80283a) {
            String string = this.f80283a.getString(f80276d, (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = mo95849e(string);
            if (e == null) {
                return null;
            }
            String c = m133495c(e);
            return c;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    @androidx.annotation.C0363p0
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo95853i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f80283a
            monitor-enter(r0)
            java.lang.String[] r1 = f80282j     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f80284b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.mo95847a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f80283a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.mo95848d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.local.C33093b.mo95853i():java.lang.String");
    }

    @C0344h1
    public C33093b(@C0359n0 SharedPreferences sharedPreferences, @C0363p0 String str) {
        this.f80283a = sharedPreferences;
        this.f80284b = str;
    }
}
