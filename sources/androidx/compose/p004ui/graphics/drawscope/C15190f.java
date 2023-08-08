package androidx.compose.p004ui.graphics.drawscope;

import androidx.compose.p004ui.geometry.C15104m;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15229i2;
import androidx.compose.p004ui.graphics.C15231i3;
import androidx.compose.p004ui.graphics.C15281o2;
import com.carrefour.fid.android.shared.constant.C28534f;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nDrawScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,971:1\n66#1,4:972\n261#1,11:976\n261#1,11:987\n261#1,11:998\n261#1,11:1009\n261#1,11:1020\n261#1,11:1031\n*S KotlinDebug\n*F\n+ 1 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n104#1:972,4\n140#1:976,11\n157#1:987,11\n178#1:998,11\n195#1:1009,11\n221#1:1020,11\n237#1:1031,11\n*E\n"})
/* renamed from: androidx.compose.ui.graphics.drawscope.f */
public final class C15190f {
    /* renamed from: a */
    public static final void m65785a(@C12579k C15187e eVar, @C12579k C15231i3 i3Var, int i, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$clipPath");
        Intrinsics.checkNotNullParameter(i3Var, "path");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42711d(i3Var, i);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: b */
    public static /* synthetic */ void m65786b(C15187e eVar, C15231i3 i3Var, int i, C11300l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = C15229i2.f37536b.mo42798b();
        }
        Intrinsics.checkNotNullParameter(eVar, "$this$clipPath");
        Intrinsics.checkNotNullParameter(i3Var, "path");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42711d(i3Var, i);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: c */
    public static final void m65787c(@C12579k C15187e eVar, float f, float f2, float f3, float f4, int i, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        C15187e eVar2 = eVar;
        C11300l<? super C15187e, C11079d2> lVar2 = lVar;
        Intrinsics.checkNotNullParameter(eVar, "$this$clipRect");
        Intrinsics.checkNotNullParameter(lVar2, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42710c(f, f2, f3, f4, i);
        lVar2.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: d */
    public static /* synthetic */ void m65788d(C15187e eVar, float f, float f2, float f3, float f4, int i, C11300l lVar, int i2, Object obj) {
        float f5;
        float f6;
        if ((i2 & 1) != 0) {
            f5 = 0.0f;
        } else {
            f5 = f;
        }
        if ((i2 & 2) != 0) {
            f6 = 0.0f;
        } else {
            f6 = f2;
        }
        if ((i2 & 4) != 0) {
            f3 = C15104m.m65023t(eVar.mo42718b());
        }
        float f7 = f3;
        if ((i2 & 8) != 0) {
            f4 = C15104m.m65016m(eVar.mo42718b());
        }
        float f8 = f4;
        if ((i2 & 16) != 0) {
            i = C15229i2.f37536b.mo42798b();
        }
        Intrinsics.checkNotNullParameter(eVar, "$this$clipRect");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42710c(f5, f6, f7, f8, i);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: e */
    public static final void m65789e(@C12579k C15187e eVar, @C12579k C11300l<? super C15118b2, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        lVar.invoke(eVar.mo42683q5().mo42705c());
    }

    /* renamed from: f */
    public static final void m65790f(@C12579k C15187e eVar, float f, float f2, float f3, float f4, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        eVar.mo42683q5().mo42703a().mo42715n(f, f2, f3, f4);
        lVar.invoke(eVar);
        eVar.mo42683q5().mo42703a().mo42715n(-f, -f2, -f3, -f4);
    }

    /* renamed from: g */
    public static final void m65791g(@C12579k C15187e eVar, float f, float f2, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        eVar.mo42683q5().mo42703a().mo42715n(f, f2, f, f2);
        lVar.invoke(eVar);
        float f3 = -f;
        float f4 = -f2;
        eVar.mo42683q5().mo42703a().mo42715n(f3, f4, f3, f4);
    }

    /* renamed from: h */
    public static final void m65792h(@C12579k C15187e eVar, float f, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        eVar.mo42683q5().mo42703a().mo42715n(f, f, f, f);
        lVar.invoke(eVar);
        float f2 = -f;
        eVar.mo42683q5().mo42703a().mo42715n(f2, f2, f2, f2);
    }

    /* renamed from: i */
    public static /* synthetic */ void m65793i(C15187e eVar, float f, float f2, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        eVar.mo42683q5().mo42703a().mo42715n(f, f2, f, f2);
        lVar.invoke(eVar);
        float f3 = -f;
        float f4 = -f2;
        eVar.mo42683q5().mo42703a().mo42715n(f3, f4, f3, f4);
    }

    /* renamed from: j */
    public static final void m65794j(@C12579k C15187e eVar, float f, long j, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$rotate");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42714k(f, j);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: k */
    public static /* synthetic */ void m65795k(C15187e eVar, float f, long j, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = eVar.mo42717U();
        }
        Intrinsics.checkNotNullParameter(eVar, "$this$rotate");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42714k(f, j);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: l */
    public static final void m65796l(@C12579k C15187e eVar, float f, long j, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$rotateRad");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42714k(C15281o2.m66362a(f), j);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: m */
    public static /* synthetic */ void m65797m(C15187e eVar, float f, long j, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = eVar.mo42717U();
        }
        Intrinsics.checkNotNullParameter(eVar, "$this$rotateRad");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42714k(C15281o2.m66362a(f), j);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: n */
    public static final void m65798n(@C12579k C15187e eVar, float f, float f2, long j, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$scale");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42713j(f, f2, j);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: o */
    public static /* synthetic */ void m65799o(C15187e eVar, float f, float f2, long j, C11300l lVar, int i, Object obj) {
        if ((i & 4) != 0) {
            j = eVar.mo42717U();
        }
        Intrinsics.checkNotNullParameter(eVar, "$this$scale");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42713j(f, f2, j);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: p */
    public static final void m65800p(@C12579k C15187e eVar, float f, long j, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$scale");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42713j(f, f, j);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: q */
    public static /* synthetic */ void m65801q(C15187e eVar, float f, long j, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            j = eVar.mo42717U();
        }
        Intrinsics.checkNotNullParameter(eVar, "$this$scale");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        q5.mo42703a().mo42713j(f, f, j);
        lVar.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }

    /* renamed from: r */
    public static final void m65802r(@C12579k C15187e eVar, float f, float f2, @C12579k C11300l<? super C15187e, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        eVar.mo42683q5().mo42703a().mo42712e(f, f2);
        lVar.invoke(eVar);
        eVar.mo42683q5().mo42703a().mo42712e(-f, -f2);
    }

    /* renamed from: s */
    public static /* synthetic */ void m65803s(C15187e eVar, float f, float f2, C11300l lVar, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, C28534f.f69159i0);
        eVar.mo42683q5().mo42703a().mo42712e(f, f2);
        lVar.invoke(eVar);
        eVar.mo42683q5().mo42703a().mo42712e(-f, -f2);
    }

    /* renamed from: t */
    public static final void m65804t(@C12579k C15187e eVar, @C12579k C11300l<? super C15193i, C11079d2> lVar, @C12579k C11300l<? super C15187e, C11079d2> lVar2) {
        Intrinsics.checkNotNullParameter(eVar, "<this>");
        Intrinsics.checkNotNullParameter(lVar, "transformBlock");
        Intrinsics.checkNotNullParameter(lVar2, "drawBlock");
        C15186d q5 = eVar.mo42683q5();
        long b = q5.mo42704b();
        q5.mo42705c().mo42422E();
        lVar.invoke(q5.mo42703a());
        lVar2.invoke(eVar);
        q5.mo42705c().mo42443q();
        q5.mo42706d(b);
    }
}
