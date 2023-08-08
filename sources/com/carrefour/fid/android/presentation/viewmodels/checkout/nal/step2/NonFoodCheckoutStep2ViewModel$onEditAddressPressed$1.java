package com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2;

import com.carrefour.fid.android.domain.models.AddressCategory;
import com.carrefour.fid.android.domain.models.account.Address;
import com.carrefour.fid.android.domain.models.account.C37947a;
import com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.state.C26191b;
import com.carrefour.fid.android.shared.type.C28892e;
import com.carrefour.fid.android.shared.type.C28897f;
import java.util.concurrent.CancellationException;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11661u0;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.coroutines.jvm.internal.C11067d;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.C11289a;
import kotlin.jvm.functions.C11304p;
import kotlin.jvm.internal.C11363r0;
import kotlinx.coroutines.C11723c2;
import kotlinx.coroutines.C12038j;
import kotlinx.coroutines.C12074o0;
import kotlinx.coroutines.C12079p0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.C11908f;
import kotlinx.coroutines.flow.C11940j;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1", mo22502f = "NonFoodCheckoutStep2ViewModel.kt", mo22503i = {}, mo22504l = {523}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
@C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
public final class NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
    final /* synthetic */ Address $billingAddress;
    final /* synthetic */ AddressCategory $category;
    final /* synthetic */ Address $deliveryAddress;
    final /* synthetic */ C11289a<C11079d2> $onAddressValidated;
    final /* synthetic */ String $phone;
    int label;
    final /* synthetic */ NonFoodCheckoutStep2ViewModel this$0;

    @C11067d(mo22501c = "com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1$1", mo22502f = "NonFoodCheckoutStep2ViewModel.kt", mo22503i = {}, mo22504l = {552}, mo22505m = "invokeSuspend", mo22506n = {}, mo22507s = {})
    @C11076d0(mo22515d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H@"}, mo22516d2 = {"Lkotlinx/coroutines/o0;", "Lkotlin/d2;", "<anonymous>"}, mo22517k = 3, mo22518mv = {1, 8, 0})
    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1$1 */
    public static final class C261621 extends SuspendLambda implements C11304p<C12074o0, C11045c<? super C11079d2>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        @C12579k
        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
            C261621 r0 = new C261621(nonFoodCheckoutStep2ViewModel, address, address2, addressCategory, str, aVar, dVar, cVar);
            r0.L$0 = obj;
            return r0;
        }

        @C12580l
        public final Object invokeSuspend(@C12579k Object obj) {
            Object h = C11063b.m42612h();
            int i = this.label;
            if (i == 0) {
                C11661u0.m45747n(obj);
                final NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel = nonFoodCheckoutStep2ViewModel;
                final C11289a<C11079d2> aVar = aVar;
                final C26191b.C26195d dVar = dVar;
                C11723c2 unused = C12038j.m48061f((C12074o0) this.L$0, (CoroutineContext) null, (CoroutineStart) null, new C11304p<C12074o0, C11045c<? super C11079d2>, Object>((C11045c<? super C261631>) null) {
                    private /* synthetic */ Object L$0;
                    int label;

                    @C11363r0({"SMAP\nNonFoodCheckoutStep2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1$1$1$1\n+ 2 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowKt\n*L\n1#1,704:1\n230#2,5:705\n230#2,5:710\n*S KotlinDebug\n*F\n+ 1 NonFoodCheckoutStep2ViewModel.kt\ncom/carrefour/fid/android/presentation/viewmodels/checkout/nal/step2/NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1$1$1$1\n*L\n528#1:705,5\n538#1:710,5\n*E\n"})
                    /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1$1$1$a */
                    public static final class C26164a implements C11908f<C37947a> {

                        /* renamed from: a */
                        public final /* synthetic */ NonFoodCheckoutStep2ViewModel f63987a;

                        /* renamed from: b */
                        public final /* synthetic */ C11289a<C11079d2> f63988b;

                        /* renamed from: c */
                        public final /* synthetic */ C12074o0 f63989c;

                        /* renamed from: d */
                        public final /* synthetic */ C26191b.C26195d f63990d;

                        /* renamed from: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1$1$1$a$a */
                        public /* synthetic */ class C26165a {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            /* JADX WARNING: Failed to process nested try/catch */
                            /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
                            static {
                                /*
                                    com.carrefour.fid.android.domain.models.AddressCategory[] r0 = com.carrefour.fid.android.domain.models.AddressCategory.values()
                                    int r0 = r0.length
                                    int[] r0 = new int[r0]
                                    com.carrefour.fid.android.domain.models.AddressCategory r1 = com.carrefour.fid.android.domain.models.AddressCategory.DELIVERY     // Catch:{ NoSuchFieldError -> 0x0010 }
                                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                                    r2 = 1
                                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
                                L_0x0010:
                                    com.carrefour.fid.android.domain.models.AddressCategory r1 = com.carrefour.fid.android.domain.models.AddressCategory.BILLING     // Catch:{ NoSuchFieldError -> 0x0019 }
                                    int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                                    r2 = 2
                                    r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
                                L_0x0019:
                                    $EnumSwitchMapping$0 = r0
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.presentation.viewmodels.checkout.nal.step2.NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1.C261621.C261631.C26164a.C26165a.<clinit>():void");
                            }
                        }

                        public C26164a(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, C11289a<C11079d2> aVar, C12074o0 o0Var, C26191b.C26195d dVar) {
                            this.f63987a = nonFoodCheckoutStep2ViewModel;
                            this.f63988b = aVar;
                            this.f63989c = o0Var;
                            this.f63990d = dVar;
                        }

                        @C12580l
                        /* renamed from: c */
                        public final Object emit(@C12579k C37947a aVar, @C12579k C11045c<? super C11079d2> cVar) {
                            Object value;
                            Object value2;
                            int i = C26165a.$EnumSwitchMapping$0[aVar.mo116774e().mo116683H().ordinal()];
                            if (i == 1) {
                                C11940j r0 = this.f63987a.f63975y;
                                C26191b.C26195d dVar = this.f63990d;
                                do {
                                    value = r0.getValue();
                                    C28892e eVar = (C28892e) value;
                                } while (!r0.mo24216e(value, new C28892e.C28895c(C26191b.C26195d.m111968e(dVar, aVar.mo116774e(), (Address) null, aVar.mo116776f(), 2, (Object) null))));
                            } else if (i != 2) {
                                this.f63988b.invoke();
                                C12079p0.m48265f(this.f63989c, (CancellationException) null, 1, (Object) null);
                            } else {
                                C11940j r02 = this.f63987a.f63975y;
                                C26191b.C26195d dVar2 = this.f63990d;
                                do {
                                    value2 = r02.getValue();
                                    C28892e eVar2 = (C28892e) value2;
                                } while (!r02.mo24216e(value2, new C28892e.C28895c(C26191b.C26195d.m111968e(dVar2, (Address) null, aVar.mo116774e(), aVar.mo116776f(), 1, (Object) null))));
                            }
                            this.f63988b.invoke();
                            C12079p0.m48265f(this.f63989c, (CancellationException) null, 1, (Object) null);
                            return C11079d2.f28267a;
                        }
                    }

                    @C12579k
                    public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                        C261631 r0 = 

                        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
                        public NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1(NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel, Address address, Address address2, AddressCategory addressCategory, String str, C11289a<C11079d2> aVar, C11045c<? super NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1> cVar) {
                            super(2, cVar);
                            this.this$0 = nonFoodCheckoutStep2ViewModel;
                            this.$billingAddress = address;
                            this.$deliveryAddress = address2;
                            this.$category = addressCategory;
                            this.$phone = str;
                            this.$onAddressValidated = aVar;
                        }

                        @C12579k
                        public final C11045c<C11079d2> create(@C12580l Object obj, @C12579k C11045c<?> cVar) {
                            return new NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1(this.this$0, this.$billingAddress, this.$deliveryAddress, this.$category, this.$phone, this.$onAddressValidated, cVar);
                        }

                        @C12580l
                        public final Object invokeSuspend(@C12579k Object obj) {
                            Object h = C11063b.m42612h();
                            int i = this.label;
                            if (i == 0) {
                                C11661u0.m45747n(obj);
                                final C26191b.C26195d dVar = (C26191b.C26195d) C28897f.m119478b((C28892e) this.this$0.f63975y.getValue());
                                if (dVar == null) {
                                    return C11079d2.f28267a;
                                }
                                final NonFoodCheckoutStep2ViewModel nonFoodCheckoutStep2ViewModel = this.this$0;
                                final Address address = this.$billingAddress;
                                final Address address2 = this.$deliveryAddress;
                                final AddressCategory addressCategory = this.$category;
                                final String str = this.$phone;
                                final C11289a<C11079d2> aVar = this.$onAddressValidated;
                                C261621 r3 = new C261621((C11045c<? super C261621>) null);
                                this.label = 1;
                                if (C12079p0.m48266g(r3, this) == h) {
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
                            return ((NonFoodCheckoutStep2ViewModel$onEditAddressPressed$1) create(o0Var, cVar)).invokeSuspend(C11079d2.f28267a);
                        }
                    }
