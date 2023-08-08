package com.google.mlkit.vision.common.internal;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import androidx.annotation.C0359n0;
import androidx.annotation.C0376v0;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.common.internal.C40843u;
import com.google.android.gms.common.util.C40974d0;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.vision.common.C34025b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

@C40473a
/* renamed from: com.google.mlkit.vision.common.internal.e */
public class C34035e {

    /* renamed from: a */
    public static final C34035e f82674a = new C34035e();

    @RecentlyNonNull
    @C40473a
    /* renamed from: a */
    public static ByteBuffer m136929a(@RecentlyNonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return byteBuffer;
        }
        byteBuffer.rewind();
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        return ByteBuffer.wrap(bArr);
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: g */
    public static C34035e m136930g() {
        return f82674a;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: k */
    public static Bitmap m136931k(@RecentlyNonNull ByteBuffer byteBuffer, int i, int i2, int i3) throws MlKitException {
        byte[] n = m136934n(m136932l(byteBuffer, true).array(), i, i2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(n, 0, n.length);
        return m136933m(decodeByteArray, i3, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    @RecentlyNonNull
    @C40473a
    @C40974d0
    /* renamed from: l */
    public static ByteBuffer m136932l(@RecentlyNonNull ByteBuffer byteBuffer, boolean z) {
        ByteBuffer byteBuffer2;
        int i;
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        int i2 = limit / 6;
        if (z) {
            byteBuffer2 = ByteBuffer.allocate(limit);
        } else {
            byteBuffer2 = ByteBuffer.allocateDirect(limit);
        }
        int i3 = 0;
        while (true) {
            i = i2 * 4;
            if (i3 >= i) {
                break;
            }
            byteBuffer2.put(i3, byteBuffer.get(i3));
            i3++;
        }
        for (int i4 = 0; i4 < i2 + i2; i4++) {
            byteBuffer2.put(i + i4, byteBuffer.get(((i4 % 2) * i2) + i + (i4 / 2)));
        }
        return byteBuffer2;
    }

    /* renamed from: m */
    public static Bitmap m136933m(Bitmap bitmap, int i, int i2, int i3) {
        if (i == 0) {
            return Bitmap.createBitmap(bitmap, 0, 0, i2, i3);
        }
        Matrix matrix = new Matrix();
        matrix.postRotate((float) i);
        return Bitmap.createBitmap(bitmap, 0, 0, i2, i3, matrix, true);
    }

    /* renamed from: n */
    public static byte[] m136934n(@C0359n0 byte[] bArr, int i, int i2) throws MlKitException {
        ByteArrayOutputStream byteArrayOutputStream;
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, (int[]) null);
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            yuvImage.compressToJpeg(new Rect(0, 0, i, i2), 100, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (IOException unused) {
            throw new MlKitException("Image conversion error from NV21 format", 13);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    @TargetApi(19)
    /* renamed from: o */
    public static final void m136935o(Image.Plane plane, int i, int i2, byte[] bArr, int i3, int i4) {
        ByteBuffer buffer = plane.getBuffer();
        buffer.rewind();
        int limit = ((buffer.limit() + plane.getRowStride()) - 1) / plane.getRowStride();
        if (limit != 0) {
            int i5 = i / (i2 / limit);
            int i6 = 0;
            for (int i7 = 0; i7 < limit; i7++) {
                int i8 = i6;
                for (int i9 = 0; i9 < i5; i9++) {
                    bArr[i3] = buffer.get(i8);
                    i3 += i4;
                    i8 += plane.getPixelStride();
                }
                i6 += plane.getRowStride();
            }
        }
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: b */
    public byte[] mo98980b(@RecentlyNonNull ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            return byteBuffer.array();
        }
        byteBuffer.rewind();
        int limit = byteBuffer.limit();
        byte[] bArr = new byte[limit];
        byteBuffer.get(bArr, 0, limit);
        return bArr;
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: c */
    public ByteBuffer mo98981c(@RecentlyNonNull ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        C40843u.m166202l(byteBuffer);
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        if (byteBuffer.isDirect()) {
            byteBuffer2 = ByteBuffer.allocateDirect(capacity);
        } else {
            byteBuffer2 = ByteBuffer.allocate(capacity);
        }
        byteBuffer2.limit(byteBuffer.limit());
        byteBuffer2.put((ByteBuffer) byteBuffer.rewind());
        byteBuffer2.position(position);
        byteBuffer.position(position);
        return byteBuffer2;
    }

    @C40473a
    @C0359n0
    @C0376v0(19)
    /* renamed from: d */
    public Bitmap mo98982d(@RecentlyNonNull Image image, int i) {
        boolean z;
        if (image.getFormat() == 256) {
            z = true;
        } else {
            z = false;
        }
        C40843u.m166192b(z, "Only JPEG and YUV_420_888 are supported now");
        Image.Plane[] planes = image.getPlanes();
        if (planes == null || planes.length != 1) {
            throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
        }
        ByteBuffer buffer = planes[0].getBuffer();
        buffer.rewind();
        int remaining = buffer.remaining();
        byte[] bArr = new byte[remaining];
        buffer.get(bArr);
        return m136933m(BitmapFactory.decodeByteArray(bArr, 0, remaining), i, image.getWidth(), image.getHeight());
    }

    @C40473a
    @C0359n0
    /* renamed from: e */
    public ByteBuffer mo98983e(@RecentlyNonNull C34025b bVar, boolean z) throws MlKitException {
        ByteBuffer byteBuffer;
        boolean z2 = z;
        int h = bVar.mo98958h();
        if (h == -1) {
            Bitmap bitmap = (Bitmap) C40843u.m166202l(bVar.mo98956f());
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            int ceil = (int) Math.ceil(((double) height) / 2.0d);
            int ceil2 = ((ceil + ceil) * ((int) Math.ceil(((double) width) / 2.0d))) + i;
            if (z2) {
                byteBuffer = ByteBuffer.allocate(ceil2);
            } else {
                byteBuffer = ByteBuffer.allocateDirect(ceil2);
            }
            int i2 = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < height; i4++) {
                int i5 = 0;
                while (i5 < width) {
                    int i6 = iArr[i2];
                    int i7 = (i6 >> 16) & 255;
                    int i8 = (i6 >> 8) & 255;
                    int i9 = i6 & 255;
                    int i10 = (((((i7 * -38) - (i8 * 74)) + (i9 * 112)) + 128) >> 8) + 128;
                    int i11 = (((((i7 * 112) - (i8 * 94)) - (i9 * 18)) + 128) >> 8) + 128;
                    int i12 = i3 + 1;
                    byteBuffer.put(i3, (byte) Math.min(255, (((((i7 * 66) + (i8 * 129)) + (i9 * 25)) + 128) >> 8) + 16));
                    if (i4 % 2 == 0 && i2 % 2 == 0) {
                        int i13 = i + 1;
                        byteBuffer.put(i, (byte) Math.min(255, i11));
                        i = i13 + 1;
                        byteBuffer.put(i13, (byte) Math.min(255, i10));
                    }
                    i2++;
                    i5++;
                    i3 = i12;
                }
            }
            return byteBuffer;
        } else if (h == 17) {
            if (z2) {
                return m136929a((ByteBuffer) C40843u.m166202l(bVar.mo98957g()));
            }
            return (ByteBuffer) C40843u.m166202l(bVar.mo98957g());
        } else if (h == 35) {
            return mo98987j((Image.Plane[]) C40843u.m166202l(bVar.mo98961k()), bVar.mo98963m(), bVar.mo98959i());
        } else if (h == 842094169) {
            return m136932l((ByteBuffer) C40843u.m166202l(bVar.mo98957g()), z2);
        } else {
            throw new MlKitException("Unsupported image format", 13);
        }
    }

    @C40473a
    @C0359n0
    /* renamed from: f */
    public Bitmap mo98984f(@RecentlyNonNull C34025b bVar) throws MlKitException {
        int h = bVar.mo98958h();
        if (h == -1) {
            return m136933m((Bitmap) C40843u.m166202l(bVar.mo98956f()), bVar.mo98962l(), bVar.mo98963m(), bVar.mo98959i());
        }
        if (h == 17) {
            return mo98986i((ByteBuffer) C40843u.m166202l(bVar.mo98957g()), bVar.mo98963m(), bVar.mo98959i(), bVar.mo98962l());
        }
        if (h == 35) {
            return mo98986i(mo98987j((Image.Plane[]) C40843u.m166202l(bVar.mo98961k()), bVar.mo98963m(), bVar.mo98959i()), bVar.mo98963m(), bVar.mo98959i(), bVar.mo98962l());
        }
        if (h == 842094169) {
            return m136931k((ByteBuffer) C40843u.m166202l(bVar.mo98957g()), bVar.mo98963m(), bVar.mo98959i(), bVar.mo98962l());
        }
        throw new MlKitException("Unsupported image format", 13);
    }

    @C40473a
    @C0359n0
    /* renamed from: h */
    public Bitmap mo98985h(@RecentlyNonNull C34025b bVar) throws MlKitException {
        Bitmap f = bVar.mo98956f();
        if (f != null) {
            return m136933m(f, bVar.mo98962l(), bVar.mo98963m(), bVar.mo98959i());
        }
        return mo98984f(bVar);
    }

    @RecentlyNonNull
    @C40473a
    /* renamed from: i */
    public Bitmap mo98986i(@RecentlyNonNull ByteBuffer byteBuffer, int i, int i2, int i3) throws MlKitException {
        byte[] n = m136934n(mo98980b(byteBuffer), i, i2);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(n, 0, n.length);
        return m136933m(decodeByteArray, i3, decodeByteArray.getWidth(), decodeByteArray.getHeight());
    }

    @RecentlyNonNull
    @C40473a
    @C0376v0(19)
    /* renamed from: j */
    public ByteBuffer mo98987j(@RecentlyNonNull Image.Plane[] planeArr, int i, int i2) {
        boolean z;
        int i3 = i * i2;
        int i4 = i3 / 4;
        byte[] bArr = new byte[(i4 + i4 + i3)];
        ByteBuffer buffer = planeArr[1].getBuffer();
        ByteBuffer buffer2 = planeArr[2].getBuffer();
        int position = buffer2.position();
        int limit = buffer.limit();
        buffer2.position(position + 1);
        buffer.limit(limit - 1);
        int i5 = (i3 + i3) / 4;
        if (buffer2.remaining() == i5 - 2 && buffer2.compareTo(buffer) == 0) {
            z = true;
        } else {
            z = false;
        }
        buffer2.position(position);
        buffer.limit(limit);
        if (z) {
            planeArr[0].getBuffer().get(bArr, 0, i3);
            ByteBuffer buffer3 = planeArr[1].getBuffer();
            planeArr[2].getBuffer().get(bArr, i3, 1);
            buffer3.get(bArr, i3 + 1, i5 - 1);
        } else {
            int i6 = i;
            int i7 = i2;
            byte[] bArr2 = bArr;
            m136935o(planeArr[0], i6, i7, bArr2, 0, 1);
            m136935o(planeArr[1], i6, i7, bArr2, i3 + 1, 2);
            m136935o(planeArr[2], i, i2, bArr, i3, 2);
        }
        return ByteBuffer.wrap(bArr);
    }
}
