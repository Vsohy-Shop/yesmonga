package com.carrefour.fid.android.presentation.p035ui.home.myproducts;

import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.runtime.internal.C8553b;
import java.util.List;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22517k = 3, mo22518mv = {1, 8, 0}, mo22520xi = 48)
@C11363r0({"SMAP\nMyProducts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyProducts.kt\ncom/carrefour/fid/android/presentation/ui/home/myproducts/MyProductsKt$ProductList$1\n+ 2 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n1#1,251:1\n136#2,12:252\n*S KotlinDebug\n*F\n+ 1 MyProducts.kt\ncom/carrefour/fid/android/presentation/ui/home/myproducts/MyProductsKt$ProductList$1\n*L\n148#1:252,12\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.home.myproducts.MyProductsKt$ProductList$1 */
public final class MyProductsKt$ProductList$1 extends Lambda implements C11300l<LazyListScope, C11079d2> {
    final /* synthetic */ List<String> $frequentPurchases;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MyProductsKt$ProductList$1(List<String> list) {
        super(1);
        this.$frequentPurchases = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((LazyListScope) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k LazyListScope lazyListScope) {
        Intrinsics.checkNotNullParameter(lazyListScope, "$this$LazyRow");
        List<String> list = this.$frequentPurchases;
        lazyListScope.mo8310k(list.size(), (C11300l<? super Integer, ? extends Object>) null, new MyProductsKt$ProductList$1$invoke$$inlined$items$default$3(MyProductsKt$ProductList$1$invoke$$inlined$items$default$1.f60486f, list), C8553b.m31049c(-632812321, true, new MyProductsKt$ProductList$1$invoke$$inlined$items$default$4(list)));
    }
}
