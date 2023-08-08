package com.urbanairship.android.layout.model;

import android.content.Context;
import android.view.View;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.info.C35672m0;
import com.urbanairship.android.layout.info.C35693v0;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.model.n */
public final class C35809n extends BaseModel<View, BaseModel.C35725a> {
    @C12579k

    /* renamed from: o */
    public final BaseModel<?, ?> f88430o;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35809n(BaseModel baseModel, C35835f fVar, C35830c cVar, C35693v0 v0Var, List list, List list2, ModelEnvironment modelEnvironment, C35804j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseModel, (i & 2) != 0 ? null : fVar, (i & 4) != 0 ? null : cVar, (i & 8) != 0 ? null : v0Var, (i & 16) != 0 ? null : list, (i & 32) != 0 ? null : list2, modelEnvironment, jVar);
    }

    @C12579k
    /* renamed from: K */
    public final BaseModel<?, ?> mo107241K() {
        return this.f88430o;
    }

    @C12579k
    /* renamed from: z */
    public View mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        return this.f88430o.mo106993h(context, pVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35809n(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r12, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r13, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r14, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r15, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r16, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r17, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r18, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r19) {
        /*
            r11 = this;
            r0 = r12
            java.lang.String r1 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "environment"
            r9 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "properties"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            com.urbanairship.android.layout.property.ViewType r3 = com.urbanairship.android.layout.property.ViewType.STATE_CONTROLLER
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r11
            r1.f88430o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35809n.<init>(com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C35809n(@C12579k C35672m0 m0Var, @C12579k BaseModel<?, ?> baseModel, @C12579k ModelEnvironment modelEnvironment, @C12579k C35804j jVar) {
        this(baseModel, m0Var.getBackgroundColor(), m0Var.mo106778h(), m0Var.getVisibility(), m0Var.mo106779i(), m0Var.mo106774d(), modelEnvironment, jVar);
        Intrinsics.checkNotNullParameter(m0Var, C28531e0.f69094x);
        Intrinsics.checkNotNullParameter(baseModel, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(modelEnvironment, "env");
        Intrinsics.checkNotNullParameter(jVar, "props");
    }
}
