package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.fragment.app.C19215c;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.internal.C40843u;

/* renamed from: com.google.android.gms.common.s */
public class C40930s extends C19215c {

    /* renamed from: a */
    public Dialog f104115a;

    /* renamed from: b */
    public DialogInterface.OnCancelListener f104116b;
    @C0363p0

    /* renamed from: c */
    public Dialog f104117c;

    @C0359n0
    /* renamed from: K0 */
    public static C40930s m166377K0(@C0359n0 Dialog dialog) {
        return m166378L0(dialog, (DialogInterface.OnCancelListener) null);
    }

    @C0359n0
    /* renamed from: L0 */
    public static C40930s m166378L0(@C0359n0 Dialog dialog, @C0363p0 DialogInterface.OnCancelListener onCancelListener) {
        C40930s sVar = new C40930s();
        Dialog dialog2 = (Dialog) C40843u.m166203m(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        sVar.f104115a = dialog2;
        if (onCancelListener != null) {
            sVar.f104116b = onCancelListener;
        }
        return sVar;
    }

    public void onCancel(@C0359n0 DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f104116b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @C0359n0
    public Dialog onCreateDialog(@C0363p0 Bundle bundle) {
        Dialog dialog = this.f104115a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f104117c == null) {
            this.f104117c = new AlertDialog.Builder((Context) C40843u.m166202l(getContext())).create();
        }
        return this.f104117c;
    }

    public void show(@C0359n0 FragmentManager fragmentManager, @C0363p0 String str) {
        super.show(fragmentManager, str);
    }
}
