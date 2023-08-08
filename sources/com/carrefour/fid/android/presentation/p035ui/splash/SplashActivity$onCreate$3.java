package com.carrefour.fid.android.presentation.p035ui.splash;

import com.carrefour.fid.android.presentation.p035ui.splash.SplashActivity;
import com.carrefour.fid.android.presentation.viewmodels.privacy.PrivacyViewModel;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.splash.SplashActivity$onCreate$3", mo22502f = "SplashActivity.kt", mo22503i = {0}, mo22504l = {77}, mo22505m = "invokeSuspend", mo22506n = {"isConnected"}, mo22507s = {"Z$0"})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "isConnected", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.splash.SplashActivity$onCreate$3 */
public final class SplashActivity$onCreate$3 extends SuspendLambda implements C11304p<Boolean, C11045c<? super C11079d2>, Object> {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ SplashActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashActivity$onCreate$3(SplashActivity splashActivity, C11045c<? super SplashActivity$onCreate$3> cVar) {
        super(2, cVar);
        this.this$0 = splashActivity;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SplashActivity$onCreate$3 splashActivity$onCreate$3 = new SplashActivity$onCreate$3(this.this$0, cVar);
        splashActivity$onCreate$3.Z$0 = ((Boolean) obj).booleanValue();
        return splashActivity$onCreate$3;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo74753g(boolean z, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SplashActivity$onCreate$3) create(Boolean.valueOf(z), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo74753g(((Boolean) obj).booleanValue(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        boolean z;
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            boolean z2 = this.Z$0;
            this.Z$0 = z2;
            this.label = 1;
            if (DelayKt.m45925b(2000, this) == h) {
                return h;
            }
            z = z2;
        } else if (i == 1) {
            z = this.Z$0;
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        PrivacyViewModel Y0 = this.this$0.mo74723f1();
        SplashActivity splashActivity = this.this$0;
        Y0.mo78962m0().mo57491k(splashActivity, new SplashActivity.C25733b(new SplashActivity$onCreate$3$1$1(splashActivity, z)));
        Y0.mo78964o0();
        return C11079d2.f28267a;
    }
}
