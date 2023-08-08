package com.contentsquare.android.sdk;

import com.contentsquare.android.sdk.C14466k4;
import com.usabilla.sdk.ubform.sdk.banner.BannerConfigurableFragment;
import java.util.Iterator;
import java.util.List;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.contentsquare.android.sdk.m1 */
public final class C14514m1 {

    @C11076d0(mo22515d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, mo22516d2 = {"Lcom/contentsquare/android/sdk/k4$e;", "", "name", "", "a", "(Lcom/contentsquare/android/sdk/k4$e;Ljava/lang/String;)Ljava/lang/Boolean;"}, mo22517k = 3, mo22518mv = {1, 4, 3})
    /* renamed from: com.contentsquare.android.sdk.m1$a */
    public static final class C14515a extends Lambda implements C11304p<C14466k4.C14471e, String, Boolean> {

        /* renamed from: a */
        public final /* synthetic */ C14600oe f35901a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C14515a(C14600oe oeVar) {
            super(2);
            this.f35901a = oeVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C14466k4.C14471e eVar, String str) {
            T t;
            Intrinsics.checkNotNullParameter(eVar, "$receiver");
            Intrinsics.checkNotNullParameter(str, "name");
            List<C14466k4.C14468b> e = eVar.mo35727e();
            Intrinsics.checkNotNullExpressionValue(e, "featureFlags");
            Iterator<T> it = e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                C14466k4.C14468b bVar = (C14466k4.C14468b) t;
                Intrinsics.checkNotNullExpressionValue(bVar, "it");
                if (Intrinsics.areEqual((Object) bVar.mo35717c(), (Object) str)) {
                    break;
                }
            }
            C14466k4.C14468b bVar2 = (C14466k4.C14468b) t;
            if (bVar2 == null) {
                return null;
            }
            return Boolean.valueOf(new C14890y9().mo36932a(bVar2, new C14527ma(this.f35901a.mo36108a())) && bVar2.mo35718d());
        }
    }

    /* renamed from: a */
    public static final C14466k4.C14471e m62570a(C14549na naVar) {
        Intrinsics.checkNotNullParameter(naVar, "$this$projectConfiguration");
        boolean h = naVar.mo35986g().mo34676h(C14477k8.CLIENT_MODE_GOD_MODE, false);
        C14771u6 c = naVar.mo35983c();
        Intrinsics.checkNotNullExpressionValue(c, BannerConfigurableFragment.f27258E0);
        C14466k4 c2 = c.mo36561c();
        if (c2 != null) {
            return new C14922z7().mo36945a(c2, h);
        }
        return null;
    }

    /* renamed from: b */
    public static final C11304p<C14466k4.C14471e, String, Boolean> m62571b(C14600oe oeVar) {
        Intrinsics.checkNotNullParameter(oeVar, "$this$featureFlag");
        return new C14515a(oeVar);
    }
}
