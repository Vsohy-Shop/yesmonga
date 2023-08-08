package androidx.constraintlayout.core.parser;

import androidx.constraintlayout.core.motion.utils.C16717v;
import androidx.constraintlayout.motion.widget.C16886i;
import java.util.ArrayList;

/* renamed from: androidx.constraintlayout.core.parser.d */
public class C16736d extends C16734b {

    /* renamed from: w */
    public static ArrayList<String> f42405w;

    static {
        ArrayList<String> arrayList = new ArrayList<>();
        f42405w = arrayList;
        arrayList.add("ConstraintSets");
        f42405w.add("Variables");
        f42405w.add("Generate");
        f42405w.add(C16717v.C16725h.f42316a);
        f42405w.add(C16886i.f43498f);
        f42405w.add("KeyAttributes");
        f42405w.add("KeyPositions");
        f42405w.add("KeyCycles");
    }

    public C16736d(char[] cArr) {
        super(cArr);
    }

    /* renamed from: M0 */
    public static C16735c m76435M0(String str, C16735c cVar) {
        C16736d dVar = new C16736d(str.toCharArray());
        dVar.mo49177f0(0);
        dVar.mo49174Y((long) (str.length() - 1));
        dVar.mo49187P0(cVar);
        return dVar;
    }

    /* renamed from: k0 */
    public static C16735c m76436k0(char[] cArr) {
        return new C16736d(cArr);
    }

    /* renamed from: N0 */
    public String mo49185N0() {
        return mo49178h();
    }

    /* renamed from: O0 */
    public C16735c mo49186O0() {
        if (this.f42397v.size() > 0) {
            return this.f42397v.get(0);
        }
        return null;
    }

    /* renamed from: P0 */
    public void mo49187P0(C16735c cVar) {
        if (this.f42397v.size() > 0) {
            this.f42397v.set(0, cVar);
        } else {
            this.f42397v.add(cVar);
        }
    }

    /* renamed from: h0 */
    public String mo49133h0(int i, int i2) {
        StringBuilder sb = new StringBuilder(mo49180k());
        mo49175e(sb, i);
        String h = mo49178h();
        if (this.f42397v.size() > 0) {
            sb.append(h);
            sb.append(": ");
            if (f42405w.contains(h)) {
                i2 = 3;
            }
            if (i2 > 0) {
                sb.append(this.f42397v.get(0).mo49133h0(i, i2 - 1));
            } else {
                String i0 = this.f42397v.get(0).mo49134i0();
                if (i0.length() + i < C16735c.f42398f) {
                    sb.append(i0);
                } else {
                    sb.append(this.f42397v.get(0).mo49133h0(i, i2 - 1));
                }
            }
            return sb.toString();
        }
        return h + ": <> ";
    }

    /* renamed from: i0 */
    public String mo49134i0() {
        if (this.f42397v.size() > 0) {
            return mo49180k() + mo49178h() + ": " + this.f42397v.get(0).mo49134i0();
        }
        return mo49180k() + mo49178h() + ": <> ";
    }
}
