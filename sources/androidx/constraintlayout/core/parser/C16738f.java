package androidx.constraintlayout.core.parser;

import java.util.Iterator;

/* renamed from: androidx.constraintlayout.core.parser.f */
public class C16738f extends C16734b implements Iterable<C16736d> {

    /* renamed from: androidx.constraintlayout.core.parser.f$a */
    public class C16739a implements Iterator {

        /* renamed from: a */
        public C16738f f42407a;

        /* renamed from: b */
        public int f42408b = 0;

        public C16739a(C16738f fVar) {
            this.f42407a = fVar;
        }

        public boolean hasNext() {
            return this.f42408b < this.f42407a.size();
        }

        public Object next() {
            C16736d dVar = (C16736d) this.f42407a.f42397v.get(this.f42408b);
            this.f42408b++;
            return dVar;
        }
    }

    public C16738f(char[] cArr) {
        super(cArr);
    }

    /* renamed from: M0 */
    public static C16738f m76449M0(char[] cArr) {
        return new C16738f(cArr);
    }

    /* renamed from: N0 */
    public String mo49190N0() {
        return mo49133h0(0, 0);
    }

    /* renamed from: h0 */
    public String mo49133h0(int i, int i2) {
        StringBuilder sb = new StringBuilder(mo49180k());
        sb.append("{\n");
        Iterator<C16735c> it = this.f42397v.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C16735c next = it.next();
            if (!z) {
                sb.append(",\n");
            } else {
                z = false;
            }
            sb.append(next.mo49133h0(C16735c.f42399g + i, i2 - 1));
        }
        sb.append("\n");
        mo49175e(sb, i);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: i0 */
    public String mo49134i0() {
        StringBuilder sb = new StringBuilder(mo49180k() + "{ ");
        Iterator<C16735c> it = this.f42397v.iterator();
        boolean z = true;
        while (it.hasNext()) {
            C16735c next = it.next();
            if (!z) {
                sb.append(", ");
            } else {
                z = false;
            }
            sb.append(next.mo49134i0());
        }
        sb.append(" }");
        return sb.toString();
    }

    public Iterator iterator() {
        return new C16739a(this);
    }
}
