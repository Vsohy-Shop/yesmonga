package com.urbanairship.automation.auth;

import android.net.Uri;
import android.util.Base64;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.google.firebase.installations.C33124s;
import com.urbanairship.config.C9061a;
import com.urbanairship.http.C9113a;
import com.urbanairship.http.C9115b;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.C9119d;
import com.urbanairship.http.RequestException;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.messagecenter.C9366d;
import com.urbanairship.util.C9656j;
import com.urbanairship.util.C9664m0;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.urbanairship.automation.auth.a */
public class C8810a {

    /* renamed from: d */
    public static final String f23577d = "api/auth/device";

    /* renamed from: e */
    public static final String f23578e = "token";

    /* renamed from: f */
    public static final String f23579f = "expires_in";

    /* renamed from: a */
    public final C9061a f23580a;

    /* renamed from: b */
    public final C9115b f23581b;

    /* renamed from: c */
    public final C9656j f23582c;

    /* renamed from: com.urbanairship.automation.auth.a$a */
    public class C8811a implements C9119d<C8813c> {

        /* renamed from: a */
        public final /* synthetic */ String f23583a;

        /* renamed from: b */
        public final /* synthetic */ long f23584b;

        public C8811a(String str, long j) {
            this.f23583a = str;
            this.f23584b = j;
        }

        /* renamed from: b */
        public C8813c mo17322a(int i, @C0363p0 Map<String, List<String>> map, @C0363p0 String str) throws Exception {
            if (C9664m0.m36197d(i)) {
                return C8810a.m32721d(str, this.f23583a, this.f23584b);
            }
            return null;
        }
    }

    public C8810a(C9061a aVar) {
        this(aVar, C9656j.f26468a, C9115b.f24644a);
    }

    /* renamed from: d */
    public static C8813c m32721d(@C0363p0 String str, @C0359n0 String str2, long j) throws JsonException {
        C9323b A = JsonValue.m34960C(str).mo18749A();
        String l = A.mo18801A("token").mo18769l();
        long i = A.mo18801A(f23579f).mo18766i(0);
        if (l != null && i > 0) {
            return new C8813c(str2, l, j + i);
        }
        throw new JsonException("Invalid response: " + str);
    }

    @C0363p0
    /* renamed from: b */
    public final String mo17320b(@C0359n0 String str) throws NoSuchAlgorithmException, InvalidKeyException, UnsupportedEncodingException {
        Mac instance = Mac.getInstance("HmacSHA256");
        instance.init(new SecretKeySpec(this.f23580a.mo17958a().f87129b.getBytes("UTF-8"), "HmacSHA256"));
        return Base64.encodeToString(instance.doFinal((this.f23580a.mo17958a().f87128a + C33124s.f80355c + str).getBytes("UTF-8")), 0);
    }

    @C0359n0
    /* renamed from: c */
    public C9116c<C8813c> mo17321c(@C0359n0 String str) throws RequestException {
        Uri d = this.f23580a.mo17960c().mo17964d().mo17988a(f23577d).mo17991d();
        try {
            String b = mo17320b(str);
            long a = this.f23582c.mo19623a();
            C9113a i = this.f23581b.mo18138a().mo18134l("GET", d).mo18127e().mo18128f(this.f23580a).mo18131i(C9366d.f25595h, str);
            return i.mo18131i(C28534f.f69113B, "Bearer " + b).mo18125c(new C8811a(str, a));
        } catch (UnsupportedEncodingException | InvalidKeyException | NoSuchAlgorithmException e) {
            throw new RequestException("Unable to create bearer token.", e);
        }
    }

    @C0344h1
    public C8810a(C9061a aVar, C9656j jVar, C9115b bVar) {
        this.f23580a = aVar;
        this.f23582c = jVar;
        this.f23581b = bVar;
    }
}
