package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.view.LayoutInflater;
import com.carrefour.fid.android.design.components.databinding.C37063m;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/databinding/m;", "a", "()Lcom/carrefour/fid/android/design/components/databinding/m;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class FavoriteStoreComponent$binding$2 extends Lambda implements C11289a<C37063m> {
    final /* synthetic */ Context $context;
    final /* synthetic */ FavoriteStoreComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteStoreComponent$binding$2(Context context, FavoriteStoreComponent favoriteStoreComponent) {
        super(0);
        this.$context = context;
        this.this$0 = favoriteStoreComponent;
    }

    @C12579k
    /* renamed from: a */
    public final C37063m invoke() {
        C37063m b = C37063m.m152024b(LayoutInflater.from(this.$context), this.this$0);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        return b;
    }
}
