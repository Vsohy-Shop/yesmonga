package androidx.core.database.sqlite;

import android.database.sqlite.SQLiteCursor;
import android.os.Build;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

/* renamed from: androidx.core.database.sqlite.b */
public final class C17516b {

    @C0376v0(28)
    /* renamed from: androidx.core.database.sqlite.b$a */
    public static class C17517a {
        @C0373u
        /* renamed from: a */
        public static void m80292a(SQLiteCursor sQLiteCursor, boolean z) {
            sQLiteCursor.setFillWindowForwardOnly(z);
        }
    }

    /* renamed from: a */
    public static void m80291a(@C0359n0 SQLiteCursor sQLiteCursor, boolean z) {
        if (Build.VERSION.SDK_INT >= 28) {
            C17517a.m80292a(sQLiteCursor, z);
        }
    }
}
