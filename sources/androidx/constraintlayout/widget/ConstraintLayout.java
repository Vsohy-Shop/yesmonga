package androidx.constraintlayout.widget;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.C0359n0;
import androidx.annotation.C0363p0;
import androidx.constraintlayout.core.C16646f;
import androidx.constraintlayout.core.widgets.C16798d;
import androidx.constraintlayout.core.widgets.C16801f;
import androidx.constraintlayout.core.widgets.C16805i;
import androidx.constraintlayout.core.widgets.C16808l;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.analyzer.C16778b;
import androidx.constraintlayout.widget.C16944e;
import androidx.core.internal.view.C17673a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintLayout extends ViewGroup {
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
    public static final int DESIGN_INFO_ID = 0;
    private static final boolean MEASURE = false;
    private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
    private static final String TAG = "ConstraintLayout";
    private static final boolean USE_CONSTRAINTS_HELPER = true;
    public static final String VERSION = "ConstraintLayout-2.1.4";
    private static C16958f sSharedValues;
    SparseArray<View> mChildrenByIds = new SparseArray<>();
    /* access modifiers changed from: private */
    public ArrayList<ConstraintHelper> mConstraintHelpers = new ArrayList<>(4);
    protected C16930a mConstraintLayoutSpec = null;
    private C16934c mConstraintSet = null;
    private int mConstraintSetId = -1;
    private C16943d mConstraintsChangedListener;
    private HashMap<String, Integer> mDesignIds = new HashMap<>();
    protected boolean mDirtyHierarchy = true;
    private int mLastMeasureHeight = -1;
    int mLastMeasureHeightMode = 0;
    int mLastMeasureHeightSize = -1;
    private int mLastMeasureWidth = -1;
    int mLastMeasureWidthMode = 0;
    int mLastMeasureWidthSize = -1;
    /* access modifiers changed from: protected */
    public C16798d mLayoutWidget = new C16798d();
    private int mMaxHeight = Integer.MAX_VALUE;
    private int mMaxWidth = Integer.MAX_VALUE;
    C16928c mMeasurer = new C16928c(this);
    private C16646f mMetrics;
    private int mMinHeight = 0;
    private int mMinWidth = 0;
    private int mOnMeasureHeightMeasureSpec = 0;
    private int mOnMeasureWidthMeasureSpec = 0;
    /* access modifiers changed from: private */
    public int mOptimizationLevel = 257;
    private SparseArray<ConstraintWidget> mTempMapIdToWidget = new SparseArray<>();

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$a */
    public static /* synthetic */ class C16925a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f44199a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour[] r0 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f44199a = r0
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.FIXED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f44199a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.WRAP_CONTENT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f44199a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_PARENT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f44199a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour r1 = androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C16925a.<clinit>():void");
        }
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$c */
    public class C16928c implements C16778b.C16780b {

        /* renamed from: a */
        public ConstraintLayout f44360a;

        /* renamed from: b */
        public int f44361b;

        /* renamed from: c */
        public int f44362c;

        /* renamed from: d */
        public int f44363d;

        /* renamed from: e */
        public int f44364e;

        /* renamed from: f */
        public int f44365f;

        /* renamed from: g */
        public int f44366g;

        public C16928c(ConstraintLayout constraintLayout) {
            this.f44360a = constraintLayout;
        }

        /* renamed from: a */
        public final void mo48386a() {
            int childCount = this.f44360a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f44360a.getChildAt(i);
                if (childAt instanceof Placeholder) {
                    ((Placeholder) childAt).mo50728b(this.f44360a);
                }
            }
            int size = this.f44360a.mConstraintHelpers.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    ((ConstraintHelper) this.f44360a.mConstraintHelpers.get(i2)).mo50645E(this.f44360a);
                }
            }
        }

        /* renamed from: b */
        public void mo50708b(int i, int i2, int i3, int i4, int i5, int i6) {
            this.f44361b = i3;
            this.f44362c = i4;
            this.f44363d = i5;
            this.f44364e = i6;
            this.f44365f = i;
            this.f44366g = i2;
        }

        @SuppressLint({"WrongCall"})
        /* renamed from: c */
        public final void mo48388c(ConstraintWidget constraintWidget, C16778b.C16779a aVar) {
            int i;
            int i2;
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            int i3;
            int i4;
            int i5;
            int i6;
            boolean z7;
            boolean z8;
            int i7;
            int i8;
            boolean z9;
            boolean z10;
            boolean z11;
            boolean z12;
            boolean z13;
            boolean z14;
            boolean z15;
            ConstraintWidget constraintWidget2 = constraintWidget;
            C16778b.C16779a aVar2 = aVar;
            if (constraintWidget2 != null) {
                if (constraintWidget.mo49566l0() == 8 && !constraintWidget.mo49454C0()) {
                    aVar2.f42846e = 0;
                    aVar2.f42847f = 0;
                    aVar2.f42848g = 0;
                } else if (constraintWidget.mo49507U() != null) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar2.f42842a;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = aVar2.f42843b;
                    int i9 = aVar2.f42844c;
                    int i10 = aVar2.f42845d;
                    int i11 = this.f44361b + this.f44362c;
                    int i12 = this.f44363d;
                    View view = (View) constraintWidget.mo49599w();
                    int[] iArr = C16925a.f44199a;
                    int i13 = iArr[dimensionBehaviour.ordinal()];
                    if (i13 == 1) {
                        i = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
                    } else if (i13 == 2) {
                        i = ViewGroup.getChildMeasureSpec(this.f44365f, i12, -2);
                    } else if (i13 == 3) {
                        i = ViewGroup.getChildMeasureSpec(this.f44365f, i12 + constraintWidget.mo49471I(), -1);
                    } else if (i13 != 4) {
                        i = 0;
                    } else {
                        i = ViewGroup.getChildMeasureSpec(this.f44365f, i12, -2);
                        if (constraintWidget2.f42766w == 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        int i14 = aVar2.f42851j;
                        if (i14 == C16778b.C16779a.f42840l || i14 == C16778b.C16779a.f42841m) {
                            if (view.getMeasuredHeight() == constraintWidget.mo49456D()) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if (aVar2.f42851j == C16778b.C16779a.f42841m || !z13 || ((z13 && z14) || (view instanceof Placeholder) || constraintWidget.mo49466G0())) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (z15) {
                                i = View.MeasureSpec.makeMeasureSpec(constraintWidget.mo49569m0(), 1073741824);
                            }
                        }
                    }
                    int i15 = iArr[dimensionBehaviour2.ordinal()];
                    if (i15 == 1) {
                        i2 = View.MeasureSpec.makeMeasureSpec(i10, 1073741824);
                    } else if (i15 == 2) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f44366g, i11, -2);
                    } else if (i15 == 3) {
                        i2 = ViewGroup.getChildMeasureSpec(this.f44366g, i11 + constraintWidget.mo49563k0(), -1);
                    } else if (i15 != 4) {
                        i2 = 0;
                    } else {
                        i2 = ViewGroup.getChildMeasureSpec(this.f44366g, i11, -2);
                        if (constraintWidget2.f42768x == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int i16 = aVar2.f42851j;
                        if (i16 == C16778b.C16779a.f42840l || i16 == C16778b.C16779a.f42841m) {
                            if (view.getMeasuredWidth() == constraintWidget.mo49569m0()) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (aVar2.f42851j == C16778b.C16779a.f42841m || !z10 || ((z10 && z11) || (view instanceof Placeholder) || constraintWidget.mo49469H0())) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (z12) {
                                i2 = View.MeasureSpec.makeMeasureSpec(constraintWidget.mo49456D(), 1073741824);
                            }
                        }
                    }
                    C16798d dVar = (C16798d) constraintWidget.mo49507U();
                    if (dVar != null && C16805i.m77235b(ConstraintLayout.this.mOptimizationLevel, 256) && view.getMeasuredWidth() == constraintWidget.mo49569m0() && view.getMeasuredWidth() < dVar.mo49569m0() && view.getMeasuredHeight() == constraintWidget.mo49456D() && view.getMeasuredHeight() < dVar.mo49456D() && view.getBaseline() == constraintWidget.mo49589t() && !constraintWidget.mo49463F0()) {
                        if (!mo50709d(constraintWidget.mo49474J(), i, constraintWidget.mo49569m0()) || !mo50709d(constraintWidget.mo49477K(), i2, constraintWidget.mo49456D())) {
                            z9 = false;
                        } else {
                            z9 = true;
                        }
                        if (z9) {
                            aVar2.f42846e = constraintWidget.mo49569m0();
                            aVar2.f42847f = constraintWidget.mo49456D();
                            aVar2.f42848g = constraintWidget.mo49589t();
                            return;
                        }
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.MATCH_PARENT;
                    if (dimensionBehaviour2 == dimensionBehaviour4 || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (dimensionBehaviour == dimensionBehaviour4 || dimensionBehaviour == ConstraintWidget.DimensionBehaviour.FIXED) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!z || constraintWidget2.f42733f0 <= 0.0f) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                    if (!z2 || constraintWidget2.f42733f0 <= 0.0f) {
                        z6 = false;
                    } else {
                        z6 = true;
                    }
                    if (view != null) {
                        C16926b bVar = (C16926b) view.getLayoutParams();
                        int i17 = aVar2.f42851j;
                        if (i17 == C16778b.C16779a.f42840l || i17 == C16778b.C16779a.f42841m || !z || constraintWidget2.f42766w != 0 || !z2 || constraintWidget2.f42768x != 0) {
                            if (!(view instanceof VirtualLayout) || !(constraintWidget2 instanceof C16808l)) {
                                view.measure(i, i2);
                            } else {
                                ((VirtualLayout) view).mo49884J((C16808l) constraintWidget2, i, i2);
                            }
                            constraintWidget2.mo49476J1(i, i2);
                            int measuredWidth = view.getMeasuredWidth();
                            int measuredHeight = view.getMeasuredHeight();
                            i4 = view.getBaseline();
                            int i18 = constraintWidget2.f42772z;
                            if (i18 > 0) {
                                i3 = Math.max(i18, measuredWidth);
                            } else {
                                i3 = measuredWidth;
                            }
                            int i19 = constraintWidget2.f42676A;
                            if (i19 > 0) {
                                i3 = Math.min(i19, i3);
                            }
                            int i20 = constraintWidget2.f42680C;
                            if (i20 > 0) {
                                i5 = Math.max(i20, measuredHeight);
                                i7 = i;
                            } else {
                                i7 = i;
                                i5 = measuredHeight;
                            }
                            int i21 = constraintWidget2.f42682D;
                            if (i21 > 0) {
                                i5 = Math.min(i21, i5);
                            }
                            if (!C16805i.m77235b(ConstraintLayout.this.mOptimizationLevel, 1)) {
                                if (z5 && z3) {
                                    i3 = (int) ((((float) i5) * constraintWidget2.f42733f0) + 0.5f);
                                } else if (z6 && z4) {
                                    i5 = (int) ((((float) i3) / constraintWidget2.f42733f0) + 0.5f);
                                }
                            }
                            if (!(measuredWidth == i3 && measuredHeight == i5)) {
                                if (measuredWidth != i3) {
                                    i8 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                                } else {
                                    i8 = i7;
                                }
                                if (measuredHeight != i5) {
                                    i2 = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
                                }
                                view.measure(i8, i2);
                                constraintWidget2.mo49476J1(i8, i2);
                                i3 = view.getMeasuredWidth();
                                i5 = view.getMeasuredHeight();
                                i4 = view.getBaseline();
                            }
                            i6 = -1;
                        } else {
                            i6 = -1;
                            i5 = 0;
                            i4 = 0;
                            i3 = 0;
                        }
                        if (i4 != i6) {
                            z7 = true;
                        } else {
                            z7 = false;
                        }
                        if (i3 == aVar2.f42844c && i5 == aVar2.f42845d) {
                            z8 = false;
                        } else {
                            z8 = true;
                        }
                        aVar2.f42850i = z8;
                        if (bVar.f44263g0) {
                            z7 = true;
                        }
                        if (!(!z7 || i4 == -1 || constraintWidget.mo49589t() == i4)) {
                            aVar2.f42850i = true;
                        }
                        aVar2.f42846e = i3;
                        aVar2.f42847f = i5;
                        aVar2.f42849h = z7;
                        aVar2.f42848g = i4;
                    }
                }
            }
        }

        /* renamed from: d */
        public final boolean mo50709d(int i, int i2, int i3) {
            if (i == i2) {
                return true;
            }
            int mode = View.MeasureSpec.getMode(i);
            View.MeasureSpec.getSize(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (mode2 != 1073741824) {
                return false;
            }
            if ((mode == Integer.MIN_VALUE || mode == 0) && i3 == size) {
                return true;
            }
            return false;
        }
    }

    public ConstraintLayout(@C0359n0 Context context) {
        super(context);
        mo50684j((AttributeSet) null, 0, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int max2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        if (max2 > 0) {
            return max2;
        }
        return max;
    }

    public static C16958f getSharedValues() {
        if (sSharedValues == null) {
            sSharedValues = new C16958f();
        }
        return sSharedValues;
    }

    public void applyConstraintsFromLayoutParams(boolean z, View view, ConstraintWidget constraintWidget, C16926b bVar, SparseArray<ConstraintWidget> sparseArray) {
        int i;
        ConstraintWidget constraintWidget2;
        ConstraintWidget constraintWidget3;
        ConstraintWidget constraintWidget4;
        ConstraintWidget constraintWidget5;
        View view2 = view;
        ConstraintWidget constraintWidget6 = constraintWidget;
        C16926b bVar2 = bVar;
        SparseArray<ConstraintWidget> sparseArray2 = sparseArray;
        bVar.mo50706e();
        bVar2.f44295w0 = false;
        constraintWidget6.mo49530b2(view.getVisibility());
        if (bVar2.f44269j0) {
            constraintWidget6.mo49470H1(true);
            constraintWidget6.mo49530b2(8);
        }
        constraintWidget6.mo49552h1(view2);
        if (view2 instanceof ConstraintHelper) {
            ((ConstraintHelper) view2).mo49883B(constraintWidget6, this.mLayoutWidget.mo49731O2());
        }
        if (bVar2.f44265h0) {
            C16801f fVar = (C16801f) constraintWidget6;
            int i2 = bVar2.f44287s0;
            int i3 = bVar2.f44289t0;
            float f = bVar2.f44291u0;
            if (f != -1.0f) {
                fVar.mo49807y2(f);
            } else if (i2 != -1) {
                fVar.mo49805w2(i2);
            } else if (i3 != -1) {
                fVar.mo49806x2(i3);
            }
        } else {
            int i4 = bVar2.f44273l0;
            int i5 = bVar2.f44275m0;
            int i6 = bVar2.f44277n0;
            int i7 = bVar2.f44279o0;
            int i8 = bVar2.f44281p0;
            int i9 = bVar2.f44283q0;
            float f2 = bVar2.f44285r0;
            int i10 = bVar2.f44280p;
            if (i10 != -1) {
                ConstraintWidget constraintWidget7 = sparseArray2.get(i10);
                if (constraintWidget7 != null) {
                    constraintWidget6.mo49568m(constraintWidget7, bVar2.f44284r, bVar2.f44282q);
                }
            } else {
                if (i4 != -1) {
                    ConstraintWidget constraintWidget8 = sparseArray2.get(i4);
                    if (constraintWidget8 != null) {
                        ConstraintAnchor.Type type = ConstraintAnchor.Type.LEFT;
                        constraintWidget.mo49597v0(type, constraintWidget8, type, bVar2.leftMargin, i8);
                    }
                } else if (!(i5 == -1 || (constraintWidget5 = sparseArray2.get(i5)) == null)) {
                    constraintWidget.mo49597v0(ConstraintAnchor.Type.LEFT, constraintWidget5, ConstraintAnchor.Type.RIGHT, bVar2.leftMargin, i8);
                }
                if (i6 != -1) {
                    ConstraintWidget constraintWidget9 = sparseArray2.get(i6);
                    if (constraintWidget9 != null) {
                        constraintWidget.mo49597v0(ConstraintAnchor.Type.RIGHT, constraintWidget9, ConstraintAnchor.Type.LEFT, bVar2.rightMargin, i9);
                    }
                } else if (!(i7 == -1 || (constraintWidget4 = sparseArray2.get(i7)) == null)) {
                    ConstraintAnchor.Type type2 = ConstraintAnchor.Type.RIGHT;
                    constraintWidget.mo49597v0(type2, constraintWidget4, type2, bVar2.rightMargin, i9);
                }
                int i11 = bVar2.f44266i;
                if (i11 != -1) {
                    ConstraintWidget constraintWidget10 = sparseArray2.get(i11);
                    if (constraintWidget10 != null) {
                        ConstraintAnchor.Type type3 = ConstraintAnchor.Type.f42635c;
                        constraintWidget.mo49597v0(type3, constraintWidget10, type3, bVar2.topMargin, bVar2.f44296x);
                    }
                } else {
                    int i12 = bVar2.f44268j;
                    if (!(i12 == -1 || (constraintWidget3 = sparseArray2.get(i12)) == null)) {
                        constraintWidget.mo49597v0(ConstraintAnchor.Type.f42635c, constraintWidget3, ConstraintAnchor.Type.BOTTOM, bVar2.topMargin, bVar2.f44296x);
                    }
                }
                int i13 = bVar2.f44270k;
                if (i13 != -1) {
                    ConstraintWidget constraintWidget11 = sparseArray2.get(i13);
                    if (constraintWidget11 != null) {
                        constraintWidget.mo49597v0(ConstraintAnchor.Type.BOTTOM, constraintWidget11, ConstraintAnchor.Type.f42635c, bVar2.bottomMargin, bVar2.f44298z);
                    }
                } else {
                    int i14 = bVar2.f44272l;
                    if (!(i14 == -1 || (constraintWidget2 = sparseArray2.get(i14)) == null)) {
                        ConstraintAnchor.Type type4 = ConstraintAnchor.Type.BOTTOM;
                        constraintWidget.mo49597v0(type4, constraintWidget2, type4, bVar2.bottomMargin, bVar2.f44298z);
                    }
                }
                int i15 = bVar2.f44274m;
                if (i15 != -1) {
                    mo50687p(constraintWidget, bVar, sparseArray, i15, ConstraintAnchor.Type.BASELINE);
                } else {
                    int i16 = bVar2.f44276n;
                    if (i16 != -1) {
                        mo50687p(constraintWidget, bVar, sparseArray, i16, ConstraintAnchor.Type.f42635c);
                    } else {
                        int i17 = bVar2.f44278o;
                        if (i17 != -1) {
                            mo50687p(constraintWidget, bVar, sparseArray, i17, ConstraintAnchor.Type.BOTTOM);
                        }
                    }
                }
                if (f2 >= 0.0f) {
                    constraintWidget6.mo49449A1(f2);
                }
                float f3 = bVar2.f44231H;
                if (f3 >= 0.0f) {
                    constraintWidget6.mo49512V1(f3);
                }
            }
            if (z && !((i = bVar2.f44247X) == -1 && bVar2.f44248Y == -1)) {
                constraintWidget6.mo49500R1(i, bVar2.f44248Y);
            }
            if (bVar2.f44259e0) {
                constraintWidget6.mo49458D1(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget6.mo49533c2(bVar2.width);
                if (bVar2.width == -2) {
                    constraintWidget6.mo49458D1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (bVar2.width == -1) {
                if (bVar2.f44251a0) {
                    constraintWidget6.mo49458D1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget6.mo49458D1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget6.mo49583r(ConstraintAnchor.Type.LEFT).f42630g = bVar2.leftMargin;
                constraintWidget6.mo49583r(ConstraintAnchor.Type.RIGHT).f42630g = bVar2.rightMargin;
            } else {
                constraintWidget6.mo49458D1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget6.mo49533c2(0);
            }
            if (bVar2.f44261f0) {
                constraintWidget6.mo49521Y1(ConstraintWidget.DimensionBehaviour.FIXED);
                constraintWidget6.mo49607y1(bVar2.height);
                if (bVar2.height == -2) {
                    constraintWidget6.mo49521Y1(ConstraintWidget.DimensionBehaviour.WRAP_CONTENT);
                }
            } else if (bVar2.height == -1) {
                if (bVar2.f44253b0) {
                    constraintWidget6.mo49521Y1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                } else {
                    constraintWidget6.mo49521Y1(ConstraintWidget.DimensionBehaviour.MATCH_PARENT);
                }
                constraintWidget6.mo49583r(ConstraintAnchor.Type.f42635c).f42630g = bVar2.topMargin;
                constraintWidget6.mo49583r(ConstraintAnchor.Type.BOTTOM).f42630g = bVar2.bottomMargin;
            } else {
                constraintWidget6.mo49521Y1(ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT);
                constraintWidget6.mo49607y1(0);
            }
            constraintWidget6.mo49573n1(bVar2.f44232I);
            constraintWidget6.mo49464F1(bVar2.f44235L);
            constraintWidget6.mo49527a2(bVar2.f44236M);
            constraintWidget6.mo49452B1(bVar2.f44237N);
            constraintWidget6.mo49515W1(bVar2.f44238O);
            constraintWidget6.mo49541e2(bVar2.f44257d0);
            constraintWidget6.mo49461E1(bVar2.f44239P, bVar2.f44241R, bVar2.f44243T, bVar2.f44245V);
            constraintWidget6.mo49524Z1(bVar2.f44240Q, bVar2.f44242S, bVar2.f44244U, bVar2.f44246W);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C16926b;
    }

    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList<ConstraintHelper> arrayList = this.mConstraintHelpers;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                this.mConstraintHelpers.get(i).mo49912F(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = (float) getWidth();
            float height = (float) getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (!(childAt.getVisibility() == 8 || (tag = childAt.getTag()) == null || !(tag instanceof String))) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((((float) parseInt) / 1080.0f) * width);
                        int i4 = (int) ((((float) parseInt2) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(C17673a.f46025c);
                        float f = (float) i3;
                        float f2 = (float) i4;
                        float f3 = (float) (i3 + ((int) ((((float) parseInt3) / 1080.0f) * width)));
                        Canvas canvas2 = canvas;
                        float f4 = f2;
                        float f5 = f2;
                        float f6 = f3;
                        float f7 = f;
                        Paint paint2 = paint;
                        canvas2.drawLine(f, f4, f6, f5, paint);
                        float parseInt4 = (float) (i4 + ((int) ((((float) Integer.parseInt(split[3])) / 1920.0f) * height)));
                        float f8 = f3;
                        float f9 = parseInt4;
                        canvas2.drawLine(f8, f5, f6, f9, paint);
                        float f10 = parseInt4;
                        float f11 = f7;
                        canvas2.drawLine(f8, f10, f11, f9, paint);
                        float f12 = f7;
                        canvas2.drawLine(f12, f10, f11, f5, paint);
                        paint.setColor(-16711936);
                        float f13 = f3;
                        Paint paint3 = paint;
                        canvas2.drawLine(f12, f5, f13, parseInt4, paint);
                        canvas2.drawLine(f12, parseInt4, f13, f5, paint);
                    }
                }
            }
        }
    }

    public void fillMetrics(C16646f fVar) {
        this.mMetrics = fVar;
        this.mLayoutWidget.mo49721E2(fVar);
    }

    public void forceLayout() {
        mo50685k();
        super.forceLayout();
    }

    public Object getDesignInformation(int i, Object obj) {
        if (i != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap<String, Integer> hashMap = this.mDesignIds;
        if (hashMap == null || !hashMap.containsKey(str)) {
            return null;
        }
        return this.mDesignIds.get(str);
    }

    public int getMaxHeight() {
        return this.mMaxHeight;
    }

    public int getMaxWidth() {
        return this.mMaxWidth;
    }

    public int getMinHeight() {
        return this.mMinHeight;
    }

    public int getMinWidth() {
        return this.mMinWidth;
    }

    public int getOptimizationLevel() {
        return this.mLayoutWidget.mo49724H2();
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        if (this.mLayoutWidget.f42750o == null) {
            int id2 = getId();
            if (id2 != -1) {
                this.mLayoutWidget.f42750o = getContext().getResources().getResourceEntryName(id2);
            } else {
                this.mLayoutWidget.f42750o = C16934c.f44493V1;
            }
        }
        if (this.mLayoutWidget.mo49605y() == null) {
            C16798d dVar = this.mLayoutWidget;
            dVar.mo49560j1(dVar.f42750o);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" setDebugName ");
            sb2.append(this.mLayoutWidget.mo49605y());
        }
        Iterator<ConstraintWidget> it = this.mLayoutWidget.mo49843l2().iterator();
        while (it.hasNext()) {
            ConstraintWidget next = it.next();
            View view = (View) next.mo49599w();
            if (view != null) {
                if (next.f42750o == null && (id = view.getId()) != -1) {
                    next.f42750o = getContext().getResources().getResourceEntryName(id);
                }
                if (next.mo49605y() == null) {
                    next.mo49560j1(next.f42750o);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(" setDebugName ");
                    sb3.append(next.mo49605y());
                }
            }
        }
        this.mLayoutWidget.mo49528b0(sb);
        return sb.toString();
    }

    public View getViewById(int i) {
        return this.mChildrenByIds.get(i);
    }

    public final ConstraintWidget getViewWidget(View view) {
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C16926b) {
            return ((C16926b) view.getLayoutParams()).f44293v0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C16926b) {
            return ((C16926b) view.getLayoutParams()).f44293v0;
        }
        return null;
    }

    /* renamed from: i */
    public final ConstraintWidget mo50682i(int i) {
        if (i == 0) {
            return this.mLayoutWidget;
        }
        View view = this.mChildrenByIds.get(i);
        if (view == null && (view = findViewById(i)) != null && view != this && view.getParent() == this) {
            onViewAdded(view);
        }
        if (view == this) {
            return this.mLayoutWidget;
        }
        if (view == null) {
            return null;
        }
        return ((C16926b) view.getLayoutParams()).f44293v0;
    }

    public boolean isRtl() {
        boolean z;
        if ((getContext().getApplicationInfo().flags & 4194304) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z || 1 != getLayoutDirection()) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public final void mo50684j(AttributeSet attributeSet, int i, int i2) {
        this.mLayoutWidget.mo49552h1(this);
        this.mLayoutWidget.mo49736U2(this.mMeasurer);
        this.mChildrenByIds.put(getId(), this);
        this.mConstraintSet = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C16944e.C16957m.ConstraintLayout_Layout, i, i2);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i3 = 0; i3 < indexCount; i3++) {
                int index = obtainStyledAttributes.getIndex(i3);
                if (index == C16944e.C16957m.ConstraintLayout_Layout_android_minWidth) {
                    this.mMinWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinWidth);
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_minHeight) {
                    this.mMinHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMinHeight);
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_maxWidth) {
                    this.mMaxWidth = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxWidth);
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_android_maxHeight) {
                    this.mMaxHeight = obtainStyledAttributes.getDimensionPixelOffset(index, this.mMaxHeight);
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_layout_optimizationLevel) {
                    this.mOptimizationLevel = obtainStyledAttributes.getInt(index, this.mOptimizationLevel);
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_layoutDescription) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            parseLayoutDescription(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.mConstraintLayoutSpec = null;
                        }
                    }
                } else if (index == C16944e.C16957m.ConstraintLayout_Layout_constraintSet) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C16934c cVar = new C16934c();
                        this.mConstraintSet = cVar;
                        cVar.mo50915w0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.mConstraintSet = null;
                    }
                    this.mConstraintSetId = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.mLayoutWidget.mo49737V2(this.mOptimizationLevel);
    }

    /* renamed from: k */
    public final void mo50685k() {
        this.mDirtyHierarchy = true;
        this.mLastMeasureWidth = -1;
        this.mLastMeasureHeight = -1;
        this.mLastMeasureWidthSize = -1;
        this.mLastMeasureHeightSize = -1;
        this.mLastMeasureWidthMode = 0;
        this.mLastMeasureHeightMode = 0;
    }

    /* renamed from: l */
    public final void mo50686l() {
        boolean isInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ConstraintWidget viewWidget = getViewWidget(getChildAt(i));
            if (viewWidget != null) {
                viewWidget.mo49499R0();
            }
        }
        if (isInEditMode) {
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    setDesignInformation(0, resourceName, Integer.valueOf(childAt.getId()));
                    int indexOf = resourceName.indexOf(47);
                    if (indexOf != -1) {
                        resourceName = resourceName.substring(indexOf + 1);
                    }
                    mo50682i(childAt.getId()).mo49560j1(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.mConstraintSetId != -1) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt2 = getChildAt(i3);
                if (childAt2.getId() == this.mConstraintSetId && (childAt2 instanceof Constraints)) {
                    this.mConstraintSet = ((Constraints) childAt2).getConstraintSet();
                }
            }
        }
        C16934c cVar = this.mConstraintSet;
        if (cVar != null) {
            cVar.mo50906t(this, true);
        }
        this.mLayoutWidget.mo49846p2();
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i4 = 0; i4 < size; i4++) {
                this.mConstraintHelpers.get(i4).mo50646H(this);
            }
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt3 = getChildAt(i5);
            if (childAt3 instanceof Placeholder) {
                ((Placeholder) childAt3).mo50729c(this);
            }
        }
        this.mTempMapIdToWidget.clear();
        this.mTempMapIdToWidget.put(0, this.mLayoutWidget);
        this.mTempMapIdToWidget.put(getId(), this.mLayoutWidget);
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt4 = getChildAt(i6);
            this.mTempMapIdToWidget.put(childAt4.getId(), getViewWidget(childAt4));
        }
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt5 = getChildAt(i7);
            ConstraintWidget viewWidget2 = getViewWidget(childAt5);
            if (viewWidget2 != null) {
                this.mLayoutWidget.mo49841a(viewWidget2);
                applyConstraintsFromLayoutParams(isInEditMode, childAt5, viewWidget2, (C16926b) childAt5.getLayoutParams(), this.mTempMapIdToWidget);
            }
        }
    }

    public void loadLayoutDescription(int i) {
        if (i != 0) {
            try {
                this.mConstraintLayoutSpec = new C16930a(getContext(), this, i);
            } catch (Resources.NotFoundException unused) {
                this.mConstraintLayoutSpec = null;
            }
        } else {
            this.mConstraintLayoutSpec = null;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View content;
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C16926b bVar = (C16926b) childAt.getLayoutParams();
            ConstraintWidget constraintWidget = bVar.f44293v0;
            if ((childAt.getVisibility() != 8 || bVar.f44265h0 || bVar.f44267i0 || bVar.f44271k0 || isInEditMode) && !bVar.f44269j0) {
                int o0 = constraintWidget.mo49575o0();
                int p0 = constraintWidget.mo49578p0();
                int m0 = constraintWidget.mo49569m0() + o0;
                int D = constraintWidget.mo49456D() + p0;
                childAt.layout(o0, p0, m0, D);
                if ((childAt instanceof Placeholder) && (content = ((Placeholder) childAt).getContent()) != null) {
                    content.setVisibility(0);
                    content.layout(o0, p0, m0, D);
                }
            }
        }
        int size = this.mConstraintHelpers.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                this.mConstraintHelpers.get(i6).mo49911D(this);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        if (this.mOnMeasureWidthMeasureSpec == i) {
            int i3 = this.mOnMeasureHeightMeasureSpec;
        }
        if (!this.mDirtyHierarchy) {
            int childCount = getChildCount();
            int i4 = 0;
            while (true) {
                if (i4 >= childCount) {
                    break;
                } else if (getChildAt(i4).isLayoutRequested()) {
                    this.mDirtyHierarchy = true;
                    break;
                } else {
                    i4++;
                }
            }
        }
        boolean z = this.mDirtyHierarchy;
        this.mOnMeasureWidthMeasureSpec = i;
        this.mOnMeasureHeightMeasureSpec = i2;
        this.mLayoutWidget.mo49740Y2(isRtl());
        if (this.mDirtyHierarchy) {
            this.mDirtyHierarchy = false;
            if (mo50701t()) {
                this.mLayoutWidget.mo49742a3();
            }
        }
        resolveSystem(this.mLayoutWidget, this.mOptimizationLevel, i, i2);
        resolveMeasuredDimension(i, i2, this.mLayoutWidget.mo49569m0(), this.mLayoutWidget.mo49456D(), this.mLayoutWidget.mo49732P2(), this.mLayoutWidget.mo49730N2());
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        ConstraintWidget viewWidget = getViewWidget(view);
        if ((view instanceof Guideline) && !(viewWidget instanceof C16801f)) {
            C16926b bVar = (C16926b) view.getLayoutParams();
            C16801f fVar = new C16801f();
            bVar.f44293v0 = fVar;
            bVar.f44265h0 = true;
            fVar.mo49792B2(bVar.f44249Z);
        }
        if (view instanceof ConstraintHelper) {
            ConstraintHelper constraintHelper = (ConstraintHelper) view;
            constraintHelper.mo50647I();
            ((C16926b) view.getLayoutParams()).f44267i0 = true;
            if (!this.mConstraintHelpers.contains(constraintHelper)) {
                this.mConstraintHelpers.add(constraintHelper);
            }
        }
        this.mChildrenByIds.put(view.getId(), view);
        this.mDirtyHierarchy = true;
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.mChildrenByIds.remove(view.getId());
        this.mLayoutWidget.mo49845o2(getViewWidget(view));
        this.mConstraintHelpers.remove(view);
        this.mDirtyHierarchy = true;
    }

    /* renamed from: p */
    public final void mo50687p(ConstraintWidget constraintWidget, C16926b bVar, SparseArray<ConstraintWidget> sparseArray, int i, ConstraintAnchor.Type type) {
        View view = this.mChildrenByIds.get(i);
        ConstraintWidget constraintWidget2 = sparseArray.get(i);
        if (constraintWidget2 != null && view != null && (view.getLayoutParams() instanceof C16926b)) {
            bVar.f44263g0 = true;
            ConstraintAnchor.Type type2 = ConstraintAnchor.Type.BASELINE;
            if (type == type2) {
                C16926b bVar2 = (C16926b) view.getLayoutParams();
                bVar2.f44263g0 = true;
                bVar2.f44293v0.mo49604x1(true);
            }
            constraintWidget.mo49583r(type2).mo49421b(constraintWidget2.mo49583r(type), bVar.f44227D, bVar.f44226C, true);
            constraintWidget.mo49604x1(true);
            constraintWidget.mo49583r(ConstraintAnchor.Type.f42635c).mo49444x();
            constraintWidget.mo49583r(ConstraintAnchor.Type.BOTTOM).mo49444x();
        }
    }

    public void parseLayoutDescription(int i) {
        this.mConstraintLayoutSpec = new C16930a(getContext(), this, i);
    }

    public void requestLayout() {
        mo50685k();
        super.requestLayout();
    }

    public void resolveMeasuredDimension(int i, int i2, int i3, int i4, boolean z, boolean z2) {
        C16928c cVar = this.mMeasurer;
        int i5 = cVar.f44364e;
        int resolveSizeAndState = View.resolveSizeAndState(i3 + cVar.f44363d, i, 0);
        int min = Math.min(this.mMaxWidth, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.mMaxHeight, View.resolveSizeAndState(i4 + i5, i2, 0) & 16777215);
        if (z) {
            min |= 16777216;
        }
        if (z2) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
        this.mLastMeasureWidth = min;
        this.mLastMeasureHeight = min2;
    }

    public void resolveSystem(C16798d dVar, int i, int i2, int i3) {
        int i4;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max = Math.max(0, getPaddingTop());
        int max2 = Math.max(0, getPaddingBottom());
        int i5 = max + max2;
        int paddingWidth = getPaddingWidth();
        this.mMeasurer.mo50708b(i2, i3, max, max2, paddingWidth, i5);
        int max3 = Math.max(0, getPaddingStart());
        int max4 = Math.max(0, getPaddingEnd());
        if (max3 <= 0 && max4 <= 0) {
            i4 = Math.max(0, getPaddingLeft());
        } else if (isRtl()) {
            i4 = max4;
        } else {
            i4 = max3;
        }
        int i6 = size - paddingWidth;
        int i7 = size2 - i5;
        setSelfDimensionBehaviour(dVar, mode, i6, mode2, i7);
        dVar.mo49733Q2(i, mode, i6, mode2, i7, this.mLastMeasureWidth, this.mLastMeasureHeight, i4, max);
    }

    public void setConstraintSet(C16934c cVar) {
        this.mConstraintSet = cVar;
    }

    public void setDesignInformation(int i, Object obj, Object obj2) {
        if (i == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.mDesignIds == null) {
                this.mDesignIds = new HashMap<>();
            }
            String str = (String) obj;
            int indexOf = str.indexOf("/");
            if (indexOf != -1) {
                str = str.substring(indexOf + 1);
            }
            this.mDesignIds.put(str, Integer.valueOf(((Integer) obj2).intValue()));
        }
    }

    public void setId(int i) {
        this.mChildrenByIds.remove(getId());
        super.setId(i);
        this.mChildrenByIds.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i != this.mMaxHeight) {
            this.mMaxHeight = i;
            requestLayout();
        }
    }

    public void setMaxWidth(int i) {
        if (i != this.mMaxWidth) {
            this.mMaxWidth = i;
            requestLayout();
        }
    }

    public void setMinHeight(int i) {
        if (i != this.mMinHeight) {
            this.mMinHeight = i;
            requestLayout();
        }
    }

    public void setMinWidth(int i) {
        if (i != this.mMinWidth) {
            this.mMinWidth = i;
            requestLayout();
        }
    }

    public void setOnConstraintsChanged(C16943d dVar) {
        this.mConstraintsChangedListener = dVar;
        C16930a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.mo50754d(dVar);
        }
    }

    public void setOptimizationLevel(int i) {
        this.mOptimizationLevel = i;
        this.mLayoutWidget.mo49737V2(i);
    }

    public void setSelfDimensionBehaviour(C16798d dVar, int i, int i2, int i3, int i4) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        C16928c cVar = this.mMeasurer;
        int i5 = cVar.f44364e;
        int i6 = cVar.f44363d;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.FIXED;
        int childCount = getChildCount();
        if (i != Integer.MIN_VALUE) {
            if (i == 0) {
                dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i2 = Math.max(0, this.mMinWidth);
                }
            } else if (i != 1073741824) {
                dimensionBehaviour = dimensionBehaviour2;
            } else {
                i2 = Math.min(this.mMaxWidth - i6, i2);
                dimensionBehaviour = dimensionBehaviour2;
            }
            i2 = 0;
        } else {
            dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i2 = Math.max(0, this.mMinWidth);
            }
        }
        if (i3 != Integer.MIN_VALUE) {
            if (i3 == 0) {
                dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (childCount == 0) {
                    i4 = Math.max(0, this.mMinHeight);
                }
            } else if (i3 == 1073741824) {
                i4 = Math.min(this.mMaxHeight - i5, i4);
            }
            i4 = 0;
        } else {
            dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (childCount == 0) {
                i4 = Math.max(0, this.mMinHeight);
            }
        }
        if (!(i2 == dVar.mo49569m0() && i4 == dVar.mo49456D())) {
            dVar.mo49729M2();
        }
        dVar.mo49545f2(0);
        dVar.mo49549g2(0);
        dVar.mo49485M1(this.mMaxWidth - i6);
        dVar.mo49482L1(this.mMaxHeight - i5);
        dVar.mo49494P1(0);
        dVar.mo49491O1(0);
        dVar.mo49458D1(dimensionBehaviour);
        dVar.mo49533c2(i2);
        dVar.mo49521Y1(dimensionBehaviour2);
        dVar.mo49607y1(i4);
        dVar.mo49494P1(this.mMinWidth - i6);
        dVar.mo49491O1(this.mMinHeight - i5);
    }

    public void setState(int i, int i2, int i3) {
        C16930a aVar = this.mConstraintLayoutSpec;
        if (aVar != null) {
            aVar.mo50755e(i, (float) i2, (float) i3);
        }
    }

    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public final boolean mo50701t() {
        int childCount = getChildCount();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= childCount) {
                break;
            } else if (getChildAt(i).isLayoutRequested()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            mo50686l();
        }
        return z;
    }

    public C16926b generateDefaultLayoutParams() {
        return new C16926b(-2, -2);
    }

    public C16926b generateLayoutParams(AttributeSet attributeSet) {
        return new C16926b(getContext(), attributeSet);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C16926b(layoutParams);
    }

    public ConstraintLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        mo50684j(attributeSet, 0, 0);
    }

    public ConstraintLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo50684j(attributeSet, i, 0);
    }

    @TargetApi(21)
    public ConstraintLayout(@C0359n0 Context context, @C0363p0 AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo50684j(attributeSet, i, i2);
    }

    /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b */
    public static class C16926b extends ViewGroup.MarginLayoutParams {

        /* renamed from: A0 */
        public static final int f44200A0 = Integer.MIN_VALUE;

        /* renamed from: B0 */
        public static final int f44201B0 = 0;

        /* renamed from: C0 */
        public static final int f44202C0 = 1;

        /* renamed from: D0 */
        public static final int f44203D0 = 1;

        /* renamed from: E0 */
        public static final int f44204E0 = 2;

        /* renamed from: F0 */
        public static final int f44205F0 = 3;

        /* renamed from: G0 */
        public static final int f44206G0 = 4;

        /* renamed from: H0 */
        public static final int f44207H0 = 5;

        /* renamed from: I0 */
        public static final int f44208I0 = 6;

        /* renamed from: J0 */
        public static final int f44209J0 = 7;

        /* renamed from: K0 */
        public static final int f44210K0 = 8;

        /* renamed from: L0 */
        public static final int f44211L0 = 1;

        /* renamed from: M0 */
        public static final int f44212M0 = 0;

        /* renamed from: N0 */
        public static final int f44213N0 = 2;

        /* renamed from: O0 */
        public static final int f44214O0 = 0;

        /* renamed from: P0 */
        public static final int f44215P0 = 1;

        /* renamed from: Q0 */
        public static final int f44216Q0 = 2;

        /* renamed from: R0 */
        public static final int f44217R0 = 0;

        /* renamed from: S0 */
        public static final int f44218S0 = 1;

        /* renamed from: T0 */
        public static final int f44219T0 = 2;

        /* renamed from: U0 */
        public static final int f44220U0 = 3;

        /* renamed from: x0 */
        public static final int f44221x0 = 0;

        /* renamed from: y0 */
        public static final int f44222y0 = 0;

        /* renamed from: z0 */
        public static final int f44223z0 = -1;

        /* renamed from: A */
        public int f44224A = Integer.MIN_VALUE;

        /* renamed from: B */
        public int f44225B = Integer.MIN_VALUE;

        /* renamed from: C */
        public int f44226C = Integer.MIN_VALUE;

        /* renamed from: D */
        public int f44227D = 0;

        /* renamed from: E */
        public boolean f44228E = true;

        /* renamed from: F */
        public boolean f44229F = true;

        /* renamed from: G */
        public float f44230G = 0.5f;

        /* renamed from: H */
        public float f44231H = 0.5f;

        /* renamed from: I */
        public String f44232I = null;

        /* renamed from: J */
        public float f44233J = 0.0f;

        /* renamed from: K */
        public int f44234K = 1;

        /* renamed from: L */
        public float f44235L = -1.0f;

        /* renamed from: M */
        public float f44236M = -1.0f;

        /* renamed from: N */
        public int f44237N = 0;

        /* renamed from: O */
        public int f44238O = 0;

        /* renamed from: P */
        public int f44239P = 0;

        /* renamed from: Q */
        public int f44240Q = 0;

        /* renamed from: R */
        public int f44241R = 0;

        /* renamed from: S */
        public int f44242S = 0;

        /* renamed from: T */
        public int f44243T = 0;

        /* renamed from: U */
        public int f44244U = 0;

        /* renamed from: V */
        public float f44245V = 1.0f;

        /* renamed from: W */
        public float f44246W = 1.0f;

        /* renamed from: X */
        public int f44247X = -1;

        /* renamed from: Y */
        public int f44248Y = -1;

        /* renamed from: Z */
        public int f44249Z = -1;

        /* renamed from: a */
        public int f44250a = -1;

        /* renamed from: a0 */
        public boolean f44251a0 = false;

        /* renamed from: b */
        public int f44252b = -1;

        /* renamed from: b0 */
        public boolean f44253b0 = false;

        /* renamed from: c */
        public float f44254c = -1.0f;

        /* renamed from: c0 */
        public String f44255c0 = null;

        /* renamed from: d */
        public boolean f44256d = true;

        /* renamed from: d0 */
        public int f44257d0 = 0;

        /* renamed from: e */
        public int f44258e = -1;

        /* renamed from: e0 */
        public boolean f44259e0 = true;

        /* renamed from: f */
        public int f44260f = -1;

        /* renamed from: f0 */
        public boolean f44261f0 = true;

        /* renamed from: g */
        public int f44262g = -1;

        /* renamed from: g0 */
        public boolean f44263g0 = false;

        /* renamed from: h */
        public int f44264h = -1;

        /* renamed from: h0 */
        public boolean f44265h0 = false;

        /* renamed from: i */
        public int f44266i = -1;

        /* renamed from: i0 */
        public boolean f44267i0 = false;

        /* renamed from: j */
        public int f44268j = -1;

        /* renamed from: j0 */
        public boolean f44269j0 = false;

        /* renamed from: k */
        public int f44270k = -1;

        /* renamed from: k0 */
        public boolean f44271k0 = false;

        /* renamed from: l */
        public int f44272l = -1;

        /* renamed from: l0 */
        public int f44273l0 = -1;

        /* renamed from: m */
        public int f44274m = -1;

        /* renamed from: m0 */
        public int f44275m0 = -1;

        /* renamed from: n */
        public int f44276n = -1;

        /* renamed from: n0 */
        public int f44277n0 = -1;

        /* renamed from: o */
        public int f44278o = -1;

        /* renamed from: o0 */
        public int f44279o0 = -1;

        /* renamed from: p */
        public int f44280p = -1;

        /* renamed from: p0 */
        public int f44281p0 = Integer.MIN_VALUE;

        /* renamed from: q */
        public int f44282q = 0;

        /* renamed from: q0 */
        public int f44283q0 = Integer.MIN_VALUE;

        /* renamed from: r */
        public float f44284r = 0.0f;

        /* renamed from: r0 */
        public float f44285r0 = 0.5f;

        /* renamed from: s */
        public int f44286s = -1;

        /* renamed from: s0 */
        public int f44287s0;

        /* renamed from: t */
        public int f44288t = -1;

        /* renamed from: t0 */
        public int f44289t0;

        /* renamed from: u */
        public int f44290u = -1;

        /* renamed from: u0 */
        public float f44291u0;

        /* renamed from: v */
        public int f44292v = -1;

        /* renamed from: v0 */
        public ConstraintWidget f44293v0 = new ConstraintWidget();

        /* renamed from: w */
        public int f44294w = Integer.MIN_VALUE;

        /* renamed from: w0 */
        public boolean f44295w0 = false;

        /* renamed from: x */
        public int f44296x = Integer.MIN_VALUE;

        /* renamed from: y */
        public int f44297y = Integer.MIN_VALUE;

        /* renamed from: z */
        public int f44298z = Integer.MIN_VALUE;

        /* renamed from: androidx.constraintlayout.widget.ConstraintLayout$b$a */
        public static class C16927a {

            /* renamed from: A */
            public static final int f44299A = 26;

            /* renamed from: B */
            public static final int f44300B = 27;

            /* renamed from: C */
            public static final int f44301C = 28;

            /* renamed from: D */
            public static final int f44302D = 29;

            /* renamed from: E */
            public static final int f44303E = 30;

            /* renamed from: F */
            public static final int f44304F = 31;

            /* renamed from: G */
            public static final int f44305G = 32;

            /* renamed from: H */
            public static final int f44306H = 33;

            /* renamed from: I */
            public static final int f44307I = 34;

            /* renamed from: J */
            public static final int f44308J = 35;

            /* renamed from: K */
            public static final int f44309K = 36;

            /* renamed from: L */
            public static final int f44310L = 37;

            /* renamed from: M */
            public static final int f44311M = 38;

            /* renamed from: N */
            public static final int f44312N = 39;

            /* renamed from: O */
            public static final int f44313O = 40;

            /* renamed from: P */
            public static final int f44314P = 41;

            /* renamed from: Q */
            public static final int f44315Q = 42;

            /* renamed from: R */
            public static final int f44316R = 43;

            /* renamed from: S */
            public static final int f44317S = 44;

            /* renamed from: T */
            public static final int f44318T = 45;

            /* renamed from: U */
            public static final int f44319U = 46;

            /* renamed from: V */
            public static final int f44320V = 47;

            /* renamed from: W */
            public static final int f44321W = 48;

            /* renamed from: X */
            public static final int f44322X = 49;

            /* renamed from: Y */
            public static final int f44323Y = 50;

            /* renamed from: Z */
            public static final int f44324Z = 51;

            /* renamed from: a */
            public static final int f44325a = 0;

            /* renamed from: a0 */
            public static final int f44326a0 = 52;

            /* renamed from: b */
            public static final int f44327b = 1;

            /* renamed from: b0 */
            public static final int f44328b0 = 53;

            /* renamed from: c */
            public static final int f44329c = 2;

            /* renamed from: c0 */
            public static final int f44330c0 = 54;

            /* renamed from: d */
            public static final int f44331d = 3;

            /* renamed from: d0 */
            public static final int f44332d0 = 55;

            /* renamed from: e */
            public static final int f44333e = 4;

            /* renamed from: e0 */
            public static final int f44334e0 = 64;

            /* renamed from: f */
            public static final int f44335f = 5;

            /* renamed from: f0 */
            public static final int f44336f0 = 65;

            /* renamed from: g */
            public static final int f44337g = 6;

            /* renamed from: g0 */
            public static final int f44338g0 = 66;

            /* renamed from: h */
            public static final int f44339h = 7;

            /* renamed from: h0 */
            public static final int f44340h0 = 67;

            /* renamed from: i */
            public static final int f44341i = 8;

            /* renamed from: i0 */
            public static final SparseIntArray f44342i0;

            /* renamed from: j */
            public static final int f44343j = 9;

            /* renamed from: k */
            public static final int f44344k = 10;

            /* renamed from: l */
            public static final int f44345l = 11;

            /* renamed from: m */
            public static final int f44346m = 12;

            /* renamed from: n */
            public static final int f44347n = 13;

            /* renamed from: o */
            public static final int f44348o = 14;

            /* renamed from: p */
            public static final int f44349p = 15;

            /* renamed from: q */
            public static final int f44350q = 16;

            /* renamed from: r */
            public static final int f44351r = 17;

            /* renamed from: s */
            public static final int f44352s = 18;

            /* renamed from: t */
            public static final int f44353t = 19;

            /* renamed from: u */
            public static final int f44354u = 20;

            /* renamed from: v */
            public static final int f44355v = 21;

            /* renamed from: w */
            public static final int f44356w = 22;

            /* renamed from: x */
            public static final int f44357x = 23;

            /* renamed from: y */
            public static final int f44358y = 24;

            /* renamed from: z */
            public static final int f44359z = 25;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f44342i0 = sparseIntArray;
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintWidth, 64);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintHeight, 65);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintLeft_toLeftOf, 8);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintLeft_toRightOf, 9);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintRight_toLeftOf, 10);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintRight_toRightOf, 11);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintTop_toTopOf, 12);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintTop_toBottomOf, 13);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintBottom_toTopOf, 14);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintBottom_toBottomOf, 15);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintBaseline_toBaselineOf, 16);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintBaseline_toTopOf, 52);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintBaseline_toBottomOf, 53);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintCircle, 2);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintCircleRadius, 3);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintCircleAngle, 4);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_editor_absoluteX, 49);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_editor_absoluteY, 50);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintGuide_begin, 5);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintGuide_end, 6);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintGuide_percent, 7);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_guidelineUseRtl, 67);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_android_orientation, 1);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintStart_toEndOf, 17);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintStart_toStartOf, 18);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintEnd_toStartOf, 19);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintEnd_toEndOf, 20);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_goneMarginLeft, 21);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_goneMarginTop, 22);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_goneMarginRight, 23);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_goneMarginBottom, 24);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_goneMarginStart, 25);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_goneMarginEnd, 26);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_goneMarginBaseline, 55);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_marginBaseline, 54);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintHorizontal_bias, 29);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintVertical_bias, 30);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintDimensionRatio, 44);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintHorizontal_weight, 45);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintVertical_weight, 46);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintHorizontal_chainStyle, 47);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintVertical_chainStyle, 48);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constrainedWidth, 27);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constrainedHeight, 28);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintWidth_default, 31);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintHeight_default, 32);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintWidth_min, 33);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintWidth_max, 34);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintWidth_percent, 35);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintHeight_min, 36);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintHeight_max, 37);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintHeight_percent, 38);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintLeft_creator, 39);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintTop_creator, 40);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintRight_creator, 41);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintBottom_creator, 42);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintBaseline_creator, 43);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_constraintTag, 51);
                sparseIntArray.append(C16944e.C16957m.ConstraintLayout_Layout_layout_wrapBehaviorInParent, 66);
            }
        }

        public C16926b(C16926b bVar) {
            super(bVar);
            this.f44250a = bVar.f44250a;
            this.f44252b = bVar.f44252b;
            this.f44254c = bVar.f44254c;
            this.f44256d = bVar.f44256d;
            this.f44258e = bVar.f44258e;
            this.f44260f = bVar.f44260f;
            this.f44262g = bVar.f44262g;
            this.f44264h = bVar.f44264h;
            this.f44266i = bVar.f44266i;
            this.f44268j = bVar.f44268j;
            this.f44270k = bVar.f44270k;
            this.f44272l = bVar.f44272l;
            this.f44274m = bVar.f44274m;
            this.f44276n = bVar.f44276n;
            this.f44278o = bVar.f44278o;
            this.f44280p = bVar.f44280p;
            this.f44282q = bVar.f44282q;
            this.f44284r = bVar.f44284r;
            this.f44286s = bVar.f44286s;
            this.f44288t = bVar.f44288t;
            this.f44290u = bVar.f44290u;
            this.f44292v = bVar.f44292v;
            this.f44294w = bVar.f44294w;
            this.f44296x = bVar.f44296x;
            this.f44297y = bVar.f44297y;
            this.f44298z = bVar.f44298z;
            this.f44224A = bVar.f44224A;
            this.f44225B = bVar.f44225B;
            this.f44226C = bVar.f44226C;
            this.f44227D = bVar.f44227D;
            this.f44230G = bVar.f44230G;
            this.f44231H = bVar.f44231H;
            this.f44232I = bVar.f44232I;
            this.f44233J = bVar.f44233J;
            this.f44234K = bVar.f44234K;
            this.f44235L = bVar.f44235L;
            this.f44236M = bVar.f44236M;
            this.f44237N = bVar.f44237N;
            this.f44238O = bVar.f44238O;
            this.f44251a0 = bVar.f44251a0;
            this.f44253b0 = bVar.f44253b0;
            this.f44239P = bVar.f44239P;
            this.f44240Q = bVar.f44240Q;
            this.f44241R = bVar.f44241R;
            this.f44243T = bVar.f44243T;
            this.f44242S = bVar.f44242S;
            this.f44244U = bVar.f44244U;
            this.f44245V = bVar.f44245V;
            this.f44246W = bVar.f44246W;
            this.f44247X = bVar.f44247X;
            this.f44248Y = bVar.f44248Y;
            this.f44249Z = bVar.f44249Z;
            this.f44259e0 = bVar.f44259e0;
            this.f44261f0 = bVar.f44261f0;
            this.f44263g0 = bVar.f44263g0;
            this.f44265h0 = bVar.f44265h0;
            this.f44273l0 = bVar.f44273l0;
            this.f44275m0 = bVar.f44275m0;
            this.f44277n0 = bVar.f44277n0;
            this.f44279o0 = bVar.f44279o0;
            this.f44281p0 = bVar.f44281p0;
            this.f44283q0 = bVar.f44283q0;
            this.f44285r0 = bVar.f44285r0;
            this.f44255c0 = bVar.f44255c0;
            this.f44257d0 = bVar.f44257d0;
            this.f44293v0 = bVar.f44293v0;
            this.f44228E = bVar.f44228E;
            this.f44229F = bVar.f44229F;
        }

        /* renamed from: a */
        public String mo50702a() {
            return this.f44255c0;
        }

        /* renamed from: b */
        public ConstraintWidget mo50703b() {
            return this.f44293v0;
        }

        /* renamed from: c */
        public void mo50704c() {
            ConstraintWidget constraintWidget = this.f44293v0;
            if (constraintWidget != null) {
                constraintWidget.mo49499R0();
            }
        }

        /* renamed from: d */
        public void mo50705d(String str) {
            this.f44293v0.mo49560j1(str);
        }

        /* renamed from: e */
        public void mo50706e() {
            this.f44265h0 = false;
            this.f44259e0 = true;
            this.f44261f0 = true;
            int i = this.width;
            if (i == -2 && this.f44251a0) {
                this.f44259e0 = false;
                if (this.f44239P == 0) {
                    this.f44239P = 1;
                }
            }
            int i2 = this.height;
            if (i2 == -2 && this.f44253b0) {
                this.f44261f0 = false;
                if (this.f44240Q == 0) {
                    this.f44240Q = 1;
                }
            }
            if (i == 0 || i == -1) {
                this.f44259e0 = false;
                if (i == 0 && this.f44239P == 1) {
                    this.width = -2;
                    this.f44251a0 = true;
                }
            }
            if (i2 == 0 || i2 == -1) {
                this.f44261f0 = false;
                if (i2 == 0 && this.f44240Q == 1) {
                    this.height = -2;
                    this.f44253b0 = true;
                }
            }
            if (this.f44254c != -1.0f || this.f44250a != -1 || this.f44252b != -1) {
                this.f44265h0 = true;
                this.f44259e0 = true;
                this.f44261f0 = true;
                if (!(this.f44293v0 instanceof C16801f)) {
                    this.f44293v0 = new C16801f();
                }
                ((C16801f) this.f44293v0).mo49792B2(this.f44249Z);
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x005e  */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x0064  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x007a  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x0082  */
        @android.annotation.TargetApi(17)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void resolveLayoutDirection(int r11) {
            /*
                r10 = this;
                int r0 = r10.leftMargin
                int r1 = r10.rightMargin
                super.resolveLayoutDirection(r11)
                int r11 = r10.getLayoutDirection()
                r2 = 0
                r3 = 1
                if (r3 != r11) goto L_0x0011
                r11 = r3
                goto L_0x0012
            L_0x0011:
                r11 = r2
            L_0x0012:
                r4 = -1
                r10.f44277n0 = r4
                r10.f44279o0 = r4
                r10.f44273l0 = r4
                r10.f44275m0 = r4
                int r5 = r10.f44294w
                r10.f44281p0 = r5
                int r5 = r10.f44297y
                r10.f44283q0 = r5
                float r5 = r10.f44230G
                r10.f44285r0 = r5
                int r6 = r10.f44250a
                r10.f44287s0 = r6
                int r7 = r10.f44252b
                r10.f44289t0 = r7
                float r8 = r10.f44254c
                r10.f44291u0 = r8
                r9 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r11 == 0) goto L_0x0094
                int r11 = r10.f44286s
                if (r11 == r4) goto L_0x003f
                r10.f44277n0 = r11
            L_0x003d:
                r2 = r3
                goto L_0x0046
            L_0x003f:
                int r11 = r10.f44288t
                if (r11 == r4) goto L_0x0046
                r10.f44279o0 = r11
                goto L_0x003d
            L_0x0046:
                int r11 = r10.f44290u
                if (r11 == r4) goto L_0x004d
                r10.f44275m0 = r11
                r2 = r3
            L_0x004d:
                int r11 = r10.f44292v
                if (r11 == r4) goto L_0x0054
                r10.f44273l0 = r11
                r2 = r3
            L_0x0054:
                int r11 = r10.f44224A
                if (r11 == r9) goto L_0x005a
                r10.f44283q0 = r11
            L_0x005a:
                int r11 = r10.f44225B
                if (r11 == r9) goto L_0x0060
                r10.f44281p0 = r11
            L_0x0060:
                r11 = 1065353216(0x3f800000, float:1.0)
                if (r2 == 0) goto L_0x0068
                float r2 = r11 - r5
                r10.f44285r0 = r2
            L_0x0068:
                boolean r2 = r10.f44265h0
                if (r2 == 0) goto L_0x00b8
                int r2 = r10.f44249Z
                if (r2 != r3) goto L_0x00b8
                boolean r2 = r10.f44256d
                if (r2 == 0) goto L_0x00b8
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r3 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
                if (r3 == 0) goto L_0x0082
                float r11 = r11 - r8
                r10.f44291u0 = r11
                r10.f44287s0 = r4
                r10.f44289t0 = r4
                goto L_0x00b8
            L_0x0082:
                if (r6 == r4) goto L_0x008b
                r10.f44289t0 = r6
                r10.f44287s0 = r4
                r10.f44291u0 = r2
                goto L_0x00b8
            L_0x008b:
                if (r7 == r4) goto L_0x00b8
                r10.f44287s0 = r7
                r10.f44289t0 = r4
                r10.f44291u0 = r2
                goto L_0x00b8
            L_0x0094:
                int r11 = r10.f44286s
                if (r11 == r4) goto L_0x009a
                r10.f44275m0 = r11
            L_0x009a:
                int r11 = r10.f44288t
                if (r11 == r4) goto L_0x00a0
                r10.f44273l0 = r11
            L_0x00a0:
                int r11 = r10.f44290u
                if (r11 == r4) goto L_0x00a6
                r10.f44277n0 = r11
            L_0x00a6:
                int r11 = r10.f44292v
                if (r11 == r4) goto L_0x00ac
                r10.f44279o0 = r11
            L_0x00ac:
                int r11 = r10.f44224A
                if (r11 == r9) goto L_0x00b2
                r10.f44281p0 = r11
            L_0x00b2:
                int r11 = r10.f44225B
                if (r11 == r9) goto L_0x00b8
                r10.f44283q0 = r11
            L_0x00b8:
                int r11 = r10.f44290u
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f44292v
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f44288t
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f44286s
                if (r11 != r4) goto L_0x0102
                int r11 = r10.f44262g
                if (r11 == r4) goto L_0x00d7
                r10.f44277n0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
                goto L_0x00e5
            L_0x00d7:
                int r11 = r10.f44264h
                if (r11 == r4) goto L_0x00e5
                r10.f44279o0 = r11
                int r11 = r10.rightMargin
                if (r11 > 0) goto L_0x00e5
                if (r1 <= 0) goto L_0x00e5
                r10.rightMargin = r1
            L_0x00e5:
                int r11 = r10.f44258e
                if (r11 == r4) goto L_0x00f4
                r10.f44273l0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
                goto L_0x0102
            L_0x00f4:
                int r11 = r10.f44260f
                if (r11 == r4) goto L_0x0102
                r10.f44275m0 = r11
                int r11 = r10.leftMargin
                if (r11 > 0) goto L_0x0102
                if (r0 <= 0) goto L_0x0102
                r10.leftMargin = r0
            L_0x0102:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.C16926b.resolveLayoutDirection(int):void");
        }

        public C16926b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C16944e.C16957m.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                int i2 = C16927a.f44342i0.get(index);
                switch (i2) {
                    case 1:
                        this.f44249Z = obtainStyledAttributes.getInt(index, this.f44249Z);
                        break;
                    case 2:
                        int resourceId = obtainStyledAttributes.getResourceId(index, this.f44280p);
                        this.f44280p = resourceId;
                        if (resourceId != -1) {
                            break;
                        } else {
                            this.f44280p = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 3:
                        this.f44282q = obtainStyledAttributes.getDimensionPixelSize(index, this.f44282q);
                        break;
                    case 4:
                        float f = obtainStyledAttributes.getFloat(index, this.f44284r) % 360.0f;
                        this.f44284r = f;
                        if (f >= 0.0f) {
                            break;
                        } else {
                            this.f44284r = (360.0f - f) % 360.0f;
                            break;
                        }
                    case 5:
                        this.f44250a = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44250a);
                        break;
                    case 6:
                        this.f44252b = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44252b);
                        break;
                    case 7:
                        this.f44254c = obtainStyledAttributes.getFloat(index, this.f44254c);
                        break;
                    case 8:
                        int resourceId2 = obtainStyledAttributes.getResourceId(index, this.f44258e);
                        this.f44258e = resourceId2;
                        if (resourceId2 != -1) {
                            break;
                        } else {
                            this.f44258e = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 9:
                        int resourceId3 = obtainStyledAttributes.getResourceId(index, this.f44260f);
                        this.f44260f = resourceId3;
                        if (resourceId3 != -1) {
                            break;
                        } else {
                            this.f44260f = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 10:
                        int resourceId4 = obtainStyledAttributes.getResourceId(index, this.f44262g);
                        this.f44262g = resourceId4;
                        if (resourceId4 != -1) {
                            break;
                        } else {
                            this.f44262g = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 11:
                        int resourceId5 = obtainStyledAttributes.getResourceId(index, this.f44264h);
                        this.f44264h = resourceId5;
                        if (resourceId5 != -1) {
                            break;
                        } else {
                            this.f44264h = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 12:
                        int resourceId6 = obtainStyledAttributes.getResourceId(index, this.f44266i);
                        this.f44266i = resourceId6;
                        if (resourceId6 != -1) {
                            break;
                        } else {
                            this.f44266i = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 13:
                        int resourceId7 = obtainStyledAttributes.getResourceId(index, this.f44268j);
                        this.f44268j = resourceId7;
                        if (resourceId7 != -1) {
                            break;
                        } else {
                            this.f44268j = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 14:
                        int resourceId8 = obtainStyledAttributes.getResourceId(index, this.f44270k);
                        this.f44270k = resourceId8;
                        if (resourceId8 != -1) {
                            break;
                        } else {
                            this.f44270k = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 15:
                        int resourceId9 = obtainStyledAttributes.getResourceId(index, this.f44272l);
                        this.f44272l = resourceId9;
                        if (resourceId9 != -1) {
                            break;
                        } else {
                            this.f44272l = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 16:
                        int resourceId10 = obtainStyledAttributes.getResourceId(index, this.f44274m);
                        this.f44274m = resourceId10;
                        if (resourceId10 != -1) {
                            break;
                        } else {
                            this.f44274m = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 17:
                        int resourceId11 = obtainStyledAttributes.getResourceId(index, this.f44286s);
                        this.f44286s = resourceId11;
                        if (resourceId11 != -1) {
                            break;
                        } else {
                            this.f44286s = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 18:
                        int resourceId12 = obtainStyledAttributes.getResourceId(index, this.f44288t);
                        this.f44288t = resourceId12;
                        if (resourceId12 != -1) {
                            break;
                        } else {
                            this.f44288t = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 19:
                        int resourceId13 = obtainStyledAttributes.getResourceId(index, this.f44290u);
                        this.f44290u = resourceId13;
                        if (resourceId13 != -1) {
                            break;
                        } else {
                            this.f44290u = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 20:
                        int resourceId14 = obtainStyledAttributes.getResourceId(index, this.f44292v);
                        this.f44292v = resourceId14;
                        if (resourceId14 != -1) {
                            break;
                        } else {
                            this.f44292v = obtainStyledAttributes.getInt(index, -1);
                            break;
                        }
                    case 21:
                        this.f44294w = obtainStyledAttributes.getDimensionPixelSize(index, this.f44294w);
                        break;
                    case 22:
                        this.f44296x = obtainStyledAttributes.getDimensionPixelSize(index, this.f44296x);
                        break;
                    case 23:
                        this.f44297y = obtainStyledAttributes.getDimensionPixelSize(index, this.f44297y);
                        break;
                    case 24:
                        this.f44298z = obtainStyledAttributes.getDimensionPixelSize(index, this.f44298z);
                        break;
                    case 25:
                        this.f44224A = obtainStyledAttributes.getDimensionPixelSize(index, this.f44224A);
                        break;
                    case 26:
                        this.f44225B = obtainStyledAttributes.getDimensionPixelSize(index, this.f44225B);
                        break;
                    case 27:
                        this.f44251a0 = obtainStyledAttributes.getBoolean(index, this.f44251a0);
                        break;
                    case 28:
                        this.f44253b0 = obtainStyledAttributes.getBoolean(index, this.f44253b0);
                        break;
                    case 29:
                        this.f44230G = obtainStyledAttributes.getFloat(index, this.f44230G);
                        break;
                    case 30:
                        this.f44231H = obtainStyledAttributes.getFloat(index, this.f44231H);
                        break;
                    case 31:
                        this.f44239P = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 32:
                        this.f44240Q = obtainStyledAttributes.getInt(index, 0);
                        break;
                    case 33:
                        try {
                            this.f44241R = obtainStyledAttributes.getDimensionPixelSize(index, this.f44241R);
                            break;
                        } catch (Exception unused) {
                            if (obtainStyledAttributes.getInt(index, this.f44241R) != -2) {
                                break;
                            } else {
                                this.f44241R = -2;
                                break;
                            }
                        }
                    case 34:
                        try {
                            this.f44243T = obtainStyledAttributes.getDimensionPixelSize(index, this.f44243T);
                            break;
                        } catch (Exception unused2) {
                            if (obtainStyledAttributes.getInt(index, this.f44243T) != -2) {
                                break;
                            } else {
                                this.f44243T = -2;
                                break;
                            }
                        }
                    case 35:
                        this.f44245V = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f44245V));
                        this.f44239P = 2;
                        break;
                    case 36:
                        try {
                            this.f44242S = obtainStyledAttributes.getDimensionPixelSize(index, this.f44242S);
                            break;
                        } catch (Exception unused3) {
                            if (obtainStyledAttributes.getInt(index, this.f44242S) != -2) {
                                break;
                            } else {
                                this.f44242S = -2;
                                break;
                            }
                        }
                    case 37:
                        try {
                            this.f44244U = obtainStyledAttributes.getDimensionPixelSize(index, this.f44244U);
                            break;
                        } catch (Exception unused4) {
                            if (obtainStyledAttributes.getInt(index, this.f44244U) != -2) {
                                break;
                            } else {
                                this.f44244U = -2;
                                break;
                            }
                        }
                    case 38:
                        this.f44246W = Math.max(0.0f, obtainStyledAttributes.getFloat(index, this.f44246W));
                        this.f44240Q = 2;
                        break;
                    default:
                        switch (i2) {
                            case 44:
                                C16934c.m78342C0(this, obtainStyledAttributes.getString(index));
                                break;
                            case 45:
                                this.f44235L = obtainStyledAttributes.getFloat(index, this.f44235L);
                                break;
                            case 46:
                                this.f44236M = obtainStyledAttributes.getFloat(index, this.f44236M);
                                break;
                            case 47:
                                this.f44237N = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f44238O = obtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f44247X = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44247X);
                                break;
                            case 50:
                                this.f44248Y = obtainStyledAttributes.getDimensionPixelOffset(index, this.f44248Y);
                                break;
                            case 51:
                                this.f44255c0 = obtainStyledAttributes.getString(index);
                                break;
                            case 52:
                                int resourceId15 = obtainStyledAttributes.getResourceId(index, this.f44276n);
                                this.f44276n = resourceId15;
                                if (resourceId15 != -1) {
                                    break;
                                } else {
                                    this.f44276n = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 53:
                                int resourceId16 = obtainStyledAttributes.getResourceId(index, this.f44278o);
                                this.f44278o = resourceId16;
                                if (resourceId16 != -1) {
                                    break;
                                } else {
                                    this.f44278o = obtainStyledAttributes.getInt(index, -1);
                                    break;
                                }
                            case 54:
                                this.f44227D = obtainStyledAttributes.getDimensionPixelSize(index, this.f44227D);
                                break;
                            case 55:
                                this.f44226C = obtainStyledAttributes.getDimensionPixelSize(index, this.f44226C);
                                break;
                            default:
                                switch (i2) {
                                    case 64:
                                        C16934c.m78340A0(this, obtainStyledAttributes, index, 0);
                                        this.f44228E = true;
                                        break;
                                    case 65:
                                        C16934c.m78340A0(this, obtainStyledAttributes, index, 1);
                                        this.f44229F = true;
                                        break;
                                    case 66:
                                        this.f44257d0 = obtainStyledAttributes.getInt(index, this.f44257d0);
                                        break;
                                    case 67:
                                        this.f44256d = obtainStyledAttributes.getBoolean(index, this.f44256d);
                                        break;
                                }
                        }
                }
            }
            obtainStyledAttributes.recycle();
            mo50706e();
        }

        public C16926b(int i, int i2) {
            super(i, i2);
        }

        public C16926b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
