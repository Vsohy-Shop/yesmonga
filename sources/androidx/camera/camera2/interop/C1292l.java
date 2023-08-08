package androidx.camera.camera2.interop;

import android.hardware.camera2.CameraCharacteristics;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.internal.C1227q0;
import androidx.camera.core.C1641m;
import androidx.core.util.C18001r;

@C1298p
/* renamed from: androidx.camera.camera2.interop.l */
public final class C1292l {

    /* renamed from: a */
    public final C1227q0 f3679a;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public C1292l(@C0359n0 C1227q0 q0Var) {
        this.f3679a = q0Var;
    }

    @C0359n0
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: a */
    public static CameraCharacteristics m5305a(@C0359n0 C1641m mVar) {
        C18001r.m81778o(mVar instanceof C1227q0, "CameraInfo does not contain any Camera2 information.");
        return ((C1227q0) mVar).mo4604n().mo4324b();
    }

    @C0359n0
    /* renamed from: b */
    public static C1292l m5306b(@C0359n0 C1641m mVar) {
        C18001r.m81765b(mVar instanceof C1227q0, "CameraInfo doesn't contain Camera2 implementation.");
        return ((C1227q0) mVar).mo4603m();
    }

    @C0363p0
    /* renamed from: c */
    public <T> T mo4756c(@C0359n0 CameraCharacteristics.Key<T> key) {
        return this.f3679a.mo4604n().mo4323a(key);
    }

    @C0359n0
    /* renamed from: d */
    public String mo4757d() {
        return this.f3679a.mo4592b();
    }
}
