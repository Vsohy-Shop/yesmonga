package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C2829h;
import androidx.compose.p004ui.geometry.C15094f;
import androidx.compose.p004ui.graphics.C15240j2;
import androidx.compose.p004ui.layout.C15588o;
import androidx.compose.p004ui.text.C16260h0;
import androidx.compose.runtime.C8415c2;
import androidx.compose.runtime.C8700z0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nCoreText.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,702:1\n76#2:703\n102#2,2:704\n76#2:706\n102#2,2:707\n*S KotlinDebug\n*F\n+ 1 CoreText.kt\nandroidx/compose/foundation/text/TextState\n*L\n579#1:703\n579#1:704,2\n581#1:706\n581#1:707,2\n*E\n"})
public final class TextState {

    /* renamed from: a */
    public final long f7244a;
    @C12579k

    /* renamed from: b */
    public C11300l<? super C16260h0, C11079d2> f7245b = TextState$onTextLayout$1.f7254f;
    @C12580l

    /* renamed from: c */
    public C2829h f7246c;
    @C12580l

    /* renamed from: d */
    public C15588o f7247d;
    @C12579k

    /* renamed from: e */
    public C2785r f7248e;
    @C12580l

    /* renamed from: f */
    public C16260h0 f7249f;

    /* renamed from: g */
    public long f7250g;

    /* renamed from: h */
    public long f7251h;
    @C12579k

    /* renamed from: i */
    public final C8700z0 f7252i;
    @C12579k

    /* renamed from: j */
    public final C8700z0 f7253j;

    public TextState(@C12579k C2785r rVar, long j) {
        Intrinsics.checkNotNullParameter(rVar, "textDelegate");
        this.f7244a = j;
        this.f7248e = rVar;
        this.f7250g = C15094f.f37256b.mo42248e();
        this.f7251h = C15240j2.f37547b.mo42851u();
        C11079d2 d2Var = C11079d2.f28267a;
        this.f7252i = C8415c2.m30241j(d2Var, C8415c2.m30243l());
        this.f7253j = C8415c2.m30241j(d2Var, C8415c2.m30243l());
    }

    @C12579k
    /* renamed from: a */
    public final C11079d2 mo9466a() {
        this.f7252i.getValue();
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: b */
    public final C15588o mo9467b() {
        return this.f7247d;
    }

    @C12579k
    /* renamed from: c */
    public final C11079d2 mo9468c() {
        this.f7253j.getValue();
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: d */
    public final C16260h0 mo9469d() {
        return this.f7249f;
    }

    @C12579k
    /* renamed from: e */
    public final C11300l<C16260h0, C11079d2> mo9470e() {
        return this.f7245b;
    }

    /* renamed from: f */
    public final long mo9471f() {
        return this.f7250g;
    }

    @C12580l
    /* renamed from: g */
    public final C2829h mo9472g() {
        return this.f7246c;
    }

    /* renamed from: h */
    public final long mo9473h() {
        return this.f7244a;
    }

    /* renamed from: i */
    public final long mo9474i() {
        return this.f7251h;
    }

    @C12579k
    /* renamed from: j */
    public final C2785r mo9475j() {
        return this.f7248e;
    }

    /* renamed from: k */
    public final void mo9476k(C11079d2 d2Var) {
        this.f7252i.setValue(d2Var);
    }

    /* renamed from: l */
    public final void mo9477l(@C12580l C15588o oVar) {
        this.f7247d = oVar;
    }

    /* renamed from: m */
    public final void mo9478m(C11079d2 d2Var) {
        this.f7253j.setValue(d2Var);
    }

    /* renamed from: n */
    public final void mo9479n(@C12580l C16260h0 h0Var) {
        mo9476k(C11079d2.f28267a);
        this.f7249f = h0Var;
    }

    /* renamed from: o */
    public final void mo9480o(@C12579k C11300l<? super C16260h0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f7245b = lVar;
    }

    /* renamed from: p */
    public final void mo9481p(long j) {
        this.f7250g = j;
    }

    /* renamed from: q */
    public final void mo9482q(@C12580l C2829h hVar) {
        this.f7246c = hVar;
    }

    /* renamed from: r */
    public final void mo9483r(long j) {
        this.f7251h = j;
    }

    /* renamed from: s */
    public final void mo9484s(@C12579k C2785r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "value");
        mo9478m(C11079d2.f28267a);
        this.f7248e = rVar;
    }
}
