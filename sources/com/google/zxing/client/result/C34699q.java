package com.google.zxing.client.result;

/* renamed from: com.google.zxing.client.result.q */
public abstract class C34699q {

    /* renamed from: a */
    public final ParsedResultType f84006a;

    public C34699q(ParsedResultType parsedResultType) {
        this.f84006a = parsedResultType;
    }

    /* renamed from: c */
    public static void m141521c(String str, StringBuilder sb) {
        if (str != null && !str.isEmpty()) {
            if (sb.length() > 0) {
                sb.append(10);
            }
            sb.append(str);
        }
    }

    /* renamed from: d */
    public static void m141522d(String[] strArr, StringBuilder sb) {
        if (strArr != null) {
            for (String c : strArr) {
                m141521c(c, sb);
            }
        }
    }

    /* renamed from: a */
    public abstract String mo102515a();

    /* renamed from: b */
    public final ParsedResultType mo102613b() {
        return this.f84006a;
    }

    public final String toString() {
        return mo102515a();
    }
}
