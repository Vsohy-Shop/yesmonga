package com.carrefour.fid.android.utils;

import android.app.AlertDialog;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.p021ui.BaseActivity;
import com.carrefour.fid.android.core.datastore.AppPreferencesStorage;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.android.qualifiers.C10254a;
import java.util.Calendar;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.C10864b0;
import kotlin.C11079d2;
import kotlin.C11677z;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C8567o(parameters = 0)
public final class DeviceSecurityHelper {

    /* renamed from: d */
    public static final int f58132d = 8;
    @C12579k

    /* renamed from: a */
    public final Context f58133a;
    @C12579k

    /* renamed from: b */
    public final AppPreferencesStorage f58134b;
    @C12579k

    /* renamed from: c */
    public final C11677z f58135c = C10864b0.m38748c(new DeviceSecurityHelper$keyguardManager$2(this));

    @Inject
    public DeviceSecurityHelper(@C10254a @C12579k Context context, @C12579k AppPreferencesStorage appPreferencesStorage) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(appPreferencesStorage, "appPreferencesStorage");
        this.f58133a = context;
        this.f58134b = appPreferencesStorage;
    }

    /* renamed from: i */
    public static final void m102760i(BaseActivity baseActivity, DialogInterface dialogInterface, int i) {
        Intrinsics.checkNotNullParameter(baseActivity, "$it");
        baseActivity.startActivity(new Intent("android.settings.SECURITY_SETTINGS"));
    }

    /* renamed from: j */
    public static final void m102761j(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }

    /* renamed from: d */
    public final KeyguardManager mo67052d() {
        return (KeyguardManager) this.f58135c.getValue();
    }

    /* renamed from: e */
    public final boolean mo67053e() {
        return mo67052d().isDeviceSecure();
    }

    @C12580l
    /* renamed from: f */
    public final Object mo67054f(@C12579k C11045c<? super C11079d2> cVar) {
        Object m = this.f58134b.mo108090m(Calendar.getInstance().getTimeInMillis() + C22705g.m102800a(), cVar);
        if (m == C11063b.m42612h()) {
            return m;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    @org.jetbrains.annotations.C12580l
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo67055g(@org.jetbrains.annotations.C12579k kotlin.coroutines.C11045c<? super java.lang.Boolean> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.utils.DeviceSecurityHelper$shouldShowSecurityAlert$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.utils.DeviceSecurityHelper$shouldShowSecurityAlert$1 r0 = (com.carrefour.fid.android.utils.DeviceSecurityHelper$shouldShowSecurityAlert$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.utils.DeviceSecurityHelper$shouldShowSecurityAlert$1 r0 = new com.carrefour.fid.android.utils.DeviceSecurityHelper$shouldShowSecurityAlert$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r4) goto L_0x002c
            long r0 = r0.J$0
            kotlin.C11661u0.m45747n(r8)
            goto L_0x0053
        L_0x002c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x0034:
            kotlin.C11661u0.m45747n(r8)
            boolean r8 = r7.mo67053e()
            if (r8 != 0) goto L_0x0065
            java.util.Calendar r8 = java.util.Calendar.getInstance()
            long r5 = r8.getTimeInMillis()
            com.carrefour.fid.android.core.datastore.AppPreferencesStorage r8 = r7.f58134b
            r0.J$0 = r5
            r0.label = r4
            java.lang.Object r8 = r8.mo108080c(r0)
            if (r8 != r1) goto L_0x0052
            return r1
        L_0x0052:
            r0 = r5
        L_0x0053:
            com.carrefour.fid.android.core.datastore.a r8 = (com.carrefour.fid.android.core.datastore.C36193a) r8
            if (r8 != 0) goto L_0x005c
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r4)
            return r8
        L_0x005c:
            long r5 = r8.mo108115B()
            int r8 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r8 <= 0) goto L_0x0065
            r3 = r4
        L_0x0065:
            java.lang.Boolean r8 = kotlin.coroutines.jvm.internal.C11064a.m42615a(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.utils.DeviceSecurityHelper.mo67055g(kotlin.coroutines.c):java.lang.Object");
    }

    /* renamed from: h */
    public final void mo67056h() {
        BaseActivity baseActivity;
        Context context = this.f58133a;
        if (context instanceof BaseActivity) {
            baseActivity = (BaseActivity) context;
        } else {
            baseActivity = null;
        }
        if (baseActivity != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f58133a, R.style.OneAlertDialogTheme);
            AlertDialog.Builder view = builder.setView(baseActivity.getLayoutInflater().inflate(R.layout.security_alert_dialog, (ViewGroup) null));
            String string = baseActivity.getResources().getString(R.string.general_configure);
            Intrinsics.checkNotNullExpressionValue(string, "baseActivity.resources.g…string.general_configure)");
            Locale locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
            String upperCase = string.toUpperCase(locale);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
            view.setPositiveButton(upperCase, new C22703e(baseActivity)).setNegativeButton(R.string.dialog_security_alert_button_cancel, new C22704f());
            builder.setCancelable(false);
            builder.create().show();
        }
    }
}
