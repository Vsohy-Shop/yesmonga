package com.urbanairship.android.layout.info;

import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.property.ViewType;
import com.urbanairship.json.C9323b;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.info.n */
public final class C35673n extends C35686t0 implements C35682r0 {

    /* renamed from: b */
    public final /* synthetic */ C35682r0 f88180b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C35673n(@C12579k C9323b bVar) {
        super((DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(bVar, "json");
        this.f88180b = C35691u0.m147171l(bVar);
    }

    @C12580l
    /* renamed from: d */
    public List<EnableBehaviorType> mo106774d() {
        return this.f88180b.mo106774d();
    }

    @C12580l
    public C35835f getBackgroundColor() {
        return this.f88180b.getBackgroundColor();
    }

    @C12579k
    public ViewType getType() {
        return this.f88180b.getType();
    }

    @C12580l
    public C35693v0 getVisibility() {
        return this.f88180b.getVisibility();
    }

    @C12580l
    /* renamed from: h */
    public C35830c mo106778h() {
        return this.f88180b.mo106778h();
    }

    @C12580l
    /* renamed from: i */
    public List<EventHandler> mo106779i() {
        return this.f88180b.mo106779i();
    }
}
