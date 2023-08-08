package com.urbanairship.push.notifications;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.core.app.C17075f2;
import com.urbanairship.UAirship;

/* renamed from: com.urbanairship.push.notifications.a */
public class C9498a implements C17075f2.C17097j {

    /* renamed from: a */
    public final Context f25926a;

    /* renamed from: b */
    public final C9510g f25927b;

    public C9498a(@C0359n0 Context context, @C0359n0 C9510g gVar) {
        this.f25926a = context.getApplicationContext();
        this.f25927b = gVar;
    }

    @C0359n0
    /* renamed from: a */
    public C17075f2.C17092g mo19263a(@C0359n0 C17075f2.C17092g gVar) {
        C9507f a0 = UAirship.m146188Y().mo106203E().mo19416a0(this.f25927b.mo19313a().mo19180n());
        if (a0 == null) {
            return gVar;
        }
        Context context = this.f25926a;
        C9510g gVar2 = this.f25927b;
        for (C17075f2.C17077b b : a0.mo19309a(context, gVar2, gVar2.mo19313a().mo19179m())) {
            gVar.mo51377b(b);
        }
        return gVar;
    }
}
