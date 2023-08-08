package com.usabilla.sdk.ubform;

import android.graphics.Bitmap;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11300l;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.functions.C11305q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11907e;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11909g;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11076d0(mo22515d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, mo22516d2 = {"Lcom/usabilla/sdk/ubform/telemetry/e;", "recorder", "Lkotlinx/coroutines/c2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
public final class UsabillaInternal$preloadFeedbackForms$1 extends Lambda implements C11300l<C10110e, C11723c2> {
    final /* synthetic */ String $id;
    final /* synthetic */ UsabillaInternal this$0;

    @C11067d(mo22501c = "com.usabilla.sdk.ubform.UsabillaInternal$preloadFeedbackForms$1$1", mo22502f = "UsabillaInternal.kt", mo22503i = {}, mo22504l = {602}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
    /* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$preloadFeedbackForms$1$1 */
    public static final class C97361 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        int label;

        /* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$preloadFeedbackForms$1$1$a */
        public static final class C9738a implements C11908f<FormModel> {

            /* renamed from: a */
            public final /* synthetic */ C10110e f26704a;

            /* renamed from: b */
            public final /* synthetic */ UsabillaInternal f26705b;

            public C9738a(C10110e eVar, UsabillaInternal usabillaInternal) {
                this.f26704a = eVar;
                this.f26705b = usabillaInternal;
            }

            @C12580l
            public Object emit(Object obj, @C12579k C11045c cVar) {
                FormModel formModel = (FormModel) obj;
                this.f26704a.stop();
                UsabillaInternal usabillaInternal = this.f26705b;
                usabillaInternal.mo19868m0(usabillaInternal.mo19843Y().mo19774t());
                return C11079d2.f28267a;
            }
        }

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            return new C97361(usabillaInternal, str, eVar, cVar);
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C11907e<FormModel> e = usabillaInternal.mo19850d0().mo21471e(str, (Bitmap) null, (UbInternalTheme) null);
                final C10110e eVar = eVar;
                final UsabillaInternal usabillaInternal = usabillaInternal;
                C11907e<FormModel> u = C11909g.m47494u(e, new C11305q<C11908f<? super FormModel>, Throwable, C11045c<? super C11079d2>, Object>((C11045c<? super C97371>) null) {
                    /* synthetic */ Object L$0;
                    int label;

                    @C12580l
                    /* renamed from: g */
                    public final Object invoke(@C12579k C11908f<? super FormModel> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
                        C97371 r3 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public UsabillaInternal$preloadFeedbackForms$1(String str, UsabillaInternal usabillaInternal) {
                            super(1);
                            this.$id = str;
                            this.this$0 = usabillaInternal;
                        }

                        @C12579k
                        /* renamed from: a */
                        public final C11723c2 invoke(@C12579k final C10110e eVar) {
                            Intrinsics.checkNotNullParameter(eVar, "recorder");
                            eVar.mo21540b(new C10096b.C10101b.C10105d("formId", this.$id));
                            C12074o0 N = this.this$0.mo19856g0();
                            final UsabillaInternal usabillaInternal = this.this$0;
                            final String str = this.$id;
                            return C12038j.m48061f(N, (CoroutineContext) null, (CoroutineStart) null, new C97361((C11045c<? super C97361>) null), 3, (Object) null);
                        }
                    }
