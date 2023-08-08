package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29746tk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29893xj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.vision.visionkit.pipeline.alt.b */
public final class C31074b implements C31073a {
    public C31074b(C29893xj xjVar) {
    }

    public final void close(long j, long j2, long j3, long j4) {
    }

    /* renamed from: i */
    public final void mo87815i() {
    }

    public final long initialize(byte[] bArr, long j, long j2, zbc zbc, long j3) {
        return 1;
    }

    public final long initializeFrameBufferReleaseCallback(long j) {
        return 1;
    }

    public final long initializeFrameManager() {
        return 1;
    }

    public final long initializeResultsCallback() {
        return 1;
    }

    public final byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4) {
        return C29746tk.m121173x().mo84805g();
    }

    public final byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4) {
        return C29746tk.m121173x().mo84805g();
    }

    public final byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        return C29746tk.m121173x().mo84805g();
    }

    public final void start(long j) throws PipelineException {
    }

    public final boolean stop(long j) {
        return true;
    }

    public final void waitUntilIdle(long j) throws PipelineException {
    }
}
