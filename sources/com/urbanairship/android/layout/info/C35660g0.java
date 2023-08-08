package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.info.C35689u;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.ViewType;
import com.urbanairship.android.layout.reporting.C35865a;
import com.urbanairship.json.C9323b;
import java.util.List;
import kotlin.collections.C10976s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.g0 */
public final class C35660g0 extends C35684s0<C35689u.C35690a> implements C35669l, C35678p0, C35645a {

    /* renamed from: b */
    public final /* synthetic */ C35669l f88141b;

    /* renamed from: c */
    public final /* synthetic */ C35680q0 f88142c;

    /* renamed from: d */
    public final /* synthetic */ C35645a f88143d;
    @C12580l

    /* renamed from: e */
    public final C35865a f88144e;
    @C12579k

    /* renamed from: f */
    public final List<C35689u.C35690a> f88145f = C10976s.m41419k(new C35689u.C35690a(getView()));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35660g0(@C12579k C9323b bVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(bVar, "json");
        this.f88141b = C35691u0.m147167h(bVar);
        this.f88142c = C35691u0.m147170k(bVar);
        this.f88143d = C35691u0.m147166g(bVar);
        this.f88144e = C35865a.m147925a(bVar);
    }

    @C12579k
    /* renamed from: a */
    public String mo106791a() {
        return this.f88141b.mo106791a();
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88141b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88141b.getBackgroundColor();
    }

    @C12580l
    public String getContentDescription() {
        return this.f88143d.getContentDescription();
    }

    @C12579k
    public ViewType getType() {
        return this.f88141b.getType();
    }

    @C12579k
    public C35686t0 getView() {
        return this.f88141b.getView();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88141b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88141b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88141b.mo106779i();
    }

    public boolean isRequired() {
        return this.f88142c.isRequired();
    }

    @C12579k
    /* renamed from: k */
    public List<C35689u.C35690a> mo106789k() {
        return this.f88145f;
    }

    @C12580l
    /* renamed from: l */
    public final C35865a mo106805l() {
        return this.f88144e;
    }
}
