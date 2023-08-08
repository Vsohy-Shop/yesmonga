package androidx.lifecycle.viewmodel;

import androidx.lifecycle.C19476v0;
import androidx.lifecycle.C19502x0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.C11283a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.C11494d;
import org.jetbrains.annotations.C12579k;

@C19495g
@C11363r0({"SMAP\nInitializerViewModelFactory.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,115:1\n37#2,2:116\n*S KotlinDebug\n*F\n+ 1 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder\n*L\n54#1:116,2\n*E\n"})
/* renamed from: androidx.lifecycle.viewmodel.c */
public final class C19481c {
    @C12579k

    /* renamed from: a */
    public final List<C19496h<?>> f49868a = new ArrayList();

    /* renamed from: a */
    public final <T extends C19476v0> void mo57679a(@C12579k C11494d<T> dVar, @C12579k C11300l<? super C19477a, ? extends T> lVar) {
        Intrinsics.checkNotNullParameter(dVar, "clazz");
        Intrinsics.checkNotNullParameter(lVar, "initializer");
        this.f49868a.add(new C19496h(C11283a.m43409e(dVar), lVar));
    }

    @C12579k
    /* renamed from: b */
    public final C19502x0.C19506b mo57680b() {
        C19496h[] hVarArr = (C19496h[]) this.f49868a.toArray(new C19496h[0]);
        return new C19480b((C19496h[]) Arrays.copyOf(hVarArr, hVarArr.length));
    }
}
