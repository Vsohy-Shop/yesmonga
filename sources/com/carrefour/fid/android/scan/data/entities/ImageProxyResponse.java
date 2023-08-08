package com.carrefour.fid.android.scan.data.entities;

import androidx.camera.core.C1353a2;
import java.io.Serializable;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, mo22516d2 = {"Lcom/carrefour/fid/android/scan/data/entities/ImageProxyResponse;", "Ljava/io/Serializable;", "Landroidx/camera/core/a2;", "a", "imageProxy", "b", "", "toString", "", "hashCode", "", "other", "", "equals", "Landroidx/camera/core/a2;", "d", "()Landroidx/camera/core/a2;", "<init>", "(Landroidx/camera/core/a2;)V", "scan_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
public final class ImageProxyResponse implements Serializable {
    @C12579k
    private final C1353a2 imageProxy;

    public ImageProxyResponse(@C12579k C1353a2 a2Var) {
        Intrinsics.checkNotNullParameter(a2Var, "imageProxy");
        this.imageProxy = a2Var;
    }

    /* renamed from: c */
    public static /* synthetic */ ImageProxyResponse m118192c(ImageProxyResponse imageProxyResponse, C1353a2 a2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            a2Var = imageProxyResponse.imageProxy;
        }
        return imageProxyResponse.mo82209b(a2Var);
    }

    @C12579k
    /* renamed from: a */
    public final C1353a2 mo82208a() {
        return this.imageProxy;
    }

    @C12579k
    /* renamed from: b */
    public final ImageProxyResponse mo82209b(@C12579k C1353a2 a2Var) {
        Intrinsics.checkNotNullParameter(a2Var, "imageProxy");
        return new ImageProxyResponse(a2Var);
    }

    @C12579k
    /* renamed from: d */
    public final C1353a2 mo82210d() {
        return this.imageProxy;
    }

    public boolean equals(@C12580l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ImageProxyResponse) && Intrinsics.areEqual((Object) this.imageProxy, (Object) ((ImageProxyResponse) obj).imageProxy);
    }

    public int hashCode() {
        return this.imageProxy.hashCode();
    }

    @C12579k
    public String toString() {
        C1353a2 a2Var = this.imageProxy;
        return "ImageProxyResponse(imageProxy=" + a2Var + ")";
    }
}
