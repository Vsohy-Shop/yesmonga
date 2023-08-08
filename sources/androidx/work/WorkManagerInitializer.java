package androidx.work;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.startup.C20496b;
import androidx.work.C21082a;
import java.util.Collections;
import java.util.List;

public final class WorkManagerInitializer implements C20496b<WorkManager> {

    /* renamed from: a */
    public static final String f54370a = C21377l.m98584i("WrkMgrInitializer");

    @C0359n0
    /* renamed from: b */
    public WorkManager mo55933a(@C0359n0 Context context) {
        C21377l.m98582e().mo63774a(f54370a, "Initializing WorkManager with default configuration.");
        WorkManager.m97471B(context, new C21082a.C21084b().mo63111a());
        return WorkManager.m97474q(context);
    }

    @C0359n0
    public List<Class<? extends C20496b<?>>> dependencies() {
        return Collections.emptyList();
    }
}
