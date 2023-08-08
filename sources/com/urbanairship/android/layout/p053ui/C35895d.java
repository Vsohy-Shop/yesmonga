package com.urbanairship.android.layout.p053ui;

import android.view.View;
import androidx.lifecycle.C19476v0;
import com.google.android.gms.common.internal.C40852x;
import com.urbanairship.C36059m;
import com.urbanairship.android.layout.C35581e;
import com.urbanairship.android.layout.C35700k;
import com.urbanairship.android.layout.C35701l;
import com.urbanairship.android.layout.ModelFactoryException;
import com.urbanairship.android.layout.environment.AttributeHandler;
import com.urbanairship.android.layout.environment.C35597g;
import com.urbanairship.android.layout.environment.C35602j;
import com.urbanairship.android.layout.environment.C35603k;
import com.urbanairship.android.layout.environment.C35606m;
import com.urbanairship.android.layout.environment.ModelEnvironment;
import com.urbanairship.android.layout.info.C35686t0;
import com.urbanairship.android.layout.model.BaseModel;
import com.urbanairship.android.layout.reporting.DisplayTimer;
import java.util.concurrent.CancellationException;
import kotlin.jvm.C11315i;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

/* renamed from: com.urbanairship.android.layout.ui.d */
public final class C35895d extends C19476v0 {
    @C12580l

    /* renamed from: a */
    public BaseModel<?, ?> f88784a;
    @C12580l

    /* renamed from: b */
    public ModelEnvironment f88785b;

    /* renamed from: c */
    public final int f88786c = View.generateViewId();

    /* renamed from: e0 */
    public static /* synthetic */ ModelEnvironment m148014e0(C35895d dVar, C35606m mVar, C35700k kVar, DisplayTimer displayTimer, C35603k kVar2, int i, Object obj) {
        if ((i & 8) != 0) {
            kVar2 = C35603k.f88015h;
        }
        return dVar.mo107531d0(mVar, kVar, displayTimer, kVar2);
    }

    /* renamed from: h0 */
    public static /* synthetic */ BaseModel m148015h0(C35895d dVar, C35686t0 t0Var, ModelEnvironment modelEnvironment, C35581e eVar, int i, Object obj) throws ModelFactoryException {
        if ((i & 4) != 0) {
            eVar = new C35701l();
        }
        return dVar.mo107533g0(t0Var, modelEnvironment, eVar);
    }

    @C12579k
    @C11315i
    /* renamed from: c0 */
    public final ModelEnvironment mo107530c0(@C12579k C35606m mVar, @C12579k C35700k kVar, @C12579k DisplayTimer displayTimer) {
        Intrinsics.checkNotNullParameter(mVar, "reporter");
        Intrinsics.checkNotNullParameter(kVar, C40852x.C40853a.f103958a);
        Intrinsics.checkNotNullParameter(displayTimer, "displayTimer");
        return m148014e0(this, mVar, kVar, displayTimer, (C35603k) null, 8, (Object) null);
    }

    @C12579k
    @C11315i
    /* renamed from: d0 */
    public final ModelEnvironment mo107531d0(@C12579k C35606m mVar, @C12579k C35700k kVar, @C12579k DisplayTimer displayTimer, @C12579k C35603k kVar2) {
        Intrinsics.checkNotNullParameter(mVar, "reporter");
        Intrinsics.checkNotNullParameter(kVar, C40852x.C40853a.f103958a);
        Intrinsics.checkNotNullParameter(displayTimer, "displayTimer");
        Intrinsics.checkNotNullParameter(kVar2, "layoutState");
        ModelEnvironment modelEnvironment = this.f88785b;
        if (modelEnvironment != null) {
            return modelEnvironment;
        }
        ModelEnvironment modelEnvironment2 = new ModelEnvironment(kVar2, mVar, new C35597g(kVar), displayTimer, (C12074o0) null, (AttributeHandler) null, (C35602j) null, 112, (DefaultConstructorMarker) null);
        this.f88785b = modelEnvironment2;
        return modelEnvironment2;
    }

    @C11315i
    @C12579k
    /* renamed from: f0 */
    public final BaseModel<?, ?> mo107532f0(@C12579k C35686t0 t0Var, @C12579k ModelEnvironment modelEnvironment) throws ModelFactoryException {
        Intrinsics.checkNotNullParameter(t0Var, "viewInfo");
        Intrinsics.checkNotNullParameter(modelEnvironment, "modelEnvironment");
        return m148015h0(this, t0Var, modelEnvironment, (C35581e) null, 4, (Object) null);
    }

    @C11315i
    @C12579k
    /* renamed from: g0 */
    public final BaseModel<?, ?> mo107533g0(@C12579k C35686t0 t0Var, @C12579k ModelEnvironment modelEnvironment, @C12579k C35581e eVar) throws ModelFactoryException {
        Intrinsics.checkNotNullParameter(t0Var, "viewInfo");
        Intrinsics.checkNotNullParameter(modelEnvironment, "modelEnvironment");
        Intrinsics.checkNotNullParameter(eVar, "factory");
        BaseModel<?, ?> baseModel = this.f88784a;
        if (baseModel != null) {
            return baseModel;
        }
        BaseModel<?, ?> a = eVar.mo106605a(t0Var, modelEnvironment);
        this.f88784a = a;
        return a;
    }

    /* renamed from: i0 */
    public final int mo107534i0() {
        return this.f88786c;
    }

    public void onCleared() {
        C12074o0 g;
        C36059m.m148419o("Lifecycle: CLEARED", new Object[0]);
        ModelEnvironment modelEnvironment = this.f88785b;
        if (modelEnvironment != null && (g = modelEnvironment.mo106633g()) != null) {
            C12079p0.m48265f(g, (CancellationException) null, 1, (Object) null);
        }
    }
}
