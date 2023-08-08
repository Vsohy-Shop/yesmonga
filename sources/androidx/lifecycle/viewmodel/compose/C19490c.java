package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.C8540g;
import androidx.compose.runtime.C8592o;
import androidx.lifecycle.C19395b1;
import androidx.lifecycle.C19455p;
import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import androidx.lifecycle.viewmodel.C19477a;
import androidx.lifecycle.viewmodel.C19481c;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11342l0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n*L\n1#1,218:1\n31#2:219\n63#2,2:220\n*S KotlinDebug\n*F\n+ 1 ViewModel.kt\nandroidx/lifecycle/viewmodel/compose/ViewModelKt\n*L\n187#1:219\n187#1:220,2\n*E\n"})
/* renamed from: androidx.lifecycle.viewmodel.compose.c */
public final class C19490c {
    /* renamed from: a */
    public static final <VM extends C19476v0> VM m90833a(C19395b1 b1Var, Class<VM> cls, String str, C19502x0.C19506b bVar, C19477a aVar) {
        C19502x0 x0Var;
        if (bVar != null) {
            x0Var = new C19502x0(b1Var.getViewModelStore(), bVar, aVar);
        } else if (b1Var instanceof C19455p) {
            x0Var = new C19502x0(b1Var.getViewModelStore(), ((C19455p) b1Var).getDefaultViewModelProviderFactory(), aVar);
        } else {
            x0Var = new C19502x0(b1Var);
        }
        if (str != null) {
            return x0Var.mo57694b(str, cls);
        }
        return x0Var.mo57693a(cls);
    }

    /* renamed from: b */
    public static /* synthetic */ C19476v0 m90834b(C19395b1 b1Var, Class cls, String str, C19502x0.C19506b bVar, C19477a aVar, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bVar = null;
        }
        if ((i & 8) != 0) {
            if (b1Var instanceof C19455p) {
                aVar = ((C19455p) b1Var).getDefaultViewModelCreationExtras();
            } else {
                aVar = C19477a.C19478a.f49866b;
            }
        }
        return m90833a(b1Var, cls, str, bVar, aVar);
    }

    @C8540g
    @C11395k(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    /* renamed from: c */
    public static final /* synthetic */ <VM extends C19476v0> VM m90835c(C19395b1 b1Var, String str, C19502x0.C19506b bVar, C8592o oVar, int i, int i2) {
        String str2;
        C19502x0.C19506b bVar2;
        oVar.mo14918M(-384969861);
        if ((i2 & 1) == 0 || (b1Var = LocalViewModelStoreOwner.f49869a.mo57681a(oVar, 6)) != null) {
            C19395b1 b1Var2 = b1Var;
            if ((i2 & 2) != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if ((i2 & 4) != 0) {
                bVar2 = null;
            } else {
                bVar2 = bVar;
            }
            Intrinsics.reifiedOperationMarker(4, "VM");
            VM g = m90839g(C19476v0.class, b1Var2, str2, bVar2, (C19477a) null, oVar, ((i << 3) & 896) | 4168, 16);
            oVar.mo15002m0();
            return g;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    @C8540g
    /* renamed from: d */
    public static final /* synthetic */ <VM extends C19476v0> VM m90836d(C19395b1 b1Var, String str, C19502x0.C19506b bVar, C19477a aVar, C8592o oVar, int i, int i2) {
        String str2;
        C19502x0.C19506b bVar2;
        C19477a aVar2;
        oVar.mo14918M(1729797275);
        if ((i2 & 1) == 0 || (b1Var = LocalViewModelStoreOwner.f49869a.mo57681a(oVar, 6)) != null) {
            C19395b1 b1Var2 = b1Var;
            if ((i2 & 2) != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if ((i2 & 4) != 0) {
                bVar2 = null;
            } else {
                bVar2 = bVar;
            }
            if ((i2 & 8) != 0) {
                if (b1Var2 instanceof C19455p) {
                    aVar2 = ((C19455p) b1Var2).getDefaultViewModelCreationExtras();
                } else {
                    aVar2 = C19477a.C19478a.f49866b;
                }
                aVar = aVar2;
            }
            Intrinsics.reifiedOperationMarker(4, "VM");
            VM g = m90839g(C19476v0.class, b1Var2, str2, bVar2, aVar, oVar, ((i << 3) & 896) | 36936, 0);
            oVar.mo15002m0();
            return g;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    @C8540g
    /* renamed from: e */
    public static final /* synthetic */ <VM extends C19476v0> VM m90837e(C19395b1 b1Var, String str, C11300l<? super C19477a, ? extends VM> lVar, C8592o oVar, int i, int i2) {
        C19477a aVar;
        Intrinsics.checkNotNullParameter(lVar, "initializer");
        oVar.mo14918M(419377738);
        if ((i2 & 1) == 0 || (b1Var = LocalViewModelStoreOwner.f49869a.mo57681a(oVar, 6)) != null) {
            C19395b1 b1Var2 = b1Var;
            if ((i2 & 2) != 0) {
                str = null;
            }
            String str2 = str;
            Intrinsics.reifiedOperationMarker(4, "VM");
            Class<C19476v0> cls = C19476v0.class;
            C19481c cVar = new C19481c();
            Intrinsics.reifiedOperationMarker(4, "VM");
            cVar.mo57679a(C11342l0.m43547d(C19476v0.class), lVar);
            C11079d2 d2Var = C11079d2.f28267a;
            C19502x0.C19506b b = cVar.mo57680b();
            if (b1Var2 instanceof C19455p) {
                aVar = ((C19455p) b1Var2).getDefaultViewModelCreationExtras();
            } else {
                aVar = C19477a.C19478a.f49866b;
            }
            VM g = m90839g(cls, b1Var2, str2, b, aVar, oVar, ((i << 3) & 896) | 36936, 0);
            oVar.mo15002m0();
            return g;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    @C8540g
    @C11395k(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModel that takes CreationExtras")
    /* renamed from: f */
    public static final /* synthetic */ C19476v0 m90838f(Class cls, C19395b1 b1Var, String str, C19502x0.C19506b bVar, C8592o oVar, int i, int i2) {
        String str2;
        C19502x0.C19506b bVar2;
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        oVar.mo14918M(1324836815);
        if ((i2 & 2) == 0 || (b1Var = LocalViewModelStoreOwner.f49869a.mo57681a(oVar, 6)) != null) {
            C19395b1 b1Var2 = b1Var;
            if ((i2 & 4) != 0) {
                str2 = null;
            } else {
                str2 = str;
            }
            if ((i2 & 8) != 0) {
                bVar2 = null;
            } else {
                bVar2 = bVar;
            }
            C19476v0 b = m90834b(b1Var2, cls, str2, bVar2, (C19477a) null, 8, (Object) null);
            oVar.mo15002m0();
            return b;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }

    @C8540g
    @C12579k
    /* renamed from: g */
    public static final <VM extends C19476v0> VM m90839g(@C12579k Class<VM> cls, @C12580l C19395b1 b1Var, @C12580l String str, @C12580l C19502x0.C19506b bVar, @C12580l C19477a aVar, @C12580l C8592o oVar, int i, int i2) {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        oVar.mo14918M(-1439476281);
        if ((i2 & 2) == 0 || (b1Var = LocalViewModelStoreOwner.f49869a.mo57681a(oVar, 6)) != null) {
            if ((i2 & 4) != 0) {
                str = null;
            }
            if ((i2 & 8) != 0) {
                bVar = null;
            }
            if ((i2 & 16) != 0) {
                if (b1Var instanceof C19455p) {
                    aVar = ((C19455p) b1Var).getDefaultViewModelCreationExtras();
                } else {
                    aVar = C19477a.C19478a.f49866b;
                }
            }
            VM a = m90833a(b1Var, cls, str, bVar, aVar);
            oVar.mo15002m0();
            return a;
        }
        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
    }
}
