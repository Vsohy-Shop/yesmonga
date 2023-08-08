package androidx.lifecycle.viewmodel;

import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;

@C11363r0({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,115:1\n13579#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactory\n*L\n105#1:116,2\n*E\n"})
/* renamed from: androidx.lifecycle.viewmodel.b */
public final class C19480b implements C19502x0.C19506b {
    @C12579k

    /* renamed from: b */
    public final C19496h<?>[] f49867b;

    public C19480b(@C12579k C19496h<?>... hVarArr) {
        Intrinsics.checkNotNullParameter(hVarArr, "initializers");
        this.f49867b = hVarArr;
    }

    @C12579k
    /* renamed from: a */
    public <T extends C19476v0> T mo21644a(@C12579k Class<T> cls, @C12579k C19477a aVar) {
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        Intrinsics.checkNotNullParameter(aVar, "extras");
        T t = null;
        for (C19496h<?> hVar : this.f49867b) {
            if (Intrinsics.areEqual((Object) hVar.mo57691a(), (Object) cls)) {
                T invoke = hVar.mo57692b().invoke(aVar);
                if (invoke instanceof C19476v0) {
                    t = (C19476v0) invoke;
                } else {
                    t = null;
                }
            }
        }
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException("No initializer set for given class " + cls.getName());
    }
}
