package androidx.fragment.app;

import androidx.annotation.C0353k0;
import androidx.lifecycle.C19392a1;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.viewmodel.C19477a;
import kotlin.C10864b0;
import kotlin.C11395k;
import kotlin.C11677z;
import kotlin.DeprecationLevel;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

public final class FragmentViewModelLazyKt {
    @C11395k(level = DeprecationLevel.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    @C0353k0
    /* renamed from: c */
    public static final /* synthetic */ <VM extends C19476v0> C11677z<VM> m89918c(Fragment fragment, C11289a<? extends C19502x0.C19506b> aVar) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        C11494d d = C11342l0.m43547d(C19476v0.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return m89923h(fragment, d, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, aVar);
    }

    @C0353k0
    /* renamed from: d */
    public static final /* synthetic */ <VM extends C19476v0> C11677z<VM> m89919d(Fragment fragment, C11289a<? extends C19477a> aVar, C11289a<? extends C19502x0.C19506b> aVar2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        C11494d d = C11342l0.m43547d(C19476v0.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return m89923h(fragment, d, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, aVar2);
    }

    /* renamed from: e */
    public static /* synthetic */ C11677z m89920e(Fragment fragment, C11289a aVar, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        C11494d d = C11342l0.m43547d(C19476v0.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        FragmentViewModelLazyKt$activityViewModels$2 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        if (aVar == null) {
            aVar = new FragmentViewModelLazyKt$activityViewModels$3(fragment);
        }
        return m89923h(fragment, d, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, aVar);
    }

    /* renamed from: f */
    public static /* synthetic */ C11677z m89921f(Fragment fragment, C11289a aVar, C11289a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = null;
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        C11494d d = C11342l0.m43547d(C19476v0.class);
        FragmentViewModelLazyKt$activityViewModels$4 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4(fragment);
        FragmentViewModelLazyKt$activityViewModels$5 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(aVar, fragment);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$activityViewModels$6(fragment);
        }
        return m89923h(fragment, d, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, aVar2);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    @C0353k0
    /* renamed from: g */
    public static final /* synthetic */ C11677z m89922g(Fragment fragment, C11494d dVar, C11289a aVar, C11289a aVar2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "viewModelClass");
        Intrinsics.checkNotNullParameter(aVar, "storeProducer");
        return m89923h(fragment, dVar, aVar, new FragmentViewModelLazyKt$createViewModelLazy$1(fragment), aVar2);
    }

    @C0353k0
    @C12579k
    /* renamed from: h */
    public static final <VM extends C19476v0> C11677z<VM> m89923h(@C12579k Fragment fragment, @C12579k C11494d<VM> dVar, @C12579k C11289a<? extends C19392a1> aVar, @C12579k C11289a<? extends C19477a> aVar2, @C12580l C11289a<? extends C19502x0.C19506b> aVar3) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(dVar, "viewModelClass");
        Intrinsics.checkNotNullParameter(aVar, "storeProducer");
        Intrinsics.checkNotNullParameter(aVar2, "extrasProducer");
        if (aVar3 == null) {
            aVar3 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new ViewModelLazy(dVar, aVar, aVar3, aVar2);
    }

    /* renamed from: i */
    public static /* synthetic */ C11677z m89924i(Fragment fragment, C11494d dVar, C11289a aVar, C11289a aVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar2 = null;
        }
        return m89922g(fragment, dVar, aVar, aVar2);
    }

    /* renamed from: j */
    public static /* synthetic */ C11677z m89925j(Fragment fragment, C11494d dVar, C11289a aVar, C11289a aVar2, C11289a aVar3, int i, Object obj) {
        if ((i & 4) != 0) {
            aVar2 = new FragmentViewModelLazyKt$createViewModelLazy$2(fragment);
        }
        if ((i & 8) != 0) {
            aVar3 = null;
        }
        return m89923h(fragment, dVar, aVar, aVar2, aVar3);
    }

    @C11395k(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    @C0353k0
    /* renamed from: k */
    public static final /* synthetic */ <VM extends C19476v0> C11677z<VM> m89926k(Fragment fragment, C11289a<? extends C19395b1> aVar, C11289a<? extends C19502x0.C19506b> aVar2) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "ownerProducer");
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(aVar));
        Intrinsics.reifiedOperationMarker(4, "VM");
        C11494d d = C11342l0.m43547d(C19476v0.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(b);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(b);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$viewModels$4(fragment, b);
        }
        return m89923h(fragment, d, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, aVar2);
    }

    @C0353k0
    /* renamed from: l */
    public static final /* synthetic */ <VM extends C19476v0> C11677z<VM> m89927l(Fragment fragment, C11289a<? extends C19395b1> aVar, C11289a<? extends C19477a> aVar2, C11289a<? extends C19502x0.C19506b> aVar3) {
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "ownerProducer");
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(aVar));
        Intrinsics.reifiedOperationMarker(4, "VM");
        C11494d d = C11342l0.m43547d(C19476v0.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(b);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(aVar2, b);
        if (aVar3 == null) {
            aVar3 = new FragmentViewModelLazyKt$viewModels$8(fragment, b);
        }
        return m89923h(fragment, d, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, aVar3);
    }

    /* renamed from: m */
    public static /* synthetic */ C11677z m89928m(Fragment fragment, C11289a aVar, C11289a aVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new FragmentViewModelLazyKt$viewModels$1(fragment);
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "ownerProducer");
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(aVar));
        Intrinsics.reifiedOperationMarker(4, "VM");
        C11494d d = C11342l0.m43547d(C19476v0.class);
        FragmentViewModelLazyKt$viewModels$2 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(b);
        FragmentViewModelLazyKt$viewModels$3 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(b);
        if (aVar2 == null) {
            aVar2 = new FragmentViewModelLazyKt$viewModels$4(fragment, b);
        }
        return m89923h(fragment, d, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, aVar2);
    }

    /* renamed from: n */
    public static /* synthetic */ C11677z m89929n(Fragment fragment, C11289a aVar, C11289a aVar2, C11289a aVar3, int i, Object obj) {
        if ((i & 1) != 0) {
            aVar = new FragmentViewModelLazyKt$viewModels$5(fragment);
        }
        if ((i & 2) != 0) {
            aVar2 = null;
        }
        if ((i & 4) != 0) {
            aVar3 = null;
        }
        Intrinsics.checkNotNullParameter(fragment, "<this>");
        Intrinsics.checkNotNullParameter(aVar, "ownerProducer");
        C11677z b = C10864b0.m38747b(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(aVar));
        Intrinsics.reifiedOperationMarker(4, "VM");
        C11494d d = C11342l0.m43547d(C19476v0.class);
        FragmentViewModelLazyKt$viewModels$6 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(b);
        FragmentViewModelLazyKt$viewModels$7 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(aVar2, b);
        if (aVar3 == null) {
            aVar3 = new FragmentViewModelLazyKt$viewModels$8(fragment, b);
        }
        return m89923h(fragment, d, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, aVar3);
    }

    /* renamed from: o */
    public static final C19395b1 m89930o(C11677z<? extends C19395b1> zVar) {
        return (C19395b1) zVar.getValue();
    }

    /* renamed from: p */
    public static final C19395b1 m89931p(C11677z<? extends C19395b1> zVar) {
        return (C19395b1) zVar.getValue();
    }
}
