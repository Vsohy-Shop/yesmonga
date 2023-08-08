package androidx.browser.customtabs;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.C0348i1;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.core.app.C17195p;
import androidx.core.content.C17339i;
import java.io.File;

/* renamed from: androidx.browser.customtabs.m */
public class C0934m {

    /* renamed from: a */
    public static final String f2947a = "android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY";
    @RestrictTo({RestrictTo.Scope.LIBRARY})

    /* renamed from: b */
    public static final String f2948b = "android.support.customtabs.action.ACTION_MANAGE_TRUSTED_WEB_ACTIVITY_DATA";

    /* renamed from: a */
    public static boolean m4226a(@C0359n0 Context context, @C0359n0 String str, @C0359n0 String str2) {
        IntentFilter intentFilter;
        ResolveInfo resolveService = context.getPackageManager().resolveService(new Intent().setAction(C0917f.f2911c).setPackage(str), 64);
        if (resolveService == null || (intentFilter = resolveService.filter) == null) {
            return false;
        }
        return intentFilter.hasCategory(str2);
    }

    @Deprecated
    /* renamed from: b */
    public static void m4227b(@C0359n0 Context context, @C0359n0 C0912d dVar, @C0359n0 Uri uri) {
        if (C17195p.m79486a(dVar.f2893a.getExtras(), C0912d.f2870d) != null) {
            dVar.f2893a.putExtra(f2947a, true);
            dVar.mo3916c(context, uri);
            return;
        }
        throw new IllegalArgumentException("Given CustomTabsIntent should be associated with a valid CustomTabsSession");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* renamed from: c */
    public static void m4228c(@C0359n0 Context context, @C0359n0 C0924h hVar, @C0359n0 Uri uri) {
        Intent intent = new Intent(f2948b);
        intent.setPackage(hVar.mo3963e().getPackageName());
        intent.setData(uri);
        Bundle bundle = new Bundle();
        C17195p.m79487b(bundle, C0912d.f2870d, hVar.mo3962d());
        intent.putExtras(bundle);
        PendingIntent f = hVar.mo3964f();
        if (f != null) {
            intent.putExtra(C0912d.f2871e, f);
        }
        context.startActivity(intent);
    }

    @C0348i1
    /* renamed from: d */
    public static boolean m4229d(@C0359n0 Context context, @C0359n0 File file, @C0359n0 String str, @C0359n0 String str2, @C0359n0 C0924h hVar) {
        Uri f = C17339i.m79773f(context, str, file);
        context.grantUriPermission(str2, f, 1);
        return hVar.mo3967i(f, 1, (Bundle) null);
    }
}
