package com.carrefour.fid.android.account.presentation.p018ui.forgot;

import android.widget.EditText;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13215b;
import com.carrefour.fid.android.shared.extension.EditTextKt;
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

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.ui.forgot.ForgotPasswordFragment$initListeners$1$4", mo22502f = "ForgotPasswordFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.forgot.ForgotPasswordFragment$initListeners$1$4 */
public final class ForgotPasswordFragment$initListeners$1$4 extends SuspendLambda implements C11304p<Boolean, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C13215b $this_with;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ForgotPasswordFragment$initListeners$1$4(C13215b bVar, C11045c<? super ForgotPasswordFragment$initListeners$1$4> cVar) {
        super(2, cVar);
        this.$this_with = bVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ForgotPasswordFragment$initListeners$1$4 forgotPasswordFragment$initListeners$1$4 = new ForgotPasswordFragment$initListeners$1$4(this.$this_with, cVar);
        forgotPasswordFragment$initListeners$1$4.Z$0 = ((Boolean) obj).booleanValue();
        return forgotPasswordFragment$initListeners$1$4;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo32087g(boolean z, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ForgotPasswordFragment$initListeners$1$4) create(Boolean.valueOf(z), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo32087g(((Boolean) obj).booleanValue(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        int i;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            boolean z = this.Z$0;
            if (z) {
                this.$this_with.f32397d.setVisibility(4);
            }
            EditText editText = this.$this_with.f32396c;
            Intrinsics.checkNotNullExpressionValue(editText, "editForgotPasswordEmail");
            if (z) {
                i = C13144b.C13150f.colorPrimary;
            } else {
                i = C13144b.C13150f.txt_grey;
            }
            EditTextKt.m118803m(editText, i);
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
