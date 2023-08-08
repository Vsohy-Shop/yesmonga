package com.carrefour.fid.android.account.presentation.p018ui.address;

import com.carrefour.fid.android.account.presentation.p018ui.address.UpdateUserAddressFragment;
import com.carrefour.fid.android.account.presentation.viewmodels.address.mvi.C13645a;
import com.carrefour.fid.android.design.components.extension.EditTextKt;
import com.carrefour.fid.android.shared.extension.StringKt;
import com.google.android.material.textfield.TextInputEditText;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$initOnFocusChangeListeners$1$2", mo22502f = "UpdateUserAddressFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.address.UpdateUserAddressFragment$initOnFocusChangeListeners$1$2 */
public final class UpdateUserAddressFragment$initOnFocusChangeListeners$1$2 extends SuspendLambda implements C11304p<String, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ TextInputEditText $this_apply;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ UpdateUserAddressFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UpdateUserAddressFragment$initOnFocusChangeListeners$1$2(UpdateUserAddressFragment updateUserAddressFragment, TextInputEditText textInputEditText, C11045c<? super UpdateUserAddressFragment$initOnFocusChangeListeners$1$2> cVar) {
        super(2, cVar);
        this.this$0 = updateUserAddressFragment;
        this.$this_apply = textInputEditText;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        UpdateUserAddressFragment$initOnFocusChangeListeners$1$2 updateUserAddressFragment$initOnFocusChangeListeners$1$2 = new UpdateUserAddressFragment$initOnFocusChangeListeners$1$2(this.this$0, this.$this_apply, cVar);
        updateUserAddressFragment$initOnFocusChangeListeners$1$2.L$0 = obj;
        return updateUserAddressFragment$initOnFocusChangeListeners$1$2;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k String str, @C12580l C11045c<? super C11079d2> cVar) {
        return ((UpdateUserAddressFragment$initOnFocusChangeListeners$1$2) create(str, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        String str;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            String str2 = (String) this.L$0;
            this.this$0.f32825Y = false;
            if (this.$this_apply.hasFocus() && str2.length() >= 5) {
                C13645a.C13658c.C13659a W0 = this.this$0.f32829w;
                if (W0 != null) {
                    str = W0.getAddress();
                } else {
                    str = null;
                }
                if (!Intrinsics.areEqual((Object) str2, (Object) str)) {
                    TextInputEditText textInputEditText = UpdateUserAddressFragment.m57788V0(this.this$0).f32450H;
                    Intrinsics.checkNotNullExpressionValue(textInputEditText, "binding.postalCodeTextinputEdittext");
                    EditTextKt.m152107a(textInputEditText, "");
                    TextInputEditText textInputEditText2 = UpdateUserAddressFragment.m57788V0(this.this$0).f32470n;
                    Intrinsics.checkNotNullExpressionValue(textInputEditText2, "binding.cityTextinputEdittext");
                    EditTextKt.m152107a(textInputEditText2, "");
                    this.this$0.mo31821n1().sendIntent(new C13645a.C13665d.C13668c(this.this$0.mo31819l1(), StringKt.m118926f(String.valueOf(UpdateUserAddressFragment.m57788V0(this.this$0).f32454L.getText()))));
                    this.this$0.mo31800C1(UpdateUserAddressFragment.Field.f32834a);
                    return C11079d2.f28267a;
                }
            }
            UpdateUserAddressFragment.m57788V0(this.this$0).f32444B.setVisibility(8);
            this.this$0.mo31800C1(UpdateUserAddressFragment.Field.f32834a);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
