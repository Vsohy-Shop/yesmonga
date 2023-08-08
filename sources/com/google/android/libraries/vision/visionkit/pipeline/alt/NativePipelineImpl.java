package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import androidx.annotation.Keep;
import com.google.android.apps.common.proguard.UsedByNative;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29082bk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29665rd;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29746tk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29893xj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29908xy;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye;
import java.nio.ByteBuffer;

class NativePipelineImpl implements C31073a {

    /* renamed from: a */
    public C29908xy f74371a;

    /* renamed from: b */
    public C29893xj f74372b;

    /* renamed from: c */
    public C29082bk f74373c;

    public NativePipelineImpl(C29893xj xjVar, C29082bk bkVar, C29908xy xyVar) {
        this.f74372b = xjVar;
        this.f74373c = bkVar;
        this.f74371a = xyVar;
    }

    public native void close(long j, long j2, long j3, long j4);

    /* renamed from: i */
    public final void mo87815i() {
        this.f74371a = null;
        this.f74372b = null;
        this.f74373c = null;
    }

    public native long initialize(byte[] bArr, long j, long j2, zbc zbc, long j3);

    public native long initializeFrameBufferReleaseCallback(long j);

    public native long initializeFrameManager();

    public native long initializeResultsCallback();

    @UsedByNative("pipeline_jni.cc")
    @Keep
    public void onReleaseAtTimestampUs(long j) {
        this.f74372b.mo84905a(j);
    }

    @UsedByNative("pipeline_jni.cc")
    @Keep
    public void onResult(byte[] bArr) {
        try {
            this.f74373c.mo84535b(C29746tk.m121174y(bArr, this.f74371a));
        } catch (zbye e) {
            C29665rd.f71433b.mo84806a(e, "Error in result from JNI layer", new Object[0]);
        }
    }

    public native byte[] process(long j, long j2, long j3, byte[] bArr, int i, int i2, int i3, int i4);

    public native byte[] processBitmap(long j, long j2, Bitmap bitmap, int i, int i2, int i3, int i4);

    public native byte[] processYuvFrame(long j, long j2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6);

    public native void start(long j) throws PipelineException;

    public native boolean stop(long j);

    public native void waitUntilIdle(long j) throws PipelineException;

    public NativePipelineImpl(String str, C29893xj xjVar, C29082bk bkVar, C29908xy xyVar) {
        this(xjVar, bkVar, xyVar);
        System.loadLibrary("mlkit_ocr_pipeline");
    }
}
