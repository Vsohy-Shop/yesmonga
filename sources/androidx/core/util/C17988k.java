package androidx.core.util;

import androidx.annotation.RestrictTo;
import java.io.Writer;

@Deprecated
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* renamed from: androidx.core.util.k */
public class C17988k extends Writer {

    /* renamed from: a */
    public final String f46476a;

    /* renamed from: b */
    public StringBuilder f46477b = new StringBuilder(128);

    public C17988k(String str) {
        this.f46476a = str;
    }

    /* renamed from: a */
    public final void mo52453a() {
        if (this.f46477b.length() > 0) {
            this.f46477b.toString();
            StringBuilder sb = this.f46477b;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        mo52453a();
    }

    public void flush() {
        mo52453a();
    }

    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == 10) {
                mo52453a();
            } else {
                this.f46477b.append(c);
            }
        }
    }
}
