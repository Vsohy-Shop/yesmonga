package androidx.compose.p004ui.text;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.C0344h1;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15208f0;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15318t0;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.android.C16104p;
import androidx.compose.p004ui.text.android.TextLayout;
import androidx.compose.p004ui.text.android.selection.C16112a;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.platform.AndroidParagraphIntrinsics;
import androidx.compose.p004ui.text.platform.C16376f;
import androidx.compose.p004ui.text.platform.C16383l;
import androidx.compose.p004ui.text.platform.style.C16392b;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.ResolvedTextDirection;
import androidx.compose.p004ui.unit.C16476b;
import androidx.compose.p004ui.unit.C16479d;
import java.util.List;
import java.util.Locale;
import kotlin.C11677z;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidParagraph.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n*L\n1#1,621:1\n1#2:622\n13579#3,2:623\n11335#3:625\n11670#3,3:626\n26#4:629\n26#4:630\n*S KotlinDebug\n*F\n+ 1 AndroidParagraph.android.kt\nandroidx/compose/ui/text/AndroidParagraph\n*L\n204#1:623,2\n244#1:625\n244#1:626,3\n439#1:629\n443#1:630\n*E\n"})
/* renamed from: androidx.compose.ui.text.AndroidParagraph */
public final class AndroidParagraph implements C16355n {
    @C12579k

    /* renamed from: a */
    public final AndroidParagraphIntrinsics f39842a;

    /* renamed from: b */
    public final int f39843b;

    /* renamed from: c */
    public final boolean f39844c;

    /* renamed from: d */
    public final long f39845d;
    @C12579k

    /* renamed from: e */
    public final TextLayout f39846e;
    @C12579k

    /* renamed from: f */
    public final CharSequence f39847f;
    @C12579k

    /* renamed from: g */
    public final List<C15098i> f39848g;
    @C12579k

    /* renamed from: h */
    public final C11677z f39849h;

    /* renamed from: androidx.compose.ui.text.AndroidParagraph$a */
    public /* synthetic */ class C16047a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                androidx.compose.ui.text.style.ResolvedTextDirection[] r0 = androidx.compose.p004ui.text.style.ResolvedTextDirection.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.compose.ui.text.style.ResolvedTextDirection r1 = androidx.compose.p004ui.text.style.ResolvedTextDirection.Ltr     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                androidx.compose.ui.text.style.ResolvedTextDirection r1 = androidx.compose.p004ui.text.style.ResolvedTextDirection.Rtl     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                $EnumSwitchMapping$0 = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.AndroidParagraph.C16047a.<clinit>():void");
        }
    }

    public /* synthetic */ AndroidParagraph(AndroidParagraphIntrinsics androidParagraphIntrinsics, int i, boolean z, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(androidParagraphIntrinsics, i, z, j);
    }

    @C0344h1
    /* renamed from: L */
    public static /* synthetic */ void m72188L() {
    }

    @C0344h1
    /* renamed from: V */
    public static /* synthetic */ void m72189V() {
    }

    @C0344h1
    /* renamed from: X */
    public static /* synthetic */ void m72190X() {
    }

    /* renamed from: A */
    public float mo46175A(int i) {
        return this.f39846e.mo46310p(i);
    }

    @C12579k
    /* renamed from: C */
    public List<C15098i> mo46176C() {
        return this.f39848g;
    }

    /* renamed from: E */
    public float mo46177E(int i) {
        return this.f39846e.mo46283D(i);
    }

    /* renamed from: F */
    public void mo46178F(@C12579k C15118b2 b2Var, long j, @C12580l C15205e4 e4Var, @C12580l C16434j jVar) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        C16383l W = mo46191W();
        W.mo47551h(j);
        W.mo47553j(e4Var);
        W.mo47555l(jVar);
        mo46193Z(b2Var);
    }

    /* renamed from: I */
    public final TextLayout mo46179I(int i, int i2, TextUtils.TruncateAt truncateAt, int i3, int i4, int i5, int i6, int i7) {
        TextUtils.TruncateAt truncateAt2 = truncateAt;
        int i8 = i3;
        int i9 = i4;
        int i10 = i5;
        int i11 = i6;
        int i12 = i7;
        CharSequence charSequence = this.f39847f;
        float width = getWidth();
        C16383l W = mo46191W();
        int n = this.f39842a.mo47528n();
        C16104p i13 = this.f39842a.mo47523i();
        return new TextLayout(charSequence, width, W, i, truncateAt2, n, 1.0f, 0.0f, C16376f.m73927b(this.f39842a.mo47526l()), true, i8, i10, i11, i12, i9, i2, (int[]) null, (int[]) null, i13, 196736, (DefaultConstructorMarker) null);
    }

    /* renamed from: J */
    public final void mo46180J(long j, @C12579k float[] fArr, int i) {
        Intrinsics.checkNotNullParameter(fArr, "array");
        this.f39846e.mo46297a(C16356n0.m73740l(j), C16356n0.m73739k(j), fArr, i);
    }

    @C12579k
    /* renamed from: K */
    public final CharSequence mo46181K() {
        return this.f39847f;
    }

    /* renamed from: M */
    public final long mo46182M() {
        return this.f39845d;
    }

    /* renamed from: N */
    public final boolean mo46183N() {
        return this.f39844c;
    }

    /* renamed from: O */
    public final float mo46184O(int i) {
        return this.f39846e.mo46308n(i);
    }

    /* renamed from: P */
    public final float mo46185P(int i) {
        return this.f39846e.mo46309o(i);
    }

    /* renamed from: Q */
    public final float mo46186Q(int i) {
        return this.f39846e.mo46312r(i);
    }

    /* renamed from: R */
    public final int mo46187R() {
        return this.f39843b;
    }

    @C12579k
    /* renamed from: S */
    public final AndroidParagraphIntrinsics mo46188S() {
        return this.f39842a;
    }

    /* renamed from: T */
    public final C16392b[] mo46189T(TextLayout textLayout) {
        boolean z;
        if (!(textLayout.mo46291N() instanceof Spanned)) {
            return new C16392b[0];
        }
        CharSequence N = textLayout.mo46291N();
        Intrinsics.checkNotNull(N, "null cannot be cast to non-null type android.text.Spanned");
        C16392b[] bVarArr = (C16392b[]) ((Spanned) N).getSpans(0, textLayout.mo46291N().length(), C16392b.class);
        Intrinsics.checkNotNullExpressionValue(bVarArr, "brushSpans");
        if (bVarArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new C16392b[0];
        }
        return bVarArr;
    }

    @C12579k
    /* renamed from: U */
    public final Locale mo46190U() {
        Locale textLocale = this.f39842a.mo47529o().getTextLocale();
        Intrinsics.checkNotNullExpressionValue(textLocale, "paragraphIntrinsics.textPaint.textLocale");
        return textLocale;
    }

    @C12579k
    /* renamed from: W */
    public final C16383l mo46191W() {
        return this.f39842a.mo47529o();
    }

    /* renamed from: Y */
    public final C16112a mo46192Y() {
        return (C16112a) this.f39849h.getValue();
    }

    /* renamed from: Z */
    public final void mo46193Z(C15118b2 b2Var) {
        Canvas d = C15208f0.m65929d(b2Var);
        if (mo46212q()) {
            d.save();
            d.clipRect(0.0f, 0.0f, getWidth(), getHeight());
        }
        this.f39846e.mo46296T(d);
        if (mo46212q()) {
            d.restore();
        }
    }

    /* renamed from: a */
    public float mo46194a() {
        return this.f39842a.mo46227a();
    }

    /* renamed from: b */
    public float mo46195b() {
        return this.f39842a.mo46228b();
    }

    @C12579k
    /* renamed from: c */
    public C15098i mo46196c(int i) {
        RectF d = this.f39846e.mo46299d(i);
        return new C15098i(d.left, d.top, d.right, d.bottom);
    }

    @C12579k
    /* renamed from: d */
    public ResolvedTextDirection mo46197d(int i) {
        if (this.f39846e.mo46287H(this.f39846e.mo46316v(i)) == 1) {
            return ResolvedTextDirection.Ltr;
        }
        return ResolvedTextDirection.Rtl;
    }

    /* renamed from: e */
    public float mo46198e(int i) {
        return this.f39846e.mo46281B(i);
    }

    @C12579k
    /* renamed from: f */
    public C15098i mo46199f(int i) {
        boolean z;
        if (i < 0 || i > this.f39847f.length()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            float J = TextLayout.m72359J(this.f39846e, i, false, 2, (Object) null);
            int v = this.f39846e.mo46316v(i);
            return new C15098i(J, this.f39846e.mo46281B(v), J, this.f39846e.mo46310p(v));
        }
        throw new AssertionError("offset(" + i + ") is out of bounds (0," + this.f39847f.length());
    }

    /* renamed from: g */
    public void mo46200g(@C12579k C15118b2 b2Var, long j, @C12580l C15205e4 e4Var, @C12580l C16434j jVar, @C12580l C15192h hVar, int i) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        int a = mo46191W().mo47547a();
        C16383l W = mo46191W();
        W.mo47551h(j);
        W.mo47553j(e4Var);
        W.mo47555l(jVar);
        W.mo47552i(hVar);
        W.mo47549e(i);
        mo46193Z(b2Var);
        mo46191W().mo47549e(a);
    }

    public float getHeight() {
        return (float) this.f39846e.mo46302g();
    }

    public float getWidth() {
        return (float) C16476b.m74362p(this.f39845d);
    }

    /* renamed from: h */
    public long mo46203h(int i) {
        return C16359o0.m73780b(mo46192Y().mo46529b(i), mo46192Y().mo46528a(i));
    }

    /* renamed from: i */
    public float mo46204i() {
        return mo46185P(0);
    }

    /* renamed from: j */
    public int mo46205j(long j) {
        return this.f39846e.mo46286G(this.f39846e.mo46317w((int) C15094f.m64882r(j)), C15094f.m64880p(j));
    }

    /* renamed from: k */
    public boolean mo46206k(int i) {
        return this.f39846e.mo46294R(i);
    }

    /* renamed from: l */
    public int mo46207l(int i) {
        return this.f39846e.mo46280A(i);
    }

    /* renamed from: m */
    public int mo46208m(int i, boolean z) {
        if (z) {
            return this.f39846e.mo46282C(i);
        }
        return this.f39846e.mo46315u(i);
    }

    /* renamed from: n */
    public int mo46209n() {
        return this.f39846e.mo46311q();
    }

    /* renamed from: o */
    public float mo46210o(int i) {
        return this.f39846e.mo46320z(i);
    }

    /* renamed from: p */
    public float mo46211p(int i) {
        return this.f39846e.mo46318x(i);
    }

    /* renamed from: q */
    public boolean mo46212q() {
        return this.f39846e.mo46300e();
    }

    /* renamed from: r */
    public int mo46213r(float f) {
        return this.f39846e.mo46317w((int) f);
    }

    @C12579k
    /* renamed from: s */
    public C15231i3 mo46214s(int i, int i2) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z || i2 > this.f39847f.length()) {
            throw new AssertionError("Start(" + i + ") or End(" + i2 + ") is out of Range(0.." + this.f39847f.length() + "), or start > end!");
        }
        Path path = new Path();
        this.f39846e.mo46290M(i, i2, path);
        return C15318t0.m66552c(path);
    }

    /* renamed from: t */
    public float mo46215t(int i, boolean z) {
        if (z) {
            return TextLayout.m72359J(this.f39846e, i, false, 2, (Object) null);
        }
        return TextLayout.m72360L(this.f39846e, i, false, 2, (Object) null);
    }

    /* renamed from: u */
    public float mo46216u(int i) {
        return this.f39846e.mo46319y(i);
    }

    /* renamed from: w */
    public void mo46217w(@C12579k C15118b2 b2Var, @C12579k C15421z1 z1Var, float f, @C12580l C15205e4 e4Var, @C12580l C16434j jVar, @C12580l C15192h hVar, int i) {
        Intrinsics.checkNotNullParameter(b2Var, "canvas");
        Intrinsics.checkNotNullParameter(z1Var, "brush");
        int a = mo46191W().mo47547a();
        C16383l W = mo46191W();
        W.mo47550f(z1Var, C15106n.m65033a(getWidth(), getHeight()), f);
        W.mo47553j(e4Var);
        W.mo47555l(jVar);
        W.mo47552i(hVar);
        W.mo47549e(i);
        mo46193Z(b2Var);
        mo46191W().mo47549e(a);
    }

    /* renamed from: x */
    public float mo46218x() {
        return mo46185P(mo46209n() - 1);
    }

    /* renamed from: y */
    public int mo46219y(int i) {
        return this.f39846e.mo46316v(i);
    }

    @C12579k
    /* renamed from: z */
    public ResolvedTextDirection mo46220z(int i) {
        if (this.f39846e.mo46295S(i)) {
            return ResolvedTextDirection.Rtl;
        }
        return ResolvedTextDirection.Ltr;
    }

    public /* synthetic */ AndroidParagraph(String str, C16361p0 p0Var, List list, List list2, int i, boolean z, long j, C16242u.C16244b bVar, C16479d dVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, p0Var, list, list2, i, z, j, bVar, dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:85:0x022d, code lost:
        r10 = r10 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0258, code lost:
        r10 = r8 - ((float) r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x025b, code lost:
        r8 = new androidx.compose.p004ui.geometry.C15098i(r6, r10, r7, ((float) r5.mo46571b()) + r10);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AndroidParagraph(androidx.compose.p004ui.text.platform.AndroidParagraphIntrinsics r26, int r27, boolean r28, long r29) {
        /*
            r25 = this;
            r9 = r25
            r10 = r27
            r11 = r28
            r25.<init>()
            r0 = r26
            r9.f39842a = r0
            r9.f39843b = r10
            r9.f39844c = r11
            r12 = r29
            r9.f39845d = r12
            int r1 = androidx.compose.p004ui.unit.C16476b.m74363q(r29)
            r14 = 0
            r15 = 1
            if (r1 != 0) goto L_0x0025
            int r1 = androidx.compose.p004ui.unit.C16476b.m74364r(r29)
            if (r1 != 0) goto L_0x0025
            r1 = r15
            goto L_0x0026
        L_0x0025:
            r1 = r14
        L_0x0026:
            if (r1 == 0) goto L_0x028d
            if (r10 < r15) goto L_0x002c
            r1 = r15
            goto L_0x002d
        L_0x002c:
            r1 = r14
        L_0x002d:
            if (r1 == 0) goto L_0x0281
            androidx.compose.ui.text.p0 r8 = r26.mo47526l()
            boolean r1 = androidx.compose.p004ui.text.C16148b.m72634k(r8, r11)
            if (r1 == 0) goto L_0x0042
            java.lang.CharSequence r0 = r26.mo47520f()
            java.lang.CharSequence r0 = androidx.compose.p004ui.text.C16148b.m72632i(r0)
            goto L_0x0046
        L_0x0042:
            java.lang.CharSequence r0 = r26.mo47520f()
        L_0x0046:
            r9.f39847f = r0
            androidx.compose.ui.text.style.i r0 = r8.mo47483K()
            int r16 = androidx.compose.p004ui.text.C16148b.m72635l(r0)
            androidx.compose.ui.text.style.i r0 = r8.mo47483K()
            androidx.compose.ui.text.style.i$a r1 = androidx.compose.p004ui.text.style.C16432i.f40718b
            int r1 = r1.mo47669c()
            if (r0 != 0) goto L_0x005f
            r17 = r14
            goto L_0x0069
        L_0x005f:
            int r0 = r0.mo47665m()
            boolean r0 = androidx.compose.p004ui.text.style.C16432i.m74175j(r0, r1)
            r17 = r0
        L_0x0069:
            androidx.compose.ui.text.t r0 = r8.mo47479G()
            androidx.compose.ui.text.style.e r0 = r0.mo47735i()
            int r18 = androidx.compose.p004ui.text.C16148b.m72637n(r0)
            androidx.compose.ui.text.style.f r0 = r8.mo47475C()
            r19 = 0
            if (r0 == 0) goto L_0x008a
            int r0 = r0.mo47615p()
            int r0 = androidx.compose.p004ui.text.style.C16417f.m74070k(r0)
            androidx.compose.ui.text.style.f$b r0 = androidx.compose.p004ui.text.style.C16417f.C16419b.m74082d(r0)
            goto L_0x008c
        L_0x008a:
            r0 = r19
        L_0x008c:
            int r20 = androidx.compose.p004ui.text.C16148b.m72636m(r0)
            androidx.compose.ui.text.style.f r0 = r8.mo47475C()
            if (r0 == 0) goto L_0x00a3
            int r0 = r0.mo47615p()
            int r0 = androidx.compose.p004ui.text.style.C16417f.m74071l(r0)
            androidx.compose.ui.text.style.f$c r0 = androidx.compose.p004ui.text.style.C16417f.C16421c.m74096e(r0)
            goto L_0x00a5
        L_0x00a3:
            r0 = r19
        L_0x00a5:
            int r21 = androidx.compose.p004ui.text.C16148b.m72638o(r0)
            androidx.compose.ui.text.style.f r0 = r8.mo47475C()
            if (r0 == 0) goto L_0x00bc
            int r0 = r0.mo47615p()
            int r0 = androidx.compose.p004ui.text.style.C16417f.m74072m(r0)
            androidx.compose.ui.text.style.f$d r0 = androidx.compose.p004ui.text.style.C16417f.C16423d.m74109c(r0)
            goto L_0x00be
        L_0x00bc:
            r0 = r19
        L_0x00be:
            int r22 = androidx.compose.p004ui.text.C16148b.m72639p(r0)
            if (r11 == 0) goto L_0x00c9
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r23 = r0
            goto L_0x00cb
        L_0x00c9:
            r23 = r19
        L_0x00cb:
            r0 = r25
            r1 = r16
            r2 = r17
            r3 = r23
            r4 = r27
            r5 = r18
            r6 = r20
            r7 = r21
            r24 = r8
            r8 = r22
            androidx.compose.ui.text.android.TextLayout r0 = r0.mo46179I(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r11 == 0) goto L_0x0118
            int r1 = r0.mo46302g()
            int r2 = androidx.compose.p004ui.unit.C16476b.m74361o(r29)
            if (r1 <= r2) goto L_0x0118
            if (r10 <= r15) goto L_0x0118
            int r1 = androidx.compose.p004ui.unit.C16476b.m74361o(r29)
            int r1 = androidx.compose.p004ui.text.C16148b.m72633j(r0, r1)
            if (r1 < 0) goto L_0x0115
            if (r1 == r10) goto L_0x0115
            int r4 = kotlin.ranges.C11479u.m44447u(r1, r15)
            r0 = r25
            r1 = r16
            r2 = r17
            r3 = r23
            r5 = r18
            r6 = r20
            r7 = r21
            r8 = r22
            androidx.compose.ui.text.android.TextLayout r0 = r0.mo46179I(r1, r2, r3, r4, r5, r6, r7, r8)
        L_0x0115:
            r9.f39846e = r0
            goto L_0x011a
        L_0x0118:
            r9.f39846e = r0
        L_0x011a:
            androidx.compose.ui.text.platform.l r0 = r25.mo46191W()
            androidx.compose.ui.graphics.z1 r1 = r24.mo47509p()
            float r2 = r25.getWidth()
            float r3 = r25.getHeight()
            long r2 = androidx.compose.p004ui.geometry.C15106n.m65033a(r2, r3)
            float r4 = r24.mo47506l()
            r0.mo47550f(r1, r2, r4)
            androidx.compose.ui.text.android.TextLayout r0 = r9.f39846e
            androidx.compose.ui.text.platform.style.b[] r0 = r9.mo46189T(r0)
            int r1 = r0.length
            r2 = r14
        L_0x013d:
            if (r2 >= r1) goto L_0x0153
            r3 = r0[r2]
            float r4 = r25.getWidth()
            float r5 = r25.getHeight()
            long r4 = androidx.compose.p004ui.geometry.C15106n.m65033a(r4, r5)
            r3.mo47567d(r4)
            int r2 = r2 + 1
            goto L_0x013d
        L_0x0153:
            java.lang.CharSequence r0 = r9.f39847f
            boolean r1 = r0 instanceof android.text.Spanned
            if (r1 != 0) goto L_0x015f
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.m40441E()
            goto L_0x0271
        L_0x015f:
            r1 = r0
            android.text.Spanned r1 = (android.text.Spanned) r1
            int r2 = r0.length()
            java.lang.Class<androidx.compose.ui.text.android.style.j> r3 = androidx.compose.p004ui.text.android.style.C16125j.class
            java.lang.Object[] r1 = r1.getSpans(r14, r2, r3)
            java.lang.String r2 = "getSpans(0, length, PlaceholderSpan::class.java)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.length
            r2.<init>(r3)
            int r3 = r1.length
            r4 = r14
        L_0x0179:
            if (r4 >= r3) goto L_0x0270
            r5 = r1[r4]
            androidx.compose.ui.text.android.style.j r5 = (androidx.compose.p004ui.text.android.style.C16125j) r5
            r6 = r0
            android.text.Spanned r6 = (android.text.Spanned) r6
            int r7 = r6.getSpanStart(r5)
            int r6 = r6.getSpanEnd(r5)
            androidx.compose.ui.text.android.TextLayout r8 = r9.f39846e
            int r8 = r8.mo46316v(r7)
            int r10 = r9.f39843b
            if (r8 < r10) goto L_0x0196
            r10 = r15
            goto L_0x0197
        L_0x0196:
            r10 = r14
        L_0x0197:
            androidx.compose.ui.text.android.TextLayout r11 = r9.f39846e
            int r11 = r11.mo46313s(r8)
            if (r11 <= 0) goto L_0x01a9
            androidx.compose.ui.text.android.TextLayout r11 = r9.f39846e
            int r11 = r11.mo46314t(r8)
            if (r6 <= r11) goto L_0x01a9
            r11 = r15
            goto L_0x01aa
        L_0x01a9:
            r11 = r14
        L_0x01aa:
            androidx.compose.ui.text.android.TextLayout r12 = r9.f39846e
            int r12 = r12.mo46315u(r8)
            if (r6 <= r12) goto L_0x01b4
            r6 = r15
            goto L_0x01b5
        L_0x01b4:
            r6 = r14
        L_0x01b5:
            if (r11 != 0) goto L_0x0267
            if (r6 != 0) goto L_0x0267
            if (r10 == 0) goto L_0x01bd
            goto L_0x0267
        L_0x01bd:
            androidx.compose.ui.text.style.ResolvedTextDirection r6 = r9.mo46220z(r7)
            int[] r10 = androidx.compose.p004ui.text.AndroidParagraph.C16047a.$EnumSwitchMapping$0
            int r6 = r6.ordinal()
            r6 = r10[r6]
            r10 = 2
            if (r6 == r15) goto L_0x01df
            if (r6 != r10) goto L_0x01d9
            float r6 = r9.mo46215t(r7, r15)
            int r7 = r5.mo46573d()
            float r7 = (float) r7
            float r6 = r6 - r7
            goto L_0x01e3
        L_0x01d9:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01df:
            float r6 = r9.mo46215t(r7, r15)
        L_0x01e3:
            int r7 = r5.mo46573d()
            float r7 = (float) r7
            float r7 = r7 + r6
            androidx.compose.ui.text.android.TextLayout r11 = r9.f39846e
            int r12 = r5.mo46572c()
            switch(r12) {
                case 0: goto L_0x0250;
                case 1: goto L_0x024b;
                case 2: goto L_0x0242;
                case 3: goto L_0x022f;
                case 4: goto L_0x0222;
                case 5: goto L_0x020f;
                case 6: goto L_0x01fa;
                default: goto L_0x01f2;
            }
        L_0x01f2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unexpected verticalAlignment"
            r0.<init>(r1)
            throw r0
        L_0x01fa:
            android.graphics.Paint$FontMetricsInt r12 = r5.mo46570a()
            int r13 = r12.ascent
            int r12 = r12.descent
            int r13 = r13 + r12
            int r12 = r5.mo46571b()
            int r13 = r13 - r12
            int r13 = r13 / r10
            float r10 = (float) r13
            float r8 = r11.mo46309o(r8)
            goto L_0x022d
        L_0x020f:
            android.graphics.Paint$FontMetricsInt r10 = r5.mo46570a()
            int r10 = r10.descent
            float r10 = (float) r10
            float r8 = r11.mo46309o(r8)
            float r10 = r10 + r8
            int r8 = r5.mo46571b()
            float r8 = (float) r8
            float r10 = r10 - r8
            goto L_0x025b
        L_0x0222:
            android.graphics.Paint$FontMetricsInt r10 = r5.mo46570a()
            int r10 = r10.ascent
            float r10 = (float) r10
            float r8 = r11.mo46309o(r8)
        L_0x022d:
            float r10 = r10 + r8
            goto L_0x025b
        L_0x022f:
            float r12 = r11.mo46281B(r8)
            float r8 = r11.mo46310p(r8)
            float r12 = r12 + r8
            int r8 = r5.mo46571b()
            float r8 = (float) r8
            float r12 = r12 - r8
            float r8 = (float) r10
            float r10 = r12 / r8
            goto L_0x025b
        L_0x0242:
            float r8 = r11.mo46310p(r8)
            int r10 = r5.mo46571b()
            goto L_0x0258
        L_0x024b:
            float r10 = r11.mo46281B(r8)
            goto L_0x025b
        L_0x0250:
            float r8 = r11.mo46309o(r8)
            int r10 = r5.mo46571b()
        L_0x0258:
            float r10 = (float) r10
            float r10 = r8 - r10
        L_0x025b:
            int r5 = r5.mo46571b()
            float r5 = (float) r5
            float r5 = r5 + r10
            androidx.compose.ui.geometry.i r8 = new androidx.compose.ui.geometry.i
            r8.<init>(r6, r10, r7, r5)
            goto L_0x0269
        L_0x0267:
            r8 = r19
        L_0x0269:
            r2.add(r8)
            int r4 = r4 + 1
            goto L_0x0179
        L_0x0270:
            r0 = r2
        L_0x0271:
            r9.f39848g = r0
            kotlin.LazyThreadSafetyMode r0 = kotlin.LazyThreadSafetyMode.NONE
            androidx.compose.ui.text.AndroidParagraph$wordBoundary$2 r1 = new androidx.compose.ui.text.AndroidParagraph$wordBoundary$2
            r1.<init>(r9)
            kotlin.z r0 = kotlin.C10864b0.m38747b(r0, r1)
            r9.f39849h = r0
            return
        L_0x0281:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "maxLines should be greater than 0"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x028d:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.AndroidParagraph.<init>(androidx.compose.ui.text.platform.AndroidParagraphIntrinsics, int, boolean, long):void");
    }

    public AndroidParagraph(String str, C16361p0 p0Var, List<C16156d.C16159b<C16151c0>> list, List<C16156d.C16159b<C16454v>> list2, int i, boolean z, long j, C16242u.C16244b bVar, C16479d dVar) {
        this(new AndroidParagraphIntrinsics(str, p0Var, list, list2, bVar, dVar), i, z, j, (DefaultConstructorMarker) null);
    }
}
