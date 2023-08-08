package androidx.camera.core;

import android.util.Size;
import androidx.annotation.C0359n0;
import androidx.camera.core.C1353a2;
import java.nio.ByteBuffer;

public final class ImageProxyDownsampler {

    public enum DownsamplingMethod {
        NEAREST_NEIGHBOR,
        AVERAGING
    }

    /* renamed from: androidx.camera.core.ImageProxyDownsampler$a */
    public class C1331a implements C1353a2.C1354a {

        /* renamed from: a */
        public final ByteBuffer f3833a;

        /* renamed from: b */
        public final /* synthetic */ byte[] f3834b;

        /* renamed from: c */
        public final /* synthetic */ int f3835c;

        /* renamed from: d */
        public final /* synthetic */ int f3836d;

        public C1331a(byte[] bArr, int i, int i2) {
            this.f3834b = bArr;
            this.f3835c = i;
            this.f3836d = i2;
            this.f3833a = ByteBuffer.wrap(bArr);
        }

        @C0359n0
        /* renamed from: e */
        public ByteBuffer mo4906e() {
            return this.f3833a;
        }

        /* renamed from: f */
        public int mo4907f() {
            return this.f3835c;
        }

        /* renamed from: g */
        public int mo4908g() {
            return this.f3836d;
        }
    }

    /* renamed from: androidx.camera.core.ImageProxyDownsampler$b */
    public static /* synthetic */ class C1332b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3837a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod[] r0 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f3837a = r0
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod r1 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.NEAREST_NEIGHBOR     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f3837a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.camera.core.ImageProxyDownsampler$DownsamplingMethod r1 = androidx.camera.core.ImageProxyDownsampler.DownsamplingMethod.AVERAGING     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.ImageProxyDownsampler.C1332b.<clinit>():void");
        }
    }

    /* renamed from: androidx.camera.core.ImageProxyDownsampler$c */
    public static final class C1333c extends C1663p0 {

        /* renamed from: c */
        public final C1353a2.C1354a[] f3838c;

        /* renamed from: d */
        public final int f3839d;

        /* renamed from: e */
        public final int f3840e;

        public C1333c(C1353a2 a2Var, C1353a2.C1354a[] aVarArr, int i, int i2) {
            super(a2Var);
            this.f3838c = aVarArr;
            this.f3839d = i;
            this.f3840e = i2;
        }

        public synchronized int getHeight() {
            return this.f3840e;
        }

        public synchronized int getWidth() {
            return this.f3839d;
        }

        @C0359n0
        /* renamed from: o2 */
        public synchronized C1353a2.C1354a[] mo4911o2() {
            return this.f3838c;
        }
    }

    /* renamed from: a */
    public static C1353a2.C1354a m5577a(int i, int i2, byte[] bArr) {
        return new C1331a(bArr, i, i2);
    }

    /* renamed from: b */
    public static C1663p0 m5578b(C1353a2 a2Var, int i, int i2, DownsamplingMethod downsamplingMethod) {
        byte[] bArr;
        C1353a2 a2Var2 = a2Var;
        int i3 = i;
        int i4 = i2;
        if (a2Var.getFormat() != 35) {
            throw new UnsupportedOperationException("Only YUV_420_888 format is currently supported.");
        } else if (a2Var.getWidth() < i3 || a2Var.getHeight() < i4) {
            throw new IllegalArgumentException("Downsampled dimension " + new Size(i3, i4) + " is not <= original dimension " + new Size(a2Var.getWidth(), a2Var.getHeight()) + ".");
        } else if (a2Var.getWidth() == i3 && a2Var.getHeight() == i4) {
            return new C1333c(a2Var2, a2Var.mo4911o2(), i3, i4);
        } else {
            int[] iArr = {a2Var.getWidth(), a2Var.getWidth() / 2, a2Var.getWidth() / 2};
            int[] iArr2 = {a2Var.getHeight(), a2Var.getHeight() / 2, a2Var.getHeight() / 2};
            int i5 = i3 / 2;
            int[] iArr3 = {i3, i5, i5};
            int i6 = i4 / 2;
            int[] iArr4 = {i4, i6, i6};
            C1353a2.C1354a[] aVarArr = new C1353a2.C1354a[3];
            for (int i7 = 0; i7 < 3; i7++) {
                C1353a2.C1354a aVar = a2Var.mo4911o2()[i7];
                ByteBuffer e = aVar.mo4906e();
                byte[] bArr2 = new byte[(iArr3[i7] * iArr4[i7])];
                int i8 = C1332b.f3837a[downsamplingMethod.ordinal()];
                if (i8 == 1) {
                    bArr = bArr2;
                    m5580d(e, iArr[i7], aVar.mo4908g(), aVar.mo4907f(), iArr2[i7], bArr, iArr3[i7], iArr4[i7]);
                } else if (i8 != 2) {
                    bArr = bArr2;
                } else {
                    int i9 = iArr[i7];
                    int g = aVar.mo4908g();
                    bArr = bArr2;
                    m5579c(e, i9, g, aVar.mo4907f(), iArr2[i7], bArr, iArr3[i7], iArr4[i7]);
                }
                aVarArr[i7] = m5577a(iArr3[i7], 1, bArr);
            }
            return new C1333c(a2Var2, aVarArr, i3, i4);
        }
    }

    /* renamed from: c */
    public static void m5579c(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        ByteBuffer byteBuffer2 = byteBuffer;
        int i7 = i3;
        int i8 = i4;
        int i9 = i5;
        int i10 = i6;
        float f = ((float) i) / ((float) i9);
        float f2 = ((float) i8) / ((float) i10);
        byte[] bArr2 = new byte[i7];
        byte[] bArr3 = new byte[i7];
        int[] iArr = new int[i9];
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            iArr[i12] = ((int) (((float) i12) * f)) * i2;
        }
        synchronized (byteBuffer) {
            byteBuffer.rewind();
            int i13 = 0;
            while (i13 < i10) {
                int i14 = (int) (((float) i13) * f2);
                int i15 = i8 - 1;
                int i16 = i13 * i9;
                byteBuffer2.position(Math.min(i14, i15) * i7);
                byteBuffer2.get(bArr2, i11, Math.min(i7, byteBuffer.remaining()));
                byteBuffer2.position(Math.min(i14 + 1, i15) * i7);
                byteBuffer2.get(bArr3, i11, Math.min(i7, byteBuffer.remaining()));
                for (int i17 = i11; i17 < i9; i17++) {
                    int i18 = iArr[i17];
                    bArr[i16 + i17] = (byte) ((((((bArr2[i18] & 255) + (bArr2[i18 + i2] & 255)) + (bArr3[i18] & 255)) + (bArr3[i18 + i2] & 255)) / 4) & 255);
                }
                i13++;
                i11 = 0;
            }
        }
    }

    /* renamed from: d */
    public static void m5580d(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, byte[] bArr, int i5, int i6) {
        float f = ((float) i) / ((float) i5);
        float f2 = ((float) i4) / ((float) i6);
        byte[] bArr2 = new byte[i3];
        int[] iArr = new int[i5];
        for (int i7 = 0; i7 < i5; i7++) {
            iArr[i7] = ((int) (((float) i7) * f)) * i2;
        }
        synchronized (byteBuffer) {
            byteBuffer.rewind();
            for (int i8 = 0; i8 < i6; i8++) {
                int i9 = i8 * i5;
                byteBuffer.position(Math.min((int) (((float) i8) * f2), i4 - 1) * i3);
                byteBuffer.get(bArr2, 0, Math.min(i3, byteBuffer.remaining()));
                for (int i10 = 0; i10 < i5; i10++) {
                    bArr[i9 + i10] = bArr2[iArr[i10]];
                }
            }
        }
    }
}
