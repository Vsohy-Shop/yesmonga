package com.carrefour.fid.android.account.presentation.p018ui.signin;

import android.widget.EditText;
import com.carrefour.fid.android.account.C13144b;
import com.carrefour.fid.android.account.databinding.C13232s;
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

@C11067d(mo22501c = "com.carrefour.fid.android.account.presentation.ui.signin.SignInFragment$handleTouchAndFocusChange$1$1", mo22502f = "SignInFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"", "it", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.account.presentation.ui.signin.SignInFragment$handleTouchAndFocusChange$1$1 */
public final class SignInFragment$handleTouchAndFocusChange$1$1 extends SuspendLambda implements C11304p<Boolean, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C13232s $this_with;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SignInFragment$handleTouchAndFocusChange$1$1(C13232s sVar, C11045c<? super SignInFragment$handleTouchAndFocusChange$1$1> cVar) {
        super(2, cVar);
        this.$this_with = sVar;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        SignInFragment$handleTouchAndFocusChange$1$1 signInFragment$handleTouchAndFocusChange$1$1 = new SignInFragment$handleTouchAndFocusChange$1$1(this.$this_with, cVar);
        signInFragment$handleTouchAndFocusChange$1$1.Z$0 = ((Boolean) obj).booleanValue();
        return signInFragment$handleTouchAndFocusChange$1$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object mo32136g(boolean z, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SignInFragment$handleTouchAndFocusChange$1$1) create(Boolean.valueOf(z), cVar)).invokeSuspend(C11079d2.f28267a);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return mo32136g(((Boolean) obj).booleanValue(), (C11045c) obj2);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        int i;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            boolean z = this.Z$0;
            if (z) {
                this.$this_with.f32561c.setVisibility(4);
            }
            EditText editText = this.$this_with.f32562d;
            Intrinsics.checkNotNullExpressionValue(editText, "emailText");
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
