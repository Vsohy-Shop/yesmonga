package com.carrefour.fid.android.checkout.presentation.viewmodels;

import androidx.compose.runtime.internal.C8567o;
import androidx.lifecycle.C19456p0;
import com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase;
import com.carrefour.fid.android.shared.base.BaseMVIViewModel;
import com.carrefour.fid.android.shared.base.C28505u;
import com.usabilla.sdk.ubform.net.parser.C9874a;
import dagger.hilt.android.lifecycle.C10245a;
import javax.inject.Inject;
import kotlin.C11076d0;
import kotlin.C11079d2;
import kotlin.C11395k;
import kotlin.DeprecationLevel;
import kotlin.coroutines.C11045c;
import kotlin.coroutines.intrinsics.C11063b;
import kotlin.jvm.internal.C11363r0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.C12579k;
import org.jetbrains.annotations.C12580l;

@C10245a
@C11076d0(mo22515d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000b\u0010B\u0011\b\u0007\u0012\u0006\u0010\r\u001a\u00020\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005H@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, mo22516d2 = {"Lcom/carrefour/fid/android/checkout/presentation/viewmodels/PaymentMethodViewModel;", "Lcom/carrefour/fid/android/shared/base/BaseMVIViewModel;", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/PaymentMethodViewModel$a;", "Lcom/carrefour/fid/android/checkout/presentation/viewmodels/PaymentMethodViewModel$b;", "intent", "Lkotlin/d2;", "e0", "(Lcom/carrefour/fid/android/checkout/presentation/viewmodels/PaymentMethodViewModel$b;Lkotlin/coroutines/c;)Ljava/lang/Object;", "f0", "(Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lcom/carrefour/fid/android/checkout/domain/interactors/GetPspTokenUseCase;", "a", "Lcom/carrefour/fid/android/checkout/domain/interactors/GetPspTokenUseCase;", "getPspTokenUseCase", "<init>", "(Lcom/carrefour/fid/android/checkout/domain/interactors/GetPspTokenUseCase;)V", "b", "checkout_release"}, mo22517k = 1, mo22518mv = {1, 8, 0})
@C11363r0({"SMAP\nPaymentMethodViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PaymentMethodViewModel.kt\ncom/carrefour/fid/android/checkout/presentation/viewmodels/PaymentMethodViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
public final class PaymentMethodViewModel extends BaseMVIViewModel<C39939a, C39943b> {
    @C12579k

    /* renamed from: a */
    public final GetPspTokenUseCase f101846a;

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$a */
    public static abstract class C39939a implements C28505u.C28509d {

        /* renamed from: b */
        public static final int f101847b = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$a$a */
        public static final class C39940a extends C39939a {

            /* renamed from: d */
            public static final int f101848d = 0;
            @C12579k

            /* renamed from: c */
            public final String f101849c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C39940a(@C12579k String str) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, "pspToken");
                this.f101849c = str;
            }

            /* renamed from: g */
            public static /* synthetic */ C39940a m162745g(C39940a aVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = aVar.f101849c;
                }
                return aVar.mo131701f(str);
            }

            @C12579k
            /* renamed from: e */
            public final String mo131699e() {
                return this.f101849c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39940a) && Intrinsics.areEqual((Object) this.f101849c, (Object) ((C39940a) obj).f101849c);
            }

            @C12579k
            /* renamed from: f */
            public final C39940a mo131701f(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, "pspToken");
                return new C39940a(str);
            }

            @C12579k
            /* renamed from: h */
            public final String mo131702h() {
                return this.f101849c;
            }

            public int hashCode() {
                return this.f101849c.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f101849c;
                return "CardForm(pspToken=" + str + ")";
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$a$b */
        public static final class C39941b extends C39939a {
            @C12579k

            /* renamed from: c */
            public static final C39941b f101850c = new C39941b();

            /* renamed from: d */
            public static final int f101851d = 0;

            public C39941b() {
                super((DefaultConstructorMarker) null);
            }
        }

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$a$c */
        public static final class C39942c extends C39939a {

            /* renamed from: d */
            public static final int f101852d = 0;
            @C12579k

            /* renamed from: c */
            public final String f101853c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C39942c(@C12579k String str) {
                super((DefaultConstructorMarker) null);
                Intrinsics.checkNotNullParameter(str, C9874a.f27073r);
                this.f101853c = str;
            }

            /* renamed from: g */
            public static /* synthetic */ C39942c m162749g(C39942c cVar, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = cVar.f101853c;
                }
                return cVar.mo131707f(str);
            }

            @C12579k
            /* renamed from: e */
            public final String mo131705e() {
                return this.f101853c;
            }

            public boolean equals(@C12580l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C39942c) && Intrinsics.areEqual((Object) this.f101853c, (Object) ((C39942c) obj).f101853c);
            }

            @C12579k
            /* renamed from: f */
            public final C39942c mo131707f(@C12579k String str) {
                Intrinsics.checkNotNullParameter(str, C9874a.f27073r);
                return new C39942c(str);
            }

            @C12579k
            /* renamed from: h */
            public final String mo131708h() {
                return this.f101853c;
            }

            public int hashCode() {
                return this.f101853c.hashCode();
            }

            @C12579k
            public String toString() {
                String str = this.f101853c;
                return "Error(errorMessage=" + str + ")";
            }
        }

        public /* synthetic */ C39939a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @C11395k(level = DeprecationLevel.WARNING, message = "We should not be able to reset the current state. You should use [MVI.Event] instead.")
        @C12579k
        public C28505u.C28509d reset() {
            return C28505u.C28509d.C28510a.m118428a(this);
        }

        public C39939a() {
        }
    }

    @C8567o(parameters = 0)
    /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$b */
    public static abstract class C39943b implements C28505u.C28507b {

        /* renamed from: a */
        public static final int f101854a = 0;

        @C8567o(parameters = 0)
        /* renamed from: com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$b$a */
        public static final class C39944a extends C39943b {
            @C12579k

            /* renamed from: b */
            public static final C39944a f101855b = new C39944a();

            /* renamed from: c */
            public static final int f101856c = 0;

            public C39944a() {
                super((DefaultConstructorMarker) null);
            }
        }

        public /* synthetic */ C39943b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C39943b() {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Inject
    public PaymentMethodViewModel(@C12579k GetPspTokenUseCase getPspTokenUseCase) {
        super(C39939a.C39941b.f101850c, (CoroutineDispatcher) null, (C19456p0) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(getPspTokenUseCase, "getPspTokenUseCase");
        this.f101846a = getPspTokenUseCase;
    }

    @C12580l
    /* renamed from: e0 */
    public Object processIntent(@C12579k C39943b bVar, @C12579k C11045c<? super C11079d2> cVar) {
        if (!Intrinsics.areEqual((Object) bVar, (Object) C39943b.C39944a.f101855b)) {
            return C11079d2.f28267a;
        }
        Object f0 = mo131698f0(cVar);
        if (f0 == C11063b.m42612h()) {
            return f0;
        }
        return C11079d2.f28267a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo131698f0(kotlin.coroutines.C11045c<? super kotlin.C11079d2> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$showCardForm$1
            if (r0 == 0) goto L_0x0013
            r0 = r8
            com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$showCardForm$1 r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$showCardForm$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.label = r1
            goto L_0x0018
        L_0x0013:
            com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$showCardForm$1 r0 = new com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$showCardForm$1
            r0.<init>(r7, r8)
        L_0x0018:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.C11063b.m42612h()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L_0x003b
            if (r2 != r3) goto L_0x0033
            java.lang.Object r0 = r0.L$0
            com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel r0 = (com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel) r0
            kotlin.C11661u0.m45747n(r8)
            kotlin.Result r8 = (kotlin.Result) r8
            java.lang.Object r8 = r8.mo21858l()
            goto L_0x004c
        L_0x0033:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L_0x003b:
            kotlin.C11661u0.m45747n(r8)
            com.carrefour.fid.android.checkout.domain.interactors.GetPspTokenUseCase r8 = r7.f101846a
            r0.L$0 = r7
            r0.label = r3
            java.lang.Object r8 = r8.m173116invokeIoAF18A(r0)
            if (r8 != r1) goto L_0x004b
            return r1
        L_0x004b:
            r0 = r7
        L_0x004c:
            boolean r1 = kotlin.Result.m38710j(r8)
            if (r1 == 0) goto L_0x005d
            r1 = r8
            java.lang.String r1 = (java.lang.String) r1
            com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$a$a r2 = new com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$a$a
            r2.<init>(r1)
            r0.publishState(r2)
        L_0x005d:
            java.lang.Throwable r8 = kotlin.Result.m38705e(r8)
            if (r8 == 0) goto L_0x0091
            com.carrefour.fid.android.shared.util.i r1 = com.carrefour.fid.android.shared.util.C28935i.f70940a
            java.lang.String r2 = r8.getMessage()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "getPspTokenUseCase: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            com.carrefour.fid.android.shared.util.C28935i.m119705e(r1, r2, r3, r4, r5, r6)
            com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$a$c r1 = new com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel$a$c
            java.lang.String r8 = r8.getLocalizedMessage()
            if (r8 != 0) goto L_0x008b
            java.lang.String r8 = ""
        L_0x008b:
            r1.<init>(r8)
            r0.publishState(r1)
        L_0x0091:
            kotlin.d2 r8 = kotlin.C11079d2.f28267a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.carrefour.fid.android.checkout.presentation.viewmodels.PaymentMethodViewModel.mo131698f0(kotlin.coroutines.c):java.lang.Object");
    }
}
