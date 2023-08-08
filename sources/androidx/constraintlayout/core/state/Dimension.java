package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.widgets.ConstraintWidget;

public class Dimension {

    /* renamed from: i */
    public static final Object f42472i = new Object();

    /* renamed from: j */
    public static final Object f42473j = new Object();

    /* renamed from: k */
    public static final Object f42474k = new Object();

    /* renamed from: l */
    public static final Object f42475l = new Object();

    /* renamed from: m */
    public static final Object f42476m = new Object();

    /* renamed from: n */
    public static final Object f42477n = new Object();

    /* renamed from: a */
    public final int f42478a;

    /* renamed from: b */
    public int f42479b;

    /* renamed from: c */
    public int f42480c;

    /* renamed from: d */
    public float f42481d;

    /* renamed from: e */
    public int f42482e;

    /* renamed from: f */
    public String f42483f;

    /* renamed from: g */
    public Object f42484g;

    /* renamed from: h */
    public boolean f42485h;

    public enum Type {
        FIXED,
        WRAP,
        MATCH_PARENT,
        MATCH_CONSTRAINT
    }

    public Dimension() {
        this.f42478a = -2;
        this.f42479b = 0;
        this.f42480c = Integer.MAX_VALUE;
        this.f42481d = 1.0f;
        this.f42482e = 0;
        this.f42483f = null;
        this.f42484g = f42473j;
        this.f42485h = false;
    }

    /* renamed from: a */
    public static Dimension m76548a(int i) {
        Dimension dimension = new Dimension(f42472i);
        dimension.mo49290l(i);
        return dimension;
    }

    /* renamed from: b */
    public static Dimension m76549b(Object obj) {
        Dimension dimension = new Dimension(f42472i);
        dimension.mo49291m(obj);
        return dimension;
    }

    /* renamed from: c */
    public static Dimension m76550c() {
        return new Dimension(f42475l);
    }

    /* renamed from: d */
    public static Dimension m76551d(Object obj, float f) {
        Dimension dimension = new Dimension(f42476m);
        dimension.mo49297s(obj, f);
        return dimension;
    }

    /* renamed from: e */
    public static Dimension m76552e(String str) {
        Dimension dimension = new Dimension(f42477n);
        dimension.mo49298t(str);
        return dimension;
    }

    /* renamed from: f */
    public static Dimension m76553f() {
        return new Dimension(f42474k);
    }

    /* renamed from: g */
    public static Dimension m76554g(int i) {
        Dimension dimension = new Dimension();
        dimension.mo49300v(i);
        return dimension;
    }

    /* renamed from: h */
    public static Dimension m76555h(Object obj) {
        Dimension dimension = new Dimension();
        dimension.mo49301w(obj);
        return dimension;
    }

    /* renamed from: i */
    public static Dimension m76556i() {
        return new Dimension(f42473j);
    }

    /* renamed from: j */
    public void mo49288j(State state, ConstraintWidget constraintWidget, int i) {
        String str = this.f42483f;
        if (str != null) {
            constraintWidget.mo49573n1(str);
        }
        int i2 = 2;
        if (i == 0) {
            if (this.f42485h) {
                constraintWidget.mo49458D1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                Object obj = this.f42484g;
                if (obj == f42473j) {
                    i2 = 1;
                } else if (obj != f42476m) {
                    i2 = 0;
                }
                constraintWidget.mo49461E1(i2, this.f42479b, this.f42480c, this.f42481d);
                return;
            }
            int i3 = this.f42479b;
            if (i3 > 0) {
                constraintWidget.mo49494P1(i3);
            }
            int i4 = this.f42480c;
            if (i4 < Integer.MAX_VALUE) {
                constraintWidget.mo49485M1(i4);
            }
            Object obj2 = this.f42484g;
            if (obj2 == f42473j) {
                constraintWidget.mo49458D1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            } else if (obj2 == f42475l) {
                constraintWidget.mo49458D1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            } else if (obj2 == null) {
                constraintWidget.mo49458D1(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.mo49533c2(this.f42482e);
            }
        } else if (this.f42485h) {
            constraintWidget.mo49521Y1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
            Object obj3 = this.f42484g;
            if (obj3 == f42473j) {
                i2 = 1;
            } else if (obj3 != f42476m) {
                i2 = 0;
            }
            constraintWidget.mo49524Z1(i2, this.f42479b, this.f42480c, this.f42481d);
        } else {
            int i5 = this.f42479b;
            if (i5 > 0) {
                constraintWidget.mo49491O1(i5);
            }
            int i6 = this.f42480c;
            if (i6 < Integer.MAX_VALUE) {
                constraintWidget.mo49482L1(i6);
            }
            Object obj4 = this.f42484g;
            if (obj4 == f42473j) {
                constraintWidget.mo49521Y1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
            } else if (obj4 == f42475l) {
                constraintWidget.mo49521Y1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
            } else if (obj4 == null) {
                constraintWidget.mo49521Y1(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget.mo49607y1(this.f42482e);
            }
        }
    }

    /* renamed from: k */
    public boolean mo49289k(int i) {
        return this.f42484g == null && this.f42482e == i;
    }

    /* renamed from: l */
    public Dimension mo49290l(int i) {
        this.f42484g = null;
        this.f42482e = i;
        return this;
    }

    /* renamed from: m */
    public Dimension mo49291m(Object obj) {
        this.f42484g = obj;
        if (obj instanceof Integer) {
            this.f42482e = ((Integer) obj).intValue();
            this.f42484g = null;
        }
        return this;
    }

    /* renamed from: n */
    public int mo49292n() {
        return this.f42482e;
    }

    /* renamed from: o */
    public Dimension mo49293o(int i) {
        if (this.f42480c >= 0) {
            this.f42480c = i;
        }
        return this;
    }

    /* renamed from: p */
    public Dimension mo49294p(Object obj) {
        Object obj2 = f42473j;
        if (obj == obj2 && this.f42485h) {
            this.f42484g = obj2;
            this.f42480c = Integer.MAX_VALUE;
        }
        return this;
    }

    /* renamed from: q */
    public Dimension mo49295q(int i) {
        if (i >= 0) {
            this.f42479b = i;
        }
        return this;
    }

    /* renamed from: r */
    public Dimension mo49296r(Object obj) {
        if (obj == f42473j) {
            this.f42479b = -2;
        }
        return this;
    }

    /* renamed from: s */
    public Dimension mo49297s(Object obj, float f) {
        this.f42481d = f;
        return this;
    }

    /* renamed from: t */
    public Dimension mo49298t(String str) {
        this.f42483f = str;
        return this;
    }

    /* renamed from: u */
    public void mo49299u(int i) {
        this.f42485h = false;
        this.f42484g = null;
        this.f42482e = i;
    }

    /* renamed from: v */
    public Dimension mo49300v(int i) {
        this.f42485h = true;
        if (i >= 0) {
            this.f42480c = i;
        }
        return this;
    }

    /* renamed from: w */
    public Dimension mo49301w(Object obj) {
        this.f42484g = obj;
        this.f42485h = true;
        return this;
    }

    public Dimension(Object obj) {
        this.f42478a = -2;
        this.f42479b = 0;
        this.f42480c = Integer.MAX_VALUE;
        this.f42481d = 1.0f;
        this.f42482e = 0;
        this.f42483f = null;
        this.f42485h = false;
        this.f42484g = obj;
    }
}
