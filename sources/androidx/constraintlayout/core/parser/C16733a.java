package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.parser.a */
public class C16733a extends C16734b {
    public C16733a(char[] cArr) {
        super(cArr);
    }

    /* renamed from: k0 */
    public static C16735c m76387k0(char[] cArr) {
        return new C16733a(cArr);
    }

    /* renamed from: h0 */
    public String mo49133h0(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        String i0 = mo49134i0();
        if (i2 > 0 || i0.length() + i >= C16735c.f42398f) {
            sb.append("[\n");
            Iterator<C16735c> it = this.f42397v.iterator();
            boolean z = true;
            while (it.hasNext()) {
                C16735c next = it.next();
                if (!z) {
                    sb.append(",\n");
                } else {
                    z = false;
                }
                mo49175e(sb, C16735c.f42399g + i);
                sb.append(next.mo49133h0(C16735c.f42399g + i, i2 - 1));
            }
            sb.append("\n");
            mo49175e(sb, i);
            sb.append("]");
        } else {
            sb.append(i0);
        }
        return sb.toString();
    }

    /* renamed from: i0 */
    public String mo49134i0() {
        StringBuilder sb = new StringBuilder(mo49180k() + "[");
        boolean z = true;
        for (int i = 0; i < this.f42397v.size(); i++) {
            if (!z) {
                sb.append(", ");
            } else {
                z = false;
            }
            sb.append(this.f42397v.get(i).mo49134i0());
        }
        return sb + "]";
    }
}
