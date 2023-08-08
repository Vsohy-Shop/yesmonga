package com.urbanairship.android.layout.model;

import android.content.Context;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.info.C35670l0;
import com.urbanairship.android.layout.info.C35693v0;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.Direction;
import com.urbanairship.android.layout.view.ScrollLayoutView;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.model.m */
public final class C35808m extends BaseModel<ScrollLayoutView, BaseModel.C35725a> {
    @C12579k

    /* renamed from: o */
    public final BaseModel<?, ?> f88428o;
    @C12579k

    /* renamed from: p */
    public final Direction f88429p;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35808m(BaseModel baseModel, Direction direction, C35835f fVar, C35830c cVar, C35693v0 v0Var, List list, List list2, ModelEnvironment modelEnvironment, C35804j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(baseModel, (i & 2) != 0 ? Direction.VERTICAL : direction, (i & 4) != 0 ? null : fVar, (i & 8) != 0 ? null : cVar, (i & 16) != 0 ? null : v0Var, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : list2, modelEnvironment, jVar);
    }

    @C12579k
    /* renamed from: K */
    public final Direction mo107238K() {
        return this.f88429p;
    }

    @C12579k
    /* renamed from: L */
    public final BaseModel<?, ?> mo107239L() {
        return this.f88428o;
    }

    @C12579k
    /* renamed from: M */
    public ScrollLayoutView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        ScrollLayoutView scrollLayoutView = new ScrollLayoutView(context, this, pVar);
        scrollLayoutView.setId(mo107003r());
        return scrollLayoutView;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35808m(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.BaseModel<?, ?> r13, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.Direction r14, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r15, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r16, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r17, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r18, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r19, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r20, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r21) {
        /*
            r12 = this;
            r9 = r12
            r10 = r13
            r11 = r14
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "direction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "environment"
            r7 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.SCROLL_LAYOUT
            r0 = r12
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88428o = r10
            r9.f88429p = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35808m.<init>(com.urbanairship.android.layout.model.BaseModel, com.urbanairship.android.layout.property.Direction, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C35808m(@C12579k C35670l0 l0Var, @C12579k BaseModel<?, ?> baseModel, @C12579k ModelEnvironment modelEnvironment, @C12579k C35804j jVar) {
        this(baseModel, l0Var.mo106819l(), l0Var.getBackgroundColor(), l0Var.mo106778h(), l0Var.getVisibility(), l0Var.mo106779i(), l0Var.mo106774d(), modelEnvironment, jVar);
        Intrinsics.checkNotNullParameter(l0Var, C28531e0.f69094x);
        Intrinsics.checkNotNullParameter(baseModel, C40383c.f102945c);
        Intrinsics.checkNotNullParameter(modelEnvironment, "env");
        Intrinsics.checkNotNullParameter(jVar, "props");
    }
}
