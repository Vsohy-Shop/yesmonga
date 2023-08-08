package p073j$.time.format;

/* renamed from: j$.time.format.f */
final class C42632f implements C42633g {

    /* renamed from: a */
    private final C42633g[] f107859a;

    /* renamed from: b */
    private final boolean f107860b;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C42632f(java.util.List r2, boolean r3) {
        /*
            r1 = this;
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r0 = r2.size()
            j$.time.format.g[] r0 = new p073j$.time.format.C42633g[r0]
            java.lang.Object[] r2 = r2.toArray(r0)
            j$.time.format.g[] r2 = (p073j$.time.format.C42633g[]) r2
            r1.<init>((p073j$.time.format.C42633g[]) r2, (boolean) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p073j$.time.format.C42632f.<init>(java.util.List, boolean):void");
    }

    C42632f(C42633g[] gVarArr, boolean z) {
        this.f107859a = gVarArr;
        this.f107860b = z;
    }

    /* renamed from: a */
    public final C42632f mo138138a() {
        return !this.f107860b ? this : new C42632f(this.f107859a, false);
    }

    /* renamed from: n */
    public final boolean mo138135n(C42651y yVar, StringBuilder sb) {
        int length = sb.length();
        boolean z = this.f107860b;
        if (z) {
            yVar.mo138187g();
        }
        try {
            for (C42633g n : this.f107859a) {
                if (!n.mo138135n(yVar, sb)) {
                    sb.setLength(length);
                    return true;
                }
            }
            if (z) {
                yVar.mo138181a();
            }
            return true;
        } finally {
            if (z) {
                yVar.mo138181a();
            }
        }
    }

    /* renamed from: o */
    public final int mo138136o(C42649w wVar, CharSequence charSequence, int i) {
        boolean z = this.f107860b;
        C42633g[] gVarArr = this.f107859a;
        if (z) {
            wVar.mo138177r();
            int i2 = i;
            for (C42633g o : gVarArr) {
                i2 = o.mo138136o(wVar, charSequence, i2);
                if (i2 < 0) {
                    wVar.mo138165f(false);
                    return i;
                }
            }
            wVar.mo138165f(true);
            return i2;
        }
        for (C42633g o2 : gVarArr) {
            i = o2.mo138136o(wVar, charSequence, i);
            if (i < 0) {
                break;
            }
        }
        return i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        C42633g[] gVarArr = this.f107859a;
        if (gVarArr != null) {
            boolean z = this.f107860b;
            sb.append(z ? "[" : "(");
            for (C42633g append : gVarArr) {
                sb.append(append);
            }
            sb.append(z ? "]" : ")");
        }
        return sb.toString();
    }
}
