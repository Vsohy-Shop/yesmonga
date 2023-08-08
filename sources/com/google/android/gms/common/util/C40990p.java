package com.google.android.gms.common.util;

import androidx.annotation.C0359n0;
import com.google.android.gms.common.annotation.C40473a;
import com.google.android.gms.internal.common.C41101e0;
import com.google.android.gms.internal.common.C41120v;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.text.C11626x;

@C40473a
/* renamed from: com.google.android.gms.common.util.p */
public class C40990p {

    /* renamed from: a */
    public static final Pattern f104254a = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");

    /* renamed from: b */
    public static final Pattern f104255b = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");

    /* renamed from: c */
    public static final Pattern f104256c = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");

    @C40473a
    @C0359n0
    /* renamed from: a */
    public static Map<String, String> m166661a(@C0359n0 URI uri, @C0359n0 String str) {
        String str2;
        Map<String, String> emptyMap = Collections.emptyMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            emptyMap = new HashMap<>();
            C41101e0 c = C41101e0.m166971c(C41120v.m166994b('='));
            for (String f : C41101e0.m166971c(C41120v.m166994b(C11626x.f28913d)).mo134918b().mo134919d(rawQuery)) {
                List f2 = c.mo134920f(f);
                if (f2.isEmpty() || f2.size() > 2) {
                    throw new IllegalArgumentException("bad parameter");
                }
                String b = m166662b((String) f2.get(0), str);
                if (f2.size() == 2) {
                    str2 = m166662b((String) f2.get(1), str);
                } else {
                    str2 = null;
                }
                emptyMap.put(b, str2);
            }
        }
        return emptyMap;
    }

    /* renamed from: b */
    public static String m166662b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLDecoder.decode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
