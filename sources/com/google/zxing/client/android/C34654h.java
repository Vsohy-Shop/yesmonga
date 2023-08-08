package com.google.zxing.client.android;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.carrefour.fid.android.airship.util.C13758b;
import com.google.zxing.DecodeHintType;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.client.android.h */
public final class C34654h {

    /* renamed from: a */
    public static final String f83851a = "h";

    /* renamed from: b */
    public static final Pattern f83852b = Pattern.compile(",");

    /* renamed from: a */
    public static Map<DecodeHintType, Object> m141352a(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || extras.isEmpty()) {
            return null;
        }
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        for (DecodeHintType decodeHintType : DecodeHintType.values()) {
            if (!(decodeHintType == DecodeHintType.CHARACTER_SET || decodeHintType == DecodeHintType.NEED_RESULT_POINT_CALLBACK || decodeHintType == DecodeHintType.POSSIBLE_FORMATS)) {
                String name = decodeHintType.name();
                if (extras.containsKey(name)) {
                    if (decodeHintType.mo102408g().equals(Void.class)) {
                        enumMap.put(decodeHintType, Boolean.TRUE);
                    } else {
                        Object obj = extras.get(name);
                        if (decodeHintType.mo102408g().isInstance(obj)) {
                            enumMap.put(decodeHintType, obj);
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Ignoring hint ");
                            sb.append(decodeHintType);
                            sb.append(" because it is not assignable from ");
                            sb.append(obj);
                        }
                    }
                }
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hints from the Intent: ");
        sb2.append(enumMap);
        return enumMap;
    }

    /* renamed from: b */
    public static Map<DecodeHintType, ?> m141353b(Uri uri) {
        String str;
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null || encodedQuery.isEmpty()) {
            return null;
        }
        Map<String, String> c = m141354c(encodedQuery);
        EnumMap enumMap = new EnumMap(DecodeHintType.class);
        for (DecodeHintType decodeHintType : DecodeHintType.values()) {
            if (!(decodeHintType == DecodeHintType.CHARACTER_SET || decodeHintType == DecodeHintType.NEED_RESULT_POINT_CALLBACK || decodeHintType == DecodeHintType.POSSIBLE_FORMATS || (str = c.get(decodeHintType.name())) == null)) {
                if (decodeHintType.mo102408g().equals(Object.class)) {
                    enumMap.put(decodeHintType, str);
                } else if (decodeHintType.mo102408g().equals(Void.class)) {
                    enumMap.put(decodeHintType, Boolean.TRUE);
                } else if (decodeHintType.mo102408g().equals(String.class)) {
                    enumMap.put(decodeHintType, str);
                } else if (decodeHintType.mo102408g().equals(Boolean.class)) {
                    if (str.isEmpty()) {
                        enumMap.put(decodeHintType, Boolean.TRUE);
                    } else if ("0".equals(str) || C13758b.f33438c.equalsIgnoreCase(str) || "no".equalsIgnoreCase(str)) {
                        enumMap.put(decodeHintType, Boolean.FALSE);
                    } else {
                        enumMap.put(decodeHintType, Boolean.TRUE);
                    }
                } else if (decodeHintType.mo102408g().equals(int[].class)) {
                    if (!str.isEmpty() && str.charAt(str.length() - 1) == ',') {
                        str = str.substring(0, str.length() - 1);
                    }
                    String[] split = f83852b.split(str);
                    int[] iArr = new int[split.length];
                    int i = 0;
                    while (i < split.length) {
                        try {
                            iArr[i] = Integer.parseInt(split[i]);
                            i++;
                        } catch (NumberFormatException unused) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Skipping array of integers hint ");
                            sb.append(decodeHintType);
                            sb.append(" due to invalid numeric value: '");
                            sb.append(split[i]);
                            sb.append('\'');
                            iArr = null;
                        }
                    }
                    if (iArr != null) {
                        enumMap.put(decodeHintType, iArr);
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unsupported hint type '");
                    sb2.append(decodeHintType);
                    sb2.append("' of type ");
                    sb2.append(decodeHintType.mo102408g());
                }
            }
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Hints from the URI: ");
        sb3.append(enumMap);
        return enumMap;
    }

    /* renamed from: c */
    public static Map<String, String> m141354c(String str) {
        String str2;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            if (i >= str.length()) {
                break;
            } else if (str.charAt(i) == '&') {
                i++;
            } else {
                int indexOf = str.indexOf(38, i);
                int indexOf2 = str.indexOf(61, i);
                String str3 = "";
                if (indexOf < 0) {
                    if (indexOf2 < 0) {
                        str2 = Uri.decode(str.substring(i).replace('+', ' '));
                    } else {
                        String decode = Uri.decode(str.substring(i, indexOf2).replace('+', ' '));
                        str3 = Uri.decode(str.substring(indexOf2 + 1).replace('+', ' '));
                        str2 = decode;
                    }
                    if (!hashMap.containsKey(str2)) {
                        hashMap.put(str2, str3);
                    }
                } else {
                    if (indexOf2 < 0 || indexOf2 > indexOf) {
                        String decode2 = Uri.decode(str.substring(i, indexOf).replace('+', ' '));
                        if (!hashMap.containsKey(decode2)) {
                            hashMap.put(decode2, str3);
                        }
                    } else {
                        String decode3 = Uri.decode(str.substring(i, indexOf2).replace('+', ' '));
                        String decode4 = Uri.decode(str.substring(indexOf2 + 1, indexOf).replace('+', ' '));
                        if (!hashMap.containsKey(decode3)) {
                            hashMap.put(decode3, decode4);
                        }
                    }
                    i = indexOf + 1;
                }
            }
        }
        return hashMap;
    }
}
