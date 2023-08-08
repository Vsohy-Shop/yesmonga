package com.carrefour.fid.android.widget;

import android.content.Context;
import android.hardware.Camera;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.shared.util.C28935i;
import com.google.firebase.crashlytics.internal.analytics.C32659d;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J(\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016J\u0018\u0010\u0011\u001a\u00060\u0010R\u00020\u000e2\n\u0010\u000f\u001a\u00060\rR\u00020\u000eH\u0002J\u0018\u0010\u0012\u001a\u00060\u0010R\u00020\u000e2\n\u0010\u000f\u001a\u00060\rR\u00020\u000eH\u0002J\u001e\u0010\u0015\u001a\u00060\u0010R\u00020\u000e2\u0010\u0010\u0014\u001a\f\u0012\b\u0012\u00060\u0010R\u00020\u000e0\u0013H\u0002R\u0014\u0010\u0017\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00038\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018¨\u0006\u001e"}, mo22516d2 = {"Lcom/carrefour/fid/android/widget/CameraPreview;", "Landroid/view/SurfaceView;", "Landroid/view/SurfaceHolder$Callback;", "Landroid/view/SurfaceHolder;", "holder", "Lkotlin/d2;", "surfaceCreated", "surfaceDestroyed", "", "format", "w", "h", "surfaceChanged", "Landroid/hardware/Camera$Parameters;", "Landroid/hardware/Camera;", "parameters", "Landroid/hardware/Camera$Size;", "b", "a", "", "sizes", "c", "Landroid/hardware/Camera;", "mCamera", "Landroid/view/SurfaceHolder;", "mHolder", "Landroid/content/Context;", "mContext", "<init>", "(Landroid/content/Context;Landroid/hardware/Camera;)V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C8567o(parameters = 0)
public final class CameraPreview extends SurfaceView implements SurfaceHolder.Callback {

    /* renamed from: c */
    public static final int f58405c = 8;
    @C12579k

    /* renamed from: a */
    public final Camera f58406a;
    @C12579k

    /* renamed from: b */
    public final SurfaceHolder f58407b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CameraPreview(@C12579k Context context, @C12579k Camera camera) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "mContext");
        Intrinsics.checkNotNullParameter(camera, "mCamera");
        this.f58406a = camera;
        SurfaceHolder holder = getHolder();
        Intrinsics.checkNotNullExpressionValue(holder, "holder");
        this.f58407b = holder;
        holder.addCallback(this);
        holder.setType(3);
    }

    /* renamed from: a */
    public final Camera.Size mo67291a(Camera.Parameters parameters) {
        List<Camera.Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
        Intrinsics.checkNotNullExpressionValue(supportedPictureSizes, "sizes");
        return mo67293c(supportedPictureSizes);
    }

    /* renamed from: b */
    public final Camera.Size mo67292b(Camera.Parameters parameters) {
        List<Camera.Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
        Intrinsics.checkNotNullExpressionValue(supportedPreviewSizes, "sizes");
        return mo67293c(supportedPreviewSizes);
    }

    /* renamed from: c */
    public final Camera.Size mo67293c(List<? extends Camera.Size> list) {
        boolean z;
        boolean z2;
        long maxMemory = Runtime.getRuntime().maxMemory() - (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        Iterator<? extends Camera.Size> it = list.iterator();
        Camera.Size size = null;
        while (true) {
            boolean z3 = false;
            if (!it.hasNext()) {
                break;
            }
            Camera.Size size2 = (Camera.Size) it.next();
            int i = size2.width;
            int i2 = size2.height;
            long j = (long) (i * i2 * 4 * 4);
            if (i / 4 == i2 / 3) {
                z = true;
            } else {
                z = false;
            }
            if (size == null || i > size.width) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (j < maxMemory) {
                z3 = true;
            }
            if (z && z2 && z3) {
                size = size2;
            }
        }
        if (size == null) {
            return (Camera.Size) list.get(0);
        }
        return size;
    }

    public void surfaceChanged(@C12579k SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Intrinsics.checkNotNullParameter(surfaceHolder, "holder");
        if (this.f58407b.getSurface() != null) {
            try {
                this.f58406a.stopPreview();
            } catch (Exception e) {
                C28935i iVar = C28935i.f70940a;
                String message = e.getMessage();
                C28935i.m119704b(iVar, "Error stop camera preview: " + message, (Throwable) null, 0, 6, (Object) null);
            }
            try {
                Camera.Parameters parameters = this.f58406a.getParameters();
                Intrinsics.checkNotNullExpressionValue(parameters, C32659d.f79228c);
                parameters.setPreviewSize(mo67292b(parameters).width, mo67292b(parameters).height);
                parameters.setPictureSize(mo67291a(parameters).width, mo67291a(parameters).height);
                this.f58406a.setParameters(parameters);
                this.f58406a.setDisplayOrientation(90);
                this.f58406a.setPreviewDisplay(this.f58407b);
                this.f58406a.startPreview();
                C22840a.m103116a(this.f58406a);
            } catch (Exception e2) {
                C28935i iVar2 = C28935i.f70940a;
                String message2 = e2.getMessage();
                C28935i.m119704b(iVar2, "Error starting camera preview: " + message2, (Throwable) null, 0, 6, (Object) null);
            }
        }
    }

    public void surfaceCreated(@C12579k SurfaceHolder surfaceHolder) {
        Intrinsics.checkNotNullParameter(surfaceHolder, "holder");
    }

    public void surfaceDestroyed(@C12579k SurfaceHolder surfaceHolder) {
        Intrinsics.checkNotNullParameter(surfaceHolder, "holder");
    }
}
