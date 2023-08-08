package com.urbanairship.iam;

import android.content.Context;
import androidx.annotation.C0348i1;
import androidx.annotation.C0353k0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import com.urbanairship.C36040b;
import com.urbanairship.C36059m;
import com.urbanairship.C36071u;
import com.urbanairship.C36098y;
import com.urbanairship.UAirship;
import com.urbanairship.analytics.C35518b;
import com.urbanairship.automation.C8893h0;
import com.urbanairship.automation.C8928r;
import com.urbanairship.automation.C8996y;
import com.urbanairship.automation.Trigger;
import com.urbanairship.iam.InAppMessage;
import com.urbanairship.iam.banner.C9156c;
import com.urbanairship.iam.events.C9175a;
import com.urbanairship.json.JsonException;
import com.urbanairship.push.C9459c;
import com.urbanairship.push.C9460d;
import com.urbanairship.push.C9461e;
import com.urbanairship.push.C9493j;
import com.urbanairship.push.C9537t;
import com.urbanairship.push.PushMessage;
import com.urbanairship.push.notifications.C9504e;
import com.urbanairship.push.notifications.C9507f;
import java.util.concurrent.TimeUnit;

/* renamed from: com.urbanairship.iam.y */
public class C9262y extends C36040b {

    /* renamed from: m */
    public static final String f25266m = "com.urbanairship.push.iam.PENDING_MESSAGE_ID";

    /* renamed from: n */
    public static final int f25267n = -1;

    /* renamed from: o */
    public static final int f25268o = -16777216;

    /* renamed from: p */
    public static final float f25269p = 2.0f;

    /* renamed from: f */
    public final C8928r f25270f;

    /* renamed from: g */
    public final C36071u f25271g;

    /* renamed from: h */
    public final C35518b f25272h;

    /* renamed from: i */
    public final C9537t f25273i;

    /* renamed from: j */
    public C9267c f25274j;

    /* renamed from: k */
    public C9268d f25275k;

    /* renamed from: l */
    public boolean f25276l = true;

    /* renamed from: com.urbanairship.iam.y$a */
    public class C9263a implements C9493j {

        /* renamed from: com.urbanairship.iam.y$a$a */
        public class C9264a implements C36098y<Boolean> {

            /* renamed from: a */
            public final /* synthetic */ String f25278a;

            /* renamed from: b */
            public final /* synthetic */ String f25279b;

            public C9264a(String str, String str2) {
                this.f25278a = str;
                this.f25279b = str2;
            }

            /* renamed from: a */
            public void onResult(@C0363p0 Boolean bool) {
                if (bool != null && bool.booleanValue()) {
                    C36059m.m148406b("Pending in-app message replaced.", new Object[0]);
                    C9175a.m34407i(this.f25278a, this.f25279b).mo18406o(C9262y.this.f25272h);
                }
            }
        }

        public C9263a() {
        }

        @C0348i1
        /* renamed from: a */
        public void mo18643a(@C0359n0 PushMessage pushMessage, boolean z) {
            C9259x xVar;
            C8996y B;
            try {
                xVar = C9259x.m34755a(pushMessage);
            } catch (JsonException | IllegalArgumentException e) {
                C36059m.m148411g(e, "LegacyInAppMessageManager - Unable to create in-app message from push payload", new Object[0]);
                xVar = null;
            }
            if (xVar != null && (B = C9262y.this.mo18638G(UAirship.m146200l(), xVar)) != null) {
                String B2 = B.mo17733B();
                C36059m.m148406b("Received a Push with an in-app message.", new Object[0]);
                String k = C9262y.this.f25271g.mo107848k(C9262y.f25266m, (String) null);
                if (k != null) {
                    C9262y.this.f25270f.mo17610f(k).mo107826e(new C9264a(k, B2));
                }
                C9262y.this.f25270f.mo17613i(B);
                C9262y.this.f25271g.mo107856u(C9262y.f25266m, B2);
            }
        }
    }

    /* renamed from: com.urbanairship.iam.y$b */
    public class C9265b implements C9459c {

        /* renamed from: com.urbanairship.iam.y$b$a */
        public class C9266a implements C36098y<Boolean> {

            /* renamed from: a */
            public final /* synthetic */ PushMessage f25282a;

            public C9266a(PushMessage pushMessage) {
                this.f25282a = pushMessage;
            }

            /* renamed from: a */
            public void onResult(@C0363p0 Boolean bool) {
                if (bool != null && bool.booleanValue()) {
                    C36059m.m148406b("Clearing pending in-app message due to directly interacting with the message's push notification.", new Object[0]);
                    C9175a.m34406h(this.f25282a.mo19191x()).mo18406o(C9262y.this.f25272h);
                }
            }
        }

        public C9265b() {
        }

        @C0353k0
        /* renamed from: a */
        public void mo18645a(@C0359n0 C9461e eVar, @C0363p0 C9460d dVar) {
            PushMessage b = eVar.mo19239b();
            if (b.mo19191x() != null && b.mo19167b(PushMessage.f25826T0)) {
                C9262y.this.f25270f.mo17610f(b.mo19191x()).mo107826e(new C9266a(b));
            }
        }
    }

    /* renamed from: com.urbanairship.iam.y$c */
    public interface C9267c {
        @C0359n0
        /* renamed from: a */
        InAppMessage.C9122b mo18647a(@C0359n0 Context context, @C0359n0 InAppMessage.C9122b bVar, @C0359n0 C9259x xVar);
    }

    /* renamed from: com.urbanairship.iam.y$d */
    public interface C9268d {
        @C0359n0
        /* renamed from: a */
        C8996y.C8998b<InAppMessage> mo18648a(@C0359n0 Context context, @C0359n0 C8996y.C8998b<InAppMessage> bVar, @C0359n0 C9259x xVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9262y(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C8928r rVar, @C0359n0 C35518b bVar, @C0359n0 C9537t tVar) {
        super(context, uVar);
        this.f25271g = uVar;
        this.f25270f = rVar;
        this.f25272h = bVar;
        this.f25273i = tVar;
    }

    @C0359n0
    /* renamed from: L */
    public static C9262y m34795L() {
        return (C9262y) UAirship.m146188Y().mo106211R(C9262y.class);
    }

    @C0359n0
    /* renamed from: F */
    public final InAppMessage mo18637F(@C0359n0 Context context, @C0359n0 C9259x xVar) {
        int i;
        int i2;
        C9507f a0;
        if (xVar.mo18623k() == null) {
            i = -1;
        } else {
            i = xVar.mo18623k().intValue();
        }
        if (xVar.mo18624l() == null) {
            i2 = -16777216;
        } else {
            i2 = xVar.mo18624l().intValue();
        }
        C9156c.C9158b r = C9156c.m34285A().mo18359q(i).mo18364v(i2).mo18361s(2.0f).mo18362t(C9166d.f24863d0).mo18368z(xVar.mo18622j()).mo18358p(xVar.mo18617e()).mo18360r(C9168d0.m34367p().mo18400p(xVar.mo18614b()).mo18396l(i2).mo18394j());
        if (xVar.mo18618f() != null) {
            r.mo18365w(xVar.mo18618f().longValue(), TimeUnit.MILLISECONDS);
        }
        if (!(xVar.mo18616d() == null || (a0 = this.f25273i.mo19416a0(xVar.mo18616d())) == null)) {
            int i3 = 0;
            while (i3 < a0.mo19310b().size() && i3 < 2) {
                C9504e eVar = a0.mo19310b().get(i3);
                r.mo18356n(C9139b.m34197r().mo18269k(xVar.mo18615c(eVar.mo19297e())).mo18274p(eVar.mo19297e()).mo18270l(i2).mo18273o(2.0f).mo18275q(C9168d0.m34367p().mo18397m(context, eVar.mo19296d()).mo18396l(i).mo18395k(C9168d0.f24881F0).mo18400p(eVar.mo19298f(context)).mo18394j()).mo18267i());
                i3++;
            }
        }
        InAppMessage.C9122b z = InAppMessage.m34089v().mo18199o(r.mo18357o()).mo18206v(xVar.mo18620h()).mo18210z(InAppMessage.f24673K0);
        C9267c cVar = this.f25274j;
        if (cVar != null) {
            cVar.mo18647a(context, z, xVar);
        }
        return z.mo18196l();
    }

    @C0363p0
    /* renamed from: G */
    public final C8996y<InAppMessage> mo18638G(@C0359n0 Context context, @C0359n0 C9259x xVar) {
        Trigger trigger;
        try {
            if (this.f25276l) {
                trigger = C8893h0.m33012a().mo17517a();
            } else {
                trigger = C8893h0.m33018g().mo17523a();
            }
            C8996y.C8998b<InAppMessage> B = C8996y.m33418N(mo18637F(context, xVar)).mo17763r(trigger).mo17770y(xVar.mo18619g()).mo17755B(xVar.mo18621i());
            C9268d dVar = this.f25275k;
            if (dVar != null) {
                dVar.mo18648a(context, B, xVar);
            }
            return B.mo17765t();
        } catch (Exception e) {
            C36059m.m148411g(e, "Error during factory method to convert legacy in-app message.", new Object[0]);
            return null;
        }
    }

    /* renamed from: H */
    public boolean mo18639H() {
        return this.f25276l;
    }

    /* renamed from: I */
    public void mo18640I(boolean z) {
        this.f25276l = z;
    }

    /* renamed from: J */
    public void mo18641J(@C0363p0 C9267c cVar) {
        this.f25274j = cVar;
    }

    /* renamed from: K */
    public void mo18642K(@C0363p0 C9268d dVar) {
        this.f25275k = dVar;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public int mo17620n() {
        return 3;
    }

    /* renamed from: r */
    public void mo17625r() {
        super.mo17625r();
        this.f25273i.mo19396L(new C9263a());
        this.f25273i.mo19394K(new C9265b());
    }
}
