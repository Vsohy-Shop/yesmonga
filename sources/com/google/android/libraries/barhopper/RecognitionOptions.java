package com.google.android.libraries.barhopper;

import androidx.annotation.RecentlyNonNull;
import com.google.android.apps.common.proguard.UsedByNative;

@UsedByNative("jni_common.cc")
public class RecognitionOptions {

    /* renamed from: a */
    public static final int f74355a = 0;

    /* renamed from: b */
    public static final int f74356b = 1;

    /* renamed from: c */
    public static final int f74357c = 2;

    /* renamed from: d */
    public static final int f74358d = 4;

    /* renamed from: e */
    public static final int f74359e = 8;

    /* renamed from: f */
    public static final int f74360f = 16;

    /* renamed from: g */
    public static final int f74361g = 32;

    /* renamed from: h */
    public static final int f74362h = 64;

    /* renamed from: i */
    public static final int f74363i = 128;

    /* renamed from: j */
    public static final int f74364j = 256;

    /* renamed from: k */
    public static final int f74365k = 512;

    /* renamed from: l */
    public static final int f74366l = 1024;

    /* renamed from: m */
    public static final int f74367m = 2048;

    /* renamed from: n */
    public static final int f74368n = 4096;

    /* renamed from: o */
    public static final int f74369o = 16384;

    /* renamed from: p */
    public static final int f74370p = 32768;
    @UsedByNative("jni_common.cc")
    private int barcodeFormats = 0;
    @UsedByNative("jni_common.cc")
    private OnedRecognitionOptions onedRecognitionOptions = new OnedRecognitionOptions();
    @UsedByNative("jni_common.cc")
    private boolean outputUnrecognizedBarcodes = false;

    /* renamed from: a */
    public int mo87808a() {
        return this.barcodeFormats;
    }

    @RecentlyNonNull
    /* renamed from: b */
    public OnedRecognitionOptions mo87809b() {
        return this.onedRecognitionOptions;
    }

    /* renamed from: c */
    public boolean mo87810c() {
        return this.outputUnrecognizedBarcodes;
    }

    /* renamed from: d */
    public void mo87811d(int i) {
        this.barcodeFormats = i;
    }

    /* renamed from: e */
    public void mo87812e(@RecentlyNonNull OnedRecognitionOptions onedRecognitionOptions2) {
        this.onedRecognitionOptions = onedRecognitionOptions2;
    }

    /* renamed from: f */
    public void mo87813f(boolean z) {
        this.outputUnrecognizedBarcodes = z;
    }
}
