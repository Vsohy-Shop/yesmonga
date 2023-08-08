package p073j$.time.format;

/* renamed from: j$.time.format.n */
final class C42640n extends C42641o {
    C42640n() {
        super("", (String) null, (C42641o) null, 0);
    }

    private C42640n(String str, String str2, C42641o oVar) {
        super(str, str2, oVar, 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo138151c(char c, char c2) {
        return C42649w.m172402c(c, c2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C42641o mo138152e(String str, String str2, C42641o oVar) {
        return new C42640n(str, str2, oVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo138153h(CharSequence charSequence, int i, int i2) {
        int length = this.f107881a.length();
        if (length > i2 - i) {
            return false;
        }
        int i3 = 0;
        while (true) {
            int i4 = length - 1;
            if (length <= 0) {
                return true;
            }
            int i5 = i3 + 1;
            int i6 = i + 1;
            if (!C42649w.m172402c(this.f107881a.charAt(i3), charSequence.charAt(i))) {
                return false;
            }
            i = i6;
            length = i4;
            i3 = i5;
        }
    }
}
