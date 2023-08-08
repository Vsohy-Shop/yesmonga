package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.urbanairship.iam.C9168d0;
import com.urbanairship.iam.banner.C9156c;

/* renamed from: androidx.constraintlayout.widget.b */
public class C16933b {

    /* renamed from: c */
    public static final int f44413c = 1;

    /* renamed from: d */
    public static final int f44414d = 2;

    /* renamed from: e */
    public static final int f44415e = 3;

    /* renamed from: f */
    public static final int f44416f = 4;

    /* renamed from: g */
    public static final int f44417g = 5;

    /* renamed from: h */
    public static final int f44418h = 6;

    /* renamed from: i */
    public static final int f44419i = 7;

    /* renamed from: j */
    public static final int f44420j = -1;

    /* renamed from: k */
    public static final int f44421k = 0;

    /* renamed from: l */
    public static final int f44422l = 0;

    /* renamed from: m */
    public static final int f44423m = -2;

    /* renamed from: n */
    public static final int f44424n = 1;

    /* renamed from: o */
    public static final int f44425o = 0;

    /* renamed from: a */
    public ConstraintLayout.C16926b f44426a;

    /* renamed from: b */
    public View f44427b;

    public C16933b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.C16926b) {
            this.f44426a = (ConstraintLayout.C16926b) layoutParams;
            this.f44427b = view;
            return;
        }
        throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
    }

    /* renamed from: A */
    public C16933b mo50759A(float f) {
        this.f44426a.f44235L = f;
        return this;
    }

    /* renamed from: B */
    public C16933b mo50760B(int i, int i2) {
        switch (i) {
            case 1:
                this.f44426a.leftMargin = i2;
                break;
            case 2:
                this.f44426a.rightMargin = i2;
                break;
            case 3:
                this.f44426a.topMargin = i2;
                break;
            case 4:
                this.f44426a.bottomMargin = i2;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f44426a.setMarginStart(i2);
                break;
            case 7:
                this.f44426a.setMarginEnd(i2);
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    /* renamed from: C */
    public C16933b mo50761C(int i) {
        switch (i) {
            case 1:
                ConstraintLayout.C16926b bVar = this.f44426a;
                bVar.f44260f = -1;
                bVar.f44258e = -1;
                bVar.leftMargin = -1;
                bVar.f44294w = Integer.MIN_VALUE;
                break;
            case 2:
                ConstraintLayout.C16926b bVar2 = this.f44426a;
                bVar2.f44264h = -1;
                bVar2.f44262g = -1;
                bVar2.rightMargin = -1;
                bVar2.f44297y = Integer.MIN_VALUE;
                break;
            case 3:
                ConstraintLayout.C16926b bVar3 = this.f44426a;
                bVar3.f44268j = -1;
                bVar3.f44266i = -1;
                bVar3.topMargin = -1;
                bVar3.f44296x = Integer.MIN_VALUE;
                break;
            case 4:
                ConstraintLayout.C16926b bVar4 = this.f44426a;
                bVar4.f44270k = -1;
                bVar4.f44272l = -1;
                bVar4.bottomMargin = -1;
                bVar4.f44298z = Integer.MIN_VALUE;
                break;
            case 5:
                this.f44426a.f44274m = -1;
                break;
            case 6:
                ConstraintLayout.C16926b bVar5 = this.f44426a;
                bVar5.f44286s = -1;
                bVar5.f44288t = -1;
                bVar5.setMarginStart(-1);
                this.f44426a.f44224A = Integer.MIN_VALUE;
                break;
            case 7:
                ConstraintLayout.C16926b bVar6 = this.f44426a;
                bVar6.f44290u = -1;
                bVar6.f44292v = -1;
                bVar6.setMarginEnd(-1);
                this.f44426a.f44225B = Integer.MIN_VALUE;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    /* renamed from: D */
    public C16933b mo50762D() {
        ConstraintLayout.C16926b bVar = this.f44426a;
        int i = bVar.f44260f;
        int i2 = bVar.f44262g;
        if (i == -1 && i2 == -1) {
            int i3 = bVar.f44286s;
            int i4 = bVar.f44290u;
            if (!(i3 == -1 && i4 == -1)) {
                C16933b bVar2 = new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i3));
                C16933b bVar3 = new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i4));
                ConstraintLayout.C16926b bVar4 = this.f44426a;
                if (i3 != -1 && i4 != -1) {
                    bVar2.mo50793m(7, i4, 6, 0);
                    bVar3.mo50793m(6, i, 7, 0);
                } else if (!(i == -1 && i4 == -1)) {
                    int i5 = bVar4.f44264h;
                    if (i5 != -1) {
                        bVar2.mo50793m(7, i5, 7, 0);
                    } else {
                        int i6 = bVar4.f44258e;
                        if (i6 != -1) {
                            bVar3.mo50793m(6, i6, 6, 0);
                        }
                    }
                }
            }
            mo50761C(6);
            mo50761C(7);
        } else {
            C16933b bVar5 = new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i));
            C16933b bVar6 = new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i2));
            ConstraintLayout.C16926b bVar7 = this.f44426a;
            if (i != -1 && i2 != -1) {
                bVar5.mo50793m(2, i2, 1, 0);
                bVar6.mo50793m(1, i, 2, 0);
            } else if (!(i == -1 && i2 == -1)) {
                int i7 = bVar7.f44264h;
                if (i7 != -1) {
                    bVar5.mo50793m(2, i7, 2, 0);
                } else {
                    int i8 = bVar7.f44258e;
                    if (i8 != -1) {
                        bVar6.mo50793m(1, i8, 1, 0);
                    }
                }
            }
            mo50761C(1);
            mo50761C(2);
        }
        return this;
    }

    /* renamed from: E */
    public C16933b mo50763E() {
        ConstraintLayout.C16926b bVar = this.f44426a;
        int i = bVar.f44268j;
        int i2 = bVar.f44270k;
        if (!(i == -1 && i2 == -1)) {
            C16933b bVar2 = new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i));
            C16933b bVar3 = new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i2));
            ConstraintLayout.C16926b bVar4 = this.f44426a;
            if (i != -1 && i2 != -1) {
                bVar2.mo50793m(4, i2, 3, 0);
                bVar3.mo50793m(3, i, 4, 0);
            } else if (!(i == -1 && i2 == -1)) {
                int i3 = bVar4.f44272l;
                if (i3 != -1) {
                    bVar2.mo50793m(4, i3, 4, 0);
                } else {
                    int i4 = bVar4.f44266i;
                    if (i4 != -1) {
                        bVar3.mo50793m(3, i4, 3, 0);
                    }
                }
            }
        }
        mo50761C(3);
        mo50761C(4);
        return this;
    }

    /* renamed from: F */
    public C16933b mo50764F(float f) {
        this.f44427b.setRotation(f);
        return this;
    }

    /* renamed from: G */
    public C16933b mo50765G(float f) {
        this.f44427b.setRotationX(f);
        return this;
    }

    /* renamed from: H */
    public C16933b mo50766H(float f) {
        this.f44427b.setRotationY(f);
        return this;
    }

    /* renamed from: I */
    public C16933b mo50767I(float f) {
        this.f44427b.setScaleY(f);
        return this;
    }

    /* renamed from: J */
    public C16933b mo50768J(float f) {
        return this;
    }

    /* renamed from: K */
    public final String mo50769K(int i) {
        switch (i) {
            case 1:
                return C9168d0.f24880E0;
            case 2:
                return C9168d0.f24887Z;
            case 3:
                return C9156c.f24820X;
            case 4:
                return C9156c.f24821Y;
            case 5:
                return "baseline";
            case 6:
                return "start";
            case 7:
                return "end";
            default:
                return "undefined";
        }
    }

    /* renamed from: L */
    public C16933b mo50770L(float f, float f2) {
        this.f44427b.setPivotX(f);
        this.f44427b.setPivotY(f2);
        return this;
    }

    /* renamed from: M */
    public C16933b mo50771M(float f) {
        this.f44427b.setPivotX(f);
        return this;
    }

    /* renamed from: N */
    public C16933b mo50772N(float f) {
        this.f44427b.setPivotY(f);
        return this;
    }

    /* renamed from: O */
    public C16933b mo50773O(float f, float f2) {
        this.f44427b.setTranslationX(f);
        this.f44427b.setTranslationY(f2);
        return this;
    }

    /* renamed from: P */
    public C16933b mo50774P(float f) {
        this.f44427b.setTranslationX(f);
        return this;
    }

    /* renamed from: Q */
    public C16933b mo50775Q(float f) {
        this.f44427b.setTranslationY(f);
        return this;
    }

    /* renamed from: R */
    public C16933b mo50776R(float f) {
        this.f44427b.setTranslationZ(f);
        return this;
    }

    /* renamed from: S */
    public C16933b mo50777S(float f) {
        this.f44426a.f44231H = f;
        return this;
    }

    /* renamed from: T */
    public C16933b mo50778T(int i) {
        this.f44426a.f44238O = i;
        return this;
    }

    /* renamed from: U */
    public C16933b mo50779U(float f) {
        this.f44426a.f44236M = f;
        return this;
    }

    /* renamed from: V */
    public C16933b mo50780V(int i) {
        this.f44427b.setVisibility(i);
        return this;
    }

    /* renamed from: a */
    public C16933b mo50781a(int i, int i2) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 1;
        } else {
            i3 = 2;
        }
        mo50793m(1, i, i3, 0);
        if (i2 == 0) {
            i4 = 2;
        } else {
            i4 = 1;
        }
        mo50793m(2, i2, i4, 0);
        if (i != 0) {
            new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i)).mo50793m(2, this.f44427b.getId(), 1, 0);
        }
        if (i2 != 0) {
            new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i2)).mo50793m(1, this.f44427b.getId(), 2, 0);
        }
        return this;
    }

    /* renamed from: b */
    public C16933b mo50782b(int i, int i2) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 6;
        } else {
            i3 = 7;
        }
        mo50793m(6, i, i3, 0);
        if (i2 == 0) {
            i4 = 7;
        } else {
            i4 = 6;
        }
        mo50793m(7, i2, i4, 0);
        if (i != 0) {
            new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i)).mo50793m(7, this.f44427b.getId(), 6, 0);
        }
        if (i2 != 0) {
            new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i2)).mo50793m(6, this.f44427b.getId(), 7, 0);
        }
        return this;
    }

    /* renamed from: c */
    public C16933b mo50783c(int i, int i2) {
        int i3;
        int i4;
        if (i == 0) {
            i3 = 3;
        } else {
            i3 = 4;
        }
        mo50793m(3, i, i3, 0);
        if (i2 == 0) {
            i4 = 4;
        } else {
            i4 = 3;
        }
        mo50793m(4, i2, i4, 0);
        if (i != 0) {
            new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i)).mo50793m(4, this.f44427b.getId(), 3, 0);
        }
        if (i2 != 0) {
            new C16933b(((ViewGroup) this.f44427b.getParent()).findViewById(i2)).mo50793m(3, this.f44427b.getId(), 4, 0);
        }
        return this;
    }

    /* renamed from: d */
    public C16933b mo50784d(float f) {
        this.f44427b.setAlpha(f);
        return this;
    }

    /* renamed from: e */
    public void mo50785e() {
    }

    /* renamed from: f */
    public C16933b mo50786f(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        if (i3 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (i6 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        } else if (f <= 0.0f || f > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        } else {
            if (i2 == 1 || i2 == 2) {
                mo50793m(1, i, i2, i3);
                mo50793m(2, i4, i5, i6);
                this.f44426a.f44230G = f;
            } else if (i2 == 6 || i2 == 7) {
                mo50793m(6, i, i2, i3);
                mo50793m(7, i4, i5, i6);
                this.f44426a.f44230G = f;
            } else {
                mo50793m(3, i, i2, i3);
                mo50793m(4, i4, i5, i6);
                this.f44426a.f44231H = f;
            }
            return this;
        }
    }

    /* renamed from: g */
    public C16933b mo50787g(int i) {
        if (i == 0) {
            mo50786f(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            mo50786f(i, 2, 0, i, 1, 0, 0.5f);
        }
        return this;
    }

    /* renamed from: h */
    public C16933b mo50788h(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        mo50793m(1, i, i2, i3);
        mo50793m(2, i4, i5, i6);
        this.f44426a.f44230G = f;
        return this;
    }

    /* renamed from: i */
    public C16933b mo50789i(int i) {
        if (i == 0) {
            mo50786f(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            mo50786f(i, 7, 0, i, 6, 0, 0.5f);
        }
        return this;
    }

    /* renamed from: j */
    public C16933b mo50790j(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        mo50793m(6, i, i2, i3);
        mo50793m(7, i4, i5, i6);
        this.f44426a.f44230G = f;
        return this;
    }

    /* renamed from: k */
    public C16933b mo50791k(int i) {
        if (i == 0) {
            mo50786f(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            mo50786f(i, 4, 0, i, 3, 0, 0.5f);
        }
        return this;
    }

    /* renamed from: l */
    public C16933b mo50792l(int i, int i2, int i3, int i4, int i5, int i6, float f) {
        mo50793m(3, i, i2, i3);
        mo50793m(4, i4, i5, i6);
        this.f44426a.f44231H = f;
        return this;
    }

    /* renamed from: m */
    public C16933b mo50793m(int i, int i2, int i3, int i4) {
        switch (i) {
            case 1:
                if (i3 == 1) {
                    ConstraintLayout.C16926b bVar = this.f44426a;
                    bVar.f44258e = i2;
                    bVar.f44260f = -1;
                } else if (i3 == 2) {
                    ConstraintLayout.C16926b bVar2 = this.f44426a;
                    bVar2.f44260f = i2;
                    bVar2.f44258e = -1;
                } else {
                    throw new IllegalArgumentException("Left to " + mo50769K(i3) + " undefined");
                }
                this.f44426a.leftMargin = i4;
                break;
            case 2:
                if (i3 == 1) {
                    ConstraintLayout.C16926b bVar3 = this.f44426a;
                    bVar3.f44262g = i2;
                    bVar3.f44264h = -1;
                } else if (i3 == 2) {
                    ConstraintLayout.C16926b bVar4 = this.f44426a;
                    bVar4.f44264h = i2;
                    bVar4.f44262g = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo50769K(i3) + " undefined");
                }
                this.f44426a.rightMargin = i4;
                break;
            case 3:
                if (i3 == 3) {
                    ConstraintLayout.C16926b bVar5 = this.f44426a;
                    bVar5.f44266i = i2;
                    bVar5.f44268j = -1;
                    bVar5.f44274m = -1;
                    bVar5.f44276n = -1;
                    bVar5.f44278o = -1;
                } else if (i3 == 4) {
                    ConstraintLayout.C16926b bVar6 = this.f44426a;
                    bVar6.f44268j = i2;
                    bVar6.f44266i = -1;
                    bVar6.f44274m = -1;
                    bVar6.f44276n = -1;
                    bVar6.f44278o = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo50769K(i3) + " undefined");
                }
                this.f44426a.topMargin = i4;
                break;
            case 4:
                if (i3 == 4) {
                    ConstraintLayout.C16926b bVar7 = this.f44426a;
                    bVar7.f44272l = i2;
                    bVar7.f44270k = -1;
                    bVar7.f44274m = -1;
                    bVar7.f44276n = -1;
                    bVar7.f44278o = -1;
                } else if (i3 == 3) {
                    ConstraintLayout.C16926b bVar8 = this.f44426a;
                    bVar8.f44270k = i2;
                    bVar8.f44272l = -1;
                    bVar8.f44274m = -1;
                    bVar8.f44276n = -1;
                    bVar8.f44278o = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo50769K(i3) + " undefined");
                }
                this.f44426a.bottomMargin = i4;
                break;
            case 5:
                if (i3 == 5) {
                    ConstraintLayout.C16926b bVar9 = this.f44426a;
                    bVar9.f44274m = i2;
                    bVar9.f44272l = -1;
                    bVar9.f44270k = -1;
                    bVar9.f44266i = -1;
                    bVar9.f44268j = -1;
                }
                if (i3 == 3) {
                    ConstraintLayout.C16926b bVar10 = this.f44426a;
                    bVar10.f44276n = i2;
                    bVar10.f44272l = -1;
                    bVar10.f44270k = -1;
                    bVar10.f44266i = -1;
                    bVar10.f44268j = -1;
                } else if (i3 == 4) {
                    ConstraintLayout.C16926b bVar11 = this.f44426a;
                    bVar11.f44278o = i2;
                    bVar11.f44272l = -1;
                    bVar11.f44270k = -1;
                    bVar11.f44266i = -1;
                    bVar11.f44268j = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo50769K(i3) + " undefined");
                }
                this.f44426a.f44227D = i4;
                break;
            case 6:
                if (i3 == 6) {
                    ConstraintLayout.C16926b bVar12 = this.f44426a;
                    bVar12.f44288t = i2;
                    bVar12.f44286s = -1;
                } else if (i3 == 7) {
                    ConstraintLayout.C16926b bVar13 = this.f44426a;
                    bVar13.f44286s = i2;
                    bVar13.f44288t = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo50769K(i3) + " undefined");
                }
                this.f44426a.setMarginStart(i4);
                break;
            case 7:
                if (i3 == 7) {
                    ConstraintLayout.C16926b bVar14 = this.f44426a;
                    bVar14.f44292v = i2;
                    bVar14.f44290u = -1;
                } else if (i3 == 6) {
                    ConstraintLayout.C16926b bVar15 = this.f44426a;
                    bVar15.f44290u = i2;
                    bVar15.f44292v = -1;
                } else {
                    throw new IllegalArgumentException("right to " + mo50769K(i3) + " undefined");
                }
                this.f44426a.setMarginEnd(i4);
                break;
            default:
                throw new IllegalArgumentException(mo50769K(i) + " to " + mo50769K(i3) + " unknown");
        }
        return this;
    }

    /* renamed from: n */
    public C16933b mo50794n(int i) {
        this.f44426a.f44240Q = i;
        return this;
    }

    /* renamed from: o */
    public C16933b mo50795o(int i) {
        this.f44426a.f44239P = i;
        return this;
    }

    /* renamed from: p */
    public C16933b mo50796p(int i) {
        this.f44426a.height = i;
        return this;
    }

    /* renamed from: q */
    public C16933b mo50797q(int i) {
        this.f44426a.f44244U = i;
        return this;
    }

    /* renamed from: r */
    public C16933b mo50798r(int i) {
        this.f44426a.f44243T = i;
        return this;
    }

    /* renamed from: s */
    public C16933b mo50799s(int i) {
        this.f44426a.f44242S = i;
        return this;
    }

    /* renamed from: t */
    public C16933b mo50800t(int i) {
        this.f44426a.f44241R = i;
        return this;
    }

    /* renamed from: u */
    public C16933b mo50801u(int i) {
        this.f44426a.width = i;
        return this;
    }

    /* renamed from: v */
    public C16933b mo50802v(String str) {
        this.f44426a.f44232I = str;
        return this;
    }

    /* renamed from: w */
    public C16933b mo50803w(float f) {
        this.f44427b.setElevation(f);
        return this;
    }

    /* renamed from: x */
    public C16933b mo50804x(int i, int i2) {
        switch (i) {
            case 1:
                this.f44426a.f44294w = i2;
                break;
            case 2:
                this.f44426a.f44297y = i2;
                break;
            case 3:
                this.f44426a.f44296x = i2;
                break;
            case 4:
                this.f44426a.f44298z = i2;
                break;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f44426a.f44224A = i2;
                break;
            case 7:
                this.f44426a.f44225B = i2;
                break;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
        return this;
    }

    /* renamed from: y */
    public C16933b mo50805y(float f) {
        this.f44426a.f44230G = f;
        return this;
    }

    /* renamed from: z */
    public C16933b mo50806z(int i) {
        this.f44426a.f44237N = i;
        return this;
    }
}
