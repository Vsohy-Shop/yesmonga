package com.carrefour.fid.android.core.p056di.module.network;

import com.carrefour.fid.android.core.network.RetrofitFactory;
import com.carrefour.fid.android.core.network.headers.C36320a;
import com.carrefour.fid.android.core.network.headers.C36322c;
import com.carrefour.fid.android.core.network.headers.C36324e;
import com.carrefour.fid.android.core.network.headers.C36326g;
import com.carrefour.fid.android.loyalty.data.headers.LoyaltyHeaders;
import com.carrefour.fid.android.shared.p045di.annotation.C28657a;
import com.carrefour.fid.android.shared.p045di.annotation.C28658b;
import com.carrefour.fid.android.shared.p045di.annotation.C28660d;
import com.carrefour.fid.android.shared.p045di.annotation.C28661e;
import com.carrefour.fid.android.shared.p045di.annotation.C28662f;
import com.carrefour.fid.android.shared.p045di.annotation.C28663g;
import com.carrefour.fid.android.shared.p045di.annotation.C28664h;
import com.carrefour.fid.android.shared.p045di.annotation.C28665i;
import com.carrefour.fid.android.shared.p045di.annotation.C28666j;
import com.carrefour.fid.android.shared.p045di.annotation.C28667k;
import com.carrefour.fid.android.shared.p045di.annotation.C28669m;
import com.carrefour.fid.android.shared.p045di.annotation.C28673q;
import com.carrefour.fid.android.shared.util.environment.AppEnvironment;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.core.di.module.network.a */
public final class C36270a {
    @C10315i
    @C12579k
    @C28661e
    /* renamed from: a */
    public final C13092x mo108267a(@C12579k RetrofitFactory retrofitFactory, @C12579k C36324e eVar, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(eVar, "bffCustomerApiHeaders");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        return RetrofitFactory.m149028b(retrofitFactory, appEnvironment.mo84171k(), eVar.getHeaders(), false, false, 4, (Object) null);
    }

    @C10315i
    @C28658b
    @C12579k
    /* renamed from: b */
    public final C13092x mo108268b(@C12579k RetrofitFactory retrofitFactory, @C12579k C36320a aVar, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(aVar, "userAuthApiHeaders");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        return RetrofitFactory.m149028b(retrofitFactory, appEnvironment.mo84167g(), aVar.getHeaders(), true, false, 8, (Object) null);
    }

    @C28660d
    @C10315i
    @C12579k
    /* renamed from: c */
    public final C13092x mo108269c(@C12579k RetrofitFactory retrofitFactory, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        return RetrofitFactory.m149028b(retrofitFactory, appEnvironment.mo84167g(), (Map) null, false, false, 14, (Object) null);
    }

    @C28664h
    @C10315i
    @C12579k
    /* renamed from: d */
    public final C13092x mo108270d(@C12579k RetrofitFactory retrofitFactory, @C12579k C36322c cVar, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(cVar, "bffApiHeaders");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        return retrofitFactory.mo108378c(appEnvironment.mo84172l(), cVar.getHeaders(), false);
    }

    @C28663g
    @C10315i
    @C12579k
    /* renamed from: e */
    public final C13092x mo108271e(@C12579k RetrofitFactory retrofitFactory, @C12579k C36322c cVar, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(cVar, "bffApiHeaders");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        return RetrofitFactory.m149029d(retrofitFactory, appEnvironment.mo84172l(), cVar.getHeaders(), false, 4, (Object) null);
    }

    @C10315i
    @C12579k
    @C28665i
    /* renamed from: f */
    public final C13092x mo108272f(@C12579k RetrofitFactory retrofitFactory, @C12579k C36322c cVar, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(cVar, "userAuthApiHeaders");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        return RetrofitFactory.m149029d(retrofitFactory, appEnvironment.mo84173m(), cVar.getHeaders(), false, 4, (Object) null);
    }

    @C28667k
    @C10315i
    @C12579k
    /* renamed from: g */
    public final C13092x mo108273g(@C12579k RetrofitFactory retrofitFactory, @C12579k AppEnvironment appEnvironment, @C12579k C36326g gVar) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        Intrinsics.checkNotNullParameter(gVar, "catalogApiHeaders");
        return RetrofitFactory.m149028b(retrofitFactory, appEnvironment.mo84176p(), gVar.mo108386a(), false, false, 12, (Object) null);
    }

    @C10315i
    @C12579k
    @C28669m
    /* renamed from: h */
    public final C13092x mo108274h(@C12579k RetrofitFactory retrofitFactory, @C12579k C36320a aVar, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(aVar, "userAuthApiHeaders");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        return RetrofitFactory.m149029d(retrofitFactory, appEnvironment.mo84167g(), aVar.getHeaders(), false, 4, (Object) null);
    }

    @C10315i
    @C28662f
    @C12579k
    /* renamed from: i */
    public final C13092x mo108275i(@C12579k RetrofitFactory retrofitFactory, @C12579k LoyaltyHeaders loyaltyHeaders, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(loyaltyHeaders, "bffLoyaltyApiHeaders");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        return RetrofitFactory.m149028b(retrofitFactory, appEnvironment.mo84171k(), loyaltyHeaders.getCreateOrAttachLoyaltyCardHeaders(), false, false, 12, (Object) null);
    }

    @C10315i
    @C12579k
    @C28673q
    /* renamed from: j */
    public final C13092x mo108276j(@C12579k RetrofitFactory retrofitFactory, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        return retrofitFactory.mo108379e(appEnvironment.mo84167g());
    }

    @C10315i
    @C12579k
    @C28657a
    /* renamed from: k */
    public final C13092x mo108277k(@C12579k RetrofitFactory retrofitFactory, @C12579k C36320a aVar, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(aVar, "userAuthApiHeaders");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        return RetrofitFactory.m149028b(retrofitFactory, appEnvironment.mo84167g(), aVar.getHeaders(), false, false, 12, (Object) null);
    }

    @C10315i
    @C28666j
    @C12579k
    /* renamed from: l */
    public final C13092x mo108278l(@C12579k RetrofitFactory retrofitFactory, @C12579k C36322c cVar, @C12579k AppEnvironment appEnvironment) {
        Intrinsics.checkNotNullParameter(retrofitFactory, "factory");
        Intrinsics.checkNotNullParameter(cVar, "bffApiHeaders");
        Intrinsics.checkNotNullParameter(appEnvironment, "appEnvironment");
        return RetrofitFactory.m149029d(retrofitFactory, appEnvironment.mo84174n(), cVar.getHeaders(), false, 4, (Object) null);
    }
}
