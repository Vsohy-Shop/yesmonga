package com.urbanairship.android.layout.model;

import android.content.Context;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.info.C35673n;
import com.urbanairship.android.layout.info.C35693v0;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.view.EmptyView;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

/* renamed from: com.urbanairship.android.layout.model.d */
public final class C35797d extends BaseModel<EmptyView, BaseModel.C35725a> {
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35797d(C35835f fVar, C35830c cVar, C35693v0 v0Var, List list, List list2, ModelEnvironment modelEnvironment, C35804j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fVar, (i & 2) != 0 ? null : cVar, (i & 4) != 0 ? null : v0Var, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : list2, modelEnvironment, jVar);
    }

    @C12579k
    /* renamed from: K */
    public EmptyView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        EmptyView emptyView = new EmptyView(context, this);
        emptyView.setId(mo107003r());
        return emptyView;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35797d(@org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r11, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r12, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r13, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r14, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r15, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r16, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r17) {
        /*
            r10 = this;
            java.lang.String r0 = "environment"
            r8 = r16
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "properties"
            r9 = r17
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            com.urbanairship.android.layout.property.ViewType r2 = com.urbanairship.android.layout.property.ViewType.EMPTY_VIEW
            r1 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35797d.<init>(com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C35797d(@C12579k C35673n nVar, @C12579k ModelEnvironment modelEnvironment, @C12579k C35804j jVar) {
        this(nVar.getBackgroundColor(), nVar.mo106778h(), nVar.getVisibility(), nVar.mo106779i(), nVar.mo106774d(), modelEnvironment, jVar);
        Intrinsics.checkNotNullParameter(nVar, C28531e0.f69094x);
        Intrinsics.checkNotNullParameter(modelEnvironment, "env");
        Intrinsics.checkNotNullParameter(jVar, "props");
    }
}
