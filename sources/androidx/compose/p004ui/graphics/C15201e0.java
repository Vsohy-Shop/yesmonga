package androidx.compose.p004ui.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.Region;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.graphics.C15289p3;
import androidx.compose.p004ui.unit.C16494m;
import androidx.compose.p004ui.unit.C16500q;
import com.urbanairship.iam.C9127a0;
import java.util.List;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C11463j;
import kotlin.ranges.C11479u;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nAndroidCanvas.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,428:1\n35#2,5:429\n35#2,5:434\n33#3,6:439\n*S KotlinDebug\n*F\n+ 1 AndroidCanvas.android.kt\nandroidx/compose/ui/graphics/AndroidCanvas\n*L\n154#1:429,5\n242#1:434,5\n315#1:439,6\n*E\n"})
@C11532s0
/* renamed from: androidx.compose.ui.graphics.e0 */
public final class C15201e0 implements C15118b2 {
    @C12579k

    /* renamed from: a */
    public Canvas f37515a = C15208f0.f37527a;
    @C12579k

    /* renamed from: b */
    public final Rect f37516b = new Rect();
    @C12579k

    /* renamed from: c */
    public final Rect f37517c = new Rect();

    @C11532s0
    /* renamed from: U */
    public static /* synthetic */ void m65867U() {
    }

    /* renamed from: A */
    public void mo42420A(float f) {
        this.f37515a.rotate(f);
    }

    /* renamed from: D */
    public void mo42421D(float f, float f2) {
        this.f37515a.skew(f, f2);
    }

    /* renamed from: E */
    public void mo42422E() {
        this.f37515a.save();
    }

    /* renamed from: F */
    public void mo42423F() {
        C15203e2.f37518a.mo42738a(this.f37515a, false);
    }

    /* renamed from: G */
    public void mo42424G(@C12579k float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "matrix");
        if (!C15120b3.m65236c(fArr)) {
            Matrix matrix = new Matrix();
            C15256l0.m66173a(matrix, fArr);
            this.f37515a.concat(matrix);
        }
    }

    /* renamed from: J */
    public void mo42427J(@C12579k C15231i3 i3Var, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(i3Var, "path");
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        Canvas canvas = this.f37515a;
        if (i3Var instanceof C15279o0) {
            canvas.drawPath(((C15279o0) i3Var).mo42922y(), f3Var.mo42764q());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: M */
    public void mo42429M(long j, float f, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        this.f37515a.drawCircle(C15094f.m64880p(j), C15094f.m64882r(j), f, f3Var.mo42764q());
    }

    /* renamed from: P */
    public void mo42430P(float f, float f2, float f3, float f4, float f5, float f6, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        this.f37515a.drawRoundRect(f, f2, f3, f4, f5, f6, f3Var.mo42764q());
    }

    /* renamed from: R */
    public final void mo42731R(float[] fArr, C15211f3 f3Var, int i) {
        if (fArr.length >= 4 && fArr.length % 2 == 0) {
            C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, fArr.length - 3), i * 2);
            int r = B1.mo23049r();
            int w = B1.mo23051w();
            int y = B1.mo23052y();
            if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
                while (true) {
                    this.f37515a.drawLine(fArr[r], fArr[r + 1], fArr[r + 2], fArr[r + 3], f3Var.mo42764q());
                    if (r != w) {
                        r += y;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: S */
    public final void mo42732S(float[] fArr, C15211f3 f3Var, int i) {
        if (fArr.length % 2 == 0) {
            C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, fArr.length - 1), i);
            int r = B1.mo23049r();
            int w = B1.mo23051w();
            int y = B1.mo23052y();
            if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
                while (true) {
                    this.f37515a.drawPoint(fArr[r], fArr[r + 1], f3Var.mo42764q());
                    if (r != w) {
                        r += y;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    @C12579k
    /* renamed from: T */
    public final Canvas mo42733T() {
        return this.f37515a;
    }

    /* renamed from: V */
    public final void mo42734V(@C12579k Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "<set-?>");
        this.f37515a = canvas;
    }

    @C12579k
    /* renamed from: W */
    public final Region.Op mo42735W(int i) {
        if (C15229i2.m65998f(i, C15229i2.f37536b.mo42797a())) {
            return Region.Op.DIFFERENCE;
        }
        return Region.Op.INTERSECT;
    }

    /* renamed from: a */
    public final void mo42736a(List<C15094f> list, C15211f3 f3Var, int i) {
        if (list.size() >= 2) {
            C11463j B1 = C11479u.m44315B1(C11479u.m44378W1(0, list.size() - 1), i);
            int r = B1.mo23049r();
            int w = B1.mo23051w();
            int y = B1.mo23052y();
            if ((y > 0 && r <= w) || (y < 0 && w <= r)) {
                while (true) {
                    long A = list.get(r).mo42242A();
                    long A2 = list.get(r + 1).mo42242A();
                    this.f37515a.drawLine(C15094f.m64880p(A), C15094f.m64882r(A), C15094f.m64880p(A2), C15094f.m64882r(A2), f3Var.mo42764q());
                    if (r != w) {
                        r += y;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo42737b(List<C15094f> list, C15211f3 f3Var) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            long A = list.get(i).mo42242A();
            this.f37515a.drawPoint(C15094f.m64880p(A), C15094f.m64882r(A), f3Var.mo42764q());
        }
    }

    /* renamed from: c */
    public void mo42431c(float f, float f2, float f3, float f4, int i) {
        this.f37515a.clipRect(f, f2, f3, f4, mo42735W(i));
    }

    /* renamed from: d */
    public void mo42432d(@C12579k C15231i3 i3Var, int i) {
        Intrinsics.checkNotNullParameter(i3Var, "path");
        Canvas canvas = this.f37515a;
        if (i3Var instanceof C15279o0) {
            canvas.clipPath(((C15279o0) i3Var).mo42922y(), mo42735W(i));
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    /* renamed from: e */
    public void mo42433e(float f, float f2) {
        this.f37515a.translate(f, f2);
    }

    /* renamed from: f */
    public void mo42434f(float f, float f2) {
        this.f37515a.scale(f, f2);
    }

    /* renamed from: g */
    public void mo42435g(float f, float f2, float f3, float f4, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        this.f37515a.drawRect(f, f2, f3, f4, f3Var.mo42764q());
    }

    /* renamed from: h */
    public void mo42436h(float f, float f2, float f3, float f4, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        this.f37515a.drawOval(f, f2, f3, f4, f3Var.mo42764q());
    }

    /* renamed from: i */
    public void mo42437i(int i, @C12579k List<C15094f> list, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(list, "points");
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        C15289p3.C15290a aVar = C15289p3.f37622b;
        if (C15289p3.m66394g(i, aVar.mo42939a())) {
            mo42736a(list, f3Var, 2);
        } else if (C15289p3.m66394g(i, aVar.mo42941c())) {
            mo42736a(list, f3Var, 1);
        } else if (C15289p3.m66394g(i, aVar.mo42940b())) {
            mo42737b(list, f3Var);
        }
    }

    /* renamed from: j */
    public void mo42438j(@C12579k C15403w2 w2Var, long j, long j2, long j3, long j4, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(w2Var, C9127a0.f24709d);
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        Canvas canvas = this.f37515a;
        Bitmap b = C15247k0.m66138b(w2Var);
        Rect rect = this.f37516b;
        rect.left = C16494m.m74581m(j);
        rect.top = C16494m.m74583o(j);
        rect.right = C16494m.m74581m(j) + C16500q.m74662m(j2);
        rect.bottom = C16494m.m74583o(j) + C16500q.m74659j(j2);
        C11079d2 d2Var = C11079d2.f28267a;
        Rect rect2 = this.f37517c;
        rect2.left = C16494m.m74581m(j3);
        rect2.top = C16494m.m74583o(j3);
        rect2.right = C16494m.m74581m(j3) + C16500q.m74662m(j4);
        rect2.bottom = C16494m.m74583o(j3) + C16500q.m74659j(j4);
        canvas.drawBitmap(b, rect, rect2, f3Var.mo42764q());
    }

    /* renamed from: k */
    public void mo42439k(@C12579k C15403w2 w2Var, long j, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(w2Var, C9127a0.f24709d);
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        this.f37515a.drawBitmap(C15247k0.m66138b(w2Var), C15094f.m64880p(j), C15094f.m64882r(j), f3Var.mo42764q());
    }

    /* renamed from: l */
    public void mo42440l(int i, @C12579k float[] fArr, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(fArr, "points");
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        if (fArr.length % 2 == 0) {
            C15289p3.C15290a aVar = C15289p3.f37622b;
            if (C15289p3.m66394g(i, aVar.mo42939a())) {
                mo42731R(fArr, f3Var, 2);
            } else if (C15289p3.m66394g(i, aVar.mo42941c())) {
                mo42731R(fArr, f3Var, 1);
            } else if (C15289p3.m66394g(i, aVar.mo42940b())) {
                mo42732S(fArr, f3Var, 2);
            }
        } else {
            throw new IllegalArgumentException("points must have an even number of values");
        }
    }

    /* renamed from: m */
    public void mo42441m(@C12579k Vertices vertices, int i, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(vertices, "vertices");
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        this.f37515a.drawVertices(C15420z0.m67309a(vertices.mo42410g()), vertices.mo42408e().length, vertices.mo42408e(), 0, vertices.mo42409f(), 0, vertices.mo42406c(), 0, vertices.mo42407d(), 0, vertices.mo42407d().length, f3Var.mo42764q());
    }

    /* renamed from: q */
    public void mo42443q() {
        this.f37515a.restore();
    }

    /* renamed from: t */
    public void mo42444t(float f, float f2, float f3, float f4, float f5, float f6, boolean z, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        this.f37515a.drawArc(f, f2, f3, f4, f5, f6, z, f3Var.mo42764q());
    }

    /* renamed from: u */
    public void mo42445u() {
        C15203e2.f37518a.mo42738a(this.f37515a, true);
    }

    /* renamed from: x */
    public void mo42447x(@C12579k C15098i iVar, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(iVar, "bounds");
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        this.f37515a.saveLayer(iVar.mo42279t(), iVar.mo42249B(), iVar.mo42283x(), iVar.mo42271j(), f3Var.mo42764q(), 31);
    }

    /* renamed from: y */
    public void mo42448y(long j, long j2, @C12579k C15211f3 f3Var) {
        Intrinsics.checkNotNullParameter(f3Var, "paint");
        this.f37515a.drawLine(C15094f.m64880p(j), C15094f.m64882r(j), C15094f.m64880p(j2), C15094f.m64882r(j2), f3Var.mo42764q());
    }
}
