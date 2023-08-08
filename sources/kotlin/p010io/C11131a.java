package kotlin.p010io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.NoSuchElementException;
import kotlin.C11395k;
import kotlin.C11398l;
import kotlin.C11587t0;
import kotlin.C11665v0;
import kotlin.collections.C10970p;
import kotlin.internal.C11110f;
import kotlin.jvm.C11314h;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11602d;
import org.jetbrains.annotations.C12579k;

@C11314h(name = "ByteStreamsKt")
/* renamed from: kotlin.io.a */
public final class C11131a {

    /* renamed from: kotlin.io.a$a */
    public static final class C11132a extends C10970p {

        /* renamed from: a */
        public int f28293a = -1;

        /* renamed from: b */
        public boolean f28294b;

        /* renamed from: c */
        public boolean f28295c;

        /* renamed from: d */
        public final /* synthetic */ BufferedInputStream f28296d;

        public C11132a(BufferedInputStream bufferedInputStream) {
            this.f28296d = bufferedInputStream;
        }

        /* renamed from: c */
        public final boolean mo22553c() {
            return this.f28295c;
        }

        /* renamed from: d */
        public final int mo22554d() {
            return this.f28293a;
        }

        /* renamed from: e */
        public final boolean mo22555e() {
            return this.f28294b;
        }

        /* renamed from: f */
        public final void mo22556f() {
            if (!this.f28294b && !this.f28295c) {
                int read = this.f28296d.read();
                this.f28293a = read;
                boolean z = true;
                this.f28294b = true;
                if (read != -1) {
                    z = false;
                }
                this.f28295c = z;
            }
        }

        /* renamed from: h */
        public final void mo22557h(boolean z) {
            this.f28295c = z;
        }

        public boolean hasNext() {
            mo22556f();
            return !this.f28295c;
        }

        /* renamed from: j */
        public final void mo22559j(int i) {
            this.f28293a = i;
        }

        /* renamed from: l */
        public final void mo22560l(boolean z) {
            this.f28294b = z;
        }

        public byte nextByte() {
            mo22556f();
            if (!this.f28295c) {
                byte b = (byte) this.f28293a;
                this.f28294b = false;
                return b;
            }
            throw new NoSuchElementException("Input stream is over.");
        }
    }

    @C11110f
    /* renamed from: a */
    public static final BufferedInputStream m42921a(InputStream inputStream, int i) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i);
    }

    @C11110f
    /* renamed from: b */
    public static final BufferedOutputStream m42922b(OutputStream outputStream, int i) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream, i);
    }

    /* renamed from: c */
    public static /* synthetic */ BufferedInputStream m42923c(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        if (inputStream instanceof BufferedInputStream) {
            return (BufferedInputStream) inputStream;
        }
        return new BufferedInputStream(inputStream, i);
    }

    /* renamed from: d */
    public static /* synthetic */ BufferedOutputStream m42924d(OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        if (outputStream instanceof BufferedOutputStream) {
            return (BufferedOutputStream) outputStream;
        }
        return new BufferedOutputStream(outputStream, i);
    }

    @C11110f
    /* renamed from: e */
    public static final BufferedReader m42925e(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        if (inputStreamReader instanceof BufferedReader) {
            return (BufferedReader) inputStreamReader;
        }
        return new BufferedReader(inputStreamReader, 8192);
    }

    /* renamed from: f */
    public static /* synthetic */ BufferedReader m42926f(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
        return inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
    }

    @C11110f
    /* renamed from: g */
    public static final BufferedWriter m42927g(OutputStream outputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        if (outputStreamWriter instanceof BufferedWriter) {
            return (BufferedWriter) outputStreamWriter;
        }
        return new BufferedWriter(outputStreamWriter, 8192);
    }

    /* renamed from: h */
    public static /* synthetic */ BufferedWriter m42928h(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, charset);
        return outputStreamWriter instanceof BufferedWriter ? (BufferedWriter) outputStreamWriter : new BufferedWriter(outputStreamWriter, 8192);
    }

    @C11110f
    /* renamed from: i */
    public static final ByteArrayInputStream m42929i(String str, Charset charset) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    /* renamed from: j */
    public static /* synthetic */ ByteArrayInputStream m42930j(String str, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(str, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        return new ByteArrayInputStream(bytes);
    }

    /* renamed from: k */
    public static final long m42931k(@C12579k InputStream inputStream, @C12579k OutputStream outputStream, int i) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(outputStream, "out");
        byte[] bArr = new byte[i];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: l */
    public static /* synthetic */ long m42932l(InputStream inputStream, OutputStream outputStream, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 8192;
        }
        return m42931k(inputStream, outputStream, i);
    }

    @C11110f
    /* renamed from: m */
    public static final ByteArrayInputStream m42933m(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr);
    }

    @C11110f
    /* renamed from: n */
    public static final ByteArrayInputStream m42934n(byte[] bArr, int i, int i2) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new ByteArrayInputStream(bArr, i, i2);
    }

    @C12579k
    /* renamed from: o */
    public static final C10970p m42935o(@C12579k BufferedInputStream bufferedInputStream) {
        Intrinsics.checkNotNullParameter(bufferedInputStream, "<this>");
        return new C11132a(bufferedInputStream);
    }

    @C11665v0(version = "1.3")
    @C12579k
    /* renamed from: p */
    public static final byte[] m42936p(@C12579k InputStream inputStream) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, inputStream.available()));
        m42932l(inputStream, byteArrayOutputStream, 0, 2, (Object) null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    @C11395k(message = "Use readBytes() overload without estimatedSize parameter", replaceWith = @C11587t0(expression = "readBytes()", imports = {}))
    @C11398l(errorSince = "1.5", warningSince = "1.3")
    @C12579k
    /* renamed from: q */
    public static final byte[] m42937q(@C12579k InputStream inputStream, int i) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(i, inputStream.available()));
        m42932l(inputStream, byteArrayOutputStream, 0, 2, (Object) null);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "buffer.toByteArray()");
        return byteArray;
    }

    /* renamed from: r */
    public static /* synthetic */ byte[] m42938r(InputStream inputStream, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 8192;
        }
        return m42937q(inputStream, i);
    }

    @C11110f
    /* renamed from: s */
    public static final InputStreamReader m42939s(InputStream inputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    /* renamed from: t */
    public static /* synthetic */ InputStreamReader m42940t(InputStream inputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new InputStreamReader(inputStream, charset);
    }

    @C11110f
    /* renamed from: u */
    public static final OutputStreamWriter m42941u(OutputStream outputStream, Charset charset) {
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }

    /* renamed from: v */
    public static /* synthetic */ OutputStreamWriter m42942v(OutputStream outputStream, Charset charset, int i, Object obj) {
        if ((i & 1) != 0) {
            charset = C11602d.f28868b;
        }
        Intrinsics.checkNotNullParameter(outputStream, "<this>");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return new OutputStreamWriter(outputStream, charset);
    }
}
