package org.jsoup.internal;

import androidx.constraintlayout.widget.C16934c;
import com.bumptech.glide.load.engine.GlideException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlinx.serialization.json.C12412q;
import org.jsoup.helper.C12750d;

/* renamed from: org.jsoup.internal.f */
public final class C12759f {

    /* renamed from: a */
    public static final String[] f31533a = {"", " ", GlideException.C22148a.f56917d, "   ", C12412q.f30348a, "     ", "      ", C16934c.C16941f.f44804o, "        ", "         ", "          ", "           ", "            ", "             ", "              ", "               ", "                ", "                 ", "                  ", "                   ", "                    "};

    /* renamed from: b */
    public static final int f31534b = 30;

    /* renamed from: c */
    public static final Pattern f31535c = Pattern.compile("^/((\\.{1,2}/)+)");

    /* renamed from: d */
    public static final Pattern f31536d = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+-.]*:");

    /* renamed from: e */
    public static final ThreadLocal<Stack<StringBuilder>> f31537e = new C12760a();

    /* renamed from: f */
    public static final int f31538f = 8192;

    /* renamed from: g */
    public static final int f31539g = 8;

    /* renamed from: org.jsoup.internal.f$a */
    public class C12760a extends ThreadLocal<Stack<StringBuilder>> {
        /* renamed from: a */
        public Stack<StringBuilder> initialValue() {
            return new Stack<>();
        }
    }

    /* renamed from: org.jsoup.internal.f$b */
    public static class C12761b {
        @Nullable

        /* renamed from: a */
        public StringBuilder f31540a = C12759f.m55102b();

        /* renamed from: b */
        public final String f31541b;

        /* renamed from: c */
        public boolean f31542c = true;

        public C12761b(String str) {
            this.f31541b = str;
        }

        /* renamed from: a */
        public C12761b mo29638a(Object obj) {
            C12750d.m55073j(this.f31540a);
            if (!this.f31542c) {
                this.f31540a.append(this.f31541b);
            }
            this.f31540a.append(obj);
            this.f31542c = false;
            return this;
        }

        /* renamed from: b */
        public C12761b mo29639b(Object obj) {
            C12750d.m55073j(this.f31540a);
            this.f31540a.append(obj);
            return this;
        }

        /* renamed from: c */
        public String mo29640c() {
            String p = C12759f.m55116p(this.f31540a);
            this.f31540a = null;
            return p;
        }
    }

    /* renamed from: a */
    public static void m55101a(StringBuilder sb, String str, boolean z) {
        int length = str.length();
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (m55105e(codePointAt)) {
                if ((!z || z2) && !z3) {
                    sb.append(' ');
                    z3 = true;
                }
            } else if (!m55108h(codePointAt)) {
                sb.appendCodePoint(codePointAt);
                z3 = false;
                z2 = true;
            }
            i += Character.charCount(codePointAt);
        }
    }

    /* renamed from: b */
    public static StringBuilder m55102b() {
        Stack stack = f31537e.get();
        if (stack.empty()) {
            return new StringBuilder(8192);
        }
        return (StringBuilder) stack.pop();
    }

    /* renamed from: c */
    public static boolean m55103c(String str, String... strArr) {
        for (String equals : strArr) {
            if (equals.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m55104d(String str, String[] strArr) {
        return Arrays.binarySearch(strArr, str) >= 0;
    }

    /* renamed from: e */
    public static boolean m55105e(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13 || i == 160;
    }

    /* renamed from: f */
    public static boolean m55106f(String str) {
        C12750d.m55073j(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) > 127) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: g */
    public static boolean m55107g(String str) {
        if (!(str == null || str.length() == 0)) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                if (!m55110j(str.codePointAt(i))) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: h */
    public static boolean m55108h(int i) {
        return i == 8203 || i == 173;
    }

    /* renamed from: i */
    public static boolean m55109i(String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isDigit(str.codePointAt(i))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m55110j(int i) {
        return i == 32 || i == 9 || i == 10 || i == 12 || i == 13;
    }

    /* renamed from: k */
    public static String m55111k(Collection<?> collection, String str) {
        return m55112l(collection.iterator(), str);
    }

    /* renamed from: l */
    public static String m55112l(Iterator<?> it, String str) {
        if (!it.hasNext()) {
            return "";
        }
        String obj = it.next().toString();
        if (!it.hasNext()) {
            return obj;
        }
        C12761b bVar = new C12761b(str);
        bVar.mo29638a(obj);
        while (it.hasNext()) {
            bVar.mo29638a(it.next());
        }
        return bVar.mo29640c();
    }

    /* renamed from: m */
    public static String m55113m(String[] strArr, String str) {
        return m55111k(Arrays.asList(strArr), str);
    }

    /* renamed from: n */
    public static String m55114n(String str) {
        StringBuilder b = m55102b();
        m55101a(b, str, false);
        return m55116p(b);
    }

    /* renamed from: o */
    public static String m55115o(int i) {
        if (i >= 0) {
            String[] strArr = f31533a;
            if (i < strArr.length) {
                return strArr[i];
            }
            int min = Math.min(i, 30);
            char[] cArr = new char[min];
            for (int i2 = 0; i2 < min; i2++) {
                cArr[i2] = ' ';
            }
            return String.valueOf(cArr);
        }
        throw new IllegalArgumentException("width must be > 0");
    }

    /* renamed from: p */
    public static String m55116p(StringBuilder sb) {
        C12750d.m55073j(sb);
        String sb2 = sb.toString();
        if (sb.length() > 8192) {
            sb = new StringBuilder(8192);
        } else {
            sb.delete(0, sb.length());
        }
        Stack stack = f31537e.get();
        stack.push(sb);
        while (stack.size() > 8) {
            stack.pop();
        }
        return sb2;
    }

    /* renamed from: q */
    public static String m55117q(String str, String str2) {
        try {
            try {
                return m55118r(new URL(str), str2).toExternalForm();
            } catch (MalformedURLException unused) {
                if (f31536d.matcher(str2).find()) {
                    return str2;
                }
                return "";
            }
        } catch (MalformedURLException unused2) {
            return new URL(str2).toExternalForm();
        }
    }

    /* renamed from: r */
    public static URL m55118r(URL url, String str) throws MalformedURLException {
        if (str.startsWith("?")) {
            str = url.getPath() + str;
        }
        URL url2 = new URL(url, str);
        String replaceFirst = f31535c.matcher(url2.getFile()).replaceFirst("/");
        if (url2.getRef() != null) {
            replaceFirst = replaceFirst + "#" + url2.getRef();
        }
        return new URL(url2.getProtocol(), url2.getHost(), url2.getPort(), replaceFirst);
    }
}
