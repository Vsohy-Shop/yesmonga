package kotlin.p010io.path;

import com.urbanairship.push.notifications.C9530r;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import kotlin.C11097g2;
import kotlin.C11665v0;
import kotlin.internal.C11110f;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.C11602d;

@C11363r0({"SMAP\nPathReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 4 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,326:1\n1#2:327\n1#2:329\n52#3:328\n1295#4,2:330\n*S KotlinDebug\n*F\n+ 1 PathReadWrite.kt\nkotlin/io/path/PathsKt__PathReadWriteKt\n*L\n202#1:329\n202#1:328\n202#1:330,2\n*E\n"})
/* renamed from: kotlin.io.path.w0 */
public class C11262w0 {
    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: A */
    public static final Path m43329A(Path path, C11559m<? extends CharSequence> mVar, Charset charset, OpenOption... openOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(mVar, C9530r.f26051j);
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        Path a = Files.write(path, SequencesKt___SequencesKt.m44668N(mVar), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "write(this, lines.asIterable(), charset, *options)");
        return a;
    }

    /* renamed from: B */
    public static /* synthetic */ Path m43330B(Path path, Iterable iterable, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(iterable, C9530r.f26051j);
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        Path a = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "write(this, lines, charset, *options)");
        return a;
    }

    /* renamed from: C */
    public static /* synthetic */ Path m43331C(Path path, C11559m mVar, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(mVar, C9530r.f26051j);
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        Path a = Files.write(path, SequencesKt___SequencesKt.m44668N(mVar), charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "write(this, lines.asIterable(), charset, *options)");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0037, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0034, code lost:
        kotlin.p010io.C11133b.m42950a(r4, r1);
     */
    @kotlin.C11097g2(markerClass = {kotlin.p010io.path.C11241r.class})
    @kotlin.C11665v0(version = "1.5")
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m43332D(@org.jetbrains.annotations.C12579k java.nio.file.Path r1, @org.jetbrains.annotations.C12579k java.lang.CharSequence r2, @org.jetbrains.annotations.C12579k java.nio.charset.Charset r3, @org.jetbrains.annotations.C12579k java.nio.file.OpenOption... r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "options"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            int r0 = r4.length
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
            java.nio.file.OpenOption[] r4 = (java.nio.file.OpenOption[]) r4
            java.io.OutputStream r1 = java.nio.file.Files.newOutputStream(r1, r4)
            java.lang.String r4 = "newOutputStream(this, *options)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r4)
            java.io.OutputStreamWriter r4 = new java.io.OutputStreamWriter
            r4.<init>(r1, r3)
            r4.append(r2)     // Catch:{ all -> 0x0031 }
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r4, r1)
            return
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            kotlin.p010io.C11133b.m42950a(r4, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11262w0.m43332D(java.nio.file.Path, java.lang.CharSequence, java.nio.charset.Charset, java.nio.file.OpenOption[]):void");
    }

    /* renamed from: E */
    public static /* synthetic */ void m43333E(Path path, CharSequence charSequence, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C11602d.f28868b;
        }
        m43332D(path, charSequence, charset, openOptionArr);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: F */
    public static final OutputStreamWriter m43334F(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    /* renamed from: G */
    public static /* synthetic */ OutputStreamWriter m43335G(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        return new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: a */
    public static final void m43336a(Path path, byte[] bArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "array");
        Path unused = Files.write(path, bArr, new OpenOption[]{StandardOpenOption.APPEND});
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: b */
    public static final Path m43337b(Path path, Iterable<? extends CharSequence> iterable, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(iterable, C9530r.f26051j);
        Intrinsics.checkNotNullParameter(charset, "charset");
        Path a = Files.write(path, iterable, charset, new OpenOption[]{StandardOpenOption.APPEND});
        Intrinsics.checkNotNullExpressionValue(a, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: c */
    public static final Path m43338c(Path path, C11559m<? extends CharSequence> mVar, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(mVar, C9530r.f26051j);
        Intrinsics.checkNotNullParameter(charset, "charset");
        Path a = Files.write(path, SequencesKt___SequencesKt.m44668N(mVar), charset, new OpenOption[]{StandardOpenOption.APPEND});
        Intrinsics.checkNotNullExpressionValue(a, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return a;
    }

    /* renamed from: d */
    public static /* synthetic */ Path m43339d(Path path, Iterable iterable, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(iterable, C9530r.f26051j);
        Intrinsics.checkNotNullParameter(charset, "charset");
        Path a = Files.write(path, iterable, charset, new OpenOption[]{StandardOpenOption.APPEND});
        Intrinsics.checkNotNullExpressionValue(a, "write(this, lines, chars…tandardOpenOption.APPEND)");
        return a;
    }

    /* renamed from: e */
    public static /* synthetic */ Path m43340e(Path path, C11559m mVar, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(mVar, C9530r.f26051j);
        Intrinsics.checkNotNullParameter(charset, "charset");
        Path a = Files.write(path, SequencesKt___SequencesKt.m44668N(mVar), charset, new OpenOption[]{StandardOpenOption.APPEND});
        Intrinsics.checkNotNullExpressionValue(a, "write(this, lines.asIter…tandardOpenOption.APPEND)");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0035, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0032, code lost:
        kotlin.p010io.C11133b.m42950a(r0, r3);
     */
    @kotlin.C11097g2(markerClass = {kotlin.p010io.path.C11241r.class})
    @kotlin.C11665v0(version = "1.5")
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m43341f(@org.jetbrains.annotations.C12579k java.nio.file.Path r3, @org.jetbrains.annotations.C12579k java.lang.CharSequence r4, @org.jetbrains.annotations.C12579k java.nio.charset.Charset r5) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "text"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = 1
            java.nio.file.OpenOption[] r0 = new java.nio.file.OpenOption[r0]
            r1 = 0
            java.nio.file.StandardOpenOption r2 = java.nio.file.StandardOpenOption.APPEND
            r0[r1] = r2
            java.io.OutputStream r3 = java.nio.file.Files.newOutputStream(r3, r0)
            java.lang.String r0 = "newOutputStream(this, StandardOpenOption.APPEND)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r0)
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter
            r0.<init>(r3, r5)
            r0.append(r4)     // Catch:{ all -> 0x002f }
            r3 = 0
            kotlin.p010io.C11133b.m42950a(r0, r3)
            return
        L_0x002f:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r4 = move-exception
            kotlin.p010io.C11133b.m42950a(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11262w0.m43341f(java.nio.file.Path, java.lang.CharSequence, java.nio.charset.Charset):void");
    }

    /* renamed from: g */
    public static /* synthetic */ void m43342g(Path path, CharSequence charSequence, Charset charset, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            charset = C11602d.f28868b;
        }
        m43341f(path, charSequence, charset);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: h */
    public static final BufferedReader m43343h(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* renamed from: i */
    public static /* synthetic */ BufferedReader m43344i(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C11602d.f28868b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        return new BufferedReader(new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: j */
    public static final BufferedWriter m43345j(Path path, Charset charset, int i, OpenOption... openOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* renamed from: k */
    public static /* synthetic */ BufferedWriter m43346k(Path path, Charset charset, int i, OpenOption[] openOptionArr, int i2, Object obj) throws IOException {
        if ((i2 & 1) != 0) {
            charset = C11602d.f28868b;
        }
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        return new BufferedWriter(new OutputStreamWriter(Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r2, r4);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0048, code lost:
        throw r0;
     */
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.5")
    @kotlin.C11097g2(markerClass = {kotlin.p010io.path.C11241r.class})
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m43347l(java.nio.file.Path r2, java.nio.charset.Charset r3, kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.io.BufferedReader r2 = java.nio.file.Files.newBufferedReader(r2, r3)
            java.lang.String r3 = "newBufferedReader(this, charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r3 = 1
            kotlin.sequences.m r0 = kotlin.p010io.TextStreamsKt.m42913h(r2)     // Catch:{ all -> 0x003c }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x003c }
        L_0x0021:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x003c }
            r4.invoke(r1)     // Catch:{ all -> 0x003c }
            goto L_0x0021
        L_0x002f:
            kotlin.d2 r4 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x003c }
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            r4 = 0
            kotlin.p010io.C11133b.m42950a(r2, r4)
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            return
        L_0x003c:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r3)
            kotlin.p010io.C11133b.m42950a(r2, r4)
            kotlin.jvm.internal.C11322b0.m43480c(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11262w0.m43347l(java.nio.file.Path, java.nio.charset.Charset, kotlin.jvm.functions.l):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0044, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r0, r1);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004d, code lost:
        throw r2;
     */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m43348m(java.nio.file.Path r0, java.nio.charset.Charset r1, kotlin.jvm.functions.C11300l r2, int r3, java.lang.Object r4) throws java.io.IOException {
        /*
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0006
            java.nio.charset.Charset r1 = kotlin.text.C11602d.f28868b
        L_0x0006:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r0, r1)
            java.lang.String r1 = "newBufferedReader(this, charset)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            kotlin.sequences.m r1 = kotlin.p010io.TextStreamsKt.m42913h(r0)     // Catch:{ all -> 0x0041 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0041 }
        L_0x0026:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0041 }
            if (r3 == 0) goto L_0x0034
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0041 }
            r2.invoke(r3)     // Catch:{ all -> 0x0041 }
            goto L_0x0026
        L_0x0034:
            kotlin.d2 r1 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0041 }
            kotlin.jvm.internal.C11322b0.m43481d(r4)
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r0, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r4)
            return
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r2 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r4)
            kotlin.p010io.C11133b.m42950a(r0, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11262w0.m43348m(java.nio.file.Path, java.nio.charset.Charset, kotlin.jvm.functions.l, int, java.lang.Object):void");
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: n */
    public static final InputStream m43349n(Path path, OpenOption... openOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        InputStream a = Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "newInputStream(this, *options)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: o */
    public static final OutputStream m43350o(Path path, OpenOption... openOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        OutputStream a = Files.newOutputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "newOutputStream(this, *options)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: p */
    public static final byte[] m43351p(Path path) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        byte[] a = Files.readAllBytes(path);
        Intrinsics.checkNotNullExpressionValue(a, "readAllBytes(this)");
        return a;
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: q */
    public static final List<String> m43352q(Path path, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        List<String> a = Files.readAllLines(path, charset);
        Intrinsics.checkNotNullExpressionValue(a, "readAllLines(this, charset)");
        return a;
    }

    /* renamed from: r */
    public static /* synthetic */ List m43353r(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        List a = Files.readAllLines(path, charset);
        Intrinsics.checkNotNullExpressionValue(a, "readAllLines(this, charset)");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002b, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0027, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0028, code lost:
        kotlin.p010io.C11133b.m42950a(r2, r3);
     */
    @kotlin.C11665v0(version = "1.5")
    @kotlin.C11097g2(markerClass = {kotlin.p010io.path.C11241r.class})
    @org.jetbrains.annotations.C12579k
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m43354s(@org.jetbrains.annotations.C12579k java.nio.file.Path r3, @org.jetbrains.annotations.C12579k java.nio.charset.Charset r4) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            r0 = 0
            java.nio.file.OpenOption[] r1 = new java.nio.file.OpenOption[r0]
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.nio.file.OpenOption[] r0 = (java.nio.file.OpenOption[]) r0
            java.io.InputStream r3 = java.nio.file.Files.newInputStream(r3, r0)
            r2.<init>(r3, r4)
            java.lang.String r3 = kotlin.p010io.TextStreamsKt.m42916k(r2)     // Catch:{ all -> 0x0025 }
            r4 = 0
            kotlin.p010io.C11133b.m42950a(r2, r4)
            return r3
        L_0x0025:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r4 = move-exception
            kotlin.p010io.C11133b.m42950a(r2, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11262w0.m43354s(java.nio.file.Path, java.nio.charset.Charset):java.lang.String");
    }

    /* renamed from: t */
    public static /* synthetic */ String m43355t(Path path, Charset charset, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        return m43354s(path, charset);
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: u */
    public static final InputStreamReader m43356u(Path path, Charset charset, OpenOption... openOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    /* renamed from: v */
    public static /* synthetic */ InputStreamReader m43357v(Path path, Charset charset, OpenOption[] openOptionArr, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        return new InputStreamReader(Files.newInputStream(path, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length)), charset);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002f, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r1, r3);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    @kotlin.internal.C11110f
    @kotlin.C11665v0(version = "1.5")
    @kotlin.C11097g2(markerClass = {kotlin.p010io.path.C11241r.class})
    /* renamed from: w */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m43358w(java.nio.file.Path r1, java.nio.charset.Charset r2, kotlin.jvm.functions.C11300l<? super kotlin.sequences.C11559m<java.lang.String>, ? extends T> r3) throws java.io.IOException {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.io.BufferedReader r1 = java.nio.file.Files.newBufferedReader(r1, r2)
            r2 = 1
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)     // Catch:{ all -> 0x002c }
            kotlin.sequences.m r0 = kotlin.p010io.TextStreamsKt.m42913h(r1)     // Catch:{ all -> 0x002c }
            java.lang.Object r3 = r3.invoke(r0)     // Catch:{ all -> 0x002c }
            kotlin.jvm.internal.C11322b0.m43481d(r2)
            r0 = 0
            kotlin.p010io.C11133b.m42950a(r1, r0)
            kotlin.jvm.internal.C11322b0.m43480c(r2)
            return r3
        L_0x002c:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002e }
        L_0x002e:
            r0 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r2)
            kotlin.p010io.C11133b.m42950a(r1, r3)
            kotlin.jvm.internal.C11322b0.m43480c(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11262w0.m43358w(java.nio.file.Path, java.nio.charset.Charset, kotlin.jvm.functions.l):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r0, r1);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        throw r2;
     */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object m43359x(java.nio.file.Path r0, java.nio.charset.Charset r1, kotlin.jvm.functions.C11300l r2, int r3, java.lang.Object r4) throws java.io.IOException {
        /*
            r4 = 1
            r3 = r3 & r4
            if (r3 == 0) goto L_0x0006
            java.nio.charset.Charset r1 = kotlin.text.C11602d.f28868b
        L_0x0006:
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            java.lang.String r3 = "charset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r3)
            java.lang.String r3 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.io.BufferedReader r0 = java.nio.file.Files.newBufferedReader(r0, r1)
            java.lang.String r1 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)     // Catch:{ all -> 0x0031 }
            kotlin.sequences.m r1 = kotlin.p010io.TextStreamsKt.m42913h(r0)     // Catch:{ all -> 0x0031 }
            java.lang.Object r1 = r2.invoke(r1)     // Catch:{ all -> 0x0031 }
            kotlin.jvm.internal.C11322b0.m43481d(r4)
            r2 = 0
            kotlin.p010io.C11133b.m42950a(r0, r2)
            kotlin.jvm.internal.C11322b0.m43480c(r4)
            return r1
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r2 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r4)
            kotlin.p010io.C11133b.m42950a(r0, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r4)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.path.C11262w0.m43359x(java.nio.file.Path, java.nio.charset.Charset, kotlin.jvm.functions.l, int, java.lang.Object):java.lang.Object");
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: y */
    public static final void m43360y(Path path, byte[] bArr, OpenOption... openOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(bArr, "array");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        Path unused = Files.write(path, bArr, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
    }

    @C11110f
    @C11665v0(version = "1.5")
    @C11097g2(markerClass = {C11241r.class})
    /* renamed from: z */
    public static final Path m43361z(Path path, Iterable<? extends CharSequence> iterable, Charset charset, OpenOption... openOptionArr) throws IOException {
        Intrinsics.checkNotNullParameter(path, "<this>");
        Intrinsics.checkNotNullParameter(iterable, C9530r.f26051j);
        Intrinsics.checkNotNullParameter(charset, "charset");
        Intrinsics.checkNotNullParameter(openOptionArr, "options");
        Path a = Files.write(path, iterable, charset, (OpenOption[]) Arrays.copyOf(openOptionArr, openOptionArr.length));
        Intrinsics.checkNotNullExpressionValue(a, "write(this, lines, charset, *options)");
        return a;
    }
}
