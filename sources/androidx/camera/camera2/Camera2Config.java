package androidx.camera.camera2;

import android.content.Context;
import androidx.annotation.C0359n0;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.C1258v0;
import androidx.camera.camera2.internal.C1267x0;
import androidx.camera.core.C1349a0;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.C1473l;
import androidx.camera.core.impl.UseCaseConfigFactory;
import java.util.Set;

public final class Camera2Config {

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final class DefaultProvider implements C1349a0.C1351b {
        @C0359n0
        public C1349a0 getCameraXConfig() {
            return Camera2Config.m4363c();
        }
    }

    @C0359n0
    /* renamed from: c */
    public static C1349a0 m4363c() {
        C0989a aVar = new C0989a();
        C0990b bVar = new C0990b();
        return new C1349a0.C1350a().mo4990i(aVar).mo4991k(bVar).mo4996u(new C0991c()).mo4986b();
    }

    /* renamed from: d */
    public static /* synthetic */ C1473l m4364d(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new C1258v0(context, obj, set);
        } catch (CameraUnavailableException e) {
            throw new InitializationException((Throwable) e);
        }
    }

    /* renamed from: e */
    public static /* synthetic */ UseCaseConfigFactory m4365e(Context context) throws InitializationException {
        return new C1267x0(context);
    }
}
