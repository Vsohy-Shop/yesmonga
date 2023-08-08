package androidx.camera.core.internal.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.C0337f0;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.camera.core.C1353a2;
import androidx.camera.core.C1417i2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class ImageUtil {

    /* renamed from: a */
    public static final String f4551a = "ImageUtil";

    @C0363p0
    /* renamed from: a */
    public static Rect m6661a(@C0359n0 Size size, @C0359n0 Rational rational) {
        int i;
        if (!m6666f(rational)) {
            C1417i2.m5924n(f4551a, "Invalid view ratio.");
            return null;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        float f = (float) width;
        float f2 = (float) height;
        int numerator = rational.getNumerator();
        int denominator = rational.getDenominator();
        int i2 = 0;
        if (rational.floatValue() > f / f2) {
            int round = Math.round((f / ((float) numerator)) * ((float) denominator));
            int i3 = round;
            i = (height - round) / 2;
            height = i3;
        } else {
            int round2 = Math.round((f2 / ((float) denominator)) * ((float) numerator));
            int i4 = (width - round2) / 2;
            width = round2;
            i = 0;
            i2 = i4;
        }
        return new Rect(i2, i, width + i2, height + i);
    }

    @C0359n0
    /* renamed from: b */
    public static byte[] m6662b(@C0359n0 byte[] bArr, @C0363p0 Rect rect) throws CodecFailedException {
        if (rect == null) {
            return bArr;
        }
        try {
            BitmapRegionDecoder newInstance = BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false);
            Bitmap decodeRegion = newInstance.decodeRegion(rect, new BitmapFactory.Options());
            newInstance.recycle();
            if (decodeRegion != null) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                if (decodeRegion.compress(Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream)) {
                    decodeRegion.recycle();
                    return byteArrayOutputStream.toByteArray();
                }
                throw new CodecFailedException("Encode bitmap failed.", CodecFailedException.FailureType.ENCODE_FAILED);
            }
            throw new CodecFailedException("Decode byte array failed.", CodecFailedException.FailureType.DECODE_FAILED);
        } catch (IllegalArgumentException e) {
            throw new CodecFailedException("Decode byte array failed with illegal argument." + e, CodecFailedException.FailureType.DECODE_FAILED);
        } catch (IOException unused) {
            throw new CodecFailedException("Decode byte array failed.", CodecFailedException.FailureType.DECODE_FAILED);
        }
    }

    @C0359n0
    /* renamed from: c */
    public static Rational m6663c(@C0337f0(from = 0, mo995to = 359) int i, @C0359n0 Rational rational) {
        if (i == 90 || i == 270) {
            return m6665e(rational);
        }
        return new Rational(rational.getNumerator(), rational.getDenominator());
    }

    @C0363p0
    /* renamed from: d */
    public static byte[] m6664d(@C0359n0 C1353a2 a2Var) throws CodecFailedException {
        if (a2Var.getFormat() == 256) {
            return m6669i(a2Var);
        }
        if (a2Var.getFormat() == 35) {
            return m6674n(a2Var);
        }
        C1417i2.m5924n(f4551a, "Unrecognized image format: " + a2Var.getFormat());
        return null;
    }

    /* renamed from: e */
    public static Rational m6665e(Rational rational) {
        if (rational == null) {
            return rational;
        }
        return new Rational(rational.getDenominator(), rational.getNumerator());
    }

    /* renamed from: f */
    public static boolean m6666f(@C0363p0 Rational rational) {
        return rational != null && rational.floatValue() > 0.0f && !rational.isNaN();
    }

    /* renamed from: g */
    public static boolean m6667g(@C0359n0 Size size, @C0363p0 Rational rational) {
        if (rational == null || rational.floatValue() <= 0.0f || !m6668h(size, rational) || rational.isNaN()) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m6668h(Size size, Rational rational) {
        int width = size.getWidth();
        int height = size.getHeight();
        float numerator = (float) rational.getNumerator();
        float denominator = (float) rational.getDenominator();
        if (height == Math.round((((float) width) / numerator) * denominator) && width == Math.round((((float) height) / denominator) * numerator)) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public static byte[] m6669i(C1353a2 a2Var) throws CodecFailedException {
        ByteBuffer e = a2Var.mo4911o2()[0].mo4906e();
        byte[] bArr = new byte[e.capacity()];
        e.rewind();
        e.get(bArr);
        if (m6672l(a2Var)) {
            return m6662b(bArr, a2Var.mo4973I2());
        }
        return bArr;
    }

    /* renamed from: j */
    public static float m6670j(float f, float f2, float f3, float f4) {
        return Math.min(Math.min(f, f2), Math.min(f3, f4));
    }

    /* renamed from: k */
    public static byte[] m6671k(byte[] bArr, int i, int i2, @C0363p0 Rect rect) throws CodecFailedException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, (int[]) null);
        if (rect == null) {
            rect = new Rect(0, 0, i, i2);
        }
        if (yuvImage.compressToJpeg(rect, 100, byteArrayOutputStream)) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new CodecFailedException("YuvImage failed to encode jpeg.", CodecFailedException.FailureType.ENCODE_FAILED);
    }

    /* renamed from: l */
    public static boolean m6672l(C1353a2 a2Var) {
        return !new Size(a2Var.mo4973I2().width(), a2Var.mo4973I2().height()).equals(new Size(a2Var.getWidth(), a2Var.getHeight()));
    }

    @C0359n0
    /* renamed from: m */
    public static float[] m6673m(@C0359n0 Size size) {
        return new float[]{0.0f, 0.0f, (float) size.getWidth(), 0.0f, (float) size.getWidth(), (float) size.getHeight(), 0.0f, (float) size.getHeight()};
    }

    /* renamed from: n */
    public static byte[] m6674n(C1353a2 a2Var) throws CodecFailedException {
        Rect rect;
        byte[] o = m6675o(a2Var);
        int width = a2Var.getWidth();
        int height = a2Var.getHeight();
        if (m6672l(a2Var)) {
            rect = a2Var.mo4973I2();
        } else {
            rect = null;
        }
        return m6671k(o, width, height, rect);
    }

    @C0359n0
    /* renamed from: o */
    public static byte[] m6675o(@C0359n0 C1353a2 a2Var) {
        C1353a2.C1354a aVar = a2Var.mo4911o2()[0];
        C1353a2.C1354a aVar2 = a2Var.mo4911o2()[1];
        C1353a2.C1354a aVar3 = a2Var.mo4911o2()[2];
        ByteBuffer e = aVar.mo4906e();
        ByteBuffer e2 = aVar2.mo4906e();
        ByteBuffer e3 = aVar3.mo4906e();
        e.rewind();
        e2.rewind();
        e3.rewind();
        int remaining = e.remaining();
        byte[] bArr = new byte[(((a2Var.getWidth() * a2Var.getHeight()) / 2) + remaining)];
        int i = 0;
        for (int i2 = 0; i2 < a2Var.getHeight(); i2++) {
            e.get(bArr, i, a2Var.getWidth());
            i += a2Var.getWidth();
            e.position(Math.min(remaining, (e.position() - a2Var.getWidth()) + aVar.mo4907f()));
        }
        int height = a2Var.getHeight() / 2;
        int width = a2Var.getWidth() / 2;
        int f = aVar3.mo4907f();
        int f2 = aVar2.mo4907f();
        int g = aVar3.mo4908g();
        int g2 = aVar2.mo4908g();
        byte[] bArr2 = new byte[f];
        byte[] bArr3 = new byte[f2];
        for (int i3 = 0; i3 < height; i3++) {
            e3.get(bArr2, 0, Math.min(f, e3.remaining()));
            e2.get(bArr3, 0, Math.min(f2, e2.remaining()));
            int i4 = 0;
            int i5 = 0;
            for (int i6 = 0; i6 < width; i6++) {
                int i7 = i + 1;
                bArr[i] = bArr2[i4];
                i = i7 + 1;
                bArr[i7] = bArr3[i5];
                i4 += g;
                i5 += g2;
            }
        }
        return bArr;
    }

    public static final class CodecFailedException extends Exception {
        private FailureType mFailureType;

        public enum FailureType {
            ENCODE_FAILED,
            DECODE_FAILED,
            UNKNOWN
        }

        public CodecFailedException(String str) {
            super(str);
            this.mFailureType = FailureType.UNKNOWN;
        }

        @C0359n0
        /* renamed from: a */
        public FailureType mo5610a() {
            return this.mFailureType;
        }

        public CodecFailedException(String str, FailureType failureType) {
            super(str);
            this.mFailureType = failureType;
        }
    }
}
