package com.urbanairship.automation.deferred;

import android.net.Uri;
import androidx.annotation.C0344h1;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.urbanairship.automation.C8828d0;
import com.urbanairship.automation.auth.AuthException;
import com.urbanairship.automation.auth.C8812b;
import com.urbanairship.base.C9002b;
import com.urbanairship.channel.C9004a0;
import com.urbanairship.channel.C9025i;
import com.urbanairship.config.C9061a;
import com.urbanairship.http.C9113a;
import com.urbanairship.http.C9115b;
import com.urbanairship.http.C9116c;
import com.urbanairship.http.C9119d;
import com.urbanairship.http.RequestException;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9664m0;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.automation.deferred.b */
public class C8831b {

    /* renamed from: e */
    public static final String f23673e = "platform";

    /* renamed from: f */
    public static final String f23674f = "channel_id";

    /* renamed from: g */
    public static final String f23675g = "android";

    /* renamed from: h */
    public static final String f23676h = "amazon";

    /* renamed from: i */
    public static final String f23677i = "trigger";

    /* renamed from: j */
    public static final String f23678j = "type";

    /* renamed from: k */
    public static final String f23679k = "goal";

    /* renamed from: l */
    public static final String f23680l = "event";

    /* renamed from: m */
    public static final String f23681m = "tag_overrides";

    /* renamed from: n */
    public static final String f23682n = "attribute_overrides";

    /* renamed from: o */
    public static final String f23683o = "state_overrides";

    /* renamed from: p */
    public static final String f23684p = "audience_match";

    /* renamed from: q */
    public static final String f23685q = "type";

    /* renamed from: r */
    public static final String f23686r = "message";

    /* renamed from: s */
    public static final String f23687s = "in_app_message";

    /* renamed from: a */
    public final C9061a f23688a;

    /* renamed from: b */
    public final C8812b f23689b;

    /* renamed from: c */
    public final C9115b f23690c;

    /* renamed from: d */
    public final C9002b<C8835c> f23691d;

    /* renamed from: com.urbanairship.automation.deferred.b$a */
    public class C8832a implements C9002b<C8835c> {
        /* renamed from: a */
        public C8835c get() {
            return C8835c.m32863a();
        }
    }

    /* renamed from: com.urbanairship.automation.deferred.b$b */
    public class C8833b implements C9119d<C8834c> {
        public C8833b() {
        }

        /* renamed from: b */
        public C8834c mo17322a(int i, @C0363p0 Map<String, List<String>> map, @C0363p0 String str) throws Exception {
            if (C9664m0.m36197d(i)) {
                return C8831b.this.mo17398b(str);
            }
            return null;
        }
    }

    /* renamed from: com.urbanairship.automation.deferred.b$c */
    public static class C8834c {

        /* renamed from: a */
        public final boolean f23693a;

        /* renamed from: b */
        public final InAppMessage f23694b;

        @C0344h1
        public C8834c(boolean z, @C0363p0 InAppMessage inAppMessage) {
            this.f23693a = z;
            this.f23694b = inAppMessage;
        }

        @C0363p0
        /* renamed from: a */
        public InAppMessage mo17404a() {
            return this.f23694b;
        }

        /* renamed from: b */
        public boolean mo17405b() {
            return this.f23693a;
        }
    }

    public C8831b(@C0359n0 C9061a aVar, @C0359n0 C8812b bVar) {
        this(aVar, bVar, C9115b.f24644a, new C8832a());
    }

    /* renamed from: b */
    public final C8834c mo17398b(String str) throws JsonException {
        InAppMessage inAppMessage;
        C9323b A = JsonValue.m34960C(str).mo18749A();
        boolean c = A.mo18801A(f23684p).mo18757c(false);
        if (!c || !A.mo18801A("type").mo18750B().equals("in_app_message")) {
            inAppMessage = null;
        } else {
            inAppMessage = InAppMessage.m34088k(A.mo18801A("message"), InAppMessage.f24674L0);
        }
        return new C8834c(c, inAppMessage);
    }

    /* renamed from: c */
    public C9116c<C8834c> mo17399c(@C0359n0 Uri uri, @C0359n0 String str, @C0363p0 C8828d0 d0Var, @C0359n0 List<C9004a0> list, @C0359n0 List<C9025i> list2) throws RequestException, AuthException {
        String str2;
        String c = this.f23689b.mo17326c();
        C9323b.C9325b y = C9323b.m35017y();
        if (this.f23688a.mo17959b() == 1) {
            str2 = "amazon";
        } else {
            str2 = "android";
        }
        C9323b.C9325b g = y.mo18823g("platform", str2).mo18823g("channel_id", str);
        if (d0Var != null) {
            g.mo18822f("trigger", C9323b.m35017y().mo18823g("type", d0Var.mo17388c().mo17283f()).mo18819c("goal", d0Var.mo17388c().mo17279d()).mo18822f("event", d0Var.mo17387b()).mo18817a());
        }
        if (!list.isEmpty()) {
            g.mo18822f(f23681m, JsonValue.m34975U(list));
        }
        if (!list2.isEmpty()) {
            g.mo18822f(f23682n, JsonValue.m34975U(list2));
        }
        g.mo18822f(f23683o, this.f23691d.get());
        C9323b a = g.mo18817a();
        C9116c<C8834c> d = mo17400d(uri, c, a);
        if (d.mo18147i() != 401) {
            return d;
        }
        this.f23689b.mo17327d(c);
        return mo17400d(uri, this.f23689b.mo17326c(), a);
    }

    /* renamed from: d */
    public final C9116c<C8834c> mo17400d(@C0359n0 Uri uri, @C0359n0 String str, @C0359n0 C9323b bVar) throws RequestException {
        C9113a f = this.f23690c.mo18138a().mo18134l("POST", uri).mo18128f(this.f23688a);
        return f.mo18131i(C28534f.f69113B, "Bearer " + str).mo18127e().mo18135m(bVar).mo18125c(new C8833b());
    }

    @C0344h1
    public C8831b(@C0359n0 C9061a aVar, @C0359n0 C8812b bVar, @C0359n0 C9115b bVar2, @C0359n0 C9002b<C8835c> bVar3) {
        this.f23688a = aVar;
        this.f23689b = bVar;
        this.f23690c = bVar2;
        this.f23691d = bVar3;
    }
}
