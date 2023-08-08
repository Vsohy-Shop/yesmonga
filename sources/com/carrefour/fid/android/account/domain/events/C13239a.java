package com.carrefour.fid.android.account.domain.events;

import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.domain.events.account.C37493a;
import com.carrefour.fid.android.domain.models.account.C37947a;
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
/* renamed from: com.carrefour.fid.android.account.domain.events.a */
public final class C13239a implements C37493a {

    /* renamed from: c */
    public static final int f32581c = 8;
    @C12579k

    /* renamed from: a */
    public final C11911i<C37947a> f32582a;
    @C12579k

    /* renamed from: b */
    public final C11944n<C37947a> f32583b;

    @Inject
    public C13239a() {
        C11911i<C37947a> a = C11945o.m47609a(0, 1, BufferOverflow.DROP_OLDEST);
        this.f32582a = a;
        this.f32583b = C11909g.m47467l(a);
    }

    @C12579k
    /* renamed from: a */
    public C11944n<C37947a> mo31415a() {
        return this.f32583b;
    }

    /* renamed from: b */
    public final void mo31416b(@C12579k C37947a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "data");
        this.f32582a.mo24198a(aVar);
    }
}
