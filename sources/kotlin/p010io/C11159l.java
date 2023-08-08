package kotlin.p010io;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CoderResult;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nConsole.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Console.kt\nkotlin/io/LineReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,299:1\n1#2:300\n*E\n"})
/* renamed from: kotlin.io.l */
public final class C11159l {
    @C12579k

    /* renamed from: a */
    public static final C11159l f28355a = new C11159l();

    /* renamed from: b */
    public static final int f28356b = 32;

    /* renamed from: c */
    public static CharsetDecoder f28357c;

    /* renamed from: d */
    public static boolean f28358d;
    @C12579k

    /* renamed from: e */
    public static final byte[] f28359e;
    @C12579k

    /* renamed from: f */
    public static final char[] f28360f;
    @C12579k

    /* renamed from: g */
    public static final ByteBuffer f28361g;
    @C12579k

    /* renamed from: h */
    public static final CharBuffer f28362h;
    @C12579k

    /* renamed from: i */
    public static final StringBuilder f28363i = new StringBuilder();

    static {
        byte[] bArr = new byte[32];
        f28359e = bArr;
        char[] cArr = new char[32];
        f28360f = cArr;
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        Intrinsics.checkNotNullExpressionValue(wrap, "wrap(bytes)");
        f28361g = wrap;
        CharBuffer wrap2 = CharBuffer.wrap(cArr);
        Intrinsics.checkNotNullExpressionValue(wrap2, "wrap(chars)");
        f28362h = wrap2;
    }

    /* renamed from: a */
    public final int mo22624a() {
        ByteBuffer byteBuffer = f28361g;
        byteBuffer.compact();
        int position = byteBuffer.position();
        byteBuffer.position(0);
        return position;
    }

    /* renamed from: b */
    public final int mo22625b(boolean z) {
        while (true) {
            CharsetDecoder charsetDecoder = f28357c;
            if (charsetDecoder == null) {
                Intrinsics.throwUninitializedPropertyAccessException("decoder");
                charsetDecoder = null;
            }
            ByteBuffer byteBuffer = f28361g;
            CharBuffer charBuffer = f28362h;
            CoderResult decode = charsetDecoder.decode(byteBuffer, charBuffer, z);
            Intrinsics.checkNotNullExpressionValue(decode, "decoder.decode(byteBuf, charBuf, endOfInput)");
            if (decode.isError()) {
                mo22628e();
                decode.throwException();
            }
            int position = charBuffer.position();
            if (!decode.isOverflow()) {
                return position;
            }
            StringBuilder sb = f28363i;
            char[] cArr = f28360f;
            int i = position - 1;
            sb.append(cArr, 0, i);
            charBuffer.position(0);
            charBuffer.limit(32);
            charBuffer.put(cArr[i]);
        }
    }

    /* renamed from: c */
    public final int mo22626c(int i, int i2) {
        ByteBuffer byteBuffer = f28361g;
        byteBuffer.limit(i);
        f28362h.position(i2);
        int b = mo22625b(true);
        CharsetDecoder charsetDecoder = f28357c;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        byteBuffer.position(0);
        return b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (f28363i.length() != 0) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003c, code lost:
        r11 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r11 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003f, code lost:
        if (r11 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0041, code lost:
        if (r0 != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r2 != 0) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r11 = mo22626c(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0020, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0.charset(), (java.lang.Object) r12) == false) goto L_0x0022;
     */
    @org.jetbrains.annotations.C12580l
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.lang.String mo22627d(@org.jetbrains.annotations.C12579k java.io.InputStream r11, @org.jetbrains.annotations.C12579k java.nio.charset.Charset r12) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.lang.String r0 = "inputStream"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)     // Catch:{ all -> 0x00c9 }
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)     // Catch:{ all -> 0x00c9 }
            java.nio.charset.CharsetDecoder r0 = f28357c     // Catch:{ all -> 0x00c9 }
            r1 = 0
            if (r0 == 0) goto L_0x0022
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "decoder"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r0)     // Catch:{ all -> 0x00c9 }
            r0 = r1
        L_0x0018:
            java.nio.charset.Charset r0 = r0.charset()     // Catch:{ all -> 0x00c9 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r12)     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x0025
        L_0x0022:
            r10.mo22630g(r12)     // Catch:{ all -> 0x00c9 }
        L_0x0025:
            r12 = 0
            r0 = r12
            r2 = r0
        L_0x0028:
            int r3 = r11.read()     // Catch:{ all -> 0x00c9 }
            r4 = 32
            r5 = 10
            r6 = -1
            r7 = 1
            if (r3 != r6) goto L_0x004c
            java.lang.StringBuilder r11 = f28363i     // Catch:{ all -> 0x00c9 }
            int r11 = r11.length()     // Catch:{ all -> 0x00c9 }
            if (r11 != 0) goto L_0x003e
            r11 = r7
            goto L_0x003f
        L_0x003e:
            r11 = r12
        L_0x003f:
            if (r11 == 0) goto L_0x0047
            if (r0 != 0) goto L_0x0047
            if (r2 != 0) goto L_0x0047
            monitor-exit(r10)
            return r1
        L_0x0047:
            int r11 = r10.mo22626c(r0, r2)     // Catch:{ all -> 0x00c9 }
            goto L_0x007a
        L_0x004c:
            byte[] r6 = f28359e     // Catch:{ all -> 0x00c9 }
            int r8 = r0 + 1
            byte r9 = (byte) r3     // Catch:{ all -> 0x00c9 }
            r6[r0] = r9     // Catch:{ all -> 0x00c9 }
            if (r3 == r5) goto L_0x005e
            if (r8 == r4) goto L_0x005e
            boolean r0 = f28358d     // Catch:{ all -> 0x00c9 }
            if (r0 != 0) goto L_0x005c
            goto L_0x005e
        L_0x005c:
            r0 = r8
            goto L_0x0028
        L_0x005e:
            java.nio.ByteBuffer r0 = f28361g     // Catch:{ all -> 0x00c9 }
            r0.limit(r8)     // Catch:{ all -> 0x00c9 }
            java.nio.CharBuffer r3 = f28362h     // Catch:{ all -> 0x00c9 }
            r3.position(r2)     // Catch:{ all -> 0x00c9 }
            int r2 = r10.mo22625b(r12)     // Catch:{ all -> 0x00c9 }
            if (r2 <= 0) goto L_0x00c3
            char[] r3 = f28360f     // Catch:{ all -> 0x00c9 }
            int r6 = r2 + -1
            char r3 = r3[r6]     // Catch:{ all -> 0x00c9 }
            if (r3 != r5) goto L_0x00c3
            r0.position(r12)     // Catch:{ all -> 0x00c9 }
            r11 = r2
        L_0x007a:
            if (r11 <= 0) goto L_0x0092
            char[] r0 = f28360f     // Catch:{ all -> 0x00c9 }
            int r1 = r11 + -1
            char r1 = r0[r1]     // Catch:{ all -> 0x00c9 }
            if (r1 != r5) goto L_0x0092
            int r11 = r11 + -1
            if (r11 <= 0) goto L_0x0092
            int r1 = r11 + -1
            char r0 = r0[r1]     // Catch:{ all -> 0x00c9 }
            r1 = 13
            if (r0 != r1) goto L_0x0092
            int r11 = r11 + -1
        L_0x0092:
            java.lang.StringBuilder r0 = f28363i     // Catch:{ all -> 0x00c9 }
            int r1 = r0.length()     // Catch:{ all -> 0x00c9 }
            if (r1 != 0) goto L_0x009b
            goto L_0x009c
        L_0x009b:
            r7 = r12
        L_0x009c:
            if (r7 == 0) goto L_0x00a7
            java.lang.String r0 = new java.lang.String     // Catch:{ all -> 0x00c9 }
            char[] r1 = f28360f     // Catch:{ all -> 0x00c9 }
            r0.<init>(r1, r12, r11)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r10)
            return r0
        L_0x00a7:
            char[] r1 = f28360f     // Catch:{ all -> 0x00c9 }
            r0.append(r1, r12, r11)     // Catch:{ all -> 0x00c9 }
            java.lang.String r11 = r0.toString()     // Catch:{ all -> 0x00c9 }
            java.lang.String r1 = "sb.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r1)     // Catch:{ all -> 0x00c9 }
            int r1 = r0.length()     // Catch:{ all -> 0x00c9 }
            if (r1 <= r4) goto L_0x00be
            r10.mo22629f()     // Catch:{ all -> 0x00c9 }
        L_0x00be:
            r0.setLength(r12)     // Catch:{ all -> 0x00c9 }
            monitor-exit(r10)
            return r11
        L_0x00c3:
            int r0 = r10.mo22624a()     // Catch:{ all -> 0x00c9 }
            goto L_0x0028
        L_0x00c9:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.C11159l.mo22627d(java.io.InputStream, java.nio.charset.Charset):java.lang.String");
    }

    /* renamed from: e */
    public final void mo22628e() {
        CharsetDecoder charsetDecoder = f28357c;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        charsetDecoder.reset();
        f28361g.position(0);
        f28363i.setLength(0);
    }

    /* renamed from: f */
    public final void mo22629f() {
        StringBuilder sb = f28363i;
        sb.setLength(32);
        sb.trimToSize();
    }

    /* renamed from: g */
    public final void mo22630g(Charset charset) {
        CharsetDecoder newDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(newDecoder, "charset.newDecoder()");
        f28357c = newDecoder;
        ByteBuffer byteBuffer = f28361g;
        byteBuffer.clear();
        CharBuffer charBuffer = f28362h;
        charBuffer.clear();
        byteBuffer.put((byte) 10);
        byteBuffer.flip();
        CharsetDecoder charsetDecoder = f28357c;
        if (charsetDecoder == null) {
            Intrinsics.throwUninitializedPropertyAccessException("decoder");
            charsetDecoder = null;
        }
        boolean z = false;
        charsetDecoder.decode(byteBuffer, charBuffer, false);
        if (charBuffer.position() == 1 && charBuffer.get(0) == 10) {
            z = true;
        }
        f28358d = z;
        mo22628e();
    }
}
