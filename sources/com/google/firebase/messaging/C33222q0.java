package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import androidx.annotation.C0348i1;
import androidx.profileinstaller.C20006f;
import com.google.android.gms.common.util.C40996v;
import com.google.android.gms.tasks.C31047k;
import com.google.android.gms.tasks.C31049l;
import com.google.android.gms.tasks.C31053n;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.q0 */
public final class C33222q0 {

    /* renamed from: a */
    public static final String f80777a = "firebase_messaging_notification_delegation_enabled";

    /* renamed from: b */
    public static boolean m134026b(Context context) {
        return Binder.getCallingUid() == context.getApplicationInfo().uid;
    }

    @C0348i1
    /* renamed from: c */
    public static void m134027c(Context context) {
        if (!C33224r0.m134034b(context)) {
            m134030f(new C20006f(), context, m134031g(context));
        }
    }

    /* renamed from: d */
    public static boolean m134028d(Context context) {
        if (!C40996v.m166691p()) {
            return false;
        }
        if (!m134026b(context)) {
            StringBuilder sb = new StringBuilder();
            sb.append("error retrieving notification delegate for package ");
            sb.append(context.getPackageName());
            return false;
        } else if ("com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: e */
    public static /* synthetic */ void m134029e(Context context, boolean z, C31049l lVar) {
        try {
            if (!m134026b(context)) {
                StringBuilder sb = new StringBuilder();
                sb.append("error configuring notification delegate for package ");
                sb.append(context.getPackageName());
                return;
            }
            C33224r0.m134035c(context, true);
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (z) {
                notificationManager.setNotificationDelegate("com.google.android.gms");
            } else if ("com.google.android.gms".equals(notificationManager.getNotificationDelegate())) {
                notificationManager.setNotificationDelegate((String) null);
            }
            lVar.mo87745e(null);
        } finally {
            lVar.mo87745e(null);
        }
    }

    @TargetApi(29)
    /* renamed from: f */
    public static C31047k<Void> m134030f(Executor executor, Context context, boolean z) {
        if (!C40996v.m166691p()) {
            return C31053n.m124525g(null);
        }
        C31049l lVar = new C31049l();
        executor.execute(new C33220p0(context, z, lVar));
        return lVar.mo87741a();
    }

    /* renamed from: g */
    public static boolean m134031g(Context context) {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            Context applicationContext = context.getApplicationContext();
            PackageManager packageManager = applicationContext.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey(f80777a)) {
                return true;
            }
            return applicationInfo.metaData.getBoolean(f80777a);
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }
}
