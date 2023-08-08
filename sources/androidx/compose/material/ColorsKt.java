package androidx.compose.material;

import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.graphics.C15258l2;
import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8550i1;
import androidx.compose.runtime.C8582l1;
import androidx.compose.runtime.C8592o;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,337:1\n658#2:338\n646#2:339\n76#3:340\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n*L\n297#1:338\n297#1:339\n297#1:340\n*E\n"})
public final class ColorsKt {
    @C12579k

    /* renamed from: a */
    public static final C8550i1<C7901q> f7586a = CompositionLocalKt.m29859e(ColorsKt$LocalColors$1.f7587f);

    /* renamed from: a */
    public static final long m13380a(@C12579k C7901q qVar, long j) {
        Intrinsics.checkNotNullParameter(qVar, "$this$contentColorFor");
        if (C15240j2.m66082y(j, qVar.mo10971j())) {
            return qVar.mo10968g();
        }
        if (C15240j2.m66082y(j, qVar.mo10972k())) {
            return qVar.mo10968g();
        }
        if (C15240j2.m66082y(j, qVar.mo10973l())) {
            return qVar.mo10969h();
        }
        if (C15240j2.m66082y(j, qVar.mo10974m())) {
            return qVar.mo10969h();
        }
        if (C15240j2.m66082y(j, qVar.mo10964c())) {
            return qVar.mo10966e();
        }
        if (C15240j2.m66082y(j, qVar.mo10975n())) {
            return qVar.mo10970i();
        }
        if (C15240j2.m66082y(j, qVar.mo10965d())) {
            return qVar.mo10967f();
        }
        return C15240j2.f37547b.mo42851u();
    }

    @C8540g
    @C8582l1
    /* renamed from: b */
    public static final long m13381b(long j, @C12580l C8592o oVar, int i) {
        boolean z;
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29845w0(441849991, i, -1, "androidx.compose.material.contentColorFor (Colors.kt:295)");
        }
        long a = m13380a(C7933t0.f19075a.mo11075a(oVar, 6), j);
        if (a != C15240j2.f37547b.mo42851u()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            a = ((C15240j2) oVar.mo15032w(ContentColorKt.m13406a())).mo42833M();
        }
        if (ComposerKt.m29813g0()) {
            ComposerKt.m29843v0();
        }
        return a;
    }

    @C12579k
    /* renamed from: c */
    public static final C7901q m13382c(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new C7901q(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, false, (DefaultConstructorMarker) null);
    }

    /* renamed from: d */
    public static /* synthetic */ C7901q m13383d(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        int i2 = i;
        if ((i2 & 1) != 0) {
            j13 = C15258l2.m66179d(4290479868L);
        } else {
            j13 = j;
        }
        if ((i2 & 2) != 0) {
            j14 = C15258l2.m66179d(4281794739L);
        } else {
            j14 = j2;
        }
        if ((i2 & 4) != 0) {
            j15 = C15258l2.m66179d(4278442694L);
        } else {
            j15 = j3;
        }
        if ((i2 & 8) != 0) {
            j16 = j15;
        } else {
            j16 = j4;
        }
        if ((i2 & 16) != 0) {
            j17 = C15258l2.m66179d(4279374354L);
        } else {
            j17 = j5;
        }
        if ((i2 & 32) != 0) {
            j18 = C15258l2.m66179d(4279374354L);
        } else {
            j18 = j6;
        }
        if ((i2 & 64) != 0) {
            j19 = C15258l2.m66179d(4291782265L);
        } else {
            j19 = j7;
        }
        if ((i2 & 128) != 0) {
            j20 = C15240j2.f37547b.mo42841a();
        } else {
            j20 = j8;
        }
        if ((i2 & 256) != 0) {
            j21 = C15240j2.f37547b.mo42841a();
        } else {
            j21 = j9;
        }
        if ((i2 & 512) != 0) {
            j22 = C15240j2.f37547b.mo42852w();
        } else {
            j22 = j10;
        }
        if ((i2 & 1024) != 0) {
            j23 = C15240j2.f37547b.mo42852w();
        } else {
            j23 = j11;
        }
        if ((i2 & 2048) != 0) {
            j24 = C15240j2.f37547b.mo42841a();
        } else {
            j24 = j12;
        }
        return m13382c(j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24);
    }

    @C12579k
    /* renamed from: e */
    public static final C8550i1<C7901q> m13384e() {
        return f7586a;
    }

    /* renamed from: f */
    public static final long m13385f(@C12579k C7901q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        if (qVar.mo10976o()) {
            return qVar.mo10971j();
        }
        return qVar.mo10975n();
    }

    @C12579k
    /* renamed from: g */
    public static final C7901q m13386g(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12) {
        return new C7901q(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, true, (DefaultConstructorMarker) null);
    }

    /* renamed from: h */
    public static /* synthetic */ C7901q m13387h(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, int i, Object obj) {
        long j13;
        long j14;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        long j20;
        long j21;
        long j22;
        long j23;
        long j24;
        int i2 = i;
        if ((i2 & 1) != 0) {
            j13 = C15258l2.m66179d(4284612846L);
        } else {
            j13 = j;
        }
        if ((i2 & 2) != 0) {
            j14 = C15258l2.m66179d(4281794739L);
        } else {
            j14 = j2;
        }
        if ((i2 & 4) != 0) {
            j15 = C15258l2.m66179d(4278442694L);
        } else {
            j15 = j3;
        }
        if ((i2 & 8) != 0) {
            j16 = C15258l2.m66179d(4278290310L);
        } else {
            j16 = j4;
        }
        if ((i2 & 16) != 0) {
            j17 = C15240j2.f37547b.mo42852w();
        } else {
            j17 = j5;
        }
        if ((i2 & 32) != 0) {
            j18 = C15240j2.f37547b.mo42852w();
        } else {
            j18 = j6;
        }
        if ((i2 & 64) != 0) {
            j19 = C15258l2.m66179d(4289724448L);
        } else {
            j19 = j7;
        }
        if ((i2 & 128) != 0) {
            j20 = C15240j2.f37547b.mo42852w();
        } else {
            j20 = j8;
        }
        long j25 = j20;
        if ((i2 & 256) != 0) {
            j21 = C15240j2.f37547b.mo42841a();
        } else {
            j21 = j9;
        }
        long j26 = j21;
        if ((i2 & 512) != 0) {
            j22 = C15240j2.f37547b.mo42841a();
        } else {
            j22 = j10;
        }
        long j27 = j22;
        if ((i2 & 1024) != 0) {
            j23 = C15240j2.f37547b.mo42841a();
        } else {
            j23 = j11;
        }
        if ((i2 & 2048) != 0) {
            j24 = C15240j2.f37547b.mo42852w();
        } else {
            j24 = j12;
        }
        return m13386g(j13, j14, j15, j16, j17, j18, j19, j25, j26, j27, j23, j24);
    }

    /* renamed from: i */
    public static final void m13388i(@C12579k C7901q qVar, @C12579k C7901q qVar2) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        Intrinsics.checkNotNullParameter(qVar2, "other");
        qVar.mo10986x(qVar2.mo10971j());
        qVar.mo10987y(qVar2.mo10972k());
        qVar.mo10988z(qVar2.mo10973l());
        qVar.mo10961A(qVar2.mo10974m());
        qVar.mo10977p(qVar2.mo10964c());
        qVar.mo10962B(qVar2.mo10975n());
        qVar.mo10978q(qVar2.mo10965d());
        qVar.mo10983u(qVar2.mo10968g());
        qVar.mo10984v(qVar2.mo10969h());
        qVar.mo10980s(qVar2.mo10966e());
        qVar.mo10985w(qVar2.mo10970i());
        qVar.mo10981t(qVar2.mo10967f());
        qVar.mo10979r(qVar2.mo10976o());
    }
}
