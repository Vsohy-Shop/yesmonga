package p073j$.time.format;

/* renamed from: j$.time.format.e */
final class C42631e implements C42633g {

    /* renamed from: a */
    private final char f107858a;

    C42631e(char c) {
        this.f107858a = c;
    }

    /* renamed from: n */
    public final boolean mo138135n(C42651y yVar, StringBuilder sb) {
        sb.append(this.f107858a);
        return true;
    }

    /* renamed from: o */
    public final int mo138136o(C42649w wVar, CharSequence charSequence, int i) {
        if (i == charSequence.length()) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        char c = this.f107858a;
        return (charAt == c || (!wVar.mo138170k() && (Character.toUpperCase(charAt) == Character.toUpperCase(c) || Character.toLowerCase(charAt) == Character.toLowerCase(c)))) ? i + 1 : ~i;
    }

    public final String toString() {
        char c = this.f107858a;
        if (c == '\'') {
            return "''";
        }
        return "'" + c + "'";
    }
}
