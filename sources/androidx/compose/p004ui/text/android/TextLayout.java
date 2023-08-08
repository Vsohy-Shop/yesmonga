package androidx.compose.p004ui.text.android;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Trace;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.annotation.C0372t0;
import androidx.compose.p004ui.text.android.style.C16115a;
import androidx.compose.p004ui.text.android.style.C16118d;
import androidx.compose.p004ui.text.android.style.C16123h;
import androidx.compose.runtime.internal.C8567o;
import kotlin.C10864b0;
import kotlin.C11677z;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C16085k
@C8567o(parameters = 0)
@C11363r0({"SMAP\nTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.kt\nandroidx/compose/ui/text/android/TextLayout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1035:1\n1#2:1036\n*E\n"})
/* renamed from: androidx.compose.ui.text.android.TextLayout */
public final class TextLayout {
    @C12579k

    /* renamed from: q */
    public static final C16052a f39928q = new C16052a((DefaultConstructorMarker) null);

    /* renamed from: r */
    public static final int f39929r = 8;

    /* renamed from: a */
    public final boolean f39930a;

    /* renamed from: b */
    public final boolean f39931b;
    @C12579k

    /* renamed from: c */
    public final C16104p f39932c;

    /* renamed from: d */
    public final boolean f39933d;
    @C12579k

    /* renamed from: e */
    public final Layout f39934e;

    /* renamed from: f */
    public final int f39935f;

    /* renamed from: g */
    public final int f39936g;

    /* renamed from: h */
    public final int f39937h;

    /* renamed from: i */
    public final float f39938i;

    /* renamed from: j */
    public final float f39939j;

    /* renamed from: k */
    public final boolean f39940k;
    @C12580l

    /* renamed from: l */
    public final Paint.FontMetricsInt f39941l;

    /* renamed from: m */
    public final int f39942m;
    @C12579k

    /* renamed from: n */
    public final C16123h[] f39943n;
    @C12579k

    /* renamed from: o */
    public final Rect f39944o;
    @C12579k

    /* renamed from: p */
    public final C11677z f39945p;

    /* renamed from: androidx.compose.ui.text.android.TextLayout$a */
    public static final class C16052a {
        public /* synthetic */ C16052a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C0344h1
        @C12579k
        /* renamed from: a */
        public final StaticLayout mo46321a(@C12579k CharSequence charSequence, int i, @C12579k TextPaint textPaint, int i2, int i3, int i4, int i5) {
            TextPaint textPaint2 = textPaint;
            int i6 = i3;
            int i7 = i4;
            int i8 = i5;
            Intrinsics.checkNotNullParameter(charSequence, "charSequence");
            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
            return C16084j0.m72482b(C16084j0.f39976a, charSequence, 0, 0, textPaint2, i, (TextDirectionHeuristic) null, (Layout.Alignment) null, 0, (TextUtils.TruncateAt) null, 0, 0.0f, 0.0f, 0, false, false, i7, i6, i8, i2, (int[]) null, (int[]) null, 1605606, (Object) null);
        }

        public C16052a() {
        }
    }

    /* JADX INFO: finally extract failed */
    public TextLayout(@C12579k CharSequence charSequence, float f, @C12579k TextPaint textPaint, int i, @C12580l TextUtils.TruncateAt truncateAt, int i2, float f2, @C0372t0 float f3, boolean z, boolean z2, int i3, int i4, int i5, int i6, int i7, int i8, @C12580l int[] iArr, @C12580l int[] iArr2, @C12579k C16104p pVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        boolean z3;
        boolean z4;
        Layout layout;
        boolean z5;
        CharSequence charSequence2 = charSequence;
        float f4 = f;
        int i9 = i3;
        C16104p pVar2 = pVar;
        Intrinsics.checkNotNullParameter(charSequence2, "charSequence");
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        Intrinsics.checkNotNullParameter(pVar2, "layoutIntrinsics");
        this.f39930a = z;
        this.f39931b = z2;
        this.f39932c = pVar2;
        this.f39944o = new Rect();
        int length = charSequence.length();
        TextDirectionHeuristic i10 = C16082i1.m72473i(i2);
        Layout.Alignment a = C16105p0.f40063a.mo46526a(i);
        boolean z6 = (charSequence2 instanceof Spanned) && ((Spanned) charSequence2).nextSpanTransition(-1, length, C16115a.class) < length;
        Trace.beginSection("TextLayout:initLayout");
        try {
            BoringLayout.Metrics a2 = pVar.mo46523a();
            TextDirectionHeuristic textDirectionHeuristic2 = i10;
            double d = (double) f4;
            Layout.Alignment alignment = a;
            int ceil = (int) ((float) Math.ceil(d));
            if (a2 == null || pVar.mo46524b() > f4 || z6) {
                int i11 = ceil;
                z4 = true;
                TextDirectionHeuristic textDirectionHeuristic3 = textDirectionHeuristic2;
                this.f39940k = false;
                z3 = false;
                textDirectionHeuristic = textDirectionHeuristic3;
                layout = C16084j0.f39976a.mo46474a(charSequence, 0, charSequence.length(), textPaint, i11, textDirectionHeuristic3, alignment, i3, truncateAt, (int) ((float) Math.ceil(d)), f2, f3, i8, z, z2, i4, i5, i6, i7, iArr, iArr2);
            } else {
                this.f39940k = true;
                z4 = true;
                layout = C16074g.f39963a.mo46349a(charSequence, textPaint, ceil, a2, alignment, z, z2, truncateAt, ceil);
                z3 = false;
                textDirectionHeuristic = textDirectionHeuristic2;
            }
            this.f39934e = layout;
            Trace.endSection();
            int i12 = i3;
            int min = Math.min(layout.getLineCount(), i12);
            this.f39935f = min;
            if (min >= i12 && (layout.getEllipsisCount(min - 1) > 0 || layout.getLineEnd(min - 1) != charSequence.length())) {
                z5 = z4;
            } else {
                z5 = z3;
            }
            this.f39933d = z5;
            Pair e = C16082i1.m72474j(this);
            C16123h[] c = C16082i1.m72472h(this);
            this.f39943n = c;
            Pair b = C16082i1.m72471g(this, c);
            this.f39936g = Math.max(((Number) e.mo21849e()).intValue(), ((Number) b.mo21849e()).intValue());
            this.f39937h = Math.max(((Number) e.mo21851f()).intValue(), ((Number) b.mo21851f()).intValue());
            Pair a3 = C16082i1.m72470f(this, textPaint, textDirectionHeuristic, c);
            this.f39941l = (Paint.FontMetricsInt) a3.mo21849e();
            this.f39942m = ((Number) a3.mo21851f()).intValue();
            this.f39938i = C16118d.m72576b(layout, min - 1, (Paint) null, 2, (Object) null);
            this.f39939j = C16118d.m72578d(layout, min - 1, (Paint) null, 2, (Object) null);
            this.f39945p = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new TextLayout$layoutHelper$2(this));
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: J */
    public static /* synthetic */ float m72359J(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.mo46288I(i, z);
    }

    /* renamed from: L */
    public static /* synthetic */ float m72360L(TextLayout textLayout, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return textLayout.mo46289K(i, z);
    }

    @C0344h1
    /* renamed from: P */
    public static /* synthetic */ void m72361P() {
    }

    @C0344h1
    /* renamed from: c */
    public static /* synthetic */ void m72362c() {
    }

    @C0344h1
    /* renamed from: k */
    public static /* synthetic */ void m72363k() {
    }

    /* renamed from: A */
    public final int mo46280A(int i) {
        return this.f39934e.getLineStart(i);
    }

    /* renamed from: B */
    public final float mo46281B(int i) {
        int i2;
        float lineTop = (float) this.f39934e.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.f39936g;
        }
        return lineTop + ((float) i2);
    }

    /* renamed from: C */
    public final int mo46282C(int i) {
        if (this.f39934e.getEllipsisStart(i) == 0) {
            return this.f39934e.getLineVisibleEnd(i);
        }
        return this.f39934e.getEllipsisStart(i) + this.f39934e.getLineStart(i);
    }

    /* renamed from: D */
    public final float mo46283D(int i) {
        return this.f39934e.getLineWidth(i);
    }

    /* renamed from: E */
    public final float mo46284E() {
        return this.f39932c.mo46524b();
    }

    /* renamed from: F */
    public final float mo46285F() {
        return this.f39932c.mo46525c();
    }

    /* renamed from: G */
    public final int mo46286G(int i, float f) {
        return this.f39934e.getOffsetForHorizontal(i, f + (((float) -1) * mo46303h(i)));
    }

    /* renamed from: H */
    public final int mo46287H(int i) {
        return this.f39934e.getParagraphDirection(i);
    }

    /* renamed from: I */
    public final float mo46288I(int i, boolean z) {
        return mo46306l().mo46483c(i, true, z) + mo46303h(mo46316v(i));
    }

    /* renamed from: K */
    public final float mo46289K(int i, boolean z) {
        return mo46306l().mo46483c(i, false, z) + mo46303h(mo46316v(i));
    }

    /* renamed from: M */
    public final void mo46290M(int i, int i2, @C12579k Path path) {
        Intrinsics.checkNotNullParameter(path, "dest");
        this.f39934e.getSelectionPath(i, i2, path);
        if (this.f39936g != 0 && !path.isEmpty()) {
            path.offset(0.0f, (float) this.f39936g);
        }
    }

    @C12579k
    /* renamed from: N */
    public final CharSequence mo46291N() {
        CharSequence text = this.f39934e.getText();
        Intrinsics.checkNotNullExpressionValue(text, "layout.text");
        return text;
    }

    /* renamed from: O */
    public final int mo46292O() {
        return this.f39936g;
    }

    /* renamed from: Q */
    public final boolean mo46293Q() {
        if (this.f39940k) {
            C16074g gVar = C16074g.f39963a;
            Layout layout = this.f39934e;
            Intrinsics.checkNotNull(layout, "null cannot be cast to non-null type android.text.BoringLayout");
            return gVar.mo46350c((BoringLayout) layout);
        }
        C16084j0 j0Var = C16084j0.f39976a;
        Layout layout2 = this.f39934e;
        Intrinsics.checkNotNull(layout2, "null cannot be cast to non-null type android.text.StaticLayout");
        return j0Var.mo46475c((StaticLayout) layout2, this.f39931b);
    }

    /* renamed from: R */
    public final boolean mo46294R(int i) {
        return C16082i1.m72475k(this.f39934e, i);
    }

    /* renamed from: S */
    public final boolean mo46295S(int i) {
        return this.f39934e.isRtlCharAt(i);
    }

    /* renamed from: T */
    public final void mo46296T(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        if (canvas.getClipBounds(this.f39944o)) {
            int i = this.f39936g;
            if (i != 0) {
                canvas.translate(0.0f, (float) i);
            }
            C16079h1 d = C16082i1.f39971a;
            d.mo46352a(canvas);
            this.f39934e.draw(d);
            int i2 = this.f39936g;
            if (i2 != 0) {
                canvas.translate(0.0f, ((float) -1) * ((float) i2));
            }
        }
    }

    /* renamed from: a */
    public final void mo46297a(int i, int i2, @C12579k float[] fArr, int i3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i4;
        float f;
        float f2;
        int i5 = i;
        int i6 = i2;
        float[] fArr2 = fArr;
        Intrinsics.checkNotNullParameter(fArr2, "array");
        int length = mo46291N().length();
        int i7 = 1;
        if (i5 >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i5 < length) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (i6 > i5) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    if (i6 <= length) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (z4) {
                        if (fArr2.length - i3 >= (i6 - i5) * 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if (z5) {
                            int v = mo46316v(i);
                            int v2 = mo46316v(i6 - 1);
                            C16083j jVar = new C16083j(this);
                            if (v <= v2) {
                                int i8 = v;
                                int i9 = i3;
                                while (true) {
                                    int A = mo46280A(i8);
                                    int u = mo46315u(i8);
                                    int min = Math.min(i6, u);
                                    float B = mo46281B(i8);
                                    float p = mo46310p(i8);
                                    if (mo46287H(i8) == i7) {
                                        i4 = i7;
                                    } else {
                                        i4 = 0;
                                    }
                                    int i10 = i4 ^ 1;
                                    for (int max = Math.max(i5, A); max < min; max++) {
                                        boolean S = mo46295S(max);
                                        if (i4 != 0 && !S) {
                                            f = jVar.mo46470c(max);
                                            f2 = jVar.mo46471d(max + 1);
                                        } else if (i4 != 0 && S) {
                                            f2 = jVar.mo46472e(max);
                                            f = jVar.mo46473f(max + 1);
                                        } else if (i10 == 0 || !S) {
                                            f = jVar.mo46472e(max);
                                            f2 = jVar.mo46473f(max + 1);
                                        } else {
                                            f2 = jVar.mo46470c(max);
                                            f = jVar.mo46471d(max + 1);
                                        }
                                        fArr2[i9] = f;
                                        fArr2[i9 + 1] = B;
                                        fArr2[i9 + 2] = f2;
                                        fArr2[i9 + 3] = p;
                                        i9 += 4;
                                    }
                                    if (i8 != v2) {
                                        i8++;
                                        i7 = 1;
                                    } else {
                                        return;
                                    }
                                }
                            }
                        } else {
                            throw new IllegalArgumentException("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4".toString());
                        }
                    } else {
                        throw new IllegalArgumentException("endOffset must be smaller or equal to text length".toString());
                    }
                } else {
                    throw new IllegalArgumentException("endOffset must be greater than startOffset".toString());
                }
            } else {
                throw new IllegalArgumentException("startOffset must be less than text length".toString());
            }
        } else {
            throw new IllegalArgumentException("startOffset must be > 0".toString());
        }
    }

    /* renamed from: b */
    public final int mo46298b() {
        return this.f39937h;
    }

    @C12579k
    /* renamed from: d */
    public final RectF mo46299d(int i) {
        boolean z;
        float f;
        float f2;
        float f3;
        float f4;
        int v = mo46316v(i);
        float B = mo46281B(v);
        float p = mo46310p(v);
        if (mo46287H(v) == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean isRtlCharAt = this.f39934e.isRtlCharAt(i);
        if (!z || isRtlCharAt) {
            if (z && isRtlCharAt) {
                f4 = mo46289K(i, false);
                f3 = mo46289K(i + 1, true);
            } else if (isRtlCharAt) {
                f4 = mo46288I(i, false);
                f3 = mo46288I(i + 1, true);
            } else {
                f2 = mo46289K(i, false);
                f = mo46289K(i + 1, true);
            }
            float f5 = f4;
            f2 = f3;
            f = f5;
        } else {
            f2 = mo46288I(i, false);
            f = mo46288I(i + 1, true);
        }
        return new RectF(f2, B, f, p);
    }

    /* renamed from: e */
    public final boolean mo46300e() {
        return this.f39933d;
    }

    /* renamed from: f */
    public final boolean mo46301f() {
        return this.f39931b;
    }

    /* renamed from: g */
    public final int mo46302g() {
        int i;
        if (this.f39933d) {
            i = this.f39934e.getLineBottom(this.f39935f - 1);
        } else {
            i = this.f39934e.getHeight();
        }
        return i + this.f39936g + this.f39937h + this.f39942m;
    }

    /* renamed from: h */
    public final float mo46303h(int i) {
        if (i == this.f39935f - 1) {
            return this.f39938i + this.f39939j;
        }
        return 0.0f;
    }

    /* renamed from: i */
    public final boolean mo46304i() {
        return this.f39930a;
    }

    @C12579k
    /* renamed from: j */
    public final Layout mo46305j() {
        return this.f39934e;
    }

    /* renamed from: l */
    public final C16099n mo46306l() {
        return (C16099n) this.f39945p.getValue();
    }

    @C12579k
    /* renamed from: m */
    public final C16104p mo46307m() {
        return this.f39932c;
    }

    /* renamed from: n */
    public final float mo46308n(int i) {
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        if (i != this.f39935f - 1 || (fontMetricsInt = this.f39941l) == null) {
            i2 = this.f39934e.getLineAscent(i);
        } else {
            i2 = fontMetricsInt.ascent;
        }
        return (float) i2;
    }

    /* renamed from: o */
    public final float mo46309o(int i) {
        float f;
        float f2 = (float) this.f39936g;
        if (i != this.f39935f - 1 || this.f39941l == null) {
            f = (float) this.f39934e.getLineBaseline(i);
        } else {
            f = mo46281B(i) - ((float) this.f39941l.ascent);
        }
        return f2 + f;
    }

    /* renamed from: p */
    public final float mo46310p(int i) {
        int i2;
        if (i == this.f39935f - 1 && this.f39941l != null) {
            return ((float) this.f39934e.getLineBottom(i - 1)) + ((float) this.f39941l.bottom);
        }
        float lineBottom = ((float) this.f39936g) + ((float) this.f39934e.getLineBottom(i));
        if (i == this.f39935f - 1) {
            i2 = this.f39937h;
        } else {
            i2 = 0;
        }
        return lineBottom + ((float) i2);
    }

    /* renamed from: q */
    public final int mo46311q() {
        return this.f39935f;
    }

    /* renamed from: r */
    public final float mo46312r(int i) {
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        if (i != this.f39935f - 1 || (fontMetricsInt = this.f39941l) == null) {
            i2 = this.f39934e.getLineDescent(i);
        } else {
            i2 = fontMetricsInt.descent;
        }
        return (float) i2;
    }

    /* renamed from: s */
    public final int mo46313s(int i) {
        return this.f39934e.getEllipsisCount(i);
    }

    /* renamed from: t */
    public final int mo46314t(int i) {
        return this.f39934e.getEllipsisStart(i);
    }

    /* renamed from: u */
    public final int mo46315u(int i) {
        if (this.f39934e.getEllipsisStart(i) == 0) {
            return this.f39934e.getLineEnd(i);
        }
        return this.f39934e.getText().length();
    }

    /* renamed from: v */
    public final int mo46316v(int i) {
        return this.f39934e.getLineForOffset(i);
    }

    /* renamed from: w */
    public final int mo46317w(int i) {
        return this.f39934e.getLineForVertical(this.f39936g + i);
    }

    /* renamed from: x */
    public final float mo46318x(int i) {
        return mo46310p(i) - mo46281B(i);
    }

    /* renamed from: y */
    public final float mo46319y(int i) {
        float f;
        float lineLeft = this.f39934e.getLineLeft(i);
        if (i == this.f39935f - 1) {
            f = this.f39938i;
        } else {
            f = 0.0f;
        }
        return lineLeft + f;
    }

    /* renamed from: z */
    public final float mo46320z(int i) {
        float f;
        float lineRight = this.f39934e.getLineRight(i);
        if (i == this.f39935f - 1) {
            f = this.f39939j;
        } else {
            f = 0.0f;
        }
        return lineRight + f;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ TextLayout(java.lang.CharSequence r24, float r25, android.text.TextPaint r26, int r27, android.text.TextUtils.TruncateAt r28, int r29, float r30, float r31, boolean r32, boolean r33, int r34, int r35, int r36, int r37, int r38, int r39, int[] r40, int[] r41, androidx.compose.p004ui.text.android.C16104p r42, int r43, kotlin.jvm.internal.DefaultConstructorMarker r44) {
        /*
            r23 = this;
            r0 = r43
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r5 = r2
            goto L_0x000b
        L_0x0009:
            r5 = r25
        L_0x000b:
            r1 = r0 & 8
            r3 = 0
            if (r1 == 0) goto L_0x0012
            r7 = r3
            goto L_0x0014
        L_0x0012:
            r7 = r27
        L_0x0014:
            r1 = r0 & 16
            r4 = 0
            if (r1 == 0) goto L_0x001b
            r8 = r4
            goto L_0x001d
        L_0x001b:
            r8 = r28
        L_0x001d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0024
            r1 = 2
            r9 = r1
            goto L_0x0026
        L_0x0024:
            r9 = r29
        L_0x0026:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002e
            r1 = 1065353216(0x3f800000, float:1.0)
            r10 = r1
            goto L_0x0030
        L_0x002e:
            r10 = r30
        L_0x0030:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0036
            r11 = r2
            goto L_0x0038
        L_0x0036:
            r11 = r31
        L_0x0038:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003e
            r12 = r3
            goto L_0x0040
        L_0x003e:
            r12 = r32
        L_0x0040:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0047
            r1 = 1
            r13 = r1
            goto L_0x0049
        L_0x0047:
            r13 = r33
        L_0x0049:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0052
            r1 = 2147483647(0x7fffffff, float:NaN)
            r14 = r1
            goto L_0x0054
        L_0x0052:
            r14 = r34
        L_0x0054:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x005a
            r15 = r3
            goto L_0x005c
        L_0x005a:
            r15 = r35
        L_0x005c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0063
            r16 = r3
            goto L_0x0065
        L_0x0063:
            r16 = r36
        L_0x0065:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006c
            r17 = r3
            goto L_0x006e
        L_0x006c:
            r17 = r37
        L_0x006e:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0075
            r18 = r3
            goto L_0x0077
        L_0x0075:
            r18 = r38
        L_0x0077:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0080
            r19 = r3
            goto L_0x0082
        L_0x0080:
            r19 = r39
        L_0x0082:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008a
            r20 = r4
            goto L_0x008c
        L_0x008a:
            r20 = r40
        L_0x008c:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0094
            r21 = r4
            goto L_0x0096
        L_0x0094:
            r21 = r41
        L_0x0096:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a7
            androidx.compose.ui.text.android.p r0 = new androidx.compose.ui.text.android.p
            r1 = r24
            r2 = r26
            r0.<init>(r1, r2, r9)
            r22 = r0
            goto L_0x00ad
        L_0x00a7:
            r1 = r24
            r2 = r26
            r22 = r42
        L_0x00ad:
            r3 = r23
            r4 = r24
            r6 = r26
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.android.TextLayout.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, float, float, boolean, boolean, int, int, int, int, int, int, int[], int[], androidx.compose.ui.text.android.p, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
