package com.usabilla.sdk.ubform;

import android.graphics.Bitmap;
import com.usabilla.sdk.ubform.sdk.form.model.FormModel;
import com.usabilla.sdk.ubform.sdk.form.model.UbColors;
import com.usabilla.sdk.ubform.sdk.form.model.UbFonts;
import com.usabilla.sdk.ubform.sdk.form.model.UbImages;
import com.usabilla.sdk.ubform.sdk.form.model.UbInternalTheme;
import com.usabilla.sdk.ubform.sdk.form.model.UsabillaTheme;
import com.usabilla.sdk.ubform.sdk.form.model.theme.unity.UsabillaThemeUnity;
import com.usabilla.sdk.ubform.telemetry.C10096b;
import com.usabilla.sdk.ubform.telemetry.C10108c;
import com.usabilla.sdk.ubform.telemetry.C10110e;
import java.util.List;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
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
public final class UsabillaInternal$loadFeedbackForm$1 extends Lambda implements C11300l<C10110e, C11723c2> {
    final /* synthetic */ C9826e $callback;
    final /* synthetic */ String $formId;
    final /* synthetic */ Bitmap $screenshot;
    final /* synthetic */ UsabillaTheme $theme;
    final /* synthetic */ UsabillaInternal this$0;

    @C11067d(mo22501c = "com.usabilla.sdk.ubform.UsabillaInternal$loadFeedbackForm$1$1", mo22502f = "UsabillaInternal.kt", mo22503i = {}, mo22504l = {602}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 5, 1})
    /* renamed from: com.usabilla.sdk.ubform.UsabillaInternal$loadFeedbackForm$1$1 */
    public static final class C97331 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C97331 r0 = new C97331(usabillaTheme, usabillaInternal, str, bitmap, eVar3, eVar2, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            UbInternalTheme ubInternalTheme;
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                C12074o0 o0Var = (C12074o0) this.L$0;
                UsabillaTheme usabillaTheme = usabillaTheme;
                if (usabillaTheme == null) {
                    ubInternalTheme = null;
                } else {
                    UbFonts fonts = usabillaTheme.getFonts();
                    if (fonts == null) {
                        fonts = new UbFonts(0, false, 0, 0, 0, 31, (DefaultConstructorMarker) null);
                    }
                    UbFonts ubFonts = fonts;
                    UbImages images = usabillaTheme.getImages();
                    if (images == null) {
                        images = new UbImages((List) null, (List) null, (Integer) null, (Integer) null, 15, (DefaultConstructorMarker) null);
                    }
                    ubInternalTheme = new UbInternalTheme((UsabillaThemeUnity) null, (UbColors) null, (UbColors) null, ubFonts, images, false, 39, (DefaultConstructorMarker) null);
                }
                if (ubInternalTheme == null) {
                    ubInternalTheme = usabillaInternal.mo19874s();
                }
                C11907e<FormModel> e = usabillaInternal.mo19850d0().mo21471e(str, bitmap, ubInternalTheme);
                final C10110e eVar = eVar3;
                final UsabillaInternal usabillaInternal = usabillaInternal;
                final C9826e eVar2 = eVar2;
                C11907e<FormModel> u = C11909g.m47494u(e, new C11305q<C11908f<? super FormModel>, Throwable, C11045c<? super C11079d2>, Object>((C11045c<? super C97341>) null) {
                    /* synthetic */ Object L$0;
                    int label;

                    @C12580l
                    /* renamed from: g */
                    public final Object invoke(@C12579k C11908f<? super FormModel> fVar, @C12579k Throwable th, @C12580l C11045c<? super C11079d2> cVar) {
                        C97341 r4 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public UsabillaInternal$loadFeedbackForm$1(String str, Bitmap bitmap, UsabillaTheme usabillaTheme, C9826e eVar, UsabillaInternal usabillaInternal) {
                            super(1);
                            this.$formId = str;
                            this.$screenshot = bitmap;
                            this.$theme = usabillaTheme;
                            this.$callback = eVar;
                            this.this$0 = usabillaInternal;
                        }

                        @C12579k
                        /* renamed from: a */
                        public final C11723c2 invoke(@C12579k C10110e eVar) {
                            boolean z;
                            boolean z2;
                            Intrinsics.checkNotNullParameter(eVar, "recorder");
                            eVar.mo21540b(new C10096b.C10101b.C10105d("formId", this.$formId));
                            boolean z3 = true;
                            if (this.$screenshot != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            eVar.mo21540b(new C10096b.C10101b.C10105d("screenshot", Boolean.valueOf(z)));
                            if (this.$theme != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27794S, Boolean.valueOf(z2)));
                            if (this.$callback == null) {
                                z3 = false;
                            }
                            eVar.mo21540b(new C10096b.C10101b.C10105d(C10108c.f27778C, Boolean.valueOf(z3)));
                            C12074o0 N = this.this$0.mo19856g0();
                            final UsabillaTheme usabillaTheme = this.$theme;
                            final UsabillaInternal usabillaInternal = this.this$0;
                            final String str = this.$formId;
                            final Bitmap bitmap = this.$screenshot;
                            final C9826e eVar2 = this.$callback;
                            final C10110e eVar3 = eVar;
                            return C12038j.m48061f(N, (CoroutineContext) null, (CoroutineStart) null, new C97331((C11045c<? super C97331>) null), 3, (Object) null);
                        }
                    }
