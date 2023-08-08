package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.wrappers.C41008d;
import javax.annotation.concurrent.GuardedBy;

/* renamed from: com.google.android.gms.common.internal.l1 */
public final class C40783l1 {

    /* renamed from: a */
    public static final Object f103901a = new Object();
    @GuardedBy("sLock")

    /* renamed from: b */
    public static boolean f103902b;
    @C0363p0

    /* renamed from: c */
    public static String f103903c;

    /* renamed from: d */
    public static int f103904d;

    /* renamed from: a */
    public static int m165960a(Context context) {
        m165962c(context);
        return f103904d;
    }

    @C0363p0
    /* renamed from: b */
    public static String m165961b(Context context) {
        m165962c(context);
        return f103903c;
    }

    /* renamed from: c */
    public static void m165962c(Context context) {
        synchronized (f103901a) {
            if (!f103902b) {
                f103902b = true;
                try {
                    Bundle bundle = C41008d.m166715a(context).mo134781c(context.getPackageName(), 128).metaData;
                    if (bundle != null) {
                        f103903c = bundle.getString("com.google.app.id");
                        f103904d = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
            }
        }
    }
}
