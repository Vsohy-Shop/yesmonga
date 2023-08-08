package com.carrefour.fid.android.presentation.p035ui.confirmation;

import androidx.lifecycle.C19426h0;
import com.carrefour.fid.android.domain.models.BasketDomain;
import com.carrefour.fid.android.domain.models.C38049m;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11660u;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.C11379z;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.C12074o0;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1", mo22502f = "CheckoutConfirmationFragment.kt", mo22503i = {}, mo22504l = {207, 208, 210, 211}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nCheckoutConfirmationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CheckoutConfirmationFragment.kt\ncom/carrefour/fid/android/presentation/ui/confirmation/CheckoutConfirmationFragment$initUi$1\n+ 2 Fragment.kt\ncom/carrefour/fid/android/shared/extension/FragmentKt\n+ 3 Serializable.kt\ncom/carrefour/fid/android/shared/util/SerializableKt\n*L\n1#1,631:1\n168#2,7:632\n168#2,7:639\n6#3,4:646\n*S KotlinDebug\n*F\n+ 1 CheckoutConfirmationFragment.kt\ncom/carrefour/fid/android/presentation/ui/confirmation/CheckoutConfirmationFragment$initUi$1\n*L\n192#1:632,7\n193#1:639,7\n197#1:646,4\n*E\n"})
/* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1 */
public final class CheckoutConfirmationFragment$initUi$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ CheckoutConfirmationFragment this$0;

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$a */
    public /* synthetic */ class C23735a implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f59802a;

        public C23735a(CheckoutConfirmationFragment checkoutConfirmationFragment) {
            this.f59802a = checkoutConfirmationFragment;
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l C38049m mVar) {
            this.f59802a.mo69509Q1(mVar);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.f59802a, CheckoutConfirmationFragment.class, "handleFeedbackResult", "handleFeedbackResult(Lcom/carrefour/fid/android/domain/models/FeedbackModel;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$b */
    public /* synthetic */ class C23736b implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f59803a;

        public C23736b(CheckoutConfirmationFragment checkoutConfirmationFragment) {
            this.f59803a = checkoutConfirmationFragment;
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l BasketDomain basketDomain) {
            this.f59803a.mo69506N1(basketDomain);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.f59803a, CheckoutConfirmationFragment.class, "handleBasketResult", "handleBasketResult(Lcom/carrefour/fid/android/domain/models/BasketDomain;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$c */
    public /* synthetic */ class C23737c implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f59804a;

        public C23737c(CheckoutConfirmationFragment checkoutConfirmationFragment) {
            this.f59804a = checkoutConfirmationFragment;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo4590a(Object obj) {
            mo69562b(((Boolean) obj).booleanValue());
        }

        /* renamed from: b */
        public final void mo69562b(boolean z) {
            this.f59804a.mo69513V1(z);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.f59804a, CheckoutConfirmationFragment.class, "handleStoreFeedbackDialog", "handleStoreFeedbackDialog(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$d */
    public /* synthetic */ class C23738d implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f59805a;

        public C23738d(CheckoutConfirmationFragment checkoutConfirmationFragment) {
            this.f59805a = checkoutConfirmationFragment;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ void mo4590a(Object obj) {
            mo69565b(((Boolean) obj).booleanValue());
        }

        /* renamed from: b */
        public final void mo69565b(boolean z) {
            this.f59805a.mo69514W1(z);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.f59805a, CheckoutConfirmationFragment.class, "handleStoreFeedbackVisibility", "handleStoreFeedbackVisibility(Z)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* renamed from: com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$e */
    public /* synthetic */ class C23739e implements C19426h0, C11379z {

        /* renamed from: a */
        public final /* synthetic */ CheckoutConfirmationFragment f59806a;

        public C23739e(CheckoutConfirmationFragment checkoutConfirmationFragment) {
            this.f59806a = checkoutConfirmationFragment;
        }

        /* renamed from: b */
        public final void mo4590a(@C12580l Throwable th) {
            this.f59806a.mo69508P1(th);
        }

        public final boolean equals(@C12580l Object obj) {
            if (!(obj instanceof C19426h0) || !(obj instanceof C11379z)) {
                return false;
            }
            return Intrinsics.areEqual((Object) getFunctionDelegate(), (Object) ((C11379z) obj).getFunctionDelegate());
        }

        @C12579k
        public final C11660u<?> getFunctionDelegate() {
            return new FunctionReferenceImpl(1, this.f59806a, CheckoutConfirmationFragment.class, "handleFeedbackFailure", "handleFeedbackFailure(Ljava/lang/Throwable;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CheckoutConfirmationFragment$initUi$1(CheckoutConfirmationFragment checkoutConfirmationFragment, C11045c<? super CheckoutConfirmationFragment$initUi$1> cVar) {
        super(2, cVar);
        this.this$0 = checkoutConfirmationFragment;
    }

    @C12579k
    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
        return new CheckoutConfirmationFragment$initUi$1(this.this$0, cVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x015f, code lost:
        if (r2 != null) goto L_0x0167;
     */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01d9 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x01e4 A[RETURN] */
    @org.jetbrains.annotations.C12580l
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.C12579k java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 0
            r7 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r7) goto L_0x0034
            if (r2 == r5) goto L_0x0029
            if (r2 == r4) goto L_0x0024
            if (r2 != r3) goto L_0x001c
            kotlin.C11661u0.m45747n(r19)
            goto L_0x01e5
        L_0x001c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L_0x0024:
            kotlin.C11661u0.m45747n(r19)
            goto L_0x01da
        L_0x0029:
            java.lang.Object r2 = r0.L$0
            android.widget.TextView r2 = (android.widget.TextView) r2
            kotlin.C11661u0.m45747n(r19)
            r5 = r19
            goto L_0x01c8
        L_0x0034:
            java.lang.Object r2 = r0.L$0
            android.widget.TextView r2 = (android.widget.TextView) r2
            kotlin.C11661u0.m45747n(r19)
            r7 = r19
            goto L_0x01ae
        L_0x003f:
            kotlin.C11661u0.m45747n(r19)
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r2 = r0.this$0
            java.lang.String r2 = r2.mo69500H1()
            r8 = 0
            if (r2 == 0) goto L_0x0054
            boolean r2 = kotlin.text.C11622t.isBlank(r2)
            if (r2 == 0) goto L_0x0052
            goto L_0x0054
        L_0x0052:
            r2 = r8
            goto L_0x0055
        L_0x0054:
            r2 = r7
        L_0x0055:
            if (r2 != 0) goto L_0x0064
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r1 = r0.this$0
            r1.mo69532u2()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r1 = r0.this$0
            r1.mo69524i2()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        L_0x0064:
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r2 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.confirmation.CheckoutConfirmationViewModel r2 = r2.mo69495C1()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r9 = r0.this$0
            androidx.lifecycle.LiveData r10 = r2.mo83418c0()
            androidx.lifecycle.w r11 = r9.getViewLifecycleOwner()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$1$1 r12 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$1$1
            r12.<init>(r9)
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$d r13 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$d
            r13.<init>(r12)
            r10.mo57491k(r11, r13)
            androidx.lifecycle.LiveData r10 = r2.mo76196z0()
            androidx.lifecycle.w r11 = r9.getViewLifecycleOwner()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$a r12 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$a
            r12.<init>(r9)
            r10.mo57491k(r11, r12)
            androidx.lifecycle.LiveData r10 = r2.mo76193w0()
            androidx.lifecycle.w r11 = r9.getViewLifecycleOwner()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$b r12 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$b
            r12.<init>(r9)
            r10.mo57491k(r11, r12)
            java.lang.String r10 = r9.mo69500H1()
            if (r10 == 0) goto L_0x00b0
            boolean r10 = kotlin.text.C11622t.isBlank(r10)
            if (r10 == 0) goto L_0x00ae
            goto L_0x00b0
        L_0x00ae:
            r10 = r8
            goto L_0x00b1
        L_0x00b0:
            r10 = r7
        L_0x00b1:
            if (r10 == 0) goto L_0x00b6
            r2.mo76192v0()
        L_0x00b6:
            com.carrefour.fid.android.presentation.viewmodels.feesback.FeedbackViewModel r2 = r9.mo69501I1()
            androidx.lifecycle.LiveData r10 = r2.mo76629n0()
            androidx.lifecycle.w r11 = r9.getViewLifecycleOwner()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$c r12 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$c
            r12.<init>(r9)
            r10.mo57491k(r11, r12)
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r10 = r9.mo69503K1()
            if (r10 == 0) goto L_0x00d7
            boolean r10 = r10.mo116169t()
            if (r10 != r7) goto L_0x00d7
            r8 = r7
        L_0x00d7:
            if (r8 != 0) goto L_0x00e9
            androidx.lifecycle.LiveData r8 = r2.mo76630o0()
            androidx.lifecycle.w r10 = r9.getViewLifecycleOwner()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$d r11 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$d
            r11.<init>(r9)
            r8.mo57491k(r10, r11)
        L_0x00e9:
            androidx.lifecycle.LiveData r8 = r2.mo83418c0()
            androidx.lifecycle.w r10 = r9.getViewLifecycleOwner()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$e r11 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$e
            r11.<init>(r9)
            r8.mo57491k(r10, r11)
            r2.mo76628m0()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r2 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel r8 = r2.mo69502J1()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r9 = r0.this$0
            androidx.lifecycle.w r10 = r2.getViewLifecycleOwner()
            java.lang.String r11 = "viewLifecycleOwner"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            androidx.lifecycle.LifecycleCoroutineScope r12 = androidx.lifecycle.C19501x.m90847a(r10)
            r13 = 0
            r14 = 0
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$invokeSuspend$$inlined$processState$1 r15 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$invokeSuspend$$inlined$processState$1
            r15.<init>(r2, r8, r6, r9)
            r16 = 3
            r17 = 0
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r12, r13, r14, r15, r16, r17)
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r2 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.rating.RatingViewModel r8 = r2.mo69504L1()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r9 = r0.this$0
            androidx.lifecycle.w r10 = r2.getViewLifecycleOwner()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r10, r11)
            androidx.lifecycle.LifecycleCoroutineScope r12 = androidx.lifecycle.C19501x.m90847a(r10)
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$invokeSuspend$$inlined$processState$2 r15 = new com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment$initUi$1$invokeSuspend$$inlined$processState$2
            r15.<init>(r2, r8, r6, r9)
            kotlinx.coroutines.C11723c2 unused = kotlinx.coroutines.C12038j.m48061f(r12, r13, r14, r15, r16, r17)
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r2 = r0.this$0
            android.os.Bundle r2 = r2.getArguments()
            if (r2 == 0) goto L_0x0162
            java.lang.String r8 = "category_list_by_gtin"
            android.os.Bundle r2 = r2.getBundle(r8)
            if (r2 == 0) goto L_0x0162
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 33
            if (r9 < r10) goto L_0x0157
            java.lang.Class<java.util.HashMap> r9 = java.util.HashMap.class
            java.io.Serializable r2 = r2.getSerializable(r8, r9)
            goto L_0x015d
        L_0x0157:
            java.io.Serializable r2 = r2.getSerializable(r8)
            java.util.HashMap r2 = (java.util.HashMap) r2
        L_0x015d:
            java.util.HashMap r2 = (java.util.HashMap) r2
            if (r2 == 0) goto L_0x0162
            goto L_0x0167
        L_0x0162:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
        L_0x0167:
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r8 = r0.this$0
            com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel r8 = r8.mo69502J1()
            com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel$b$b r9 = new com.carrefour.fid.android.presentation.viewmodels.luckycart.LuckyCartViewModel$b$b
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r10 = r0.this$0
            com.carrefour.fid.android.domain.models.OrderConfirmationModel r10 = r10.mo69503K1()
            r9.<init>(r10, r2)
            r8.sendIntent(r9)
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r2 = r0.this$0
            com.carrefour.fid.android.databinding.g1 r2 = com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment.m105218Y0(r2)
            androidx.constraintlayout.widget.ConstraintLayout r2 = r2.f90874o
            r8 = 8
            r2.setVisibility(r8)
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r2 = r0.this$0
            com.carrefour.fid.android.databinding.g1 r2 = com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment.m105218Y0(r2)
            android.widget.TextView r2 = r2.f90872m
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r8 = r0.this$0
            java.lang.CharSequence r8 = r8.mo69498F1()
            r2.setText(r8)
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r2 = r0.this$0
            com.carrefour.fid.android.databinding.g1 r2 = com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment.m105218Y0(r2)
            android.widget.TextView r2 = r2.f90871l
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r8 = r0.this$0
            r0.L$0 = r2
            r0.label = r7
            java.lang.Object r7 = r8.mo69497E1(r0)
            if (r7 != r1) goto L_0x01ae
            return r1
        L_0x01ae:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r2.setText(r7)
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r2 = r0.this$0
            com.carrefour.fid.android.databinding.g1 r2 = com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment.m105218Y0(r2)
            android.widget.TextView r2 = r2.f90870k
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r7 = r0.this$0
            r0.L$0 = r2
            r0.label = r5
            java.lang.Object r5 = r7.mo69496D1(r0)
            if (r5 != r1) goto L_0x01c8
            return r1
        L_0x01c8:
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            r2.setText(r5)
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r2 = r0.this$0
            r0.L$0 = r6
            r0.label = r4
            java.lang.Object r2 = r2.mo69526l2(r0)
            if (r2 != r1) goto L_0x01da
            return r1
        L_0x01da:
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r2 = r0.this$0
            r0.label = r3
            java.lang.Object r2 = r2.mo69521f2(r0)
            if (r2 != r1) goto L_0x01e5
            return r1
        L_0x01e5:
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r1 = r0.this$0
            r1.mo69529p2()
            com.carrefour.fid.android.presentation.ui.confirmation.CheckoutConfirmationFragment r1 = r0.this$0
            r1.mo69528n2()
            kotlin.d2 r1 = kotlin.C11079d2.f28267a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.p035ui.confirmation.CheckoutConfirmationFragment$initUi$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @C12580l
    public final Object invoke(@C12579k C12074o0 o0Var, @C12580l C11045c<? super C11079d2> cVar) {
        return ((CheckoutConfirmationFragment$initUi$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
    }
}
