package p073j$.time.format;

import com.carrefour.fid.android.shared.util.C28932h;
import com.google.android.material.badge.C31132a;
import kotlinx.serialization.json.internal.C12361b;
import p073j$.time.temporal.C42662a;

/* renamed from: j$.time.format.j */
final class C42636j implements C42633g {

    /* renamed from: a */
    public final /* synthetic */ int f107865a;

    /* renamed from: b */
    private final Object f107866b;

    public /* synthetic */ C42636j(Object obj, int i) {
        this.f107865a = i;
        this.f107866b = obj;
    }

    /* renamed from: a */
    private static void m172356a(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    /* renamed from: b */
    static int m172357b(CharSequence charSequence, int i) {
        char charAt = charSequence.charAt(i);
        if (charAt < '0' || charAt > '9') {
            return -1;
        }
        return charAt - '0';
    }

    /* renamed from: n */
    public final boolean mo138135n(C42651y yVar, StringBuilder sb) {
        int i = this.f107865a;
        Object obj = this.f107866b;
        switch (i) {
            case 0:
                Long e = yVar.mo138185e(C42662a.OFFSET_SECONDS);
                if (e == null) {
                    return false;
                }
                sb.append(C28932h.f70913W);
                int intExact = Math.toIntExact(e.longValue());
                if (intExact == 0) {
                    return true;
                }
                int abs = Math.abs((intExact / 3600) % 100);
                int abs2 = Math.abs((intExact / 60) % 60);
                int abs3 = Math.abs(intExact % 60);
                sb.append(intExact < 0 ? "-" : C31132a.f74628J0);
                if (((TextStyle) obj) == TextStyle.FULL) {
                    m172356a(sb, abs);
                    sb.append(C12361b.f30257h);
                    m172356a(sb, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                } else {
                    if (abs >= 10) {
                        sb.append((char) ((abs / 10) + 48));
                    }
                    sb.append((char) ((abs % 10) + 48));
                    if (abs2 == 0 && abs3 == 0) {
                        return true;
                    }
                    sb.append(C12361b.f30257h);
                    m172356a(sb, abs2);
                    if (abs3 == 0) {
                        return true;
                    }
                }
                sb.append(C12361b.f30257h);
                m172356a(sb, abs3);
                return true;
            default:
                sb.append((String) obj);
                return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0083, code lost:
        if (r13 >= 0) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d9, code lost:
        if (r13 >= 0) goto L_0x00db;
     */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo138136o(p073j$.time.format.C42649w r12, java.lang.CharSequence r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.f107865a
            java.lang.Object r1 = r11.f107866b
            switch(r0) {
                case 0: goto L_0x0009;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x0109
        L_0x0009:
            int r0 = r13.length()
            int r0 = r0 + r14
            java.lang.String r5 = "GMT"
            r6 = 0
            r7 = 3
            r2 = r12
            r3 = r13
            r4 = r14
            boolean r2 = r2.mo138178s(r3, r4, r5, r6, r7)
            if (r2 != 0) goto L_0x001d
            goto L_0x008e
        L_0x001d:
            int r8 = r14 + 3
            if (r8 != r0) goto L_0x0023
            goto L_0x00fe
        L_0x0023:
            char r2 = r13.charAt(r8)
            r3 = 43
            r4 = 1
            if (r2 != r3) goto L_0x002e
            r2 = r4
            goto L_0x0033
        L_0x002e:
            r3 = 45
            if (r2 != r3) goto L_0x00fe
            r2 = -1
        L_0x0033:
            int r8 = r8 + r4
            j$.time.format.TextStyle r1 = (p073j$.time.format.TextStyle) r1
            j$.time.format.TextStyle r3 = p073j$.time.format.TextStyle.FULL
            r4 = 0
            r5 = 58
            if (r1 != r3) goto L_0x0086
            int r1 = r8 + 1
            int r3 = m172357b(r13, r8)
            int r6 = r1 + 1
            int r1 = m172357b(r13, r1)
            if (r3 < 0) goto L_0x008e
            if (r1 < 0) goto L_0x008e
            int r7 = r6 + 1
            char r6 = r13.charAt(r6)
            if (r6 == r5) goto L_0x0056
            goto L_0x008e
        L_0x0056:
            int r3 = r3 * 10
            int r3 = r3 + r1
            int r1 = r7 + 1
            int r6 = m172357b(r13, r7)
            int r7 = r1 + 1
            int r1 = m172357b(r13, r1)
            if (r6 < 0) goto L_0x008e
            if (r1 >= 0) goto L_0x006a
            goto L_0x008e
        L_0x006a:
            int r6 = r6 * 10
            int r6 = r6 + r1
            int r1 = r7 + 2
            if (r1 >= r0) goto L_0x00e1
            char r0 = r13.charAt(r7)
            if (r0 != r5) goto L_0x00e1
            int r0 = r7 + 1
            int r0 = m172357b(r13, r0)
            int r13 = m172357b(r13, r1)
            if (r0 < 0) goto L_0x00e1
            if (r13 < 0) goto L_0x00e1
            goto L_0x00db
        L_0x0086:
            int r1 = r8 + 1
            int r3 = m172357b(r13, r8)
            if (r3 >= 0) goto L_0x0091
        L_0x008e:
            int r12 = ~r14
            goto L_0x0108
        L_0x0091:
            if (r1 >= r0) goto L_0x00e5
            int r6 = m172357b(r13, r1)
            if (r6 < 0) goto L_0x009e
            int r3 = r3 * 10
            int r3 = r3 + r6
            int r1 = r1 + 1
        L_0x009e:
            int r6 = r1 + 2
            if (r6 >= r0) goto L_0x00e5
            char r7 = r13.charAt(r1)
            if (r7 != r5) goto L_0x00e5
            if (r6 >= r0) goto L_0x00e5
            char r7 = r13.charAt(r1)
            if (r7 != r5) goto L_0x00e5
            int r7 = r1 + 1
            int r7 = m172357b(r13, r7)
            int r6 = m172357b(r13, r6)
            if (r7 < 0) goto L_0x00e5
            if (r6 < 0) goto L_0x00e5
            int r7 = r7 * 10
            int r6 = r6 + r7
            int r7 = r1 + 3
            int r1 = r7 + 2
            if (r1 >= r0) goto L_0x00e1
            char r0 = r13.charAt(r7)
            if (r0 != r5) goto L_0x00e1
            int r0 = r7 + 1
            int r0 = m172357b(r13, r0)
            int r13 = m172357b(r13, r1)
            if (r0 < 0) goto L_0x00e1
            if (r13 < 0) goto L_0x00e1
        L_0x00db:
            int r0 = r0 * 10
            int r0 = r0 + r13
            int r7 = r7 + 3
            r4 = r0
        L_0x00e1:
            r13 = r4
            r4 = r6
            r10 = r7
            goto L_0x00e7
        L_0x00e5:
            r10 = r1
            r13 = r4
        L_0x00e7:
            long r0 = (long) r2
            long r2 = (long) r3
            r5 = 3600(0xe10, double:1.7786E-320)
            long r2 = r2 * r5
            long r4 = (long) r4
            r6 = 60
            long r4 = r4 * r6
            long r4 = r4 + r2
            long r2 = (long) r13
            long r4 = r4 + r2
            long r7 = r4 * r0
            j$.time.temporal.a r6 = p073j$.time.temporal.C42662a.OFFSET_SECONDS
            r5 = r12
            r9 = r14
            int r12 = r5.mo138174o(r6, r7, r9, r10)
            goto L_0x0108
        L_0x00fe:
            j$.time.temporal.a r4 = p073j$.time.temporal.C42662a.OFFSET_SECONDS
            r5 = 0
            r3 = r12
            r7 = r14
            int r12 = r3.mo138174o(r4, r5, r7, r8)
        L_0x0108:
            return r12
        L_0x0109:
            int r0 = r13.length()
            if (r14 > r0) goto L_0x012a
            if (r14 < 0) goto L_0x012a
            java.lang.String r1 = (java.lang.String) r1
            r6 = 0
            int r7 = r1.length()
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r1
            boolean r12 = r2.mo138178s(r3, r4, r5, r6, r7)
            if (r12 != 0) goto L_0x0124
            int r12 = ~r14
            goto L_0x0129
        L_0x0124:
            int r12 = r1.length()
            int r12 = r12 + r14
        L_0x0129:
            return r12
        L_0x012a:
            java.lang.IndexOutOfBoundsException r12 = new java.lang.IndexOutOfBoundsException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.format.C42636j.mo138136o(j$.time.format.w, java.lang.CharSequence, int):int");
    }

    public final String toString() {
        int i = this.f107865a;
        Object obj = this.f107866b;
        switch (i) {
            case 0:
                return "LocalizedOffset(" + ((TextStyle) obj) + ")";
            default:
                String replace = ((String) obj).replace("'", "''");
                return "'" + replace + "'";
        }
    }
}
