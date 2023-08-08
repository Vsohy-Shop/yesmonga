package androidx.constraintlayout.core.parser;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import org.jsoup.helper.C12741a;

/* renamed from: androidx.constraintlayout.core.parser.b */
public class C16734b extends C16735c {

    /* renamed from: v */
    public ArrayList<C16735c> f42397v = new ArrayList<>();

    public C16734b(char[] cArr) {
        super(cArr);
    }

    /* renamed from: k0 */
    public static C16735c m76390k0(char[] cArr) {
        return new C16734b(cArr);
    }

    /* renamed from: A0 */
    public C16735c mo49139A0(String str) {
        Iterator<C16735c> it = this.f42397v.iterator();
        while (it.hasNext()) {
            C16736d dVar = (C16736d) it.next();
            if (dVar.mo49178h().equals(str)) {
                return dVar.mo49186O0();
            }
        }
        return null;
    }

    /* renamed from: B0 */
    public String mo49140B0(int i) throws CLParsingException {
        C16735c l0 = mo49153l0(i);
        if (l0 instanceof C16740g) {
            return l0.mo49178h();
        }
        throw new CLParsingException("no string at index " + i, this);
    }

    /* renamed from: C */
    public boolean mo49141C(int i) throws CLParsingException {
        C16735c l0 = mo49153l0(i);
        if (l0 instanceof CLToken) {
            return ((CLToken) l0).mo49135k0();
        }
        throw new CLParsingException("no boolean at index " + i, this);
    }

    /* renamed from: C0 */
    public String mo49142C0(String str) throws CLParsingException {
        String str2;
        C16735c m0 = mo49154m0(str);
        if (m0 instanceof C16740g) {
            return m0.mo49178h();
        }
        if (m0 != null) {
            str2 = m0.mo49169H();
        } else {
            str2 = null;
        }
        throw new CLParsingException("no string found for key <" + str + ">, found [" + str2 + "] : " + m0, this);
    }

    /* renamed from: F0 */
    public String mo49143F0(int i) {
        C16735c z0 = mo49167z0(i);
        if (z0 instanceof C16740g) {
            return z0.mo49178h();
        }
        return null;
    }

    /* renamed from: G0 */
    public String mo49144G0(String str) {
        C16735c A0 = mo49139A0(str);
        if (A0 instanceof C16740g) {
            return A0.mo49178h();
        }
        return null;
    }

    /* renamed from: H0 */
    public boolean mo49145H0(String str) {
        Iterator<C16735c> it = this.f42397v.iterator();
        while (it.hasNext()) {
            C16735c next = it.next();
            if ((next instanceof C16736d) && ((C16736d) next).mo49178h().equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: I0 */
    public ArrayList<String> mo49146I0() {
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<C16735c> it = this.f42397v.iterator();
        while (it.hasNext()) {
            C16735c next = it.next();
            if (next instanceof C16736d) {
                arrayList.add(((C16736d) next).mo49178h());
            }
        }
        return arrayList;
    }

    /* renamed from: J0 */
    public void mo49147J0(String str, C16735c cVar) {
        Iterator<C16735c> it = this.f42397v.iterator();
        while (it.hasNext()) {
            C16736d dVar = (C16736d) it.next();
            if (dVar.mo49178h().equals(str)) {
                dVar.mo49187P0(cVar);
                return;
            }
        }
        this.f42397v.add((C16736d) C16736d.m76435M0(str, cVar));
    }

    /* renamed from: K0 */
    public void mo49148K0(String str, float f) {
        mo49147J0(str, new C16737e(f));
    }

    /* renamed from: L0 */
    public void mo49149L0(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator<C16735c> it = this.f42397v.iterator();
        while (it.hasNext()) {
            C16735c next = it.next();
            if (((C16736d) next).mo49178h().equals(str)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.f42397v.remove((C16735c) it2.next());
        }
    }

    public float getFloat(int i) throws CLParsingException {
        C16735c l0 = mo49153l0(i);
        if (l0 != null) {
            return l0.mo49182r();
        }
        throw new CLParsingException("no float at index " + i, this);
    }

    public int getInt(int i) throws CLParsingException {
        C16735c l0 = mo49153l0(i);
        if (l0 != null) {
            return l0.mo49183w();
        }
        throw new CLParsingException("no int at index " + i, this);
    }

    /* renamed from: j0 */
    public void mo49152j0(C16735c cVar) {
        this.f42397v.add(cVar);
        if (CLParser.f42373d) {
            PrintStream printStream = System.out;
            printStream.println("added element " + cVar + " to " + this);
        }
    }

    /* renamed from: l0 */
    public C16735c mo49153l0(int i) throws CLParsingException {
        if (i >= 0 && i < this.f42397v.size()) {
            return this.f42397v.get(i);
        }
        throw new CLParsingException("no element at index " + i, this);
    }

    /* renamed from: m0 */
    public C16735c mo49154m0(String str) throws CLParsingException {
        Iterator<C16735c> it = this.f42397v.iterator();
        while (it.hasNext()) {
            C16736d dVar = (C16736d) it.next();
            if (dVar.mo49178h().equals(str)) {
                return dVar.mo49186O0();
            }
        }
        throw new CLParsingException("no element for key <" + str + ">", this);
    }

    /* renamed from: n0 */
    public C16733a mo49155n0(int i) throws CLParsingException {
        C16735c l0 = mo49153l0(i);
        if (l0 instanceof C16733a) {
            return (C16733a) l0;
        }
        throw new CLParsingException("no array at index " + i, this);
    }

    /* renamed from: o0 */
    public C16733a mo49156o0(String str) throws CLParsingException {
        C16735c m0 = mo49154m0(str);
        if (m0 instanceof C16733a) {
            return (C16733a) m0;
        }
        throw new CLParsingException("no array found for key <" + str + ">, found [" + m0.mo49169H() + "] : " + m0, this);
    }

    /* renamed from: p0 */
    public C16733a mo49157p0(String str) {
        C16735c A0 = mo49139A0(str);
        if (A0 instanceof C16733a) {
            return (C16733a) A0;
        }
        return null;
    }

    /* renamed from: r0 */
    public boolean mo49158r0(String str) throws CLParsingException {
        C16735c m0 = mo49154m0(str);
        if (m0 instanceof CLToken) {
            return ((CLToken) m0).mo49135k0();
        }
        throw new CLParsingException("no boolean found for key <" + str + ">, found [" + m0.mo49169H() + "] : " + m0, this);
    }

    /* renamed from: s0 */
    public float mo49159s0(String str) throws CLParsingException {
        C16735c m0 = mo49154m0(str);
        if (m0 != null) {
            return m0.mo49182r();
        }
        throw new CLParsingException("no float found for key <" + str + ">, found [" + m0.mo49169H() + "] : " + m0, this);
    }

    public int size() {
        return this.f42397v.size();
    }

    /* renamed from: t0 */
    public float mo49161t0(String str) {
        C16735c A0 = mo49139A0(str);
        if (A0 instanceof C16737e) {
            return A0.mo49182r();
        }
        return Float.NaN;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<C16735c> it = this.f42397v.iterator();
        while (it.hasNext()) {
            C16735c next = it.next();
            if (sb.length() > 0) {
                sb.append(C12741a.f31457b);
            }
            sb.append(next);
        }
        return super.toString() + " = <" + sb + " >";
    }

    /* renamed from: u0 */
    public int mo49163u0(String str) throws CLParsingException {
        C16735c m0 = mo49154m0(str);
        if (m0 != null) {
            return m0.mo49183w();
        }
        throw new CLParsingException("no int found for key <" + str + ">, found [" + m0.mo49169H() + "] : " + m0, this);
    }

    /* renamed from: v0 */
    public C16738f mo49164v0(int i) throws CLParsingException {
        C16735c l0 = mo49153l0(i);
        if (l0 instanceof C16738f) {
            return (C16738f) l0;
        }
        throw new CLParsingException("no object at index " + i, this);
    }

    /* renamed from: w0 */
    public C16738f mo49165w0(String str) throws CLParsingException {
        C16735c m0 = mo49154m0(str);
        if (m0 instanceof C16738f) {
            return (C16738f) m0;
        }
        throw new CLParsingException("no object found for key <" + str + ">, found [" + m0.mo49169H() + "] : " + m0, this);
    }

    /* renamed from: y0 */
    public C16738f mo49166y0(String str) {
        C16735c A0 = mo49139A0(str);
        if (A0 instanceof C16738f) {
            return (C16738f) A0;
        }
        return null;
    }

    /* renamed from: z0 */
    public C16735c mo49167z0(int i) {
        if (i < 0 || i >= this.f42397v.size()) {
            return null;
        }
        return this.f42397v.get(i);
    }
}
