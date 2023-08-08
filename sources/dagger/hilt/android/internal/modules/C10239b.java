package dagger.hilt.android.internal.modules;

import android.app.Activity;
import androidx.fragment.app.C19232h;
import dagger.internal.C10321e;
import dagger.internal.C10324h;
import dagger.internal.C10335o;
import dagger.internal.C10337q;
import dagger.internal.C10338r;
import javax.inject.Provider;

@C10321e
@C10337q
@C10338r("dagger.Reusable")
/* renamed from: dagger.hilt.android.internal.modules.b */
public final class C10239b implements C10324h<C19232h> {

    /* renamed from: a */
    public final Provider<Activity> f27952a;

    public C10239b(Provider<Activity> provider) {
        this.f27952a = provider;
    }

    /* renamed from: a */
    public static C10239b m38482a(Provider<Activity> provider) {
        return new C10239b(provider);
    }

    /* renamed from: c */
    public static C19232h m38483c(Activity activity) {
        return (C19232h) C10335o.m38554f(C10238a.m38480b(activity));
    }

    /* renamed from: b */
    public C19232h get() {
        return m38483c(this.f27952a.get());
    }
}
