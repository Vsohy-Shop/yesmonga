package com.usabilla.sdk.ubform.p008di;

import android.content.Context;
import com.android.volley.C21764n;
import com.usabilla.sdk.ubform.AppInfo;
import com.usabilla.sdk.ubform.PlayStoreInfo;
import com.usabilla.sdk.ubform.net.C9853d;
import com.usabilla.sdk.ubform.net.http.C9855a;
import com.usabilla.sdk.ubform.net.http.C9860b;
import com.usabilla.sdk.ubform.net.http.C9866f;
import com.usabilla.sdk.ubform.net.http.C9870g;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/di/e;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.di.UsabillaDIKt$createCommonModule$1 */
public final class UsabillaDIKt$createCommonModule$1 extends Lambda implements C11300l<C9822e, C11079d2> {
    final /* synthetic */ String $appId;
    final /* synthetic */ Context $context;
    final /* synthetic */ C9870g $httpClient;
    final /* synthetic */ PlayStoreInfo $playStoreInfo;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaDIKt$createCommonModule$1(Context context, String str, PlayStoreInfo playStoreInfo, C9870g gVar) {
        super(1);
        this.$context = context;
        this.$appId = str;
        this.$playStoreInfo = playStoreInfo;
        this.$httpClient = gVar;
    }

    /* renamed from: a */
    public final void mo20077a(@C12579k C9822e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$module");
        final Context context = this.$context;
        C97911 r0 = new C11300l<C9818a, C21764n>() {
            @C12579k
            /* renamed from: a */
            public final C21764n invoke(@C12579k C9818a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$bind");
                return UsabillaDIKt.m36699l(context);
            }
        };
        eVar.mo20153b().put(C21764n.class, new C9824g(r0));
        final Context context2 = this.$context;
        final String str = this.$appId;
        C97922 r02 = new C11300l<C9818a, AppInfo>() {
            @C12579k
            /* renamed from: a */
            public final AppInfo invoke(@C12579k C9818a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$bind");
                return UsabillaDIKt.m36691d(context2, str);
            }
        };
        eVar.mo20153b().put(AppInfo.class, new C9824g(r02));
        final PlayStoreInfo playStoreInfo = this.$playStoreInfo;
        C97933 r03 = new C11300l<C9818a, PlayStoreInfo>() {
            @C12579k
            /* renamed from: a */
            public final PlayStoreInfo invoke(@C12579k C9818a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$bind");
                return playStoreInfo;
            }
        };
        eVar.mo20153b().put(PlayStoreInfo.class, new C9824g(r03));
        final C9870g gVar = this.$httpClient;
        C97944 r04 = new C11300l<C9818a, C9870g>() {
            @C12579k
            /* renamed from: a */
            public final C9870g invoke(@C12579k C9818a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$bind");
                C9870g gVar = gVar;
                if (gVar == null) {
                    return new C9860b((C21764n) aVar.mo20109c(C21764n.class), new C9866f());
                }
                return gVar;
            }
        };
        eVar.mo20153b().put(C9870g.class, new C9824g(r04));
        C97955 r05 = C97955.f26855f;
        eVar.mo20153b().put(C9855a.class, new C9824g(r05));
        C97966 r06 = C97966.f26856f;
        eVar.mo20153b().put(C9853d.class, new C9824g(r06));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20077a((C9822e) obj);
        return C11079d2.f28267a;
    }
}
