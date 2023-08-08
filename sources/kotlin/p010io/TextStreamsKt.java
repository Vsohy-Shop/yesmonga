package kotlin.p010io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.C11559m;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.C11602d;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "TextStreamsKt")
@C11363r0({"SMAP\nReadWrite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,151:1\n52#1:152\n1#2:153\n1#2:156\n1295#3,2:154\n*S KotlinDebug\n*F\n+ 1 ReadWrite.kt\nkotlin/io/TextStreamsKt\n*L\n33#1:152\n33#1:153\n33#1:154,2\n*E\n"})
/* renamed from: kotlin.io.TextStreamsKt */
public final class TextStreamsKt {
    @C11110f
    /* renamed from: a */
    public static final BufferedReader m42906a(Reader reader, int i) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i);
    }

    @C11110f
    /* renamed from: b */
    public static final BufferedWriter m42907b(Writer writer, int i) {
        Intrinsics.checkNotNullParameter(writer, "<this>");
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer, i);
    }

    /* renamed from: c */
    public static /* synthetic */ BufferedReader m42908c(Reader reader, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(reader, "<this>");
        if (reader instanceof BufferedReader) {
            return (BufferedReader) reader;
        }
        return new BufferedReader(reader, i);
    }

    /* renamed from: d */
    public static /* synthetic */ BufferedWriter m42909d(Writer writer, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(writer, "<this>");
        if (writer instanceof BufferedWriter) {
            return (BufferedWriter) writer;
        }
        return new BufferedWriter(writer, i);
    }

    /* renamed from: e */
    public static final long m42910e(@C12579k Reader reader, @C12579k Writer writer, int i) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        Intrinsics.checkNotNullParameter(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }

    /* renamed from: f */
    public static /* synthetic */ long m42911f(Reader reader, Writer writer, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m42910e(reader, writer, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        kotlin.p010io.C11133b.m42950a(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003c, code lost:
        throw r0;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void m42912g(@org.jetbrains.annotations.C12579k java.io.Reader r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super java.lang.String, kotlin.C11079d2> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r2 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r1)
            r2 = r0
        L_0x0019:
            kotlin.sequences.m r0 = m42913h(r2)     // Catch:{ all -> 0x0036 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0036 }
        L_0x0021:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x0036 }
            if (r1 == 0) goto L_0x002f
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x0036 }
            r3.invoke(r1)     // Catch:{ all -> 0x0036 }
            goto L_0x0021
        L_0x002f:
            kotlin.d2 r3 = kotlin.C11079d2.f28267a     // Catch:{ all -> 0x0036 }
            r3 = 0
            kotlin.p010io.C11133b.m42950a(r2, r3)
            return
        L_0x0036:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r0 = move-exception
            kotlin.p010io.C11133b.m42950a(r2, r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.TextStreamsKt.m42912g(java.io.Reader, kotlin.jvm.functions.l):void");
    }

    @C12579k
    /* renamed from: h */
    public static final C11559m<String> m42913h(@C12579k BufferedReader bufferedReader) {
        Intrinsics.checkNotNullParameter(bufferedReader, "<this>");
        return SequencesKt__SequencesKt.m44589f(new C11160m(bufferedReader));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        kotlin.p010io.C11133b.m42950a(r2, r0);
     */
    @org.jetbrains.annotations.C12579k
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] m42914i(@org.jetbrains.annotations.C12579k java.net.URL r2) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.io.InputStream r2 = com.google.firebase.perf.network.FirebasePerfUrlConnection.openStream(r2)
            java.lang.String r0 = "it"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)     // Catch:{ all -> 0x0017 }
            byte[] r0 = kotlin.p010io.C11131a.m42936p(r2)     // Catch:{ all -> 0x0017 }
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r2, r1)
            return r0
        L_0x0017:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0019 }
        L_0x0019:
            r1 = move-exception
            kotlin.p010io.C11133b.m42950a(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.TextStreamsKt.m42914i(java.net.URL):byte[]");
    }

    @C12579k
    /* renamed from: j */
    public static final List<String> m42915j(@C12579k Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        ArrayList arrayList = new ArrayList();
        m42912g(reader, new TextStreamsKt$readLines$1(arrayList));
        return arrayList;
    }

    @C12579k
    /* renamed from: k */
    public static final String m42916k(@C12579k Reader reader) {
        Intrinsics.checkNotNullParameter(reader, "<this>");
        StringWriter stringWriter = new StringWriter();
        m42911f(reader, stringWriter, 0, 2, (Object) null);
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    @C11110f
    /* renamed from: l */
    public static final String m42917l(URL url, Charset charset) {
        Intrinsics.checkNotNullParameter(url, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(m42914i(url), charset);
    }

    /* renamed from: m */
    public static /* synthetic */ String m42918m(URL url, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(url, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new String(m42914i(url), charset);
    }

    @C11110f
    /* renamed from: n */
    public static final StringReader m42919n(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        return new StringReader(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0030, code lost:
        kotlin.jvm.internal.C11322b0.m43481d(1);
        kotlin.p010io.C11133b.m42950a(r2, r3);
        kotlin.jvm.internal.C11322b0.m43480c(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        throw r1;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> T m42920o(@org.jetbrains.annotations.C12579k java.io.Reader r2, @org.jetbrains.annotations.C12579k kotlin.jvm.functions.C11300l<? super kotlin.sequences.C11559m<java.lang.String>, ? extends T> r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            boolean r0 = r2 instanceof java.io.BufferedReader
            if (r0 == 0) goto L_0x0011
            java.io.BufferedReader r2 = (java.io.BufferedReader) r2
            goto L_0x0019
        L_0x0011:
            java.io.BufferedReader r0 = new java.io.BufferedReader
            r1 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r1)
            r2 = r0
        L_0x0019:
            r0 = 1
            kotlin.sequences.m r1 = m42913h(r2)     // Catch:{ all -> 0x002d }
            java.lang.Object r3 = r3.invoke(r1)     // Catch:{ all -> 0x002d }
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            r1 = 0
            kotlin.p010io.C11133b.m42950a(r2, r1)
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            return r3
        L_0x002d:
            r3 = move-exception
            throw r3     // Catch:{ all -> 0x002f }
        L_0x002f:
            r1 = move-exception
            kotlin.jvm.internal.C11322b0.m43481d(r0)
            kotlin.p010io.C11133b.m42950a(r2, r3)
            kotlin.jvm.internal.C11322b0.m43480c(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.p010io.TextStreamsKt.m42920o(java.io.Reader, kotlin.jvm.functions.l):java.lang.Object");
    }
}
