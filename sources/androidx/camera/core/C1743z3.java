package androidx.camera.core;

import android.media.MediaCodec;

/* renamed from: androidx.camera.core.z3 */
public final /* synthetic */ class C1743z3 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ boolean f4811a;

    /* renamed from: b */
    public final /* synthetic */ MediaCodec f4812b;

    public /* synthetic */ C1743z3(boolean z, MediaCodec mediaCodec) {
        this.f4811a = z;
        this.f4812b = mediaCodec;
    }

    public final void run() {
        C1363b4.m5754Z(this.f4811a, this.f4812b);
    }
}
