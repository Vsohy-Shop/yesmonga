package com.carrefour.fid.android.design.components.widgets;

import com.carrefour.fid.android.design.components.databinding.C37076s0;
import com.google.android.material.button.MaterialButton;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.design.components.widgets.SearchWithListItemComponent$initView$1$1", mo22502f = "SearchWithListItemComponent.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "text", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nSearchWithListItemComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchWithListItemComponent.kt\ncom/carrefour/fid/android/design/components/widgets/SearchWithListItemComponent$initView$1$1\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,173:1\n262#2,2:174\n262#2,2:176\n*S KotlinDebug\n*F\n+ 1 SearchWithListItemComponent.kt\ncom/carrefour/fid/android/design/components/widgets/SearchWithListItemComponent$initView$1$1\n*L\n68#1:174,2\n71#1:176,2\n*E\n"})
public final class SearchWithListItemComponent$initView$1$1 extends SuspendLambda implements C11304p<String, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C37076s0 $this_apply;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SearchWithListItemComponent this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchWithListItemComponent$initView$1$1(C37076s0 s0Var, SearchWithListItemComponent searchWithListItemComponent, C11045c<? super SearchWithListItemComponent$initView$1$1> cVar) {
        super(2, cVar);
        this.$this_apply = s0Var;
        this.this$0 = searchWithListItemComponent;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SearchWithListItemComponent$initView$1$1 searchWithListItemComponent$initView$1$1 = new SearchWithListItemComponent$initView$1$1(this.$this_apply, this.this$0, cVar);
        searchWithListItemComponent$initView$1$1.L$0 = obj;
        return searchWithListItemComponent$initView$1$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k String str, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SearchWithListItemComponent$initView$1$1) create(str, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        boolean z;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            if (((String) this.L$0).length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.$this_apply.f92812c.setTypeface(this.this$0.f93162c, 2);
                MaterialButton materialButton = this.$this_apply.f92811b;
                Intrinsics.checkNotNullExpressionValue(materialButton, "searchListItemDeleteButton");
                materialButton.setVisibility(8);
            } else {
                this.$this_apply.f92812c.setTypeface(this.this$0.f93162c, 0);
                MaterialButton materialButton2 = this.$this_apply.f92811b;
                Intrinsics.checkNotNullExpressionValue(materialButton2, "searchListItemDeleteButton");
                materialButton2.setVisibility(0);
            }
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
