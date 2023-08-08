package com.urbanairship.android.layout.model;

import com.urbanairship.android.layout.environment.C35607n;
import com.urbanairship.android.layout.environment.C35608o;
import com.urbanairship.android.layout.property.C35838i;
import com.urbanairship.android.layout.property.EventHandler;
import com.urbanairship.android.layout.reporting.C35865a;
import com.urbanairship.android.layout.reporting.FormData;
import com.urbanairship.android.layout.util.ViewExtensionsKt;
import com.urbanairship.android.layout.view.TextInputView;
import com.urbanairship.json.JsonValue;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.urbanairship.android.layout.model.TextInputModel$onViewAttached$1", mo22502f = "TextInputModel.kt", mo22503i = {}, mo22504l = {120}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 7, 1})
public final class TextInputModel$onViewAttached$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ TextInputView $view;
    int label;
    final /* synthetic */ TextInputModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TextInputModel$onViewAttached$1(TextInputView textInputView, TextInputModel textInputModel, C11045c<? super TextInputModel$onViewAttached$1> cVar) {
        super(2, cVar);
        this.$view = textInputView;
        this.this$0 = textInputModel;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new TextInputModel$onViewAttached$1(this.$view, this.this$0, cVar);
    }

    @C12580l
    public final Object invokeSuspend(@C12579k Object obj) {
        Object h = C11063b.m42612h();
        int i = this.label;
        if (i == 0) {
            C11661u0.m45747n(obj);
            C11907e j = ViewExtensionsKt.m148035j(this.$view, 0, 1, (Object) null);
            final TextInputModel textInputModel = this.this$0;
            C357821 r1 = new C11908f() {
                @C12580l
                /* renamed from: c */
                public final Object emit(@C12579k final String str, @C12579k C11045c<? super C11079d2> cVar) {
                    C35607n K = textInputModel.f88389u;
                    final TextInputModel textInputModel = textInputModel;
                    K.mo106668c(new C11300l<C35608o.C35610b, C35608o.C35610b>() {
                        @C12579k
                        /* renamed from: a */
                        public final C35608o.C35610b invoke(@C12579k C35608o.C35610b bVar) {
                            boolean z;
                            Intrinsics.checkNotNullParameter(bVar, "state");
                            String O = textInputModel.mo107153O();
                            String str = str;
                            boolean z2 = true;
                            if (textInputModel.f88388t) {
                                if (str.length() > 0) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (!z) {
                                    z2 = false;
                                }
                            }
                            return bVar.mo106701o(new FormData.C35863h(O, str, z2, (C35865a) null, (JsonValue) null, 24, (DefaultConstructorMarker) null));
                        }
                    });
                    if (C35838i.m147765a(textInputModel.mo106998m())) {
                        textInputModel.mo107009x(EventHandler.Type.FORM_INPUT, str);
                    }
                    return C11079d2.f28267a;
                }
            };
            this.label = 1;
            if (j.collect(r1, this) == h) {
                return h;
            }
        } else if (i == 1) {
            C11661u0.m45747n(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return C11079d2.f28267a;
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((TextInputModel$onViewAttached$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
