package androidx.compose.p004ui.text.platform;

import android.graphics.Shader;
import android.text.TextPaint;
import androidx.annotation.C0344h1;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.graphics.C15223h3;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.p004ui.graphics.C15271n0;
import androidx.compose.p004ui.graphics.C15421z1;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.graphics.drawscope.C15197l;
import androidx.compose.p004ui.graphics.drawscope.C15198m;
import androidx.compose.p004ui.text.platform.extensions.C16373d;
import androidx.compose.p004ui.text.style.C16434j;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference0Impl;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAndroidTextPaint.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,143:1\n646#2:144\n646#2:145\n152#3:146\n*S KotlinDebug\n*F\n+ 1 AndroidTextPaint.android.kt\nandroidx/compose/ui/text/platform/AndroidTextPaint\n*L\n83#1:144\n92#1:145\n93#1:146\n*E\n"})
/* renamed from: androidx.compose.ui.text.platform.l */
public final class C16383l extends TextPaint {
    @C12579k

    /* renamed from: a */
    public final C15211f3 f40635a = C15271n0.m66310y(this);
    @C12579k

    /* renamed from: b */
    public C16434j f40636b = C16434j.f40726b.mo47682d();
    @C12579k

    /* renamed from: c */
    public C15205e4 f40637c = C15205e4.f37522d.mo42746a();
    @C12580l

    /* renamed from: d */
    public C15192h f40638d;

    public C16383l(int i, float f) {
        super(i);
        this.density = f;
    }

    /* renamed from: b */
    public static Object m73942b(C16383l lVar) {
        return C11342l0.m43553j(new MutablePropertyReference0Impl(lVar.f40635a, C15211f3.class, "blendMode", "getBlendMode-0nO6VwU()I", 0));
    }

    @C0344h1(otherwise = 2)
    /* renamed from: d */
    public static /* synthetic */ void m73943d() {
    }

    /* renamed from: g */
    public static /* synthetic */ void m73944g(C16383l lVar, C15421z1 z1Var, long j, float f, int i, Object obj) {
        if ((i & 4) != 0) {
            f = Float.NaN;
        }
        lVar.mo47550f(z1Var, j, f);
    }

    /* renamed from: a */
    public final int mo47547a() {
        return this.f40635a.mo42761n();
    }

    @C12579k
    /* renamed from: c */
    public final C15205e4 mo47548c() {
        return this.f40637c;
    }

    /* renamed from: e */
    public final void mo47549e(int i) {
        this.f40635a.mo42751e(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
        if (r1 != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002e, code lost:
        r0 = r7.f40635a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        if (java.lang.Float.isNaN(r11) == false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0036, code lost:
        r11 = r7.f40635a.getAlpha();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003d, code lost:
        r11 = kotlin.ranges.C11479u.m44331H(r11, 0.0f, 1.0f);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r8.mo42495a(r9, r0, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (r0 == false) goto L_0x001c;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47550f(@org.jetbrains.annotations.C12580l androidx.compose.p004ui.graphics.C15421z1 r8, long r9, float r11) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof androidx.compose.p004ui.graphics.C15225h4
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r0 = r8
            androidx.compose.ui.graphics.h4 r0 = (androidx.compose.p004ui.graphics.C15225h4) r0
            long r3 = r0.mo42781c()
            androidx.compose.ui.graphics.j2$a r0 = androidx.compose.p004ui.graphics.C15240j2.f37547b
            long r5 = r0.mo42851u()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0019
            r0 = r1
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            if (r0 != 0) goto L_0x002e
        L_0x001c:
            boolean r0 = r8 instanceof androidx.compose.p004ui.graphics.C15127c4
            if (r0 == 0) goto L_0x0048
            androidx.compose.ui.geometry.m$a r0 = androidx.compose.p004ui.geometry.C15104m.f37280b
            long r3 = r0.mo42316a()
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x002b
            goto L_0x002c
        L_0x002b:
            r1 = r2
        L_0x002c:
            if (r1 == 0) goto L_0x0048
        L_0x002e:
            androidx.compose.ui.graphics.f3 r0 = r7.f40635a
            boolean r1 = java.lang.Float.isNaN(r11)
            if (r1 == 0) goto L_0x003d
            androidx.compose.ui.graphics.f3 r11 = r7.f40635a
            float r11 = r11.getAlpha()
            goto L_0x0044
        L_0x003d:
            r1 = 0
            r2 = 1065353216(0x3f800000, float:1.0)
            float r11 = kotlin.ranges.C11479u.m44331H(r11, r1, r2)
        L_0x0044:
            r8.mo42495a(r9, r0, r11)
            goto L_0x0050
        L_0x0048:
            if (r8 != 0) goto L_0x0050
            androidx.compose.ui.graphics.f3 r8 = r7.f40635a
            r9 = 0
            r8.mo42765r(r9)
        L_0x0050:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p004ui.text.platform.C16383l.mo47550f(androidx.compose.ui.graphics.z1, long, float):void");
    }

    /* renamed from: h */
    public final void mo47551h(long j) {
        boolean z;
        if (j != C15240j2.f37547b.mo42851u()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f40635a.mo42759l(j);
            this.f40635a.mo42765r((Shader) null);
        }
    }

    /* renamed from: i */
    public final void mo47552i(@C12580l C15192h hVar) {
        if (hVar != null && !Intrinsics.areEqual((Object) this.f40638d, (Object) hVar)) {
            this.f40638d = hVar;
            if (Intrinsics.areEqual((Object) hVar, (Object) C15197l.f37504a)) {
                this.f40635a.mo42771x(C15223h3.f37530b.mo42779a());
            } else if (hVar instanceof C15198m) {
                this.f40635a.mo42771x(C15223h3.f37530b.mo42780b());
                C15198m mVar = (C15198m) hVar;
                this.f40635a.mo42772y(mVar.mo42726g());
                this.f40635a.mo42768u(mVar.mo42723e());
                this.f40635a.mo42758k(mVar.mo42722d());
                this.f40635a.mo42749c(mVar.mo42721c());
                this.f40635a.mo42757j(mVar.mo42725f());
            }
        }
    }

    /* renamed from: j */
    public final void mo47553j(@C12580l C15205e4 e4Var) {
        if (e4Var != null && !Intrinsics.areEqual((Object) this.f40637c, (Object) e4Var)) {
            this.f40637c = e4Var;
            if (Intrinsics.areEqual((Object) e4Var, (Object) C15205e4.f37522d.mo42746a())) {
                clearShadowLayer();
            } else {
                setShadowLayer(C16373d.m73919c(this.f40637c.mo42740d()), C15094f.m64880p(this.f40637c.mo42743h()), C15094f.m64882r(this.f40637c.mo42743h()), C15258l2.m66193r(this.f40637c.mo42742f()));
            }
        }
    }

    /* renamed from: k */
    public final void mo47554k(@C12579k C15205e4 e4Var) {
        Intrinsics.checkNotNullParameter(e4Var, "<set-?>");
        this.f40637c = e4Var;
    }

    /* renamed from: l */
    public final void mo47555l(@C12580l C16434j jVar) {
        if (jVar != null && !Intrinsics.areEqual((Object) this.f40636b, (Object) jVar)) {
            this.f40636b = jVar;
            C16434j.C16435a aVar = C16434j.f40726b;
            setUnderlineText(jVar.mo47674d(aVar.mo47683f()));
            setStrikeThruText(this.f40636b.mo47674d(aVar.mo47681b()));
        }
    }
}
