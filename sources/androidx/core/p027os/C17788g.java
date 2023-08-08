package androidx.core.p027os;

import android.os.Environment;
import androidx.annotation.C0359n0;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;
import java.io.File;

/* renamed from: androidx.core.os.g */
public final class C17788g {

    /* renamed from: a */
    public static final String f46181a = "EnvironmentCompat";

    /* renamed from: b */
    public static final String f46182b = "unknown";

    @C0376v0(19)
    /* renamed from: androidx.core.os.g$a */
    public static class C17789a {
        @C0373u
        /* renamed from: a */
        public static String m81179a(File file) {
            return Environment.getStorageState(file);
        }
    }

    @C0376v0(21)
    /* renamed from: androidx.core.os.g$b */
    public static class C17790b {
        @C0373u
        /* renamed from: a */
        public static String m81180a(File file) {
            return Environment.getExternalStorageState(file);
        }
    }

    @C0359n0
    /* renamed from: a */
    public static String m81178a(@C0359n0 File file) {
        return C17790b.m81180a(file);
    }
}
