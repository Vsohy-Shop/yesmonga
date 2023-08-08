package com.urbanairship.android.layout.model;

import android.view.View;
import androidx.annotation.C0346i;
import com.google.android.gms.analytics.ecommerce.C40383c;
import com.urbanairship.android.layout.environment.C35603k;
import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.environment.LayoutEvent;
import com.urbanairship.android.layout.event.ReportingEvent;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.property.ButtonClickBehaviorType;
import com.urbanairship.android.layout.property.C35831d;
import com.urbanairship.android.layout.reporting.C35867c;
import com.urbanairship.android.layout.reporting.C35869e;
import com.urbanairship.android.layout.widget.C36026n;
import com.urbanairship.json.JsonValue;
import java.util.List;
import java.util.Map;
import kotlin.C11079d2;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.CoroutineStart;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public abstract class ButtonModel<T extends View & C36026n> extends BaseModel<T, C35732a> {
    @C12579k

    /* renamed from: o */
    public final String f88301o;
    @C12580l

    /* renamed from: p */
    public final Map<String, JsonValue> f88302p;
    @C12579k

    /* renamed from: q */
    public final List<ButtonClickBehaviorType> f88303q;
    @C12580l

    /* renamed from: r */
    public final String f88304r;
    @C12580l

    /* renamed from: s */
    public final C35607n<C35608o.C35610b> f88305s;
    @C12580l

    /* renamed from: t */
    public final C35607n<C35608o.C35612d> f88306t;
    @C12580l

    /* renamed from: u */
    public C35732a f88307u;

    /* renamed from: com.urbanairship.android.layout.model.ButtonModel$a */
    public interface C35732a extends BaseModel.C35725a {
        /* renamed from: e */
        void mo107040e();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ButtonModel(com.urbanairship.android.layout.property.ViewType r19, java.lang.String r20, java.util.Map r21, java.util.List r22, java.lang.String r23, com.urbanairship.android.layout.property.C35835f r24, com.urbanairship.android.layout.property.C35830c r25, com.urbanairship.android.layout.info.C35693v0 r26, java.util.List r27, java.util.List r28, com.urbanairship.android.layout.environment.C35607n r29, com.urbanairship.android.layout.environment.C35607n r30, com.urbanairship.android.layout.environment.ModelEnvironment r31, com.urbanairship.android.layout.model.C35804j r32, int r33, kotlin.jvm.internal.DefaultConstructorMarker r34) {
        /*
            r18 = this;
            r0 = r33
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r21
        L_0x000b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0011
            r8 = r2
            goto L_0x0013
        L_0x0011:
            r8 = r23
        L_0x0013:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0019
            r9 = r2
            goto L_0x001b
        L_0x0019:
            r9 = r24
        L_0x001b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0021
            r10 = r2
            goto L_0x0023
        L_0x0021:
            r10 = r25
        L_0x0023:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0029
            r11 = r2
            goto L_0x002b
        L_0x0029:
            r11 = r26
        L_0x002b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0031
            r12 = r2
            goto L_0x0033
        L_0x0031:
            r12 = r27
        L_0x0033:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0039
            r13 = r2
            goto L_0x003b
        L_0x0039:
            r13 = r28
        L_0x003b:
            r3 = r18
            r4 = r19
            r5 = r20
            r7 = r22
            r14 = r29
            r15 = r30
            r16 = r31
            r17 = r32
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.ButtonModel.<init>(com.urbanairship.android.layout.property.ViewType, java.lang.String, java.util.Map, java.util.List, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @C0346i
    /* renamed from: B */
    public void mo106983B(@C12579k T t) {
        Intrinsics.checkNotNullParameter(t, C40383c.f102945c);
        C11723c2 unused = C12038j.m48061f(mo107004s(), (CoroutineContext) null, (CoroutineStart) null, new ButtonModel$onViewAttached$1(t, this, (C11045c<? super ButtonModel$onViewAttached$1>) null), 3, (Object) null);
    }

    /* renamed from: P */
    public final Object mo107029P(C11045c<? super C11079d2> cVar) {
        if (C35831d.m147744d(this.f88303q)) {
            mo107038Y();
        } else if (C35831d.m147742b(this.f88303q)) {
            Object V = mo107035V(C35831d.m147741a(this.f88303q), cVar);
            if (V == C11063b.m42612h()) {
                return V;
            }
            return C11079d2.f28267a;
        } else {
            if (C35831d.m147745e(this.f88303q)) {
                mo107036W();
            }
            if (C35831d.m147746f(this.f88303q)) {
                mo107037X();
            }
        }
        return C11079d2.f28267a;
    }

    @C12580l
    /* renamed from: Q */
    public final Map<String, JsonValue> mo107030Q() {
        return this.f88302p;
    }

    @C12580l
    /* renamed from: R */
    public final String mo107031R() {
        return this.f88304r;
    }

    @C12579k
    /* renamed from: S */
    public final String mo107032S() {
        return this.f88301o;
    }

    @C12580l
    /* renamed from: T */
    public C35732a mo107000o() {
        return this.f88307u;
    }

    @C12579k
    /* renamed from: U */
    public abstract String mo107034U();

    /* renamed from: V */
    public final Object mo107035V(boolean z, C11045c<? super C11079d2> cVar) {
        mo106986E(new ReportingEvent.C35616b(this.f88301o, mo107034U(), z, mo106997l().mo106629c().mo107378b()), C35603k.m146913i(mo106999n(), (C35867c) null, (C35869e) null, this.f88301o, 3, (Object) null));
        C11723c2 unused = C12038j.m48061f(mo107001p(), (CoroutineContext) null, (CoroutineStart) null, new ButtonModel$handleDismiss$2(this, (C11045c<? super ButtonModel$handleDismiss$2>) null), 3, (Object) null);
        return C11079d2.f28267a;
    }

    /* renamed from: W */
    public final void mo107036W() {
        C35607n<C35608o.C35612d> nVar = this.f88306t;
        if (nVar != null) {
            nVar.mo106668c(ButtonModel$handlePagerNext$2.f88308f);
            return;
        }
        throw new IllegalStateException("Pager state is required for Buttons with pager click behaviors!".toString());
    }

    /* renamed from: X */
    public final void mo107037X() {
        C35607n<C35608o.C35612d> nVar = this.f88306t;
        if (nVar != null) {
            nVar.mo106668c(ButtonModel$handlePagerPrevious$2.f88309f);
            return;
        }
        throw new IllegalStateException("Pager state is required for Buttons with pager click behaviors!".toString());
    }

    /* renamed from: Y */
    public final void mo107038Y() {
        C35732a T = mo107000o();
        if (T != null) {
            T.mo107040e();
        }
        C11723c2 unused = C12038j.m48061f(mo107001p(), (CoroutineContext) null, (CoroutineStart) null, new ButtonModel$handleSubmit$1(this, new LayoutEvent.SubmitForm(this.f88301o, new ButtonModel$handleSubmit$submitEvent$1(this, (C11045c<? super ButtonModel$handleSubmit$submitEvent$1>) null)), (C11045c<? super ButtonModel$handleSubmit$1>) null), 3, (Object) null);
    }

    /* renamed from: Z */
    public void mo106988H(@C12580l C35732a aVar) {
        this.f88307u = aVar;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ButtonModel(@org.jetbrains.annotations.C12579k com.urbanairship.android.layout.property.ViewType r13, @org.jetbrains.annotations.C12579k java.lang.String r14, @org.jetbrains.annotations.C12580l java.util.Map<java.lang.String, ? extends com.urbanairship.json.JsonValue> r15, @org.jetbrains.annotations.C12579k java.util.List<? extends com.urbanairship.android.layout.property.ButtonClickBehaviorType> r16, @org.jetbrains.annotations.C12580l java.lang.String r17, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35835f r18, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.property.C35830c r19, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.info.C35693v0 r20, @org.jetbrains.annotations.C12580l java.util.List<com.urbanairship.android.layout.property.EventHandler> r21, @org.jetbrains.annotations.C12580l java.util.List<? extends com.urbanairship.android.layout.property.EnableBehaviorType> r22, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35610b> r23, @org.jetbrains.annotations.C12580l com.urbanairship.android.layout.environment.C35607n<com.urbanairship.android.layout.environment.C35608o.C35612d> r24, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.environment.ModelEnvironment r25, @org.jetbrains.annotations.C12579k com.urbanairship.android.layout.model.C35804j r26) {
        /*
            r12 = this;
            r9 = r12
            r10 = r14
            r11 = r16
            java.lang.String r0 = "viewType"
            r1 = r13
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            java.lang.String r0 = "identifier"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "clickBehaviors"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "environment"
            r7 = r25
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "properties"
            r8 = r26
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            r0 = r12
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            r9.f88301o = r10
            r0 = r15
            r9.f88302p = r0
            r9.f88303q = r11
            r0 = r17
            r9.f88304r = r0
            r0 = r23
            r9.f88305s = r0
            r0 = r24
            r9.f88306t = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.urbanairship.android.layout.model.ButtonModel.<init>(com.urbanairship.android.layout.property.ViewType, java.lang.String, java.util.Map, java.util.List, java.lang.String, com.urbanairship.android.layout.property.f, com.urbanairship.android.layout.property.c, com.urbanairship.android.layout.info.v0, java.util.List, java.util.List, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.n, com.urbanairship.android.layout.environment.ModelEnvironment, com.urbanairship.android.layout.model.j):void");
    }
}
