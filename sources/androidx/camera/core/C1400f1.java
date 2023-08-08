package androidx.camera.core;

import androidx.camera.core.ImageCapture;
import androidx.camera.core.impl.C1456h;
import androidx.camera.core.impl.utils.futures.C1541a;
import com.google.common.util.concurrent.C32487a;

/* renamed from: androidx.camera.core.f1 */
public final /* synthetic */ class C1400f1 implements C1541a {

    /* renamed from: a */
    public final /* synthetic */ ImageCapture f4055a;

    /* renamed from: b */
    public final /* synthetic */ ImageCapture.C1330w f4056b;

    public /* synthetic */ C1400f1(ImageCapture imageCapture, ImageCapture.C1330w wVar) {
        this.f4055a = imageCapture;
        this.f4056b = wVar;
    }

    public final C32487a apply(Object obj) {
        return this.f4055a.m5389E0(this.f4056b, (C1456h) obj);
    }
}
