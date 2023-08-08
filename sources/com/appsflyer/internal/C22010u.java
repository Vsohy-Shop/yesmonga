package com.appsflyer.internal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.appsflyer.AFLogger;
import com.urbanairship.iam.C9168d0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

/* renamed from: com.appsflyer.internal.u */
public final class C22010u {
    public final C21927bl AFInAppEventParameterName;
    public final ExecutorService valueOf;

    public C22010u() {
    }

    public static Map<String, String> AFKeystoreWrapper(@NonNull Context context) {
        HashMap hashMap = new HashMap();
        try {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            hashMap.put("x_px", String.valueOf(displayMetrics.widthPixels));
            hashMap.put("y_px", String.valueOf(displayMetrics.heightPixels));
            hashMap.put("d_dpi", String.valueOf(displayMetrics.densityDpi));
            hashMap.put(C9168d0.f24889w, String.valueOf(context.getResources().getConfiguration().screenLayout & 15));
            hashMap.put("xdp", String.valueOf(displayMetrics.xdpi));
            hashMap.put("ydp", String.valueOf(displayMetrics.ydpi));
        } catch (Throwable th) {
            AFLogger.AFKeystoreWrapper("Couldn't aggregate screen stats: ", th);
        }
        return hashMap;
    }

    public C22010u(C21927bl blVar, ExecutorService executorService) {
        this.AFInAppEventParameterName = blVar;
        this.valueOf = executorService;
    }
}
