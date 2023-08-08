package com.google.zxing.client.result;

import com.google.zxing.C34761k;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.zxing.client.result.e0 */
public final class C34682e0 extends C34702t {

    /* renamed from: g */
    public static final Pattern f83933g = Pattern.compile("BEGIN:VCARD", 2);

    /* renamed from: h */
    public static final Pattern f83934h = Pattern.compile("\\d{4}-?\\d{2}-?\\d{2}");

    /* renamed from: i */
    public static final Pattern f83935i = Pattern.compile("\r\n[ \t]");

    /* renamed from: j */
    public static final Pattern f83936j = Pattern.compile("\\\\[nN]");

    /* renamed from: k */
    public static final Pattern f83937k = Pattern.compile("\\\\([,;\\\\])");

    /* renamed from: l */
    public static final Pattern f83938l = Pattern.compile("=");

    /* renamed from: m */
    public static final Pattern f83939m = Pattern.compile(";");

    /* renamed from: n */
    public static final Pattern f83940n = Pattern.compile("(?<!\\\\);+");

    /* renamed from: o */
    public static final Pattern f83941o = Pattern.compile(",");

    /* renamed from: p */
    public static final Pattern f83942p = Pattern.compile("[;,]");

    /* renamed from: A */
    public static String[] m141410A(Collection<List<String>> collection) {
        String str;
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List next : collection) {
            String str2 = (String) next.get(0);
            if (str2 != null && !str2.isEmpty()) {
                int i = 1;
                while (true) {
                    if (i >= next.size()) {
                        str = null;
                        break;
                    }
                    str = (String) next.get(i);
                    int indexOf = str.indexOf(61);
                    if (indexOf < 0) {
                        break;
                    } else if ("TYPE".equalsIgnoreCase(str.substring(0, indexOf))) {
                        str = str.substring(indexOf + 1);
                        break;
                    } else {
                        i++;
                    }
                }
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(C34702t.f84014f);
    }

    /* renamed from: q */
    public static String m141411q(CharSequence charSequence, String str) {
        char charAt;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i < length) {
            char charAt2 = charSequence.charAt(i);
            if (!(charAt2 == 10 || charAt2 == 13)) {
                if (charAt2 != '=') {
                    m141417w(byteArrayOutputStream, str, sb);
                    sb.append(charAt2);
                } else if (!(i >= length - 2 || (charAt = charSequence.charAt(i + 1)) == 13 || charAt == 10)) {
                    i += 2;
                    char charAt3 = charSequence.charAt(i);
                    int l = C34702t.m141540l(charAt);
                    int l2 = C34702t.m141540l(charAt3);
                    if (l >= 0 && l2 >= 0) {
                        byteArrayOutputStream.write((l << 4) + l2);
                    }
                }
            }
            i++;
        }
        m141417w(byteArrayOutputStream, str, sb);
        return sb.toString();
    }

    /* renamed from: r */
    public static void m141412r(Iterable<List<String>> iterable) {
        int indexOf;
        if (iterable != null) {
            for (List next : iterable) {
                String str = (String) next.get(0);
                String[] strArr = new String[5];
                int i = 0;
                int i2 = 0;
                while (i < 4 && (indexOf = str.indexOf(59, i2)) >= 0) {
                    strArr[i] = str.substring(i2, indexOf);
                    i++;
                    i2 = indexOf + 1;
                }
                strArr[i] = str.substring(i2);
                StringBuilder sb = new StringBuilder(100);
                m141416v(strArr, 3, sb);
                m141416v(strArr, 1, sb);
                m141416v(strArr, 2, sb);
                m141416v(strArr, 0, sb);
                m141416v(strArr, 4, sb);
                next.set(0, sb.toString().trim());
            }
        }
    }

    /* renamed from: s */
    public static boolean m141413s(CharSequence charSequence) {
        return charSequence == null || f83934h.matcher(charSequence).matches();
    }

    /* renamed from: t */
    public static List<String> m141414t(CharSequence charSequence, String str, boolean z, boolean z2) {
        List<List<String>> u = m141415u(charSequence, str, z, z2);
        if (u == null || u.isEmpty()) {
            return null;
        }
        return u.get(0);
    }

    /* renamed from: u */
    public static List<List<String>> m141415u(CharSequence charSequence, String str, boolean z, boolean z2) {
        String str2;
        String str3;
        int i;
        ArrayList arrayList;
        int indexOf;
        int i2;
        String str4;
        String str5 = str;
        int length = str.length();
        int i3 = 0;
        int i4 = 0;
        ArrayList arrayList2 = null;
        while (i4 < length) {
            int i5 = 2;
            Matcher matcher = Pattern.compile("(?:^|\n)" + charSequence + "(?:;([^:]*))?:", 2).matcher(str5);
            if (i4 > 0) {
                i4--;
            }
            if (!matcher.find(i4)) {
                break;
            }
            int end = matcher.end(i3);
            String group = matcher.group(1);
            if (group != null) {
                String[] split = f83939m.split(group);
                int length2 = split.length;
                int i6 = i3;
                i = i6;
                arrayList = null;
                str3 = null;
                str2 = null;
                while (i6 < length2) {
                    String str6 = split[i6];
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                    }
                    arrayList.add(str6);
                    String[] split2 = f83938l.split(str6, i5);
                    if (split2.length > 1) {
                        String str7 = split2[0];
                        String str8 = split2[1];
                        if ("ENCODING".equalsIgnoreCase(str7) && "QUOTED-PRINTABLE".equalsIgnoreCase(str8)) {
                            i = 1;
                        } else if ("CHARSET".equalsIgnoreCase(str7)) {
                            str3 = str8;
                        } else if ("VALUE".equalsIgnoreCase(str7)) {
                            str2 = str8;
                        }
                    }
                    i6++;
                    i5 = 2;
                }
            } else {
                arrayList = null;
                i = 0;
                str3 = null;
                str2 = null;
            }
            int i7 = end;
            while (true) {
                indexOf = str5.indexOf(10, i7);
                if (indexOf < 0) {
                    break;
                }
                if (indexOf < str.length() - 1) {
                    int i8 = indexOf + 1;
                    if (str5.charAt(i8) == ' ' || str5.charAt(i8) == 9) {
                        i7 = indexOf + 2;
                    }
                }
                if (i == 0) {
                    break;
                }
                if (indexOf <= 0 || str5.charAt(indexOf - 1) != '=') {
                    if (indexOf >= 2) {
                        if (str5.charAt(indexOf - 2) != '=') {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                i7 = indexOf + 1;
            }
            if (indexOf < 0) {
                i4 = length;
                i3 = 0;
            } else {
                if (indexOf > end) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList(1);
                    }
                    if (indexOf > 0 && str5.charAt(indexOf - 1) == 13) {
                        indexOf--;
                    }
                    String substring = str5.substring(end, indexOf);
                    if (z) {
                        substring = substring.trim();
                    }
                    if (i != 0) {
                        str4 = m141411q(substring, str3);
                        if (z2) {
                            str4 = f83940n.matcher(str4).replaceAll("\n").trim();
                        }
                    } else {
                        if (z2) {
                            substring = f83940n.matcher(substring).replaceAll("\n").trim();
                        }
                        str4 = f83937k.matcher(f83936j.matcher(f83935i.matcher(substring).replaceAll("")).replaceAll("\n")).replaceAll("$1");
                    }
                    if ("uri".equals(str2)) {
                        try {
                            str4 = URI.create(str4).getSchemeSpecificPart();
                        } catch (IllegalArgumentException unused) {
                        }
                    }
                    if (arrayList == null) {
                        ArrayList arrayList3 = new ArrayList(1);
                        arrayList3.add(str4);
                        arrayList2.add(arrayList3);
                    } else {
                        i2 = 0;
                        arrayList.add(0, str4);
                        arrayList2.add(arrayList);
                        i3 = i2;
                        i4 = indexOf + 1;
                    }
                }
                i2 = 0;
                i3 = i2;
                i4 = indexOf + 1;
            }
        }
        return arrayList2;
    }

    /* renamed from: v */
    public static void m141416v(String[] strArr, int i, StringBuilder sb) {
        String str = strArr[i];
        if (str != null && !str.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(strArr[i]);
        }
    }

    /* renamed from: w */
    public static void m141417w(ByteArrayOutputStream byteArrayOutputStream, String str, StringBuilder sb) {
        String str2;
        if (byteArrayOutputStream.size() > 0) {
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (str == null) {
                str2 = new String(byteArray, StandardCharsets.UTF_8);
            } else {
                try {
                    str2 = new String(byteArray, str);
                } catch (UnsupportedEncodingException unused) {
                    str2 = new String(byteArray, StandardCharsets.UTF_8);
                }
            }
            byteArrayOutputStream.reset();
            sb.append(str2);
        }
    }

    /* renamed from: y */
    public static String m141418y(List<String> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: z */
    public static String[] m141419z(Collection<List<String>> collection) {
        if (collection == null || collection.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (List<String> list : collection) {
            String str = (String) list.get(0);
            if (str != null && !str.isEmpty()) {
                arrayList.add(str);
            }
        }
        return (String[]) arrayList.toArray(C34702t.f84014f);
    }

    /* renamed from: x */
    public C34679d mo102518k(C34761k kVar) {
        String[] strArr;
        List<String> list;
        String[] strArr2;
        String[] strArr3;
        String c = C34702t.m141532c(kVar);
        Matcher matcher = f83933g.matcher(c);
        if (!matcher.find() || matcher.start() != 0) {
            return null;
        }
        List<List<String>> u = m141415u("FN", c, true, false);
        if (u == null) {
            u = m141415u("N", c, true, false);
            m141412r(u);
        }
        List<String> t = m141414t("NICKNAME", c, true, false);
        if (t == null) {
            strArr = null;
        } else {
            strArr = f83941o.split(t.get(0));
        }
        List<List<String>> u2 = m141415u("TEL", c, true, false);
        List<List<String>> u3 = m141415u("EMAIL", c, true, false);
        List<String> t2 = m141414t("NOTE", c, false, false);
        List<List<String>> u4 = m141415u("ADR", c, true, true);
        List<String> t3 = m141414t("ORG", c, true, true);
        List<String> t4 = m141414t("BDAY", c, true, false);
        if (t4 == null || m141413s(t4.get(0))) {
            list = t4;
        } else {
            list = null;
        }
        List<String> t5 = m141414t("TITLE", c, true, false);
        List<List<String>> u5 = m141415u("URL", c, true, false);
        List<String> t6 = m141414t("IMPP", c, true, false);
        List<String> t7 = m141414t("GEO", c, true, false);
        if (t7 == null) {
            strArr2 = null;
        } else {
            strArr2 = f83942p.split(t7.get(0));
        }
        if (strArr2 == null || strArr2.length == 2) {
            strArr3 = strArr2;
        } else {
            strArr3 = null;
        }
        return new C34679d(m141419z(u), strArr, (String) null, m141419z(u2), m141410A(u2), m141419z(u3), m141410A(u3), m141418y(t6), m141418y(t2), m141419z(u4), m141410A(u4), m141418y(t3), m141418y(list), m141418y(t5), m141419z(u5), strArr3);
    }
}
