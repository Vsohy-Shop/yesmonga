package p073j$.time.format;

import p073j$.time.C42586c;

/* renamed from: j$.time.format.m */
final class C42639m implements C42633g {

    /* renamed from: a */
    private final C42633g f107878a;

    /* renamed from: b */
    private final int f107879b;

    /* renamed from: c */
    private final char f107880c;

    C42639m(C42633g gVar, int i, char c) {
        this.f107878a = gVar;
        this.f107879b = i;
        this.f107880c = c;
    }

    /* renamed from: n */
    public final boolean mo138135n(C42651y yVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.f107878a.mo138135n(yVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.f107879b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.f107880c);
            }
            return true;
        }
        throw new C42586c("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }

    /* renamed from: o */
    public final int mo138136o(C42649w wVar, CharSequence charSequence, int i) {
        boolean l = wVar.mo138171l();
        if (i > charSequence.length()) {
            throw new IndexOutOfBoundsException();
        } else if (i == charSequence.length()) {
            return ~i;
        } else {
            int i2 = this.f107879b + i;
            if (i2 > charSequence.length()) {
                if (l) {
                    return ~i;
                }
                i2 = charSequence.length();
            }
            int i3 = i;
            while (i3 < i2 && wVar.mo138163b(charSequence.charAt(i3), this.f107880c)) {
                i3++;
            }
            int o = this.f107878a.mo138136o(wVar, charSequence.subSequence(0, i2), i3);
            return (o == i2 || !l) ? o : ~(i + i3);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Pad(");
        sb.append(this.f107878a);
        sb.append(",");
        sb.append(this.f107879b);
        char c = this.f107880c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        sb.append(str);
        return sb.toString();
    }
}
