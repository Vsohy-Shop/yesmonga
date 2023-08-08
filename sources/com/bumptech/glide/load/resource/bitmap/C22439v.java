package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.C0344h1;
import androidx.annotation.C0363p0;
import androidx.annotation.C0376v0;
import com.bumptech.glide.load.C22139e;
import com.bumptech.glide.load.C22277f;
import com.bumptech.glide.load.DecodeFormat;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.PreferredColorSpace;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.engine.C22270s;
import com.bumptech.glide.load.engine.bitmap_recycle.C22157b;
import com.bumptech.glide.load.engine.bitmap_recycle.C22162e;
import com.bumptech.glide.load.resource.bitmap.C22397c0;
import com.bumptech.glide.load.resource.bitmap.DownsampleStrategy;
import com.bumptech.glide.util.C22628i;
import com.bumptech.glide.util.C22633m;
import com.bumptech.glide.util.C22635o;
import com.carrefour.fid.android.core.extension.C36306e;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.bumptech.glide.load.resource.bitmap.v */
public final class C22439v {

    /* renamed from: f */
    public static final String f57566f = "Downsampler";

    /* renamed from: g */
    public static final C22139e<DecodeFormat> f57567g = C22139e.m100836g("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", DecodeFormat.f56767c);

    /* renamed from: h */
    public static final C22139e<PreferredColorSpace> f57568h = C22139e.m100835f("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    @Deprecated

    /* renamed from: i */
    public static final C22139e<DownsampleStrategy> f57569i = DownsampleStrategy.f57449h;

    /* renamed from: j */
    public static final C22139e<Boolean> f57570j;

    /* renamed from: k */
    public static final C22139e<Boolean> f57571k;

    /* renamed from: l */
    public static final String f57572l = "image/vnd.wap.wbmp";

    /* renamed from: m */
    public static final String f57573m = "image/x-ico";

    /* renamed from: n */
    public static final Set<String> f57574n = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{f57572l, f57573m})));

    /* renamed from: o */
    public static final C22441b f57575o = new C22440a();

    /* renamed from: p */
    public static final Set<ImageHeaderParser.ImageType> f57576p = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));

    /* renamed from: q */
    public static final Queue<BitmapFactory.Options> f57577q = C22635o.m102631f(0);

    /* renamed from: a */
    public final C22162e f57578a;

    /* renamed from: b */
    public final DisplayMetrics f57579b;

    /* renamed from: c */
    public final C22157b f57580c;

    /* renamed from: d */
    public final List<ImageHeaderParser> f57581d;

    /* renamed from: e */
    public final C22395b0 f57582e = C22395b0.m101689d();

    /* renamed from: com.bumptech.glide.load.resource.bitmap.v$a */
    public class C22440a implements C22441b {
        /* renamed from: a */
        public void mo66435a(C22162e eVar, Bitmap bitmap) {
        }

        /* renamed from: b */
        public void mo66436b() {
        }
    }

    /* renamed from: com.bumptech.glide.load.resource.bitmap.v$b */
    public interface C22441b {
        /* renamed from: a */
        void mo66435a(C22162e eVar, Bitmap bitmap) throws IOException;

        /* renamed from: b */
        void mo66436b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f57570j = C22139e.m100836g("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", bool);
        f57571k = C22139e.m100836g("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", bool);
    }

    public C22439v(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, C22162e eVar, C22157b bVar) {
        this.f57581d = list;
        this.f57579b = (DisplayMetrics) C22633m.m102624d(displayMetrics);
        this.f57578a = (C22162e) C22633m.m102624d(eVar);
        this.f57580c = (C22157b) C22633m.m102624d(bVar);
    }

    /* renamed from: A */
    public static int m101842A(double d) {
        return (int) (d + 0.5d);
    }

    @TargetApi(26)
    /* renamed from: B */
    public static void m101843B(BitmapFactory.Options options, C22162e eVar, int i, int i2) {
        Bitmap.Config config;
        if (Build.VERSION.SDK_INT < 26) {
            config = null;
        } else if (options.inPreferredConfig != Bitmap.Config.HARDWARE) {
            config = options.outConfig;
        } else {
            return;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.mo65959g(i, i2, config);
    }

    /* renamed from: a */
    public static int m101844a(double d) {
        int o = m101849o(d);
        int A = m101842A(((double) o) * d);
        return m101842A((d / ((double) (((float) A) / ((float) o)))) * ((double) A));
    }

    /* renamed from: c */
    public static void m101845c(ImageHeaderParser.ImageType imageType, C22397c0 c0Var, C22441b bVar, C22162e eVar, DownsampleStrategy downsampleStrategy, int i, int i2, int i3, int i4, int i5, BitmapFactory.Options options) throws IOException {
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        ImageHeaderParser.ImageType imageType2 = imageType;
        DownsampleStrategy downsampleStrategy2 = downsampleStrategy;
        int i11 = i2;
        int i12 = i3;
        int i13 = i4;
        int i14 = i5;
        BitmapFactory.Options options2 = options;
        if (i11 > 0 && i12 > 0) {
            if (m101852u(i)) {
                i6 = i11;
                i7 = i12;
            } else {
                i7 = i11;
                i6 = i12;
            }
            float b = downsampleStrategy2.mo66378b(i7, i6, i13, i14);
            if (b > 0.0f) {
                DownsampleStrategy.SampleSizeRounding a = downsampleStrategy2.mo66377a(i7, i6, i13, i14);
                if (a != null) {
                    float f = (float) i7;
                    float f2 = (float) i6;
                    int A = i7 / m101842A((double) (b * f));
                    int A2 = i6 / m101842A((double) (b * f2));
                    DownsampleStrategy.SampleSizeRounding sampleSizeRounding = DownsampleStrategy.SampleSizeRounding.MEMORY;
                    if (a == sampleSizeRounding) {
                        i8 = Math.max(A, A2);
                    } else {
                        i8 = Math.min(A, A2);
                    }
                    int max = Math.max(1, Integer.highestOneBit(i8));
                    if (a == sampleSizeRounding && ((float) max) < 1.0f / b) {
                        max <<= 1;
                    }
                    options2.inSampleSize = max;
                    if (imageType2 == ImageHeaderParser.ImageType.JPEG) {
                        float min = (float) Math.min(max, 8);
                        i9 = (int) Math.ceil((double) (f / min));
                        i10 = (int) Math.ceil((double) (f2 / min));
                        int i15 = max / 8;
                        if (i15 > 0) {
                            i9 /= i15;
                            i10 /= i15;
                        }
                    } else if (imageType2 == ImageHeaderParser.ImageType.PNG || imageType2 == ImageHeaderParser.ImageType.PNG_A) {
                        float f3 = (float) max;
                        i9 = (int) Math.floor((double) (f / f3));
                        i10 = (int) Math.floor((double) (f2 / f3));
                    } else if (imageType.isWebp()) {
                        float f4 = (float) max;
                        i9 = Math.round(f / f4);
                        i10 = Math.round(f2 / f4);
                    } else if (i7 % max == 0 && i6 % max == 0) {
                        i9 = i7 / max;
                        i10 = i6 / max;
                    } else {
                        int[] p = m101850p(c0Var, options2, bVar, eVar);
                        i9 = p[0];
                        i10 = p[1];
                    }
                    double b2 = (double) downsampleStrategy2.mo66378b(i9, i10, i13, i14);
                    options2.inTargetDensity = m101844a(b2);
                    options2.inDensity = m101849o(b2);
                    if (m101853v(options)) {
                        options2.inScaled = true;
                    } else {
                        options2.inTargetDensity = 0;
                        options2.inDensity = 0;
                    }
                    if (Log.isLoggable(f57566f, 2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Calculate scaling, source: [");
                        sb.append(i2);
                        sb.append("x");
                        sb.append(i3);
                        sb.append("], degreesToRotate: ");
                        sb.append(i);
                        sb.append(", target: [");
                        sb.append(i13);
                        sb.append("x");
                        sb.append(i14);
                        sb.append("], power of two scaled: [");
                        sb.append(i9);
                        sb.append("x");
                        sb.append(i10);
                        sb.append("], exact scale factor: ");
                        sb.append(b);
                        sb.append(", power of 2 sample size: ");
                        sb.append(max);
                        sb.append(", adjusted scale factor: ");
                        sb.append(b2);
                        sb.append(", target density: ");
                        sb.append(options2.inTargetDensity);
                        sb.append(", density: ");
                        sb.append(options2.inDensity);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("Cannot round with null rounding");
            }
            int i16 = i12;
            int i17 = i11;
            throw new IllegalArgumentException("Cannot scale with factor: " + b + " from: " + downsampleStrategy2 + ", source: [" + i17 + "x" + i16 + "], target: [" + i13 + "x" + i14 + "]");
        } else if (Log.isLoggable(f57566f, 3)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unable to determine dimensions for: ");
            sb2.append(imageType2);
            sb2.append(" with target [");
            sb2.append(i13);
            sb2.append("x");
            sb2.append(i14);
            sb2.append("]");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0047 */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap m101846l(com.bumptech.glide.load.resource.bitmap.C22397c0 r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.C22439v.C22441b r6, com.bumptech.glide.load.engine.bitmap_recycle.C22162e r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto L_0x000a
            r6.mo66436b()
            r4.mo66411b()
        L_0x000a:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.C22419k0.m101802i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.mo66410a(r5)     // Catch:{ IllegalArgumentException -> 0x0025 }
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.C22419k0.m101802i()
            r5.unlock()
            return r4
        L_0x0023:
            r4 = move-exception
            goto L_0x0049
        L_0x0025:
            r3 = move-exception
            java.io.IOException r0 = m101855x(r3, r0, r1, r2, r5)     // Catch:{ all -> 0x0023 }
            java.lang.String r1 = "Downsampler"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)     // Catch:{ all -> 0x0023 }
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x0048
            r7.mo65956d(r1)     // Catch:{ IOException -> 0x0047 }
            r1 = 0
            r5.inBitmap = r1     // Catch:{ IOException -> 0x0047 }
            android.graphics.Bitmap r4 = m101846l(r4, r5, r6, r7)     // Catch:{ IOException -> 0x0047 }
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.C22419k0.m101802i()
            r5.unlock()
            return r4
        L_0x0047:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0048:
            throw r0     // Catch:{ all -> 0x0023 }
        L_0x0049:
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.C22419k0.m101802i()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C22439v.m101846l(com.bumptech.glide.load.resource.bitmap.c0, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.v$b, com.bumptech.glide.load.engine.bitmap_recycle.e):android.graphics.Bitmap");
    }

    @C0363p0
    @TargetApi(19)
    /* renamed from: m */
    public static String m101847m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + (C36306e.f89637a + bitmap.getAllocationByteCount() + ")");
    }

    /* renamed from: n */
    public static synchronized BitmapFactory.Options m101848n() {
        BitmapFactory.Options poll;
        synchronized (C22439v.class) {
            Queue<BitmapFactory.Options> queue = f57577q;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                m101857z(poll);
            }
        }
        return poll;
    }

    /* renamed from: o */
    public static int m101849o(double d) {
        if (d > 1.0d) {
            d = 1.0d / d;
        }
        return (int) Math.round(d * 2.147483647E9d);
    }

    /* renamed from: p */
    public static int[] m101850p(C22397c0 c0Var, BitmapFactory.Options options, C22441b bVar, C22162e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        m101846l(c0Var, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    /* renamed from: q */
    public static String m101851q(BitmapFactory.Options options) {
        return m101847m(options.inBitmap);
    }

    /* renamed from: u */
    public static boolean m101852u(int i) {
        return i == 90 || i == 270;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r1.inDensity;
     */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m101853v(android.graphics.BitmapFactory.Options r1) {
        /*
            int r0 = r1.inTargetDensity
            if (r0 <= 0) goto L_0x000c
            int r1 = r1.inDensity
            if (r1 <= 0) goto L_0x000c
            if (r0 == r1) goto L_0x000c
            r1 = 1
            goto L_0x000d
        L_0x000c:
            r1 = 0
        L_0x000d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C22439v.m101853v(android.graphics.BitmapFactory$Options):boolean");
    }

    /* renamed from: w */
    public static void m101854w(int i, int i2, String str, BitmapFactory.Options options, Bitmap bitmap, int i3, int i4, long j) {
        StringBuilder sb = new StringBuilder();
        sb.append("Decoded ");
        sb.append(m101847m(bitmap));
        sb.append(" from [");
        sb.append(i);
        sb.append("x");
        sb.append(i2);
        sb.append("] ");
        sb.append(str);
        sb.append(" with inBitmap ");
        sb.append(m101851q(options));
        sb.append(" for [");
        sb.append(i3);
        sb.append("x");
        sb.append(i4);
        sb.append("], sample size: ");
        sb.append(options.inSampleSize);
        sb.append(", density: ");
        sb.append(options.inDensity);
        sb.append(", target density: ");
        sb.append(options.inTargetDensity);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        sb.append(", duration: ");
        sb.append(C22628i.m102602a(j));
    }

    /* renamed from: x */
    public static IOException m101855x(IllegalArgumentException illegalArgumentException, int i, int i2, String str, BitmapFactory.Options options) {
        return new IOException("Exception decoding bitmap, outWidth: " + i + ", outHeight: " + i2 + ", outMimeType: " + str + ", inBitmap: " + m101851q(options), illegalArgumentException);
    }

    /* renamed from: y */
    public static void m101856y(BitmapFactory.Options options) {
        m101857z(options);
        Queue<BitmapFactory.Options> queue = f57577q;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    /* renamed from: z */
    public static void m101857z(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    /* renamed from: C */
    public final boolean mo66451C(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    /* renamed from: b */
    public final void mo66452b(C22397c0 c0Var, DecodeFormat decodeFormat, boolean z, boolean z2, BitmapFactory.Options options, int i, int i2) {
        boolean z3;
        Bitmap.Config config;
        if (!this.f57582e.mo66408k(i, i2, options, z, z2)) {
            if (decodeFormat != DecodeFormat.PREFER_ARGB_8888) {
                try {
                    z3 = c0Var.mo66413d().hasAlpha();
                } catch (IOException unused) {
                    if (Log.isLoggable(f57566f, 3)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Cannot determine whether the image has alpha or not from header, format ");
                        sb.append(decodeFormat);
                    }
                    z3 = false;
                }
                if (z3) {
                    config = Bitmap.Config.ARGB_8888;
                } else {
                    config = Bitmap.Config.RGB_565;
                }
                options.inPreferredConfig = config;
                if (config == Bitmap.Config.RGB_565) {
                    options.inDither = true;
                    return;
                }
                return;
            }
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        }
    }

    @C0376v0(21)
    /* renamed from: d */
    public C22270s<Bitmap> mo66453d(ParcelFileDescriptor parcelFileDescriptor, int i, int i2, C22277f fVar) throws IOException {
        return mo66454e(new C22397c0.C22402e(parcelFileDescriptor, this.f57581d, this.f57580c), i, i2, fVar, f57575o);
    }

    /* renamed from: e */
    public final C22270s<Bitmap> mo66454e(C22397c0 c0Var, int i, int i2, C22277f fVar, C22441b bVar) throws IOException {
        boolean z;
        C22277f fVar2 = fVar;
        byte[] bArr = (byte[]) this.f57580c.mo65932c(65536, byte[].class);
        BitmapFactory.Options n = m101848n();
        n.inTempStorage = bArr;
        DecodeFormat decodeFormat = (DecodeFormat) fVar2.mo66232c(f57567g);
        PreferredColorSpace preferredColorSpace = (PreferredColorSpace) fVar2.mo66232c(f57568h);
        DownsampleStrategy downsampleStrategy = (DownsampleStrategy) fVar2.mo66232c(DownsampleStrategy.f57449h);
        boolean booleanValue = ((Boolean) fVar2.mo66232c(f57570j)).booleanValue();
        C22139e eVar = f57571k;
        if (fVar2.mo66232c(eVar) == null || !((Boolean) fVar2.mo66232c(eVar)).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        try {
            return C22411h.m101762e(mo66460k(c0Var, n, downsampleStrategy, decodeFormat, preferredColorSpace, z, i, i2, booleanValue, bVar), this.f57578a);
        } finally {
            m101856y(n);
            this.f57580c.mo65934e(bArr);
        }
    }

    /* renamed from: f */
    public C22270s<Bitmap> mo66455f(InputStream inputStream, int i, int i2, C22277f fVar) throws IOException {
        return mo66456g(inputStream, i, i2, fVar, f57575o);
    }

    /* renamed from: g */
    public C22270s<Bitmap> mo66456g(InputStream inputStream, int i, int i2, C22277f fVar, C22441b bVar) throws IOException {
        return mo66454e(new C22397c0.C22401d(inputStream, this.f57581d, this.f57580c), i, i2, fVar, bVar);
    }

    /* renamed from: h */
    public C22270s<Bitmap> mo66457h(ByteBuffer byteBuffer, int i, int i2, C22277f fVar) throws IOException {
        return mo66454e(new C22397c0.C22399b(byteBuffer, this.f57581d, this.f57580c), i, i2, fVar, f57575o);
    }

    @C0344h1
    /* renamed from: i */
    public void mo66458i(File file, int i, int i2, C22277f fVar) throws IOException {
        mo66454e(new C22397c0.C22400c(file, this.f57581d, this.f57580c), i, i2, fVar, f57575o);
    }

    @C0344h1
    /* renamed from: j */
    public void mo66459j(byte[] bArr, int i, int i2, C22277f fVar) throws IOException {
        mo66454e(new C22397c0.C22398a(bArr, this.f57581d, this.f57580c), i, i2, fVar, f57575o);
    }

    /* renamed from: k */
    public final Bitmap mo66460k(C22397c0 c0Var, BitmapFactory.Options options, DownsampleStrategy downsampleStrategy, DecodeFormat decodeFormat, PreferredColorSpace preferredColorSpace, boolean z, int i, int i2, boolean z2, C22441b bVar) throws IOException {
        boolean z3;
        int i3;
        int i4;
        int i5;
        String str;
        ColorSpace.Named named;
        int i6;
        int i7;
        float f;
        BitmapFactory.Options options2 = options;
        PreferredColorSpace preferredColorSpace2 = preferredColorSpace;
        C22441b bVar2 = bVar;
        long b = C22628i.m102603b();
        int[] p = m101850p(c0Var, options2, bVar2, this.f57578a);
        boolean z4 = false;
        int i8 = p[0];
        int i9 = p[1];
        String str2 = options2.outMimeType;
        if (i8 == -1 || i9 == -1) {
            z3 = false;
        } else {
            z3 = z;
        }
        int c = c0Var.mo66412c();
        int j = C22419k0.m101803j(c);
        boolean m = C22419k0.m101806m(c);
        int i10 = i;
        if (i10 == Integer.MIN_VALUE) {
            i4 = i2;
            if (m101852u(j)) {
                i3 = i9;
            } else {
                i3 = i8;
            }
        } else {
            i4 = i2;
            i3 = i10;
        }
        if (i4 != Integer.MIN_VALUE) {
            i5 = i4;
        } else if (m101852u(j)) {
            i5 = i8;
        } else {
            i5 = i9;
        }
        ImageHeaderParser.ImageType d = c0Var.mo66413d();
        ImageHeaderParser.ImageType imageType = d;
        int i11 = c;
        m101845c(d, c0Var, bVar, this.f57578a, downsampleStrategy, j, i8, i9, i3, i5, options);
        String str3 = str2;
        int i12 = i9;
        int i13 = i8;
        C22441b bVar3 = bVar2;
        PreferredColorSpace preferredColorSpace3 = preferredColorSpace2;
        BitmapFactory.Options options3 = options2;
        mo66452b(c0Var, decodeFormat, z3, m, options, i3, i5);
        int i14 = Build.VERSION.SDK_INT;
        int i15 = options3.inSampleSize;
        if (mo66451C(imageType)) {
            if (i13 < 0 || i12 < 0 || !z2) {
                if (m101853v(options)) {
                    f = ((float) options3.inTargetDensity) / ((float) options3.inDensity);
                } else {
                    f = 1.0f;
                }
                int i16 = options3.inSampleSize;
                float f2 = (float) i16;
                String str4 = f57566f;
                i7 = Math.round(((float) ((int) Math.ceil((double) (((float) i13) / f2)))) * f);
                i6 = Math.round(((float) ((int) Math.ceil((double) (((float) i12) / f2)))) * f);
                str = str4;
                if (Log.isLoggable(str, 2)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Calculated target [");
                    sb.append(i7);
                    sb.append("x");
                    sb.append(i6);
                    sb.append("] for source [");
                    sb.append(i13);
                    sb.append("x");
                    sb.append(i12);
                    sb.append("], sampleSize: ");
                    sb.append(i16);
                    sb.append(", targetDensity: ");
                    sb.append(options3.inTargetDensity);
                    sb.append(", density: ");
                    sb.append(options3.inDensity);
                    sb.append(", density multiplier: ");
                    sb.append(f);
                }
            } else {
                str = f57566f;
                i7 = i3;
                i6 = i5;
            }
            if (i7 > 0 && i6 > 0) {
                m101843B(options3, this.f57578a, i7, i6);
            }
        } else {
            str = f57566f;
        }
        if (preferredColorSpace3 != null) {
            if (i14 >= 28) {
                if (preferredColorSpace3 == PreferredColorSpace.DISPLAY_P3 && options.outColorSpace != null && options.outColorSpace.isWideGamut()) {
                    z4 = true;
                }
                if (z4) {
                    named = ColorSpace.Named.DISPLAY_P3;
                } else {
                    named = ColorSpace.Named.SRGB;
                }
                options3.inPreferredColorSpace = ColorSpace.get(named);
            } else if (i14 >= 26) {
                options3.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
            }
        }
        Bitmap l = m101846l(c0Var, options3, bVar3, this.f57578a);
        bVar3.mo66435a(this.f57578a, l);
        if (Log.isLoggable(str, 2)) {
            m101854w(i13, i12, str3, options, l, i, i2, b);
        }
        if (l == null) {
            return null;
        }
        l.setDensity(this.f57579b.densityDpi);
        Bitmap o = C22419k0.m101808o(this.f57578a, l, i11);
        if (l.equals(o)) {
            return o;
        }
        this.f57578a.mo65956d(l);
        return o;
    }

    /* renamed from: r */
    public boolean mo66461r(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.m100728c();
    }

    /* renamed from: s */
    public boolean mo66462s(InputStream inputStream) {
        return true;
    }

    /* renamed from: t */
    public boolean mo66463t(ByteBuffer byteBuffer) {
        return true;
    }
}
