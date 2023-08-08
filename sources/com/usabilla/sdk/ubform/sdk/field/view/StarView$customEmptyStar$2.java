package com.usabilla.sdk.ubform.sdk.field.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.usabilla.sdk.ubform.sdk.field.model.StarModel;
import kotlin.C11076d0;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, mo22516d2 = {"Landroid/graphics/drawable/Drawable;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class StarView$customEmptyStar$2 extends Lambda implements C11289a<Drawable> {
    final /* synthetic */ Context $context;
    final /* synthetic */ StarView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarView$customEmptyStar$2(StarView starView, Context context) {
        super(0);
        this.this$0 = starView;
        this.$context = context;
    }

    @C12580l
    /* renamed from: a */
    public final Drawable invoke() {
        return ((StarModel) StarView.m37888t(this.this$0).mo20826p()).mo20976g().getImages().starOutline(this.$context);
    }
}
