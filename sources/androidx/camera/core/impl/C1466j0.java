package androidx.camera.core.impl;

import android.os.Build;
import androidx.annotation.C0359n0;
import com.google.auto.value.C32455c;

@C32455c
/* renamed from: androidx.camera.core.impl.j0 */
public abstract class C1466j0 {
    @C0359n0
    /* renamed from: a */
    public static C1466j0 m6147a() {
        return m6148b(Build.MANUFACTURER, Build.MODEL, Build.VERSION.SDK_INT);
    }

    @C0359n0
    /* renamed from: b */
    public static C1466j0 m6148b(@C0359n0 String str, @C0359n0 String str2, int i) {
        return new C1439c(str, str2, i);
    }

    @C0359n0
    /* renamed from: c */
    public abstract String mo5196c();

    @C0359n0
    /* renamed from: d */
    public abstract String mo5197d();

    /* renamed from: e */
    public abstract int mo5198e();
}
