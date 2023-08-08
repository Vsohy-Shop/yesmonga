package com.urbanairship.android.layout.model;

import android.content.Context;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.info.C35693v0;
import com.urbanairship.android.layout.info.C35697y;
import com.urbanairship.android.layout.info.C35698z;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.Direction;
import com.urbanairship.android.layout.view.LinearLayoutView;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.model.i */
public final class C35802i extends BaseModel<LinearLayoutView, BaseModel.C35725a> {
    @C12579k

    /* renamed from: o */
    public final List<C35803a> f88419o;
    @C12579k

    /* renamed from: p */
    public final Direction f88420p;

    /* renamed from: com.urbanairship.android.layout.model.i$a */
    public static final class C35803a {
        @C12579k

        /* renamed from: a */
        public final C35698z f88421a;
        @C12579k

        /* renamed from: b */
        public final BaseModel<?, ?> f88422b;

        public C35803a(@C12579k C35698z zVar, @C12579k BaseModel<?, ?> baseModel) {
            Intrinsics.checkNotNullParameter(zVar, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(baseModel, C40045d.f102104u);
            this.f88421a = zVar;
            this.f88422b = baseModel;
        }

        /* renamed from: d */
        public static /* synthetic */ C35803a m147603d(C35803a aVar, C35698z zVar, BaseModel<?, ?> baseModel, int i, Object obj) {
            if ((i & 1) != 0) {
                zVar = aVar.f88421a;
            }
            if ((i & 2) != 0) {
                baseModel = aVar.f88422b;
            }
            return aVar.mo107223c(zVar, baseModel);
        }

        @C12579k
        /* renamed from: a */
        public final C35698z mo107221a() {
            return this.f88421a;
        }

        @C12579k
        /* renamed from: b */
        public final BaseModel<?, ?> mo107222b() {
            return this.f88422b;
        }

        @C12579k
        /* renamed from: c */
        public final C35803a mo107223c(@C12579k C35698z zVar, @C12579k BaseModel<?, ?> baseModel) {
            Intrinsics.checkNotNullParameter(zVar, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(baseModel, C40045d.f102104u);
            return new C35803a(zVar, baseModel);
        }

        @C12579k
        /* renamed from: e */
        public final C35698z mo107224e() {
            return this.f88421a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35803a)) {
                return false;
            }
            C35803a aVar = (C35803a) obj;
            return Intrinsics.areEqual((Object) this.f88421a, (Object) aVar.f88421a) && Intrinsics.areEqual((Object) this.f88422b, (Object) aVar.f88422b);
        }

        @C12579k
        /* renamed from: f */
        public final BaseModel<?, ?> mo107226f() {
            return this.f88422b;
        }

        public int hashCode() {
            return (this.f88421a.hashCode() * 31) + this.f88422b.hashCode();
        }

        @C12579k
        public String toString() {
            return "Item(info=" + this.f88421a + ", model=" + this.f88422b + ')';
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35802i(List list, Direction direction, C35835f fVar, C35830c cVar, C35693v0 v0Var, List list2, List list3, ModelEnvironment modelEnvironment, C35804j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, direction, (i & 4) != 0 ? null : fVar, (i & 8) != 0 ? null : cVar, (i & 16) != 0 ? null : v0Var, (i & 32) != 0 ? null : list2, (i & 64) != 0 ? null : list3, modelEnvironment, jVar);
    }

    @C12579k
    /* renamed from: K */
    public final Direction mo107218K() {
        return this.f88420p;
    }

    @C12579k
    /* renamed from: L */
    public final List<C35803a> mo107219L() {
        return this.f88419o;
    }

    @C12579k
    /* renamed from: M */
    public LinearLayoutView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        LinearLayoutView linearLayoutView = new LinearLayoutView(context, this, pVar);
        linearLayoutView.setId(mo107003r());
        return linearLayoutView;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35802i(@org.jetbrains.annotations.C12579k java.util.List<com.urbanairship.android.layout.model.C35802i.C35803a> r13, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.Direction r14, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r15, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r16, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r17, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r18, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r19, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r20, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r21) {
        /*
            r12 = this;
            r9 = r12
            r10 = r13
            r11 = r14
            java.lang.String r0 = "items"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "direction"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "environment"
            r7 = r20
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r21
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            com.urbanairship.android.layout.property.ViewType r1 = com.urbanairship.android.layout.property.ViewType.LINEAR_LAYOUT
            r0 = r12
            r2 = r15
            r3 = r16
            r4 = r17
            r5 = r18
            r6 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88419o = r10
            r9.f88420p = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35802i.<init>(java.util.List, com.urbanairship.android.layout.property.Direction, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C35802i(@C12579k C35697y yVar, @C12579k List<C35803a> list, @C12579k ModelEnvironment modelEnvironment, @C12579k C35804j jVar) {
        this(list, yVar.mo106860l(), yVar.getBackgroundColor(), yVar.mo106778h(), yVar.getVisibility(), yVar.mo106779i(), yVar.mo106774d(), modelEnvironment, jVar);
        Intrinsics.checkNotNullParameter(yVar, C28531e0.f69094x);
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(modelEnvironment, "env");
        Intrinsics.checkNotNullParameter(jVar, "props");
    }
}
