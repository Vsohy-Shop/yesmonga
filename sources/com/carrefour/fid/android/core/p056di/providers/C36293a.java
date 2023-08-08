package com.carrefour.fid.android.core.p056di.providers;

import android.content.Context;
import com.carrefour.fid.android.utils.initializer.AnalyticsInitializer;
import com.carrefour.fid.android.utils.initializer.AudienceTrackingInitializer;
import com.carrefour.fid.android.utils.initializer.FirebaseAppInitializer;
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
@C11076d0(mo22515d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \f2\u00020\u0001:\u0001\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH&¨\u0006\r"}, mo22516d2 = {"Lcom/carrefour/fid/android/core/di/providers/a;", "", "Lcom/carrefour/fid/android/utils/initializer/AnalyticsInitializer;", "analyticsInitializer", "Lkotlin/d2;", "e", "Lcom/carrefour/fid/android/utils/initializer/FirebaseAppInitializer;", "firebaseInitializer", "f", "Lcom/carrefour/fid/android/utils/initializer/AudienceTrackingInitializer;", "audienceTrackingInitializer", "j", "a", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.core.di.providers.a */
public interface C36293a {
    @C12579k

    /* renamed from: a */
    public static final C36294a f89629a = C36294a.f89630a;

    /* renamed from: com.carrefour.fid.android.core.di.providers.a$a */
    public static final class C36294a {

        /* renamed from: a */
        public static final /* synthetic */ C36294a f89630a = new C36294a();

        @C12579k
        /* renamed from: a */
        public final C36293a mo108299a(@C10255b @C12579k Context context) {
            Intrinsics.checkNotNullParameter(context, C9175a.f24932Y);
            return (C36293a) C10174e.m38392d(context, C36293a.class);
        }
    }

    /* renamed from: e */
    void mo33967e(@C12579k AnalyticsInitializer analyticsInitializer);

    /* renamed from: f */
    void mo33974f(@C12579k FirebaseAppInitializer firebaseAppInitializer);

    /* renamed from: j */
    void mo34001j(@C12579k AudienceTrackingInitializer audienceTrackingInitializer);
}
