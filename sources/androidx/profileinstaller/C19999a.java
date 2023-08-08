package androidx.profileinstaller;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.profileinstaller.ProfileInstallReceiver;
import java.io.File;

/* renamed from: androidx.profileinstaller.a */
public class C19999a {

    @C0376v0(api = 21)
    /* renamed from: androidx.profileinstaller.a$a */
    public static class C20000a {
        /* renamed from: a */
        public static File m92956a(Context context) {
            return context.getCodeCacheDir();
        }
    }

    @C0376v0(api = 24)
    /* renamed from: androidx.profileinstaller.a$b */
    public static class C20001b {
        /* renamed from: a */
        public static File m92957a(Context context) {
            return context.createDeviceProtectedStorageContext().getCodeCacheDir();
        }
    }

    /* renamed from: a */
    public static boolean m92954a(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z = true;
            for (File a : listFiles) {
                if (!m92954a(a) || !z) {
                    z = false;
                } else {
                    z = true;
                }
            }
            return z;
        }
        file.delete();
        return true;
    }

    /* renamed from: b */
    public static void m92955b(@C0359n0 Context context, @C0359n0 ProfileInstallReceiver.C19995a aVar) {
        if (m92954a(C20001b.m92957a(context))) {
            aVar.mo59255a(14, (Object) null);
        } else {
            aVar.mo59255a(15, (Object) null);
        }
    }
}
