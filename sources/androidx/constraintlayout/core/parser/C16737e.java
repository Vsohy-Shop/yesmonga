package androidx.constraintlayout.core.parser;

/* renamed from: androidx.constraintlayout.core.parser.e */
public class C16737e extends C16735c {

    /* renamed from: v */
    public float f42406v;

    public C16737e(char[] cArr) {
        super(cArr);
        this.f42406v = Float.NaN;
    }

    /* renamed from: j0 */
    public static C16735c m76442j0(char[] cArr) {
        return new C16737e(cArr);
    }

    /* renamed from: h0 */
    public String mo49133h0(int i, int i2) {
        StringBuilder sb = new StringBuilder();
        mo49175e(sb, i);
        float r = mo49182r();
        int i3 = (int) r;
        if (((float) i3) == r) {
            sb.append(i3);
        } else {
            sb.append(r);
        }
        return sb.toString();
    }

    /* renamed from: i0 */
    public String mo49134i0() {
        float r = mo49182r();
        int i = (int) r;
        if (((float) i) == r) {
            return "" + i;
        }
        return "" + r;
    }

    /* renamed from: k0 */
    public boolean mo49188k0() {
        float r = mo49182r();
        return ((float) ((int) r)) == r;
    }

    /* renamed from: l0 */
    public void mo49189l0(float f) {
        this.f42406v = f;
    }

    /* renamed from: r */
    public float mo49182r() {
        if (Float.isNaN(this.f42406v)) {
            this.f42406v = Float.parseFloat(mo49178h());
        }
        return this.f42406v;
    }

    /* renamed from: w */
    public int mo49183w() {
        if (Float.isNaN(this.f42406v)) {
            this.f42406v = (float) Integer.parseInt(mo49178h());
        }
        return (int) this.f42406v;
    }

    public C16737e(float f) {
        super((char[]) null);
        this.f42406v = f;
    }
}
