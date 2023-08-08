package org.jsoup.helper;

import java.io.BufferedReader;
import java.io.CharArrayReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import javax.annotation.Nullable;
import org.jsoup.UncheckedIOException;
import org.jsoup.internal.C12754a;
import org.jsoup.internal.C12757d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.C12773d;
import org.jsoup.nodes.C12779j;
import org.jsoup.nodes.C12784n;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.C12892e;

/* renamed from: org.jsoup.helper.b */
public final class C12742b {

    /* renamed from: a */
    public static final Pattern f31460a = Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");

    /* renamed from: b */
    public static final Charset f31461b;

    /* renamed from: c */
    public static final String f31462c;

    /* renamed from: d */
    public static final int f31463d = 5120;

    /* renamed from: e */
    public static final int f31464e = 32768;

    /* renamed from: f */
    public static final char[] f31465f = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    /* renamed from: g */
    public static final int f31466g = 32;

    /* renamed from: org.jsoup.helper.b$a */
    public static class C12743a {

        /* renamed from: a */
        public final String f31467a;

        /* renamed from: b */
        public final boolean f31468b;

        public C12743a(String str, boolean z) {
            this.f31467a = str;
            this.f31468b = z;
        }
    }

    static {
        Charset forName = Charset.forName("UTF-8");
        f31461b = forName;
        f31462c = forName.name();
    }

    /* renamed from: a */
    public static void m54887a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[32768];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    @Nullable
    /* renamed from: b */
    public static C12743a m54888b(ByteBuffer byteBuffer) {
        byteBuffer.mark();
        byte[] bArr = new byte[4];
        if (byteBuffer.remaining() >= 4) {
            byteBuffer.get(bArr);
            byteBuffer.rewind();
        }
        byte b = bArr[0];
        if ((b == 0 && bArr[1] == 0 && bArr[2] == -2 && bArr[3] == -1) || (b == -1 && bArr[1] == -2 && bArr[2] == 0 && bArr[3] == 0)) {
            return new C12743a("UTF-32", false);
        }
        if ((b == -2 && bArr[1] == -1) || (b == -1 && bArr[1] == -2)) {
            return new C12743a("UTF-16", false);
        }
        if (b == -17 && bArr[1] == -69 && bArr[2] == -65) {
            return new C12743a("UTF-8", true);
        }
        return null;
    }

    /* renamed from: c */
    public static ByteBuffer m54889c() {
        return ByteBuffer.allocate(0);
    }

    @Nullable
    /* renamed from: d */
    public static String m54890d(@Nullable String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = f31460a.matcher(str);
        if (matcher.find()) {
            return m54898l(matcher.group(1).trim().replace("charset=", ""));
        }
        return null;
    }

    /* renamed from: e */
    public static Document m54891e(File file, @Nullable String str, String str2) throws IOException {
        return m54892f(file, str, str2, C12892e.m55927c());
    }

    /* renamed from: f */
    public static Document m54892f(File file, @Nullable String str, String str2, C12892e eVar) throws IOException {
        boolean z;
        InputStream fileInputStream = new FileInputStream(file);
        String a = C12757d.m55098a(file.getName());
        if (a.endsWith(".gz") || a.endsWith(".z")) {
            try {
                if (fileInputStream.read() == 31 && fileInputStream.read() == 139) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    fileInputStream = new GZIPInputStream(new FileInputStream(file));
                } else {
                    fileInputStream = new FileInputStream(file);
                }
            } finally {
                fileInputStream.close();
            }
        }
        return m54896j(fileInputStream, str, str2, eVar);
    }

    /* renamed from: g */
    public static Document m54893g(InputStream inputStream, @Nullable String str, String str2) throws IOException {
        return m54896j(inputStream, str, str2, C12892e.m55927c());
    }

    /* renamed from: h */
    public static Document m54894h(InputStream inputStream, @Nullable String str, String str2, C12892e eVar) throws IOException {
        return m54896j(inputStream, str, str2, eVar);
    }

    /* renamed from: i */
    public static String m54895i() {
        StringBuilder b = C12759f.m55102b();
        Random random = new Random();
        for (int i = 0; i < 32; i++) {
            char[] cArr = f31465f;
            b.append(cArr[random.nextInt(cArr.length)]);
        }
        return C12759f.m55116p(b);
    }

    /* renamed from: j */
    public static Document m54896j(@Nullable InputStream inputStream, @Nullable String str, String str2, C12892e eVar) throws IOException {
        BufferedReader bufferedReader;
        Document document;
        C12784n nVar;
        if (inputStream == null) {
            return new Document(str2);
        }
        boolean z = false;
        C12754a d = C12754a.m55094d(inputStream, 32768, 0);
        try {
            d.mark(32768);
            ByteBuffer k = m54897k(d, 5119);
            boolean z2 = d.read() == -1;
            d.reset();
            C12743a b = m54888b(k);
            if (b != null) {
                str = b.f31467a;
            }
            Document document2 = null;
            if (str == null) {
                CharBuffer decode = f31461b.decode(k);
                if (decode.hasArray()) {
                    document = eVar.mo30180l(new CharArrayReader(decode.array(), decode.arrayOffset(), decode.limit()), str2);
                } else {
                    document = eVar.mo30181m(decode.toString(), str2);
                }
                Iterator it = document.mo29717K2("meta[http-equiv=content-type], meta[charset]").iterator();
                String str3 = null;
                while (it.hasNext()) {
                    Element element = (Element) it.next();
                    if (element.mo29892J("http-equiv")) {
                        str3 = m54890d(element.mo29896j("content"));
                    }
                    if (str3 == null && element.mo29892J("charset")) {
                        str3 = element.mo29896j("charset");
                        continue;
                    }
                    if (str3 != null) {
                        break;
                    }
                }
                if (str3 == null && document.mo29805u() > 0) {
                    C12779j t = document.mo29941t(0);
                    if (t instanceof C12784n) {
                        nVar = (C12784n) t;
                    } else {
                        if (t instanceof C12773d) {
                            C12773d dVar = (C12773d) t;
                            if (dVar.mo29893J0()) {
                                nVar = dVar.mo29889G0();
                            }
                        }
                        nVar = null;
                    }
                    if (nVar != null && nVar.mo29954J0().equalsIgnoreCase("xml")) {
                        str3 = nVar.mo29896j("encoding");
                    }
                }
                String l = m54898l(str3);
                if (l != null && !l.equalsIgnoreCase(f31462c)) {
                    str = l.trim().replaceAll("[\"']", "");
                } else if (z2) {
                    document2 = document;
                }
            } else {
                C12750d.m55072i(str, "Must set charset arg to character set of file to parse. Set to null to attempt to detect from HTML");
            }
            if (document2 == null) {
                if (str == null) {
                    str = f31462c;
                }
                bufferedReader = new BufferedReader(new InputStreamReader(d, str), 32768);
                if (b != null) {
                    if (b.f31468b) {
                        if (bufferedReader.skip(1) == 1) {
                            z = true;
                        }
                        C12750d.m55067d(z);
                    }
                }
                document2 = eVar.mo30180l(bufferedReader, str2);
                Charset forName = str.equals(f31462c) ? f31461b : Charset.forName(str);
                document2.mo29671z3().mo29675e(forName);
                if (!forName.canEncode()) {
                    document2.mo29658i3(f31461b);
                }
                bufferedReader.close();
            }
            d.close();
            return document2;
        } catch (UncheckedIOException e) {
            throw e.mo29587a();
        } catch (UncheckedIOException e2) {
            throw e2.mo29587a();
        } catch (Throwable th) {
            d.close();
            throw th;
        }
    }

    /* renamed from: k */
    public static ByteBuffer m54897k(InputStream inputStream, int i) throws IOException {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55068e(z, "maxSize must be 0 (unlimited) or larger");
        return C12754a.m55094d(inputStream, 32768, i).mo29632b(i);
    }

    @Nullable
    /* renamed from: l */
    public static String m54898l(@Nullable String str) {
        if (!(str == null || str.length() == 0)) {
            String replaceAll = str.trim().replaceAll("[\"']", "");
            try {
                if (Charset.isSupported(replaceAll)) {
                    return replaceAll;
                }
                String upperCase = replaceAll.toUpperCase(Locale.ENGLISH);
                if (Charset.isSupported(upperCase)) {
                    return upperCase;
                }
            } catch (IllegalCharsetNameException unused) {
            }
        }
        return null;
    }
}
