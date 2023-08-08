package dagger.hilt.android.internal.managers;

import android.app.Application;
import android.app.Service;
import dagger.hilt.C10262b;
import dagger.hilt.C10263c;
import dagger.hilt.C10267e;
import dagger.hilt.android.internal.builders.C10189d;
import dagger.hilt.components.C10265a;
import dagger.hilt.internal.C10274c;
import dagger.hilt.internal.C10280f;

/* renamed from: dagger.hilt.android.internal.managers.k */
public final class C10234k implements C10274c<Object> {

    /* renamed from: a */
    public final Service f27950a;

    /* renamed from: b */
    public Object f27951b;

    @C10267e({C10265a.class})
    @C10262b
    /* renamed from: dagger.hilt.android.internal.managers.k$a */
    public interface C10235a {
        /* renamed from: d */
        C10189d mo21679d();
    }

    public C10234k(Service service) {
        this.f27950a = service;
    }

    /* renamed from: a */
    public final Object mo21678a() {
        Application application = this.f27950a.getApplication();
        C10280f.m38508d(application instanceof C10274c, "Hilt service must be attached to an @AndroidEntryPoint Application. Found: %s", application.getClass());
        return ((C10235a) C10263c.m38503a(application, C10235a.class)).mo21679d().mo21624a(this.f27950a).mo21625g();
    }

    public Object generatedComponent() {
        if (this.f27951b == null) {
            this.f27951b = mo21678a();
        }
        return this.f27951b;
    }
}
