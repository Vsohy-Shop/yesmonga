package com.urbanairship.android.layout.model;

import android.view.View;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.info.C35693v0;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.C35830c;
import com.urbanairship.android.layout.property.C35835f;
import com.urbanairship.android.layout.property.EnableBehaviorType;
import com.urbanairship.android.layout.property.FormBehaviorType;
import com.urbanairship.android.layout.property.ViewType;
import com.urbanairship.android.layout.reporting.FormData;
import java.util.List;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class BaseFormController<T extends View> extends BaseModel<T, BaseModel.C35725a> {
    @C12579k

    /* renamed from: o */
    public final String f88256o;
    @C12580l

    /* renamed from: p */
    public final String f88257p;
    @C12580l

    /* renamed from: q */
    public final List<EnableBehaviorType> f88258q;
    @C12579k

    /* renamed from: r */
    public final C35607n<C35608o.C35610b> f88259r;
    @C12580l

    /* renamed from: s */
    public final C35607n<C35608o.C35610b> f88260s;
    @C12580l

    /* renamed from: t */
    public final C35607n<C35608o.C35612d> f88261t;

    /* renamed from: u */
    public final boolean f88262u;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BaseFormController(ViewType viewType, String str, String str2, FormBehaviorType formBehaviorType, List list, C35835f fVar, C35830c cVar, C35693v0 v0Var, List list2, List list3, C35607n nVar, C35607n nVar2, C35607n nVar3, ModelEnvironment modelEnvironment, C35804j jVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewType, str, str2, formBehaviorType, list, (i & 32) != 0 ? null : fVar, (i & 64) != 0 ? null : cVar, v0Var, list2, list3, nVar, nVar2, nVar3, modelEnvironment, jVar);
    }

    @C12579k
    /* renamed from: P */
    public abstract FormData.C35856a mo106954P(@C12579k C35608o.C35610b bVar);

    @C12579k
    /* renamed from: Q */
    public final String mo106955Q() {
        return this.f88256o;
    }

    @C12580l
    /* renamed from: R */
    public final String mo106956R() {
        return this.f88257p;
    }

    @C12579k
    /* renamed from: S */
    public abstract BaseModel<?, ?> mo106957S();

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r5 != false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0046, code lost:
        if (r7.mo106713z() == false) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0053, code lost:
        if (r5 != false) goto L_0x0057;
     */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo106958T(com.urbanairship.android.layout.environment.C35608o.C35610b r7) {
        /*
            r6 = this;
            java.util.List<com.urbanairship.android.layout.property.EnableBehaviorType> r0 = r6.f88258q
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.urbanairship.android.layout.environment.n<com.urbanairship.android.layout.environment.o$b> r1 = r6.f88260s
            r2 = 1
            if (r1 == 0) goto L_0x0017
            java.lang.Object r1 = r1.mo106667b()
            com.urbanairship.android.layout.environment.o$b r1 = (com.urbanairship.android.layout.environment.C35608o.C35610b) r1
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.mo106712y()
            goto L_0x0018
        L_0x0017:
            r1 = r2
        L_0x0018:
            com.urbanairship.android.layout.property.EnableBehaviorType r3 = com.urbanairship.android.layout.property.EnableBehaviorType.FORM_VALIDATION
            boolean r3 = r0.contains(r3)
            com.urbanairship.android.layout.property.EnableBehaviorType r4 = com.urbanairship.android.layout.property.EnableBehaviorType.FORM_SUBMISSION
            boolean r0 = r0.contains(r4)
            r4 = 0
            if (r3 == 0) goto L_0x0030
            boolean r5 = r7.mo106683A()
            if (r5 == 0) goto L_0x002e
            goto L_0x0030
        L_0x002e:
            r5 = r4
            goto L_0x0031
        L_0x0030:
            r5 = r2
        L_0x0031:
            if (r1 == 0) goto L_0x0056
            if (r0 == 0) goto L_0x0040
            if (r3 == 0) goto L_0x0040
            boolean r7 = r7.mo106713z()
            if (r7 != 0) goto L_0x004a
            if (r5 == 0) goto L_0x004a
            goto L_0x0048
        L_0x0040:
            if (r0 == 0) goto L_0x004c
            boolean r7 = r7.mo106713z()
            if (r7 != 0) goto L_0x004a
        L_0x0048:
            r5 = r2
            goto L_0x0053
        L_0x004a:
            r5 = r4
            goto L_0x0053
        L_0x004c:
            if (r3 == 0) goto L_0x004f
            goto L_0x0053
        L_0x004f:
            boolean r5 = r7.mo106712y()
        L_0x0053:
            if (r5 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r2 = r4
        L_0x0057:
            com.urbanairship.android.layout.environment.n<com.urbanairship.android.layout.environment.o$b> r7 = r6.f88259r
            com.urbanairship.android.layout.model.BaseFormController$handleFormUpdate$1 r0 = new com.urbanairship.android.layout.model.BaseFormController$handleFormUpdate$1
            r0.<init>(r2)
            r7.mo106668c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.BaseFormController.mo106958T(com.urbanairship.android.layout.environment.o$b):void");
    }

    /* renamed from: U */
    public final void mo106959U(C35608o.C35612d dVar) {
        boolean z;
        C35608o.C35610b b;
        List<EnableBehaviorType> list = this.f88258q;
        if (list != null) {
            C35607n<C35608o.C35610b> nVar = this.f88260s;
            boolean z2 = true;
            if (nVar == null || (b = nVar.mo106667b()) == null) {
                z = true;
            } else {
                z = b.mo106712y();
            }
            boolean contains = list.contains(EnableBehaviorType.PAGER_NEXT);
            boolean contains2 = list.contains(EnableBehaviorType.PAGER_PREVIOUS);
            if ((!z || !contains || !contains2 || (!dVar.mo106731k() && !dVar.mo106732l())) && ((!contains || !dVar.mo106731k()) && (!contains2 || !dVar.mo106732l()))) {
                z2 = false;
            }
            this.f88259r.mo106668c(new BaseFormController$handlePagerScroll$1(z2));
        }
    }

    /* renamed from: V */
    public final void mo106960V() {
        if (this.f88260s != null) {
            C11723c2 unused = C12038j.m48061f(mo107001p(), (CoroutineContext) null, (CoroutineStart) null, new BaseFormController$initChildForm$2(this, (C11045c<? super BaseFormController$initChildForm$2>) null), 3, (Object) null);
            C11723c2 unused2 = C12038j.m48061f(mo107001p(), (CoroutineContext) null, (CoroutineStart) null, new BaseFormController$initChildForm$3(this, (C11045c<? super BaseFormController$initChildForm$3>) null), 3, (Object) null);
            mo106982A(new BaseFormController$initChildForm$4(this, (C11045c<? super BaseFormController$initChildForm$4>) null));
            return;
        }
        throw new IllegalStateException("Child form requires parent form state!".toString());
    }

    /* renamed from: W */
    public final void mo106961W() {
        C11723c2 unused = C12038j.m48061f(mo107001p(), (CoroutineContext) null, (CoroutineStart) null, new BaseFormController$initParentForm$1(this, (C11045c<? super BaseFormController$initParentForm$1>) null), 3, (Object) null);
        C11723c2 unused2 = C12038j.m48061f(mo107001p(), (CoroutineContext) null, (CoroutineStart) null, new BaseFormController$initParentForm$2(this, (C11045c<? super BaseFormController$initParentForm$2>) null), 3, (Object) null);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BaseFormController(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.ViewType r15, @org.jetbrains.annotations.C12579k java.lang.String r16, @org.jetbrains.annotations.C12580l java.lang.String r17, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.FormBehaviorType r18, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r19, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r20, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r21, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r22, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r23, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r24, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r25, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r26, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r27, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r28, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r29) {
        /*
            r14 = this;
            r9 = r14
            r10 = r16
            r11 = r19
            r12 = r25
            r13 = r27
            java.lang.String r0 = "viewType"
            r1 = r15
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "formState"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "environment"
            r7 = r28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r29
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r14
            r2 = r20
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88256o = r10
            r0 = r17
            r9.f88257p = r0
            r9.f88258q = r11
            r9.f88259r = r12
            r0 = r26
            r9.f88260s = r0
            r9.f88261t = r13
            if (r18 != 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x0049:
            r0 = 0
        L_0x004a:
            r9.f88262u = r0
            if (r0 == 0) goto L_0x0052
            r14.mo106960V()
            goto L_0x0055
        L_0x0052:
            r14.mo106961W()
        L_0x0055:
            if (r11 == 0) goto L_0x00aa
            boolean r0 = com.urbanairship.android.layout.property.C35837h.m147764b(r19)
            r1 = 0
            if (r0 == 0) goto L_0x0089
            if (r13 == 0) goto L_0x007d
            kotlinx.coroutines.o0 r0 = r14.mo107001p()
            r2 = 0
            r3 = 0
            com.urbanairship.android.layout.model.BaseFormController$1$2 r4 = new com.urbanairship.android.layout.model.BaseFormController$1$2
            r4.<init>(r14, r1)
            r5 = 3
            r6 = 0
            r20 = r0
            r21 = r2
            r22 = r3
            r23 = r4
            r24 = r5
            r25 = r6
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r20, r21, r22, r23, r24, r25)
            goto L_0x0089
        L_0x007d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Pager state is required for Forms with pager enable behaviors!"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0089:
            boolean r0 = com.urbanairship.android.layout.property.C35837h.m147763a(r19)
            if (r0 == 0) goto L_0x00aa
            kotlinx.coroutines.o0 r0 = r14.mo107001p()
            r2 = 0
            r3 = 0
            com.urbanairship.android.layout.model.BaseFormController$1$3 r4 = new com.urbanairship.android.layout.model.BaseFormController$1$3
            r4.<init>(r14, r1)
            r1 = 3
            r5 = 0
            r15 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r1
            r20 = r5
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r15, r16, r17, r18, r19, r20)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.BaseFormController.<init>(com.urbanairship.android.layout.property.ViewType, java.lang.String, java.lang.String, com.urbanairship.android.layout.property.FormBehaviorType, java.util.List, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
