package androidx.fragment.app;

import java.io.Writer;

/* renamed from: androidx.fragment.app.o0 */
public final class C19260o0 extends Writer {

    /* renamed from: a */
    public final String f49579a;

    /* renamed from: b */
    public StringBuilder f49580b = new StringBuilder(128);

    public C19260o0(String str) {
        this.f49579a = str;
    }

    /* renamed from: a */
    public final void mo57341a() {
        if (this.f49580b.length() > 0) {
            this.f49580b.toString();
            StringBuilder sb = this.f49580b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        mo57341a();
    }

    public void flush() {
        mo57341a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                mo57341a();
            } else {
                this.f49580b.append(c);
            }
        }
    }
}
