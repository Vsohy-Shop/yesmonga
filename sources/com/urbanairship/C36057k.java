package com.urbanairship;

import android.content.Context;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import com.urbanairship.base.C9002b;
import com.urbanairship.config.C9067d;
import com.urbanairship.google.C9111c;
import com.urbanairship.push.PushProvider;
import com.urbanairship.util.C9651g0;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.k */
public class C36057k implements C9067d {

    /* renamed from: e */
    public static final String f89090e = "com.urbanairship.application.device.PLATFORM";

    /* renamed from: a */
    public final C36071u f89091a;

    /* renamed from: b */
    public final C9002b<C36078w> f89092b;

    /* renamed from: c */
    public final C36075v f89093c;

    /* renamed from: d */
    public final Context f89094d;

    public C36057k(@C0359n0 Context context, @C0359n0 C36071u uVar, @C0359n0 C36075v vVar, @C0359n0 C9002b<C36078w> bVar) {
        this.f89091a = uVar;
        this.f89093c = vVar;
        this.f89092b = bVar;
        this.f89094d = context.getApplicationContext();
    }

    /* renamed from: a */
    public final int mo107812a() {
        PushProvider d = this.f89092b.get().mo107882d();
        if (d != null) {
            int d2 = C9651g0.m36159d(d.getPlatform());
            C36059m.m148413i("Setting platform to %s for push provider: %s", C9651g0.m36156a(d2), d);
            return d2;
        }
        if (C9111c.m34017f(this.f89094d)) {
            C36059m.m148413i("Google Play Store available. Setting platform to Android.", new Object[0]);
        } else if ("amazon".equalsIgnoreCase(Build.MANUFACTURER)) {
            C36059m.m148413i("Build.MANUFACTURER is AMAZON. Setting platform to Amazon.", new Object[0]);
            return 1;
        } else {
            C36059m.m148413i("Defaulting platform to Android.", new Object[0]);
        }
        return 2;
    }

    public int getPlatform() {
        int d = C9651g0.m36159d(this.f89091a.mo107844g(f89090e, -1));
        if (d != -1) {
            return d;
        }
        if (!this.f89093c.mo107873g()) {
            return -1;
        }
        int a = mo107812a();
        this.f89091a.mo107852q(f89090e, a);
        return a;
    }
}
