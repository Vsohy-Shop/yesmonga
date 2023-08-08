package p073j$.time.format;

/* renamed from: j$.time.format.r */
enum C42644r implements C42633g {
    SENSITIVE,
    INSENSITIVE,
    STRICT,
    LENIENT;

    /* renamed from: n */
    public final boolean mo138135n(C42651y yVar, StringBuilder sb) {
        return true;
    }

    /* renamed from: o */
    public final int mo138136o(C42649w wVar, CharSequence charSequence, int i) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            wVar.mo138172m(true);
        } else if (ordinal == 1) {
            wVar.mo138172m(false);
        } else if (ordinal == 2) {
            wVar.mo138176q(true);
        } else if (ordinal == 3) {
            wVar.mo138176q(false);
        }
        return i;
    }

    public final String toString() {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return "ParseCaseSensitive(true)";
        }
        if (ordinal == 1) {
            return "ParseCaseSensitive(false)";
        }
        if (ordinal == 2) {
            return "ParseStrict(true)";
        }
        if (ordinal == 3) {
            return "ParseStrict(false)";
        }
        throw new IllegalStateException("Unreachable");
    }
}
