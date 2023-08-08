package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.C0347i0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.C19215c;

/* renamed from: androidx.appcompat.app.r */
public class C0493r extends C19215c {
    public C0493r() {
    }

    @C0359n0
    public Dialog onCreateDialog(@C0363p0 Bundle bundle) {
        return new C0492q(getContext(), getTheme());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@C0359n0 Dialog dialog, int i) {
        if (dialog instanceof C0492q) {
            C0492q qVar = (C0492q) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            qVar.mo1528l(1);
            return;
        }
        super.setupDialog(dialog, i);
    }

    public C0493r(@C0347i0 int i) {
        super(i);
    }
}
