package com.google.android.gms.internal.gtm;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tagmanager.impl.C31008a;

/* renamed from: com.google.android.gms.internal.gtm.v6 */
public final class C41637v6 {

    /* renamed from: a */
    public final Context f105150a;

    /* renamed from: b */
    public final Context f105151b;

    /* renamed from: c */
    public final Intent f105152c;

    /* renamed from: d */
    public final C41375k8 f105153d;

    public C41637v6(Intent intent, Context context, Context context2, C41375k8 k8Var) {
        this.f105150a = context;
        this.f105151b = context2;
        this.f105152c = intent;
        this.f105153d = k8Var;
    }

    /* renamed from: b */
    public final void mo135973b() {
        String str;
        try {
            this.f105153d.mo135578n(this.f105152c.getData());
            String string = this.f105151b.getResources().getString(C31008a.C31009a.tagmanager_preview_dialog_title);
            String string2 = this.f105151b.getResources().getString(C31008a.C31009a.tagmanager_preview_dialog_message);
            String string3 = this.f105151b.getResources().getString(C31008a.C31009a.tagmanager_preview_dialog_button);
            AlertDialog create = new AlertDialog.Builder(this.f105150a).create();
            create.setTitle(string);
            create.setMessage(string2);
            create.setButton(-1, string3, new C41613u6(this));
            create.show();
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                str = "Calling preview threw an exception: ".concat(valueOf);
            } else {
                str = new String("Calling preview threw an exception: ");
            }
            C41493p6.m168149a(str);
        }
    }
}
