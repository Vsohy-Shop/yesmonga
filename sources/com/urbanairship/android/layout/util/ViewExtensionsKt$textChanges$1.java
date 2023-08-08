package com.urbanairship.android.layout.util;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.journeyapps.barcodescanner.camera.C34935s;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.C11760r;
import kotlinx.coroutines.channels.ProduceKt;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.util.ViewExtensionsKt$textChanges$1", mo22502f = "ViewExtensions.kt", mo22503i = {}, mo22504l = {40}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/channels/r;", "", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class ViewExtensionsKt$textChanges$1 extends SuspendLambda implements C11304p<C11760r<? super String>, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ EditText $this_textChanges;
    private /* synthetic */ Object L$0;
    int label;

    /* renamed from: com.urbanairship.android.layout.util.ViewExtensionsKt$textChanges$1$a */
    public static final class C35905a implements TextWatcher {

        /* renamed from: a */
        public final /* synthetic */ C11760r<String> f88796a;

        public C35905a(C11760r<? super String> rVar) {
            this.f88796a = rVar;
        }

        public void afterTextChanged(@C12579k Editable editable) {
            Intrinsics.checkNotNullParameter(editable, C34935s.f84988a);
            this.f88796a.mo23751L(editable.toString());
        }

        public void beforeTextChanged(@C12579k CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, C34935s.f84988a);
        }

        public void onTextChanged(@C12579k CharSequence charSequence, int i, int i2, int i3) {
            Intrinsics.checkNotNullParameter(charSequence, C34935s.f84988a);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ViewExtensionsKt$textChanges$1(EditText editText, C11045c<? super ViewExtensionsKt$textChanges$1> cVar) {
        super(2, cVar);
        this.$this_textChanges = editText;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        ViewExtensionsKt$textChanges$1 viewExtensionsKt$textChanges$1 = new ViewExtensionsKt$textChanges$1(this.$this_textChanges, cVar);
        viewExtensionsKt$textChanges$1.L$0 = obj;
        return viewExtensionsKt$textChanges$1;
    }

    @C12580l
    /* renamed from: g */
    public final Object invoke(@C12579k C11760r<? super String> rVar, @C12580l C11045c<? super C11079d2> cVar) {
        return ((ViewExtensionsKt$textChanges$1) create(rVar, cVar)).invokeSuspend(C11079d2.f28267a);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11760r rVar = (C11760r) this.L$0;
            ViewExtensionsKt.m148027b();
            final C35905a aVar = new C35905a(rVar);
            this.$this_textChanges.addTextChangedListener(aVar);
            final EditText editText = this.$this_textChanges;
            C359041 r3 = new C11289a<C11079d2>() {
                public final void invoke() {
                    editText.removeTextChangedListener(aVar);
                }
            };
            this.label = 1;
            if (ProduceKt.m46525a(rVar, r3, this) == h) {
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
