package androidx.constraintlayout.compose;

import android.os.Handler;
import android.os.Looper;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.C12579k;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n"}, mo22516d2 = {"Lkotlin/Function0;", "Lkotlin/d2;", "it", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class ConstraintSetForInlineDsl$observer$1 extends Lambda implements C11300l<C11289a<? extends C11079d2>, C11079d2> {
    final /* synthetic */ ConstraintSetForInlineDsl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConstraintSetForInlineDsl$observer$1(ConstraintSetForInlineDsl constraintSetForInlineDsl) {
        super(1);
        this.this$0 = constraintSetForInlineDsl;
    }

    /* renamed from: c */
    public static final void m75287c(C11289a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "$tmp0");
        aVar.invoke();
    }

    /* renamed from: b */
    public final void mo48361b(@C12579k C11289a<C11079d2> aVar) {
        Intrinsics.checkNotNullParameter(aVar, "it");
        if (Intrinsics.areEqual((Object) Looper.myLooper(), (Object) Looper.getMainLooper())) {
            aVar.invoke();
            return;
        }
        Handler h = this.this$0.f41155b;
        if (h == null) {
            h = new Handler(Looper.getMainLooper());
            this.this$0.f41155b = h;
        }
        h.post(new C16605k(aVar));
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo48361b((C11289a) obj);
        return C11079d2.f28267a;
    }
}
