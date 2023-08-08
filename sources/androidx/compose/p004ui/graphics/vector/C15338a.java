package androidx.compose.p004ui.graphics.vector;

import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15173d2;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15249k2;
import androidx.compose.p004ui.graphics.C15325u1;
import androidx.compose.p004ui.graphics.C15403w2;
import androidx.compose.p004ui.graphics.C15417y2;
import androidx.compose.p004ui.graphics.colorspace.C15138c;
import androidx.compose.p004ui.graphics.drawscope.C15179a;
import androidx.compose.p004ui.graphics.drawscope.C15187e;
import androidx.compose.p004ui.graphics.drawscope.C15192h;
import androidx.compose.p004ui.unit.C16479d;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.C16502r;
import androidx.compose.p004ui.unit.LayoutDirection;
import com.carrefour.fid.android.shared.constant.C28534f;
import com.contentsquare.android.api.C14092c;
import kotlin.C11079d2;
import kotlin.C11532s0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nDrawCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n+ 2 CanvasDrawScope.kt\nandroidx/compose/ui/graphics/drawscope/CanvasDrawScope\n*L\n1#1,106:1\n558#2,17:107\n*S KotlinDebug\n*F\n+ 1 DrawCache.kt\nandroidx/compose/ui/graphics/vector/DrawCache\n*L\n76#1:107,17\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.vector.a */
public final class C15338a {
    @C12580l

    /* renamed from: a */
    public C15403w2 f37805a;
    @C12580l

    /* renamed from: b */
    public C15118b2 f37806b;
    @C12580l

    /* renamed from: c */
    public C16479d f37807c;
    @C12579k

    /* renamed from: d */
    public LayoutDirection f37808d = LayoutDirection.Ltr;

    /* renamed from: e */
    public long f37809e = C16500q.f40900b.mo47897a();
    @C12579k

    /* renamed from: f */
    public final C15179a f37810f = new C15179a();

    /* renamed from: d */
    public static /* synthetic */ void m66828d(C15338a aVar, C15187e eVar, float f, C15249k2 k2Var, int i, Object obj) {
        if ((i & 2) != 0) {
            f = 1.0f;
        }
        if ((i & 4) != 0) {
            k2Var = null;
        }
        aVar.mo43139c(eVar, f, k2Var);
    }

    @C11532s0
    /* renamed from: f */
    public static /* synthetic */ void m66829f() {
    }

    /* renamed from: a */
    public final void mo43137a(C15187e eVar) {
        C15187e.m65710e5(eVar, C15240j2.f37547b.mo42841a(), 0, 0, 0.0f, (C15192h) null, (C15249k2) null, C15325u1.f37708b.mo43017a(), 62, (Object) null);
    }

    /* renamed from: b */
    public final void mo43138b(long j, @C12579k C16479d dVar, @C12579k LayoutDirection layoutDirection, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        C16479d dVar2 = dVar;
        LayoutDirection layoutDirection2 = layoutDirection;
        C11300l<? super C15187e, C11079d2> lVar2 = lVar;
        Intrinsics.checkNotNullParameter(dVar2, "density");
        Intrinsics.checkNotNullParameter(layoutDirection2, "layoutDirection");
        Intrinsics.checkNotNullParameter(lVar2, C28534f.f69159i0);
        this.f37807c = dVar2;
        this.f37808d = layoutDirection2;
        C15403w2 w2Var = this.f37805a;
        C15118b2 b2Var = this.f37806b;
        if (w2Var == null || b2Var == null || C16500q.m74662m(j) > w2Var.getWidth() || C16500q.m74659j(j) > w2Var.getHeight()) {
            w2Var = C15417y2.m67304b(C16500q.m74662m(j), C16500q.m74659j(j), 0, false, (C15138c) null, 28, (Object) null);
            b2Var = C15173d2.m65563a(w2Var);
            this.f37805a = w2Var;
            this.f37806b = b2Var;
        }
        this.f37809e = j;
        C15179a aVar = this.f37810f;
        long f = C16502r.m74673f(j);
        C15179a.C15180a A = aVar.mo42656A();
        C16479d a = A.mo42687a();
        LayoutDirection b = A.mo42688b();
        C15118b2 c = A.mo42689c();
        long d = A.mo42690d();
        C15179a.C15180a A2 = aVar.mo42656A();
        A2.mo42699l(dVar2);
        A2.mo42700m(layoutDirection2);
        A2.mo42698k(b2Var);
        A2.mo42701n(f);
        b2Var.mo42422E();
        mo43137a(aVar);
        lVar2.invoke(aVar);
        b2Var.mo42443q();
        C15179a.C15180a A3 = aVar.mo42656A();
        A3.mo42699l(a);
        A3.mo42700m(b);
        A3.mo42698k(c);
        A3.mo42701n(d);
        w2Var.mo42786c();
    }

    /* renamed from: c */
    public final void mo43139c(@C12579k C15187e eVar, float f, @C12580l C15249k2 k2Var) {
        boolean z;
        Intrinsics.checkNotNullParameter(eVar, "target");
        C15403w2 w2Var = this.f37805a;
        if (w2Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C15187e.m65715m0(eVar, w2Var, 0, this.f37809e, 0, 0, f, (C15192h) null, k2Var, 0, 0, C14092c.f34597e2, (Object) null);
            return;
        }
        throw new IllegalStateException("drawCachedImage must be invoked first before attempting to draw the result into another destination".toString());
    }

    @C12580l
    /* renamed from: e */
    public final C15403w2 mo43140e() {
        return this.f37805a;
    }

    /* renamed from: g */
    public final void mo43141g(@C12580l C15403w2 w2Var) {
        this.f37805a = w2Var;
    }
}
