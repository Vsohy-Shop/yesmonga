package com.urbanairship.android.layout.model;

import android.content.Context;
import com.carrefour.fid.android.shared.constant.C28531e0;
import com.google.android.datatransport.cct.C40045d;
import com.urbanairship.android.layout.environment.C35614p;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.info.C35665j;
import com.urbanairship.android.layout.info.C35667k;
import com.urbanairship.android.layout.info.C35693v0;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.view.ContainerLayoutView;
import com.urbanairship.iam.events.C9175a;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.model.c */
public final class C35795c extends BaseModel<ContainerLayoutView, BaseModel.C35725a> {
    @C12579k

    /* renamed from: o */
    public final List<C35796a> f88408o;

    /* renamed from: com.urbanairship.android.layout.model.c$a */
    public static final class C35796a {
        @C12579k

        /* renamed from: a */
        public final C35667k f88409a;
        @C12579k

        /* renamed from: b */
        public final BaseModel<?, ?> f88410b;

        public C35796a(@C12579k C35667k kVar, @C12579k BaseModel<?, ?> baseModel) {
            Intrinsics.checkNotNullParameter(kVar, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(baseModel, C40045d.f102104u);
            this.f88409a = kVar;
            this.f88410b = baseModel;
        }

        /* renamed from: d */
        public static /* synthetic */ C35796a m147574d(C35796a aVar, C35667k kVar, BaseModel<?, ?> baseModel, int i, Object obj) {
            if ((i & 1) != 0) {
                kVar = aVar.f88409a;
            }
            if ((i & 2) != 0) {
                baseModel = aVar.f88410b;
            }
            return aVar.mo107202c(kVar, baseModel);
        }

        @C12579k
        /* renamed from: a */
        public final C35667k mo107200a() {
            return this.f88409a;
        }

        @C12579k
        /* renamed from: b */
        public final BaseModel<?, ?> mo107201b() {
            return this.f88410b;
        }

        @C12579k
        /* renamed from: c */
        public final C35796a mo107202c(@C12579k C35667k kVar, @C12579k BaseModel<?, ?> baseModel) {
            Intrinsics.checkNotNullParameter(kVar, C28531e0.f69094x);
            Intrinsics.checkNotNullParameter(baseModel, C40045d.f102104u);
            return new C35796a(kVar, baseModel);
        }

        @C12579k
        /* renamed from: e */
        public final C35667k mo107203e() {
            return this.f88409a;
        }

        public boolean equals(@C12580l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C35796a)) {
                return false;
            }
            C35796a aVar = (C35796a) obj;
            return Intrinsics.areEqual((Object) this.f88409a, (Object) aVar.f88409a) && Intrinsics.areEqual((Object) this.f88410b, (Object) aVar.f88410b);
        }

        @C12579k
        /* renamed from: f */
        public final BaseModel<?, ?> mo107205f() {
            return this.f88410b;
        }

        public int hashCode() {
            return (this.f88409a.hashCode() * 31) + this.f88410b.hashCode();
        }

        @C12579k
        public String toString() {
            return "Item(info=" + this.f88409a + ", model=" + this.f88410b + ')';
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35795c(List list, C35835f fVar, C35830c cVar, C35693v0 v0Var, List list2, List list3, ModelEnvironment modelEnvironment, C35804j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, (i & 2) != 0 ? null : fVar, (i & 4) != 0 ? null : cVar, (i & 8) != 0 ? null : v0Var, (i & 16) != 0 ? null : list2, (i & 32) != 0 ? null : list3, modelEnvironment, jVar);
    }

    @C12579k
    /* renamed from: K */
    public final List<C35796a> mo107198K() {
        return this.f88408o;
    }

    @C12579k
    /* renamed from: L */
    public ContainerLayoutView mo107010z(@C12579k Context context, @C12579k C35614p pVar) {
        Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
        Intrinsics.checkNotNullParameter(pVar, "viewEnvironment");
        ContainerLayoutView containerLayoutView = new ContainerLayoutView(context, this, pVar);
        containerLayoutView.setId(mo107003r());
        return containerLayoutView;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C35795c(@org.jetbrains.annotations.C12579k java.util.List<com.urbanairship.android.layout.model.C35795c.C35796a> r12, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r13, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r14, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r15, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r16, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r17, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r18, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r19) {
        /*
            r11 = this;
            r0 = r12
            java.lang.String r1 = "items"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r1)
            java.lang.String r1 = "environment"
            r9 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            java.lang.String r1 = "properties"
            r10 = r19
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r1)
            com.urbanairship.android.layout.property.ViewType r3 = com.urbanairship.android.layout.property.ViewType.CONTAINER
            r2 = r11
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            r1 = r11
            r1.f88408o = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.C35795c.<init>(java.util.List, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C35795c(@C12579k C35665j jVar, @C12579k List<C35796a> list, @C12579k ModelEnvironment modelEnvironment, @C12579k C35804j jVar2) {
        this(list, jVar.getBackgroundColor(), jVar.mo106778h(), jVar.getVisibility(), jVar.mo106779i(), jVar.mo106774d(), modelEnvironment, jVar2);
        Intrinsics.checkNotNullParameter(jVar, C28531e0.f69094x);
        Intrinsics.checkNotNullParameter(list, "items");
        Intrinsics.checkNotNullParameter(modelEnvironment, "env");
        Intrinsics.checkNotNullParameter(jVar2, "props");
    }
}
