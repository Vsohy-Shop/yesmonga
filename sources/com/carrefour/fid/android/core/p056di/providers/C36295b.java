package com.carrefour.fid.android.core.p056di.providers;

import android.content.Context;
import com.carrefour.fid.android.services.OneAppFCMService;
import com.urbanairship.iam.events.C9175a;
import dagger.hilt.C10262b;
import dagger.hilt.C10267e;
import dagger.hilt.android.C10174e;
import dagger.hilt.android.qualifiers.C10255b;
import dagger.hilt.components.C10265a;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C10267e({C10265a.class})
@C10262b
@C11076d0(mo22515d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/di/providers/b;", "", "Lcom/carrefour/fid/android/services/OneAppFCMService;", "oneAppFCMService", "Lkotlin/d2;", "q", "b", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.core.di.providers.b */
public interface C36295b {
    @C12579k

    /* renamed from: b */
    public static final C36296a f89631b = C36296a.f89632a;

    /* renamed from: com.carrefour.fid.android.core.di.providers.b$a */
    public static final class C36296a {

        /* renamed from: a */
        public static final /* synthetic */ C36296a f89632a = new C36296a();

        @C12579k
        /* renamed from: a */
        public final C36295b mo108300a(@C10255b @C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            return (C36295b) C10174e.m38392d(context, C36295b.class);
        }
    }

    /* renamed from: q */
    void mo34049q(@C12579k OneAppFCMService oneAppFCMService);
}
