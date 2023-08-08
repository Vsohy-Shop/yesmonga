package com.appsflyer.internal;

import android.content.Context;
import java.util.Map;

/* renamed from: com.appsflyer.internal.cp */
public abstract class C21962cp extends C21967ct {
    public C21962cp(String str, Runnable runnable) {
        super(str, runnable);
    }

    public final void valueOf(Context context, C21903av<Map<String, Object>> avVar) {
        if (C21868ah.valueOf().valueOf(C21868ah.valueOf(context), false) <= 0 && avVar.AFInAppEventType()) {
            new Thread(avVar.AFInAppEventParameterName).start();
            valueOf();
        }
    }
}
