package org.jsoup.nodes;

import com.usabilla.sdk.ubform.sdk.field.model.common.FieldModel;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import org.jsoup.SerializationException;
import org.jsoup.helper.C12750d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Document;

/* renamed from: org.jsoup.nodes.a */
public class C12766a implements Map.Entry<String, String>, Cloneable {

    /* renamed from: d */
    public static final String[] f31591d = {"allowfullscreen", "async", "autofocus", "checked", "compact", "declare", "default", "defer", "disabled", "formnovalidate", "hidden", "inert", "ismap", "itemscope", "multiple", "muted", "nohref", "noresize", "noshade", "novalidate", "nowrap", "open", "readonly", FieldModel.f27475X, "reversed", "seamless", "selected", "sortable", "truespeed", "typemustmatch"};

    /* renamed from: e */
    public static final Pattern f31592e = Pattern.compile("[a-zA-Z_:][-a-zA-Z0-9_:.]*");

    /* renamed from: f */
    public static final Pattern f31593f = Pattern.compile("[^-a-zA-Z0-9_:.]");

    /* renamed from: g */
    public static final Pattern f31594g = Pattern.compile("[^\\x00-\\x1f\\x7f-\\x9f \"'/=]+");

    /* renamed from: v */
    public static final Pattern f31595v = Pattern.compile("[\\x00-\\x1f\\x7f-\\x9f \"'/=]");

    /* renamed from: a */
    public String f31596a;
    @Nullable

    /* renamed from: b */
    public String f31597b;
    @Nullable

    /* renamed from: c */
    public C12767b f31598c;

    public C12766a(String str, @Nullable String str2) {
        this(str, str2, (C12767b) null);
    }

    /* renamed from: c */
    public static C12766a m55346c(String str, String str2) {
        return new C12766a(str, Entities.m55332m(str2, true), (C12767b) null);
    }

    @Nullable
    /* renamed from: f */
    public static String m55347f(String str, Document.OutputSettings.Syntax syntax) {
        if (syntax == Document.OutputSettings.Syntax.xml) {
            Pattern pattern = f31592e;
            if (!pattern.matcher(str).matches()) {
                String replaceAll = f31593f.matcher(str).replaceAll("");
                if (pattern.matcher(replaceAll).matches()) {
                    return replaceAll;
                }
                return null;
            }
        }
        if (syntax == Document.OutputSettings.Syntax.html) {
            Pattern pattern2 = f31594g;
            if (!pattern2.matcher(str).matches()) {
                String replaceAll2 = f31595v.matcher(str).replaceAll("");
                if (pattern2.matcher(replaceAll2).matches()) {
                    return replaceAll2;
                }
                return null;
            }
        }
        return str;
    }

    /* renamed from: l */
    public static void m55348l(String str, @Nullable String str2, Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        String f = m55347f(str, outputSettings.mo29687u());
        if (f != null) {
            m55349m(f, str2, appendable, outputSettings);
        }
    }

    /* renamed from: m */
    public static void m55349m(String str, @Nullable String str2, Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        appendable.append(str);
        if (!m55352v(str, str2, outputSettings)) {
            appendable.append("=\"");
            Entities.m55326g(appendable, C12767b.m55367i0(str2), outputSettings, true, false, false);
            appendable.append('\"');
        }
    }

    /* renamed from: n */
    public static boolean m55350n(String str) {
        return Arrays.binarySearch(f31591d, str) >= 0;
    }

    /* renamed from: s */
    public static boolean m55351s(String str) {
        if (!str.startsWith(C12767b.f31599d) || str.length() <= 5) {
            return false;
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m55352v(String str, @Nullable String str2, Document.OutputSettings outputSettings) {
        if (outputSettings.mo29687u() != Document.OutputSettings.Syntax.html || (str2 != null && ((!str2.isEmpty() && !str2.equalsIgnoreCase(str)) || !m55350n(str)))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public C12766a clone() {
        try {
            return (C12766a) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: e */
    public String getKey() {
        return this.f31596a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12766a aVar = (C12766a) obj;
        String str = this.f31596a;
        if (str == null ? aVar.f31596a != null : !str.equals(aVar.f31596a)) {
            return false;
        }
        String str2 = this.f31597b;
        String str3 = aVar.f31597b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public String getValue() {
        return C12767b.m55367i0(this.f31597b);
    }

    public int hashCode() {
        int i;
        String str = this.f31596a;
        int i2 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        String str2 = this.f31597b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    /* renamed from: i */
    public boolean mo29831i() {
        return this.f31597b != null;
    }

    /* renamed from: j */
    public String mo29832j() {
        StringBuilder b = C12759f.m55102b();
        try {
            mo29833k(b, new Document("").mo29671z3());
            return C12759f.m55116p(b);
        } catch (IOException e) {
            throw new SerializationException((Throwable) e);
        }
    }

    /* renamed from: k */
    public void mo29833k(Appendable appendable, Document.OutputSettings outputSettings) throws IOException {
        m55348l(this.f31596a, this.f31597b, appendable, outputSettings);
    }

    /* renamed from: o */
    public boolean mo29834o() {
        return m55351s(this.f31596a);
    }

    /* renamed from: t */
    public void mo29836t(String str) {
        int B0;
        C12750d.m55073j(str);
        String trim = str.trim();
        C12750d.m55071h(trim);
        C12767b bVar = this.f31598c;
        if (!(bVar == null || (B0 = bVar.mo29841B0(this.f31596a)) == -1)) {
            this.f31598c.f31606b[B0] = trim;
        }
        this.f31596a = trim;
    }

    public String toString() {
        return mo29832j();
    }

    /* renamed from: u */
    public String setValue(@Nullable String str) {
        int B0;
        String str2 = this.f31597b;
        C12767b bVar = this.f31598c;
        if (!(bVar == null || (B0 = bVar.mo29841B0(this.f31596a)) == -1)) {
            str2 = this.f31598c.mo29863o0(this.f31596a);
            this.f31598c.f31607c[B0] = str;
        }
        this.f31597b = str;
        return C12767b.m55367i0(str2);
    }

    /* renamed from: x */
    public final boolean mo29839x(Document.OutputSettings outputSettings) {
        return m55352v(this.f31596a, this.f31597b, outputSettings);
    }

    public C12766a(String str, @Nullable String str2, @Nullable C12767b bVar) {
        C12750d.m55073j(str);
        String trim = str.trim();
        C12750d.m55071h(trim);
        this.f31596a = trim;
        this.f31597b = str2;
        this.f31598c = bVar;
    }
}
