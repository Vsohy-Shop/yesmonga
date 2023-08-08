package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import androidx.camera.camera2.internal.C1254v;

/* renamed from: androidx.camera.camera2.internal.z1 */
public final /* synthetic */ class C1278z1 implements C1254v.C1257c {

    /* renamed from: a */
    public final /* synthetic */ C1036b2 f3650a;

    /* renamed from: b */
    public final /* synthetic */ boolean f3651b;

    /* renamed from: c */
    public final /* synthetic */ MeteringRectangle[] f3652c;

    /* renamed from: d */
    public final /* synthetic */ MeteringRectangle[] f3653d;

    /* renamed from: e */
    public final /* synthetic */ MeteringRectangle[] f3654e;

    public /* synthetic */ C1278z1(C1036b2 b2Var, boolean z, MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3) {
        this.f3650a = b2Var;
        this.f3651b = z;
        this.f3652c = meteringRectangleArr;
        this.f3653d = meteringRectangleArr2;
        this.f3654e = meteringRectangleArr3;
    }

    /* renamed from: a */
    public final boolean mo4229a(TotalCaptureResult totalCaptureResult) {
        return this.f3650a.m4561D(this.f3651b, this.f3652c, this.f3653d, this.f3654e, totalCaptureResult);
    }
}
