package com.urbanairship.android.layout.info;

import com.carrefour.fid.android.shared.constant.C28531e0;
import com.urbanairship.android.layout.property.ViewType;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.info.u */
public abstract class C35689u {
    @C12579k

    /* renamed from: a */
    public final C35686t0 f88202a;
    @C12579k

    /* renamed from: b */
    public final ViewType f88203b;

    /* renamed from: com.urbanairship.android.layout.info.u$a */
    public static final class C35690a extends C35689u {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C35690a(@C12579k C35686t0 t0Var) {
            super(t0Var, (DefaultConstructorMarker) null);
            Intrinsics.checkNotNullParameter(t0Var, C28531e0.f69094x);
        }
    }

    public /* synthetic */ C35689u(C35686t0 t0Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(t0Var);
    }

    @C12579k
    /* renamed from: d */
    public final C35686t0 mo106836d() {
        return this.f88202a;
    }

    @C12579k
    /* renamed from: h */
    public final ViewType mo106837h() {
        return this.f88203b;
    }

    public C35689u(C35686t0 t0Var) {
        this.f88202a = t0Var;
        this.f88203b = t0Var.getType();
    }
}
