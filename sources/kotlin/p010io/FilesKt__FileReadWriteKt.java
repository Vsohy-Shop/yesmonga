package kotlin.p010io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.C11079d2;
import kotlin.internal.C11110f;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nFileReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n231#1:234\n1#2:233\n1#2:235\n*S KotlinDebug\n*F\n+ 1 FileReadWrite.kt\nkotlin/io/FilesKt__FileReadWriteKt\n*L\n230#1:234\n230#1:235\n*E\n"})
/* renamed from: kotlin.io.FilesKt__FileReadWriteKt */
public class FilesKt__FileReadWriteKt extends C11157j {
    @C11110f
    /* renamed from: A */
    public static final InputStreamReader m42846A(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    /* renamed from: B */
    public static /* synthetic */ InputStreamReader m42847B(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(new FileInputStream(file), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r0, r3);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        throw r4;
     */
    /* renamed from: C */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m42848C(@org.jetbrains.annotations.C12579k java.io.File r2, @org.jetbrains.annotations.C12579k java.nio.charset.Charset r3, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super kotlin.sequences.C11559m<java.lang.String>, ? extends T> r4) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            boolean r2 = r0 instanceof java.io.BufferedReader
            if (r2 == 0) goto L_0x0020
            java.io.BufferedReader r0 = (java.io.BufferedReader) r0
            goto L_0x0028
        L_0x0020:
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r3 = 8192(0x2000, float:1.14794E-41)
            r2.<init>(r0, r3)
            r0 = r2
        L_0x0028:
            r2 = 1
            kotlin.sequences.m r3 = kotlin.p010io.TextStreamsKt.m42913h(r0)     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r4.invoke(r3)     // Catch:{ all -> 0x003c }
            kotlin.jvm.internal.C11322b0.m43481d(r2)
            r4 = 0
            kotlin.p010io.C11133b.m42950a(r0, r4)
            kotlin.jvm.internal.C11322b0.m43480c(r2)
            return r3
        L_0x003c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x003e }
        L_0x003e:
            r4 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r2)
            kotlin.p010io.C11133b.m42950a(r0, r3)
            kotlin.jvm.internal.C11322b0.m43480c(r2)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.FilesKt__FileReadWriteKt.m42848C(java.io.File, java.nio.charset.Charset, kotlin.jvm.functions.l):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0035, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r4, r1);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        throw r2;
     */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m42849D(java.io.File r1, java.nio.charset.Charset r2, kotlin.jvm.functions.C11300l r3, int r4, java.lang.Object r5) {
        /*
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0006
            java.nio.charset.Charset r2 = kotlin.text.C11602d.f28868b
        L_0x0006:
            java.io.InputStreamReader r4 = new java.io.InputStreamReader
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
            r4.<init>(r0, r2)
            boolean r1 = r4 instanceof java.io.BufferedReader
            if (r1 == 0) goto L_0x0017
            java.io.BufferedReader r4 = (java.io.BufferedReader) r4
            goto L_0x001f
        L_0x0017:
            java.io.BufferedReader r1 = new java.io.BufferedReader
            r2 = 8192(0x2000, float:1.14794E-41)
            r1.<init>(r4, r2)
            r4 = r1
        L_0x001f:
            kotlin.sequences.m r1 = kotlin.p010io.TextStreamsKt.m42913h(r4)     // Catch:{ all -> 0x0032 }
            java.lang.Object r1 = r3.invoke(r1)     // Catch:{ all -> 0x0032 }
            kotlin.jvm.internal.C11322b0.m43481d(r5)
            r2 = 0
            kotlin.p010io.C11133b.m42950a(r4, r2)
            kotlin.jvm.internal.C11322b0.m43480c(r5)
            return r1
        L_0x0032:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0034 }
        L_0x0034:
            r2 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r5)
            kotlin.p010io.C11133b.m42950a(r4, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.FilesKt__FileReadWriteKt.m42849D(java.io.File, java.nio.charset.Charset, kotlin.jvm.functions.l, int, java.lang.Object):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r1);
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m42850E(@org.jetbrains.annotations.C12579k java.io.File r1, @org.jetbrains.annotations.C12579k byte[] r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r0.<init>(r1)
            r0.write(r2)     // Catch:{ all -> 0x0019 }
            kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0019 }
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r0, r1)
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.FilesKt__FileReadWriteKt.m42850E(java.io.File, byte[]):void");
    }

    /* renamed from: F */
    public static final void m42851F(@C12579k File file, @C12579k String str, @C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        m42850E(file, bytes);
    }

    /* renamed from: G */
    public static /* synthetic */ void m42852G(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C11602d.f28868b;
        }
        m42851F(file, str, charset);
    }

    @C11110f
    /* renamed from: H */
    public static final OutputStreamWriter m42853H(File file, Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    /* renamed from: I */
    public static /* synthetic */ OutputStreamWriter m42854I(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(new FileOutputStream(file), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001d, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r2);
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m42855g(@org.jetbrains.annotations.C12579k java.io.File r2, @org.jetbrains.annotations.C12579k byte[] r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            r1 = 1
            r0.<init>(r2, r1)
            r0.write(r3)     // Catch:{ all -> 0x001a }
            kotlin.d2 r2 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x001a }
            r2 = 0
            kotlin.p010io.C11133b.m42950a(r0, r2)
            return
        L_0x001a:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001c }
        L_0x001c:
            r3 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.FilesKt__FileReadWriteKt.m42855g(java.io.File, byte[]):void");
    }

    /* renamed from: h */
    public static final void m42856h(@C12579k File file, @C12579k String str, @C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(str, "text");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        m42855g(file, bytes);
    }

    /* renamed from: i */
    public static /* synthetic */ void m42857i(File file, String str, Charset charset, int i, Object obj) {
        if ((i & 2) != 0) {
            charset = C11602d.f28868b;
        }
        m42856h(file, str, charset);
    }

    @C11110f
    /* renamed from: j */
    public static final BufferedReader m42858j(File file, Charset charset, int i) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        if (inputStreamReader instanceof BufferedReader) {
            return (BufferedReader) inputStreamReader;
        }
        return new BufferedReader(inputStreamReader, i);
    }

    /* renamed from: k */
    public static /* synthetic */ BufferedReader m42859k(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C11602d.f28868b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        if (inputStreamReader instanceof BufferedReader) {
            return (BufferedReader) inputStreamReader;
        }
        return new BufferedReader(inputStreamReader, i);
    }

    @C11110f
    /* renamed from: l */
    public static final BufferedWriter m42860l(File file, Charset charset, int i) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            return (BufferedWriter) outputStreamWriter;
        }
        return new BufferedWriter(outputStreamWriter, i);
    }

    /* renamed from: m */
    public static /* synthetic */ BufferedWriter m42861m(File file, Charset charset, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charset = C11602d.f28868b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            return (BufferedWriter) outputStreamWriter;
        }
        return new BufferedWriter(outputStreamWriter, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0032, code lost:
        throw r2;
     */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m42862n(@org.jetbrains.annotations.C12579k java.io.File r1, int r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11304p<? super byte[], ? super java.lang.Integer, kotlin.C11079d2> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            r0 = 512(0x200, float:7.175E-43)
            int r2 = kotlin.ranges.C11479u.m44447u(r2, r0)
            byte[] r2 = new byte[r2]
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r1)
        L_0x0017:
            int r1 = r0.read(r2)     // Catch:{ all -> 0x002c }
            if (r1 > 0) goto L_0x0024
            kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x002c }
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r0, r1)
            return
        L_0x0024:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x002c }
            r3.invoke(r2, r1)     // Catch:{ all -> 0x002c }
            goto L_0x0017
        L_0x002c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002e }
        L_0x002e:
            r2 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.FilesKt__FileReadWriteKt.m42862n(java.io.File, int, kotlin.jvm.functions.p):void");
    }

    /* renamed from: o */
    public static final void m42863o(@C12579k File file, @C12579k C11304p<? super byte[], ? super Integer, C11079d2> pVar) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(pVar, "action");
        m42862n(file, 4096, pVar);
    }

    /* renamed from: p */
    public static final void m42864p(@C12579k File file, @C12579k Charset charset, @C12579k C11300l<? super String, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(lVar, "action");
        TextStreamsKt.m42912g(new BufferedReader(new InputStreamReader(new FileInputStream(file), charset)), lVar);
    }

    /* renamed from: q */
    public static /* synthetic */ void m42865q(File file, Charset charset, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        m42864p(file, charset, lVar);
    }

    @C11110f
    /* renamed from: r */
    public static final FileInputStream m42866r(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new FileInputStream(file);
    }

    @C11110f
    /* renamed from: s */
    public static final FileOutputStream m42867s(File file) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        return new FileOutputStream(file);
    }

    @C11110f
    /* renamed from: t */
    public static final PrintWriter m42868t(File file, Charset charset) {
        BufferedWriter bufferedWriter;
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            bufferedWriter = (BufferedWriter) outputStreamWriter;
        } else {
            bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
        }
        return new PrintWriter(bufferedWriter);
    }

    /* renamed from: u */
    public static /* synthetic */ PrintWriter m42869u(File file, Charset charset, int i, Object obj) {
        BufferedWriter bufferedWriter;
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            bufferedWriter = (BufferedWriter) outputStreamWriter;
        } else {
            bufferedWriter = new BufferedWriter(outputStreamWriter, 8192);
        }
        return new PrintWriter(bufferedWriter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a7, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a8, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ab, code lost:
        throw r1;
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m42870v(@org.jetbrains.annotations.C12579k java.io.File r10) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r10)
            long r1 = r10.length()     // Catch:{ all -> 0x00a5 }
            r3 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r4 = "File "
            if (r3 > 0) goto L_0x0083
            int r1 = (int) r1
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x00a5 }
            r3 = 0
            r5 = r1
            r6 = r3
        L_0x001d:
            if (r5 <= 0) goto L_0x0028
            int r7 = r0.read(r2, r6, r5)     // Catch:{ all -> 0x00a5 }
            if (r7 < 0) goto L_0x0028
            int r5 = r5 - r7
            int r6 = r6 + r7
            goto L_0x001d
        L_0x0028:
            java.lang.String r7 = "copyOf(this, newSize)"
            r8 = 0
            if (r5 <= 0) goto L_0x0035
            byte[] r2 = java.util.Arrays.copyOf(r2, r6)     // Catch:{ all -> 0x00a5 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)     // Catch:{ all -> 0x00a5 }
            goto L_0x0065
        L_0x0035:
            int r5 = r0.read()     // Catch:{ all -> 0x00a5 }
            r6 = -1
            if (r5 != r6) goto L_0x003d
            goto L_0x0065
        L_0x003d:
            kotlin.io.f r6 = new kotlin.io.f     // Catch:{ all -> 0x00a5 }
            r9 = 8193(0x2001, float:1.1481E-41)
            r6.<init>(r9)     // Catch:{ all -> 0x00a5 }
            r6.write(r5)     // Catch:{ all -> 0x00a5 }
            r5 = 2
            kotlin.p010io.C11131a.m42932l(r0, r6, r3, r5, r8)     // Catch:{ all -> 0x00a5 }
            int r5 = r6.size()     // Catch:{ all -> 0x00a5 }
            int r5 = r5 + r1
            if (r5 < 0) goto L_0x0069
            byte[] r10 = r6.mo22603a()     // Catch:{ all -> 0x00a5 }
            byte[] r2 = java.util.Arrays.copyOf(r2, r5)     // Catch:{ all -> 0x00a5 }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r7)     // Catch:{ all -> 0x00a5 }
            int r4 = r6.size()     // Catch:{ all -> 0x00a5 }
            byte[] r2 = kotlin.collections.C10956m.m41147W0(r10, r2, r1, r3, r4)     // Catch:{ all -> 0x00a5 }
        L_0x0065:
            kotlin.p010io.C11133b.m42950a(r0, r8)
            return r2
        L_0x0069:
            java.lang.OutOfMemoryError r1 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r2.<init>()     // Catch:{ all -> 0x00a5 }
            r2.append(r4)     // Catch:{ all -> 0x00a5 }
            r2.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " is too big to fit in memory."
            r2.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r2.toString()     // Catch:{ all -> 0x00a5 }
            r1.<init>(r10)     // Catch:{ all -> 0x00a5 }
            throw r1     // Catch:{ all -> 0x00a5 }
        L_0x0083:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError     // Catch:{ all -> 0x00a5 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a5 }
            r5.<init>()     // Catch:{ all -> 0x00a5 }
            r5.append(r4)     // Catch:{ all -> 0x00a5 }
            r5.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " is too big ("
            r5.append(r10)     // Catch:{ all -> 0x00a5 }
            r5.append(r1)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = " bytes) to fit in memory."
            r5.append(r10)     // Catch:{ all -> 0x00a5 }
            java.lang.String r10 = r5.toString()     // Catch:{ all -> 0x00a5 }
            r3.<init>(r10)     // Catch:{ all -> 0x00a5 }
            throw r3     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r10 = move-exception
            throw r10     // Catch:{ all -> 0x00a7 }
        L_0x00a7:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.FilesKt__FileReadWriteKt.m42870v(java.io.File):byte[]");
    }

    @C12579k
    /* renamed from: w */
    public static final List<String> m42871w(@C12579k File file, @C12579k Charset charset) {
        Intrinsics.checkNotNullParameter(file, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        ArrayList arrayList = new ArrayList();
        m42864p(file, charset, new FilesKt__FileReadWriteKt$readLines$1(arrayList));
        return arrayList;
    }

    /* renamed from: x */
    public static /* synthetic */ List m42872x(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        return m42871w(file, charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0020, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r2);
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m42873y(@org.jetbrains.annotations.C12579k java.io.File r2, @org.jetbrains.annotations.C12579k java.nio.charset.Charset r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r2)
            r0.<init>(r1, r3)
            java.lang.String r2 = kotlin.p010io.TextStreamsKt.m42916k(r0)     // Catch:{ all -> 0x001d }
            r3 = 0
            kotlin.p010io.C11133b.m42950a(r0, r3)
            return r2
        L_0x001d:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x001f }
        L_0x001f:
            r3 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.FilesKt__FileReadWriteKt.m42873y(java.io.File, java.nio.charset.Charset):java.lang.String");
    }

    /* renamed from: z */
    public static /* synthetic */ String m42874z(File file, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        return m42873y(file, charset);
    }
}
