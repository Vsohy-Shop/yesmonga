package androidx.compose.p004ui.focus;

import androidx.compose.runtime.internal.C8567o;
import com.urbanairship.iam.C9168d0;
import kotlin.C11395k;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11395k(message = "Use FocusProperties instead")
@C8567o(parameters = 0)
/* renamed from: androidx.compose.ui.focus.l */
public final class C15071l {

    /* renamed from: b */
    public static final int f37241b = 8;
    @C12579k

    /* renamed from: a */
    public final FocusProperties f37242a;

    public C15071l(@C12579k FocusProperties focusProperties) {
        Intrinsics.checkNotNullParameter(focusProperties, "focusProperties");
        this.f37242a = focusProperties;
    }

    @C12579k
    /* renamed from: a */
    public final FocusRequester mo42196a() {
        return this.f37242a.mo42099g();
    }

    @C12579k
    /* renamed from: b */
    public final FocusRequester mo42197b() {
        return this.f37242a.getEnd();
    }

    @C12579k
    /* renamed from: c */
    public final FocusRequester mo42198c() {
        return this.f37242a.mo42093a();
    }

    @C12579k
    /* renamed from: d */
    public final FocusRequester mo42199d() {
        return this.f37242a.mo42111q();
    }

    @C12579k
    /* renamed from: e */
    public final FocusRequester mo42200e() {
        return this.f37242a.mo42110p();
    }

    @C12579k
    /* renamed from: f */
    public final FocusRequester mo42201f() {
        return this.f37242a.mo42094b();
    }

    @C12579k
    /* renamed from: g */
    public final FocusRequester mo42202g() {
        return this.f37242a.getStart();
    }

    @C12579k
    /* renamed from: h */
    public final FocusRequester mo42203h() {
        return this.f37242a.mo42096d();
    }

    /* renamed from: i */
    public final void mo42204i(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "down");
        this.f37242a.mo42104j(focusRequester);
    }

    /* renamed from: j */
    public final void mo42205j(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "end");
        this.f37242a.mo42105k(focusRequester);
    }

    /* renamed from: k */
    public final void mo42206k(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, C9168d0.f24880E0);
        this.f37242a.mo42106l(focusRequester);
    }

    /* renamed from: l */
    public final void mo42207l(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "next");
        this.f37242a.mo42114v(focusRequester);
    }

    /* renamed from: m */
    public final void mo42208m(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "previous");
        this.f37242a.mo42113u(focusRequester);
    }

    /* renamed from: n */
    public final void mo42209n(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, C9168d0.f24887Z);
        this.f37242a.mo42107m(focusRequester);
    }

    /* renamed from: o */
    public final void mo42210o(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "start");
        this.f37242a.mo42108n(focusRequester);
    }

    /* renamed from: p */
    public final void mo42211p(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "up");
        this.f37242a.mo42098f(focusRequester);
    }

    public C15071l() {
        this(new FocusPropertiesImpl());
    }
}
