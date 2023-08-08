package androidx.compose.p004ui.focus;

import androidx.compose.p004ui.focus.FocusRequester;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: androidx.compose.ui.focus.FocusPropertiesImpl */
public final class FocusPropertiesImpl implements FocusProperties {

    /* renamed from: a */
    public boolean f37188a = true;
    @C12579k

    /* renamed from: b */
    public FocusRequester f37189b;
    @C12579k

    /* renamed from: c */
    public FocusRequester f37190c;
    @C12579k

    /* renamed from: d */
    public FocusRequester f37191d;
    @C12579k

    /* renamed from: e */
    public FocusRequester f37192e;
    @C12579k

    /* renamed from: f */
    public FocusRequester f37193f;
    @C12579k

    /* renamed from: g */
    public FocusRequester f37194g;
    @C12579k

    /* renamed from: h */
    public FocusRequester f37195h;
    @C12579k

    /* renamed from: i */
    public FocusRequester f37196i;
    @C12579k

    /* renamed from: j */
    public C11300l<? super C15059d, FocusRequester> f37197j;
    @C12579k

    /* renamed from: k */
    public C11300l<? super C15059d, FocusRequester> f37198k;

    public FocusPropertiesImpl() {
        FocusRequester.C15047a aVar = FocusRequester.f37201b;
        this.f37189b = aVar.mo42132d();
        this.f37190c = aVar.mo42132d();
        this.f37191d = aVar.mo42132d();
        this.f37192e = aVar.mo42132d();
        this.f37193f = aVar.mo42132d();
        this.f37194g = aVar.mo42132d();
        this.f37195h = aVar.mo42132d();
        this.f37196i = aVar.mo42132d();
        this.f37197j = FocusPropertiesImpl$enter$1.f37199f;
        this.f37198k = FocusPropertiesImpl$exit$1.f37200f;
    }

    /* renamed from: r */
    public static /* synthetic */ void m64550r() {
    }

    /* renamed from: s */
    public static /* synthetic */ void m64551s() {
    }

    @C12579k
    /* renamed from: a */
    public FocusRequester mo42093a() {
        return this.f37193f;
    }

    @C12579k
    /* renamed from: b */
    public FocusRequester mo42094b() {
        return this.f37194g;
    }

    /* renamed from: c */
    public void mo42095c(@C12579k C11300l<? super C15059d, FocusRequester> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f37198k = lVar;
    }

    @C12579k
    /* renamed from: d */
    public FocusRequester mo42096d() {
        return this.f37191d;
    }

    @C12579k
    /* renamed from: e */
    public C11300l<C15059d, FocusRequester> mo42097e() {
        return this.f37198k;
    }

    /* renamed from: f */
    public void mo42098f(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f37191d = focusRequester;
    }

    @C12579k
    /* renamed from: g */
    public FocusRequester mo42099g() {
        return this.f37192e;
    }

    @C12579k
    public FocusRequester getEnd() {
        return this.f37196i;
    }

    @C12579k
    public FocusRequester getStart() {
        return this.f37195h;
    }

    /* renamed from: h */
    public void mo42102h(boolean z) {
        this.f37188a = z;
    }

    @C12579k
    /* renamed from: i */
    public C11300l<C15059d, FocusRequester> mo42103i() {
        return this.f37197j;
    }

    /* renamed from: j */
    public void mo42104j(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f37192e = focusRequester;
    }

    /* renamed from: k */
    public void mo42105k(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f37196i = focusRequester;
    }

    /* renamed from: l */
    public void mo42106l(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f37193f = focusRequester;
    }

    /* renamed from: m */
    public void mo42107m(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f37194g = focusRequester;
    }

    /* renamed from: n */
    public void mo42108n(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f37195h = focusRequester;
    }

    /* renamed from: o */
    public boolean mo42109o() {
        return this.f37188a;
    }

    @C12579k
    /* renamed from: p */
    public FocusRequester mo42110p() {
        return this.f37190c;
    }

    @C12579k
    /* renamed from: q */
    public FocusRequester mo42111q() {
        return this.f37189b;
    }

    /* renamed from: t */
    public void mo42112t(@C12579k C11300l<? super C15059d, FocusRequester> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "<set-?>");
        this.f37197j = lVar;
    }

    /* renamed from: u */
    public void mo42113u(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f37190c = focusRequester;
    }

    /* renamed from: v */
    public void mo42114v(@C12579k FocusRequester focusRequester) {
        Intrinsics.checkNotNullParameter(focusRequester, "<set-?>");
        this.f37189b = focusRequester;
    }
}
