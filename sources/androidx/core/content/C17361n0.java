package androidx.core.content;

import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import java.util.ArrayList;

/* renamed from: androidx.core.content.n0 */
public final class C17361n0 {
    @C0363p0
    /* renamed from: a */
    public static String m79892a(@C0363p0 String str, @C0359n0 String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (m79896e(split, str2.split("/"))) {
                return str2;
            }
        }
        return null;
    }

    @C0363p0
    /* renamed from: b */
    public static String m79893b(@C0363p0 String[] strArr, @C0359n0 String str) {
        if (strArr == null) {
            return null;
        }
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (m79896e(str2.split("/"), split)) {
                return str2;
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m79894c(@C0363p0 String str, @C0359n0 String str2) {
        if (str == null) {
            return false;
        }
        return m79896e(str.split("/"), str2.split("/"));
    }

    @C0359n0
    /* renamed from: d */
    public static String[] m79895d(@C0363p0 String[] strArr, @C0359n0 String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split("/");
        for (String str2 : strArr) {
            if (m79896e(str2.split("/"), split)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    /* renamed from: e */
    public static boolean m79896e(@C0359n0 String[] strArr, @C0359n0 String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        } else if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        } else if (strArr.length != 2) {
            return false;
        } else {
            if (!"*".equals(strArr2[0]) && !strArr2[0].equals(strArr[0])) {
                return false;
            }
            if ("*".equals(strArr2[1]) || strArr2[1].equals(strArr[1])) {
                return true;
            }
            return false;
        }
    }
}
