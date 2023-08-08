package com.google.maps.android.data.kml;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.maps.android.data.kml.r */
public class C33868r {
    /* renamed from: a */
    public static String m136397a(String str, C33859k kVar) {
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = Pattern.compile("\\$\\[(.+?)]").matcher(str);
        while (matcher.find()) {
            String d = kVar.mo98225d(matcher.group(1));
            if (d != null) {
                matcher.appendReplacement(stringBuffer, d);
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}
