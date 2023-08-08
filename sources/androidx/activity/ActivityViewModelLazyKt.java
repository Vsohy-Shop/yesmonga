package androidx.activity;

import androidx.annotation.C0353k0;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.viewmodel.C19477a;
import kotlin.C11395k;
import kotlin.C11677z;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;

public final class ActivityViewModelLazyKt {
    @C11395k(level = DeprecationLevel.f28051c, message = "Superseded by viewModels that takes a CreationExtras")
    @C0353k0
    /* renamed from: a */
    public static final /* synthetic */ <VM extends C19476v0> C11677z<VM> m1182a(ComponentActivity componentActivity, C11289a<? extends C19502x0.C19506b> aVar) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(C11342l0.m43547d(C19476v0.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    @C0353k0
    /* renamed from: b */
    public static final /* synthetic */ <VM extends C19476v0> C11677z<VM> m1183b(ComponentActivity componentActivity, C11289a<? extends C19477a> aVar, C11289a<? extends C19502x0.C19506b> aVar2) {
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(C11342l0.m43547d(C19476v0.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }

    /* renamed from: c */
    public static /* synthetic */ C11677z m1184c(ComponentActivity componentActivity, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (aVar == null) {
            aVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(C11342l0.m43547d(C19476v0.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), aVar, new ActivityViewModelLazyKt$viewModels$2(componentActivity));
    }

    /* renamed from: d */
    public static /* synthetic */ C11677z m1185d(ComponentActivity componentActivity, C11289a aVar, C11289a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (aVar2 == null) {
            aVar2 = new ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        Intrinsics.reifiedOperationMarker(4, "VM");
        return new ViewModelLazy(C11342l0.m43547d(C19476v0.class), new ActivityViewModelLazyKt$viewModels$3(componentActivity), aVar2, new ActivityViewModelLazyKt$viewModels$4(aVar, componentActivity));
    }
}
