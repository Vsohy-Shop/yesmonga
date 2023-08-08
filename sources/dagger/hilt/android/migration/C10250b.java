package dagger.hilt.android.migration;

import android.app.Application;
import androidx.annotation.C0359n0;
import dagger.hilt.android.internal.migration.C10236a;
import dagger.hilt.internal.C10280f;

/* renamed from: dagger.hilt.android.migration.b */
public final class C10250b {
    /* renamed from: a */
    public static void m38496a(@C0359n0 Application application) {
        C10280f.m38506b(application);
        C10280f.m38505a(application instanceof C10236a, "'%s' is not a custom inject application. Check that you have annotated the application with both @HiltAndroidApp and @CustomInject.", application.getClass());
        ((C10236a) application).mo21680a();
    }
}
