package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C2826e;
import androidx.compose.foundation.text.selection.C2827f;
import androidx.compose.foundation.text.selection.C2829h;
import androidx.compose.foundation.text.selection.C2837n;
import androidx.compose.foundation.text.selection.SelectionAdjustment;
import androidx.compose.foundation.text.selection.SelectionRegistrarKt;
import androidx.compose.p004ui.C8767m;
import androidx.compose.p004ui.draw.DrawModifierKt;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.graphics.C15218g4;
import androidx.compose.p004ui.graphics.C15320t2;
import androidx.compose.p004ui.graphics.C15329u3;
import androidx.compose.p004ui.input.pointer.PointerIconKt;
import androidx.compose.p004ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p004ui.layout.C15560f0;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.p004ui.semantics.SemanticsModifierKt;
import androidx.compose.p004ui.text.C16156d;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.runtime.C8547h2;
import androidx.compose.runtime.C8616s1;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,702:1\n1#2:703\n*E\n"})
public final class TextController implements C8616s1 {
    @C12579k

    /* renamed from: a */
    public final TextState f7169a;
    @C12580l

    /* renamed from: b */
    public C2837n f7170b;

    /* renamed from: c */
    public C2846t f7171c;
    @C12579k

    /* renamed from: d */
    public final C15560f0 f7172d = new TextController$measurePolicy$1(this);
    @C12579k

    /* renamed from: e */
    public final C8767m f7173e;
    @C12579k

    /* renamed from: f */
    public C8767m f7174f;
    @C12579k

    /* renamed from: g */
    public C8767m f7175g;

    /* renamed from: androidx.compose.foundation.text.TextController$a */
    public static final class C2727a implements C2846t {

        /* renamed from: a */
        public long f7176a;

        /* renamed from: b */
        public long f7177b;

        /* renamed from: c */
        public final /* synthetic */ TextController f7178c;

        /* renamed from: d */
        public final /* synthetic */ C2837n f7179d;

        public C2727a(TextController textController, C2837n nVar) {
            this.f7178c = textController;
            this.f7179d = nVar;
            C15094f.C15095a aVar = C15094f.f37256b;
            this.f7176a = aVar.mo42248e();
            this.f7177b = aVar.mo42248e();
        }

        /* renamed from: a */
        public void mo9336a() {
            if (SelectionRegistrarKt.m12854b(this.f7179d, this.f7178c.mo9331l().mo9473h())) {
                this.f7179d.mo9708i();
            }
        }

        /* renamed from: b */
        public void mo9337b(long j) {
        }

        /* renamed from: c */
        public void mo9338c(long j) {
            C15588o b = this.f7178c.mo9331l().mo9467b();
            if (b != null) {
                TextController textController = this.f7178c;
                C2837n nVar = this.f7179d;
                if (b.mo44436k()) {
                    if (textController.mo9332m(j, j)) {
                        nVar.mo9707h(textController.mo9331l().mo9473h());
                    } else {
                        nVar.mo9701b(b, j, SelectionAdjustment.f7343a.mo9600g());
                    }
                    this.f7176a = j;
                } else {
                    return;
                }
            }
            if (SelectionRegistrarKt.m12854b(this.f7179d, this.f7178c.mo9331l().mo9473h())) {
                this.f7177b = C15094f.f37256b.mo42248e();
            }
        }

        /* renamed from: d */
        public void mo9339d() {
        }

        /* renamed from: e */
        public void mo9340e(long j) {
            C15588o b = this.f7178c.mo9331l().mo9467b();
            if (b != null) {
                C2837n nVar = this.f7179d;
                TextController textController = this.f7178c;
                if (b.mo44436k() && SelectionRegistrarKt.m12854b(nVar, textController.mo9331l().mo9473h())) {
                    long v = C15094f.m64886v(this.f7177b, j);
                    this.f7177b = v;
                    long v2 = C15094f.m64886v(this.f7176a, v);
                    if (!textController.mo9332m(this.f7176a, v2)) {
                        if (nVar.mo9705f(b, v2, this.f7176a, false, SelectionAdjustment.f7343a.mo9597d())) {
                            this.f7176a = v2;
                            this.f7177b = C15094f.f37256b.mo42248e();
                        }
                    }
                }
            }
        }

        /* renamed from: f */
        public final long mo9341f() {
            return this.f7177b;
        }

        /* renamed from: g */
        public final long mo9342g() {
            return this.f7176a;
        }

        /* renamed from: h */
        public final void mo9343h(long j) {
            this.f7177b = j;
        }

        /* renamed from: i */
        public final void mo9344i(long j) {
            this.f7176a = j;
        }

        public void onCancel() {
            if (SelectionRegistrarKt.m12854b(this.f7179d, this.f7178c.mo9331l().mo9473h())) {
                this.f7179d.mo9708i();
            }
        }
    }

    /* renamed from: androidx.compose.foundation.text.TextController$b */
    public static final class C2728b implements C2826e {

        /* renamed from: a */
        public long f7180a = C15094f.f37256b.mo42248e();

        /* renamed from: b */
        public final /* synthetic */ TextController f7181b;

        /* renamed from: c */
        public final /* synthetic */ C2837n f7182c;

        public C2728b(TextController textController, C2837n nVar) {
            this.f7181b = textController;
            this.f7182c = nVar;
        }

        /* renamed from: a */
        public boolean mo9346a(long j) {
            C15588o b = this.f7181b.mo9331l().mo9467b();
            if (b == null) {
                return true;
            }
            C2837n nVar = this.f7182c;
            TextController textController = this.f7181b;
            if (!b.mo44436k() || !SelectionRegistrarKt.m12854b(nVar, textController.mo9331l().mo9473h())) {
                return false;
            }
            if (!nVar.mo9705f(b, j, this.f7180a, false, SelectionAdjustment.f7343a.mo9598e())) {
                return true;
            }
            this.f7180a = j;
            return true;
        }

        /* renamed from: b */
        public boolean mo9347b(long j, @C12579k SelectionAdjustment selectionAdjustment) {
            Intrinsics.checkNotNullParameter(selectionAdjustment, "adjustment");
            C15588o b = this.f7181b.mo9331l().mo9467b();
            if (b == null) {
                return false;
            }
            C2837n nVar = this.f7182c;
            TextController textController = this.f7181b;
            if (!b.mo44436k()) {
                return false;
            }
            nVar.mo9701b(b, j, selectionAdjustment);
            this.f7180a = j;
            return SelectionRegistrarKt.m12854b(nVar, textController.mo9331l().mo9473h());
        }

        /* renamed from: c */
        public boolean mo9348c(long j, @C12579k SelectionAdjustment selectionAdjustment) {
            Intrinsics.checkNotNullParameter(selectionAdjustment, "adjustment");
            C15588o b = this.f7181b.mo9331l().mo9467b();
            if (b != null) {
                C2837n nVar = this.f7182c;
                TextController textController = this.f7181b;
                if (!b.mo44436k() || !SelectionRegistrarKt.m12854b(nVar, textController.mo9331l().mo9473h())) {
                    return false;
                }
                if (nVar.mo9705f(b, j, this.f7180a, false, selectionAdjustment)) {
                    this.f7180a = j;
                }
            }
            return true;
        }

        /* renamed from: d */
        public boolean mo9349d(long j) {
            C15588o b = this.f7181b.mo9331l().mo9467b();
            if (b == null) {
                return false;
            }
            C2837n nVar = this.f7182c;
            TextController textController = this.f7181b;
            if (!b.mo44436k()) {
                return false;
            }
            if (nVar.mo9705f(b, j, this.f7180a, false, SelectionAdjustment.f7343a.mo9598e())) {
                this.f7180a = j;
            }
            return SelectionRegistrarKt.m12854b(nVar, textController.mo9331l().mo9473h());
        }

        /* renamed from: e */
        public final long mo9350e() {
            return this.f7180a;
        }

        /* renamed from: f */
        public final void mo9351f(long j) {
            this.f7180a = j;
        }
    }

    public TextController(@C12579k TextState textState) {
        Intrinsics.checkNotNullParameter(textState, "state");
        this.f7169a = textState;
        C8767m.C8768a aVar = C8767m.f23478j;
        this.f7173e = OnGloballyPositionedModifierKt.m68999a(mo9326f(aVar), new TextController$coreModifiers$1(this));
        this.f7174f = mo9325c(textState.mo9475j().mo9579n());
        this.f7175g = aVar;
    }

    /* renamed from: c */
    public final C8767m mo9325c(C16156d dVar) {
        return SemanticsModifierKt.m71868c(C8767m.f23478j, false, new TextController$createSemanticsModifierFor$1(dVar, this), 1, (Object) null);
    }

    /* renamed from: d */
    public void mo8797d() {
        C2837n nVar = this.f7170b;
        if (nVar != null) {
            TextState textState = this.f7169a;
            textState.mo9482q(nVar.mo9709j(new C2827f(textState.mo9473h(), new TextController$onRemembered$1$1(this), new TextController$onRemembered$1$2(this))));
        }
    }

    /* renamed from: e */
    public void mo8799e() {
        C2837n nVar;
        C2829h g = this.f7169a.mo9472g();
        if (g != null && (nVar = this.f7170b) != null) {
            nVar.mo9704e(g);
        }
    }

    @C8547h2
    /* renamed from: f */
    public final C8767m mo9326f(C8767m mVar) {
        return DrawModifierKt.m32436a(C15320t2.m66561e(mVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, (C15218g4) null, false, (C15329u3) null, 0, 0, 0, 131071, (Object) null), new TextController$drawTextAndSelectionBehind$1(this));
    }

    /* renamed from: g */
    public void mo8800g() {
        C2837n nVar;
        C2829h g = this.f7169a.mo9472g();
        if (g != null && (nVar = this.f7170b) != null) {
            nVar.mo9704e(g);
        }
    }

    @C12579k
    /* renamed from: h */
    public final C2846t mo9327h() {
        C2846t tVar = this.f7171c;
        if (tVar != null) {
            return tVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("longPressDragObserver");
        return null;
    }

    @C12579k
    /* renamed from: i */
    public final C15560f0 mo9328i() {
        return this.f7172d;
    }

    @C12579k
    /* renamed from: j */
    public final C8767m mo9329j() {
        return HeightInLinesModifierKt.m12294b(this.f7173e, this.f7169a.mo9475j().mo9578m(), this.f7169a.mo9475j().mo9572g(), 0, 4, (Object) null).mo17224k3(this.f7174f).mo17224k3(this.f7175g);
    }

    @C12579k
    /* renamed from: k */
    public final C8767m mo9330k() {
        return this.f7174f;
    }

    @C12579k
    /* renamed from: l */
    public final TextState mo9331l() {
        return this.f7169a;
    }

    /* renamed from: m */
    public final boolean mo9332m(long j, long j2) {
        C16260h0 d = this.f7169a.mo9469d();
        if (d == null) {
            return false;
        }
        int length = d.mo47058l().mo47040n().mo46683j().length();
        int x = d.mo47070x(j);
        int x2 = d.mo47070x(j2);
        int i = length - 1;
        if ((x < i || x2 < i) && (x >= 0 || x2 >= 0)) {
            return false;
        }
        return true;
    }

    /* renamed from: n */
    public final void mo9333n(@C12579k C2846t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<set-?>");
        this.f7171c = tVar;
    }

    /* renamed from: o */
    public final void mo9334o(@C12579k C2785r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "textDelegate");
        if (this.f7169a.mo9475j() != rVar) {
            this.f7169a.mo9484s(rVar);
            this.f7174f = mo9325c(this.f7169a.mo9475j().mo9579n());
        }
    }

    /* renamed from: p */
    public final void mo9335p(@C12580l C2837n nVar) {
        C8767m mVar;
        this.f7170b = nVar;
        if (nVar == null) {
            mVar = C8767m.f23478j;
        } else if (C2761b0.m12554a()) {
            mo9333n(new C2727a(this, nVar));
            mVar = SuspendingPointerInputFilterKt.m68437c(C8767m.f23478j, mo9327h(), new TextController$update$2(this, (C11045c<? super TextController$update$2>) null));
        } else {
            C2728b bVar = new C2728b(this, nVar);
            mVar = PointerIconKt.m68353b(SuspendingPointerInputFilterKt.m68437c(C8767m.f23478j, bVar, new TextController$update$3(bVar, (C11045c<? super TextController$update$3>) null)), C2759a0.m12548a(), false, 2, (Object) null);
        }
        this.f7175g = mVar;
    }
}
