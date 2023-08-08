package com.usabilla.sdk.ubform.p008di;

import android.content.Context;
import com.squareup.moshi.C35410s;
import com.usabilla.sdk.ubform.sdk.featurebilla.C9950a;
import com.usabilla.sdk.ubform.sdk.featurebilla.C9952b;
import com.usabilla.sdk.ubform.sdk.featurebilla.C9953c;
import com.usabilla.sdk.ubform.sdk.featurebilla.FeaturebillaManagerImpl;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/di/e;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
/* renamed from: com.usabilla.sdk.ubform.di.UsabillaDIKt$createFeaturebillaModule$1 */
public final class UsabillaDIKt$createFeaturebillaModule$1 extends Lambda implements C11300l<C9822e, C11079d2> {
    final /* synthetic */ Context $context;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UsabillaDIKt$createFeaturebillaModule$1(Context context) {
        super(1);
        this.$context = context;
    }

    /* renamed from: a */
    public final void mo20090a(@C12579k C9822e eVar) {
        Intrinsics.checkNotNullParameter(eVar, "$this$module");
        C98031 r0 = C98031.f26861f;
        eVar.mo20153b().put(C35410s.class, new C9824g(r0));
        C98042 r02 = C98042.f26862f;
        eVar.mo20153b().put(C9952b.class, new C9824g(r02));
        C98053 r03 = C98053.f26863f;
        eVar.mo20153b().put(C9953c.class, new C9824g(r03));
        final Context context = this.$context;
        C98064 r04 = new C11300l<C9818a, C9950a>() {
            @C12579k
            /* renamed from: a */
            public final C9950a invoke(@C12579k C9818a aVar) {
                Intrinsics.checkNotNullParameter(aVar, "$this$bind");
                return new FeaturebillaManagerImpl((C9953c) aVar.mo20109c(C9953c.class), UsabillaDIKt.m36702o(context));
            }
        };
        eVar.mo20153b().put(C9950a.class, new C9824g(r04));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo20090a((C9822e) obj);
        return C11079d2.f28267a;
    }
}
