package androidx.navigation;

import androidx.annotation.C0329d0;
import androidx.navigation.NavDestination;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.C11587t0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C19691a0
/* renamed from: androidx.navigation.z */
public class C19853z<D extends NavDestination> {
    @C12579k

    /* renamed from: a */
    public final Navigator<? extends D> f50718a;

    /* renamed from: b */
    public final int f50719b;
    @C12580l

    /* renamed from: c */
    public final String f50720c;
    @C12580l

    /* renamed from: d */
    public CharSequence f50721d;
    @C12579k

    /* renamed from: e */
    public Map<String, C19787o> f50722e;
    @C12579k

    /* renamed from: f */
    public List<NavDeepLink> f50723f;
    @C12579k

    /* renamed from: g */
    public Map<Integer, C19757j> f50724g;

    public C19853z(@C12579k Navigator<? extends D> navigator, @C0329d0 int i, @C12580l String str) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f50718a = navigator;
        this.f50719b = i;
        this.f50720c = str;
        this.f50722e = new LinkedHashMap();
        this.f50723f = new ArrayList();
        this.f50724g = new LinkedHashMap();
    }

    @C11395k(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    /* renamed from: a */
    public final void mo58635a(int i, @C12579k C11300l<? super C19760k, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "actionBuilder");
        Map<Integer, C19757j> map = this.f50724g;
        Integer valueOf = Integer.valueOf(i);
        C19760k kVar = new C19760k();
        lVar.invoke(kVar);
        map.put(valueOf, kVar.mo58445a());
    }

    /* renamed from: b */
    public final void mo58636b(@C12579k String str, @C12579k C11300l<? super C19790p, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(lVar, "argumentBuilder");
        Map<String, C19787o> map = this.f50722e;
        C19790p pVar = new C19790p();
        lVar.invoke(pVar);
        map.put(str, pVar.mo58550a());
    }

    @C12579k
    /* renamed from: c */
    public D mo58331c() {
        D a = this.f50718a.mo58032a();
        String str = this.f50720c;
        if (str != null) {
            a.mo58234B0(str);
        }
        int i = this.f50719b;
        if (i != -1) {
            a.mo58256y0(i);
        }
        a.mo58257z0(this.f50721d);
        for (Map.Entry next : this.f50722e.entrySet()) {
            a.mo58239h((String) next.getKey(), (C19787o) next.getValue());
        }
        for (NavDeepLink i2 : this.f50723f) {
            a.mo58241i(i2);
        }
        for (Map.Entry next2 : this.f50724g.entrySet()) {
            a.mo58251u0(((Number) next2.getKey()).intValue(), (C19757j) next2.getValue());
        }
        return a;
    }

    /* renamed from: d */
    public final void mo58637d(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "uriPattern");
        this.f50723f.add(new NavDeepLink(str));
    }

    /* renamed from: e */
    public final void mo58638e(@C12579k C11300l<? super C19841v, C11079d2> lVar) {
        Intrinsics.checkNotNullParameter(lVar, "navDeepLink");
        List<NavDeepLink> list = this.f50723f;
        C19841v vVar = new C19841v();
        lVar.invoke(vVar);
        list.add(vVar.mo58613a());
    }

    /* renamed from: f */
    public final int mo58639f() {
        return this.f50719b;
    }

    @C12580l
    /* renamed from: g */
    public final CharSequence mo58640g() {
        return this.f50721d;
    }

    @C12579k
    /* renamed from: h */
    public final Navigator<? extends D> mo58641h() {
        return this.f50718a;
    }

    @C12580l
    /* renamed from: i */
    public final String mo58642i() {
        return this.f50720c;
    }

    /* renamed from: j */
    public final void mo58643j(@C12580l CharSequence charSequence) {
        this.f50721d = charSequence;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @C11395k(message = "Use routes to build your NavDestination instead", replaceWith = @C11587t0(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public C19853z(@C12579k Navigator<? extends D> navigator, @C0329d0 int i) {
        this(navigator, i, (String) null);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C19853z(@C12579k Navigator<? extends D> navigator, @C12580l String str) {
        this(navigator, -1, str);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
    }
}
