package androidx.core.database;

import android.database.CursorWindow;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.database.b */
public final class C17509b {

    @C0376v0(15)
    /* renamed from: androidx.core.database.b$a */
    public static class C17510a {
        @C0373u
        /* renamed from: a */
        public static CursorWindow m80284a(String str) {
            return new CursorWindow(str);
        }
    }

    @C0376v0(28)
    /* renamed from: androidx.core.database.b$b */
    public static class C17511b {
        @C0373u
        /* renamed from: a */
        public static CursorWindow m80285a(String str, long j) {
            C17513d.m80287a();
            return C17512c.m80286a(str, j);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static CursorWindow m80283a(@C0363p0 String str, long j) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C17511b.m80285a(str, j);
        }
        return C17510a.m80284a(str);
    }
}
