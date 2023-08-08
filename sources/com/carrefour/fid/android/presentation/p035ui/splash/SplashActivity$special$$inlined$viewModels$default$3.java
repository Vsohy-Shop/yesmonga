package com.carrefour.fid.android.presentation.p035ui.splash;

import androidx.activity.ComponentActivity;
import androidx.lifecycle.viewmodel.C19477a;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, mo22516d2 = {"Landroidx/lifecycle/v0;", "VM", "Landroidx/lifecycle/viewmodel/a;", "a", "()Landroidx/lifecycle/viewmodel/a;", "androidx/activity/ActivityViewModelLazyKt$viewModels$4"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nActivityViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt$viewModels$4\n*L\n1#1,90:1\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.splash.SplashActivity$special$$inlined$viewModels$default$3 */
public final class SplashActivity$special$$inlined$viewModels$default$3 extends Lambda implements C11289a<C19477a> {
    final /* synthetic */ C11289a $extrasProducer;
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SplashActivity$special$$inlined$viewModels$default$3(C11289a aVar, ComponentActivity componentActivity) {
        super(0);
        this.$extrasProducer = aVar;
        this.$this_viewModels = componentActivity;
    }

    @C12579k
    /* renamed from: a */
    public final C19477a invoke() {
        C19477a aVar;
        C11289a aVar2 = this.$extrasProducer;
        if (aVar2 != null && (aVar = (C19477a) aVar2.invoke()) != null) {
            return aVar;
        }
        C19477a defaultViewModelCreationExtras = this.$this_viewModels.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
        return defaultViewModelCreationExtras;
    }
}
