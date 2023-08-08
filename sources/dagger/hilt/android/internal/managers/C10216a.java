package dagger.hilt.android.internal.managers;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import dagger.hilt.C10262b;
import dagger.hilt.C10263c;
import dagger.hilt.C10267e;
import dagger.hilt.android.components.C10167b;
import dagger.hilt.android.internal.builders.C10186a;
import dagger.hilt.internal.C10274c;

/* renamed from: dagger.hilt.android.internal.managers.a */
public class C10216a implements C10274c<Object> {

    /* renamed from: a */
    public volatile Object f27933a;

    /* renamed from: b */
    public final Object f27934b = new Object();

    /* renamed from: c */
    public final Activity f27935c;

    /* renamed from: d */
    public final C10274c<C10167b> f27936d;

    @C10267e({C10167b.class})
    @C10262b
    /* renamed from: dagger.hilt.android.internal.managers.a$a */
    public interface C10217a {
        /* renamed from: a */
        C10186a mo21665a();
    }

    public C10216a(Activity activity) {
        this.f27935c = activity;
        this.f27936d = new C10218b((ComponentActivity) activity);
    }

    /* renamed from: a */
    public Object mo21664a() {
        if (this.f27935c.getApplication() instanceof C10274c) {
            return ((C10217a) C10263c.m38503a(this.f27936d, C10217a.class)).mo21665a().mo21619a(this.f27935c).mo21620g();
        }
        if (Application.class.equals(this.f27935c.getApplication().getClass())) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
        }
        throw new IllegalStateException("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: " + this.f27935c.getApplication().getClass());
    }

    public Object generatedComponent() {
        if (this.f27933a == null) {
            synchronized (this.f27934b) {
                if (this.f27933a == null) {
                    this.f27933a = mo21664a();
                }
            }
        }
        return this.f27933a;
    }
}
