package androidx.camera.core;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.C1464j;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.internal.CameraUseCaseAdapter;
import java.util.LinkedHashSet;

/* renamed from: androidx.camera.core.j */
public interface C1624j {
    @C0359n0
    /* renamed from: a */
    CameraControl mo5119a();

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: b */
    C1464j mo5120b();

    @C0359n0
    /* renamed from: c */
    C1641m mo5121c();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    void mo5122d(@C0363p0 C1464j jVar) throws CameraUseCaseAdapter.CameraException;

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    LinkedHashSet<CameraInternal> mo5123e();
}
