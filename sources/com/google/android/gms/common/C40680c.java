package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.common.c */
public class C40680c extends DialogFragment {

    /* renamed from: a */
    public Dialog f103642a;

    /* renamed from: b */
    public DialogInterface.OnCancelListener f103643b;
    @C0363p0

    /* renamed from: c */
    public Dialog f103644c;

    @C0359n0
    /* renamed from: a */
    public static C40680c m165541a(@C0359n0 Dialog dialog) {
        return m165542b(dialog, (DialogInterface.OnCancelListener) null);
    }

    @C0359n0
    /* renamed from: b */
    public static C40680c m165542b(@C0359n0 Dialog dialog, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        C40680c cVar = new C40680c();
        Dialog dialog2 = (Dialog) C40843u.m166203m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        cVar.f103642a = dialog2;
        if (onCancelListener != null) {
            cVar.f103643b = onCancelListener;
        }
        return cVar;
    }

    public void onCancel(@C0359n0 DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f103643b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @C0359n0
    public Dialog onCreateDialog(@C0363p0 Bundle bundle) {
        Dialog dialog = this.f103642a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f103644c == null) {
            this.f103644c = new AlertDialog.Builder((Context) C40843u.m166202l(getActivity())).create();
        }
        return this.f103644c;
    }

    public void show(@C0359n0 FragmentManager fragmentManager, @C0363p0 String str) {
        super.show(fragmentManager, str);
    }
}
