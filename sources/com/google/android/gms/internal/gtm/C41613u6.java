package com.google.android.gms.internal.gtm;

import android.content.DialogInterface;
import android.content.Intent;

/* renamed from: com.google.android.gms.internal.gtm.u6 */
public final class C41613u6 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C41637v6 f105056a;

    public C41613u6(C41637v6 v6Var) {
        this.f105056a = v6Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        String str;
        String str2;
        String packageName = this.f105056a.f105150a.getPackageName();
        Intent launchIntentForPackage = this.f105056a.f105150a.getPackageManager().getLaunchIntentForPackage(packageName);
        if (launchIntentForPackage != null) {
            String valueOf = String.valueOf(packageName);
            if (valueOf.length() != 0) {
                str2 = "Invoke the launch activity for package name: ".concat(valueOf);
            } else {
                str2 = new String("Invoke the launch activity for package name: ");
            }
            C41493p6.m168151c(str2);
            this.f105056a.f105150a.startActivity(launchIntentForPackage);
            return;
        }
        String valueOf2 = String.valueOf(packageName);
        if (valueOf2.length() != 0) {
            str = "No launch activity found for package name: ".concat(valueOf2);
        } else {
            str = new String("No launch activity found for package name: ");
        }
        C41493p6.m168153e(str);
    }
}
