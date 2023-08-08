package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.C16803g;
import androidx.constraintlayout.core.widgets.C16804h;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.C16934c;
import androidx.constraintlayout.widget.C16944e;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

public abstract class ConstraintHelper extends View {

    /* renamed from: a */
    public int[] f44190a = new int[32];

    /* renamed from: b */
    public int f44191b;

    /* renamed from: c */
    public Context f44192c;

    /* renamed from: d */
    public C16803g f44193d;

    /* renamed from: e */
    public boolean f44194e = false;

    /* renamed from: f */
    public String f44195f;

    /* renamed from: g */
    public String f44196g;

    /* renamed from: v */
    public View[] f44197v = null;

    /* renamed from: w */
    public HashMap<Integer, String> f44198w = new HashMap<>();

    public ConstraintHelper(Context context) {
        super(context);
        this.f44192c = context;
        mo49882y((AttributeSet) null);
    }

    /* renamed from: A */
    public int mo49867A(View view) {
        int i;
        int id = view.getId();
        int i2 = -1;
        if (id == -1) {
            return -1;
        }
        this.f44195f = null;
        int i3 = 0;
        while (true) {
            if (i3 >= this.f44191b) {
                break;
            } else if (this.f44190a[i3] == id) {
                int i4 = i3;
                while (true) {
                    i = this.f44191b;
                    if (i4 >= i - 1) {
                        break;
                    }
                    int[] iArr = this.f44190a;
                    int i5 = i4 + 1;
                    iArr[i4] = iArr[i5];
                    i4 = i5;
                }
                this.f44190a[i - 1] = 0;
                this.f44191b = i - 1;
                i2 = i3;
            } else {
                i3++;
            }
        }
        requestLayout();
        return i2;
    }

    /* renamed from: B */
    public void mo49883B(ConstraintWidget constraintWidget, boolean z) {
    }

    /* renamed from: C */
    public void mo50644C(ConstraintLayout constraintLayout) {
    }

    /* renamed from: D */
    public void mo49911D(ConstraintLayout constraintLayout) {
    }

    /* renamed from: E */
    public void mo50645E(ConstraintLayout constraintLayout) {
    }

    /* renamed from: F */
    public void mo49912F(ConstraintLayout constraintLayout) {
    }

    /* renamed from: G */
    public void mo49929G(C16798d dVar, C16803g gVar, SparseArray<ConstraintWidget> sparseArray) {
        gVar.mo49810b();
        for (int i = 0; i < this.f44191b; i++) {
            gVar.mo49809a(sparseArray.get(this.f44190a[i]));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        r1 = r5.f44198w.get(java.lang.Integer.valueOf(r1));
     */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo50646H(androidx.constraintlayout.widget.ConstraintLayout r6) {
        /*
            r5 = this;
            boolean r0 = r5.isInEditMode()
            if (r0 == 0) goto L_0x000b
            java.lang.String r0 = r5.f44195f
            r5.setIds(r0)
        L_0x000b:
            androidx.constraintlayout.core.widgets.g r0 = r5.f44193d
            if (r0 != 0) goto L_0x0010
            return
        L_0x0010:
            r0.mo49810b()
            r0 = 0
        L_0x0014:
            int r1 = r5.f44191b
            if (r0 >= r1) goto L_0x0053
            int[] r1 = r5.f44190a
            r1 = r1[r0]
            android.view.View r2 = r6.getViewById(r1)
            if (r2 != 0) goto L_0x0045
            java.util.HashMap<java.lang.Integer, java.lang.String> r3 = r5.f44198w
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r3 = r5.mo50662u(r6, r1)
            if (r3 == 0) goto L_0x0045
            int[] r2 = r5.f44190a
            r2[r0] = r3
            java.util.HashMap<java.lang.Integer, java.lang.String> r2 = r5.f44198w
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r1)
            android.view.View r2 = r6.getViewById(r3)
        L_0x0045:
            if (r2 == 0) goto L_0x0050
            androidx.constraintlayout.core.widgets.g r1 = r5.f44193d
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r6.getViewWidget(r2)
            r1.mo49809a(r2)
        L_0x0050:
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0053:
            androidx.constraintlayout.core.widgets.g r0 = r5.f44193d
            androidx.constraintlayout.core.widgets.d r6 = r6.mLayoutWidget
            r0.mo49811c(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintHelper.mo50646H(androidx.constraintlayout.widget.ConstraintLayout):void");
    }

    /* renamed from: I */
    public void mo50647I() {
        if (this.f44193d != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams instanceof ConstraintLayout.C16926b) {
                ((ConstraintLayout.C16926b) layoutParams).f44293v0 = (ConstraintWidget) this.f44193d;
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f44190a, this.f44191b);
    }

    /* renamed from: l */
    public final void mo50649l(String str) {
        if (str != null && str.length() != 0 && this.f44192c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
            }
            int v = mo50663v(trim);
            if (v != 0) {
                this.f44198w.put(Integer.valueOf(v), trim);
                mo50650m(v);
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Could not find id of \"");
            sb.append(trim);
            sb.append("\"");
        }
    }

    /* renamed from: m */
    public final void mo50650m(int i) {
        if (i != getId()) {
            int i2 = this.f44191b + 1;
            int[] iArr = this.f44190a;
            if (i2 > iArr.length) {
                this.f44190a = Arrays.copyOf(iArr, iArr.length * 2);
            }
            int[] iArr2 = this.f44190a;
            int i3 = this.f44191b;
            iArr2[i3] = i;
            this.f44191b = i3 + 1;
        }
    }

    /* renamed from: n */
    public final void mo50651n(String str) {
        ConstraintLayout constraintLayout;
        if (str != null && str.length() != 0 && this.f44192c != null) {
            String trim = str.trim();
            if (getParent() instanceof ConstraintLayout) {
                constraintLayout = (ConstraintLayout) getParent();
            } else {
                constraintLayout = null;
            }
            if (constraintLayout != null) {
                int childCount = constraintLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = constraintLayout.getChildAt(i);
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if ((layoutParams instanceof ConstraintLayout.C16926b) && trim.equals(((ConstraintLayout.C16926b) layoutParams).f44255c0)) {
                        if (childAt.getId() == -1) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("to use ConstraintTag view ");
                            sb.append(childAt.getClass().getSimpleName());
                            sb.append(" must have an ID");
                        } else {
                            mo50650m(childAt.getId());
                        }
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public void mo50652o(View view) {
        if (view != this && view.getId() != -1 && view.getParent() != null) {
            this.f44195f = null;
            mo50650m(view.getId());
            requestLayout();
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f44195f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f44196g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    public void onDraw(Canvas canvas) {
    }

    public void onMeasure(int i, int i2) {
        if (this.f44194e) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    /* renamed from: p */
    public void mo50654p() {
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            mo50655q((ConstraintLayout) parent);
        }
    }

    /* renamed from: q */
    public void mo50655q(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.f44191b; i++) {
            View viewById = constraintLayout.getViewById(this.f44190a[i]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* renamed from: r */
    public void mo49916r(ConstraintLayout constraintLayout) {
    }

    /* renamed from: s */
    public boolean mo50656s(int i) {
        for (int i2 : this.f44190a) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public void setIds(String str) {
        this.f44195f = str;
        if (str != null) {
            int i = 0;
            this.f44191b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo50649l(str.substring(i));
                    return;
                } else {
                    mo50649l(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f44196g = str;
        if (str != null) {
            int i = 0;
            this.f44191b = 0;
            while (true) {
                int indexOf = str.indexOf(44, i);
                if (indexOf == -1) {
                    mo50651n(str.substring(i));
                    return;
                } else {
                    mo50651n(str.substring(i, indexOf));
                    i = indexOf + 1;
                }
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f44195f = null;
        this.f44191b = 0;
        for (int m : iArr) {
            mo50650m(m);
        }
    }

    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f44195f == null) {
            mo50650m(i);
        }
    }

    /* renamed from: t */
    public final int[] mo50661t(View view, String str) {
        String[] split = str.split(",");
        view.getContext();
        int[] iArr = new int[split.length];
        int i = 0;
        for (String trim : split) {
            int v = mo50663v(trim.trim());
            if (v != 0) {
                iArr[i] = v;
                i++;
            }
        }
        if (i != split.length) {
            return Arrays.copyOf(iArr, i);
        }
        return iArr;
    }

    /* renamed from: u */
    public final int mo50662u(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f44192c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                    str2 = null;
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    /* renamed from: v */
    public final int mo50663v(String str) {
        ConstraintLayout constraintLayout;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        } else {
            constraintLayout = null;
        }
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i = ((Integer) designInformation).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = mo50662u(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = C16944e.C16951g.class.getField(str).getInt((Object) null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            return this.f44192c.getResources().getIdentifier(str, "id", this.f44192c.getPackageName());
        }
        return i;
    }

    /* renamed from: w */
    public View[] mo50664w(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f44197v;
        if (viewArr == null || viewArr.length != this.f44191b) {
            this.f44197v = new View[this.f44191b];
        }
        for (int i = 0; i < this.f44191b; i++) {
            this.f44197v[i] = constraintLayout.getViewById(this.f44190a[i]);
        }
        return this.f44197v;
    }

    /* renamed from: x */
    public int mo50665x(int i) {
        int i2 = -1;
        for (int i3 : this.f44190a) {
            i2++;
            if (i3 == i) {
                return i2;
            }
        }
        return i2;
    }

    /* renamed from: y */
    public void mo49882y(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C16944e.C16957m.ConstraintLayout_Layout_constraint_referenced_ids) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f44195f = string;
                    setIds(string);
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_constraint_referenced_tags) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f44196g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: z */
    public void mo49910z(C16934c.C16935a aVar, C16804h hVar, ConstraintLayout.C16926b bVar, SparseArray<ConstraintWidget> sparseArray) {
        C16934c.C16937b bVar2 = aVar.f44584e;
        int[] iArr = bVar2.f44722k0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar2.f44724l0;
            if (str != null) {
                if (str.length() > 0) {
                    C16934c.C16937b bVar3 = aVar.f44584e;
                    bVar3.f44722k0 = mo50661t(this, bVar3.f44724l0);
                } else {
                    aVar.f44584e.f44722k0 = null;
                }
            }
        }
        if (hVar != null) {
            hVar.mo49810b();
            if (aVar.f44584e.f44722k0 != null) {
                int i = 0;
                while (true) {
                    int[] iArr2 = aVar.f44584e.f44722k0;
                    if (i < iArr2.length) {
                        ConstraintWidget constraintWidget = sparseArray.get(iArr2[i]);
                        if (constraintWidget != null) {
                            hVar.mo49809a(constraintWidget);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44192c = context;
        mo49882y(attributeSet);
    }

    public ConstraintHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44192c = context;
        mo49882y(attributeSet);
    }
}
