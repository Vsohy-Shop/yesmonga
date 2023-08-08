package com.carrefour.fid.android.account.p016di;

import com.carrefour.fid.android.account.data.headers.C13196a;
import com.carrefour.fid.android.account.data.repositories.C13204a;
import com.carrefour.fid.android.account.data.service.C13210b;
import com.carrefour.fid.android.account.domain.events.C13239a;
import com.carrefour.fid.android.account.domain.interactors.account.C13246a;
import com.carrefour.fid.android.account.domain.interactors.account.C13248c;
import com.carrefour.fid.android.account.domain.interactors.address.AccountUpdateUserAddressUseCase;
import com.carrefour.fid.android.account.domain.interactors.address.dqe.AccountGetAddressGeolocationUseCase;
import com.carrefour.fid.android.account.domain.interactors.login.AccountRefreshTokenUseCase;
import com.carrefour.fid.android.account.domain.interactors.login.AccountRevokeTokenUseCase;
import com.carrefour.fid.android.account.domain.interactors.login.C13262a;
import com.carrefour.fid.android.account.domain.interactors.login.C13264c;
import com.carrefour.fid.android.account.domain.interactors.user.AccountClearCachedUserInfoUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserAddressUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoStoreUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserInfoUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.AccountGetUserPhoneUseCase;
import com.carrefour.fid.android.account.domain.interactors.user.C13277f;
import com.carrefour.fid.android.account.domain.interactors.user.C13279h;
import com.carrefour.fid.android.domain.events.account.C37493a;
import com.carrefour.fid.android.domain.interactors.account.C37515a;
import com.carrefour.fid.android.domain.interactors.account.C37516b;
import com.carrefour.fid.android.domain.interactors.account.C37517c;
import com.carrefour.fid.android.domain.interactors.account.C37518d;
import com.carrefour.fid.android.domain.interactors.account.C37519e;
import com.carrefour.fid.android.domain.interactors.account.C37521g;
import com.carrefour.fid.android.domain.interactors.account.C37522h;
import com.carrefour.fid.android.domain.interactors.account.C37523i;
import com.carrefour.fid.android.domain.interactors.address.C37542a;
import com.carrefour.fid.android.domain.interactors.login.C37693a;
import com.carrefour.fid.android.domain.interactors.user.C37875c;
import com.carrefour.fid.android.domain.interactors.user.C37877d;
import com.carrefour.fid.android.domain.interactors.user.C37878e;
import com.carrefour.fid.android.domain.interactors.user.C37884g;
import com.carrefour.fid.android.domain.interactors.user.C37886i;
import com.carrefour.fid.android.shared.data.headers.C28642c;
import com.carrefour.fid.android.shared.network.C28799a;
import com.carrefour.fid.android.shared.p045di.annotation.C28660d;
import dagger.C10147a;
import dagger.C10159h;
import dagger.C10315i;
import dagger.hilt.C10267e;
import dagger.hilt.components.C10265a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import retrofit2.C13092x;

@C10159h
@C10267e({C10265a.class})
/* renamed from: com.carrefour.fid.android.account.di.a */
public interface C13233a {
    @C12579k

    /* renamed from: a */
    public static final C13234a f32576a = C13234a.f32577a;

    /* renamed from: com.carrefour.fid.android.account.di.a$a */
    public static final class C13234a {

        /* renamed from: a */
        public static final /* synthetic */ C13234a f32577a = new C13234a();

        @C10315i
        @C12579k
        /* renamed from: a */
        public final C13210b mo31411a(@C28660d @C12579k C13092x xVar) {
            Intrinsics.checkNotNullParameter(xVar, "retrofit");
            Object g = xVar.mo30586g(C13210b.class);
            Intrinsics.checkNotNullExpressionValue(g, "retrofit.create(DQEAddre…esApiService::class.java)");
            return (C13210b) g;
        }
    }

    @C10147a
    @C12579k
    /* renamed from: a */
    C37518d mo31393a(@C12579k C13277f fVar);

    @C10147a
    @C12579k
    /* renamed from: b */
    C37519e mo31394b(@C12579k C13264c cVar);

    @C10147a
    @C12579k
    /* renamed from: c */
    C37884g mo31395c(@C12579k AccountGetUserPhoneUseCase accountGetUserPhoneUseCase);

    @C10147a
    @C12579k
    /* renamed from: d */
    C37877d mo31396d(@C12579k AccountGetUserInfoStoreUseCase accountGetUserInfoStoreUseCase);

    @C10147a
    @C12579k
    /* renamed from: e */
    C37493a mo31397e(@C12579k C13239a aVar);

    @C10147a
    @C12579k
    /* renamed from: f */
    C37875c mo31398f(@C12579k AccountGetUserAddressUseCase accountGetUserAddressUseCase);

    @C10147a
    @C12579k
    /* renamed from: g */
    C28799a mo31399g(@C12579k C13196a aVar);

    @C10147a
    @C12579k
    /* renamed from: h */
    C37886i mo31400h(@C12579k C13279h hVar);

    @C10147a
    @C12579k
    /* renamed from: i */
    C37517c mo31401i(@C12579k C13246a aVar);

    @C10147a
    @C12579k
    /* renamed from: j */
    C28642c mo31402j(@C12579k C13204a aVar);

    @C10147a
    @C12579k
    /* renamed from: k */
    C37523i mo31403k(@C12579k AccountUpdateUserAddressUseCase accountUpdateUserAddressUseCase);

    @C10147a
    @C12579k
    /* renamed from: l */
    C37693a mo31404l(@C12579k C13262a aVar);

    @C10147a
    @C12579k
    /* renamed from: m */
    C37521g mo31405m(@C12579k AccountRefreshTokenUseCase accountRefreshTokenUseCase);

    @C10147a
    @C12579k
    /* renamed from: n */
    C37542a mo31406n(@C12579k AccountGetAddressGeolocationUseCase accountGetAddressGeolocationUseCase);

    @C10147a
    @C12579k
    /* renamed from: o */
    C37516b mo31407o(@C12579k C13248c cVar);

    @C10147a
    @C12579k
    /* renamed from: p */
    C37878e mo31408p(@C12579k AccountGetUserInfoUseCase accountGetUserInfoUseCase);

    @C10147a
    @C12579k
    /* renamed from: q */
    C37515a mo31409q(@C12579k AccountClearCachedUserInfoUseCase accountClearCachedUserInfoUseCase);

    @C10147a
    @C12579k
    /* renamed from: r */
    C37522h mo31410r(@C12579k AccountRevokeTokenUseCase accountRevokeTokenUseCase);
}
