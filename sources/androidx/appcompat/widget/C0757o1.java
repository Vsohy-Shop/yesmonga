package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.appcompat.widget.o1 */
public class C0757o1 {

    @C0376v0(26)
    /* renamed from: androidx.appcompat.widget.o1$a */
    public static class C0758a {
        @C0373u
        /* renamed from: a */
        public static void m3710a(View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    /* renamed from: a */
    public static void m3709a(@C0359n0 View view, @C0363p0 CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            C0758a.m3710a(view, charSequence);
        } else {
            C0779r1.m3793h(view, charSequence);
        }
    }
}
