package com.urbanairship.locale;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.core.p027os.C17785f;
import com.urbanairship.C36059m;
import com.urbanairship.C36071u;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.locale.b */
public class C9342b {

    /* renamed from: e */
    public static final String f25477e = "com.urbanairship.LOCALE_OVERRIDE_LANGUAGE";

    /* renamed from: f */
    public static final String f25478f = "com.urbanairship.LOCALE_OVERRIDE_COUNTRY";

    /* renamed from: g */
    public static final String f25479g = "com.urbanairship.LOCALE_OVERRIDE_VARIANT";

    /* renamed from: a */
    public final Context f25480a;

    /* renamed from: b */
    public volatile Locale f25481b;

    /* renamed from: c */
    public final List<C9341a> f25482c = new CopyOnWriteArrayList();

    /* renamed from: d */
    public final C36071u f25483d;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public C9342b(@C0359n0 Context context, @C0359n0 C36071u uVar) {
        this.f25483d = uVar;
        this.f25480a = context.getApplicationContext();
    }

    /* renamed from: a */
    public void mo18865a(@C0359n0 C9341a aVar) {
        this.f25482c.add(aVar);
    }

    @C0359n0
    /* renamed from: b */
    public Locale mo18866b() {
        if (mo18867c() != null) {
            return mo18867c();
        }
        if (this.f25481b == null) {
            this.f25481b = C17785f.m81175a(this.f25480a.getResources().getConfiguration()).mo52233d(0);
        }
        return this.f25481b;
    }

    @C0363p0
    /* renamed from: c */
    public final Locale mo18867c() {
        String k = this.f25483d.mo107848k(f25477e, (String) null);
        String k2 = this.f25483d.mo107848k(f25478f, (String) null);
        String k3 = this.f25483d.mo107848k(f25479g, (String) null);
        if (k == null || k2 == null || k3 == null) {
            return null;
        }
        return new Locale(k, k2, k3);
    }

    /* renamed from: d */
    public void mo18868d(Locale locale) {
        for (C9341a a : this.f25482c) {
            a.mo17778a(locale);
        }
    }

    /* renamed from: e */
    public void mo18869e() {
        synchronized (this) {
            this.f25481b = C17785f.m81175a(this.f25480a.getResources().getConfiguration()).mo52233d(0);
            C36059m.m148406b("Device Locale changed. Locale: %s.", this.f25481b);
            if (mo18867c() == null) {
                mo18868d(this.f25481b);
            }
        }
    }

    /* renamed from: f */
    public void mo18870f(@C0359n0 C9341a aVar) {
        this.f25482c.remove(aVar);
    }

    /* renamed from: g */
    public void mo18871g(@C0363p0 Locale locale) {
        synchronized (this) {
            Locale b = mo18866b();
            if (locale != null) {
                this.f25483d.mo107856u(f25478f, locale.getCountry());
                this.f25483d.mo107856u(f25477e, locale.getLanguage());
                this.f25483d.mo107856u(f25479g, locale.getVariant());
            } else {
                this.f25483d.mo107859x(f25478f);
                this.f25483d.mo107859x(f25477e);
                this.f25483d.mo107859x(f25479g);
            }
            if (b != mo18866b()) {
                mo18868d(mo18866b());
            }
        }
    }
}
