package com.carrefour.fid.android.design.components.widgets;

import android.content.Context;
import android.view.LayoutInflater;
import com.carrefour.fid.android.design.components.databinding.C37039d1;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo22516d2 = {"Lcom/carrefour/fid/android/design/components/databinding/d1;", "a", "()Lcom/carrefour/fid/android/design/components/databinding/d1;"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class StoreSetComponent$binding$2 extends Lambda implements C11289a<C37039d1> {
    final /* synthetic */ Context $context;
    final /* synthetic */ StoreSetComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoreSetComponent$binding$2(Context context, StoreSetComponent storeSetComponent) {
        super(0);
        this.$context = context;
        this.this$0 = storeSetComponent;
    }

    @C12579k
    /* renamed from: a */
    public final C37039d1 invoke() {
        C37039d1 b = C37039d1.m151956b(LayoutInflater.from(this.$context), this.this$0);
        Intrinsics.checkNotNullExpressionValue(b, "inflate(LayoutInflater.from(context), this)");
        return b;
    }
}
