package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.app.s */
public class C17223s {

    @C0376v0(28)
    /* renamed from: androidx.core.app.s$a */
    public static class C17224a {
        @C0373u
        /* renamed from: a */
        public static <T> T m79553a(Dialog dialog, int i) {
            return dialog.requireViewById(i);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static View m79552a(@C0359n0 Dialog dialog, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) C17224a.m79553a(dialog, i);
        }
        View findViewById = dialog.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
