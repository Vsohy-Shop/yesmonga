package com.carrefour.fid.android.presentation.p035ui.onboarding;

import android.os.Bundle;
import androidx.activity.compose.C0227c;
import androidx.compose.runtime.C8602q;
import androidx.compose.runtime.internal.C8553b;
import androidx.compose.runtime.internal.C8567o;
import com.carrefour.fid.android.presentation.viewmodels.splash.C27420a;
import dagger.hilt.android.C10164b;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014R\"\u0010\f\u001a\u00020\u00068\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo22516d2 = {"Lcom/carrefour/fid/android/presentation/ui/onboarding/SplashOnBoardingActivity;", "Landroidx/appcompat/app/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lkotlin/d2;", "onCreate", "Lcom/carrefour/fid/android/presentation/viewmodels/splash/a;", "X0", "Lcom/carrefour/fid/android/presentation/viewmodels/splash/a;", "()Lcom/carrefour/fid/android/presentation/viewmodels/splash/a;", "Y0", "(Lcom/carrefour/fid/android/presentation/viewmodels/splash/a;)V", "splashAnalyticsViewModel", "<init>", "()V", "app_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C10164b
@C8567o(parameters = 0)
/* renamed from: com.carrefour.fid.android.presentation.ui.onboarding.SplashOnBoardingActivity */
public final class SplashOnBoardingActivity extends C24656a {

    /* renamed from: Y0 */
    public static final int f61239Y0 = 8;
    @Inject

    /* renamed from: X0 */
    public C27420a f61240X0;

    @C12579k
    /* renamed from: X0 */
    public final C27420a mo72045X0() {
        C27420a aVar = this.f61240X0;
        if (aVar != null) {
            return aVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("splashAnalyticsViewModel");
        return null;
    }

    /* renamed from: Y0 */
    public final void mo72046Y0(@C12579k C27420a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f61240X0 = aVar;
    }

    public void onCreate(@C12580l Bundle bundle) {
        super.onCreate(bundle);
        C0227c.m1312b(this, (C8602q) null, C8553b.m31049c(514037991, true, new SplashOnBoardingActivity$onCreate$1(this)), 1, (Object) null);
    }
}
