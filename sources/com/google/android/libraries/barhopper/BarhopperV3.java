package com.google.android.libraries.barhopper;

import android.graphics.Bitmap;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39056u1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.C39101z1;
import com.google.android.gms.internal.mlkit_vision_barcode_bundled.zzep;
import com.google.barhopper.deeplearning.C32459a;
import com.google.photos.vision.barhopper.C34106a;
import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;

public class BarhopperV3 implements Closeable {

    /* renamed from: b */
    public static final long f74352b = 0;

    /* renamed from: c */
    public static final String f74353c = "BarhopperV3";

    /* renamed from: a */
    public long f74354a;

    public BarhopperV3() {
        System.loadLibrary("barhopper_v3");
    }

    private native void closeNative(long j);

    private native long createNative();

    private native long createNativeWithClientOptions(byte[] bArr);

    /* renamed from: j */
    public static C34106a m124591j(byte[] bArr) {
        try {
            return C34106a.m137067C(bArr, C39101z1.m160998a());
        } catch (zzep e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(valueOf.length() + 49);
            sb.append("Received unexpected BarhopperResponse buffer: {0}");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    private native byte[] recognizeBitmapNative(long j, Bitmap bitmap, RecognitionOptions recognitionOptions);

    private native byte[] recognizeBufferNative(long j, int i, int i2, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeNative(long j, int i, int i2, byte[] bArr, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedBufferNative(long j, int i, int i2, int i3, ByteBuffer byteBuffer, RecognitionOptions recognitionOptions);

    private native byte[] recognizeStridedNative(long j, int i, int i2, int i3, byte[] bArr, RecognitionOptions recognitionOptions);

    /* renamed from: a */
    public void mo87769a() {
        if (this.f74354a == 0) {
            long createNative = createNative();
            this.f74354a = createNative;
            if (createNative == 0) {
                throw new IllegalStateException("Failed to create native context.");
            }
        }
    }

    /* renamed from: b */
    public void mo87770b(@RecentlyNonNull C32459a aVar) {
        if (this.f74354a == 0) {
            try {
                byte[] bArr = new byte[aVar.mo122992x()];
                C39056u1 f = C39056u1.m160860f(bArr);
                aVar.mo122984e(f);
                f.mo123059g();
                long createNativeWithClientOptions = createNativeWithClientOptions(bArr);
                this.f74354a = createNativeWithClientOptions;
                if (createNativeWithClientOptions == 0) {
                    throw new IllegalArgumentException("Failed to create native context with client options.");
                }
            } catch (IOException e) {
                String name = aVar.getClass().getName();
                StringBuilder sb = new StringBuilder(name.length() + 72);
                sb.append("Serializing ");
                sb.append(name);
                sb.append(" to a byte array threw an IOException (should never happen).");
                throw new RuntimeException(sb.toString(), e);
            }
        }
    }

    @RecentlyNonNull
    /* renamed from: c */
    public C34106a mo87771c(int i, int i2, int i3, @RecentlyNonNull ByteBuffer byteBuffer, @RecentlyNonNull RecognitionOptions recognitionOptions) {
        long j = this.f74354a;
        if (j != 0) {
            return m124591j(recognizeStridedBufferNative(j, i, i2, i3, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public void close() {
        long j = this.f74354a;
        if (j != 0) {
            closeNative(j);
            this.f74354a = 0;
        }
    }

    @RecentlyNonNull
    /* renamed from: d */
    public C34106a mo87773d(int i, int i2, int i3, @RecentlyNonNull byte[] bArr, @RecentlyNonNull RecognitionOptions recognitionOptions) {
        long j = this.f74354a;
        if (j != 0) {
            return m124591j(recognizeStridedNative(j, i, i2, i3, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @RecentlyNonNull
    /* renamed from: f */
    public C34106a mo87774f(int i, int i2, @RecentlyNonNull ByteBuffer byteBuffer, @RecentlyNonNull RecognitionOptions recognitionOptions) {
        long j = this.f74354a;
        if (j != 0) {
            return m124591j(recognizeBufferNative(j, i, i2, byteBuffer, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    public void finalize() throws Throwable {
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @RecentlyNonNull
    /* renamed from: g */
    public C34106a mo87776g(int i, int i2, @RecentlyNonNull byte[] bArr, @RecentlyNonNull RecognitionOptions recognitionOptions) {
        long j = this.f74354a;
        if (j != 0) {
            return m124591j(recognizeNative(j, i, i2, bArr, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }

    @RecentlyNonNull
    /* renamed from: i */
    public C34106a mo87777i(@RecentlyNonNull Bitmap bitmap, @RecentlyNonNull RecognitionOptions recognitionOptions) {
        long j = this.f74354a;
        if (j != 0) {
            return m124591j(recognizeBitmapNative(j, bitmap, recognitionOptions));
        }
        throw new IllegalStateException("Native context does not exist.");
    }
}
