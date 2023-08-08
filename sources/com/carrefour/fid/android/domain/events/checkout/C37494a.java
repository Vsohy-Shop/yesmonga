package com.carrefour.fid.android.domain.events.checkout;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.models.pickup.C38080a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.C11909g;
import kotlinx.coroutines.flow.C11911i;
import kotlinx.coroutines.flow.C11944n;
import kotlinx.coroutines.flow.C11945o;
import org.jetbrains.annotations.C12579k;

@Singleton
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.domain.events.checkout.a */
public final class C37494a implements C37497c {

    /* renamed from: c */
    public static final int f94224c = 8;
    @C12579k

    /* renamed from: a */
    public final C11911i<C38080a> f94225a;
    @C12579k

    /* renamed from: b */
    public final C11944n<C38080a> f94226b;

    @Inject
    public C37494a() {
        C11911i<C38080a> a = C11945o.m47609a(0, 1, BufferOverflow.DROP_OLDEST);
        this.f94225a = a;
        this.f94226b = C11909g.m47467l(a);
    }

    @C12579k
    /* renamed from: a */
    public C11944n<C38080a> mo114259a() {
        return this.f94226b;
    }

    /* renamed from: b */
    public final void mo114260b(@C12579k C38080a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "pickupPoint");
        this.f94225a.mo24198a(aVar);
    }
}
