package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.database.ContentObserver;
import android.os.Handler;
import androidx.annotation.C0323b0;
import androidx.core.content.C17490t0;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.s6 */
public final class C42174s6 implements C42123p6 {
    @C0323b0("GservicesLoader.class")

    /* renamed from: c */
    public static C42174s6 f106401c;
    @Nullable

    /* renamed from: a */
    public final Context f106402a;
    @Nullable

    /* renamed from: b */
    public final ContentObserver f106403b;

    public C42174s6() {
        this.f106402a = null;
        this.f106403b = null;
    }

    /* renamed from: b */
    public static C42174s6 m170809b(Context context) {
        C42174s6 s6Var;
        C42174s6 s6Var2;
        synchronized (C42174s6.class) {
            if (f106401c == null) {
                if (C17490t0.m80263d(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                    s6Var2 = new C42174s6(context);
                } else {
                    s6Var2 = new C42174s6();
                }
                f106401c = s6Var2;
            }
            s6Var = f106401c;
        }
        return s6Var;
    }

    /* renamed from: e */
    public static synchronized void m170810e() {
        Context context;
        synchronized (C42174s6.class) {
            C42174s6 s6Var = f106401c;
            if (!(s6Var == null || (context = s6Var.f106402a) == null || s6Var.f106403b == null)) {
                context.getContentResolver().unregisterContentObserver(f106401c.f106403b);
            }
            f106401c = null;
        }
    }

    @Nullable
    /* renamed from: c */
    public final String mo137032a(String str) {
        Context context = this.f106402a;
        if (context != null && !C41964g6.m169996a(context)) {
            try {
                return (String) C42089n6.m170596a(new C42140q6(this, str));
            } catch (IllegalStateException | NullPointerException | SecurityException unused) {
                "Unable to read GServices for: ".concat(String.valueOf(str));
            }
        }
        return null;
    }

    /* renamed from: d */
    public final /* synthetic */ String mo137270d(String str) {
        return C41946f6.m169873a(this.f106402a.getContentResolver(), str, (String) null);
    }

    public C42174s6(Context context) {
        this.f106402a = context;
        C42157r6 r6Var = new C42157r6(this, (Handler) null);
        this.f106403b = r6Var;
        context.getContentResolver().registerContentObserver(C41946f6.f106116a, true, r6Var);
    }
}
