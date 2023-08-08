package p073j$.time.format;

import com.google.android.material.badge.C31132a;
import com.google.firebase.installations.C33124s;
import java.util.Objects;
import p073j$.time.temporal.C42662a;

/* renamed from: j$.time.format.l */
final class C42638l implements C42633g {

    /* renamed from: c */
    static final String[] f107873c = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS"};

    /* renamed from: d */
    static final C42638l f107874d = new C42638l("+HH:MM:ss", "Z");

    /* renamed from: e */
    static final C42638l f107875e = new C42638l("+HH:MM:ss", "0");

    /* renamed from: a */
    private final String f107876a;

    /* renamed from: b */
    private final int f107877b;

    C42638l(String str, String str2) {
        Objects.requireNonNull(str, "pattern");
        int i = 0;
        while (true) {
            String[] strArr = f107873c;
            if (i >= 9) {
                throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
            } else if (strArr[i].equals(str)) {
                this.f107877b = i;
                this.f107876a = str2;
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: a */
    private boolean m172368a(int[] iArr, int i, CharSequence charSequence, boolean z) {
        int i2;
        int i3 = this.f107877b;
        if ((i3 + 3) / 2 < i) {
            return false;
        }
        int i4 = iArr[0];
        if (i3 % 2 == 0 && i > 1) {
            int i5 = i4 + 1;
            if (i5 > charSequence.length() || charSequence.charAt(i4) != ':') {
                return z;
            }
            i4 = i5;
        }
        if (i4 + 2 > charSequence.length()) {
            return z;
        }
        int i6 = i4 + 1;
        char charAt = charSequence.charAt(i4);
        int i7 = i6 + 1;
        char charAt2 = charSequence.charAt(i6);
        if (charAt < '0' || charAt > '9' || charAt2 < '0' || charAt2 > '9' || (i2 = (charAt2 - '0') + ((charAt - '0') * 10)) < 0 || i2 > 59) {
            return z;
        }
        iArr[i] = i2;
        iArr[0] = i7;
        return false;
    }

    /* renamed from: n */
    public final boolean mo138135n(C42651y yVar, StringBuilder sb) {
        Long e = yVar.mo138185e(C42662a.OFFSET_SECONDS);
        if (e == null) {
            return false;
        }
        int intExact = Math.toIntExact(e.longValue());
        if (intExact != 0) {
            int abs = Math.abs((intExact / 3600) % 100);
            int abs2 = Math.abs((intExact / 60) % 60);
            int abs3 = Math.abs(intExact % 60);
            int length = sb.length();
            sb.append(intExact < 0 ? "-" : C31132a.f74628J0);
            sb.append((char) ((abs / 10) + 48));
            sb.append((char) ((abs % 10) + 48));
            int i = this.f107877b;
            if (i >= 3 || (i >= 1 && abs2 > 0)) {
                int i2 = i % 2;
                String str = C33124s.f80355c;
                sb.append(i2 == 0 ? str : "");
                sb.append((char) ((abs2 / 10) + 48));
                sb.append((char) ((abs2 % 10) + 48));
                abs += abs2;
                if (i >= 7 || (i >= 5 && abs3 > 0)) {
                    if (i2 != 0) {
                        str = "";
                    }
                    sb.append(str);
                    sb.append((char) ((abs3 / 10) + 48));
                    sb.append((char) ((abs3 % 10) + 48));
                    abs += abs3;
                }
            }
            if (abs == 0) {
                sb.setLength(length);
            }
            return true;
        }
        sb.append(this.f107876a);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002e, code lost:
        if (r16.mo138178s(r17, r18, r0.f107876a, 0, r9) != false) goto L_0x0088;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x006c  */
    /* renamed from: o */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo138136o(p073j$.time.format.C42649w r16, java.lang.CharSequence r17, int r18) {
        /*
            r15 = this;
            r0 = r15
            r7 = r17
            r8 = r18
            int r1 = r17.length()
            java.lang.String r2 = r0.f107876a
            int r9 = r2.length()
            r10 = 0
            if (r9 != 0) goto L_0x001c
            if (r8 != r1) goto L_0x0031
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.OFFSET_SECONDS
            r2 = r1
            r6 = r8
            r3 = r10
            goto L_0x008f
        L_0x001c:
            if (r8 != r1) goto L_0x0020
            int r1 = ~r8
            return r1
        L_0x0020:
            java.lang.String r4 = r0.f107876a
            r5 = 0
            r1 = r16
            r2 = r17
            r3 = r18
            r6 = r9
            boolean r1 = r1.mo138178s(r2, r3, r4, r5, r6)
            if (r1 == 0) goto L_0x0031
            goto L_0x0088
        L_0x0031:
            char r1 = r17.charAt(r18)
            r2 = 43
            r3 = 45
            if (r1 == r2) goto L_0x003d
            if (r1 != r3) goto L_0x0086
        L_0x003d:
            r2 = 1
            if (r1 != r3) goto L_0x0042
            r1 = -1
            goto L_0x0043
        L_0x0042:
            r1 = r2
        L_0x0043:
            r3 = 4
            int[] r3 = new int[r3]
            int r4 = r8 + 1
            r5 = 0
            r3[r5] = r4
            boolean r4 = r15.m172368a(r3, r2, r7, r2)
            r6 = 2
            r12 = 3
            if (r4 != 0) goto L_0x0069
            int r4 = r0.f107877b
            if (r4 < r12) goto L_0x0059
            r4 = r2
            goto L_0x005a
        L_0x0059:
            r4 = r5
        L_0x005a:
            boolean r4 = r15.m172368a(r3, r6, r7, r4)
            if (r4 != 0) goto L_0x0069
            boolean r4 = r15.m172368a(r3, r12, r7, r5)
            if (r4 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r4 = r5
            goto L_0x006a
        L_0x0069:
            r4 = r2
        L_0x006a:
            if (r4 != 0) goto L_0x0086
            long r9 = (long) r1
            r1 = r3[r2]
            long r1 = (long) r1
            r13 = 3600(0xe10, double:1.7786E-320)
            long r1 = r1 * r13
            r4 = r3[r6]
            long r6 = (long) r4
            r13 = 60
            long r6 = r6 * r13
            long r6 = r6 + r1
            r1 = r3[r12]
            long r1 = (long) r1
            long r6 = r6 + r1
            long r6 = r6 * r9
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.OFFSET_SECONDS
            r2 = r3[r5]
            r3 = r6
            r6 = r2
            goto L_0x008e
        L_0x0086:
            if (r9 != 0) goto L_0x0098
        L_0x0088:
            j$.time.temporal.a r1 = p073j$.time.temporal.C42662a.OFFSET_SECONDS
            int r2 = r8 + r9
            r6 = r2
            r3 = r10
        L_0x008e:
            r2 = r1
        L_0x008f:
            r1 = r16
            r5 = r18
            int r1 = r1.mo138174o(r2, r3, r5, r6)
            return r1
        L_0x0098:
            int r1 = ~r8
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.format.C42638l.mo138136o(j$.time.format.w, java.lang.CharSequence, int):int");
    }

    public final String toString() {
        String replace = this.f107876a.replace("'", "''");
        return "Offset(" + f107873c[this.f107877b] + ",'" + replace + "')";
    }
}
