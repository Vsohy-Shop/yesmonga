package com.urbanairship.push.notifications;

import android.app.Notification;
import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.core.app.C17075f2;
import com.urbanairship.C36059m;
import com.urbanairship.UAirship;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;

/* renamed from: com.urbanairship.push.notifications.s */
public class C9531s implements C17075f2.C17097j {

    /* renamed from: c */
    public static final String f26055c = "title";

    /* renamed from: d */
    public static final String f26056d = "alert";

    /* renamed from: e */
    public static final String f26057e = "interactive_type";

    /* renamed from: f */
    public static final String f26058f = "interactive_actions";

    /* renamed from: a */
    public final Context f26059a;

    /* renamed from: b */
    public final C9510g f26060b;

    public C9531s(@C0359n0 Context context, @C0359n0 C9510g gVar) {
        this.f26059a = context.getApplicationContext();
        this.f26060b = gVar;
    }

    @C0359n0
    /* renamed from: a */
    public C17075f2.C17092g mo19263a(@C0359n0 C17075f2.C17092g gVar) {
        C9507f a0;
        String D = this.f26060b.mo19313a().mo19157D();
        if (D == null) {
            return gVar;
        }
        try {
            C9323b A = JsonValue.m34960C(D).mo18749A();
            C17075f2.C17106r rVar = new C17075f2.C17106r();
            String l = A.mo18801A(f26057e).mo18769l();
            String jsonValue = A.mo18801A(f26058f).toString();
            if (C9669o0.m36224e(jsonValue)) {
                jsonValue = this.f26060b.mo19313a().mo19179m();
            }
            if (!C9669o0.m36224e(l) && (a0 = UAirship.m146188Y().mo106203E().mo19416a0(l)) != null) {
                rVar.mo51513c(a0.mo19309a(this.f26059a, this.f26060b, jsonValue));
            }
            gVar.mo51403o(rVar);
            return gVar;
        } catch (JsonException e) {
            C36059m.m148411g(e, "Failed to parse wearable payload.", new Object[0]);
            return gVar;
        }
    }

    /* renamed from: b */
    public final Notification mo19382b(@C0359n0 C9323b bVar) {
        C17075f2.C17087e eVar = new C17075f2.C17087e();
        String l = bVar.mo18801A("title").mo18769l();
        if (!C9669o0.m36224e(l)) {
            eVar.mo51320B(l);
        }
        String l2 = bVar.mo18801A("alert").mo18769l();
        if (!C9669o0.m36224e(l2)) {
            eVar.mo51319A(l2);
        }
        return new C17075f2.C17092g(this.f26059a, this.f26060b.mo19314b()).mo51346D(true).mo51425z0(eVar).mo51389h();
    }
}
