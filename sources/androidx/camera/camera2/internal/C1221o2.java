package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.camera2.internal.compat.params.C1122z;
import androidx.camera.core.impl.utils.futures.C1541a;
import com.google.common.util.concurrent.C32487a;
import java.util.List;

/* renamed from: androidx.camera.camera2.internal.o2 */
public final /* synthetic */ class C1221o2 implements C1541a {

    /* renamed from: a */
    public final /* synthetic */ C1230q2 f3503a;

    /* renamed from: b */
    public final /* synthetic */ CameraDevice f3504b;

    /* renamed from: c */
    public final /* synthetic */ C1122z f3505c;

    /* renamed from: d */
    public final /* synthetic */ List f3506d;

    public /* synthetic */ C1221o2(C1230q2 q2Var, CameraDevice cameraDevice, C1122z zVar, List list) {
        this.f3503a = q2Var;
        this.f3504b = cameraDevice;
        this.f3505c = zVar;
        this.f3506d = list;
    }

    public final C32487a apply(Object obj) {
        return this.f3503a.m5085Y(this.f3504b, this.f3505c, this.f3506d, (List) obj);
    }
}
