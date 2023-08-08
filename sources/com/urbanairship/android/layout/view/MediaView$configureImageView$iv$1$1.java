package com.urbanairship.android.layout.view;

import android.widget.ImageView;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class MediaView$configureImageView$iv$1$1 extends Lambda implements C11300l<String, C11079d2> {
    final /* synthetic */ ImageView $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaView$configureImageView$iv$1$1(ImageView imageView) {
        super(1);
        this.$this_apply = imageView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((String) obj);
        return C11079d2.f28267a;
    }

    public final void invoke(@C12579k String str) {
        Intrinsics.checkNotNullParameter(str, "it");
        this.$this_apply.setContentDescription(str);
        this.$this_apply.setImportantForAccessibility(1);
    }
}
