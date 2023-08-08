package androidx.datastore.preferences.protobuf;

import com.contentsquare.android.api.C14092c;
import com.google.android.material.color.C31234i;
import com.urbanairship.push.notifications.C9527p;
import java.nio.ByteBuffer;
import okio.C12520s0;
import org.joda.time.DateTimeFieldType;

public final class Utf8 {

    /* renamed from: a */
    public static final C18652b f47702a = ((!C18654d.m85254p() || C18712e.m85800c()) ? new C18653c() : new C18654d());

    /* renamed from: b */
    public static final long f47703b = -9187201950435737472L;

    /* renamed from: c */
    public static final int f47704c = 3;

    /* renamed from: d */
    public static final int f47705d = 0;

    /* renamed from: e */
    public static final int f47706e = -1;

    /* renamed from: f */
    public static final int f47707f = 16;

    public static class UnpairedSurrogateException extends IllegalArgumentException {
        public UnpairedSurrogateException(int i, int i2) {
            super("Unpaired surrogate at index " + i + " of " + i2);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Utf8$a */
    public static class C18651a {
        /* renamed from: h */
        public static void m85220h(byte b, byte b2, byte b3, byte b4, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m85225m(b2) || (((b << C31234i.C31240f.f75184f) + (b2 + 112)) >> 30) != 0 || m85225m(b3) || m85225m(b4)) {
                throw InvalidProtocolBufferException.m85087d();
            }
            int r = ((b & 7) << DateTimeFieldType.f30605G0) | (m85230r(b2) << 12) | (m85230r(b3) << 6) | m85230r(b4);
            cArr[i] = m85224l(r);
            cArr[i + 1] = m85229q(r);
        }

        /* renamed from: i */
        public static void m85221i(byte b, char[] cArr, int i) {
            cArr[i] = (char) b;
        }

        /* renamed from: j */
        public static void m85222j(byte b, byte b2, byte b3, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (m85225m(b2) || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || m85225m(b3)))) {
                throw InvalidProtocolBufferException.m85087d();
            }
            cArr[i] = (char) (((b & DateTimeFieldType.f30626Z) << 12) | (m85230r(b2) << 6) | m85230r(b3));
        }

        /* renamed from: k */
        public static void m85223k(byte b, byte b2, char[] cArr, int i) throws InvalidProtocolBufferException {
            if (b < -62 || m85225m(b2)) {
                throw InvalidProtocolBufferException.m85087d();
            }
            cArr[i] = (char) (((b & 31) << 6) | m85230r(b2));
        }

        /* renamed from: l */
        public static char m85224l(int i) {
            return (char) ((i >>> 10) + C12520s0.f30505d);
        }

        /* renamed from: m */
        public static boolean m85225m(byte b) {
            return b > -65;
        }

        /* renamed from: n */
        public static boolean m85226n(byte b) {
            return b >= 0;
        }

        /* renamed from: o */
        public static boolean m85227o(byte b) {
            return b < -16;
        }

        /* renamed from: p */
        public static boolean m85228p(byte b) {
            return b < -32;
        }

        /* renamed from: q */
        public static char m85229q(int i) {
            return (char) ((i & 1023) + 56320);
        }

        /* renamed from: r */
        public static int m85230r(byte b) {
            return b & C12520s0.f30502a;
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Utf8$b */
    public static abstract class C18652b {
        /* renamed from: m */
        public static int m85231m(ByteBuffer byteBuffer, int i, int i2) {
            int e = i + Utf8.m85202m(byteBuffer, i, i2);
            while (e < i2) {
                int i3 = e + 1;
                byte b = byteBuffer.get(e);
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b < -62 || byteBuffer.get(i3) > -65) {
                            return -1;
                        }
                        i3++;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return Utf8.m85206q(byteBuffer, b, i3, i2 - i3);
                        }
                        int i4 = i3 + 1;
                        byte b2 = byteBuffer.get(i3);
                        if (b2 > -65 || ((b == -32 && b2 < -96) || ((b == -19 && b2 >= -96) || byteBuffer.get(i4) > -65))) {
                            return -1;
                        }
                        e = i4 + 1;
                    } else if (i3 >= i2 - 2) {
                        return Utf8.m85206q(byteBuffer, b, i3, i2 - i3);
                    } else {
                        int i5 = i3 + 1;
                        byte b3 = byteBuffer.get(i3);
                        if (b3 <= -65 && (((b << C31234i.C31240f.f75184f) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (byteBuffer.get(i5) <= -65) {
                                i3 = i6 + 1;
                                if (byteBuffer.get(i6) > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                e = i3;
            }
            return 0;
        }

        /* renamed from: a */
        public final String mo54137a(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if (byteBuffer.hasArray()) {
                return mo54138b(byteBuffer.array(), byteBuffer.arrayOffset() + i, i2);
            } else if (byteBuffer.isDirect()) {
                return mo54140d(byteBuffer, i, i2);
            } else {
                return mo54139c(byteBuffer, i, i2);
            }
        }

        /* renamed from: b */
        public abstract String mo54138b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException;

        /* renamed from: c */
        public final String mo54139c(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = byteBuffer.get(r13);
                    if (!C18651a.m85226n(b)) {
                        break;
                    }
                    i = r13 + 1;
                    C18651a.m85221i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = byteBuffer.get(r13);
                    if (C18651a.m85226n(b2)) {
                        int i7 = i5 + 1;
                        C18651a.m85221i(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = byteBuffer.get(i6);
                            if (!C18651a.m85226n(b3)) {
                                break;
                            }
                            i6++;
                            C18651a.m85221i(b3, cArr, i7);
                            i7++;
                        }
                        r13 = i6;
                        i5 = i7;
                    } else if (C18651a.m85228p(b2)) {
                        if (i6 < i3) {
                            C18651a.m85223k(b2, byteBuffer.get(i6), cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m85087d();
                        }
                    } else if (C18651a.m85227o(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C18651a.m85222j(b2, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m85087d();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = byteBuffer.get(i6);
                        int i10 = i9 + 1;
                        C18651a.m85220h(b2, b4, byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                        r13 = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.m85087d();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: d */
        public abstract String mo54140d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException;

        /* renamed from: e */
        public abstract int mo54141e(CharSequence charSequence, byte[] bArr, int i, int i2);

        /* renamed from: f */
        public final void mo54142f(CharSequence charSequence, ByteBuffer byteBuffer) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                byteBuffer.position(Utf8.m85198i(charSequence, byteBuffer.array(), byteBuffer.position() + arrayOffset, byteBuffer.remaining()) - arrayOffset);
            } else if (byteBuffer.isDirect()) {
                mo54144h(charSequence, byteBuffer);
            } else {
                mo54143g(charSequence, byteBuffer);
            }
        }

        /* renamed from: g */
        public final void mo54143g(CharSequence charSequence, ByteBuffer byteBuffer) {
            int i;
            int length = charSequence.length();
            int position = byteBuffer.position();
            int i2 = 0;
            while (i2 < length) {
                try {
                    char charAt = charSequence.charAt(i2);
                    if (charAt >= 128) {
                        break;
                    }
                    byteBuffer.put(position + i2, (byte) charAt);
                    i2++;
                } catch (IndexOutOfBoundsException unused) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1)));
                }
            }
            if (i2 == length) {
                byteBuffer.position(position + i2);
                return;
            }
            position += i2;
            while (i2 < length) {
                char charAt2 = charSequence.charAt(i2);
                if (charAt2 < 128) {
                    byteBuffer.put(position, (byte) charAt2);
                } else if (charAt2 < 2048) {
                    i = position + 1;
                    try {
                        byteBuffer.put(position, (byte) ((charAt2 >>> 6) | C14092c.f34560U));
                        byteBuffer.put(i, (byte) ((charAt2 & '?') | 128));
                        position = i;
                    } catch (IndexOutOfBoundsException unused2) {
                        position = i;
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1)));
                    }
                } else if (charAt2 < 55296 || 57343 < charAt2) {
                    i = position + 1;
                    byteBuffer.put(position, (byte) ((charAt2 >>> 12) | 224));
                    position = i + 1;
                    byteBuffer.put(i, (byte) (((charAt2 >>> 6) & 63) | 128));
                    byteBuffer.put(position, (byte) ((charAt2 & '?') | 128));
                } else {
                    int i3 = i2 + 1;
                    if (i3 != length) {
                        try {
                            char charAt3 = charSequence.charAt(i3);
                            if (Character.isSurrogatePair(charAt2, charAt3)) {
                                int codePoint = Character.toCodePoint(charAt2, charAt3);
                                int i4 = position + 1;
                                try {
                                    byteBuffer.put(position, (byte) ((codePoint >>> 18) | C9527p.f26031b));
                                    position = i4 + 1;
                                    byteBuffer.put(i4, (byte) (((codePoint >>> 12) & 63) | 128));
                                    i4 = position + 1;
                                    byteBuffer.put(position, (byte) (((codePoint >>> 6) & 63) | 128));
                                    byteBuffer.put(i4, (byte) ((codePoint & 63) | 128));
                                    position = i4;
                                    i2 = i3;
                                } catch (IndexOutOfBoundsException unused3) {
                                    position = i4;
                                    i2 = i3;
                                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1)));
                                }
                            } else {
                                i2 = i3;
                            }
                        } catch (IndexOutOfBoundsException unused4) {
                            i2 = i3;
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(i2) + " at index " + (byteBuffer.position() + Math.max(i2, (position - byteBuffer.position()) + 1)));
                        }
                    }
                    throw new UnpairedSurrogateException(i2, length);
                }
                i2++;
                position++;
            }
            byteBuffer.position(position);
        }

        /* renamed from: h */
        public abstract void mo54144h(CharSequence charSequence, ByteBuffer byteBuffer);

        /* renamed from: i */
        public final boolean mo54145i(ByteBuffer byteBuffer, int i, int i2) {
            return mo54147k(0, byteBuffer, i, i2) == 0;
        }

        /* renamed from: j */
        public final boolean mo54146j(byte[] bArr, int i, int i2) {
            return mo54148l(0, bArr, i, i2) == 0;
        }

        /* renamed from: k */
        public final int mo54147k(int i, ByteBuffer byteBuffer, int i2, int i3) {
            if (byteBuffer.hasArray()) {
                int arrayOffset = byteBuffer.arrayOffset();
                return mo54148l(i, byteBuffer.array(), i2 + arrayOffset, arrayOffset + i3);
            } else if (byteBuffer.isDirect()) {
                return mo54150o(i, byteBuffer, i2, i3);
            } else {
                return mo54149n(i, byteBuffer, i2, i3);
            }
        }

        /* renamed from: l */
        public abstract int mo54148l(int i, byte[] bArr, int i2, int i3);

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x004c, code lost:
            if (r8.get(r9) > -65) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x008f, code lost:
            if (r8.get(r7) > -65) goto L_0x0091;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
            if (r8.get(r9) > -65) goto L_0x001d;
         */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int mo54149n(int r7, java.nio.ByteBuffer r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0092
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001e
                r7 = -62
                if (r0 < r7) goto L_0x001d
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
                goto L_0x001d
            L_0x001a:
                r9 = r7
                goto L_0x0092
            L_0x001d:
                return r2
            L_0x001e:
                r4 = -16
                if (r0 >= r4) goto L_0x004f
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0038
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r7 < r10) goto L_0x0035
                int r7 = androidx.datastore.preferences.protobuf.Utf8.m85204o(r0, r9)
                return r7
            L_0x0035:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0038:
                if (r7 > r3) goto L_0x004e
                r4 = -96
                if (r0 != r1) goto L_0x0040
                if (r7 < r4) goto L_0x004e
            L_0x0040:
                r1 = -19
                if (r0 != r1) goto L_0x0046
                if (r7 >= r4) goto L_0x004e
            L_0x0046:
                int r7 = r9 + 1
                byte r9 = r8.get(r9)
                if (r9 <= r3) goto L_0x001a
            L_0x004e:
                return r2
            L_0x004f:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L_0x0064
                int r7 = r9 + 1
                byte r1 = r8.get(r9)
                if (r7 < r10) goto L_0x0062
                int r7 = androidx.datastore.preferences.protobuf.Utf8.m85204o(r0, r1)
                return r7
            L_0x0062:
                r9 = 0
                goto L_0x006a
            L_0x0064:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x006a:
                if (r9 != 0) goto L_0x007c
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r9 < r10) goto L_0x0079
                int r7 = androidx.datastore.preferences.protobuf.Utf8.m85205p(r0, r1, r7)
                return r7
            L_0x0079:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x007c:
                if (r1 > r3) goto L_0x0091
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L_0x0091
                if (r9 > r3) goto L_0x0091
                int r9 = r7 + 1
                byte r7 = r8.get(r7)
                if (r7 <= r3) goto L_0x0092
            L_0x0091:
                return r2
            L_0x0092:
                int r7 = m85231m(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.C18652b.mo54149n(int, java.nio.ByteBuffer, int, int):int");
        }

        /* renamed from: o */
        public abstract int mo54150o(int i, ByteBuffer byteBuffer, int i2, int i3);
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Utf8$c */
    public static final class C18653c extends C18652b {
        /* renamed from: p */
        public static int m85246p(byte[] bArr, int i, int i2) {
            while (i < i2 && bArr[i] >= 0) {
                i++;
            }
            if (i >= i2) {
                return 0;
            }
            return m85247q(bArr, i, i2);
        }

        /* renamed from: q */
        public static int m85247q(byte[] bArr, int i, int i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b = bArr[i];
                if (b < 0) {
                    if (b < -32) {
                        if (i3 >= i2) {
                            return b;
                        }
                        if (b >= -62) {
                            i = i3 + 1;
                            if (bArr[i3] > -65) {
                            }
                        }
                        return -1;
                    } else if (b < -16) {
                        if (i3 >= i2 - 1) {
                            return Utf8.m85207r(bArr, i3, i2);
                        }
                        int i4 = i3 + 1;
                        byte b2 = bArr[i3];
                        if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                            i = i4 + 1;
                            if (bArr[i4] > -65) {
                            }
                        }
                        return -1;
                    } else if (i3 >= i2 - 2) {
                        return Utf8.m85207r(bArr, i3, i2);
                    } else {
                        int i5 = i3 + 1;
                        byte b3 = bArr[i3];
                        if (b3 <= -65 && (((b << C31234i.C31240f.f75184f) + (b3 + 112)) >> 30) == 0) {
                            int i6 = i5 + 1;
                            if (bArr[i5] <= -65) {
                                i3 = i6 + 1;
                                if (bArr[i6] > -65) {
                                }
                            }
                        }
                        return -1;
                    }
                }
                i = i3;
            }
            return 0;
        }

        /* renamed from: b */
        public String mo54138b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte b = bArr[r13];
                    if (!C18651a.m85226n(b)) {
                        break;
                    }
                    i = r13 + 1;
                    C18651a.m85221i(b, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte b2 = bArr[r13];
                    if (C18651a.m85226n(b2)) {
                        int i7 = i5 + 1;
                        C18651a.m85221i(b2, cArr, i5);
                        while (i6 < i3) {
                            byte b3 = bArr[i6];
                            if (!C18651a.m85226n(b3)) {
                                break;
                            }
                            i6++;
                            C18651a.m85221i(b3, cArr, i7);
                            i7++;
                        }
                        r13 = i6;
                        i5 = i7;
                    } else if (C18651a.m85228p(b2)) {
                        if (i6 < i3) {
                            C18651a.m85223k(b2, bArr[i6], cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m85087d();
                        }
                    } else if (C18651a.m85227o(b2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C18651a.m85222j(b2, bArr[i6], bArr[i8], cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m85087d();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte b4 = bArr[i6];
                        int i10 = i9 + 1;
                        C18651a.m85220h(b2, b4, bArr[i9], bArr[i10], cArr, i5);
                        r13 = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.m85087d();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: d */
        public String mo54140d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            return mo54139c(byteBuffer, i, i2);
        }

        /* renamed from: e */
        public int mo54141e(CharSequence charSequence, byte[] bArr, int i, int i2) {
            int i3;
            int i4;
            int i5;
            char charAt;
            int length = charSequence.length();
            int i6 = i2 + i;
            int i7 = 0;
            while (i7 < length && (i5 = i7 + i) < i6 && (charAt = charSequence.charAt(i7)) < 128) {
                bArr[i5] = (byte) charAt;
                i7++;
            }
            if (i7 == length) {
                return i + length;
            }
            int i8 = i + i7;
            while (i7 < length) {
                char charAt2 = charSequence.charAt(i7);
                if (charAt2 < 128 && i8 < i6) {
                    i4 = i8 + 1;
                    bArr[i8] = (byte) charAt2;
                } else if (charAt2 < 2048 && i8 <= i6 - 2) {
                    int i9 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 6) | C14092c.f34671x0);
                    i8 = i9 + 1;
                    bArr[i9] = (byte) ((charAt2 & '?') | 128);
                    i7++;
                } else if ((charAt2 < 55296 || 57343 < charAt2) && i8 <= i6 - 3) {
                    int i10 = i8 + 1;
                    bArr[i8] = (byte) ((charAt2 >>> 12) | C14092c.f34573Y0);
                    int i11 = i10 + 1;
                    bArr[i10] = (byte) (((charAt2 >>> 6) & 63) | 128);
                    i4 = i11 + 1;
                    bArr[i11] = (byte) ((charAt2 & '?') | 128);
                } else if (i8 <= i6 - 4) {
                    int i12 = i7 + 1;
                    if (i12 != charSequence.length()) {
                        char charAt3 = charSequence.charAt(i12);
                        if (Character.isSurrogatePair(charAt2, charAt3)) {
                            int codePoint = Character.toCodePoint(charAt2, charAt3);
                            int i13 = i8 + 1;
                            bArr[i8] = (byte) ((codePoint >>> 18) | C9527p.f26031b);
                            int i14 = i13 + 1;
                            bArr[i13] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i15 = i14 + 1;
                            bArr[i14] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i8 = i15 + 1;
                            bArr[i15] = (byte) ((codePoint & 63) | 128);
                            i7 = i12;
                            i7++;
                        } else {
                            i7 = i12;
                        }
                    }
                    throw new UnpairedSurrogateException(i7 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i3 = i7 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i3)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i8);
                } else {
                    throw new UnpairedSurrogateException(i7, length);
                }
                i8 = i4;
                i7++;
            }
            return i8;
        }

        /* renamed from: h */
        public void mo54144h(CharSequence charSequence, ByteBuffer byteBuffer) {
            mo54143g(charSequence, byteBuffer);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0046, code lost:
            if (r8[r9] > -65) goto L_0x0048;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0083, code lost:
            if (r8[r7] > -65) goto L_0x0085;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0015, code lost:
            if (r8[r9] > -65) goto L_0x001b;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo54148l(int r7, byte[] r8, int r9, int r10) {
            /*
                r6 = this;
                if (r7 == 0) goto L_0x0086
                if (r9 < r10) goto L_0x0005
                return r7
            L_0x0005:
                byte r0 = (byte) r7
                r1 = -32
                r2 = -1
                r3 = -65
                if (r0 >= r1) goto L_0x001c
                r7 = -62
                if (r0 < r7) goto L_0x001b
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
                goto L_0x001b
            L_0x0018:
                r9 = r7
                goto L_0x0086
            L_0x001b:
                return r2
            L_0x001c:
                r4 = -16
                if (r0 >= r4) goto L_0x0049
                int r7 = r7 >> 8
                int r7 = ~r7
                byte r7 = (byte) r7
                if (r7 != 0) goto L_0x0034
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r7 < r10) goto L_0x0031
                int r7 = androidx.datastore.preferences.protobuf.Utf8.m85204o(r0, r9)
                return r7
            L_0x0031:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0034:
                if (r7 > r3) goto L_0x0048
                r4 = -96
                if (r0 != r1) goto L_0x003c
                if (r7 < r4) goto L_0x0048
            L_0x003c:
                r1 = -19
                if (r0 != r1) goto L_0x0042
                if (r7 >= r4) goto L_0x0048
            L_0x0042:
                int r7 = r9 + 1
                byte r9 = r8[r9]
                if (r9 <= r3) goto L_0x0018
            L_0x0048:
                return r2
            L_0x0049:
                int r1 = r7 >> 8
                int r1 = ~r1
                byte r1 = (byte) r1
                if (r1 != 0) goto L_0x005c
                int r7 = r9 + 1
                byte r1 = r8[r9]
                if (r7 < r10) goto L_0x005a
                int r7 = androidx.datastore.preferences.protobuf.Utf8.m85204o(r0, r1)
                return r7
            L_0x005a:
                r9 = 0
                goto L_0x0062
            L_0x005c:
                int r7 = r7 >> 16
                byte r7 = (byte) r7
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0062:
                if (r9 != 0) goto L_0x0072
                int r9 = r7 + 1
                byte r7 = r8[r7]
                if (r9 < r10) goto L_0x006f
                int r7 = androidx.datastore.preferences.protobuf.Utf8.m85205p(r0, r1, r7)
                return r7
            L_0x006f:
                r5 = r9
                r9 = r7
                r7 = r5
            L_0x0072:
                if (r1 > r3) goto L_0x0085
                int r0 = r0 << 28
                int r1 = r1 + 112
                int r0 = r0 + r1
                int r0 = r0 >> 30
                if (r0 != 0) goto L_0x0085
                if (r9 > r3) goto L_0x0085
                int r9 = r7 + 1
                byte r7 = r8[r7]
                if (r7 <= r3) goto L_0x0086
            L_0x0085:
                return r2
            L_0x0086:
                int r7 = m85246p(r8, r9, r10)
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.C18653c.mo54148l(int, byte[], int, int):int");
        }

        /* renamed from: o */
        public int mo54150o(int i, ByteBuffer byteBuffer, int i2, int i3) {
            return mo54149n(i, byteBuffer, i2, i3);
        }
    }

    /* renamed from: androidx.datastore.preferences.protobuf.Utf8$d */
    public static final class C18654d extends C18652b {
        /* renamed from: p */
        public static boolean m85254p() {
            return C18923z3.m88372S() && C18923z3.m88373T();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            return -1;
         */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m85255q(long r8, int r10) {
            /*
                int r0 = m85257s(r8, r10)
                long r1 = (long) r0
                long r8 = r8 + r1
                int r10 = r10 - r0
            L_0x0007:
                r0 = 0
                r1 = r0
            L_0x0009:
                r2 = 1
                if (r10 <= 0) goto L_0x001a
                long r4 = r8 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r8)
                if (r1 < 0) goto L_0x0019
                int r10 = r10 + -1
                r8 = r4
                goto L_0x0009
            L_0x0019:
                r8 = r4
            L_0x001a:
                if (r10 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r10 = r10 + -1
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L_0x003a
                if (r10 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r10 = r10 + -1
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r8
                byte r8 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r8)
                if (r8 <= r4) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r8 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r6 = -16
                if (r1 >= r6) goto L_0x0064
                r6 = 2
                if (r10 >= r6) goto L_0x0046
                int r8 = m85259u(r8, r1, r10)
                return r8
            L_0x0046:
                int r10 = r10 + -2
                long r6 = r8 + r2
                byte r8 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r8)
                if (r8 > r4) goto L_0x0063
                r9 = -96
                if (r1 != r0) goto L_0x0056
                if (r8 < r9) goto L_0x0063
            L_0x0056:
                r0 = -19
                if (r1 != r0) goto L_0x005c
                if (r8 >= r9) goto L_0x0063
            L_0x005c:
                long r2 = r2 + r6
                byte r8 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r6)
                if (r8 <= r4) goto L_0x0037
            L_0x0063:
                return r5
            L_0x0064:
                r0 = 3
                if (r10 >= r0) goto L_0x006c
                int r8 = m85259u(r8, r1, r10)
                return r8
            L_0x006c:
                int r10 = r10 + -3
                long r6 = r8 + r2
                byte r8 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r8)
                if (r8 > r4) goto L_0x008e
                int r9 = r1 << 28
                int r8 = r8 + 112
                int r9 = r9 + r8
                int r8 = r9 >> 30
                if (r8 != 0) goto L_0x008e
                long r8 = r6 + r2
                byte r0 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r6)
                if (r0 > r4) goto L_0x008e
                long r2 = r2 + r8
                byte r8 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r8)
                if (r8 <= r4) goto L_0x0037
            L_0x008e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.C18654d.m85255q(long, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0039, code lost:
            return -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0063, code lost:
            return -1;
         */
        /* renamed from: r */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int m85256r(byte[] r8, long r9, int r11) {
            /*
                int r0 = m85258t(r8, r9, r11)
                int r11 = r11 - r0
                long r0 = (long) r0
                long r9 = r9 + r0
            L_0x0007:
                r0 = 0
                r1 = r0
            L_0x0009:
                r2 = 1
                if (r11 <= 0) goto L_0x001a
                long r4 = r9 + r2
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r8, r9)
                if (r1 < 0) goto L_0x0019
                int r11 = r11 + -1
                r9 = r4
                goto L_0x0009
            L_0x0019:
                r9 = r4
            L_0x001a:
                if (r11 != 0) goto L_0x001d
                return r0
            L_0x001d:
                int r11 = r11 + -1
                r0 = -32
                r4 = -65
                r5 = -1
                if (r1 >= r0) goto L_0x003a
                if (r11 != 0) goto L_0x0029
                return r1
            L_0x0029:
                int r11 = r11 + -1
                r0 = -62
                if (r1 < r0) goto L_0x0039
                long r2 = r2 + r9
                byte r9 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r8, r9)
                if (r9 <= r4) goto L_0x0037
                goto L_0x0039
            L_0x0037:
                r9 = r2
                goto L_0x0007
            L_0x0039:
                return r5
            L_0x003a:
                r6 = -16
                if (r1 >= r6) goto L_0x0064
                r6 = 2
                if (r11 >= r6) goto L_0x0046
                int r8 = m85260v(r8, r1, r9, r11)
                return r8
            L_0x0046:
                int r11 = r11 + -2
                long r6 = r9 + r2
                byte r9 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r8, r9)
                if (r9 > r4) goto L_0x0063
                r10 = -96
                if (r1 != r0) goto L_0x0056
                if (r9 < r10) goto L_0x0063
            L_0x0056:
                r0 = -19
                if (r1 != r0) goto L_0x005c
                if (r9 >= r10) goto L_0x0063
            L_0x005c:
                long r2 = r2 + r6
                byte r9 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r8, r6)
                if (r9 <= r4) goto L_0x0037
            L_0x0063:
                return r5
            L_0x0064:
                r0 = 3
                if (r11 >= r0) goto L_0x006c
                int r8 = m85260v(r8, r1, r9, r11)
                return r8
            L_0x006c:
                int r11 = r11 + -3
                long r6 = r9 + r2
                byte r9 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r8, r9)
                if (r9 > r4) goto L_0x008e
                int r10 = r1 << 28
                int r9 = r9 + 112
                int r10 = r10 + r9
                int r9 = r10 >> 30
                if (r9 != 0) goto L_0x008e
                long r9 = r6 + r2
                byte r0 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r8, r6)
                if (r0 > r4) goto L_0x008e
                long r2 = r2 + r9
                byte r9 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r8, r9)
                if (r9 <= r4) goto L_0x0037
            L_0x008e:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.C18654d.m85256r(byte[], long, int):int");
        }

        /* renamed from: s */
        public static int m85257s(long j, int i) {
            if (i < 16) {
                return 0;
            }
            int i2 = 8 - (((int) j) & 7);
            int i3 = i2;
            while (i3 > 0) {
                long j2 = 1 + j;
                if (C18923z3.m88424y(j) < 0) {
                    return i2 - i3;
                }
                i3--;
                j = j2;
            }
            int i4 = i - i2;
            while (i4 >= 8 && (C18923z3.m88364K(j) & -9187201950435737472L) == 0) {
                j += 8;
                i4 -= 8;
            }
            return i - i4;
        }

        /* renamed from: t */
        public static int m85258t(byte[] bArr, long j, int i) {
            int i2 = 0;
            if (i < 16) {
                return 0;
            }
            while (i2 < i) {
                long j2 = 1 + j;
                if (C18923z3.m88354A(bArr, j) < 0) {
                    return i2;
                }
                i2++;
                j = j2;
            }
            return i;
        }

        /* renamed from: u */
        public static int m85259u(long j, int i, int i2) {
            if (i2 == 0) {
                return Utf8.m85203n(i);
            }
            if (i2 == 1) {
                return Utf8.m85204o(i, C18923z3.m88424y(j));
            }
            if (i2 == 2) {
                return Utf8.m85205p(i, C18923z3.m88424y(j), C18923z3.m88424y(j + 1));
            }
            throw new AssertionError();
        }

        /* renamed from: v */
        public static int m85260v(byte[] bArr, int i, long j, int i2) {
            if (i2 == 0) {
                return Utf8.m85203n(i);
            }
            if (i2 == 1) {
                return Utf8.m85204o(i, C18923z3.m88354A(bArr, j));
            }
            if (i2 == 2) {
                return Utf8.m85205p(i, C18923z3.m88354A(bArr, j), C18923z3.m88354A(bArr, j + 1));
            }
            throw new AssertionError();
        }

        /* renamed from: b */
        public String mo54138b(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
            if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
                int i3 = i + i2;
                char[] cArr = new char[i2];
                int i4 = 0;
                while (r13 < i3) {
                    byte A = C18923z3.m88354A(bArr, (long) r13);
                    if (!C18651a.m85226n(A)) {
                        break;
                    }
                    i = r13 + 1;
                    C18651a.m85221i(A, cArr, i4);
                    i4++;
                }
                int i5 = i4;
                while (r13 < i3) {
                    int i6 = r13 + 1;
                    byte A2 = C18923z3.m88354A(bArr, (long) r13);
                    if (C18651a.m85226n(A2)) {
                        int i7 = i5 + 1;
                        C18651a.m85221i(A2, cArr, i5);
                        while (i6 < i3) {
                            byte A3 = C18923z3.m88354A(bArr, (long) i6);
                            if (!C18651a.m85226n(A3)) {
                                break;
                            }
                            i6++;
                            C18651a.m85221i(A3, cArr, i7);
                            i7++;
                        }
                        r13 = i6;
                        i5 = i7;
                    } else if (C18651a.m85228p(A2)) {
                        if (i6 < i3) {
                            C18651a.m85223k(A2, C18923z3.m88354A(bArr, (long) i6), cArr, i5);
                            r13 = i6 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m85087d();
                        }
                    } else if (C18651a.m85227o(A2)) {
                        if (i6 < i3 - 1) {
                            int i8 = i6 + 1;
                            C18651a.m85222j(A2, C18923z3.m88354A(bArr, (long) i6), C18923z3.m88354A(bArr, (long) i8), cArr, i5);
                            r13 = i8 + 1;
                            i5++;
                        } else {
                            throw InvalidProtocolBufferException.m85087d();
                        }
                    } else if (i6 < i3 - 2) {
                        int i9 = i6 + 1;
                        byte A4 = C18923z3.m88354A(bArr, (long) i6);
                        int i10 = i9 + 1;
                        C18651a.m85220h(A2, A4, C18923z3.m88354A(bArr, (long) i9), C18923z3.m88354A(bArr, (long) i10), cArr, i5);
                        r13 = i10 + 1;
                        i5 = i5 + 1 + 1;
                    } else {
                        throw InvalidProtocolBufferException.m85087d();
                    }
                }
                return new String(cArr, 0, i5);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* renamed from: d */
        public String mo54140d(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
            long j;
            int i3 = i;
            int i4 = i2;
            if ((i3 | i4 | ((byteBuffer.limit() - i3) - i4)) >= 0) {
                long i5 = C18923z3.m88396i(byteBuffer) + ((long) i3);
                long j2 = ((long) i4) + i5;
                char[] cArr = new char[i4];
                int i6 = 0;
                while (i5 < j2) {
                    byte y = C18923z3.m88424y(i5);
                    if (!C18651a.m85226n(y)) {
                        break;
                    }
                    i5++;
                    C18651a.m85221i(y, cArr, i6);
                    i6++;
                }
                while (true) {
                    int i7 = i6;
                    while (j < j2) {
                        long j3 = j + 1;
                        byte y2 = C18923z3.m88424y(j);
                        if (C18651a.m85226n(y2)) {
                            int i8 = i7 + 1;
                            C18651a.m85221i(y2, cArr, i7);
                            while (j3 < j2) {
                                byte y3 = C18923z3.m88424y(j3);
                                if (!C18651a.m85226n(y3)) {
                                    break;
                                }
                                j3++;
                                C18651a.m85221i(y3, cArr, i8);
                                i8++;
                            }
                            i7 = i8;
                            j = j3;
                        } else if (C18651a.m85228p(y2)) {
                            if (j3 < j2) {
                                j = j3 + 1;
                                C18651a.m85223k(y2, C18923z3.m88424y(j3), cArr, i7);
                                i7++;
                            } else {
                                throw InvalidProtocolBufferException.m85087d();
                            }
                        } else if (C18651a.m85227o(y2)) {
                            if (j3 < j2 - 1) {
                                long j4 = j3 + 1;
                                C18651a.m85222j(y2, C18923z3.m88424y(j3), C18923z3.m88424y(j4), cArr, i7);
                                i7++;
                                j = j4 + 1;
                            } else {
                                throw InvalidProtocolBufferException.m85087d();
                            }
                        } else if (j3 < j2 - 2) {
                            long j5 = j3 + 1;
                            byte y4 = C18923z3.m88424y(j3);
                            long j6 = j5 + 1;
                            byte y5 = C18923z3.m88424y(j5);
                            i5 = j6 + 1;
                            C18651a.m85220h(y2, y4, y5, C18923z3.m88424y(j6), cArr, i7);
                            i6 = i7 + 1 + 1;
                        } else {
                            throw InvalidProtocolBufferException.m85087d();
                        }
                    }
                    return new String(cArr, 0, i7);
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:37:0x00fc, LOOP_START, PHI: r2 r3 r4 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r3v2 char) = (r3v1 char), (r3v3 char) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v5 long) binds: [B:10:0x002f, B:37:0x00fc] A[DONT_GENERATE, DONT_INLINE]] */
        /* renamed from: e */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo54141e(java.lang.CharSequence r22, byte[] r23, int r24, int r25) {
            /*
                r21 = this;
                r0 = r22
                r1 = r23
                r2 = r24
                r3 = r25
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r22.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0144
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0144
                r2 = 0
            L_0x001a:
                r3 = 128(0x80, float:1.794E-43)
                r11 = 1
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                androidx.datastore.preferences.protobuf.C18923z3.m88387d0(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0142
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004a
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004a
                long r14 = r4 + r11
                byte r13 = (byte) r13
                androidx.datastore.preferences.protobuf.C18923z3.m88387d0(r1, r4, r13)
                r4 = r11
                r12 = r14
                r11 = r3
                goto L_0x00fc
            L_0x004a:
                r14 = 2048(0x800, float:2.87E-42)
                if (r13 >= r14) goto L_0x0074
                r14 = 2
                long r14 = r6 - r14
                int r14 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
                if (r14 > 0) goto L_0x0074
                long r14 = r4 + r11
                int r3 = r13 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.C18923z3.m88387d0(r1, r4, r3)
                long r3 = r14 + r11
                r5 = r13 & 63
                r13 = 128(0x80, float:1.794E-43)
                r5 = r5 | r13
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.C18923z3.m88387d0(r1, r14, r5)
                r19 = r11
                r11 = 128(0x80, float:1.794E-43)
                r12 = r3
                r4 = r19
                goto L_0x00fc
            L_0x0074:
                r3 = 57343(0xdfff, float:8.0355E-41)
                r14 = 55296(0xd800, float:7.7486E-41)
                if (r13 < r14) goto L_0x007e
                if (r3 >= r13) goto L_0x00af
            L_0x007e:
                r15 = 3
                long r15 = r6 - r15
                int r15 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
                if (r15 > 0) goto L_0x00af
                long r14 = r4 + r11
                int r3 = r13 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.C18923z3.m88387d0(r1, r4, r3)
                long r3 = r14 + r11
                int r5 = r13 >>> 6
                r5 = r5 & 63
                r11 = 128(0x80, float:1.794E-43)
                r5 = r5 | r11
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.C18923z3.m88387d0(r1, r14, r5)
                r14 = 1
                long r17 = r3 + r14
                r5 = r13 & 63
                r5 = r5 | r11
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.C18923z3.m88387d0(r1, r3, r5)
                r12 = r17
                r4 = 1
                r11 = 128(0x80, float:1.794E-43)
                goto L_0x00fc
            L_0x00af:
                r11 = 4
                long r11 = r6 - r11
                int r11 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
                if (r11 > 0) goto L_0x010f
                int r3 = r2 + 1
                if (r3 == r8) goto L_0x0107
                char r2 = r0.charAt(r3)
                boolean r11 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r11 == 0) goto L_0x0106
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r11 = 1
                long r13 = r4 + r11
                int r15 = r2 >>> 18
                r15 = r15 | 240(0xf0, float:3.36E-43)
                byte r15 = (byte) r15
                androidx.datastore.preferences.protobuf.C18923z3.m88387d0(r1, r4, r15)
                long r4 = r13 + r11
                int r15 = r2 >>> 12
                r15 = r15 & 63
                r11 = 128(0x80, float:1.794E-43)
                r12 = r15 | 128(0x80, float:1.794E-43)
                byte r12 = (byte) r12
                androidx.datastore.preferences.protobuf.C18923z3.m88387d0(r1, r13, r12)
                r12 = 1
                long r14 = r4 + r12
                int r16 = r2 >>> 6
                r12 = r16 & 63
                r12 = r12 | r11
                byte r12 = (byte) r12
                androidx.datastore.preferences.protobuf.C18923z3.m88387d0(r1, r4, r12)
                r4 = 1
                long r12 = r14 + r4
                r2 = r2 & 63
                r2 = r2 | r11
                byte r2 = (byte) r2
                androidx.datastore.preferences.protobuf.C18923z3.m88387d0(r1, r14, r2)
                r2 = r3
            L_0x00fc:
                int r2 = r2 + 1
                r3 = r11
                r19 = r4
                r4 = r12
                r11 = r19
                goto L_0x0033
            L_0x0106:
                r2 = r3
            L_0x0107:
                androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException r0 = new androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010f:
                if (r14 > r13) goto L_0x0127
                if (r13 > r3) goto L_0x0127
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x0121
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0127
            L_0x0121:
                androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException r0 = new androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r2, r8)
                throw r0
            L_0x0127:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r10)
                r1.append(r13)
                r1.append(r9)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0142:
                int r0 = (int) r4
                return r0
            L_0x0144:
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r10)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r9)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.C18654d.mo54141e(java.lang.CharSequence, byte[], int, int):int");
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0042 A[LOOP:1: B:11:0x0042->B:36:0x0107, LOOP_START, PHI: r2 r4 r6 r9 r12 
          PHI: (r2v2 long) = (r2v0 long), (r2v3 long) binds: [B:8:0x003a, B:36:0x0107] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v4 long) = (r4v3 long), (r4v6 long) binds: [B:8:0x003a, B:36:0x0107] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r6v3 long) = (r6v2 long), (r6v4 long) binds: [B:8:0x003a, B:36:0x0107] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r9v4 int) = (r9v3 int), (r9v6 int) binds: [B:8:0x003a, B:36:0x0107] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r12v1 char) = (r12v0 char), (r12v2 char) binds: [B:8:0x003a, B:36:0x0107] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x003c  */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo54144h(java.lang.CharSequence r22, java.nio.ByteBuffer r23) {
            /*
                r21 = this;
                r0 = r22
                r1 = r23
                long r2 = androidx.datastore.preferences.protobuf.C18923z3.m88396i(r23)
                int r4 = r23.position()
                long r4 = (long) r4
                long r4 = r4 + r2
                int r6 = r23.limit()
                long r6 = (long) r6
                long r6 = r6 + r2
                int r8 = r22.length()
                long r9 = (long) r8
                long r11 = r6 - r4
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                java.lang.String r10 = " at index "
                java.lang.String r11 = "Failed writing "
                if (r9 > 0) goto L_0x015a
                r9 = 0
            L_0x0024:
                r12 = 128(0x80, float:1.794E-43)
                r13 = 1
                if (r9 >= r8) goto L_0x003a
                char r15 = r0.charAt(r9)
                if (r15 >= r12) goto L_0x003a
                long r12 = r4 + r13
                byte r14 = (byte) r15
                androidx.datastore.preferences.protobuf.C18923z3.m88383b0(r4, r14)
                int r9 = r9 + 1
                r4 = r12
                goto L_0x0024
            L_0x003a:
                if (r9 != r8) goto L_0x0042
                long r4 = r4 - r2
                int r0 = (int) r4
                r1.position(r0)
                return
            L_0x0042:
                if (r9 >= r8) goto L_0x014f
                char r15 = r0.charAt(r9)
                if (r15 >= r12) goto L_0x005e
                int r16 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r16 >= 0) goto L_0x005e
                long r16 = r4 + r13
                byte r15 = (byte) r15
                androidx.datastore.preferences.protobuf.C18923z3.m88383b0(r4, r15)
                r19 = r6
                r1 = r9
                r9 = r12
                r4 = r16
                r17 = r2
                goto L_0x0107
            L_0x005e:
                r12 = 2048(0x800, float:2.87E-42)
                if (r15 >= r12) goto L_0x0089
                r17 = 2
                long r17 = r6 - r17
                int r12 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
                if (r12 > 0) goto L_0x0089
                r17 = r2
                long r1 = r4 + r13
                int r3 = r15 >>> 6
                r3 = r3 | 960(0x3c0, float:1.345E-42)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.C18923z3.m88383b0(r4, r3)
                long r3 = r1 + r13
                r5 = r15 & 63
                r12 = 128(0x80, float:1.794E-43)
                r5 = r5 | r12
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.C18923z3.m88383b0(r1, r5)
                r4 = r3
            L_0x0082:
                r19 = r6
                r1 = r9
                r9 = 128(0x80, float:1.794E-43)
                goto L_0x0107
            L_0x0089:
                r17 = r2
                r1 = 57343(0xdfff, float:8.0355E-41)
                r2 = 55296(0xd800, float:7.7486E-41)
                if (r15 < r2) goto L_0x0095
                if (r1 >= r15) goto L_0x00bf
            L_0x0095:
                r19 = 3
                long r19 = r6 - r19
                int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
                if (r3 > 0) goto L_0x00bf
                long r1 = r4 + r13
                int r3 = r15 >>> 12
                r3 = r3 | 480(0x1e0, float:6.73E-43)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.C18923z3.m88383b0(r4, r3)
                long r3 = r1 + r13
                int r5 = r15 >>> 6
                r5 = r5 & 63
                r12 = 128(0x80, float:1.794E-43)
                r5 = r5 | r12
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.C18923z3.m88383b0(r1, r5)
                long r1 = r3 + r13
                r5 = r15 & 63
                r5 = r5 | r12
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.C18923z3.m88383b0(r3, r5)
                r4 = r1
                goto L_0x0082
            L_0x00bf:
                r19 = 4
                long r19 = r6 - r19
                int r3 = (r4 > r19 ? 1 : (r4 == r19 ? 0 : -1))
                if (r3 > 0) goto L_0x011c
                int r1 = r9 + 1
                if (r1 == r8) goto L_0x0114
                char r2 = r0.charAt(r1)
                boolean r3 = java.lang.Character.isSurrogatePair(r15, r2)
                if (r3 == 0) goto L_0x0113
                int r2 = java.lang.Character.toCodePoint(r15, r2)
                r19 = r6
                long r6 = r4 + r13
                int r3 = r2 >>> 18
                r3 = r3 | 240(0xf0, float:3.36E-43)
                byte r3 = (byte) r3
                androidx.datastore.preferences.protobuf.C18923z3.m88383b0(r4, r3)
                long r3 = r6 + r13
                int r5 = r2 >>> 12
                r5 = r5 & 63
                r9 = 128(0x80, float:1.794E-43)
                r5 = r5 | r9
                byte r5 = (byte) r5
                androidx.datastore.preferences.protobuf.C18923z3.m88383b0(r6, r5)
                long r5 = r3 + r13
                int r7 = r2 >>> 6
                r7 = r7 & 63
                r7 = r7 | r9
                byte r7 = (byte) r7
                androidx.datastore.preferences.protobuf.C18923z3.m88383b0(r3, r7)
                long r3 = r5 + r13
                r2 = r2 & 63
                r2 = r2 | r9
                byte r2 = (byte) r2
                androidx.datastore.preferences.protobuf.C18923z3.m88383b0(r5, r2)
                r4 = r3
            L_0x0107:
                int r1 = r1 + 1
                r12 = r9
                r2 = r17
                r6 = r19
                r9 = r1
                r1 = r23
                goto L_0x0042
            L_0x0113:
                r9 = r1
            L_0x0114:
                androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException r0 = new androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException
                int r9 = r9 + -1
                r0.<init>(r9, r8)
                throw r0
            L_0x011c:
                if (r2 > r15) goto L_0x0134
                if (r15 > r1) goto L_0x0134
                int r1 = r9 + 1
                if (r1 == r8) goto L_0x012e
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r15, r0)
                if (r0 != 0) goto L_0x0134
            L_0x012e:
                androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException r0 = new androidx.datastore.preferences.protobuf.Utf8$UnpairedSurrogateException
                r0.<init>(r9, r8)
                throw r0
            L_0x0134:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r11)
                r1.append(r15)
                r1.append(r10)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x014f:
                r17 = r2
                long r4 = r4 - r17
                int r0 = (int) r4
                r1 = r23
                r1.position(r0)
                return
            L_0x015a:
                java.lang.ArrayIndexOutOfBoundsException r2 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r11)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r3.append(r0)
                r3.append(r10)
                int r0 = r23.limit()
                r3.append(r0)
                java.lang.String r0 = r3.toString()
                r2.<init>(r0)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.C18654d.mo54144h(java.lang.CharSequence, java.nio.ByteBuffer):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0059, code lost:
            if (androidx.datastore.preferences.protobuf.C18923z3.m88354A(r13, r2) > -65) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x009e, code lost:
            if (androidx.datastore.preferences.protobuf.C18923z3.m88354A(r13, r2) > -65) goto L_0x00a0;
         */
        /* renamed from: l */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo54148l(int r12, byte[] r13, int r14, int r15) {
            /*
                r11 = this;
                r0 = r14 | r15
                int r1 = r13.length
                int r1 = r1 - r15
                r0 = r0 | r1
                r1 = 0
                if (r0 < 0) goto L_0x00a8
                long r2 = (long) r14
                long r14 = (long) r15
                if (r12 == 0) goto L_0x00a1
                int r0 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
                if (r0 < 0) goto L_0x0011
                return r12
            L_0x0011:
                byte r0 = (byte) r12
                r4 = -32
                r5 = -1
                r6 = -65
                r7 = 1
                if (r0 >= r4) goto L_0x002b
                r12 = -62
                if (r0 < r12) goto L_0x002a
                long r7 = r7 + r2
                byte r12 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r13, r2)
                if (r12 <= r6) goto L_0x0027
                goto L_0x002a
            L_0x0027:
                r2 = r7
                goto L_0x00a1
            L_0x002a:
                return r5
            L_0x002b:
                r9 = -16
                if (r0 >= r9) goto L_0x005f
                int r12 = r12 >> 8
                int r12 = ~r12
                byte r12 = (byte) r12
                if (r12 != 0) goto L_0x0045
                long r9 = r2 + r7
                byte r12 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r13, r2)
                int r1 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r1 < 0) goto L_0x0044
                int r12 = androidx.datastore.preferences.protobuf.Utf8.m85204o(r0, r12)
                return r12
            L_0x0044:
                r2 = r9
            L_0x0045:
                if (r12 > r6) goto L_0x005e
                r1 = -96
                if (r0 != r4) goto L_0x004d
                if (r12 < r1) goto L_0x005e
            L_0x004d:
                r4 = -19
                if (r0 != r4) goto L_0x0053
                if (r12 >= r1) goto L_0x005e
            L_0x0053:
                long r0 = r2 + r7
                byte r12 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r13, r2)
                if (r12 <= r6) goto L_0x005c
                goto L_0x005e
            L_0x005c:
                r2 = r0
                goto L_0x00a1
            L_0x005e:
                return r5
            L_0x005f:
                int r4 = r12 >> 8
                int r4 = ~r4
                byte r4 = (byte) r4
                if (r4 != 0) goto L_0x0076
                long r9 = r2 + r7
                byte r4 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x0074
                int r12 = androidx.datastore.preferences.protobuf.Utf8.m85204o(r0, r4)
                return r12
            L_0x0074:
                r2 = r9
                goto L_0x0079
            L_0x0076:
                int r12 = r12 >> 16
                byte r1 = (byte) r12
            L_0x0079:
                if (r1 != 0) goto L_0x008b
                long r9 = r2 + r7
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r13, r2)
                int r12 = (r9 > r14 ? 1 : (r9 == r14 ? 0 : -1))
                if (r12 < 0) goto L_0x008a
                int r12 = androidx.datastore.preferences.protobuf.Utf8.m85205p(r0, r4, r1)
                return r12
            L_0x008a:
                r2 = r9
            L_0x008b:
                if (r4 > r6) goto L_0x00a0
                int r12 = r0 << 28
                int r4 = r4 + 112
                int r12 = r12 + r4
                int r12 = r12 >> 30
                if (r12 != 0) goto L_0x00a0
                if (r1 > r6) goto L_0x00a0
                long r0 = r2 + r7
                byte r12 = androidx.datastore.preferences.protobuf.C18923z3.m88354A(r13, r2)
                if (r12 <= r6) goto L_0x005c
            L_0x00a0:
                return r5
            L_0x00a1:
                long r14 = r14 - r2
                int r12 = (int) r14
                int r12 = m85256r(r13, r2, r12)
                return r12
            L_0x00a8:
                java.lang.ArrayIndexOutOfBoundsException r12 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r13 = r13.length
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r1] = r13
                r13 = 1
                java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
                r0[r13] = r14
                r13 = 2
                java.lang.Integer r14 = java.lang.Integer.valueOf(r15)
                r0[r13] = r14
                java.lang.String r13 = "Array length=%d, index=%d, limit=%d"
                java.lang.String r13 = java.lang.String.format(r13, r0)
                r12.<init>(r13)
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.C18654d.mo54148l(int, byte[], int, int):int");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0063, code lost:
            if (androidx.datastore.preferences.protobuf.C18923z3.m88424y(r2) > -65) goto L_0x0068;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x00a8, code lost:
            if (androidx.datastore.preferences.protobuf.C18923z3.m88424y(r2) > -65) goto L_0x00aa;
         */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo54150o(int r11, java.nio.ByteBuffer r12, int r13, int r14) {
            /*
                r10 = this;
                r0 = r13 | r14
                int r1 = r12.limit()
                int r1 = r1 - r14
                r0 = r0 | r1
                r1 = 0
                if (r0 < 0) goto L_0x00b2
                long r2 = androidx.datastore.preferences.protobuf.C18923z3.m88396i(r12)
                long r4 = (long) r13
                long r2 = r2 + r4
                int r14 = r14 - r13
                long r12 = (long) r14
                long r12 = r12 + r2
                if (r11 == 0) goto L_0x00ab
                int r14 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
                if (r14 < 0) goto L_0x001b
                return r11
            L_0x001b:
                byte r14 = (byte) r11
                r0 = -32
                r4 = -1
                r5 = -65
                r6 = 1
                if (r14 >= r0) goto L_0x0035
                r11 = -62
                if (r14 < r11) goto L_0x0034
                long r6 = r6 + r2
                byte r11 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r2)
                if (r11 <= r5) goto L_0x0031
                goto L_0x0034
            L_0x0031:
                r2 = r6
                goto L_0x00ab
            L_0x0034:
                return r4
            L_0x0035:
                r8 = -16
                if (r14 >= r8) goto L_0x0069
                int r11 = r11 >> 8
                int r11 = ~r11
                byte r11 = (byte) r11
                if (r11 != 0) goto L_0x004f
                long r8 = r2 + r6
                byte r11 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r2)
                int r1 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r1 < 0) goto L_0x004e
                int r11 = androidx.datastore.preferences.protobuf.Utf8.m85204o(r14, r11)
                return r11
            L_0x004e:
                r2 = r8
            L_0x004f:
                if (r11 > r5) goto L_0x0068
                r1 = -96
                if (r14 != r0) goto L_0x0057
                if (r11 < r1) goto L_0x0068
            L_0x0057:
                r0 = -19
                if (r14 != r0) goto L_0x005d
                if (r11 >= r1) goto L_0x0068
            L_0x005d:
                long r0 = r2 + r6
                byte r11 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r2)
                if (r11 <= r5) goto L_0x0066
                goto L_0x0068
            L_0x0066:
                r2 = r0
                goto L_0x00ab
            L_0x0068:
                return r4
            L_0x0069:
                int r0 = r11 >> 8
                int r0 = ~r0
                byte r0 = (byte) r0
                if (r0 != 0) goto L_0x0080
                long r8 = r2 + r6
                byte r0 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r2)
                int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r11 < 0) goto L_0x007e
                int r11 = androidx.datastore.preferences.protobuf.Utf8.m85204o(r14, r0)
                return r11
            L_0x007e:
                r2 = r8
                goto L_0x0083
            L_0x0080:
                int r11 = r11 >> 16
                byte r1 = (byte) r11
            L_0x0083:
                if (r1 != 0) goto L_0x0095
                long r8 = r2 + r6
                byte r1 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r2)
                int r11 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
                if (r11 < 0) goto L_0x0094
                int r11 = androidx.datastore.preferences.protobuf.Utf8.m85205p(r14, r0, r1)
                return r11
            L_0x0094:
                r2 = r8
            L_0x0095:
                if (r0 > r5) goto L_0x00aa
                int r11 = r14 << 28
                int r0 = r0 + 112
                int r11 = r11 + r0
                int r11 = r11 >> 30
                if (r11 != 0) goto L_0x00aa
                if (r1 > r5) goto L_0x00aa
                long r0 = r2 + r6
                byte r11 = androidx.datastore.preferences.protobuf.C18923z3.m88424y(r2)
                if (r11 <= r5) goto L_0x0066
            L_0x00aa:
                return r4
            L_0x00ab:
                long r12 = r12 - r2
                int r11 = (int) r12
                int r11 = m85255q(r2, r11)
                return r11
            L_0x00b2:
                java.lang.ArrayIndexOutOfBoundsException r11 = new java.lang.ArrayIndexOutOfBoundsException
                r0 = 3
                java.lang.Object[] r0 = new java.lang.Object[r0]
                int r12 = r12.limit()
                java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
                r0[r1] = r12
                r12 = 1
                java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
                r0[r12] = r13
                r12 = 2
                java.lang.Integer r13 = java.lang.Integer.valueOf(r14)
                r0[r12] = r13
                java.lang.String r12 = "buffer limit=%d, index=%d, limit=%d"
                java.lang.String r12 = java.lang.String.format(r12, r0)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.Utf8.C18654d.mo54150o(int, java.nio.ByteBuffer, int, int):int");
        }
    }

    /* renamed from: g */
    public static String m85196g(ByteBuffer byteBuffer, int i, int i2) throws InvalidProtocolBufferException {
        return f47702a.mo54137a(byteBuffer, i, i2);
    }

    /* renamed from: h */
    public static String m85197h(byte[] bArr, int i, int i2) throws InvalidProtocolBufferException {
        return f47702a.mo54138b(bArr, i, i2);
    }

    /* renamed from: i */
    public static int m85198i(CharSequence charSequence, byte[] bArr, int i, int i2) {
        return f47702a.mo54141e(charSequence, bArr, i, i2);
    }

    /* renamed from: j */
    public static void m85199j(CharSequence charSequence, ByteBuffer byteBuffer) {
        f47702a.mo54142f(charSequence, byteBuffer);
    }

    /* renamed from: k */
    public static int m85200k(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        while (i < length && charSequence.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (charAt >= 2048) {
                    i2 += m85201l(charSequence, i);
                    break;
                }
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                break;
            }
        }
        if (i2 >= length) {
            return i2;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i2) + 4294967296L));
    }

    /* renamed from: l */
    public static int m85201l(CharSequence charSequence, int i) {
        int length = charSequence.length();
        int i2 = 0;
        while (i < length) {
            char charAt = charSequence.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
            } else {
                i2 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(charSequence, i) >= 65536) {
                        i++;
                    } else {
                        throw new UnpairedSurrogateException(i, length);
                    }
                }
            }
            i++;
        }
        return i2;
    }

    /* renamed from: m */
    public static int m85202m(ByteBuffer byteBuffer, int i, int i2) {
        int i3 = i2 - 7;
        int i4 = i;
        while (i4 < i3 && (byteBuffer.getLong(i4) & -9187201950435737472L) == 0) {
            i4 += 8;
        }
        return i4 - i;
    }

    /* renamed from: n */
    public static int m85203n(int i) {
        if (i > -12) {
            return -1;
        }
        return i;
    }

    /* renamed from: o */
    public static int m85204o(int i, int i2) {
        if (i > -12 || i2 > -65) {
            return -1;
        }
        return i ^ (i2 << 8);
    }

    /* renamed from: p */
    public static int m85205p(int i, int i2, int i3) {
        if (i > -12 || i2 > -65 || i3 > -65) {
            return -1;
        }
        return (i ^ (i2 << 8)) ^ (i3 << 16);
    }

    /* renamed from: q */
    public static int m85206q(ByteBuffer byteBuffer, int i, int i2, int i3) {
        if (i3 == 0) {
            return m85203n(i);
        }
        if (i3 == 1) {
            return m85204o(i, byteBuffer.get(i2));
        }
        if (i3 == 2) {
            return m85205p(i, byteBuffer.get(i2), byteBuffer.get(i2 + 1));
        }
        throw new AssertionError();
    }

    /* renamed from: r */
    public static int m85207r(byte[] bArr, int i, int i2) {
        byte b = bArr[i - 1];
        int i3 = i2 - i;
        if (i3 == 0) {
            return m85203n(b);
        }
        if (i3 == 1) {
            return m85204o(b, bArr[i]);
        }
        if (i3 == 2) {
            return m85205p(b, bArr[i], bArr[i + 1]);
        }
        throw new AssertionError();
    }

    /* renamed from: s */
    public static boolean m85208s(ByteBuffer byteBuffer) {
        return f47702a.mo54145i(byteBuffer, byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: t */
    public static boolean m85209t(byte[] bArr) {
        return f47702a.mo54146j(bArr, 0, bArr.length);
    }

    /* renamed from: u */
    public static boolean m85210u(byte[] bArr, int i, int i2) {
        return f47702a.mo54146j(bArr, i, i2);
    }

    /* renamed from: v */
    public static int m85211v(int i, ByteBuffer byteBuffer, int i2, int i3) {
        return f47702a.mo54147k(i, byteBuffer, i2, i3);
    }

    /* renamed from: w */
    public static int m85212w(int i, byte[] bArr, int i2, int i3) {
        return f47702a.mo54148l(i, bArr, i2, i3);
    }
}
