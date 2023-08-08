package androidx.camera.core.impl;

import android.os.Handler;
import androidx.annotation.C0359n0;
import com.google.auto.value.C32455c;
import java.util.concurrent.Executor;

@C32455c
/* renamed from: androidx.camera.core.impl.w */
public abstract class C1579w {
    @C0359n0
    /* renamed from: a */
    public static C1579w m6535a(@C0359n0 Executor executor, @C0359n0 Handler handler) {
        return new C1429a(executor, handler);
    }

    @C0359n0
    /* renamed from: b */
    public abstract Executor mo5179b();

    @C0359n0
    /* renamed from: c */
    public abstract Handler mo5180c();
}
