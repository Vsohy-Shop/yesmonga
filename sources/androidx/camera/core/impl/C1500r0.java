package androidx.camera.core.impl;

import android.view.Surface;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.C1353a2;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.impl.r0 */
public interface C1500r0 {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: androidx.camera.core.impl.r0$a */
    public interface C1501a {
        /* renamed from: a */
        void mo4997a(@C0359n0 C1500r0 r0Var);
    }

    @C0363p0
    /* renamed from: a */
    Surface mo5002a();

    @C0363p0
    /* renamed from: c */
    C1353a2 mo5003c();

    void close();

    /* renamed from: d */
    void mo5005d();

    /* renamed from: e */
    int mo5006e();

    /* renamed from: f */
    void mo5007f(@C0359n0 C1501a aVar, @C0359n0 Executor executor);

    @C0363p0
    /* renamed from: g */
    C1353a2 mo5008g();

    int getHeight();

    int getImageFormat();

    int getWidth();
}
