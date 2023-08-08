package org.jsoup.helper;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.jsoup.Connection;
import org.jsoup.helper.C12744c;
import org.jsoup.internal.C12759f;

/* renamed from: org.jsoup.helper.a */
public class C12741a {

    /* renamed from: a */
    public static final Map<String, List<String>> f31456a = Collections.unmodifiableMap(new HashMap());

    /* renamed from: b */
    public static final String f31457b = "; ";

    /* renamed from: c */
    public static final String f31458c = "Cookie";

    /* renamed from: d */
    public static final String f31459d = "Cookie2";

    /* renamed from: a */
    public static void m54883a(C12744c.C12748d dVar, HttpURLConnection httpURLConnection) throws IOException {
        HashSet hashSet;
        HashSet hashSet2;
        LinkedHashSet<String> c = m54885c(dVar);
        HashSet hashSet3 = null;
        for (Map.Entry next : dVar.mo29609e0().get(m54884b(dVar.f31482a), f31456a).entrySet()) {
            List list = (List) next.getValue();
            if (!(list == null || list.size() == 0)) {
                String str = (String) next.getKey();
                if (f31458c.equals(str)) {
                    hashSet = hashSet3;
                    hashSet2 = c;
                } else if (f31459d.equals(str)) {
                    hashSet2 = new HashSet();
                    hashSet = hashSet2;
                }
                hashSet2.addAll(list);
                hashSet3 = hashSet;
            }
        }
        if (c.size() > 0) {
            httpURLConnection.addRequestProperty(f31458c, C12759f.m55111k(c, f31457b));
        }
        if (hashSet3 != null && hashSet3.size() > 0) {
            httpURLConnection.addRequestProperty(f31459d, C12759f.m55111k(hashSet3, f31457b));
        }
    }

    /* renamed from: b */
    public static URI m54884b(URL url) throws IOException {
        try {
            return url.toURI();
        } catch (URISyntaxException e) {
            MalformedURLException malformedURLException = new MalformedURLException(e.getMessage());
            malformedURLException.initCause(e);
            throw malformedURLException;
        }
    }

    /* renamed from: c */
    public static LinkedHashSet<String> m54885c(Connection.C12737c cVar) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (Map.Entry next : cVar.mo29542z().entrySet()) {
            linkedHashSet.add(((String) next.getKey()) + "=" + ((String) next.getValue()));
        }
        return linkedHashSet;
    }

    /* renamed from: d */
    public static void m54886d(C12744c.C12748d dVar, URL url, Map<String, List<String>> map) throws IOException {
        dVar.mo29609e0().put(m54884b(url), map);
    }
}
