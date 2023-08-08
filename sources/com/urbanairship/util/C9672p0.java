package com.urbanairship.util;

import android.net.Uri;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.annotation.RestrictTo;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: com.urbanairship.util.p0 */
public class C9672p0 {
    @C0359n0
    /* renamed from: a */
    public static Map<String, List<String>> m36234a(@C0359n0 Uri uri) {
        String str;
        HashMap hashMap = new HashMap();
        String encodedQuery = uri.getEncodedQuery();
        if (C9669o0.m36224e(encodedQuery)) {
            return hashMap;
        }
        for (String split : encodedQuery.split("&")) {
            String[] split2 = split.split("=");
            String str2 = null;
            if (split2.length >= 1) {
                str = Uri.decode(split2[0]);
            } else {
                str = null;
            }
            if (split2.length >= 2) {
                str2 = Uri.decode(split2[1]);
            }
            if (!C9669o0.m36224e(str)) {
                List list = (List) hashMap.get(str);
                if (list == null) {
                    list = new ArrayList();
                    hashMap.put(str, list);
                }
                list.add(str2);
            }
        }
        return hashMap;
    }

    @C0363p0
    /* renamed from: b */
    public static Uri m36235b(@C0363p0 Object obj) {
        if ((obj instanceof String) || (obj instanceof Uri) || (obj instanceof URL)) {
            return Uri.parse(String.valueOf(obj));
        }
        return null;
    }
}
