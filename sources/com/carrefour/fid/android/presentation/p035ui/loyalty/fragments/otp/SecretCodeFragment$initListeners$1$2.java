package com.carrefour.fid.android.presentation.p035ui.loyalty.fragments.otp;

import android.text.Editable;
import android.widget.ImageView;
import com.carrefour.fid.android.R;
import com.carrefour.fid.android.app.PinEntryEditText;
import com.carrefour.fid.android.databinding.C36782o3;
import com.carrefour.fid.android.various.core.utils.contentsquare.C22757a;
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

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$initListeners$1$2", mo22502f = "SecretCodeFragment.kt", mo22503i = {}, mo22504l = {}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H@"}, mo22516d2 = {"Lkotlin/d2;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
/* renamed from: com.carrefour.fid.android.presentation.ui.loyalty.fragments.otp.SecretCodeFragment$initListeners$1$2 */
public final class SecretCodeFragment$initListeners$1$2 extends SuspendLambda implements C11304p<C11079d2, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ C36782o3 $this_with;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SecretCodeFragment$initListeners$1$2(C36782o3 o3Var, C11045c<? super SecretCodeFragment$initListeners$1$2> cVar) {
        super(2, cVar);
        this.$this_with = o3Var;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new SecretCodeFragment$initListeners$1$2(this.$this_with, cVar);
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11079d2 d2Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((SecretCodeFragment$initListeners$1$2) create(d2Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        int i;
        int i2;
        C11063b.m42612h();
        if (this.label == 0) {
            C11661u0.m45747n(obj);
            C36782o3 o3Var = this.$this_with;
            ImageView imageView = o3Var.f91425d;
            if (o3Var.f91424c.mo32747h()) {
                PinEntryEditText pinEntryEditText = this.$this_with.f91424c;
                Intrinsics.checkNotNullExpressionValue(pinEntryEditText, "edtSecretCode");
                C22757a.m102928b(pinEntryEditText);
                i = R.drawable.eye;
            } else {
                i = R.drawable.eye_off_outline;
            }
            imageView.setImageResource(i);
            C36782o3 o3Var2 = this.$this_with;
            PinEntryEditText pinEntryEditText2 = o3Var2.f91424c;
            pinEntryEditText2.setSelection(pinEntryEditText2.getEditableText().length());
            Editable text = o3Var2.f91424c.getText();
            if (text != null) {
                i2 = text.length();
            } else {
                i2 = 0;
            }
            pinEntryEditText2.setSelection(i2);
            pinEntryEditText2.setMask();
            return C11079d2.f28267a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
