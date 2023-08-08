package com.carrefour.fid.android.shared.extension;

import android.view.View;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.ProduceKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.shared.extension.ViewKt$focusChanges$1", mo22502f = "View.kt", mo22503i = {}, mo22504l = {305}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/channels/r;", "", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class ViewKt$focusChanges$1 extends SuspendLambda implements C11304p<C11760r<? super Boolean>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ View $this_focusChanges;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewKt$focusChanges$1(View view, C11045c<? super ViewKt$focusChanges$1> cVar) {
        super(2, cVar);
        this.$this_focusChanges = view;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ViewKt$focusChanges$1 viewKt$focusChanges$1 = new ViewKt$focusChanges$1(this.$this_focusChanges, cVar);
        viewKt$focusChanges$1.L$0 = obj;
        return viewKt$focusChanges$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super Boolean> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ViewKt$focusChanges$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11760r rVar = (C11760r) this.L$0;
            this.$this_focusChanges.setOnFocusChangeListener(ViewKt.m119008u(rVar, new C11300l<Boolean, C11079d2>(rVar) {
                /* renamed from: b */
                public final void mo83729b(boolean z) {
                    ((C11760r) this.receiver).mo23751L(Boolean.valueOf(z));
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    mo83729b(((Boolean) obj).booleanValue());
                    return C11079d2.f28267a;
                }
            }));
            final View view = this.$this_focusChanges;
            C287402 r1 = new C11289a<C11079d2>() {
                public final void invoke() {
                    view.setOnFocusChangeListener((View.OnFocusChangeListener) null);
                }
            };
            this.label = 1;
            if (ProduceKt.m46525a(rVar, r1, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }
}
