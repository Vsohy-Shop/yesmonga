package androidx.navigation;

import androidx.annotation.C0329d0;
import androidx.navigation.C19761k0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C11622t;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C19767m0
public final class NavOptionsBuilder {
    @C12579k

    /* renamed from: a */
    public final C19761k0.C19762a f50467a = new C19761k0.C19762a();

    /* renamed from: b */
    public boolean f50468b;

    /* renamed from: c */
    public boolean f50469c;
    @C0329d0

    /* renamed from: d */
    public int f50470d = -1;
    @C12580l

    /* renamed from: e */
    public String f50471e;

    /* renamed from: f */
    public boolean f50472f;

    /* renamed from: g */
    public boolean f50473g;

    @C11395k(message = "Use the popUpToId property.")
    /* renamed from: e */
    public static /* synthetic */ void m91621e() {
    }

    /* renamed from: k */
    public static /* synthetic */ void m91622k(NavOptionsBuilder navOptionsBuilder, int i, C11300l lVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            lVar = NavOptionsBuilder$popUpTo$1.f50474f;
        }
        navOptionsBuilder.mo58302i(i, lVar);
    }

    /* renamed from: l */
    public static /* synthetic */ void m91623l(NavOptionsBuilder navOptionsBuilder, String str, C11300l lVar, int i, Object obj) {
        if ((i & 2) != 0) {
            lVar = NavOptionsBuilder$popUpTo$2.f50475f;
        }
        navOptionsBuilder.mo58303j(str, lVar);
    }

    /* renamed from: a */
    public final void mo58295a(@C12579k C11300l<? super C19723f, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "animBuilder");
        C19723f fVar = new C19723f();
        lVar.invoke(fVar);
        this.f50467a.mo58464b(fVar.mo58386a()).mo58465c(fVar.mo58387b()).mo58467e(fVar.mo58388c()).mo58468f(fVar.mo58389d());
    }

    @C12579k
    /* renamed from: b */
    public final C19761k0 mo58296b() {
        C19761k0.C19762a aVar = this.f50467a;
        aVar.mo58466d(this.f50468b);
        aVar.mo58473m(this.f50469c);
        String str = this.f50471e;
        if (str != null) {
            aVar.mo58472j(str, this.f50472f, this.f50473g);
        } else {
            aVar.mo58470h(this.f50470d, this.f50472f, this.f50473g);
        }
        return aVar.mo58463a();
    }

    /* renamed from: c */
    public final boolean mo58297c() {
        return this.f50468b;
    }

    /* renamed from: d */
    public final int mo58298d() {
        return this.f50470d;
    }

    /* renamed from: f */
    public final int mo58299f() {
        return this.f50470d;
    }

    @C12580l
    /* renamed from: g */
    public final String mo58300g() {
        return this.f50471e;
    }

    /* renamed from: h */
    public final boolean mo58301h() {
        return this.f50469c;
    }

    /* renamed from: i */
    public final void mo58302i(@C0329d0 int i, @C12579k C11300l<? super C19842v0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "popUpToBuilder");
        mo58306o(i);
        mo58307p((String) null);
        C19842v0 v0Var = new C19842v0();
        lVar.invoke(v0Var);
        this.f50472f = v0Var.mo58620a();
        this.f50473g = v0Var.mo58621b();
    }

    /* renamed from: j */
    public final void mo58303j(@C12579k String str, @C12579k C11300l<? super C19842v0, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(str, "route");
        Intrinsics.checkNotNullParameter(lVar, "popUpToBuilder");
        mo58307p(str);
        mo58306o(-1);
        C19842v0 v0Var = new C19842v0();
        lVar.invoke(v0Var);
        this.f50472f = v0Var.mo58620a();
        this.f50473g = v0Var.mo58621b();
    }

    /* renamed from: m */
    public final void mo58304m(boolean z) {
        this.f50468b = z;
    }

    @C11395k(message = "Use the popUpTo function and passing in the id.")
    /* renamed from: n */
    public final void mo58305n(int i) {
        m91622k(this, i, (C11300l) null, 2, (Object) null);
    }

    /* renamed from: o */
    public final void mo58306o(int i) {
        this.f50470d = i;
        this.f50472f = false;
    }

    /* renamed from: p */
    public final void mo58307p(String str) {
        if (str == null) {
            return;
        }
        if (!C11622t.isBlank(str)) {
            this.f50471e = str;
            this.f50472f = false;
            return;
        }
        throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
    }

    /* renamed from: q */
    public final void mo58308q(boolean z) {
        this.f50469c = z;
    }
}
