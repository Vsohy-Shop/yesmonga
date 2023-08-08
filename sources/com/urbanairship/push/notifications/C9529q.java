package com.urbanairship.push.notifications;

import android.content.Context;
import android.graphics.BitmapFactory;
import androidx.annotation.C0354l;
import androidx.annotation.C0359n0;
import androidx.annotation.C0375v;
import androidx.core.app.C17075f2;
import com.urbanairship.C36059m;
import com.urbanairship.json.C9323b;
import com.urbanairship.json.JsonException;
import com.urbanairship.json.JsonValue;
import com.urbanairship.util.C9669o0;

/* renamed from: com.urbanairship.push.notifications.q */
public class C9529q implements C17075f2.C17097j {

    /* renamed from: f */
    public static final String f26037f = "title";

    /* renamed from: g */
    public static final String f26038g = "summary";

    /* renamed from: h */
    public static final String f26039h = "alert";

    /* renamed from: a */
    public final Context f26040a;

    /* renamed from: b */
    public final C9510g f26041b;

    /* renamed from: c */
    public int f26042c;

    /* renamed from: d */
    public int f26043d;

    /* renamed from: e */
    public int f26044e;

    public C9529q(@C0359n0 Context context, @C0359n0 C9510g gVar) {
        this.f26040a = context;
        this.f26041b = gVar;
        this.f26043d = context.getApplicationInfo().icon;
    }

    @C0359n0
    /* renamed from: a */
    public C17075f2.C17092g mo19263a(@C0359n0 C17075f2.C17092g gVar) {
        if (C9669o0.m36224e(this.f26041b.mo19313a().mo19187u())) {
            return gVar;
        }
        try {
            C9323b A = JsonValue.m34960C(this.f26041b.mo19313a().mo19187u()).mo18749A();
            C17075f2.C17092g t0 = new C17075f2.C17092g(this.f26040a, this.f26041b.mo19314b()).mo51364P(A.mo18801A("title").mo18750B()).mo51363O(A.mo18801A("alert").mo18750B()).mo51358J(this.f26042c).mo51346D(true).mo51414t0(this.f26043d);
            if (this.f26044e != 0) {
                t0.mo51380c0(BitmapFactory.decodeResource(this.f26040a.getResources(), this.f26044e));
            }
            if (A.mo18805e("summary")) {
                t0.mo51341A0(A.mo18801A("summary").mo18750B());
            }
            gVar.mo51400m0(t0.mo51389h());
        } catch (JsonException e) {
            C36059m.m148411g(e, "Failed to parse public notification.", new Object[0]);
        }
        return gVar;
    }

    @C0359n0
    /* renamed from: b */
    public C9529q mo19374b(@C0354l int i) {
        this.f26042c = i;
        return this;
    }

    @C0359n0
    /* renamed from: c */
    public C9529q mo19375c(@C0375v int i) {
        this.f26044e = i;
        return this;
    }

    @C0359n0
    /* renamed from: d */
    public C9529q mo19376d(@C0375v int i) {
        this.f26043d = i;
        return this;
    }
}
