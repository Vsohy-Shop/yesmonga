package org.jsoup;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.CookieStore;
import java.net.Proxy;
import java.net.URL;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocketFactory;
import org.jsoup.nodes.Document;
import org.jsoup.parser.C12892e;

public interface Connection {

    public enum Method {
        GET(false),
        POST(true),
        PUT(true),
        DELETE(false),
        PATCH(true),
        HEAD(false),
        OPTIONS(false),
        TRACE(false);
        
        private final boolean hasBody;

        /* access modifiers changed from: public */
        Method(boolean z) {
            this.hasBody = z;
        }

        /* renamed from: q */
        public final boolean mo29524q() {
            return this.hasBody;
        }
    }

    /* renamed from: org.jsoup.Connection$a */
    public interface C12735a<T extends C12735a<T>> {
        @Nullable
        /* renamed from: A */
        String mo29525A(String str);

        /* renamed from: D */
        boolean mo29526D(String str);

        /* renamed from: E */
        T mo29527E(String str);

        @Nullable
        /* renamed from: F */
        String mo29528F(String str);

        /* renamed from: G */
        boolean mo29529G(String str);

        /* renamed from: J */
        T mo29530J(String str);

        /* renamed from: L */
        List<String> mo29531L(String str);

        /* renamed from: M */
        Map<String, List<String>> mo29532M();

        /* renamed from: O */
        Map<String, String> mo29533O();

        T addHeader(String str, String str2);

        /* renamed from: c */
        T mo29535c(String str, String str2);

        /* renamed from: k */
        T mo29536k(URL url);

        /* renamed from: l */
        T mo29537l(String str, String str2);

        /* renamed from: m */
        T mo29538m(Method method);

        Method method();

        /* renamed from: u */
        URL mo29540u();

        /* renamed from: v */
        boolean mo29541v(String str, String str2);

        /* renamed from: z */
        Map<String, String> mo29542z();
    }

    /* renamed from: org.jsoup.Connection$b */
    public interface C12736b {
        /* renamed from: a */
        C12736b mo29543a(String str);

        /* renamed from: b */
        C12736b mo29544b(String str);

        /* renamed from: c */
        C12736b mo29545c(String str);

        /* renamed from: d */
        C12736b mo29546d(InputStream inputStream);

        /* renamed from: e */
        boolean mo29547e();

        @Nullable
        /* renamed from: h */
        String mo29548h();

        @Nullable
        /* renamed from: h0 */
        InputStream mo29549h0();

        String key();

        String value();
    }

    /* renamed from: org.jsoup.Connection$c */
    public interface C12737c extends C12735a<C12737c> {
        /* renamed from: B */
        boolean mo29552B();

        /* renamed from: I */
        boolean mo29553I();

        @Nullable
        /* renamed from: Q */
        String mo29554Q();

        /* renamed from: R */
        int mo29555R();

        /* renamed from: U */
        C12892e mo29556U();

        /* renamed from: a */
        C12737c mo29557a(boolean z);

        /* renamed from: b */
        C12737c mo29558b(@Nullable String str);

        /* renamed from: d */
        C12737c mo29559d(int i);

        /* renamed from: e */
        Collection<C12736b> mo29560e();

        /* renamed from: f */
        void mo29561f(SSLSocketFactory sSLSocketFactory);

        /* renamed from: g */
        C12737c mo29562g(String str);

        /* renamed from: i */
        C12737c mo29563i(@Nullable Proxy proxy);

        /* renamed from: j */
        C12737c mo29564j(C12892e eVar);

        /* renamed from: n */
        C12737c mo29565n(String str, int i);

        /* renamed from: o */
        C12737c mo29566o(int i);

        /* renamed from: p */
        C12737c mo29567p(boolean z);

        /* renamed from: q */
        C12737c mo29568q(boolean z);

        /* renamed from: r */
        boolean mo29569r();

        /* renamed from: s */
        String mo29570s();

        int timeout();

        @Nullable
        /* renamed from: w */
        SSLSocketFactory mo29572w();

        @Nullable
        /* renamed from: x */
        Proxy mo29573x();

        /* renamed from: y */
        C12737c mo29574y(C12736b bVar);
    }

    /* renamed from: org.jsoup.Connection$d */
    public interface C12738d extends C12735a<C12738d> {
        /* renamed from: C */
        Document mo29575C() throws IOException;

        @Nullable
        /* renamed from: H */
        String mo29576H();

        /* renamed from: K */
        C12738d mo29577K(String str);

        /* renamed from: N */
        C12738d mo29578N();

        /* renamed from: P */
        int mo29579P();

        /* renamed from: S */
        String mo29580S();

        /* renamed from: T */
        byte[] mo29581T();

        String body();

        @Nullable
        /* renamed from: h */
        String mo29583h();

        /* renamed from: t */
        BufferedInputStream mo29584t();
    }

    /* renamed from: A */
    CookieStore mo29487A();

    /* renamed from: B */
    Connection mo29488B(String str);

    /* renamed from: C */
    Connection mo29489C(Map<String, String> map);

    /* renamed from: D */
    Connection mo29490D(String str, String str2, InputStream inputStream);

    /* renamed from: E */
    Connection mo29491E(C12738d dVar);

    /* renamed from: F */
    Connection mo29492F(String... strArr);

    @Nullable
    /* renamed from: G */
    C12736b mo29493G(String str);

    /* renamed from: H */
    Connection mo29494H(Map<String, String> map);

    /* renamed from: a */
    Connection mo29495a(boolean z);

    /* renamed from: b */
    Connection mo29496b(String str);

    /* renamed from: c */
    Connection mo29497c(String str, String str2);

    /* renamed from: d */
    Connection mo29498d(int i);

    /* renamed from: e */
    Connection mo29499e(Collection<C12736b> collection);

    C12738d execute() throws IOException;

    /* renamed from: f */
    Connection mo29501f(SSLSocketFactory sSLSocketFactory);

    /* renamed from: g */
    Connection mo29502g(String str);

    Document get() throws IOException;

    /* renamed from: h */
    Connection mo29504h(Map<String, String> map);

    /* renamed from: i */
    Connection mo29505i(@Nullable Proxy proxy);

    /* renamed from: j */
    Connection mo29506j(C12892e eVar);

    /* renamed from: k */
    Connection mo29507k(URL url);

    /* renamed from: l */
    Connection mo29508l(String str, String str2);

    /* renamed from: m */
    Connection mo29509m(Method method);

    /* renamed from: n */
    Connection mo29510n(String str, int i);

    /* renamed from: o */
    Connection mo29511o(int i);

    /* renamed from: p */
    Connection mo29512p(boolean z);

    /* renamed from: q */
    Connection mo29513q(boolean z);

    /* renamed from: r */
    Connection mo29514r(String str, String str2, InputStream inputStream, String str3);

    C12737c request();

    /* renamed from: s */
    Connection mo29516s();

    /* renamed from: t */
    Connection mo29517t(String str, String str2);

    /* renamed from: u */
    Document mo29518u() throws IOException;

    /* renamed from: v */
    Connection mo29519v(String str);

    /* renamed from: w */
    Connection mo29520w(C12737c cVar);

    /* renamed from: x */
    Connection mo29521x(String str);

    /* renamed from: y */
    C12738d mo29522y();

    /* renamed from: z */
    Connection mo29523z(CookieStore cookieStore);
}
