package androidx.camera.view;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;
import com.google.common.util.concurrent.C32487a;

/* renamed from: androidx.camera.view.e0 */
public final /* synthetic */ class C1785e0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1793i0 f4931a;

    /* renamed from: b */
    public final /* synthetic */ Surface f4932b;

    /* renamed from: c */
    public final /* synthetic */ C32487a f4933c;

    /* renamed from: d */
    public final /* synthetic */ SurfaceRequest f4934d;

    public /* synthetic */ C1785e0(C1793i0 i0Var, Surface surface, C32487a aVar, SurfaceRequest surfaceRequest) {
        this.f4931a = i0Var;
        this.f4932b = surface;
        this.f4933c = aVar;
        this.f4934d = surfaceRequest;
    }

    public final void run() {
        this.f4931a.m7167q(this.f4932b, this.f4933c, this.f4934d);
    }
}
