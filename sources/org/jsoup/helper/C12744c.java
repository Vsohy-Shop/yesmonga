package org.jsoup.helper;

import androidx.exifinterface.media.C19135a;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.android.datatransport.cct.C40045d;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.urbanairship.automation.C8970v;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.net.CookieStore;
import java.net.HttpURLConnection;
import java.net.IDN;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.C11354n;
import kotlin.text.C11626x;
import org.jsoup.Connection;
import org.jsoup.UncheckedIOException;
import org.jsoup.internal.C12754a;
import org.jsoup.internal.C12757d;
import org.jsoup.internal.C12759f;
import org.jsoup.nodes.Document;
import org.jsoup.parser.C12892e;
import org.jsoup.parser.C12894g;

/* renamed from: org.jsoup.helper.c */
public class C12744c implements Connection {

    /* renamed from: c */
    public static final String f31469c = "Content-Encoding";

    /* renamed from: d */
    public static final String f31470d = "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/79.0.3945.130 Safari/537.36";

    /* renamed from: e */
    public static final String f31471e = "User-Agent";

    /* renamed from: f */
    public static final String f31472f = "Content-Type";

    /* renamed from: g */
    public static final String f31473g = "multipart/form-data";

    /* renamed from: h */
    public static final String f31474h = "application/x-www-form-urlencoded";

    /* renamed from: i */
    public static final int f31475i = 307;

    /* renamed from: j */
    public static final String f31476j = "application/octet-stream";

    /* renamed from: k */
    public static final Charset f31477k = Charset.forName("UTF-8");

    /* renamed from: l */
    public static final Charset f31478l = Charset.forName("ISO-8859-1");

    /* renamed from: a */
    public C12748d f31479a;
    @Nullable

    /* renamed from: b */
    public Connection.C12738d f31480b;

    /* renamed from: org.jsoup.helper.c$c */
    public static class C12747c implements Connection.C12736b {

        /* renamed from: a */
        public String f31486a;

        /* renamed from: b */
        public String f31487b;
        @Nullable

        /* renamed from: c */
        public InputStream f31488c;
        @Nullable

        /* renamed from: d */
        public String f31489d;

        public C12747c(String str, String str2) {
            C12750d.m55072i(str, "Data key must not be empty");
            C12750d.m55074k(str2, "Data value must not be null");
            this.f31486a = str;
            this.f31487b = str2;
        }

        /* renamed from: f */
        public static C12747c m54967f(String str, String str2) {
            return new C12747c(str, str2);
        }

        /* renamed from: g */
        public static C12747c m54968g(String str, String str2, InputStream inputStream) {
            return new C12747c(str, str2).mo29546d(inputStream);
        }

        /* renamed from: a */
        public Connection.C12736b mo29543a(String str) {
            C12750d.m55071h(str);
            this.f31489d = str;
            return this;
        }

        /* renamed from: e */
        public boolean mo29547e() {
            return this.f31488c != null;
        }

        /* renamed from: h */
        public String mo29548h() {
            return this.f31489d;
        }

        /* renamed from: h0 */
        public InputStream mo29549h0() {
            return this.f31488c;
        }

        /* renamed from: i */
        public C12747c mo29546d(InputStream inputStream) {
            C12750d.m55074k(this.f31487b, "Data input stream must not be null");
            this.f31488c = inputStream;
            return this;
        }

        /* renamed from: j */
        public C12747c mo29544b(String str) {
            C12750d.m55072i(str, "Data key must not be empty");
            this.f31486a = str;
            return this;
        }

        /* renamed from: k */
        public C12747c mo29545c(String str) {
            C12750d.m55074k(str, "Data value must not be null");
            this.f31487b = str;
            return this;
        }

        public String key() {
            return this.f31486a;
        }

        public String toString() {
            return this.f31486a + "=" + this.f31487b;
        }

        public String value() {
            return this.f31487b;
        }
    }

    /* renamed from: N */
    public static Connection m54906N(String str) {
        C12744c cVar = new C12744c();
        cVar.mo29521x(str);
        return cVar;
    }

    /* renamed from: O */
    public static Connection m54907O(URL url) {
        C12744c cVar = new C12744c();
        cVar.mo29507k(url);
        return cVar;
    }

    /* renamed from: P */
    public static String m54908P(String str) {
        return str.replace("\"", "%22");
    }

    /* renamed from: Q */
    public static String m54909Q(String str) {
        try {
            return m54910R(new URL(str)).toExternalForm();
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: R */
    public static URL m54910R(URL url) {
        URL T = m54912T(url);
        try {
            return new URL(new URI(T.toExternalForm().replace(" ", "%20")).toASCIIString());
        } catch (MalformedURLException | URISyntaxException unused) {
            return T;
        }
    }

    /* renamed from: S */
    public static boolean m54911S(Connection.C12737c cVar) {
        for (Connection.C12736b e : cVar.mo29560e()) {
            if (e.mo29547e()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: T */
    public static URL m54912T(URL url) {
        if (C12759f.m55106f(url.getHost())) {
            return url;
        }
        try {
            return new URL(url.getProtocol(), IDN.toASCII(url.getHost()), url.getPort(), url.getFile());
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: A */
    public CookieStore mo29487A() {
        return this.f31479a.f31502r.getCookieStore();
    }

    /* renamed from: B */
    public Connection mo29488B(String str) {
        C12750d.m55074k(str, "Referrer must not be null");
        this.f31479a.mo29537l("Referer", str);
        return this;
    }

    /* renamed from: C */
    public Connection mo29489C(Map<String, String> map) {
        C12750d.m55074k(map, "Cookie map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f31479a.mo29535c((String) next.getKey(), (String) next.getValue());
        }
        return this;
    }

    /* renamed from: D */
    public Connection mo29490D(String str, String str2, InputStream inputStream) {
        this.f31479a.mo29574y(C12747c.m54968g(str, str2, inputStream));
        return this;
    }

    /* renamed from: E */
    public Connection mo29491E(Connection.C12738d dVar) {
        this.f31480b = dVar;
        return this;
    }

    /* renamed from: F */
    public Connection mo29492F(String... strArr) {
        boolean z;
        C12750d.m55074k(strArr, "Data key value pairs must not be null");
        if (strArr.length % 2 == 0) {
            z = true;
        } else {
            z = false;
        }
        C12750d.m55068e(z, "Must supply an even number of key value pairs");
        for (int i = 0; i < strArr.length; i += 2) {
            String str = strArr[i];
            String str2 = strArr[i + 1];
            C12750d.m55072i(str, "Data key must not be empty");
            C12750d.m55074k(str2, "Data value must not be null");
            this.f31479a.mo29574y(C12747c.m54967f(str, str2));
        }
        return this;
    }

    /* renamed from: G */
    public Connection.C12736b mo29493G(String str) {
        C12750d.m55072i(str, "Data key must not be empty");
        for (Connection.C12736b next : request().mo29560e()) {
            if (next.key().equals(str)) {
                return next;
            }
        }
        return null;
    }

    /* renamed from: H */
    public Connection mo29494H(Map<String, String> map) {
        C12750d.m55074k(map, "Data map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f31479a.mo29574y(C12747c.m54967f((String) next.getKey(), (String) next.getValue()));
        }
        return this;
    }

    /* renamed from: a */
    public Connection mo29495a(boolean z) {
        this.f31479a.mo29557a(z);
        return this;
    }

    /* renamed from: b */
    public Connection mo29496b(String str) {
        this.f31479a.mo29558b(str);
        return this;
    }

    /* renamed from: c */
    public Connection mo29497c(String str, String str2) {
        this.f31479a.mo29535c(str, str2);
        return this;
    }

    /* renamed from: d */
    public Connection mo29498d(int i) {
        this.f31479a.mo29559d(i);
        return this;
    }

    /* renamed from: e */
    public Connection mo29499e(Collection<Connection.C12736b> collection) {
        C12750d.m55074k(collection, "Data collection must not be null");
        for (Connection.C12736b f0 : collection) {
            this.f31479a.mo29574y(f0);
        }
        return this;
    }

    public Connection.C12738d execute() throws IOException {
        C12749e c0 = C12749e.m55030c0(this.f31479a);
        this.f31480b = c0;
        return c0;
    }

    /* renamed from: f */
    public Connection mo29501f(SSLSocketFactory sSLSocketFactory) {
        this.f31479a.mo29561f(sSLSocketFactory);
        return this;
    }

    /* renamed from: g */
    public Connection mo29502g(String str) {
        this.f31479a.mo29562g(str);
        return this;
    }

    public Document get() throws IOException {
        this.f31479a.mo29538m(Connection.Method.GET);
        execute();
        C12750d.m55073j(this.f31480b);
        return this.f31480b.mo29575C();
    }

    /* renamed from: h */
    public Connection mo29504h(Map<String, String> map) {
        C12750d.m55074k(map, "Header map must not be null");
        for (Map.Entry next : map.entrySet()) {
            this.f31479a.mo29537l((String) next.getKey(), (String) next.getValue());
        }
        return this;
    }

    /* renamed from: i */
    public Connection mo29505i(@Nullable Proxy proxy) {
        this.f31479a.mo29563i(proxy);
        return this;
    }

    /* renamed from: j */
    public Connection mo29506j(C12892e eVar) {
        this.f31479a.mo29564j(eVar);
        return this;
    }

    /* renamed from: k */
    public Connection mo29507k(URL url) {
        this.f31479a.mo29536k(url);
        return this;
    }

    /* renamed from: l */
    public Connection mo29508l(String str, String str2) {
        this.f31479a.mo29537l(str, str2);
        return this;
    }

    /* renamed from: m */
    public Connection mo29509m(Connection.Method method) {
        this.f31479a.mo29538m(method);
        return this;
    }

    /* renamed from: n */
    public Connection mo29510n(String str, int i) {
        this.f31479a.mo29565n(str, i);
        return this;
    }

    /* renamed from: o */
    public Connection mo29511o(int i) {
        this.f31479a.mo29566o(i);
        return this;
    }

    /* renamed from: p */
    public Connection mo29512p(boolean z) {
        this.f31479a.mo29567p(z);
        return this;
    }

    /* renamed from: q */
    public Connection mo29513q(boolean z) {
        this.f31479a.mo29568q(z);
        return this;
    }

    /* renamed from: r */
    public Connection mo29514r(String str, String str2, InputStream inputStream, String str3) {
        this.f31479a.mo29574y(C12747c.m54968g(str, str2, inputStream).mo29543a(str3));
        return this;
    }

    public Connection.C12737c request() {
        return this.f31479a;
    }

    /* renamed from: s */
    public Connection mo29516s() {
        return new C12744c(this.f31479a);
    }

    /* renamed from: t */
    public Connection mo29517t(String str, String str2) {
        this.f31479a.mo29574y(C12747c.m54967f(str, str2));
        return this;
    }

    /* renamed from: u */
    public Document mo29518u() throws IOException {
        this.f31479a.mo29538m(Connection.Method.POST);
        execute();
        C12750d.m55073j(this.f31480b);
        return this.f31480b.mo29575C();
    }

    /* renamed from: v */
    public Connection mo29519v(String str) {
        C12750d.m55074k(str, "User agent must not be null");
        this.f31479a.mo29537l("User-Agent", str);
        return this;
    }

    /* renamed from: w */
    public Connection mo29520w(Connection.C12737c cVar) {
        this.f31479a = (C12748d) cVar;
        return this;
    }

    /* renamed from: x */
    public Connection mo29521x(String str) {
        C12750d.m55072i(str, "Must supply a valid URL");
        try {
            this.f31479a.mo29536k(new URL(m54909Q(str)));
            return this;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Malformed URL: " + str, e);
        }
    }

    /* renamed from: y */
    public Connection.C12738d mo29522y() {
        Connection.C12738d dVar = this.f31480b;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalArgumentException("You must execute the request before getting a response.");
    }

    /* renamed from: z */
    public Connection mo29523z(CookieStore cookieStore) {
        CookieManager unused = this.f31479a.f31502r = new CookieManager(cookieStore, (CookiePolicy) null);
        return this;
    }

    /* renamed from: org.jsoup.helper.c$b */
    public static abstract class C12746b<T extends Connection.C12735a<T>> implements Connection.C12735a<T> {

        /* renamed from: e */
        public static final URL f31481e;

        /* renamed from: a */
        public URL f31482a;

        /* renamed from: b */
        public Connection.Method f31483b;

        /* renamed from: c */
        public Map<String, List<String>> f31484c;

        /* renamed from: d */
        public Map<String, String> f31485d;

        static {
            try {
                f31481e = new URL("http://undefined/");
            } catch (MalformedURLException e) {
                throw new IllegalStateException(e);
            }
        }

        /* renamed from: V */
        public static String m54947V(String str) {
            byte[] bytes = str.getBytes(C12744c.f31478l);
            if (!m54948X(bytes)) {
                return str;
            }
            return new String(bytes, C12744c.f31477k);
        }

        /* renamed from: X */
        public static boolean m54948X(byte[] bArr) {
            int i;
            int i2 = 3;
            if (!(bArr.length >= 3 && (bArr[0] & 255) == 239 && (bArr[1] & 255) == 187 && (bArr[2] & 255) == 191)) {
                i2 = 0;
            }
            int length = bArr.length;
            while (i2 < length) {
                byte b = bArr[i2];
                if ((b & C11354n.f28471b) != 0) {
                    if ((b & 224) == 192) {
                        i = i2 + 1;
                    } else if ((b & 240) == 224) {
                        i = i2 + 2;
                    } else if ((b & 248) != 240) {
                        return false;
                    } else {
                        i = i2 + 3;
                    }
                    if (i >= bArr.length) {
                        return false;
                    }
                    while (i2 < i) {
                        i2++;
                        if ((bArr[i2] & C19135a.f49026p7) != 128) {
                            return false;
                        }
                    }
                    continue;
                }
                i2++;
            }
            return true;
        }

        /* renamed from: A */
        public String mo29525A(String str) {
            C12750d.m55072i(str, "Cookie name must not be empty");
            return this.f31485d.get(str);
        }

        /* renamed from: D */
        public boolean mo29526D(String str) {
            C12750d.m55072i(str, "Cookie name must not be empty");
            return this.f31485d.containsKey(str);
        }

        /* renamed from: E */
        public T mo29527E(String str) {
            C12750d.m55072i(str, "Header name must not be empty");
            Map.Entry<String, List<String>> Y = mo29604Y(str);
            if (Y != null) {
                this.f31484c.remove(Y.getKey());
            }
            return this;
        }

        /* renamed from: F */
        public String mo29528F(String str) {
            C12750d.m55074k(str, "Header name must not be null");
            List<String> W = mo29603W(str);
            if (W.size() > 0) {
                return C12759f.m55111k(W, ", ");
            }
            return null;
        }

        /* renamed from: G */
        public boolean mo29529G(String str) {
            C12750d.m55072i(str, "Header name must not be empty");
            return !mo29603W(str).isEmpty();
        }

        /* renamed from: J */
        public T mo29530J(String str) {
            C12750d.m55072i(str, "Cookie name must not be empty");
            this.f31485d.remove(str);
            return this;
        }

        /* renamed from: L */
        public List<String> mo29531L(String str) {
            C12750d.m55071h(str);
            return mo29603W(str);
        }

        /* renamed from: M */
        public Map<String, List<String>> mo29532M() {
            return this.f31484c;
        }

        /* renamed from: O */
        public Map<String, String> mo29533O() {
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f31484c.size());
            for (Map.Entry next : this.f31484c.entrySet()) {
                String str = (String) next.getKey();
                List list = (List) next.getValue();
                if (list.size() > 0) {
                    linkedHashMap.put(str, (String) list.get(0));
                }
            }
            return linkedHashMap;
        }

        /* renamed from: W */
        public final List<String> mo29603W(String str) {
            C12750d.m55073j(str);
            for (Map.Entry next : this.f31484c.entrySet()) {
                if (str.equalsIgnoreCase((String) next.getKey())) {
                    return (List) next.getValue();
                }
            }
            return Collections.emptyList();
        }

        @Nullable
        /* renamed from: Y */
        public final Map.Entry<String, List<String>> mo29604Y(String str) {
            String a = C12757d.m55098a(str);
            for (Map.Entry<String, List<String>> next : this.f31484c.entrySet()) {
                if (C12757d.m55098a(next.getKey()).equals(a)) {
                    return next;
                }
            }
            return null;
        }

        public T addHeader(String str, String str2) {
            C12750d.m55071h(str);
            if (str2 == null) {
                str2 = "";
            }
            List L = mo29531L(str);
            if (L.isEmpty()) {
                L = new ArrayList();
                this.f31484c.put(str, L);
            }
            L.add(m54947V(str2));
            return this;
        }

        /* renamed from: c */
        public T mo29535c(String str, String str2) {
            C12750d.m55072i(str, "Cookie name must not be empty");
            C12750d.m55074k(str2, "Cookie value must not be null");
            this.f31485d.put(str, str2);
            return this;
        }

        /* renamed from: k */
        public T mo29536k(URL url) {
            C12750d.m55074k(url, "URL must not be null");
            this.f31482a = C12744c.m54912T(url);
            return this;
        }

        /* renamed from: l */
        public T mo29537l(String str, String str2) {
            C12750d.m55072i(str, "Header name must not be empty");
            mo29527E(str);
            addHeader(str, str2);
            return this;
        }

        /* renamed from: m */
        public T mo29538m(Connection.Method method) {
            C12750d.m55074k(method, "Method must not be null");
            this.f31483b = method;
            return this;
        }

        public Connection.Method method() {
            return this.f31483b;
        }

        /* renamed from: u */
        public URL mo29540u() {
            URL url = this.f31482a;
            if (url != f31481e) {
                return url;
            }
            throw new IllegalArgumentException("URL not set. Make sure to call #url(...) before executing the request.");
        }

        /* renamed from: v */
        public boolean mo29541v(String str, String str2) {
            C12750d.m55071h(str);
            C12750d.m55071h(str2);
            for (String equalsIgnoreCase : mo29531L(str)) {
                if (str2.equalsIgnoreCase(equalsIgnoreCase)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: z */
        public Map<String, String> mo29542z() {
            return this.f31485d;
        }

        public C12746b() {
            this.f31482a = f31481e;
            this.f31483b = Connection.Method.GET;
            this.f31484c = new LinkedHashMap();
            this.f31485d = new LinkedHashMap();
        }

        public C12746b(C12746b<T> bVar) {
            this.f31482a = f31481e;
            this.f31483b = Connection.Method.GET;
            this.f31482a = bVar.f31482a;
            this.f31483b = bVar.f31483b;
            this.f31484c = new LinkedHashMap();
            for (Map.Entry next : bVar.f31484c.entrySet()) {
                this.f31484c.put((String) next.getKey(), new ArrayList((Collection) next.getValue()));
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            this.f31485d = linkedHashMap;
            linkedHashMap.putAll(bVar.f31485d);
        }
    }

    public C12744c() {
        this.f31479a = new C12748d();
    }

    public C12744c(C12748d dVar) {
        this.f31479a = new C12748d(dVar);
    }

    public C12744c(C12748d dVar, C12749e eVar) {
        this.f31479a = dVar;
        this.f31480b = eVar;
    }

    /* renamed from: org.jsoup.helper.c$e */
    public static class C12749e extends C12746b<Connection.C12738d> implements Connection.C12738d {

        /* renamed from: q */
        public static final int f31504q = 20;

        /* renamed from: r */
        public static final String f31505r = "Location";

        /* renamed from: s */
        public static final Pattern f31506s = Pattern.compile("(application|text)/\\w*\\+?xml.*");

        /* renamed from: f */
        public final int f31507f;

        /* renamed from: g */
        public final String f31508g;
        @Nullable

        /* renamed from: h */
        public ByteBuffer f31509h;
        @Nullable

        /* renamed from: i */
        public InputStream f31510i;
        @Nullable

        /* renamed from: j */
        public HttpURLConnection f31511j;
        @Nullable

        /* renamed from: k */
        public String f31512k;
        @Nullable

        /* renamed from: l */
        public final String f31513l;

        /* renamed from: m */
        public boolean f31514m;

        /* renamed from: n */
        public boolean f31515n;

        /* renamed from: o */
        public int f31516o;

        /* renamed from: p */
        public final C12748d f31517p;

        public C12749e() {
            super();
            this.f31514m = false;
            this.f31515n = false;
            this.f31516o = 0;
            this.f31507f = 400;
            this.f31508g = "Request not made";
            this.f31517p = new C12748d();
            this.f31513l = null;
        }

        /* renamed from: a0 */
        public static HttpURLConnection m55028a0(C12748d dVar) throws IOException {
            URLConnection uRLConnection;
            Proxy x = dVar.mo29573x();
            if (x == null) {
                uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(dVar.mo29540u().openConnection());
            } else {
                uRLConnection = (URLConnection) FirebasePerfUrlConnection.instrument(dVar.mo29540u().openConnection(x));
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnection;
            httpURLConnection.setRequestMethod(dVar.method().name());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setConnectTimeout(dVar.timeout());
            httpURLConnection.setReadTimeout(dVar.timeout() / 2);
            if (dVar.mo29572w() != null && (httpURLConnection instanceof HttpsURLConnection)) {
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(dVar.mo29572w());
            }
            if (dVar.method().mo29524q()) {
                httpURLConnection.setDoOutput(true);
            }
            C12741a.m54883a(dVar, httpURLConnection);
            for (Map.Entry entry : dVar.mo29532M().entrySet()) {
                for (String addRequestProperty : (List) entry.getValue()) {
                    httpURLConnection.addRequestProperty((String) entry.getKey(), addRequestProperty);
                }
            }
            return httpURLConnection;
        }

        /* renamed from: b0 */
        public static LinkedHashMap<String, List<String>> m55029b0(HttpURLConnection httpURLConnection) {
            LinkedHashMap<String, List<String>> linkedHashMap = new LinkedHashMap<>();
            int i = 0;
            while (true) {
                String headerFieldKey = httpURLConnection.getHeaderFieldKey(i);
                String headerField = httpURLConnection.getHeaderField(i);
                if (headerFieldKey == null && headerField == null) {
                    return linkedHashMap;
                }
                i++;
                if (!(headerFieldKey == null || headerField == null)) {
                    if (linkedHashMap.containsKey(headerFieldKey)) {
                        linkedHashMap.get(headerFieldKey).add(headerField);
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(headerField);
                        linkedHashMap.put(headerFieldKey, arrayList);
                    }
                }
            }
        }

        /* renamed from: c0 */
        public static C12749e m55030c0(C12748d dVar) throws IOException {
            return m55031d0(dVar, (C12749e) null);
        }

        /* JADX WARNING: Removed duplicated region for block: B:28:0x0092 A[Catch:{ IOException -> 0x009f, all -> 0x009d, IOException -> 0x01f9 }] */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00bf A[Catch:{ IOException -> 0x01f4 }] */
        /* JADX WARNING: Removed duplicated region for block: B:59:0x010f  */
        /* renamed from: d0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static org.jsoup.helper.C12744c.C12749e m55031d0(org.jsoup.helper.C12744c.C12748d r8, @javax.annotation.Nullable org.jsoup.helper.C12744c.C12749e r9) throws java.io.IOException {
            /*
                monitor-enter(r8)
                boolean r0 = r8.f31503s     // Catch:{ all -> 0x0204 }
                java.lang.String r1 = "Multiple threads were detected trying to execute the same request concurrently. Make sure to use Connection#newRequest() and do not share an executing request between threads."
                org.jsoup.helper.C12750d.m55066c(r0, r1)     // Catch:{ all -> 0x0204 }
                r0 = 1
                boolean unused = r8.f31503s = r0     // Catch:{ all -> 0x0204 }
                monitor-exit(r8)     // Catch:{ all -> 0x0204 }
                java.lang.String r1 = "Request must not be null"
                org.jsoup.helper.C12750d.m55074k(r8, r1)
                java.net.URL r1 = r8.mo29540u()
                java.lang.String r2 = "URL must be specified to connect"
                org.jsoup.helper.C12750d.m55074k(r1, r2)
                java.lang.String r1 = r1.getProtocol()
                java.lang.String r2 = "http"
                boolean r2 = r1.equals(r2)
                if (r2 != 0) goto L_0x003a
                java.lang.String r2 = "https"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0032
                goto L_0x003a
            L_0x0032:
                java.net.MalformedURLException r8 = new java.net.MalformedURLException
                java.lang.String r9 = "Only http & https protocols supported"
                r8.<init>(r9)
                throw r8
            L_0x003a:
                org.jsoup.Connection$Method r1 = r8.method()
                boolean r1 = r1.mo29524q()
                java.lang.String r2 = r8.mo29554Q()
                r3 = 0
                if (r2 == 0) goto L_0x004b
                r2 = r0
                goto L_0x004c
            L_0x004b:
                r2 = r3
            L_0x004c:
                if (r1 != 0) goto L_0x0066
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Cannot set a request body for HTTP method "
                r4.append(r5)
                org.jsoup.Connection$Method r5 = r8.method()
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                org.jsoup.helper.C12750d.m55066c(r2, r4)
            L_0x0066:
                java.util.Collection r4 = r8.mo29560e()
                int r4 = r4.size()
                r5 = 0
                if (r4 <= 0) goto L_0x0079
                if (r1 == 0) goto L_0x0075
                if (r2 == 0) goto L_0x0079
            L_0x0075:
                m55032h0(r8)
                goto L_0x0080
            L_0x0079:
                if (r1 == 0) goto L_0x0080
                java.lang.String r1 = m55033i0(r8)
                goto L_0x0081
            L_0x0080:
                r1 = r5
            L_0x0081:
                long r6 = java.lang.System.nanoTime()
                java.net.HttpURLConnection r2 = m55028a0(r8)
                r2.connect()     // Catch:{ IOException -> 0x01f9 }
                boolean r4 = r2.getDoOutput()     // Catch:{ IOException -> 0x01f9 }
                if (r4 == 0) goto L_0x00a8
                java.io.OutputStream r4 = r2.getOutputStream()     // Catch:{ IOException -> 0x01f9 }
                m55034j0(r8, r4, r1)     // Catch:{ IOException -> 0x009f }
                r4.close()     // Catch:{ IOException -> 0x01f9 }
                goto L_0x00a8
            L_0x009d:
                r9 = move-exception
                goto L_0x00a4
            L_0x009f:
                r9 = move-exception
                r2.disconnect()     // Catch:{ all -> 0x009d }
                throw r9     // Catch:{ all -> 0x009d }
            L_0x00a4:
                r4.close()     // Catch:{ IOException -> 0x01f9 }
                throw r9     // Catch:{ IOException -> 0x01f9 }
            L_0x00a8:
                int r1 = r2.getResponseCode()     // Catch:{ IOException -> 0x01f9 }
                org.jsoup.helper.c$e r4 = new org.jsoup.helper.c$e     // Catch:{ IOException -> 0x01f9 }
                r4.<init>(r2, r8, r9)     // Catch:{ IOException -> 0x01f9 }
                java.lang.String r9 = "Location"
                boolean r9 = r4.mo29529G(r9)     // Catch:{ IOException -> 0x01f4 }
                if (r9 == 0) goto L_0x010f
                boolean r9 = r8.mo29552B()     // Catch:{ IOException -> 0x01f4 }
                if (r9 == 0) goto L_0x010f
                r9 = 307(0x133, float:4.3E-43)
                if (r1 == r9) goto L_0x00d7
                org.jsoup.Connection$Method r9 = org.jsoup.Connection.Method.GET     // Catch:{ IOException -> 0x01f4 }
                r8.mo29538m(r9)     // Catch:{ IOException -> 0x01f4 }
                java.util.Collection r9 = r8.mo29560e()     // Catch:{ IOException -> 0x01f4 }
                r9.clear()     // Catch:{ IOException -> 0x01f4 }
                r8.mo29558b(r5)     // Catch:{ IOException -> 0x01f4 }
                java.lang.String r9 = "Content-Type"
                r8.mo29527E(r9)     // Catch:{ IOException -> 0x01f4 }
            L_0x00d7:
                java.lang.String r9 = "Location"
                java.lang.String r9 = r4.mo29528F(r9)     // Catch:{ IOException -> 0x01f4 }
                org.jsoup.helper.C12750d.m55073j(r9)     // Catch:{ IOException -> 0x01f4 }
                java.lang.String r0 = "http:/"
                boolean r0 = r9.startsWith(r0)     // Catch:{ IOException -> 0x01f4 }
                if (r0 == 0) goto L_0x00f5
                r0 = 6
                char r1 = r9.charAt(r0)     // Catch:{ IOException -> 0x01f4 }
                r2 = 47
                if (r1 == r2) goto L_0x00f5
                java.lang.String r9 = r9.substring(r0)     // Catch:{ IOException -> 0x01f4 }
            L_0x00f5:
                java.net.URL r0 = r8.mo29540u()     // Catch:{ IOException -> 0x01f4 }
                java.net.URL r9 = org.jsoup.internal.C12759f.m55118r(r0, r9)     // Catch:{ IOException -> 0x01f4 }
                java.net.URL r9 = org.jsoup.helper.C12744c.m54910R(r9)     // Catch:{ IOException -> 0x01f4 }
                r8.mo29536k(r9)     // Catch:{ IOException -> 0x01f4 }
                boolean unused = r8.f31503s = r3     // Catch:{ IOException -> 0x01f4 }
                org.jsoup.helper.c$e r9 = m55031d0(r8, r4)     // Catch:{ IOException -> 0x01f4 }
                boolean unused = r8.f31503s = r3
                return r9
            L_0x010f:
                r9 = 200(0xc8, float:2.8E-43)
                if (r1 < r9) goto L_0x0117
                r9 = 400(0x190, float:5.6E-43)
                if (r1 < r9) goto L_0x011d
            L_0x0117:
                boolean r9 = r8.mo29569r()     // Catch:{ IOException -> 0x01f4 }
                if (r9 == 0) goto L_0x01e4
            L_0x011d:
                java.lang.String r9 = r4.mo29583h()     // Catch:{ IOException -> 0x01f4 }
                if (r9 == 0) goto L_0x014e
                boolean r1 = r8.mo29553I()     // Catch:{ IOException -> 0x01f4 }
                if (r1 != 0) goto L_0x014e
                java.lang.String r1 = "text/"
                boolean r1 = r9.startsWith(r1)     // Catch:{ IOException -> 0x01f4 }
                if (r1 != 0) goto L_0x014e
                java.util.regex.Pattern r1 = f31506s     // Catch:{ IOException -> 0x01f4 }
                java.util.regex.Matcher r1 = r1.matcher(r9)     // Catch:{ IOException -> 0x01f4 }
                boolean r1 = r1.matches()     // Catch:{ IOException -> 0x01f4 }
                if (r1 == 0) goto L_0x013e
                goto L_0x014e
            L_0x013e:
                org.jsoup.UnsupportedMimeTypeException r0 = new org.jsoup.UnsupportedMimeTypeException     // Catch:{ IOException -> 0x01f4 }
                java.lang.String r1 = "Unhandled content type. Must be text/*, application/xml, or application/*+xml"
                java.net.URL r2 = r8.mo29540u()     // Catch:{ IOException -> 0x01f4 }
                java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01f4 }
                r0.<init>(r1, r9, r2)     // Catch:{ IOException -> 0x01f4 }
                throw r0     // Catch:{ IOException -> 0x01f4 }
            L_0x014e:
                if (r9 == 0) goto L_0x0169
                java.util.regex.Pattern r1 = f31506s     // Catch:{ IOException -> 0x01f4 }
                java.util.regex.Matcher r9 = r1.matcher(r9)     // Catch:{ IOException -> 0x01f4 }
                boolean r9 = r9.matches()     // Catch:{ IOException -> 0x01f4 }
                if (r9 == 0) goto L_0x0169
                boolean r9 = r8.f31499o     // Catch:{ IOException -> 0x01f4 }
                if (r9 != 0) goto L_0x0169
                org.jsoup.parser.e r9 = org.jsoup.parser.C12892e.m55934t()     // Catch:{ IOException -> 0x01f4 }
                r8.mo29564j(r9)     // Catch:{ IOException -> 0x01f4 }
            L_0x0169:
                java.lang.String r9 = r4.f31513l     // Catch:{ IOException -> 0x01f4 }
                java.lang.String r9 = org.jsoup.helper.C12742b.m54890d(r9)     // Catch:{ IOException -> 0x01f4 }
                r4.f31512k = r9     // Catch:{ IOException -> 0x01f4 }
                int r9 = r2.getContentLength()     // Catch:{ IOException -> 0x01f4 }
                if (r9 == 0) goto L_0x01d8
                org.jsoup.Connection$Method r9 = r8.method()     // Catch:{ IOException -> 0x01f4 }
                org.jsoup.Connection$Method r1 = org.jsoup.Connection.Method.HEAD     // Catch:{ IOException -> 0x01f4 }
                if (r9 == r1) goto L_0x01d8
                java.io.InputStream r9 = r2.getErrorStream()     // Catch:{ IOException -> 0x01f4 }
                if (r9 == 0) goto L_0x018a
                java.io.InputStream r9 = r2.getErrorStream()     // Catch:{ IOException -> 0x01f4 }
                goto L_0x018e
            L_0x018a:
                java.io.InputStream r9 = r2.getInputStream()     // Catch:{ IOException -> 0x01f4 }
            L_0x018e:
                r4.f31510i = r9     // Catch:{ IOException -> 0x01f4 }
                org.jsoup.helper.C12750d.m55073j(r9)     // Catch:{ IOException -> 0x01f4 }
                java.lang.String r9 = "Content-Encoding"
                java.lang.String r1 = "gzip"
                boolean r9 = r4.mo29541v(r9, r1)     // Catch:{ IOException -> 0x01f4 }
                if (r9 == 0) goto L_0x01a7
                java.util.zip.GZIPInputStream r9 = new java.util.zip.GZIPInputStream     // Catch:{ IOException -> 0x01f4 }
                java.io.InputStream r1 = r4.f31510i     // Catch:{ IOException -> 0x01f4 }
                r9.<init>(r1)     // Catch:{ IOException -> 0x01f4 }
                r4.f31510i = r9     // Catch:{ IOException -> 0x01f4 }
                goto L_0x01bf
            L_0x01a7:
                java.lang.String r9 = "Content-Encoding"
                java.lang.String r1 = "deflate"
                boolean r9 = r4.mo29541v(r9, r1)     // Catch:{ IOException -> 0x01f4 }
                if (r9 == 0) goto L_0x01bf
                java.util.zip.InflaterInputStream r9 = new java.util.zip.InflaterInputStream     // Catch:{ IOException -> 0x01f4 }
                java.io.InputStream r1 = r4.f31510i     // Catch:{ IOException -> 0x01f4 }
                java.util.zip.Inflater r2 = new java.util.zip.Inflater     // Catch:{ IOException -> 0x01f4 }
                r2.<init>(r0)     // Catch:{ IOException -> 0x01f4 }
                r9.<init>(r1, r2)     // Catch:{ IOException -> 0x01f4 }
                r4.f31510i = r9     // Catch:{ IOException -> 0x01f4 }
            L_0x01bf:
                java.io.InputStream r9 = r4.f31510i     // Catch:{ IOException -> 0x01f4 }
                int r1 = r8.mo29555R()     // Catch:{ IOException -> 0x01f4 }
                r2 = 32768(0x8000, float:4.5918E-41)
                org.jsoup.internal.a r9 = org.jsoup.internal.C12754a.m55094d(r9, r2, r1)     // Catch:{ IOException -> 0x01f4 }
                int r1 = r8.timeout()     // Catch:{ IOException -> 0x01f4 }
                long r1 = (long) r1     // Catch:{ IOException -> 0x01f4 }
                org.jsoup.internal.a r9 = r9.mo29633c(r6, r1)     // Catch:{ IOException -> 0x01f4 }
                r4.f31510i = r9     // Catch:{ IOException -> 0x01f4 }
                goto L_0x01de
            L_0x01d8:
                java.nio.ByteBuffer r9 = org.jsoup.helper.C12742b.m54889c()     // Catch:{ IOException -> 0x01f4 }
                r4.f31509h = r9     // Catch:{ IOException -> 0x01f4 }
            L_0x01de:
                boolean unused = r8.f31503s = r3
                r4.f31514m = r0
                return r4
            L_0x01e4:
                org.jsoup.HttpStatusException r9 = new org.jsoup.HttpStatusException     // Catch:{ IOException -> 0x01f4 }
                java.lang.String r0 = "HTTP error fetching URL"
                java.net.URL r2 = r8.mo29540u()     // Catch:{ IOException -> 0x01f4 }
                java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x01f4 }
                r9.<init>(r0, r1, r2)     // Catch:{ IOException -> 0x01f4 }
                throw r9     // Catch:{ IOException -> 0x01f4 }
            L_0x01f4:
                r9 = move-exception
                r5 = r4
                goto L_0x01fa
            L_0x01f7:
                r9 = move-exception
                goto L_0x0200
            L_0x01f9:
                r9 = move-exception
            L_0x01fa:
                if (r5 == 0) goto L_0x01ff
                r5.mo29618g0()     // Catch:{ all -> 0x01f7 }
            L_0x01ff:
                throw r9     // Catch:{ all -> 0x01f7 }
            L_0x0200:
                boolean unused = r8.f31503s = r3
                throw r9
            L_0x0204:
                r9 = move-exception
                monitor-exit(r8)     // Catch:{ all -> 0x0204 }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.C12744c.C12749e.m55031d0(org.jsoup.helper.c$d, org.jsoup.helper.c$e):org.jsoup.helper.c$e");
        }

        /* renamed from: h0 */
        public static void m55032h0(Connection.C12737c cVar) throws IOException {
            boolean z;
            URL u = cVar.mo29540u();
            StringBuilder b = C12759f.m55102b();
            b.append(u.getProtocol());
            b.append("://");
            b.append(u.getAuthority());
            b.append(u.getPath());
            b.append("?");
            if (u.getQuery() != null) {
                b.append(u.getQuery());
                z = false;
            } else {
                z = true;
            }
            for (Connection.C12736b next : cVar.mo29560e()) {
                C12750d.m55066c(next.mo29547e(), "InputStream data not supported in URL query string.");
                if (!z) {
                    b.append(C11626x.f28913d);
                } else {
                    z = false;
                }
                String key = next.key();
                String str = C12742b.f31462c;
                b.append(URLEncoder.encode(key, str));
                b.append('=');
                b.append(URLEncoder.encode(next.value(), str));
            }
            cVar.mo29536k(new URL(C12759f.m55116p(b)));
            cVar.mo29560e().clear();
        }

        @Nullable
        /* renamed from: i0 */
        public static String m55033i0(Connection.C12737c cVar) {
            String F = cVar.mo29528F("Content-Type");
            if (F != null) {
                if (F.contains("multipart/form-data") && !F.contains(C8970v.f24101l)) {
                    String i = C12742b.m54895i();
                    cVar.mo29537l("Content-Type", "multipart/form-data; boundary=" + i);
                    return i;
                }
            } else if (C12744c.m54911S(cVar)) {
                String i2 = C12742b.m54895i();
                cVar.mo29537l("Content-Type", "multipart/form-data; boundary=" + i2);
                return i2;
            } else {
                cVar.mo29537l("Content-Type", "application/x-www-form-urlencoded; charset=" + cVar.mo29570s());
            }
            return null;
        }

        /* renamed from: j0 */
        public static void m55034j0(Connection.C12737c cVar, OutputStream outputStream, @Nullable String str) throws IOException {
            Collection<Connection.C12736b> e = cVar.mo29560e();
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, cVar.mo29570s()));
            if (str != null) {
                for (Connection.C12736b next : e) {
                    bufferedWriter.write("--");
                    bufferedWriter.write(str);
                    bufferedWriter.write("\r\n");
                    bufferedWriter.write("Content-Disposition: form-data; name=\"");
                    bufferedWriter.write(C12744c.m54908P(next.key()));
                    bufferedWriter.write("\"");
                    InputStream h0 = next.mo29549h0();
                    if (h0 != null) {
                        bufferedWriter.write("; filename=\"");
                        bufferedWriter.write(C12744c.m54908P(next.value()));
                        bufferedWriter.write("\"\r\nContent-Type: ");
                        String h = next.mo29548h();
                        if (h == null) {
                            h = C12744c.f31476j;
                        }
                        bufferedWriter.write(h);
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.flush();
                        C12742b.m54887a(h0, outputStream);
                        outputStream.flush();
                    } else {
                        bufferedWriter.write("\r\n\r\n");
                        bufferedWriter.write(next.value());
                    }
                    bufferedWriter.write("\r\n");
                }
                bufferedWriter.write("--");
                bufferedWriter.write(str);
                bufferedWriter.write("--");
            } else {
                String Q = cVar.mo29554Q();
                if (Q != null) {
                    bufferedWriter.write(Q);
                } else {
                    boolean z = true;
                    for (Connection.C12736b next2 : e) {
                        if (!z) {
                            bufferedWriter.append(C11626x.f28913d);
                        } else {
                            z = false;
                        }
                        bufferedWriter.write(URLEncoder.encode(next2.key(), cVar.mo29570s()));
                        bufferedWriter.write(61);
                        bufferedWriter.write(URLEncoder.encode(next2.value(), cVar.mo29570s()));
                    }
                }
            }
            bufferedWriter.close();
        }

        /* renamed from: A */
        public /* bridge */ /* synthetic */ String mo29525A(String str) {
            return super.mo29525A(str);
        }

        /* renamed from: C */
        public Document mo29575C() throws IOException {
            C12750d.m55068e(this.f31514m, "Request must be executed (with .execute(), .get(), or .post() before parsing response");
            if (this.f31509h != null) {
                this.f31510i = new ByteArrayInputStream(this.f31509h.array());
                this.f31515n = false;
            }
            C12750d.m55066c(this.f31515n, "Input stream already read and parsed, cannot re-read.");
            Document j = C12742b.m54896j(this.f31510i, this.f31512k, this.f31482a.toExternalForm(), this.f31517p.mo29556U());
            j.mo29661l3(new C12744c(this.f31517p, this));
            this.f31512k = j.mo29671z3().mo29672b().name();
            this.f31515n = true;
            mo29618g0();
            return j;
        }

        /* renamed from: D */
        public /* bridge */ /* synthetic */ boolean mo29526D(String str) {
            return super.mo29526D(str);
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29527E(String str) {
            return super.mo29527E(str);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ String mo29528F(String str) {
            return super.mo29528F(str);
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo29529G(String str) {
            return super.mo29529G(str);
        }

        /* renamed from: H */
        public String mo29576H() {
            return this.f31512k;
        }

        /* renamed from: J */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29530J(String str) {
            return super.mo29530J(str);
        }

        /* renamed from: L */
        public /* bridge */ /* synthetic */ List mo29531L(String str) {
            return super.mo29531L(str);
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ Map mo29532M() {
            return super.mo29532M();
        }

        /* renamed from: N */
        public Connection.C12738d mo29578N() {
            mo29616e0();
            return this;
        }

        /* renamed from: O */
        public /* bridge */ /* synthetic */ Map mo29533O() {
            return super.mo29533O();
        }

        /* renamed from: P */
        public int mo29579P() {
            return this.f31507f;
        }

        /* renamed from: S */
        public String mo29580S() {
            return this.f31508g;
        }

        /* renamed from: T */
        public byte[] mo29581T() {
            mo29616e0();
            C12750d.m55073j(this.f31509h);
            return this.f31509h.array();
        }

        /* renamed from: Z */
        public C12749e mo29577K(String str) {
            this.f31512k = str;
            return this;
        }

        public /* bridge */ /* synthetic */ Connection.C12735a addHeader(String str, String str2) {
            return super.addHeader(str, str2);
        }

        public String body() {
            Charset charset;
            mo29616e0();
            C12750d.m55073j(this.f31509h);
            String str = this.f31512k;
            if (str == null) {
                charset = C12742b.f31461b;
            } else {
                charset = Charset.forName(str);
            }
            String charBuffer = charset.decode(this.f31509h).toString();
            this.f31509h.rewind();
            return charBuffer;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29535c(String str, String str2) {
            return super.mo29535c(str, str2);
        }

        /* renamed from: e0 */
        public final void mo29616e0() {
            C12750d.m55068e(this.f31514m, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            if (this.f31510i != null && this.f31509h == null) {
                C12750d.m55066c(this.f31515n, "Request has already been read (with .parse())");
                try {
                    this.f31509h = C12742b.m54897k(this.f31510i, this.f31517p.mo29555R());
                    this.f31515n = true;
                    mo29618g0();
                } catch (IOException e) {
                    throw new UncheckedIOException(e);
                } catch (Throwable th) {
                    this.f31515n = true;
                    mo29618g0();
                    throw th;
                }
            }
        }

        /* renamed from: f0 */
        public void mo29617f0(Map<String, List<String>> map) {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                if (str != null) {
                    List<String> list = (List) next.getValue();
                    if (str.equalsIgnoreCase("Set-Cookie")) {
                        for (String str2 : list) {
                            if (str2 != null) {
                                C12894g gVar = new C12894g(str2);
                                String trim = gVar.mo30210e("=").trim();
                                String trim2 = gVar.mo30218m(";").trim();
                                if (trim.length() > 0 && !this.f31485d.containsKey(trim)) {
                                    mo29535c(trim, trim2);
                                }
                            }
                        }
                    }
                    for (String addHeader : list) {
                        addHeader(str, addHeader);
                    }
                }
            }
        }

        /* renamed from: g0 */
        public final void mo29618g0() {
            InputStream inputStream = this.f31510i;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                } catch (Throwable th) {
                    this.f31510i = null;
                    throw th;
                }
                this.f31510i = null;
            }
            HttpURLConnection httpURLConnection = this.f31511j;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
                this.f31511j = null;
            }
        }

        /* renamed from: h */
        public String mo29583h() {
            return this.f31513l;
        }

        /* renamed from: k */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29536k(URL url) {
            return super.mo29536k(url);
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29537l(String str, String str2) {
            return super.mo29537l(str, str2);
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29538m(Connection.Method method) {
            return super.mo29538m(method);
        }

        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        /* renamed from: t */
        public BufferedInputStream mo29584t() {
            C12750d.m55068e(this.f31514m, "Request must be executed (with .execute(), .get(), or .post() before getting response body");
            C12750d.m55066c(this.f31515n, "Request has already been read");
            this.f31515n = true;
            return C12754a.m55094d(this.f31510i, 32768, this.f31517p.mo29555R());
        }

        /* renamed from: u */
        public /* bridge */ /* synthetic */ URL mo29540u() {
            return super.mo29540u();
        }

        /* renamed from: v */
        public /* bridge */ /* synthetic */ boolean mo29541v(String str, String str2) {
            return super.mo29541v(str, str2);
        }

        /* renamed from: z */
        public /* bridge */ /* synthetic */ Map mo29542z() {
            return super.mo29542z();
        }

        public C12749e(HttpURLConnection httpURLConnection, C12748d dVar, @Nullable C12749e eVar) throws IOException {
            super();
            this.f31514m = false;
            this.f31515n = false;
            this.f31516o = 0;
            this.f31511j = httpURLConnection;
            this.f31517p = dVar;
            this.f31483b = Connection.Method.valueOf(httpURLConnection.getRequestMethod());
            this.f31482a = httpURLConnection.getURL();
            this.f31507f = httpURLConnection.getResponseCode();
            this.f31508g = httpURLConnection.getResponseMessage();
            this.f31513l = httpURLConnection.getContentType();
            LinkedHashMap<String, List<String>> b0 = m55029b0(httpURLConnection);
            mo29617f0(b0);
            C12741a.m54886d(dVar, this.f31482a, b0);
            if (eVar != null) {
                for (Map.Entry entry : eVar.mo29542z().entrySet()) {
                    if (!mo29526D((String) entry.getKey())) {
                        mo29535c((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                eVar.mo29618g0();
                int i = eVar.f31516o + 1;
                this.f31516o = i;
                if (i >= 20) {
                    throw new IOException(String.format("Too many redirects occurred trying to load URL %s", new Object[]{eVar.mo29540u()}));
                }
            }
        }
    }

    /* renamed from: org.jsoup.helper.c$d */
    public static class C12748d extends C12746b<Connection.C12737c> implements Connection.C12737c {
        @Nullable

        /* renamed from: f */
        public Proxy f31490f;

        /* renamed from: g */
        public int f31491g;

        /* renamed from: h */
        public int f31492h;

        /* renamed from: i */
        public boolean f31493i;

        /* renamed from: j */
        public final Collection<Connection.C12736b> f31494j;
        @Nullable

        /* renamed from: k */
        public String f31495k;

        /* renamed from: l */
        public boolean f31496l;

        /* renamed from: m */
        public boolean f31497m;

        /* renamed from: n */
        public C12892e f31498n;

        /* renamed from: o */
        public boolean f31499o;

        /* renamed from: p */
        public String f31500p;
        @Nullable

        /* renamed from: q */
        public SSLSocketFactory f31501q;

        /* renamed from: r */
        public CookieManager f31502r;

        /* renamed from: s */
        public volatile boolean f31503s;

        static {
            System.setProperty("sun.net.http.allowRestrictedHeaders", C13758b.f33436b);
        }

        public C12748d() {
            super();
            this.f31495k = null;
            this.f31496l = false;
            this.f31497m = false;
            this.f31499o = false;
            this.f31500p = C12742b.f31462c;
            this.f31503s = false;
            this.f31491g = C40045d.f102092i;
            this.f31492h = 2097152;
            this.f31493i = true;
            this.f31494j = new ArrayList();
            this.f31483b = Connection.Method.GET;
            addHeader(C40045d.f102095l, "gzip");
            addHeader("User-Agent", C12744c.f31470d);
            this.f31498n = C12892e.m55927c();
            this.f31502r = new CookieManager();
        }

        /* renamed from: A */
        public /* bridge */ /* synthetic */ String mo29525A(String str) {
            return super.mo29525A(str);
        }

        /* renamed from: B */
        public boolean mo29552B() {
            return this.f31493i;
        }

        /* renamed from: D */
        public /* bridge */ /* synthetic */ boolean mo29526D(String str) {
            return super.mo29526D(str);
        }

        /* renamed from: E */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29527E(String str) {
            return super.mo29527E(str);
        }

        /* renamed from: F */
        public /* bridge */ /* synthetic */ String mo29528F(String str) {
            return super.mo29528F(str);
        }

        /* renamed from: G */
        public /* bridge */ /* synthetic */ boolean mo29529G(String str) {
            return super.mo29529G(str);
        }

        /* renamed from: I */
        public boolean mo29553I() {
            return this.f31497m;
        }

        /* renamed from: J */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29530J(String str) {
            return super.mo29530J(str);
        }

        /* renamed from: L */
        public /* bridge */ /* synthetic */ List mo29531L(String str) {
            return super.mo29531L(str);
        }

        /* renamed from: M */
        public /* bridge */ /* synthetic */ Map mo29532M() {
            return super.mo29532M();
        }

        /* renamed from: O */
        public /* bridge */ /* synthetic */ Map mo29533O() {
            return super.mo29533O();
        }

        /* renamed from: Q */
        public String mo29554Q() {
            return this.f31495k;
        }

        /* renamed from: R */
        public int mo29555R() {
            return this.f31492h;
        }

        /* renamed from: U */
        public C12892e mo29556U() {
            return this.f31498n;
        }

        /* renamed from: a */
        public Connection.C12737c mo29557a(boolean z) {
            this.f31493i = z;
            return this;
        }

        public /* bridge */ /* synthetic */ Connection.C12735a addHeader(String str, String str2) {
            return super.addHeader(str, str2);
        }

        /* renamed from: b */
        public Connection.C12737c mo29558b(@Nullable String str) {
            this.f31495k = str;
            return this;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29535c(String str, String str2) {
            return super.mo29535c(str, str2);
        }

        /* renamed from: e */
        public Collection<Connection.C12736b> mo29560e() {
            return this.f31494j;
        }

        /* renamed from: e0 */
        public CookieManager mo29609e0() {
            return this.f31502r;
        }

        /* renamed from: f */
        public void mo29561f(SSLSocketFactory sSLSocketFactory) {
            this.f31501q = sSLSocketFactory;
        }

        /* renamed from: f0 */
        public C12748d mo29574y(Connection.C12736b bVar) {
            C12750d.m55074k(bVar, "Key val must not be null");
            this.f31494j.add(bVar);
            return this;
        }

        /* renamed from: g */
        public Connection.C12737c mo29562g(String str) {
            C12750d.m55074k(str, "Charset must not be null");
            if (Charset.isSupported(str)) {
                this.f31500p = str;
                return this;
            }
            throw new IllegalCharsetNameException(str);
        }

        /* renamed from: g0 */
        public C12748d mo29564j(C12892e eVar) {
            this.f31498n = eVar;
            this.f31499o = true;
            return this;
        }

        /* renamed from: h0 */
        public C12748d mo29565n(String str, int i) {
            this.f31490f = new Proxy(Proxy.Type.HTTP, InetSocketAddress.createUnresolved(str, i));
            return this;
        }

        /* renamed from: i0 */
        public C12748d mo29563i(@Nullable Proxy proxy) {
            this.f31490f = proxy;
            return this;
        }

        /* renamed from: j0 */
        public C12748d mo29559d(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            C12750d.m55068e(z, "Timeout milliseconds must be 0 (infinite) or greater");
            this.f31491g = i;
            return this;
        }

        /* renamed from: k */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29536k(URL url) {
            return super.mo29536k(url);
        }

        /* renamed from: l */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29537l(String str, String str2) {
            return super.mo29537l(str, str2);
        }

        /* renamed from: m */
        public /* bridge */ /* synthetic */ Connection.C12735a mo29538m(Connection.Method method) {
            return super.mo29538m(method);
        }

        public /* bridge */ /* synthetic */ Connection.Method method() {
            return super.method();
        }

        /* renamed from: o */
        public Connection.C12737c mo29566o(int i) {
            boolean z;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            C12750d.m55068e(z, "maxSize must be 0 (unlimited) or larger");
            this.f31492h = i;
            return this;
        }

        /* renamed from: p */
        public Connection.C12737c mo29567p(boolean z) {
            this.f31496l = z;
            return this;
        }

        /* renamed from: q */
        public Connection.C12737c mo29568q(boolean z) {
            this.f31497m = z;
            return this;
        }

        /* renamed from: r */
        public boolean mo29569r() {
            return this.f31496l;
        }

        /* renamed from: s */
        public String mo29570s() {
            return this.f31500p;
        }

        public int timeout() {
            return this.f31491g;
        }

        /* renamed from: u */
        public /* bridge */ /* synthetic */ URL mo29540u() {
            return super.mo29540u();
        }

        /* renamed from: v */
        public /* bridge */ /* synthetic */ boolean mo29541v(String str, String str2) {
            return super.mo29541v(str, str2);
        }

        /* renamed from: w */
        public SSLSocketFactory mo29572w() {
            return this.f31501q;
        }

        /* renamed from: x */
        public Proxy mo29573x() {
            return this.f31490f;
        }

        /* renamed from: z */
        public /* bridge */ /* synthetic */ Map mo29542z() {
            return super.mo29542z();
        }

        public C12748d(C12748d dVar) {
            super(dVar);
            this.f31495k = null;
            this.f31496l = false;
            this.f31497m = false;
            this.f31499o = false;
            this.f31500p = C12742b.f31462c;
            this.f31503s = false;
            this.f31490f = dVar.f31490f;
            this.f31500p = dVar.f31500p;
            this.f31491g = dVar.f31491g;
            this.f31492h = dVar.f31492h;
            this.f31493i = dVar.f31493i;
            ArrayList arrayList = new ArrayList();
            this.f31494j = arrayList;
            arrayList.addAll(dVar.mo29560e());
            this.f31495k = dVar.f31495k;
            this.f31496l = dVar.f31496l;
            this.f31497m = dVar.f31497m;
            this.f31498n = dVar.f31498n.mo30178f();
            this.f31499o = dVar.f31499o;
            this.f31501q = dVar.f31501q;
            this.f31502r = dVar.f31502r;
            this.f31503s = false;
        }
    }
}
