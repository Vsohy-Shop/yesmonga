package androidx.core.view;

import android.os.Build;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import androidx.core.internal.view.C17673a;

/* renamed from: androidx.core.view.t0 */
public final class C18371t0 {

    @C0376v0(28)
    /* renamed from: androidx.core.view.t0$a */
    public static class C18372a {
        @C0373u
        /* renamed from: a */
        public static void m83143a(Menu menu, boolean z) {
            menu.setGroupDividerEnabled(z);
        }
    }

    /* renamed from: a */
    public static void m83141a(@C0359n0 Menu menu, boolean z) {
        if (menu instanceof C17673a) {
            ((C17673a) menu).setGroupDividerEnabled(z);
        } else if (Build.VERSION.SDK_INT >= 28) {
            C18372a.m83143a(menu, z);
        }
    }

    @Deprecated
    /* renamed from: b */
    public static void m83142b(MenuItem menuItem, int i) {
        menuItem.setShowAsAction(i);
    }
}
