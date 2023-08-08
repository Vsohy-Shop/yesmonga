package androidx.compose.foundation.text;

import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.geometry.C15096g;
import androidx.compose.p004ui.geometry.C15098i;
import androidx.compose.p004ui.geometry.C15100j;
import androidx.compose.p004ui.geometry.C15106n;
import androidx.compose.p004ui.graphics.C15118b2;
import androidx.compose.p004ui.graphics.C15205e4;
import androidx.compose.p004ui.graphics.C15211f3;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.text.C16151c0;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.p004ui.text.C16352l0;
import androidx.compose.p004ui.text.C16356n0;
import androidx.compose.p004ui.text.C16359o0;
import androidx.compose.p004ui.text.font.C16190e0;
import androidx.compose.p004ui.text.font.C16194f0;
import androidx.compose.p004ui.text.font.C16209i0;
import androidx.compose.p004ui.text.font.C16242u;
import androidx.compose.p004ui.text.input.C16281c0;
import androidx.compose.p004ui.text.input.C16293h;
import androidx.compose.p004ui.text.input.C16310p;
import androidx.compose.p004ui.text.input.C16313q;
import androidx.compose.p004ui.text.input.C16321t0;
import androidx.compose.p004ui.text.input.C16331y0;
import androidx.compose.p004ui.text.input.C16334z0;
import androidx.compose.p004ui.text.input.EditProcessor;
import androidx.compose.p004ui.text.input.TextFieldValue;
import androidx.compose.p004ui.text.intl.C16342f;
import androidx.compose.p004ui.text.style.C16410a;
import androidx.compose.p004ui.text.style.C16434j;
import androidx.compose.p004ui.text.style.C16439m;
import androidx.compose.p004ui.unit.C16500q;
import androidx.compose.p004ui.unit.LayoutDirection;
import java.util.List;
import kotlin.C11079d2;
import kotlin.Triple;
import kotlin.jvm.C11384m;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class TextFieldDelegate {
    @C12579k

    /* renamed from: a */
    public static final Companion f7187a = new Companion((DefaultConstructorMarker) null);

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: d */
        public static /* synthetic */ Triple m12388d(Companion companion, C2785r rVar, long j, LayoutDirection layoutDirection, C16260h0 h0Var, int i, Object obj) {
            if ((i & 8) != 0) {
                h0Var = null;
            }
            return companion.mo9368c(rVar, j, layoutDirection, h0Var);
        }

        @C12579k
        /* renamed from: a */
        public final C16334z0 mo9366a(long j, @C12579k C16334z0 z0Var) {
            Intrinsics.checkNotNullParameter(z0Var, "transformed");
            C16156d.C16157a aVar = new C16156d.C16157a(z0Var.mo47343b());
            aVar.mo46698c(new C16151c0(0, 0, (C16209i0) null, (C16190e0) null, (C16194f0) null, (C16242u) null, (String) null, 0, (C16410a) null, (C16439m) null, (C16342f) null, 0, C16434j.f40726b.mo47683f(), (C15205e4) null, 12287, (DefaultConstructorMarker) null), z0Var.mo47342a().mo9514b(C16356n0.m73742n(j)), z0Var.mo47342a().mo9514b(C16356n0.m73737i(j)));
            return new C16334z0(aVar.mo46716u(), z0Var.mo47342a());
        }

        @C11384m
        /* renamed from: b */
        public final void mo9367b(@C12579k C15118b2 b2Var, @C12579k TextFieldValue textFieldValue, @C12579k C16281c0 c0Var, @C12579k C16260h0 h0Var, @C12579k C15211f3 f3Var) {
            int b;
            int b2;
            Intrinsics.checkNotNullParameter(b2Var, "canvas");
            Intrinsics.checkNotNullParameter(textFieldValue, "value");
            Intrinsics.checkNotNullParameter(c0Var, "offsetMapping");
            Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
            Intrinsics.checkNotNullParameter(f3Var, "selectionPaint");
            if (!C16356n0.m73736h(textFieldValue.mo47113h()) && (b = c0Var.mo9514b(C16356n0.m73740l(textFieldValue.mo47113h()))) != (b2 = c0Var.mo9514b(C16356n0.m73739k(textFieldValue.mo47113h())))) {
                b2Var.mo42427J(h0Var.mo47072z(b, b2), f3Var);
            }
            C16352l0.f40587a.mo47424a(b2Var, h0Var);
        }

        @C12579k
        @C11384m
        /* renamed from: c */
        public final Triple<Integer, Integer, C16260h0> mo9368c(@C12579k C2785r rVar, long j, @C12579k LayoutDirection layoutDirection, @C12580l C16260h0 h0Var) {
            Intrinsics.checkNotNullParameter(rVar, "textDelegate");
            Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
            C16260h0 o = rVar.mo9580o(j, layoutDirection, h0Var);
            return new Triple<>(Integer.valueOf(C16500q.m74662m(o.mo47043B())), Integer.valueOf(C16500q.m74659j(o.mo47043B())), o);
        }

        @C11384m
        /* renamed from: e */
        public final void mo9369e(@C12579k TextFieldValue textFieldValue, @C12579k C2785r rVar, @C12579k C16260h0 h0Var, @C12579k C15588o oVar, @C12579k C16331y0 y0Var, boolean z, @C12579k C16281c0 c0Var) {
            C15098i iVar;
            Intrinsics.checkNotNullParameter(textFieldValue, "value");
            Intrinsics.checkNotNullParameter(rVar, "textDelegate");
            Intrinsics.checkNotNullParameter(h0Var, "textLayoutResult");
            Intrinsics.checkNotNullParameter(oVar, "layoutCoordinates");
            Intrinsics.checkNotNullParameter(y0Var, "textInputSession");
            Intrinsics.checkNotNullParameter(c0Var, "offsetMapping");
            if (z) {
                int b = c0Var.mo9514b(C16356n0.m73739k(textFieldValue.mo47113h()));
                if (b < h0Var.mo47058l().mo47040n().length()) {
                    iVar = h0Var.mo47048d(b);
                } else if (b != 0) {
                    iVar = h0Var.mo47048d(b - 1);
                } else {
                    iVar = new C15098i(0.0f, 0.0f, 1.0f, (float) C16500q.m74659j(C2847u.m13130b(rVar.mo9578m(), rVar.mo9566a(), rVar.mo9567b(), (String) null, 0, 24, (Object) null)));
                }
                long z0 = oVar.mo44440z0(C15096g.m64898a(iVar.mo42279t(), iVar.mo42249B()));
                y0Var.mo47331e(C15100j.m64956c(C15096g.m64898a(C15094f.m64880p(z0), C15094f.m64882r(z0)), C15106n.m65033a(iVar.mo42253G(), iVar.mo42278r())));
            }
        }

        @C11384m
        /* renamed from: f */
        public final void mo9370f(@C12579k C16331y0 y0Var, @C12579k EditProcessor editProcessor, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(y0Var, "textInputSession");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(lVar, "onValueChange");
            lVar.invoke(TextFieldValue.m73307d(editProcessor.mo47082h(), (C16156d) null, 0, (C16356n0) null, 3, (Object) null));
            y0Var.mo47327a();
        }

        @C11384m
        /* renamed from: g */
        public final void mo9371g(@C12579k List<? extends C16293h> list, @C12579k EditProcessor editProcessor, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar, @C12580l C16331y0 y0Var) {
            Intrinsics.checkNotNullParameter(list, "ops");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(lVar, "onValueChange");
            TextFieldValue b = editProcessor.mo47076b(list);
            if (y0Var != null) {
                y0Var.mo47333g((TextFieldValue) null, b);
            }
            lVar.invoke(b);
        }

        @C12579k
        @C11384m
        /* renamed from: h */
        public final C16331y0 mo9372h(@C12579k C16321t0 t0Var, @C12579k TextFieldValue textFieldValue, @C12579k EditProcessor editProcessor, @C12579k C16313q qVar, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar, @C12579k C11300l<? super C16310p, C11079d2> lVar2) {
            Intrinsics.checkNotNullParameter(t0Var, "textInputService");
            Intrinsics.checkNotNullParameter(textFieldValue, "value");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(qVar, "imeOptions");
            Intrinsics.checkNotNullParameter(lVar, "onValueChange");
            Intrinsics.checkNotNullParameter(lVar2, "onImeActionPerformed");
            return mo9373i(t0Var, textFieldValue, editProcessor, qVar, lVar, lVar2);
        }

        @C12579k
        @C11384m
        /* renamed from: i */
        public final C16331y0 mo9373i(@C12579k C16321t0 t0Var, @C12579k TextFieldValue textFieldValue, @C12579k EditProcessor editProcessor, @C12579k C16313q qVar, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar, @C12579k C11300l<? super C16310p, C11079d2> lVar2) {
            Intrinsics.checkNotNullParameter(t0Var, "textInputService");
            Intrinsics.checkNotNullParameter(textFieldValue, "value");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(qVar, "imeOptions");
            Intrinsics.checkNotNullParameter(lVar, "onValueChange");
            Intrinsics.checkNotNullParameter(lVar2, "onImeActionPerformed");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            T d = t0Var.mo47320d(textFieldValue, qVar, new TextFieldDelegate$Companion$restartInput$1(editProcessor, lVar, objectRef), lVar2);
            objectRef.element = d;
            return d;
        }

        @C11384m
        /* renamed from: j */
        public final void mo9374j(long j, @C12579k C2851y yVar, @C12579k EditProcessor editProcessor, @C12579k C16281c0 c0Var, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar) {
            Intrinsics.checkNotNullParameter(yVar, "textLayoutResult");
            Intrinsics.checkNotNullParameter(editProcessor, "editProcessor");
            Intrinsics.checkNotNullParameter(c0Var, "offsetMapping");
            Intrinsics.checkNotNullParameter(lVar, "onValueChange");
            lVar.invoke(TextFieldValue.m73307d(editProcessor.mo47082h(), (C16156d) null, C16359o0.m73779a(c0Var.mo9513a(C2851y.m13148h(yVar, j, false, 2, (Object) null))), (C16356n0) null, 5, (Object) null));
        }

        public Companion() {
        }
    }

    @C11384m
    /* renamed from: a */
    public static final void m12380a(@C12579k C15118b2 b2Var, @C12579k TextFieldValue textFieldValue, @C12579k C16281c0 c0Var, @C12579k C16260h0 h0Var, @C12579k C15211f3 f3Var) {
        f7187a.mo9367b(b2Var, textFieldValue, c0Var, h0Var, f3Var);
    }

    @C12579k
    @C11384m
    /* renamed from: b */
    public static final Triple<Integer, Integer, C16260h0> m12381b(@C12579k C2785r rVar, long j, @C12579k LayoutDirection layoutDirection, @C12580l C16260h0 h0Var) {
        return f7187a.mo9368c(rVar, j, layoutDirection, h0Var);
    }

    @C11384m
    /* renamed from: c */
    public static final void m12382c(@C12579k TextFieldValue textFieldValue, @C12579k C2785r rVar, @C12579k C16260h0 h0Var, @C12579k C15588o oVar, @C12579k C16331y0 y0Var, boolean z, @C12579k C16281c0 c0Var) {
        f7187a.mo9369e(textFieldValue, rVar, h0Var, oVar, y0Var, z, c0Var);
    }

    @C11384m
    /* renamed from: d */
    public static final void m12383d(@C12579k C16331y0 y0Var, @C12579k EditProcessor editProcessor, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar) {
        f7187a.mo9370f(y0Var, editProcessor, lVar);
    }

    @C11384m
    /* renamed from: e */
    public static final void m12384e(@C12579k List<? extends C16293h> list, @C12579k EditProcessor editProcessor, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar, @C12580l C16331y0 y0Var) {
        f7187a.mo9371g(list, editProcessor, lVar, y0Var);
    }

    @C12579k
    @C11384m
    /* renamed from: f */
    public static final C16331y0 m12385f(@C12579k C16321t0 t0Var, @C12579k TextFieldValue textFieldValue, @C12579k EditProcessor editProcessor, @C12579k C16313q qVar, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar, @C12579k C11300l<? super C16310p, C11079d2> lVar2) {
        return f7187a.mo9372h(t0Var, textFieldValue, editProcessor, qVar, lVar, lVar2);
    }

    @C12579k
    @C11384m
    /* renamed from: g */
    public static final C16331y0 m12386g(@C12579k C16321t0 t0Var, @C12579k TextFieldValue textFieldValue, @C12579k EditProcessor editProcessor, @C12579k C16313q qVar, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar, @C12579k C11300l<? super C16310p, C11079d2> lVar2) {
        return f7187a.mo9373i(t0Var, textFieldValue, editProcessor, qVar, lVar, lVar2);
    }

    @C11384m
    /* renamed from: h */
    public static final void m12387h(long j, @C12579k C2851y yVar, @C12579k EditProcessor editProcessor, @C12579k C16281c0 c0Var, @C12579k C11300l<? super TextFieldValue, C11079d2> lVar) {
        f7187a.mo9374j(j, yVar, editProcessor, c0Var, lVar);
    }
}
