package androidx.emoji2.text.flatbuffer;

import com.google.android.material.color.C31234i;
import java.nio.ByteBuffer;
import okio.C12520s0;
import org.joda.time.DateTimeFieldType;

public abstract class Utf8 {

    /* renamed from: a */
    public static Utf8 f48474a;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* renamed from: androidx.emoji2.text.flatbuffer.Utf8$a */
    public static class C19044a {
        /* renamed from: a */
        public static void m89014a(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws IllegalArgumentException {
            if (m89019f(b2) || (((b << C31234i.C31240f.f75184f) + (b2 + 112)) >> 30) != 0 || m89019f(b3) || m89019f(b4)) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            int k = ((b & 7) << DateTimeFieldType.f30605G0) | (m89024k(b2) << 12) | (m89024k(b3) << 6) | m89024k(b4);
            cArr[i] = m89018e(k);
            cArr[i + 1] = m89023j(k);
        }

        /* renamed from: b */
        public static void m89015b(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* renamed from: c */
        public static void m89016c(byte b, byte b2, byte b3, char[] cArr, int i) throws IllegalArgumentException {
            if (m89019f(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m89019f(b3)))) {
                throw new IllegalArgumentException("Invalid UTF-8");
            }
            cArr[i] = (char) (((b & DateTimeFieldType.f30626Z) << 12) | (m89024k(b2) << 6) | m89024k(b3));
        }

        /* renamed from: d */
        public static void m89017d(byte b, byte b2, char[] cArr, int i) throws IllegalArgumentException {
            if (b < -62) {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal leading byte in 2 bytes utf");
            } else if (!m89019f(b2)) {
                cArr[i] = (char) (((b & 31) << 6) | m89024k(b2));
            } else {
                throw new IllegalArgumentException("Invalid UTF-8: Illegal trailing byte in 2 bytes utf");
            }
        }

        /* renamed from: e */
        public static char m89018e(int i) {
            return (char) ((i >>> 10) + C12520s0.f30505d);
        }

        /* renamed from: f */
        public static boolean m89019f(byte b) {
            return b > -65;
        }

        /* renamed from: g */
        public static boolean m89020g(byte b) {
            return b >= 0;
        }

        /* renamed from: h */
        public static boolean m89021h(byte b) {
            return b < -16;
        }

        /* renamed from: i */
        public static boolean m89022i(byte b) {
            return b < -32;
        }

        /* renamed from: j */
        public static char m89023j(int i) {
            return (char) ((i & 1023) + 56320);
        }

        /* renamed from: k */
        public static int m89024k(byte b) {
            return b & C12520s0.f30502a;
        }
    }

    /* renamed from: d */
    public static Utf8 m89009d() {
        if (f48474a == null) {
            f48474a = new Utf8Safe();
        }
        return f48474a;
    }

    /* renamed from: e */
    public static void m89010e(Utf8 utf8) {
        f48474a = utf8;
    }

    /* renamed from: a */
    public abstract String mo56047a(ByteBuffer byteBuffer, int i, int i2);

    /* renamed from: b */
    public abstract void mo56048b(CharSequence charSequence, ByteBuffer byteBuffer);

    /* renamed from: c */
    public abstract int mo56049c(CharSequence charSequence);
}
