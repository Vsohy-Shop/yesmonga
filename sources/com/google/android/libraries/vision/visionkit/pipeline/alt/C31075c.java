package com.google.android.libraries.vision.visionkit.pipeline.alt;

import android.graphics.Bitmap;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29045ak;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29082bk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29154dj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29191ej;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29665rd;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29746tk;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29893xj;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.C29908xy;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbc;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbpl;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbye;
import java.nio.ByteBuffer;

/* renamed from: com.google.android.libraries.vision.visionkit.pipeline.alt.c */
public class C31075c implements C29893xj, C29082bk {

    /* renamed from: a */
    public final C29191ej<C29154dj> f74374a;

    /* renamed from: b */
    public final C31073a f74375b;

    /* renamed from: c */
    public long f74376c;

    /* renamed from: d */
    public final long f74377d;

    /* renamed from: e */
    public final long f74378e;

    /* renamed from: f */
    public final long f74379f;

    /* renamed from: g */
    public final C29908xy f74380g;

    public C31075c(C29045ak akVar, String str) {
        C29908xy b = C29908xy.m121341b();
        b = b == null ? C29908xy.m121340a() : b;
        if (akVar.mo84508C()) {
            this.f74375b = new C31074b(this);
        } else if (akVar.mo84507B()) {
            this.f74375b = new NativePipelineImpl(this, this, b);
        } else {
            this.f74375b = new NativePipelineImpl("mlkit_ocr_pipeline", this, this, b);
        }
        if (akVar.mo84509D()) {
            this.f74374a = new C29191ej<>(akVar.mo84510v());
        } else {
            this.f74374a = new C29191ej<>(10);
        }
        this.f74380g = b;
        long initializeFrameManager = this.f74375b.initializeFrameManager();
        this.f74377d = initializeFrameManager;
        long initializeFrameBufferReleaseCallback = this.f74375b.initializeFrameBufferReleaseCallback(initializeFrameManager);
        this.f74378e = initializeFrameBufferReleaseCallback;
        long initializeResultsCallback = this.f74375b.initializeResultsCallback();
        this.f74379f = initializeResultsCallback;
        this.f74376c = this.f74375b.initialize(akVar.mo84805g(), initializeFrameBufferReleaseCallback, initializeResultsCallback, (zbc) null, 0);
    }

    /* renamed from: a */
    public final void mo84905a(long j) {
        this.f74374a.mo84604a(j);
    }

    /* renamed from: b */
    public final void mo84535b(C29746tk tkVar) {
        C29665rd rdVar = C29665rd.f71433b;
        String valueOf = String.valueOf(tkVar);
        StringBuilder sb = new StringBuilder(valueOf.length() + 27);
        sb.append("Pipeline received results: ");
        sb.append(valueOf);
        rdVar.mo84807b(this, sb.toString(), new Object[0]);
    }

    /* renamed from: c */
    public final zbpl<C29746tk> mo87832c(C29154dj djVar) {
        if (this.f74376c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        } else if (!this.f74374a.mo84605b(djVar, djVar.mo84582a())) {
            return zbpl.m121446d();
        } else {
            byte[] process = this.f74375b.process(this.f74376c, this.f74377d, djVar.mo84582a(), djVar.mo84584c(), djVar.mo84583b().mo84826b(), djVar.mo84583b().mo84825a(), djVar.mo84585d() - 1, djVar.mo84586e() - 1);
            if (process == null) {
                return zbpl.m121446d();
            }
            try {
                return zbpl.m121447e(C29746tk.m121174y(process, this.f74380g));
            } catch (zbye e) {
                throw new IllegalStateException("Could not parse results", e);
            }
        }
    }

    /* renamed from: d */
    public final synchronized void mo87833d() {
        long j = this.f74376c;
        if (j != 0) {
            this.f74375b.stop(j);
            this.f74375b.close(this.f74376c, this.f74377d, this.f74378e, this.f74379f);
            this.f74376c = 0;
            this.f74375b.mo87815i();
        }
    }

    /* renamed from: e */
    public final void mo87834e() throws PipelineException {
        long j = this.f74376c;
        if (j != 0) {
            try {
                this.f74375b.start(j);
                this.f74375b.waitUntilIdle(this.f74376c);
            } catch (PipelineException e) {
                this.f74375b.stop(this.f74376c);
                throw e;
            }
        } else {
            throw new PipelineException(zbd.FAILED_PRECONDITION.ordinal(), "Pipeline has been closed or was not initialized");
        }
    }

    /* renamed from: f */
    public final void mo87835f() {
        long j = this.f74376c;
        if (j == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        } else if (!this.f74375b.stop(j)) {
            throw new IllegalStateException("Pipeline did not stop successfully.");
        }
    }

    /* renamed from: g */
    public final zbpl<C29746tk> mo87836g(long j, Bitmap bitmap, int i) {
        if (this.f74376c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        } else if (bitmap.getConfig() == Bitmap.Config.ARGB_8888) {
            byte[] processBitmap = this.f74375b.processBitmap(this.f74376c, j, bitmap, bitmap.getWidth(), bitmap.getHeight(), 0, i - 1);
            if (processBitmap == null) {
                return zbpl.m121446d();
            }
            try {
                return zbpl.m121447e(C29746tk.m121174y(processBitmap, this.f74380g));
            } catch (zbye e) {
                throw new IllegalStateException("Could not parse results", e);
            }
        } else {
            String valueOf = String.valueOf(bitmap.getConfig());
            StringBuilder sb = new StringBuilder(valueOf.length() + 26);
            sb.append("Unsupported bitmap config ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: h */
    public final zbpl<C29746tk> mo87837h(long j, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.f74376c == 0) {
            throw new IllegalStateException("Pipeline has been closed or was not initialized");
        } else if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalStateException("Byte buffers are not direct.");
        } else {
            byte[] processYuvFrame = this.f74375b.processYuvFrame(this.f74376c, j, byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3, i4, i5, i6 - 1);
            if (processYuvFrame == null) {
                return zbpl.m121446d();
            }
            try {
                return zbpl.m121447e(C29746tk.m121174y(processYuvFrame, this.f74380g));
            } catch (zbye e) {
                throw new IllegalStateException("Could not parse results", e);
            }
        }
    }
}
