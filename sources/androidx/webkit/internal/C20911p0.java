package androidx.webkit.internal;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import androidx.annotation.C0373u;
import androidx.annotation.C0376v0;

@C0376v0(33)
/* renamed from: androidx.webkit.internal.p0 */
public class C20911p0 {
    @C0373u
    /* renamed from: a */
    public static ServiceInfo m96941a(PackageManager packageManager, ComponentName componentName, PackageManager.ComponentInfoFlags componentInfoFlags) throws PackageManager.NameNotFoundException {
        return packageManager.getServiceInfo(componentName, componentInfoFlags);
    }

    @C0373u
    /* renamed from: b */
    public static PackageManager.ComponentInfoFlags m96942b(long j) {
        return PackageManager.ComponentInfoFlags.of(j);
    }
}
