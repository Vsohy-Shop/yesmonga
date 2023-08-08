package org.jsoup;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.annotation.Nullable;
import org.jsoup.helper.C12742b;
import org.jsoup.helper.C12744c;
import org.jsoup.nodes.Document;
import org.jsoup.parser.C12892e;
import org.jsoup.safety.C12900a;
import org.jsoup.safety.C12904b;
import org.jsoup.safety.C12910c;

/* renamed from: org.jsoup.a */
public class C12739a {
    /* renamed from: a */
    public static String m54860a(String str, String str2, C12904b bVar) {
        return new C12900a(bVar).mo30281c(m54881v(str, str2)).mo29656g3().mo29744V1();
    }

    /* renamed from: b */
    public static String m54861b(String str, String str2, C12904b bVar, Document.OutputSettings outputSettings) {
        Document c = new C12900a(bVar).mo30281c(m54881v(str, str2));
        c.mo29641A3(outputSettings);
        return c.mo29656g3().mo29744V1();
    }

    @Deprecated
    /* renamed from: c */
    public static String m54862c(String str, String str2, C12910c cVar) {
        return m54860a(str, str2, cVar);
    }

    @Deprecated
    /* renamed from: d */
    public static String m54863d(String str, String str2, C12910c cVar, Document.OutputSettings outputSettings) {
        return m54861b(str, str2, cVar, outputSettings);
    }

    /* renamed from: e */
    public static String m54864e(String str, C12904b bVar) {
        return m54860a(str, "", bVar);
    }

    @Deprecated
    /* renamed from: f */
    public static String m54865f(String str, C12910c cVar) {
        return m54864e(str, cVar);
    }

    /* renamed from: g */
    public static Connection m54866g(String str) {
        return C12744c.m54906N(str);
    }

    /* renamed from: h */
    public static boolean m54867h(String str, C12904b bVar) {
        return new C12900a(bVar).mo30285g(str);
    }

    @Deprecated
    /* renamed from: i */
    public static boolean m54868i(String str, C12910c cVar) {
        return m54867h(str, cVar);
    }

    /* renamed from: j */
    public static Connection m54869j() {
        return new C12744c();
    }

    /* renamed from: k */
    public static Document m54870k(File file, @Nullable String str) throws IOException {
        return C12742b.m54891e(file, str, file.getAbsolutePath());
    }

    /* renamed from: l */
    public static Document m54871l(File file, @Nullable String str, String str2) throws IOException {
        return C12742b.m54891e(file, str, str2);
    }

    /* renamed from: m */
    public static Document m54872m(File file, @Nullable String str, String str2, C12892e eVar) throws IOException {
        return C12742b.m54892f(file, str, str2, eVar);
    }

    /* renamed from: n */
    public static Document m54873n(InputStream inputStream, @Nullable String str, String str2) throws IOException {
        return C12742b.m54893g(inputStream, str, str2);
    }

    /* renamed from: o */
    public static Document m54874o(InputStream inputStream, @Nullable String str, String str2, C12892e eVar) throws IOException {
        return C12742b.m54894h(inputStream, str, str2, eVar);
    }

    /* renamed from: p */
    public static Document m54875p(String str) {
        return C12892e.m55928g(str, "");
    }

    /* renamed from: q */
    public static Document m54876q(String str, String str2) {
        return C12892e.m55928g(str, str2);
    }

    /* renamed from: r */
    public static Document m54877r(String str, String str2, C12892e eVar) {
        return eVar.mo30181m(str, str2);
    }

    /* renamed from: s */
    public static Document m54878s(String str, C12892e eVar) {
        return eVar.mo30181m(str, "");
    }

    /* renamed from: t */
    public static Document m54879t(URL url, int i) throws IOException {
        Connection O = C12744c.m54907O(url);
        O.mo29498d(i);
        return O.get();
    }

    /* renamed from: u */
    public static Document m54880u(String str) {
        return C12892e.m55929h(str, "");
    }

    /* renamed from: v */
    public static Document m54881v(String str, String str2) {
        return C12892e.m55929h(str, str2);
    }
}
