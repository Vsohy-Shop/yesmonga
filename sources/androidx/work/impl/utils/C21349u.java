package androidx.work.impl.utils;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import androidx.appcompat.widget.C0696c;
import androidx.work.C21082a;
import androidx.work.C21377l;
import androidx.work.WorkManager;
import com.urbanairship.iam.events.C9175a;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "ProcessUtils")
/* renamed from: androidx.work.impl.utils.u */
public final class C21349u {
    @C12579k

    /* renamed from: a */
    public static final String f55061a;

    static {
        String i = C21377l.m98584i("ProcessUtils");
        Intrinsics.checkNotNullExpressionValue(i, "tagWithPrefix(\"ProcessUtils\")");
        f55061a = i;
    }

    @SuppressLint({"PrivateApi", "DiscouragedPrivateApi"})
    /* renamed from: a */
    public static final String m98477a(Context context) {
        Object obj;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28) {
            return C21293b.f54951a.mo63628a();
        }
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread", false, WorkManager.class.getClassLoader()).getDeclaredMethod("currentProcessName", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke((Object) null, new Object[0]);
            Intrinsics.checkNotNull(invoke);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Throwable th) {
            C21377l.m98582e().mo63775b(f55061a, "Unable to check ActivityThread for processName", th);
        }
        int myPid = Process.myPid();
        Object systemService = context.getSystemService(C0696c.f2306r);
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return null;
        }
        Iterator it = runningAppProcesses.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ActivityManager.RunningAppProcessInfo) obj).pid == myPid) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) obj;
        if (runningAppProcessInfo != null) {
            return runningAppProcessInfo.processName;
        }
        return null;
    }

    /* renamed from: b */
    public static final boolean m98478b(@C12579k Context context, @C12579k C21082a aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(aVar, BannerConfigurableFragment.f27258E0);
        String a = m98477a(context);
        String c = aVar.mo63097c();
        if (c == null || c.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return Intrinsics.areEqual((Object) a, (Object) aVar.mo63097c());
        }
        return Intrinsics.areEqual((Object) a, (Object) context.getApplicationInfo().processName);
    }
}
