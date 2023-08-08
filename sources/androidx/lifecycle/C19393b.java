package androidx.lifecycle;

import android.app.Application;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.lifecycle.b */
public class C19393b extends C19476v0 {
    @C12579k

    /* renamed from: a */
    public final Application f49772a;

    public C19393b(@C12579k Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.f49772a = application;
    }

    @C12579k
    /* renamed from: c0 */
    public <T extends Application> T mo57554c0() {
        T t = this.f49772a;
        Intrinsics.checkNotNull(t, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        return t;
    }
}
