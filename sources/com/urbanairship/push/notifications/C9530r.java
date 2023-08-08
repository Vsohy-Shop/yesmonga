package com.urbanairship.push.notifications;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.core.app.C17075f2;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.push.PushMessage;
import com.urbanairship.util.C9669o0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;

/* renamed from: com.urbanairship.push.notifications.r */
public class C9530r implements C17075f2.C17097j {

    /* renamed from: d */
    public static final String f26045d = "title";

    /* renamed from: e */
    public static final String f26046e = "summary";

    /* renamed from: f */
    public static final String f26047f = "type";

    /* renamed from: g */
    public static final String f26048g = "big_text";

    /* renamed from: h */
    public static final String f26049h = "big_picture";

    /* renamed from: i */
    public static final String f26050i = "inbox";

    /* renamed from: j */
    public static final String f26051j = "lines";

    /* renamed from: a */
    public final PushMessage f26052a;

    /* renamed from: b */
    public final Context f26053b;

    /* renamed from: c */
    public C17075f2.C17105q f26054c;

    public C9530r(@C0359n0 Context context, @C0359n0 PushMessage pushMessage) {
        this.f26053b = context.getApplicationContext();
        this.f26052a = pushMessage;
    }

    @C0359n0
    /* renamed from: a */
    public C17075f2.C17092g mo19263a(@C0359n0 C17075f2.C17092g gVar) {
        C17075f2.C17105q qVar;
        if (!mo19380e(gVar) && (qVar = this.f26054c) != null) {
            gVar.mo51425z0(qVar);
        }
        return gVar;
    }

    /* renamed from: b */
    public final boolean mo19377b(@C0359n0 C17075f2.C17092g gVar, @C0359n0 C9323b bVar) {
        C17075f2.C17083d dVar = new C17075f2.C17083d();
        String l = bVar.mo18801A("title").mo18769l();
        String l2 = bVar.mo18801A("summary").mo18769l();
        try {
            Bitmap a = C9527p.m35735a(this.f26053b, new URL(bVar.mo18801A(f26049h).mo18750B()));
            if (a == null) {
                return false;
            }
            dVar.mo51309C(a);
            dVar.mo51308B((Bitmap) null);
            gVar.mo51380c0(a);
            if (!C9669o0.m36224e(l)) {
                dVar.mo51311F(l);
            }
            if (!C9669o0.m36224e(l2)) {
                dVar.mo51313H(l2);
            }
            gVar.mo51425z0(dVar);
            return true;
        } catch (MalformedURLException e) {
            C36059m.m148411g(e, "Malformed big picture URL.", new Object[0]);
            return false;
        }
    }

    /* renamed from: c */
    public final boolean mo19378c(@C0359n0 C17075f2.C17092g gVar, @C0359n0 C9323b bVar) {
        C17075f2.C17087e eVar = new C17075f2.C17087e();
        String l = bVar.mo18801A("title").mo18769l();
        String l2 = bVar.mo18801A("summary").mo18769l();
        String l3 = bVar.mo18801A(f26048g).mo18769l();
        if (!C9669o0.m36224e(l3)) {
            eVar.mo51319A(l3);
        }
        if (!C9669o0.m36224e(l)) {
            eVar.mo51320B(l);
        }
        if (!C9669o0.m36224e(l2)) {
            eVar.mo51321C(l2);
        }
        gVar.mo51425z0(eVar);
        return true;
    }

    /* renamed from: d */
    public final void mo19379d(@C0359n0 C17075f2.C17092g gVar, @C0359n0 C9323b bVar) {
        C17075f2.C17099l lVar = new C17075f2.C17099l();
        String l = bVar.mo18801A("title").mo18769l();
        String l2 = bVar.mo18801A("summary").mo18769l();
        Iterator<JsonValue> it = bVar.mo18801A(f26051j).mo18784z().iterator();
        while (it.hasNext()) {
            String l3 = it.next().mo18769l();
            if (!C9669o0.m36224e(l3)) {
                lVar.mo51450A(l3);
            }
        }
        if (!C9669o0.m36224e(l)) {
            lVar.mo51451B(l);
        }
        if (!C9669o0.m36224e(l2)) {
            lVar.mo51452C(l2);
        }
        gVar.mo51425z0(lVar);
    }

    /* renamed from: e */
    public final boolean mo19380e(@C0359n0 C17075f2.C17092g gVar) {
        String z = this.f26052a.mo19193z();
        if (z == null) {
            return false;
        }
        try {
            C9323b A = JsonValue.m34960C(z).mo18749A();
            String B = A.mo18801A("type").mo18750B();
            B.hashCode();
            char c = 65535;
            switch (B.hashCode()) {
                case 100344454:
                    if (B.equals("inbox")) {
                        c = 0;
                        break;
                    }
                    break;
                case 735420684:
                    if (B.equals(f26048g)) {
                        c = 1;
                        break;
                    }
                    break;
                case 1129611455:
                    if (B.equals(f26049h)) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    mo19379d(gVar, A);
                    return true;
                case 1:
                    mo19378c(gVar, A);
                    return true;
                case 2:
                    return mo19377b(gVar, A);
                default:
                    C36059m.m148409e("Unrecognized notification style type: %s", B);
                    return false;
            }
        } catch (JsonException e) {
            C36059m.m148411g(e, "Failed to parse notification style payload.", new Object[0]);
            return false;
        }
    }

    @C0359n0
    /* renamed from: f */
    public C9530r mo19381f(@C0363p0 C17075f2.C17105q qVar) {
        this.f26054c = qVar;
        return this;
    }
}
