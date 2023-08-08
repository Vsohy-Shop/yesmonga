package com.carrefour.fid.android.bff_data_shared.data.api.mapper;

import com.carrefour.fid.android.shared.extension.StringKt;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.C11611k;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"Lkotlin/text/k;", "it", "", "invoke", "(Lkotlin/text/k;)Ljava/lang/String;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class BffSharedMapperKt$parseKeyFeatures$1$1 extends Lambda implements C11300l<C11611k, String> {
    public static final BffSharedMapperKt$parseKeyFeatures$1$1 INSTANCE = new BffSharedMapperKt$parseKeyFeatures$1$1();

    public BffSharedMapperKt$parseKeyFeatures$1$1() {
        super(1);
    }

    @C12579k
    public final String invoke(@C12579k C11611k kVar) {
        Intrinsics.checkNotNullParameter(kVar, "it");
        return StringKt.m118913V(kVar.mo23313b().get(1));
    }
}
