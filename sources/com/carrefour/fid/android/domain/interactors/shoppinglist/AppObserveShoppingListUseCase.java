package com.carrefour.fid.android.domain.interactors.shoppinglist;

import com.carrefour.fid.android.domain.interactors.favorites.shoppinglist.C37682c;
import com.carrefour.fid.android.domain.models.favorites.shoppinglist.C38030a;
import com.carrefour.fid.android.domain.repositories.ShoppingListRepository;
import javax.inject.Inject;
import kotlin.coroutines.C11045c;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.C11907e;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11363r0({"SMAP\nAppObserveShoppingListUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppObserveShoppingListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/shoppinglist/AppObserveShoppingListUseCase\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,15:1\n53#2:16\n55#2:20\n50#3:17\n55#3:19\n106#4:18\n*S KotlinDebug\n*F\n+ 1 AppObserveShoppingListUseCase.kt\ncom/carrefour/fid/android/domain/interactors/shoppinglist/AppObserveShoppingListUseCase\n*L\n13#1:16\n13#1:20\n13#1:17\n13#1:19\n13#1:18\n*E\n"})
public final class AppObserveShoppingListUseCase implements C37682c {
    @C12579k

    /* renamed from: a */
    public final ShoppingListRepository f94922a;

    @Inject
    public AppObserveShoppingListUseCase(@C12579k ShoppingListRepository shoppingListRepository) {
        Intrinsics.checkNotNullParameter(shoppingListRepository, "repository");
        this.f94922a = shoppingListRepository;
    }

    @C12580l
    /* renamed from: a */
    public Object invoke(@C12579k C11045c<? super C11907e<C38030a>> cVar) {
        return new AppObserveShoppingListUseCase$invoke$$inlined$map$1(this.f94922a.mo119613e());
    }
}
