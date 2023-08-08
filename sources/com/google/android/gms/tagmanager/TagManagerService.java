package com.google.android.gms.tagmanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.C0348i1;
import androidx.annotation.Keep;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class TagManagerService extends Service {
    @C0348i1
    @KeepName
    @Keep
    public static void initialize(@RecentlyNonNull Context context) {
        C31006h.m124430e(context);
    }

    @RecentlyNonNull
    public IBinder onBind(@RecentlyNonNull Intent intent) {
        return C31006h.m124426a(this);
    }
}
