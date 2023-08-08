package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.Arrays;

public class CircularFlow extends VirtualLayout {

    /* renamed from: N0 */
    public static final String f43098N0 = "CircularFlow";

    /* renamed from: O0 */
    public static int f43099O0;

    /* renamed from: P0 */
    public static float f43100P0;

    /* renamed from: E0 */
    public int f43101E0;

    /* renamed from: F0 */
    public float[] f43102F0;

    /* renamed from: G0 */
    public int[] f43103G0;

    /* renamed from: H0 */
    public int f43104H0;

    /* renamed from: I0 */
    public int f43105I0;

    /* renamed from: J0 */
    public String f43106J0;

    /* renamed from: K0 */
    public String f43107K0;

    /* renamed from: L0 */
    public Float f43108L0;

    /* renamed from: M0 */
    public Integer f43109M0;

    /* renamed from: z */
    public ConstraintLayout f43110z;

    public CircularFlow(Context context) {
        super(context);
    }

    /* renamed from: Q */
    public static float[] m77300Q(float[] fArr, int i) {
        float[] fArr2 = new float[(fArr.length - 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < fArr.length; i3++) {
            if (i3 != i) {
                fArr2[i2] = fArr[i3];
                i2++;
            }
        }
        return fArr2;
    }

    /* renamed from: R */
    public static int[] m77301R(int[] iArr, int i) {
        int[] iArr2 = new int[(iArr.length - 1)];
        int i2 = 0;
        for (int i3 = 0; i3 < iArr.length; i3++) {
            if (i3 != i) {
                iArr2[i2] = iArr[i3];
                i2++;
            }
        }
        return iArr2;
    }

    private void setAngles(String str) {
        if (str != null) {
            int i = 0;
            this.f43105I0 = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo49868K(str.substring(i).trim());
                    return;
                } else {
                    mo49868K(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    private void setRadius(String str) {
        if (str != null) {
            int i = 0;
            this.f43104H0 = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo49869L(str.substring(i).trim());
                    return;
                } else {
                    mo49869L(str.substring(i, indexOf).trim());
                    i = indexOf + 1;
                }
            }
        }
    }

    /* renamed from: A */
    public int mo49867A(View view) {
        int A = super.mo49867A(view);
        if (A == -1) {
            return A;
        }
        C16934c cVar = new C16934c();
        cVar.mo50824H(this.f43110z);
        cVar.mo50819F(view.getId(), 8);
        cVar.mo50900r(this.f43110z);
        float[] fArr = this.f43102F0;
        if (A < fArr.length) {
            this.f43102F0 = mo49873P(fArr, A);
            this.f43105I0--;
        }
        int[] iArr = this.f43103G0;
        if (A < iArr.length) {
            this.f43103G0 = mo49874S(iArr, A);
            this.f43104H0--;
        }
        mo49871N();
        return A;
    }

    /* renamed from: K */
    public final void mo49868K(String str) {
        float[] fArr;
        if (str != null && str.length() != 0 && this.f44192c != null && (fArr = this.f43102F0) != null) {
            if (this.f43105I0 + 1 > fArr.length) {
                this.f43102F0 = Arrays.copyOf(fArr, fArr.length + 1);
            }
            this.f43102F0[this.f43105I0] = (float) Integer.parseInt(str);
            this.f43105I0++;
        }
    }

    /* renamed from: L */
    public final void mo49869L(String str) {
        int[] iArr;
        if (str != null && str.length() != 0 && this.f44192c != null && (iArr = this.f43103G0) != null) {
            if (this.f43104H0 + 1 > iArr.length) {
                this.f43103G0 = Arrays.copyOf(iArr, iArr.length + 1);
            }
            this.f43103G0[this.f43104H0] = (int) (((float) Integer.parseInt(str)) * this.f44192c.getResources().getDisplayMetrics().density);
            this.f43104H0++;
        }
    }

    /* renamed from: M */
    public void mo49870M(View view, int i, float f) {
        if (!mo50656s(view.getId())) {
            mo50652o(view);
            this.f43105I0++;
            float[] angles = getAngles();
            this.f43102F0 = angles;
            angles[this.f43105I0 - 1] = f;
            this.f43104H0++;
            int[] radius = getRadius();
            this.f43103G0 = radius;
            radius[this.f43104H0 - 1] = (int) (((float) i) * this.f44192c.getResources().getDisplayMetrics().density);
            mo49871N();
        }
    }

    /* renamed from: N */
    public final void mo49871N() {
        this.f43110z = (ConstraintLayout) getParent();
        for (int i = 0; i < this.f44191b; i++) {
            View viewById = this.f43110z.getViewById(this.f44190a[i]);
            if (viewById != null) {
                int i2 = f43099O0;
                float f = f43100P0;
                int[] iArr = this.f43103G0;
                if (iArr == null || i >= iArr.length) {
                    Integer num = this.f43109M0;
                    if (num == null || num.intValue() == -1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Added radius to view with id: ");
                        sb.append(this.f44198w.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.f43104H0++;
                        if (this.f43103G0 == null) {
                            this.f43103G0 = new int[1];
                        }
                        int[] radius = getRadius();
                        this.f43103G0 = radius;
                        radius[this.f43104H0 - 1] = i2;
                    }
                } else {
                    i2 = iArr[i];
                }
                float[] fArr = this.f43102F0;
                if (fArr == null || i >= fArr.length) {
                    Float f2 = this.f43108L0;
                    if (f2 == null || f2.floatValue() == -1.0f) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Added angle to view with id: ");
                        sb2.append(this.f44198w.get(Integer.valueOf(viewById.getId())));
                    } else {
                        this.f43105I0++;
                        if (this.f43102F0 == null) {
                            this.f43102F0 = new float[1];
                        }
                        float[] angles = getAngles();
                        this.f43102F0 = angles;
                        angles[this.f43105I0 - 1] = f;
                    }
                } else {
                    f = fArr[i];
                }
                ConstraintLayout.C16926b bVar = (ConstraintLayout.C16926b) viewById.getLayoutParams();
                bVar.f44284r = f;
                bVar.f44280p = this.f43101E0;
                bVar.f44282q = i2;
                viewById.setLayoutParams(bVar);
            }
        }
        mo50654p();
    }

    /* renamed from: O */
    public boolean mo49872O(View view) {
        if (mo50656s(view.getId()) && mo50665x(view.getId()) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    public final float[] mo49873P(float[] fArr, int i) {
        if (fArr == null || i < 0 || i >= this.f43105I0) {
            return fArr;
        }
        return m77300Q(fArr, i);
    }

    /* renamed from: S */
    public final int[] mo49874S(int[] iArr, int i) {
        if (iArr == null || i < 0 || i >= this.f43104H0) {
            return iArr;
        }
        return m77301R(iArr, i);
    }

    /* renamed from: T */
    public void mo49875T(View view, float f) {
        if (!mo49872O(view)) {
            StringBuilder sb = new StringBuilder();
            sb.append("It was not possible to update angle to view with id: ");
            sb.append(view.getId());
            return;
        }
        int x = mo50665x(view.getId());
        if (x <= this.f43102F0.length) {
            float[] angles = getAngles();
            this.f43102F0 = angles;
            angles[x] = f;
            mo49871N();
        }
    }

    /* renamed from: U */
    public void mo49876U(View view, int i) {
        if (!mo49872O(view)) {
            StringBuilder sb = new StringBuilder();
            sb.append("It was not possible to update radius to view with id: ");
            sb.append(view.getId());
            return;
        }
        int x = mo50665x(view.getId());
        if (x <= this.f43103G0.length) {
            int[] radius = getRadius();
            this.f43103G0 = radius;
            radius[x] = (int) (((float) i) * this.f44192c.getResources().getDisplayMetrics().density);
            mo49871N();
        }
    }

    /* renamed from: V */
    public void mo49877V(View view, int i, float f) {
        if (!mo49872O(view)) {
            StringBuilder sb = new StringBuilder();
            sb.append("It was not possible to update radius and angle to view with id: ");
            sb.append(view.getId());
            return;
        }
        int x = mo50665x(view.getId());
        if (getAngles().length > x) {
            float[] angles = getAngles();
            this.f43102F0 = angles;
            angles[x] = f;
        }
        if (getRadius().length > x) {
            int[] radius = getRadius();
            this.f43103G0 = radius;
            radius[x] = (int) (((float) i) * this.f44192c.getResources().getDisplayMetrics().density);
        }
        mo49871N();
    }

    public float[] getAngles() {
        return Arrays.copyOf(this.f43102F0, this.f43105I0);
    }

    public int[] getRadius() {
        return Arrays.copyOf(this.f43103G0, this.f43104H0);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f43106J0;
        if (str != null) {
            this.f43102F0 = new float[1];
            setAngles(str);
        }
        String str2 = this.f43107K0;
        if (str2 != null) {
            this.f43103G0 = new int[1];
            setRadius(str2);
        }
        Float f = this.f43108L0;
        if (f != null) {
            setDefaultAngle(f.floatValue());
        }
        Integer num = this.f43109M0;
        if (num != null) {
            setDefaultRadius(num.intValue());
        }
        mo49871N();
    }

    public void setDefaultAngle(float f) {
        f43100P0 = f;
    }

    public void setDefaultRadius(int i) {
        f43099O0 = i;
    }

    /* renamed from: y */
    public void mo49882y(AttributeSet attributeSet) {
        super.mo49882y(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ConstraintLayout_Layout_circularflow_viewCenter) {
                    this.f43101E0 = obtainStyledAttributes.getResourceId(index, 0);
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_circularflow_angles) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f43106J0 = string;
                    setAngles(string);
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_circularflow_radiusInDP) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f43107K0 = string2;
                    setRadius(string2);
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_circularflow_defaultAngle) {
                    Float valueOf = Float.valueOf(obtainStyledAttributes.getFloat(index, f43100P0));
                    this.f43108L0 = valueOf;
                    setDefaultAngle(valueOf.floatValue());
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_circularflow_defaultRadius) {
                    Integer valueOf2 = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(index, f43099O0));
                    this.f43109M0 = valueOf2;
                    setDefaultRadius(valueOf2.intValue());
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public CircularFlow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularFlow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
