package com.google.firebase.messaging;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.C0328d;
import androidx.annotation.C0344h1;
import androidx.profileinstaller.C20006f;
import com.google.android.gms.cloudmessaging.C40444d;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31053n;
import com.google.firebase.C33033f;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import com.google.firebase.inject.C33058b;
import com.google.firebase.installations.C33088k;
import com.google.firebase.installations.C33098o;
import com.google.firebase.platforminfo.C33509i;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.firebase.messaging.f0 */
public class C33188f0 {

    /* renamed from: A */
    public static final String f80648A = "gmp_app_id";

    /* renamed from: B */
    public static final String f80649B = "gmsv";

    /* renamed from: C */
    public static final String f80650C = "osv";

    /* renamed from: D */
    public static final String f80651D = "app_ver";

    /* renamed from: E */
    public static final String f80652E = "app_ver_name";

    /* renamed from: F */
    public static final String f80653F = "Goog-Firebase-Installations-Auth";

    /* renamed from: G */
    public static final String f80654G = "firebase-app-name-hash";

    /* renamed from: H */
    public static final String f80655H = "RST_FULL";

    /* renamed from: I */
    public static final String f80656I = "RST";

    /* renamed from: J */
    public static final String f80657J = "SYNC";

    /* renamed from: K */
    public static final String f80658K = "*";

    /* renamed from: g */
    public static final String f80659g = "FirebaseMessaging";

    /* renamed from: h */
    public static final String f80660h = "registration_id";

    /* renamed from: i */
    public static final String f80661i = "unregistered";

    /* renamed from: j */
    public static final String f80662j = "error";

    /* renamed from: k */
    public static final String f80663k = "SERVICE_NOT_AVAILABLE";

    /* renamed from: l */
    public static final String f80664l = "INTERNAL_SERVER_ERROR";

    /* renamed from: m */
    public static final String f80665m = "fire-iid";

    /* renamed from: n */
    public static final String f80666n = "InternalServerError";

    /* renamed from: o */
    public static final String f80667o = "gcm.topic";

    /* renamed from: p */
    public static final String f80668p = "/topics/";

    /* renamed from: q */
    public static final String f80669q = "INSTANCE_ID_RESET";

    /* renamed from: r */
    public static final String f80670r = "subtype";

    /* renamed from: s */
    public static final String f80671s = "sender";

    /* renamed from: t */
    public static final String f80672t = "scope";

    /* renamed from: u */
    public static final String f80673u = "delete";

    /* renamed from: v */
    public static final String f80674v = "iid-operation";

    /* renamed from: w */
    public static final String f80675w = "appid";

    /* renamed from: x */
    public static final String f80676x = "Firebase-Client";

    /* renamed from: y */
    public static final String f80677y = "Firebase-Client-Log-Type";

    /* renamed from: z */
    public static final String f80678z = "cliv";

    /* renamed from: a */
    public final C33033f f80679a;

    /* renamed from: b */
    public final C33206k0 f80680b;

    /* renamed from: c */
    public final C40444d f80681c;

    /* renamed from: d */
    public final C33058b<C33509i> f80682d;

    /* renamed from: e */
    public final C33058b<HeartBeatInfo> f80683e;

    /* renamed from: f */
    public final C33088k f80684f;

    public C33188f0(C33033f fVar, C33206k0 k0Var, C33058b<C33509i> bVar, C33058b<HeartBeatInfo> bVar2, C33088k kVar) {
        this(fVar, k0Var, new C40444d(fVar.mo95721n()), bVar, bVar2, kVar);
    }

    /* renamed from: b */
    public static String m133859b(byte[] bArr) {
        return Base64.encodeToString(bArr, 11);
    }

    /* renamed from: h */
    public static boolean m133860h(String str) {
        if ("SERVICE_NOT_AVAILABLE".equals(str) || "INTERNAL_SERVER_ERROR".equals(str) || f80666n.equals(str)) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public /* synthetic */ String m133861i(C31047k kVar) throws Exception {
        return mo96073g((Bundle) kVar.mo87735s(IOException.class));
    }

    /* renamed from: c */
    public C31047k<?> mo96069c() {
        Bundle bundle = new Bundle();
        bundle.putString(f80673u, "1");
        return mo96070d(mo96075k(C33206k0.m133948c(this.f80679a), "*", bundle));
    }

    /* renamed from: d */
    public final C31047k<String> mo96070d(C31047k<Bundle> kVar) {
        return kVar.mo87730n(new C20006f(), new C33178e0(this));
    }

    /* renamed from: e */
    public final String mo96071e() {
        try {
            return m133859b(MessageDigest.getInstance(CommonUtils.f79238a).digest(this.f80679a.mo95722r().getBytes()));
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    /* renamed from: f */
    public C31047k<String> mo96072f() {
        return mo96070d(mo96075k(C33206k0.m133948c(this.f80679a), "*", new Bundle()));
    }

    @C0328d
    /* renamed from: g */
    public final String mo96073g(Bundle bundle) throws IOException {
        if (bundle != null) {
            String string = bundle.getString(f80660h);
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString(f80661i);
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (f80656I.equals(string3)) {
                throw new IOException(f80669q);
            } else if (string3 != null) {
                throw new IOException(string3);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected response: ");
                sb.append(bundle);
                new Throwable();
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
        } else {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    /* renamed from: j */
    public final void mo96074j(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        HeartBeatInfo.HeartBeat b;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        bundle.putString(f80648A, this.f80679a.mo95723s().mo96248j());
        bundle.putString(f80649B, Integer.toString(this.f80680b.mo96106d()));
        bundle.putString(f80650C, Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString(f80651D, this.f80680b.mo96104a());
        bundle.putString(f80652E, this.f80680b.mo96105b());
        bundle.putString(f80654G, mo96071e());
        try {
            String b2 = ((C33098o) C31053n.m124519a(this.f80684f.mo95804b(false))).mo95775b();
            if (!TextUtils.isEmpty(b2)) {
                bundle.putString(f80653F, b2);
            }
        } catch (InterruptedException | ExecutionException unused) {
        }
        bundle.putString("appid", (String) C31053n.m124519a(this.f80684f.getId()));
        bundle.putString(f80678z, "fcm-" + C33166b.f80506d);
        HeartBeatInfo heartBeatInfo = this.f80683e.get();
        C33509i iVar = this.f80682d.get();
        if (heartBeatInfo != null && iVar != null && (b = heartBeatInfo.mo95733b(f80665m)) != HeartBeatInfo.HeartBeat.NONE) {
            bundle.putString(f80677y, Integer.toString(b.mo95734g()));
            bundle.putString(f80676x, iVar.getUserAgent());
        }
    }

    /* renamed from: k */
    public final C31047k<Bundle> mo96075k(String str, String str2, Bundle bundle) {
        try {
            mo96074j(str, str2, bundle);
            return this.f80681c.mo133546a(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return C31053n.m124524f(e);
        }
    }

    /* renamed from: l */
    public C31047k<?> mo96076l(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(f80667o, "/topics/" + str2);
        return mo96070d(mo96075k(str, "/topics/" + str2, bundle));
    }

    /* renamed from: m */
    public C31047k<?> mo96077m(String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putString(f80667o, "/topics/" + str2);
        bundle.putString(f80673u, "1");
        return mo96070d(mo96075k(str, "/topics/" + str2, bundle));
    }

    @C0344h1
    public C33188f0(C33033f fVar, C33206k0 k0Var, C40444d dVar, C33058b<C33509i> bVar, C33058b<HeartBeatInfo> bVar2, C33088k kVar) {
        this.f80679a = fVar;
        this.f80680b = k0Var;
        this.f80681c = dVar;
        this.f80682d = bVar;
        this.f80683e = bVar2;
        this.f80684f = kVar;
    }
}
