package org.jsoup.nodes;

import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.text.C11626x;
import org.jsoup.SerializationException;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Document;
import org.jsoup.parser.C12888a;
import org.jsoup.parser.C12892e;

public class Entities {

    /* renamed from: a */
    public static final int f31576a = -1;

    /* renamed from: b */
    public static final String f31577b = "";

    /* renamed from: c */
    public static final int f31578c = 36;

    /* renamed from: d */
    public static final char[] f31579d = {',', ';'};

    /* renamed from: e */
    public static final HashMap<String, String> f31580e = new HashMap<>();

    /* renamed from: f */
    public static final Document.OutputSettings f31581f = new Document.OutputSettings();

    public enum CoreCharset {
        ascii,
        utf,
        fallback;

        /* renamed from: q */
        public static CoreCharset m55334q(String str) {
            if (str.equals("US-ASCII")) {
                return ascii;
            }
            if (str.startsWith("UTF-")) {
                return utf;
            }
            return fallback;
        }
    }

    public enum EscapeMode {
        xhtml(C12776g.f31621a, 4),
        base(C12776g.f31622b, 106),
        extended(C12776g.f31623c, 2125);
        
        /* access modifiers changed from: private */
        public int[] codeKeys;
        /* access modifiers changed from: private */
        public int[] codeVals;
        /* access modifiers changed from: private */
        public String[] nameKeys;
        /* access modifiers changed from: private */
        public String[] nameVals;

        /* access modifiers changed from: public */
        EscapeMode(String str, int i) {
            Entities.m55330k(this, str, i);
        }

        /* renamed from: X */
        public int mo29820X(String str) {
            int binarySearch = Arrays.binarySearch(this.nameKeys, str);
            if (binarySearch >= 0) {
                return this.codeVals[binarySearch];
            }
            return -1;
        }

        /* renamed from: Z */
        public String mo29821Z(int i) {
            int binarySearch = Arrays.binarySearch(this.codeKeys, i);
            if (binarySearch < 0) {
                return "";
            }
            String[] strArr = this.nameVals;
            if (binarySearch < strArr.length - 1) {
                int i2 = binarySearch + 1;
                if (this.codeKeys[i2] == i) {
                    return strArr[i2];
                }
            }
            return strArr[binarySearch];
        }

        public final int size() {
            return this.nameKeys.length;
        }
    }

    /* renamed from: org.jsoup.nodes.Entities$a */
    public static /* synthetic */ class C12765a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f31590a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                org.jsoup.nodes.Entities$CoreCharset[] r0 = org.jsoup.nodes.Entities.CoreCharset.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f31590a = r0
                org.jsoup.nodes.Entities$CoreCharset r1 = org.jsoup.nodes.Entities.CoreCharset.ascii     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f31590a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.jsoup.nodes.Entities$CoreCharset r1 = org.jsoup.nodes.Entities.CoreCharset.utf     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.nodes.Entities.C12765a.<clinit>():void");
        }
    }

    /* renamed from: b */
    public static void m55321b(Appendable appendable, EscapeMode escapeMode, int i) throws IOException {
        String Z = escapeMode.mo29821Z(i);
        if (!"".equals(Z)) {
            appendable.append(C11626x.f28913d).append(Z).append(';');
        } else {
            appendable.append("&#x").append(Integer.toHexString(i)).append(';');
        }
    }

    /* renamed from: c */
    public static boolean m55322c(CoreCharset coreCharset, char c, CharsetEncoder charsetEncoder) {
        int i = C12765a.f31590a[coreCharset.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return charsetEncoder.canEncode(c);
            }
            return true;
        } else if (c < 128) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    public static int m55323d(String str, int[] iArr) {
        String str2 = f31580e.get(str);
        if (str2 != null) {
            iArr[0] = str2.codePointAt(0);
            iArr[1] = str2.codePointAt(1);
            return 2;
        }
        int X = EscapeMode.extended.mo29820X(str);
        if (X == -1) {
            return 0;
        }
        iArr[0] = X;
        return 1;
    }

    /* renamed from: e */
    public static String m55324e(String str) {
        return m55325f(str, f31581f);
    }

    /* renamed from: f */
    public static String m55325f(String str, Document.OutputSettings outputSettings) {
        if (str == null) {
            return "";
        }
        StringBuilder b = C12759f.m55102b();
        try {
            m55326g(b, str, outputSettings, false, false, false);
            return C12759f.m55116p(b);
        } catch (IOException e) {
            throw new SerializationException((Throwable) e);
        }
    }

    /* renamed from: g */
    public static void m55326g(Appendable appendable, String str, Document.OutputSettings outputSettings, boolean z, boolean z2, boolean z3) throws IOException {
        Appendable appendable2 = appendable;
        EscapeMode j = outputSettings.mo29679j();
        CharsetEncoder h = outputSettings.mo29677h();
        CoreCharset coreCharset = outputSettings.f31553d;
        int length = str.length();
        int i = 0;
        boolean z4 = false;
        boolean z5 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (z2) {
                if (C12759f.m55110j(codePointAt)) {
                    if ((!z3 || z4) && !z5) {
                        appendable.append(' ');
                        z5 = true;
                    }
                    i += Character.charCount(codePointAt);
                } else {
                    z5 = false;
                    z4 = true;
                }
            }
            if (codePointAt < 65536) {
                char c = (char) codePointAt;
                if (c == 9 || c == 10 || c == 13) {
                    appendable.append(c);
                } else if (c != '\"') {
                    if (c == '&') {
                        appendable.append("&amp;");
                    } else if (c != '<') {
                        if (c != '>') {
                            if (c != 160) {
                                if (c < ' ' || !m55322c(coreCharset, c, h)) {
                                    m55321b(appendable, j, codePointAt);
                                } else {
                                    appendable.append(c);
                                }
                            } else if (j != EscapeMode.xhtml) {
                                appendable.append("&nbsp;");
                            } else {
                                appendable.append("&#xa0;");
                            }
                        } else if (!z) {
                            appendable.append("&gt;");
                        } else {
                            appendable.append(c);
                        }
                    } else if (!z || j == EscapeMode.xhtml || outputSettings.mo29687u() == Document.OutputSettings.Syntax.xml) {
                        appendable.append("&lt;");
                    } else {
                        appendable.append(c);
                    }
                } else if (z) {
                    appendable.append("&quot;");
                } else {
                    appendable.append(c);
                }
            } else {
                String str2 = new String(Character.toChars(codePointAt));
                if (h.canEncode(str2)) {
                    appendable.append(str2);
                } else {
                    m55321b(appendable, j, codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: h */
    public static String m55327h(String str) {
        String str2 = f31580e.get(str);
        if (str2 != null) {
            return str2;
        }
        int X = EscapeMode.extended.mo29820X(str);
        if (X == -1) {
            return "";
        }
        return new String(new int[]{X}, 0, 1);
    }

    /* renamed from: i */
    public static boolean m55328i(String str) {
        return EscapeMode.base.mo29820X(str) != -1;
    }

    /* renamed from: j */
    public static boolean m55329j(String str) {
        return EscapeMode.extended.mo29820X(str) != -1;
    }

    /* renamed from: k */
    public static void m55330k(EscapeMode escapeMode, String str, int i) {
        int i2;
        String[] unused = escapeMode.nameKeys = new String[i];
        int[] unused2 = escapeMode.codeVals = new int[i];
        int[] unused3 = escapeMode.codeKeys = new int[i];
        String[] unused4 = escapeMode.nameVals = new String[i];
        C12888a aVar = new C12888a(str);
        boolean z = false;
        int i3 = 0;
        while (!aVar.mo30072w()) {
            try {
                String o = aVar.mo30063o('=');
                aVar.mo30050a();
                int parseInt = Integer.parseInt(aVar.mo30065q(f31579d), 36);
                char u = aVar.mo30070u();
                aVar.mo30050a();
                if (u == ',') {
                    i2 = Integer.parseInt(aVar.mo30063o(';'), 36);
                    aVar.mo30050a();
                } else {
                    i2 = -1;
                }
                int parseInt2 = Integer.parseInt(aVar.mo30063o(C11626x.f28913d), 36);
                aVar.mo30050a();
                escapeMode.nameKeys[i3] = o;
                escapeMode.codeVals[i3] = parseInt;
                escapeMode.codeKeys[parseInt2] = parseInt;
                escapeMode.nameVals[parseInt2] = o;
                if (i2 != -1) {
                    f31580e.put(o, new String(new int[]{parseInt, i2}, 0, 2));
                }
                i3++;
            } finally {
                aVar.mo30052d();
            }
        }
        if (i3 == i) {
            z = true;
        }
        C12750d.m55068e(z, "Unexpected count of entities loaded");
    }

    /* renamed from: l */
    public static String m55331l(String str) {
        return m55332m(str, false);
    }

    /* renamed from: m */
    public static String m55332m(String str, boolean z) {
        return C12892e.m55933s(str, z);
    }
}
